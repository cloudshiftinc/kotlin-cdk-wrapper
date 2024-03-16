@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A receipt rule.
 */
public interface IReceiptRule : IResource {
  /**
   * The name of the receipt rule.
   */
  public fun receiptRuleName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IReceiptRule): IReceiptRule =
        CdkObjectWrappers.wrap(cdkObject) as IReceiptRule

    internal fun unwrap(wrapped: IReceiptRule): software.amazon.awscdk.services.ses.IReceiptRule =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.IReceiptRule
  }
}
