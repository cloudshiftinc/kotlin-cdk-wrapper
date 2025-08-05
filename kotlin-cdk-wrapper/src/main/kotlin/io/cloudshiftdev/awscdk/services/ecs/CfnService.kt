@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ECS::Service` resource creates an Amazon Elastic Container Service (Amazon ECS) service
 * that runs and maintains the requested number of tasks and associated load balancers.
 *
 *
 * The stack update fails if you change any properties that require replacement and at least one
 * Amazon ECS Service Connect `ServiceConnectConfiguration` property is configured. This is because AWS
 * CloudFormation creates the replacement service first, but each `ServiceConnectService` must have a
 * name that is unique in the namespace. &gt; Starting April 15, 2023, AWS ; will not onboard new
 * customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads
 * to options that offer better price and performance. After April 15, 2023, new customers will not be
 * able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS , or Amazon EC2
 * . However, customers who have used Amazon EI at least once during the past 30-day period are
 * considered current customers and will be able to continue using the service. &gt; On June 12, 2025,
 * Amazon ECS launched support for updating capacity provider configuration for Amazon ECS services.
 * With this launch, Amazon ECS also aligned the AWS CloudFormation update behavior for
 * `CapacityProviderStrategy` parameter with the standard practice. For more information, see [Amazon
 * ECS adds support for updating capacity provider configuration for ECS
 * services](https://docs.aws.amazon.com/about-aws/whats-new/2025/05/amazon-ecs-capacity-provider-configuration-ecs/)
 * . Previously Amazon ECS ignored the `CapacityProviderStrategy` property if it was set to an empty
 * list for example, `[]` in AWS CloudFormation , because updating capacity provider configuration was
 * not supported. Now, with support for capacity provider updates, customers can remove capacity
 * providers from a service by passing an empty list. When you specify an empty list ( `[]` ) for the
 * `CapacityProviderStrategy` property in your AWS CloudFormation template, Amazon ECS will remove any
 * capacity providers associated with the service, as follows:
 *
 * * For services created with a capacity provider strategy after the launch:
 * * If there's a cluster default strategy set, the service will revert to using that default
 * strategy.
 * * If no cluster default strategy exists, you will receive the following error:
 *
 * No launch type to fall back to for empty capacity provider strategy. Your service was not created
 * with a launch type.
 *
 * * For services created with a capacity provider strategy prior to the launch:
 * * If `CapacityProviderStrategy` had `FARGATE_SPOT` or `FARGATE` capacity providers, the launch
 * type will be updated to `FARGATE` and the capacity provider will be removed.
 * * If the strategy included Auto Scaling group capacity providers, the service will revert to EC2
 * launch type, and the Auto Scaling group capacity providers will not be used.
 *
 * Recommended Actions
 *
 * If you are currently using `CapacityProviderStrategy: []` in your AWS CloudFormation templates,
 * you should take one of the following actions:
 *
 * * If you do not intend to update the Capacity Provider Strategy:
 * * Remove the `CapacityProviderStrategy` property entirely from your AWS CloudFormation template
 * * Alternatively, use `!Ref AWS ::NoValue` for the `CapacityProviderStrategy` property in your
 * template
 * * If you intend to maintain or update the Capacity Provider Strategy, specify the actual Capacity
 * Provider Strategy for the service in your AWS CloudFormation template.
 *
 * If your AWS CloudFormation template had an empty list ([]) for `CapacityProviderStrategy` prior
 * to the aforementioned launch on June 12, and you are using the same template with
 * `CapacityProviderStrategy: []` , you might encounter the following error:
 *
 * Invalid request provided: When switching from launch type to capacity provider strategy on an
 * existing service, or making a change to a capacity provider strategy on a service that is already
 * using one, you must force a new deployment. (Service: Ecs, Status Code: 400, Request ID: xxx) (SDK
 * Attempt Count: 1)" (RequestToken: xxx HandlerErrorCode: InvalidRequest)
 *
 * Note that AWS CloudFormation automatically initiates a new deployment when it detects a parameter
 * change, but customers cannot choose to force a deployment through AWS CloudFormation . This is an
 * invalid input scenario that requires one of the remediation actions listed above.
 *
 * If you are experiencing active production issues related to this change, contact AWS Support or
 * your Technical Account Manager.
 *
 *
 * Example:
 *
 * ```
 * FargateService service;
 * CfnService cfnService = (CfnService)service.getNode().getDefaultChild();
 * cfnService.getDeploymentConfiguration() = DeploymentConfigurationProperty.builder()
 * .maximumPercent(200)
 * .minimumHealthyPercent(100)
 * .strategy("BLUE_GREEN")
 * .bakeTimeInMinutes(15)
 * .lifecycleHooks(List.of(DeploymentLifecycleHookProperty.builder()
 * .hookTargetArn("arn:aws:lambda:region:account:function:pre-deployment-hook")
 * .roleArn("arn:aws:iam::account:role/deployment-hook-role")
 * .lifecycleStages(List.of("PRE_STOP", "POST_START"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html)
 */
public open class CfnService(
  cdkObject: software.amazon.awscdk.services.ecs.CfnService,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ecs.CfnService(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceProps,
  ) :
      this(software.amazon.awscdk.services.ecs.CfnService(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnServiceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnServiceProps(props)
  )

  /**
   * The name of the Amazon ECS service, such as `sample-webapp` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The ARN that identifies the service.
   *
   * For more information about the ARN format, see [Amazon Resource Name
   * (ARN)](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html#ecs-resource-ids)
   * in the *Amazon ECS Developer Guide* .
   */
  public open fun attrServiceArn(): String = unwrap(this).getAttrServiceArn()

  /**
   * Indicates whether to use Availability Zone rebalancing for the service.
   */
  public open fun availabilityZoneRebalancing(): String? =
      unwrap(this).getAvailabilityZoneRebalancing()

  /**
   * Indicates whether to use Availability Zone rebalancing for the service.
   */
  public open fun availabilityZoneRebalancing(`value`: String) {
    unwrap(this).setAvailabilityZoneRebalancing(`value`)
  }

  /**
   * The capacity provider strategy to use for the service.
   */
  public open fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

  /**
   * The capacity provider strategy to use for the service.
   */
  public open fun capacityProviderStrategy(`value`: IResolvable) {
    unwrap(this).setCapacityProviderStrategy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The capacity provider strategy to use for the service.
   */
  public open fun capacityProviderStrategy(`value`: List<Any>) {
    unwrap(this).setCapacityProviderStrategy(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The capacity provider strategy to use for the service.
   */
  public open fun capacityProviderStrategy(vararg `value`: Any): Unit =
      capacityProviderStrategy(`value`.toList())

  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that you run your service on.
   */
  public open fun cluster(): String? = unwrap(this).getCluster()

  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that you run your service on.
   */
  public open fun cluster(`value`: String) {
    unwrap(this).setCluster(`value`)
  }

  /**
   * Optional deployment parameters that control how many tasks run during the deployment and the
   * ordering of stopping and starting tasks.
   */
  public open fun deploymentConfiguration(): Any? = unwrap(this).getDeploymentConfiguration()

  /**
   * Optional deployment parameters that control how many tasks run during the deployment and the
   * ordering of stopping and starting tasks.
   */
  public open fun deploymentConfiguration(`value`: IResolvable) {
    unwrap(this).setDeploymentConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Optional deployment parameters that control how many tasks run during the deployment and the
   * ordering of stopping and starting tasks.
   */
  public open fun deploymentConfiguration(`value`: DeploymentConfigurationProperty) {
    unwrap(this).setDeploymentConfiguration(`value`.let(DeploymentConfigurationProperty.Companion::unwrap))
  }

  /**
   * Optional deployment parameters that control how many tasks run during the deployment and the
   * ordering of stopping and starting tasks.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b237ed05545d34c4cf98ae8855935be09660dba08dc5338b6296b20040f07f17")
  public open
      fun deploymentConfiguration(`value`: DeploymentConfigurationProperty.Builder.() -> Unit): Unit
      = deploymentConfiguration(DeploymentConfigurationProperty(`value`))

  /**
   * The deployment controller to use for the service.
   */
  public open fun deploymentController(): Any? = unwrap(this).getDeploymentController()

  /**
   * The deployment controller to use for the service.
   */
  public open fun deploymentController(`value`: IResolvable) {
    unwrap(this).setDeploymentController(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The deployment controller to use for the service.
   */
  public open fun deploymentController(`value`: DeploymentControllerProperty) {
    unwrap(this).setDeploymentController(`value`.let(DeploymentControllerProperty.Companion::unwrap))
  }

  /**
   * The deployment controller to use for the service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0b6db0216ad80eab0d29faf00fdc099392e7b67702d42db126b15018f7c12173")
  public open fun deploymentController(`value`: DeploymentControllerProperty.Builder.() -> Unit):
      Unit = deploymentController(DeploymentControllerProperty(`value`))

  /**
   * The number of instantiations of the specified task definition to place and keep running in your
   * service.
   */
  public open fun desiredCount(): Number? = unwrap(this).getDesiredCount()

  /**
   * The number of instantiations of the specified task definition to place and keep running in your
   * service.
   */
  public open fun desiredCount(`value`: Number) {
    unwrap(this).setDesiredCount(`value`)
  }

  /**
   * Specifies whether to turn on Amazon ECS managed tags for the tasks within the service.
   */
  public open fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

  /**
   * Specifies whether to turn on Amazon ECS managed tags for the tasks within the service.
   */
  public open fun enableEcsManagedTags(`value`: Boolean) {
    unwrap(this).setEnableEcsManagedTags(`value`)
  }

  /**
   * Specifies whether to turn on Amazon ECS managed tags for the tasks within the service.
   */
  public open fun enableEcsManagedTags(`value`: IResolvable) {
    unwrap(this).setEnableEcsManagedTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Determines whether the execute command functionality is turned on for the service.
   */
  public open fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

  /**
   * Determines whether the execute command functionality is turned on for the service.
   */
  public open fun enableExecuteCommand(`value`: Boolean) {
    unwrap(this).setEnableExecuteCommand(`value`)
  }

  /**
   * Determines whether the execute command functionality is turned on for the service.
   */
  public open fun enableExecuteCommand(`value`: IResolvable) {
    unwrap(this).setEnableExecuteCommand(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic
   * Load Balancing, VPC Lattice, and container health checks after a task has first started.
   */
  public open fun healthCheckGracePeriodSeconds(): Number? =
      unwrap(this).getHealthCheckGracePeriodSeconds()

  /**
   * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic
   * Load Balancing, VPC Lattice, and container health checks after a task has first started.
   */
  public open fun healthCheckGracePeriodSeconds(`value`: Number) {
    unwrap(this).setHealthCheckGracePeriodSeconds(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The launch type on which to run your service.
   */
  public open fun launchType(): String? = unwrap(this).getLaunchType()

  /**
   * The launch type on which to run your service.
   */
  public open fun launchType(`value`: String) {
    unwrap(this).setLaunchType(`value`)
  }

  /**
   * A list of load balancer objects to associate with the service.
   */
  public open fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

  /**
   * A list of load balancer objects to associate with the service.
   */
  public open fun loadBalancers(`value`: IResolvable) {
    unwrap(this).setLoadBalancers(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of load balancer objects to associate with the service.
   */
  public open fun loadBalancers(`value`: List<Any>) {
    unwrap(this).setLoadBalancers(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of load balancer objects to associate with the service.
   */
  public open fun loadBalancers(vararg `value`: Any): Unit = loadBalancers(`value`.toList())

  /**
   * The network configuration for the service.
   */
  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The network configuration for the service.
   */
  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The network configuration for the service.
   */
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty.Companion::unwrap))
  }

  /**
   * The network configuration for the service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b602c8d77fd908cdbc82f46996119da42cf6abc5be2f4d439f6ab4675e3b6959")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  /**
   * An array of placement constraint objects to use for tasks in your service.
   */
  public open fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

  /**
   * An array of placement constraint objects to use for tasks in your service.
   */
  public open fun placementConstraints(`value`: IResolvable) {
    unwrap(this).setPlacementConstraints(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of placement constraint objects to use for tasks in your service.
   */
  public open fun placementConstraints(`value`: List<Any>) {
    unwrap(this).setPlacementConstraints(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of placement constraint objects to use for tasks in your service.
   */
  public open fun placementConstraints(vararg `value`: Any): Unit =
      placementConstraints(`value`.toList())

  /**
   * The placement strategy objects to use for tasks in your service.
   */
  public open fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

  /**
   * The placement strategy objects to use for tasks in your service.
   */
  public open fun placementStrategies(`value`: IResolvable) {
    unwrap(this).setPlacementStrategies(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The placement strategy objects to use for tasks in your service.
   */
  public open fun placementStrategies(`value`: List<Any>) {
    unwrap(this).setPlacementStrategies(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The placement strategy objects to use for tasks in your service.
   */
  public open fun placementStrategies(vararg `value`: Any): Unit =
      placementStrategies(`value`.toList())

  /**
   * The platform version that your tasks in the service are running on.
   */
  public open fun platformVersion(): String? = unwrap(this).getPlatformVersion()

  /**
   * The platform version that your tasks in the service are running on.
   */
  public open fun platformVersion(`value`: String) {
    unwrap(this).setPlatformVersion(`value`)
  }

  /**
   * Specifies whether to propagate the tags from the task definition to the task.
   */
  public open fun propagateTags(): String? = unwrap(this).getPropagateTags()

  /**
   * Specifies whether to propagate the tags from the task definition to the task.
   */
  public open fun propagateTags(`value`: String) {
    unwrap(this).setPropagateTags(`value`)
  }

  /**
   * The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make
   * calls to your load balancer on your behalf.
   */
  public open fun role(): String? = unwrap(this).getRole()

  /**
   * The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make
   * calls to your load balancer on your behalf.
   */
  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  /**
   * The scheduling strategy to use for the service.
   *
   * For more information, see
   * [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
   */
  public open fun schedulingStrategy(): String? = unwrap(this).getSchedulingStrategy()

  /**
   * The scheduling strategy to use for the service.
   *
   * For more information, see
   * [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
   */
  public open fun schedulingStrategy(`value`: String) {
    unwrap(this).setSchedulingStrategy(`value`)
  }

  /**
   * The configuration for this service to discover and connect to services, and be discovered by,
   * and connected from, other services within a namespace.
   */
  public open fun serviceConnectConfiguration(): Any? =
      unwrap(this).getServiceConnectConfiguration()

  /**
   * The configuration for this service to discover and connect to services, and be discovered by,
   * and connected from, other services within a namespace.
   */
  public open fun serviceConnectConfiguration(`value`: IResolvable) {
    unwrap(this).setServiceConnectConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration for this service to discover and connect to services, and be discovered by,
   * and connected from, other services within a namespace.
   */
  public open fun serviceConnectConfiguration(`value`: ServiceConnectConfigurationProperty) {
    unwrap(this).setServiceConnectConfiguration(`value`.let(ServiceConnectConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration for this service to discover and connect to services, and be discovered by,
   * and connected from, other services within a namespace.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ea77deb70521835f0b6bef4d61c62e0fa8cb1dc3bff018b7e7062faf4d80c18")
  public open
      fun serviceConnectConfiguration(`value`: ServiceConnectConfigurationProperty.Builder.() -> Unit):
      Unit = serviceConnectConfiguration(ServiceConnectConfigurationProperty(`value`))

  /**
   * The name of your service.
   */
  public open fun serviceName(): String? = unwrap(this).getServiceName()

  /**
   * The name of your service.
   */
  public open fun serviceName(`value`: String) {
    unwrap(this).setServiceName(`value`)
  }

  /**
   * The details of the service discovery registry to associate with this service.
   *
   * For more information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   */
  public open fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

  /**
   * The details of the service discovery registry to associate with this service.
   *
   * For more information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   */
  public open fun serviceRegistries(`value`: IResolvable) {
    unwrap(this).setServiceRegistries(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The details of the service discovery registry to associate with this service.
   *
   * For more information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   */
  public open fun serviceRegistries(`value`: List<Any>) {
    unwrap(this).setServiceRegistries(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The details of the service discovery registry to associate with this service.
   *
   * For more information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   */
  public open fun serviceRegistries(vararg `value`: Any): Unit = serviceRegistries(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The metadata that you apply to the service to help you categorize and organize them.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The metadata that you apply to the service to help you categorize and organize them.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The metadata that you apply to the service to help you categorize and organize them.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The `family` and `revision` ( `family:revision` ) or full ARN of the task definition to run in
   * your service.
   */
  public open fun taskDefinition(): String? = unwrap(this).getTaskDefinition()

  /**
   * The `family` and `revision` ( `family:revision` ) or full ARN of the task definition to run in
   * your service.
   */
  public open fun taskDefinition(`value`: String) {
    unwrap(this).setTaskDefinition(`value`)
  }

  /**
   * The configuration for a volume specified in the task definition as a volume that is configured
   * at launch time.
   */
  public open fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()

  /**
   * The configuration for a volume specified in the task definition as a volume that is configured
   * at launch time.
   */
  public open fun volumeConfigurations(`value`: IResolvable) {
    unwrap(this).setVolumeConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration for a volume specified in the task definition as a volume that is configured
   * at launch time.
   */
  public open fun volumeConfigurations(`value`: List<Any>) {
    unwrap(this).setVolumeConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The configuration for a volume specified in the task definition as a volume that is configured
   * at launch time.
   */
  public open fun volumeConfigurations(vararg `value`: Any): Unit =
      volumeConfigurations(`value`.toList())

  /**
   * The VPC Lattice configuration for the service being created.
   */
  public open fun vpcLatticeConfigurations(): Any? = unwrap(this).getVpcLatticeConfigurations()

  /**
   * The VPC Lattice configuration for the service being created.
   */
  public open fun vpcLatticeConfigurations(`value`: IResolvable) {
    unwrap(this).setVpcLatticeConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The VPC Lattice configuration for the service being created.
   */
  public open fun vpcLatticeConfigurations(`value`: List<Any>) {
    unwrap(this).setVpcLatticeConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The VPC Lattice configuration for the service being created.
   */
  public open fun vpcLatticeConfigurations(vararg `value`: Any): Unit =
      vpcLatticeConfigurations(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.CfnService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether to use Availability Zone rebalancing for the service.
     *
     * For more information, see [Balancing an Amazon ECS service across Availability
     * Zones](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-rebalancing.html) in
     * the **Amazon Elastic Container Service Developer Guide** .
     *
     * Default: - "DISABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-availabilityzonerebalancing)
     * @param availabilityZoneRebalancing Indicates whether to use Availability Zone rebalancing for
     * the service. 
     */
    public fun availabilityZoneRebalancing(availabilityZoneRebalancing: String)

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy can contain a maximum of 20 capacity providers.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `CapacityProviderStrategyItem` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     * @param capacityProviderStrategy The capacity provider strategy to use for the service. 
     */
    public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable)

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy can contain a maximum of 20 capacity providers.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `CapacityProviderStrategyItem` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     * @param capacityProviderStrategy The capacity provider strategy to use for the service. 
     */
    public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>)

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy can contain a maximum of 20 capacity providers.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `CapacityProviderStrategyItem` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     * @param capacityProviderStrategy The capacity provider strategy to use for the service. 
     */
    public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any)

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that you run your service
     * on.
     *
     * If you do not specify a cluster, the default cluster is assumed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster)
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that you run
     * your service on. 
     */
    public fun cluster(cluster: String)

    /**
     * Optional deployment parameters that control how many tasks run during the deployment and the
     * ordering of stopping and starting tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks. 
     */
    public fun deploymentConfiguration(deploymentConfiguration: IResolvable)

    /**
     * Optional deployment parameters that control how many tasks run during the deployment and the
     * ordering of stopping and starting tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks. 
     */
    public fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty)

    /**
     * Optional deployment parameters that control how many tasks run during the deployment and the
     * ordering of stopping and starting tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f7f500796fe4c3ab47a3c118d841c158ff96d81e6318935b8e1e8afc87b38d")
    public
        fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty.Builder.() -> Unit)

    /**
     * The deployment controller to use for the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    public fun deploymentController(deploymentController: IResolvable)

    /**
     * The deployment controller to use for the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    public fun deploymentController(deploymentController: DeploymentControllerProperty)

    /**
     * The deployment controller to use for the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d9892e0de74cfc9b3d2fc8dd7448baf5c7ea7cfd7bd4fb8a2bac7f3f1c29b6b")
    public
        fun deploymentController(deploymentController: DeploymentControllerProperty.Builder.() -> Unit)

    /**
     * The number of instantiations of the specified task definition to place and keep running in
     * your service.
     *
     * For new services, if a desired count is not specified, a default value of `1` is used. When
     * using the `DAEMON` scheduling strategy, the desired count is not required.
     *
     * For existing services, if a desired count is not specified, it is omitted from the operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount)
     * @param desiredCount The number of instantiations of the specified task definition to place
     * and keep running in your service. 
     */
    public fun desiredCount(desiredCount: Number)

    /**
     * Specifies whether to turn on Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see [Tagging your Amazon ECS
     * resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * When you use Amazon ECS managed tags, you must set the `propagateTags` request parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags)
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     * tasks within the service. 
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * Specifies whether to turn on Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see [Tagging your Amazon ECS
     * resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * When you use Amazon ECS managed tags, you must set the `propagateTags` request parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags)
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     * tasks within the service. 
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable)

    /**
     * Determines whether the execute command functionality is turned on for the service.
     *
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableexecutecommand)
     * @param enableExecuteCommand Determines whether the execute command functionality is turned on
     * for the service. 
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * Determines whether the execute command functionality is turned on for the service.
     *
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableexecutecommand)
     * @param enableExecuteCommand Determines whether the execute command functionality is turned on
     * for the service. 
     */
    public fun enableExecuteCommand(enableExecuteCommand: IResolvable)

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing, VPC Lattice, and container health checks after a task has first started.
     *
     * If you don't specify a health check grace period value, the default value of `0` is used. If
     * you don't use any of the health checks, then `healthCheckGracePeriodSeconds` is unused.
     *
     * If your service's tasks take a while to start and respond to health checks, you can specify a
     * health check grace period of up to 2,147,483,647 seconds (about 69 years). During that time, the
     * Amazon ECS service scheduler ignores health check status. This grace period can prevent the
     * service scheduler from marking tasks as unhealthy and stopping them before they have time to
     * come up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds)
     * @param healthCheckGracePeriodSeconds The period of time, in seconds, that the Amazon ECS
     * service scheduler ignores unhealthy Elastic Load Balancing, VPC Lattice, and container health
     * checks after a task has first started. 
     */
    public fun healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds: Number)

    /**
     * The launch type on which to run your service.
     *
     * For more information, see [Amazon ECS Launch
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype)
     * @param launchType The launch type on which to run your service. 
     */
    public fun launchType(launchType: String)

    /**
     * A list of load balancer objects to associate with the service.
     *
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * To remove this property from your service resource, specify an empty `LoadBalancer` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     * @param loadBalancers A list of load balancer objects to associate with the service. 
     */
    public fun loadBalancers(loadBalancers: IResolvable)

    /**
     * A list of load balancer objects to associate with the service.
     *
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * To remove this property from your service resource, specify an empty `LoadBalancer` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     * @param loadBalancers A list of load balancer objects to associate with the service. 
     */
    public fun loadBalancers(loadBalancers: List<Any>)

    /**
     * A list of load balancer objects to associate with the service.
     *
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * To remove this property from your service resource, specify an empty `LoadBalancer` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     * @param loadBalancers A list of load balancer objects to associate with the service. 
     */
    public fun loadBalancers(vararg loadBalancers: Any)

    /**
     * The network configuration for the service.
     *
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
     * @param networkConfiguration The network configuration for the service. 
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * The network configuration for the service.
     *
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
     * @param networkConfiguration The network configuration for the service. 
     */
    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

    /**
     * The network configuration for the service.
     *
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
     * @param networkConfiguration The network configuration for the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3e8f28a5d18a781ff0151bbb8080c6fd56de0bfe6fcbb47c9c3ef7a8e9fa896")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementConstraint`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service. 
     */
    public fun placementConstraints(placementConstraints: IResolvable)

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementConstraint`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service. 
     */
    public fun placementConstraints(placementConstraints: List<Any>)

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementConstraint`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service. 
     */
    public fun placementConstraints(vararg placementConstraints: Any)

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementStrategy`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     * @param placementStrategies The placement strategy objects to use for tasks in your service. 
     */
    public fun placementStrategies(placementStrategies: IResolvable)

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementStrategy`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     * @param placementStrategies The placement strategy objects to use for tasks in your service. 
     */
    public fun placementStrategies(placementStrategies: List<Any>)

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementStrategy`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     * @param placementStrategies The placement strategy objects to use for tasks in your service. 
     */
    public fun placementStrategies(vararg placementStrategies: Any)

    /**
     * The platform version that your tasks in the service are running on.
     *
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used. For more information, see [AWS Fargate
     * platform
     * versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * Default: - "LATEST"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion)
     * @param platformVersion The platform version that your tasks in the service are running on. 
     */
    public fun platformVersion(platformVersion: String)

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags aren't propagated. Tags can only be propagated to the task
     * during task creation. To add tags to a task after task creation, use the
     * [TagResource](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html)
     * API action.
     *
     * You must set this to a value other than `NONE` when you use Cost Explorer. For more
     * information, see [Amazon ECS usage
     * reports](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/usage-reports.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * The default is `NONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-propagatetags)
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task. 
     */
    public fun propagateTags(propagateTags: String)

    /**
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make
     * calls to your load balancer on your behalf.
     *
     * This parameter is only permitted if you are using a load balancer with your service and your
     * task definition doesn't use the `awsvpc` network mode. If you specify the `role` parameter, you
     * must also specify a load balancer object with the `loadBalancers` parameter.
     *
     *
     * If your account has already created the Amazon ECS service-linked role, that role is used for
     * your service unless you specify a role here. The service-linked role is required if your task
     * definition uses the `awsvpc` network mode or if the service is configured to use service
     * discovery, an external deployment controller, multiple target groups, or Elastic Inference
     * accelerators in which case you don't specify a role here. For more information, see [Using
     * service-linked roles for Amazon
     * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * If your specified role has a path other than `/` , then you must either specify the full role
     * ARN (this is recommended) or prefix the role name with the path. For example, if a role with the
     * name `bar` has a path of `/foo/` then you would specify `/foo/bar` as the role name. For more
     * information, see [Friendly names and
     * paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role)
     * @param role The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon
     * ECS to make calls to your load balancer on your behalf. 
     */
    public fun role(role: String)

    /**
     * The scheduling strategy to use for the service. For more information, see
     * [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
     *
     * There are two service scheduler strategies available:
     *
     * * `REPLICA` -The replica scheduling strategy places and maintains the desired number of tasks
     * across your cluster. By default, the service scheduler spreads tasks across Availability Zones.
     * You can use task placement strategies and constraints to customize task placement decisions.
     * This scheduler strategy is required if the service uses the `CODE_DEPLOY` or `EXTERNAL`
     * deployment controller types.
     * * `DAEMON` -The daemon scheduling strategy deploys exactly one task on each active container
     * instance that meets all of the task placement constraints that you specify in your cluster. The
     * service scheduler also evaluates the task placement constraints for running tasks and will stop
     * tasks that don't meet the placement constraints. When you're using this strategy, you don't need
     * to specify a desired number of tasks, a task placement strategy, or use Service Auto Scaling
     * policies.
     *
     *
     * Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller
     * types don't support the `DAEMON` scheduling strategy.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy)
     * @param schedulingStrategy The scheduling strategy to use for the service. For more
     * information, see
     * [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) . 
     */
    public fun schedulingStrategy(schedulingStrategy: String)

    /**
     * The configuration for this service to discover and connect to services, and be discovered by,
     * and connected from, other services within a namespace.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceconnectconfiguration)
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace. 
     */
    public fun serviceConnectConfiguration(serviceConnectConfiguration: IResolvable)

    /**
     * The configuration for this service to discover and connect to services, and be discovered by,
     * and connected from, other services within a namespace.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceconnectconfiguration)
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace. 
     */
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectConfigurationProperty)

    /**
     * The configuration for this service to discover and connect to services, and be discovered by,
     * and connected from, other services within a namespace.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceconnectconfiguration)
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdfd973eb30ca9d27f340a41b919c48338de7a7528cac48ac3dd7a67c6843295")
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of your service.
     *
     * Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed.
     * Service names must be unique within a cluster, but you can have similarly named services in
     * multiple clusters within a Region or across multiple Regions.
     *
     *
     * The stack update fails if you change any properties that require replacement and the
     * `ServiceName` is configured. This is because AWS CloudFormation creates the replacement service
     * first, but each `ServiceName` must be unique in the cluster.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename)
     * @param serviceName The name of your service. 
     */
    public fun serviceName(serviceName: String)

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported. &gt; To remove this property from your service resource, specify
     * an empty `ServiceRegistry` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     * 
     */
    public fun serviceRegistries(serviceRegistries: IResolvable)

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported. &gt; To remove this property from your service resource, specify
     * an empty `ServiceRegistry` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     * 
     */
    public fun serviceRegistries(serviceRegistries: List<Any>)

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported. &gt; To remove this property from your service resource, specify
     * an empty `ServiceRegistry` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     * 
     */
    public fun serviceRegistries(vararg serviceRegistries: Any)

    /**
     * The metadata that you apply to the service to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define. When a service is
     * deleted, the tags are deleted as well.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-tags)
     * @param tags The metadata that you apply to the service to help you categorize and organize
     * them. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The metadata that you apply to the service to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define. When a service is
     * deleted, the tags are deleted as well.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-tags)
     * @param tags The metadata that you apply to the service to help you categorize and organize
     * them. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The `family` and `revision` ( `family:revision` ) or full ARN of the task definition to run
     * in your service.
     *
     * If a `revision` isn't specified, the latest `ACTIVE` revision is used.
     *
     * A task definition must be specified if the service uses either the `ECS` or `CODE_DEPLOY`
     * deployment controllers.
     *
     * For more information about deployment types, see [Amazon ECS deployment
     * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition)
     * @param taskDefinition The `family` and `revision` ( `family:revision` ) or full ARN of the
     * task definition to run in your service. 
     */
    public fun taskDefinition(taskDefinition: String)

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `ServiceVolumeConfiguration` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time. 
     */
    public fun volumeConfigurations(volumeConfigurations: IResolvable)

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `ServiceVolumeConfiguration` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time. 
     */
    public fun volumeConfigurations(volumeConfigurations: List<Any>)

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `ServiceVolumeConfiguration` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time. 
     */
    public fun volumeConfigurations(vararg volumeConfigurations: Any)

    /**
     * The VPC Lattice configuration for the service being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-vpclatticeconfigurations)
     * @param vpcLatticeConfigurations The VPC Lattice configuration for the service being created. 
     */
    public fun vpcLatticeConfigurations(vpcLatticeConfigurations: IResolvable)

    /**
     * The VPC Lattice configuration for the service being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-vpclatticeconfigurations)
     * @param vpcLatticeConfigurations The VPC Lattice configuration for the service being created. 
     */
    public fun vpcLatticeConfigurations(vpcLatticeConfigurations: List<Any>)

    /**
     * The VPC Lattice configuration for the service being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-vpclatticeconfigurations)
     * @param vpcLatticeConfigurations The VPC Lattice configuration for the service being created. 
     */
    public fun vpcLatticeConfigurations(vararg vpcLatticeConfigurations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnService.Builder =
        software.amazon.awscdk.services.ecs.CfnService.Builder.create(scope, id)

    /**
     * Indicates whether to use Availability Zone rebalancing for the service.
     *
     * For more information, see [Balancing an Amazon ECS service across Availability
     * Zones](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-rebalancing.html) in
     * the **Amazon Elastic Container Service Developer Guide** .
     *
     * Default: - "DISABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-availabilityzonerebalancing)
     * @param availabilityZoneRebalancing Indicates whether to use Availability Zone rebalancing for
     * the service. 
     */
    override fun availabilityZoneRebalancing(availabilityZoneRebalancing: String) {
      cdkBuilder.availabilityZoneRebalancing(availabilityZoneRebalancing)
    }

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy can contain a maximum of 20 capacity providers.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `CapacityProviderStrategyItem` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     * @param capacityProviderStrategy The capacity provider strategy to use for the service. 
     */
    override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable.Companion::unwrap))
    }

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy can contain a maximum of 20 capacity providers.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `CapacityProviderStrategyItem` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     * @param capacityProviderStrategy The capacity provider strategy to use for the service. 
     */
    override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy can contain a maximum of 20 capacity providers.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `CapacityProviderStrategyItem` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     * @param capacityProviderStrategy The capacity provider strategy to use for the service. 
     */
    override fun capacityProviderStrategy(vararg capacityProviderStrategy: Any): Unit =
        capacityProviderStrategy(capacityProviderStrategy.toList())

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that you run your service
     * on.
     *
     * If you do not specify a cluster, the default cluster is assumed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster)
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that you run
     * your service on. 
     */
    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    /**
     * Optional deployment parameters that control how many tasks run during the deployment and the
     * ordering of stopping and starting tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks. 
     */
    override fun deploymentConfiguration(deploymentConfiguration: IResolvable) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Optional deployment parameters that control how many tasks run during the deployment and the
     * ordering of stopping and starting tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks. 
     */
    override fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(DeploymentConfigurationProperty.Companion::unwrap))
    }

    /**
     * Optional deployment parameters that control how many tasks run during the deployment and the
     * ordering of stopping and starting tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f7f500796fe4c3ab47a3c118d841c158ff96d81e6318935b8e1e8afc87b38d")
    override
        fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty.Builder.() -> Unit):
        Unit = deploymentConfiguration(DeploymentConfigurationProperty(deploymentConfiguration))

    /**
     * The deployment controller to use for the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    override fun deploymentController(deploymentController: IResolvable) {
      cdkBuilder.deploymentController(deploymentController.let(IResolvable.Companion::unwrap))
    }

    /**
     * The deployment controller to use for the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    override fun deploymentController(deploymentController: DeploymentControllerProperty) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentControllerProperty.Companion::unwrap))
    }

    /**
     * The deployment controller to use for the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d9892e0de74cfc9b3d2fc8dd7448baf5c7ea7cfd7bd4fb8a2bac7f3f1c29b6b")
    override
        fun deploymentController(deploymentController: DeploymentControllerProperty.Builder.() -> Unit):
        Unit = deploymentController(DeploymentControllerProperty(deploymentController))

    /**
     * The number of instantiations of the specified task definition to place and keep running in
     * your service.
     *
     * For new services, if a desired count is not specified, a default value of `1` is used. When
     * using the `DAEMON` scheduling strategy, the desired count is not required.
     *
     * For existing services, if a desired count is not specified, it is omitted from the operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount)
     * @param desiredCount The number of instantiations of the specified task definition to place
     * and keep running in your service. 
     */
    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * Specifies whether to turn on Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see [Tagging your Amazon ECS
     * resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * When you use Amazon ECS managed tags, you must set the `propagateTags` request parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags)
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     * tasks within the service. 
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * Specifies whether to turn on Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see [Tagging your Amazon ECS
     * resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * When you use Amazon ECS managed tags, you must set the `propagateTags` request parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags)
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     * tasks within the service. 
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * Determines whether the execute command functionality is turned on for the service.
     *
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableexecutecommand)
     * @param enableExecuteCommand Determines whether the execute command functionality is turned on
     * for the service. 
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * Determines whether the execute command functionality is turned on for the service.
     *
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableexecutecommand)
     * @param enableExecuteCommand Determines whether the execute command functionality is turned on
     * for the service. 
     */
    override fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable.Companion::unwrap))
    }

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing, VPC Lattice, and container health checks after a task has first started.
     *
     * If you don't specify a health check grace period value, the default value of `0` is used. If
     * you don't use any of the health checks, then `healthCheckGracePeriodSeconds` is unused.
     *
     * If your service's tasks take a while to start and respond to health checks, you can specify a
     * health check grace period of up to 2,147,483,647 seconds (about 69 years). During that time, the
     * Amazon ECS service scheduler ignores health check status. This grace period can prevent the
     * service scheduler from marking tasks as unhealthy and stopping them before they have time to
     * come up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds)
     * @param healthCheckGracePeriodSeconds The period of time, in seconds, that the Amazon ECS
     * service scheduler ignores unhealthy Elastic Load Balancing, VPC Lattice, and container health
     * checks after a task has first started. 
     */
    override fun healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds: Number) {
      cdkBuilder.healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds)
    }

    /**
     * The launch type on which to run your service.
     *
     * For more information, see [Amazon ECS Launch
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype)
     * @param launchType The launch type on which to run your service. 
     */
    override fun launchType(launchType: String) {
      cdkBuilder.launchType(launchType)
    }

    /**
     * A list of load balancer objects to associate with the service.
     *
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * To remove this property from your service resource, specify an empty `LoadBalancer` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     * @param loadBalancers A list of load balancer objects to associate with the service. 
     */
    override fun loadBalancers(loadBalancers: IResolvable) {
      cdkBuilder.loadBalancers(loadBalancers.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of load balancer objects to associate with the service.
     *
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * To remove this property from your service resource, specify an empty `LoadBalancer` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     * @param loadBalancers A list of load balancer objects to associate with the service. 
     */
    override fun loadBalancers(loadBalancers: List<Any>) {
      cdkBuilder.loadBalancers(loadBalancers.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of load balancer objects to associate with the service.
     *
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * To remove this property from your service resource, specify an empty `LoadBalancer` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     * @param loadBalancers A list of load balancer objects to associate with the service. 
     */
    override fun loadBalancers(vararg loadBalancers: Any): Unit =
        loadBalancers(loadBalancers.toList())

    /**
     * The network configuration for the service.
     *
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
     * @param networkConfiguration The network configuration for the service. 
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The network configuration for the service.
     *
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
     * @param networkConfiguration The network configuration for the service. 
     */
    override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty.Companion::unwrap))
    }

    /**
     * The network configuration for the service.
     *
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
     * @param networkConfiguration The network configuration for the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3e8f28a5d18a781ff0151bbb8080c6fd56de0bfe6fcbb47c9c3ef7a8e9fa896")
    override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementConstraint`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service. 
     */
    override fun placementConstraints(placementConstraints: IResolvable) {
      cdkBuilder.placementConstraints(placementConstraints.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementConstraint`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service. 
     */
    override fun placementConstraints(placementConstraints: List<Any>) {
      cdkBuilder.placementConstraints(placementConstraints.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementConstraint`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service. 
     */
    override fun placementConstraints(vararg placementConstraints: Any): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementStrategy`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     * @param placementStrategies The placement strategy objects to use for tasks in your service. 
     */
    override fun placementStrategies(placementStrategies: IResolvable) {
      cdkBuilder.placementStrategies(placementStrategies.let(IResolvable.Companion::unwrap))
    }

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementStrategy`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     * @param placementStrategies The placement strategy objects to use for tasks in your service. 
     */
    override fun placementStrategies(placementStrategies: List<Any>) {
      cdkBuilder.placementStrategies(placementStrategies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     *
     * To remove this property from your service resource, specify an empty `PlacementStrategy`
     * array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     * @param placementStrategies The placement strategy objects to use for tasks in your service. 
     */
    override fun placementStrategies(vararg placementStrategies: Any): Unit =
        placementStrategies(placementStrategies.toList())

    /**
     * The platform version that your tasks in the service are running on.
     *
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used. For more information, see [AWS Fargate
     * platform
     * versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * Default: - "LATEST"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion)
     * @param platformVersion The platform version that your tasks in the service are running on. 
     */
    override fun platformVersion(platformVersion: String) {
      cdkBuilder.platformVersion(platformVersion)
    }

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags aren't propagated. Tags can only be propagated to the task
     * during task creation. To add tags to a task after task creation, use the
     * [TagResource](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html)
     * API action.
     *
     * You must set this to a value other than `NONE` when you use Cost Explorer. For more
     * information, see [Amazon ECS usage
     * reports](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/usage-reports.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * The default is `NONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-propagatetags)
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task. 
     */
    override fun propagateTags(propagateTags: String) {
      cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make
     * calls to your load balancer on your behalf.
     *
     * This parameter is only permitted if you are using a load balancer with your service and your
     * task definition doesn't use the `awsvpc` network mode. If you specify the `role` parameter, you
     * must also specify a load balancer object with the `loadBalancers` parameter.
     *
     *
     * If your account has already created the Amazon ECS service-linked role, that role is used for
     * your service unless you specify a role here. The service-linked role is required if your task
     * definition uses the `awsvpc` network mode or if the service is configured to use service
     * discovery, an external deployment controller, multiple target groups, or Elastic Inference
     * accelerators in which case you don't specify a role here. For more information, see [Using
     * service-linked roles for Amazon
     * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * If your specified role has a path other than `/` , then you must either specify the full role
     * ARN (this is recommended) or prefix the role name with the path. For example, if a role with the
     * name `bar` has a path of `/foo/` then you would specify `/foo/bar` as the role name. For more
     * information, see [Friendly names and
     * paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role)
     * @param role The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon
     * ECS to make calls to your load balancer on your behalf. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * The scheduling strategy to use for the service. For more information, see
     * [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
     *
     * There are two service scheduler strategies available:
     *
     * * `REPLICA` -The replica scheduling strategy places and maintains the desired number of tasks
     * across your cluster. By default, the service scheduler spreads tasks across Availability Zones.
     * You can use task placement strategies and constraints to customize task placement decisions.
     * This scheduler strategy is required if the service uses the `CODE_DEPLOY` or `EXTERNAL`
     * deployment controller types.
     * * `DAEMON` -The daemon scheduling strategy deploys exactly one task on each active container
     * instance that meets all of the task placement constraints that you specify in your cluster. The
     * service scheduler also evaluates the task placement constraints for running tasks and will stop
     * tasks that don't meet the placement constraints. When you're using this strategy, you don't need
     * to specify a desired number of tasks, a task placement strategy, or use Service Auto Scaling
     * policies.
     *
     *
     * Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller
     * types don't support the `DAEMON` scheduling strategy.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy)
     * @param schedulingStrategy The scheduling strategy to use for the service. For more
     * information, see
     * [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) . 
     */
    override fun schedulingStrategy(schedulingStrategy: String) {
      cdkBuilder.schedulingStrategy(schedulingStrategy)
    }

    /**
     * The configuration for this service to discover and connect to services, and be discovered by,
     * and connected from, other services within a namespace.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceconnectconfiguration)
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace. 
     */
    override fun serviceConnectConfiguration(serviceConnectConfiguration: IResolvable) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration for this service to discover and connect to services, and be discovered by,
     * and connected from, other services within a namespace.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceconnectconfiguration)
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace. 
     */
    override
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectConfigurationProperty) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(ServiceConnectConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration for this service to discover and connect to services, and be discovered by,
     * and connected from, other services within a namespace.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceconnectconfiguration)
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdfd973eb30ca9d27f340a41b919c48338de7a7528cac48ac3dd7a67c6843295")
    override
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectConfigurationProperty.Builder.() -> Unit):
        Unit =
        serviceConnectConfiguration(ServiceConnectConfigurationProperty(serviceConnectConfiguration))

    /**
     * The name of your service.
     *
     * Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed.
     * Service names must be unique within a cluster, but you can have similarly named services in
     * multiple clusters within a Region or across multiple Regions.
     *
     *
     * The stack update fails if you change any properties that require replacement and the
     * `ServiceName` is configured. This is because AWS CloudFormation creates the replacement service
     * first, but each `ServiceName` must be unique in the cluster.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename)
     * @param serviceName The name of your service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported. &gt; To remove this property from your service resource, specify
     * an empty `ServiceRegistry` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     * 
     */
    override fun serviceRegistries(serviceRegistries: IResolvable) {
      cdkBuilder.serviceRegistries(serviceRegistries.let(IResolvable.Companion::unwrap))
    }

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported. &gt; To remove this property from your service resource, specify
     * an empty `ServiceRegistry` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     * 
     */
    override fun serviceRegistries(serviceRegistries: List<Any>) {
      cdkBuilder.serviceRegistries(serviceRegistries.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported. &gt; To remove this property from your service resource, specify
     * an empty `ServiceRegistry` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     * 
     */
    override fun serviceRegistries(vararg serviceRegistries: Any): Unit =
        serviceRegistries(serviceRegistries.toList())

    /**
     * The metadata that you apply to the service to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define. When a service is
     * deleted, the tags are deleted as well.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-tags)
     * @param tags The metadata that you apply to the service to help you categorize and organize
     * them. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The metadata that you apply to the service to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define. When a service is
     * deleted, the tags are deleted as well.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-tags)
     * @param tags The metadata that you apply to the service to help you categorize and organize
     * them. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The `family` and `revision` ( `family:revision` ) or full ARN of the task definition to run
     * in your service.
     *
     * If a `revision` isn't specified, the latest `ACTIVE` revision is used.
     *
     * A task definition must be specified if the service uses either the `ECS` or `CODE_DEPLOY`
     * deployment controllers.
     *
     * For more information about deployment types, see [Amazon ECS deployment
     * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition)
     * @param taskDefinition The `family` and `revision` ( `family:revision` ) or full ARN of the
     * task definition to run in your service. 
     */
    override fun taskDefinition(taskDefinition: String) {
      cdkBuilder.taskDefinition(taskDefinition)
    }

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `ServiceVolumeConfiguration` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time. 
     */
    override fun volumeConfigurations(volumeConfigurations: IResolvable) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `ServiceVolumeConfiguration` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time. 
     */
    override fun volumeConfigurations(volumeConfigurations: List<Any>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     *
     * To remove this property from your service resource, specify an empty
     * `ServiceVolumeConfiguration` array.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time. 
     */
    override fun volumeConfigurations(vararg volumeConfigurations: Any): Unit =
        volumeConfigurations(volumeConfigurations.toList())

    /**
     * The VPC Lattice configuration for the service being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-vpclatticeconfigurations)
     * @param vpcLatticeConfigurations The VPC Lattice configuration for the service being created. 
     */
    override fun vpcLatticeConfigurations(vpcLatticeConfigurations: IResolvable) {
      cdkBuilder.vpcLatticeConfigurations(vpcLatticeConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * The VPC Lattice configuration for the service being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-vpclatticeconfigurations)
     * @param vpcLatticeConfigurations The VPC Lattice configuration for the service being created. 
     */
    override fun vpcLatticeConfigurations(vpcLatticeConfigurations: List<Any>) {
      cdkBuilder.vpcLatticeConfigurations(vpcLatticeConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The VPC Lattice configuration for the service being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-vpclatticeconfigurations)
     * @param vpcLatticeConfigurations The VPC Lattice configuration for the service being created. 
     */
    override fun vpcLatticeConfigurations(vararg vpcLatticeConfigurations: Any): Unit =
        vpcLatticeConfigurations(vpcLatticeConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnService = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecs.CfnService.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService): CfnService =
        CfnService(cdkObject)

    internal fun unwrap(wrapped: CfnService): software.amazon.awscdk.services.ecs.CfnService =
        wrapped.cdkObject as software.amazon.awscdk.services.ecs.CfnService
  }

  /**
   * The advanced settings for a load balancer used in blue/green deployments.
   *
   * Specify the alternate target group, listener rules, and IAM role required for traffic shifting
   * during blue/green deployments. For more information, see [Required resources for Amazon ECS
   * blue/green
   * deployments](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/blue-green-deployment-implementation.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * AdvancedConfigurationProperty advancedConfigurationProperty =
   * AdvancedConfigurationProperty.builder()
   * .alternateTargetGroupArn("alternateTargetGroupArn")
   * // the properties below are optional
   * .productionListenerRule("productionListenerRule")
   * .roleArn("roleArn")
   * .testListenerRule("testListenerRule")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-advancedconfiguration.html)
   */
  public interface AdvancedConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the alternate target group for Amazon ECS blue/green
     * deployments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-advancedconfiguration.html#cfn-ecs-service-advancedconfiguration-alternatetargetgrouparn)
     */
    public fun alternateTargetGroupArn(): String

    /**
     * The Amazon Resource Name (ARN) that that identifies the production listener rule (in the case
     * of an Application Load Balancer) or listener (in the case for an Network Load Balancer) for
     * routing production traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-advancedconfiguration.html#cfn-ecs-service-advancedconfiguration-productionlistenerrule)
     */
    public fun productionListenerRule(): String? = unwrap(this).getProductionListenerRule()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon ECS permission to call the
     * Elastic Load Balancing APIs for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-advancedconfiguration.html#cfn-ecs-service-advancedconfiguration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The Amazon Resource Name (ARN) that identifies ) that identifies the test listener rule (in
     * the case of an Application Load Balancer) or listener (in the case for an Network Load Balancer)
     * for routing test traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-advancedconfiguration.html#cfn-ecs-service-advancedconfiguration-testlistenerrule)
     */
    public fun testListenerRule(): String? = unwrap(this).getTestListenerRule()

    /**
     * A builder for [AdvancedConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alternateTargetGroupArn The Amazon Resource Name (ARN) of the alternate target group
       * for Amazon ECS blue/green deployments. 
       */
      public fun alternateTargetGroupArn(alternateTargetGroupArn: String)

      /**
       * @param productionListenerRule The Amazon Resource Name (ARN) that that identifies the
       * production listener rule (in the case of an Application Load Balancer) or listener (in the
       * case for an Network Load Balancer) for routing production traffic.
       */
      public fun productionListenerRule(productionListenerRule: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon ECS
       * permission to call the Elastic Load Balancing APIs for you.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param testListenerRule The Amazon Resource Name (ARN) that identifies ) that identifies
       * the test listener rule (in the case of an Application Load Balancer) or listener (in the case
       * for an Network Load Balancer) for routing test traffic.
       */
      public fun testListenerRule(testListenerRule: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.AdvancedConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.AdvancedConfigurationProperty.builder()

      /**
       * @param alternateTargetGroupArn The Amazon Resource Name (ARN) of the alternate target group
       * for Amazon ECS blue/green deployments. 
       */
      override fun alternateTargetGroupArn(alternateTargetGroupArn: String) {
        cdkBuilder.alternateTargetGroupArn(alternateTargetGroupArn)
      }

      /**
       * @param productionListenerRule The Amazon Resource Name (ARN) that that identifies the
       * production listener rule (in the case of an Application Load Balancer) or listener (in the
       * case for an Network Load Balancer) for routing production traffic.
       */
      override fun productionListenerRule(productionListenerRule: String) {
        cdkBuilder.productionListenerRule(productionListenerRule)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon ECS
       * permission to call the Elastic Load Balancing APIs for you.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param testListenerRule The Amazon Resource Name (ARN) that identifies ) that identifies
       * the test listener rule (in the case of an Application Load Balancer) or listener (in the case
       * for an Network Load Balancer) for routing test traffic.
       */
      override fun testListenerRule(testListenerRule: String) {
        cdkBuilder.testListenerRule(testListenerRule)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.AdvancedConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.AdvancedConfigurationProperty,
    ) : CdkObject(cdkObject),
        AdvancedConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the alternate target group for Amazon ECS blue/green
       * deployments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-advancedconfiguration.html#cfn-ecs-service-advancedconfiguration-alternatetargetgrouparn)
       */
      override fun alternateTargetGroupArn(): String = unwrap(this).getAlternateTargetGroupArn()

      /**
       * The Amazon Resource Name (ARN) that that identifies the production listener rule (in the
       * case of an Application Load Balancer) or listener (in the case for an Network Load Balancer)
       * for routing production traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-advancedconfiguration.html#cfn-ecs-service-advancedconfiguration-productionlistenerrule)
       */
      override fun productionListenerRule(): String? = unwrap(this).getProductionListenerRule()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that grants Amazon ECS permission to call
       * the Elastic Load Balancing APIs for you.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-advancedconfiguration.html#cfn-ecs-service-advancedconfiguration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The Amazon Resource Name (ARN) that identifies ) that identifies the test listener rule (in
       * the case of an Application Load Balancer) or listener (in the case for an Network Load
       * Balancer) for routing test traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-advancedconfiguration.html#cfn-ecs-service-advancedconfiguration-testlistenerrule)
       */
      override fun testListenerRule(): String? = unwrap(this).getTestListenerRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.AdvancedConfigurationProperty):
          AdvancedConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdvancedConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.AdvancedConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.AdvancedConfigurationProperty
    }
  }

  /**
   * An object representing the networking details for a task or service.
   *
   * For example `awsVpcConfiguration={subnets=["subnet-12344321"],securityGroups=["sg-12344321"]}`
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * AwsVpcConfigurationProperty awsVpcConfigurationProperty = AwsVpcConfigurationProperty.builder()
   * .assignPublicIp("assignPublicIp")
   * .securityGroups(List.of("securityGroups"))
   * .subnets(List.of("subnets"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html)
   */
  public interface AwsVpcConfigurationProperty {
    /**
     * Whether the task's elastic network interface receives a public IP address.
     *
     * Consider the following when you set this value:
     *
     * * When you use `create-service` or `update-service` , the default is `DISABLED` .
     * * When the service `deploymentController` is `ECS` , the value must be `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip)
     */
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    /**
     * The IDs of the security groups associated with the task or service.
     *
     * If you don't specify a security group, the default security group for the VPC is used.
     * There's a limit of 5 security groups that can be specified.
     *
     *
     * All specified security groups must be from the same VPC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * The IDs of the subnets associated with the task or service.
     *
     * There's a limit of 16 subnets that can be specified.
     *
     *
     * All specified subnets must be from the same VPC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-subnets)
     */
    public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    /**
     * A builder for [AwsVpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assignPublicIp Whether the task's elastic network interface receives a public IP
       * address.
       * Consider the following when you set this value:
       *
       * * When you use `create-service` or `update-service` , the default is `DISABLED` .
       * * When the service `deploymentController` is `ECS` , the value must be `DISABLED` .
       */
      public fun assignPublicIp(assignPublicIp: String)

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified.
       *
       *
       * All specified security groups must be from the same VPC.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified.
       *
       *
       * All specified security groups must be from the same VPC.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param subnets The IDs of the subnets associated with the task or service.
       * There's a limit of 16 subnets that can be specified.
       *
       *
       * All specified subnets must be from the same VPC.
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The IDs of the subnets associated with the task or service.
       * There's a limit of 16 subnets that can be specified.
       *
       *
       * All specified subnets must be from the same VPC.
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty.builder()

      /**
       * @param assignPublicIp Whether the task's elastic network interface receives a public IP
       * address.
       * Consider the following when you set this value:
       *
       * * When you use `create-service` or `update-service` , the default is `DISABLED` .
       * * When the service `deploymentController` is `ECS` , the value must be `DISABLED` .
       */
      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified.
       *
       *
       * All specified security groups must be from the same VPC.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified.
       *
       *
       * All specified security groups must be from the same VPC.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param subnets The IDs of the subnets associated with the task or service.
       * There's a limit of 16 subnets that can be specified.
       *
       *
       * All specified subnets must be from the same VPC.
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The IDs of the subnets associated with the task or service.
       * There's a limit of 16 subnets that can be specified.
       *
       *
       * All specified subnets must be from the same VPC.
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty,
    ) : CdkObject(cdkObject),
        AwsVpcConfigurationProperty {
      /**
       * Whether the task's elastic network interface receives a public IP address.
       *
       * Consider the following when you set this value:
       *
       * * When you use `create-service` or `update-service` , the default is `DISABLED` .
       * * When the service `deploymentController` is `ECS` , the value must be `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip)
       */
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      /**
       * The IDs of the security groups associated with the task or service.
       *
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified.
       *
       *
       * All specified security groups must be from the same VPC.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
       * The IDs of the subnets associated with the task or service.
       *
       * There's a limit of 16 subnets that can be specified.
       *
       *
       * All specified subnets must be from the same VPC.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AwsVpcConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty
    }
  }

  /**
   * The details of a capacity provider strategy.
   *
   * A capacity provider strategy can be set when using the `RunTask` or `CreateService` APIs or as
   * the default capacity provider strategy for a cluster with the `CreateCluster` API.
   *
   * Only capacity providers that are already associated with a cluster and have an `ACTIVE` or
   * `UPDATING` status can be used in a capacity provider strategy. The `PutClusterCapacityProviders`
   * API is used to associate a capacity provider with a cluster.
   *
   * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must
   * already be created. New Auto Scaling group capacity providers can be created with the
   * `CreateCapacityProvider` API operation.
   *
   * To use an AWS Fargate capacity provider, specify either the `FARGATE` or `FARGATE_SPOT`
   * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need
   * to be associated with a cluster to be used in a capacity provider strategy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * CapacityProviderStrategyItemProperty capacityProviderStrategyItemProperty =
   * CapacityProviderStrategyItemProperty.builder()
   * .base(123)
   * .capacityProvider("capacityProvider")
   * .weight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-capacityproviderstrategyitem.html)
   */
  public interface CapacityProviderStrategyItemProperty {
    /**
     * The *base* value designates how many tasks, at a minimum, to run on the specified capacity
     * provider.
     *
     * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
     * value is specified, the default value of `0` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-capacityproviderstrategyitem.html#cfn-ecs-service-capacityproviderstrategyitem-base)
     */
    public fun base(): Number? = unwrap(this).getBase()

    /**
     * The short name of the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-capacityproviderstrategyitem.html#cfn-ecs-service-capacityproviderstrategyitem-capacityprovider)
     */
    public fun capacityProvider(): String? = unwrap(this).getCapacityProvider()

    /**
     * The *weight* value designates the relative percentage of the total number of tasks launched
     * that should use the specified capacity provider.
     *
     * The `weight` value is taken into consideration after the `base` value, if defined, is
     * satisfied.
     *
     * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
     * providers are specified within a capacity provider strategy, at least one of the capacity
     * providers must have a weight value greater than zero and any capacity providers with a weight of
     * `0` can't be used to place tasks. If you specify multiple capacity providers in a strategy that
     * all have a weight of `0` , any `RunTask` or `CreateService` actions using the capacity provider
     * strategy will fail.
     *
     * An example scenario for using weights is defining a strategy that contains two capacity
     * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
     * split evenly across the two capacity providers. Using that same logic, if you specify a weight
     * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every one
     * task that's run using *capacityProviderA* , four tasks would use *capacityProviderB* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-capacityproviderstrategyitem.html#cfn-ecs-service-capacityproviderstrategyitem-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [CapacityProviderStrategyItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param base The *base* value designates how many tasks, at a minimum, to run on the
       * specified capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
       * value is specified, the default value of `0` is used.
       */
      public fun base(base: Number)

      /**
       * @param capacityProvider The short name of the capacity provider.
       */
      public fun capacityProvider(capacityProvider: String)

      /**
       * @param weight The *weight* value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The `weight` value is taken into consideration after the `base` value, if defined, is
       * satisfied.
       *
       * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
       * providers are specified within a capacity provider strategy, at least one of the capacity
       * providers must have a weight value greater than zero and any capacity providers with a weight
       * of `0` can't be used to place tasks. If you specify multiple capacity providers in a strategy
       * that all have a weight of `0` , any `RunTask` or `CreateService` actions using the capacity
       * provider strategy will fail.
       *
       * An example scenario for using weights is defining a strategy that contains two capacity
       * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
       * split evenly across the two capacity providers. Using that same logic, if you specify a weight
       * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every
       * one task that's run using *capacityProviderA* , four tasks would use *capacityProviderB* .
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty.builder()

      /**
       * @param base The *base* value designates how many tasks, at a minimum, to run on the
       * specified capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
       * value is specified, the default value of `0` is used.
       */
      override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      /**
       * @param capacityProvider The short name of the capacity provider.
       */
      override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      /**
       * @param weight The *weight* value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The `weight` value is taken into consideration after the `base` value, if defined, is
       * satisfied.
       *
       * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
       * providers are specified within a capacity provider strategy, at least one of the capacity
       * providers must have a weight value greater than zero and any capacity providers with a weight
       * of `0` can't be used to place tasks. If you specify multiple capacity providers in a strategy
       * that all have a weight of `0` , any `RunTask` or `CreateService` actions using the capacity
       * provider strategy will fail.
       *
       * An example scenario for using weights is defining a strategy that contains two capacity
       * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
       * split evenly across the two capacity providers. Using that same logic, if you specify a weight
       * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every
       * one task that's run using *capacityProviderA* , four tasks would use *capacityProviderB* .
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty,
    ) : CdkObject(cdkObject),
        CapacityProviderStrategyItemProperty {
      /**
       * The *base* value designates how many tasks, at a minimum, to run on the specified capacity
       * provider.
       *
       * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
       * value is specified, the default value of `0` is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-capacityproviderstrategyitem.html#cfn-ecs-service-capacityproviderstrategyitem-base)
       */
      override fun base(): Number? = unwrap(this).getBase()

      /**
       * The short name of the capacity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-capacityproviderstrategyitem.html#cfn-ecs-service-capacityproviderstrategyitem-capacityprovider)
       */
      override fun capacityProvider(): String? = unwrap(this).getCapacityProvider()

      /**
       * The *weight* value designates the relative percentage of the total number of tasks launched
       * that should use the specified capacity provider.
       *
       * The `weight` value is taken into consideration after the `base` value, if defined, is
       * satisfied.
       *
       * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
       * providers are specified within a capacity provider strategy, at least one of the capacity
       * providers must have a weight value greater than zero and any capacity providers with a weight
       * of `0` can't be used to place tasks. If you specify multiple capacity providers in a strategy
       * that all have a weight of `0` , any `RunTask` or `CreateService` actions using the capacity
       * provider strategy will fail.
       *
       * An example scenario for using weights is defining a strategy that contains two capacity
       * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
       * split evenly across the two capacity providers. Using that same logic, if you specify a weight
       * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every
       * one task that's run using *capacityProviderA* , four tasks would use *capacityProviderB* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-capacityproviderstrategyitem.html#cfn-ecs-service-capacityproviderstrategyitem-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityProviderStrategyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CapacityProviderStrategyItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty
    }
  }

  /**
   * One of the methods which provide a way for you to quickly identify when a deployment has
   * failed, and then to optionally roll back the failure to the last working deployment.
   *
   * When the alarms are generated, Amazon ECS sets the service deployment to failed. Set the
   * rollback parameter to have Amazon ECS to roll back your service to the last completed deployment
   * after a failure.
   *
   * You can only use the `DeploymentAlarms` method to detect failures when the
   * `DeploymentController` is set to `ECS` .
   *
   * For more information, see [Rolling
   * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html) in
   * the **Amazon Elastic Container Service Developer Guide** .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * DeploymentAlarmsProperty deploymentAlarmsProperty = DeploymentAlarmsProperty.builder()
   * .alarmNames(List.of("alarmNames"))
   * .enable(false)
   * .rollback(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentalarms.html)
   */
  public interface DeploymentAlarmsProperty {
    /**
     * One or more CloudWatch alarm names.
     *
     * Use a "," to separate the alarms.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentalarms.html#cfn-ecs-service-deploymentalarms-alarmnames)
     */
    public fun alarmNames(): List<String>

    /**
     * Determines whether to use the CloudWatch alarm option in the service deployment process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentalarms.html#cfn-ecs-service-deploymentalarms-enable)
     */
    public fun enable(): Any

    /**
     * Determines whether to configure Amazon ECS to roll back the service if a service deployment
     * fails.
     *
     * If rollback is used, when a service deployment fails, the service is rolled back to the last
     * deployment that completed successfully.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentalarms.html#cfn-ecs-service-deploymentalarms-rollback)
     */
    public fun rollback(): Any

    /**
     * A builder for [DeploymentAlarmsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmNames One or more CloudWatch alarm names. 
       * Use a "," to separate the alarms.
       */
      public fun alarmNames(alarmNames: List<String>)

      /**
       * @param alarmNames One or more CloudWatch alarm names. 
       * Use a "," to separate the alarms.
       */
      public fun alarmNames(vararg alarmNames: String)

      /**
       * @param enable Determines whether to use the CloudWatch alarm option in the service
       * deployment process. 
       */
      public fun enable(enable: Boolean)

      /**
       * @param enable Determines whether to use the CloudWatch alarm option in the service
       * deployment process. 
       */
      public fun enable(enable: IResolvable)

      /**
       * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
       * service deployment fails. 
       * If rollback is used, when a service deployment fails, the service is rolled back to the
       * last deployment that completed successfully.
       */
      public fun rollback(rollback: Boolean)

      /**
       * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
       * service deployment fails. 
       * If rollback is used, when a service deployment fails, the service is rolled back to the
       * last deployment that completed successfully.
       */
      public fun rollback(rollback: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty.builder()

      /**
       * @param alarmNames One or more CloudWatch alarm names. 
       * Use a "," to separate the alarms.
       */
      override fun alarmNames(alarmNames: List<String>) {
        cdkBuilder.alarmNames(alarmNames)
      }

      /**
       * @param alarmNames One or more CloudWatch alarm names. 
       * Use a "," to separate the alarms.
       */
      override fun alarmNames(vararg alarmNames: String): Unit = alarmNames(alarmNames.toList())

      /**
       * @param enable Determines whether to use the CloudWatch alarm option in the service
       * deployment process. 
       */
      override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      /**
       * @param enable Determines whether to use the CloudWatch alarm option in the service
       * deployment process. 
       */
      override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
       * service deployment fails. 
       * If rollback is used, when a service deployment fails, the service is rolled back to the
       * last deployment that completed successfully.
       */
      override fun rollback(rollback: Boolean) {
        cdkBuilder.rollback(rollback)
      }

      /**
       * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
       * service deployment fails. 
       * If rollback is used, when a service deployment fails, the service is rolled back to the
       * last deployment that completed successfully.
       */
      override fun rollback(rollback: IResolvable) {
        cdkBuilder.rollback(rollback.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty,
    ) : CdkObject(cdkObject),
        DeploymentAlarmsProperty {
      /**
       * One or more CloudWatch alarm names.
       *
       * Use a "," to separate the alarms.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentalarms.html#cfn-ecs-service-deploymentalarms-alarmnames)
       */
      override fun alarmNames(): List<String> = unwrap(this).getAlarmNames()

      /**
       * Determines whether to use the CloudWatch alarm option in the service deployment process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentalarms.html#cfn-ecs-service-deploymentalarms-enable)
       */
      override fun enable(): Any = unwrap(this).getEnable()

      /**
       * Determines whether to configure Amazon ECS to roll back the service if a service deployment
       * fails.
       *
       * If rollback is used, when a service deployment fails, the service is rolled back to the
       * last deployment that completed successfully.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentalarms.html#cfn-ecs-service-deploymentalarms-rollback)
       */
      override fun rollback(): Any = unwrap(this).getRollback()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentAlarmsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty):
          DeploymentAlarmsProperty = CdkObjectWrappers.wrap(cdkObject) as? DeploymentAlarmsProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentAlarmsProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty
    }
  }

  /**
   * The deployment circuit breaker can only be used for services using the rolling update ( `ECS` )
   * deployment type.
   *
   * The *deployment circuit breaker* determines whether a service deployment will fail if the
   * service can't reach a steady state. If it is turned on, a service deployment will transition to a
   * failed state and stop launching new tasks. You can also configure Amazon ECS to roll back your
   * service to the last completed deployment after a failure. For more information, see [Rolling
   * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html) in
   * the *Amazon Elastic Container Service Developer Guide* .
   *
   * For more information about API failure reasons, see [API failure
   * reasons](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/api_failures_messages.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * DeploymentCircuitBreakerProperty deploymentCircuitBreakerProperty =
   * DeploymentCircuitBreakerProperty.builder()
   * .enable(false)
   * .rollback(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcircuitbreaker.html)
   */
  public interface DeploymentCircuitBreakerProperty {
    /**
     * Determines whether to use the deployment circuit breaker logic for the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcircuitbreaker.html#cfn-ecs-service-deploymentcircuitbreaker-enable)
     */
    public fun enable(): Any

    /**
     * Determines whether to configure Amazon ECS to roll back the service if a service deployment
     * fails.
     *
     * If rollback is on, when a service deployment fails, the service is rolled back to the last
     * deployment that completed successfully.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcircuitbreaker.html#cfn-ecs-service-deploymentcircuitbreaker-rollback)
     */
    public fun rollback(): Any

    /**
     * A builder for [DeploymentCircuitBreakerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enable Determines whether to use the deployment circuit breaker logic for the
       * service. 
       */
      public fun enable(enable: Boolean)

      /**
       * @param enable Determines whether to use the deployment circuit breaker logic for the
       * service. 
       */
      public fun enable(enable: IResolvable)

      /**
       * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
       * service deployment fails. 
       * If rollback is on, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully.
       */
      public fun rollback(rollback: Boolean)

      /**
       * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
       * service deployment fails. 
       * If rollback is on, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully.
       */
      public fun rollback(rollback: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty.builder()

      /**
       * @param enable Determines whether to use the deployment circuit breaker logic for the
       * service. 
       */
      override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      /**
       * @param enable Determines whether to use the deployment circuit breaker logic for the
       * service. 
       */
      override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
       * service deployment fails. 
       * If rollback is on, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully.
       */
      override fun rollback(rollback: Boolean) {
        cdkBuilder.rollback(rollback)
      }

      /**
       * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
       * service deployment fails. 
       * If rollback is on, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully.
       */
      override fun rollback(rollback: IResolvable) {
        cdkBuilder.rollback(rollback.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty,
    ) : CdkObject(cdkObject),
        DeploymentCircuitBreakerProperty {
      /**
       * Determines whether to use the deployment circuit breaker logic for the service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcircuitbreaker.html#cfn-ecs-service-deploymentcircuitbreaker-enable)
       */
      override fun enable(): Any = unwrap(this).getEnable()

      /**
       * Determines whether to configure Amazon ECS to roll back the service if a service deployment
       * fails.
       *
       * If rollback is on, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcircuitbreaker.html#cfn-ecs-service-deploymentcircuitbreaker-rollback)
       */
      override fun rollback(): Any = unwrap(this).getRollback()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentCircuitBreakerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty):
          DeploymentCircuitBreakerProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentCircuitBreakerProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentCircuitBreakerProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty
    }
  }

  /**
   * Optional deployment parameters that control how many tasks run during a deployment and the
   * ordering of stopping and starting tasks.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * DeploymentConfigurationProperty deploymentConfigurationProperty =
   * DeploymentConfigurationProperty.builder()
   * .alarms(DeploymentAlarmsProperty.builder()
   * .alarmNames(List.of("alarmNames"))
   * .enable(false)
   * .rollback(false)
   * .build())
   * .bakeTimeInMinutes(123)
   * .deploymentCircuitBreaker(DeploymentCircuitBreakerProperty.builder()
   * .enable(false)
   * .rollback(false)
   * .build())
   * .lifecycleHooks(List.of(DeploymentLifecycleHookProperty.builder()
   * .hookTargetArn("hookTargetArn")
   * .lifecycleStages(List.of("lifecycleStages"))
   * .roleArn("roleArn")
   * .build()))
   * .maximumPercent(123)
   * .minimumHealthyPercent(123)
   * .strategy("strategy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html)
   */
  public interface DeploymentConfigurationProperty {
    /**
     * Information about the CloudWatch alarms.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-alarms)
     */
    public fun alarms(): Any? = unwrap(this).getAlarms()

    /**
     * The duration when both blue and green service revisions are running simultaneously after the
     * production traffic has shifted.
     *
     * The following rules apply when you don't specify a value:
     *
     * * For rolling deployments, the value is set to 3 hours (180 minutes).
     * * When you use an external deployment controller ( `EXTERNAL` ), or the CodeDeploy blue/green
     * deployment controller ( `CODE_DEPLOY` ), the value is set to 3 hours (180 minutes).
     * * For all other cases, the value is set to 36 hours (2160 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-baketimeinminutes)
     */
    public fun bakeTimeInMinutes(): Number? = unwrap(this).getBakeTimeInMinutes()

    /**
     * The deployment circuit breaker can only be used for services using the rolling update ( `ECS`
     * ) deployment type.
     *
     * The *deployment circuit breaker* determines whether a service deployment will fail if the
     * service can't reach a steady state. If you use the deployment circuit breaker, a service
     * deployment will transition to a failed state and stop launching new tasks. If you use the
     * rollback option, when a service deployment fails, the service is rolled back to the last
     * deployment that completed successfully. For more information, see [Rolling
     * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html) in
     * the *Amazon Elastic Container Service Developer Guide*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-deploymentcircuitbreaker)
     */
    public fun deploymentCircuitBreaker(): Any? = unwrap(this).getDeploymentCircuitBreaker()

    /**
     * An array of deployment lifecycle hook objects to run custom logic at specific stages of the
     * deployment lifecycle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-lifecyclehooks)
     */
    public fun lifecycleHooks(): Any? = unwrap(this).getLifecycleHooks()

    /**
     * If a service is using the rolling update ( `ECS` ) deployment type, the `maximumPercent`
     * parameter represents an upper limit on the number of your service's tasks that are allowed in
     * the `RUNNING` or `PENDING` state during a deployment, as a percentage of the `desiredCount`
     * (rounded down to the nearest integer).
     *
     * This parameter enables you to define the deployment batch size. For example, if your service
     * is using the `REPLICA` service scheduler and has a `desiredCount` of four tasks and a
     * `maximumPercent` value of 200%, the scheduler may start four new tasks before stopping the four
     * older tasks (provided that the cluster resources required to do this are available). The default
     * `maximumPercent` value for a service using the `REPLICA` service scheduler is 200%.
     *
     * The Amazon ECS scheduler uses this parameter to replace unhealthy tasks by starting
     * replacement tasks first and then stopping the unhealthy tasks, as long as cluster resources for
     * starting replacement tasks are available. For more information about how the scheduler replaces
     * unhealthy tasks, see [Amazon ECS
     * services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
     *
     * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types,
     * and tasks in the service use the EC2 launch type, the *maximum percent* value is set to the
     * default value. The *maximum percent* value is used to define the upper limit on the number of
     * the tasks in the service that remain in the `RUNNING` state while the container instances are in
     * the `DRAINING` state.
     *
     *
     * You can't specify a custom `maximumPercent` value for a service that uses either the
     * blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types and has tasks that use the EC2
     * launch type.
     *
     *
     * If the service uses either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types,
     * and the tasks in the service use the Fargate launch type, the maximum percent value is not used.
     * The value is still returned when describing your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent)
     */
    public fun maximumPercent(): Number? = unwrap(this).getMaximumPercent()

    /**
     * If a service is using the rolling update ( `ECS` ) deployment type, the
     * `minimumHealthyPercent` represents a lower limit on the number of your service's tasks that must
     * remain in the `RUNNING` state during a deployment, as a percentage of the `desiredCount`
     * (rounded up to the nearest integer).
     *
     * This parameter enables you to deploy without using additional cluster capacity. For example,
     * if your service has a `desiredCount` of four tasks and a `minimumHealthyPercent` of 50%, the
     * service scheduler may stop two existing tasks to free up cluster capacity before starting two
     * new tasks.
     *
     * If any tasks are unhealthy and if `maximumPercent` doesn't allow the Amazon ECS scheduler to
     * start replacement tasks, the scheduler stops the unhealthy tasks one-by-one — using the
     * `minimumHealthyPercent` as a constraint — to clear up capacity to launch replacement tasks. For
     * more information about how the scheduler replaces unhealthy tasks, see [Amazon ECS
     * services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
     *
     * For services that *do not* use a load balancer, the following should be noted:
     *
     * * A service is considered healthy if all essential containers within the tasks in the service
     * pass their health checks.
     * * If a task has no essential containers with a health check defined, the service scheduler
     * will wait for 40 seconds after a task reaches a `RUNNING` state before the task is counted
     * towards the minimum healthy percent total.
     * * If a task has one or more essential containers with a health check defined, the service
     * scheduler will wait for the task to reach a healthy status before counting it towards the
     * minimum healthy percent total. A task is considered healthy when all essential containers within
     * the task have passed their health checks. The amount of time the service scheduler can wait for
     * is determined by the container health check settings.
     *
     * For services that *do* use a load balancer, the following should be noted:
     *
     * * If a task has no essential containers with a health check defined, the service scheduler
     * will wait for the load balancer target group health check to return a healthy status before
     * counting the task towards the minimum healthy percent total.
     * * If a task has an essential container with a health check defined, the service scheduler
     * will wait for both the task to reach a healthy status and the load balancer target group health
     * check to return a healthy status before counting the task towards the minimum healthy percent
     * total.
     *
     * The default value for a replica service for `minimumHealthyPercent` is 100%. The default
     * `minimumHealthyPercent` value for a service using the `DAEMON` service schedule is 0% for the
     * AWS CLI , the AWS SDKs, and the APIs and 50% for the AWS Management Console.
     *
     * The minimum number of healthy tasks during a deployment is the `desiredCount` multiplied by
     * the `minimumHealthyPercent` /100, rounded up to the nearest integer value.
     *
     * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types
     * and is running tasks that use the EC2 launch type, the *minimum healthy percent* value is set to
     * the default value. The *minimum healthy percent* value is used to define the lower limit on the
     * number of the tasks in the service that remain in the `RUNNING` state while the container
     * instances are in the `DRAINING` state.
     *
     *
     * You can't specify a custom `minimumHealthyPercent` value for a service that uses either the
     * blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types and has tasks that use the EC2
     * launch type.
     *
     *
     * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types
     * and is running tasks that use the Fargate launch type, the minimum healthy percent value is not
     * used, although it is returned when describing your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent)
     */
    public fun minimumHealthyPercent(): Number? = unwrap(this).getMinimumHealthyPercent()

    /**
     * The deployment strategy for the service. Choose from these valid values:.
     *
     * * `ROLLING` - When you create a service which uses the rolling update ( `ROLLING` )
     * deployment strategy, the Amazon ECS service scheduler replaces the currently running tasks with
     * new tasks. The number of tasks that Amazon ECS adds or removes from the service during a rolling
     * update is controlled by the service deployment configuration.
     * * `BLUE_GREEN` - A blue/green deployment strategy ( `BLUE_GREEN` ) is a release methodology
     * that reduces downtime and risk by running two identical production environments called blue and
     * green. With Amazon ECS blue/green deployments, you can validate new service revisions before
     * directing production traffic to them. This approach provides a safer way to deploy changes with
     * the ability to quickly roll back if needed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-strategy)
     */
    public fun strategy(): String? = unwrap(this).getStrategy()

    /**
     * A builder for [DeploymentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarms Information about the CloudWatch alarms.
       */
      public fun alarms(alarms: IResolvable)

      /**
       * @param alarms Information about the CloudWatch alarms.
       */
      public fun alarms(alarms: DeploymentAlarmsProperty)

      /**
       * @param alarms Information about the CloudWatch alarms.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efd9a5f127d78c01958f4cf4b39acf88204ea3d9b713d0c6e12a4bcd49c0914b")
      public fun alarms(alarms: DeploymentAlarmsProperty.Builder.() -> Unit)

      /**
       * @param bakeTimeInMinutes The duration when both blue and green service revisions are
       * running simultaneously after the production traffic has shifted.
       * The following rules apply when you don't specify a value:
       *
       * * For rolling deployments, the value is set to 3 hours (180 minutes).
       * * When you use an external deployment controller ( `EXTERNAL` ), or the CodeDeploy
       * blue/green deployment controller ( `CODE_DEPLOY` ), the value is set to 3 hours (180 minutes).
       * * For all other cases, the value is set to 36 hours (2160 minutes).
       */
      public fun bakeTimeInMinutes(bakeTimeInMinutes: Number)

      /**
       * @param deploymentCircuitBreaker The deployment circuit breaker can only be used for
       * services using the rolling update ( `ECS` ) deployment type.
       * The *deployment circuit breaker* determines whether a service deployment will fail if the
       * service can't reach a steady state. If you use the deployment circuit breaker, a service
       * deployment will transition to a failed state and stop launching new tasks. If you use the
       * rollback option, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully. For more information, see [Rolling
       * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
       * in the *Amazon Elastic Container Service Developer Guide*
       */
      public fun deploymentCircuitBreaker(deploymentCircuitBreaker: IResolvable)

      /**
       * @param deploymentCircuitBreaker The deployment circuit breaker can only be used for
       * services using the rolling update ( `ECS` ) deployment type.
       * The *deployment circuit breaker* determines whether a service deployment will fail if the
       * service can't reach a steady state. If you use the deployment circuit breaker, a service
       * deployment will transition to a failed state and stop launching new tasks. If you use the
       * rollback option, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully. For more information, see [Rolling
       * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
       * in the *Amazon Elastic Container Service Developer Guide*
       */
      public
          fun deploymentCircuitBreaker(deploymentCircuitBreaker: DeploymentCircuitBreakerProperty)

      /**
       * @param deploymentCircuitBreaker The deployment circuit breaker can only be used for
       * services using the rolling update ( `ECS` ) deployment type.
       * The *deployment circuit breaker* determines whether a service deployment will fail if the
       * service can't reach a steady state. If you use the deployment circuit breaker, a service
       * deployment will transition to a failed state and stop launching new tasks. If you use the
       * rollback option, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully. For more information, see [Rolling
       * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
       * in the *Amazon Elastic Container Service Developer Guide*
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d33a617c577ba243f4f0271ff561c8f6ede78b9600fbb68e0f022c6bfe2d4c")
      public
          fun deploymentCircuitBreaker(deploymentCircuitBreaker: DeploymentCircuitBreakerProperty.Builder.() -> Unit)

      /**
       * @param lifecycleHooks An array of deployment lifecycle hook objects to run custom logic at
       * specific stages of the deployment lifecycle.
       */
      public fun lifecycleHooks(lifecycleHooks: IResolvable)

      /**
       * @param lifecycleHooks An array of deployment lifecycle hook objects to run custom logic at
       * specific stages of the deployment lifecycle.
       */
      public fun lifecycleHooks(lifecycleHooks: List<Any>)

      /**
       * @param lifecycleHooks An array of deployment lifecycle hook objects to run custom logic at
       * specific stages of the deployment lifecycle.
       */
      public fun lifecycleHooks(vararg lifecycleHooks: Any)

      /**
       * @param maximumPercent If a service is using the rolling update ( `ECS` ) deployment type,
       * the `maximumPercent` parameter represents an upper limit on the number of your service's tasks
       * that are allowed in the `RUNNING` or `PENDING` state during a deployment, as a percentage of
       * the `desiredCount` (rounded down to the nearest integer).
       * This parameter enables you to define the deployment batch size. For example, if your
       * service is using the `REPLICA` service scheduler and has a `desiredCount` of four tasks and a
       * `maximumPercent` value of 200%, the scheduler may start four new tasks before stopping the
       * four older tasks (provided that the cluster resources required to do this are available). The
       * default `maximumPercent` value for a service using the `REPLICA` service scheduler is 200%.
       *
       * The Amazon ECS scheduler uses this parameter to replace unhealthy tasks by starting
       * replacement tasks first and then stopping the unhealthy tasks, as long as cluster resources
       * for starting replacement tasks are available. For more information about how the scheduler
       * replaces unhealthy tasks, see [Amazon ECS
       * services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
       *
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types, and tasks in the service use the EC2 launch type, the *maximum percent* value is set to
       * the default value. The *maximum percent* value is used to define the upper limit on the number
       * of the tasks in the service that remain in the `RUNNING` state while the container instances
       * are in the `DRAINING` state.
       *
       *
       * You can't specify a custom `maximumPercent` value for a service that uses either the
       * blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types and has tasks that use the EC2
       * launch type.
       *
       *
       * If the service uses either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types,
       * and the tasks in the service use the Fargate launch type, the maximum percent value is not
       * used. The value is still returned when describing your service.
       */
      public fun maximumPercent(maximumPercent: Number)

      /**
       * @param minimumHealthyPercent If a service is using the rolling update ( `ECS` ) deployment
       * type, the `minimumHealthyPercent` represents a lower limit on the number of your service's
       * tasks that must remain in the `RUNNING` state during a deployment, as a percentage of the
       * `desiredCount` (rounded up to the nearest integer).
       * This parameter enables you to deploy without using additional cluster capacity. For
       * example, if your service has a `desiredCount` of four tasks and a `minimumHealthyPercent` of
       * 50%, the service scheduler may stop two existing tasks to free up cluster capacity before
       * starting two new tasks.
       *
       * If any tasks are unhealthy and if `maximumPercent` doesn't allow the Amazon ECS scheduler
       * to start replacement tasks, the scheduler stops the unhealthy tasks one-by-one — using the
       * `minimumHealthyPercent` as a constraint — to clear up capacity to launch replacement tasks.
       * For more information about how the scheduler replaces unhealthy tasks, see [Amazon ECS
       * services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
       *
       * For services that *do not* use a load balancer, the following should be noted:
       *
       * * A service is considered healthy if all essential containers within the tasks in the
       * service pass their health checks.
       * * If a task has no essential containers with a health check defined, the service scheduler
       * will wait for 40 seconds after a task reaches a `RUNNING` state before the task is counted
       * towards the minimum healthy percent total.
       * * If a task has one or more essential containers with a health check defined, the service
       * scheduler will wait for the task to reach a healthy status before counting it towards the
       * minimum healthy percent total. A task is considered healthy when all essential containers
       * within the task have passed their health checks. The amount of time the service scheduler can
       * wait for is determined by the container health check settings.
       *
       * For services that *do* use a load balancer, the following should be noted:
       *
       * * If a task has no essential containers with a health check defined, the service scheduler
       * will wait for the load balancer target group health check to return a healthy status before
       * counting the task towards the minimum healthy percent total.
       * * If a task has an essential container with a health check defined, the service scheduler
       * will wait for both the task to reach a healthy status and the load balancer target group
       * health check to return a healthy status before counting the task towards the minimum healthy
       * percent total.
       *
       * The default value for a replica service for `minimumHealthyPercent` is 100%. The default
       * `minimumHealthyPercent` value for a service using the `DAEMON` service schedule is 0% for the
       * AWS CLI , the AWS SDKs, and the APIs and 50% for the AWS Management Console.
       *
       * The minimum number of healthy tasks during a deployment is the `desiredCount` multiplied by
       * the `minimumHealthyPercent` /100, rounded up to the nearest integer value.
       *
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and is running tasks that use the EC2 launch type, the *minimum healthy percent* value
       * is set to the default value. The *minimum healthy percent* value is used to define the lower
       * limit on the number of the tasks in the service that remain in the `RUNNING` state while the
       * container instances are in the `DRAINING` state.
       *
       *
       * You can't specify a custom `minimumHealthyPercent` value for a service that uses either the
       * blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types and has tasks that use the EC2
       * launch type.
       *
       *
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and is running tasks that use the Fargate launch type, the minimum healthy percent value
       * is not used, although it is returned when describing your service.
       */
      public fun minimumHealthyPercent(minimumHealthyPercent: Number)

      /**
       * @param strategy The deployment strategy for the service. Choose from these valid values:.
       * * `ROLLING` - When you create a service which uses the rolling update ( `ROLLING` )
       * deployment strategy, the Amazon ECS service scheduler replaces the currently running tasks
       * with new tasks. The number of tasks that Amazon ECS adds or removes from the service during a
       * rolling update is controlled by the service deployment configuration.
       * * `BLUE_GREEN` - A blue/green deployment strategy ( `BLUE_GREEN` ) is a release methodology
       * that reduces downtime and risk by running two identical production environments called blue
       * and green. With Amazon ECS blue/green deployments, you can validate new service revisions
       * before directing production traffic to them. This approach provides a safer way to deploy
       * changes with the ability to quickly roll back if needed.
       */
      public fun strategy(strategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.builder()

      /**
       * @param alarms Information about the CloudWatch alarms.
       */
      override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param alarms Information about the CloudWatch alarms.
       */
      override fun alarms(alarms: DeploymentAlarmsProperty) {
        cdkBuilder.alarms(alarms.let(DeploymentAlarmsProperty.Companion::unwrap))
      }

      /**
       * @param alarms Information about the CloudWatch alarms.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efd9a5f127d78c01958f4cf4b39acf88204ea3d9b713d0c6e12a4bcd49c0914b")
      override fun alarms(alarms: DeploymentAlarmsProperty.Builder.() -> Unit): Unit =
          alarms(DeploymentAlarmsProperty(alarms))

      /**
       * @param bakeTimeInMinutes The duration when both blue and green service revisions are
       * running simultaneously after the production traffic has shifted.
       * The following rules apply when you don't specify a value:
       *
       * * For rolling deployments, the value is set to 3 hours (180 minutes).
       * * When you use an external deployment controller ( `EXTERNAL` ), or the CodeDeploy
       * blue/green deployment controller ( `CODE_DEPLOY` ), the value is set to 3 hours (180 minutes).
       * * For all other cases, the value is set to 36 hours (2160 minutes).
       */
      override fun bakeTimeInMinutes(bakeTimeInMinutes: Number) {
        cdkBuilder.bakeTimeInMinutes(bakeTimeInMinutes)
      }

      /**
       * @param deploymentCircuitBreaker The deployment circuit breaker can only be used for
       * services using the rolling update ( `ECS` ) deployment type.
       * The *deployment circuit breaker* determines whether a service deployment will fail if the
       * service can't reach a steady state. If you use the deployment circuit breaker, a service
       * deployment will transition to a failed state and stop launching new tasks. If you use the
       * rollback option, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully. For more information, see [Rolling
       * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
       * in the *Amazon Elastic Container Service Developer Guide*
       */
      override fun deploymentCircuitBreaker(deploymentCircuitBreaker: IResolvable) {
        cdkBuilder.deploymentCircuitBreaker(deploymentCircuitBreaker.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deploymentCircuitBreaker The deployment circuit breaker can only be used for
       * services using the rolling update ( `ECS` ) deployment type.
       * The *deployment circuit breaker* determines whether a service deployment will fail if the
       * service can't reach a steady state. If you use the deployment circuit breaker, a service
       * deployment will transition to a failed state and stop launching new tasks. If you use the
       * rollback option, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully. For more information, see [Rolling
       * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
       * in the *Amazon Elastic Container Service Developer Guide*
       */
      override
          fun deploymentCircuitBreaker(deploymentCircuitBreaker: DeploymentCircuitBreakerProperty) {
        cdkBuilder.deploymentCircuitBreaker(deploymentCircuitBreaker.let(DeploymentCircuitBreakerProperty.Companion::unwrap))
      }

      /**
       * @param deploymentCircuitBreaker The deployment circuit breaker can only be used for
       * services using the rolling update ( `ECS` ) deployment type.
       * The *deployment circuit breaker* determines whether a service deployment will fail if the
       * service can't reach a steady state. If you use the deployment circuit breaker, a service
       * deployment will transition to a failed state and stop launching new tasks. If you use the
       * rollback option, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully. For more information, see [Rolling
       * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
       * in the *Amazon Elastic Container Service Developer Guide*
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d33a617c577ba243f4f0271ff561c8f6ede78b9600fbb68e0f022c6bfe2d4c")
      override
          fun deploymentCircuitBreaker(deploymentCircuitBreaker: DeploymentCircuitBreakerProperty.Builder.() -> Unit):
          Unit =
          deploymentCircuitBreaker(DeploymentCircuitBreakerProperty(deploymentCircuitBreaker))

      /**
       * @param lifecycleHooks An array of deployment lifecycle hook objects to run custom logic at
       * specific stages of the deployment lifecycle.
       */
      override fun lifecycleHooks(lifecycleHooks: IResolvable) {
        cdkBuilder.lifecycleHooks(lifecycleHooks.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lifecycleHooks An array of deployment lifecycle hook objects to run custom logic at
       * specific stages of the deployment lifecycle.
       */
      override fun lifecycleHooks(lifecycleHooks: List<Any>) {
        cdkBuilder.lifecycleHooks(lifecycleHooks.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param lifecycleHooks An array of deployment lifecycle hook objects to run custom logic at
       * specific stages of the deployment lifecycle.
       */
      override fun lifecycleHooks(vararg lifecycleHooks: Any): Unit =
          lifecycleHooks(lifecycleHooks.toList())

      /**
       * @param maximumPercent If a service is using the rolling update ( `ECS` ) deployment type,
       * the `maximumPercent` parameter represents an upper limit on the number of your service's tasks
       * that are allowed in the `RUNNING` or `PENDING` state during a deployment, as a percentage of
       * the `desiredCount` (rounded down to the nearest integer).
       * This parameter enables you to define the deployment batch size. For example, if your
       * service is using the `REPLICA` service scheduler and has a `desiredCount` of four tasks and a
       * `maximumPercent` value of 200%, the scheduler may start four new tasks before stopping the
       * four older tasks (provided that the cluster resources required to do this are available). The
       * default `maximumPercent` value for a service using the `REPLICA` service scheduler is 200%.
       *
       * The Amazon ECS scheduler uses this parameter to replace unhealthy tasks by starting
       * replacement tasks first and then stopping the unhealthy tasks, as long as cluster resources
       * for starting replacement tasks are available. For more information about how the scheduler
       * replaces unhealthy tasks, see [Amazon ECS
       * services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
       *
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types, and tasks in the service use the EC2 launch type, the *maximum percent* value is set to
       * the default value. The *maximum percent* value is used to define the upper limit on the number
       * of the tasks in the service that remain in the `RUNNING` state while the container instances
       * are in the `DRAINING` state.
       *
       *
       * You can't specify a custom `maximumPercent` value for a service that uses either the
       * blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types and has tasks that use the EC2
       * launch type.
       *
       *
       * If the service uses either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types,
       * and the tasks in the service use the Fargate launch type, the maximum percent value is not
       * used. The value is still returned when describing your service.
       */
      override fun maximumPercent(maximumPercent: Number) {
        cdkBuilder.maximumPercent(maximumPercent)
      }

      /**
       * @param minimumHealthyPercent If a service is using the rolling update ( `ECS` ) deployment
       * type, the `minimumHealthyPercent` represents a lower limit on the number of your service's
       * tasks that must remain in the `RUNNING` state during a deployment, as a percentage of the
       * `desiredCount` (rounded up to the nearest integer).
       * This parameter enables you to deploy without using additional cluster capacity. For
       * example, if your service has a `desiredCount` of four tasks and a `minimumHealthyPercent` of
       * 50%, the service scheduler may stop two existing tasks to free up cluster capacity before
       * starting two new tasks.
       *
       * If any tasks are unhealthy and if `maximumPercent` doesn't allow the Amazon ECS scheduler
       * to start replacement tasks, the scheduler stops the unhealthy tasks one-by-one — using the
       * `minimumHealthyPercent` as a constraint — to clear up capacity to launch replacement tasks.
       * For more information about how the scheduler replaces unhealthy tasks, see [Amazon ECS
       * services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
       *
       * For services that *do not* use a load balancer, the following should be noted:
       *
       * * A service is considered healthy if all essential containers within the tasks in the
       * service pass their health checks.
       * * If a task has no essential containers with a health check defined, the service scheduler
       * will wait for 40 seconds after a task reaches a `RUNNING` state before the task is counted
       * towards the minimum healthy percent total.
       * * If a task has one or more essential containers with a health check defined, the service
       * scheduler will wait for the task to reach a healthy status before counting it towards the
       * minimum healthy percent total. A task is considered healthy when all essential containers
       * within the task have passed their health checks. The amount of time the service scheduler can
       * wait for is determined by the container health check settings.
       *
       * For services that *do* use a load balancer, the following should be noted:
       *
       * * If a task has no essential containers with a health check defined, the service scheduler
       * will wait for the load balancer target group health check to return a healthy status before
       * counting the task towards the minimum healthy percent total.
       * * If a task has an essential container with a health check defined, the service scheduler
       * will wait for both the task to reach a healthy status and the load balancer target group
       * health check to return a healthy status before counting the task towards the minimum healthy
       * percent total.
       *
       * The default value for a replica service for `minimumHealthyPercent` is 100%. The default
       * `minimumHealthyPercent` value for a service using the `DAEMON` service schedule is 0% for the
       * AWS CLI , the AWS SDKs, and the APIs and 50% for the AWS Management Console.
       *
       * The minimum number of healthy tasks during a deployment is the `desiredCount` multiplied by
       * the `minimumHealthyPercent` /100, rounded up to the nearest integer value.
       *
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and is running tasks that use the EC2 launch type, the *minimum healthy percent* value
       * is set to the default value. The *minimum healthy percent* value is used to define the lower
       * limit on the number of the tasks in the service that remain in the `RUNNING` state while the
       * container instances are in the `DRAINING` state.
       *
       *
       * You can't specify a custom `minimumHealthyPercent` value for a service that uses either the
       * blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types and has tasks that use the EC2
       * launch type.
       *
       *
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and is running tasks that use the Fargate launch type, the minimum healthy percent value
       * is not used, although it is returned when describing your service.
       */
      override fun minimumHealthyPercent(minimumHealthyPercent: Number) {
        cdkBuilder.minimumHealthyPercent(minimumHealthyPercent)
      }

      /**
       * @param strategy The deployment strategy for the service. Choose from these valid values:.
       * * `ROLLING` - When you create a service which uses the rolling update ( `ROLLING` )
       * deployment strategy, the Amazon ECS service scheduler replaces the currently running tasks
       * with new tasks. The number of tasks that Amazon ECS adds or removes from the service during a
       * rolling update is controlled by the service deployment configuration.
       * * `BLUE_GREEN` - A blue/green deployment strategy ( `BLUE_GREEN` ) is a release methodology
       * that reduces downtime and risk by running two identical production environments called blue
       * and green. With Amazon ECS blue/green deployments, you can validate new service revisions
       * before directing production traffic to them. This approach provides a safer way to deploy
       * changes with the ability to quickly roll back if needed.
       */
      override fun strategy(strategy: String) {
        cdkBuilder.strategy(strategy)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty,
    ) : CdkObject(cdkObject),
        DeploymentConfigurationProperty {
      /**
       * Information about the CloudWatch alarms.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-alarms)
       */
      override fun alarms(): Any? = unwrap(this).getAlarms()

      /**
       * The duration when both blue and green service revisions are running simultaneously after
       * the production traffic has shifted.
       *
       * The following rules apply when you don't specify a value:
       *
       * * For rolling deployments, the value is set to 3 hours (180 minutes).
       * * When you use an external deployment controller ( `EXTERNAL` ), or the CodeDeploy
       * blue/green deployment controller ( `CODE_DEPLOY` ), the value is set to 3 hours (180 minutes).
       * * For all other cases, the value is set to 36 hours (2160 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-baketimeinminutes)
       */
      override fun bakeTimeInMinutes(): Number? = unwrap(this).getBakeTimeInMinutes()

      /**
       * The deployment circuit breaker can only be used for services using the rolling update (
       * `ECS` ) deployment type.
       *
       * The *deployment circuit breaker* determines whether a service deployment will fail if the
       * service can't reach a steady state. If you use the deployment circuit breaker, a service
       * deployment will transition to a failed state and stop launching new tasks. If you use the
       * rollback option, when a service deployment fails, the service is rolled back to the last
       * deployment that completed successfully. For more information, see [Rolling
       * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
       * in the *Amazon Elastic Container Service Developer Guide*
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-deploymentcircuitbreaker)
       */
      override fun deploymentCircuitBreaker(): Any? = unwrap(this).getDeploymentCircuitBreaker()

      /**
       * An array of deployment lifecycle hook objects to run custom logic at specific stages of the
       * deployment lifecycle.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-lifecyclehooks)
       */
      override fun lifecycleHooks(): Any? = unwrap(this).getLifecycleHooks()

      /**
       * If a service is using the rolling update ( `ECS` ) deployment type, the `maximumPercent`
       * parameter represents an upper limit on the number of your service's tasks that are allowed in
       * the `RUNNING` or `PENDING` state during a deployment, as a percentage of the `desiredCount`
       * (rounded down to the nearest integer).
       *
       * This parameter enables you to define the deployment batch size. For example, if your
       * service is using the `REPLICA` service scheduler and has a `desiredCount` of four tasks and a
       * `maximumPercent` value of 200%, the scheduler may start four new tasks before stopping the
       * four older tasks (provided that the cluster resources required to do this are available). The
       * default `maximumPercent` value for a service using the `REPLICA` service scheduler is 200%.
       *
       * The Amazon ECS scheduler uses this parameter to replace unhealthy tasks by starting
       * replacement tasks first and then stopping the unhealthy tasks, as long as cluster resources
       * for starting replacement tasks are available. For more information about how the scheduler
       * replaces unhealthy tasks, see [Amazon ECS
       * services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
       *
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types, and tasks in the service use the EC2 launch type, the *maximum percent* value is set to
       * the default value. The *maximum percent* value is used to define the upper limit on the number
       * of the tasks in the service that remain in the `RUNNING` state while the container instances
       * are in the `DRAINING` state.
       *
       *
       * You can't specify a custom `maximumPercent` value for a service that uses either the
       * blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types and has tasks that use the EC2
       * launch type.
       *
       *
       * If the service uses either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types,
       * and the tasks in the service use the Fargate launch type, the maximum percent value is not
       * used. The value is still returned when describing your service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent)
       */
      override fun maximumPercent(): Number? = unwrap(this).getMaximumPercent()

      /**
       * If a service is using the rolling update ( `ECS` ) deployment type, the
       * `minimumHealthyPercent` represents a lower limit on the number of your service's tasks that
       * must remain in the `RUNNING` state during a deployment, as a percentage of the `desiredCount`
       * (rounded up to the nearest integer).
       *
       * This parameter enables you to deploy without using additional cluster capacity. For
       * example, if your service has a `desiredCount` of four tasks and a `minimumHealthyPercent` of
       * 50%, the service scheduler may stop two existing tasks to free up cluster capacity before
       * starting two new tasks.
       *
       * If any tasks are unhealthy and if `maximumPercent` doesn't allow the Amazon ECS scheduler
       * to start replacement tasks, the scheduler stops the unhealthy tasks one-by-one — using the
       * `minimumHealthyPercent` as a constraint — to clear up capacity to launch replacement tasks.
       * For more information about how the scheduler replaces unhealthy tasks, see [Amazon ECS
       * services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
       *
       * For services that *do not* use a load balancer, the following should be noted:
       *
       * * A service is considered healthy if all essential containers within the tasks in the
       * service pass their health checks.
       * * If a task has no essential containers with a health check defined, the service scheduler
       * will wait for 40 seconds after a task reaches a `RUNNING` state before the task is counted
       * towards the minimum healthy percent total.
       * * If a task has one or more essential containers with a health check defined, the service
       * scheduler will wait for the task to reach a healthy status before counting it towards the
       * minimum healthy percent total. A task is considered healthy when all essential containers
       * within the task have passed their health checks. The amount of time the service scheduler can
       * wait for is determined by the container health check settings.
       *
       * For services that *do* use a load balancer, the following should be noted:
       *
       * * If a task has no essential containers with a health check defined, the service scheduler
       * will wait for the load balancer target group health check to return a healthy status before
       * counting the task towards the minimum healthy percent total.
       * * If a task has an essential container with a health check defined, the service scheduler
       * will wait for both the task to reach a healthy status and the load balancer target group
       * health check to return a healthy status before counting the task towards the minimum healthy
       * percent total.
       *
       * The default value for a replica service for `minimumHealthyPercent` is 100%. The default
       * `minimumHealthyPercent` value for a service using the `DAEMON` service schedule is 0% for the
       * AWS CLI , the AWS SDKs, and the APIs and 50% for the AWS Management Console.
       *
       * The minimum number of healthy tasks during a deployment is the `desiredCount` multiplied by
       * the `minimumHealthyPercent` /100, rounded up to the nearest integer value.
       *
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and is running tasks that use the EC2 launch type, the *minimum healthy percent* value
       * is set to the default value. The *minimum healthy percent* value is used to define the lower
       * limit on the number of the tasks in the service that remain in the `RUNNING` state while the
       * container instances are in the `DRAINING` state.
       *
       *
       * You can't specify a custom `minimumHealthyPercent` value for a service that uses either the
       * blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types and has tasks that use the EC2
       * launch type.
       *
       *
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and is running tasks that use the Fargate launch type, the minimum healthy percent value
       * is not used, although it is returned when describing your service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent)
       */
      override fun minimumHealthyPercent(): Number? = unwrap(this).getMinimumHealthyPercent()

      /**
       * The deployment strategy for the service. Choose from these valid values:.
       *
       * * `ROLLING` - When you create a service which uses the rolling update ( `ROLLING` )
       * deployment strategy, the Amazon ECS service scheduler replaces the currently running tasks
       * with new tasks. The number of tasks that Amazon ECS adds or removes from the service during a
       * rolling update is controlled by the service deployment configuration.
       * * `BLUE_GREEN` - A blue/green deployment strategy ( `BLUE_GREEN` ) is a release methodology
       * that reduces downtime and risk by running two identical production environments called blue
       * and green. With Amazon ECS blue/green deployments, you can validate new service revisions
       * before directing production traffic to them. This approach provides a safer way to deploy
       * changes with the ability to quickly roll back if needed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-strategy)
       */
      override fun strategy(): String? = unwrap(this).getStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty):
          DeploymentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty
    }
  }

  /**
   * The deployment controller to use for the service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * DeploymentControllerProperty deploymentControllerProperty =
   * DeploymentControllerProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcontroller.html)
   */
  public interface DeploymentControllerProperty {
    /**
     * The deployment controller type to use.
     *
     * The deployment controller is the mechanism that determines how tasks are deployed for your
     * service. The valid options are:
     *
     * * ECS
     *
     * When you create a service which uses the `ECS` deployment controller, you can choose between
     * the following deployment strategies:
     *
     * * `ROLLING` : When you create a service which uses the *rolling update* ( `ROLLING` )
     * deployment strategy, the Amazon ECS service scheduler replaces the currently running tasks with
     * new tasks. The number of tasks that Amazon ECS adds or removes from the service during a rolling
     * update is controlled by the service deployment configuration.
     *
     * Rolling update deployments are best suited for the following scenarios:
     *
     * * Gradual service updates: You need to update your service incrementally without taking the
     * entire service offline at once.
     * * Limited resource requirements: You want to avoid the additional resource costs of running
     * two complete environments simultaneously (as required by blue/green deployments).
     * * Acceptable deployment time: Your application can tolerate a longer deployment process, as
     * rolling updates replace tasks one by one.
     * * No need for instant roll back: Your service can tolerate a rollback process that takes
     * minutes rather than seconds.
     * * Simple deployment process: You prefer a straightforward deployment approach without the
     * complexity of managing multiple environments, target groups, and listeners.
     * * No load balancer requirement: Your service doesn't use or require a load balancer,
     * Application Load Balancer , Network Load Balancer , or Service Connect (which are required for
     * blue/green deployments).
     * * Stateful applications: Your application maintains state that makes it difficult to run two
     * parallel environments.
     * * Cost sensitivity: You want to minimize deployment costs by not running duplicate
     * environments during deployment.
     *
     * Rolling updates are the default deployment strategy for services and provide a balance
     * between deployment safety and resource efficiency for many common application scenarios.
     *
     * * `BLUE_GREEN` : A *blue/green* deployment strategy ( `BLUE_GREEN` ) is a release methodology
     * that reduces downtime and risk by running two identical production environments called blue and
     * green. With Amazon ECS blue/green deployments, you can validate new service revisions before
     * directing production traffic to them. This approach provides a safer way to deploy changes with
     * the ability to quickly roll back if needed.
     *
     * Amazon ECS blue/green deployments are best suited for the following scenarios:
     *
     * * Service validation: When you need to validate new service revisions before directing
     * production traffic to them
     * * Zero downtime: When your service requires zero-downtime deployments
     * * Instant roll back: When you need the ability to quickly roll back if issues are detected
     * * Load balancer requirement: When your service uses Application Load Balancer , Network Load
     * Balancer , or Service Connect
     * * External
     *
     * Use a third-party deployment controller.
     *
     * * Blue/green deployment (powered by CodeDeploy )
     *
     * CodeDeploy installs an updated version of the application as a new replacement task set and
     * reroutes production traffic from the original application task set to the replacement task set.
     * The original task set is terminated after a successful deployment. Use this deployment
     * controller to verify a new deployment of a service before sending production traffic to it.
     *
     * When updating the deployment controller for a service, consider the following depending on
     * the type of migration you're performing.
     *
     * * If you have a template that contains the `EXTERNAL` deployment controller information as
     * well as `TaskSet` and `PrimaryTaskSet` resources, and you remove the task set resources from the
     * template when updating from `EXTERNAL` to `ECS` , the `DescribeTaskSet` and `DeleteTaskSet` API
     * calls will return a 400 error after the deployment controller is updated to `ECS` . This results
     * in a delete failure on the task set resources, even though the stack transitions to
     * `UPDATE_COMPLETE` status. For more information, see [Resource removed from stack but not
     * deleted](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-resource-removed-not-deleted)
     * in the AWS CloudFormation User Guide. To fix this issue, delete the task sets directly using the
     * Amazon ECS `DeleteTaskSet` API. For more information about how to delete a task set, see
     * [DeleteTaskSet](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeleteTaskSet.html)
     * in the Amazon Elastic Container Service API Reference.
     * * If you're migrating from `CODE_DEPLOY` to `ECS` with a new task definition and AWS
     * CloudFormation performs a rollback operation, the Amazon ECS `UpdateService` request fails with
     * the following error:
     *
     * Resource handler returned message: "Invalid request provided: Unable to update task
     * definition on services with a CODE_DEPLOY deployment controller.
     *
     * * After a successful migration from `ECS` to `EXTERNAL` deployment controller, you need to
     * manually remove the `ACTIVE` task set, because Amazon ECS no longer manages the deployment. For
     * information about how to delete a task set, see
     * [DeleteTaskSet](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeleteTaskSet.html)
     * in the Amazon Elastic Container Service API Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcontroller.html#cfn-ecs-service-deploymentcontroller-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [DeploymentControllerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The deployment controller type to use.
       * The deployment controller is the mechanism that determines how tasks are deployed for your
       * service. The valid options are:
       *
       * * ECS
       *
       * When you create a service which uses the `ECS` deployment controller, you can choose
       * between the following deployment strategies:
       *
       * * `ROLLING` : When you create a service which uses the *rolling update* ( `ROLLING` )
       * deployment strategy, the Amazon ECS service scheduler replaces the currently running tasks
       * with new tasks. The number of tasks that Amazon ECS adds or removes from the service during a
       * rolling update is controlled by the service deployment configuration.
       *
       * Rolling update deployments are best suited for the following scenarios:
       *
       * * Gradual service updates: You need to update your service incrementally without taking the
       * entire service offline at once.
       * * Limited resource requirements: You want to avoid the additional resource costs of running
       * two complete environments simultaneously (as required by blue/green deployments).
       * * Acceptable deployment time: Your application can tolerate a longer deployment process, as
       * rolling updates replace tasks one by one.
       * * No need for instant roll back: Your service can tolerate a rollback process that takes
       * minutes rather than seconds.
       * * Simple deployment process: You prefer a straightforward deployment approach without the
       * complexity of managing multiple environments, target groups, and listeners.
       * * No load balancer requirement: Your service doesn't use or require a load balancer,
       * Application Load Balancer , Network Load Balancer , or Service Connect (which are required for
       * blue/green deployments).
       * * Stateful applications: Your application maintains state that makes it difficult to run
       * two parallel environments.
       * * Cost sensitivity: You want to minimize deployment costs by not running duplicate
       * environments during deployment.
       *
       * Rolling updates are the default deployment strategy for services and provide a balance
       * between deployment safety and resource efficiency for many common application scenarios.
       *
       * * `BLUE_GREEN` : A *blue/green* deployment strategy ( `BLUE_GREEN` ) is a release
       * methodology that reduces downtime and risk by running two identical production environments
       * called blue and green. With Amazon ECS blue/green deployments, you can validate new service
       * revisions before directing production traffic to them. This approach provides a safer way to
       * deploy changes with the ability to quickly roll back if needed.
       *
       * Amazon ECS blue/green deployments are best suited for the following scenarios:
       *
       * * Service validation: When you need to validate new service revisions before directing
       * production traffic to them
       * * Zero downtime: When your service requires zero-downtime deployments
       * * Instant roll back: When you need the ability to quickly roll back if issues are detected
       * * Load balancer requirement: When your service uses Application Load Balancer , Network
       * Load Balancer , or Service Connect
       * * External
       *
       * Use a third-party deployment controller.
       *
       * * Blue/green deployment (powered by CodeDeploy )
       *
       * CodeDeploy installs an updated version of the application as a new replacement task set and
       * reroutes production traffic from the original application task set to the replacement task
       * set. The original task set is terminated after a successful deployment. Use this deployment
       * controller to verify a new deployment of a service before sending production traffic to it.
       *
       * When updating the deployment controller for a service, consider the following depending on
       * the type of migration you're performing.
       *
       * * If you have a template that contains the `EXTERNAL` deployment controller information as
       * well as `TaskSet` and `PrimaryTaskSet` resources, and you remove the task set resources from
       * the template when updating from `EXTERNAL` to `ECS` , the `DescribeTaskSet` and
       * `DeleteTaskSet` API calls will return a 400 error after the deployment controller is updated
       * to `ECS` . This results in a delete failure on the task set resources, even though the stack
       * transitions to `UPDATE_COMPLETE` status. For more information, see [Resource removed from
       * stack but not
       * deleted](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-resource-removed-not-deleted)
       * in the AWS CloudFormation User Guide. To fix this issue, delete the task sets directly using
       * the Amazon ECS `DeleteTaskSet` API. For more information about how to delete a task set, see
       * [DeleteTaskSet](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeleteTaskSet.html)
       * in the Amazon Elastic Container Service API Reference.
       * * If you're migrating from `CODE_DEPLOY` to `ECS` with a new task definition and AWS
       * CloudFormation performs a rollback operation, the Amazon ECS `UpdateService` request fails
       * with the following error:
       *
       * Resource handler returned message: "Invalid request provided: Unable to update task
       * definition on services with a CODE_DEPLOY deployment controller.
       *
       * * After a successful migration from `ECS` to `EXTERNAL` deployment controller, you need to
       * manually remove the `ACTIVE` task set, because Amazon ECS no longer manages the deployment.
       * For information about how to delete a task set, see
       * [DeleteTaskSet](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeleteTaskSet.html)
       * in the Amazon Elastic Container Service API Reference.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty.builder()

      /**
       * @param type The deployment controller type to use.
       * The deployment controller is the mechanism that determines how tasks are deployed for your
       * service. The valid options are:
       *
       * * ECS
       *
       * When you create a service which uses the `ECS` deployment controller, you can choose
       * between the following deployment strategies:
       *
       * * `ROLLING` : When you create a service which uses the *rolling update* ( `ROLLING` )
       * deployment strategy, the Amazon ECS service scheduler replaces the currently running tasks
       * with new tasks. The number of tasks that Amazon ECS adds or removes from the service during a
       * rolling update is controlled by the service deployment configuration.
       *
       * Rolling update deployments are best suited for the following scenarios:
       *
       * * Gradual service updates: You need to update your service incrementally without taking the
       * entire service offline at once.
       * * Limited resource requirements: You want to avoid the additional resource costs of running
       * two complete environments simultaneously (as required by blue/green deployments).
       * * Acceptable deployment time: Your application can tolerate a longer deployment process, as
       * rolling updates replace tasks one by one.
       * * No need for instant roll back: Your service can tolerate a rollback process that takes
       * minutes rather than seconds.
       * * Simple deployment process: You prefer a straightforward deployment approach without the
       * complexity of managing multiple environments, target groups, and listeners.
       * * No load balancer requirement: Your service doesn't use or require a load balancer,
       * Application Load Balancer , Network Load Balancer , or Service Connect (which are required for
       * blue/green deployments).
       * * Stateful applications: Your application maintains state that makes it difficult to run
       * two parallel environments.
       * * Cost sensitivity: You want to minimize deployment costs by not running duplicate
       * environments during deployment.
       *
       * Rolling updates are the default deployment strategy for services and provide a balance
       * between deployment safety and resource efficiency for many common application scenarios.
       *
       * * `BLUE_GREEN` : A *blue/green* deployment strategy ( `BLUE_GREEN` ) is a release
       * methodology that reduces downtime and risk by running two identical production environments
       * called blue and green. With Amazon ECS blue/green deployments, you can validate new service
       * revisions before directing production traffic to them. This approach provides a safer way to
       * deploy changes with the ability to quickly roll back if needed.
       *
       * Amazon ECS blue/green deployments are best suited for the following scenarios:
       *
       * * Service validation: When you need to validate new service revisions before directing
       * production traffic to them
       * * Zero downtime: When your service requires zero-downtime deployments
       * * Instant roll back: When you need the ability to quickly roll back if issues are detected
       * * Load balancer requirement: When your service uses Application Load Balancer , Network
       * Load Balancer , or Service Connect
       * * External
       *
       * Use a third-party deployment controller.
       *
       * * Blue/green deployment (powered by CodeDeploy )
       *
       * CodeDeploy installs an updated version of the application as a new replacement task set and
       * reroutes production traffic from the original application task set to the replacement task
       * set. The original task set is terminated after a successful deployment. Use this deployment
       * controller to verify a new deployment of a service before sending production traffic to it.
       *
       * When updating the deployment controller for a service, consider the following depending on
       * the type of migration you're performing.
       *
       * * If you have a template that contains the `EXTERNAL` deployment controller information as
       * well as `TaskSet` and `PrimaryTaskSet` resources, and you remove the task set resources from
       * the template when updating from `EXTERNAL` to `ECS` , the `DescribeTaskSet` and
       * `DeleteTaskSet` API calls will return a 400 error after the deployment controller is updated
       * to `ECS` . This results in a delete failure on the task set resources, even though the stack
       * transitions to `UPDATE_COMPLETE` status. For more information, see [Resource removed from
       * stack but not
       * deleted](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-resource-removed-not-deleted)
       * in the AWS CloudFormation User Guide. To fix this issue, delete the task sets directly using
       * the Amazon ECS `DeleteTaskSet` API. For more information about how to delete a task set, see
       * [DeleteTaskSet](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeleteTaskSet.html)
       * in the Amazon Elastic Container Service API Reference.
       * * If you're migrating from `CODE_DEPLOY` to `ECS` with a new task definition and AWS
       * CloudFormation performs a rollback operation, the Amazon ECS `UpdateService` request fails
       * with the following error:
       *
       * Resource handler returned message: "Invalid request provided: Unable to update task
       * definition on services with a CODE_DEPLOY deployment controller.
       *
       * * After a successful migration from `ECS` to `EXTERNAL` deployment controller, you need to
       * manually remove the `ACTIVE` task set, because Amazon ECS no longer manages the deployment.
       * For information about how to delete a task set, see
       * [DeleteTaskSet](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeleteTaskSet.html)
       * in the Amazon Elastic Container Service API Reference.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty,
    ) : CdkObject(cdkObject),
        DeploymentControllerProperty {
      /**
       * The deployment controller type to use.
       *
       * The deployment controller is the mechanism that determines how tasks are deployed for your
       * service. The valid options are:
       *
       * * ECS
       *
       * When you create a service which uses the `ECS` deployment controller, you can choose
       * between the following deployment strategies:
       *
       * * `ROLLING` : When you create a service which uses the *rolling update* ( `ROLLING` )
       * deployment strategy, the Amazon ECS service scheduler replaces the currently running tasks
       * with new tasks. The number of tasks that Amazon ECS adds or removes from the service during a
       * rolling update is controlled by the service deployment configuration.
       *
       * Rolling update deployments are best suited for the following scenarios:
       *
       * * Gradual service updates: You need to update your service incrementally without taking the
       * entire service offline at once.
       * * Limited resource requirements: You want to avoid the additional resource costs of running
       * two complete environments simultaneously (as required by blue/green deployments).
       * * Acceptable deployment time: Your application can tolerate a longer deployment process, as
       * rolling updates replace tasks one by one.
       * * No need for instant roll back: Your service can tolerate a rollback process that takes
       * minutes rather than seconds.
       * * Simple deployment process: You prefer a straightforward deployment approach without the
       * complexity of managing multiple environments, target groups, and listeners.
       * * No load balancer requirement: Your service doesn't use or require a load balancer,
       * Application Load Balancer , Network Load Balancer , or Service Connect (which are required for
       * blue/green deployments).
       * * Stateful applications: Your application maintains state that makes it difficult to run
       * two parallel environments.
       * * Cost sensitivity: You want to minimize deployment costs by not running duplicate
       * environments during deployment.
       *
       * Rolling updates are the default deployment strategy for services and provide a balance
       * between deployment safety and resource efficiency for many common application scenarios.
       *
       * * `BLUE_GREEN` : A *blue/green* deployment strategy ( `BLUE_GREEN` ) is a release
       * methodology that reduces downtime and risk by running two identical production environments
       * called blue and green. With Amazon ECS blue/green deployments, you can validate new service
       * revisions before directing production traffic to them. This approach provides a safer way to
       * deploy changes with the ability to quickly roll back if needed.
       *
       * Amazon ECS blue/green deployments are best suited for the following scenarios:
       *
       * * Service validation: When you need to validate new service revisions before directing
       * production traffic to them
       * * Zero downtime: When your service requires zero-downtime deployments
       * * Instant roll back: When you need the ability to quickly roll back if issues are detected
       * * Load balancer requirement: When your service uses Application Load Balancer , Network
       * Load Balancer , or Service Connect
       * * External
       *
       * Use a third-party deployment controller.
       *
       * * Blue/green deployment (powered by CodeDeploy )
       *
       * CodeDeploy installs an updated version of the application as a new replacement task set and
       * reroutes production traffic from the original application task set to the replacement task
       * set. The original task set is terminated after a successful deployment. Use this deployment
       * controller to verify a new deployment of a service before sending production traffic to it.
       *
       * When updating the deployment controller for a service, consider the following depending on
       * the type of migration you're performing.
       *
       * * If you have a template that contains the `EXTERNAL` deployment controller information as
       * well as `TaskSet` and `PrimaryTaskSet` resources, and you remove the task set resources from
       * the template when updating from `EXTERNAL` to `ECS` , the `DescribeTaskSet` and
       * `DeleteTaskSet` API calls will return a 400 error after the deployment controller is updated
       * to `ECS` . This results in a delete failure on the task set resources, even though the stack
       * transitions to `UPDATE_COMPLETE` status. For more information, see [Resource removed from
       * stack but not
       * deleted](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-resource-removed-not-deleted)
       * in the AWS CloudFormation User Guide. To fix this issue, delete the task sets directly using
       * the Amazon ECS `DeleteTaskSet` API. For more information about how to delete a task set, see
       * [DeleteTaskSet](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeleteTaskSet.html)
       * in the Amazon Elastic Container Service API Reference.
       * * If you're migrating from `CODE_DEPLOY` to `ECS` with a new task definition and AWS
       * CloudFormation performs a rollback operation, the Amazon ECS `UpdateService` request fails
       * with the following error:
       *
       * Resource handler returned message: "Invalid request provided: Unable to update task
       * definition on services with a CODE_DEPLOY deployment controller.
       *
       * * After a successful migration from `ECS` to `EXTERNAL` deployment controller, you need to
       * manually remove the `ACTIVE` task set, because Amazon ECS no longer manages the deployment.
       * For information about how to delete a task set, see
       * [DeleteTaskSet](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeleteTaskSet.html)
       * in the Amazon Elastic Container Service API Reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcontroller.html#cfn-ecs-service-deploymentcontroller-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentControllerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty):
          DeploymentControllerProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentControllerProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentControllerProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty
    }
  }

  /**
   * A deployment lifecycle hook runs custom logic at specific stages of the deployment process.
   *
   * Currently, you can use Lambda functions as hook targets.
   *
   * For more information, see [Lifecycle hooks for Amazon ECS service
   * deployments](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-lifecycle-hooks.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * DeploymentLifecycleHookProperty deploymentLifecycleHookProperty =
   * DeploymentLifecycleHookProperty.builder()
   * .hookTargetArn("hookTargetArn")
   * .lifecycleStages(List.of("lifecycleStages"))
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentlifecyclehook.html)
   */
  public interface DeploymentLifecycleHookProperty {
    /**
     * The Amazon Resource Name (ARN) of the hook target. Currently, only Lambda function ARNs are
     * supported.
     *
     * You must provide this parameter when configuring a deployment lifecycle hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentlifecyclehook.html#cfn-ecs-service-deploymentlifecyclehook-hooktargetarn)
     */
    public fun hookTargetArn(): String

    /**
     * The lifecycle stages at which to run the hook. Choose from these valid values:.
     *
     * * RECONCILE_SERVICE
     *
     * The reconciliation stage that only happens when you start a new service deployment with more
     * than 1 service revision in an ACTIVE state.
     *
     * You can use a lifecycle hook for this stage.
     *
     * * PRE_SCALE_UP
     *
     * The green service revision has not started. The blue service revision is handling 100% of the
     * production traffic. There is no test traffic.
     *
     * You can use a lifecycle hook for this stage.
     *
     * * POST_SCALE_UP
     *
     * The green service revision has started. The blue service revision is handling 100% of the
     * production traffic. There is no test traffic.
     *
     * You can use a lifecycle hook for this stage.
     *
     * * TEST_TRAFFIC_SHIFT
     *
     * The blue and green service revisions are running. The blue service revision handles 100% of
     * the production traffic. The green service revision is migrating from 0% to 100% of test traffic.
     *
     * You can use a lifecycle hook for this stage.
     *
     * * POST_TEST_TRAFFIC_SHIFT
     *
     * The test traffic shift is complete. The green service revision handles 100% of the test
     * traffic.
     *
     * You can use a lifecycle hook for this stage.
     *
     * * PRODUCTION_TRAFFIC_SHIFT
     *
     * Production traffic is shifting to the green service revision. The green service revision is
     * migrating from 0% to 100% of production traffic.
     *
     * You can use a lifecycle hook for this stage.
     *
     * * POST_PRODUCTION_TRAFFIC_SHIFT
     *
     * The production traffic shift is complete.
     *
     * You can use a lifecycle hook for this stage.
     *
     * You must provide this parameter when configuring a deployment lifecycle hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentlifecyclehook.html#cfn-ecs-service-deploymentlifecyclehook-lifecyclestages)
     */
    public fun lifecycleStages(): List<String>

    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon ECS permission to call
     * Lambda functions on your behalf.
     *
     * For more information, see [Permissions required for Lambda functions in Amazon ECS blue/green
     * deployments](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/blue-green-permissions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentlifecyclehook.html#cfn-ecs-service-deploymentlifecyclehook-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [DeploymentLifecycleHookProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hookTargetArn The Amazon Resource Name (ARN) of the hook target. Currently, only
       * Lambda function ARNs are supported. 
       * You must provide this parameter when configuring a deployment lifecycle hook.
       */
      public fun hookTargetArn(hookTargetArn: String)

      /**
       * @param lifecycleStages The lifecycle stages at which to run the hook. Choose from these
       * valid values:. 
       * * RECONCILE_SERVICE
       *
       * The reconciliation stage that only happens when you start a new service deployment with
       * more than 1 service revision in an ACTIVE state.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * PRE_SCALE_UP
       *
       * The green service revision has not started. The blue service revision is handling 100% of
       * the production traffic. There is no test traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_SCALE_UP
       *
       * The green service revision has started. The blue service revision is handling 100% of the
       * production traffic. There is no test traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * TEST_TRAFFIC_SHIFT
       *
       * The blue and green service revisions are running. The blue service revision handles 100% of
       * the production traffic. The green service revision is migrating from 0% to 100% of test
       * traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_TEST_TRAFFIC_SHIFT
       *
       * The test traffic shift is complete. The green service revision handles 100% of the test
       * traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * PRODUCTION_TRAFFIC_SHIFT
       *
       * Production traffic is shifting to the green service revision. The green service revision is
       * migrating from 0% to 100% of production traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_PRODUCTION_TRAFFIC_SHIFT
       *
       * The production traffic shift is complete.
       *
       * You can use a lifecycle hook for this stage.
       *
       * You must provide this parameter when configuring a deployment lifecycle hook.
       */
      public fun lifecycleStages(lifecycleStages: List<String>)

      /**
       * @param lifecycleStages The lifecycle stages at which to run the hook. Choose from these
       * valid values:. 
       * * RECONCILE_SERVICE
       *
       * The reconciliation stage that only happens when you start a new service deployment with
       * more than 1 service revision in an ACTIVE state.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * PRE_SCALE_UP
       *
       * The green service revision has not started. The blue service revision is handling 100% of
       * the production traffic. There is no test traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_SCALE_UP
       *
       * The green service revision has started. The blue service revision is handling 100% of the
       * production traffic. There is no test traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * TEST_TRAFFIC_SHIFT
       *
       * The blue and green service revisions are running. The blue service revision handles 100% of
       * the production traffic. The green service revision is migrating from 0% to 100% of test
       * traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_TEST_TRAFFIC_SHIFT
       *
       * The test traffic shift is complete. The green service revision handles 100% of the test
       * traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * PRODUCTION_TRAFFIC_SHIFT
       *
       * Production traffic is shifting to the green service revision. The green service revision is
       * migrating from 0% to 100% of production traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_PRODUCTION_TRAFFIC_SHIFT
       *
       * The production traffic shift is complete.
       *
       * You can use a lifecycle hook for this stage.
       *
       * You must provide this parameter when configuring a deployment lifecycle hook.
       */
      public fun lifecycleStages(vararg lifecycleStages: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon ECS
       * permission to call Lambda functions on your behalf. 
       * For more information, see [Permissions required for Lambda functions in Amazon ECS
       * blue/green
       * deployments](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/blue-green-permissions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentLifecycleHookProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentLifecycleHookProperty.builder()

      /**
       * @param hookTargetArn The Amazon Resource Name (ARN) of the hook target. Currently, only
       * Lambda function ARNs are supported. 
       * You must provide this parameter when configuring a deployment lifecycle hook.
       */
      override fun hookTargetArn(hookTargetArn: String) {
        cdkBuilder.hookTargetArn(hookTargetArn)
      }

      /**
       * @param lifecycleStages The lifecycle stages at which to run the hook. Choose from these
       * valid values:. 
       * * RECONCILE_SERVICE
       *
       * The reconciliation stage that only happens when you start a new service deployment with
       * more than 1 service revision in an ACTIVE state.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * PRE_SCALE_UP
       *
       * The green service revision has not started. The blue service revision is handling 100% of
       * the production traffic. There is no test traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_SCALE_UP
       *
       * The green service revision has started. The blue service revision is handling 100% of the
       * production traffic. There is no test traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * TEST_TRAFFIC_SHIFT
       *
       * The blue and green service revisions are running. The blue service revision handles 100% of
       * the production traffic. The green service revision is migrating from 0% to 100% of test
       * traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_TEST_TRAFFIC_SHIFT
       *
       * The test traffic shift is complete. The green service revision handles 100% of the test
       * traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * PRODUCTION_TRAFFIC_SHIFT
       *
       * Production traffic is shifting to the green service revision. The green service revision is
       * migrating from 0% to 100% of production traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_PRODUCTION_TRAFFIC_SHIFT
       *
       * The production traffic shift is complete.
       *
       * You can use a lifecycle hook for this stage.
       *
       * You must provide this parameter when configuring a deployment lifecycle hook.
       */
      override fun lifecycleStages(lifecycleStages: List<String>) {
        cdkBuilder.lifecycleStages(lifecycleStages)
      }

      /**
       * @param lifecycleStages The lifecycle stages at which to run the hook. Choose from these
       * valid values:. 
       * * RECONCILE_SERVICE
       *
       * The reconciliation stage that only happens when you start a new service deployment with
       * more than 1 service revision in an ACTIVE state.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * PRE_SCALE_UP
       *
       * The green service revision has not started. The blue service revision is handling 100% of
       * the production traffic. There is no test traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_SCALE_UP
       *
       * The green service revision has started. The blue service revision is handling 100% of the
       * production traffic. There is no test traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * TEST_TRAFFIC_SHIFT
       *
       * The blue and green service revisions are running. The blue service revision handles 100% of
       * the production traffic. The green service revision is migrating from 0% to 100% of test
       * traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_TEST_TRAFFIC_SHIFT
       *
       * The test traffic shift is complete. The green service revision handles 100% of the test
       * traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * PRODUCTION_TRAFFIC_SHIFT
       *
       * Production traffic is shifting to the green service revision. The green service revision is
       * migrating from 0% to 100% of production traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_PRODUCTION_TRAFFIC_SHIFT
       *
       * The production traffic shift is complete.
       *
       * You can use a lifecycle hook for this stage.
       *
       * You must provide this parameter when configuring a deployment lifecycle hook.
       */
      override fun lifecycleStages(vararg lifecycleStages: String): Unit =
          lifecycleStages(lifecycleStages.toList())

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon ECS
       * permission to call Lambda functions on your behalf. 
       * For more information, see [Permissions required for Lambda functions in Amazon ECS
       * blue/green
       * deployments](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/blue-green-permissions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.DeploymentLifecycleHookProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentLifecycleHookProperty,
    ) : CdkObject(cdkObject),
        DeploymentLifecycleHookProperty {
      /**
       * The Amazon Resource Name (ARN) of the hook target. Currently, only Lambda function ARNs are
       * supported.
       *
       * You must provide this parameter when configuring a deployment lifecycle hook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentlifecyclehook.html#cfn-ecs-service-deploymentlifecyclehook-hooktargetarn)
       */
      override fun hookTargetArn(): String = unwrap(this).getHookTargetArn()

      /**
       * The lifecycle stages at which to run the hook. Choose from these valid values:.
       *
       * * RECONCILE_SERVICE
       *
       * The reconciliation stage that only happens when you start a new service deployment with
       * more than 1 service revision in an ACTIVE state.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * PRE_SCALE_UP
       *
       * The green service revision has not started. The blue service revision is handling 100% of
       * the production traffic. There is no test traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_SCALE_UP
       *
       * The green service revision has started. The blue service revision is handling 100% of the
       * production traffic. There is no test traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * TEST_TRAFFIC_SHIFT
       *
       * The blue and green service revisions are running. The blue service revision handles 100% of
       * the production traffic. The green service revision is migrating from 0% to 100% of test
       * traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_TEST_TRAFFIC_SHIFT
       *
       * The test traffic shift is complete. The green service revision handles 100% of the test
       * traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * PRODUCTION_TRAFFIC_SHIFT
       *
       * Production traffic is shifting to the green service revision. The green service revision is
       * migrating from 0% to 100% of production traffic.
       *
       * You can use a lifecycle hook for this stage.
       *
       * * POST_PRODUCTION_TRAFFIC_SHIFT
       *
       * The production traffic shift is complete.
       *
       * You can use a lifecycle hook for this stage.
       *
       * You must provide this parameter when configuring a deployment lifecycle hook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentlifecyclehook.html#cfn-ecs-service-deploymentlifecyclehook-lifecyclestages)
       */
      override fun lifecycleStages(): List<String> = unwrap(this).getLifecycleStages()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that grants Amazon ECS permission to call
       * Lambda functions on your behalf.
       *
       * For more information, see [Permissions required for Lambda functions in Amazon ECS
       * blue/green
       * deployments](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/blue-green-permissions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentlifecyclehook.html#cfn-ecs-service-deploymentlifecyclehook-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentLifecycleHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentLifecycleHookProperty):
          DeploymentLifecycleHookProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentLifecycleHookProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentLifecycleHookProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentLifecycleHookProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.DeploymentLifecycleHookProperty
    }
  }

  /**
   * The tag specifications of an Amazon EBS volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * EBSTagSpecificationProperty eBSTagSpecificationProperty = EBSTagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * // the properties below are optional
   * .propagateTags("propagateTags")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-ebstagspecification.html)
   */
  public interface EBSTagSpecificationProperty {
    /**
     * Determines whether to propagate the tags from the task definition to the Amazon EBS volume.
     *
     * Tags can only propagate to a `SERVICE` specified in `ServiceVolumeConfiguration` . If no
     * value is specified, the tags aren't propagated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-ebstagspecification.html#cfn-ecs-service-ebstagspecification-propagatetags)
     */
    public fun propagateTags(): String? = unwrap(this).getPropagateTags()

    /**
     * The type of volume resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-ebstagspecification.html#cfn-ecs-service-ebstagspecification-resourcetype)
     */
    public fun resourceType(): String

    /**
     * The tags applied to this Amazon EBS volume.
     *
     * `AmazonECSCreated` and `AmazonECSManaged` are reserved tags that can't be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-ebstagspecification.html#cfn-ecs-service-ebstagspecification-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [EBSTagSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param propagateTags Determines whether to propagate the tags from the task definition to
       * the Amazon EBS volume.
       * Tags can only propagate to a `SERVICE` specified in `ServiceVolumeConfiguration` . If no
       * value is specified, the tags aren't propagated.
       */
      public fun propagateTags(propagateTags: String)

      /**
       * @param resourceType The type of volume resource. 
       */
      public fun resourceType(resourceType: String)

      /**
       * @param tags The tags applied to this Amazon EBS volume.
       * `AmazonECSCreated` and `AmazonECSManaged` are reserved tags that can't be used.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The tags applied to this Amazon EBS volume.
       * `AmazonECSCreated` and `AmazonECSManaged` are reserved tags that can't be used.
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty.builder()

      /**
       * @param propagateTags Determines whether to propagate the tags from the task definition to
       * the Amazon EBS volume.
       * Tags can only propagate to a `SERVICE` specified in `ServiceVolumeConfiguration` . If no
       * value is specified, the tags aren't propagated.
       */
      override fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
      }

      /**
       * @param resourceType The type of volume resource. 
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param tags The tags applied to this Amazon EBS volume.
       * `AmazonECSCreated` and `AmazonECSManaged` are reserved tags that can't be used.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
      }

      /**
       * @param tags The tags applied to this Amazon EBS volume.
       * `AmazonECSCreated` and `AmazonECSManaged` are reserved tags that can't be used.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty,
    ) : CdkObject(cdkObject),
        EBSTagSpecificationProperty {
      /**
       * Determines whether to propagate the tags from the task definition to the Amazon EBS volume.
       *
       * Tags can only propagate to a `SERVICE` specified in `ServiceVolumeConfiguration` . If no
       * value is specified, the tags aren't propagated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-ebstagspecification.html#cfn-ecs-service-ebstagspecification-propagatetags)
       */
      override fun propagateTags(): String? = unwrap(this).getPropagateTags()

      /**
       * The type of volume resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-ebstagspecification.html#cfn-ecs-service-ebstagspecification-resourcetype)
       */
      override fun resourceType(): String = unwrap(this).getResourceType()

      /**
       * The tags applied to this Amazon EBS volume.
       *
       * `AmazonECSCreated` and `AmazonECSManaged` are reserved tags that can't be used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-ebstagspecification.html#cfn-ecs-service-ebstagspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EBSTagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty):
          EBSTagSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EBSTagSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EBSTagSpecificationProperty):
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty
    }
  }

  /**
   * The `LoadBalancer` property specifies details on a load balancer that is used with a service.
   *
   * If the service is using the `CODE_DEPLOY` deployment controller, the service is required to use
   * either an Application Load Balancer or Network Load Balancer. When you are creating an AWS
   * CodeDeploy deployment group, you specify two target groups (referred to as a `targetGroupPair` ).
   * Each target group binds to a separate task set in the deployment. The load balancer can also have
   * up to two listeners, a required listener for production traffic and an optional listener that
   * allows you to test new revisions of the service before routing production traffic to it.
   *
   * Services with tasks that use the `awsvpc` network mode (for example, those with the Fargate
   * launch type) only support Application Load Balancers and Network Load Balancers. Classic Load
   * Balancers are not supported. Also, when you create any target groups for these services, you must
   * choose `ip` as the target type, not `instance` . Tasks that use the `awsvpc` network mode are
   * associated with an elastic network interface, not an Amazon EC2 instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * LoadBalancerProperty loadBalancerProperty = LoadBalancerProperty.builder()
   * .advancedConfiguration(AdvancedConfigurationProperty.builder()
   * .alternateTargetGroupArn("alternateTargetGroupArn")
   * // the properties below are optional
   * .productionListenerRule("productionListenerRule")
   * .roleArn("roleArn")
   * .testListenerRule("testListenerRule")
   * .build())
   * .containerName("containerName")
   * .containerPort(123)
   * .loadBalancerName("loadBalancerName")
   * .targetGroupArn("targetGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html)
   */
  public interface LoadBalancerProperty {
    /**
     * The advanced settings for the load balancer used in blue/green deployments.
     *
     * Specify the alternate target group, listener rules, and IAM role required for traffic
     * shifting during blue/green deployments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html#cfn-ecs-service-loadbalancer-advancedconfiguration)
     */
    public fun advancedConfiguration(): Any? = unwrap(this).getAdvancedConfiguration()

    /**
     * The name of the container (as it appears in a container definition) to associate with the
     * load balancer.
     *
     * You need to specify the container name when configuring the target group for an Amazon ECS
     * load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html#cfn-ecs-service-loadbalancer-containername)
     */
    public fun containerName(): String? = unwrap(this).getContainerName()

    /**
     * The port on the container to associate with the load balancer.
     *
     * This port must correspond to a `containerPort` in the task definition the tasks in the
     * service are using. For tasks that use the EC2 launch type, the container instance they're
     * launched on must allow ingress traffic on the `hostPort` of the port mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html#cfn-ecs-service-loadbalancer-containerport)
     */
    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    /**
     * The name of the load balancer to associate with the Amazon ECS service or task set.
     *
     * If you are using an Application Load Balancer or a Network Load Balancer the load balancer
     * name parameter should be omitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html#cfn-ecs-service-loadbalancer-loadbalancername)
     */
    public fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

    /**
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups
     * associated with a service or task set.
     *
     * A target group ARN is only specified when using an Application Load Balancer or Network Load
     * Balancer.
     *
     * For services using the `ECS` deployment controller, you can specify one or multiple target
     * groups. For more information, see [Registering multiple target groups with a
     * service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * For services using the `CODE_DEPLOY` deployment controller, you're required to define two
     * target groups for the load balancer. For more information, see [Blue/green deployment with
     * CodeDeploy](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * If your service's task definition uses the `awsvpc` network mode, you must choose `ip` as the
     * target type, not `instance` . Do this when creating your target groups because tasks that use
     * the `awsvpc` network mode are associated with an elastic network interface, not an Amazon EC2
     * instance. This network mode is required for the Fargate launch type.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html#cfn-ecs-service-loadbalancer-targetgrouparn)
     */
    public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

    /**
     * A builder for [LoadBalancerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param advancedConfiguration The advanced settings for the load balancer used in blue/green
       * deployments.
       * Specify the alternate target group, listener rules, and IAM role required for traffic
       * shifting during blue/green deployments.
       */
      public fun advancedConfiguration(advancedConfiguration: IResolvable)

      /**
       * @param advancedConfiguration The advanced settings for the load balancer used in blue/green
       * deployments.
       * Specify the alternate target group, listener rules, and IAM role required for traffic
       * shifting during blue/green deployments.
       */
      public fun advancedConfiguration(advancedConfiguration: AdvancedConfigurationProperty)

      /**
       * @param advancedConfiguration The advanced settings for the load balancer used in blue/green
       * deployments.
       * Specify the alternate target group, listener rules, and IAM role required for traffic
       * shifting during blue/green deployments.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bf8ba6d55c78e84597527a66a761165ee61df85426c3ad8c051cd296e741a67")
      public
          fun advancedConfiguration(advancedConfiguration: AdvancedConfigurationProperty.Builder.() -> Unit)

      /**
       * @param containerName The name of the container (as it appears in a container definition) to
       * associate with the load balancer.
       * You need to specify the container name when configuring the target group for an Amazon ECS
       * load balancer.
       */
      public fun containerName(containerName: String)

      /**
       * @param containerPort The port on the container to associate with the load balancer.
       * This port must correspond to a `containerPort` in the task definition the tasks in the
       * service are using. For tasks that use the EC2 launch type, the container instance they're
       * launched on must allow ingress traffic on the `hostPort` of the port mapping.
       */
      public fun containerPort(containerPort: Number)

      /**
       * @param loadBalancerName The name of the load balancer to associate with the Amazon ECS
       * service or task set.
       * If you are using an Application Load Balancer or a Network Load Balancer the load balancer
       * name parameter should be omitted.
       */
      public fun loadBalancerName(loadBalancerName: String)

      /**
       * @param targetGroupArn The full Amazon Resource Name (ARN) of the Elastic Load Balancing
       * target group or groups associated with a service or task set.
       * A target group ARN is only specified when using an Application Load Balancer or Network
       * Load Balancer.
       *
       * For services using the `ECS` deployment controller, you can specify one or multiple target
       * groups. For more information, see [Registering multiple target groups with a
       * service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * For services using the `CODE_DEPLOY` deployment controller, you're required to define two
       * target groups for the load balancer. For more information, see [Blue/green deployment with
       * CodeDeploy](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * If your service's task definition uses the `awsvpc` network mode, you must choose `ip` as
       * the target type, not `instance` . Do this when creating your target groups because tasks that
       * use the `awsvpc` network mode are associated with an elastic network interface, not an Amazon
       * EC2 instance. This network mode is required for the Fargate launch type.
       */
      public fun targetGroupArn(targetGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.builder()

      /**
       * @param advancedConfiguration The advanced settings for the load balancer used in blue/green
       * deployments.
       * Specify the alternate target group, listener rules, and IAM role required for traffic
       * shifting during blue/green deployments.
       */
      override fun advancedConfiguration(advancedConfiguration: IResolvable) {
        cdkBuilder.advancedConfiguration(advancedConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param advancedConfiguration The advanced settings for the load balancer used in blue/green
       * deployments.
       * Specify the alternate target group, listener rules, and IAM role required for traffic
       * shifting during blue/green deployments.
       */
      override fun advancedConfiguration(advancedConfiguration: AdvancedConfigurationProperty) {
        cdkBuilder.advancedConfiguration(advancedConfiguration.let(AdvancedConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param advancedConfiguration The advanced settings for the load balancer used in blue/green
       * deployments.
       * Specify the alternate target group, listener rules, and IAM role required for traffic
       * shifting during blue/green deployments.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bf8ba6d55c78e84597527a66a761165ee61df85426c3ad8c051cd296e741a67")
      override
          fun advancedConfiguration(advancedConfiguration: AdvancedConfigurationProperty.Builder.() -> Unit):
          Unit = advancedConfiguration(AdvancedConfigurationProperty(advancedConfiguration))

      /**
       * @param containerName The name of the container (as it appears in a container definition) to
       * associate with the load balancer.
       * You need to specify the container name when configuring the target group for an Amazon ECS
       * load balancer.
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      /**
       * @param containerPort The port on the container to associate with the load balancer.
       * This port must correspond to a `containerPort` in the task definition the tasks in the
       * service are using. For tasks that use the EC2 launch type, the container instance they're
       * launched on must allow ingress traffic on the `hostPort` of the port mapping.
       */
      override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      /**
       * @param loadBalancerName The name of the load balancer to associate with the Amazon ECS
       * service or task set.
       * If you are using an Application Load Balancer or a Network Load Balancer the load balancer
       * name parameter should be omitted.
       */
      override fun loadBalancerName(loadBalancerName: String) {
        cdkBuilder.loadBalancerName(loadBalancerName)
      }

      /**
       * @param targetGroupArn The full Amazon Resource Name (ARN) of the Elastic Load Balancing
       * target group or groups associated with a service or task set.
       * A target group ARN is only specified when using an Application Load Balancer or Network
       * Load Balancer.
       *
       * For services using the `ECS` deployment controller, you can specify one or multiple target
       * groups. For more information, see [Registering multiple target groups with a
       * service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * For services using the `CODE_DEPLOY` deployment controller, you're required to define two
       * target groups for the load balancer. For more information, see [Blue/green deployment with
       * CodeDeploy](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * If your service's task definition uses the `awsvpc` network mode, you must choose `ip` as
       * the target type, not `instance` . Do this when creating your target groups because tasks that
       * use the `awsvpc` network mode are associated with an elastic network interface, not an Amazon
       * EC2 instance. This network mode is required for the Fargate launch type.
       */
      override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty,
    ) : CdkObject(cdkObject),
        LoadBalancerProperty {
      /**
       * The advanced settings for the load balancer used in blue/green deployments.
       *
       * Specify the alternate target group, listener rules, and IAM role required for traffic
       * shifting during blue/green deployments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html#cfn-ecs-service-loadbalancer-advancedconfiguration)
       */
      override fun advancedConfiguration(): Any? = unwrap(this).getAdvancedConfiguration()

      /**
       * The name of the container (as it appears in a container definition) to associate with the
       * load balancer.
       *
       * You need to specify the container name when configuring the target group for an Amazon ECS
       * load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html#cfn-ecs-service-loadbalancer-containername)
       */
      override fun containerName(): String? = unwrap(this).getContainerName()

      /**
       * The port on the container to associate with the load balancer.
       *
       * This port must correspond to a `containerPort` in the task definition the tasks in the
       * service are using. For tasks that use the EC2 launch type, the container instance they're
       * launched on must allow ingress traffic on the `hostPort` of the port mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html#cfn-ecs-service-loadbalancer-containerport)
       */
      override fun containerPort(): Number? = unwrap(this).getContainerPort()

      /**
       * The name of the load balancer to associate with the Amazon ECS service or task set.
       *
       * If you are using an Application Load Balancer or a Network Load Balancer the load balancer
       * name parameter should be omitted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html#cfn-ecs-service-loadbalancer-loadbalancername)
       */
      override fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

      /**
       * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups
       * associated with a service or task set.
       *
       * A target group ARN is only specified when using an Application Load Balancer or Network
       * Load Balancer.
       *
       * For services using the `ECS` deployment controller, you can specify one or multiple target
       * groups. For more information, see [Registering multiple target groups with a
       * service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * For services using the `CODE_DEPLOY` deployment controller, you're required to define two
       * target groups for the load balancer. For more information, see [Blue/green deployment with
       * CodeDeploy](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * If your service's task definition uses the `awsvpc` network mode, you must choose `ip` as
       * the target type, not `instance` . Do this when creating your target groups because tasks that
       * use the `awsvpc` network mode are associated with an elastic network interface, not an Amazon
       * EC2 instance. This network mode is required for the Fargate launch type.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html#cfn-ecs-service-loadbalancer-targetgrouparn)
       */
      override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty):
          LoadBalancerProperty = CdkObjectWrappers.wrap(cdkObject) as? LoadBalancerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerProperty):
          software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty
    }
  }

  /**
   * The log configuration for the container.
   *
   * This parameter maps to `LogConfig` in the docker container create command and the
   * `--log-driver` option to docker run.
   *
   * By default, containers use the same logging driver that the Docker daemon uses. However, the
   * container might use a different logging driver than the Docker daemon by specifying a log driver
   * configuration in the container definition.
   *
   * Understand the following when specifying a log configuration for your containers.
   *
   * * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon.
   * Additional log drivers may be available in future releases of the Amazon ECS container agent.
   *
   * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
   * `awsfirelens` .
   *
   * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` , `fluentd` ,
   * `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
   *
   * * This parameter requires version 1.18 of the Docker Remote API or greater on your container
   * instance.
   * * For tasks that are hosted on Amazon EC2 instances, the Amazon ECS container agent must
   * register the available logging drivers with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
   * variable before containers placed on that instance can use these log configuration options. For
   * more information, see [Amazon ECS container agent
   * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   * * For tasks that are on AWS Fargate , because you don't have access to the underlying
   * infrastructure your tasks are hosted on, any additional software needed must be installed outside
   * of the task. For example, the Fluentd output aggregators or a remote host running Logstash to send
   * Gelf logs to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * .options(Map.of(
   * "optionsKey", "options"))
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-logconfiguration.html)
   */
  public interface LogConfigurationProperty {
    /**
     * The log driver to use for the container.
     *
     * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
     * `awsfirelens` .
     *
     * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` , `fluentd`
     * , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
     *
     * For more information about using the `awslogs` log driver, see [Send Amazon ECS logs to
     * CloudWatch](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * For more information about using the `awsfirelens` log driver, see [Send Amazon ECS logs to
     * an AWS service or AWS
     * Partner](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) .
     *
     *
     * If you have a custom driver that isn't listed, you can fork the Amazon ECS container agent
     * project that's [available on
     * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it to
     * work with that driver. We encourage you to submit pull requests for changes that you would like
     * to have included. However, we don't currently provide support for running modified copies of
     * this software.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-logconfiguration.html#cfn-ecs-service-logconfiguration-logdriver)
     */
    public fun logDriver(): String? = unwrap(this).getLogDriver()

    /**
     * The configuration options to send to the log driver.
     *
     * The options you can specify depend on the log driver. Some of the options you can specify
     * when you use the `awslogs` log driver to route logs to Amazon CloudWatch include the following:
     *
     * * **awslogs-create-group** - Required: No
     *
     * Specify whether you want the log group to be created automatically. If this option isn't
     * specified, it defaults to `false` .
     *
     *
     * Your IAM policy must include the `logs:CreateLogGroup` permission before you attempt to use
     * `awslogs-create-group` .
     *
     *
     * * **awslogs-region** - Required: Yes
     *
     * Specify the AWS Region that the `awslogs` log driver is to send your Docker logs to. You can
     * choose to send all of your logs from clusters in different Regions to a single region in
     * CloudWatch Logs. This is so that they're all visible in one location. Otherwise, you can
     * separate them by Region for more granularity. Make sure that the specified log group exists in
     * the Region that you specify with this option.
     *
     * * **awslogs-group** - Required: Yes
     *
     * Make sure to specify a log group that the `awslogs` log driver sends its log streams to.
     *
     * * **awslogs-stream-prefix** - Required: Yes, when using Fargate.Optional when using EC2.
     *
     * Use the `awslogs-stream-prefix` option to associate a log stream with the specified prefix,
     * the container name, and the ID of the Amazon ECS task that the container belongs to. If you
     * specify a prefix with this option, then the log stream takes the format
     * `prefix-name/container-name/ecs-task-id` .
     *
     * If you don't specify a prefix with this option, then the log stream is named after the
     * container ID that's assigned by the Docker daemon on the container instance. Because it's
     * difficult to trace logs back to the container that sent them with just the Docker container ID
     * (which is only available on the container instance), we recommend that you specify a prefix with
     * this option.
     *
     * For Amazon ECS services, you can use the service name as the prefix. Doing so, you can trace
     * log streams to the service that the container belongs to, the name of the container that sent
     * them, and the ID of the task that the container belongs to.
     *
     * You must specify a stream-prefix for your logs to have your logs appear in the Log pane when
     * using the Amazon ECS console.
     *
     * * **awslogs-datetime-format** - Required: No
     *
     * This option defines a multiline start pattern in Python `strftime` format. A log message
     * consists of a line that matches the pattern and any following lines that don’t match the
     * pattern. The matched line is the delimiter between log messages.
     *
     * One example of a use case for using this format is for parsing output such as a stack dump,
     * which might otherwise be logged in multiple entries. The correct pattern allows it to be
     * captured in a single entry.
     *
     * For more information, see
     * [awslogs-datetime-format](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-datetime-format)
     * .
     *
     * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
     * options.
     *
     *
     * Multiline logging performs regular expression parsing and matching of all log messages. This
     * might have a negative impact on logging performance.
     *
     *
     * * **awslogs-multiline-pattern** - Required: No
     *
     * This option defines a multiline start pattern that uses a regular expression. A log message
     * consists of a line that matches the pattern and any following lines that don’t match the
     * pattern. The matched line is the delimiter between log messages.
     *
     * For more information, see
     * [awslogs-multiline-pattern](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-multiline-pattern)
     * .
     *
     * This option is ignored if `awslogs-datetime-format` is also configured.
     *
     * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
     * options.
     *
     *
     * Multiline logging performs regular expression parsing and matching of all log messages. This
     * might have a negative impact on logging performance.
     *
     *
     * The following options apply to all supported log drivers.
     *
     * * **mode** - Required: No
     *
     * Valid values: `non-blocking` | `blocking`
     *
     * This option defines the delivery mode of log messages from the container to the log driver
     * specified using `logDriver` . The delivery mode you choose affects application availability when
     * the flow of logs from container is interrupted.
     *
     * If you use the `blocking` mode and the flow of logs is interrupted, calls from container code
     * to write to the `stdout` and `stderr` streams will block. The logging thread of the application
     * will block as a result. This may cause the application to become unresponsive and lead to
     * container healthcheck failure.
     *
     * If you use the `non-blocking` mode, the container's logs are instead stored in an in-memory
     * intermediate buffer configured with the `max-buffer-size` option. This prevents the application
     * from becoming unresponsive when logs cannot be sent. We recommend using this mode if you want to
     * ensure service availability and are okay with some log loss. For more information, see
     * [Preventing log loss with non-blocking mode in the `awslogs` container log
     * driver](https://docs.aws.amazon.com/containers/preventing-log-loss-with-non-blocking-mode-in-the-awslogs-container-log-driver/)
     * .
     *
     * You can set a default `mode` for all containers in a specific AWS Region by using the
     * `defaultLogDriverMode` account setting. If you don't specify the `mode` option or configure the
     * account setting, Amazon ECS will default to the `non-blocking` mode. For more information about
     * the account setting, see [Default log driver
     * mode](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html#default-log-driver-mode)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * On June 25, 2025, Amazon ECS changed the default log driver mode from `blocking` to
     * `non-blocking` to prioritize task availability over logging. To continue using the `blocking`
     * mode after this change, do one of the following:
     *
     * * Set the `mode` option in your container definition's `logConfiguration` as `blocking` .
     * * Set the `defaultLogDriverMode` account setting to `blocking` .
     *
     *
     * * **max-buffer-size** - Required: No
     *
     * Default value: `1m`
     *
     * When `non-blocking` mode is used, the `max-buffer-size` log option controls the size of the
     * buffer that's used for intermediate message storage. Make sure to specify an adequate buffer
     * size based on your application. When the buffer fills up, further logs cannot be stored. Logs
     * that cannot be stored are lost.
     *
     * To route logs using the `splunk` log router, you need to specify a `splunk-token` and a
     * `splunk-url` .
     *
     * When you use the `awsfirelens` log router to route logs to an AWS Service or AWS Partner
     * Network destination for log storage and analytics, you can set the `log-driver-buffer-limit`
     * option to limit the number of events that are buffered in memory, before being sent to the log
     * router container. It can help to resolve potential log loss issue because high throughput might
     * result in memory running out for the buffer inside of Docker.
     *
     * Other options you can specify when using `awsfirelens` to route logs depend on the
     * destination. When you export logs to Amazon Data Firehose, you can specify the AWS Region with
     * `region` and a name for the log stream with `delivery_stream` .
     *
     * When you export logs to Amazon Kinesis Data Streams, you can specify an AWS Region with
     * `region` and a data stream name with `stream` .
     *
     * When you export logs to Amazon OpenSearch Service, you can specify options like `Name` ,
     * `Host` (OpenSearch Service endpoint without protocol), `Port` , `Index` , `Type` , `Aws_auth` ,
     * `Aws_region` , `Suppress_Type_Name` , and `tls` . For more information, see [Under the hood:
     * FireLens for Amazon ECS
     * Tasks](https://docs.aws.amazon.com/containers/under-the-hood-firelens-for-amazon-ecs-tasks/) .
     *
     * When you export logs to Amazon S3, you can specify the bucket using the `bucket` option. You
     * can also specify `region` , `total_file_size` , `upload_timeout` , and `use_put_object` as
     * options.
     *
     * This parameter requires version 1.19 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version --format
     * '{{.Server.APIVersion}}'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-logconfiguration.html#cfn-ecs-service-logconfiguration-options)
     */
    public fun options(): Any? = unwrap(this).getOptions()

    /**
     * The secrets to pass to the log configuration.
     *
     * For more information, see [Specifying sensitive
     * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-logconfiguration.html#cfn-ecs-service-logconfiguration-secretoptions)
     */
    public fun secretOptions(): Any? = unwrap(this).getSecretOptions()

    /**
     * A builder for [LogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logDriver The log driver to use for the container.
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
       *
       * For more information about using the `awslogs` log driver, see [Send Amazon ECS logs to
       * CloudWatch](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * For more information about using the `awsfirelens` log driver, see [Send Amazon ECS logs to
       * an AWS service or AWS
       * Partner](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) .
       *
       *
       * If you have a custom driver that isn't listed, you can fork the Amazon ECS container agent
       * project that's [available on
       * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it
       * to work with that driver. We encourage you to submit pull requests for changes that you would
       * like to have included. However, we don't currently provide support for running modified copies
       * of this software.
       */
      public fun logDriver(logDriver: String)

      /**
       * @param options The configuration options to send to the log driver.
       * The options you can specify depend on the log driver. Some of the options you can specify
       * when you use the `awslogs` log driver to route logs to Amazon CloudWatch include the
       * following:
       *
       * * **awslogs-create-group** - Required: No
       *
       * Specify whether you want the log group to be created automatically. If this option isn't
       * specified, it defaults to `false` .
       *
       *
       * Your IAM policy must include the `logs:CreateLogGroup` permission before you attempt to use
       * `awslogs-create-group` .
       *
       *
       * * **awslogs-region** - Required: Yes
       *
       * Specify the AWS Region that the `awslogs` log driver is to send your Docker logs to. You
       * can choose to send all of your logs from clusters in different Regions to a single region in
       * CloudWatch Logs. This is so that they're all visible in one location. Otherwise, you can
       * separate them by Region for more granularity. Make sure that the specified log group exists in
       * the Region that you specify with this option.
       *
       * * **awslogs-group** - Required: Yes
       *
       * Make sure to specify a log group that the `awslogs` log driver sends its log streams to.
       *
       * * **awslogs-stream-prefix** - Required: Yes, when using Fargate.Optional when using EC2.
       *
       * Use the `awslogs-stream-prefix` option to associate a log stream with the specified prefix,
       * the container name, and the ID of the Amazon ECS task that the container belongs to. If you
       * specify a prefix with this option, then the log stream takes the format
       * `prefix-name/container-name/ecs-task-id` .
       *
       * If you don't specify a prefix with this option, then the log stream is named after the
       * container ID that's assigned by the Docker daemon on the container instance. Because it's
       * difficult to trace logs back to the container that sent them with just the Docker container ID
       * (which is only available on the container instance), we recommend that you specify a prefix
       * with this option.
       *
       * For Amazon ECS services, you can use the service name as the prefix. Doing so, you can
       * trace log streams to the service that the container belongs to, the name of the container that
       * sent them, and the ID of the task that the container belongs to.
       *
       * You must specify a stream-prefix for your logs to have your logs appear in the Log pane
       * when using the Amazon ECS console.
       *
       * * **awslogs-datetime-format** - Required: No
       *
       * This option defines a multiline start pattern in Python `strftime` format. A log message
       * consists of a line that matches the pattern and any following lines that don’t match the
       * pattern. The matched line is the delimiter between log messages.
       *
       * One example of a use case for using this format is for parsing output such as a stack dump,
       * which might otherwise be logged in multiple entries. The correct pattern allows it to be
       * captured in a single entry.
       *
       * For more information, see
       * [awslogs-datetime-format](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-datetime-format)
       * .
       *
       * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
       * options.
       *
       *
       * Multiline logging performs regular expression parsing and matching of all log messages.
       * This might have a negative impact on logging performance.
       *
       *
       * * **awslogs-multiline-pattern** - Required: No
       *
       * This option defines a multiline start pattern that uses a regular expression. A log message
       * consists of a line that matches the pattern and any following lines that don’t match the
       * pattern. The matched line is the delimiter between log messages.
       *
       * For more information, see
       * [awslogs-multiline-pattern](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-multiline-pattern)
       * .
       *
       * This option is ignored if `awslogs-datetime-format` is also configured.
       *
       * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
       * options.
       *
       *
       * Multiline logging performs regular expression parsing and matching of all log messages.
       * This might have a negative impact on logging performance.
       *
       *
       * The following options apply to all supported log drivers.
       *
       * * **mode** - Required: No
       *
       * Valid values: `non-blocking` | `blocking`
       *
       * This option defines the delivery mode of log messages from the container to the log driver
       * specified using `logDriver` . The delivery mode you choose affects application availability
       * when the flow of logs from container is interrupted.
       *
       * If you use the `blocking` mode and the flow of logs is interrupted, calls from container
       * code to write to the `stdout` and `stderr` streams will block. The logging thread of the
       * application will block as a result. This may cause the application to become unresponsive and
       * lead to container healthcheck failure.
       *
       * If you use the `non-blocking` mode, the container's logs are instead stored in an in-memory
       * intermediate buffer configured with the `max-buffer-size` option. This prevents the
       * application from becoming unresponsive when logs cannot be sent. We recommend using this mode
       * if you want to ensure service availability and are okay with some log loss. For more
       * information, see [Preventing log loss with non-blocking mode in the `awslogs` container log
       * driver](https://docs.aws.amazon.com/containers/preventing-log-loss-with-non-blocking-mode-in-the-awslogs-container-log-driver/)
       * .
       *
       * You can set a default `mode` for all containers in a specific AWS Region by using the
       * `defaultLogDriverMode` account setting. If you don't specify the `mode` option or configure
       * the account setting, Amazon ECS will default to the `non-blocking` mode. For more information
       * about the account setting, see [Default log driver
       * mode](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html#default-log-driver-mode)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * On June 25, 2025, Amazon ECS changed the default log driver mode from `blocking` to
       * `non-blocking` to prioritize task availability over logging. To continue using the `blocking`
       * mode after this change, do one of the following:
       *
       * * Set the `mode` option in your container definition's `logConfiguration` as `blocking` .
       * * Set the `defaultLogDriverMode` account setting to `blocking` .
       *
       *
       * * **max-buffer-size** - Required: No
       *
       * Default value: `1m`
       *
       * When `non-blocking` mode is used, the `max-buffer-size` log option controls the size of the
       * buffer that's used for intermediate message storage. Make sure to specify an adequate buffer
       * size based on your application. When the buffer fills up, further logs cannot be stored. Logs
       * that cannot be stored are lost.
       *
       * To route logs using the `splunk` log router, you need to specify a `splunk-token` and a
       * `splunk-url` .
       *
       * When you use the `awsfirelens` log router to route logs to an AWS Service or AWS Partner
       * Network destination for log storage and analytics, you can set the `log-driver-buffer-limit`
       * option to limit the number of events that are buffered in memory, before being sent to the log
       * router container. It can help to resolve potential log loss issue because high throughput
       * might result in memory running out for the buffer inside of Docker.
       *
       * Other options you can specify when using `awsfirelens` to route logs depend on the
       * destination. When you export logs to Amazon Data Firehose, you can specify the AWS Region with
       * `region` and a name for the log stream with `delivery_stream` .
       *
       * When you export logs to Amazon Kinesis Data Streams, you can specify an AWS Region with
       * `region` and a data stream name with `stream` .
       *
       * When you export logs to Amazon OpenSearch Service, you can specify options like `Name` ,
       * `Host` (OpenSearch Service endpoint without protocol), `Port` , `Index` , `Type` , `Aws_auth`
       * , `Aws_region` , `Suppress_Type_Name` , and `tls` . For more information, see [Under the hood:
       * FireLens for Amazon ECS
       * Tasks](https://docs.aws.amazon.com/containers/under-the-hood-firelens-for-amazon-ecs-tasks/) .
       *
       * When you export logs to Amazon S3, you can specify the bucket using the `bucket` option.
       * You can also specify `region` , `total_file_size` , `upload_timeout` , and `use_put_object` as
       * options.
       *
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      public fun options(options: Map<String, String>)

      /**
       * @param options The configuration options to send to the log driver.
       * The options you can specify depend on the log driver. Some of the options you can specify
       * when you use the `awslogs` log driver to route logs to Amazon CloudWatch include the
       * following:
       *
       * * **awslogs-create-group** - Required: No
       *
       * Specify whether you want the log group to be created automatically. If this option isn't
       * specified, it defaults to `false` .
       *
       *
       * Your IAM policy must include the `logs:CreateLogGroup` permission before you attempt to use
       * `awslogs-create-group` .
       *
       *
       * * **awslogs-region** - Required: Yes
       *
       * Specify the AWS Region that the `awslogs` log driver is to send your Docker logs to. You
       * can choose to send all of your logs from clusters in different Regions to a single region in
       * CloudWatch Logs. This is so that they're all visible in one location. Otherwise, you can
       * separate them by Region for more granularity. Make sure that the specified log group exists in
       * the Region that you specify with this option.
       *
       * * **awslogs-group** - Required: Yes
       *
       * Make sure to specify a log group that the `awslogs` log driver sends its log streams to.
       *
       * * **awslogs-stream-prefix** - Required: Yes, when using Fargate.Optional when using EC2.
       *
       * Use the `awslogs-stream-prefix` option to associate a log stream with the specified prefix,
       * the container name, and the ID of the Amazon ECS task that the container belongs to. If you
       * specify a prefix with this option, then the log stream takes the format
       * `prefix-name/container-name/ecs-task-id` .
       *
       * If you don't specify a prefix with this option, then the log stream is named after the
       * container ID that's assigned by the Docker daemon on the container instance. Because it's
       * difficult to trace logs back to the container that sent them with just the Docker container ID
       * (which is only available on the container instance), we recommend that you specify a prefix
       * with this option.
       *
       * For Amazon ECS services, you can use the service name as the prefix. Doing so, you can
       * trace log streams to the service that the container belongs to, the name of the container that
       * sent them, and the ID of the task that the container belongs to.
       *
       * You must specify a stream-prefix for your logs to have your logs appear in the Log pane
       * when using the Amazon ECS console.
       *
       * * **awslogs-datetime-format** - Required: No
       *
       * This option defines a multiline start pattern in Python `strftime` format. A log message
       * consists of a line that matches the pattern and any following lines that don’t match the
       * pattern. The matched line is the delimiter between log messages.
       *
       * One example of a use case for using this format is for parsing output such as a stack dump,
       * which might otherwise be logged in multiple entries. The correct pattern allows it to be
       * captured in a single entry.
       *
       * For more information, see
       * [awslogs-datetime-format](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-datetime-format)
       * .
       *
       * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
       * options.
       *
       *
       * Multiline logging performs regular expression parsing and matching of all log messages.
       * This might have a negative impact on logging performance.
       *
       *
       * * **awslogs-multiline-pattern** - Required: No
       *
       * This option defines a multiline start pattern that uses a regular expression. A log message
       * consists of a line that matches the pattern and any following lines that don’t match the
       * pattern. The matched line is the delimiter between log messages.
       *
       * For more information, see
       * [awslogs-multiline-pattern](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-multiline-pattern)
       * .
       *
       * This option is ignored if `awslogs-datetime-format` is also configured.
       *
       * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
       * options.
       *
       *
       * Multiline logging performs regular expression parsing and matching of all log messages.
       * This might have a negative impact on logging performance.
       *
       *
       * The following options apply to all supported log drivers.
       *
       * * **mode** - Required: No
       *
       * Valid values: `non-blocking` | `blocking`
       *
       * This option defines the delivery mode of log messages from the container to the log driver
       * specified using `logDriver` . The delivery mode you choose affects application availability
       * when the flow of logs from container is interrupted.
       *
       * If you use the `blocking` mode and the flow of logs is interrupted, calls from container
       * code to write to the `stdout` and `stderr` streams will block. The logging thread of the
       * application will block as a result. This may cause the application to become unresponsive and
       * lead to container healthcheck failure.
       *
       * If you use the `non-blocking` mode, the container's logs are instead stored in an in-memory
       * intermediate buffer configured with the `max-buffer-size` option. This prevents the
       * application from becoming unresponsive when logs cannot be sent. We recommend using this mode
       * if you want to ensure service availability and are okay with some log loss. For more
       * information, see [Preventing log loss with non-blocking mode in the `awslogs` container log
       * driver](https://docs.aws.amazon.com/containers/preventing-log-loss-with-non-blocking-mode-in-the-awslogs-container-log-driver/)
       * .
       *
       * You can set a default `mode` for all containers in a specific AWS Region by using the
       * `defaultLogDriverMode` account setting. If you don't specify the `mode` option or configure
       * the account setting, Amazon ECS will default to the `non-blocking` mode. For more information
       * about the account setting, see [Default log driver
       * mode](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html#default-log-driver-mode)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * On June 25, 2025, Amazon ECS changed the default log driver mode from `blocking` to
       * `non-blocking` to prioritize task availability over logging. To continue using the `blocking`
       * mode after this change, do one of the following:
       *
       * * Set the `mode` option in your container definition's `logConfiguration` as `blocking` .
       * * Set the `defaultLogDriverMode` account setting to `blocking` .
       *
       *
       * * **max-buffer-size** - Required: No
       *
       * Default value: `1m`
       *
       * When `non-blocking` mode is used, the `max-buffer-size` log option controls the size of the
       * buffer that's used for intermediate message storage. Make sure to specify an adequate buffer
       * size based on your application. When the buffer fills up, further logs cannot be stored. Logs
       * that cannot be stored are lost.
       *
       * To route logs using the `splunk` log router, you need to specify a `splunk-token` and a
       * `splunk-url` .
       *
       * When you use the `awsfirelens` log router to route logs to an AWS Service or AWS Partner
       * Network destination for log storage and analytics, you can set the `log-driver-buffer-limit`
       * option to limit the number of events that are buffered in memory, before being sent to the log
       * router container. It can help to resolve potential log loss issue because high throughput
       * might result in memory running out for the buffer inside of Docker.
       *
       * Other options you can specify when using `awsfirelens` to route logs depend on the
       * destination. When you export logs to Amazon Data Firehose, you can specify the AWS Region with
       * `region` and a name for the log stream with `delivery_stream` .
       *
       * When you export logs to Amazon Kinesis Data Streams, you can specify an AWS Region with
       * `region` and a data stream name with `stream` .
       *
       * When you export logs to Amazon OpenSearch Service, you can specify options like `Name` ,
       * `Host` (OpenSearch Service endpoint without protocol), `Port` , `Index` , `Type` , `Aws_auth`
       * , `Aws_region` , `Suppress_Type_Name` , and `tls` . For more information, see [Under the hood:
       * FireLens for Amazon ECS
       * Tasks](https://docs.aws.amazon.com/containers/under-the-hood-firelens-for-amazon-ecs-tasks/) .
       *
       * When you export logs to Amazon S3, you can specify the bucket using the `bucket` option.
       * You can also specify `region` , `total_file_size` , `upload_timeout` , and `use_put_object` as
       * options.
       *
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      public fun options(options: IResolvable)

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun secretOptions(secretOptions: IResolvable)

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun secretOptions(secretOptions: List<Any>)

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun secretOptions(vararg secretOptions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty.builder()

      /**
       * @param logDriver The log driver to use for the container.
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
       *
       * For more information about using the `awslogs` log driver, see [Send Amazon ECS logs to
       * CloudWatch](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * For more information about using the `awsfirelens` log driver, see [Send Amazon ECS logs to
       * an AWS service or AWS
       * Partner](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) .
       *
       *
       * If you have a custom driver that isn't listed, you can fork the Amazon ECS container agent
       * project that's [available on
       * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it
       * to work with that driver. We encourage you to submit pull requests for changes that you would
       * like to have included. However, we don't currently provide support for running modified copies
       * of this software.
       */
      override fun logDriver(logDriver: String) {
        cdkBuilder.logDriver(logDriver)
      }

      /**
       * @param options The configuration options to send to the log driver.
       * The options you can specify depend on the log driver. Some of the options you can specify
       * when you use the `awslogs` log driver to route logs to Amazon CloudWatch include the
       * following:
       *
       * * **awslogs-create-group** - Required: No
       *
       * Specify whether you want the log group to be created automatically. If this option isn't
       * specified, it defaults to `false` .
       *
       *
       * Your IAM policy must include the `logs:CreateLogGroup` permission before you attempt to use
       * `awslogs-create-group` .
       *
       *
       * * **awslogs-region** - Required: Yes
       *
       * Specify the AWS Region that the `awslogs` log driver is to send your Docker logs to. You
       * can choose to send all of your logs from clusters in different Regions to a single region in
       * CloudWatch Logs. This is so that they're all visible in one location. Otherwise, you can
       * separate them by Region for more granularity. Make sure that the specified log group exists in
       * the Region that you specify with this option.
       *
       * * **awslogs-group** - Required: Yes
       *
       * Make sure to specify a log group that the `awslogs` log driver sends its log streams to.
       *
       * * **awslogs-stream-prefix** - Required: Yes, when using Fargate.Optional when using EC2.
       *
       * Use the `awslogs-stream-prefix` option to associate a log stream with the specified prefix,
       * the container name, and the ID of the Amazon ECS task that the container belongs to. If you
       * specify a prefix with this option, then the log stream takes the format
       * `prefix-name/container-name/ecs-task-id` .
       *
       * If you don't specify a prefix with this option, then the log stream is named after the
       * container ID that's assigned by the Docker daemon on the container instance. Because it's
       * difficult to trace logs back to the container that sent them with just the Docker container ID
       * (which is only available on the container instance), we recommend that you specify a prefix
       * with this option.
       *
       * For Amazon ECS services, you can use the service name as the prefix. Doing so, you can
       * trace log streams to the service that the container belongs to, the name of the container that
       * sent them, and the ID of the task that the container belongs to.
       *
       * You must specify a stream-prefix for your logs to have your logs appear in the Log pane
       * when using the Amazon ECS console.
       *
       * * **awslogs-datetime-format** - Required: No
       *
       * This option defines a multiline start pattern in Python `strftime` format. A log message
       * consists of a line that matches the pattern and any following lines that don’t match the
       * pattern. The matched line is the delimiter between log messages.
       *
       * One example of a use case for using this format is for parsing output such as a stack dump,
       * which might otherwise be logged in multiple entries. The correct pattern allows it to be
       * captured in a single entry.
       *
       * For more information, see
       * [awslogs-datetime-format](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-datetime-format)
       * .
       *
       * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
       * options.
       *
       *
       * Multiline logging performs regular expression parsing and matching of all log messages.
       * This might have a negative impact on logging performance.
       *
       *
       * * **awslogs-multiline-pattern** - Required: No
       *
       * This option defines a multiline start pattern that uses a regular expression. A log message
       * consists of a line that matches the pattern and any following lines that don’t match the
       * pattern. The matched line is the delimiter between log messages.
       *
       * For more information, see
       * [awslogs-multiline-pattern](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-multiline-pattern)
       * .
       *
       * This option is ignored if `awslogs-datetime-format` is also configured.
       *
       * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
       * options.
       *
       *
       * Multiline logging performs regular expression parsing and matching of all log messages.
       * This might have a negative impact on logging performance.
       *
       *
       * The following options apply to all supported log drivers.
       *
       * * **mode** - Required: No
       *
       * Valid values: `non-blocking` | `blocking`
       *
       * This option defines the delivery mode of log messages from the container to the log driver
       * specified using `logDriver` . The delivery mode you choose affects application availability
       * when the flow of logs from container is interrupted.
       *
       * If you use the `blocking` mode and the flow of logs is interrupted, calls from container
       * code to write to the `stdout` and `stderr` streams will block. The logging thread of the
       * application will block as a result. This may cause the application to become unresponsive and
       * lead to container healthcheck failure.
       *
       * If you use the `non-blocking` mode, the container's logs are instead stored in an in-memory
       * intermediate buffer configured with the `max-buffer-size` option. This prevents the
       * application from becoming unresponsive when logs cannot be sent. We recommend using this mode
       * if you want to ensure service availability and are okay with some log loss. For more
       * information, see [Preventing log loss with non-blocking mode in the `awslogs` container log
       * driver](https://docs.aws.amazon.com/containers/preventing-log-loss-with-non-blocking-mode-in-the-awslogs-container-log-driver/)
       * .
       *
       * You can set a default `mode` for all containers in a specific AWS Region by using the
       * `defaultLogDriverMode` account setting. If you don't specify the `mode` option or configure
       * the account setting, Amazon ECS will default to the `non-blocking` mode. For more information
       * about the account setting, see [Default log driver
       * mode](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html#default-log-driver-mode)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * On June 25, 2025, Amazon ECS changed the default log driver mode from `blocking` to
       * `non-blocking` to prioritize task availability over logging. To continue using the `blocking`
       * mode after this change, do one of the following:
       *
       * * Set the `mode` option in your container definition's `logConfiguration` as `blocking` .
       * * Set the `defaultLogDriverMode` account setting to `blocking` .
       *
       *
       * * **max-buffer-size** - Required: No
       *
       * Default value: `1m`
       *
       * When `non-blocking` mode is used, the `max-buffer-size` log option controls the size of the
       * buffer that's used for intermediate message storage. Make sure to specify an adequate buffer
       * size based on your application. When the buffer fills up, further logs cannot be stored. Logs
       * that cannot be stored are lost.
       *
       * To route logs using the `splunk` log router, you need to specify a `splunk-token` and a
       * `splunk-url` .
       *
       * When you use the `awsfirelens` log router to route logs to an AWS Service or AWS Partner
       * Network destination for log storage and analytics, you can set the `log-driver-buffer-limit`
       * option to limit the number of events that are buffered in memory, before being sent to the log
       * router container. It can help to resolve potential log loss issue because high throughput
       * might result in memory running out for the buffer inside of Docker.
       *
       * Other options you can specify when using `awsfirelens` to route logs depend on the
       * destination. When you export logs to Amazon Data Firehose, you can specify the AWS Region with
       * `region` and a name for the log stream with `delivery_stream` .
       *
       * When you export logs to Amazon Kinesis Data Streams, you can specify an AWS Region with
       * `region` and a data stream name with `stream` .
       *
       * When you export logs to Amazon OpenSearch Service, you can specify options like `Name` ,
       * `Host` (OpenSearch Service endpoint without protocol), `Port` , `Index` , `Type` , `Aws_auth`
       * , `Aws_region` , `Suppress_Type_Name` , and `tls` . For more information, see [Under the hood:
       * FireLens for Amazon ECS
       * Tasks](https://docs.aws.amazon.com/containers/under-the-hood-firelens-for-amazon-ecs-tasks/) .
       *
       * When you export logs to Amazon S3, you can specify the bucket using the `bucket` option.
       * You can also specify `region` , `total_file_size` , `upload_timeout` , and `use_put_object` as
       * options.
       *
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      override fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
      }

      /**
       * @param options The configuration options to send to the log driver.
       * The options you can specify depend on the log driver. Some of the options you can specify
       * when you use the `awslogs` log driver to route logs to Amazon CloudWatch include the
       * following:
       *
       * * **awslogs-create-group** - Required: No
       *
       * Specify whether you want the log group to be created automatically. If this option isn't
       * specified, it defaults to `false` .
       *
       *
       * Your IAM policy must include the `logs:CreateLogGroup` permission before you attempt to use
       * `awslogs-create-group` .
       *
       *
       * * **awslogs-region** - Required: Yes
       *
       * Specify the AWS Region that the `awslogs` log driver is to send your Docker logs to. You
       * can choose to send all of your logs from clusters in different Regions to a single region in
       * CloudWatch Logs. This is so that they're all visible in one location. Otherwise, you can
       * separate them by Region for more granularity. Make sure that the specified log group exists in
       * the Region that you specify with this option.
       *
       * * **awslogs-group** - Required: Yes
       *
       * Make sure to specify a log group that the `awslogs` log driver sends its log streams to.
       *
       * * **awslogs-stream-prefix** - Required: Yes, when using Fargate.Optional when using EC2.
       *
       * Use the `awslogs-stream-prefix` option to associate a log stream with the specified prefix,
       * the container name, and the ID of the Amazon ECS task that the container belongs to. If you
       * specify a prefix with this option, then the log stream takes the format
       * `prefix-name/container-name/ecs-task-id` .
       *
       * If you don't specify a prefix with this option, then the log stream is named after the
       * container ID that's assigned by the Docker daemon on the container instance. Because it's
       * difficult to trace logs back to the container that sent them with just the Docker container ID
       * (which is only available on the container instance), we recommend that you specify a prefix
       * with this option.
       *
       * For Amazon ECS services, you can use the service name as the prefix. Doing so, you can
       * trace log streams to the service that the container belongs to, the name of the container that
       * sent them, and the ID of the task that the container belongs to.
       *
       * You must specify a stream-prefix for your logs to have your logs appear in the Log pane
       * when using the Amazon ECS console.
       *
       * * **awslogs-datetime-format** - Required: No
       *
       * This option defines a multiline start pattern in Python `strftime` format. A log message
       * consists of a line that matches the pattern and any following lines that don’t match the
       * pattern. The matched line is the delimiter between log messages.
       *
       * One example of a use case for using this format is for parsing output such as a stack dump,
       * which might otherwise be logged in multiple entries. The correct pattern allows it to be
       * captured in a single entry.
       *
       * For more information, see
       * [awslogs-datetime-format](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-datetime-format)
       * .
       *
       * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
       * options.
       *
       *
       * Multiline logging performs regular expression parsing and matching of all log messages.
       * This might have a negative impact on logging performance.
       *
       *
       * * **awslogs-multiline-pattern** - Required: No
       *
       * This option defines a multiline start pattern that uses a regular expression. A log message
       * consists of a line that matches the pattern and any following lines that don’t match the
       * pattern. The matched line is the delimiter between log messages.
       *
       * For more information, see
       * [awslogs-multiline-pattern](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-multiline-pattern)
       * .
       *
       * This option is ignored if `awslogs-datetime-format` is also configured.
       *
       * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
       * options.
       *
       *
       * Multiline logging performs regular expression parsing and matching of all log messages.
       * This might have a negative impact on logging performance.
       *
       *
       * The following options apply to all supported log drivers.
       *
       * * **mode** - Required: No
       *
       * Valid values: `non-blocking` | `blocking`
       *
       * This option defines the delivery mode of log messages from the container to the log driver
       * specified using `logDriver` . The delivery mode you choose affects application availability
       * when the flow of logs from container is interrupted.
       *
       * If you use the `blocking` mode and the flow of logs is interrupted, calls from container
       * code to write to the `stdout` and `stderr` streams will block. The logging thread of the
       * application will block as a result. This may cause the application to become unresponsive and
       * lead to container healthcheck failure.
       *
       * If you use the `non-blocking` mode, the container's logs are instead stored in an in-memory
       * intermediate buffer configured with the `max-buffer-size` option. This prevents the
       * application from becoming unresponsive when logs cannot be sent. We recommend using this mode
       * if you want to ensure service availability and are okay with some log loss. For more
       * information, see [Preventing log loss with non-blocking mode in the `awslogs` container log
       * driver](https://docs.aws.amazon.com/containers/preventing-log-loss-with-non-blocking-mode-in-the-awslogs-container-log-driver/)
       * .
       *
       * You can set a default `mode` for all containers in a specific AWS Region by using the
       * `defaultLogDriverMode` account setting. If you don't specify the `mode` option or configure
       * the account setting, Amazon ECS will default to the `non-blocking` mode. For more information
       * about the account setting, see [Default log driver
       * mode](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html#default-log-driver-mode)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * On June 25, 2025, Amazon ECS changed the default log driver mode from `blocking` to
       * `non-blocking` to prioritize task availability over logging. To continue using the `blocking`
       * mode after this change, do one of the following:
       *
       * * Set the `mode` option in your container definition's `logConfiguration` as `blocking` .
       * * Set the `defaultLogDriverMode` account setting to `blocking` .
       *
       *
       * * **max-buffer-size** - Required: No
       *
       * Default value: `1m`
       *
       * When `non-blocking` mode is used, the `max-buffer-size` log option controls the size of the
       * buffer that's used for intermediate message storage. Make sure to specify an adequate buffer
       * size based on your application. When the buffer fills up, further logs cannot be stored. Logs
       * that cannot be stored are lost.
       *
       * To route logs using the `splunk` log router, you need to specify a `splunk-token` and a
       * `splunk-url` .
       *
       * When you use the `awsfirelens` log router to route logs to an AWS Service or AWS Partner
       * Network destination for log storage and analytics, you can set the `log-driver-buffer-limit`
       * option to limit the number of events that are buffered in memory, before being sent to the log
       * router container. It can help to resolve potential log loss issue because high throughput
       * might result in memory running out for the buffer inside of Docker.
       *
       * Other options you can specify when using `awsfirelens` to route logs depend on the
       * destination. When you export logs to Amazon Data Firehose, you can specify the AWS Region with
       * `region` and a name for the log stream with `delivery_stream` .
       *
       * When you export logs to Amazon Kinesis Data Streams, you can specify an AWS Region with
       * `region` and a data stream name with `stream` .
       *
       * When you export logs to Amazon OpenSearch Service, you can specify options like `Name` ,
       * `Host` (OpenSearch Service endpoint without protocol), `Port` , `Index` , `Type` , `Aws_auth`
       * , `Aws_region` , `Suppress_Type_Name` , and `tls` . For more information, see [Under the hood:
       * FireLens for Amazon ECS
       * Tasks](https://docs.aws.amazon.com/containers/under-the-hood-firelens-for-amazon-ecs-tasks/) .
       *
       * When you export logs to Amazon S3, you can specify the bucket using the `bucket` option.
       * You can also specify `region` , `total_file_size` , `upload_timeout` , and `use_put_object` as
       * options.
       *
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secretOptions(secretOptions: IResolvable) {
        cdkBuilder.secretOptions(secretOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secretOptions(secretOptions: List<Any>) {
        cdkBuilder.secretOptions(secretOptions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secretOptions(vararg secretOptions: Any): Unit =
          secretOptions(secretOptions.toList())

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty,
    ) : CdkObject(cdkObject),
        LogConfigurationProperty {
      /**
       * The log driver to use for the container.
       *
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
       *
       * For more information about using the `awslogs` log driver, see [Send Amazon ECS logs to
       * CloudWatch](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * For more information about using the `awsfirelens` log driver, see [Send Amazon ECS logs to
       * an AWS service or AWS
       * Partner](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) .
       *
       *
       * If you have a custom driver that isn't listed, you can fork the Amazon ECS container agent
       * project that's [available on
       * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it
       * to work with that driver. We encourage you to submit pull requests for changes that you would
       * like to have included. However, we don't currently provide support for running modified copies
       * of this software.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-logconfiguration.html#cfn-ecs-service-logconfiguration-logdriver)
       */
      override fun logDriver(): String? = unwrap(this).getLogDriver()

      /**
       * The configuration options to send to the log driver.
       *
       * The options you can specify depend on the log driver. Some of the options you can specify
       * when you use the `awslogs` log driver to route logs to Amazon CloudWatch include the
       * following:
       *
       * * **awslogs-create-group** - Required: No
       *
       * Specify whether you want the log group to be created automatically. If this option isn't
       * specified, it defaults to `false` .
       *
       *
       * Your IAM policy must include the `logs:CreateLogGroup` permission before you attempt to use
       * `awslogs-create-group` .
       *
       *
       * * **awslogs-region** - Required: Yes
       *
       * Specify the AWS Region that the `awslogs` log driver is to send your Docker logs to. You
       * can choose to send all of your logs from clusters in different Regions to a single region in
       * CloudWatch Logs. This is so that they're all visible in one location. Otherwise, you can
       * separate them by Region for more granularity. Make sure that the specified log group exists in
       * the Region that you specify with this option.
       *
       * * **awslogs-group** - Required: Yes
       *
       * Make sure to specify a log group that the `awslogs` log driver sends its log streams to.
       *
       * * **awslogs-stream-prefix** - Required: Yes, when using Fargate.Optional when using EC2.
       *
       * Use the `awslogs-stream-prefix` option to associate a log stream with the specified prefix,
       * the container name, and the ID of the Amazon ECS task that the container belongs to. If you
       * specify a prefix with this option, then the log stream takes the format
       * `prefix-name/container-name/ecs-task-id` .
       *
       * If you don't specify a prefix with this option, then the log stream is named after the
       * container ID that's assigned by the Docker daemon on the container instance. Because it's
       * difficult to trace logs back to the container that sent them with just the Docker container ID
       * (which is only available on the container instance), we recommend that you specify a prefix
       * with this option.
       *
       * For Amazon ECS services, you can use the service name as the prefix. Doing so, you can
       * trace log streams to the service that the container belongs to, the name of the container that
       * sent them, and the ID of the task that the container belongs to.
       *
       * You must specify a stream-prefix for your logs to have your logs appear in the Log pane
       * when using the Amazon ECS console.
       *
       * * **awslogs-datetime-format** - Required: No
       *
       * This option defines a multiline start pattern in Python `strftime` format. A log message
       * consists of a line that matches the pattern and any following lines that don’t match the
       * pattern. The matched line is the delimiter between log messages.
       *
       * One example of a use case for using this format is for parsing output such as a stack dump,
       * which might otherwise be logged in multiple entries. The correct pattern allows it to be
       * captured in a single entry.
       *
       * For more information, see
       * [awslogs-datetime-format](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-datetime-format)
       * .
       *
       * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
       * options.
       *
       *
       * Multiline logging performs regular expression parsing and matching of all log messages.
       * This might have a negative impact on logging performance.
       *
       *
       * * **awslogs-multiline-pattern** - Required: No
       *
       * This option defines a multiline start pattern that uses a regular expression. A log message
       * consists of a line that matches the pattern and any following lines that don’t match the
       * pattern. The matched line is the delimiter between log messages.
       *
       * For more information, see
       * [awslogs-multiline-pattern](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/logging/awslogs/#awslogs-multiline-pattern)
       * .
       *
       * This option is ignored if `awslogs-datetime-format` is also configured.
       *
       * You cannot configure both the `awslogs-datetime-format` and `awslogs-multiline-pattern`
       * options.
       *
       *
       * Multiline logging performs regular expression parsing and matching of all log messages.
       * This might have a negative impact on logging performance.
       *
       *
       * The following options apply to all supported log drivers.
       *
       * * **mode** - Required: No
       *
       * Valid values: `non-blocking` | `blocking`
       *
       * This option defines the delivery mode of log messages from the container to the log driver
       * specified using `logDriver` . The delivery mode you choose affects application availability
       * when the flow of logs from container is interrupted.
       *
       * If you use the `blocking` mode and the flow of logs is interrupted, calls from container
       * code to write to the `stdout` and `stderr` streams will block. The logging thread of the
       * application will block as a result. This may cause the application to become unresponsive and
       * lead to container healthcheck failure.
       *
       * If you use the `non-blocking` mode, the container's logs are instead stored in an in-memory
       * intermediate buffer configured with the `max-buffer-size` option. This prevents the
       * application from becoming unresponsive when logs cannot be sent. We recommend using this mode
       * if you want to ensure service availability and are okay with some log loss. For more
       * information, see [Preventing log loss with non-blocking mode in the `awslogs` container log
       * driver](https://docs.aws.amazon.com/containers/preventing-log-loss-with-non-blocking-mode-in-the-awslogs-container-log-driver/)
       * .
       *
       * You can set a default `mode` for all containers in a specific AWS Region by using the
       * `defaultLogDriverMode` account setting. If you don't specify the `mode` option or configure
       * the account setting, Amazon ECS will default to the `non-blocking` mode. For more information
       * about the account setting, see [Default log driver
       * mode](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html#default-log-driver-mode)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * On June 25, 2025, Amazon ECS changed the default log driver mode from `blocking` to
       * `non-blocking` to prioritize task availability over logging. To continue using the `blocking`
       * mode after this change, do one of the following:
       *
       * * Set the `mode` option in your container definition's `logConfiguration` as `blocking` .
       * * Set the `defaultLogDriverMode` account setting to `blocking` .
       *
       *
       * * **max-buffer-size** - Required: No
       *
       * Default value: `1m`
       *
       * When `non-blocking` mode is used, the `max-buffer-size` log option controls the size of the
       * buffer that's used for intermediate message storage. Make sure to specify an adequate buffer
       * size based on your application. When the buffer fills up, further logs cannot be stored. Logs
       * that cannot be stored are lost.
       *
       * To route logs using the `splunk` log router, you need to specify a `splunk-token` and a
       * `splunk-url` .
       *
       * When you use the `awsfirelens` log router to route logs to an AWS Service or AWS Partner
       * Network destination for log storage and analytics, you can set the `log-driver-buffer-limit`
       * option to limit the number of events that are buffered in memory, before being sent to the log
       * router container. It can help to resolve potential log loss issue because high throughput
       * might result in memory running out for the buffer inside of Docker.
       *
       * Other options you can specify when using `awsfirelens` to route logs depend on the
       * destination. When you export logs to Amazon Data Firehose, you can specify the AWS Region with
       * `region` and a name for the log stream with `delivery_stream` .
       *
       * When you export logs to Amazon Kinesis Data Streams, you can specify an AWS Region with
       * `region` and a data stream name with `stream` .
       *
       * When you export logs to Amazon OpenSearch Service, you can specify options like `Name` ,
       * `Host` (OpenSearch Service endpoint without protocol), `Port` , `Index` , `Type` , `Aws_auth`
       * , `Aws_region` , `Suppress_Type_Name` , and `tls` . For more information, see [Under the hood:
       * FireLens for Amazon ECS
       * Tasks](https://docs.aws.amazon.com/containers/under-the-hood-firelens-for-amazon-ecs-tasks/) .
       *
       * When you export logs to Amazon S3, you can specify the bucket using the `bucket` option.
       * You can also specify `region` , `total_file_size` , `upload_timeout` , and `use_put_object` as
       * options.
       *
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-logconfiguration.html#cfn-ecs-service-logconfiguration-options)
       */
      override fun options(): Any? = unwrap(this).getOptions()

      /**
       * The secrets to pass to the log configuration.
       *
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-logconfiguration.html#cfn-ecs-service-logconfiguration-secretoptions)
       */
      override fun secretOptions(): Any? = unwrap(this).getSecretOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty):
          LogConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? LogConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty
    }
  }

  /**
   * The network configuration for a task or service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * NetworkConfigurationProperty networkConfigurationProperty =
   * NetworkConfigurationProperty.builder()
   * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
   * .assignPublicIp("assignPublicIp")
   * .securityGroups(List.of("securityGroups"))
   * .subnets(List.of("subnets"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html)
   */
  public interface NetworkConfigurationProperty {
    /**
     * The VPC subnets and security groups that are associated with a task.
     *
     *
     * All specified subnets and security groups must be from the same VPC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html#cfn-ecs-service-networkconfiguration-awsvpcconfiguration)
     */
    public fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsvpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable)

      /**
       * @param awsvpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      public fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty)

      /**
       * @param awsvpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79684c36acab0cdfbf04ed7dac66c18ab2c1361696165365afa87bebd36dc8cf")
      public
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty.builder()

      /**
       * @param awsvpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      override fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsvpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      override fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(AwsVpcConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param awsvpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79684c36acab0cdfbf04ed7dac66c18ab2c1361696165365afa87bebd36dc8cf")
      override
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsvpcConfiguration(AwsVpcConfigurationProperty(awsvpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject),
        NetworkConfigurationProperty {
      /**
       * The VPC subnets and security groups that are associated with a task.
       *
       *
       * All specified subnets and security groups must be from the same VPC.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html#cfn-ecs-service-networkconfiguration-awsvpcconfiguration)
       */
      override fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty):
          NetworkConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NetworkConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty
    }
  }

  /**
   * An object representing a constraint on task placement.
   *
   * For more information, see [Task placement
   * constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   *
   * If you're using the Fargate launch type, task placement constraints aren't supported.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * PlacementConstraintProperty placementConstraintProperty = PlacementConstraintProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .expression("expression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html)
   */
  public interface PlacementConstraintProperty {
    /**
     * A cluster query language expression to apply to the constraint.
     *
     * The expression can have a maximum length of 2000 characters. You can't specify an expression
     * if the constraint type is `distinctInstance` . For more information, see [Cluster query
     * language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * The type of constraint.
     *
     * Use `distinctInstance` to ensure that each task in a particular group is running on a
     * different container instance. Use `memberOf` to restrict the selection to a group of valid
     * candidates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-type)
     */
    public fun type(): String

    /**
     * A builder for [PlacementConstraintProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression A cluster query language expression to apply to the constraint.
       * The expression can have a maximum length of 2000 characters. You can't specify an
       * expression if the constraint type is `distinctInstance` . For more information, see [Cluster
       * query
       * language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun expression(expression: String)

      /**
       * @param type The type of constraint. 
       * Use `distinctInstance` to ensure that each task in a particular group is running on a
       * different container instance. Use `memberOf` to restrict the selection to a group of valid
       * candidates.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.builder()

      /**
       * @param expression A cluster query language expression to apply to the constraint.
       * The expression can have a maximum length of 2000 characters. You can't specify an
       * expression if the constraint type is `distinctInstance` . For more information, see [Cluster
       * query
       * language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param type The type of constraint. 
       * Use `distinctInstance` to ensure that each task in a particular group is running on a
       * different container instance. Use `memberOf` to restrict the selection to a group of valid
       * candidates.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty,
    ) : CdkObject(cdkObject),
        PlacementConstraintProperty {
      /**
       * A cluster query language expression to apply to the constraint.
       *
       * The expression can have a maximum length of 2000 characters. You can't specify an
       * expression if the constraint type is `distinctInstance` . For more information, see [Cluster
       * query
       * language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * The type of constraint.
       *
       * Use `distinctInstance` to ensure that each task in a particular group is running on a
       * different container instance. Use `memberOf` to restrict the selection to a group of valid
       * candidates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty):
          PlacementConstraintProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PlacementConstraintProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementConstraintProperty):
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty
    }
  }

  /**
   * The task placement strategy for a task or service.
   *
   * For more information, see [Task placement
   * strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * PlacementStrategyProperty placementStrategyProperty = PlacementStrategyProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .field("field")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html)
   */
  public interface PlacementStrategyProperty {
    /**
     * The field to apply the placement strategy against.
     *
     * For the `spread` placement strategy, valid values are `instanceId` (or `host` , which has the
     * same effect), or any platform or custom attribute that's applied to a container instance, such
     * as `attribute:ecs.availability-zone` . For the `binpack` placement strategy, valid values are
     * `cpu` and `memory` . For the `random` placement strategy, this field is not used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-field)
     */
    public fun `field`(): String? = unwrap(this).getField()

    /**
     * The type of placement strategy.
     *
     * The `random` placement strategy randomly places tasks on available candidates. The `spread`
     * placement strategy spreads placement across available candidates evenly based on the `field`
     * parameter. The `binpack` strategy places tasks on available candidates that have the least
     * available amount of the resource that's specified with the `field` parameter. For example, if
     * you binpack on memory, a task is placed on the instance with the least amount of remaining
     * memory but still enough to run the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-type)
     */
    public fun type(): String

    /**
     * A builder for [PlacementStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param field The field to apply the placement strategy against.
       * For the `spread` placement strategy, valid values are `instanceId` (or `host` , which has
       * the same effect), or any platform or custom attribute that's applied to a container instance,
       * such as `attribute:ecs.availability-zone` . For the `binpack` placement strategy, valid values
       * are `cpu` and `memory` . For the `random` placement strategy, this field is not used.
       */
      public fun `field`(`field`: String)

      /**
       * @param type The type of placement strategy. 
       * The `random` placement strategy randomly places tasks on available candidates. The `spread`
       * placement strategy spreads placement across available candidates evenly based on the `field`
       * parameter. The `binpack` strategy places tasks on available candidates that have the least
       * available amount of the resource that's specified with the `field` parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory but still enough to run the task.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.builder()

      /**
       * @param field The field to apply the placement strategy against.
       * For the `spread` placement strategy, valid values are `instanceId` (or `host` , which has
       * the same effect), or any platform or custom attribute that's applied to a container instance,
       * such as `attribute:ecs.availability-zone` . For the `binpack` placement strategy, valid values
       * are `cpu` and `memory` . For the `random` placement strategy, this field is not used.
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param type The type of placement strategy. 
       * The `random` placement strategy randomly places tasks on available candidates. The `spread`
       * placement strategy spreads placement across available candidates evenly based on the `field`
       * parameter. The `binpack` strategy places tasks on available candidates that have the least
       * available amount of the resource that's specified with the `field` parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory but still enough to run the task.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty,
    ) : CdkObject(cdkObject),
        PlacementStrategyProperty {
      /**
       * The field to apply the placement strategy against.
       *
       * For the `spread` placement strategy, valid values are `instanceId` (or `host` , which has
       * the same effect), or any platform or custom attribute that's applied to a container instance,
       * such as `attribute:ecs.availability-zone` . For the `binpack` placement strategy, valid values
       * are `cpu` and `memory` . For the `random` placement strategy, this field is not used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-field)
       */
      override fun `field`(): String? = unwrap(this).getField()

      /**
       * The type of placement strategy.
       *
       * The `random` placement strategy randomly places tasks on available candidates. The `spread`
       * placement strategy spreads placement across available candidates evenly based on the `field`
       * parameter. The `binpack` strategy places tasks on available candidates that have the least
       * available amount of the resource that's specified with the `field` parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory but still enough to run the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty):
          PlacementStrategyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PlacementStrategyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementStrategyProperty):
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty
    }
  }

  /**
   * An object representing the secret to expose to your container.
   *
   * Secrets can be exposed to a container in the following ways:
   *
   * * To inject sensitive data into your containers as environment variables, use the `secrets`
   * container definition parameter.
   * * To reference sensitive information in the log configuration of a container, use the
   * `secretOptions` container definition parameter.
   *
   * For more information, see [Specifying sensitive
   * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * SecretProperty secretProperty = SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-secret.html)
   */
  public interface SecretProperty {
    /**
     * The name of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-secret.html#cfn-ecs-service-secret-name)
     */
    public fun name(): String

    /**
     * The secret to expose to the container.
     *
     * The supported values are either the full ARN of the AWS Secrets Manager secret or the full
     * ARN of the parameter in the SSM Parameter Store.
     *
     * For information about the require AWS Identity and Access Management permissions, see
     * [Required IAM permissions for Amazon ECS
     * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-secrets.html#secrets-iam)
     * (for Secrets Manager) or [Required IAM permissions for Amazon ECS
     * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-parameters.html)
     * (for Systems Manager Parameter store) in the *Amazon Elastic Container Service Developer Guide*
     * .
     *
     *
     * If the SSM Parameter Store parameter exists in the same Region as the task you're launching,
     * then you can use either the full ARN or name of the parameter. If the parameter exists in a
     * different Region, then the full ARN must be specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-secret.html#cfn-ecs-service-secret-valuefrom)
     */
    public fun valueFrom(): String

    /**
     * A builder for [SecretProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the secret. 
       */
      public fun name(name: String)

      /**
       * @param valueFrom The secret to expose to the container. 
       * The supported values are either the full ARN of the AWS Secrets Manager secret or the full
       * ARN of the parameter in the SSM Parameter Store.
       *
       * For information about the require AWS Identity and Access Management permissions, see
       * [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-secrets.html#secrets-iam)
       * (for Secrets Manager) or [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-parameters.html)
       * (for Systems Manager Parameter store) in the *Amazon Elastic Container Service Developer
       * Guide* .
       *
       *
       * If the SSM Parameter Store parameter exists in the same Region as the task you're
       * launching, then you can use either the full ARN or name of the parameter. If the parameter
       * exists in a different Region, then the full ARN must be specified.
       */
      public fun valueFrom(valueFrom: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnService.SecretProperty.Builder
          = software.amazon.awscdk.services.ecs.CfnService.SecretProperty.builder()

      /**
       * @param name The name of the secret. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param valueFrom The secret to expose to the container. 
       * The supported values are either the full ARN of the AWS Secrets Manager secret or the full
       * ARN of the parameter in the SSM Parameter Store.
       *
       * For information about the require AWS Identity and Access Management permissions, see
       * [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-secrets.html#secrets-iam)
       * (for Secrets Manager) or [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-parameters.html)
       * (for Systems Manager Parameter store) in the *Amazon Elastic Container Service Developer
       * Guide* .
       *
       *
       * If the SSM Parameter Store parameter exists in the same Region as the task you're
       * launching, then you can use either the full ARN or name of the parameter. If the parameter
       * exists in a different Region, then the full ARN must be specified.
       */
      override fun valueFrom(valueFrom: String) {
        cdkBuilder.valueFrom(valueFrom)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.SecretProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.SecretProperty,
    ) : CdkObject(cdkObject),
        SecretProperty {
      /**
       * The name of the secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-secret.html#cfn-ecs-service-secret-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The secret to expose to the container.
       *
       * The supported values are either the full ARN of the AWS Secrets Manager secret or the full
       * ARN of the parameter in the SSM Parameter Store.
       *
       * For information about the require AWS Identity and Access Management permissions, see
       * [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-secrets.html#secrets-iam)
       * (for Secrets Manager) or [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-parameters.html)
       * (for Systems Manager Parameter store) in the *Amazon Elastic Container Service Developer
       * Guide* .
       *
       *
       * If the SSM Parameter Store parameter exists in the same Region as the task you're
       * launching, then you can use either the full ARN or name of the parameter. If the parameter
       * exists in a different Region, then the full ARN must be specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-secret.html#cfn-ecs-service-secret-valuefrom)
       */
      override fun valueFrom(): String = unwrap(this).getValueFrom()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.SecretProperty):
          SecretProperty = CdkObjectWrappers.wrap(cdkObject) as? SecretProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretProperty):
          software.amazon.awscdk.services.ecs.CfnService.SecretProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CfnService.SecretProperty
    }
  }

  /**
   * Each alias ("endpoint") is a fully-qualified name and port number that other tasks ("clients")
   * can use to connect to this service.
   *
   * Each name and port mapping must be unique within the namespace.
   *
   * Tasks that run in a namespace can use short names to connect to services in the namespace.
   * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through a
   * managed proxy container that collects logs and metrics for increased visibility. Only the tasks
   * that Amazon ECS services create are supported with Service Connect. For more information, see
   * [Service
   * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceConnectClientAliasProperty serviceConnectClientAliasProperty =
   * ServiceConnectClientAliasProperty.builder()
   * .port(123)
   * // the properties below are optional
   * .dnsName("dnsName")
   * .testTrafficRules(ServiceConnectTestTrafficRulesProperty.builder()
   * .header(ServiceConnectTestTrafficRulesHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value(ServiceConnectTestTrafficRulesHeaderValueProperty.builder()
   * .exact("exact")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectclientalias.html)
   */
  public interface ServiceConnectClientAliasProperty {
    /**
     * The `dnsName` is the name that you use in the applications of client tasks to connect to this
     * service.
     *
     * The name must be a valid DNS name but doesn't need to be fully-qualified. The name can
     * include up to 127 characters. The name can include lowercase letters, numbers, underscores (_),
     * hyphens (-), and periods (.). The name can't start with a hyphen.
     *
     * If this parameter isn't specified, the default value of `discoveryName.namespace` is used. If
     * the `discoveryName` isn't specified, the port mapping name from the task definition is used in
     * `portName.namespace` .
     *
     * To avoid changing your applications in client Amazon ECS services, set this to the same name
     * that the client application uses by default. For example, a few common names are `database` ,
     * `db` , or the lowercase name of a database, such as `mysql` or `redis` . For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectclientalias.html#cfn-ecs-service-serviceconnectclientalias-dnsname)
     */
    public fun dnsName(): String? = unwrap(this).getDnsName()

    /**
     * The listening port number for the Service Connect proxy.
     *
     * This port is available inside of all of the tasks within the same namespace.
     *
     * To avoid changing your applications in client Amazon ECS services, set this to the same port
     * that the client application uses by default. For more information, see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectclientalias.html#cfn-ecs-service-serviceconnectclientalias-port)
     */
    public fun port(): Number

    /**
     * The configuration for test traffic routing rules used during blue/green deployments with
     * Amazon ECS Service Connect.
     *
     * This allows you to route a portion of traffic to the new service revision of your service for
     * testing before shifting all production traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectclientalias.html#cfn-ecs-service-serviceconnectclientalias-testtrafficrules)
     */
    public fun testTrafficRules(): Any? = unwrap(this).getTestTrafficRules()

    /**
     * A builder for [ServiceConnectClientAliasProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dnsName The `dnsName` is the name that you use in the applications of client tasks
       * to connect to this service.
       * The name must be a valid DNS name but doesn't need to be fully-qualified. The name can
       * include up to 127 characters. The name can include lowercase letters, numbers, underscores
       * (_), hyphens (-), and periods (.). The name can't start with a hyphen.
       *
       * If this parameter isn't specified, the default value of `discoveryName.namespace` is used.
       * If the `discoveryName` isn't specified, the port mapping name from the task definition is used
       * in `portName.namespace` .
       *
       * To avoid changing your applications in client Amazon ECS services, set this to the same
       * name that the client application uses by default. For example, a few common names are
       * `database` , `db` , or the lowercase name of a database, such as `mysql` or `redis` . For more
       * information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun dnsName(dnsName: String)

      /**
       * @param port The listening port number for the Service Connect proxy. 
       * This port is available inside of all of the tasks within the same namespace.
       *
       * To avoid changing your applications in client Amazon ECS services, set this to the same
       * port that the client application uses by default. For more information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun port(port: Number)

      /**
       * @param testTrafficRules The configuration for test traffic routing rules used during
       * blue/green deployments with Amazon ECS Service Connect.
       * This allows you to route a portion of traffic to the new service revision of your service
       * for testing before shifting all production traffic.
       */
      public fun testTrafficRules(testTrafficRules: IResolvable)

      /**
       * @param testTrafficRules The configuration for test traffic routing rules used during
       * blue/green deployments with Amazon ECS Service Connect.
       * This allows you to route a portion of traffic to the new service revision of your service
       * for testing before shifting all production traffic.
       */
      public fun testTrafficRules(testTrafficRules: ServiceConnectTestTrafficRulesProperty)

      /**
       * @param testTrafficRules The configuration for test traffic routing rules used during
       * blue/green deployments with Amazon ECS Service Connect.
       * This allows you to route a portion of traffic to the new service revision of your service
       * for testing before shifting all production traffic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ffc4cfa3a32a97d7faf98e83ed8b81fa3bdadf01ff8333b2e6d144665e30d6f")
      public
          fun testTrafficRules(testTrafficRules: ServiceConnectTestTrafficRulesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty.builder()

      /**
       * @param dnsName The `dnsName` is the name that you use in the applications of client tasks
       * to connect to this service.
       * The name must be a valid DNS name but doesn't need to be fully-qualified. The name can
       * include up to 127 characters. The name can include lowercase letters, numbers, underscores
       * (_), hyphens (-), and periods (.). The name can't start with a hyphen.
       *
       * If this parameter isn't specified, the default value of `discoveryName.namespace` is used.
       * If the `discoveryName` isn't specified, the port mapping name from the task definition is used
       * in `portName.namespace` .
       *
       * To avoid changing your applications in client Amazon ECS services, set this to the same
       * name that the client application uses by default. For example, a few common names are
       * `database` , `db` , or the lowercase name of a database, such as `mysql` or `redis` . For more
       * information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      /**
       * @param port The listening port number for the Service Connect proxy. 
       * This port is available inside of all of the tasks within the same namespace.
       *
       * To avoid changing your applications in client Amazon ECS services, set this to the same
       * port that the client application uses by default. For more information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param testTrafficRules The configuration for test traffic routing rules used during
       * blue/green deployments with Amazon ECS Service Connect.
       * This allows you to route a portion of traffic to the new service revision of your service
       * for testing before shifting all production traffic.
       */
      override fun testTrafficRules(testTrafficRules: IResolvable) {
        cdkBuilder.testTrafficRules(testTrafficRules.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param testTrafficRules The configuration for test traffic routing rules used during
       * blue/green deployments with Amazon ECS Service Connect.
       * This allows you to route a portion of traffic to the new service revision of your service
       * for testing before shifting all production traffic.
       */
      override fun testTrafficRules(testTrafficRules: ServiceConnectTestTrafficRulesProperty) {
        cdkBuilder.testTrafficRules(testTrafficRules.let(ServiceConnectTestTrafficRulesProperty.Companion::unwrap))
      }

      /**
       * @param testTrafficRules The configuration for test traffic routing rules used during
       * blue/green deployments with Amazon ECS Service Connect.
       * This allows you to route a portion of traffic to the new service revision of your service
       * for testing before shifting all production traffic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ffc4cfa3a32a97d7faf98e83ed8b81fa3bdadf01ff8333b2e6d144665e30d6f")
      override
          fun testTrafficRules(testTrafficRules: ServiceConnectTestTrafficRulesProperty.Builder.() -> Unit):
          Unit = testTrafficRules(ServiceConnectTestTrafficRulesProperty(testTrafficRules))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty,
    ) : CdkObject(cdkObject),
        ServiceConnectClientAliasProperty {
      /**
       * The `dnsName` is the name that you use in the applications of client tasks to connect to
       * this service.
       *
       * The name must be a valid DNS name but doesn't need to be fully-qualified. The name can
       * include up to 127 characters. The name can include lowercase letters, numbers, underscores
       * (_), hyphens (-), and periods (.). The name can't start with a hyphen.
       *
       * If this parameter isn't specified, the default value of `discoveryName.namespace` is used.
       * If the `discoveryName` isn't specified, the port mapping name from the task definition is used
       * in `portName.namespace` .
       *
       * To avoid changing your applications in client Amazon ECS services, set this to the same
       * name that the client application uses by default. For example, a few common names are
       * `database` , `db` , or the lowercase name of a database, such as `mysql` or `redis` . For more
       * information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectclientalias.html#cfn-ecs-service-serviceconnectclientalias-dnsname)
       */
      override fun dnsName(): String? = unwrap(this).getDnsName()

      /**
       * The listening port number for the Service Connect proxy.
       *
       * This port is available inside of all of the tasks within the same namespace.
       *
       * To avoid changing your applications in client Amazon ECS services, set this to the same
       * port that the client application uses by default. For more information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectclientalias.html#cfn-ecs-service-serviceconnectclientalias-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * The configuration for test traffic routing rules used during blue/green deployments with
       * Amazon ECS Service Connect.
       *
       * This allows you to route a portion of traffic to the new service revision of your service
       * for testing before shifting all production traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectclientalias.html#cfn-ecs-service-serviceconnectclientalias-testtrafficrules)
       */
      override fun testTrafficRules(): Any? = unwrap(this).getTestTrafficRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectClientAliasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty):
          ServiceConnectClientAliasProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceConnectClientAliasProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectClientAliasProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty
    }
  }

  /**
   * The Service Connect configuration of your Amazon ECS service.
   *
   * The configuration for this service to discover and connect to services, and be discovered by,
   * and connected from, other services within a namespace.
   *
   * Tasks that run in a namespace can use short names to connect to services in the namespace.
   * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through a
   * managed proxy container that collects logs and metrics for increased visibility. Only the tasks
   * that Amazon ECS services create are supported with Service Connect. For more information, see
   * [Service
   * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceConnectConfigurationProperty serviceConnectConfigurationProperty =
   * ServiceConnectConfigurationProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .logConfiguration(LogConfigurationProperty.builder()
   * .logDriver("logDriver")
   * .options(Map.of(
   * "optionsKey", "options"))
   * .secretOptions(List.of(SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build()))
   * .build())
   * .namespace("namespace")
   * .services(List.of(ServiceConnectServiceProperty.builder()
   * .portName("portName")
   * // the properties below are optional
   * .clientAliases(List.of(ServiceConnectClientAliasProperty.builder()
   * .port(123)
   * // the properties below are optional
   * .dnsName("dnsName")
   * .testTrafficRules(ServiceConnectTestTrafficRulesProperty.builder()
   * .header(ServiceConnectTestTrafficRulesHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value(ServiceConnectTestTrafficRulesHeaderValueProperty.builder()
   * .exact("exact")
   * .build())
   * .build())
   * .build())
   * .build()))
   * .discoveryName("discoveryName")
   * .ingressPortOverride(123)
   * .timeout(TimeoutConfigurationProperty.builder()
   * .idleTimeoutSeconds(123)
   * .perRequestTimeoutSeconds(123)
   * .build())
   * .tls(ServiceConnectTlsConfigurationProperty.builder()
   * .issuerCertificateAuthority(ServiceConnectTlsCertificateAuthorityProperty.builder()
   * .awsPcaAuthorityArn("awsPcaAuthorityArn")
   * .build())
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .roleArn("roleArn")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html)
   */
  public interface ServiceConnectConfigurationProperty {
    /**
     * Specifies whether to use Service Connect with this service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html#cfn-ecs-service-serviceconnectconfiguration-enabled)
     */
    public fun enabled(): Any

    /**
     * The log configuration for the container.
     *
     * This parameter maps to `LogConfig` in the docker container create command and the
     * `--log-driver` option to docker run.
     *
     * By default, containers use the same logging driver that the Docker daemon uses. However, the
     * container might use a different logging driver than the Docker daemon by specifying a log driver
     * configuration in the container definition.
     *
     * Understand the following when specifying a log configuration for your containers.
     *
     * * Amazon ECS currently supports a subset of the logging drivers available to the Docker
     * daemon. Additional log drivers may be available in future releases of the Amazon ECS container
     * agent.
     *
     * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
     * `awsfirelens` .
     *
     * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` , `fluentd`
     * , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
     *
     * * This parameter requires version 1.18 of the Docker Remote API or greater on your container
     * instance.
     * * For tasks that are hosted on Amazon EC2 instances, the Amazon ECS container agent must
     * register the available logging drivers with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
     * variable before containers placed on that instance can use these log configuration options. For
     * more information, see [Amazon ECS container agent
     * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     * * For tasks that are on AWS Fargate , because you don't have access to the underlying
     * infrastructure your tasks are hosted on, any additional software needed must be installed
     * outside of the task. For example, the Fluentd output aggregators or a remote host running
     * Logstash to send Gelf logs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html#cfn-ecs-service-serviceconnectconfiguration-logconfiguration)
     */
    public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    /**
     * The namespace name or full Amazon Resource Name (ARN) of the AWS Cloud Map namespace for use
     * with Service Connect.
     *
     * The namespace must be in the same AWS Region as the Amazon ECS service and cluster. The type
     * of namespace doesn't affect Service Connect. For more information about AWS Cloud Map , see
     * [Working with
     * Services](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html) in the
     * *AWS Cloud Map Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html#cfn-ecs-service-serviceconnectconfiguration-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The list of Service Connect service objects.
     *
     * These are names and aliases (also known as endpoints) that are used by other Amazon ECS
     * services to connect to this service.
     *
     * This field is not required for a "client" Amazon ECS service that's a member of a namespace
     * only to connect to other services within the namespace. An example of this would be a frontend
     * application that accepts incoming requests from either a load balancer that's attached to the
     * service or by other means.
     *
     * An object selects a port from the task definition, assigns a name for the AWS Cloud Map
     * service, and a list of aliases (endpoints) and ports for client applications to refer to this
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html#cfn-ecs-service-serviceconnectconfiguration-services)
     */
    public fun services(): Any? = unwrap(this).getServices()

    /**
     * A builder for [ServiceConnectConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specifies whether to use Service Connect with this service. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether to use Service Connect with this service. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param logConfiguration The log configuration for the container.
       * This parameter maps to `LogConfig` in the docker container create command and the
       * `--log-driver` option to docker run.
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition.
       *
       * Understand the following when specifying a log configuration for your containers.
       *
       * * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon. Additional log drivers may be available in future releases of the Amazon ECS container
       * agent.
       *
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
       *
       * * This parameter requires version 1.18 of the Docker Remote API or greater on your
       * container instance.
       * * For tasks that are hosted on Amazon EC2 instances, the Amazon ECS container agent must
       * register the available logging drivers with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       * * For tasks that are on AWS Fargate , because you don't have access to the underlying
       * infrastructure your tasks are hosted on, any additional software needed must be installed
       * outside of the task. For example, the Fluentd output aggregators or a remote host running
       * Logstash to send Gelf logs to.
       */
      public fun logConfiguration(logConfiguration: IResolvable)

      /**
       * @param logConfiguration The log configuration for the container.
       * This parameter maps to `LogConfig` in the docker container create command and the
       * `--log-driver` option to docker run.
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition.
       *
       * Understand the following when specifying a log configuration for your containers.
       *
       * * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon. Additional log drivers may be available in future releases of the Amazon ECS container
       * agent.
       *
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
       *
       * * This parameter requires version 1.18 of the Docker Remote API or greater on your
       * container instance.
       * * For tasks that are hosted on Amazon EC2 instances, the Amazon ECS container agent must
       * register the available logging drivers with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       * * For tasks that are on AWS Fargate , because you don't have access to the underlying
       * infrastructure your tasks are hosted on, any additional software needed must be installed
       * outside of the task. For example, the Fluentd output aggregators or a remote host running
       * Logstash to send Gelf logs to.
       */
      public fun logConfiguration(logConfiguration: LogConfigurationProperty)

      /**
       * @param logConfiguration The log configuration for the container.
       * This parameter maps to `LogConfig` in the docker container create command and the
       * `--log-driver` option to docker run.
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition.
       *
       * Understand the following when specifying a log configuration for your containers.
       *
       * * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon. Additional log drivers may be available in future releases of the Amazon ECS container
       * agent.
       *
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
       *
       * * This parameter requires version 1.18 of the Docker Remote API or greater on your
       * container instance.
       * * For tasks that are hosted on Amazon EC2 instances, the Amazon ECS container agent must
       * register the available logging drivers with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       * * For tasks that are on AWS Fargate , because you don't have access to the underlying
       * infrastructure your tasks are hosted on, any additional software needed must be installed
       * outside of the task. For example, the Fluentd output aggregators or a remote host running
       * Logstash to send Gelf logs to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbf289910965c7adb3fb8fe199c5bdef3f31a13e658bf52d05729bf25ebd57fa")
      public fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit)

      /**
       * @param namespace The namespace name or full Amazon Resource Name (ARN) of the AWS Cloud Map
       * namespace for use with Service Connect.
       * The namespace must be in the same AWS Region as the Amazon ECS service and cluster. The
       * type of namespace doesn't affect Service Connect. For more information about AWS Cloud Map ,
       * see [Working with
       * Services](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html) in the
       * *AWS Cloud Map Developer Guide* .
       */
      public fun namespace(namespace: String)

      /**
       * @param services The list of Service Connect service objects.
       * These are names and aliases (also known as endpoints) that are used by other Amazon ECS
       * services to connect to this service.
       *
       * This field is not required for a "client" Amazon ECS service that's a member of a namespace
       * only to connect to other services within the namespace. An example of this would be a frontend
       * application that accepts incoming requests from either a load balancer that's attached to the
       * service or by other means.
       *
       * An object selects a port from the task definition, assigns a name for the AWS Cloud Map
       * service, and a list of aliases (endpoints) and ports for client applications to refer to this
       * service.
       */
      public fun services(services: IResolvable)

      /**
       * @param services The list of Service Connect service objects.
       * These are names and aliases (also known as endpoints) that are used by other Amazon ECS
       * services to connect to this service.
       *
       * This field is not required for a "client" Amazon ECS service that's a member of a namespace
       * only to connect to other services within the namespace. An example of this would be a frontend
       * application that accepts incoming requests from either a load balancer that's attached to the
       * service or by other means.
       *
       * An object selects a port from the task definition, assigns a name for the AWS Cloud Map
       * service, and a list of aliases (endpoints) and ports for client applications to refer to this
       * service.
       */
      public fun services(services: List<Any>)

      /**
       * @param services The list of Service Connect service objects.
       * These are names and aliases (also known as endpoints) that are used by other Amazon ECS
       * services to connect to this service.
       *
       * This field is not required for a "client" Amazon ECS service that's a member of a namespace
       * only to connect to other services within the namespace. An example of this would be a frontend
       * application that accepts incoming requests from either a load balancer that's attached to the
       * service or by other means.
       *
       * An object selects a port from the task definition, assigns a name for the AWS Cloud Map
       * service, and a list of aliases (endpoints) and ports for client applications to refer to this
       * service.
       */
      public fun services(vararg services: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty.builder()

      /**
       * @param enabled Specifies whether to use Service Connect with this service. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether to use Service Connect with this service. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logConfiguration The log configuration for the container.
       * This parameter maps to `LogConfig` in the docker container create command and the
       * `--log-driver` option to docker run.
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition.
       *
       * Understand the following when specifying a log configuration for your containers.
       *
       * * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon. Additional log drivers may be available in future releases of the Amazon ECS container
       * agent.
       *
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
       *
       * * This parameter requires version 1.18 of the Docker Remote API or greater on your
       * container instance.
       * * For tasks that are hosted on Amazon EC2 instances, the Amazon ECS container agent must
       * register the available logging drivers with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       * * For tasks that are on AWS Fargate , because you don't have access to the underlying
       * infrastructure your tasks are hosted on, any additional software needed must be installed
       * outside of the task. For example, the Fluentd output aggregators or a remote host running
       * Logstash to send Gelf logs to.
       */
      override fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logConfiguration The log configuration for the container.
       * This parameter maps to `LogConfig` in the docker container create command and the
       * `--log-driver` option to docker run.
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition.
       *
       * Understand the following when specifying a log configuration for your containers.
       *
       * * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon. Additional log drivers may be available in future releases of the Amazon ECS container
       * agent.
       *
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
       *
       * * This parameter requires version 1.18 of the Docker Remote API or greater on your
       * container instance.
       * * For tasks that are hosted on Amazon EC2 instances, the Amazon ECS container agent must
       * register the available logging drivers with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       * * For tasks that are on AWS Fargate , because you don't have access to the underlying
       * infrastructure your tasks are hosted on, any additional software needed must be installed
       * outside of the task. For example, the Fluentd output aggregators or a remote host running
       * Logstash to send Gelf logs to.
       */
      override fun logConfiguration(logConfiguration: LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param logConfiguration The log configuration for the container.
       * This parameter maps to `LogConfig` in the docker container create command and the
       * `--log-driver` option to docker run.
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition.
       *
       * Understand the following when specifying a log configuration for your containers.
       *
       * * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon. Additional log drivers may be available in future releases of the Amazon ECS container
       * agent.
       *
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
       *
       * * This parameter requires version 1.18 of the Docker Remote API or greater on your
       * container instance.
       * * For tasks that are hosted on Amazon EC2 instances, the Amazon ECS container agent must
       * register the available logging drivers with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       * * For tasks that are on AWS Fargate , because you don't have access to the underlying
       * infrastructure your tasks are hosted on, any additional software needed must be installed
       * outside of the task. For example, the Fluentd output aggregators or a remote host running
       * Logstash to send Gelf logs to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbf289910965c7adb3fb8fe199c5bdef3f31a13e658bf52d05729bf25ebd57fa")
      override fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit):
          Unit = logConfiguration(LogConfigurationProperty(logConfiguration))

      /**
       * @param namespace The namespace name or full Amazon Resource Name (ARN) of the AWS Cloud Map
       * namespace for use with Service Connect.
       * The namespace must be in the same AWS Region as the Amazon ECS service and cluster. The
       * type of namespace doesn't affect Service Connect. For more information about AWS Cloud Map ,
       * see [Working with
       * Services](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html) in the
       * *AWS Cloud Map Developer Guide* .
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param services The list of Service Connect service objects.
       * These are names and aliases (also known as endpoints) that are used by other Amazon ECS
       * services to connect to this service.
       *
       * This field is not required for a "client" Amazon ECS service that's a member of a namespace
       * only to connect to other services within the namespace. An example of this would be a frontend
       * application that accepts incoming requests from either a load balancer that's attached to the
       * service or by other means.
       *
       * An object selects a port from the task definition, assigns a name for the AWS Cloud Map
       * service, and a list of aliases (endpoints) and ports for client applications to refer to this
       * service.
       */
      override fun services(services: IResolvable) {
        cdkBuilder.services(services.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param services The list of Service Connect service objects.
       * These are names and aliases (also known as endpoints) that are used by other Amazon ECS
       * services to connect to this service.
       *
       * This field is not required for a "client" Amazon ECS service that's a member of a namespace
       * only to connect to other services within the namespace. An example of this would be a frontend
       * application that accepts incoming requests from either a load balancer that's attached to the
       * service or by other means.
       *
       * An object selects a port from the task definition, assigns a name for the AWS Cloud Map
       * service, and a list of aliases (endpoints) and ports for client applications to refer to this
       * service.
       */
      override fun services(services: List<Any>) {
        cdkBuilder.services(services.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param services The list of Service Connect service objects.
       * These are names and aliases (also known as endpoints) that are used by other Amazon ECS
       * services to connect to this service.
       *
       * This field is not required for a "client" Amazon ECS service that's a member of a namespace
       * only to connect to other services within the namespace. An example of this would be a frontend
       * application that accepts incoming requests from either a load balancer that's attached to the
       * service or by other means.
       *
       * An object selects a port from the task definition, assigns a name for the AWS Cloud Map
       * service, and a list of aliases (endpoints) and ports for client applications to refer to this
       * service.
       */
      override fun services(vararg services: Any): Unit = services(services.toList())

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty,
    ) : CdkObject(cdkObject),
        ServiceConnectConfigurationProperty {
      /**
       * Specifies whether to use Service Connect with this service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html#cfn-ecs-service-serviceconnectconfiguration-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The log configuration for the container.
       *
       * This parameter maps to `LogConfig` in the docker container create command and the
       * `--log-driver` option to docker run.
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition.
       *
       * Understand the following when specifying a log configuration for your containers.
       *
       * * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon. Additional log drivers may be available in future releases of the Amazon ECS container
       * agent.
       *
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `syslog` , `splunk` , and `awsfirelens` .
       *
       * * This parameter requires version 1.18 of the Docker Remote API or greater on your
       * container instance.
       * * For tasks that are hosted on Amazon EC2 instances, the Amazon ECS container agent must
       * register the available logging drivers with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS container agent
       * configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       * * For tasks that are on AWS Fargate , because you don't have access to the underlying
       * infrastructure your tasks are hosted on, any additional software needed must be installed
       * outside of the task. For example, the Fluentd output aggregators or a remote host running
       * Logstash to send Gelf logs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html#cfn-ecs-service-serviceconnectconfiguration-logconfiguration)
       */
      override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

      /**
       * The namespace name or full Amazon Resource Name (ARN) of the AWS Cloud Map namespace for
       * use with Service Connect.
       *
       * The namespace must be in the same AWS Region as the Amazon ECS service and cluster. The
       * type of namespace doesn't affect Service Connect. For more information about AWS Cloud Map ,
       * see [Working with
       * Services](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html) in the
       * *AWS Cloud Map Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html#cfn-ecs-service-serviceconnectconfiguration-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()

      /**
       * The list of Service Connect service objects.
       *
       * These are names and aliases (also known as endpoints) that are used by other Amazon ECS
       * services to connect to this service.
       *
       * This field is not required for a "client" Amazon ECS service that's a member of a namespace
       * only to connect to other services within the namespace. An example of this would be a frontend
       * application that accepts incoming requests from either a load balancer that's attached to the
       * service or by other means.
       *
       * An object selects a port from the task definition, assigns a name for the AWS Cloud Map
       * service, and a list of aliases (endpoints) and ports for client applications to refer to this
       * service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html#cfn-ecs-service-serviceconnectconfiguration-services)
       */
      override fun services(): Any? = unwrap(this).getServices()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty):
          ServiceConnectConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceConnectConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty
    }
  }

  /**
   * The Service Connect service object configuration.
   *
   * For more information, see [Service
   * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceConnectServiceProperty serviceConnectServiceProperty =
   * ServiceConnectServiceProperty.builder()
   * .portName("portName")
   * // the properties below are optional
   * .clientAliases(List.of(ServiceConnectClientAliasProperty.builder()
   * .port(123)
   * // the properties below are optional
   * .dnsName("dnsName")
   * .testTrafficRules(ServiceConnectTestTrafficRulesProperty.builder()
   * .header(ServiceConnectTestTrafficRulesHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value(ServiceConnectTestTrafficRulesHeaderValueProperty.builder()
   * .exact("exact")
   * .build())
   * .build())
   * .build())
   * .build()))
   * .discoveryName("discoveryName")
   * .ingressPortOverride(123)
   * .timeout(TimeoutConfigurationProperty.builder()
   * .idleTimeoutSeconds(123)
   * .perRequestTimeoutSeconds(123)
   * .build())
   * .tls(ServiceConnectTlsConfigurationProperty.builder()
   * .issuerCertificateAuthority(ServiceConnectTlsCertificateAuthorityProperty.builder()
   * .awsPcaAuthorityArn("awsPcaAuthorityArn")
   * .build())
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .roleArn("roleArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html)
   */
  public interface ServiceConnectServiceProperty {
    /**
     * The list of client aliases for this Service Connect service.
     *
     * You use these to assign names that can be used by client applications. The maximum number of
     * client aliases that you can have in this list is 1.
     *
     * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks
     * ("clients") can use to connect to this service.
     *
     * Each name and port mapping must be unique within the namespace.
     *
     * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one
     * `port` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-clientaliases)
     */
    public fun clientAliases(): Any? = unwrap(this).getClientAliases()

    /**
     * The `discoveryName` is the name of the new AWS Cloud Map service that Amazon ECS creates for
     * this Amazon ECS service.
     *
     * This must be unique within the AWS Cloud Map namespace. The name can contain up to 64
     * characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-).
     * The name can't start with a hyphen.
     *
     * If the `discoveryName` isn't specified, the port mapping name from the task definition is
     * used in `portName.namespace` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-discoveryname)
     */
    public fun discoveryName(): String? = unwrap(this).getDiscoveryName()

    /**
     * The port number for the Service Connect proxy to listen on.
     *
     * Use the value of this field to bypass the proxy for traffic on the port number specified in
     * the named `portMapping` in the task definition of this application, and then use it in your VPC
     * security groups to allow traffic into the proxy for this Amazon ECS service.
     *
     * In `awsvpc` mode and Fargate, the default value is the container port number. The container
     * port number is in the `portMapping` in the task definition. In bridge mode, the default value is
     * the ephemeral port of the Service Connect proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-ingressportoverride)
     */
    public fun ingressPortOverride(): Number? = unwrap(this).getIngressPortOverride()

    /**
     * The `portName` must match the name of one of the `portMappings` from all the containers in
     * the task definition of this Amazon ECS service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-portname)
     */
    public fun portName(): String

    /**
     * A reference to an object that represents the configured timeouts for Service Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-timeout)
     */
    public fun timeout(): Any? = unwrap(this).getTimeout()

    /**
     * A reference to an object that represents a Transport Layer Security (TLS) configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-tls)
     */
    public fun tls(): Any? = unwrap(this).getTls()

    /**
     * A builder for [ServiceConnectServiceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientAliases The list of client aliases for this Service Connect service.
       * You use these to assign names that can be used by client applications. The maximum number
       * of client aliases that you can have in this list is 1.
       *
       * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS
       * tasks ("clients") can use to connect to this service.
       *
       * Each name and port mapping must be unique within the namespace.
       *
       * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one
       * `port` .
       */
      public fun clientAliases(clientAliases: IResolvable)

      /**
       * @param clientAliases The list of client aliases for this Service Connect service.
       * You use these to assign names that can be used by client applications. The maximum number
       * of client aliases that you can have in this list is 1.
       *
       * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS
       * tasks ("clients") can use to connect to this service.
       *
       * Each name and port mapping must be unique within the namespace.
       *
       * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one
       * `port` .
       */
      public fun clientAliases(clientAliases: List<Any>)

      /**
       * @param clientAliases The list of client aliases for this Service Connect service.
       * You use these to assign names that can be used by client applications. The maximum number
       * of client aliases that you can have in this list is 1.
       *
       * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS
       * tasks ("clients") can use to connect to this service.
       *
       * Each name and port mapping must be unique within the namespace.
       *
       * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one
       * `port` .
       */
      public fun clientAliases(vararg clientAliases: Any)

      /**
       * @param discoveryName The `discoveryName` is the name of the new AWS Cloud Map service that
       * Amazon ECS creates for this Amazon ECS service.
       * This must be unique within the AWS Cloud Map namespace. The name can contain up to 64
       * characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-).
       * The name can't start with a hyphen.
       *
       * If the `discoveryName` isn't specified, the port mapping name from the task definition is
       * used in `portName.namespace` .
       */
      public fun discoveryName(discoveryName: String)

      /**
       * @param ingressPortOverride The port number for the Service Connect proxy to listen on.
       * Use the value of this field to bypass the proxy for traffic on the port number specified in
       * the named `portMapping` in the task definition of this application, and then use it in your
       * VPC security groups to allow traffic into the proxy for this Amazon ECS service.
       *
       * In `awsvpc` mode and Fargate, the default value is the container port number. The container
       * port number is in the `portMapping` in the task definition. In bridge mode, the default value
       * is the ephemeral port of the Service Connect proxy.
       */
      public fun ingressPortOverride(ingressPortOverride: Number)

      /**
       * @param portName The `portName` must match the name of one of the `portMappings` from all
       * the containers in the task definition of this Amazon ECS service. 
       */
      public fun portName(portName: String)

      /**
       * @param timeout A reference to an object that represents the configured timeouts for Service
       * Connect.
       */
      public fun timeout(timeout: IResolvable)

      /**
       * @param timeout A reference to an object that represents the configured timeouts for Service
       * Connect.
       */
      public fun timeout(timeout: TimeoutConfigurationProperty)

      /**
       * @param timeout A reference to an object that represents the configured timeouts for Service
       * Connect.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd6672f6cd887caf6beb473987f937d129d83a90c850ac6733330cfdcf360bb9")
      public fun timeout(timeout: TimeoutConfigurationProperty.Builder.() -> Unit)

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS)
       * configuration.
       */
      public fun tls(tls: IResolvable)

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS)
       * configuration.
       */
      public fun tls(tls: ServiceConnectTlsConfigurationProperty)

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS)
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed7373f407a897111bc9fc5ea3233167ec60d015f62c89c685d42e1a04adc986")
      public fun tls(tls: ServiceConnectTlsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty.builder()

      /**
       * @param clientAliases The list of client aliases for this Service Connect service.
       * You use these to assign names that can be used by client applications. The maximum number
       * of client aliases that you can have in this list is 1.
       *
       * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS
       * tasks ("clients") can use to connect to this service.
       *
       * Each name and port mapping must be unique within the namespace.
       *
       * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one
       * `port` .
       */
      override fun clientAliases(clientAliases: IResolvable) {
        cdkBuilder.clientAliases(clientAliases.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param clientAliases The list of client aliases for this Service Connect service.
       * You use these to assign names that can be used by client applications. The maximum number
       * of client aliases that you can have in this list is 1.
       *
       * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS
       * tasks ("clients") can use to connect to this service.
       *
       * Each name and port mapping must be unique within the namespace.
       *
       * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one
       * `port` .
       */
      override fun clientAliases(clientAliases: List<Any>) {
        cdkBuilder.clientAliases(clientAliases.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param clientAliases The list of client aliases for this Service Connect service.
       * You use these to assign names that can be used by client applications. The maximum number
       * of client aliases that you can have in this list is 1.
       *
       * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS
       * tasks ("clients") can use to connect to this service.
       *
       * Each name and port mapping must be unique within the namespace.
       *
       * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one
       * `port` .
       */
      override fun clientAliases(vararg clientAliases: Any): Unit =
          clientAliases(clientAliases.toList())

      /**
       * @param discoveryName The `discoveryName` is the name of the new AWS Cloud Map service that
       * Amazon ECS creates for this Amazon ECS service.
       * This must be unique within the AWS Cloud Map namespace. The name can contain up to 64
       * characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-).
       * The name can't start with a hyphen.
       *
       * If the `discoveryName` isn't specified, the port mapping name from the task definition is
       * used in `portName.namespace` .
       */
      override fun discoveryName(discoveryName: String) {
        cdkBuilder.discoveryName(discoveryName)
      }

      /**
       * @param ingressPortOverride The port number for the Service Connect proxy to listen on.
       * Use the value of this field to bypass the proxy for traffic on the port number specified in
       * the named `portMapping` in the task definition of this application, and then use it in your
       * VPC security groups to allow traffic into the proxy for this Amazon ECS service.
       *
       * In `awsvpc` mode and Fargate, the default value is the container port number. The container
       * port number is in the `portMapping` in the task definition. In bridge mode, the default value
       * is the ephemeral port of the Service Connect proxy.
       */
      override fun ingressPortOverride(ingressPortOverride: Number) {
        cdkBuilder.ingressPortOverride(ingressPortOverride)
      }

      /**
       * @param portName The `portName` must match the name of one of the `portMappings` from all
       * the containers in the task definition of this Amazon ECS service. 
       */
      override fun portName(portName: String) {
        cdkBuilder.portName(portName)
      }

      /**
       * @param timeout A reference to an object that represents the configured timeouts for Service
       * Connect.
       */
      override fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeout A reference to an object that represents the configured timeouts for Service
       * Connect.
       */
      override fun timeout(timeout: TimeoutConfigurationProperty) {
        cdkBuilder.timeout(timeout.let(TimeoutConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param timeout A reference to an object that represents the configured timeouts for Service
       * Connect.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd6672f6cd887caf6beb473987f937d129d83a90c850ac6733330cfdcf360bb9")
      override fun timeout(timeout: TimeoutConfigurationProperty.Builder.() -> Unit): Unit =
          timeout(TimeoutConfigurationProperty(timeout))

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS)
       * configuration.
       */
      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS)
       * configuration.
       */
      override fun tls(tls: ServiceConnectTlsConfigurationProperty) {
        cdkBuilder.tls(tls.let(ServiceConnectTlsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS)
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed7373f407a897111bc9fc5ea3233167ec60d015f62c89c685d42e1a04adc986")
      override fun tls(tls: ServiceConnectTlsConfigurationProperty.Builder.() -> Unit): Unit =
          tls(ServiceConnectTlsConfigurationProperty(tls))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty,
    ) : CdkObject(cdkObject),
        ServiceConnectServiceProperty {
      /**
       * The list of client aliases for this Service Connect service.
       *
       * You use these to assign names that can be used by client applications. The maximum number
       * of client aliases that you can have in this list is 1.
       *
       * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS
       * tasks ("clients") can use to connect to this service.
       *
       * Each name and port mapping must be unique within the namespace.
       *
       * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one
       * `port` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-clientaliases)
       */
      override fun clientAliases(): Any? = unwrap(this).getClientAliases()

      /**
       * The `discoveryName` is the name of the new AWS Cloud Map service that Amazon ECS creates
       * for this Amazon ECS service.
       *
       * This must be unique within the AWS Cloud Map namespace. The name can contain up to 64
       * characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-).
       * The name can't start with a hyphen.
       *
       * If the `discoveryName` isn't specified, the port mapping name from the task definition is
       * used in `portName.namespace` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-discoveryname)
       */
      override fun discoveryName(): String? = unwrap(this).getDiscoveryName()

      /**
       * The port number for the Service Connect proxy to listen on.
       *
       * Use the value of this field to bypass the proxy for traffic on the port number specified in
       * the named `portMapping` in the task definition of this application, and then use it in your
       * VPC security groups to allow traffic into the proxy for this Amazon ECS service.
       *
       * In `awsvpc` mode and Fargate, the default value is the container port number. The container
       * port number is in the `portMapping` in the task definition. In bridge mode, the default value
       * is the ephemeral port of the Service Connect proxy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-ingressportoverride)
       */
      override fun ingressPortOverride(): Number? = unwrap(this).getIngressPortOverride()

      /**
       * The `portName` must match the name of one of the `portMappings` from all the containers in
       * the task definition of this Amazon ECS service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-portname)
       */
      override fun portName(): String = unwrap(this).getPortName()

      /**
       * A reference to an object that represents the configured timeouts for Service Connect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-timeout)
       */
      override fun timeout(): Any? = unwrap(this).getTimeout()

      /**
       * A reference to an object that represents a Transport Layer Security (TLS) configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html#cfn-ecs-service-serviceconnectservice-tls)
       */
      override fun tls(): Any? = unwrap(this).getTls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceConnectServiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty):
          ServiceConnectServiceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceConnectServiceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectServiceProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceConnectTestTrafficRulesHeaderProperty serviceConnectTestTrafficRulesHeaderProperty =
   * ServiceConnectTestTrafficRulesHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value(ServiceConnectTestTrafficRulesHeaderValueProperty.builder()
   * .exact("exact")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrulesheader.html)
   */
  public interface ServiceConnectTestTrafficRulesHeaderProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrulesheader.html#cfn-ecs-service-serviceconnecttesttrafficrulesheader-name)
     */
    public fun name(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrulesheader.html#cfn-ecs-service-serviceconnecttesttrafficrulesheader-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * A builder for [ServiceConnectTestTrafficRulesHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name the value to be set. 
       */
      public fun name(name: String)

      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: ServiceConnectTestTrafficRulesHeaderValueProperty)

      /**
       * @param value the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ad4ddcde25908eb6d64ad4fb7e2685f67437d2de3b8710c0abb5a3e77232b6a")
      public
          fun `value`(`value`: ServiceConnectTestTrafficRulesHeaderValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderProperty.builder()

      /**
       * @param name the value to be set. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value the value to be set.
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value the value to be set.
       */
      override fun `value`(`value`: ServiceConnectTestTrafficRulesHeaderValueProperty) {
        cdkBuilder.`value`(`value`.let(ServiceConnectTestTrafficRulesHeaderValueProperty.Companion::unwrap))
      }

      /**
       * @param value the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ad4ddcde25908eb6d64ad4fb7e2685f67437d2de3b8710c0abb5a3e77232b6a")
      override
          fun `value`(`value`: ServiceConnectTestTrafficRulesHeaderValueProperty.Builder.() -> Unit):
          Unit = `value`(ServiceConnectTestTrafficRulesHeaderValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderProperty,
    ) : CdkObject(cdkObject),
        ServiceConnectTestTrafficRulesHeaderProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrulesheader.html#cfn-ecs-service-serviceconnecttesttrafficrulesheader-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrulesheader.html#cfn-ecs-service-serviceconnecttesttrafficrulesheader-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectTestTrafficRulesHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderProperty):
          ServiceConnectTestTrafficRulesHeaderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceConnectTestTrafficRulesHeaderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectTestTrafficRulesHeaderProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceConnectTestTrafficRulesHeaderValueProperty
   * serviceConnectTestTrafficRulesHeaderValueProperty =
   * ServiceConnectTestTrafficRulesHeaderValueProperty.builder()
   * .exact("exact")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrulesheadervalue.html)
   */
  public interface ServiceConnectTestTrafficRulesHeaderValueProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrulesheadervalue.html#cfn-ecs-service-serviceconnecttesttrafficrulesheadervalue-exact)
     */
    public fun exact(): String

    /**
     * A builder for [ServiceConnectTestTrafficRulesHeaderValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exact the value to be set. 
       */
      public fun exact(exact: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderValueProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderValueProperty.builder()

      /**
       * @param exact the value to be set. 
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderValueProperty,
    ) : CdkObject(cdkObject),
        ServiceConnectTestTrafficRulesHeaderValueProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrulesheadervalue.html#cfn-ecs-service-serviceconnecttesttrafficrulesheadervalue-exact)
       */
      override fun exact(): String = unwrap(this).getExact()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectTestTrafficRulesHeaderValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderValueProperty):
          ServiceConnectTestTrafficRulesHeaderValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceConnectTestTrafficRulesHeaderValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectTestTrafficRulesHeaderValueProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesHeaderValueProperty
    }
  }

  /**
   * The test traffic routing configuration for Amazon ECS blue/green deployments.
   *
   * This configuration allows you to define rules for routing specific traffic to the new service
   * revision during the deployment process, allowing for safe testing before full production traffic
   * shift.
   *
   * For more information, see [Service Connect for Amazon ECS blue/green
   * deployments](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect-blue-green.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceConnectTestTrafficRulesProperty serviceConnectTestTrafficRulesProperty =
   * ServiceConnectTestTrafficRulesProperty.builder()
   * .header(ServiceConnectTestTrafficRulesHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .value(ServiceConnectTestTrafficRulesHeaderValueProperty.builder()
   * .exact("exact")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrules.html)
   */
  public interface ServiceConnectTestTrafficRulesProperty {
    /**
     * The HTTP header-based routing rules that determine which requests should be routed to the new
     * service version during blue/green deployment testing.
     *
     * These rules provide fine-grained control over test traffic routing based on request headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrules.html#cfn-ecs-service-serviceconnecttesttrafficrules-header)
     */
    public fun `header`(): Any

    /**
     * A builder for [ServiceConnectTestTrafficRulesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param header The HTTP header-based routing rules that determine which requests should be
       * routed to the new service version during blue/green deployment testing. 
       * These rules provide fine-grained control over test traffic routing based on request
       * headers.
       */
      public fun `header`(`header`: IResolvable)

      /**
       * @param header The HTTP header-based routing rules that determine which requests should be
       * routed to the new service version during blue/green deployment testing. 
       * These rules provide fine-grained control over test traffic routing based on request
       * headers.
       */
      public fun `header`(`header`: ServiceConnectTestTrafficRulesHeaderProperty)

      /**
       * @param header The HTTP header-based routing rules that determine which requests should be
       * routed to the new service version during blue/green deployment testing. 
       * These rules provide fine-grained control over test traffic routing based on request
       * headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90b94d8120dcfc3ff046deae396a5573ed7740da84406fb8e90a1e8f04a52c7b")
      public fun `header`(`header`: ServiceConnectTestTrafficRulesHeaderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesProperty.builder()

      /**
       * @param header The HTTP header-based routing rules that determine which requests should be
       * routed to the new service version during blue/green deployment testing. 
       * These rules provide fine-grained control over test traffic routing based on request
       * headers.
       */
      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param header The HTTP header-based routing rules that determine which requests should be
       * routed to the new service version during blue/green deployment testing. 
       * These rules provide fine-grained control over test traffic routing based on request
       * headers.
       */
      override fun `header`(`header`: ServiceConnectTestTrafficRulesHeaderProperty) {
        cdkBuilder.`header`(`header`.let(ServiceConnectTestTrafficRulesHeaderProperty.Companion::unwrap))
      }

      /**
       * @param header The HTTP header-based routing rules that determine which requests should be
       * routed to the new service version during blue/green deployment testing. 
       * These rules provide fine-grained control over test traffic routing based on request
       * headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90b94d8120dcfc3ff046deae396a5573ed7740da84406fb8e90a1e8f04a52c7b")
      override
          fun `header`(`header`: ServiceConnectTestTrafficRulesHeaderProperty.Builder.() -> Unit):
          Unit = `header`(ServiceConnectTestTrafficRulesHeaderProperty(`header`))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesProperty,
    ) : CdkObject(cdkObject),
        ServiceConnectTestTrafficRulesProperty {
      /**
       * The HTTP header-based routing rules that determine which requests should be routed to the
       * new service version during blue/green deployment testing.
       *
       * These rules provide fine-grained control over test traffic routing based on request
       * headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttesttrafficrules.html#cfn-ecs-service-serviceconnecttesttrafficrules-header)
       */
      override fun `header`(): Any = unwrap(this).getHeader()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectTestTrafficRulesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesProperty):
          ServiceConnectTestTrafficRulesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceConnectTestTrafficRulesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectTestTrafficRulesProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTestTrafficRulesProperty
    }
  }

  /**
   * The certificate root authority that secures your service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceConnectTlsCertificateAuthorityProperty serviceConnectTlsCertificateAuthorityProperty =
   * ServiceConnectTlsCertificateAuthorityProperty.builder()
   * .awsPcaAuthorityArn("awsPcaAuthorityArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlscertificateauthority.html)
   */
  public interface ServiceConnectTlsCertificateAuthorityProperty {
    /**
     * The ARN of the AWS Private Certificate Authority certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlscertificateauthority.html#cfn-ecs-service-serviceconnecttlscertificateauthority-awspcaauthorityarn)
     */
    public fun awsPcaAuthorityArn(): String? = unwrap(this).getAwsPcaAuthorityArn()

    /**
     * A builder for [ServiceConnectTlsCertificateAuthorityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsPcaAuthorityArn The ARN of the AWS Private Certificate Authority certificate.
       */
      public fun awsPcaAuthorityArn(awsPcaAuthorityArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty.builder()

      /**
       * @param awsPcaAuthorityArn The ARN of the AWS Private Certificate Authority certificate.
       */
      override fun awsPcaAuthorityArn(awsPcaAuthorityArn: String) {
        cdkBuilder.awsPcaAuthorityArn(awsPcaAuthorityArn)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty,
    ) : CdkObject(cdkObject),
        ServiceConnectTlsCertificateAuthorityProperty {
      /**
       * The ARN of the AWS Private Certificate Authority certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlscertificateauthority.html#cfn-ecs-service-serviceconnecttlscertificateauthority-awspcaauthorityarn)
       */
      override fun awsPcaAuthorityArn(): String? = unwrap(this).getAwsPcaAuthorityArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectTlsCertificateAuthorityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty):
          ServiceConnectTlsCertificateAuthorityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceConnectTlsCertificateAuthorityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectTlsCertificateAuthorityProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty
    }
  }

  /**
   * The key that encrypts and decrypts your resources for Service Connect TLS.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceConnectTlsConfigurationProperty serviceConnectTlsConfigurationProperty =
   * ServiceConnectTlsConfigurationProperty.builder()
   * .issuerCertificateAuthority(ServiceConnectTlsCertificateAuthorityProperty.builder()
   * .awsPcaAuthorityArn("awsPcaAuthorityArn")
   * .build())
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlsconfiguration.html)
   */
  public interface ServiceConnectTlsConfigurationProperty {
    /**
     * The signer certificate authority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlsconfiguration.html#cfn-ecs-service-serviceconnecttlsconfiguration-issuercertificateauthority)
     */
    public fun issuerCertificateAuthority(): Any

    /**
     * The AWS Key Management Service key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlsconfiguration.html#cfn-ecs-service-serviceconnecttlsconfiguration-kmskey)
     */
    public fun kmsKey(): String? = unwrap(this).getKmsKey()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that's associated with the Service Connect
     * TLS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlsconfiguration.html#cfn-ecs-service-serviceconnecttlsconfiguration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [ServiceConnectTlsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param issuerCertificateAuthority The signer certificate authority. 
       */
      public fun issuerCertificateAuthority(issuerCertificateAuthority: IResolvable)

      /**
       * @param issuerCertificateAuthority The signer certificate authority. 
       */
      public
          fun issuerCertificateAuthority(issuerCertificateAuthority: ServiceConnectTlsCertificateAuthorityProperty)

      /**
       * @param issuerCertificateAuthority The signer certificate authority. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8917a2b4b6006ad864bec0cd56ed283602a26562436c0e7272227f1e1b93d5ed")
      public
          fun issuerCertificateAuthority(issuerCertificateAuthority: ServiceConnectTlsCertificateAuthorityProperty.Builder.() -> Unit)

      /**
       * @param kmsKey The AWS Key Management Service key.
       */
      public fun kmsKey(kmsKey: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that's associated with the
       * Service Connect TLS.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty.builder()

      /**
       * @param issuerCertificateAuthority The signer certificate authority. 
       */
      override fun issuerCertificateAuthority(issuerCertificateAuthority: IResolvable) {
        cdkBuilder.issuerCertificateAuthority(issuerCertificateAuthority.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param issuerCertificateAuthority The signer certificate authority. 
       */
      override
          fun issuerCertificateAuthority(issuerCertificateAuthority: ServiceConnectTlsCertificateAuthorityProperty) {
        cdkBuilder.issuerCertificateAuthority(issuerCertificateAuthority.let(ServiceConnectTlsCertificateAuthorityProperty.Companion::unwrap))
      }

      /**
       * @param issuerCertificateAuthority The signer certificate authority. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8917a2b4b6006ad864bec0cd56ed283602a26562436c0e7272227f1e1b93d5ed")
      override
          fun issuerCertificateAuthority(issuerCertificateAuthority: ServiceConnectTlsCertificateAuthorityProperty.Builder.() -> Unit):
          Unit =
          issuerCertificateAuthority(ServiceConnectTlsCertificateAuthorityProperty(issuerCertificateAuthority))

      /**
       * @param kmsKey The AWS Key Management Service key.
       */
      override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that's associated with the
       * Service Connect TLS.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty,
    ) : CdkObject(cdkObject),
        ServiceConnectTlsConfigurationProperty {
      /**
       * The signer certificate authority.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlsconfiguration.html#cfn-ecs-service-serviceconnecttlsconfiguration-issuercertificateauthority)
       */
      override fun issuerCertificateAuthority(): Any = unwrap(this).getIssuerCertificateAuthority()

      /**
       * The AWS Key Management Service key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlsconfiguration.html#cfn-ecs-service-serviceconnecttlsconfiguration-kmskey)
       */
      override fun kmsKey(): String? = unwrap(this).getKmsKey()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that's associated with the Service Connect
       * TLS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlsconfiguration.html#cfn-ecs-service-serviceconnecttlsconfiguration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectTlsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty):
          ServiceConnectTlsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceConnectTlsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectTlsConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty
    }
  }

  /**
   * The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf.
   *
   * These settings are used to create each Amazon EBS volume, with one volume created for each task
   * in the service. For information about the supported launch types and operating systems, see
   * [Supported operating systems and launch
   * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ebs-volumes.html#ebs-volumes-configuration)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   * Many of these parameters map 1:1 with the Amazon EBS `CreateVolume` API request parameters.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceManagedEBSVolumeConfigurationProperty serviceManagedEBSVolumeConfigurationProperty =
   * ServiceManagedEBSVolumeConfigurationProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .encrypted(false)
   * .filesystemType("filesystemType")
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .sizeInGiB(123)
   * .snapshotId("snapshotId")
   * .tagSpecifications(List.of(EBSTagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * // the properties below are optional
   * .propagateTags("propagateTags")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .throughput(123)
   * .volumeInitializationRate(123)
   * .volumeType("volumeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html)
   */
  public interface ServiceManagedEBSVolumeConfigurationProperty {
    /**
     * Indicates whether the volume should be encrypted.
     *
     * If you turn on Region-level Amazon EBS encryption by default but set this value as `false` ,
     * the setting is overridden and the volume is encrypted with the KMS key specified for Amazon EBS
     * encryption by default. This parameter maps 1:1 with the `Encrypted` parameter of the
     * [CreateVolume API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html)
     * in the *Amazon EC2 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-encrypted)
     */
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The filesystem type for the volume.
     *
     * For volumes created from a snapshot, you must specify the same filesystem type that the
     * volume was using when the snapshot was created. If there is a filesystem type mismatch, the
     * tasks will fail to start.
     *
     * The available Linux filesystem types are `ext3` , `ext4` , and `xfs` . If no value is
     * specified, the `xfs` filesystem type is used by default.
     *
     * The available Windows filesystem types are `NTFS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-filesystemtype)
     */
    public fun filesystemType(): String? = unwrap(this).getFilesystemType()

    /**
     * The number of I/O operations per second (IOPS).
     *
     * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
     * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
     * volume and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type.
     *
     * * `gp3` : 3,000 - 16,000 IOPS
     * * `io1` : 100 - 64,000 IOPS
     * * `io2` : 100 - 256,000 IOPS
     *
     * This parameter is required for `io1` and `io2` volume types. The default for `gp3` volumes is
     * `3,000 IOPS` . This parameter is not supported for `st1` , `sc1` , or `standard` volume types.
     *
     * This parameter maps 1:1 with the `Iops` parameter of the [CreateVolume
     * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
     * *Amazon EC2 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The Amazon Resource Name (ARN) identifier of the AWS Key Management Service key to use for
     * Amazon EBS encryption.
     *
     * When a key is specified using this parameter, it overrides Amazon EBS default encryption or
     * any KMS key that you specified for cluster-level managed storage encryption. This parameter maps
     * 1:1 with the `KmsKeyId` parameter of the [CreateVolume
     * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
     * *Amazon EC2 API Reference* . For more information about encrypting Amazon EBS volumes attached
     * to tasks, see [Encrypt data stored in Amazon EBS volumes attached to Amazon ECS
     * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ebs-kms-encryption.html) .
     *
     *
     * AWS authenticates the AWS Key Management Service key asynchronously. Therefore, if you
     * specify an ID, alias, or ARN that is invalid, the action can appear to complete, but eventually
     * fails.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The ARN of the IAM role to associate with this volume.
     *
     * This is the Amazon ECS infrastructure IAM role that is used to manage your AWS
     * infrastructure. We recommend using the Amazon ECS-managed
     * `AmazonECSInfrastructureRolePolicyForVolumes` IAM policy with this role. For more information,
     * see [Amazon ECS infrastructure IAM
     * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html)
     * in the *Amazon ECS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * The size of the volume in GiB.
     *
     * You must specify either a volume size or a snapshot ID. If you specify a snapshot ID, the
     * snapshot size is used for the volume size by default. You can optionally specify a volume size
     * greater than or equal to the snapshot size. This parameter maps 1:1 with the `Size` parameter of
     * the [CreateVolume
     * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
     * *Amazon EC2 API Reference* .
     *
     * The following are the supported volume size values for each volume type.
     *
     * * `gp2` and `gp3` : 1-16,384
     * * `io1` and `io2` : 4-16,384
     * * `st1` and `sc1` : 125-16,384
     * * `standard` : 1-1,024
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-sizeingib)
     */
    public fun sizeInGiB(): Number? = unwrap(this).getSizeInGiB()

    /**
     * The snapshot that Amazon ECS uses to create volumes for attachment to tasks maintained by the
     * service.
     *
     * You must specify either `snapshotId` or `sizeInGiB` in your volume configuration. This
     * parameter maps 1:1 with the `SnapshotId` parameter of the [CreateVolume
     * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
     * *Amazon EC2 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-snapshotid)
     */
    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * The tags to apply to the volume.
     *
     * Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with the
     * `TagSpecifications.N` parameter of the [CreateVolume
     * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
     * *Amazon EC2 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-tagspecifications)
     */
    public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    /**
     * The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s.
     *
     * This parameter maps 1:1 with the `Throughput` parameter of the [CreateVolume
     * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
     * *Amazon EC2 API Reference* .
     *
     *
     * This parameter is only supported for the `gp3` volume type.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The rate, in MiB/s, at which data is fetched from a snapshot of an existing EBS volume to
     * create new volumes for attachment to the tasks maintained by the service.
     *
     * This property can be specified only if you specify a `snapshotId` . For more information, see
     * [Initialize Amazon EBS
     * volumes](https://docs.aws.amazon.com/ebs/latest/userguide/initalize-volume.html) in the *Amazon
     * EBS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-volumeinitializationrate)
     */
    public fun volumeInitializationRate(): Number? = unwrap(this).getVolumeInitializationRate()

    /**
     * The volume type.
     *
     * This parameter maps 1:1 with the `VolumeType` parameter of the [CreateVolume
     * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
     * *Amazon EC2 API Reference* . For more information, see [Amazon EBS volume
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html) in the *Amazon
     * EC2 User Guide* .
     *
     * The following are the supported volume types.
     *
     * * General Purpose SSD: `gp2` | `gp3`
     * * Provisioned IOPS SSD: `io1` | `io2`
     * * Throughput Optimized HDD: `st1`
     * * Cold HDD: `sc1`
     * * Magnetic: `standard`
     *
     *
     * The magnetic volume type is not supported on Fargate.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [ServiceManagedEBSVolumeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encrypted Indicates whether the volume should be encrypted.
       * If you turn on Region-level Amazon EBS encryption by default but set this value as `false`
       * , the setting is overridden and the volume is encrypted with the KMS key specified for Amazon
       * EBS encryption by default. This parameter maps 1:1 with the `Encrypted` parameter of the
       * [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted Indicates whether the volume should be encrypted.
       * If you turn on Region-level Amazon EBS encryption by default but set this value as `false`
       * , the setting is overridden and the volume is encrypted with the KMS key specified for Amazon
       * EBS encryption by default. This parameter maps 1:1 with the `Encrypted` parameter of the
       * [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      public fun encrypted(encrypted: IResolvable)

      /**
       * @param filesystemType The filesystem type for the volume.
       * For volumes created from a snapshot, you must specify the same filesystem type that the
       * volume was using when the snapshot was created. If there is a filesystem type mismatch, the
       * tasks will fail to start.
       *
       * The available Linux filesystem types are `ext3` , `ext4` , and `xfs` . If no value is
       * specified, the `xfs` filesystem type is used by default.
       *
       * The available Windows filesystem types are `NTFS` .
       */
      public fun filesystemType(filesystemType: String)

      /**
       * @param iops The number of I/O operations per second (IOPS).
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type.
       *
       * * `gp3` : 3,000 - 16,000 IOPS
       * * `io1` : 100 - 64,000 IOPS
       * * `io2` : 100 - 256,000 IOPS
       *
       * This parameter is required for `io1` and `io2` volume types. The default for `gp3` volumes
       * is `3,000 IOPS` . This parameter is not supported for `st1` , `sc1` , or `standard` volume
       * types.
       *
       * This parameter maps 1:1 with the `Iops` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      public fun iops(iops: Number)

      /**
       * @param kmsKeyId The Amazon Resource Name (ARN) identifier of the AWS Key Management Service
       * key to use for Amazon EBS encryption.
       * When a key is specified using this parameter, it overrides Amazon EBS default encryption or
       * any KMS key that you specified for cluster-level managed storage encryption. This parameter
       * maps 1:1 with the `KmsKeyId` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* . For more information about encrypting Amazon EBS volumes attached
       * to tasks, see [Encrypt data stored in Amazon EBS volumes attached to Amazon ECS
       * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ebs-kms-encryption.html) .
       *
       *
       * AWS authenticates the AWS Key Management Service key asynchronously. Therefore, if you
       * specify an ID, alias, or ARN that is invalid, the action can appear to complete, but
       * eventually fails.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param roleArn The ARN of the IAM role to associate with this volume. 
       * This is the Amazon ECS infrastructure IAM role that is used to manage your AWS
       * infrastructure. We recommend using the Amazon ECS-managed
       * `AmazonECSInfrastructureRolePolicyForVolumes` IAM policy with this role. For more information,
       * see [Amazon ECS infrastructure IAM
       * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html)
       * in the *Amazon ECS Developer Guide* .
       */
      public fun roleArn(roleArn: String)

      /**
       * @param sizeInGiB The size of the volume in GiB.
       * You must specify either a volume size or a snapshot ID. If you specify a snapshot ID, the
       * snapshot size is used for the volume size by default. You can optionally specify a volume size
       * greater than or equal to the snapshot size. This parameter maps 1:1 with the `Size` parameter
       * of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       * The following are the supported volume size values for each volume type.
       *
       * * `gp2` and `gp3` : 1-16,384
       * * `io1` and `io2` : 4-16,384
       * * `st1` and `sc1` : 125-16,384
       * * `standard` : 1-1,024
       */
      public fun sizeInGiB(sizeInGiB: Number)

      /**
       * @param snapshotId The snapshot that Amazon ECS uses to create volumes for attachment to
       * tasks maintained by the service.
       * You must specify either `snapshotId` or `sizeInGiB` in your volume configuration. This
       * parameter maps 1:1 with the `SnapshotId` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      public fun snapshotId(snapshotId: String)

      /**
       * @param tagSpecifications The tags to apply to the volume.
       * Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with the
       * `TagSpecifications.N` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      public fun tagSpecifications(tagSpecifications: IResolvable)

      /**
       * @param tagSpecifications The tags to apply to the volume.
       * Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with the
       * `TagSpecifications.N` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      public fun tagSpecifications(tagSpecifications: List<Any>)

      /**
       * @param tagSpecifications The tags to apply to the volume.
       * Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with the
       * `TagSpecifications.N` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      public fun tagSpecifications(vararg tagSpecifications: Any)

      /**
       * @param throughput The throughput to provision for a volume, in MiB/s, with a maximum of
       * 1,000 MiB/s.
       * This parameter maps 1:1 with the `Throughput` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       *
       * This parameter is only supported for the `gp3` volume type.
       */
      public fun throughput(throughput: Number)

      /**
       * @param volumeInitializationRate The rate, in MiB/s, at which data is fetched from a
       * snapshot of an existing EBS volume to create new volumes for attachment to the tasks
       * maintained by the service.
       * This property can be specified only if you specify a `snapshotId` . For more information,
       * see [Initialize Amazon EBS
       * volumes](https://docs.aws.amazon.com/ebs/latest/userguide/initalize-volume.html) in the
       * *Amazon EBS User Guide* .
       */
      public fun volumeInitializationRate(volumeInitializationRate: Number)

      /**
       * @param volumeType The volume type.
       * This parameter maps 1:1 with the `VolumeType` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* . For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html) in the
       * *Amazon EC2 User Guide* .
       *
       * The following are the supported volume types.
       *
       * * General Purpose SSD: `gp2` | `gp3`
       * * Provisioned IOPS SSD: `io1` | `io2`
       * * Throughput Optimized HDD: `st1`
       * * Cold HDD: `sc1`
       * * Magnetic: `standard`
       *
       *
       * The magnetic volume type is not supported on Fargate.
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty.builder()

      /**
       * @param encrypted Indicates whether the volume should be encrypted.
       * If you turn on Region-level Amazon EBS encryption by default but set this value as `false`
       * , the setting is overridden and the volume is encrypted with the KMS key specified for Amazon
       * EBS encryption by default. This parameter maps 1:1 with the `Encrypted` parameter of the
       * [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted Indicates whether the volume should be encrypted.
       * If you turn on Region-level Amazon EBS encryption by default but set this value as `false`
       * , the setting is overridden and the volume is encrypted with the KMS key specified for Amazon
       * EBS encryption by default. This parameter maps 1:1 with the `Encrypted` parameter of the
       * [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filesystemType The filesystem type for the volume.
       * For volumes created from a snapshot, you must specify the same filesystem type that the
       * volume was using when the snapshot was created. If there is a filesystem type mismatch, the
       * tasks will fail to start.
       *
       * The available Linux filesystem types are `ext3` , `ext4` , and `xfs` . If no value is
       * specified, the `xfs` filesystem type is used by default.
       *
       * The available Windows filesystem types are `NTFS` .
       */
      override fun filesystemType(filesystemType: String) {
        cdkBuilder.filesystemType(filesystemType)
      }

      /**
       * @param iops The number of I/O operations per second (IOPS).
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type.
       *
       * * `gp3` : 3,000 - 16,000 IOPS
       * * `io1` : 100 - 64,000 IOPS
       * * `io2` : 100 - 256,000 IOPS
       *
       * This parameter is required for `io1` and `io2` volume types. The default for `gp3` volumes
       * is `3,000 IOPS` . This parameter is not supported for `st1` , `sc1` , or `standard` volume
       * types.
       *
       * This parameter maps 1:1 with the `Iops` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param kmsKeyId The Amazon Resource Name (ARN) identifier of the AWS Key Management Service
       * key to use for Amazon EBS encryption.
       * When a key is specified using this parameter, it overrides Amazon EBS default encryption or
       * any KMS key that you specified for cluster-level managed storage encryption. This parameter
       * maps 1:1 with the `KmsKeyId` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* . For more information about encrypting Amazon EBS volumes attached
       * to tasks, see [Encrypt data stored in Amazon EBS volumes attached to Amazon ECS
       * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ebs-kms-encryption.html) .
       *
       *
       * AWS authenticates the AWS Key Management Service key asynchronously. Therefore, if you
       * specify an ID, alias, or ARN that is invalid, the action can appear to complete, but
       * eventually fails.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param roleArn The ARN of the IAM role to associate with this volume. 
       * This is the Amazon ECS infrastructure IAM role that is used to manage your AWS
       * infrastructure. We recommend using the Amazon ECS-managed
       * `AmazonECSInfrastructureRolePolicyForVolumes` IAM policy with this role. For more information,
       * see [Amazon ECS infrastructure IAM
       * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html)
       * in the *Amazon ECS Developer Guide* .
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param sizeInGiB The size of the volume in GiB.
       * You must specify either a volume size or a snapshot ID. If you specify a snapshot ID, the
       * snapshot size is used for the volume size by default. You can optionally specify a volume size
       * greater than or equal to the snapshot size. This parameter maps 1:1 with the `Size` parameter
       * of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       * The following are the supported volume size values for each volume type.
       *
       * * `gp2` and `gp3` : 1-16,384
       * * `io1` and `io2` : 4-16,384
       * * `st1` and `sc1` : 125-16,384
       * * `standard` : 1-1,024
       */
      override fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
      }

      /**
       * @param snapshotId The snapshot that Amazon ECS uses to create volumes for attachment to
       * tasks maintained by the service.
       * You must specify either `snapshotId` or `sizeInGiB` in your volume configuration. This
       * parameter maps 1:1 with the `SnapshotId` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      /**
       * @param tagSpecifications The tags to apply to the volume.
       * Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with the
       * `TagSpecifications.N` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      override fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tagSpecifications The tags to apply to the volume.
       * Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with the
       * `TagSpecifications.N` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      override fun tagSpecifications(tagSpecifications: List<Any>) {
        cdkBuilder.tagSpecifications(tagSpecifications.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param tagSpecifications The tags to apply to the volume.
       * Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with the
       * `TagSpecifications.N` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
          tagSpecifications(tagSpecifications.toList())

      /**
       * @param throughput The throughput to provision for a volume, in MiB/s, with a maximum of
       * 1,000 MiB/s.
       * This parameter maps 1:1 with the `Throughput` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       *
       * This parameter is only supported for the `gp3` volume type.
       */
      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      /**
       * @param volumeInitializationRate The rate, in MiB/s, at which data is fetched from a
       * snapshot of an existing EBS volume to create new volumes for attachment to the tasks
       * maintained by the service.
       * This property can be specified only if you specify a `snapshotId` . For more information,
       * see [Initialize Amazon EBS
       * volumes](https://docs.aws.amazon.com/ebs/latest/userguide/initalize-volume.html) in the
       * *Amazon EBS User Guide* .
       */
      override fun volumeInitializationRate(volumeInitializationRate: Number) {
        cdkBuilder.volumeInitializationRate(volumeInitializationRate)
      }

      /**
       * @param volumeType The volume type.
       * This parameter maps 1:1 with the `VolumeType` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* . For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html) in the
       * *Amazon EC2 User Guide* .
       *
       * The following are the supported volume types.
       *
       * * General Purpose SSD: `gp2` | `gp3`
       * * Provisioned IOPS SSD: `io1` | `io2`
       * * Throughput Optimized HDD: `st1`
       * * Cold HDD: `sc1`
       * * Magnetic: `standard`
       *
       *
       * The magnetic volume type is not supported on Fargate.
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty,
    ) : CdkObject(cdkObject),
        ServiceManagedEBSVolumeConfigurationProperty {
      /**
       * Indicates whether the volume should be encrypted.
       *
       * If you turn on Region-level Amazon EBS encryption by default but set this value as `false`
       * , the setting is overridden and the volume is encrypted with the KMS key specified for Amazon
       * EBS encryption by default. This parameter maps 1:1 with the `Encrypted` parameter of the
       * [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-encrypted)
       */
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      /**
       * The filesystem type for the volume.
       *
       * For volumes created from a snapshot, you must specify the same filesystem type that the
       * volume was using when the snapshot was created. If there is a filesystem type mismatch, the
       * tasks will fail to start.
       *
       * The available Linux filesystem types are `ext3` , `ext4` , and `xfs` . If no value is
       * specified, the `xfs` filesystem type is used by default.
       *
       * The available Windows filesystem types are `NTFS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-filesystemtype)
       */
      override fun filesystemType(): String? = unwrap(this).getFilesystemType()

      /**
       * The number of I/O operations per second (IOPS).
       *
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type.
       *
       * * `gp3` : 3,000 - 16,000 IOPS
       * * `io1` : 100 - 64,000 IOPS
       * * `io2` : 100 - 256,000 IOPS
       *
       * This parameter is required for `io1` and `io2` volume types. The default for `gp3` volumes
       * is `3,000 IOPS` . This parameter is not supported for `st1` , `sc1` , or `standard` volume
       * types.
       *
       * This parameter maps 1:1 with the `Iops` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The Amazon Resource Name (ARN) identifier of the AWS Key Management Service key to use for
       * Amazon EBS encryption.
       *
       * When a key is specified using this parameter, it overrides Amazon EBS default encryption or
       * any KMS key that you specified for cluster-level managed storage encryption. This parameter
       * maps 1:1 with the `KmsKeyId` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* . For more information about encrypting Amazon EBS volumes attached
       * to tasks, see [Encrypt data stored in Amazon EBS volumes attached to Amazon ECS
       * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ebs-kms-encryption.html) .
       *
       *
       * AWS authenticates the AWS Key Management Service key asynchronously. Therefore, if you
       * specify an ID, alias, or ARN that is invalid, the action can appear to complete, but
       * eventually fails.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The ARN of the IAM role to associate with this volume.
       *
       * This is the Amazon ECS infrastructure IAM role that is used to manage your AWS
       * infrastructure. We recommend using the Amazon ECS-managed
       * `AmazonECSInfrastructureRolePolicyForVolumes` IAM policy with this role. For more information,
       * see [Amazon ECS infrastructure IAM
       * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html)
       * in the *Amazon ECS Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The size of the volume in GiB.
       *
       * You must specify either a volume size or a snapshot ID. If you specify a snapshot ID, the
       * snapshot size is used for the volume size by default. You can optionally specify a volume size
       * greater than or equal to the snapshot size. This parameter maps 1:1 with the `Size` parameter
       * of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       * The following are the supported volume size values for each volume type.
       *
       * * `gp2` and `gp3` : 1-16,384
       * * `io1` and `io2` : 4-16,384
       * * `st1` and `sc1` : 125-16,384
       * * `standard` : 1-1,024
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-sizeingib)
       */
      override fun sizeInGiB(): Number? = unwrap(this).getSizeInGiB()

      /**
       * The snapshot that Amazon ECS uses to create volumes for attachment to tasks maintained by
       * the service.
       *
       * You must specify either `snapshotId` or `sizeInGiB` in your volume configuration. This
       * parameter maps 1:1 with the `SnapshotId` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-snapshotid)
       */
      override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      /**
       * The tags to apply to the volume.
       *
       * Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with the
       * `TagSpecifications.N` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-tagspecifications)
       */
      override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

      /**
       * The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s.
       *
       * This parameter maps 1:1 with the `Throughput` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       *
       * This parameter is only supported for the `gp3` volume type.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()

      /**
       * The rate, in MiB/s, at which data is fetched from a snapshot of an existing EBS volume to
       * create new volumes for attachment to the tasks maintained by the service.
       *
       * This property can be specified only if you specify a `snapshotId` . For more information,
       * see [Initialize Amazon EBS
       * volumes](https://docs.aws.amazon.com/ebs/latest/userguide/initalize-volume.html) in the
       * *Amazon EBS User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-volumeinitializationrate)
       */
      override fun volumeInitializationRate(): Number? = unwrap(this).getVolumeInitializationRate()

      /**
       * The volume type.
       *
       * This parameter maps 1:1 with the `VolumeType` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* . For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html) in the
       * *Amazon EC2 User Guide* .
       *
       * The following are the supported volume types.
       *
       * * General Purpose SSD: `gp2` | `gp3`
       * * Provisioned IOPS SSD: `io1` | `io2`
       * * Throughput Optimized HDD: `st1`
       * * Cold HDD: `sc1`
       * * Magnetic: `standard`
       *
       *
       * The magnetic volume type is not supported on Fargate.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-volumetype)
       */
      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceManagedEBSVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty):
          ServiceManagedEBSVolumeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceManagedEBSVolumeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceManagedEBSVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty
    }
  }

  /**
   * The details for the service registry.
   *
   * Each service may be associated with one service registry. Multiple service registries for each
   * service are not supported.
   *
   * When you add, update, or remove the service registries configuration, Amazon ECS starts a new
   * deployment. New tasks are registered and deregistered to the updated service registry
   * configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceRegistryProperty serviceRegistryProperty = ServiceRegistryProperty.builder()
   * .containerName("containerName")
   * .containerPort(123)
   * .port(123)
   * .registryArn("registryArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html)
   */
  public interface ServiceRegistryProperty {
    /**
     * The container name value to be used for your service discovery service.
     *
     * It's already specified in the task definition. If the task definition that your service task
     * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
     * `containerPort` combination from the task definition. If the task definition that your service
     * task specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must
     * specify either a `containerName` and `containerPort` combination or a `port` value. However, you
     * can't specify both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containername)
     */
    public fun containerName(): String? = unwrap(this).getContainerName()

    /**
     * The port value to be used for your service discovery service.
     *
     * It's already specified in the task definition. If the task definition your service task
     * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
     * `containerPort` combination from the task definition. If the task definition your service task
     * specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must specify
     * either a `containerName` and `containerPort` combination or a `port` value. However, you can't
     * specify both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containerport)
     */
    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    /**
     * The port value used if your service discovery service specified an SRV record.
     *
     * This field might be used if both the `awsvpc` network mode and SRV records are used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The Amazon Resource Name (ARN) of the service registry.
     *
     * The currently supported service registry is AWS Cloud Map . For more information, see
     * [CreateService](https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-registryarn)
     */
    public fun registryArn(): String? = unwrap(this).getRegistryArn()

    /**
     * A builder for [ServiceRegistryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerName The container name value to be used for your service discovery
       * service.
       * It's already specified in the task definition. If the task definition that your service
       * task specifies uses the `bridge` or `host` network mode, you must specify a `containerName`
       * and `containerPort` combination from the task definition. If the task definition that your
       * service task specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you
       * must specify either a `containerName` and `containerPort` combination or a `port` value.
       * However, you can't specify both.
       */
      public fun containerName(containerName: String)

      /**
       * @param containerPort The port value to be used for your service discovery service.
       * It's already specified in the task definition. If the task definition your service task
       * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
       * `containerPort` combination from the task definition. If the task definition your service task
       * specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must specify
       * either a `containerName` and `containerPort` combination or a `port` value. However, you can't
       * specify both.
       */
      public fun containerPort(containerPort: Number)

      /**
       * @param port The port value used if your service discovery service specified an SRV record.
       * This field might be used if both the `awsvpc` network mode and SRV records are used.
       */
      public fun port(port: Number)

      /**
       * @param registryArn The Amazon Resource Name (ARN) of the service registry.
       * The currently supported service registry is AWS Cloud Map . For more information, see
       * [CreateService](https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html) .
       */
      public fun registryArn(registryArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.builder()

      /**
       * @param containerName The container name value to be used for your service discovery
       * service.
       * It's already specified in the task definition. If the task definition that your service
       * task specifies uses the `bridge` or `host` network mode, you must specify a `containerName`
       * and `containerPort` combination from the task definition. If the task definition that your
       * service task specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you
       * must specify either a `containerName` and `containerPort` combination or a `port` value.
       * However, you can't specify both.
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      /**
       * @param containerPort The port value to be used for your service discovery service.
       * It's already specified in the task definition. If the task definition your service task
       * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
       * `containerPort` combination from the task definition. If the task definition your service task
       * specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must specify
       * either a `containerName` and `containerPort` combination or a `port` value. However, you can't
       * specify both.
       */
      override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      /**
       * @param port The port value used if your service discovery service specified an SRV record.
       * This field might be used if both the `awsvpc` network mode and SRV records are used.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param registryArn The Amazon Resource Name (ARN) of the service registry.
       * The currently supported service registry is AWS Cloud Map . For more information, see
       * [CreateService](https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html) .
       */
      override fun registryArn(registryArn: String) {
        cdkBuilder.registryArn(registryArn)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty,
    ) : CdkObject(cdkObject),
        ServiceRegistryProperty {
      /**
       * The container name value to be used for your service discovery service.
       *
       * It's already specified in the task definition. If the task definition that your service
       * task specifies uses the `bridge` or `host` network mode, you must specify a `containerName`
       * and `containerPort` combination from the task definition. If the task definition that your
       * service task specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you
       * must specify either a `containerName` and `containerPort` combination or a `port` value.
       * However, you can't specify both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containername)
       */
      override fun containerName(): String? = unwrap(this).getContainerName()

      /**
       * The port value to be used for your service discovery service.
       *
       * It's already specified in the task definition. If the task definition your service task
       * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
       * `containerPort` combination from the task definition. If the task definition your service task
       * specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must specify
       * either a `containerName` and `containerPort` combination or a `port` value. However, you can't
       * specify both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containerport)
       */
      override fun containerPort(): Number? = unwrap(this).getContainerPort()

      /**
       * The port value used if your service discovery service specified an SRV record.
       *
       * This field might be used if both the `awsvpc` network mode and SRV records are used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The Amazon Resource Name (ARN) of the service registry.
       *
       * The currently supported service registry is AWS Cloud Map . For more information, see
       * [CreateService](https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-registryarn)
       */
      override fun registryArn(): String? = unwrap(this).getRegistryArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceRegistryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty):
          ServiceRegistryProperty = CdkObjectWrappers.wrap(cdkObject) as? ServiceRegistryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceRegistryProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty
    }
  }

  /**
   * The configuration for a volume specified in the task definition as a volume that is configured
   * at launch time.
   *
   * Currently, the only supported volume type is an Amazon EBS volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceVolumeConfigurationProperty serviceVolumeConfigurationProperty =
   * ServiceVolumeConfigurationProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .managedEbsVolume(ServiceManagedEBSVolumeConfigurationProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .encrypted(false)
   * .filesystemType("filesystemType")
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .sizeInGiB(123)
   * .snapshotId("snapshotId")
   * .tagSpecifications(List.of(EBSTagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * // the properties below are optional
   * .propagateTags("propagateTags")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .throughput(123)
   * .volumeInitializationRate(123)
   * .volumeType("volumeType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicevolumeconfiguration.html)
   */
  public interface ServiceVolumeConfigurationProperty {
    /**
     * The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your
     * behalf.
     *
     * These settings are used to create each Amazon EBS volume, with one volume created for each
     * task in the service. The Amazon EBS volumes are visible in your account in the Amazon EC2
     * console once they are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicevolumeconfiguration.html#cfn-ecs-service-servicevolumeconfiguration-managedebsvolume)
     */
    public fun managedEbsVolume(): Any? = unwrap(this).getManagedEbsVolume()

    /**
     * The name of the volume.
     *
     * This value must match the volume name from the `Volume` object in the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicevolumeconfiguration.html#cfn-ecs-service-servicevolumeconfiguration-name)
     */
    public fun name(): String

    /**
     * A builder for [ServiceVolumeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param managedEbsVolume The configuration for the Amazon EBS volume that Amazon ECS creates
       * and manages on your behalf.
       * These settings are used to create each Amazon EBS volume, with one volume created for each
       * task in the service. The Amazon EBS volumes are visible in your account in the Amazon EC2
       * console once they are created.
       */
      public fun managedEbsVolume(managedEbsVolume: IResolvable)

      /**
       * @param managedEbsVolume The configuration for the Amazon EBS volume that Amazon ECS creates
       * and manages on your behalf.
       * These settings are used to create each Amazon EBS volume, with one volume created for each
       * task in the service. The Amazon EBS volumes are visible in your account in the Amazon EC2
       * console once they are created.
       */
      public fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfigurationProperty)

      /**
       * @param managedEbsVolume The configuration for the Amazon EBS volume that Amazon ECS creates
       * and manages on your behalf.
       * These settings are used to create each Amazon EBS volume, with one volume created for each
       * task in the service. The Amazon EBS volumes are visible in your account in the Amazon EC2
       * console once they are created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf7d3181315d7869494ee47e09feeb88be280000fcea7b0feeb1335613f1eb1f")
      public
          fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param name The name of the volume. 
       * This value must match the volume name from the `Volume` object in the task definition.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty.builder()

      /**
       * @param managedEbsVolume The configuration for the Amazon EBS volume that Amazon ECS creates
       * and manages on your behalf.
       * These settings are used to create each Amazon EBS volume, with one volume created for each
       * task in the service. The Amazon EBS volumes are visible in your account in the Amazon EC2
       * console once they are created.
       */
      override fun managedEbsVolume(managedEbsVolume: IResolvable) {
        cdkBuilder.managedEbsVolume(managedEbsVolume.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param managedEbsVolume The configuration for the Amazon EBS volume that Amazon ECS creates
       * and manages on your behalf.
       * These settings are used to create each Amazon EBS volume, with one volume created for each
       * task in the service. The Amazon EBS volumes are visible in your account in the Amazon EC2
       * console once they are created.
       */
      override
          fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfigurationProperty) {
        cdkBuilder.managedEbsVolume(managedEbsVolume.let(ServiceManagedEBSVolumeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param managedEbsVolume The configuration for the Amazon EBS volume that Amazon ECS creates
       * and manages on your behalf.
       * These settings are used to create each Amazon EBS volume, with one volume created for each
       * task in the service. The Amazon EBS volumes are visible in your account in the Amazon EC2
       * console once they are created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf7d3181315d7869494ee47e09feeb88be280000fcea7b0feeb1335613f1eb1f")
      override
          fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfigurationProperty.Builder.() -> Unit):
          Unit = managedEbsVolume(ServiceManagedEBSVolumeConfigurationProperty(managedEbsVolume))

      /**
       * @param name The name of the volume. 
       * This value must match the volume name from the `Volume` object in the task definition.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty,
    ) : CdkObject(cdkObject),
        ServiceVolumeConfigurationProperty {
      /**
       * The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your
       * behalf.
       *
       * These settings are used to create each Amazon EBS volume, with one volume created for each
       * task in the service. The Amazon EBS volumes are visible in your account in the Amazon EC2
       * console once they are created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicevolumeconfiguration.html#cfn-ecs-service-servicevolumeconfiguration-managedebsvolume)
       */
      override fun managedEbsVolume(): Any? = unwrap(this).getManagedEbsVolume()

      /**
       * The name of the volume.
       *
       * This value must match the volume name from the `Volume` object in the task definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicevolumeconfiguration.html#cfn-ecs-service-servicevolumeconfiguration-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty):
          ServiceVolumeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceVolumeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty
    }
  }

  /**
   * An object that represents the timeout configurations for Service Connect.
   *
   *
   * If `idleTimeout` is set to a time that is less than `perRequestTimeout` , the connection will
   * close when the `idleTimeout` is reached and not the `perRequestTimeout` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * TimeoutConfigurationProperty timeoutConfigurationProperty =
   * TimeoutConfigurationProperty.builder()
   * .idleTimeoutSeconds(123)
   * .perRequestTimeoutSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-timeoutconfiguration.html)
   */
  public interface TimeoutConfigurationProperty {
    /**
     * The amount of time in seconds a connection will stay active while idle.
     *
     * A value of `0` can be set to disable `idleTimeout` .
     *
     * The `idleTimeout` default for `HTTP` / `HTTP2` / `GRPC` is 5 minutes.
     *
     * The `idleTimeout` default for `TCP` is 1 hour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-timeoutconfiguration.html#cfn-ecs-service-timeoutconfiguration-idletimeoutseconds)
     */
    public fun idleTimeoutSeconds(): Number? = unwrap(this).getIdleTimeoutSeconds()

    /**
     * The amount of time waiting for the upstream to respond with a complete response per request.
     *
     * A value of `0` can be set to disable `perRequestTimeout` . `perRequestTimeout` can only be
     * set if Service Connect `appProtocol` isn't `TCP` . Only `idleTimeout` is allowed for `TCP`
     * `appProtocol` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-timeoutconfiguration.html#cfn-ecs-service-timeoutconfiguration-perrequesttimeoutseconds)
     */
    public fun perRequestTimeoutSeconds(): Number? = unwrap(this).getPerRequestTimeoutSeconds()

    /**
     * A builder for [TimeoutConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idleTimeoutSeconds The amount of time in seconds a connection will stay active while
       * idle.
       * A value of `0` can be set to disable `idleTimeout` .
       *
       * The `idleTimeout` default for `HTTP` / `HTTP2` / `GRPC` is 5 minutes.
       *
       * The `idleTimeout` default for `TCP` is 1 hour.
       */
      public fun idleTimeoutSeconds(idleTimeoutSeconds: Number)

      /**
       * @param perRequestTimeoutSeconds The amount of time waiting for the upstream to respond with
       * a complete response per request.
       * A value of `0` can be set to disable `perRequestTimeout` . `perRequestTimeout` can only be
       * set if Service Connect `appProtocol` isn't `TCP` . Only `idleTimeout` is allowed for `TCP`
       * `appProtocol` .
       */
      public fun perRequestTimeoutSeconds(perRequestTimeoutSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty.builder()

      /**
       * @param idleTimeoutSeconds The amount of time in seconds a connection will stay active while
       * idle.
       * A value of `0` can be set to disable `idleTimeout` .
       *
       * The `idleTimeout` default for `HTTP` / `HTTP2` / `GRPC` is 5 minutes.
       *
       * The `idleTimeout` default for `TCP` is 1 hour.
       */
      override fun idleTimeoutSeconds(idleTimeoutSeconds: Number) {
        cdkBuilder.idleTimeoutSeconds(idleTimeoutSeconds)
      }

      /**
       * @param perRequestTimeoutSeconds The amount of time waiting for the upstream to respond with
       * a complete response per request.
       * A value of `0` can be set to disable `perRequestTimeout` . `perRequestTimeout` can only be
       * set if Service Connect `appProtocol` isn't `TCP` . Only `idleTimeout` is allowed for `TCP`
       * `appProtocol` .
       */
      override fun perRequestTimeoutSeconds(perRequestTimeoutSeconds: Number) {
        cdkBuilder.perRequestTimeoutSeconds(perRequestTimeoutSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty,
    ) : CdkObject(cdkObject),
        TimeoutConfigurationProperty {
      /**
       * The amount of time in seconds a connection will stay active while idle.
       *
       * A value of `0` can be set to disable `idleTimeout` .
       *
       * The `idleTimeout` default for `HTTP` / `HTTP2` / `GRPC` is 5 minutes.
       *
       * The `idleTimeout` default for `TCP` is 1 hour.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-timeoutconfiguration.html#cfn-ecs-service-timeoutconfiguration-idletimeoutseconds)
       */
      override fun idleTimeoutSeconds(): Number? = unwrap(this).getIdleTimeoutSeconds()

      /**
       * The amount of time waiting for the upstream to respond with a complete response per
       * request.
       *
       * A value of `0` can be set to disable `perRequestTimeout` . `perRequestTimeout` can only be
       * set if Service Connect `appProtocol` isn't `TCP` . Only `idleTimeout` is allowed for `TCP`
       * `appProtocol` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-timeoutconfiguration.html#cfn-ecs-service-timeoutconfiguration-perrequesttimeoutseconds)
       */
      override fun perRequestTimeoutSeconds(): Number? = unwrap(this).getPerRequestTimeoutSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeoutConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty):
          TimeoutConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TimeoutConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeoutConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty
    }
  }

  /**
   * The VPC Lattice configuration for your service that holds the information for the target
   * group(s) Amazon ECS tasks will be registered to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * VpcLatticeConfigurationProperty vpcLatticeConfigurationProperty =
   * VpcLatticeConfigurationProperty.builder()
   * .portName("portName")
   * .roleArn("roleArn")
   * .targetGroupArn("targetGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-vpclatticeconfiguration.html)
   */
  public interface VpcLatticeConfigurationProperty {
    /**
     * The name of the port mapping to register in the VPC Lattice target group.
     *
     * This is the name of the `portMapping` you defined in your task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-vpclatticeconfiguration.html#cfn-ecs-service-vpclatticeconfiguration-portname)
     */
    public fun portName(): String

    /**
     * The ARN of the IAM role to associate with this VPC Lattice configuration.
     *
     * This is the Amazon ECS infrastructure IAM role that is used to manage your VPC Lattice
     * infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-vpclatticeconfiguration.html#cfn-ecs-service-vpclatticeconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * The full Amazon Resource Name (ARN) of the target group or groups associated with the VPC
     * Lattice configuration that the Amazon ECS tasks will be registered to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-vpclatticeconfiguration.html#cfn-ecs-service-vpclatticeconfiguration-targetgrouparn)
     */
    public fun targetGroupArn(): String

    /**
     * A builder for [VpcLatticeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param portName The name of the port mapping to register in the VPC Lattice target group. 
       * This is the name of the `portMapping` you defined in your task definition.
       */
      public fun portName(portName: String)

      /**
       * @param roleArn The ARN of the IAM role to associate with this VPC Lattice configuration. 
       * This is the Amazon ECS infrastructure IAM role that is used to manage your VPC Lattice
       * infrastructure.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param targetGroupArn The full Amazon Resource Name (ARN) of the target group or groups
       * associated with the VPC Lattice configuration that the Amazon ECS tasks will be registered to.
       * 
       */
      public fun targetGroupArn(targetGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.VpcLatticeConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.VpcLatticeConfigurationProperty.builder()

      /**
       * @param portName The name of the port mapping to register in the VPC Lattice target group. 
       * This is the name of the `portMapping` you defined in your task definition.
       */
      override fun portName(portName: String) {
        cdkBuilder.portName(portName)
      }

      /**
       * @param roleArn The ARN of the IAM role to associate with this VPC Lattice configuration. 
       * This is the Amazon ECS infrastructure IAM role that is used to manage your VPC Lattice
       * infrastructure.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param targetGroupArn The full Amazon Resource Name (ARN) of the target group or groups
       * associated with the VPC Lattice configuration that the Amazon ECS tasks will be registered to.
       * 
       */
      override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.VpcLatticeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecs.CfnService.VpcLatticeConfigurationProperty,
    ) : CdkObject(cdkObject),
        VpcLatticeConfigurationProperty {
      /**
       * The name of the port mapping to register in the VPC Lattice target group.
       *
       * This is the name of the `portMapping` you defined in your task definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-vpclatticeconfiguration.html#cfn-ecs-service-vpclatticeconfiguration-portname)
       */
      override fun portName(): String = unwrap(this).getPortName()

      /**
       * The ARN of the IAM role to associate with this VPC Lattice configuration.
       *
       * This is the Amazon ECS infrastructure IAM role that is used to manage your VPC Lattice
       * infrastructure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-vpclatticeconfiguration.html#cfn-ecs-service-vpclatticeconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The full Amazon Resource Name (ARN) of the target group or groups associated with the VPC
       * Lattice configuration that the Amazon ECS tasks will be registered to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-vpclatticeconfiguration.html#cfn-ecs-service-vpclatticeconfiguration-targetgrouparn)
       */
      override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcLatticeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.VpcLatticeConfigurationProperty):
          VpcLatticeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcLatticeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcLatticeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.VpcLatticeConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.VpcLatticeConfigurationProperty
    }
  }
}
