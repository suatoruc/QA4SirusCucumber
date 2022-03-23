package pages.automationex;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationexecPages {
    public AutomationexecPages() {
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement headerSignUpbutonElement;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUsersigupYaziElement;

    @FindBy(css= "[name=\"name\"]")
    public WebElement nameInputBox;

    @FindBy(css = "[data-qa=\"signup-email\"]")
    public WebElement newUserEmailInputBox;

    @FindBy(css = "[name=\"title\"]")
    public WebElement titleWebElemet;

    @FindBy(css = "[data-qa=\"create-account\"]")
    public WebElement newUseSignInButtonElement;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement accountInformationYaziElement;

    @FindBy(css = "[data-qa=\"signup-button\"]")
    public WebElement sigInButonElement;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueButon;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement logInAsWebElement;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement deleteButtonWebElement;

    @FindBy(xpath = "//h1[text()='Delete Account']")
    public WebElement deleteAccountyaziElement;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedYaziWebElemet;



    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginYourAccountYazisi;

    @FindBy(css = "[data-qa=\"login-button\"]")
    public WebElement loginSayfasiLoginButonu;
    @FindBy(css = "[data-qa=\"login-email\"]")
    public WebElement loginSayfasıEmailAdressInput;

    @FindBy(css = "[data-qa=\"login-password\"]")
    public WebElement loginSayfasiPasswordInput;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement incorrectemailOrPasswordYazisi;

    @FindBy(xpath = "//a[text()=' Logout']")
    public WebElement headerLogOutButonu;

    @FindBy(xpath = "//p[text()='Email Address already exist!']")
    public WebElement emailAlreadyExistYazisi;

    @FindBy(xpath = "//a[text()=' Contact us']")
    public WebElement headerContactUsButon;

    @FindBy(xpath = "//h2[text()='Get In Touch']")
    public WebElement contactUsPageGetInTouchYazisi;
    @FindBy(css = "[data-qa=\"name\"]")
    public WebElement contactUsPageNameInputBox;
    @FindBy(css = "[data-qa=\"submit-button\"]")
    public WebElement contactusPageSubmitButonu;
    @FindBy(xpath = "(//div[text()='Success! Your details have been submitted successfully.'])[1]")
    public WebElement contactusSuccessSubmitYazisi;

    @FindBy(xpath = "//a[text()=' Test Cases']")
    public WebElement headerTestCasesButonu;
    @FindBy(xpath = "//b[text()='Test Cases']")
    public WebElement testCasesPageTestCaseYazisi;

    @FindBy(xpath = "//a[text()=' Products']")
    public WebElement headerProductsButonu;
    @FindBy(xpath = "//h2[text()='All Products']")
    public WebElement productsPageAllPrpductsYazisi;
    @FindBy(xpath = "//a[text()='View Product']")
    public List<WebElement> productsPageAllProducList;
    @FindBy(css = "[class=\"single-products\"]")
    public List<WebElement> productPageAllProductDetailList;

    @FindBy(css = "[class=\"product-information\"]")
    public WebElement productPageFirstProductDetailPage;

    @FindBy(css = "[id=\"search_product\"]")
    public WebElement productPagesSearchInputBox;
    @FindBy(css = "[id=\"submit_search\"]")
    public WebElement productPageSearchButonBox;
    @FindBy(css = "[class=\"product-image-wrapper\"]")
    public List<WebElement> productPageSearchResultList;
    @FindBy(xpath = "//h2[text()='Searched Products']")
    public WebElement productPageSearchProductYazisi;

    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement mainPageFooterSubscriptionYazisi;

    @FindBy(css = "[id=\"susbscribe_email\"]")
    public WebElement mainPageFooterSubscriptionInputBox;
    @FindBy(css = "[id=\"subscribe\"]")
    public WebElement mainpageFooterSubscriptionButonu;
    @FindBy(css = "[id=\"success-subscribe\"]")
    public WebElement mainpageFooterSuccesScripeYazisi;

    @FindBy(xpath = "//a[text()=' Cart']")
    public WebElement headerCartButonu;

    @FindBy(xpath = "//a[text()='Add to cart']")
    public List<WebElement> productpageAddListElement;
    @FindBy(xpath ="//button[text()='Continue Shopping']")
    public WebElement productPageContinueButton;
    @FindBy(xpath = "(//a[@data-product-id=\"2\"])[1]")
    public WebElement productPage2UrunElement;
    @FindBy(css = "[id=\"product-1\"]")
    public WebElement cardPageilkUrun;
    @FindBy(css = "[id=\"product-2\"]")
    public WebElement cardPageikinciUrun;
    @FindBy(xpath = "(//a[@class=\"btn btn-default add-to-cart\"])[1]")
    public WebElement productPageilkUrunElement;
    @FindBy(css = "[class=\"col-sm-9 padding-right\"]")
    public WebElement productpageAllPage;
    @FindBy(xpath = "(//p[.='Blue Top'])[1]")
    public WebElement ilkUrunTitle;
    @FindBy(xpath = "(//p[.='Men Tshirt'])[1]")
    public WebElement ikinciUrunTitle;
    @FindBy(xpath = "//a[.='Blue Top']")
    public WebElement cardpageIlkUrunTitle;
    @FindBy(xpath = "//a[.='Men Tshirt']")
    public WebElement cardPageikinciUrunTitle;

    @FindBy(css = "[name=\"quantity\"]")
    public WebElement detailPageQuantityElement;
    @FindBy(css = "[class=\"btn btn-default cart\"]")
    public WebElement detailsPageAddToCardButonu;
    @FindBy(xpath = "(//button[@class=\"disabled\"])[1]")
    public WebElement cardPagefirstProductQuantityNumber;
    @FindBy(xpath = "//li[.='Shopping Cart']")
    public WebElement carpPageShoppingCardYazisi;
    @FindBy(css = "[class=\"btn btn-default check_out\"]")
    public WebElement cardpageProceedCheckOutButonu;
    @FindBy(xpath = "(//a[@href=\"/login\"])[2]")
    public WebElement cardpagePopupRegisterButonu;
    @FindBy(css = "[data-qa=\"continue-button\"]")
    public WebElement sigupContinueButon;
    @FindBy(css = "[id=\"name\"]")
    public WebElement createAccountNameInput;
    @FindBy(css = "[data-qa=\"address\"]")
    public WebElement createAccountAdressInput;
    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[4]")
    public WebElement cardpageAdressYaziElemet;
    @FindBy(css = "[name=\"message\"]")
    public WebElement cardpageTextArea;
    @FindBy(css = "[class=\"btn btn-default check_out\"]")
    public WebElement cardPagePlaceOrderButonu;
    @FindBy(css = "[data-qa=\"pay-button\"]")
    public WebElement paymentpagePayAndConfirmOrderButon;
    @FindBy(xpath = "//p[.='Congratulations! Your order has been confirmed!']")
    public WebElement paymentpageSuccesFullyOrderYaziElement;
    @FindBy(css = "[data-target=\"#deleteModal\"]")
    public WebElement deletepageDeleteAccountButon;

    @FindBy(css = "[class=\"cart_quantity_delete\"]")
    public WebElement cardpageRemoveItemButonElement;

    @FindBy(xpath = "//b[.='Cart is empty!']")
    public WebElement cardpageSuccesRemoveItemYazisi;

    @FindBy(xpath = "//h2[.='Category']")
    public WebElement mainpageLeftSideCategoryYazisi;
    @FindBy(xpath = "(//a[@data-parent=\"#accordian\"])[1]")
    public WebElement mainpageLeftSiteCategoryWomenButonElement;
    @FindBy(xpath = "(//a[@data-parent=\"#accordian\"])[2]")
    public WebElement mainpageLeftSideCategoryMenButonElement;
    @FindBy(xpath = "(//a[@data-parent=\"#accordian\"])[3]")
    public WebElement mainpageLeftSideCategoryKidsButonElement;
    @FindBy(css = "[href=\"/category_products/1\"]")
    public WebElement mainpageleftSideCategoryWomenUnderDressButon;
    @FindBy(xpath = "//h2[.='Women - Tops Products']")
    public WebElement katergoripageTopsProductYaziElement;
    @FindBy(css = "[href=\"/category_products/3\"]")
    public WebElement mainpageleftSideCategoryMenTshirtButon;
    @FindBy(xpath = "//h2[.='Women - Dress Products']")
    public WebElement katergoripageDressProductYaziElement;

    @FindBy(xpath = "//h2[.='Brands']")
    public WebElement productpagesLeftSideBrandsYazisi;
    @FindBy( partialLinkText = "...")
    public List<WebElement> productpageLeftSideBrandList;
    @FindBy(css = "[href=\"/brand_products/H&M\"]")
    public WebElement productPageLeftsideHmBrandButonElement;
    @FindBy(css = "[href=\"/brand_products/Polo\"]")
    public WebElement productpageLeftSidePoloBrandButonElement;

    @FindBy(xpath = "((//div[@class=\"productinfo text-center\"])//p)[1]")
    public WebElement productpageIlkUrunTitle;
    @FindBy(xpath = "//*[@id=\"product-2\"]/td[2]/h4/a")
    public WebElement cardPageFirstProductTitleElement;

    @FindBy(css = "[data-toggle=\"tab\"]")
    public WebElement urundetailpageWriteYourReviewTextElement;

    @FindBy(css = "[id=\"name\"]")
    public WebElement urundetailspageReviewFormnameInputBox;
    @FindBy(css = "[id=\"button-review\"]")
    public WebElement urundetailpageSubmitButonElement;
    @FindBy(xpath = "//span[.='Thank you for your review.']")
    public WebElement urundetailpageReviewFormThanksMesageElement;

    @FindBy(xpath = "//h2[.='recommended items']")
    public WebElement mainpageRecomentedItemsYaziElementi;
    @FindBy(xpath = "((//*[@class=\"item active\"])[2]//a)[1]")
    public WebElement mainpageRecomentedItemsFirstProductElements;
    @FindBy(xpath = "((//*[@class=\"item active\"])[2]//p)[1]" )
            public WebElement mainpageRecomentedItemsFisrtProductNameYazisi;
    @FindBy(xpath = "//a[.='View Cart']")
    public WebElement mainpageRecomentedItemsPopupViewCardButonElement;
    @FindBy(xpath = "//tbody//tr[1]//td[2]//h4")
    public WebElement cardpageFirstUrunTitleYazisi;
    @FindBy(xpath = "(//li[@class=\"address_address1 address_address2\"])[5]")
    public WebElement billpageAdressTitle;
    @FindBy(css ="[data-qa=\"continue-button\"]")
    public WebElement paymentpageContinueButtonElement;

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement mainpageSubscriponTextElement;
    @FindBy(xpath = "(//div[@class=\"item active\"]//h2)[1]")
    public WebElement mainpageAutomationEngeneerPracticeTextElement;
    @FindBy(css = "[id=\"scrollUp\"]")
    public WebElement mainpageScrollUpButonElement;
























}



