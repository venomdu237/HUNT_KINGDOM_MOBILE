package com.codename1.uikit.pheonixui;

import com.codename1.l10n.SimpleDateFormat;
import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.spinner.Picker;
import com.codename1.ui.util.Resources;
import java.util.Date;

/**
 * GUI builder created Form
 *
 * @author shai
 */

public class Urgence extends BaseForm {
    public Urgence(Resources res) {
        super();
    }


    //-- DON'T EDIT BELOW THIS LINE!!!
    //private com.codename1.ui.urgence gui_Calendar_1 = new com.codename1.ui.Calendar();

    //-- DON'T EDIT ABOVE THIS LINE!!!

    @Override
    protected boolean isCurrentCalendar() {
        return true;
    }

    @Override
    protected void initGlobalToolbar() {
        setToolbar(new Toolbar(true));
    }

}