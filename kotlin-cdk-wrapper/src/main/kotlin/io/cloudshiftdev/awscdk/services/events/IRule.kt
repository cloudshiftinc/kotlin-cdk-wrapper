@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an EventBridge Rule.
 */
public interface IRule : IResource {
  /**
   * The value of the event rule Amazon Resource Name (ARN), such as
   * arn:aws:events:us-east-2:123456789012:rule/example.
   */
  public fun ruleArn(): String

  /**
   * The name event rule.
   */
  public fun ruleName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IRule): IRule =
        CdkObjectWrappers.wrap(cdkObject) as IRule

    internal fun unwrap(wrapped: IRule): software.amazon.awscdk.services.events.IRule = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.IRule
  }
}
