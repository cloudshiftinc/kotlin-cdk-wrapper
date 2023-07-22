@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps
import software.amazon.awscdk.services.codestarnotifications.NotificationRule
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
import software.constructs.Construct

public object codestarnotifications {
  /**
   * Creates a notification rule for a resource.
   *
   * The rule specifies the events you want notifications about and the targets (such as AWS Chatbot
   * topics or AWS Chatbot clients configured for Slack) where you want to receive them.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codestarnotifications.*;
   * CfnNotificationRule cfnNotificationRule = CfnNotificationRule.Builder.create(this,
   * "MyCfnNotificationRule")
   * .detailType("detailType")
   * .eventTypeIds(List.of("eventTypeIds"))
   * .name("name")
   * .resource("resource")
   * .targets(List.of(TargetProperty.builder()
   * .targetAddress("targetAddress")
   * .targetType("targetType")
   * .build()))
   * // the properties below are optional
   * .createdBy("createdBy")
   * .eventTypeId("eventTypeId")
   * .status("status")
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .targetAddress("targetAddress")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html)
   */
  public inline fun cfnNotificationRule(
    scope: Construct,
    id: String,
    block: CfnNotificationRuleDsl.() -> Unit = {},
  ): CfnNotificationRule {
    val builder = CfnNotificationRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnNotificationRule`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codestarnotifications.*;
   * CfnNotificationRuleProps cfnNotificationRuleProps = CfnNotificationRuleProps.builder()
   * .detailType("detailType")
   * .eventTypeIds(List.of("eventTypeIds"))
   * .name("name")
   * .resource("resource")
   * .targets(List.of(TargetProperty.builder()
   * .targetAddress("targetAddress")
   * .targetType("targetType")
   * .build()))
   * // the properties below are optional
   * .createdBy("createdBy")
   * .eventTypeId("eventTypeId")
   * .status("status")
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .targetAddress("targetAddress")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html)
   */
  public inline fun cfnNotificationRuleProps(block: CfnNotificationRulePropsDsl.() -> Unit = {}):
      CfnNotificationRuleProps {
    val builder = CfnNotificationRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the AWS Chatbot topics or AWS Chatbot clients associated with a notification
   * rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codestarnotifications.*;
   * TargetProperty targetProperty = TargetProperty.builder()
   * .targetAddress("targetAddress")
   * .targetType("targetType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html)
   */
  public inline
      fun cfnNotificationRuleTargetProperty(block: CfnNotificationRuleTargetPropertyDsl.() -> Unit =
      {}): CfnNotificationRule.TargetProperty {
    val builder = CfnNotificationRuleTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A new notification rule.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.codestarnotifications.*;
   * import software.amazon.awscdk.services.codebuild.*;
   * import software.amazon.awscdk.services.sns.*;
   * import software.amazon.awscdk.services.chatbot.*;
   * PipelineProject project = new PipelineProject(this, "MyProject");
   * Topic topic = new Topic(this, "MyTopic1");
   * SlackChannelConfiguration slack = SlackChannelConfiguration.Builder.create(this,
   * "MySlackChannel")
   * .slackChannelConfigurationName("YOUR_CHANNEL_NAME")
   * .slackWorkspaceId("YOUR_SLACK_WORKSPACE_ID")
   * .slackChannelId("YOUR_SLACK_CHANNEL_ID")
   * .build();
   * NotificationRule rule = NotificationRule.Builder.create(this, "NotificationRule")
   * .source(project)
   * .events(List.of("codebuild-project-build-state-succeeded",
   * "codebuild-project-build-state-failed"))
   * .targets(List.of(topic))
   * .build();
   * rule.addTarget(slack);
   * ```
   */
  public inline fun notificationRule(
    scope: Construct,
    id: String,
    block: NotificationRuleDsl.() -> Unit = {},
  ): NotificationRule {
    val builder = NotificationRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Standard set of options for `notifyOnXxx` codestar notification handler on construct.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codestarnotifications.*;
   * NotificationRuleOptions notificationRuleOptions = NotificationRuleOptions.builder()
   * .detailType(DetailType.BASIC)
   * .enabled(false)
   * .notificationRuleName("notificationRuleName")
   * .build();
   * ```
   */
  public inline fun notificationRuleOptions(block: NotificationRuleOptionsDsl.() -> Unit = {}):
      NotificationRuleOptions {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a new notification rule.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.codestarnotifications.*;
   * import software.amazon.awscdk.services.codebuild.*;
   * import software.amazon.awscdk.services.sns.*;
   * import software.amazon.awscdk.services.chatbot.*;
   * PipelineProject project = new PipelineProject(this, "MyProject");
   * Topic topic = new Topic(this, "MyTopic1");
   * SlackChannelConfiguration slack = SlackChannelConfiguration.Builder.create(this,
   * "MySlackChannel")
   * .slackChannelConfigurationName("YOUR_CHANNEL_NAME")
   * .slackWorkspaceId("YOUR_SLACK_WORKSPACE_ID")
   * .slackChannelId("YOUR_SLACK_CHANNEL_ID")
   * .build();
   * NotificationRule rule = NotificationRule.Builder.create(this, "NotificationRule")
   * .source(project)
   * .events(List.of("codebuild-project-build-state-succeeded",
   * "codebuild-project-build-state-failed"))
   * .targets(List.of(topic))
   * .build();
   * rule.addTarget(slack);
   * ```
   */
  public inline fun notificationRuleProps(block: NotificationRulePropsDsl.() -> Unit = {}):
      NotificationRuleProps {
    val builder = NotificationRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the Codebuild or CodePipeline associated with a notification source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codestarnotifications.*;
   * NotificationRuleSourceConfig notificationRuleSourceConfig =
   * NotificationRuleSourceConfig.builder()
   * .sourceArn("sourceArn")
   * .build();
   * ```
   */
  public inline fun notificationRuleSourceConfig(block: NotificationRuleSourceConfigDsl.() -> Unit =
      {}): NotificationRuleSourceConfig {
    val builder = NotificationRuleSourceConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the SNS topic or AWS Chatbot client associated with a notification target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codestarnotifications.*;
   * NotificationRuleTargetConfig notificationRuleTargetConfig =
   * NotificationRuleTargetConfig.builder()
   * .targetAddress("targetAddress")
   * .targetType("targetType")
   * .build();
   * ```
   */
  public inline fun notificationRuleTargetConfig(block: NotificationRuleTargetConfigDsl.() -> Unit =
      {}): NotificationRuleTargetConfig {
    val builder = NotificationRuleTargetConfigDsl()
    builder.apply(block)
    return builder.build()
  }
}
