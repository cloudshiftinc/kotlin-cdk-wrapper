package io.cloudshiftdev.awscdk.services.ses

public interface IReceiptRuleAction {
  public fun bind(arg0: IReceiptRule): ReceiptRuleActionConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleAction,
  ) : IReceiptRuleAction {
    override fun bind(arg0: IReceiptRule): ReceiptRuleActionConfig =
        unwrap(this).bind(arg0.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleAction):
        IReceiptRuleAction = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReceiptRuleAction):
        software.amazon.awscdk.services.ses.IReceiptRuleAction = (wrapped as Wrapper).cdkObject
  }
}
