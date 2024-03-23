@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleSet,
  ) : CdkObject(cdkObject), IReceiptRuleSet {
    /**
     * Adds a new receipt rule in this rule set.
     *
     * The new rule is added after
     * the last added rule unless `after` is specified.
     *
     * @param id 
     * @param options
     */
    override fun addRule(id: String): ReceiptRule = unwrap(this).addRule(id).let(ReceiptRule::wrap)

    /**
     * Adds a new receipt rule in this rule set.
     *
     * The new rule is added after
     * the last added rule unless `after` is specified.
     *
     * @param id 
     * @param options
     */
    override fun addRule(id: String, options: ReceiptRuleOptions): ReceiptRule =
        unwrap(this).addRule(id, options.let(ReceiptRuleOptions::unwrap)).let(ReceiptRule::wrap)

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
    override fun addRule(id: String, options: ReceiptRuleOptions.Builder.() -> Unit): ReceiptRule =
        addRule(id, ReceiptRuleOptions(options))

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
     * The receipt rule set name.
     */
    override fun receiptRuleSetName(): String = unwrap(this).getReceiptRuleSetName()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleSet):
        IReceiptRuleSet = CdkObjectWrappers.wrap(cdkObject) as? IReceiptRuleSet ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReceiptRuleSet):
        software.amazon.awscdk.services.ses.IReceiptRuleSet = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IReceiptRuleSet
  }
}
