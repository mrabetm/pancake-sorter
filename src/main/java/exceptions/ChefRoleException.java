package exceptions;

public class ChefRoleException extends Exception{
    private boolean isSousChef;

    public ChefRoleException(boolean isSousChef) {
        this.isSousChef = isSousChef;
    }

    @Override
    public String getMessage() {
        return isSousChef ? "Can't perform this action since I'am the sous chef" :
                "Can't perform this action since I'am the chef";
    }
}
