@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.chatbot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.logs.LogRetentionRetryOptionsDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.chatbot.LoggingLevel
import software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps
import software.amazon.awscdk.services.iam.IManagedPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class SlackChannelConfigurationPropsDsl {
  private val cdkBuilder: SlackChannelConfigurationProps.Builder =
      SlackChannelConfigurationProps.builder()

  private val _guardrailPolicies: MutableList<IManagedPolicy> = mutableListOf()

  private val _notificationTopics: MutableList<ITopic> = mutableListOf()

  public fun guardrailPolicies(vararg guardrailPolicies: IManagedPolicy) {
    _guardrailPolicies.addAll(listOf(*guardrailPolicies))
  }

  public fun guardrailPolicies(guardrailPolicies: Collection<IManagedPolicy>) {
    _guardrailPolicies.addAll(guardrailPolicies)
  }

  public fun logRetention(logRetention: RetentionDays) {
    cdkBuilder.logRetention(logRetention)
  }

  public fun logRetentionRetryOptions(block: LogRetentionRetryOptionsDsl.() -> Unit = {}) {
    val builder = LogRetentionRetryOptionsDsl()
    builder.apply(block)
    cdkBuilder.logRetentionRetryOptions(builder.build())
  }

  public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
    cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions)
  }

  public fun logRetentionRole(logRetentionRole: IRole) {
    cdkBuilder.logRetentionRole(logRetentionRole)
  }

  public fun loggingLevel(loggingLevel: LoggingLevel) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  public fun notificationTopics(vararg notificationTopics: ITopic) {
    _notificationTopics.addAll(listOf(*notificationTopics))
  }

  public fun notificationTopics(notificationTopics: Collection<ITopic>) {
    _notificationTopics.addAll(notificationTopics)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun slackChannelConfigurationName(slackChannelConfigurationName: String) {
    cdkBuilder.slackChannelConfigurationName(slackChannelConfigurationName)
  }

  public fun slackChannelId(slackChannelId: String) {
    cdkBuilder.slackChannelId(slackChannelId)
  }

  public fun slackWorkspaceId(slackWorkspaceId: String) {
    cdkBuilder.slackWorkspaceId(slackWorkspaceId)
  }

  public fun build(): SlackChannelConfigurationProps {
    if(_guardrailPolicies.isNotEmpty()) cdkBuilder.guardrailPolicies(_guardrailPolicies)
    if(_notificationTopics.isNotEmpty()) cdkBuilder.notificationTopics(_notificationTopics)
    return cdkBuilder.build()
  }
}
