package calisma.amazon.pages;

import calisma.amazon.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

    public abstract class BasePage {

        public BasePage() {

            PageFactory.initElements(Driver.get(), this);
        }


    }
