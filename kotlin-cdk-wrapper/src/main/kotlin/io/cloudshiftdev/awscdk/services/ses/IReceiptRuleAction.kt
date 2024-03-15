@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IReceiptRuleAction {
  public fun bind(arg0: IReceiptRule): ReceiptRuleActionConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleAction,
  ) : CdkObject(cdkObject), IReceiptRuleAction {
    override fun bind(arg0: IReceiptRule): ReceiptRuleActionConfig =
        unwrap(this).bind(arg0.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleAction):
        IReceiptRuleAction = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReceiptRuleAction):
        software.amazon.awscdk.services.ses.IReceiptRuleAction = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IReceiptRuleAction
  }
}
