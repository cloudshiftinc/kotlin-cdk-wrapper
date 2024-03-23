@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through CodeDeploy
 * using AWS
 * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html) for
 * more information.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
 * .terminationHookEnabled(false)
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
public open class CfnDeploymentGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentGroupProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDeploymentGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeploymentGroupProps(props)
  )

  /**
   * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
   */
  public open fun alarmConfiguration(): Any? = unwrap(this).getAlarmConfiguration()

  /**
   * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
   */
  public open fun alarmConfiguration(`value`: IResolvable) {
    unwrap(this).setAlarmConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
   */
  public open fun alarmConfiguration(`value`: AlarmConfigurationProperty) {
    unwrap(this).setAlarmConfiguration(`value`.let(AlarmConfigurationProperty::unwrap))
  }

  /**
   * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b7bdf4be6e22d722e7903cb5733cb4a9dac4ff486f8fc5660e43e2ef4d21425")
  public open fun alarmConfiguration(`value`: AlarmConfigurationProperty.Builder.() -> Unit): Unit =
      alarmConfiguration(AlarmConfigurationProperty(`value`))

  /**
   * The name of an existing CodeDeploy application to associate this deployment group with.
   */
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  /**
   * The name of an existing CodeDeploy application to associate this deployment group with.
   */
  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Information about the automatic rollback configuration that is associated with the deployment
   * group.
   */
  public open fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

  /**
   * Information about the automatic rollback configuration that is associated with the deployment
   * group.
   */
  public open fun autoRollbackConfiguration(`value`: IResolvable) {
    unwrap(this).setAutoRollbackConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the automatic rollback configuration that is associated with the deployment
   * group.
   */
  public open fun autoRollbackConfiguration(`value`: AutoRollbackConfigurationProperty) {
    unwrap(this).setAutoRollbackConfiguration(`value`.let(AutoRollbackConfigurationProperty::unwrap))
  }

  /**
   * Information about the automatic rollback configuration that is associated with the deployment
   * group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("87a8c7998c52b849a1393de3b947f0443d93c8e0474b83ba1364c3e591623f10")
  public open
      fun autoRollbackConfiguration(`value`: AutoRollbackConfigurationProperty.Builder.() -> Unit):
      Unit = autoRollbackConfiguration(AutoRollbackConfigurationProperty(`value`))

  /**
   * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
   * when new instances are created.
   */
  public open fun autoScalingGroups(): List<String> = unwrap(this).getAutoScalingGroups() ?:
      emptyList()

  /**
   * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
   * when new instances are created.
   */
  public open fun autoScalingGroups(`value`: List<String>) {
    unwrap(this).setAutoScalingGroups(`value`)
  }

  /**
   * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
   * when new instances are created.
   */
  public open fun autoScalingGroups(vararg `value`: String): Unit =
      autoScalingGroups(`value`.toList())

  /**
   * Information about blue/green deployment options for a deployment group.
   */
  public open fun blueGreenDeploymentConfiguration(): Any? =
      unwrap(this).getBlueGreenDeploymentConfiguration()

  /**
   * Information about blue/green deployment options for a deployment group.
   */
  public open fun blueGreenDeploymentConfiguration(`value`: IResolvable) {
    unwrap(this).setBlueGreenDeploymentConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about blue/green deployment options for a deployment group.
   */
  public open
      fun blueGreenDeploymentConfiguration(`value`: BlueGreenDeploymentConfigurationProperty) {
    unwrap(this).setBlueGreenDeploymentConfiguration(`value`.let(BlueGreenDeploymentConfigurationProperty::unwrap))
  }

  /**
   * Information about blue/green deployment options for a deployment group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("790f94756d9404099784a811862d7b1a81eaf24cb37047202f6d125024a8924f")
  public open
      fun blueGreenDeploymentConfiguration(`value`: BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit):
      Unit = blueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationProperty(`value`))

  /**
   * The application revision to deploy to this deployment group.
   */
  public open fun deployment(): Any? = unwrap(this).getDeployment()

  /**
   * The application revision to deploy to this deployment group.
   */
  public open fun deployment(`value`: IResolvable) {
    unwrap(this).setDeployment(`value`.let(IResolvable::unwrap))
  }

  /**
   * The application revision to deploy to this deployment group.
   */
  public open fun deployment(`value`: DeploymentProperty) {
    unwrap(this).setDeployment(`value`.let(DeploymentProperty::unwrap))
  }

  /**
   * The application revision to deploy to this deployment group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a125d976d3f2b3a2ca087c19f2a113042ae0e2e94976224ff89ea4d0928dd2b6")
  public open fun deployment(`value`: DeploymentProperty.Builder.() -> Unit): Unit =
      deployment(DeploymentProperty(`value`))

  /**
   * A deployment configuration name or a predefined configuration name.
   */
  public open fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  /**
   * A deployment configuration name or a predefined configuration name.
   */
  public open fun deploymentConfigName(`value`: String) {
    unwrap(this).setDeploymentConfigName(`value`)
  }

  /**
   * A name for the deployment group.
   */
  public open fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

  /**
   * A name for the deployment group.
   */
  public open fun deploymentGroupName(`value`: String) {
    unwrap(this).setDeploymentGroupName(`value`)
  }

  /**
   * Attributes that determine the type of deployment to run and whether to route deployment traffic
   * behind a load balancer.
   */
  public open fun deploymentStyle(): Any? = unwrap(this).getDeploymentStyle()

  /**
   * Attributes that determine the type of deployment to run and whether to route deployment traffic
   * behind a load balancer.
   */
  public open fun deploymentStyle(`value`: IResolvable) {
    unwrap(this).setDeploymentStyle(`value`.let(IResolvable::unwrap))
  }

  /**
   * Attributes that determine the type of deployment to run and whether to route deployment traffic
   * behind a load balancer.
   */
  public open fun deploymentStyle(`value`: DeploymentStyleProperty) {
    unwrap(this).setDeploymentStyle(`value`.let(DeploymentStyleProperty::unwrap))
  }

  /**
   * Attributes that determine the type of deployment to run and whether to route deployment traffic
   * behind a load balancer.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("daf7a4a9a8a46c0f43695e44c1230fabfe6f4d4c32d552740946d48d0b6aa4ac")
  public open fun deploymentStyle(`value`: DeploymentStyleProperty.Builder.() -> Unit): Unit =
      deploymentStyle(DeploymentStyleProperty(`value`))

  /**
   * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
   * in the deployment group.
   */
  public open fun ec2TagFilters(): Any? = unwrap(this).getEc2TagFilters()

  /**
   * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
   * in the deployment group.
   */
  public open fun ec2TagFilters(`value`: IResolvable) {
    unwrap(this).setEc2TagFilters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
   * in the deployment group.
   */
  public open fun ec2TagFilters(`value`: List<Any>) {
    unwrap(this).setEc2TagFilters(`value`)
  }

  /**
   * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
   * in the deployment group.
   */
  public open fun ec2TagFilters(vararg `value`: Any): Unit = ec2TagFilters(`value`.toList())

  /**
   * Information about groups of tags applied to Amazon EC2 instances.
   */
  public open fun ec2TagSet(): Any? = unwrap(this).getEc2TagSet()

  /**
   * Information about groups of tags applied to Amazon EC2 instances.
   */
  public open fun ec2TagSet(`value`: IResolvable) {
    unwrap(this).setEc2TagSet(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about groups of tags applied to Amazon EC2 instances.
   */
  public open fun ec2TagSet(`value`: EC2TagSetProperty) {
    unwrap(this).setEc2TagSet(`value`.let(EC2TagSetProperty::unwrap))
  }

  /**
   * Information about groups of tags applied to Amazon EC2 instances.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d444a3942f576655ff2a4b6f3779cc22d9d1b72ec86c41a4f0a66239ceb2b8d2")
  public open fun ec2TagSet(`value`: EC2TagSetProperty.Builder.() -> Unit): Unit =
      ec2TagSet(EC2TagSetProperty(`value`))

  /**
   * The target Amazon ECS services in the deployment group.
   */
  public open fun ecsServices(): Any? = unwrap(this).getEcsServices()

  /**
   * The target Amazon ECS services in the deployment group.
   */
  public open fun ecsServices(`value`: IResolvable) {
    unwrap(this).setEcsServices(`value`.let(IResolvable::unwrap))
  }

  /**
   * The target Amazon ECS services in the deployment group.
   */
  public open fun ecsServices(`value`: List<Any>) {
    unwrap(this).setEcsServices(`value`)
  }

  /**
   * The target Amazon ECS services in the deployment group.
   */
  public open fun ecsServices(vararg `value`: Any): Unit = ecsServices(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Information about the load balancer to use in a deployment.
   */
  public open fun loadBalancerInfo(): Any? = unwrap(this).getLoadBalancerInfo()

  /**
   * Information about the load balancer to use in a deployment.
   */
  public open fun loadBalancerInfo(`value`: IResolvable) {
    unwrap(this).setLoadBalancerInfo(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the load balancer to use in a deployment.
   */
  public open fun loadBalancerInfo(`value`: LoadBalancerInfoProperty) {
    unwrap(this).setLoadBalancerInfo(`value`.let(LoadBalancerInfoProperty::unwrap))
  }

  /**
   * Information about the load balancer to use in a deployment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("25b7486f81e38de51c21846a2e1828e8cf61e8a7fbd703dc7fa289fbb266563a")
  public open fun loadBalancerInfo(`value`: LoadBalancerInfoProperty.Builder.() -> Unit): Unit =
      loadBalancerInfo(LoadBalancerInfoProperty(`value`))

  /**
   * The on-premises instance tags already applied to on-premises instances that you want to include
   * in the deployment group.
   */
  public open fun onPremisesInstanceTagFilters(): Any? =
      unwrap(this).getOnPremisesInstanceTagFilters()

  /**
   * The on-premises instance tags already applied to on-premises instances that you want to include
   * in the deployment group.
   */
  public open fun onPremisesInstanceTagFilters(`value`: IResolvable) {
    unwrap(this).setOnPremisesInstanceTagFilters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The on-premises instance tags already applied to on-premises instances that you want to include
   * in the deployment group.
   */
  public open fun onPremisesInstanceTagFilters(`value`: List<Any>) {
    unwrap(this).setOnPremisesInstanceTagFilters(`value`)
  }

  /**
   * The on-premises instance tags already applied to on-premises instances that you want to include
   * in the deployment group.
   */
  public open fun onPremisesInstanceTagFilters(vararg `value`: Any): Unit =
      onPremisesInstanceTagFilters(`value`.toList())

  /**
   * Information about groups of tags applied to on-premises instances.
   */
  public open fun onPremisesTagSet(): Any? = unwrap(this).getOnPremisesTagSet()

  /**
   * Information about groups of tags applied to on-premises instances.
   */
  public open fun onPremisesTagSet(`value`: IResolvable) {
    unwrap(this).setOnPremisesTagSet(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about groups of tags applied to on-premises instances.
   */
  public open fun onPremisesTagSet(`value`: OnPremisesTagSetProperty) {
    unwrap(this).setOnPremisesTagSet(`value`.let(OnPremisesTagSetProperty::unwrap))
  }

  /**
   * Information about groups of tags applied to on-premises instances.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5741534ceb8bddd11848390317dcd3ea07c26a1c8d908b49f68d757c28f417cd")
  public open fun onPremisesTagSet(`value`: OnPremisesTagSetProperty.Builder.() -> Unit): Unit =
      onPremisesTagSet(OnPremisesTagSetProperty(`value`))

  /**
   * Indicates what happens when new Amazon EC2 instances are launched mid-deployment and do not
   * receive the deployed application revision.
   */
  public open fun outdatedInstancesStrategy(): String? = unwrap(this).getOutdatedInstancesStrategy()

  /**
   * Indicates what happens when new Amazon EC2 instances are launched mid-deployment and do not
   * receive the deployed application revision.
   */
  public open fun outdatedInstancesStrategy(`value`: String) {
    unwrap(this).setOutdatedInstancesStrategy(`value`)
  }

  /**
   * A service role Amazon Resource Name (ARN) that grants CodeDeploy permission to make calls to
   * AWS services on your behalf.
   */
  public open fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

  /**
   * A service role Amazon Resource Name (ARN) that grants CodeDeploy permission to make calls to
   * AWS services on your behalf.
   */
  public open fun serviceRoleArn(`value`: String) {
    unwrap(this).setServiceRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The metadata that you apply to CodeDeploy deployment groups to help you organize and categorize
   * them.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The metadata that you apply to CodeDeploy deployment groups to help you organize and categorize
   * them.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The metadata that you apply to CodeDeploy deployment groups to help you organize and categorize
   * them.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Indicates whether the deployment group was configured to have CodeDeploy install a termination
   * hook into an Auto Scaling group.
   */
  public open fun terminationHookEnabled(): Any? = unwrap(this).getTerminationHookEnabled()

  /**
   * Indicates whether the deployment group was configured to have CodeDeploy install a termination
   * hook into an Auto Scaling group.
   */
  public open fun terminationHookEnabled(`value`: Boolean) {
    unwrap(this).setTerminationHookEnabled(`value`)
  }

  /**
   * Indicates whether the deployment group was configured to have CodeDeploy install a termination
   * hook into an Auto Scaling group.
   */
  public open fun terminationHookEnabled(`value`: IResolvable) {
    unwrap(this).setTerminationHookEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about triggers associated with the deployment group.
   */
  public open fun triggerConfigurations(): Any? = unwrap(this).getTriggerConfigurations()

  /**
   * Information about triggers associated with the deployment group.
   */
  public open fun triggerConfigurations(`value`: IResolvable) {
    unwrap(this).setTriggerConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about triggers associated with the deployment group.
   */
  public open fun triggerConfigurations(`value`: List<Any>) {
    unwrap(this).setTriggerConfigurations(`value`)
  }

  /**
   * Information about triggers associated with the deployment group.
   */
  public open fun triggerConfigurations(vararg `value`: Any): Unit =
      triggerConfigurations(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.CfnDeploymentGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group. 
     */
    public fun alarmConfiguration(alarmConfiguration: IResolvable)

    /**
     * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group. 
     */
    public fun alarmConfiguration(alarmConfiguration: AlarmConfigurationProperty)

    /**
     * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aaabeeab4581656bbebb3208c6cdea0aae45a6bf07c78a71fb729a258f91c91a")
    public fun alarmConfiguration(alarmConfiguration: AlarmConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of an existing CodeDeploy application to associate this deployment group with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname)
     * @param applicationName The name of an existing CodeDeploy application to associate this
     * deployment group with. 
     */
    public fun applicationName(applicationName: String)

    /**
     * Information about the automatic rollback configuration that is associated with the deployment
     * group.
     *
     * If you specify this property, don't specify the `Deployment` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group. 
     */
    public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable)

    /**
     * Information about the automatic rollback configuration that is associated with the deployment
     * group.
     *
     * If you specify this property, don't specify the `Deployment` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group. 
     */
    public
        fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty)

    /**
     * Information about the automatic rollback configuration that is associated with the deployment
     * group.
     *
     * If you specify this property, don't specify the `Deployment` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ee94cf3cecb07799ec4e642605041d5dd6cb1590775b976fcad565e8926e7cf")
    public
        fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty.Builder.() -> Unit)

    /**
     * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
     * when new instances are created.
     *
     * Duplicates are not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
     * @param autoScalingGroups A list of associated Auto Scaling groups that CodeDeploy
     * automatically deploys revisions to when new instances are created. 
     */
    public fun autoScalingGroups(autoScalingGroups: List<String>)

    /**
     * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
     * when new instances are created.
     *
     * Duplicates are not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
     * @param autoScalingGroups A list of associated Auto Scaling groups that CodeDeploy
     * automatically deploys revisions to when new instances are created. 
     */
    public fun autoScalingGroups(vararg autoScalingGroups: String)

    /**
     * Information about blue/green deployment options for a deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration)
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group. 
     */
    public fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: IResolvable)

    /**
     * Information about blue/green deployment options for a deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration)
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group. 
     */
    public
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: BlueGreenDeploymentConfigurationProperty)

    /**
     * Information about blue/green deployment options for a deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration)
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea1d137387c5573eb1a2270e14f836edf3840e9a2e2536a4ca881d1536cf4f6d")
    public
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit)

    /**
     * The application revision to deploy to this deployment group.
     *
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
     * @param deployment The application revision to deploy to this deployment group. 
     */
    public fun deployment(deployment: IResolvable)

    /**
     * The application revision to deploy to this deployment group.
     *
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
     * @param deployment The application revision to deploy to this deployment group. 
     */
    public fun deployment(deployment: DeploymentProperty)

    /**
     * The application revision to deploy to this deployment group.
     *
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
     * @param deployment The application revision to deploy to this deployment group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddc69a696c62199b4a8b77f2e5b7e40c6d9e85f2d1ad8574cbb5189ae0cd408d")
    public fun deployment(deployment: DeploymentProperty.Builder.() -> Unit)

    /**
     * A deployment configuration name or a predefined configuration name.
     *
     * With predefined configurations, you can deploy application revisions to one instance at a
     * time ( `CodeDeployDefault.OneAtATime` ), half of the instances at a time (
     * `CodeDeployDefault.HalfAtATime` ), or all the instances at once ( `CodeDeployDefault.AllAtOnce`
     * ). For more information and valid values, see [Working with Deployment
     * Configurations](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname)
     * @param deploymentConfigName A deployment configuration name or a predefined configuration
     * name. 
     */
    public fun deploymentConfigName(deploymentConfigName: String)

    /**
     * A name for the deployment group.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the deployment group name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname)
     * @param deploymentGroupName A name for the deployment group. 
     */
    public fun deploymentGroupName(deploymentGroupName: String)

    /**
     * Attributes that determine the type of deployment to run and whether to route deployment
     * traffic behind a load balancer.
     *
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer. 
     */
    public fun deploymentStyle(deploymentStyle: IResolvable)

    /**
     * Attributes that determine the type of deployment to run and whether to route deployment
     * traffic behind a load balancer.
     *
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer. 
     */
    public fun deploymentStyle(deploymentStyle: DeploymentStyleProperty)

    /**
     * Attributes that determine the type of deployment to run and whether to route deployment
     * traffic behind a load balancer.
     *
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82d29e4efa135c378ca780a21a52f1ba7ea5f1da54cdc238ff026427ece0c8c8")
    public fun deploymentStyle(deploymentStyle: DeploymentStyleProperty.Builder.() -> Unit)

    /**
     * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
     * in the deployment group.
     *
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group. 
     */
    public fun ec2TagFilters(ec2TagFilters: IResolvable)

    /**
     * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
     * in the deployment group.
     *
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group. 
     */
    public fun ec2TagFilters(ec2TagFilters: List<Any>)

    /**
     * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
     * in the deployment group.
     *
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group. 
     */
    public fun ec2TagFilters(vararg ec2TagFilters: Any)

    /**
     * Information about groups of tags applied to Amazon EC2 instances.
     *
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagset)
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances. 
     */
    public fun ec2TagSet(ec2TagSet: IResolvable)

    /**
     * Information about groups of tags applied to Amazon EC2 instances.
     *
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagset)
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances. 
     */
    public fun ec2TagSet(ec2TagSet: EC2TagSetProperty)

    /**
     * Information about groups of tags applied to Amazon EC2 instances.
     *
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagset)
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c9cb0f0ac28a72197332b33fb3086c02ca7060e3054dd113da761ba1cc806cf")
    public fun ec2TagSet(ec2TagSet: EC2TagSetProperty.Builder.() -> Unit)

    /**
     * The target Amazon ECS services in the deployment group.
     *
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
     * @param ecsServices The target Amazon ECS services in the deployment group. 
     */
    public fun ecsServices(ecsServices: IResolvable)

    /**
     * The target Amazon ECS services in the deployment group.
     *
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
     * @param ecsServices The target Amazon ECS services in the deployment group. 
     */
    public fun ecsServices(ecsServices: List<Any>)

    /**
     * The target Amazon ECS services in the deployment group.
     *
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
     * @param ecsServices The target Amazon ECS services in the deployment group. 
     */
    public fun ecsServices(vararg ecsServices: Any)

    /**
     * Information about the load balancer to use in a deployment.
     *
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
     * @param loadBalancerInfo Information about the load balancer to use in a deployment. 
     */
    public fun loadBalancerInfo(loadBalancerInfo: IResolvable)

    /**
     * Information about the load balancer to use in a deployment.
     *
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
     * @param loadBalancerInfo Information about the load balancer to use in a deployment. 
     */
    public fun loadBalancerInfo(loadBalancerInfo: LoadBalancerInfoProperty)

    /**
     * Information about the load balancer to use in a deployment.
     *
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
     * @param loadBalancerInfo Information about the load balancer to use in a deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63ea21af9e88672f0b3f438512b6a6822f34dcad7b1d768041196d4793cb77c2")
    public fun loadBalancerInfo(loadBalancerInfo: LoadBalancerInfoProperty.Builder.() -> Unit)

    /**
     * The on-premises instance tags already applied to on-premises instances that you want to
     * include in the deployment group.
     *
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group. 
     */
    public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: IResolvable)

    /**
     * The on-premises instance tags already applied to on-premises instances that you want to
     * include in the deployment group.
     *
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group. 
     */
    public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: List<Any>)

    /**
     * The on-premises instance tags already applied to on-premises instances that you want to
     * include in the deployment group.
     *
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group. 
     */
    public fun onPremisesInstanceTagFilters(vararg onPremisesInstanceTagFilters: Any)

    /**
     * Information about groups of tags applied to on-premises instances.
     *
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisestagset)
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances. 
     */
    public fun onPremisesTagSet(onPremisesTagSet: IResolvable)

    /**
     * Information about groups of tags applied to on-premises instances.
     *
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisestagset)
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances. 
     */
    public fun onPremisesTagSet(onPremisesTagSet: OnPremisesTagSetProperty)

    /**
     * Information about groups of tags applied to on-premises instances.
     *
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisestagset)
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46ec1715e6a5b2ceb83f042d6b64ce3eaa0be7b5d73543e2c05f1e81bfc056b1")
    public fun onPremisesTagSet(onPremisesTagSet: OnPremisesTagSetProperty.Builder.() -> Unit)

    /**
     * Indicates what happens when new Amazon EC2 instances are launched mid-deployment and do not
     * receive the deployed application revision.
     *
     * If this option is set to `UPDATE` or is unspecified, CodeDeploy initiates one or more
     * 'auto-update outdated instances' deployments to apply the deployed application revision to the
     * new Amazon EC2 instances.
     *
     * If this option is set to `IGNORE` , CodeDeploy does not initiate a deployment to update the
     * new Amazon EC2 instances. This may result in instances having different revisions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-outdatedinstancesstrategy)
     * @param outdatedInstancesStrategy Indicates what happens when new Amazon EC2 instances are
     * launched mid-deployment and do not receive the deployed application revision. 
     */
    public fun outdatedInstancesStrategy(outdatedInstancesStrategy: String)

    /**
     * A service role Amazon Resource Name (ARN) that grants CodeDeploy permission to make calls to
     * AWS services on your behalf.
     *
     * For more information, see [Create a Service Role for AWS
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     *
     * In some cases, you might need to add a dependency on the service role's policy. For more
     * information, see IAM role policy in [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn)
     * @param serviceRoleArn A service role Amazon Resource Name (ARN) that grants CodeDeploy
     * permission to make calls to AWS services on your behalf. 
     */
    public fun serviceRoleArn(serviceRoleArn: String)

    /**
     * The metadata that you apply to CodeDeploy deployment groups to help you organize and
     * categorize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-tags)
     * @param tags The metadata that you apply to CodeDeploy deployment groups to help you organize
     * and categorize them. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The metadata that you apply to CodeDeploy deployment groups to help you organize and
     * categorize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-tags)
     * @param tags The metadata that you apply to CodeDeploy deployment groups to help you organize
     * and categorize them. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Indicates whether the deployment group was configured to have CodeDeploy install a
     * termination hook into an Auto Scaling group.
     *
     * For more information about the termination hook, see [How Amazon EC2 Auto Scaling works with
     * CodeDeploy](https://docs.aws.amazon.com//codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-terminationhookenabled)
     * @param terminationHookEnabled Indicates whether the deployment group was configured to have
     * CodeDeploy install a termination hook into an Auto Scaling group. 
     */
    public fun terminationHookEnabled(terminationHookEnabled: Boolean)

    /**
     * Indicates whether the deployment group was configured to have CodeDeploy install a
     * termination hook into an Auto Scaling group.
     *
     * For more information about the termination hook, see [How Amazon EC2 Auto Scaling works with
     * CodeDeploy](https://docs.aws.amazon.com//codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-terminationhookenabled)
     * @param terminationHookEnabled Indicates whether the deployment group was configured to have
     * CodeDeploy install a termination hook into an Auto Scaling group. 
     */
    public fun terminationHookEnabled(terminationHookEnabled: IResolvable)

    /**
     * Information about triggers associated with the deployment group.
     *
     * Duplicates are not allowed
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * 
     */
    public fun triggerConfigurations(triggerConfigurations: IResolvable)

    /**
     * Information about triggers associated with the deployment group.
     *
     * Duplicates are not allowed
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * 
     */
    public fun triggerConfigurations(triggerConfigurations: List<Any>)

    /**
     * Information about triggers associated with the deployment group.
     *
     * Duplicates are not allowed
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * 
     */
    public fun triggerConfigurations(vararg triggerConfigurations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.Builder =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.Builder.create(scope, id)

    /**
     * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group. 
     */
    override fun alarmConfiguration(alarmConfiguration: IResolvable) {
      cdkBuilder.alarmConfiguration(alarmConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group. 
     */
    override fun alarmConfiguration(alarmConfiguration: AlarmConfigurationProperty) {
      cdkBuilder.alarmConfiguration(alarmConfiguration.let(AlarmConfigurationProperty::unwrap))
    }

    /**
     * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aaabeeab4581656bbebb3208c6cdea0aae45a6bf07c78a71fb729a258f91c91a")
    override
        fun alarmConfiguration(alarmConfiguration: AlarmConfigurationProperty.Builder.() -> Unit):
        Unit = alarmConfiguration(AlarmConfigurationProperty(alarmConfiguration))

    /**
     * The name of an existing CodeDeploy application to associate this deployment group with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname)
     * @param applicationName The name of an existing CodeDeploy application to associate this
     * deployment group with. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * Information about the automatic rollback configuration that is associated with the deployment
     * group.
     *
     * If you specify this property, don't specify the `Deployment` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group. 
     */
    override fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
      cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Information about the automatic rollback configuration that is associated with the deployment
     * group.
     *
     * If you specify this property, don't specify the `Deployment` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group. 
     */
    override
        fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty) {
      cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(AutoRollbackConfigurationProperty::unwrap))
    }

    /**
     * Information about the automatic rollback configuration that is associated with the deployment
     * group.
     *
     * If you specify this property, don't specify the `Deployment` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ee94cf3cecb07799ec4e642605041d5dd6cb1590775b976fcad565e8926e7cf")
    override
        fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoRollbackConfiguration(AutoRollbackConfigurationProperty(autoRollbackConfiguration))

    /**
     * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
     * when new instances are created.
     *
     * Duplicates are not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
     * @param autoScalingGroups A list of associated Auto Scaling groups that CodeDeploy
     * automatically deploys revisions to when new instances are created. 
     */
    override fun autoScalingGroups(autoScalingGroups: List<String>) {
      cdkBuilder.autoScalingGroups(autoScalingGroups)
    }

    /**
     * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
     * when new instances are created.
     *
     * Duplicates are not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
     * @param autoScalingGroups A list of associated Auto Scaling groups that CodeDeploy
     * automatically deploys revisions to when new instances are created. 
     */
    override fun autoScalingGroups(vararg autoScalingGroups: String): Unit =
        autoScalingGroups(autoScalingGroups.toList())

    /**
     * Information about blue/green deployment options for a deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration)
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group. 
     */
    override fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: IResolvable) {
      cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Information about blue/green deployment options for a deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration)
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group. 
     */
    override
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: BlueGreenDeploymentConfigurationProperty) {
      cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration.let(BlueGreenDeploymentConfigurationProperty::unwrap))
    }

    /**
     * Information about blue/green deployment options for a deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration)
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea1d137387c5573eb1a2270e14f836edf3840e9a2e2536a4ca881d1536cf4f6d")
    override
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        blueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationProperty(blueGreenDeploymentConfiguration))

    /**
     * The application revision to deploy to this deployment group.
     *
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
     * @param deployment The application revision to deploy to this deployment group. 
     */
    override fun deployment(deployment: IResolvable) {
      cdkBuilder.deployment(deployment.let(IResolvable::unwrap))
    }

    /**
     * The application revision to deploy to this deployment group.
     *
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
     * @param deployment The application revision to deploy to this deployment group. 
     */
    override fun deployment(deployment: DeploymentProperty) {
      cdkBuilder.deployment(deployment.let(DeploymentProperty::unwrap))
    }

    /**
     * The application revision to deploy to this deployment group.
     *
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
     * @param deployment The application revision to deploy to this deployment group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddc69a696c62199b4a8b77f2e5b7e40c6d9e85f2d1ad8574cbb5189ae0cd408d")
    override fun deployment(deployment: DeploymentProperty.Builder.() -> Unit): Unit =
        deployment(DeploymentProperty(deployment))

    /**
     * A deployment configuration name or a predefined configuration name.
     *
     * With predefined configurations, you can deploy application revisions to one instance at a
     * time ( `CodeDeployDefault.OneAtATime` ), half of the instances at a time (
     * `CodeDeployDefault.HalfAtATime` ), or all the instances at once ( `CodeDeployDefault.AllAtOnce`
     * ). For more information and valid values, see [Working with Deployment
     * Configurations](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname)
     * @param deploymentConfigName A deployment configuration name or a predefined configuration
     * name. 
     */
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * A name for the deployment group.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the deployment group name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname)
     * @param deploymentGroupName A name for the deployment group. 
     */
    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    /**
     * Attributes that determine the type of deployment to run and whether to route deployment
     * traffic behind a load balancer.
     *
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer. 
     */
    override fun deploymentStyle(deploymentStyle: IResolvable) {
      cdkBuilder.deploymentStyle(deploymentStyle.let(IResolvable::unwrap))
    }

    /**
     * Attributes that determine the type of deployment to run and whether to route deployment
     * traffic behind a load balancer.
     *
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer. 
     */
    override fun deploymentStyle(deploymentStyle: DeploymentStyleProperty) {
      cdkBuilder.deploymentStyle(deploymentStyle.let(DeploymentStyleProperty::unwrap))
    }

    /**
     * Attributes that determine the type of deployment to run and whether to route deployment
     * traffic behind a load balancer.
     *
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82d29e4efa135c378ca780a21a52f1ba7ea5f1da54cdc238ff026427ece0c8c8")
    override fun deploymentStyle(deploymentStyle: DeploymentStyleProperty.Builder.() -> Unit): Unit
        = deploymentStyle(DeploymentStyleProperty(deploymentStyle))

    /**
     * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
     * in the deployment group.
     *
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group. 
     */
    override fun ec2TagFilters(ec2TagFilters: IResolvable) {
      cdkBuilder.ec2TagFilters(ec2TagFilters.let(IResolvable::unwrap))
    }

    /**
     * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
     * in the deployment group.
     *
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group. 
     */
    override fun ec2TagFilters(ec2TagFilters: List<Any>) {
      cdkBuilder.ec2TagFilters(ec2TagFilters)
    }

    /**
     * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
     * in the deployment group.
     *
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group. 
     */
    override fun ec2TagFilters(vararg ec2TagFilters: Any): Unit =
        ec2TagFilters(ec2TagFilters.toList())

    /**
     * Information about groups of tags applied to Amazon EC2 instances.
     *
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagset)
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances. 
     */
    override fun ec2TagSet(ec2TagSet: IResolvable) {
      cdkBuilder.ec2TagSet(ec2TagSet.let(IResolvable::unwrap))
    }

    /**
     * Information about groups of tags applied to Amazon EC2 instances.
     *
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagset)
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances. 
     */
    override fun ec2TagSet(ec2TagSet: EC2TagSetProperty) {
      cdkBuilder.ec2TagSet(ec2TagSet.let(EC2TagSetProperty::unwrap))
    }

    /**
     * Information about groups of tags applied to Amazon EC2 instances.
     *
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagset)
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c9cb0f0ac28a72197332b33fb3086c02ca7060e3054dd113da761ba1cc806cf")
    override fun ec2TagSet(ec2TagSet: EC2TagSetProperty.Builder.() -> Unit): Unit =
        ec2TagSet(EC2TagSetProperty(ec2TagSet))

    /**
     * The target Amazon ECS services in the deployment group.
     *
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
     * @param ecsServices The target Amazon ECS services in the deployment group. 
     */
    override fun ecsServices(ecsServices: IResolvable) {
      cdkBuilder.ecsServices(ecsServices.let(IResolvable::unwrap))
    }

    /**
     * The target Amazon ECS services in the deployment group.
     *
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
     * @param ecsServices The target Amazon ECS services in the deployment group. 
     */
    override fun ecsServices(ecsServices: List<Any>) {
      cdkBuilder.ecsServices(ecsServices)
    }

    /**
     * The target Amazon ECS services in the deployment group.
     *
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
     * @param ecsServices The target Amazon ECS services in the deployment group. 
     */
    override fun ecsServices(vararg ecsServices: Any): Unit = ecsServices(ecsServices.toList())

    /**
     * Information about the load balancer to use in a deployment.
     *
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
     * @param loadBalancerInfo Information about the load balancer to use in a deployment. 
     */
    override fun loadBalancerInfo(loadBalancerInfo: IResolvable) {
      cdkBuilder.loadBalancerInfo(loadBalancerInfo.let(IResolvable::unwrap))
    }

    /**
     * Information about the load balancer to use in a deployment.
     *
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
     * @param loadBalancerInfo Information about the load balancer to use in a deployment. 
     */
    override fun loadBalancerInfo(loadBalancerInfo: LoadBalancerInfoProperty) {
      cdkBuilder.loadBalancerInfo(loadBalancerInfo.let(LoadBalancerInfoProperty::unwrap))
    }

    /**
     * Information about the load balancer to use in a deployment.
     *
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
     * @param loadBalancerInfo Information about the load balancer to use in a deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63ea21af9e88672f0b3f438512b6a6822f34dcad7b1d768041196d4793cb77c2")
    override fun loadBalancerInfo(loadBalancerInfo: LoadBalancerInfoProperty.Builder.() -> Unit):
        Unit = loadBalancerInfo(LoadBalancerInfoProperty(loadBalancerInfo))

    /**
     * The on-premises instance tags already applied to on-premises instances that you want to
     * include in the deployment group.
     *
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group. 
     */
    override fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: IResolvable) {
      cdkBuilder.onPremisesInstanceTagFilters(onPremisesInstanceTagFilters.let(IResolvable::unwrap))
    }

    /**
     * The on-premises instance tags already applied to on-premises instances that you want to
     * include in the deployment group.
     *
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group. 
     */
    override fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: List<Any>) {
      cdkBuilder.onPremisesInstanceTagFilters(onPremisesInstanceTagFilters)
    }

    /**
     * The on-premises instance tags already applied to on-premises instances that you want to
     * include in the deployment group.
     *
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group. 
     */
    override fun onPremisesInstanceTagFilters(vararg onPremisesInstanceTagFilters: Any): Unit =
        onPremisesInstanceTagFilters(onPremisesInstanceTagFilters.toList())

    /**
     * Information about groups of tags applied to on-premises instances.
     *
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisestagset)
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances. 
     */
    override fun onPremisesTagSet(onPremisesTagSet: IResolvable) {
      cdkBuilder.onPremisesTagSet(onPremisesTagSet.let(IResolvable::unwrap))
    }

    /**
     * Information about groups of tags applied to on-premises instances.
     *
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisestagset)
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances. 
     */
    override fun onPremisesTagSet(onPremisesTagSet: OnPremisesTagSetProperty) {
      cdkBuilder.onPremisesTagSet(onPremisesTagSet.let(OnPremisesTagSetProperty::unwrap))
    }

    /**
     * Information about groups of tags applied to on-premises instances.
     *
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisestagset)
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46ec1715e6a5b2ceb83f042d6b64ce3eaa0be7b5d73543e2c05f1e81bfc056b1")
    override fun onPremisesTagSet(onPremisesTagSet: OnPremisesTagSetProperty.Builder.() -> Unit):
        Unit = onPremisesTagSet(OnPremisesTagSetProperty(onPremisesTagSet))

    /**
     * Indicates what happens when new Amazon EC2 instances are launched mid-deployment and do not
     * receive the deployed application revision.
     *
     * If this option is set to `UPDATE` or is unspecified, CodeDeploy initiates one or more
     * 'auto-update outdated instances' deployments to apply the deployed application revision to the
     * new Amazon EC2 instances.
     *
     * If this option is set to `IGNORE` , CodeDeploy does not initiate a deployment to update the
     * new Amazon EC2 instances. This may result in instances having different revisions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-outdatedinstancesstrategy)
     * @param outdatedInstancesStrategy Indicates what happens when new Amazon EC2 instances are
     * launched mid-deployment and do not receive the deployed application revision. 
     */
    override fun outdatedInstancesStrategy(outdatedInstancesStrategy: String) {
      cdkBuilder.outdatedInstancesStrategy(outdatedInstancesStrategy)
    }

    /**
     * A service role Amazon Resource Name (ARN) that grants CodeDeploy permission to make calls to
     * AWS services on your behalf.
     *
     * For more information, see [Create a Service Role for AWS
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     *
     * In some cases, you might need to add a dependency on the service role's policy. For more
     * information, see IAM role policy in [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn)
     * @param serviceRoleArn A service role Amazon Resource Name (ARN) that grants CodeDeploy
     * permission to make calls to AWS services on your behalf. 
     */
    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * The metadata that you apply to CodeDeploy deployment groups to help you organize and
     * categorize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-tags)
     * @param tags The metadata that you apply to CodeDeploy deployment groups to help you organize
     * and categorize them. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The metadata that you apply to CodeDeploy deployment groups to help you organize and
     * categorize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-tags)
     * @param tags The metadata that you apply to CodeDeploy deployment groups to help you organize
     * and categorize them. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Indicates whether the deployment group was configured to have CodeDeploy install a
     * termination hook into an Auto Scaling group.
     *
     * For more information about the termination hook, see [How Amazon EC2 Auto Scaling works with
     * CodeDeploy](https://docs.aws.amazon.com//codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-terminationhookenabled)
     * @param terminationHookEnabled Indicates whether the deployment group was configured to have
     * CodeDeploy install a termination hook into an Auto Scaling group. 
     */
    override fun terminationHookEnabled(terminationHookEnabled: Boolean) {
      cdkBuilder.terminationHookEnabled(terminationHookEnabled)
    }

    /**
     * Indicates whether the deployment group was configured to have CodeDeploy install a
     * termination hook into an Auto Scaling group.
     *
     * For more information about the termination hook, see [How Amazon EC2 Auto Scaling works with
     * CodeDeploy](https://docs.aws.amazon.com//codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-terminationhookenabled)
     * @param terminationHookEnabled Indicates whether the deployment group was configured to have
     * CodeDeploy install a termination hook into an Auto Scaling group. 
     */
    override fun terminationHookEnabled(terminationHookEnabled: IResolvable) {
      cdkBuilder.terminationHookEnabled(terminationHookEnabled.let(IResolvable::unwrap))
    }

    /**
     * Information about triggers associated with the deployment group.
     *
     * Duplicates are not allowed
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * 
     */
    override fun triggerConfigurations(triggerConfigurations: IResolvable) {
      cdkBuilder.triggerConfigurations(triggerConfigurations.let(IResolvable::unwrap))
    }

    /**
     * Information about triggers associated with the deployment group.
     *
     * Duplicates are not allowed
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * 
     */
    override fun triggerConfigurations(triggerConfigurations: List<Any>) {
      cdkBuilder.triggerConfigurations(triggerConfigurations)
    }

    /**
     * Information about triggers associated with the deployment group.
     *
     * Duplicates are not allowed
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * 
     */
    override fun triggerConfigurations(vararg triggerConfigurations: Any): Unit =
        triggerConfigurations(triggerConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeploymentGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeploymentGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup):
        CfnDeploymentGroup = CfnDeploymentGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup = wrapped.cdkObject
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface AlarmConfigurationProperty {
    /**
     * A list of alarms configured for the deployment or deployment group.
     *
     * A maximum of 10 alarms can be added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-alarms)
     */
    public fun alarms(): Any? = unwrap(this).getAlarms()

    /**
     * Indicates whether the alarm configuration is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Indicates whether a deployment should continue if information about the current state of
     * alarms cannot be retrieved from Amazon CloudWatch .
     *
     * The default value is `false` .
     *
     * * `true` : The deployment proceeds even if alarm status information can't be retrieved from
     * CloudWatch .
     * * `false` : The deployment stops if alarm status information can't be retrieved from
     * CloudWatch .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-ignorepollalarmfailure)
     */
    public fun ignorePollAlarmFailure(): Any? = unwrap(this).getIgnorePollAlarmFailure()

    /**
     * A builder for [AlarmConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarms A list of alarms configured for the deployment or deployment group.
       * A maximum of 10 alarms can be added.
       */
      public fun alarms(alarms: IResolvable)

      /**
       * @param alarms A list of alarms configured for the deployment or deployment group.
       * A maximum of 10 alarms can be added.
       */
      public fun alarms(alarms: List<Any>)

      /**
       * @param alarms A list of alarms configured for the deployment or deployment group.
       * A maximum of 10 alarms can be added.
       */
      public fun alarms(vararg alarms: Any)

      /**
       * @param enabled Indicates whether the alarm configuration is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether the alarm configuration is enabled.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param ignorePollAlarmFailure Indicates whether a deployment should continue if information
       * about the current state of alarms cannot be retrieved from Amazon CloudWatch .
       * The default value is `false` .
       *
       * * `true` : The deployment proceeds even if alarm status information can't be retrieved from
       * CloudWatch .
       * * `false` : The deployment stops if alarm status information can't be retrieved from
       * CloudWatch .
       */
      public fun ignorePollAlarmFailure(ignorePollAlarmFailure: Boolean)

      /**
       * @param ignorePollAlarmFailure Indicates whether a deployment should continue if information
       * about the current state of alarms cannot be retrieved from Amazon CloudWatch .
       * The default value is `false` .
       *
       * * `true` : The deployment proceeds even if alarm status information can't be retrieved from
       * CloudWatch .
       * * `false` : The deployment stops if alarm status information can't be retrieved from
       * CloudWatch .
       */
      public fun ignorePollAlarmFailure(ignorePollAlarmFailure: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty.builder()

      /**
       * @param alarms A list of alarms configured for the deployment or deployment group.
       * A maximum of 10 alarms can be added.
       */
      override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable::unwrap))
      }

      /**
       * @param alarms A list of alarms configured for the deployment or deployment group.
       * A maximum of 10 alarms can be added.
       */
      override fun alarms(alarms: List<Any>) {
        cdkBuilder.alarms(alarms)
      }

      /**
       * @param alarms A list of alarms configured for the deployment or deployment group.
       * A maximum of 10 alarms can be added.
       */
      override fun alarms(vararg alarms: Any): Unit = alarms(alarms.toList())

      /**
       * @param enabled Indicates whether the alarm configuration is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether the alarm configuration is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param ignorePollAlarmFailure Indicates whether a deployment should continue if information
       * about the current state of alarms cannot be retrieved from Amazon CloudWatch .
       * The default value is `false` .
       *
       * * `true` : The deployment proceeds even if alarm status information can't be retrieved from
       * CloudWatch .
       * * `false` : The deployment stops if alarm status information can't be retrieved from
       * CloudWatch .
       */
      override fun ignorePollAlarmFailure(ignorePollAlarmFailure: Boolean) {
        cdkBuilder.ignorePollAlarmFailure(ignorePollAlarmFailure)
      }

      /**
       * @param ignorePollAlarmFailure Indicates whether a deployment should continue if information
       * about the current state of alarms cannot be retrieved from Amazon CloudWatch .
       * The default value is `false` .
       *
       * * `true` : The deployment proceeds even if alarm status information can't be retrieved from
       * CloudWatch .
       * * `false` : The deployment stops if alarm status information can't be retrieved from
       * CloudWatch .
       */
      override fun ignorePollAlarmFailure(ignorePollAlarmFailure: IResolvable) {
        cdkBuilder.ignorePollAlarmFailure(ignorePollAlarmFailure.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty,
    ) : CdkObject(cdkObject), AlarmConfigurationProperty {
      /**
       * A list of alarms configured for the deployment or deployment group.
       *
       * A maximum of 10 alarms can be added.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-alarms)
       */
      override fun alarms(): Any? = unwrap(this).getAlarms()

      /**
       * Indicates whether the alarm configuration is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Indicates whether a deployment should continue if information about the current state of
       * alarms cannot be retrieved from Amazon CloudWatch .
       *
       * The default value is `false` .
       *
       * * `true` : The deployment proceeds even if alarm status information can't be retrieved from
       * CloudWatch .
       * * `false` : The deployment stops if alarm status information can't be retrieved from
       * CloudWatch .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-ignorepollalarmfailure)
       */
      override fun ignorePollAlarmFailure(): Any? = unwrap(this).getIgnorePollAlarmFailure()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty):
          AlarmConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AlarmConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmConfigurationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * AlarmProperty alarmProperty = AlarmProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarm.html)
   */
  public interface AlarmProperty {
    /**
     * The name of the alarm.
     *
     * Maximum length is 255 characters. Each alarm name can be used only once in a list of alarms.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarm.html#cfn-codedeploy-deploymentgroup-alarm-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [AlarmProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the alarm.
       * Maximum length is 255 characters. Each alarm name can be used only once in a list of
       * alarms.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty.builder()

      /**
       * @param name The name of the alarm.
       * Maximum length is 255 characters. Each alarm name can be used only once in a list of
       * alarms.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty,
    ) : CdkObject(cdkObject), AlarmProperty {
      /**
       * The name of the alarm.
       *
       * Maximum length is 255 characters. Each alarm name can be used only once in a list of
       * alarms.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarm.html#cfn-codedeploy-deploymentgroup-alarm-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty):
          AlarmProperty = CdkObjectWrappers.wrap(cdkObject) as? AlarmProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * AutoRollbackConfigurationProperty autoRollbackConfigurationProperty =
   * AutoRollbackConfigurationProperty.builder()
   * .enabled(false)
   * .events(List.of("events"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html)
   */
  public interface AutoRollbackConfigurationProperty {
    /**
     * Indicates whether a defined automatic rollback configuration is currently enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The event type or types that trigger a rollback.
     *
     * Valid values are `DEPLOYMENT_FAILURE` , `DEPLOYMENT_STOP_ON_ALARM` , or
     * `DEPLOYMENT_STOP_ON_REQUEST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-events)
     */
    public fun events(): List<String> = unwrap(this).getEvents() ?: emptyList()

    /**
     * A builder for [AutoRollbackConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether a defined automatic rollback configuration is currently
       * enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether a defined automatic rollback configuration is currently
       * enabled.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param events The event type or types that trigger a rollback.
       * Valid values are `DEPLOYMENT_FAILURE` , `DEPLOYMENT_STOP_ON_ALARM` , or
       * `DEPLOYMENT_STOP_ON_REQUEST` .
       */
      public fun events(events: List<String>)

      /**
       * @param events The event type or types that trigger a rollback.
       * Valid values are `DEPLOYMENT_FAILURE` , `DEPLOYMENT_STOP_ON_ALARM` , or
       * `DEPLOYMENT_STOP_ON_REQUEST` .
       */
      public fun events(vararg events: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty.builder()

      /**
       * @param enabled Indicates whether a defined automatic rollback configuration is currently
       * enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether a defined automatic rollback configuration is currently
       * enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param events The event type or types that trigger a rollback.
       * Valid values are `DEPLOYMENT_FAILURE` , `DEPLOYMENT_STOP_ON_ALARM` , or
       * `DEPLOYMENT_STOP_ON_REQUEST` .
       */
      override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      /**
       * @param events The event type or types that trigger a rollback.
       * Valid values are `DEPLOYMENT_FAILURE` , `DEPLOYMENT_STOP_ON_ALARM` , or
       * `DEPLOYMENT_STOP_ON_REQUEST` .
       */
      override fun events(vararg events: String): Unit = events(events.toList())

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty,
    ) : CdkObject(cdkObject), AutoRollbackConfigurationProperty {
      /**
       * Indicates whether a defined automatic rollback configuration is currently enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The event type or types that trigger a rollback.
       *
       * Valid values are `DEPLOYMENT_FAILURE` , `DEPLOYMENT_STOP_ON_ALARM` , or
       * `DEPLOYMENT_STOP_ON_REQUEST` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-events)
       */
      override fun events(): List<String> = unwrap(this).getEvents() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AutoRollbackConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty):
          AutoRollbackConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoRollbackConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoRollbackConfigurationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty
    }
  }

  /**
   * Information about blue/green deployment options for a deployment group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface BlueGreenDeploymentConfigurationProperty {
    /**
     * Information about the action to take when newly provisioned instances are ready to receive
     * traffic in a blue/green deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration-deploymentreadyoption)
     */
    public fun deploymentReadyOption(): Any? = unwrap(this).getDeploymentReadyOption()

    /**
     * Information about how instances are provisioned for a replacement environment in a blue/green
     * deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration-greenfleetprovisioningoption)
     */
    public fun greenFleetProvisioningOption(): Any? = unwrap(this).getGreenFleetProvisioningOption()

    /**
     * Information about whether to terminate instances in the original fleet during a blue/green
     * deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration-terminateblueinstancesondeploymentsuccess)
     */
    public fun terminateBlueInstancesOnDeploymentSuccess(): Any? =
        unwrap(this).getTerminateBlueInstancesOnDeploymentSuccess()

    /**
     * A builder for [BlueGreenDeploymentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deploymentReadyOption Information about the action to take when newly provisioned
       * instances are ready to receive traffic in a blue/green deployment.
       */
      public fun deploymentReadyOption(deploymentReadyOption: IResolvable)

      /**
       * @param deploymentReadyOption Information about the action to take when newly provisioned
       * instances are ready to receive traffic in a blue/green deployment.
       */
      public fun deploymentReadyOption(deploymentReadyOption: DeploymentReadyOptionProperty)

      /**
       * @param deploymentReadyOption Information about the action to take when newly provisioned
       * instances are ready to receive traffic in a blue/green deployment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94fd38533a579b18b2932fd6cd2473c7f0f5503d4af57771ec94b7e3eb523df9")
      public
          fun deploymentReadyOption(deploymentReadyOption: DeploymentReadyOptionProperty.Builder.() -> Unit)

      /**
       * @param greenFleetProvisioningOption Information about how instances are provisioned for a
       * replacement environment in a blue/green deployment.
       */
      public fun greenFleetProvisioningOption(greenFleetProvisioningOption: IResolvable)

      /**
       * @param greenFleetProvisioningOption Information about how instances are provisioned for a
       * replacement environment in a blue/green deployment.
       */
      public
          fun greenFleetProvisioningOption(greenFleetProvisioningOption: GreenFleetProvisioningOptionProperty)

      /**
       * @param greenFleetProvisioningOption Information about how instances are provisioned for a
       * replacement environment in a blue/green deployment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa08960f311ab9873f554622000e02a9e86129169233ab7e11b3d1b3dd25f300")
      public
          fun greenFleetProvisioningOption(greenFleetProvisioningOption: GreenFleetProvisioningOptionProperty.Builder.() -> Unit)

      /**
       * @param terminateBlueInstancesOnDeploymentSuccess Information about whether to terminate
       * instances in the original fleet during a blue/green deployment.
       */
      public
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: IResolvable)

      /**
       * @param terminateBlueInstancesOnDeploymentSuccess Information about whether to terminate
       * instances in the original fleet during a blue/green deployment.
       */
      public
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: BlueInstanceTerminationOptionProperty)

      /**
       * @param terminateBlueInstancesOnDeploymentSuccess Information about whether to terminate
       * instances in the original fleet during a blue/green deployment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d837d5a1865736ccd468047f8eae8902590024efc7b5ae8866c2d4a91ddae40a")
      public
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: BlueInstanceTerminationOptionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.builder()

      /**
       * @param deploymentReadyOption Information about the action to take when newly provisioned
       * instances are ready to receive traffic in a blue/green deployment.
       */
      override fun deploymentReadyOption(deploymentReadyOption: IResolvable) {
        cdkBuilder.deploymentReadyOption(deploymentReadyOption.let(IResolvable::unwrap))
      }

      /**
       * @param deploymentReadyOption Information about the action to take when newly provisioned
       * instances are ready to receive traffic in a blue/green deployment.
       */
      override fun deploymentReadyOption(deploymentReadyOption: DeploymentReadyOptionProperty) {
        cdkBuilder.deploymentReadyOption(deploymentReadyOption.let(DeploymentReadyOptionProperty::unwrap))
      }

      /**
       * @param deploymentReadyOption Information about the action to take when newly provisioned
       * instances are ready to receive traffic in a blue/green deployment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94fd38533a579b18b2932fd6cd2473c7f0f5503d4af57771ec94b7e3eb523df9")
      override
          fun deploymentReadyOption(deploymentReadyOption: DeploymentReadyOptionProperty.Builder.() -> Unit):
          Unit = deploymentReadyOption(DeploymentReadyOptionProperty(deploymentReadyOption))

      /**
       * @param greenFleetProvisioningOption Information about how instances are provisioned for a
       * replacement environment in a blue/green deployment.
       */
      override fun greenFleetProvisioningOption(greenFleetProvisioningOption: IResolvable) {
        cdkBuilder.greenFleetProvisioningOption(greenFleetProvisioningOption.let(IResolvable::unwrap))
      }

      /**
       * @param greenFleetProvisioningOption Information about how instances are provisioned for a
       * replacement environment in a blue/green deployment.
       */
      override
          fun greenFleetProvisioningOption(greenFleetProvisioningOption: GreenFleetProvisioningOptionProperty) {
        cdkBuilder.greenFleetProvisioningOption(greenFleetProvisioningOption.let(GreenFleetProvisioningOptionProperty::unwrap))
      }

      /**
       * @param greenFleetProvisioningOption Information about how instances are provisioned for a
       * replacement environment in a blue/green deployment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa08960f311ab9873f554622000e02a9e86129169233ab7e11b3d1b3dd25f300")
      override
          fun greenFleetProvisioningOption(greenFleetProvisioningOption: GreenFleetProvisioningOptionProperty.Builder.() -> Unit):
          Unit =
          greenFleetProvisioningOption(GreenFleetProvisioningOptionProperty(greenFleetProvisioningOption))

      /**
       * @param terminateBlueInstancesOnDeploymentSuccess Information about whether to terminate
       * instances in the original fleet during a blue/green deployment.
       */
      override
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: IResolvable) {
        cdkBuilder.terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess.let(IResolvable::unwrap))
      }

      /**
       * @param terminateBlueInstancesOnDeploymentSuccess Information about whether to terminate
       * instances in the original fleet during a blue/green deployment.
       */
      override
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: BlueInstanceTerminationOptionProperty) {
        cdkBuilder.terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess.let(BlueInstanceTerminationOptionProperty::unwrap))
      }

      /**
       * @param terminateBlueInstancesOnDeploymentSuccess Information about whether to terminate
       * instances in the original fleet during a blue/green deployment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d837d5a1865736ccd468047f8eae8902590024efc7b5ae8866c2d4a91ddae40a")
      override
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: BlueInstanceTerminationOptionProperty.Builder.() -> Unit):
          Unit =
          terminateBlueInstancesOnDeploymentSuccess(BlueInstanceTerminationOptionProperty(terminateBlueInstancesOnDeploymentSuccess))

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty,
    ) : CdkObject(cdkObject), BlueGreenDeploymentConfigurationProperty {
      /**
       * Information about the action to take when newly provisioned instances are ready to receive
       * traffic in a blue/green deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration-deploymentreadyoption)
       */
      override fun deploymentReadyOption(): Any? = unwrap(this).getDeploymentReadyOption()

      /**
       * Information about how instances are provisioned for a replacement environment in a
       * blue/green deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration-greenfleetprovisioningoption)
       */
      override fun greenFleetProvisioningOption(): Any? =
          unwrap(this).getGreenFleetProvisioningOption()

      /**
       * Information about whether to terminate instances in the original fleet during a blue/green
       * deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration-terminateblueinstancesondeploymentsuccess)
       */
      override fun terminateBlueInstancesOnDeploymentSuccess(): Any? =
          unwrap(this).getTerminateBlueInstancesOnDeploymentSuccess()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BlueGreenDeploymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty):
          BlueGreenDeploymentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BlueGreenDeploymentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlueGreenDeploymentConfigurationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * BlueInstanceTerminationOptionProperty blueInstanceTerminationOptionProperty =
   * BlueInstanceTerminationOptionProperty.builder()
   * .action("action")
   * .terminationWaitTimeInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-blueinstanceterminationoption.html)
   */
  public interface BlueInstanceTerminationOptionProperty {
    /**
     * The action to take on instances in the original environment after a successful blue/green
     * deployment.
     *
     * * `TERMINATE` : Instances are terminated after a specified wait time.
     * * `KEEP_ALIVE` : Instances are left running after they are deregistered from the load
     * balancer and removed from the deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-blueinstanceterminationoption.html#cfn-codedeploy-deploymentgroup-blueinstanceterminationoption-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * For an Amazon EC2 deployment, the number of minutes to wait after a successful blue/green
     * deployment before terminating instances from the original environment.
     *
     * For an Amazon ECS deployment, the number of minutes before deleting the original (blue) task
     * set. During an Amazon ECS deployment, CodeDeploy shifts traffic from the original (blue) task
     * set to a replacement (green) task set.
     *
     * The maximum setting is 2880 minutes (2 days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-blueinstanceterminationoption.html#cfn-codedeploy-deploymentgroup-blueinstanceterminationoption-terminationwaittimeinminutes)
     */
    public fun terminationWaitTimeInMinutes(): Number? =
        unwrap(this).getTerminationWaitTimeInMinutes()

    /**
     * A builder for [BlueInstanceTerminationOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action to take on instances in the original environment after a
       * successful blue/green deployment.
       * * `TERMINATE` : Instances are terminated after a specified wait time.
       * * `KEEP_ALIVE` : Instances are left running after they are deregistered from the load
       * balancer and removed from the deployment group.
       */
      public fun action(action: String)

      /**
       * @param terminationWaitTimeInMinutes For an Amazon EC2 deployment, the number of minutes to
       * wait after a successful blue/green deployment before terminating instances from the original
       * environment.
       * For an Amazon ECS deployment, the number of minutes before deleting the original (blue)
       * task set. During an Amazon ECS deployment, CodeDeploy shifts traffic from the original (blue)
       * task set to a replacement (green) task set.
       *
       * The maximum setting is 2880 minutes (2 days).
       */
      public fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.builder()

      /**
       * @param action The action to take on instances in the original environment after a
       * successful blue/green deployment.
       * * `TERMINATE` : Instances are terminated after a specified wait time.
       * * `KEEP_ALIVE` : Instances are left running after they are deregistered from the load
       * balancer and removed from the deployment group.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param terminationWaitTimeInMinutes For an Amazon EC2 deployment, the number of minutes to
       * wait after a successful blue/green deployment before terminating instances from the original
       * environment.
       * For an Amazon ECS deployment, the number of minutes before deleting the original (blue)
       * task set. During an Amazon ECS deployment, CodeDeploy shifts traffic from the original (blue)
       * task set to a replacement (green) task set.
       *
       * The maximum setting is 2880 minutes (2 days).
       */
      override fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number) {
        cdkBuilder.terminationWaitTimeInMinutes(terminationWaitTimeInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty,
    ) : CdkObject(cdkObject), BlueInstanceTerminationOptionProperty {
      /**
       * The action to take on instances in the original environment after a successful blue/green
       * deployment.
       *
       * * `TERMINATE` : Instances are terminated after a specified wait time.
       * * `KEEP_ALIVE` : Instances are left running after they are deregistered from the load
       * balancer and removed from the deployment group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-blueinstanceterminationoption.html#cfn-codedeploy-deploymentgroup-blueinstanceterminationoption-action)
       */
      override fun action(): String? = unwrap(this).getAction()

      /**
       * For an Amazon EC2 deployment, the number of minutes to wait after a successful blue/green
       * deployment before terminating instances from the original environment.
       *
       * For an Amazon ECS deployment, the number of minutes before deleting the original (blue)
       * task set. During an Amazon ECS deployment, CodeDeploy shifts traffic from the original (blue)
       * task set to a replacement (green) task set.
       *
       * The maximum setting is 2880 minutes (2 days).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-blueinstanceterminationoption.html#cfn-codedeploy-deploymentgroup-blueinstanceterminationoption-terminationwaittimeinminutes)
       */
      override fun terminationWaitTimeInMinutes(): Number? =
          unwrap(this).getTerminationWaitTimeInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BlueInstanceTerminationOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty):
          BlueInstanceTerminationOptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BlueInstanceTerminationOptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlueInstanceTerminationOptionProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface DeploymentProperty {
    /**
     * A comment about the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-codedeploy-deploymentgroup-deployment-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * If true, then if an `ApplicationStop` , `BeforeBlockTraffic` , or `AfterBlockTraffic`
     * deployment lifecycle event to an instance fails, then the deployment continues to the next
     * deployment lifecycle event.
     *
     * For example, if `ApplicationStop` fails, the deployment continues with DownloadBundle. If
     * `BeforeBlockTraffic` fails, the deployment continues with `BlockTraffic` . If
     * `AfterBlockTraffic` fails, the deployment continues with `ApplicationStop` .
     *
     * If false or not specified, then if a lifecycle event fails during a deployment to an
     * instance, that deployment fails. If deployment to that instance is part of an overall deployment
     * and the number of healthy hosts is not less than the minimum number of healthy hosts, then a
     * deployment to the next instance is attempted.
     *
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified for
     * `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` in the AppSpec file from the
     * previous successful deployment. (All other scripts are run from the AppSpec file in the current
     * deployment.) If one of these scripts contains an error and does not run successfully, the
     * deployment can fail.
     *
     * If the cause of the failure is a script from the last successful deployment that will never
     * run successfully, create a new deployment and use `ignoreApplicationStopFailures` to specify
     * that the `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` failures should be
     * ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-codedeploy-deploymentgroup-deployment-ignoreapplicationstopfailures)
     */
    public fun ignoreApplicationStopFailures(): Any? =
        unwrap(this).getIgnoreApplicationStopFailures()

    /**
     * Information about the location of stored application artifacts and the service from which to
     * retrieve them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-codedeploy-deploymentgroup-deployment-revision)
     */
    public fun revision(): Any

    /**
     * A builder for [DeploymentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A comment about the deployment.
       */
      public fun description(description: String)

      /**
       * @param ignoreApplicationStopFailures If true, then if an `ApplicationStop` ,
       * `BeforeBlockTraffic` , or `AfterBlockTraffic` deployment lifecycle event to an instance fails,
       * then the deployment continues to the next deployment lifecycle event.
       * For example, if `ApplicationStop` fails, the deployment continues with DownloadBundle. If
       * `BeforeBlockTraffic` fails, the deployment continues with `BlockTraffic` . If
       * `AfterBlockTraffic` fails, the deployment continues with `ApplicationStop` .
       *
       * If false or not specified, then if a lifecycle event fails during a deployment to an
       * instance, that deployment fails. If deployment to that instance is part of an overall
       * deployment and the number of healthy hosts is not less than the minimum number of healthy
       * hosts, then a deployment to the next instance is attempted.
       *
       * During a deployment, the AWS CodeDeploy agent runs the scripts specified for
       * `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` in the AppSpec file from
       * the previous successful deployment. (All other scripts are run from the AppSpec file in the
       * current deployment.) If one of these scripts contains an error and does not run successfully,
       * the deployment can fail.
       *
       * If the cause of the failure is a script from the last successful deployment that will never
       * run successfully, create a new deployment and use `ignoreApplicationStopFailures` to specify
       * that the `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` failures should be
       * ignored.
       */
      public fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: Boolean)

      /**
       * @param ignoreApplicationStopFailures If true, then if an `ApplicationStop` ,
       * `BeforeBlockTraffic` , or `AfterBlockTraffic` deployment lifecycle event to an instance fails,
       * then the deployment continues to the next deployment lifecycle event.
       * For example, if `ApplicationStop` fails, the deployment continues with DownloadBundle. If
       * `BeforeBlockTraffic` fails, the deployment continues with `BlockTraffic` . If
       * `AfterBlockTraffic` fails, the deployment continues with `ApplicationStop` .
       *
       * If false or not specified, then if a lifecycle event fails during a deployment to an
       * instance, that deployment fails. If deployment to that instance is part of an overall
       * deployment and the number of healthy hosts is not less than the minimum number of healthy
       * hosts, then a deployment to the next instance is attempted.
       *
       * During a deployment, the AWS CodeDeploy agent runs the scripts specified for
       * `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` in the AppSpec file from
       * the previous successful deployment. (All other scripts are run from the AppSpec file in the
       * current deployment.) If one of these scripts contains an error and does not run successfully,
       * the deployment can fail.
       *
       * If the cause of the failure is a script from the last successful deployment that will never
       * run successfully, create a new deployment and use `ignoreApplicationStopFailures` to specify
       * that the `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` failures should be
       * ignored.
       */
      public fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: IResolvable)

      /**
       * @param revision Information about the location of stored application artifacts and the
       * service from which to retrieve them. 
       */
      public fun revision(revision: IResolvable)

      /**
       * @param revision Information about the location of stored application artifacts and the
       * service from which to retrieve them. 
       */
      public fun revision(revision: RevisionLocationProperty)

      /**
       * @param revision Information about the location of stored application artifacts and the
       * service from which to retrieve them. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42d0c4385c21c785d3bb3c83d15d69dd0221a2a61b2cbfbf3fe8ff4afe3c4eaa")
      public fun revision(revision: RevisionLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty.builder()

      /**
       * @param description A comment about the deployment.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param ignoreApplicationStopFailures If true, then if an `ApplicationStop` ,
       * `BeforeBlockTraffic` , or `AfterBlockTraffic` deployment lifecycle event to an instance fails,
       * then the deployment continues to the next deployment lifecycle event.
       * For example, if `ApplicationStop` fails, the deployment continues with DownloadBundle. If
       * `BeforeBlockTraffic` fails, the deployment continues with `BlockTraffic` . If
       * `AfterBlockTraffic` fails, the deployment continues with `ApplicationStop` .
       *
       * If false or not specified, then if a lifecycle event fails during a deployment to an
       * instance, that deployment fails. If deployment to that instance is part of an overall
       * deployment and the number of healthy hosts is not less than the minimum number of healthy
       * hosts, then a deployment to the next instance is attempted.
       *
       * During a deployment, the AWS CodeDeploy agent runs the scripts specified for
       * `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` in the AppSpec file from
       * the previous successful deployment. (All other scripts are run from the AppSpec file in the
       * current deployment.) If one of these scripts contains an error and does not run successfully,
       * the deployment can fail.
       *
       * If the cause of the failure is a script from the last successful deployment that will never
       * run successfully, create a new deployment and use `ignoreApplicationStopFailures` to specify
       * that the `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` failures should be
       * ignored.
       */
      override fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: Boolean) {
        cdkBuilder.ignoreApplicationStopFailures(ignoreApplicationStopFailures)
      }

      /**
       * @param ignoreApplicationStopFailures If true, then if an `ApplicationStop` ,
       * `BeforeBlockTraffic` , or `AfterBlockTraffic` deployment lifecycle event to an instance fails,
       * then the deployment continues to the next deployment lifecycle event.
       * For example, if `ApplicationStop` fails, the deployment continues with DownloadBundle. If
       * `BeforeBlockTraffic` fails, the deployment continues with `BlockTraffic` . If
       * `AfterBlockTraffic` fails, the deployment continues with `ApplicationStop` .
       *
       * If false or not specified, then if a lifecycle event fails during a deployment to an
       * instance, that deployment fails. If deployment to that instance is part of an overall
       * deployment and the number of healthy hosts is not less than the minimum number of healthy
       * hosts, then a deployment to the next instance is attempted.
       *
       * During a deployment, the AWS CodeDeploy agent runs the scripts specified for
       * `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` in the AppSpec file from
       * the previous successful deployment. (All other scripts are run from the AppSpec file in the
       * current deployment.) If one of these scripts contains an error and does not run successfully,
       * the deployment can fail.
       *
       * If the cause of the failure is a script from the last successful deployment that will never
       * run successfully, create a new deployment and use `ignoreApplicationStopFailures` to specify
       * that the `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` failures should be
       * ignored.
       */
      override fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: IResolvable) {
        cdkBuilder.ignoreApplicationStopFailures(ignoreApplicationStopFailures.let(IResolvable::unwrap))
      }

      /**
       * @param revision Information about the location of stored application artifacts and the
       * service from which to retrieve them. 
       */
      override fun revision(revision: IResolvable) {
        cdkBuilder.revision(revision.let(IResolvable::unwrap))
      }

      /**
       * @param revision Information about the location of stored application artifacts and the
       * service from which to retrieve them. 
       */
      override fun revision(revision: RevisionLocationProperty) {
        cdkBuilder.revision(revision.let(RevisionLocationProperty::unwrap))
      }

      /**
       * @param revision Information about the location of stored application artifacts and the
       * service from which to retrieve them. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42d0c4385c21c785d3bb3c83d15d69dd0221a2a61b2cbfbf3fe8ff4afe3c4eaa")
      override fun revision(revision: RevisionLocationProperty.Builder.() -> Unit): Unit =
          revision(RevisionLocationProperty(revision))

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty,
    ) : CdkObject(cdkObject), DeploymentProperty {
      /**
       * A comment about the deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-codedeploy-deploymentgroup-deployment-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * If true, then if an `ApplicationStop` , `BeforeBlockTraffic` , or `AfterBlockTraffic`
       * deployment lifecycle event to an instance fails, then the deployment continues to the next
       * deployment lifecycle event.
       *
       * For example, if `ApplicationStop` fails, the deployment continues with DownloadBundle. If
       * `BeforeBlockTraffic` fails, the deployment continues with `BlockTraffic` . If
       * `AfterBlockTraffic` fails, the deployment continues with `ApplicationStop` .
       *
       * If false or not specified, then if a lifecycle event fails during a deployment to an
       * instance, that deployment fails. If deployment to that instance is part of an overall
       * deployment and the number of healthy hosts is not less than the minimum number of healthy
       * hosts, then a deployment to the next instance is attempted.
       *
       * During a deployment, the AWS CodeDeploy agent runs the scripts specified for
       * `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` in the AppSpec file from
       * the previous successful deployment. (All other scripts are run from the AppSpec file in the
       * current deployment.) If one of these scripts contains an error and does not run successfully,
       * the deployment can fail.
       *
       * If the cause of the failure is a script from the last successful deployment that will never
       * run successfully, create a new deployment and use `ignoreApplicationStopFailures` to specify
       * that the `ApplicationStop` , `BeforeBlockTraffic` , and `AfterBlockTraffic` failures should be
       * ignored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-codedeploy-deploymentgroup-deployment-ignoreapplicationstopfailures)
       */
      override fun ignoreApplicationStopFailures(): Any? =
          unwrap(this).getIgnoreApplicationStopFailures()

      /**
       * Information about the location of stored application artifacts and the service from which
       * to retrieve them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-codedeploy-deploymentgroup-deployment-revision)
       */
      override fun revision(): Any = unwrap(this).getRevision()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty):
          DeploymentProperty = CdkObjectWrappers.wrap(cdkObject) as? DeploymentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * DeploymentReadyOptionProperty deploymentReadyOptionProperty =
   * DeploymentReadyOptionProperty.builder()
   * .actionOnTimeout("actionOnTimeout")
   * .waitTimeInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentreadyoption.html)
   */
  public interface DeploymentReadyOptionProperty {
    /**
     * Information about when to reroute traffic from an original environment to a replacement
     * environment in a blue/green deployment.
     *
     * * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the
     * new application revision is installed on the instances in the replacement environment.
     * * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic
     * rerouting is started using
     * [ContinueDeployment](https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ContinueDeployment.html)
     * . If traffic rerouting is not started before the end of the specified wait period, the
     * deployment status is changed to Stopped.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentreadyoption.html#cfn-codedeploy-deploymentgroup-deploymentreadyoption-actionontimeout)
     */
    public fun actionOnTimeout(): String? = unwrap(this).getActionOnTimeout()

    /**
     * The number of minutes to wait before the status of a blue/green deployment is changed to
     * Stopped if rerouting is not started manually.
     *
     * Applies only to the `STOP_DEPLOYMENT` option for `actionOnTimeout` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentreadyoption.html#cfn-codedeploy-deploymentgroup-deploymentreadyoption-waittimeinminutes)
     */
    public fun waitTimeInMinutes(): Number? = unwrap(this).getWaitTimeInMinutes()

    /**
     * A builder for [DeploymentReadyOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionOnTimeout Information about when to reroute traffic from an original
       * environment to a replacement environment in a blue/green deployment.
       * * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the
       * new application revision is installed on the instances in the replacement environment.
       * * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic
       * rerouting is started using
       * [ContinueDeployment](https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ContinueDeployment.html)
       * . If traffic rerouting is not started before the end of the specified wait period, the
       * deployment status is changed to Stopped.
       */
      public fun actionOnTimeout(actionOnTimeout: String)

      /**
       * @param waitTimeInMinutes The number of minutes to wait before the status of a blue/green
       * deployment is changed to Stopped if rerouting is not started manually.
       * Applies only to the `STOP_DEPLOYMENT` option for `actionOnTimeout` .
       */
      public fun waitTimeInMinutes(waitTimeInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty.builder()

      /**
       * @param actionOnTimeout Information about when to reroute traffic from an original
       * environment to a replacement environment in a blue/green deployment.
       * * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the
       * new application revision is installed on the instances in the replacement environment.
       * * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic
       * rerouting is started using
       * [ContinueDeployment](https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ContinueDeployment.html)
       * . If traffic rerouting is not started before the end of the specified wait period, the
       * deployment status is changed to Stopped.
       */
      override fun actionOnTimeout(actionOnTimeout: String) {
        cdkBuilder.actionOnTimeout(actionOnTimeout)
      }

      /**
       * @param waitTimeInMinutes The number of minutes to wait before the status of a blue/green
       * deployment is changed to Stopped if rerouting is not started manually.
       * Applies only to the `STOP_DEPLOYMENT` option for `actionOnTimeout` .
       */
      override fun waitTimeInMinutes(waitTimeInMinutes: Number) {
        cdkBuilder.waitTimeInMinutes(waitTimeInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty,
    ) : CdkObject(cdkObject), DeploymentReadyOptionProperty {
      /**
       * Information about when to reroute traffic from an original environment to a replacement
       * environment in a blue/green deployment.
       *
       * * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the
       * new application revision is installed on the instances in the replacement environment.
       * * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic
       * rerouting is started using
       * [ContinueDeployment](https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ContinueDeployment.html)
       * . If traffic rerouting is not started before the end of the specified wait period, the
       * deployment status is changed to Stopped.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentreadyoption.html#cfn-codedeploy-deploymentgroup-deploymentreadyoption-actionontimeout)
       */
      override fun actionOnTimeout(): String? = unwrap(this).getActionOnTimeout()

      /**
       * The number of minutes to wait before the status of a blue/green deployment is changed to
       * Stopped if rerouting is not started manually.
       *
       * Applies only to the `STOP_DEPLOYMENT` option for `actionOnTimeout` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentreadyoption.html#cfn-codedeploy-deploymentgroup-deploymentreadyoption-waittimeinminutes)
       */
      override fun waitTimeInMinutes(): Number? = unwrap(this).getWaitTimeInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentReadyOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty):
          DeploymentReadyOptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentReadyOptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentReadyOptionProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * DeploymentStyleProperty deploymentStyleProperty = DeploymentStyleProperty.builder()
   * .deploymentOption("deploymentOption")
   * .deploymentType("deploymentType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html)
   */
  public interface DeploymentStyleProperty {
    /**
     * Indicates whether to route deployment traffic behind a load balancer.
     *
     *
     * An Amazon EC2 Application Load Balancer or Network Load Balancer is required for an Amazon
     * ECS deployment.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymentoption)
     */
    public fun deploymentOption(): String? = unwrap(this).getDeploymentOption()

    /**
     * Indicates whether to run an in-place or blue/green deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymenttype)
     */
    public fun deploymentType(): String? = unwrap(this).getDeploymentType()

    /**
     * A builder for [DeploymentStyleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deploymentOption Indicates whether to route deployment traffic behind a load
       * balancer.
       *
       * An Amazon EC2 Application Load Balancer or Network Load Balancer is required for an Amazon
       * ECS deployment.
       */
      public fun deploymentOption(deploymentOption: String)

      /**
       * @param deploymentType Indicates whether to run an in-place or blue/green deployment.
       */
      public fun deploymentType(deploymentType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty.builder()

      /**
       * @param deploymentOption Indicates whether to route deployment traffic behind a load
       * balancer.
       *
       * An Amazon EC2 Application Load Balancer or Network Load Balancer is required for an Amazon
       * ECS deployment.
       */
      override fun deploymentOption(deploymentOption: String) {
        cdkBuilder.deploymentOption(deploymentOption)
      }

      /**
       * @param deploymentType Indicates whether to run an in-place or blue/green deployment.
       */
      override fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty,
    ) : CdkObject(cdkObject), DeploymentStyleProperty {
      /**
       * Indicates whether to route deployment traffic behind a load balancer.
       *
       *
       * An Amazon EC2 Application Load Balancer or Network Load Balancer is required for an Amazon
       * ECS deployment.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymentoption)
       */
      override fun deploymentOption(): String? = unwrap(this).getDeploymentOption()

      /**
       * Indicates whether to run an in-place or blue/green deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymenttype)
       */
      override fun deploymentType(): String? = unwrap(this).getDeploymentType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty):
          DeploymentStyleProperty = CdkObjectWrappers.wrap(cdkObject) as? DeploymentStyleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentStyleProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * EC2TagFilterProperty eC2TagFilterProperty = EC2TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilter.html)
   */
  public interface EC2TagFilterProperty {
    /**
     * The tag filter key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilter.html#cfn-codedeploy-deploymentgroup-ec2tagfilter-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The tag filter type:.
     *
     * * `KEY_ONLY` : Key only.
     * * `VALUE_ONLY` : Value only.
     * * `KEY_AND_VALUE` : Key and value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilter.html#cfn-codedeploy-deploymentgroup-ec2tagfilter-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The tag filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilter.html#cfn-codedeploy-deploymentgroup-ec2tagfilter-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EC2TagFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The tag filter key.
       */
      public fun key(key: String)

      /**
       * @param type The tag filter type:.
       * * `KEY_ONLY` : Key only.
       * * `VALUE_ONLY` : Value only.
       * * `KEY_AND_VALUE` : Key and value.
       */
      public fun type(type: String)

      /**
       * @param value The tag filter value.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty.builder()

      /**
       * @param key The tag filter key.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param type The tag filter type:.
       * * `KEY_ONLY` : Key only.
       * * `VALUE_ONLY` : Value only.
       * * `KEY_AND_VALUE` : Key and value.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The tag filter value.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty,
    ) : CdkObject(cdkObject), EC2TagFilterProperty {
      /**
       * The tag filter key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilter.html#cfn-codedeploy-deploymentgroup-ec2tagfilter-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The tag filter type:.
       *
       * * `KEY_ONLY` : Key only.
       * * `VALUE_ONLY` : Value only.
       * * `KEY_AND_VALUE` : Key and value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilter.html#cfn-codedeploy-deploymentgroup-ec2tagfilter-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The tag filter value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilter.html#cfn-codedeploy-deploymentgroup-ec2tagfilter-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EC2TagFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty):
          EC2TagFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? EC2TagFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EC2TagFilterProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface EC2TagSetListObjectProperty {
    /**
     * A list that contains other lists of Amazon EC2 instance tag groups.
     *
     * For an instance to be included in the deployment group, it must be identified by all of the
     * tag groups in the list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagsetlistobject.html#cfn-codedeploy-deploymentgroup-ec2tagsetlistobject-ec2taggroup)
     */
    public fun ec2TagGroup(): Any? = unwrap(this).getEc2TagGroup()

    /**
     * A builder for [EC2TagSetListObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       */
      public fun ec2TagGroup(ec2TagGroup: IResolvable)

      /**
       * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       */
      public fun ec2TagGroup(ec2TagGroup: List<Any>)

      /**
       * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       */
      public fun ec2TagGroup(vararg ec2TagGroup: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty.builder()

      /**
       * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       */
      override fun ec2TagGroup(ec2TagGroup: IResolvable) {
        cdkBuilder.ec2TagGroup(ec2TagGroup.let(IResolvable::unwrap))
      }

      /**
       * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       */
      override fun ec2TagGroup(ec2TagGroup: List<Any>) {
        cdkBuilder.ec2TagGroup(ec2TagGroup)
      }

      /**
       * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       */
      override fun ec2TagGroup(vararg ec2TagGroup: Any): Unit = ec2TagGroup(ec2TagGroup.toList())

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty,
    ) : CdkObject(cdkObject), EC2TagSetListObjectProperty {
      /**
       * A list that contains other lists of Amazon EC2 instance tag groups.
       *
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagsetlistobject.html#cfn-codedeploy-deploymentgroup-ec2tagsetlistobject-ec2taggroup)
       */
      override fun ec2TagGroup(): Any? = unwrap(this).getEc2TagGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EC2TagSetListObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty):
          EC2TagSetListObjectProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EC2TagSetListObjectProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EC2TagSetListObjectProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface EC2TagSetProperty {
    /**
     * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
     * in the deployment group.
     *
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group.
     *
     * Duplicates are not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html#cfn-codedeploy-deploymentgroup-ec2tagset-ec2tagsetlist)
     */
    public fun ec2TagSetList(): Any? = unwrap(this).getEc2TagSetList()

    /**
     * A builder for [EC2TagSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances
       * that you want to include in the deployment group.
       * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
       * this deployment group.
       *
       * Duplicates are not allowed.
       */
      public fun ec2TagSetList(ec2TagSetList: IResolvable)

      /**
       * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances
       * that you want to include in the deployment group.
       * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
       * this deployment group.
       *
       * Duplicates are not allowed.
       */
      public fun ec2TagSetList(ec2TagSetList: List<Any>)

      /**
       * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances
       * that you want to include in the deployment group.
       * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
       * this deployment group.
       *
       * Duplicates are not allowed.
       */
      public fun ec2TagSetList(vararg ec2TagSetList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty.builder()

      /**
       * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances
       * that you want to include in the deployment group.
       * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
       * this deployment group.
       *
       * Duplicates are not allowed.
       */
      override fun ec2TagSetList(ec2TagSetList: IResolvable) {
        cdkBuilder.ec2TagSetList(ec2TagSetList.let(IResolvable::unwrap))
      }

      /**
       * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances
       * that you want to include in the deployment group.
       * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
       * this deployment group.
       *
       * Duplicates are not allowed.
       */
      override fun ec2TagSetList(ec2TagSetList: List<Any>) {
        cdkBuilder.ec2TagSetList(ec2TagSetList)
      }

      /**
       * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances
       * that you want to include in the deployment group.
       * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
       * this deployment group.
       *
       * Duplicates are not allowed.
       */
      override fun ec2TagSetList(vararg ec2TagSetList: Any): Unit =
          ec2TagSetList(ec2TagSetList.toList())

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty,
    ) : CdkObject(cdkObject), EC2TagSetProperty {
      /**
       * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to
       * include in the deployment group.
       *
       * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
       * this deployment group.
       *
       * Duplicates are not allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html#cfn-codedeploy-deploymentgroup-ec2tagset-ec2tagsetlist)
       */
      override fun ec2TagSetList(): Any? = unwrap(this).getEc2TagSetList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EC2TagSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty):
          EC2TagSetProperty = CdkObjectWrappers.wrap(cdkObject) as? EC2TagSetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EC2TagSetProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty
    }
  }

  /**
   * Contains the service and cluster names used to identify an Amazon ECS deployment's target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * ECSServiceProperty eCSServiceProperty = ECSServiceProperty.builder()
   * .clusterName("clusterName")
   * .serviceName("serviceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ecsservice.html)
   */
  public interface ECSServiceProperty {
    /**
     * The name of the cluster that the Amazon ECS service is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ecsservice.html#cfn-codedeploy-deploymentgroup-ecsservice-clustername)
     */
    public fun clusterName(): String

    /**
     * The name of the target Amazon ECS service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ecsservice.html#cfn-codedeploy-deploymentgroup-ecsservice-servicename)
     */
    public fun serviceName(): String

    /**
     * A builder for [ECSServiceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterName The name of the cluster that the Amazon ECS service is associated with. 
       */
      public fun clusterName(clusterName: String)

      /**
       * @param serviceName The name of the target Amazon ECS service. 
       */
      public fun serviceName(serviceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty.builder()

      /**
       * @param clusterName The name of the cluster that the Amazon ECS service is associated with. 
       */
      override fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
      }

      /**
       * @param serviceName The name of the target Amazon ECS service. 
       */
      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty,
    ) : CdkObject(cdkObject), ECSServiceProperty {
      /**
       * The name of the cluster that the Amazon ECS service is associated with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ecsservice.html#cfn-codedeploy-deploymentgroup-ecsservice-clustername)
       */
      override fun clusterName(): String = unwrap(this).getClusterName()

      /**
       * The name of the target Amazon ECS service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ecsservice.html#cfn-codedeploy-deploymentgroup-ecsservice-servicename)
       */
      override fun serviceName(): String = unwrap(this).getServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ECSServiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty):
          ECSServiceProperty = CdkObjectWrappers.wrap(cdkObject) as? ECSServiceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ECSServiceProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * ELBInfoProperty eLBInfoProperty = ELBInfoProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html)
   */
  public interface ELBInfoProperty {
    /**
     * For blue/green deployments, the name of the load balancer that is used to route traffic from
     * original instances to replacement instances in a blue/green deployment.
     *
     * For in-place deployments, the name of the load balancer that instances are deregistered from
     * so they are not serving traffic during a deployment, and then re-registered with after the
     * deployment is complete.
     *
     *
     * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html#cfn-codedeploy-deploymentgroup-elbinfo-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [ELBInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name For blue/green deployments, the name of the load balancer that is used to route
       * traffic from original instances to replacement instances in a blue/green deployment.
       * For in-place deployments, the name of the load balancer that instances are deregistered
       * from so they are not serving traffic during a deployment, and then re-registered with after
       * the deployment is complete.
       *
       *
       * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty.builder()

      /**
       * @param name For blue/green deployments, the name of the load balancer that is used to route
       * traffic from original instances to replacement instances in a blue/green deployment.
       * For in-place deployments, the name of the load balancer that instances are deregistered
       * from so they are not serving traffic during a deployment, and then re-registered with after
       * the deployment is complete.
       *
       *
       * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty,
    ) : CdkObject(cdkObject), ELBInfoProperty {
      /**
       * For blue/green deployments, the name of the load balancer that is used to route traffic
       * from original instances to replacement instances in a blue/green deployment.
       *
       * For in-place deployments, the name of the load balancer that instances are deregistered
       * from so they are not serving traffic during a deployment, and then re-registered with after
       * the deployment is complete.
       *
       *
       * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html#cfn-codedeploy-deploymentgroup-elbinfo-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ELBInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty):
          ELBInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? ELBInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ELBInfoProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * GitHubLocationProperty gitHubLocationProperty = GitHubLocationProperty.builder()
   * .commitId("commitId")
   * .repository("repository")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-githublocation.html)
   */
  public interface GitHubLocationProperty {
    /**
     * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the
     * application revision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-githublocation.html#cfn-codedeploy-deploymentgroup-githublocation-commitid)
     */
    public fun commitId(): String

    /**
     * The GitHub account and repository pair that stores a reference to the commit that represents
     * the bundled artifacts for the application revision.
     *
     * Specify the value as `account/repository` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-githublocation.html#cfn-codedeploy-deploymentgroup-githublocation-repository)
     */
    public fun repository(): String

    /**
     * A builder for [GitHubLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param commitId The SHA1 commit ID of the GitHub commit that represents the bundled
       * artifacts for the application revision. 
       */
      public fun commitId(commitId: String)

      /**
       * @param repository The GitHub account and repository pair that stores a reference to the
       * commit that represents the bundled artifacts for the application revision. 
       * Specify the value as `account/repository` .
       */
      public fun repository(repository: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty.builder()

      /**
       * @param commitId The SHA1 commit ID of the GitHub commit that represents the bundled
       * artifacts for the application revision. 
       */
      override fun commitId(commitId: String) {
        cdkBuilder.commitId(commitId)
      }

      /**
       * @param repository The GitHub account and repository pair that stores a reference to the
       * commit that represents the bundled artifacts for the application revision. 
       * Specify the value as `account/repository` .
       */
      override fun repository(repository: String) {
        cdkBuilder.repository(repository)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty,
    ) : CdkObject(cdkObject), GitHubLocationProperty {
      /**
       * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the
       * application revision.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-githublocation.html#cfn-codedeploy-deploymentgroup-githublocation-commitid)
       */
      override fun commitId(): String = unwrap(this).getCommitId()

      /**
       * The GitHub account and repository pair that stores a reference to the commit that
       * represents the bundled artifacts for the application revision.
       *
       * Specify the value as `account/repository` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-githublocation.html#cfn-codedeploy-deploymentgroup-githublocation-repository)
       */
      override fun repository(): String = unwrap(this).getRepository()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitHubLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty):
          GitHubLocationProperty = CdkObjectWrappers.wrap(cdkObject) as? GitHubLocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitHubLocationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * GreenFleetProvisioningOptionProperty greenFleetProvisioningOptionProperty =
   * GreenFleetProvisioningOptionProperty.builder()
   * .action("action")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-greenfleetprovisioningoption.html)
   */
  public interface GreenFleetProvisioningOptionProperty {
    /**
     * The method used to add instances to a replacement environment.
     *
     * * `DISCOVER_EXISTING` : Use instances that already exist or will be created manually.
     * * `COPY_AUTO_SCALING_GROUP` : Use settings from a specified Auto Scaling group to define and
     * create instances in a new Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-greenfleetprovisioningoption.html#cfn-codedeploy-deploymentgroup-greenfleetprovisioningoption-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * A builder for [GreenFleetProvisioningOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The method used to add instances to a replacement environment.
       * * `DISCOVER_EXISTING` : Use instances that already exist or will be created manually.
       * * `COPY_AUTO_SCALING_GROUP` : Use settings from a specified Auto Scaling group to define
       * and create instances in a new Auto Scaling group.
       */
      public fun action(action: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty.builder()

      /**
       * @param action The method used to add instances to a replacement environment.
       * * `DISCOVER_EXISTING` : Use instances that already exist or will be created manually.
       * * `COPY_AUTO_SCALING_GROUP` : Use settings from a specified Auto Scaling group to define
       * and create instances in a new Auto Scaling group.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty,
    ) : CdkObject(cdkObject), GreenFleetProvisioningOptionProperty {
      /**
       * The method used to add instances to a replacement environment.
       *
       * * `DISCOVER_EXISTING` : Use instances that already exist or will be created manually.
       * * `COPY_AUTO_SCALING_GROUP` : Use settings from a specified Auto Scaling group to define
       * and create instances in a new Auto Scaling group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-greenfleetprovisioningoption.html#cfn-codedeploy-deploymentgroup-greenfleetprovisioningoption-action)
       */
      override fun action(): String? = unwrap(this).getAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GreenFleetProvisioningOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty):
          GreenFleetProvisioningOptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GreenFleetProvisioningOptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GreenFleetProvisioningOptionProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface LoadBalancerInfoProperty {
    /**
     * An array that contains information about the load balancers to use for load balancing in a
     * deployment.
     *
     * If you're using Classic Load Balancers, specify those load balancers in this array.
     *
     *
     * You can add up to 10 load balancers to the array. &gt; If you're using Application Load
     * Balancers or Network Load Balancers, use the `targetGroupInfoList` array instead of this one.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist)
     */
    public fun elbInfoList(): Any? = unwrap(this).getElbInfoList()

    /**
     * An array that contains information about the target groups to use for load balancing in a
     * deployment.
     *
     * If you're using Application Load Balancers and Network Load Balancers, specify their
     * associated target groups in this array.
     *
     *
     * You can add up to 10 target groups to the array. &gt; If you're using Classic Load Balancers,
     * use the `elbInfoList` array instead of this one.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist)
     */
    public fun targetGroupInfoList(): Any? = unwrap(this).getTargetGroupInfoList()

    /**
     * The target group pair information.
     *
     * This is an array of `TargeGroupPairInfo` objects with a maximum size of one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgrouppairinfolist)
     */
    public fun targetGroupPairInfoList(): Any? = unwrap(this).getTargetGroupPairInfoList()

    /**
     * A builder for [LoadBalancerInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param elbInfoList An array that contains information about the load balancers to use for
       * load balancing in a deployment.
       * If you're using Classic Load Balancers, specify those load balancers in this array.
       *
       *
       * You can add up to 10 load balancers to the array. &gt; If you're using Application Load
       * Balancers or Network Load Balancers, use the `targetGroupInfoList` array instead of this one.
       */
      public fun elbInfoList(elbInfoList: IResolvable)

      /**
       * @param elbInfoList An array that contains information about the load balancers to use for
       * load balancing in a deployment.
       * If you're using Classic Load Balancers, specify those load balancers in this array.
       *
       *
       * You can add up to 10 load balancers to the array. &gt; If you're using Application Load
       * Balancers or Network Load Balancers, use the `targetGroupInfoList` array instead of this one.
       */
      public fun elbInfoList(elbInfoList: List<Any>)

      /**
       * @param elbInfoList An array that contains information about the load balancers to use for
       * load balancing in a deployment.
       * If you're using Classic Load Balancers, specify those load balancers in this array.
       *
       *
       * You can add up to 10 load balancers to the array. &gt; If you're using Application Load
       * Balancers or Network Load Balancers, use the `targetGroupInfoList` array instead of this one.
       */
      public fun elbInfoList(vararg elbInfoList: Any)

      /**
       * @param targetGroupInfoList An array that contains information about the target groups to
       * use for load balancing in a deployment.
       * If you're using Application Load Balancers and Network Load Balancers, specify their
       * associated target groups in this array.
       *
       *
       * You can add up to 10 target groups to the array. &gt; If you're using Classic Load
       * Balancers, use the `elbInfoList` array instead of this one.
       */
      public fun targetGroupInfoList(targetGroupInfoList: IResolvable)

      /**
       * @param targetGroupInfoList An array that contains information about the target groups to
       * use for load balancing in a deployment.
       * If you're using Application Load Balancers and Network Load Balancers, specify their
       * associated target groups in this array.
       *
       *
       * You can add up to 10 target groups to the array. &gt; If you're using Classic Load
       * Balancers, use the `elbInfoList` array instead of this one.
       */
      public fun targetGroupInfoList(targetGroupInfoList: List<Any>)

      /**
       * @param targetGroupInfoList An array that contains information about the target groups to
       * use for load balancing in a deployment.
       * If you're using Application Load Balancers and Network Load Balancers, specify their
       * associated target groups in this array.
       *
       *
       * You can add up to 10 target groups to the array. &gt; If you're using Classic Load
       * Balancers, use the `elbInfoList` array instead of this one.
       */
      public fun targetGroupInfoList(vararg targetGroupInfoList: Any)

      /**
       * @param targetGroupPairInfoList The target group pair information.
       * This is an array of `TargeGroupPairInfo` objects with a maximum size of one.
       */
      public fun targetGroupPairInfoList(targetGroupPairInfoList: IResolvable)

      /**
       * @param targetGroupPairInfoList The target group pair information.
       * This is an array of `TargeGroupPairInfo` objects with a maximum size of one.
       */
      public fun targetGroupPairInfoList(targetGroupPairInfoList: List<Any>)

      /**
       * @param targetGroupPairInfoList The target group pair information.
       * This is an array of `TargeGroupPairInfo` objects with a maximum size of one.
       */
      public fun targetGroupPairInfoList(vararg targetGroupPairInfoList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty.builder()

      /**
       * @param elbInfoList An array that contains information about the load balancers to use for
       * load balancing in a deployment.
       * If you're using Classic Load Balancers, specify those load balancers in this array.
       *
       *
       * You can add up to 10 load balancers to the array. &gt; If you're using Application Load
       * Balancers or Network Load Balancers, use the `targetGroupInfoList` array instead of this one.
       */
      override fun elbInfoList(elbInfoList: IResolvable) {
        cdkBuilder.elbInfoList(elbInfoList.let(IResolvable::unwrap))
      }

      /**
       * @param elbInfoList An array that contains information about the load balancers to use for
       * load balancing in a deployment.
       * If you're using Classic Load Balancers, specify those load balancers in this array.
       *
       *
       * You can add up to 10 load balancers to the array. &gt; If you're using Application Load
       * Balancers or Network Load Balancers, use the `targetGroupInfoList` array instead of this one.
       */
      override fun elbInfoList(elbInfoList: List<Any>) {
        cdkBuilder.elbInfoList(elbInfoList)
      }

      /**
       * @param elbInfoList An array that contains information about the load balancers to use for
       * load balancing in a deployment.
       * If you're using Classic Load Balancers, specify those load balancers in this array.
       *
       *
       * You can add up to 10 load balancers to the array. &gt; If you're using Application Load
       * Balancers or Network Load Balancers, use the `targetGroupInfoList` array instead of this one.
       */
      override fun elbInfoList(vararg elbInfoList: Any): Unit = elbInfoList(elbInfoList.toList())

      /**
       * @param targetGroupInfoList An array that contains information about the target groups to
       * use for load balancing in a deployment.
       * If you're using Application Load Balancers and Network Load Balancers, specify their
       * associated target groups in this array.
       *
       *
       * You can add up to 10 target groups to the array. &gt; If you're using Classic Load
       * Balancers, use the `elbInfoList` array instead of this one.
       */
      override fun targetGroupInfoList(targetGroupInfoList: IResolvable) {
        cdkBuilder.targetGroupInfoList(targetGroupInfoList.let(IResolvable::unwrap))
      }

      /**
       * @param targetGroupInfoList An array that contains information about the target groups to
       * use for load balancing in a deployment.
       * If you're using Application Load Balancers and Network Load Balancers, specify their
       * associated target groups in this array.
       *
       *
       * You can add up to 10 target groups to the array. &gt; If you're using Classic Load
       * Balancers, use the `elbInfoList` array instead of this one.
       */
      override fun targetGroupInfoList(targetGroupInfoList: List<Any>) {
        cdkBuilder.targetGroupInfoList(targetGroupInfoList)
      }

      /**
       * @param targetGroupInfoList An array that contains information about the target groups to
       * use for load balancing in a deployment.
       * If you're using Application Load Balancers and Network Load Balancers, specify their
       * associated target groups in this array.
       *
       *
       * You can add up to 10 target groups to the array. &gt; If you're using Classic Load
       * Balancers, use the `elbInfoList` array instead of this one.
       */
      override fun targetGroupInfoList(vararg targetGroupInfoList: Any): Unit =
          targetGroupInfoList(targetGroupInfoList.toList())

      /**
       * @param targetGroupPairInfoList The target group pair information.
       * This is an array of `TargeGroupPairInfo` objects with a maximum size of one.
       */
      override fun targetGroupPairInfoList(targetGroupPairInfoList: IResolvable) {
        cdkBuilder.targetGroupPairInfoList(targetGroupPairInfoList.let(IResolvable::unwrap))
      }

      /**
       * @param targetGroupPairInfoList The target group pair information.
       * This is an array of `TargeGroupPairInfo` objects with a maximum size of one.
       */
      override fun targetGroupPairInfoList(targetGroupPairInfoList: List<Any>) {
        cdkBuilder.targetGroupPairInfoList(targetGroupPairInfoList)
      }

      /**
       * @param targetGroupPairInfoList The target group pair information.
       * This is an array of `TargeGroupPairInfo` objects with a maximum size of one.
       */
      override fun targetGroupPairInfoList(vararg targetGroupPairInfoList: Any): Unit =
          targetGroupPairInfoList(targetGroupPairInfoList.toList())

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty,
    ) : CdkObject(cdkObject), LoadBalancerInfoProperty {
      /**
       * An array that contains information about the load balancers to use for load balancing in a
       * deployment.
       *
       * If you're using Classic Load Balancers, specify those load balancers in this array.
       *
       *
       * You can add up to 10 load balancers to the array. &gt; If you're using Application Load
       * Balancers or Network Load Balancers, use the `targetGroupInfoList` array instead of this one.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist)
       */
      override fun elbInfoList(): Any? = unwrap(this).getElbInfoList()

      /**
       * An array that contains information about the target groups to use for load balancing in a
       * deployment.
       *
       * If you're using Application Load Balancers and Network Load Balancers, specify their
       * associated target groups in this array.
       *
       *
       * You can add up to 10 target groups to the array. &gt; If you're using Classic Load
       * Balancers, use the `elbInfoList` array instead of this one.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist)
       */
      override fun targetGroupInfoList(): Any? = unwrap(this).getTargetGroupInfoList()

      /**
       * The target group pair information.
       *
       * This is an array of `TargeGroupPairInfo` objects with a maximum size of one.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgrouppairinfolist)
       */
      override fun targetGroupPairInfoList(): Any? = unwrap(this).getTargetGroupPairInfoList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty):
          LoadBalancerInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? LoadBalancerInfoProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerInfoProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface OnPremisesTagSetListObjectProperty {
    /**
     * Information about groups of on-premises instance tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html#cfn-codedeploy-deploymentgroup-onpremisestagsetlistobject-onpremisestaggroup)
     */
    public fun onPremisesTagGroup(): Any? = unwrap(this).getOnPremisesTagGroup()

    /**
     * A builder for [OnPremisesTagSetListObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onPremisesTagGroup Information about groups of on-premises instance tags.
       */
      public fun onPremisesTagGroup(onPremisesTagGroup: IResolvable)

      /**
       * @param onPremisesTagGroup Information about groups of on-premises instance tags.
       */
      public fun onPremisesTagGroup(onPremisesTagGroup: List<Any>)

      /**
       * @param onPremisesTagGroup Information about groups of on-premises instance tags.
       */
      public fun onPremisesTagGroup(vararg onPremisesTagGroup: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.builder()

      /**
       * @param onPremisesTagGroup Information about groups of on-premises instance tags.
       */
      override fun onPremisesTagGroup(onPremisesTagGroup: IResolvable) {
        cdkBuilder.onPremisesTagGroup(onPremisesTagGroup.let(IResolvable::unwrap))
      }

      /**
       * @param onPremisesTagGroup Information about groups of on-premises instance tags.
       */
      override fun onPremisesTagGroup(onPremisesTagGroup: List<Any>) {
        cdkBuilder.onPremisesTagGroup(onPremisesTagGroup)
      }

      /**
       * @param onPremisesTagGroup Information about groups of on-premises instance tags.
       */
      override fun onPremisesTagGroup(vararg onPremisesTagGroup: Any): Unit =
          onPremisesTagGroup(onPremisesTagGroup.toList())

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty,
    ) : CdkObject(cdkObject), OnPremisesTagSetListObjectProperty {
      /**
       * Information about groups of on-premises instance tags.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html#cfn-codedeploy-deploymentgroup-onpremisestagsetlistobject-onpremisestaggroup)
       */
      override fun onPremisesTagGroup(): Any? = unwrap(this).getOnPremisesTagGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OnPremisesTagSetListObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty):
          OnPremisesTagSetListObjectProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OnPremisesTagSetListObjectProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnPremisesTagSetListObjectProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface OnPremisesTagSetProperty {
    /**
     * A list that contains other lists of on-premises instance tag groups.
     *
     * For an instance to be included in the deployment group, it must be identified by all of the
     * tag groups in the list.
     *
     * Duplicates are not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html#cfn-codedeploy-deploymentgroup-onpremisestagset-onpremisestagsetlist)
     */
    public fun onPremisesTagSetList(): Any? = unwrap(this).getOnPremisesTagSetList()

    /**
     * A builder for [OnPremisesTagSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
       * groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       *
       * Duplicates are not allowed.
       */
      public fun onPremisesTagSetList(onPremisesTagSetList: IResolvable)

      /**
       * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
       * groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       *
       * Duplicates are not allowed.
       */
      public fun onPremisesTagSetList(onPremisesTagSetList: List<Any>)

      /**
       * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
       * groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       *
       * Duplicates are not allowed.
       */
      public fun onPremisesTagSetList(vararg onPremisesTagSetList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty.builder()

      /**
       * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
       * groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       *
       * Duplicates are not allowed.
       */
      override fun onPremisesTagSetList(onPremisesTagSetList: IResolvable) {
        cdkBuilder.onPremisesTagSetList(onPremisesTagSetList.let(IResolvable::unwrap))
      }

      /**
       * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
       * groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       *
       * Duplicates are not allowed.
       */
      override fun onPremisesTagSetList(onPremisesTagSetList: List<Any>) {
        cdkBuilder.onPremisesTagSetList(onPremisesTagSetList)
      }

      /**
       * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
       * groups.
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       *
       * Duplicates are not allowed.
       */
      override fun onPremisesTagSetList(vararg onPremisesTagSetList: Any): Unit =
          onPremisesTagSetList(onPremisesTagSetList.toList())

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty,
    ) : CdkObject(cdkObject), OnPremisesTagSetProperty {
      /**
       * A list that contains other lists of on-premises instance tag groups.
       *
       * For an instance to be included in the deployment group, it must be identified by all of the
       * tag groups in the list.
       *
       * Duplicates are not allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html#cfn-codedeploy-deploymentgroup-onpremisestagset-onpremisestagsetlist)
       */
      override fun onPremisesTagSetList(): Any? = unwrap(this).getOnPremisesTagSetList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnPremisesTagSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty):
          OnPremisesTagSetProperty = CdkObjectWrappers.wrap(cdkObject) as? OnPremisesTagSetProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnPremisesTagSetProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface RevisionLocationProperty {
    /**
     * Information about the location of application artifacts stored in GitHub.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-revisionlocation.html#cfn-codedeploy-deploymentgroup-revisionlocation-githublocation)
     */
    public fun gitHubLocation(): Any? = unwrap(this).getGitHubLocation()

    /**
     * The type of application revision:.
     *
     * * S3: An application revision stored in Amazon S3.
     * * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     * * String: A YAML-formatted or JSON-formatted string ( AWS Lambda deployments only).
     * * AppSpecContent: An `AppSpecContent` object that contains the contents of an AppSpec file
     * for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML stored as a
     * RawString.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-revisionlocation.html#cfn-codedeploy-deploymentgroup-revisionlocation-revisiontype)
     */
    public fun revisionType(): String? = unwrap(this).getRevisionType()

    /**
     * Information about the location of a revision stored in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-revisionlocation.html#cfn-codedeploy-deploymentgroup-revisionlocation-s3location)
     */
    public fun s3Location(): Any? = unwrap(this).getS3Location()

    /**
     * A builder for [RevisionLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gitHubLocation Information about the location of application artifacts stored in
       * GitHub.
       */
      public fun gitHubLocation(gitHubLocation: IResolvable)

      /**
       * @param gitHubLocation Information about the location of application artifacts stored in
       * GitHub.
       */
      public fun gitHubLocation(gitHubLocation: GitHubLocationProperty)

      /**
       * @param gitHubLocation Information about the location of application artifacts stored in
       * GitHub.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("295eb37669b09d2143e3b47e57f08cf96ceacbc38a9c4a6d7cd170c4e70caa75")
      public fun gitHubLocation(gitHubLocation: GitHubLocationProperty.Builder.() -> Unit)

      /**
       * @param revisionType The type of application revision:.
       * * S3: An application revision stored in Amazon S3.
       * * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
       * * String: A YAML-formatted or JSON-formatted string ( AWS Lambda deployments only).
       * * AppSpecContent: An `AppSpecContent` object that contains the contents of an AppSpec file
       * for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML stored as
       * a RawString.
       */
      public fun revisionType(revisionType: String)

      /**
       * @param s3Location Information about the location of a revision stored in Amazon S3.
       */
      public fun s3Location(s3Location: IResolvable)

      /**
       * @param s3Location Information about the location of a revision stored in Amazon S3.
       */
      public fun s3Location(s3Location: S3LocationProperty)

      /**
       * @param s3Location Information about the location of a revision stored in Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f52dea54f74f2c9aac70e89971d068f11ce7ec4828568e99b1bc940266412956")
      public fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty.builder()

      /**
       * @param gitHubLocation Information about the location of application artifacts stored in
       * GitHub.
       */
      override fun gitHubLocation(gitHubLocation: IResolvable) {
        cdkBuilder.gitHubLocation(gitHubLocation.let(IResolvable::unwrap))
      }

      /**
       * @param gitHubLocation Information about the location of application artifacts stored in
       * GitHub.
       */
      override fun gitHubLocation(gitHubLocation: GitHubLocationProperty) {
        cdkBuilder.gitHubLocation(gitHubLocation.let(GitHubLocationProperty::unwrap))
      }

      /**
       * @param gitHubLocation Information about the location of application artifacts stored in
       * GitHub.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("295eb37669b09d2143e3b47e57f08cf96ceacbc38a9c4a6d7cd170c4e70caa75")
      override fun gitHubLocation(gitHubLocation: GitHubLocationProperty.Builder.() -> Unit): Unit =
          gitHubLocation(GitHubLocationProperty(gitHubLocation))

      /**
       * @param revisionType The type of application revision:.
       * * S3: An application revision stored in Amazon S3.
       * * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
       * * String: A YAML-formatted or JSON-formatted string ( AWS Lambda deployments only).
       * * AppSpecContent: An `AppSpecContent` object that contains the contents of an AppSpec file
       * for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML stored as
       * a RawString.
       */
      override fun revisionType(revisionType: String) {
        cdkBuilder.revisionType(revisionType)
      }

      /**
       * @param s3Location Information about the location of a revision stored in Amazon S3.
       */
      override fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location.let(IResolvable::unwrap))
      }

      /**
       * @param s3Location Information about the location of a revision stored in Amazon S3.
       */
      override fun s3Location(s3Location: S3LocationProperty) {
        cdkBuilder.s3Location(s3Location.let(S3LocationProperty::unwrap))
      }

      /**
       * @param s3Location Information about the location of a revision stored in Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f52dea54f74f2c9aac70e89971d068f11ce7ec4828568e99b1bc940266412956")
      override fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit): Unit =
          s3Location(S3LocationProperty(s3Location))

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty,
    ) : CdkObject(cdkObject), RevisionLocationProperty {
      /**
       * Information about the location of application artifacts stored in GitHub.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-revisionlocation.html#cfn-codedeploy-deploymentgroup-revisionlocation-githublocation)
       */
      override fun gitHubLocation(): Any? = unwrap(this).getGitHubLocation()

      /**
       * The type of application revision:.
       *
       * * S3: An application revision stored in Amazon S3.
       * * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
       * * String: A YAML-formatted or JSON-formatted string ( AWS Lambda deployments only).
       * * AppSpecContent: An `AppSpecContent` object that contains the contents of an AppSpec file
       * for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML stored as
       * a RawString.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-revisionlocation.html#cfn-codedeploy-deploymentgroup-revisionlocation-revisiontype)
       */
      override fun revisionType(): String? = unwrap(this).getRevisionType()

      /**
       * Information about the location of a revision stored in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-revisionlocation.html#cfn-codedeploy-deploymentgroup-revisionlocation-s3location)
       */
      override fun s3Location(): Any? = unwrap(this).getS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RevisionLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty):
          RevisionLocationProperty = CdkObjectWrappers.wrap(cdkObject) as? RevisionLocationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RevisionLocationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface S3LocationProperty {
    /**
     * The name of the Amazon S3 bucket where the application revision is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html#cfn-codedeploy-deploymentgroup-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * The file type of the application revision. Must be one of the following:.
     *
     * * JSON
     * * tar: A tar archive file.
     * * tgz: A compressed tar archive file.
     * * YAML
     * * zip: A zip archive file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html#cfn-codedeploy-deploymentgroup-s3location-bundletype)
     */
    public fun bundleType(): String? = unwrap(this).getBundleType()

    /**
     * The ETag of the Amazon S3 object that represents the bundled artifacts for the application
     * revision.
     *
     * If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html#cfn-codedeploy-deploymentgroup-s3location-etag)
     */
    public fun eTag(): String? = unwrap(this).getETag()

    /**
     * The name of the Amazon S3 object that represents the bundled artifacts for the application
     * revision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html#cfn-codedeploy-deploymentgroup-s3location-key)
     */
    public fun key(): String

    /**
     * A specific version of the Amazon S3 object that represents the bundled artifacts for the
     * application revision.
     *
     * If the version is not specified, the system uses the most recent version by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html#cfn-codedeploy-deploymentgroup-s3location-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the Amazon S3 bucket where the application revision is stored. 
       */
      public fun bucket(bucket: String)

      /**
       * @param bundleType The file type of the application revision. Must be one of the following:.
       * * JSON
       * * tar: A tar archive file.
       * * tgz: A compressed tar archive file.
       * * YAML
       * * zip: A zip archive file.
       */
      public fun bundleType(bundleType: String)

      /**
       * @param eTag The ETag of the Amazon S3 object that represents the bundled artifacts for the
       * application revision.
       * If the ETag is not specified as an input parameter, ETag validation of the object is
       * skipped.
       */
      public fun eTag(eTag: String)

      /**
       * @param key The name of the Amazon S3 object that represents the bundled artifacts for the
       * application revision. 
       */
      public fun key(key: String)

      /**
       * @param version A specific version of the Amazon S3 object that represents the bundled
       * artifacts for the application revision.
       * If the version is not specified, the system uses the most recent version by default.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty.builder()

      /**
       * @param bucket The name of the Amazon S3 bucket where the application revision is stored. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param bundleType The file type of the application revision. Must be one of the following:.
       * * JSON
       * * tar: A tar archive file.
       * * tgz: A compressed tar archive file.
       * * YAML
       * * zip: A zip archive file.
       */
      override fun bundleType(bundleType: String) {
        cdkBuilder.bundleType(bundleType)
      }

      /**
       * @param eTag The ETag of the Amazon S3 object that represents the bundled artifacts for the
       * application revision.
       * If the ETag is not specified as an input parameter, ETag validation of the object is
       * skipped.
       */
      override fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
      }

      /**
       * @param key The name of the Amazon S3 object that represents the bundled artifacts for the
       * application revision. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version A specific version of the Amazon S3 object that represents the bundled
       * artifacts for the application revision.
       * If the version is not specified, the system uses the most recent version by default.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * The name of the Amazon S3 bucket where the application revision is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html#cfn-codedeploy-deploymentgroup-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The file type of the application revision. Must be one of the following:.
       *
       * * JSON
       * * tar: A tar archive file.
       * * tgz: A compressed tar archive file.
       * * YAML
       * * zip: A zip archive file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html#cfn-codedeploy-deploymentgroup-s3location-bundletype)
       */
      override fun bundleType(): String? = unwrap(this).getBundleType()

      /**
       * The ETag of the Amazon S3 object that represents the bundled artifacts for the application
       * revision.
       *
       * If the ETag is not specified as an input parameter, ETag validation of the object is
       * skipped.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html#cfn-codedeploy-deploymentgroup-s3location-etag)
       */
      override fun eTag(): String? = unwrap(this).getETag()

      /**
       * The name of the Amazon S3 object that represents the bundled artifacts for the application
       * revision.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html#cfn-codedeploy-deploymentgroup-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * A specific version of the Amazon S3 object that represents the bundled artifacts for the
       * application revision.
       *
       * If the version is not specified, the system uses the most recent version by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-s3location.html#cfn-codedeploy-deploymentgroup-s3location-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-tagfilter.html)
   */
  public interface TagFilterProperty {
    /**
     * The on-premises instance tag filter key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-tagfilter.html#cfn-codedeploy-deploymentgroup-tagfilter-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The on-premises instance tag filter type:.
     *
     * * KEY_ONLY: Key only.
     * * VALUE_ONLY: Value only.
     * * KEY_AND_VALUE: Key and value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-tagfilter.html#cfn-codedeploy-deploymentgroup-tagfilter-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The on-premises instance tag filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-tagfilter.html#cfn-codedeploy-deploymentgroup-tagfilter-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [TagFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The on-premises instance tag filter key.
       */
      public fun key(key: String)

      /**
       * @param type The on-premises instance tag filter type:.
       * * KEY_ONLY: Key only.
       * * VALUE_ONLY: Value only.
       * * KEY_AND_VALUE: Key and value.
       */
      public fun type(type: String)

      /**
       * @param value The on-premises instance tag filter value.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty.builder()

      /**
       * @param key The on-premises instance tag filter key.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param type The on-premises instance tag filter type:.
       * * KEY_ONLY: Key only.
       * * VALUE_ONLY: Value only.
       * * KEY_AND_VALUE: Key and value.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The on-premises instance tag filter value.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty,
    ) : CdkObject(cdkObject), TagFilterProperty {
      /**
       * The on-premises instance tag filter key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-tagfilter.html#cfn-codedeploy-deploymentgroup-tagfilter-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The on-premises instance tag filter type:.
       *
       * * KEY_ONLY: Key only.
       * * VALUE_ONLY: Value only.
       * * KEY_AND_VALUE: Key and value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-tagfilter.html#cfn-codedeploy-deploymentgroup-tagfilter-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The on-premises instance tag filter value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-tagfilter.html#cfn-codedeploy-deploymentgroup-tagfilter-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty):
          TagFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? TagFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFilterProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * TargetGroupInfoProperty targetGroupInfoProperty = TargetGroupInfoProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html)
   */
  public interface TargetGroupInfoProperty {
    /**
     * For blue/green deployments, the name of the target group that instances in the original
     * environment are deregistered from, and instances in the replacement environment registered with.
     *
     * For in-place deployments, the name of the target group that instances are deregistered from,
     * so they are not serving traffic during a deployment, and then re-registered with after the
     * deployment completes. No duplicates allowed.
     *
     *
     * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
     *
     *
     * This value cannot exceed 32 characters, so you should use the `Name` property of the target
     * group, or the `TargetGroupName` attribute with the `Fn::GetAtt` intrinsic function, as shown in
     * the following example. Don't use the group's Amazon Resource Name (ARN) or `TargetGroupFullName`
     * attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html#cfn-codedeploy-deploymentgroup-targetgroupinfo-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [TargetGroupInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name For blue/green deployments, the name of the target group that instances in the
       * original environment are deregistered from, and instances in the replacement environment
       * registered with.
       * For in-place deployments, the name of the target group that instances are deregistered
       * from, so they are not serving traffic during a deployment, and then re-registered with after
       * the deployment completes. No duplicates allowed.
       *
       *
       * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
       *
       *
       * This value cannot exceed 32 characters, so you should use the `Name` property of the target
       * group, or the `TargetGroupName` attribute with the `Fn::GetAtt` intrinsic function, as shown
       * in the following example. Don't use the group's Amazon Resource Name (ARN) or
       * `TargetGroupFullName` attribute.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty.builder()

      /**
       * @param name For blue/green deployments, the name of the target group that instances in the
       * original environment are deregistered from, and instances in the replacement environment
       * registered with.
       * For in-place deployments, the name of the target group that instances are deregistered
       * from, so they are not serving traffic during a deployment, and then re-registered with after
       * the deployment completes. No duplicates allowed.
       *
       *
       * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
       *
       *
       * This value cannot exceed 32 characters, so you should use the `Name` property of the target
       * group, or the `TargetGroupName` attribute with the `Fn::GetAtt` intrinsic function, as shown
       * in the following example. Don't use the group's Amazon Resource Name (ARN) or
       * `TargetGroupFullName` attribute.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty,
    ) : CdkObject(cdkObject), TargetGroupInfoProperty {
      /**
       * For blue/green deployments, the name of the target group that instances in the original
       * environment are deregistered from, and instances in the replacement environment registered
       * with.
       *
       * For in-place deployments, the name of the target group that instances are deregistered
       * from, so they are not serving traffic during a deployment, and then re-registered with after
       * the deployment completes. No duplicates allowed.
       *
       *
       * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
       *
       *
       * This value cannot exceed 32 characters, so you should use the `Name` property of the target
       * group, or the `TargetGroupName` attribute with the `Fn::GetAtt` intrinsic function, as shown
       * in the following example. Don't use the group's Amazon Resource Name (ARN) or
       * `TargetGroupFullName` attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html#cfn-codedeploy-deploymentgroup-targetgroupinfo-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty):
          TargetGroupInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetGroupInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupInfoProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty
    }
  }

  /**
   * Information about two target groups and how traffic is routed during an Amazon ECS deployment.
   *
   * An optional test traffic route can be specified.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
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
  public interface TargetGroupPairInfoProperty {
    /**
     * The path used by a load balancer to route production traffic when an Amazon ECS deployment is
     * complete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgrouppairinfo.html#cfn-codedeploy-deploymentgroup-targetgrouppairinfo-prodtrafficroute)
     */
    public fun prodTrafficRoute(): Any? = unwrap(this).getProdTrafficRoute()

    /**
     * One pair of target groups.
     *
     * One is associated with the original task set. The second is associated with the task set that
     * serves traffic after the deployment is complete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgrouppairinfo.html#cfn-codedeploy-deploymentgroup-targetgrouppairinfo-targetgroups)
     */
    public fun targetGroups(): Any? = unwrap(this).getTargetGroups()

    /**
     * An optional path used by a load balancer to route test traffic after an Amazon ECS
     * deployment.
     *
     * Validation can occur while test traffic is served during a deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgrouppairinfo.html#cfn-codedeploy-deploymentgroup-targetgrouppairinfo-testtrafficroute)
     */
    public fun testTrafficRoute(): Any? = unwrap(this).getTestTrafficRoute()

    /**
     * A builder for [TargetGroupPairInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param prodTrafficRoute The path used by a load balancer to route production traffic when
       * an Amazon ECS deployment is complete.
       */
      public fun prodTrafficRoute(prodTrafficRoute: IResolvable)

      /**
       * @param prodTrafficRoute The path used by a load balancer to route production traffic when
       * an Amazon ECS deployment is complete.
       */
      public fun prodTrafficRoute(prodTrafficRoute: TrafficRouteProperty)

      /**
       * @param prodTrafficRoute The path used by a load balancer to route production traffic when
       * an Amazon ECS deployment is complete.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d860ab0ec4001f9a04db6a01e0514e8d2ef1c4757237aa30465847c65eb9c71")
      public fun prodTrafficRoute(prodTrafficRoute: TrafficRouteProperty.Builder.() -> Unit)

      /**
       * @param targetGroups One pair of target groups.
       * One is associated with the original task set. The second is associated with the task set
       * that serves traffic after the deployment is complete.
       */
      public fun targetGroups(targetGroups: IResolvable)

      /**
       * @param targetGroups One pair of target groups.
       * One is associated with the original task set. The second is associated with the task set
       * that serves traffic after the deployment is complete.
       */
      public fun targetGroups(targetGroups: List<Any>)

      /**
       * @param targetGroups One pair of target groups.
       * One is associated with the original task set. The second is associated with the task set
       * that serves traffic after the deployment is complete.
       */
      public fun targetGroups(vararg targetGroups: Any)

      /**
       * @param testTrafficRoute An optional path used by a load balancer to route test traffic
       * after an Amazon ECS deployment.
       * Validation can occur while test traffic is served during a deployment.
       */
      public fun testTrafficRoute(testTrafficRoute: IResolvable)

      /**
       * @param testTrafficRoute An optional path used by a load balancer to route test traffic
       * after an Amazon ECS deployment.
       * Validation can occur while test traffic is served during a deployment.
       */
      public fun testTrafficRoute(testTrafficRoute: TrafficRouteProperty)

      /**
       * @param testTrafficRoute An optional path used by a load balancer to route test traffic
       * after an Amazon ECS deployment.
       * Validation can occur while test traffic is served during a deployment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e60564982dd88f61bb8d6311e4be46b6ff8dae6389c71852a67066fa8840ed05")
      public fun testTrafficRoute(testTrafficRoute: TrafficRouteProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty.builder()

      /**
       * @param prodTrafficRoute The path used by a load balancer to route production traffic when
       * an Amazon ECS deployment is complete.
       */
      override fun prodTrafficRoute(prodTrafficRoute: IResolvable) {
        cdkBuilder.prodTrafficRoute(prodTrafficRoute.let(IResolvable::unwrap))
      }

      /**
       * @param prodTrafficRoute The path used by a load balancer to route production traffic when
       * an Amazon ECS deployment is complete.
       */
      override fun prodTrafficRoute(prodTrafficRoute: TrafficRouteProperty) {
        cdkBuilder.prodTrafficRoute(prodTrafficRoute.let(TrafficRouteProperty::unwrap))
      }

      /**
       * @param prodTrafficRoute The path used by a load balancer to route production traffic when
       * an Amazon ECS deployment is complete.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d860ab0ec4001f9a04db6a01e0514e8d2ef1c4757237aa30465847c65eb9c71")
      override fun prodTrafficRoute(prodTrafficRoute: TrafficRouteProperty.Builder.() -> Unit): Unit
          = prodTrafficRoute(TrafficRouteProperty(prodTrafficRoute))

      /**
       * @param targetGroups One pair of target groups.
       * One is associated with the original task set. The second is associated with the task set
       * that serves traffic after the deployment is complete.
       */
      override fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups.let(IResolvable::unwrap))
      }

      /**
       * @param targetGroups One pair of target groups.
       * One is associated with the original task set. The second is associated with the task set
       * that serves traffic after the deployment is complete.
       */
      override fun targetGroups(targetGroups: List<Any>) {
        cdkBuilder.targetGroups(targetGroups)
      }

      /**
       * @param targetGroups One pair of target groups.
       * One is associated with the original task set. The second is associated with the task set
       * that serves traffic after the deployment is complete.
       */
      override fun targetGroups(vararg targetGroups: Any): Unit =
          targetGroups(targetGroups.toList())

      /**
       * @param testTrafficRoute An optional path used by a load balancer to route test traffic
       * after an Amazon ECS deployment.
       * Validation can occur while test traffic is served during a deployment.
       */
      override fun testTrafficRoute(testTrafficRoute: IResolvable) {
        cdkBuilder.testTrafficRoute(testTrafficRoute.let(IResolvable::unwrap))
      }

      /**
       * @param testTrafficRoute An optional path used by a load balancer to route test traffic
       * after an Amazon ECS deployment.
       * Validation can occur while test traffic is served during a deployment.
       */
      override fun testTrafficRoute(testTrafficRoute: TrafficRouteProperty) {
        cdkBuilder.testTrafficRoute(testTrafficRoute.let(TrafficRouteProperty::unwrap))
      }

      /**
       * @param testTrafficRoute An optional path used by a load balancer to route test traffic
       * after an Amazon ECS deployment.
       * Validation can occur while test traffic is served during a deployment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e60564982dd88f61bb8d6311e4be46b6ff8dae6389c71852a67066fa8840ed05")
      override fun testTrafficRoute(testTrafficRoute: TrafficRouteProperty.Builder.() -> Unit): Unit
          = testTrafficRoute(TrafficRouteProperty(testTrafficRoute))

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty,
    ) : CdkObject(cdkObject), TargetGroupPairInfoProperty {
      /**
       * The path used by a load balancer to route production traffic when an Amazon ECS deployment
       * is complete.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgrouppairinfo.html#cfn-codedeploy-deploymentgroup-targetgrouppairinfo-prodtrafficroute)
       */
      override fun prodTrafficRoute(): Any? = unwrap(this).getProdTrafficRoute()

      /**
       * One pair of target groups.
       *
       * One is associated with the original task set. The second is associated with the task set
       * that serves traffic after the deployment is complete.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgrouppairinfo.html#cfn-codedeploy-deploymentgroup-targetgrouppairinfo-targetgroups)
       */
      override fun targetGroups(): Any? = unwrap(this).getTargetGroups()

      /**
       * An optional path used by a load balancer to route test traffic after an Amazon ECS
       * deployment.
       *
       * Validation can occur while test traffic is served during a deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgrouppairinfo.html#cfn-codedeploy-deploymentgroup-targetgrouppairinfo-testtrafficroute)
       */
      override fun testTrafficRoute(): Any? = unwrap(this).getTestTrafficRoute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupPairInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty):
          TargetGroupPairInfoProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetGroupPairInfoProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupPairInfoProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty
    }
  }

  /**
   * Information about a listener.
   *
   * The listener contains the path used to route traffic that is received from the load balancer to
   * a target group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * TrafficRouteProperty trafficRouteProperty = TrafficRouteProperty.builder()
   * .listenerArns(List.of("listenerArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-trafficroute.html)
   */
  public interface TrafficRouteProperty {
    /**
     * The Amazon Resource Name (ARN) of one listener.
     *
     * The listener identifies the route between a target group and a load balancer. This is an
     * array of strings with a maximum size of one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-trafficroute.html#cfn-codedeploy-deploymentgroup-trafficroute-listenerarns)
     */
    public fun listenerArns(): List<String> = unwrap(this).getListenerArns() ?: emptyList()

    /**
     * A builder for [TrafficRouteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param listenerArns The Amazon Resource Name (ARN) of one listener.
       * The listener identifies the route between a target group and a load balancer. This is an
       * array of strings with a maximum size of one.
       */
      public fun listenerArns(listenerArns: List<String>)

      /**
       * @param listenerArns The Amazon Resource Name (ARN) of one listener.
       * The listener identifies the route between a target group and a load balancer. This is an
       * array of strings with a maximum size of one.
       */
      public fun listenerArns(vararg listenerArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty.builder()

      /**
       * @param listenerArns The Amazon Resource Name (ARN) of one listener.
       * The listener identifies the route between a target group and a load balancer. This is an
       * array of strings with a maximum size of one.
       */
      override fun listenerArns(listenerArns: List<String>) {
        cdkBuilder.listenerArns(listenerArns)
      }

      /**
       * @param listenerArns The Amazon Resource Name (ARN) of one listener.
       * The listener identifies the route between a target group and a load balancer. This is an
       * array of strings with a maximum size of one.
       */
      override fun listenerArns(vararg listenerArns: String): Unit =
          listenerArns(listenerArns.toList())

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty,
    ) : CdkObject(cdkObject), TrafficRouteProperty {
      /**
       * The Amazon Resource Name (ARN) of one listener.
       *
       * The listener identifies the route between a target group and a load balancer. This is an
       * array of strings with a maximum size of one.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-trafficroute.html#cfn-codedeploy-deploymentgroup-trafficroute-listenerarns)
       */
      override fun listenerArns(): List<String> = unwrap(this).getListenerArns() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty):
          TrafficRouteProperty = CdkObjectWrappers.wrap(cdkObject) as? TrafficRouteProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficRouteProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty
    }
  }

  /**
   * Information about notification triggers for the deployment group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * TriggerConfigProperty triggerConfigProperty = TriggerConfigProperty.builder()
   * .triggerEvents(List.of("triggerEvents"))
   * .triggerName("triggerName")
   * .triggerTargetArn("triggerTargetArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html)
   */
  public interface TriggerConfigProperty {
    /**
     * The event type or types that trigger notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents)
     */
    public fun triggerEvents(): List<String> = unwrap(this).getTriggerEvents() ?: emptyList()

    /**
     * The name of the notification trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername)
     */
    public fun triggerName(): String? = unwrap(this).getTriggerName()

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic through which
     * notifications about deployment or instance events are sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn)
     */
    public fun triggerTargetArn(): String? = unwrap(this).getTriggerTargetArn()

    /**
     * A builder for [TriggerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param triggerEvents The event type or types that trigger notifications.
       */
      public fun triggerEvents(triggerEvents: List<String>)

      /**
       * @param triggerEvents The event type or types that trigger notifications.
       */
      public fun triggerEvents(vararg triggerEvents: String)

      /**
       * @param triggerName The name of the notification trigger.
       */
      public fun triggerName(triggerName: String)

      /**
       * @param triggerTargetArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
       * Service topic through which notifications about deployment or instance events are sent.
       */
      public fun triggerTargetArn(triggerTargetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty.builder()

      /**
       * @param triggerEvents The event type or types that trigger notifications.
       */
      override fun triggerEvents(triggerEvents: List<String>) {
        cdkBuilder.triggerEvents(triggerEvents)
      }

      /**
       * @param triggerEvents The event type or types that trigger notifications.
       */
      override fun triggerEvents(vararg triggerEvents: String): Unit =
          triggerEvents(triggerEvents.toList())

      /**
       * @param triggerName The name of the notification trigger.
       */
      override fun triggerName(triggerName: String) {
        cdkBuilder.triggerName(triggerName)
      }

      /**
       * @param triggerTargetArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
       * Service topic through which notifications about deployment or instance events are sent.
       */
      override fun triggerTargetArn(triggerTargetArn: String) {
        cdkBuilder.triggerTargetArn(triggerTargetArn)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty,
    ) : CdkObject(cdkObject), TriggerConfigProperty {
      /**
       * The event type or types that trigger notifications.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents)
       */
      override fun triggerEvents(): List<String> = unwrap(this).getTriggerEvents() ?: emptyList()

      /**
       * The name of the notification trigger.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername)
       */
      override fun triggerName(): String? = unwrap(this).getTriggerName()

      /**
       * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic through
       * which notifications about deployment or instance events are sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn)
       */
      override fun triggerTargetArn(): String? = unwrap(this).getTriggerTargetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TriggerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty):
          TriggerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TriggerConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggerConfigProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty
    }
  }
}
