package io.cloudshiftdev.awscdk.services.ses

public enum class ReceiptFilterPolicy(
    private val cdkObject: software.amazon.awscdk.services.ses.ReceiptFilterPolicy,
) {
    ALLOW(software.amazon.awscdk.services.ses.ReceiptFilterPolicy.ALLOW),
    BLOCK(software.amazon.awscdk.services.ses.ReceiptFilterPolicy.BLOCK),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ses.ReceiptFilterPolicy
        ): ReceiptFilterPolicy =
            when (cdkObject) {
                software.amazon.awscdk.services.ses.ReceiptFilterPolicy.ALLOW ->
                    ReceiptFilterPolicy.ALLOW
                software.amazon.awscdk.services.ses.ReceiptFilterPolicy.BLOCK ->
                    ReceiptFilterPolicy.BLOCK
            }

        internal fun unwrap(
            wrapped: ReceiptFilterPolicy
        ): software.amazon.awscdk.services.ses.ReceiptFilterPolicy = wrapped.cdkObject
    }
}
