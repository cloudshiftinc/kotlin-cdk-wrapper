@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskSet
import software.constructs.Construct

/**
 * Create a task set in the specified cluster and service.
 *
 * This is used when a service uses the `EXTERNAL` deployment controller type. For more information,
 * see
 * [Amazon ECS deployment types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * CfnTaskSet cfnTaskSet = CfnTaskSet.Builder.create(this, "MyCfnTaskSet")
 * .cluster("cluster")
 * .service("service")
 * .taskDefinition("taskDefinition")
 * // the properties below are optional
 * .externalId("externalId")
 * .launchType("launchType")
 * .loadBalancers(List.of(LoadBalancerProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .loadBalancerName("loadBalancerName")
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html)
 */
@CdkDslMarker
public class CfnTaskSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTaskSet.Builder = CfnTaskSet.Builder.create(scope, id)

    private val _loadBalancers: MutableList<Any> = mutableListOf()

    private val _serviceRegistries: MutableList<Any> = mutableListOf()

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to
     * create the task set in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-cluster)
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts
     *   the service to create the task set in.
     */
    public fun cluster(cluster: String) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * An optional non-unique tag that identifies this task set in external systems.
     *
     * If the task set is associated with a service discovery registry, the tasks in this task set
     * will have the `ECS_TASK_SET_EXTERNAL_ID` AWS Cloud Map attribute set to the provided value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-externalid)
     *
     * @param externalId An optional non-unique tag that identifies this task set in external
     *   systems.
     */
    public fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
    }

    /**
     * The launch type that new tasks in the task set uses.
     *
     * For more information, see
     * [Amazon ECS launch types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * If a `launchType` is specified, the `capacityProviderStrategy` parameter must be omitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-launchtype)
     *
     * @param launchType The launch type that new tasks in the task set uses.
     */
    public fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
    }

    /**
     * A load balancer object representing the load balancer to use with the task set.
     *
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
     *
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     *   task set.
     */
    public fun loadBalancers(vararg loadBalancers: Any) {
        _loadBalancers.addAll(listOf(*loadBalancers))
    }

    /**
     * A load balancer object representing the load balancer to use with the task set.
     *
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
     *
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     *   task set.
     */
    public fun loadBalancers(loadBalancers: Collection<Any>) {
        _loadBalancers.addAll(loadBalancers)
    }

    /**
     * A load balancer object representing the load balancer to use with the task set.
     *
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
     *
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     *   task set.
     */
    public fun loadBalancers(loadBalancers: IResolvable) {
        cdkBuilder.loadBalancers(loadBalancers)
    }

    /**
     * The network configuration for the task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-networkconfiguration)
     *
     * @param networkConfiguration The network configuration for the task set.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * The network configuration for the task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-networkconfiguration)
     *
     * @param networkConfiguration The network configuration for the task set.
     */
    public fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * The platform version that the tasks in the task set uses.
     *
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-platformversion)
     *
     * @param platformVersion The platform version that the tasks in the task set uses.
     */
    public fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
    }

    /**
     * A floating-point percentage of your desired number of tasks to place and keep running in the
     * task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-scale)
     *
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     *   running in the task set.
     */
    public fun scale(scale: IResolvable) {
        cdkBuilder.scale(scale)
    }

    /**
     * A floating-point percentage of your desired number of tasks to place and keep running in the
     * task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-scale)
     *
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     *   running in the task set.
     */
    public fun scale(scale: CfnTaskSet.ScaleProperty) {
        cdkBuilder.scale(scale)
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-service)
     *
     * @param service The short name or full Amazon Resource Name (ARN) of the service to create the
     *   task set in.
     */
    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    /**
     * The details of the service discovery registries to assign to this task set.
     *
     * For more information, see
     * [Service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
     *
     * @param serviceRegistries The details of the service discovery registries to assign to this
     *   task set.
     */
    public fun serviceRegistries(vararg serviceRegistries: Any) {
        _serviceRegistries.addAll(listOf(*serviceRegistries))
    }

    /**
     * The details of the service discovery registries to assign to this task set.
     *
     * For more information, see
     * [Service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
     *
     * @param serviceRegistries The details of the service discovery registries to assign to this
     *   task set.
     */
    public fun serviceRegistries(serviceRegistries: Collection<Any>) {
        _serviceRegistries.addAll(serviceRegistries)
    }

    /**
     * The details of the service discovery registries to assign to this task set.
     *
     * For more information, see
     * [Service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
     *
     * @param serviceRegistries The details of the service discovery registries to assign to this
     *   task set.
     */
    public fun serviceRegistries(serviceRegistries: IResolvable) {
        cdkBuilder.serviceRegistries(serviceRegistries)
    }

    /**
     * The task definition for the tasks in the task set to use.
     *
     * If a revision isn't specified, the latest `ACTIVE` revision is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-taskdefinition)
     *
     * @param taskDefinition The task definition for the tasks in the task set to use.
     */
    public fun taskDefinition(taskDefinition: String) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): CfnTaskSet {
        if (_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
        if (_serviceRegistries.isNotEmpty()) cdkBuilder.serviceRegistries(_serviceRegistries)
        return cdkBuilder.build()
    }
}
