@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.chatbot

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration
import software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps
import software.amazon.awscdk.services.chatbot.SlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps
import software.constructs.Construct

public object chatbot {
  public inline fun cfnMicrosoftTeamsChannelConfiguration(
    scope: Construct,
    id: String,
    block: CfnMicrosoftTeamsChannelConfigurationDsl.() -> Unit = {},
  ): CfnMicrosoftTeamsChannelConfiguration {
    val builder = CfnMicrosoftTeamsChannelConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMicrosoftTeamsChannelConfigurationProps(block: CfnMicrosoftTeamsChannelConfigurationPropsDsl.() -> Unit
      = {}): CfnMicrosoftTeamsChannelConfigurationProps {
    val builder = CfnMicrosoftTeamsChannelConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSlackChannelConfiguration(
    scope: Construct,
    id: String,
    block: CfnSlackChannelConfigurationDsl.() -> Unit = {},
  ): CfnSlackChannelConfiguration {
    val builder = CfnSlackChannelConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSlackChannelConfigurationProps(block: CfnSlackChannelConfigurationPropsDsl.() -> Unit =
      {}): CfnSlackChannelConfigurationProps {
    val builder = CfnSlackChannelConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun slackChannelConfiguration(
    scope: Construct,
    id: String,
    block: SlackChannelConfigurationDsl.() -> Unit = {},
  ): SlackChannelConfiguration {
    val builder = SlackChannelConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun slackChannelConfigurationProps(block: SlackChannelConfigurationPropsDsl.() -> Unit = {}):
      SlackChannelConfigurationProps {
    val builder = SlackChannelConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
