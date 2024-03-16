@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface representing an AWS Config rule.
 */
public interface IRule : IResource {
  /**
   * The name of the rule.
   */
  public fun configRuleName(): String

  /**
   * Defines a EventBridge event rule which triggers for rule compliance events.
   *
   * @param id 
   * @param options
   */
  public fun onComplianceChange(id: String): Rule

  /**
   * Defines a EventBridge event rule which triggers for rule compliance events.
   *
   * @param id 
   * @param options
   */
  public fun onComplianceChange(id: String, options: OnEventOptions): Rule

  /**
   * Defines a EventBridge event rule which triggers for rule compliance events.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b98c84ce198054f102b00e655b85da2a1ae47a5638faf86d850c16a3235acfa2")
  public fun onComplianceChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines an EventBridge event rule which triggers for rule events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public fun onEvent(id: String): Rule

  /**
   * Defines an EventBridge event rule which triggers for rule events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public fun onEvent(id: String, options: OnEventOptions): Rule

  /**
   * Defines an EventBridge event rule which triggers for rule events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a EventBridge event rule which triggers for rule re-evaluation status events.
   *
   * @param id 
   * @param options
   */
  public fun onReEvaluationStatus(id: String): Rule

  /**
   * Defines a EventBridge event rule which triggers for rule re-evaluation status events.
   *
   * @param id 
   * @param options
   */
  public fun onReEvaluationStatus(id: String, options: OnEventOptions): Rule

  /**
   * Defines a EventBridge event rule which triggers for rule re-evaluation status events.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5ea19b211eab8ba672d4a05459c322cc41db04f03b5d429124296804b9cc8c7")
  public fun onReEvaluationStatus(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.IRule): IRule =
        CdkObjectWrappers.wrap(cdkObject) as IRule

    internal fun unwrap(wrapped: IRule): software.amazon.awscdk.services.config.IRule = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.config.IRule
  }
}
