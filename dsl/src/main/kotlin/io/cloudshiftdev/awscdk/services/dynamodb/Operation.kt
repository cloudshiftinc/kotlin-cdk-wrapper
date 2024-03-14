package io.cloudshiftdev.awscdk.services.dynamodb

public enum class Operation(
    private val cdkObject: software.amazon.awscdk.services.dynamodb.Operation,
) {
    GET_ITEM(software.amazon.awscdk.services.dynamodb.Operation.GET_ITEM),
    BATCH_GET_ITEM(software.amazon.awscdk.services.dynamodb.Operation.BATCH_GET_ITEM),
    SCAN(software.amazon.awscdk.services.dynamodb.Operation.SCAN),
    QUERY(software.amazon.awscdk.services.dynamodb.Operation.QUERY),
    GET_RECORDS(software.amazon.awscdk.services.dynamodb.Operation.GET_RECORDS),
    PUT_ITEM(software.amazon.awscdk.services.dynamodb.Operation.PUT_ITEM),
    DELETE_ITEM(software.amazon.awscdk.services.dynamodb.Operation.DELETE_ITEM),
    UPDATE_ITEM(software.amazon.awscdk.services.dynamodb.Operation.UPDATE_ITEM),
    BATCH_WRITE_ITEM(software.amazon.awscdk.services.dynamodb.Operation.BATCH_WRITE_ITEM),
    TRANSACT_WRITE_ITEMS(software.amazon.awscdk.services.dynamodb.Operation.TRANSACT_WRITE_ITEMS),
    TRANSACT_GET_ITEMS(software.amazon.awscdk.services.dynamodb.Operation.TRANSACT_GET_ITEMS),
    EXECUTE_TRANSACTION(software.amazon.awscdk.services.dynamodb.Operation.EXECUTE_TRANSACTION),
    BATCH_EXECUTE_STATEMENT(
        software.amazon.awscdk.services.dynamodb.Operation.BATCH_EXECUTE_STATEMENT
    ),
    EXECUTE_STATEMENT(software.amazon.awscdk.services.dynamodb.Operation.EXECUTE_STATEMENT),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.dynamodb.Operation
        ): Operation =
            when (cdkObject) {
                software.amazon.awscdk.services.dynamodb.Operation.GET_ITEM -> Operation.GET_ITEM
                software.amazon.awscdk.services.dynamodb.Operation.BATCH_GET_ITEM ->
                    Operation.BATCH_GET_ITEM
                software.amazon.awscdk.services.dynamodb.Operation.SCAN -> Operation.SCAN
                software.amazon.awscdk.services.dynamodb.Operation.QUERY -> Operation.QUERY
                software.amazon.awscdk.services.dynamodb.Operation.GET_RECORDS ->
                    Operation.GET_RECORDS
                software.amazon.awscdk.services.dynamodb.Operation.PUT_ITEM -> Operation.PUT_ITEM
                software.amazon.awscdk.services.dynamodb.Operation.DELETE_ITEM ->
                    Operation.DELETE_ITEM
                software.amazon.awscdk.services.dynamodb.Operation.UPDATE_ITEM ->
                    Operation.UPDATE_ITEM
                software.amazon.awscdk.services.dynamodb.Operation.BATCH_WRITE_ITEM ->
                    Operation.BATCH_WRITE_ITEM
                software.amazon.awscdk.services.dynamodb.Operation.TRANSACT_WRITE_ITEMS ->
                    Operation.TRANSACT_WRITE_ITEMS
                software.amazon.awscdk.services.dynamodb.Operation.TRANSACT_GET_ITEMS ->
                    Operation.TRANSACT_GET_ITEMS
                software.amazon.awscdk.services.dynamodb.Operation.EXECUTE_TRANSACTION ->
                    Operation.EXECUTE_TRANSACTION
                software.amazon.awscdk.services.dynamodb.Operation.BATCH_EXECUTE_STATEMENT ->
                    Operation.BATCH_EXECUTE_STATEMENT
                software.amazon.awscdk.services.dynamodb.Operation.EXECUTE_STATEMENT ->
                    Operation.EXECUTE_STATEMENT
            }

        internal fun unwrap(
            wrapped: Operation
        ): software.amazon.awscdk.services.dynamodb.Operation = wrapped.cdkObject
    }
}
