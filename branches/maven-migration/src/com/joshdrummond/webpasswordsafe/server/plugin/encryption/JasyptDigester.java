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
package com.joshdrummond.webpasswordsafe.server.plugin.encryption;

import org.jasypt.util.password.PasswordEncryptor;

/**
 * @author Josh Drummond
 *
 */
public class JasyptDigester implements Digester
{
    private PasswordEncryptor passwordEncryptor;
    
    /* (non-Javadoc)
     * @see com.joshdrummond.webpasswordsafe.server.plugin.encryption.Digester#digest(java.lang.String)
     */
    public String digest(String clearText)
    {
        return passwordEncryptor.encryptPassword(clearText);
    }

    /* (non-Javadoc)
     * @see com.joshdrummond.webpasswordsafe.server.plugin.encryption.Digester#check(java.lang.String, java.lang.String)
     */
    public boolean check(String clearText, String cryptedText)
    {
        return passwordEncryptor.checkPassword(clearText, cryptedText);
    }

    public PasswordEncryptor getPasswordEncryptor()
    {
        return this.passwordEncryptor;
    }

    public void setPasswordEncryptor(PasswordEncryptor passwordEncryptor)
    {
        this.passwordEncryptor = passwordEncryptor;
    }

}
