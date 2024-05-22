@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a Slack channel configuration.
 */
public interface ISlackChannelConfiguration : IResource, IGrantable, INotificationRuleTarget {
  /**
   * Adds a statement to the IAM role.
   *
   * @param statement 
   */
  public fun addToRolePolicy(statement: PolicyStatement)

  /**
   * Adds a statement to the IAM role.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit)

  /**
   * Return the given named metric for this SlackChannelConfiguration.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this SlackChannelConfiguration.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this SlackChannelConfiguration.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The permission role of Slack channel configuration.
   *
   * Default: - A role will be created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The ARN of the Slack channel configuration In the form of
   * arn:aws:chatbot:{region}:{account}:chat-configuration/slack-channel/{slackChannelName}.
   */
  public fun slackChannelConfigurationArn(): String

  /**
   * The name of Slack channel configuration.
   */
  public fun slackChannelConfigurationName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration,
  ) : CdkObject(cdkObject), ISlackChannelConfiguration {
    /**
     * Adds a statement to the IAM role.
     *
     * @param statement 
     */
    override fun addToRolePolicy(statement: PolicyStatement) {
      unwrap(this).addToRolePolicy(statement.let(PolicyStatement.Companion::unwrap))
    }

    /**
     * Adds a statement to the IAM role.
     *
     * @param statement 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
    override fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
        addToRolePolicy(PolicyStatement(statement))

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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * Returns a target configuration for notification rule.
     *
     * @param scope 
     */
    override fun bindAsNotificationRuleTarget(scope: Construct): NotificationRuleTargetConfig =
        unwrap(this).bindAsNotificationRuleTarget(scope.let(Construct.Companion::unwrap)).let(NotificationRuleTargetConfig::wrap)

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

    /**
     * The principal to grant permissions to.
     */
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    /**
     * Return the given named metric for this SlackChannelConfiguration.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this SlackChannelConfiguration.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this SlackChannelConfiguration.
     *
     * @param metricName 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The permission role of Slack channel configuration.
     *
     * Default: - A role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The ARN of the Slack channel configuration In the form of
     * arn:aws:chatbot:{region}:{account}:chat-configuration/slack-channel/{slackChannelName}.
     */
    override fun slackChannelConfigurationArn(): String =
        unwrap(this).getSlackChannelConfigurationArn()

    /**
     * The name of Slack channel configuration.
     */
    override fun slackChannelConfigurationName(): String =
        unwrap(this).getSlackChannelConfigurationName()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration):
        ISlackChannelConfiguration = CdkObjectWrappers.wrap(cdkObject) as?
        ISlackChannelConfiguration ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISlackChannelConfiguration):
        software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration
  }
}
