@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
import software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions
import software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps
import software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig
import software.amazon.awscdk.services.codedeploy.CfnApplication
import software.amazon.awscdk.services.codedeploy.CfnApplicationProps
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.EcsApplication
import software.amazon.awscdk.services.codedeploy.EcsApplicationProps
import software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.LambdaApplication
import software.amazon.awscdk.services.codedeploy.LambdaApplicationProps
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig
import software.amazon.awscdk.services.codedeploy.ServerApplication
import software.amazon.awscdk.services.codedeploy.ServerApplicationProps
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting
import software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps
import software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting
import software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps
import software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig
import software.constructs.Construct

public object codedeploy {
  /**
   * The configuration for automatically rolling back deployments in a given Deployment Group.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.autoscaling.*;
   * import software.amazon.awscdk.services.cloudwatch.*;
   * ServerApplication application;
   * AutoScalingGroup asg;
   * Alarm alarm;
   * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
   * "CodeDeployDeploymentGroup")
   * .application(application)
   * .deploymentGroupName("MyDeploymentGroup")
   * .autoScalingGroups(List.of(asg))
   * // adds User Data that installs the CodeDeploy agent on your auto-scaling groups hosts
   * // default: true
   * .installAgent(true)
   * // adds EC2 instances matching tags
   * .ec2InstanceTags(new InstanceTagSet(Map.of(
   * // any instance with tags satisfying
   * // key1=v1 or key1=v2 or key2 (any value) or value v3 (any key)
   * // will match this group
   * "key1", List.of("v1", "v2"),
   * "key2", List.of(),
   * "", List.of("v3"))))
   * // adds on-premise instances matching tags
   * .onPremiseInstanceTags(new InstanceTagSet(Map.of(
   * "key1", List.of("v1", "v2")), Map.of(
   * "key2", List.of("v3"))))
   * // CloudWatch alarms
   * .alarms(List.of(alarm))
   * // whether to ignore failure to fetch the status of alarms from CloudWatch
   * // default: false
   * .ignorePollAlarmsFailure(false)
   * // auto-rollback configuration
   * .autoRollback(AutoRollbackConfig.builder()
   * .failedDeployment(true) // default: true
   * .stoppedDeployment(true) // default: false
   * .deploymentInAlarm(true)
   * .build())
   * .build();
   * ```
   */
  public inline fun autoRollbackConfig(block: AutoRollbackConfigDsl.() -> Unit = {}):
      AutoRollbackConfig {
    val builder = AutoRollbackConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties of `BaseDeploymentConfig`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * BaseDeploymentConfigOptions baseDeploymentConfigOptions = BaseDeploymentConfigOptions.builder()
   * .deploymentConfigName("deploymentConfigName")
   * .build();
   * ```
   */
  public inline fun baseDeploymentConfigOptions(block: BaseDeploymentConfigOptionsDsl.() -> Unit =
      {}): BaseDeploymentConfigOptions {
    val builder = BaseDeploymentConfigOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Complete base deployment config properties that are required to be supplied by the
   * implementation of the BaseDeploymentConfig class.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * MinimumHealthyHosts minimumHealthyHosts;
   * TrafficRouting trafficRouting;
   * BaseDeploymentConfigProps baseDeploymentConfigProps = BaseDeploymentConfigProps.builder()
   * .computePlatform(ComputePlatform.SERVER)
   * .deploymentConfigName("deploymentConfigName")
   * .minimumHealthyHosts(minimumHealthyHosts)
   * .trafficRouting(trafficRouting)
   * .build();
   * ```
   */
  public inline fun baseDeploymentConfigProps(block: BaseDeploymentConfigPropsDsl.() -> Unit = {}):
      BaseDeploymentConfigProps {
    val builder = BaseDeploymentConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Common properties of traffic shifting routing configurations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.codedeploy.*;
   * BaseTrafficShiftingConfigProps baseTrafficShiftingConfigProps =
   * BaseTrafficShiftingConfigProps.builder()
   * .interval(Duration.minutes(30))
   * .percentage(123)
   * .build();
   * ```
   */
  public inline
      fun baseTrafficShiftingConfigProps(block: BaseTrafficShiftingConfigPropsDsl.() -> Unit = {}):
      BaseTrafficShiftingConfigProps {
    val builder = BaseTrafficShiftingConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the configuration specific to canary traffic shifting.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * CanaryTrafficRoutingConfig canaryTrafficRoutingConfig = CanaryTrafficRoutingConfig.builder()
   * .canaryInterval(123)
   * .canaryPercentage(123)
   * .build();
   * ```
   */
  public inline fun canaryTrafficRoutingConfig(block: CanaryTrafficRoutingConfigDsl.() -> Unit =
      {}): CanaryTrafficRoutingConfig {
    val builder = CanaryTrafficRoutingConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::CodeDeploy::Application` resource creates an AWS CodeDeploy application.
   *
   * In CodeDeploy , an application is a name that functions as a container to ensure that the
   * correct combination of revision, deployment configuration, and deployment group are referenced
   * during a deployment. You can use the `AWS::CodeDeploy::DeploymentGroup` resource to associate the
   * application with a CodeDeploy deployment group. For more information, see [CodeDeploy
   * Deployments](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-steps.html) in the
   * *AWS CodeDeploy User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
   * .applicationName("applicationName")
   * .computePlatform("computePlatform")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html)
   */
  public inline fun cfnApplication(
    scope: Construct,
    id: String,
    block: CfnApplicationDsl.() -> Unit = {},
  ): CfnApplication {
    val builder = CfnApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnApplication`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
   * .applicationName("applicationName")
   * .computePlatform("computePlatform")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html)
   */
  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::CodeDeploy::DeploymentConfig` resource creates a set of deployment rules, deployment
   * success conditions, and deployment failure conditions that AWS CodeDeploy uses during a
   * deployment.
   *
   * The deployment configuration specifies, through the use of a `MinimumHealthyHosts` value, the
   * number or percentage of instances that must remain available at any time during a deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * CfnDeploymentConfig cfnDeploymentConfig = CfnDeploymentConfig.Builder.create(this,
   * "MyCfnDeploymentConfig")
   * .computePlatform("computePlatform")
   * .deploymentConfigName("deploymentConfigName")
   * .minimumHealthyHosts(MinimumHealthyHostsProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .trafficRoutingConfig(TrafficRoutingConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .timeBasedCanary(TimeBasedCanaryProperty.builder()
   * .canaryInterval(123)
   * .canaryPercentage(123)
   * .build())
   * .timeBasedLinear(TimeBasedLinearProperty.builder()
   * .linearInterval(123)
   * .linearPercentage(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html)
   */
  public inline fun cfnDeploymentConfig(
    scope: Construct,
    id: String,
    block: CfnDeploymentConfigDsl.() -> Unit = {},
  ): CfnDeploymentConfig {
    val builder = CfnDeploymentConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * `MinimumHealthyHosts` is a property of the
   * [DeploymentConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html)
   * resource that defines how many instances must remain healthy during an AWS CodeDeploy deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * MinimumHealthyHostsProperty minimumHealthyHostsProperty = MinimumHealthyHostsProperty.builder()
   * .type("type")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html)
   */
  public inline
      fun cfnDeploymentConfigMinimumHealthyHostsProperty(block: CfnDeploymentConfigMinimumHealthyHostsPropertyDsl.() -> Unit
      = {}): CfnDeploymentConfig.MinimumHealthyHostsProperty {
    val builder = CfnDeploymentConfigMinimumHealthyHostsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDeploymentConfig`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * CfnDeploymentConfigProps cfnDeploymentConfigProps = CfnDeploymentConfigProps.builder()
   * .computePlatform("computePlatform")
   * .deploymentConfigName("deploymentConfigName")
   * .minimumHealthyHosts(MinimumHealthyHostsProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .trafficRoutingConfig(TrafficRoutingConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .timeBasedCanary(TimeBasedCanaryProperty.builder()
   * .canaryInterval(123)
   * .canaryPercentage(123)
   * .build())
   * .timeBasedLinear(TimeBasedLinearProperty.builder()
   * .linearInterval(123)
   * .linearPercentage(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html)
   */
  public inline fun cfnDeploymentConfigProps(block: CfnDeploymentConfigPropsDsl.() -> Unit = {}):
      CfnDeploymentConfigProps {
    val builder = CfnDeploymentConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A configuration that shifts traffic from one version of a Lambda function or Amazon ECS task
   * set to another in two increments.
   *
   * The original and target Lambda function versions or ECS task sets are specified in the
   * deployment's AppSpec file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * TimeBasedCanaryProperty timeBasedCanaryProperty = TimeBasedCanaryProperty.builder()
   * .canaryInterval(123)
   * .canaryPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedcanary.html)
   */
  public inline
      fun cfnDeploymentConfigTimeBasedCanaryProperty(block: CfnDeploymentConfigTimeBasedCanaryPropertyDsl.() -> Unit
      = {}): CfnDeploymentConfig.TimeBasedCanaryProperty {
    val builder = CfnDeploymentConfigTimeBasedCanaryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A configuration that shifts traffic from one version of a Lambda function or ECS task set to
   * another in equal increments, with an equal number of minutes between each increment.
   *
   * The original and target Lambda function versions or ECS task sets are specified in the
   * deployment's AppSpec file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * TimeBasedLinearProperty timeBasedLinearProperty = TimeBasedLinearProperty.builder()
   * .linearInterval(123)
   * .linearPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedlinear.html)
   */
  public inline
      fun cfnDeploymentConfigTimeBasedLinearProperty(block: CfnDeploymentConfigTimeBasedLinearPropertyDsl.() -> Unit
      = {}): CfnDeploymentConfig.TimeBasedLinearProperty {
    val builder = CfnDeploymentConfigTimeBasedLinearPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration that specifies how traffic is shifted from one version of a Lambda function
   * to another version during an AWS Lambda deployment, or from one Amazon ECS task set to another
   * during an Amazon ECS deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * TrafficRoutingConfigProperty trafficRoutingConfigProperty =
   * TrafficRoutingConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .timeBasedCanary(TimeBasedCanaryProperty.builder()
   * .canaryInterval(123)
   * .canaryPercentage(123)
   * .build())
   * .timeBasedLinear(TimeBasedLinearProperty.builder()
   * .linearInterval(123)
   * .linearPercentage(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-trafficroutingconfig.html)
   */
  public inline
      fun cfnDeploymentConfigTrafficRoutingConfigProperty(block: CfnDeploymentConfigTrafficRoutingConfigPropertyDsl.() -> Unit
      = {}): CfnDeploymentConfig.TrafficRoutingConfigProperty {
    val builder = CfnDeploymentConfigTrafficRoutingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::CodeDeploy::DeploymentGroup` resource creates an AWS CodeDeploy deployment group that
   * specifies which instances your application revisions are deployed to, along with other deployment
   * options.
   *
   * For more information, see
   * [CreateDeploymentGroup](https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_CreateDeploymentGroup.html)
   * in the *CodeDeploy API Reference* .
   *
   *
   * Amazon ECS blue/green deployments through CodeDeploy do not use the
   * `AWS::CodeDeploy::DeploymentGroup` resource. To perform Amazon ECS blue/green deployments, use the
   * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
   * CodeDeploy using AWS
   * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
   * for more information.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * CfnDeploymentGroup cfnDeploymentGroup = CfnDeploymentGroup.Builder.create(this,
   * "MyCfnDeploymentGroup")
   * .applicationName("applicationName")
   * .serviceRoleArn("serviceRoleArn")
   * // the properties below are optional
   * .alarmConfiguration(AlarmConfigurationProperty.builder()
   * .alarms(List.of(AlarmProperty.builder()
   * .name("name")
   * .build()))
   * .enabled(false)
   * .ignorePollAlarmFailure(false)
   * .build())
   * .autoRollbackConfiguration(AutoRollbackConfigurationProperty.builder()
   * .enabled(false)
   * .events(List.of("events"))
   * .build())
   * .autoScalingGroups(List.of("autoScalingGroups"))
   * .blueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationProperty.builder()
   * .deploymentReadyOption(DeploymentReadyOptionProperty.builder()
   * .actionOnTimeout("actionOnTimeout")
   * .waitTimeInMinutes(123)
   * .build())
   * .greenFleetProvisioningOption(GreenFleetProvisioningOptionProperty.builder()
   * .action("action")
   * .build())
   * .terminateBlueInstancesOnDeploymentSuccess(BlueInstanceTerminationOptionProperty.builder()
   * .action("action")
   * .terminationWaitTimeInMinutes(123)
   * .build())
   * .build())
   * .deployment(DeploymentProperty.builder()
   * .revision(RevisionLocationProperty.builder()
   * .gitHubLocation(GitHubLocationProperty.builder()
   * .commitId("commitId")
   * .repository("repository")
   * .build())
   * .revisionType("revisionType")
   * .s3Location(S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .bundleType("bundleType")
   * .eTag("eTag")
   * .version("version")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .ignoreApplicationStopFailures(false)
   * .build())
   * .deploymentConfigName("deploymentConfigName")
   * .deploymentGroupName("deploymentGroupName")
   * .deploymentStyle(DeploymentStyleProperty.builder()
   * .deploymentOption("deploymentOption")
   * .deploymentType("deploymentType")
   * .build())
   * .ec2TagFilters(List.of(EC2TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .ec2TagSet(EC2TagSetProperty.builder()
   * .ec2TagSetList(List.of(EC2TagSetListObjectProperty.builder()
   * .ec2TagGroup(List.of(EC2TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .build()))
   * .build())
   * .ecsServices(List.of(ECSServiceProperty.builder()
   * .clusterName("clusterName")
   * .serviceName("serviceName")
   * .build()))
   * .loadBalancerInfo(LoadBalancerInfoProperty.builder()
   * .elbInfoList(List.of(ELBInfoProperty.builder()
   * .name("name")
   * .build()))
   * .targetGroupInfoList(List.of(TargetGroupInfoProperty.builder()
   * .name("name")
   * .build()))
   * .targetGroupPairInfoList(List.of(TargetGroupPairInfoProperty.builder()
   * .prodTrafficRoute(TrafficRouteProperty.builder()
   * .listenerArns(List.of("listenerArns"))
   * .build())
   * .targetGroups(List.of(TargetGroupInfoProperty.builder()
   * .name("name")
   * .build()))
   * .testTrafficRoute(TrafficRouteProperty.builder()
   * .listenerArns(List.of("listenerArns"))
   * .build())
   * .build()))
   * .build())
   * .onPremisesInstanceTagFilters(List.of(TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .onPremisesTagSet(OnPremisesTagSetProperty.builder()
   * .onPremisesTagSetList(List.of(OnPremisesTagSetListObjectProperty.builder()
   * .onPremisesTagGroup(List.of(TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .build()))
   * .build())
   * .outdatedInstancesStrategy("outdatedInstancesStrategy")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .triggerConfigurations(List.of(TriggerConfigProperty.builder()
   * .triggerEvents(List.of("triggerEvents"))
   * .triggerName("triggerName")
   * .triggerTargetArn("triggerTargetArn")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
   */
  public inline fun cfnDeploymentGroup(
    scope: Construct,
    id: String,
    block: CfnDeploymentGroupDsl.() -> Unit = {},
  ): CfnDeploymentGroup {
    val builder = CfnDeploymentGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AlarmConfiguration` property type configures CloudWatch alarms for an AWS CodeDeploy
   * deployment group.
   *
   * `AlarmConfiguration` is a property of the
   * [DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * AlarmConfigurationProperty alarmConfigurationProperty = AlarmConfigurationProperty.builder()
   * .alarms(List.of(AlarmProperty.builder()
   * .name("name")
   * .build()))
   * .enabled(false)
   * .ignorePollAlarmFailure(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html)
   */
  public inline
      fun cfnDeploymentGroupAlarmConfigurationProperty(block: CfnDeploymentGroupAlarmConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.AlarmConfigurationProperty {
    val builder = CfnDeploymentGroupAlarmConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `Alarm` property type specifies a CloudWatch alarm to use for an AWS CodeDeploy deployment
   * group.
   *
   * The `Alarm` property of the [CodeDeploy DeploymentGroup
   * AlarmConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html)
   * property contains a list of `Alarm` property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * AlarmProperty alarmProperty = AlarmProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarm.html)
   */
  public inline
      fun cfnDeploymentGroupAlarmProperty(block: CfnDeploymentGroupAlarmPropertyDsl.() -> Unit =
      {}): CfnDeploymentGroup.AlarmProperty {
    val builder = CfnDeploymentGroupAlarmPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AutoRollbackConfiguration` property type configures automatic rollback for an AWS
   * CodeDeploy deployment group when a deployment is not completed successfully.
   *
   * For more information, see [Automatic
   * Rollbacks](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployments-rollback-and-redeploy.html#deployments-rollback-and-redeploy-automatic-rollbacks)
   * in the *AWS CodeDeploy User Guide* .
   *
   * `AutoRollbackConfiguration` is a property of the
   * [DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * AutoRollbackConfigurationProperty autoRollbackConfigurationProperty =
   * AutoRollbackConfigurationProperty.builder()
   * .enabled(false)
   * .events(List.of("events"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html)
   */
  public inline
      fun cfnDeploymentGroupAutoRollbackConfigurationProperty(block: CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.AutoRollbackConfigurationProperty {
    val builder = CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about blue/green deployment options for a deployment group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * BlueGreenDeploymentConfigurationProperty blueGreenDeploymentConfigurationProperty =
   * BlueGreenDeploymentConfigurationProperty.builder()
   * .deploymentReadyOption(DeploymentReadyOptionProperty.builder()
   * .actionOnTimeout("actionOnTimeout")
   * .waitTimeInMinutes(123)
   * .build())
   * .greenFleetProvisioningOption(GreenFleetProvisioningOptionProperty.builder()
   * .action("action")
   * .build())
   * .terminateBlueInstancesOnDeploymentSuccess(BlueInstanceTerminationOptionProperty.builder()
   * .action("action")
   * .terminationWaitTimeInMinutes(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
   */
  public inline
      fun cfnDeploymentGroupBlueGreenDeploymentConfigurationProperty(block: CfnDeploymentGroupBlueGreenDeploymentConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty {
    val builder = CfnDeploymentGroupBlueGreenDeploymentConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about whether instances in the original environment are terminated when a
   * blue/green deployment is successful.
   *
   * `BlueInstanceTerminationOption` does not apply to Lambda deployments.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * BlueInstanceTerminationOptionProperty blueInstanceTerminationOptionProperty =
   * BlueInstanceTerminationOptionProperty.builder()
   * .action("action")
   * .terminationWaitTimeInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-blueinstanceterminationoption.html)
   */
  public inline
      fun cfnDeploymentGroupBlueInstanceTerminationOptionProperty(block: CfnDeploymentGroupBlueInstanceTerminationOptionPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.BlueInstanceTerminationOptionProperty {
    val builder = CfnDeploymentGroupBlueInstanceTerminationOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `Deployment` is a property of the
   * [DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
   * resource that specifies an AWS CodeDeploy application revision to be deployed to instances in the
   * deployment group. If you specify an application revision, your target revision is deployed as soon
   * as the provisioning process is complete.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * DeploymentProperty deploymentProperty = DeploymentProperty.builder()
   * .revision(RevisionLocationProperty.builder()
   * .gitHubLocation(GitHubLocationProperty.builder()
   * .commitId("commitId")
   * .repository("repository")
   * .build())
   * .revisionType("revisionType")
   * .s3Location(S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .bundleType("bundleType")
   * .eTag("eTag")
   * .version("version")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .ignoreApplicationStopFailures(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html)
   */
  public inline
      fun cfnDeploymentGroupDeploymentProperty(block: CfnDeploymentGroupDeploymentPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.DeploymentProperty {
    val builder = CfnDeploymentGroupDeploymentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about how traffic is rerouted to instances in a replacement environment in a
   * blue/green deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * DeploymentReadyOptionProperty deploymentReadyOptionProperty =
   * DeploymentReadyOptionProperty.builder()
   * .actionOnTimeout("actionOnTimeout")
   * .waitTimeInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentreadyoption.html)
   */
  public inline
      fun cfnDeploymentGroupDeploymentReadyOptionProperty(block: CfnDeploymentGroupDeploymentReadyOptionPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.DeploymentReadyOptionProperty {
    val builder = CfnDeploymentGroupDeploymentReadyOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the type of deployment, either in-place or blue/green, you want to run and
   * whether to route deployment traffic behind a load balancer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * DeploymentStyleProperty deploymentStyleProperty = DeploymentStyleProperty.builder()
   * .deploymentOption("deploymentOption")
   * .deploymentType("deploymentType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html)
   */
  public inline
      fun cfnDeploymentGroupDeploymentStyleProperty(block: CfnDeploymentGroupDeploymentStylePropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.DeploymentStyleProperty {
    val builder = CfnDeploymentGroupDeploymentStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about an Amazon EC2 tag filter.
   *
   * For more information about using tags and tag groups to help manage your Amazon EC2 instances
   * and on-premises instances, see [Tagging Instances for Deployment Groups in AWS
   * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-tagging.html) in the
   * *AWS CodeDeploy User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * EC2TagFilterProperty eC2TagFilterProperty = EC2TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilter.html)
   */
  public inline
      fun cfnDeploymentGroupEC2TagFilterProperty(block: CfnDeploymentGroupEC2TagFilterPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.EC2TagFilterProperty {
    val builder = CfnDeploymentGroupEC2TagFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `EC2TagSet` property type specifies information about groups of tags applied to Amazon EC2
   * instances.
   *
   * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
   * Cannot be used in the same template as EC2TagFilters.
   *
   * For more information about using tags and tag groups to help manage your Amazon EC2 instances
   * and on-premises instances, see [Tagging Instances for Deployment Groups in AWS
   * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-tagging.html) in the
   * *AWS CodeDeploy User Guide* .
   *
   * `EC2TagSet` is a property of the
   * [DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
   * resource type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * EC2TagSetListObjectProperty eC2TagSetListObjectProperty = EC2TagSetListObjectProperty.builder()
   * .ec2TagGroup(List.of(EC2TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagsetlistobject.html)
   */
  public inline
      fun cfnDeploymentGroupEC2TagSetListObjectProperty(block: CfnDeploymentGroupEC2TagSetListObjectPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.EC2TagSetListObjectProperty {
    val builder = CfnDeploymentGroupEC2TagSetListObjectPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `EC2TagSet` property type specifies information about groups of tags applied to Amazon EC2
   * instances.
   *
   * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
   * `EC2TagSet` cannot be used in the same template as `EC2TagFilter` .
   *
   * For information about using tags and tag groups to help manage your Amazon EC2 instances and
   * on-premises instances, see [Tagging Instances for Deployment Groups in AWS
   * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-tagging.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * EC2TagSetProperty eC2TagSetProperty = EC2TagSetProperty.builder()
   * .ec2TagSetList(List.of(EC2TagSetListObjectProperty.builder()
   * .ec2TagGroup(List.of(EC2TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html)
   */
  public inline
      fun cfnDeploymentGroupEC2TagSetProperty(block: CfnDeploymentGroupEC2TagSetPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.EC2TagSetProperty {
    val builder = CfnDeploymentGroupEC2TagSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains the service and cluster names used to identify an Amazon ECS deployment's target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * ECSServiceProperty eCSServiceProperty = ECSServiceProperty.builder()
   * .clusterName("clusterName")
   * .serviceName("serviceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ecsservice.html)
   */
  public inline
      fun cfnDeploymentGroupECSServiceProperty(block: CfnDeploymentGroupECSServicePropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.ECSServiceProperty {
    val builder = CfnDeploymentGroupECSServicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `ELBInfo` property type specifies information about the Elastic Load Balancing load
   * balancer used for an CodeDeploy deployment group.
   *
   * If you specify the `ELBInfo` property, the `DeploymentStyle.DeploymentOption` property must be
   * set to `WITH_TRAFFIC_CONTROL` for AWS CodeDeploy to route your traffic using the specified load
   * balancers.
   *
   * `ELBInfo` is a property of the [AWS CodeDeploy DeploymentGroup
   * LoadBalancerInfo](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * ELBInfoProperty eLBInfoProperty = ELBInfoProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html)
   */
  public inline
      fun cfnDeploymentGroupELBInfoProperty(block: CfnDeploymentGroupELBInfoPropertyDsl.() -> Unit =
      {}): CfnDeploymentGroup.ELBInfoProperty {
    val builder = CfnDeploymentGroupELBInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `GitHubLocation` is a property of the [CodeDeploy DeploymentGroup
   * Revision](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html)
   * property that specifies the location of an application revision that is stored in GitHub.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * GitHubLocationProperty gitHubLocationProperty = GitHubLocationProperty.builder()
   * .commitId("commitId")
   * .repository("repository")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-githublocation.html)
   */
  public inline
      fun cfnDeploymentGroupGitHubLocationProperty(block: CfnDeploymentGroupGitHubLocationPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.GitHubLocationProperty {
    val builder = CfnDeploymentGroupGitHubLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the instances that belong to the replacement environment in a blue/green
   * deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * GreenFleetProvisioningOptionProperty greenFleetProvisioningOptionProperty =
   * GreenFleetProvisioningOptionProperty.builder()
   * .action("action")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-greenfleetprovisioningoption.html)
   */
  public inline
      fun cfnDeploymentGroupGreenFleetProvisioningOptionProperty(block: CfnDeploymentGroupGreenFleetProvisioningOptionPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.GreenFleetProvisioningOptionProperty {
    val builder = CfnDeploymentGroupGreenFleetProvisioningOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `LoadBalancerInfo` property type specifies information about the load balancer or target
   * group used for an AWS CodeDeploy deployment group.
   *
   * For more information, see [Integrating CodeDeploy with Elastic Load
   * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
   * in the *AWS CodeDeploy User Guide* .
   *
   * For AWS CloudFormation to use the properties specified in `LoadBalancerInfo` , the
   * `DeploymentStyle.DeploymentOption` property must be set to `WITH_TRAFFIC_CONTROL` . If
   * `DeploymentStyle.DeploymentOption` is not set to `WITH_TRAFFIC_CONTROL` , AWS CloudFormation
   * ignores any settings specified in `LoadBalancerInfo` .
   *
   *
   * AWS CloudFormation supports blue/green deployments on the AWS Lambda compute platform only.
   *
   *
   * `LoadBalancerInfo` is a property of the
   * [DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * LoadBalancerInfoProperty loadBalancerInfoProperty = LoadBalancerInfoProperty.builder()
   * .elbInfoList(List.of(ELBInfoProperty.builder()
   * .name("name")
   * .build()))
   * .targetGroupInfoList(List.of(TargetGroupInfoProperty.builder()
   * .name("name")
   * .build()))
   * .targetGroupPairInfoList(List.of(TargetGroupPairInfoProperty.builder()
   * .prodTrafficRoute(TrafficRouteProperty.builder()
   * .listenerArns(List.of("listenerArns"))
   * .build())
   * .targetGroups(List.of(TargetGroupInfoProperty.builder()
   * .name("name")
   * .build()))
   * .testTrafficRoute(TrafficRouteProperty.builder()
   * .listenerArns(List.of("listenerArns"))
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html)
   */
  public inline
      fun cfnDeploymentGroupLoadBalancerInfoProperty(block: CfnDeploymentGroupLoadBalancerInfoPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.LoadBalancerInfoProperty {
    val builder = CfnDeploymentGroupLoadBalancerInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `OnPremisesTagSetListObject` property type specifies lists of on-premises instance tag
   * groups.
   *
   * In order for an instance to be included in the deployment group, it must be identified by all
   * the tag groups in the list.
   *
   * `OnPremisesTagSetListObject` is a property of the [CodeDeploy DeploymentGroup
   * OnPremisesTagSet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * OnPremisesTagSetListObjectProperty onPremisesTagSetListObjectProperty =
   * OnPremisesTagSetListObjectProperty.builder()
   * .onPremisesTagGroup(List.of(TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html)
   */
  public inline
      fun cfnDeploymentGroupOnPremisesTagSetListObjectProperty(block: CfnDeploymentGroupOnPremisesTagSetListObjectPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.OnPremisesTagSetListObjectProperty {
    val builder = CfnDeploymentGroupOnPremisesTagSetListObjectPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `OnPremisesTagSet` property type specifies a list containing other lists of on-premises
   * instance tag groups.
   *
   * In order for an instance to be included in the deployment group, it must be identified by all
   * the tag groups in the list.
   *
   * For more information about using tags and tag groups to help manage your Amazon EC2 instances
   * and on-premises instances, see [Tagging Instances for Deployment Groups in AWS
   * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-tagging.html) in the
   * *AWS CodeDeploy User Guide* .
   *
   * `OnPremisesTagSet` is a property of the
   * [DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * OnPremisesTagSetProperty onPremisesTagSetProperty = OnPremisesTagSetProperty.builder()
   * .onPremisesTagSetList(List.of(OnPremisesTagSetListObjectProperty.builder()
   * .onPremisesTagGroup(List.of(TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html)
   */
  public inline
      fun cfnDeploymentGroupOnPremisesTagSetProperty(block: CfnDeploymentGroupOnPremisesTagSetPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.OnPremisesTagSetProperty {
    val builder = CfnDeploymentGroupOnPremisesTagSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDeploymentGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * CfnDeploymentGroupProps cfnDeploymentGroupProps = CfnDeploymentGroupProps.builder()
   * .applicationName("applicationName")
   * .serviceRoleArn("serviceRoleArn")
   * // the properties below are optional
   * .alarmConfiguration(AlarmConfigurationProperty.builder()
   * .alarms(List.of(AlarmProperty.builder()
   * .name("name")
   * .build()))
   * .enabled(false)
   * .ignorePollAlarmFailure(false)
   * .build())
   * .autoRollbackConfiguration(AutoRollbackConfigurationProperty.builder()
   * .enabled(false)
   * .events(List.of("events"))
   * .build())
   * .autoScalingGroups(List.of("autoScalingGroups"))
   * .blueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationProperty.builder()
   * .deploymentReadyOption(DeploymentReadyOptionProperty.builder()
   * .actionOnTimeout("actionOnTimeout")
   * .waitTimeInMinutes(123)
   * .build())
   * .greenFleetProvisioningOption(GreenFleetProvisioningOptionProperty.builder()
   * .action("action")
   * .build())
   * .terminateBlueInstancesOnDeploymentSuccess(BlueInstanceTerminationOptionProperty.builder()
   * .action("action")
   * .terminationWaitTimeInMinutes(123)
   * .build())
   * .build())
   * .deployment(DeploymentProperty.builder()
   * .revision(RevisionLocationProperty.builder()
   * .gitHubLocation(GitHubLocationProperty.builder()
   * .commitId("commitId")
   * .repository("repository")
   * .build())
   * .revisionType("revisionType")
   * .s3Location(S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .bundleType("bundleType")
   * .eTag("eTag")
   * .version("version")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .ignoreApplicationStopFailures(false)
   * .build())
   * .deploymentConfigName("deploymentConfigName")
   * .deploymentGroupName("deploymentGroupName")
   * .deploymentStyle(DeploymentStyleProperty.builder()
   * .deploymentOption("deploymentOption")
   * .deploymentType("deploymentType")
   * .build())
   * .ec2TagFilters(List.of(EC2TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .ec2TagSet(EC2TagSetProperty.builder()
   * .ec2TagSetList(List.of(EC2TagSetListObjectProperty.builder()
   * .ec2TagGroup(List.of(EC2TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .build()))
   * .build())
   * .ecsServices(List.of(ECSServiceProperty.builder()
   * .clusterName("clusterName")
   * .serviceName("serviceName")
   * .build()))
   * .loadBalancerInfo(LoadBalancerInfoProperty.builder()
   * .elbInfoList(List.of(ELBInfoProperty.builder()
   * .name("name")
   * .build()))
   * .targetGroupInfoList(List.of(TargetGroupInfoProperty.builder()
   * .name("name")
   * .build()))
   * .targetGroupPairInfoList(List.of(TargetGroupPairInfoProperty.builder()
   * .prodTrafficRoute(TrafficRouteProperty.builder()
   * .listenerArns(List.of("listenerArns"))
   * .build())
   * .targetGroups(List.of(TargetGroupInfoProperty.builder()
   * .name("name")
   * .build()))
   * .testTrafficRoute(TrafficRouteProperty.builder()
   * .listenerArns(List.of("listenerArns"))
   * .build())
   * .build()))
   * .build())
   * .onPremisesInstanceTagFilters(List.of(TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .onPremisesTagSet(OnPremisesTagSetProperty.builder()
   * .onPremisesTagSetList(List.of(OnPremisesTagSetListObjectProperty.builder()
   * .onPremisesTagGroup(List.of(TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build()))
   * .build()))
   * .build())
   * .outdatedInstancesStrategy("outdatedInstancesStrategy")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .triggerConfigurations(List.of(TriggerConfigProperty.builder()
   * .triggerEvents(List.of("triggerEvents"))
   * .triggerName("triggerName")
   * .triggerTargetArn("triggerTargetArn")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
   */
  public inline fun cfnDeploymentGroupProps(block: CfnDeploymentGroupPropsDsl.() -> Unit = {}):
      CfnDeploymentGroupProps {
    val builder = CfnDeploymentGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `RevisionLocation` is a property that defines the location of the CodeDeploy application
   * revision to deploy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * RevisionLocationProperty revisionLocationProperty = RevisionLocationProperty.builder()
   * .gitHubLocation(GitHubLocationProperty.builder()
   * .commitId("commitId")
   * .repository("repository")
   * .build())
   * .revisionType("revisionType")
   * .s3Location(S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .bundleType("bundleType")
   * .eTag("eTag")
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-revisionlocation.html)
   */
  public inline
      fun cfnDeploymentGroupRevisionLocationProperty(block: CfnDeploymentGroupRevisionLocationPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.RevisionLocationProperty {
    val builder = CfnDeploymentGroupRevisionLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `S3Location` is a property of the [CodeDeploy DeploymentGroup
   * Revision](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html)
   * property that specifies the location of an application revision that is stored in Amazon Simple
   * Storage Service ( Amazon S3 ).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .bundleType("bundleType")
   * .eTag("eTag")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html)
   */
  public inline
      fun cfnDeploymentGroupS3LocationProperty(block: CfnDeploymentGroupS3LocationPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.S3LocationProperty {
    val builder = CfnDeploymentGroupS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `TagFilter` is a property type of the
   * [AWS::CodeDeploy::DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
   * resource that specifies which on-premises instances to associate with the deployment group. To
   * register on-premise instances with AWS CodeDeploy , see [Configure Existing On-Premises Instances
   * by Using AWS
   * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html) in
   * the *AWS CodeDeploy User Guide* .
   *
   * For more information about using tags and tag groups to help manage your Amazon EC2 instances
   * and on-premises instances, see [Tagging Instances for Deployment Groups in AWS
   * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-tagging.html) in the
   * *AWS CodeDeploy User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-tagfilter.html)
   */
  public inline
      fun cfnDeploymentGroupTagFilterProperty(block: CfnDeploymentGroupTagFilterPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.TagFilterProperty {
    val builder = CfnDeploymentGroupTagFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `TargetGroupInfo` property type specifies information about a target group in Elastic Load
   * Balancing to use in a deployment.
   *
   * Instances are registered as targets in a target group, and traffic is routed to the target
   * group. For more information, see
   * [TargetGroupInfo](https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_TargetGroupInfo.html)
   * in the *AWS CodeDeploy API Reference*
   *
   * If you specify the `TargetGroupInfo` property, the `DeploymentStyle.DeploymentOption` property
   * must be set to `WITH_TRAFFIC_CONTROL` for CodeDeploy to route your traffic using the specified
   * target groups.
   *
   * `TargetGroupInfo` is a property of the
   * [LoadBalancerInfo](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * TargetGroupInfoProperty targetGroupInfoProperty = TargetGroupInfoProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html)
   */
  public inline
      fun cfnDeploymentGroupTargetGroupInfoProperty(block: CfnDeploymentGroupTargetGroupInfoPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.TargetGroupInfoProperty {
    val builder = CfnDeploymentGroupTargetGroupInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * TargetGroupPairInfoProperty targetGroupPairInfoProperty = TargetGroupPairInfoProperty.builder()
   * .prodTrafficRoute(TrafficRouteProperty.builder()
   * .listenerArns(List.of("listenerArns"))
   * .build())
   * .targetGroups(List.of(TargetGroupInfoProperty.builder()
   * .name("name")
   * .build()))
   * .testTrafficRoute(TrafficRouteProperty.builder()
   * .listenerArns(List.of("listenerArns"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgrouppairinfo.html)
   */
  public inline
      fun cfnDeploymentGroupTargetGroupPairInfoProperty(block: CfnDeploymentGroupTargetGroupPairInfoPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.TargetGroupPairInfoProperty {
    val builder = CfnDeploymentGroupTargetGroupPairInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * TrafficRouteProperty trafficRouteProperty = TrafficRouteProperty.builder()
   * .listenerArns(List.of("listenerArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-trafficroute.html)
   */
  public inline
      fun cfnDeploymentGroupTrafficRouteProperty(block: CfnDeploymentGroupTrafficRoutePropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.TrafficRouteProperty {
    val builder = CfnDeploymentGroupTrafficRoutePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about notification triggers for the deployment group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * TriggerConfigProperty triggerConfigProperty = TriggerConfigProperty.builder()
   * .triggerEvents(List.of("triggerEvents"))
   * .triggerName("triggerName")
   * .triggerTargetArn("triggerTargetArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html)
   */
  public inline
      fun cfnDeploymentGroupTriggerConfigProperty(block: CfnDeploymentGroupTriggerConfigPropertyDsl.() -> Unit
      = {}): CfnDeploymentGroup.TriggerConfigProperty {
    val builder = CfnDeploymentGroupTriggerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * (deprecated) A custom Deployment Configuration for a Lambda Deployment Group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.codedeploy.*;
   * CustomLambdaDeploymentConfig customLambdaDeploymentConfig =
   * CustomLambdaDeploymentConfig.Builder.create(this, "MyCustomLambdaDeploymentConfig")
   * .interval(Duration.minutes(30))
   * .percentage(123)
   * .type(CustomLambdaDeploymentConfigType.CANARY)
   * // the properties below are optional
   * .deploymentConfigName("deploymentConfigName")
   * .build();
   * ```
   *
   * @deprecated CloudFormation now supports Lambda deployment configurations without custom
   * resources. Use `LambdaDeploymentConfig`.
   */
  @Deprecated(message = "deprecated in CDK")
  public inline fun customLambdaDeploymentConfig(
    scope: Construct,
    id: String,
    block: CustomLambdaDeploymentConfigDsl.() -> Unit = {},
  ): CustomLambdaDeploymentConfig {
    val builder = CustomLambdaDeploymentConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * (deprecated) Properties of a reference to a CodeDeploy Lambda Deployment Configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.codedeploy.*;
   * CustomLambdaDeploymentConfigProps customLambdaDeploymentConfigProps =
   * CustomLambdaDeploymentConfigProps.builder()
   * .interval(Duration.minutes(30))
   * .percentage(123)
   * .type(CustomLambdaDeploymentConfigType.CANARY)
   * // the properties below are optional
   * .deploymentConfigName("deploymentConfigName")
   * .build();
   * ```
   *
   * @deprecated Use `LambdaDeploymentConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public inline
      fun customLambdaDeploymentConfigProps(block: CustomLambdaDeploymentConfigPropsDsl.() -> Unit =
      {}): CustomLambdaDeploymentConfigProps {
    val builder = CustomLambdaDeploymentConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A CodeDeploy Application that deploys to an Amazon ECS service.
   *
   * Example:
   *
   * ```
   * EcsApplication application = EcsApplication.Builder.create(this, "CodeDeployApplication")
   * .applicationName("MyApplication")
   * .build();
   * ```
   */
  public inline fun ecsApplication(
    scope: Construct,
    id: String,
    block: EcsApplicationDsl.() -> Unit = {},
  ): EcsApplication {
    val builder = EcsApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `EcsApplication`.
   *
   * Example:
   *
   * ```
   * EcsApplication application = EcsApplication.Builder.create(this, "CodeDeployApplication")
   * .applicationName("MyApplication")
   * .build();
   * ```
   */
  public inline fun ecsApplicationProps(block: EcsApplicationPropsDsl.() -> Unit = {}):
      EcsApplicationProps {
    val builder = EcsApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specify how the deployment behaves and how traffic is routed to the ECS service during a
   * blue-green ECS deployment.
   *
   * Example:
   *
   * ```
   * EcsApplication myApplication;
   * Cluster cluster;
   * FargateTaskDefinition taskDefinition;
   * ITargetGroup blueTargetGroup;
   * ITargetGroup greenTargetGroup;
   * IApplicationListener listener;
   * FargateService service = FargateService.Builder.create(this, "Service")
   * .cluster(cluster)
   * .taskDefinition(taskDefinition)
   * .deploymentController(DeploymentController.builder()
   * .type(DeploymentControllerType.CODE_DEPLOY)
   * .build())
   * .build();
   * EcsDeploymentGroup.Builder.create(this, "BlueGreenDG")
   * .service(service)
   * .blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig.builder()
   * .blueTargetGroup(blueTargetGroup)
   * .greenTargetGroup(greenTargetGroup)
   * .listener(listener)
   * .build())
   * .deploymentConfig(EcsDeploymentConfig.CANARY_10PERCENT_5MINUTES)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/reference-appspec-file-structure-hooks.html#appspec-hooks-ecs)
   */
  public inline fun ecsBlueGreenDeploymentConfig(block: EcsBlueGreenDeploymentConfigDsl.() -> Unit =
      {}): EcsBlueGreenDeploymentConfig {
    val builder = EcsBlueGreenDeploymentConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A custom Deployment Configuration for an ECS Deployment Group.
   *
   * Example:
   *
   * ```
   * FargateService service;
   * ITargetGroup blueTargetGroup;
   * ITargetGroup greenTargetGroup;
   * IApplicationListener listener;
   * IApplicationListener testListener;
   * EcsDeploymentGroup.Builder.create(this, "BlueGreenDG")
   * .autoRollback(AutoRollbackConfig.builder()
   * // CodeDeploy will automatically roll back if the 8-hour approval period times out and the
   * deployment stops
   * .stoppedDeployment(true)
   * .build())
   * .service(service)
   * .blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig.builder()
   * // The deployment will wait for approval for up to 8 hours before stopping the deployment
   * .deploymentApprovalWaitTime(Duration.hours(8))
   * .blueTargetGroup(blueTargetGroup)
   * .greenTargetGroup(greenTargetGroup)
   * .listener(listener)
   * .testListener(testListener)
   * .build())
   * .deploymentConfig(EcsDeploymentConfig.CANARY_10PERCENT_5MINUTES)
   * .build();
   * ```
   */
  public inline fun ecsDeploymentConfig(
    scope: Construct,
    id: String,
    block: EcsDeploymentConfigDsl.() -> Unit = {},
  ): EcsDeploymentConfig {
    val builder = EcsDeploymentConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties of `EcsDeploymentConfig`.
   *
   * Example:
   *
   * ```
   * EcsDeploymentConfig.Builder.create(this, "CustomConfig")
   * .trafficRouting(TimeBasedCanaryTrafficRouting.Builder.create()
   * .interval(Duration.minutes(15))
   * .percentage(5)
   * .build())
   * .build();
   * ```
   */
  public inline fun ecsDeploymentConfigProps(block: EcsDeploymentConfigPropsDsl.() -> Unit = {}):
      EcsDeploymentConfigProps {
    val builder = EcsDeploymentConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A CodeDeploy deployment group that orchestrates ECS blue-green deployments.
   *
   * Example:
   *
   * ```
   * EcsApplication myApplication;
   * Cluster cluster;
   * FargateTaskDefinition taskDefinition;
   * ITargetGroup blueTargetGroup;
   * ITargetGroup greenTargetGroup;
   * IApplicationListener listener;
   * FargateService service = FargateService.Builder.create(this, "Service")
   * .cluster(cluster)
   * .taskDefinition(taskDefinition)
   * .deploymentController(DeploymentController.builder()
   * .type(DeploymentControllerType.CODE_DEPLOY)
   * .build())
   * .build();
   * EcsDeploymentGroup.Builder.create(this, "BlueGreenDG")
   * .service(service)
   * .blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig.builder()
   * .blueTargetGroup(blueTargetGroup)
   * .greenTargetGroup(greenTargetGroup)
   * .listener(listener)
   * .build())
   * .deploymentConfig(EcsDeploymentConfig.CANARY_10PERCENT_5MINUTES)
   * .build();
   * ```
   */
  public inline fun ecsDeploymentGroup(
    scope: Construct,
    id: String,
    block: EcsDeploymentGroupDsl.() -> Unit = {},
  ): EcsDeploymentGroup {
    val builder = EcsDeploymentGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties of a reference to a CodeDeploy ECS Deployment Group.
   *
   * Example:
   *
   * ```
   * EcsApplication application;
   * IEcsDeploymentGroup deploymentGroup = EcsDeploymentGroup.fromEcsDeploymentGroupAttributes(this,
   * "ExistingCodeDeployDeploymentGroup", EcsDeploymentGroupAttributes.builder()
   * .application(application)
   * .deploymentGroupName("MyExistingDeploymentGroup")
   * .build());
   * ```
   *
   * [Documentation](EcsDeploymentGroup#fromEcsDeploymentGroupAttributes)
   */
  public inline fun ecsDeploymentGroupAttributes(block: EcsDeploymentGroupAttributesDsl.() -> Unit =
      {}): EcsDeploymentGroupAttributes {
    val builder = EcsDeploymentGroupAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `EcsDeploymentGroup`.
   *
   * Example:
   *
   * ```
   * EcsApplication myApplication;
   * Cluster cluster;
   * FargateTaskDefinition taskDefinition;
   * ITargetGroup blueTargetGroup;
   * ITargetGroup greenTargetGroup;
   * IApplicationListener listener;
   * FargateService service = FargateService.Builder.create(this, "Service")
   * .cluster(cluster)
   * .taskDefinition(taskDefinition)
   * .deploymentController(DeploymentController.builder()
   * .type(DeploymentControllerType.CODE_DEPLOY)
   * .build())
   * .build();
   * EcsDeploymentGroup.Builder.create(this, "BlueGreenDG")
   * .service(service)
   * .blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig.builder()
   * .blueTargetGroup(blueTargetGroup)
   * .greenTargetGroup(greenTargetGroup)
   * .listener(listener)
   * .build())
   * .deploymentConfig(EcsDeploymentConfig.CANARY_10PERCENT_5MINUTES)
   * .build();
   * ```
   */
  public inline fun ecsDeploymentGroupProps(block: EcsDeploymentGroupPropsDsl.() -> Unit = {}):
      EcsDeploymentGroupProps {
    val builder = EcsDeploymentGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A CodeDeploy Application that deploys to an AWS Lambda function.
   *
   * Example:
   *
   * ```
   * LambdaApplication application = LambdaApplication.Builder.create(this, "CodeDeployApplication")
   * .applicationName("MyApplication")
   * .build();
   * ```
   */
  public inline fun lambdaApplication(
    scope: Construct,
    id: String,
    block: LambdaApplicationDsl.() -> Unit = {},
  ): LambdaApplication {
    val builder = LambdaApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `LambdaApplication`.
   *
   * Example:
   *
   * ```
   * LambdaApplication application = LambdaApplication.Builder.create(this, "CodeDeployApplication")
   * .applicationName("MyApplication")
   * .build();
   * ```
   */
  public inline fun lambdaApplicationProps(block: LambdaApplicationPropsDsl.() -> Unit = {}):
      LambdaApplicationProps {
    val builder = LambdaApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A custom Deployment Configuration for a Lambda Deployment Group.
   *
   * Example:
   *
   * ```
   * LambdaApplication application;
   * Alias alias;
   * LambdaDeploymentConfig config = LambdaDeploymentConfig.Builder.create(this, "CustomConfig")
   * .trafficRouting(TimeBasedCanaryTrafficRouting.Builder.create()
   * .interval(Duration.minutes(15))
   * .percentage(5)
   * .build())
   * .build();
   * LambdaDeploymentGroup deploymentGroup = LambdaDeploymentGroup.Builder.create(this,
   * "BlueGreenDeployment")
   * .application(application)
   * .alias(alias)
   * .deploymentConfig(config)
   * .build();
   * ```
   */
  public inline fun lambdaDeploymentConfig(
    scope: Construct,
    id: String,
    block: LambdaDeploymentConfigDsl.() -> Unit = {},
  ): LambdaDeploymentConfig {
    val builder = LambdaDeploymentConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties of a reference to a CodeDeploy Lambda Deployment Configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * LambdaDeploymentConfigImportProps lambdaDeploymentConfigImportProps =
   * LambdaDeploymentConfigImportProps.builder()
   * .deploymentConfigName("deploymentConfigName")
   * .build();
   * ```
   *
   * [Documentation](LambdaDeploymentConfig# import)
   */
  public inline
      fun lambdaDeploymentConfigImportProps(block: LambdaDeploymentConfigImportPropsDsl.() -> Unit =
      {}): LambdaDeploymentConfigImportProps {
    val builder = LambdaDeploymentConfigImportPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties of `LambdaDeploymentConfig`.
   *
   * Example:
   *
   * ```
   * LambdaApplication application;
   * Alias alias;
   * LambdaDeploymentConfig config = LambdaDeploymentConfig.Builder.create(this, "CustomConfig")
   * .trafficRouting(TimeBasedCanaryTrafficRouting.Builder.create()
   * .interval(Duration.minutes(15))
   * .percentage(5)
   * .build())
   * .build();
   * LambdaDeploymentGroup deploymentGroup = LambdaDeploymentGroup.Builder.create(this,
   * "BlueGreenDeployment")
   * .application(application)
   * .alias(alias)
   * .deploymentConfig(config)
   * .build();
   * ```
   */
  public inline fun lambdaDeploymentConfigProps(block: LambdaDeploymentConfigPropsDsl.() -> Unit =
      {}): LambdaDeploymentConfigProps {
    val builder = LambdaDeploymentConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * LambdaApplication application;
   * Alias alias;
   * LambdaDeploymentConfig config = LambdaDeploymentConfig.Builder.create(this, "CustomConfig")
   * .trafficRouting(TimeBasedCanaryTrafficRouting.Builder.create()
   * .interval(Duration.minutes(15))
   * .percentage(5)
   * .build())
   * .build();
   * LambdaDeploymentGroup deploymentGroup = LambdaDeploymentGroup.Builder.create(this,
   * "BlueGreenDeployment")
   * .application(application)
   * .alias(alias)
   * .deploymentConfig(config)
   * .build();
   * ```
   */
  public inline fun lambdaDeploymentGroup(
    scope: Construct,
    id: String,
    block: LambdaDeploymentGroupDsl.() -> Unit = {},
  ): LambdaDeploymentGroup {
    val builder = LambdaDeploymentGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties of a reference to a CodeDeploy Lambda Deployment Group.
   *
   * Example:
   *
   * ```
   * LambdaApplication application;
   * ILambdaDeploymentGroup deploymentGroup =
   * LambdaDeploymentGroup.fromLambdaDeploymentGroupAttributes(this,
   * "ExistingCodeDeployDeploymentGroup", LambdaDeploymentGroupAttributes.builder()
   * .application(application)
   * .deploymentGroupName("MyExistingDeploymentGroup")
   * .build());
   * ```
   *
   * [Documentation](LambdaDeploymentGroup#fromLambdaDeploymentGroupAttributes)
   */
  public inline
      fun lambdaDeploymentGroupAttributes(block: LambdaDeploymentGroupAttributesDsl.() -> Unit =
      {}): LambdaDeploymentGroupAttributes {
    val builder = LambdaDeploymentGroupAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `LambdaDeploymentGroup`.
   *
   * Example:
   *
   * ```
   * LambdaApplication myApplication;
   * Function func;
   * Version version = func.getCurrentVersion();
   * Alias version1Alias = Alias.Builder.create(this, "alias")
   * .aliasName("prod")
   * .version(version)
   * .build();
   * LambdaDeploymentGroup deploymentGroup = LambdaDeploymentGroup.Builder.create(this,
   * "BlueGreenDeployment")
   * .application(myApplication) // optional property: one will be created for you if not provided
   * .alias(version1Alias)
   * .deploymentConfig(LambdaDeploymentConfig.LINEAR_10PERCENT_EVERY_1MINUTE)
   * .build();
   * ```
   */
  public inline fun lambdaDeploymentGroupProps(block: LambdaDeploymentGroupPropsDsl.() -> Unit =
      {}): LambdaDeploymentGroupProps {
    val builder = LambdaDeploymentGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the configuration specific to linear traffic shifting.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * LinearTrafficRoutingConfig linearTrafficRoutingConfig = LinearTrafficRoutingConfig.builder()
   * .linearInterval(123)
   * .linearPercentage(123)
   * .build();
   * ```
   */
  public inline fun linearTrafficRoutingConfig(block: LinearTrafficRoutingConfigDsl.() -> Unit =
      {}): LinearTrafficRoutingConfig {
    val builder = LinearTrafficRoutingConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A CodeDeploy Application that deploys to EC2/on-premise instances.
   *
   * Example:
   *
   * ```
   * ServerApplication application = ServerApplication.Builder.create(this, "CodeDeployApplication")
   * .applicationName("MyApplication")
   * .build();
   * ```
   */
  public inline fun serverApplication(
    scope: Construct,
    id: String,
    block: ServerApplicationDsl.() -> Unit = {},
  ): ServerApplication {
    val builder = ServerApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `ServerApplication`.
   *
   * Example:
   *
   * ```
   * ServerApplication application = ServerApplication.Builder.create(this, "CodeDeployApplication")
   * .applicationName("MyApplication")
   * .build();
   * ```
   */
  public inline fun serverApplicationProps(block: ServerApplicationPropsDsl.() -> Unit = {}):
      ServerApplicationProps {
    val builder = ServerApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A custom Deployment Configuration for an EC2/on-premise Deployment Group.
   *
   * Example:
   *
   * ```
   * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
   * "CodeDeployDeploymentGroup")
   * .deploymentConfig(ServerDeploymentConfig.ALL_AT_ONCE)
   * .build();
   * ```
   */
  public inline fun serverDeploymentConfig(
    scope: Construct,
    id: String,
    block: ServerDeploymentConfigDsl.() -> Unit = {},
  ): ServerDeploymentConfig {
    val builder = ServerDeploymentConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties of `ServerDeploymentConfig`.
   *
   * Example:
   *
   * ```
   * ServerDeploymentConfig deploymentConfig = ServerDeploymentConfig.Builder.create(this,
   * "DeploymentConfiguration")
   * .deploymentConfigName("MyDeploymentConfiguration") // optional property
   * // one of these is required, but both cannot be specified at the same time
   * .minimumHealthyHosts(MinimumHealthyHosts.count(2))
   * .build();
   * ```
   */
  public inline fun serverDeploymentConfigProps(block: ServerDeploymentConfigPropsDsl.() -> Unit =
      {}): ServerDeploymentConfigProps {
    val builder = ServerDeploymentConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A CodeDeploy Deployment Group that deploys to EC2/on-premise instances.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.elasticloadbalancing.*;
   * LoadBalancer lb;
   * lb.addListener(LoadBalancerListener.builder()
   * .externalPort(80)
   * .build());
   * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
   * "DeploymentGroup")
   * .loadBalancer(LoadBalancer.classic(lb))
   * .build();
   * ```
   */
  public inline fun serverDeploymentGroup(
    scope: Construct,
    id: String,
    block: ServerDeploymentGroupDsl.() -> Unit = {},
  ): ServerDeploymentGroup {
    val builder = ServerDeploymentGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties of a reference to a CodeDeploy EC2/on-premise Deployment Group.
   *
   * Example:
   *
   * ```
   * ServerApplication application;
   * IServerDeploymentGroup deploymentGroup =
   * ServerDeploymentGroup.fromServerDeploymentGroupAttributes(this,
   * "ExistingCodeDeployDeploymentGroup", ServerDeploymentGroupAttributes.builder()
   * .application(application)
   * .deploymentGroupName("MyExistingDeploymentGroup")
   * .build());
   * ```
   *
   * [Documentation](ServerDeploymentGroup# import)
   */
  public inline
      fun serverDeploymentGroupAttributes(block: ServerDeploymentGroupAttributesDsl.() -> Unit =
      {}): ServerDeploymentGroupAttributes {
    val builder = ServerDeploymentGroupAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `ServerDeploymentGroup`.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.elasticloadbalancing.*;
   * LoadBalancer lb;
   * lb.addListener(LoadBalancerListener.builder()
   * .externalPort(80)
   * .build());
   * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
   * "DeploymentGroup")
   * .loadBalancer(LoadBalancer.classic(lb))
   * .build();
   * ```
   */
  public inline fun serverDeploymentGroupProps(block: ServerDeploymentGroupPropsDsl.() -> Unit =
      {}): ServerDeploymentGroupProps {
    val builder = ServerDeploymentGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Define a traffic routing config of type 'TimeBasedCanary'.
   *
   * Example:
   *
   * ```
   * LambdaDeploymentConfig config = LambdaDeploymentConfig.Builder.create(this, "CustomConfig")
   * .trafficRouting(TimeBasedCanaryTrafficRouting.Builder.create()
   * .interval(Duration.minutes(15))
   * .percentage(5)
   * .build())
   * .deploymentConfigName("MyDeploymentConfig")
   * .build();
   * ```
   */
  public inline fun timeBasedCanaryTrafficRouting(block: TimeBasedCanaryTrafficRoutingDsl.() -> Unit
      = {}): TimeBasedCanaryTrafficRouting {
    val builder = TimeBasedCanaryTrafficRoutingDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `TimeBasedCanaryTrafficRouting`.
   *
   * Example:
   *
   * ```
   * LambdaDeploymentConfig config = LambdaDeploymentConfig.Builder.create(this, "CustomConfig")
   * .trafficRouting(TimeBasedCanaryTrafficRouting.Builder.create()
   * .interval(Duration.minutes(15))
   * .percentage(5)
   * .build())
   * .deploymentConfigName("MyDeploymentConfig")
   * .build();
   * ```
   */
  public inline
      fun timeBasedCanaryTrafficRoutingProps(block: TimeBasedCanaryTrafficRoutingPropsDsl.() -> Unit
      = {}): TimeBasedCanaryTrafficRoutingProps {
    val builder = TimeBasedCanaryTrafficRoutingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Define a traffic routing config of type 'TimeBasedLinear'.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * TrafficRouting timeBasedLinearTrafficRouting = TimeBasedLinearTrafficRouting.allAtOnce();
   * ```
   */
  public inline fun timeBasedLinearTrafficRouting(block: TimeBasedLinearTrafficRoutingDsl.() -> Unit
      = {}): TimeBasedLinearTrafficRouting {
    val builder = TimeBasedLinearTrafficRoutingDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `TimeBasedLinearTrafficRouting`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.codedeploy.*;
   * TimeBasedLinearTrafficRoutingProps timeBasedLinearTrafficRoutingProps =
   * TimeBasedLinearTrafficRoutingProps.builder()
   * .interval(Duration.minutes(30))
   * .percentage(123)
   * .build();
   * ```
   */
  public inline
      fun timeBasedLinearTrafficRoutingProps(block: TimeBasedLinearTrafficRoutingPropsDsl.() -> Unit
      = {}): TimeBasedLinearTrafficRoutingProps {
    val builder = TimeBasedLinearTrafficRoutingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the structure to pass into the underlying CfnDeploymentConfig class.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codedeploy.*;
   * TrafficRoutingConfig trafficRoutingConfig = TrafficRoutingConfig.builder()
   * .type("type")
   * // the properties below are optional
   * .timeBasedCanary(CanaryTrafficRoutingConfig.builder()
   * .canaryInterval(123)
   * .canaryPercentage(123)
   * .build())
   * .timeBasedLinear(LinearTrafficRoutingConfig.builder()
   * .linearInterval(123)
   * .linearPercentage(123)
   * .build())
   * .build();
   * ```
   */
  public inline fun trafficRoutingConfig(block: TrafficRoutingConfigDsl.() -> Unit = {}):
      TrafficRoutingConfig {
    val builder = TrafficRoutingConfigDsl()
    builder.apply(block)
    return builder.build()
  }
}
