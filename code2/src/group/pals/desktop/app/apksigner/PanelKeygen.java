/*
 *    Copyright (C) 2012 Hai Bison
 *
 *    See the file LICENSE at the root directory of this project for copying
 *    permission.
 */

package group.pals.desktop.app.apksigner;

import group.pals.desktop.app.apksigner.i18n.Messages;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Keystore file generator panel.
 * 
 * @author Hai Bison
 * @since v1.6 beta
 * 
 */
public class PanelKeygen extends JPanel {

    /**
     * Auto-generated by Eclipse.
     */
    private static final long serialVersionUID = -6571727138994044544L;

    /**
     * The class name.
     */
    private static final String CLASSNAME = PanelKeygen.class.getName();

    /**
     * This key holds the last working directory.
     */
    private static final String PKEY_LAST_WORKING_DIR = CLASSNAME
            + ".last_working_dir";

    private JPasswordField mTextPassword;
    private JPasswordField mTextPasswordConfirm;
    private JTextField mTextAlias;
    private JPasswordField mTextAliasPassword;
    private JPasswordField mTextAliasPasswordConfirm;
    private JSpinner mSpinnerValidity;
    private JTextField mTextName;
    private JTextField mTextOrganizationalUnit;
    private JTextField mTextOrganization;
    private JTextField mTextCityOrLocality;
    private JTextField mTextStateOrProvince;
    private JTextField mTextCountryCode;
    private JPanel panel;
    private JButton mBtnChooseTargetFile;
    private JButton mBtnGenerateKeyfile;

