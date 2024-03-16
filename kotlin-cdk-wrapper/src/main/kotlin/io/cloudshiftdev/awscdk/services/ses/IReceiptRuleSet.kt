@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A receipt rule set.
 */
public interface IReceiptRuleSet : IResource {
  /**
   * Adds a new receipt rule in this rule set.
   *
   * The new rule is added after
   * the last added rule unless `after` is specified.
   *
   * @param id 
   * @param options
   */
  public fun addRule(id: String): ReceiptRule

  /**
   * Adds a new receipt rule in this rule set.
   *
   * The new rule is added after
   * the last added rule unless `after` is specified.
   *
   * @param id 
   * @param options
   */
  public fun addRule(id: String, options: ReceiptRuleOptions): ReceiptRule

  /**
   * Adds a new receipt rule in this rule set.
   *
   * The new rule is added after
   * the last added rule unless `after` is specified.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b9870cb7a366bfe448970b02b093ce946df61e1278e1b984e00908c5e1e1d5df")
  public fun addRule(id: String, options: ReceiptRuleOptions.Builder.() -> Unit): ReceiptRule

  /**
   * The receipt rule set name.
   */
  public fun receiptRuleSetName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleSet):
        IReceiptRuleSet = CdkObjectWrappers.wrap(cdkObject) as IReceiptRuleSet

    internal fun unwrap(wrapped: IReceiptRuleSet):
        software.amazon.awscdk.services.ses.IReceiptRuleSet = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IReceiptRuleSet
  }
}
