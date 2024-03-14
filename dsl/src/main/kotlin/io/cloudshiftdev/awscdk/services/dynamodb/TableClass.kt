package io.cloudshiftdev.awscdk.services.dynamodb

public enum class TableClass(
    private val cdkObject: software.amazon.awscdk.services.dynamodb.TableClass,
) {
    STANDARD(software.amazon.awscdk.services.dynamodb.TableClass.STANDARD),
    STANDARD_INFREQUENT_ACCESS(
        software.amazon.awscdk.services.dynamodb.TableClass.STANDARD_INFREQUENT_ACCESS
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.dynamodb.TableClass
        ): TableClass =
            when (cdkObject) {
                software.amazon.awscdk.services.dynamodb.TableClass.STANDARD -> TableClass.STANDARD
                software.amazon.awscdk.services.dynamodb.TableClass.STANDARD_INFREQUENT_ACCESS ->
                    TableClass.STANDARD_INFREQUENT_ACCESS
            }

        internal fun unwrap(
            wrapped: TableClass
        ): software.amazon.awscdk.services.dynamodb.TableClass = wrapped.cdkObject
    }
}