    /**
     * Create the panel.
     */
    public PanelKeygen() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
        gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        gridBagLayout.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, Double.MIN_VALUE };
        setLayout(gridBagLayout);

        panel = new JPanel();
        panel.setBorder(new TitledBorder(null, Messages
                .getString("target_file"), TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.gridwidth = 2;
        gbc_panel.insets = new Insets(10, 10, 10, 10);
        gbc_panel.fill = GridBagConstraints.HORIZONTAL;
        gbc_panel.gridx = 0;
        gbc_panel.gridy = 0;
        add(panel, gbc_panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        mBtnChooseTargetFile = new JButton(Messages.getString("desc_save_as"));
        panel.add(mBtnChooseTargetFile);

        mBtnGenerateKeyfile = new JButton(
                Messages.getString("generate_keyfile")); //$NON-NLS-1$
        panel.add(mBtnGenerateKeyfile);

        mTextPassword = new JPasswordField();
        mTextPassword.setBorder(new TitledBorder(null, Messages
                .getString("password"), TitledBorder.LEADING, TitledBorder.TOP,
                null, null));
        GridBagConstraints gbc_mTextPassword = new GridBagConstraints();
        gbc_mTextPassword.insets = new Insets(3, 3, 3, 3);
        gbc_mTextPassword.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextPassword.gridx = 0;
        gbc_mTextPassword.gridy = 1;
        add(mTextPassword, gbc_mTextPassword);

        mTextPasswordConfirm = new JPasswordField();
        mTextPasswordConfirm.setBorder(new TitledBorder(null, Messages
                .getString("confirm"), TitledBorder.LEADING, TitledBorder.TOP,
                null, null));
        GridBagConstraints gbc_mTextPasswordConfirm = new GridBagConstraints();
        gbc_mTextPasswordConfirm.insets = new Insets(3, 3, 3, 3);
        gbc_mTextPasswordConfirm.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextPasswordConfirm.gridx = 1;
        gbc_mTextPasswordConfirm.gridy = 1;
        add(mTextPasswordConfirm, gbc_mTextPasswordConfirm);

        mTextAlias = new JTextField();
        mTextAlias.setBorder(new TitledBorder(null,
                Messages.getString("alias"), TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        GridBagConstraints gbc_mTextAlias = new GridBagConstraints();
        gbc_mTextAlias.insets = new Insets(3, 3, 3, 3);
        gbc_mTextAlias.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextAlias.gridx = 0;
        gbc_mTextAlias.gridy = 2;
        add(mTextAlias, gbc_mTextAlias);
        mTextAlias.setColumns(10);

        mTextAliasPassword = new JPasswordField();
        mTextAliasPassword.setBorder(new TitledBorder(null, Messages
                .getString("alias_password"), TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        GridBagConstraints gbc_mTextAliasPassword = new GridBagConstraints();
        gbc_mTextAliasPassword.insets = new Insets(3, 3, 3, 3);
        gbc_mTextAliasPassword.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextAliasPassword.gridx = 0;
        gbc_mTextAliasPassword.gridy = 3;
        add(mTextAliasPassword, gbc_mTextAliasPassword);

        mTextAliasPasswordConfirm = new JPasswordField();
        mTextAliasPasswordConfirm.setBorder(new TitledBorder(null, Messages
                .getString("confirm"), TitledBorder.LEADING, TitledBorder.TOP,
                null, null));
        GridBagConstraints gbc_mTextAliasPasswordConfirm = new GridBagConstraints();
        gbc_mTextAliasPasswordConfirm.insets = new Insets(5, 5, 5, 0);
        gbc_mTextAliasPasswordConfirm.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextAliasPasswordConfirm.gridx = 1;
        gbc_mTextAliasPasswordConfirm.gridy = 3;
        add(mTextAliasPasswordConfirm, gbc_mTextAliasPasswordConfirm);

        mSpinnerValidity = new JSpinner();
        mSpinnerValidity.setBorder(new TitledBorder(null, Messages
                .getString("validity"), TitledBorder.LEADING, TitledBorder.TOP,
                null, null));
        GridBagConstraints gbc_mSpinnerValidity = new GridBagConstraints();
        gbc_mSpinnerValidity.fill = GridBagConstraints.HORIZONTAL;
        gbc_mSpinnerValidity.insets = new Insets(3, 3, 3, 3);
        gbc_mSpinnerValidity.gridx = 0;
        gbc_mSpinnerValidity.gridy = 4;
        add(mSpinnerValidity, gbc_mSpinnerValidity);

        mTextName = new JTextField();
        mTextName.setBorder(new TitledBorder(null, Messages
                .getString("first_and_last_name"), TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        GridBagConstraints gbc_mTextName = new GridBagConstraints();
        gbc_mTextName.insets = new Insets(3, 3, 3, 3);
        gbc_mTextName.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextName.gridx = 0;
        gbc_mTextName.gridy = 5;
        add(mTextName, gbc_mTextName);
        mTextName.setColumns(10);

        mTextOrganizationalUnit = new JTextField();
        mTextOrganizationalUnit.setBorder(new TitledBorder(null, Messages
                .getString("organizational_unit"), TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        GridBagConstraints gbc_mTextOrganizationalUnit = new GridBagConstraints();
        gbc_mTextOrganizationalUnit.insets = new Insets(5, 5, 5, 0);
        gbc_mTextOrganizationalUnit.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextOrganizationalUnit.gridx = 1;
        gbc_mTextOrganizationalUnit.gridy = 5;
        add(mTextOrganizationalUnit, gbc_mTextOrganizationalUnit);
        mTextOrganizationalUnit.setColumns(10);

        mTextOrganization = new JTextField();
        mTextOrganization.setBorder(new TitledBorder(null, Messages
                .getString("organization"), TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        GridBagConstraints gbc_mTextOrganization = new GridBagConstraints();
        gbc_mTextOrganization.insets = new Insets(3, 3, 3, 3);
        gbc_mTextOrganization.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextOrganization.gridx = 0;
        gbc_mTextOrganization.gridy = 6;
        add(mTextOrganization, gbc_mTextOrganization);
        mTextOrganization.setColumns(10);

        mTextCityOrLocality = new JTextField();
        mTextCityOrLocality.setBorder(new TitledBorder(null, Messages
                .getString("city_or_locality"), TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        GridBagConstraints gbc_mTextCityOrLocality = new GridBagConstraints();
        gbc_mTextCityOrLocality.insets = new Insets(5, 5, 5, 0);
        gbc_mTextCityOrLocality.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextCityOrLocality.gridx = 1;
        gbc_mTextCityOrLocality.gridy = 6;
        add(mTextCityOrLocality, gbc_mTextCityOrLocality);
        mTextCityOrLocality.setColumns(10);

        mTextStateOrProvince = new JTextField();
        mTextStateOrProvince.setBorder(new TitledBorder(null, Messages
                .getString("state_or_province"), TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        GridBagConstraints gbc_mTextStateOrProvince = new GridBagConstraints();
        gbc_mTextStateOrProvince.insets = new Insets(3, 3, 3, 3);
        gbc_mTextStateOrProvince.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextStateOrProvince.gridx = 0;
        gbc_mTextStateOrProvince.gridy = 7;
        add(mTextStateOrProvince, gbc_mTextStateOrProvince);
        mTextStateOrProvince.setColumns(10);

        mTextCountryCode = new JTextField();
        mTextCountryCode.setBorder(new TitledBorder(null, Messages
                .getString("country_code"), TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        GridBagConstraints gbc_mTextCountryCode = new GridBagConstraints();
        gbc_mTextCountryCode.insets = new Insets(3, 3, 3, 3);
        gbc_mTextCountryCode.fill = GridBagConstraints.HORIZONTAL;
        gbc_mTextCountryCode.gridx = 1;
        gbc_mTextCountryCode.gridy = 7;
        add(mTextCountryCode, gbc_mTextCountryCode);
        mTextCountryCode.setColumns(10);

    }// PanelKeygen()

}
