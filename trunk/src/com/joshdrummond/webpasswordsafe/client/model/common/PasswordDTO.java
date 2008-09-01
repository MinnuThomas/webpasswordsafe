/*
    Copyright 2008 Josh Drummond

    This file is part of WebPasswordSafe.

    WebPasswordSafe is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    WebPasswordSafe is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with WebPasswordSafe; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
*/
package com.joshdrummond.webpasswordsafe.client.model.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * @author Josh Drummond
 *
 */
public class PasswordDTO
    implements IsSerializable
{
    private long id;
    private String name;
    private String username;
    private String notes;
    private int maxHistory;
    private boolean active;
    private Date dateCreated;
    private UserDTO userCreated;
    private Date dateLastUpdated;
    private UserDTO userLastUpdated;
    private String currentPassword;
    private List<PasswordDataDTO> passwordData;
    private List<PermissionDTO> permissions;
    private String tags;
    
    /**
     * @param id
     * @param name
     * @param username
     * @param active
     * @param maxHistory
     * @param notes
     */
    public PasswordDTO(long id, String name, String username, String password, boolean active,
            int maxHistory, String notes, String tags)
    {
        this.id = id;
        this.name = name;
        this.username = username;
        this.active = active;
        this.maxHistory = maxHistory;
        this.notes = notes;
        this.tags = tags;
        this.currentPassword = password;
//        PasswordDataDTO passwordDataItem = new PasswordDataDTO(password);
//        passwordData = new ArrayList();
//        passwordData.add(passwordDataItem);
        permissions = new ArrayList<PermissionDTO>();
//        tags = new ArrayList();
    }
    
    
    /**
     * 
     */
    public PasswordDTO()
    {
        this(0, "", "", "", true, -1, "", "");
    }
    /**
     * @return the id
     */
    public long getId()
    {
        return this.id;
    }
    /**
     * @param id the id to set
     */
    public void setId(long id)
    {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * @return the username
     */
    public String getUsername()
    {
        return this.username;
    }
    /**
     * @param username the username to set
     */
    public void setUsername(String username)
    {
        this.username = username;
    }
    /**
     * @return the notes
     */
    public String getNotes()
    {
        return this.notes;
    }
    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes)
    {
        this.notes = notes;
    }
    /**
     * @return the maxHistory
     */
    public int getMaxHistory()
    {
        return this.maxHistory;
    }
    /**
     * @param maxHistory the maxHistory to set
     */
    public void setMaxHistory(int maxHistory)
    {
        this.maxHistory = maxHistory;
    }
    /**
     * @return the active
     */
    public boolean isActive()
    {
        return this.active;
    }
    /**
     * @param active the active to set
     */
    public void setActive(boolean active)
    {
        this.active = active;
    }
    /**
     * @return the dateCreated
     */
    public Date getDateCreated()
    {
        return this.dateCreated;
    }
    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated)
    {
        this.dateCreated = dateCreated;
    }
    /**
     * @return the userCreated
     */
    public UserDTO getUserCreated()
    {
        return this.userCreated;
    }
    /**
     * @param userCreated the userCreated to set
     */
    public void setUserCreated(UserDTO userCreated)
    {
        this.userCreated = userCreated;
    }
    /**
     * @return the dateLastUpdated
     */
    public Date getDateLastUpdated()
    {
        return this.dateLastUpdated;
    }
    /**
     * @param dateLastUpdated the dateLastUpdated to set
     */
    public void setDateLastUpdated(Date dateLastUpdated)
    {
        this.dateLastUpdated = dateLastUpdated;
    }
    /**
     * @return the userLastUpdated
     */
    public UserDTO getUserLastUpdated()
    {
        return this.userLastUpdated;
    }
    /**
     * @param userLastUpdated the userLastUpdated to set
     */
    public void setUserLastUpdated(UserDTO userLastUpdated)
    {
        this.userLastUpdated = userLastUpdated;
    }
    /**
     * @return the passwordData
     */
    public List<PasswordDataDTO> getPasswordData()
    {
        return this.passwordData;
    }
    /**
     * @param passwordData the passwordData to set
     */
    public void setPasswordData(List<PasswordDataDTO> passwordData)
    {
        this.passwordData = passwordData;
    }
    /**
     * @return the permissions
     */
    public List<PermissionDTO> getPermissions()
    {
        return this.permissions;
    }
    /**
     * @param permissions the permissions to set
     */
    public void setPermissions(List<PermissionDTO> permissions)
    {
        this.permissions = permissions;
    }
    /**
     * @return the tags
     */
    public String getTags()
    {
        return this.tags;
    }
    /**
     * @param tags the tags to set
     */
    public void setTags(String tags)
    {
        this.tags = tags;
    }


    public String getCurrentPassword()
    {
        return this.currentPassword;
    }


    public void setCurrentPassword(String currentPassword)
    {
        this.currentPassword = currentPassword;
    }
    
    /*
    public String getCurrentPassword()
    {
        String currentPassword = "";
        if ((null != passwordData) && (passwordData.size() > 0))
        {
            currentPassword = ((PasswordDataDTO)passwordData.get(0)).getPassword();
        }
        return currentPassword;
    }
    
    public String getTagsAsString()
    {
        String displayTags = "";
        if (null != tags)
        {
            for (int i = 0; i < tags.size(); i++)
            {
                displayTags += ((TagDTO)tags.get(i)).getName() + " ";
            }
        }
        return displayTags.trim();
    }
    */
}
