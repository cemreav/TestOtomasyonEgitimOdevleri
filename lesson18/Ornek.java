package lesson18;

import org.testng.annotations.*;

public class Ornek {
    @BeforeSuite
    public void startBrowser() {
// Tarayıcıyı başlatma
    }
    @BeforeClass
    public void createTestData() {
// Test sınıfı için veri oluşturma
    }
    @BeforeMethod
    public void setUp() {
// Test öncesi ortam hazırlama
    }
    @Test(groups = "smoke")
    public void testLogin() {
// Login testi
    }

    @Test(groups = {"regression", "smoke"})
    public void testSearch() {
// Arama testi
    }
    @AfterMethod
    public void tearDown() {
// Test sonrası temizlik
    }
    @AfterClass
    public void deleteTestData() {
// Test sınıfı için oluşturulan verileri silme
    }
    @AfterSuite
    public void closeBrowser() {
// Tarayıcıyı kapatma
    }
}
