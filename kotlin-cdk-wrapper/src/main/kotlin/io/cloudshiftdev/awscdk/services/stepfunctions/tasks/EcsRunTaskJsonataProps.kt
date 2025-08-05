@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.TaskDefinition
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonataBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for ECS Tasks using JSONata.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * Cluster cluster;
 * ContainerDefinition containerDefinition;
 * IEcsLaunchTarget ecsLaunchTarget;
 * Object outputs;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * TaskDefinition taskDefinition;
 * TaskRole taskRole;
 * Timeout timeout;
 * EcsRunTaskJsonataProps ecsRunTaskJsonataProps = EcsRunTaskJsonataProps.builder()
 * .cluster(cluster)
 * .launchTarget(ecsLaunchTarget)
 * .taskDefinition(taskDefinition)
 * // the properties below are optional
 * .assign(Map.of(
 * "assignKey", assign))
 * .assignPublicIp(false)
 * .comment("comment")
 * .containerOverrides(List.of(ContainerOverride.builder()
 * .containerDefinition(containerDefinition)
 * // the properties below are optional
 * .command(List.of("command"))
 * .cpu(123)
 * .environment(List.of(TaskEnvironmentVariable.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .memoryLimit(123)
 * .memoryReservation(123)
 * .build()))
 * .cpu("cpu")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .enableExecuteCommand(false)
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .memoryMiB("memoryMiB")
 * .outputs(outputs)
 * .propagatedTagSource(PropagatedTagSource.SERVICE)
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .revisionNumber(123)
 * .securityGroups(List.of(securityGroup))
 * .stateName("stateName")
 * .subnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface EcsRunTaskJsonataProps : TaskStateJsonataBaseProps {
  /**
   * Assign public IP addresses to each task.
   *
   * Default: false
   */
  public fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

  /**
   * The ECS cluster to run the task on.
   */
  public fun cluster(): ICluster

  /**
   * Container setting overrides.
   *
   * Specify the container to use and the overrides to apply.
   *
   * Default: - No overrides
   */
  public fun containerOverrides(): List<ContainerOverride> =
      unwrap(this).getContainerOverrides()?.map(ContainerOverride::wrap) ?: emptyList()

  /**
   * Cpu setting override.
   *
   * Default: - No override
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TaskOverride.html)
   */
  public fun cpu(): String? = unwrap(this).getCpu()

  /**
   * Whether ECS Exec should be enabled.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-enableExecuteCommand)
   */
  public fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

  /**
   * An Amazon ECS launch type determines the type of infrastructure on which your tasks and
   * services are hosted.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
   */
  public fun launchTarget(): IEcsLaunchTarget

  /**
   * Memory setting override.
   *
   * Default: - No override
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TaskOverride.html)
   */
  public fun memoryMiB(): String? = unwrap(this).getMemoryMiB()

  /**
   * Specifies whether to propagate the tags from the task definition to the task.
   *
   * An error will be received if you specify the SERVICE option when running a task.
   *
   * Default: - No tags are propagated.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-propagateTags)
   */
  public fun propagatedTagSource(): PropagatedTagSource? =
      unwrap(this).getPropagatedTagSource()?.let(PropagatedTagSource::wrap)

  /**
   * The revision number of ECS task definition family.
   *
   * Default: - '$latest'
   */
  public fun revisionNumber(): Number? = unwrap(this).getRevisionNumber()

  /**
   * Existing security groups to use for the tasks.
   *
   * Default: - A new security group is created
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * Subnets to place the task's ENIs.
   *
   * Default: - Public subnets if assignPublicIp is set. Private subnets otherwise.
   */
  public fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

  /**
   * [disable-awslint:ref-via-interface] Task Definition used for running tasks in the service.
   *
   * Note: this must be TaskDefinition, and not ITaskDefinition,
   * as it requires properties that are not known for imported task definitions
   * If you want to run a RunTask with an imported task definition,
   * consider using CustomState
   */
  public fun taskDefinition(): TaskDefinition

  /**
   * A builder for [EcsRunTaskJsonataProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param assignPublicIp Assign public IP addresses to each task.
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

    /**
     * @param cluster The ECS cluster to run the task on. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param containerOverrides Container setting overrides.
     * Specify the container to use and the overrides to apply.
     */
    public fun containerOverrides(containerOverrides: List<ContainerOverride>)

    /**
     * @param containerOverrides Container setting overrides.
     * Specify the container to use and the overrides to apply.
     */
    public fun containerOverrides(vararg containerOverrides: ContainerOverride)

    /**
     * @param cpu Cpu setting override.
     */
    public fun cpu(cpu: String)

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    public fun credentials(credentials: Credentials)

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("908ce7e508b2168a40c57b09c69675b829a0bd79568fd6e4aae4ff036453627d")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param enableExecuteCommand Whether ECS Exec should be enabled.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * @param launchTarget An Amazon ECS launch type determines the type of infrastructure on which
     * your tasks and services are hosted. 
     */
    public fun launchTarget(launchTarget: IEcsLaunchTarget)

    /**
     * @param memoryMiB Memory setting override.
     */
    public fun memoryMiB(memoryMiB: String)

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    public fun outputs(outputs: Any)

    /**
     * @param propagatedTagSource Specifies whether to propagate the tags from the task definition
     * to the task.
     * An error will be received if you specify the SERVICE option when running a task.
     */
    public fun propagatedTagSource(propagatedTagSource: PropagatedTagSource)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * @param revisionNumber The revision number of ECS task definition family.
     */
    public fun revisionNumber(revisionNumber: Number)

    /**
     * @param securityGroups Existing security groups to use for the tasks.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Existing security groups to use for the tasks.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param subnets Subnets to place the task's ENIs.
     */
    public fun subnets(subnets: SubnetSelection)

    /**
     * @param subnets Subnets to place the task's ENIs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d60dd18f61f002a6f15a2ac5ced8470a9b1ace197d4c517c1ee3d88fdda4e864")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param taskDefinition [disable-awslint:ref-via-interface] Task Definition used for running
     * tasks in the service. 
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using CustomState
     */
    public fun taskDefinition(taskDefinition: TaskDefinition)

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskJsonataProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskJsonataProps.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param assignPublicIp Assign public IP addresses to each task.
     */
    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * @param cluster The ECS cluster to run the task on. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param containerOverrides Container setting overrides.
     * Specify the container to use and the overrides to apply.
     */
    override fun containerOverrides(containerOverrides: List<ContainerOverride>) {
      cdkBuilder.containerOverrides(containerOverrides.map(ContainerOverride.Companion::unwrap))
    }

    /**
     * @param containerOverrides Container setting overrides.
     * Specify the container to use and the overrides to apply.
     */
    override fun containerOverrides(vararg containerOverrides: ContainerOverride): Unit =
        containerOverrides(containerOverrides.toList())

    /**
     * @param cpu Cpu setting override.
     */
    override fun cpu(cpu: String) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("908ce7e508b2168a40c57b09c69675b829a0bd79568fd6e4aae4ff036453627d")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param enableExecuteCommand Whether ECS Exec should be enabled.
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * @param launchTarget An Amazon ECS launch type determines the type of infrastructure on which
     * your tasks and services are hosted. 
     */
    override fun launchTarget(launchTarget: IEcsLaunchTarget) {
      cdkBuilder.launchTarget(launchTarget.let(IEcsLaunchTarget.Companion::unwrap))
    }

    /**
     * @param memoryMiB Memory setting override.
     */
    override fun memoryMiB(memoryMiB: String) {
      cdkBuilder.memoryMiB(memoryMiB)
    }

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * @param propagatedTagSource Specifies whether to propagate the tags from the task definition
     * to the task.
     * An error will be received if you specify the SERVICE option when running a task.
     */
    override fun propagatedTagSource(propagatedTagSource: PropagatedTagSource) {
      cdkBuilder.propagatedTagSource(propagatedTagSource.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * @param revisionNumber The revision number of ECS task definition family.
     */
    override fun revisionNumber(revisionNumber: Number) {
      cdkBuilder.revisionNumber(revisionNumber)
    }

    /**
     * @param securityGroups Existing security groups to use for the tasks.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups Existing security groups to use for the tasks.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param subnets Subnets to place the task's ENIs.
     */
    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param subnets Subnets to place the task's ENIs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d60dd18f61f002a6f15a2ac5ced8470a9b1ace197d4c517c1ee3d88fdda4e864")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    /**
     * @param taskDefinition [disable-awslint:ref-via-interface] Task Definition used for running
     * tasks in the service. 
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using CustomState
     */
    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition.Companion::unwrap))
    }

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskJsonataProps,
  ) : CdkObject(cdkObject),
      EcsRunTaskJsonataProps {
    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     */
    override fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

    /**
     * Assign public IP addresses to each task.
     *
     * Default: false
     */
    override fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

    /**
     * The ECS cluster to run the task on.
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * Container setting overrides.
     *
     * Specify the container to use and the overrides to apply.
     *
     * Default: - No overrides
     */
    override fun containerOverrides(): List<ContainerOverride> =
        unwrap(this).getContainerOverrides()?.map(ContainerOverride::wrap) ?: emptyList()

    /**
     * Cpu setting override.
     *
     * Default: - No override
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TaskOverride.html)
     */
    override fun cpu(): String? = unwrap(this).getCpu()

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     */
    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-enableExecuteCommand)
     */
    override fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     */
    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
     * `IntegrationPattern.RUN_JOB` for the following exceptions:
     * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
     * `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
     */
    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    /**
     * An Amazon ECS launch type determines the type of infrastructure on which your tasks and
     * services are hosted.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     */
    override fun launchTarget(): IEcsLaunchTarget =
        unwrap(this).getLaunchTarget().let(IEcsLaunchTarget::wrap)

    /**
     * Memory setting override.
     *
     * Default: - No override
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TaskOverride.html)
     */
    override fun memoryMiB(): String? = unwrap(this).getMemoryMiB()

    /**
     * Used to specify and transform output from the state.
     *
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     *
     * Default: - $states.result or $states.errorOutput
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
     */
    override fun outputs(): Any? = unwrap(this).getOutputs()

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * An error will be received if you specify the SERVICE option when running a task.
     *
     * Default: - No tags are propagated.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-propagateTags)
     */
    override fun propagatedTagSource(): PropagatedTagSource? =
        unwrap(this).getPropagatedTagSource()?.let(PropagatedTagSource::wrap)

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     */
    override fun queryLanguage(): QueryLanguage? =
        unwrap(this).getQueryLanguage()?.let(QueryLanguage::wrap)

    /**
     * The revision number of ECS task definition family.
     *
     * Default: - '$latest'
     */
    override fun revisionNumber(): Number? = unwrap(this).getRevisionNumber()

    /**
     * Existing security groups to use for the tasks.
     *
     * Default: - A new security group is created
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * Subnets to place the task's ENIs.
     *
     * Default: - Public subnets if assignPublicIp is set. Private subnets otherwise.
     */
    override fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    /**
     * [disable-awslint:ref-via-interface] Task Definition used for running tasks in the service.
     *
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using CustomState
     */
    override fun taskDefinition(): TaskDefinition =
        unwrap(this).getTaskDefinition().let(TaskDefinition::wrap)

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     */
    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsRunTaskJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskJsonataProps):
        EcsRunTaskJsonataProps = CdkObjectWrappers.wrap(cdkObject) as? EcsRunTaskJsonataProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsRunTaskJsonataProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskJsonataProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskJsonataProps
  }
}
