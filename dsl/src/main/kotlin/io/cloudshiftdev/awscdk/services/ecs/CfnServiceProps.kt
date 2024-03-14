package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnServiceProps {
  /**
   * The capacity provider strategy to use for the service.
   *
   * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If no
   * `capacityProviderStrategy` or `launchType` is specified, the `defaultCapacityProviderStrategy` for
   * the cluster is used.
   *
   * A capacity provider strategy may contain a maximum of 6 capacity providers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
   */
  public fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that you run your service on.
   *
   * If you do not specify a cluster, the default cluster is assumed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster)
   */
  public fun cluster(): String? = unwrap(this).getCluster()

  /**
   * Optional deployment parameters that control how many tasks run during the deployment and the
   * ordering of stopping and starting tasks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
   */
  public fun deploymentConfiguration(): Any? = unwrap(this).getDeploymentConfiguration()

  /**
   * The deployment controller to use for the service.
   *
   * If no deployment controller is specified, the default value of `ECS` is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
   */
  public fun deploymentController(): Any? = unwrap(this).getDeploymentController()

  /**
   * The number of instantiations of the specified task definition to place and keep running in your
   * service.
   *
   * For new services, if a desired count is not specified, a default value of `1` is used. When
   * using the `DAEMON` scheduling strategy, the desired count is not required.
   *
   * For existing services, if a desired count is not specified, it is omitted from the operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount)
   */
  public fun desiredCount(): Number? = unwrap(this).getDesiredCount()

  /**
   * Specifies whether to turn on Amazon ECS managed tags for the tasks within the service.
   *
   * For more information, see [Tagging your Amazon ECS
   * resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags)
   */
  public fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

  /**
   * Determines whether the execute command functionality is turned on for the service.
   *
   * If `true` , the execute command functionality is turned on for all containers in tasks as part
   * of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableexecutecommand)
   */
  public fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

  /**
   * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic
   * Load Balancing target health checks after a task has first started.
   *
   * This is only used when your service is configured to use a load balancer. If your service has a
   * load balancer defined and you don't specify a health check grace period value, the default value
   * of `0` is used.
   *
   * If you do not use an Elastic Load Balancing, we recommend that you use the `startPeriod` in the
   * task definition health check parameters. For more information, see [Health
   * check](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_HealthCheck.html) .
   *
   * If your service's tasks take a while to start and respond to Elastic Load Balancing health
   * checks, you can specify a health check grace period of up to 2,147,483,647 seconds (about 69
   * years). During that time, the Amazon ECS service scheduler ignores health check status. This grace
   * period can prevent the service scheduler from marking tasks as unhealthy and stopping them before
   * they have time to come up.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds)
   */
  public fun healthCheckGracePeriodSeconds(): Number? =
      unwrap(this).getHealthCheckGracePeriodSeconds()

  /**
   * The launch type on which to run your service.
   *
   * For more information, see [Amazon ECS Launch
   * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype)
   */
  public fun launchType(): String? = unwrap(this).getLaunchType()

  /**
   * A list of load balancer objects to associate with the service.
   *
   * If you specify the `Role` property, `LoadBalancers` must be specified as well. For information
   * about the number of load balancers that you can specify per service, see [Service Load
   * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
   */
  public fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

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
   */
  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * An array of placement constraint objects to use for tasks in your service.
   *
   * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
   * the task definition and those specified at runtime.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
   */
  public fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

  /**
   * The placement strategy objects to use for tasks in your service.
   *
   * You can specify a maximum of 5 strategy rules for each service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
   */
  public fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

  /**
   * The platform version that your tasks in the service are running on.
   *
   * A platform version is specified only for tasks using the Fargate launch type. If one isn't
   * specified, the `LATEST` platform version is used. For more information, see [AWS Fargate platform
   * versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html) in
   * the *Amazon Elastic Container Service Developer Guide* .
   *
   * Default: - "LATEST"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion)
   */
  public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

  /**
   * Specifies whether to propagate the tags from the task definition to the task.
   *
   * If no value is specified, the tags aren't propagated. Tags can only be propagated to the task
   * during task creation. To add tags to a task after task creation, use the
   * [TagResource](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html) API
   * action.
   *
   * The default is `NONE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-propagatetags)
   */
  public fun propagateTags(): String? = unwrap(this).getPropagateTags()

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
   */
  public fun role(): String? = unwrap(this).getRole()

  /**
   * The scheduling strategy to use for the service. For more information, see
   * [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
   *
   * There are two service scheduler strategies available:
   *
   * * `REPLICA` -The replica scheduling strategy places and maintains the desired number of tasks
   * across your cluster. By default, the service scheduler spreads tasks across Availability Zones.
   * You can use task placement strategies and constraints to customize task placement decisions. This
   * scheduler strategy is required if the service uses the `CODE_DEPLOY` or `EXTERNAL` deployment
   * controller types.
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
   */
  public fun schedulingStrategy(): String? = unwrap(this).getSchedulingStrategy()

  /**
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceconnectconfiguration)
   */
  public fun serviceConnectConfiguration(): Any? = unwrap(this).getServiceConnectConfiguration()

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
   */
  public fun serviceName(): String? = unwrap(this).getServiceName()

  /**
   * The details of the service discovery registry to associate with this service. For more
   * information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   *
   *
   * Each service may be associated with one service registry. Multiple service registries for each
   * service isn't supported.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
   */
  public fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The `family` and `revision` ( `family:revision` ) or full ARN of the task definition to run in
   * your service.
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
   */
  public fun taskDefinition(): String? = unwrap(this).getTaskDefinition()

  /**
   * The configuration for a volume specified in the task definition as a volume that is configured
   * at launch time.
   *
   * Currently, the only supported volume type is an Amazon EBS volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
   */
  public fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()

  /**
   * A builder for [CfnServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacityProviderStrategy The capacity provider strategy to use for the service.
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     */
    public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable)

    /**
     * @param capacityProviderStrategy The capacity provider strategy to use for the service.
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     */
    public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>)

    /**
     * @param capacityProviderStrategy The capacity provider strategy to use for the service.
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     */
    public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any)

    /**
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that you run
     * your service on.
     * If you do not specify a cluster, the default cluster is assumed.
     */
    public fun cluster(cluster: String)

    /**
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks.
     */
    public fun deploymentConfiguration(deploymentConfiguration: IResolvable)

    /**
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks.
     */
    public
        fun deploymentConfiguration(deploymentConfiguration: CfnService.DeploymentConfigurationProperty)

    /**
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bfe5d1c1586c1905ebbbf506ca279d0a6c87ce9dacef580455c27215b81b48e")
    public
        fun deploymentConfiguration(deploymentConfiguration: CfnService.DeploymentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param deploymentController The deployment controller to use for the service.
     * If no deployment controller is specified, the default value of `ECS` is used.
     */
    public fun deploymentController(deploymentController: IResolvable)

    /**
     * @param deploymentController The deployment controller to use for the service.
     * If no deployment controller is specified, the default value of `ECS` is used.
     */
    public fun deploymentController(deploymentController: CfnService.DeploymentControllerProperty)

    /**
     * @param deploymentController The deployment controller to use for the service.
     * If no deployment controller is specified, the default value of `ECS` is used.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf4ceefc364272b19ad3045427442333d4cfedfa588102902f59c07d2bde3ac")
    public
        fun deploymentController(deploymentController: CfnService.DeploymentControllerProperty.Builder.() -> Unit)

    /**
     * @param desiredCount The number of instantiations of the specified task definition to place
     * and keep running in your service.
     * For new services, if a desired count is not specified, a default value of `1` is used. When
     * using the `DAEMON` scheduling strategy, the desired count is not required.
     *
     * For existing services, if a desired count is not specified, it is omitted from the operation.
     */
    public fun desiredCount(desiredCount: Number)

    /**
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     * tasks within the service.
     * For more information, see [Tagging your Amazon ECS
     * resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     * tasks within the service.
     * For more information, see [Tagging your Amazon ECS
     * resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable)

    /**
     * @param enableExecuteCommand Determines whether the execute command functionality is turned on
     * for the service.
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * @param enableExecuteCommand Determines whether the execute command functionality is turned on
     * for the service.
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     */
    public fun enableExecuteCommand(enableExecuteCommand: IResolvable)

    /**
     * @param healthCheckGracePeriodSeconds The period of time, in seconds, that the Amazon ECS
     * service scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has
     * first started.
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
     */
    public fun healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds: Number)

    /**
     * @param launchType The launch type on which to run your service.
     * For more information, see [Amazon ECS Launch
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     */
    public fun launchType(launchType: String)

    /**
     * @param loadBalancers A list of load balancer objects to associate with the service.
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun loadBalancers(loadBalancers: IResolvable)

    /**
     * @param loadBalancers A list of load balancer objects to associate with the service.
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun loadBalancers(loadBalancers: List<Any>)

    /**
     * @param loadBalancers A list of load balancer objects to associate with the service.
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun loadBalancers(vararg loadBalancers: Any)

    /**
     * @param networkConfiguration The network configuration for the service.
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * @param networkConfiguration The network configuration for the service.
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty)

    /**
     * @param networkConfiguration The network configuration for the service.
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6dddf30ca601e6c80286a2d1987fbb8ca662769f862093c4d103c239abeb4bc")
    public
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service.
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     */
    public fun placementConstraints(placementConstraints: IResolvable)

    /**
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service.
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     */
    public fun placementConstraints(placementConstraints: List<Any>)

    /**
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service.
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     */
    public fun placementConstraints(vararg placementConstraints: Any)

    /**
     * @param placementStrategies The placement strategy objects to use for tasks in your service.
     * You can specify a maximum of 5 strategy rules for each service.
     */
    public fun placementStrategies(placementStrategies: IResolvable)

    /**
     * @param placementStrategies The placement strategy objects to use for tasks in your service.
     * You can specify a maximum of 5 strategy rules for each service.
     */
    public fun placementStrategies(placementStrategies: List<Any>)

    /**
     * @param placementStrategies The placement strategy objects to use for tasks in your service.
     * You can specify a maximum of 5 strategy rules for each service.
     */
    public fun placementStrategies(vararg placementStrategies: Any)

    /**
     * @param platformVersion The platform version that your tasks in the service are running on.
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used. For more information, see [AWS Fargate
     * platform
     * versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun platformVersion(platformVersion: String)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task.
     * If no value is specified, the tags aren't propagated. Tags can only be propagated to the task
     * during task creation. To add tags to a task after task creation, use the
     * [TagResource](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html)
     * API action.
     *
     * The default is `NONE` .
     */
    public fun propagateTags(propagateTags: String)

    /**
     * @param role The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon
     * ECS to make calls to your load balancer on your behalf.
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
     */
    public fun role(role: String)

    /**
     * @param schedulingStrategy The scheduling strategy to use for the service. For more
     * information, see
     * [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
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
     */
    public fun schedulingStrategy(schedulingStrategy: String)

    /**
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace.
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun serviceConnectConfiguration(serviceConnectConfiguration: IResolvable)

    /**
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace.
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: CfnService.ServiceConnectConfigurationProperty)

    /**
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace.
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc95716bfa4b4518e5ee9a0d4288a7ae79193d679924f67d0ea61638cd58f0b1")
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: CfnService.ServiceConnectConfigurationProperty.Builder.() -> Unit)

    /**
     * @param serviceName The name of your service.
     * Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed.
     * Service names must be unique within a cluster, but you can have similarly named services in
     * multiple clusters within a Region or across multiple Regions.
     *
     *
     * The stack update fails if you change any properties that require replacement and the
     * `ServiceName` is configured. This is because AWS CloudFormation creates the replacement service
     * first, but each `ServiceName` must be unique in the cluster.
     */
    public fun serviceName(serviceName: String)

    /**
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
     */
    public fun serviceRegistries(serviceRegistries: IResolvable)

    /**
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
     */
    public fun serviceRegistries(serviceRegistries: List<Any>)

    /**
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
     */
    public fun serviceRegistries(vararg serviceRegistries: Any)

    /**
     * @param tags The metadata that you apply to the service to help you categorize and organize
     * them.
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
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The metadata that you apply to the service to help you categorize and organize
     * them.
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
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param taskDefinition The `family` and `revision` ( `family:revision` ) or full ARN of the
     * task definition to run in your service.
     * If a `revision` isn't specified, the latest `ACTIVE` revision is used.
     *
     * A task definition must be specified if the service uses either the `ECS` or `CODE_DEPLOY`
     * deployment controllers.
     *
     * For more information about deployment types, see [Amazon ECS deployment
     * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html) .
     */
    public fun taskDefinition(taskDefinition: String)

    /**
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time.
     * Currently, the only supported volume type is an Amazon EBS volume.
     */
    public fun volumeConfigurations(volumeConfigurations: IResolvable)

    /**
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time.
     * Currently, the only supported volume type is an Amazon EBS volume.
     */
    public fun volumeConfigurations(volumeConfigurations: List<Any>)

    /**
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time.
     * Currently, the only supported volume type is an Amazon EBS volume.
     */
    public fun volumeConfigurations(vararg volumeConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnServiceProps.Builder =
        software.amazon.awscdk.services.ecs.CfnServiceProps.builder()

    /**
     * @param capacityProviderStrategy The capacity provider strategy to use for the service.
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     */
    override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable::unwrap))
    }

    /**
     * @param capacityProviderStrategy The capacity provider strategy to use for the service.
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     */
    override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
    }

    /**
     * @param capacityProviderStrategy The capacity provider strategy to use for the service.
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     */
    override fun capacityProviderStrategy(vararg capacityProviderStrategy: Any): Unit =
        capacityProviderStrategy(capacityProviderStrategy.toList())

    /**
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that you run
     * your service on.
     * If you do not specify a cluster, the default cluster is assumed.
     */
    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    /**
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks.
     */
    override fun deploymentConfiguration(deploymentConfiguration: IResolvable) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks.
     */
    override
        fun deploymentConfiguration(deploymentConfiguration: CfnService.DeploymentConfigurationProperty) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(CfnService.DeploymentConfigurationProperty::unwrap))
    }

    /**
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     * during the deployment and the ordering of stopping and starting tasks.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bfe5d1c1586c1905ebbbf506ca279d0a6c87ce9dacef580455c27215b81b48e")
    override
        fun deploymentConfiguration(deploymentConfiguration: CfnService.DeploymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        deploymentConfiguration(CfnService.DeploymentConfigurationProperty(deploymentConfiguration))

    /**
     * @param deploymentController The deployment controller to use for the service.
     * If no deployment controller is specified, the default value of `ECS` is used.
     */
    override fun deploymentController(deploymentController: IResolvable) {
      cdkBuilder.deploymentController(deploymentController.let(IResolvable::unwrap))
    }

    /**
     * @param deploymentController The deployment controller to use for the service.
     * If no deployment controller is specified, the default value of `ECS` is used.
     */
    override
        fun deploymentController(deploymentController: CfnService.DeploymentControllerProperty) {
      cdkBuilder.deploymentController(deploymentController.let(CfnService.DeploymentControllerProperty::unwrap))
    }

    /**
     * @param deploymentController The deployment controller to use for the service.
     * If no deployment controller is specified, the default value of `ECS` is used.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf4ceefc364272b19ad3045427442333d4cfedfa588102902f59c07d2bde3ac")
    override
        fun deploymentController(deploymentController: CfnService.DeploymentControllerProperty.Builder.() -> Unit):
        Unit = deploymentController(CfnService.DeploymentControllerProperty(deploymentController))

    /**
     * @param desiredCount The number of instantiations of the specified task definition to place
     * and keep running in your service.
     * For new services, if a desired count is not specified, a default value of `1` is used. When
     * using the `DAEMON` scheduling strategy, the desired count is not required.
     *
     * For existing services, if a desired count is not specified, it is omitted from the operation.
     */
    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     * tasks within the service.
     * For more information, see [Tagging your Amazon ECS
     * resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     * tasks within the service.
     * For more information, see [Tagging your Amazon ECS
     * resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable::unwrap))
    }

    /**
     * @param enableExecuteCommand Determines whether the execute command functionality is turned on
     * for the service.
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param enableExecuteCommand Determines whether the execute command functionality is turned on
     * for the service.
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     */
    override fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable::unwrap))
    }

    /**
     * @param healthCheckGracePeriodSeconds The period of time, in seconds, that the Amazon ECS
     * service scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has
     * first started.
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
     */
    override fun healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds: Number) {
      cdkBuilder.healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds)
    }

    /**
     * @param launchType The launch type on which to run your service.
     * For more information, see [Amazon ECS Launch
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     */
    override fun launchType(launchType: String) {
      cdkBuilder.launchType(launchType)
    }

    /**
     * @param loadBalancers A list of load balancer objects to associate with the service.
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    override fun loadBalancers(loadBalancers: IResolvable) {
      cdkBuilder.loadBalancers(loadBalancers.let(IResolvable::unwrap))
    }

    /**
     * @param loadBalancers A list of load balancer objects to associate with the service.
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    override fun loadBalancers(loadBalancers: List<Any>) {
      cdkBuilder.loadBalancers(loadBalancers)
    }

    /**
     * @param loadBalancers A list of load balancer objects to associate with the service.
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see [Service
     * Load
     * Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    override fun loadBalancers(vararg loadBalancers: Any): Unit =
        loadBalancers(loadBalancers.toList())

    /**
     * @param networkConfiguration The network configuration for the service.
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param networkConfiguration The network configuration for the service.
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    override
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnService.NetworkConfigurationProperty::unwrap))
    }

    /**
     * @param networkConfiguration The network configuration for the service.
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For more
     * information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6dddf30ca601e6c80286a2d1987fbb8ca662769f862093c4d103c239abeb4bc")
    override
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(CfnService.NetworkConfigurationProperty(networkConfiguration))

    /**
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service.
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     */
    override fun placementConstraints(placementConstraints: IResolvable) {
      cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
    }

    /**
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service.
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     */
    override fun placementConstraints(placementConstraints: List<Any>) {
      cdkBuilder.placementConstraints(placementConstraints)
    }

    /**
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     * service.
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     */
    override fun placementConstraints(vararg placementConstraints: Any): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * @param placementStrategies The placement strategy objects to use for tasks in your service.
     * You can specify a maximum of 5 strategy rules for each service.
     */
    override fun placementStrategies(placementStrategies: IResolvable) {
      cdkBuilder.placementStrategies(placementStrategies.let(IResolvable::unwrap))
    }

    /**
     * @param placementStrategies The placement strategy objects to use for tasks in your service.
     * You can specify a maximum of 5 strategy rules for each service.
     */
    override fun placementStrategies(placementStrategies: List<Any>) {
      cdkBuilder.placementStrategies(placementStrategies)
    }

    /**
     * @param placementStrategies The placement strategy objects to use for tasks in your service.
     * You can specify a maximum of 5 strategy rules for each service.
     */
    override fun placementStrategies(vararg placementStrategies: Any): Unit =
        placementStrategies(placementStrategies.toList())

    /**
     * @param platformVersion The platform version that your tasks in the service are running on.
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used. For more information, see [AWS Fargate
     * platform
     * versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    override fun platformVersion(platformVersion: String) {
      cdkBuilder.platformVersion(platformVersion)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     * task.
     * If no value is specified, the tags aren't propagated. Tags can only be propagated to the task
     * during task creation. To add tags to a task after task creation, use the
     * [TagResource](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html)
     * API action.
     *
     * The default is `NONE` .
     */
    override fun propagateTags(propagateTags: String) {
      cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * @param role The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon
     * ECS to make calls to your load balancer on your behalf.
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
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * @param schedulingStrategy The scheduling strategy to use for the service. For more
     * information, see
     * [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
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
     */
    override fun schedulingStrategy(schedulingStrategy: String) {
      cdkBuilder.schedulingStrategy(schedulingStrategy)
    }

    /**
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace.
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    override fun serviceConnectConfiguration(serviceConnectConfiguration: IResolvable) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace.
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    override
        fun serviceConnectConfiguration(serviceConnectConfiguration: CfnService.ServiceConnectConfigurationProperty) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(CfnService.ServiceConnectConfigurationProperty::unwrap))
    }

    /**
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     * to services, and be discovered by, and connected from, other services within a namespace.
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc95716bfa4b4518e5ee9a0d4288a7ae79193d679924f67d0ea61638cd58f0b1")
    override
        fun serviceConnectConfiguration(serviceConnectConfiguration: CfnService.ServiceConnectConfigurationProperty.Builder.() -> Unit):
        Unit =
        serviceConnectConfiguration(CfnService.ServiceConnectConfigurationProperty(serviceConnectConfiguration))

    /**
     * @param serviceName The name of your service.
     * Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed.
     * Service names must be unique within a cluster, but you can have similarly named services in
     * multiple clusters within a Region or across multiple Regions.
     *
     *
     * The stack update fails if you change any properties that require replacement and the
     * `ServiceName` is configured. This is because AWS CloudFormation creates the replacement service
     * first, but each `ServiceName` must be unique in the cluster.
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
     */
    override fun serviceRegistries(serviceRegistries: IResolvable) {
      cdkBuilder.serviceRegistries(serviceRegistries.let(IResolvable::unwrap))
    }

    /**
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
     */
    override fun serviceRegistries(serviceRegistries: List<Any>) {
      cdkBuilder.serviceRegistries(serviceRegistries)
    }

    /**
     * @param serviceRegistries The details of the service discovery registry to associate with this
     * service. For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
     */
    override fun serviceRegistries(vararg serviceRegistries: Any): Unit =
        serviceRegistries(serviceRegistries.toList())

    /**
     * @param tags The metadata that you apply to the service to help you categorize and organize
     * them.
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
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The metadata that you apply to the service to help you categorize and organize
     * them.
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
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param taskDefinition The `family` and `revision` ( `family:revision` ) or full ARN of the
     * task definition to run in your service.
     * If a `revision` isn't specified, the latest `ACTIVE` revision is used.
     *
     * A task definition must be specified if the service uses either the `ECS` or `CODE_DEPLOY`
     * deployment controllers.
     *
     * For more information about deployment types, see [Amazon ECS deployment
     * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html) .
     */
    override fun taskDefinition(taskDefinition: String) {
      cdkBuilder.taskDefinition(taskDefinition)
    }

    /**
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time.
     * Currently, the only supported volume type is an Amazon EBS volume.
     */
    override fun volumeConfigurations(volumeConfigurations: IResolvable) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time.
     * Currently, the only supported volume type is an Amazon EBS volume.
     */
    override fun volumeConfigurations(volumeConfigurations: List<Any>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations)
    }

    /**
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     * as a volume that is configured at launch time.
     * Currently, the only supported volume type is an Amazon EBS volume.
     */
    override fun volumeConfigurations(vararg volumeConfigurations: Any): Unit =
        volumeConfigurations(volumeConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnServiceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CfnServiceProps,
  ) : CdkObject(cdkObject), CfnServiceProps {
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
     */
    override fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that you run your service
     * on.
     *
     * If you do not specify a cluster, the default cluster is assumed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster)
     */
    override fun cluster(): String? = unwrap(this).getCluster()

    /**
     * Optional deployment parameters that control how many tasks run during the deployment and the
     * ordering of stopping and starting tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
     */
    override fun deploymentConfiguration(): Any? = unwrap(this).getDeploymentConfiguration()

    /**
     * The deployment controller to use for the service.
     *
     * If no deployment controller is specified, the default value of `ECS` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     */
    override fun deploymentController(): Any? = unwrap(this).getDeploymentController()

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
     */
    override fun desiredCount(): Number? = unwrap(this).getDesiredCount()

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
     */
    override fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

    /**
     * Determines whether the execute command functionality is turned on for the service.
     *
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableexecutecommand)
     */
    override fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

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
     */
    override fun healthCheckGracePeriodSeconds(): Number? =
        unwrap(this).getHealthCheckGracePeriodSeconds()

    /**
     * The launch type on which to run your service.
     *
     * For more information, see [Amazon ECS Launch
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype)
     */
    override fun launchType(): String? = unwrap(this).getLaunchType()

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
     */
    override fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

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
     */
    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     */
    override fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     */
    override fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

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
     */
    override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

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
     */
    override fun propagateTags(): String? = unwrap(this).getPropagateTags()

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
     */
    override fun role(): String? = unwrap(this).getRole()

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
     */
    override fun schedulingStrategy(): String? = unwrap(this).getSchedulingStrategy()

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
     */
    override fun serviceConnectConfiguration(): Any? = unwrap(this).getServiceConnectConfiguration()

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
     */
    override fun serviceName(): String? = unwrap(this).getServiceName()

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
     */
    override fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun taskDefinition(): String? = unwrap(this).getTaskDefinition()

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     */
    override fun volumeConfigurations(): Any? = unwrap(this).getVolumeConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnServiceProps):
        CfnServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProps):
        software.amazon.awscdk.services.ecs.CfnServiceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.CfnServiceProps
  }
}
