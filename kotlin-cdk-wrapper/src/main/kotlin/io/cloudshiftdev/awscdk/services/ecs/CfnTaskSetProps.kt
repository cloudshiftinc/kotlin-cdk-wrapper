@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTaskSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CfnTaskSetProps cfnTaskSetProps = CfnTaskSetProps.builder()
 * .cluster("cluster")
 * .service("service")
 * .taskDefinition("taskDefinition")
 * // the properties below are optional
 * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
 * .base(123)
 * .capacityProvider("capacityProvider")
 * .weight(123)
 * .build()))
 * .externalId("externalId")
 * .launchType("launchType")
 * .loadBalancers(List.of(LoadBalancerProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .targetGroupArn("targetGroupArn")
 * .build()))
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .build())
 * .platformVersion("platformVersion")
 * .scale(ScaleProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .serviceRegistries(List.of(ServiceRegistryProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .port(123)
 * .registryArn("registryArn")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html)
 */
public interface CfnTaskSetProps {
  /**
   * The capacity provider strategy that are associated with the task set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-capacityproviderstrategy)
   */
  public fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to
   * create the task set in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-cluster)
   */
  public fun cluster(): String

  /**
   * An optional non-unique tag that identifies this task set in external systems.
   *
   * If the task set is associated with a service discovery registry, the tasks in this task set
   * will have the `ECS_TASK_SET_EXTERNAL_ID` AWS Cloud Map attribute set to the provided value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-externalid)
   */
  public fun externalId(): String? = unwrap(this).getExternalId()

  /**
   * The launch type that new tasks in the task set uses.
   *
   * For more information, see [Amazon ECS launch
   * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * If a `launchType` is specified, the `capacityProviderStrategy` parameter must be omitted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-launchtype)
   */
  public fun launchType(): String? = unwrap(this).getLaunchType()

  /**
   * A load balancer object representing the load balancer to use with the task set.
   *
   * The supported load balancer types are either an Application Load Balancer or a Network Load
   * Balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
   */
  public fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

  /**
   * The network configuration for the task set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-networkconfiguration)
   */
  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The platform version that the tasks in the task set uses.
   *
   * A platform version is specified only for tasks using the Fargate launch type. If one isn't
   * specified, the `LATEST` platform version is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-platformversion)
   */
  public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

  /**
   * A floating-point percentage of your desired number of tasks to place and keep running in the
   * task set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-scale)
   */
  public fun scale(): Any? = unwrap(this).getScale()

  /**
   * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-service)
   */
  public fun service(): String

  /**
   * The details of the service discovery registries to assign to this task set.
   *
   * For more information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
   */
  public fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

  /**
   * The metadata that you apply to the task set to help you categorize and organize them.
   *
   * Each tag consists of a key and an optional value. You define both.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The task definition for the tasks in the task set to use.
   *
   * If a revision isn't specified, the latest `ACTIVE` revision is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-taskdefinition)
   */
  public fun taskDefinition(): String

  /**
   * A builder for [CfnTaskSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacityProviderStrategy The capacity provider strategy that are associated with the
     * task set.
     */
    public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable)

    /**
     * @param capacityProviderStrategy The capacity provider strategy that are associated with the
     * task set.
     */
    public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>)

    /**
     * @param capacityProviderStrategy The capacity provider strategy that are associated with the
     * task set.
     */
    public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any)

    /**
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts
     * the service to create the task set in. 
     */
    public fun cluster(cluster: String)

    /**
     * @param externalId An optional non-unique tag that identifies this task set in external
     * systems.
     * If the task set is associated with a service discovery registry, the tasks in this task set
     * will have the `ECS_TASK_SET_EXTERNAL_ID` AWS Cloud Map attribute set to the provided value.
     */
    public fun externalId(externalId: String)

    /**
     * @param launchType The launch type that new tasks in the task set uses.
     * For more information, see [Amazon ECS launch
     * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * If a `launchType` is specified, the `capacityProviderStrategy` parameter must be omitted.
     */
    public fun launchType(launchType: String)

    /**
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set.
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     */
    public fun loadBalancers(loadBalancers: IResolvable)

    /**
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set.
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     */
    public fun loadBalancers(loadBalancers: List<Any>)

    /**
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set.
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     */
    public fun loadBalancers(vararg loadBalancers: Any)

    /**
     * @param networkConfiguration The network configuration for the task set.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * @param networkConfiguration The network configuration for the task set.
     */
    public fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty)

    /**
     * @param networkConfiguration The network configuration for the task set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18c4776b25cc0243bc05854d524129a25d9f1a4413eddaa19f13cf06c790dd41")
    public
        fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * @param platformVersion The platform version that the tasks in the task set uses.
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used.
     */
    public fun platformVersion(platformVersion: String)

    /**
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set.
     */
    public fun scale(scale: IResolvable)

    /**
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set.
     */
    public fun scale(scale: CfnTaskSet.ScaleProperty)

    /**
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d38935f625979bbb68bcd980013bdc7653430db7b59351680e2217e4ed1aa9e8")
    public fun scale(scale: CfnTaskSet.ScaleProperty.Builder.() -> Unit)

    /**
     * @param service The short name or full Amazon Resource Name (ARN) of the service to create the
     * task set in. 
     */
    public fun service(service: String)

    /**
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set.
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     */
    public fun serviceRegistries(serviceRegistries: IResolvable)

    /**
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set.
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     */
    public fun serviceRegistries(serviceRegistries: List<Any>)

    /**
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set.
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     */
    public fun serviceRegistries(vararg serviceRegistries: Any)

    /**
     * @param tags The metadata that you apply to the task set to help you categorize and organize
     * them.
     * Each tag consists of a key and an optional value. You define both.
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
     * @param tags The metadata that you apply to the task set to help you categorize and organize
     * them.
     * Each tag consists of a key and an optional value. You define both.
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
     * @param taskDefinition The task definition for the tasks in the task set to use. 
     * If a revision isn't specified, the latest `ACTIVE` revision is used.
     */
    public fun taskDefinition(taskDefinition: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskSetProps.Builder =
        software.amazon.awscdk.services.ecs.CfnTaskSetProps.builder()

    /**
     * @param capacityProviderStrategy The capacity provider strategy that are associated with the
     * task set.
     */
    override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param capacityProviderStrategy The capacity provider strategy that are associated with the
     * task set.
     */
    override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
      cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param capacityProviderStrategy The capacity provider strategy that are associated with the
     * task set.
     */
    override fun capacityProviderStrategy(vararg capacityProviderStrategy: Any): Unit =
        capacityProviderStrategy(capacityProviderStrategy.toList())

    /**
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts
     * the service to create the task set in. 
     */
    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    /**
     * @param externalId An optional non-unique tag that identifies this task set in external
     * systems.
     * If the task set is associated with a service discovery registry, the tasks in this task set
     * will have the `ECS_TASK_SET_EXTERNAL_ID` AWS Cloud Map attribute set to the provided value.
     */
    override fun externalId(externalId: String) {
      cdkBuilder.externalId(externalId)
    }

    /**
     * @param launchType The launch type that new tasks in the task set uses.
     * For more information, see [Amazon ECS launch
     * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * If a `launchType` is specified, the `capacityProviderStrategy` parameter must be omitted.
     */
    override fun launchType(launchType: String) {
      cdkBuilder.launchType(launchType)
    }

    /**
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set.
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     */
    override fun loadBalancers(loadBalancers: IResolvable) {
      cdkBuilder.loadBalancers(loadBalancers.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set.
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     */
    override fun loadBalancers(loadBalancers: List<Any>) {
      cdkBuilder.loadBalancers(loadBalancers.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set.
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     */
    override fun loadBalancers(vararg loadBalancers: Any): Unit =
        loadBalancers(loadBalancers.toList())

    /**
     * @param networkConfiguration The network configuration for the task set.
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkConfiguration The network configuration for the task set.
     */
    override
        fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnTaskSet.NetworkConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param networkConfiguration The network configuration for the task set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18c4776b25cc0243bc05854d524129a25d9f1a4413eddaa19f13cf06c790dd41")
    override
        fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(CfnTaskSet.NetworkConfigurationProperty(networkConfiguration))

    /**
     * @param platformVersion The platform version that the tasks in the task set uses.
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used.
     */
    override fun platformVersion(platformVersion: String) {
      cdkBuilder.platformVersion(platformVersion)
    }

    /**
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set.
     */
    override fun scale(scale: IResolvable) {
      cdkBuilder.scale(scale.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set.
     */
    override fun scale(scale: CfnTaskSet.ScaleProperty) {
      cdkBuilder.scale(scale.let(CfnTaskSet.ScaleProperty.Companion::unwrap))
    }

    /**
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d38935f625979bbb68bcd980013bdc7653430db7b59351680e2217e4ed1aa9e8")
    override fun scale(scale: CfnTaskSet.ScaleProperty.Builder.() -> Unit): Unit =
        scale(CfnTaskSet.ScaleProperty(scale))

    /**
     * @param service The short name or full Amazon Resource Name (ARN) of the service to create the
     * task set in. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    /**
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set.
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     */
    override fun serviceRegistries(serviceRegistries: IResolvable) {
      cdkBuilder.serviceRegistries(serviceRegistries.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set.
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     */
    override fun serviceRegistries(serviceRegistries: List<Any>) {
      cdkBuilder.serviceRegistries(serviceRegistries.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set.
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     */
    override fun serviceRegistries(vararg serviceRegistries: Any): Unit =
        serviceRegistries(serviceRegistries.toList())

    /**
     * @param tags The metadata that you apply to the task set to help you categorize and organize
     * them.
     * Each tag consists of a key and an optional value. You define both.
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The metadata that you apply to the task set to help you categorize and organize
     * them.
     * Each tag consists of a key and an optional value. You define both.
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
     * @param taskDefinition The task definition for the tasks in the task set to use. 
     * If a revision isn't specified, the latest `ACTIVE` revision is used.
     */
    override fun taskDefinition(taskDefinition: String) {
      cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSetProps,
  ) : CdkObject(cdkObject),
      CfnTaskSetProps {
    /**
     * The capacity provider strategy that are associated with the task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-capacityproviderstrategy)
     */
    override fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to
     * create the task set in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-cluster)
     */
    override fun cluster(): String = unwrap(this).getCluster()

    /**
     * An optional non-unique tag that identifies this task set in external systems.
     *
     * If the task set is associated with a service discovery registry, the tasks in this task set
     * will have the `ECS_TASK_SET_EXTERNAL_ID` AWS Cloud Map attribute set to the provided value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-externalid)
     */
    override fun externalId(): String? = unwrap(this).getExternalId()

    /**
     * The launch type that new tasks in the task set uses.
     *
     * For more information, see [Amazon ECS launch
     * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * If a `launchType` is specified, the `capacityProviderStrategy` parameter must be omitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-launchtype)
     */
    override fun launchType(): String? = unwrap(this).getLaunchType()

    /**
     * A load balancer object representing the load balancer to use with the task set.
     *
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
     */
    override fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

    /**
     * The network configuration for the task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-networkconfiguration)
     */
    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * The platform version that the tasks in the task set uses.
     *
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-platformversion)
     */
    override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    /**
     * A floating-point percentage of your desired number of tasks to place and keep running in the
     * task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-scale)
     */
    override fun scale(): Any? = unwrap(this).getScale()

    /**
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-service)
     */
    override fun service(): String = unwrap(this).getService()

    /**
     * The details of the service discovery registries to assign to this task set.
     *
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
     */
    override fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

    /**
     * The metadata that you apply to the task set to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The task definition for the tasks in the task set to use.
     *
     * If a revision isn't specified, the latest `ACTIVE` revision is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-taskdefinition)
     */
    override fun taskDefinition(): String = unwrap(this).getTaskDefinition()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTaskSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSetProps):
        CfnTaskSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTaskSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTaskSetProps):
        software.amazon.awscdk.services.ecs.CfnTaskSetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.CfnTaskSetProps
  }
}
