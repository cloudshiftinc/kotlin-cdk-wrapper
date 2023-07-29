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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskProps
import software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget

/**
 * Properties for ECS Tasks.
 *
 * Example:
 * ```
 * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
 * .isDefault(true)
 * .build());
 * Cluster cluster = Cluster.Builder.create(this, "Ec2Cluster").vpc(vpc).build();
 * cluster.addCapacity("DefaultAutoScalingGroup", AddCapacityOptions.builder()
 * .instanceType(new InstanceType("t2.micro"))
 * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
 * .build());
 * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
 * .compatibility(Compatibility.EC2)
 * .build();
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("foo/bar"))
 * .memoryLimitMiB(256)
 * .build());
 * EcsRunTask runTask = EcsRunTask.Builder.create(this, "Run")
 * .integrationPattern(IntegrationPattern.RUN_JOB)
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .launchTarget(EcsEc2LaunchTarget.Builder.create()
 * .placementStrategies(List.of(PlacementStrategy.spreadAcrossInstances(),
 * PlacementStrategy.packedByCpu(), PlacementStrategy.randomly()))
 * .placementConstraints(List.of(PlacementConstraint.memberOf("blieptuut")))
 * .build())
 * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
 * .build();
 * ```
 */
@CdkDslMarker
public class EcsRunTaskPropsDsl {
    private val cdkBuilder: EcsRunTaskProps.Builder = EcsRunTaskProps.builder()

    private val _containerOverrides: MutableList<ContainerOverride> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /** @param assignPublicIp Assign public IP addresses to each task. */
    public fun assignPublicIp(assignPublicIp: Boolean) {
        cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /** @param cluster The ECS cluster to run the task on. */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /** @param comment An optional description for this state. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param containerOverrides Container setting overrides. Specify the container to use and the
     *   overrides to apply.
     */
    public fun containerOverrides(containerOverrides: ContainerOverrideDsl.() -> Unit) {
        _containerOverrides.add(ContainerOverrideDsl().apply(containerOverrides).build())
    }

    /**
     * @param containerOverrides Container setting overrides. Specify the container to use and the
     *   overrides to apply.
     */
    public fun containerOverrides(containerOverrides: Collection<ContainerOverride>) {
        _containerOverrides.addAll(containerOverrides)
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task. This enables cross-account resource invocations.
     */
    public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(credentials)
        cdkBuilder.credentials(builder.build())
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task. This enables cross-account resource invocations.
     */
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
        cdkBuilder.heartbeat(heartbeat)
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat. [disable-awslint:duration-prop-type] is
     *   needed because all props interface in aws-stepfunctions-tasks extend this interface
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state. May also be the special value JsonPath.DISCARD, which will cause the effective input
     *   to be the empty object {}.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     *   States Language. You can control these AWS services using service integration patterns
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    /**
     * @param launchTarget An Amazon ECS launch type determines the type of infrastructure on which
     *   your tasks and services are hosted.
     */
    public fun launchTarget(launchTarget: IEcsLaunchTarget) {
        cdkBuilder.launchTarget(launchTarget)
    }

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     *   to the next state. May also be the special value JsonPath.DISCARD, which will cause the
     *   effective output to be the empty object {}.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param propagatedTagSource Specifies whether to propagate the tags from the task definition
     *   to the task. An error will be received if you specify the SERVICE option when running a
     *   task.
     */
    public fun propagatedTagSource(propagatedTagSource: PropagatedTagSource) {
        cdkBuilder.propagatedTagSource(propagatedTagSource)
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output. May
     *   also be the special value JsonPath.DISCARD, which will cause the state's input to become
     *   its output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    /** @param revisionNumber The revision number of ECS task definiton family. */
    public fun revisionNumber(revisionNumber: Number) {
        cdkBuilder.revisionNumber(revisionNumber)
    }

    /** @param securityGroups Existing security groups to use for the tasks. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups Existing security groups to use for the tasks. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param subnets Subnets to place the task's ENIs. */
    public fun subnets(subnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnets)
        cdkBuilder.subnets(builder.build())
    }

    /** @param subnets Subnets to place the task's ENIs. */
    public fun subnets(subnets: SubnetSelection) {
        cdkBuilder.subnets(subnets)
    }

    /**
     * @param taskDefinition [disable-awslint:ref-via-interface] Task Definition used for running
     *   tasks in the service. Note: this must be TaskDefinition, and not ITaskDefinition, as it
     *   requires properties that are not known for imported task definitions If you want to run a
     *   RunTask with an imported task definition, consider using CustomState
     */
    public fun taskDefinition(taskDefinition: TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    /**
     * @param taskTimeout Timeout for the task. [disable-awslint:duration-prop-type] is needed
     *   because all props interface in aws-stepfunctions-tasks extend this interface
     */
    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): EcsRunTaskProps {
        if (_containerOverrides.isNotEmpty()) cdkBuilder.containerOverrides(_containerOverrides)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
