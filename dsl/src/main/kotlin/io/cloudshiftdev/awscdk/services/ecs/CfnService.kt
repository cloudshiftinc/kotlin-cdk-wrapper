package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnService internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CfnService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The name of the Amazon ECS service, such as `sample-webapp` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Not currently supported in AWS CloudFormation .
   */
  public open fun attrServiceArn(): String = unwrap(this).getAttrServiceArn()

  /**
   * The capacity provider strategy to use for the service.
   */
  public open fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

  /**
   * The capacity provider strategy to use for the service.
   */
  public open fun capacityProviderStrategy(`value`: IResolvable) {
    unwrap(this).setCapacityProviderStrategy(`value`.let(IResolvable::unwrap))
  }

  /**
   * The capacity provider strategy to use for the service.
   */
  public open fun capacityProviderStrategy(__idx_ac66f0: List<Any>) {
    unwrap(this).setCapacityProviderStrategy(__idx_ac66f0)
  }

  /**
   * The capacity provider strategy to use for the service.
   */
  public open fun capacityProviderStrategy(vararg __idx_ac66f0: Any): Unit =
      capacityProviderStrategy(__idx_ac66f0.toList())

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
    unwrap(this).setDeploymentConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Optional deployment parameters that control how many tasks run during the deployment and the
   * ordering of stopping and starting tasks.
   */
  public open fun deploymentConfiguration(`value`: DeploymentConfigurationProperty) {
    unwrap(this).setDeploymentConfiguration(`value`.let(DeploymentConfigurationProperty::unwrap))
  }

  /**
   * Optional deployment parameters that control how many tasks run during the deployment and the
   * ordering of stopping and starting tasks.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setDeploymentController(`value`.let(IResolvable::unwrap))
  }

  /**
   * The deployment controller to use for the service.
   */
  public open fun deploymentController(`value`: DeploymentControllerProperty) {
    unwrap(this).setDeploymentController(`value`.let(DeploymentControllerProperty::unwrap))
  }

  /**
   * The deployment controller to use for the service.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setEnableEcsManagedTags(`value`.let(IResolvable::unwrap))
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
    unwrap(this).setEnableExecuteCommand(`value`.let(IResolvable::unwrap))
  }

  /**
   * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic
   * Load Balancing target health checks after a task has first started.
   */
  public open fun healthCheckGracePeriodSeconds(): Number? =
      unwrap(this).getHealthCheckGracePeriodSeconds()

  /**
   * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic
   * Load Balancing target health checks after a task has first started.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    unwrap(this).setLoadBalancers(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of load balancer objects to associate with the service.
   */
  public open fun loadBalancers(__idx_ac66f0: List<Any>) {
    unwrap(this).setLoadBalancers(__idx_ac66f0)
  }

  /**
   * A list of load balancer objects to associate with the service.
   */
  public open fun loadBalancers(vararg __idx_ac66f0: Any): Unit =
      loadBalancers(__idx_ac66f0.toList())

  /**
   * The network configuration for the service.
   */
  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The network configuration for the service.
   */
  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The network configuration for the service.
   */
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  /**
   * The network configuration for the service.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setPlacementConstraints(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of placement constraint objects to use for tasks in your service.
   */
  public open fun placementConstraints(__idx_ac66f0: List<Any>) {
    unwrap(this).setPlacementConstraints(__idx_ac66f0)
  }

  /**
   * An array of placement constraint objects to use for tasks in your service.
   */
  public open fun placementConstraints(vararg __idx_ac66f0: Any): Unit =
      placementConstraints(__idx_ac66f0.toList())

  /**
   * The placement strategy objects to use for tasks in your service.
   */
  public open fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

  /**
   * The placement strategy objects to use for tasks in your service.
   */
  public open fun placementStrategies(`value`: IResolvable) {
    unwrap(this).setPlacementStrategies(`value`.let(IResolvable::unwrap))
  }

  /**
   * The placement strategy objects to use for tasks in your service.
   */
  public open fun placementStrategies(__idx_ac66f0: List<Any>) {
    unwrap(this).setPlacementStrategies(__idx_ac66f0)
  }

  /**
   * The placement strategy objects to use for tasks in your service.
   */
  public open fun placementStrategies(vararg __idx_ac66f0: Any): Unit =
      placementStrategies(__idx_ac66f0.toList())

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
    unwrap(this).setServiceConnectConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for this service to discover and connect to services, and be discovered by,
   * and connected from, other services within a namespace.
   */
  public open fun serviceConnectConfiguration(`value`: ServiceConnectConfigurationProperty) {
    unwrap(this).setServiceConnectConfiguration(`value`.let(ServiceConnectConfigurationProperty::unwrap))
  }

  /**
   * The configuration for this service to discover and connect to services, and be discovered by,
   * and connected from, other services within a namespace.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setServiceRegistries(`value`.let(IResolvable::unwrap))
  }

  /**
   * The details of the service discovery registry to associate with this service.
   *
   * For more information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   */
  public open fun serviceRegistries(__idx_ac66f0: List<Any>) {
    unwrap(this).setServiceRegistries(__idx_ac66f0)
  }

  /**
   * The details of the service discovery registry to associate with this service.
   *
   * For more information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   */
  public open fun serviceRegistries(vararg __idx_ac66f0: Any): Unit =
      serviceRegistries(__idx_ac66f0.toList())

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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
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
    unwrap(this).setVolumeConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for a volume specified in the task definition as a volume that is configured
   * at launch time.
   */
  public open fun volumeConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setVolumeConfigurations(__idx_ac66f0)
  }

  /**
   * The configuration for a volume specified in the task definition as a volume that is configured
   * at launch time.
   */
  public open fun volumeConfigurations(vararg __idx_ac66f0: Any): Unit =
      volumeConfigurations(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.CfnService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
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
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
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
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f7f500796fe4c3ab47a3c118d841c158ff96d81e6318935b8e1e8afc87b38d")
    public
        fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty.Builder.() -> Unit)

    /**
     * The deployment controller to use for the service.
     *
     * If no deployment controller is specified, the default value of `ECS` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    public fun deploymentController(deploymentController: IResolvable)

    /**
     * The deployment controller to use for the service.
     *
     * If no deployment controller is specified, the default value of `ECS` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    public fun deploymentController(deploymentController: DeploymentControllerProperty)

    /**
     * The deployment controller to use for the service.
     *
     * If no deployment controller is specified, the default value of `ECS` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
     * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
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
     * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
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
     * Elastic Load Balancing target health checks after a task has first started.
     *
     * This is only used when your service is configured to use a load balancer. If your service has
     * a load balancer defined and you don't specify a health check grace period value, the default
     * value of `0` is used.
     *
     * If you do not use an Elastic Load Balancing, we recommend that you use the `startPeriod` in
     * the task definition health check parameters. For more information, see [Health
     * check](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_HealthCheck.html) .
     *
     * If your service's tasks take a while to start and respond to Elastic Load Balancing health
     * checks, you can specify a health check grace period of up to 2,147,483,647 seconds (about 69
     * years). During that time, the Amazon ECS service scheduler ignores health check status. This
     * grace period can prevent the service scheduler from marking tasks as unhealthy and stopping them
     * before they have time to come up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds)
     * @param healthCheckGracePeriodSeconds The period of time, in seconds, that the Amazon ECS
     * service scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has
     * first started. 
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3e8f28a5d18a781ff0151bbb8080c6fd56de0bfe6fcbb47c9c3ef7a8e9fa896")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     * @param placementStrategies The placement strategy objects to use for tasks in your service. 
     */
    public fun placementStrategies(placementStrategies: IResolvable)

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
     * each service isn't supported.
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
     * each service isn't supported.
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
     * each service isn't supported.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time. 
     */
    public fun volumeConfigurations(vararg volumeConfigurations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnService.Builder =
        software.amazon.awscdk.services.ecs.CfnService.Builder.create(scope, id)

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     * @param capacityProviderStrategy The capacity provider strategy to use for the service. 
     */
    override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable::unwrap))
    }

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     * @param capacityProviderStrategy The capacity provider strategy to use for the service. 
     */
    override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
    }

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
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
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(IResolvable::unwrap))
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
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(DeploymentConfigurationProperty::unwrap))
    }

    /**
     * Optional deployment parameters that control how many tasks run during the deployment and the
     * ordering of stopping and starting tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f7f500796fe4c3ab47a3c118d841c158ff96d81e6318935b8e1e8afc87b38d")
    override
        fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty.Builder.() -> Unit):
        Unit = deploymentConfiguration(DeploymentConfigurationProperty(deploymentConfiguration))

    /**
     * The deployment controller to use for the service.
     *
     * If no deployment controller is specified, the default value of `ECS` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    override fun deploymentController(deploymentController: IResolvable) {
      cdkBuilder.deploymentController(deploymentController.let(IResolvable::unwrap))
    }

    /**
     * The deployment controller to use for the service.
     *
     * If no deployment controller is specified, the default value of `ECS` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    override fun deploymentController(deploymentController: DeploymentControllerProperty) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentControllerProperty::unwrap))
    }

    /**
     * The deployment controller to use for the service.
     *
     * If no deployment controller is specified, the default value of `ECS` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     * @param deploymentController The deployment controller to use for the service. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
     * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
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
     * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags)
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     * tasks within the service. 
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable::unwrap))
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
      cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable::unwrap))
    }

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks after a task has first started.
     *
     * This is only used when your service is configured to use a load balancer. If your service has
     * a load balancer defined and you don't specify a health check grace period value, the default
     * value of `0` is used.
     *
     * If you do not use an Elastic Load Balancing, we recommend that you use the `startPeriod` in
     * the task definition health check parameters. For more information, see [Health
     * check](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_HealthCheck.html) .
     *
     * If your service's tasks take a while to start and respond to Elastic Load Balancing health
     * checks, you can specify a health check grace period of up to 2,147,483,647 seconds (about 69
     * years). During that time, the Amazon ECS service scheduler ignores health check status. This
     * grace period can prevent the service scheduler from marking tasks as unhealthy and stopping them
     * before they have time to come up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds)
     * @param healthCheckGracePeriodSeconds The period of time, in seconds, that the Amazon ECS
     * service scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has
     * first started. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     * @param loadBalancers A list of load balancer objects to associate with the service. 
     */
    override fun loadBalancers(loadBalancers: IResolvable) {
      cdkBuilder.loadBalancers(loadBalancers.let(IResolvable::unwrap))
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     * @param loadBalancers A list of load balancer objects to associate with the service. 
     */
    override fun loadBalancers(loadBalancers: List<Any>) {
      cdkBuilder.loadBalancers(loadBalancers)
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
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
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
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service. 
     */
    override fun placementConstraints(placementConstraints: IResolvable) {
      cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
    }

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service. 
     */
    override fun placementConstraints(placementConstraints: List<Any>) {
      cdkBuilder.placementConstraints(placementConstraints)
    }

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     * @param placementStrategies The placement strategy objects to use for tasks in your service. 
     */
    override fun placementStrategies(placementStrategies: IResolvable) {
      cdkBuilder.placementStrategies(placementStrategies.let(IResolvable::unwrap))
    }

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     * @param placementStrategies The placement strategy objects to use for tasks in your service. 
     */
    override fun placementStrategies(placementStrategies: List<Any>) {
      cdkBuilder.placementStrategies(placementStrategies)
    }

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
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
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(IResolvable::unwrap))
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
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(ServiceConnectConfigurationProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
     * each service isn't supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     * 
     */
    override fun serviceRegistries(serviceRegistries: IResolvable) {
      cdkBuilder.serviceRegistries(serviceRegistries.let(IResolvable::unwrap))
    }

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     * 
     */
    override fun serviceRegistries(serviceRegistries: List<Any>) {
      cdkBuilder.serviceRegistries(serviceRegistries)
    }

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time. 
     */
    override fun volumeConfigurations(volumeConfigurations: IResolvable) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.let(IResolvable::unwrap))
    }

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time. 
     */
    override fun volumeConfigurations(volumeConfigurations: List<Any>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations)
    }

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time. 
     */
    override fun volumeConfigurations(vararg volumeConfigurations: Any): Unit =
        volumeConfigurations(volumeConfigurations.toList())

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
        wrapped.cdkObject
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty,
    ) : CdkObject(cdkObject), TimeoutConfigurationProperty {
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
          TimeoutConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeoutConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.TimeoutConfigurationProperty
    }
  }

  public interface LoadBalancerProperty {
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
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty,
    ) : CdkObject(cdkObject), LoadBalancerProperty {
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
          LoadBalancerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerProperty):
          software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty
    }
  }

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

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty,
    ) : CdkObject(cdkObject), ServiceConnectClientAliasProperty {
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
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceConnectClientAliasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty):
          ServiceConnectClientAliasProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectClientAliasProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectClientAliasProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty,
    ) : CdkObject(cdkObject), ServiceConnectTlsCertificateAuthorityProperty {
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
          ServiceConnectTlsCertificateAuthorityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectTlsCertificateAuthorityProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsCertificateAuthorityProperty
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.clientAliases(clientAliases.let(IResolvable::unwrap))
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
        cdkBuilder.clientAliases(clientAliases)
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
        cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
      }

      /**
       * @param timeout A reference to an object that represents the configured timeouts for Service
       * Connect.
       */
      override fun timeout(timeout: TimeoutConfigurationProperty) {
        cdkBuilder.timeout(timeout.let(TimeoutConfigurationProperty::unwrap))
      }

      /**
       * @param timeout A reference to an object that represents the configured timeouts for Service
       * Connect.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd6672f6cd887caf6beb473987f937d129d83a90c850ac6733330cfdcf360bb9")
      override fun timeout(timeout: TimeoutConfigurationProperty.Builder.() -> Unit): Unit =
          timeout(TimeoutConfigurationProperty(timeout))

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS)
       * configuration.
       */
      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable::unwrap))
      }

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS)
       * configuration.
       */
      override fun tls(tls: ServiceConnectTlsConfigurationProperty) {
        cdkBuilder.tls(tls.let(ServiceConnectTlsConfigurationProperty::unwrap))
      }

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS)
       * configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed7373f407a897111bc9fc5ea3233167ec60d015f62c89c685d42e1a04adc986")
      override fun tls(tls: ServiceConnectTlsConfigurationProperty.Builder.() -> Unit): Unit =
          tls(ServiceConnectTlsConfigurationProperty(tls))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty,
    ) : CdkObject(cdkObject), ServiceConnectServiceProperty {
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
          ServiceConnectServiceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectServiceProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectServiceProperty
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param awsvpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      override fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      /**
       * @param awsvpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79684c36acab0cdfbf04ed7dac66c18ab2c1361696165365afa87bebd36dc8cf")
      override
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsvpcConfiguration(AwsVpcConfigurationProperty(awsvpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
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
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty
    }
  }

  public interface LogConfigurationProperty {
    /**
     * The log driver to use for the container.
     *
     * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
     * `awsfirelens` .
     *
     * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` , `fluentd`
     * , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and `awsfirelens` .
     *
     * For more information about using the `awslogs` log driver, see [Using the awslogs log
     * driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * For more information about using the `awsfirelens` log driver, see [Custom log
     * routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
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
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
       *
       * For more information about using the `awslogs` log driver, see [Using the awslogs log
       * driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       *
       * For more information about using the `awsfirelens` log driver, see [Custom log
       * routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
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
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      public fun options(options: IResolvable)

      /**
       * @param options The configuration options to send to the log driver.
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      public fun options(options: Map<String, String>)

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
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
       *
       * For more information about using the `awslogs` log driver, see [Using the awslogs log
       * driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       *
       * For more information about using the `awsfirelens` log driver, see [Custom log
       * routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
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
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      /**
       * @param options The configuration options to send to the log driver.
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      override fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secretOptions(secretOptions: IResolvable) {
        cdkBuilder.secretOptions(secretOptions.let(IResolvable::unwrap))
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secretOptions(secretOptions: List<Any>) {
        cdkBuilder.secretOptions(secretOptions)
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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty,
    ) : CdkObject(cdkObject), LogConfigurationProperty {
      /**
       * The log driver to use for the container.
       *
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
       *
       * For more information about using the `awslogs` log driver, see [Using the awslogs log
       * driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       *
       * For more information about using the `awsfirelens` log driver, see [Custom log
       * routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
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
          LogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.LogConfigurationProperty
    }
  }

  public interface ServiceManagedEBSVolumeConfigurationProperty {
    /**
     * Indicates whether the volume should be encrypted.
     *
     * If no value is specified, encryption is turned on by default. This parameter maps 1:1 with
     * the `Encrypted` parameter of the [CreateVolume
     * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
     * *Amazon EC2 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-encrypted)
     */
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The Linux filesystem type for the volume.
     *
     * For volumes created from a snapshot, you must specify the same filesystem type that the
     * volume was using when the snapshot was created. If there is a filesystem type mismatch, the task
     * will fail to start.
     *
     * The available filesystem types are `ext3` , `ext4` , and `xfs` . If no value is specified,
     * the `xfs` filesystem type is used by default.
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
     * When encryption is turned on and no AWS Key Management Service key is specified, the default
     * AWS managed key for Amazon EBS volumes is used. This parameter maps 1:1 with the `KmsKeyId`
     * parameter of the [CreateVolume
     * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
     * *Amazon EC2 API Reference* .
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
     * The snapshot that Amazon ECS uses to create the volume.
     *
     * You must specify either a snapshot ID or a volume size. This parameter maps 1:1 with the
     * `SnapshotId` parameter of the [CreateVolume
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
       * If no value is specified, encryption is turned on by default. This parameter maps 1:1 with
       * the `Encrypted` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted Indicates whether the volume should be encrypted.
       * If no value is specified, encryption is turned on by default. This parameter maps 1:1 with
       * the `Encrypted` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      public fun encrypted(encrypted: IResolvable)

      /**
       * @param filesystemType The Linux filesystem type for the volume.
       * For volumes created from a snapshot, you must specify the same filesystem type that the
       * volume was using when the snapshot was created. If there is a filesystem type mismatch, the
       * task will fail to start.
       *
       * The available filesystem types are `ext3` , `ext4` , and `xfs` . If no value is specified,
       * the `xfs` filesystem type is used by default.
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
       * When encryption is turned on and no AWS Key Management Service key is specified, the
       * default AWS managed key for Amazon EBS volumes is used. This parameter maps 1:1 with the
       * `KmsKeyId` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
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
       * @param snapshotId The snapshot that Amazon ECS uses to create the volume.
       * You must specify either a snapshot ID or a volume size. This parameter maps 1:1 with the
       * `SnapshotId` parameter of the [CreateVolume
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
       * If no value is specified, encryption is turned on by default. This parameter maps 1:1 with
       * the `Encrypted` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted Indicates whether the volume should be encrypted.
       * If no value is specified, encryption is turned on by default. This parameter maps 1:1 with
       * the `Encrypted` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      /**
       * @param filesystemType The Linux filesystem type for the volume.
       * For volumes created from a snapshot, you must specify the same filesystem type that the
       * volume was using when the snapshot was created. If there is a filesystem type mismatch, the
       * task will fail to start.
       *
       * The available filesystem types are `ext3` , `ext4` , and `xfs` . If no value is specified,
       * the `xfs` filesystem type is used by default.
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
       * When encryption is turned on and no AWS Key Management Service key is specified, the
       * default AWS managed key for Amazon EBS volumes is used. This parameter maps 1:1 with the
       * `KmsKeyId` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
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
       * @param snapshotId The snapshot that Amazon ECS uses to create the volume.
       * You must specify either a snapshot ID or a volume size. This parameter maps 1:1 with the
       * `SnapshotId` parameter of the [CreateVolume
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
        cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
      }

      /**
       * @param tagSpecifications The tags to apply to the volume.
       * Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with the
       * `TagSpecifications.N` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       */
      override fun tagSpecifications(tagSpecifications: List<Any>) {
        cdkBuilder.tagSpecifications(tagSpecifications)
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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty,
    ) : CdkObject(cdkObject), ServiceManagedEBSVolumeConfigurationProperty {
      /**
       * Indicates whether the volume should be encrypted.
       *
       * If no value is specified, encryption is turned on by default. This parameter maps 1:1 with
       * the `Encrypted` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicemanagedebsvolumeconfiguration.html#cfn-ecs-service-servicemanagedebsvolumeconfiguration-encrypted)
       */
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      /**
       * The Linux filesystem type for the volume.
       *
       * For volumes created from a snapshot, you must specify the same filesystem type that the
       * volume was using when the snapshot was created. If there is a filesystem type mismatch, the
       * task will fail to start.
       *
       * The available filesystem types are `ext3` , `ext4` , and `xfs` . If no value is specified,
       * the `xfs` filesystem type is used by default.
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
       * When encryption is turned on and no AWS Key Management Service key is specified, the
       * default AWS managed key for Amazon EBS volumes is used. This parameter maps 1:1 with the
       * `KmsKeyId` parameter of the [CreateVolume
       * API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html) in the
       * *Amazon EC2 API Reference* .
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
       * The snapshot that Amazon ECS uses to create the volume.
       *
       * You must specify either a snapshot ID or a volume size. This parameter maps 1:1 with the
       * `SnapshotId` parameter of the [CreateVolume
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
          ServiceManagedEBSVolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceManagedEBSVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceManagedEBSVolumeConfigurationProperty
    }
  }

  public interface DeploymentControllerProperty {
    /**
     * The deployment controller type to use. There are three deployment controller types
     * available:.
     *
     * * **ECS** - The rolling update ( `ECS` ) deployment type involves replacing the current
     * running version of the container with the latest version. The number of containers Amazon ECS
     * adds or removes from the service during a rolling update is controlled by adjusting the minimum
     * and maximum number of healthy tasks allowed during a service deployment, as specified in the
     * [DeploymentConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeploymentConfiguration.html)
     * .
     * * **CODE_DEPLOY** - The blue/green ( `CODE_DEPLOY` ) deployment type uses the blue/green
     * deployment model powered by AWS CodeDeploy , which allows you to verify a new deployment of a
     * service before sending production traffic to it.
     * * **EXTERNAL** - The external ( `EXTERNAL` ) deployment type enables you to use any
     * third-party deployment controller for full control over the deployment process for an Amazon ECS
     * service.
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
       * @param type The deployment controller type to use. There are three deployment controller
       * types available:.
       * * **ECS** - The rolling update ( `ECS` ) deployment type involves replacing the current
       * running version of the container with the latest version. The number of containers Amazon ECS
       * adds or removes from the service during a rolling update is controlled by adjusting the
       * minimum and maximum number of healthy tasks allowed during a service deployment, as specified
       * in the
       * [DeploymentConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeploymentConfiguration.html)
       * .
       * * **CODE_DEPLOY** - The blue/green ( `CODE_DEPLOY` ) deployment type uses the blue/green
       * deployment model powered by AWS CodeDeploy , which allows you to verify a new deployment of a
       * service before sending production traffic to it.
       * * **EXTERNAL** - The external ( `EXTERNAL` ) deployment type enables you to use any
       * third-party deployment controller for full control over the deployment process for an Amazon
       * ECS service.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty.builder()

      /**
       * @param type The deployment controller type to use. There are three deployment controller
       * types available:.
       * * **ECS** - The rolling update ( `ECS` ) deployment type involves replacing the current
       * running version of the container with the latest version. The number of containers Amazon ECS
       * adds or removes from the service during a rolling update is controlled by adjusting the
       * minimum and maximum number of healthy tasks allowed during a service deployment, as specified
       * in the
       * [DeploymentConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeploymentConfiguration.html)
       * .
       * * **CODE_DEPLOY** - The blue/green ( `CODE_DEPLOY` ) deployment type uses the blue/green
       * deployment model powered by AWS CodeDeploy , which allows you to verify a new deployment of a
       * service before sending production traffic to it.
       * * **EXTERNAL** - The external ( `EXTERNAL` ) deployment type enables you to use any
       * third-party deployment controller for full control over the deployment process for an Amazon
       * ECS service.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty,
    ) : CdkObject(cdkObject), DeploymentControllerProperty {
      /**
       * The deployment controller type to use. There are three deployment controller types
       * available:.
       *
       * * **ECS** - The rolling update ( `ECS` ) deployment type involves replacing the current
       * running version of the container with the latest version. The number of containers Amazon ECS
       * adds or removes from the service during a rolling update is controlled by adjusting the
       * minimum and maximum number of healthy tasks allowed during a service deployment, as specified
       * in the
       * [DeploymentConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeploymentConfiguration.html)
       * .
       * * **CODE_DEPLOY** - The blue/green ( `CODE_DEPLOY` ) deployment type uses the blue/green
       * deployment model powered by AWS CodeDeploy , which allows you to verify a new deployment of a
       * service before sending production traffic to it.
       * * **EXTERNAL** - The external ( `EXTERNAL` ) deployment type enables you to use any
       * third-party deployment controller for full control over the deployment process for an Amazon
       * ECS service.
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
          DeploymentControllerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentControllerProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty
    }
  }

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
     * This parameter maps to `LogConfig` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--log-driver` option to [`docker
     * run`](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/run/) .
     *
     * By default, containers use the same logging driver that the Docker daemon uses. However, the
     * container might use a different logging driver than the Docker daemon by specifying a log driver
     * configuration in the container definition. For more information about the options for different
     * supported log drivers, see [Configure logging
     * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/) in
     * the Docker documentation.
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
     * , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and `awsfirelens` .
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
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [`docker
       * run`](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/run/) .
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition. For more information about the options for
       * different supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
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
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
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
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [`docker
       * run`](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/run/) .
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition. For more information about the options for
       * different supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
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
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
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
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [`docker
       * run`](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/run/) .
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition. For more information about the options for
       * different supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
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
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param logConfiguration The log configuration for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [`docker
       * run`](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/run/) .
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition. For more information about the options for
       * different supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
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
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
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
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param logConfiguration The log configuration for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [`docker
       * run`](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/run/) .
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition. For more information about the options for
       * different supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
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
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
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
        cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationProperty::unwrap))
      }

      /**
       * @param logConfiguration The log configuration for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [`docker
       * run`](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/run/) .
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition. For more information about the options for
       * different supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
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
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.services(services.let(IResolvable::unwrap))
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
        cdkBuilder.services(services)
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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty,
    ) : CdkObject(cdkObject), ServiceConnectConfigurationProperty {
      /**
       * Specifies whether to use Service Connect with this service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html#cfn-ecs-service-serviceconnectconfiguration-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The log configuration for the container.
       *
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [`docker
       * run`](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/run/) .
       *
       * By default, containers use the same logging driver that the Docker daemon uses. However,
       * the container might use a different logging driver than the Docker daemon by specifying a log
       * driver configuration in the container definition. For more information about the options for
       * different supported log drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
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
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
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
          ServiceConnectConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectConfigurationProperty
    }
  }

  public interface DeploymentConfigurationProperty {
    /**
     * Information about the CloudWatch alarms.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-alarms)
     */
    public fun alarms(): Any? = unwrap(this).getAlarms()

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
     * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types
     * and tasks that use the EC2 launch type, the *maximum percent* value is set to the default value
     * and is used to define the upper limit on the number of the tasks in the service that remain in
     * the `RUNNING` state while the container instances are in the `DRAINING` state. If the tasks in
     * the service use the Fargate launch type, the maximum percent value is not used, although it is
     * returned when describing your service.
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
     * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types
     * and is running tasks that use the EC2 launch type, the *minimum healthy percent* value is set to
     * the default value and is used to define the lower limit on the number of the tasks in the
     * service that remain in the `RUNNING` state while the container instances are in the `DRAINING`
     * state. If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
     * types and is running tasks that use the Fargate launch type, the minimum healthy percent value
     * is not used, although it is returned when describing your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent)
     */
    public fun minimumHealthyPercent(): Number? = unwrap(this).getMinimumHealthyPercent()

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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efd9a5f127d78c01958f4cf4b39acf88204ea3d9b713d0c6e12a4bcd49c0914b")
      public fun alarms(alarms: DeploymentAlarmsProperty.Builder.() -> Unit)

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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d33a617c577ba243f4f0271ff561c8f6ede78b9600fbb68e0f022c6bfe2d4c")
      public
          fun deploymentCircuitBreaker(deploymentCircuitBreaker: DeploymentCircuitBreakerProperty.Builder.() -> Unit)

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
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and tasks that use the EC2 launch type, the *maximum percent* value is set to the
       * default value and is used to define the upper limit on the number of the tasks in the service
       * that remain in the `RUNNING` state while the container instances are in the `DRAINING` state.
       * If the tasks in the service use the Fargate launch type, the maximum percent value is not
       * used, although it is returned when describing your service.
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
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and is running tasks that use the EC2 launch type, the *minimum healthy percent* value
       * is set to the default value and is used to define the lower limit on the number of the tasks
       * in the service that remain in the `RUNNING` state while the container instances are in the
       * `DRAINING` state. If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL`
       * deployment types and is running tasks that use the Fargate launch type, the minimum healthy
       * percent value is not used, although it is returned when describing your service.
       */
      public fun minimumHealthyPercent(minimumHealthyPercent: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.builder()

      /**
       * @param alarms Information about the CloudWatch alarms.
       */
      override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable::unwrap))
      }

      /**
       * @param alarms Information about the CloudWatch alarms.
       */
      override fun alarms(alarms: DeploymentAlarmsProperty) {
        cdkBuilder.alarms(alarms.let(DeploymentAlarmsProperty::unwrap))
      }

      /**
       * @param alarms Information about the CloudWatch alarms.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efd9a5f127d78c01958f4cf4b39acf88204ea3d9b713d0c6e12a4bcd49c0914b")
      override fun alarms(alarms: DeploymentAlarmsProperty.Builder.() -> Unit): Unit =
          alarms(DeploymentAlarmsProperty(alarms))

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
        cdkBuilder.deploymentCircuitBreaker(deploymentCircuitBreaker.let(IResolvable::unwrap))
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
        cdkBuilder.deploymentCircuitBreaker(deploymentCircuitBreaker.let(DeploymentCircuitBreakerProperty::unwrap))
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d33a617c577ba243f4f0271ff561c8f6ede78b9600fbb68e0f022c6bfe2d4c")
      override
          fun deploymentCircuitBreaker(deploymentCircuitBreaker: DeploymentCircuitBreakerProperty.Builder.() -> Unit):
          Unit =
          deploymentCircuitBreaker(DeploymentCircuitBreakerProperty(deploymentCircuitBreaker))

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
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and tasks that use the EC2 launch type, the *maximum percent* value is set to the
       * default value and is used to define the upper limit on the number of the tasks in the service
       * that remain in the `RUNNING` state while the container instances are in the `DRAINING` state.
       * If the tasks in the service use the Fargate launch type, the maximum percent value is not
       * used, although it is returned when describing your service.
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
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and is running tasks that use the EC2 launch type, the *minimum healthy percent* value
       * is set to the default value and is used to define the lower limit on the number of the tasks
       * in the service that remain in the `RUNNING` state while the container instances are in the
       * `DRAINING` state. If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL`
       * deployment types and is running tasks that use the Fargate launch type, the minimum healthy
       * percent value is not used, although it is returned when describing your service.
       */
      override fun minimumHealthyPercent(minimumHealthyPercent: Number) {
        cdkBuilder.minimumHealthyPercent(minimumHealthyPercent)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty,
    ) : CdkObject(cdkObject), DeploymentConfigurationProperty {
      /**
       * Information about the CloudWatch alarms.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-alarms)
       */
      override fun alarms(): Any? = unwrap(this).getAlarms()

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
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and tasks that use the EC2 launch type, the *maximum percent* value is set to the
       * default value and is used to define the upper limit on the number of the tasks in the service
       * that remain in the `RUNNING` state while the container instances are in the `DRAINING` state.
       * If the tasks in the service use the Fargate launch type, the maximum percent value is not
       * used, although it is returned when describing your service.
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
       * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment
       * types and is running tasks that use the EC2 launch type, the *minimum healthy percent* value
       * is set to the default value and is used to define the lower limit on the number of the tasks
       * in the service that remain in the `RUNNING` state while the container instances are in the
       * `DRAINING` state. If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL`
       * deployment types and is running tasks that use the Fargate launch type, the minimum healthy
       * percent value is not used, although it is returned when describing your service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent)
       */
      override fun minimumHealthyPercent(): Number? = unwrap(this).getMinimumHealthyPercent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty):
          DeploymentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty
    }
  }

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
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty,
    ) : CdkObject(cdkObject), EBSTagSpecificationProperty {
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
          EBSTagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EBSTagSpecificationProperty):
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.EBSTagSpecificationProperty
    }
  }

  public interface PlacementStrategyProperty {
    /**
     * The field to apply the placement strategy against.
     *
     * For the `spread` placement strategy, valid values are `instanceId` (or `host` , which has the
     * same effect), or any platform or custom attribute that is applied to a container instance, such
     * as `attribute:ecs.availability-zone` . For the `binpack` placement strategy, valid values are
     * `CPU` and `MEMORY` . For the `random` placement strategy, this field is not used.
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
       * the same effect), or any platform or custom attribute that is applied to a container instance,
       * such as `attribute:ecs.availability-zone` . For the `binpack` placement strategy, valid values
       * are `CPU` and `MEMORY` . For the `random` placement strategy, this field is not used.
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
       * the same effect), or any platform or custom attribute that is applied to a container instance,
       * such as `attribute:ecs.availability-zone` . For the `binpack` placement strategy, valid values
       * are `CPU` and `MEMORY` . For the `random` placement strategy, this field is not used.
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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty,
    ) : CdkObject(cdkObject), PlacementStrategyProperty {
      /**
       * The field to apply the placement strategy against.
       *
       * For the `spread` placement strategy, valid values are `instanceId` (or `host` , which has
       * the same effect), or any platform or custom attribute that is applied to a container instance,
       * such as `attribute:ecs.availability-zone` . For the `binpack` placement strategy, valid values
       * are `CPU` and `MEMORY` . For the `random` placement strategy, this field is not used.
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
          PlacementStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementStrategyProperty):
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty,
    ) : CdkObject(cdkObject), ServiceRegistryProperty {
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
          ServiceRegistryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceRegistryProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty
    }
  }

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
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnService.SecretProperty,
    ) : CdkObject(cdkObject), SecretProperty {
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
          SecretProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretProperty):
          software.amazon.awscdk.services.ecs.CfnService.SecretProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CfnService.SecretProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty,
    ) : CdkObject(cdkObject), CapacityProviderStrategyItemProperty {
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
          CapacityProviderStrategyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.CapacityProviderStrategyItemProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty,
    ) : CdkObject(cdkObject), PlacementConstraintProperty {
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
          PlacementConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementConstraintProperty):
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty
    }
  }

  public interface AwsVpcConfigurationProperty {
    /**
     * Whether the task's elastic network interface receives a public IP address.
     *
     * The default value is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip)
     */
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    /**
     * The IDs of the security groups associated with the task or service.
     *
     * If you don't specify a security group, the default security group for the VPC is used.
     * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
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
     * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
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
       * The default value is `DISABLED` .
       */
      public fun assignPublicIp(assignPublicIp: String)

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified security groups must be from the same VPC.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified security groups must be from the same VPC.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param subnets The IDs of the subnets associated with the task or service.
       * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified subnets must be from the same VPC.
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The IDs of the subnets associated with the task or service.
       * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
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
       * The default value is `DISABLED` .
       */
      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
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
       * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified security groups must be from the same VPC.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param subnets The IDs of the subnets associated with the task or service.
       * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified subnets must be from the same VPC.
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The IDs of the subnets associated with the task or service.
       * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified subnets must be from the same VPC.
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty,
    ) : CdkObject(cdkObject), AwsVpcConfigurationProperty {
      /**
       * Whether the task's elastic network interface receives a public IP address.
       *
       * The default value is `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip)
       */
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      /**
       * The IDs of the security groups associated with the task or service.
       *
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
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
       * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
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
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.issuerCertificateAuthority(issuerCertificateAuthority.let(IResolvable::unwrap))
      }

      /**
       * @param issuerCertificateAuthority The signer certificate authority. 
       */
      override
          fun issuerCertificateAuthority(issuerCertificateAuthority: ServiceConnectTlsCertificateAuthorityProperty) {
        cdkBuilder.issuerCertificateAuthority(issuerCertificateAuthority.let(ServiceConnectTlsCertificateAuthorityProperty::unwrap))
      }

      /**
       * @param issuerCertificateAuthority The signer certificate authority. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty,
    ) : CdkObject(cdkObject), ServiceConnectTlsConfigurationProperty {
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
          ServiceConnectTlsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectTlsConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceConnectTlsConfigurationProperty
    }
  }

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
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
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
        cdkBuilder.rollback(rollback.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty,
    ) : CdkObject(cdkObject), DeploymentCircuitBreakerProperty {
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
          DeploymentCircuitBreakerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentCircuitBreakerProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.managedEbsVolume(managedEbsVolume.let(IResolvable::unwrap))
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
        cdkBuilder.managedEbsVolume(managedEbsVolume.let(ServiceManagedEBSVolumeConfigurationProperty::unwrap))
      }

      /**
       * @param managedEbsVolume The configuration for the Amazon EBS volume that Amazon ECS creates
       * and manages on your behalf.
       * These settings are used to create each Amazon EBS volume, with one volume created for each
       * task in the service. The Amazon EBS volumes are visible in your account in the Amazon EC2
       * console once they are created.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty,
    ) : CdkObject(cdkObject), ServiceVolumeConfigurationProperty {
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
          ServiceVolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.ServiceVolumeConfigurationProperty
    }
  }

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
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
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
        cdkBuilder.rollback(rollback.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty,
    ) : CdkObject(cdkObject), DeploymentAlarmsProperty {
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
          DeploymentAlarmsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentAlarmsProperty):
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnService.DeploymentAlarmsProperty
    }
  }
}
