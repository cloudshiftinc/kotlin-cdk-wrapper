package io.cloudshiftdev.awscdk.services.ses

public interface IReceiptRuleAction {
    /**
     * Returns the receipt rule action specification.
     *
     * @param receiptRule
     */
    public fun bind(receiptRule: IReceiptRule): ReceiptRuleActionConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleAction,
    ) : IReceiptRuleAction {
        /**
         * Returns the receipt rule action specification.
         *
         * @param receiptRule
         */
        override fun bind(receiptRule: IReceiptRule): ReceiptRuleActionConfig =
            unwrap(this)
                .bind(receiptRule.let(IReceiptRule::unwrap))
                .let(ReceiptRuleActionConfig::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleAction
        ): IReceiptRuleAction = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IReceiptRuleAction
        ): software.amazon.awscdk.services.ses.IReceiptRuleAction = (wrapped as Wrapper).cdkObject
    }
}
