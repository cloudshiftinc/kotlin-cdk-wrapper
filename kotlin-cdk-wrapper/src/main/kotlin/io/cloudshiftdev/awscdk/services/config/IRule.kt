@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.constructs.Node
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.IRule,
  ) : CdkObject(cdkObject), IRule {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The name of the rule.
     */
    override fun configRuleName(): String = unwrap(this).getConfigRuleName()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Defines a EventBridge event rule which triggers for rule compliance events.
     *
     * @param id 
     * @param options
     */
    override fun onComplianceChange(id: String): Rule =
        unwrap(this).onComplianceChange(id).let(Rule::wrap)

    /**
     * Defines a EventBridge event rule which triggers for rule compliance events.
     *
     * @param id 
     * @param options
     */
    override fun onComplianceChange(id: String, options: OnEventOptions): Rule =
        unwrap(this).onComplianceChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines a EventBridge event rule which triggers for rule compliance events.
     *
     * @param id 
     * @param options
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b98c84ce198054f102b00e655b85da2a1ae47a5638faf86d850c16a3235acfa2")
    override fun onComplianceChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
        onComplianceChange(id, OnEventOptions(options))

    /**
     * Defines an EventBridge event rule which triggers for rule events.
     *
     * Use
     * `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id 
     * @param options
     */
    override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

    /**
     * Defines an EventBridge event rule which triggers for rule events.
     *
     * Use
     * `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id 
     * @param options
     */
    override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
        options.let(OnEventOptions::unwrap)).let(Rule::wrap)

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
    override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule = onEvent(id,
        OnEventOptions(options))

    /**
     * Defines a EventBridge event rule which triggers for rule re-evaluation status events.
     *
     * @param id 
     * @param options
     */
    override fun onReEvaluationStatus(id: String): Rule =
        unwrap(this).onReEvaluationStatus(id).let(Rule::wrap)

    /**
     * Defines a EventBridge event rule which triggers for rule re-evaluation status events.
     *
     * @param id 
     * @param options
     */
    override fun onReEvaluationStatus(id: String, options: OnEventOptions): Rule =
        unwrap(this).onReEvaluationStatus(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines a EventBridge event rule which triggers for rule re-evaluation status events.
     *
     * @param id 
     * @param options
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5ea19b211eab8ba672d4a05459c322cc41db04f03b5d429124296804b9cc8c7")
    override fun onReEvaluationStatus(id: String, options: OnEventOptions.Builder.() -> Unit): Rule
        = onReEvaluationStatus(id, OnEventOptions(options))

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.IRule): IRule =
        CdkObjectWrappers.wrap(cdkObject) as? IRule ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRule): software.amazon.awscdk.services.config.IRule = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.config.IRule
  }
}
