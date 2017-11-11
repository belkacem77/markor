/*
 * ------------------------------------------------------------------------------
 * Gregor Santner <gsantner.net> wrote this. You can do whatever you want
 * with it. If we meet some day, and you think it is worth it, you can buy me a
 * coke in return. Provided as is without any kind of warranty. Do not blame or
 * sue me if something goes wrong. No attribution required.    - Gregor Santner
 *
 * License: Creative Commons Zero (CC0 1.0)
 *  http://creativecommons.org/publicdomain/zero/1.0/
 * ----------------------------------------------------------------------------
 */
package net.gsantner.markor.model;

import android.content.Context;

import java.io.File;
import java.io.Serializable;

public abstract class DocumentSource implements Serializable {

    protected DocumentSource() {
        Context c;
        File f;
    }

    public abstract boolean isFile();

    public abstract boolean isFolder();

    public abstract boolean canRead();

    public abstract boolean canWrite();

    public abstract boolean canDelete();

    public abstract boolean canMove();

    public abstract String readString();

    public abstract boolean writeString();
}
