@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
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

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration):
        ISlackChannelConfiguration = CdkObjectWrappers.wrap(cdkObject) as ISlackChannelConfiguration

    internal fun unwrap(wrapped: ISlackChannelConfiguration):
        software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration
  }
}
