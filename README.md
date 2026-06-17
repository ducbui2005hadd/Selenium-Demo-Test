# Báo cáo tìm hiểu và thực hành Selenium

## 1. Giới thiệu

Selenium là một framework mã nguồn mở dùng để tự động hóa việc kiểm thử các ứng dụng web. Selenium hỗ trợ nhiều trình duyệt như Chrome, Firefox, Edge và nhiều ngôn ngữ lập trình như Java, Python, C#, JavaScript.

## 2. Mục tiêu

* Tìm hiểu cách hoạt động của Selenium.
* Xây dựng các test case kiểm thử tự động.
* Thực hành chạy test trên trình duyệt web.

## 3. Môi trường thực hiện

* Java 17
* Selenium WebDriver 4.x
* Chrome Browser
* ChromeDriver
* Maven
* IntelliJ IDEA

## 4. Website kiểm thử

Website: https://www.saucedemo.com

Tài khoản sử dụng:

Username: standard_user

Password: secret_sauce

## 5. Test Cases

### TC01 - Đăng nhập thành công

Mục tiêu:
Kiểm tra người dùng có thể đăng nhập bằng tài khoản hợp lệ.

Các bước:

1. Truy cập website.
2. Nhập username.
3. Nhập password.
4. Nhấn Login.

Kết quả mong đợi:

Người dùng được chuyển tới trang Products.

---

### TC02 - Thêm sản phẩm vào giỏ hàng

Mục tiêu:
Kiểm tra chức năng thêm sản phẩm vào giỏ hàng.

Các bước:

1. Đăng nhập hệ thống.
2. Chọn sản phẩm "Sauce Labs Backpack".
3. Nhấn Add to Cart.

Kết quả mong đợi:

Biểu tượng giỏ hàng hiển thị số lượng sản phẩm là 1.

---

### TC03 - Đăng xuất

Mục tiêu:
Kiểm tra chức năng đăng xuất.

Các bước:

1. Đăng nhập hệ thống.
2. Mở menu.
3. Chọn Logout.

Kết quả mong đợi:

Người dùng quay về màn hình đăng nhập.

## 6. Kết quả thực hiện

| Test Case | Kết quả |
| --------- | ------- |
| TC01      | Passed  |
| TC02      | Passed  |
| TC03      | Passed  |

## 7. Nhận xét

Selenium giúp tự động hóa các thao tác trên trình duyệt, giảm thời gian kiểm thử thủ công và tăng độ chính xác. Qua bài thực hành đã xây dựng thành công 3 test case cơ bản gồm đăng nhập, thêm sản phẩm vào giỏ hàng và đăng xuất.

## 8. Tài liệu tham khảo

* https://www.selenium.dev/
* https://www.saucedemo.com/
* Selenium Documentation
