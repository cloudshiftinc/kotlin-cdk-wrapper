@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean

/**
 * Interface to specify certain functions as Service Catalog rule-specific.
 *
 * These functions can only be used in `Rules` section of template.
 */
public interface ICfnRuleConditionExpression : ICfnConditionExpression {
  /**
   * This field is only needed to defeat TypeScript's structural typing.
   *
   * It is never used.
   */
  public fun disambiguator(): Boolean

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ICfnRuleConditionExpression):
        ICfnRuleConditionExpression = CdkObjectWrappers.wrap(cdkObject) as
        ICfnRuleConditionExpression

    internal fun unwrap(wrapped: ICfnRuleConditionExpression):
        software.amazon.awscdk.ICfnRuleConditionExpression = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.ICfnRuleConditionExpression
  }
}
