package client.gui;

import client.service.dao.userDao;
import client.service.impl.userImpl;
import client.service.dao.cardDao;
import client.service.impl.cardImpl;
import client.gui.util.frameUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;

/**
 * @author tinysean
 */
public class MainJFrame extends javax.swing.JFrame {

    private String userName;
    private userDao userdao;
    private cardDao carddao;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame(String userName) {
        this.userdao = new userImpl();
        this.userName = userName;
        this.carddao = new cardImpl();
        frameUtil.setCenter(this);
        initComponents();
    }

    public MainJFrame() {
        this.userdao = new userImpl();
        this.userName = "root";
        this.carddao = new cardImpl();
        frameUtil.setCenter(this);
        initComponents();
    }

    public MainJFrame(int i) {
        this.userdao = new userImpl();
        this.userName = "no-root";
        this.carddao = new cardImpl();
        frameUtil.setCenter(this);
        initComponents();
    }

    public void showUser() {
        useTable.setModel(new javax.swing.table.DefaultTableModel(
                userdao.listTable(),
                new String[]{
                        "用户ID", "用户名", "密码"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 2) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        useTable.setRowSelectionAllowed(true);
        jScrollPane1.setViewportView(useTable);
    }

    public void showCard() {
        cardTable.setModel(new javax.swing.table.DefaultTableModel(
                carddao.listTable(),
                new String[]{
                        "卡号", "密码", "余额", "累计使用", "使用次数", "状态", "开卡时间", "截止时间", "最后使用时间"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 2) {
                    return true;
                } else {
                    return false;
                }
            }

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        useTable.setRowSelectionAllowed(true);
        jScrollPane2.setViewportView(cardTable);
        if (cardTable.getColumnModel().getColumnCount() > 0) {
            cardTable.getColumnModel().getColumn(0).setMinWidth(80);
            cardTable.getColumnModel().getColumn(1).setMinWidth(80);
            cardTable.getColumnModel().getColumn(2).setMaxWidth(80);
            cardTable.getColumnModel().getColumn(3).setMaxWidth(70);
            cardTable.getColumnModel().getColumn(4).setMaxWidth(70);
            cardTable.getColumnModel().getColumn(5).setMaxWidth(50);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        container = new javax.swing.JTabbedPane();
        usersAdmin = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        useTable = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        update = new javax.swing.JButton();
        systemAdmin = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cardTable = new javax.swing.JTable();
        addCard = new javax.swing.JButton();
        statis = new javax.swing.JButton();
        use = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        topUp = new javax.swing.JButton();
        refund = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refreshCard = new javax.swing.JButton();
        cardNumber = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        cardNumberText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("主窗口");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));


        add.setText("注册用户");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setText("删除用户");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        showUser();
        refresh.setText("刷新");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        update.setText("更新用户");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usersAdminLayout = new javax.swing.GroupLayout(usersAdmin);
        usersAdmin.setLayout(usersAdminLayout);
        usersAdminLayout.setHorizontalGroup(
                usersAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(usersAdminLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(69, Short.MAX_VALUE))
                        .addGroup(usersAdminLayout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(add)
                                .addGap(145, 145, 145)
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete)
                                .addGap(131, 131, 131)
                                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170))
        );
        usersAdminLayout.setVerticalGroup(
                usersAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(usersAdminLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(usersAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(add)
                                        .addComponent(update)
                                        .addComponent(delete)
                                        .addComponent(refresh))
                                .addContainerGap(77, Short.MAX_VALUE))
        );
        if (permission())
            container.addTab("用户管理", usersAdmin);

        systemAdmin.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.select"));
        showCard();


        cardNumber.setText("卡号");
        search.setText("查询");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        addCard.setText("添加卡");
        addCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCardActionPerformed(evt);
            }
        });

        statis.setText("统计查询");
        statis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisActionPerformed(evt);
            }
        });

        use.setText("上机");
        use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useActionPerformed(evt);
            }
        });

        stop.setText("下机");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        topUp.setText("充值");
        topUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topUpActionPerformed(evt);
            }
        });

        refund.setText("退费");
        refund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundActionPerformed(evt);
            }
        });

        cancel.setText("注销卡");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        refreshCard.setText("刷新");
        refreshCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshCardActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout systemAdminLayout = new javax.swing.GroupLayout(systemAdmin);
        systemAdmin.setLayout(systemAdminLayout);
        systemAdminLayout.setHorizontalGroup(
                systemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(systemAdminLayout.createSequentialGroup()
                                .addGroup(systemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, systemAdminLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(addCard)
                                                .addGap(40, 40, 40)
                                                .addComponent(statis)
                                                .addGap(40, 40, 40)
                                                .addComponent(use)
                                                .addGap(40, 40, 40)
                                                .addComponent(stop)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(topUp)
                                                .addGap(40, 40, 40)
                                                .addComponent(refund)
                                                .addGap(40, 40, 40)
                                                .addComponent(cancel)
                                                .addGap(40, 40, 40)
                                                .addComponent(refreshCard)
                                                .addGap(40, 40, 40))
                                        .addGroup(systemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(systemAdminLayout.createSequentialGroup()
                                                        .addGap(460, 460, 460)
                                                        .addComponent(cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cardNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(28, 28, 28)
                                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(systemAdminLayout.createSequentialGroup()
                                                        .addGap(48, 48, 48)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(77, Short.MAX_VALUE))
        );

        systemAdminLayout.setVerticalGroup(
                systemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, systemAdminLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(systemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cardNumber)
                                        .addComponent(cardNumberText)
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addGroup(systemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                        .addComponent(statis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(use, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(topUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(refund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(refreshCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27))
        );


//        javax.swing.GroupLayout systemAdminLayout = new javax.swing.GroupLayout(systemAdmin);
//        systemAdmin.setLayout(systemAdminLayout);
//        systemAdminLayout.setHorizontalGroup(
//                systemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, systemAdminLayout.createSequentialGroup()
//                                .addGap(34, 34, 34)
//                                .addComponent(addCard)
//                                .addGap(39, 39, 39)
//                                .addComponent(statis)
//                                .addGap(50, 50, 50)
//                                .addComponent(use, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(41, 41, 41)
//                                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(155, 155, 155)
//                                .addComponent(topUp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(29, 29, 29)
//                                .addComponent(refund, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(38, 38, 38)
//                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(18, 18, 18)
//                                .addComponent(refreshCard, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addContainerGap(49, Short.MAX_VALUE))
//                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, systemAdminLayout.createSequentialGroup()
//                                .addContainerGap()
//                                .addComponent(jScrollPane2)
//                                .addContainerGap())
//        );
//        systemAdminLayout.setVerticalGroup(
//                systemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(systemAdminLayout.createSequentialGroup()
//                                .addGap(63, 63, 63)
//                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
//                                .addGroup(systemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(addCard)
//                                        .addComponent(statis)
//                                        .addComponent(use)
//                                        .addComponent(stop)
//                                        .addComponent(topUp)
//                                        .addComponent(refund)
//                                        .addComponent(cancel)
//                                        .addComponent(refreshCard))
//                                .addGap(59, 59, 59))
//        );

        container.addTab("系统管理", systemAdmin);

        getContentPane().add(container);

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame("root").setVisible(true);
            }
        });
    }

    public boolean permission() {
        // TODO Auto-generated method stub
        if (!userName.equals("root"))
            return false;
        return true;
    }

    private void addActionPerformed(java.awt.event.ActionEvent evt) {
        new registerFrame().setVisible(true);
        this.dispose();
    }

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int row = useTable.getSelectedRow();
            int id = Integer.parseInt(useTable.getValueAt(row, 0).toString());
            String password = useTable.getValueAt(row, 2).toString();
            int result = userdao.update(id, password);
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "用户更新成功", "成功", JOptionPane.PLAIN_MESSAGE);
                showUser();
            } else {
                JOptionPane.showMessageDialog(this, "用户更新失败", "失败", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "请先选择特定一个用户", "失败", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteActionPerformed(ActionEvent evt) {
        try {
            int row = useTable.getSelectedRow();
            int id = Integer.parseInt(useTable.getValueAt(row, 0).toString());
            int result = userdao.delete(id);
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "用户删除成功", "成功", JOptionPane.PLAIN_MESSAGE);
                showUser();
            } else {
                JOptionPane.showMessageDialog(this, "用户删除失败", "失败", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "请先选择特定一个用户", "失败", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void searchActionPerformed(ActionEvent evt) {
        String str = cardNumberText.getText();
        if (str != null) {
            findInTable(str);
        }
    }

    private void findInTable(String str) {
        int rowCount = cardTable.getRowCount();
        int columnCount = cardTable.getColumnCount();
        for (int i = 0; i < rowCount; i++) {
            Object value = cardTable.getValueAt(i, 0);
            if (str.equals(value)) {
                cardTable.getSelectionModel().setSelectionInterval(i, i);
                Rectangle cellRect = cardTable.getCellRect(i, 0, true);
                cardTable.scrollRectToVisible(cellRect);
                break;
            }
        }
    }

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {
        showUser();
    }

    private void addCardActionPerformed(java.awt.event.ActionEvent evt) {
        new addCardFrame(userName).setVisible(true);
        this.dispose();
    }

    private void statisActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int row = cardTable.getSelectedRow();
            String cardNumber = cardTable.getValueAt(row, 0).toString();
            new statistics(cardNumber).setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "请先选择特定一张卡", "失败", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void useActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int row = cardTable.getSelectedRow();
            String cardNumber = cardTable.getValueAt(row, 0).toString();
            int result = carddao.use(cardNumber);
            if (result == 1) {
                JOptionPane.showMessageDialog(this, "上机成功", "成功", JOptionPane.PLAIN_MESSAGE);
                showCard();
            } else if (result == 0) {
                JOptionPane.showMessageDialog(this, "卡不存在", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 2) {
                JOptionPane.showMessageDialog(this, "卡正在被使用或已经注销", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 3) {
                JOptionPane.showMessageDialog(this, "卡欠费", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 4) {
                JOptionPane.showMessageDialog(this, "数据库错误", "失败", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "请先选择特定一张卡", "失败", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int row = cardTable.getSelectedRow();
            String cardNumber = cardTable.getValueAt(row, 0).toString();
            int result = carddao.stop(cardNumber);
            if (result == 1) {
                JOptionPane.showMessageDialog(this, "下机成功", "成功", JOptionPane.PLAIN_MESSAGE);
            } else if (result == 0) {
                JOptionPane.showMessageDialog(this, "卡不存在", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 2) {
                JOptionPane.showMessageDialog(this, "卡尚未被使用或者已经注销", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 3) {
                JOptionPane.showMessageDialog(this, "卡欠费", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 4) {
                JOptionPane.showMessageDialog(this, "数据库错误", "失败", JOptionPane.ERROR_MESSAGE);
            }
            showCard();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "请先选择特定一张卡", "失败", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void topUpActionPerformed(java.awt.event.ActionEvent evt) {
        try {
//            topUpFlag = 0;
            int row = cardTable.getSelectedRow();
            String cardNumber = cardTable.getValueAt(row, 0).toString();
            double cardtopUpAmount;
            while (true) {
                String inputValue = JOptionPane.showInputDialog("请输入充值金额");
                if (!Pattern.matches("^(([0-9]+\\\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\\\.[0-9]+)|([0-9]*[1-9][0-9]*))$", inputValue)) {
                    JOptionPane.showMessageDialog(this, "充值金额必须为正整数", "失败", JOptionPane.ERROR_MESSAGE);
                } else {
                    cardtopUpAmount = Double.parseDouble(inputValue);
                    break;
                }
            }
            int result = carddao.topUp(cardNumber, cardtopUpAmount);
            if (result == 1) {
                JOptionPane.showMessageDialog(this, "充值成功", "成功", JOptionPane.PLAIN_MESSAGE);
                showCard();
            } else if (result == 0) {
                JOptionPane.showMessageDialog(this, "卡不存在", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 2) {
                JOptionPane.showMessageDialog(this, "卡已经注销", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 3) {
                JOptionPane.showMessageDialog(this, "数据库错误", "失败", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "请先选择特定一张卡", "失败", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void refundActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int row = cardTable.getSelectedRow();
            String cardNumber = cardTable.getValueAt(row, 0).toString();
            int result = carddao.drawBack(cardNumber);
            if (result == 1) {
                JOptionPane.showMessageDialog(this, "退费成功", "成功", JOptionPane.PLAIN_MESSAGE);
                showCard();
            } else if (result == 0) {
                JOptionPane.showMessageDialog(this, "卡不存在", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 2) {
                JOptionPane.showMessageDialog(this, "卡正在使用或者已经注销", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 3) {
                JOptionPane.showMessageDialog(this, "卡欠费", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 4) {
                JOptionPane.showMessageDialog(this, "数据库错误", "失败", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "请先选择特定一张卡", "失败", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int row = cardTable.getSelectedRow();
            String cardNumber = cardTable.getValueAt(row, 0).toString();
            int result = carddao.cancel(cardNumber);
            if (result == 1) {
                JOptionPane.showMessageDialog(this, "注销成功", "成功", JOptionPane.PLAIN_MESSAGE);
                showCard();
            } else if (result == 0) {
                JOptionPane.showMessageDialog(this, "卡不存在", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 2) {
                JOptionPane.showMessageDialog(this, "卡正在使用或者已经注销", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 3) {
                JOptionPane.showMessageDialog(this, "卡欠费", "失败", JOptionPane.ERROR_MESSAGE);
            } else if (result == 4) {
                JOptionPane.showMessageDialog(this, "数据库错误", "失败", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "请先选择特定一张卡", "失败", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void refreshCardActionPerformed(java.awt.event.ActionEvent evt) {
        showCard();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton add;
    private javax.swing.JButton addCard;
    private javax.swing.JButton cancel;
    private javax.swing.JTabbedPane container;
    private javax.swing.JButton delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel cardNumber;
    private javax.swing.JButton search;
    private javax.swing.JTextField cardNumberText;
    private javax.swing.JTable cardTable;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refreshCard;
    private javax.swing.JButton refund;
    private javax.swing.JButton statis;
    private javax.swing.JButton stop;
    private javax.swing.JPanel systemAdmin;
    private javax.swing.JButton topUp;
    private javax.swing.JButton update;
    private javax.swing.JButton use;
    private javax.swing.JTable useTable;
    private javax.swing.JPanel usersAdmin;
    // End of variables declaration
}