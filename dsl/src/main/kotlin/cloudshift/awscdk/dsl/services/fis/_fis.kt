@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fis

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import software.amazon.awscdk.services.fis.CfnExperimentTemplateProps
import software.constructs.Construct

public object fis {
  /**
   * Specifies an experiment template.
   *
   * An experiment template includes the following components:
   *
   * * *Targets* : A target can be a specific resource in your AWS environment, or one or more
   * resources that match criteria that you specify, for example, resources that have specific tags.
   * * *Actions* : The actions to carry out on the target. You can specify multiple actions, the
   * duration of each action, and when to start each action during an experiment.
   * * *Stop conditions* : If a stop condition is triggered while an experiment is running, the
   * experiment is automatically stopped. You can define a stop condition as a CloudWatch alarm.
   *
   * For more information, see [Experiment
   * templates](https://docs.aws.amazon.com/fis/latest/userguide/experiment-templates.html) in the *AWS
   * Fault Injection Simulator User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fis.*;
   * Object cloudWatchLogsConfiguration;
   * Object s3Configuration;
   * CfnExperimentTemplate cfnExperimentTemplate = CfnExperimentTemplate.Builder.create(this,
   * "MyCfnExperimentTemplate")
   * .description("description")
   * .roleArn("roleArn")
   * .stopConditions(List.of(ExperimentTemplateStopConditionProperty.builder()
   * .source("source")
   * // the properties below are optional
   * .value("value")
   * .build()))
   * .targets(Map.of(
   * "targetsKey", ExperimentTemplateTargetProperty.builder()
   * .resourceType("resourceType")
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .filters(List.of(ExperimentTemplateTargetFilterProperty.builder()
   * .path("path")
   * .values(List.of("values"))
   * .build()))
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .resourceArns(List.of("resourceArns"))
   * .resourceTags(Map.of(
   * "resourceTagsKey", "resourceTags"))
   * .build()))
   * // the properties below are optional
   * .actions(Map.of(
   * "actionsKey", ExperimentTemplateActionProperty.builder()
   * .actionId("actionId")
   * // the properties below are optional
   * .description("description")
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .startAfter(List.of("startAfter"))
   * .targets(Map.of(
   * "targetsKey", "targets"))
   * .build()))
   * .logConfiguration(ExperimentTemplateLogConfigurationProperty.builder()
   * .logSchemaVersion(123)
   * // the properties below are optional
   * .cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
   * .s3Configuration(s3Configuration)
   * .build())
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html)
   */
  public inline fun cfnExperimentTemplate(
    scope: Construct,
    id: String,
    block: CfnExperimentTemplateDsl.() -> Unit = {},
  ): CfnExperimentTemplate {
    val builder = CfnExperimentTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the configuration for experiment logging to CloudWatch Logs .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fis.*;
   * CloudWatchLogsConfigurationProperty cloudWatchLogsConfigurationProperty =
   * CloudWatchLogsConfigurationProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-cloudwatchlogsconfiguration.html)
   */
  public inline
      fun cfnExperimentTemplateCloudWatchLogsConfigurationProperty(block: CfnExperimentTemplateCloudWatchLogsConfigurationPropertyDsl.() -> Unit
      = {}): CfnExperimentTemplate.CloudWatchLogsConfigurationProperty {
    val builder = CfnExperimentTemplateCloudWatchLogsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies an action for an experiment template.
   *
   * For more information, see
   * [Actions](https://docs.aws.amazon.com/fis/latest/userguide/actions.html) in the *AWS Fault
   * Injection Simulator User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fis.*;
   * ExperimentTemplateActionProperty experimentTemplateActionProperty =
   * ExperimentTemplateActionProperty.builder()
   * .actionId("actionId")
   * // the properties below are optional
   * .description("description")
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .startAfter(List.of("startAfter"))
   * .targets(Map.of(
   * "targetsKey", "targets"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateaction.html)
   */
  public inline
      fun cfnExperimentTemplateExperimentTemplateActionProperty(block: CfnExperimentTemplateExperimentTemplateActionPropertyDsl.() -> Unit
      = {}): CfnExperimentTemplate.ExperimentTemplateActionProperty {
    val builder = CfnExperimentTemplateExperimentTemplateActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the configuration for experiment logging.
   *
   * For more information, see [Experiment
   * logging](https://docs.aws.amazon.com/fis/latest/userguide/monitoring-logging.html) in the *AWS
   * Fault Injection Simulator User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fis.*;
   * Object cloudWatchLogsConfiguration;
   * Object s3Configuration;
   * ExperimentTemplateLogConfigurationProperty experimentTemplateLogConfigurationProperty =
   * ExperimentTemplateLogConfigurationProperty.builder()
   * .logSchemaVersion(123)
   * // the properties below are optional
   * .cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
   * .s3Configuration(s3Configuration)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatelogconfiguration.html)
   */
  public inline
      fun cfnExperimentTemplateExperimentTemplateLogConfigurationProperty(block: CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl.() -> Unit
      = {}): CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty {
    val builder = CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a stop condition for an experiment template.
   *
   * For more information, see [Stop
   * conditions](https://docs.aws.amazon.com/fis/latest/userguide/stop-conditions.html) in the *AWS
   * Fault Injection Simulator User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fis.*;
   * ExperimentTemplateStopConditionProperty experimentTemplateStopConditionProperty =
   * ExperimentTemplateStopConditionProperty.builder()
   * .source("source")
   * // the properties below are optional
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatestopcondition.html)
   */
  public inline
      fun cfnExperimentTemplateExperimentTemplateStopConditionProperty(block: CfnExperimentTemplateExperimentTemplateStopConditionPropertyDsl.() -> Unit
      = {}): CfnExperimentTemplate.ExperimentTemplateStopConditionProperty {
    val builder = CfnExperimentTemplateExperimentTemplateStopConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a filter used for the target resource input in an experiment template.
   *
   * For more information, see [Resource
   * filters](https://docs.aws.amazon.com/fis/latest/userguide/targets.html#target-filters) in the *AWS
   * Fault Injection Simulator User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fis.*;
   * ExperimentTemplateTargetFilterProperty experimentTemplateTargetFilterProperty =
   * ExperimentTemplateTargetFilterProperty.builder()
   * .path("path")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetargetfilter.html)
   */
  public inline
      fun cfnExperimentTemplateExperimentTemplateTargetFilterProperty(block: CfnExperimentTemplateExperimentTemplateTargetFilterPropertyDsl.() -> Unit
      = {}): CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty {
    val builder = CfnExperimentTemplateExperimentTemplateTargetFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a target for an experiment.
   *
   * You must specify at least one Amazon Resource Name (ARN) or at least one resource tag. You
   * cannot specify both ARNs and tags.
   *
   * For more information, see
   * [Targets](https://docs.aws.amazon.com/fis/latest/userguide/targets.html) in the *AWS Fault
   * Injection Simulator User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fis.*;
   * ExperimentTemplateTargetProperty experimentTemplateTargetProperty =
   * ExperimentTemplateTargetProperty.builder()
   * .resourceType("resourceType")
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .filters(List.of(ExperimentTemplateTargetFilterProperty.builder()
   * .path("path")
   * .values(List.of("values"))
   * .build()))
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .resourceArns(List.of("resourceArns"))
   * .resourceTags(Map.of(
   * "resourceTagsKey", "resourceTags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatetarget.html)
   */
  public inline
      fun cfnExperimentTemplateExperimentTemplateTargetProperty(block: CfnExperimentTemplateExperimentTemplateTargetPropertyDsl.() -> Unit
      = {}): CfnExperimentTemplate.ExperimentTemplateTargetProperty {
    val builder = CfnExperimentTemplateExperimentTemplateTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnExperimentTemplate`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fis.*;
   * Object cloudWatchLogsConfiguration;
   * Object s3Configuration;
   * CfnExperimentTemplateProps cfnExperimentTemplateProps = CfnExperimentTemplateProps.builder()
   * .description("description")
   * .roleArn("roleArn")
   * .stopConditions(List.of(ExperimentTemplateStopConditionProperty.builder()
   * .source("source")
   * // the properties below are optional
   * .value("value")
   * .build()))
   * .targets(Map.of(
   * "targetsKey", ExperimentTemplateTargetProperty.builder()
   * .resourceType("resourceType")
   * .selectionMode("selectionMode")
   * // the properties below are optional
   * .filters(List.of(ExperimentTemplateTargetFilterProperty.builder()
   * .path("path")
   * .values(List.of("values"))
   * .build()))
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .resourceArns(List.of("resourceArns"))
   * .resourceTags(Map.of(
   * "resourceTagsKey", "resourceTags"))
   * .build()))
   * // the properties below are optional
   * .actions(Map.of(
   * "actionsKey", ExperimentTemplateActionProperty.builder()
   * .actionId("actionId")
   * // the properties below are optional
   * .description("description")
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .startAfter(List.of("startAfter"))
   * .targets(Map.of(
   * "targetsKey", "targets"))
   * .build()))
   * .logConfiguration(ExperimentTemplateLogConfigurationProperty.builder()
   * .logSchemaVersion(123)
   * // the properties below are optional
   * .cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
   * .s3Configuration(s3Configuration)
   * .build())
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html)
   */
  public inline fun cfnExperimentTemplateProps(block: CfnExperimentTemplatePropsDsl.() -> Unit =
      {}): CfnExperimentTemplateProps {
    val builder = CfnExperimentTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the configuration for experiment logging to Amazon S3 .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fis.*;
   * S3ConfigurationProperty s3ConfigurationProperty = S3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-s3configuration.html)
   */
  public inline
      fun cfnExperimentTemplateS3ConfigurationProperty(block: CfnExperimentTemplateS3ConfigurationPropertyDsl.() -> Unit
      = {}): CfnExperimentTemplate.S3ConfigurationProperty {
    val builder = CfnExperimentTemplateS3ConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
