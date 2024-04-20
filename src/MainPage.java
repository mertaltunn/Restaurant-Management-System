import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class MainPage extends JFrame {

	private JPanel contentPane;

	private JLabel lblStockSoup;
	private JLabel lblStockSalad;
	private JLabel lblStockCheeseBurger;
	private JLabel lblStockFishAndChips;
	private JLabel lblProfit;
	private JLabel lblTurnCounter;
	private JLabel lblRestaurantsTableStatus;
	private JLabel lblTotalManagerSalary;
	private JLabel lblTotalCookSalary;
	private JButton btnOrder;
	private JRadioButton rdbtnSalad;
	private JRadioButton rdbtnSoup;
	private JRadioButton rdbtnCheeseBurger;
	private JRadioButton rdbtnFishAndChips;
	private JTextArea orderStatusTextArea;

	private Restaurant restaurant;
	private int turnCount = 0;
	private int capacityCounter = 0; // anlýk müþteriyi tutan counter
	private final ButtonGroup buttonGroup = new ButtonGroup();

	// Launch the application.

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame.

	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1567, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Welcome to Cafe de Mordor");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTitle.setBounds(0, 0, 1649, 48);
		contentPane.add(lblTitle);

		JPanel menuPanel = new JPanel();
		menuPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		menuPanel.setBounds(10, 50, 999, 555);
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 230));
		panel.setBorder(new LineBorder(new Color(230, 230, 230), 2));
		panel.setBounds(34, 54, 219, 364);
		menuPanel.add(panel);
		panel.setLayout(null);

		JLabel lblIconSoup = new JLabel("soupImage");
		lblIconSoup.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblIconSoup.setBounds(10, 11, 197, 150);
		panel.add(lblIconSoup);

		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 172, 78, 30);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Price :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 212, 73, 30);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Stock :");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(10, 253, 78, 30);
		panel.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel = new JLabel("Soup");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(105, 172, 46, 30);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("$10");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(105, 213, 46, 30);
		panel.add(lblNewLabel_2);

		lblStockSoup = new JLabel("stock");
		lblStockSoup.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblStockSoup.setBounds(105, 253, 68, 30);
		panel.add(lblStockSoup);

		JLabel lblMenuTitle = new JLabel("Menu");
		lblMenuTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuTitle.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblMenuTitle.setBounds(37, 11, 950, 32);
		menuPanel.add(lblMenuTitle);

		setImageIcon(lblIconSoup);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(230, 230, 230), 2));
		panel_1.setBackground(new Color(230, 230, 230));
		panel_1.setBounds(278, 54, 219, 364);
		menuPanel.add(panel_1);

		JLabel lblIconSalad = new JLabel("saladImage");
		lblIconSalad.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblIconSalad.setBounds(10, 11, 197, 150);
		panel_1.add(lblIconSalad);

		JLabel lblNewLabel_1_2 = new JLabel("Name :");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 172, 76, 30);
		panel_1.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_1_2 = new JLabel("Price :");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_2.setBounds(10, 213, 103, 30);
		panel_1.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Stock :");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_1_1.setBounds(10, 253, 76, 30);
		panel_1.add(lblNewLabel_1_1_1_1);

		JLabel lblSalad = new JLabel("Salad");
		lblSalad.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSalad.setBounds(92, 172, 115, 30);
		panel_1.add(lblSalad);

		JLabel lblNewLabel_2_1 = new JLabel("$15");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(92, 213, 103, 30);
		panel_1.add(lblNewLabel_2_1);

		lblStockSalad = new JLabel("stock");
		lblStockSalad.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblStockSalad.setBounds(92, 254, 90, 30);
		panel_1.add(lblStockSalad);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(230, 230, 230), 2));
		panel_1_1.setBackground(new Color(230, 230, 230));
		panel_1_1.setBounds(524, 54, 219, 364);
		menuPanel.add(panel_1_1);

		JLabel lblIconCheeseBurger = new JLabel("cheeseBurgerImage");
		lblIconCheeseBurger.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblIconCheeseBurger.setBounds(10, 11, 197, 150);
		panel_1_1.add(lblIconCheeseBurger);

		JLabel lblNewLabel_1_2_1 = new JLabel("Name :");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1.setBounds(10, 172, 78, 30);
		panel_1_1.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("Price :");
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_2_1.setBounds(10, 213, 78, 30);
		panel_1_1.add(lblNewLabel_1_1_2_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Stock :");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1.setBounds(10, 253, 78, 30);
		panel_1_1.add(lblNewLabel_1_1_1_1_1);

		JLabel lblNewLabel_3_1 = new JLabel("CheeseBurger");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(76, 172, 109, 30);
		panel_1_1.add(lblNewLabel_3_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("$20");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(76, 213, 109, 30);
		panel_1_1.add(lblNewLabel_2_1_1);

		lblStockCheeseBurger = new JLabel("stock");
		lblStockCheeseBurger.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblStockCheeseBurger.setBounds(76, 254, 68, 30);
		panel_1_1.add(lblStockCheeseBurger);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(230, 230, 230), 2));
		panel_1_2.setBackground(new Color(230, 230, 230));
		panel_1_2.setBounds(768, 54, 219, 364);
		menuPanel.add(panel_1_2);

		JLabel lblIconFishAndChips = new JLabel("fishAndChipsImage");
		lblIconFishAndChips.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblIconFishAndChips.setBounds(10, 11, 197, 150);
		panel_1_2.add(lblIconFishAndChips);

		JLabel lblNewLabel_1_2_2 = new JLabel("Name :");
		lblNewLabel_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_2.setBounds(10, 172, 63, 30);
		panel_1_2.add(lblNewLabel_1_2_2);

		JLabel lblNewLabel_1_1_2_2 = new JLabel("Price :");
		lblNewLabel_1_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_2_2.setBounds(10, 213, 103, 30);
		panel_1_2.add(lblNewLabel_1_1_2_2);

		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Stock :");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_2.setBounds(10, 253, 63, 30);
		panel_1_2.add(lblNewLabel_1_1_1_1_2);

		JLabel lblNewLabel_3_2 = new JLabel("Fish and Chips");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_2.setBounds(77, 172, 130, 30);
		panel_1_2.add(lblNewLabel_3_2);

		JLabel lblNewLabel_2_1_2 = new JLabel("$25");
		lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_2.setBounds(77, 216, 103, 30);
		panel_1_2.add(lblNewLabel_2_1_2);

		lblStockFishAndChips = new JLabel("stock");
		lblStockFishAndChips.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblStockFishAndChips.setBounds(83, 253, 125, 30);
		panel_1_2.add(lblStockFishAndChips);

		setImageIcon(lblIconSalad);

		rdbtnSalad = new JRadioButton("CHOOSE");
		rdbtnSalad.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rdbtnSalad.setBounds(10, 290, 172, 48);
		panel_1.add(rdbtnSalad);
		buttonGroup.add(rdbtnSalad);
		setImageIcon(lblIconSoup);

		rdbtnSoup = new JRadioButton("CHOOSE");
		rdbtnSoup.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rdbtnSoup.setBounds(10, 290, 163, 48);
		panel.add(rdbtnSoup);
		buttonGroup.add(rdbtnSoup);
		setImageIcon(lblIconCheeseBurger);

		rdbtnCheeseBurger = new JRadioButton("CHOOSE");
		rdbtnCheeseBurger.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rdbtnCheeseBurger.setBounds(10, 290, 175, 50);
		panel_1_1.add(rdbtnCheeseBurger);
		buttonGroup.add(rdbtnCheeseBurger);
		setImageIcon(lblIconFishAndChips);

		rdbtnFishAndChips = new JRadioButton("CHOOSE");
		rdbtnFishAndChips.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rdbtnFishAndChips.setBounds(10, 290, 170, 54);
		panel_1_2.add(rdbtnFishAndChips);
		buttonGroup.add(rdbtnFishAndChips);

		rdbtnSoup.setActionCommand("0");
		rdbtnSalad.setActionCommand("1");
		rdbtnCheeseBurger.setActionCommand("2");
		rdbtnFishAndChips.setActionCommand("3");

		btnOrder = new JButton("ORDER");
		btnOrder.setBounds(34, 442, 197, 59);
		menuPanel.add(btnOrder);
		btnOrder.setFont(new Font("Times New Roman", Font.BOLD, 16));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(1019, 50, 620, 555);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("PROFIT : ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_3.setBounds(12, 505, 172, 38);
		panel_2.add(lblNewLabel_3);

		lblProfit = new JLabel("");
		lblProfit.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblProfit.setBounds(163, 508, 141, 38);
		panel_2.add(lblProfit);

		JLabel lblNewLabel_4 = new JLabel("TURN :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_4.setBounds(370, 13, 93, 44);
		panel_2.add(lblNewLabel_4);

		lblTurnCounter = new JLabel("");
		lblTurnCounter.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTurnCounter.setBounds(460, 15, 60, 44);
		panel_2.add(lblTurnCounter);

		lblRestaurantsTableStatus = new JLabel("");
		lblRestaurantsTableStatus.setHorizontalAlignment(SwingConstants.LEFT);
		lblRestaurantsTableStatus.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblRestaurantsTableStatus.setBounds(434, 62, 163, 38);
		panel_2.add(lblRestaurantsTableStatus);

		JLabel lblWelcomeCustomer = new JLabel("");
		lblWelcomeCustomer.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblWelcomeCustomer.setBounds(26, 62, 517, 38);
		panel_2.add(lblWelcomeCustomer);

		lblWelcomeCustomer.setText("RESTAURANT CURRENT STATUS :");

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 111, 520, 324);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_2.add(scrollPane);

		orderStatusTextArea = new JTextArea();
		orderStatusTextArea.setEditable(false);
		scrollPane.setViewportView(orderStatusTextArea);

		JLabel lblManagerSalary = new JLabel("Manager Salary :");
		lblManagerSalary.setToolTipText("");
		lblManagerSalary.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblManagerSalary.setBounds(11, 445, 193, 38);
		panel_2.add(lblManagerSalary);

		JLabel lblNewLabel_5 = new JLabel("Manager gets %20 premium from every order");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 8));
		lblNewLabel_5.setBounds(13, 485, 272, 14);
		panel_2.add(lblNewLabel_5);

		JLabel lblCookSalary = new JLabel("Cook Salary :");
		lblCookSalary.setToolTipText("");
		lblCookSalary.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCookSalary.setBounds(273, 445, 156, 38);
		panel_2.add(lblCookSalary);

		JLabel lblNewLabel_5_1 = new JLabel("Cook gets %10 premium from every order");
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 8));
		lblNewLabel_5_1.setBounds(276, 486, 272, 14);
		panel_2.add(lblNewLabel_5_1);

		lblTotalManagerSalary = new JLabel("");
		lblTotalManagerSalary.setToolTipText("");
		lblTotalManagerSalary.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTotalManagerSalary.setBounds(168, 448, 87, 38);
		panel_2.add(lblTotalManagerSalary);

		lblTotalCookSalary = new JLabel("");
		lblTotalCookSalary.setToolTipText("");
		lblTotalCookSalary.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTotalCookSalary.setBounds(406, 446, 87, 38);
		panel_2.add(lblTotalCookSalary);

		JLabel lblNewLabel_6 = new JLabel("2013510134 Mert Altun");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_6.setBounds(1042, 625, 277, 55);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("2012510129 Cem Saran");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_7.setBounds(1042, 675, 251, 21);
		contentPane.add(lblNewLabel_7);

		initialize();

		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (buttonGroup.getSelection() != null) {
					if (restaurant.getCapacity() > capacityCounter) {
						giveOrder(buttonGroup.getSelection().getActionCommand());
					} else {
						orderStatusTextArea.append("There is no avaialable table in the restaurant!\n");
						turnCount++;
						lblTurnCounter.setText(Integer.toString(turnCount));
						checkRestaurantAvailability(turnCount);
						if (restaurant.getCapacity() > capacityCounter) {
							giveOrder(buttonGroup.getSelection().getActionCommand());
						}
					}

				}

			}
		});

	}

	private void giveOrder(String mealType) {
		// Aslýnda her þeyin döndüðü yer(Command satýrýný ingizceye çevir sonra)
		int index = Integer.parseInt(mealType);
		int stock = restaurant.getMenu().getMealList().get(index).getStock();
		if (stock > 0) {
			Customer currentCustomer = new Customer();
			currentCustomer.setName("Customer " + turnCount);
			currentCustomer.setArrivalTurnToRestaurant(turnCount);

			restaurant.getTable().add(currentCustomer);
			Meal meal = restaurant.getMenu().getMealList().get(index);

			restaurant.getMenu().getMealList().get(index).setStock(stock - 1);
			double mealPrice = restaurant.getMenu().getMealList().get(index).getPrice();
			double mealProfit = mealPrice - (mealPrice * currentCustomer.getMembership().getDiscountRate());
			restaurant.setProfit(restaurant.getProfit() + mealProfit);

			orderStatusTextArea.append(currentCustomer.getName() + "'s order >> " + meal.getName()
					+ " --- Membership >> " + currentCustomer.getMembership().getType() + " --- Preparing time >> "
					+ meal.getPrepareTime() + " turn\n");
			orderStatusTextArea.append("Total price >> $" + meal.getPrice() + " --- Discount Rate >> %"
					+ currentCustomer.getMembership().getDiscountRate() * 100 + " --- Amount to be paid >> $"
					+ mealProfit + "\n");
			orderStatusTextArea.append("------------------------------------------------- TURN " + turnCount
					+ "------------------------------------------------------------\n");

			Manager manager = restaurant.getManager();
			Cook cook = restaurant.getCookList().get(0);

			// overload ornegi
			if (turnCount % 10 == 0) {
				manager.setSalary(
						manager.getSalary() + manager.calculateSalary(mealPrice, currentCustomer.getMembership()));
				cook.setSalary(cook.getSalary() + cook.calculateSalary(mealPrice, currentCustomer.getMembership()));
			} else {
				manager.setSalary(manager.getSalary() + manager.calculateSalary(mealPrice));
				cook.setSalary(cook.getSalary() + cook.calculateSalary(mealPrice));
			}

			lblTotalManagerSalary.setText("$" + Double.toString(manager.getSalary()));
			lblTotalCookSalary.setText("$" + Double.toString(cook.getSalary()));
			lblProfit.setText("$" + restaurant.getProfit());

			Order order = new Order(currentCustomer, meal);

			restaurant.getOrderList().add(order);

			checkMealStocks();
			checkRestaurantAvailability(turnCount);

			turnCount++;
			capacityCounter++;
			lblTurnCounter.setText(Integer.toString(turnCount));
			lblRestaurantsTableStatus.setText(capacityCounter + " / " + restaurant.getCapacity());
		}

	}

	private void checkRestaurantAvailability(int currentTurn) {
		for (int i = 0; i < restaurant.getOrderList().size(); i++) {
			Order order = restaurant.getOrderList().get(i);
			int preparingTime = order.getCustomer().getArrivalTurnToRestaurant() + order.getMeal().getPrepareTime();
			if (currentTurn == preparingTime) {
				orderStatusTextArea.append(order.getCustomer().getName() + "'s meal is ready.\n");
				orderStatusTextArea.append("------------------------------------------------ TURN " + currentTurn
						+ "-------------------------------------------------------------\n");

			}
			int leavingTime = order.getCustomer().getEatingDuration() + preparingTime;
			if (currentTurn == leavingTime) {
				orderStatusTextArea.append(order.getCustomer().getName() + "'s ate his meal. He left restaurant.\n");
				orderStatusTextArea.append("------------------------------------------------ TURN " + currentTurn
						+ "-------------------------------------------------------------\n");
				restaurant.getTable().remove(i);
				restaurant.getOrderList().remove(i);
				capacityCounter--;
			}
		}
	}

	private void checkMealStocks() {
		Meal soup = restaurant.getMenu().getMealList().get(0);
		Meal salad = restaurant.getMenu().getMealList().get(1);
		Meal cheeseBurger = restaurant.getMenu().getMealList().get(2);
		Meal fishAndChips = restaurant.getMenu().getMealList().get(3);

		lblStockSoup.setText(String.valueOf(soup.getStock()));
		lblStockSalad.setText(String.valueOf(salad.getStock()));
		lblStockCheeseBurger.setText(String.valueOf(cheeseBurger.getStock()));
		lblStockFishAndChips.setText(String.valueOf(fishAndChips.getStock()));

		List<Meal> mealList = restaurant.getMenu().getMealList();
		for (int i = 0; i < mealList.size(); i++) {
			if (mealList.get(i).isHasStock() && mealList.get(i).getStock() == 0) {
				mealList.get(i).setHasStock(false);

				switch (i) {
				case 0: {
					rdbtnSoup.setEnabled(false);
					break;
				}
				case 1: {
					rdbtnSalad.setEnabled(false);
					break;
				}
				case 2: {
					rdbtnCheeseBurger.setEnabled(false);
					break;
				}
				case 3: {
					rdbtnFishAndChips.setEnabled(false);
					break;
				}
				}
			}
		}

	}

	// Initialize the contents of the frame.

	private void initialize() {
		Manager manager = new Manager();
		manager.setName("Manager");

		Cook cook = new Cook();
		cook.setName("Cook");

		List<Cook> cookList = new ArrayList<>();
		cookList.add(cook);

		Queue<Customer> customerQueue = new LinkedList<>();
		Menu menu = new Menu();
		List<Meal> mealList = new ArrayList<>();

		Meal salad = new Meal("Salad", 15, 2, 40);
		Meal cheeseBurger = new Meal("CheeseBurger", 20, 3, 30);
		Meal soup = new Meal("Soup", 10, 1, 50);
		Meal fishAndChips = new Meal("Fish and Chips", 25, 4, 20);

		mealList.add(soup);
		mealList.add(salad);
		mealList.add(cheeseBurger);
		mealList.add(fishAndChips);
		menu.setMealList(mealList);

		// Singleton Patter Design
		restaurant = Restaurant.getInstance();
		restaurant.setCapacity(10);
		restaurant.setManager(manager);
		restaurant.setCookList(cookList);
		restaurant.setOrderList(new ArrayList<>());
		restaurant.setTable(customerQueue);
		restaurant.setMenu(menu);
		restaurant.setProfit(0);

		lblStockSalad.setText(String.valueOf(salad.getStock()));
		lblStockSoup.setText(String.valueOf(soup.getStock()));
		lblStockCheeseBurger.setText(String.valueOf(cheeseBurger.getStock()));
		lblStockFishAndChips.setText(String.valueOf(fishAndChips.getStock()));

		lblTurnCounter.setText(Integer.toString(turnCount));

		lblRestaurantsTableStatus.setText(restaurant.getTable().size() + " / " + restaurant.getCapacity());

	}

	public void setImageIcon(JLabel lblIcon) {
		String iconPath = lblIcon.getText();
		ImageIcon icon = new ImageIcon(getClass().getResource("/images/" + iconPath + ".png"));
		Image img = icon.getImage().getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_SMOOTH);
		lblIcon.setIcon(new ImageIcon(img));
	}
}
