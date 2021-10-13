package com.alodiga.wallet.common.ejb;

import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import com.alodiga.wallet.common.exception.EmptyListException;
import com.alodiga.wallet.common.exception.GeneralException;
import com.alodiga.wallet.common.exception.NullParameterException;
import com.alodiga.wallet.common.exception.RegisterNotFoundException;
import com.alodiga.wallet.common.genericEJB.EJBRequest;
import com.alodiga.wallet.common.genericEJB.WalletGenericEJBLocal;
import com.alodiga.wallet.common.model.Profile;
import com.alodiga.wallet.common.model.User;

@Local
public interface UserEJBLocal extends WalletGenericEJBLocal {
    //User
    public List<User> getUsers(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;   
    public List<User> validatePassword(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;
    public List<User> getUserTopUpNotification() throws EmptyListException, GeneralException;
    public User loadUser(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;
    public User loadUserByLogin(String login) throws RegisterNotFoundException, NullParameterException, GeneralException;
    public User loadUserByEmail(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;
    public User loadUserByLogin(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;
    public User saveUser(EJBRequest request) throws NullParameterException, GeneralException;
    public User saveUser(User user) throws NullParameterException, GeneralException;
    public boolean validateExistingUser(EJBRequest request) throws NullParameterException, GeneralException;
    public void updateUserNotifications(String ids) throws NullParameterException, GeneralException;
    public List<User> getValidateEmployee(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;
    public List<User> getUserByLogin(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;
        
    //Profile
    public List<Profile> getProfiles() throws EmptyListException, GeneralException;
    
}
