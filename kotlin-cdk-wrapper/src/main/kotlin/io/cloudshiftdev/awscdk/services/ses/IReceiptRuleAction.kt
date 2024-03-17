@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * An abstract action for a receipt rule.
 */
public interface IReceiptRuleAction {
  /**
   * Returns the receipt rule action specification.
   *
   * @param receiptRule 
   */
  public fun bind(receiptRule: IReceiptRule): ReceiptRuleActionConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleAction,
  ) : CdkObject(cdkObject), IReceiptRuleAction {
    /**
     * Returns the receipt rule action specification.
     *
     * @param receiptRule 
     */
    override fun bind(receiptRule: IReceiptRule): ReceiptRuleActionConfig =
        unwrap(this).bind(receiptRule.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleAction):
        IReceiptRuleAction = CdkObjectWrappers.wrap(cdkObject) as? IReceiptRuleAction ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReceiptRuleAction):
        software.amazon.awscdk.services.ses.IReceiptRuleAction = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IReceiptRuleAction
  }
}
