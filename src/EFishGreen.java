import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import java.awt.TextField;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Image;
public class EFishGreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EFishGreen window = new EFishGreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EFishGreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 665, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnWaterLevel = new JButton("Water Level");
		springLayout.putConstraint(SpringLayout.EAST, btnWaterLevel, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnWaterLevel);
		
		JButton btnWateTemperature = new JButton("Wate Temp");
		springLayout.putConstraint(SpringLayout.WEST, btnWateTemperature, 514, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnWaterLevel, 0, SpringLayout.WEST, btnWateTemperature);
		springLayout.putConstraint(SpringLayout.SOUTH, btnWaterLevel, -6, SpringLayout.NORTH, btnWateTemperature);
		btnWateTemperature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnWateTemperature);
		
		JButton btnPhLevel = new JButton(" pH Level");
		springLayout.putConstraint(SpringLayout.SOUTH, btnWateTemperature, -6, SpringLayout.NORTH, btnPhLevel);
		frame.getContentPane().add(btnPhLevel);
		
		JButton btnNitrateLevel = new JButton("Nitrate Level");
		springLayout.putConstraint(SpringLayout.SOUTH, btnPhLevel, -6, SpringLayout.NORTH, btnNitrateLevel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNitrateLevel, -216, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(btnNitrateLevel);
		
		JButton btnOxygenLevel = new JButton("Oxygen Level");
		springLayout.putConstraint(SpringLayout.NORTH, btnOxygenLevel, 6, SpringLayout.SOUTH, btnNitrateLevel);
		frame.getContentPane().add(btnOxygenLevel);
		
		JButton btnAmmonia = new JButton("Ammonia");
		springLayout.putConstraint(SpringLayout.NORTH, btnAmmonia, 6, SpringLayout.SOUTH, btnOxygenLevel);
		springLayout.putConstraint(SpringLayout.EAST, btnAmmonia, 0, SpringLayout.EAST, btnPhLevel);
		frame.getContentPane().add(btnAmmonia);
		
		JButton btnLightIntensity = new JButton("Light Intensity");
		springLayout.putConstraint(SpringLayout.NORTH, btnLightIntensity, 6, SpringLayout.SOUTH, btnAmmonia);
		springLayout.putConstraint(SpringLayout.WEST, btnLightIntensity, 0, SpringLayout.WEST, btnWaterLevel);
		frame.getContentPane().add(btnLightIntensity);
		
		JButton btnAirTemp = new JButton("Air/Humidity");
		springLayout.putConstraint(SpringLayout.NORTH, btnAirTemp, 6, SpringLayout.SOUTH, btnLightIntensity);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAirTemp, -83, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnAirTemp, -10, SpringLayout.EAST, frame.getContentPane());
		btnAirTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnAirTemp);
		
		JButton btnPreviousData = new JButton("Previous Data");
		springLayout.putConstraint(SpringLayout.WEST, btnPreviousData, 24, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnPreviousData, -10, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(btnPreviousData);
		
		JButton btnImportData = new JButton("Import Data");
		springLayout.putConstraint(SpringLayout.WEST, btnImportData, 45, SpringLayout.EAST, btnPreviousData);
		springLayout.putConstraint(SpringLayout.SOUTH, btnImportData, 0, SpringLayout.SOUTH, btnPreviousData);
		frame.getContentPane().add(btnImportData);
		
		JButton btnGenerateData = new JButton("Generate Data");
		springLayout.putConstraint(SpringLayout.WEST, btnGenerateData, 37, SpringLayout.EAST, btnImportData);
		springLayout.putConstraint(SpringLayout.SOUTH, btnGenerateData, 0, SpringLayout.SOUTH, btnPreviousData);
		frame.getContentPane().add(btnGenerateData);
		
		TextField textField = new TextField();
		springLayout.putConstraint(SpringLayout.WEST, btnAirTemp, 27, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.WEST, btnOxygenLevel, 27, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.WEST, btnNitrateLevel, 27, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.WEST, btnPhLevel, 27, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 123, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField, 24, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textField, -16, SpringLayout.NORTH, btnPreviousData);
		springLayout.putConstraint(SpringLayout.EAST, textField, -168, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel = new JLabel("");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 97, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 617, SpringLayout.WEST, frame.getContentPane());
		Image img = new ImageIcon(this.getClass().getResource("/")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 26, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 24, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
	}
}
