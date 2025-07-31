import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private int amount;
    private TransactionType type;
    private LocalDateTime timestamp;

    public Transaction(int amount, TransactionType type, LocalDateTime timestamp){
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }

    public enum TransactionType {
        DEPOSIT,
        WITHDRAW
    }

    public int getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
