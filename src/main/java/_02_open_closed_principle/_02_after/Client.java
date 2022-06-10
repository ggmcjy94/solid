package _02_open_closed_principle._02_after;

import _02_open_closed_principle._01_before.User;

import java.sql.SQLException;



//기존의 코드에서 슈퍼 클래스와 하위 클래스간의 의존성 문제를 인터페이스를 통해 해결하였다.
//connection 연결에 대한 부분을 클라이언트에게 제공하게 되면 연결에 대한 정보가 변경될 때에도 애플리케이션에 영향을 주지 않는다.
// 연결에 대한 비즈니스와 사용자 기능에 대한 비즈니스를 분리시켰기 때문에 개발자는 사용자 비즈니스가 변경될 경우 변경된 애플리케이션을 제공하면 된다.
public class Client {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao(new AConnectionMaker());
        userDao.add(new User(1L, "gus", "qweqweqwe"));
    }
}
