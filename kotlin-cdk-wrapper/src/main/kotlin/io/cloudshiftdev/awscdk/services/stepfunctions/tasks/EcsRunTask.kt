@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.TaskDefinition
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Run a Task on ECS or Fargate.
 *
 * Example:
 *
 * ```
 * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
 * .isDefault(true)
 * .build());
 * Cluster cluster = Cluster.Builder.create(this, "FargateCluster").vpc(vpc).build();
 * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
 * .memoryMiB("512")
 * .cpu("256")
 * .compatibility(Compatibility.FARGATE)
 * .build();
 * ContainerDefinition containerDefinition = taskDefinition.addContainer("TheContainer",
 * ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("foo/bar"))
 * .memoryLimitMiB(256)
 * .build());
 * EcsRunTask runTask = EcsRunTask.Builder.create(this, "RunFargate")
 * .integrationPattern(IntegrationPattern.RUN_JOB)
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .assignPublicIp(true)
 * .containerOverrides(List.of(ContainerOverride.builder()
 * .containerDefinition(containerDefinition)
 * .environment(List.of(TaskEnvironmentVariable.builder().name("SOME_KEY").value(JsonPath.stringAt("$.SomeKey")).build()))
 * .build()))
 * .launchTarget(new EcsFargateLaunchTarget())
 * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
 * .build();
 * ```
 */
public open class EcsRunTask(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask,
) : TaskStateBase(cdkObject),
    IConnectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsRunTaskProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EcsRunTaskProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsRunTaskProps.Builder.() -> Unit,
  ) : this(scope, id, EcsRunTaskProps(props)
  )

  /**
   * Manage allowed network traffic for this service.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.EcsRunTask].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * Assign public IP addresses to each task.
     *
     * Default: false
     *
     * @param assignPublicIp Assign public IP addresses to each task. 
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

    /**
     * The ECS cluster to run the task on.
     *
     * @param cluster The ECS cluster to run the task on. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    public fun comment(comment: String)

    /**
     * Container setting overrides.
     *
     * Specify the container to use and the overrides to apply.
     *
     * Default: - No overrides
     *
     * @param containerOverrides Container setting overrides. 
     */
    public fun containerOverrides(containerOverrides: List<ContainerOverride>)

    /**
     * Container setting overrides.
     *
     * Specify the container to use and the overrides to apply.
     *
     * Default: - No overrides
     *
     * @param containerOverrides Container setting overrides. 
     */
    public fun containerOverrides(vararg containerOverrides: ContainerOverride)

    /**
     * Cpu setting override.
     *
     * Default: - No override
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TaskOverride.html)
     * @param cpu Cpu setting override. 
     */
    public fun cpu(cpu: String)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    public fun credentials(credentials: Credentials)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70ebe03278a53b551b732afadb0fad9fa84cad26998f0d5390edfd9bf918bd2e")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-enableExecuteCommand)
     * @param enableExecuteCommand Whether ECS Exec should be enabled. 
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    public fun inputPath(inputPath: String)

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
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * An Amazon ECS launch type determines the type of infrastructure on which your tasks and
     * services are hosted.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     * @param launchTarget An Amazon ECS launch type determines the type of infrastructure on which
     * your tasks and services are hosted. 
     */
    public fun launchTarget(launchTarget: IEcsLaunchTarget)

    /**
     * Memory setting override.
     *
     * Default: - No override
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TaskOverride.html)
     * @param memoryMiB Memory setting override. 
     */
    public fun memoryMiB(memoryMiB: String)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    public fun outputPath(outputPath: String)

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
     * @param outputs Used to specify and transform output from the state. 
     */
    public fun outputs(outputs: Any)

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * An error will be received if you specify the SERVICE option when running a task.
     *
     * Default: - No tags are propagated.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-propagateTags)
     * @param propagatedTagSource Specifies whether to propagate the tags from the task definition
     * to the task. 
     */
    public fun propagatedTagSource(propagatedTagSource: PropagatedTagSource)

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    public fun resultPath(resultPath: String)

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * The revision number of ECS task definition family.
     *
     * Default: - '$latest'
     *
     * @param revisionNumber The revision number of ECS task definition family. 
     */
    public fun revisionNumber(revisionNumber: Number)

    /**
     * Existing security groups to use for the tasks.
     *
     * Default: - A new security group is created
     *
     * @param securityGroups Existing security groups to use for the tasks. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * Existing security groups to use for the tasks.
     *
     * Default: - A new security group is created
     *
     * @param securityGroups Existing security groups to use for the tasks. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * Subnets to place the task's ENIs.
     *
     * Default: - Public subnets if assignPublicIp is set. Private subnets otherwise.
     *
     * @param subnets Subnets to place the task's ENIs. 
     */
    public fun subnets(subnets: SubnetSelection)

    /**
     * Subnets to place the task's ENIs.
     *
     * Default: - Public subnets if assignPublicIp is set. Private subnets otherwise.
     *
     * @param subnets Subnets to place the task's ENIs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53ef47c4171694591a1bf3d57aaafc4fe3f6177bfc360a41d93d468a4f845a37")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    /**
     * [disable-awslint:ref-via-interface] Task Definition used for running tasks in the service.
     *
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using CustomState
     *
     * @param taskDefinition [disable-awslint:ref-via-interface] Task Definition used for running
     * tasks in the service. 
     */
    public fun taskDefinition(taskDefinition: TaskDefinition)

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask.Builder.create(scope, id)

    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Assign public IP addresses to each task.
     *
     * Default: false
     *
     * @param assignPublicIp Assign public IP addresses to each task. 
     */
    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * The ECS cluster to run the task on.
     *
     * @param cluster The ECS cluster to run the task on. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * Container setting overrides.
     *
     * Specify the container to use and the overrides to apply.
     *
     * Default: - No overrides
     *
     * @param containerOverrides Container setting overrides. 
     */
    override fun containerOverrides(containerOverrides: List<ContainerOverride>) {
      cdkBuilder.containerOverrides(containerOverrides.map(ContainerOverride.Companion::unwrap))
    }

    /**
     * Container setting overrides.
     *
     * Specify the container to use and the overrides to apply.
     *
     * Default: - No overrides
     *
     * @param containerOverrides Container setting overrides. 
     */
    override fun containerOverrides(vararg containerOverrides: ContainerOverride): Unit =
        containerOverrides(containerOverrides.toList())

    /**
     * Cpu setting override.
     *
     * Default: - No override
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TaskOverride.html)
     * @param cpu Cpu setting override. 
     */
    override fun cpu(cpu: String) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70ebe03278a53b551b732afadb0fad9fa84cad26998f0d5390edfd9bf918bd2e")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-enableExecuteCommand)
     * @param enableExecuteCommand Whether ECS Exec should be enabled. 
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
    }

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

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
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * An Amazon ECS launch type determines the type of infrastructure on which your tasks and
     * services are hosted.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     * @param launchTarget An Amazon ECS launch type determines the type of infrastructure on which
     * your tasks and services are hosted. 
     */
    override fun launchTarget(launchTarget: IEcsLaunchTarget) {
      cdkBuilder.launchTarget(launchTarget.let(IEcsLaunchTarget.Companion::unwrap))
    }

    /**
     * Memory setting override.
     *
     * Default: - No override
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TaskOverride.html)
     * @param memoryMiB Memory setting override. 
     */
    override fun memoryMiB(memoryMiB: String) {
      cdkBuilder.memoryMiB(memoryMiB)
    }

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

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
     * @param outputs Used to specify and transform output from the state. 
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * An error will be received if you specify the SERVICE option when running a task.
     *
     * Default: - No tags are propagated.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-propagateTags)
     * @param propagatedTagSource Specifies whether to propagate the tags from the task definition
     * to the task. 
     */
    override fun propagatedTagSource(propagatedTagSource: PropagatedTagSource) {
      cdkBuilder.propagatedTagSource(propagatedTagSource.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The revision number of ECS task definition family.
     *
     * Default: - '$latest'
     *
     * @param revisionNumber The revision number of ECS task definition family. 
     */
    override fun revisionNumber(revisionNumber: Number) {
      cdkBuilder.revisionNumber(revisionNumber)
    }

    /**
     * Existing security groups to use for the tasks.
     *
     * Default: - A new security group is created
     *
     * @param securityGroups Existing security groups to use for the tasks. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * Existing security groups to use for the tasks.
     *
     * Default: - A new security group is created
     *
     * @param securityGroups Existing security groups to use for the tasks. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * Subnets to place the task's ENIs.
     *
     * Default: - Public subnets if assignPublicIp is set. Private subnets otherwise.
     *
     * @param subnets Subnets to place the task's ENIs. 
     */
    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * Subnets to place the task's ENIs.
     *
     * Default: - Public subnets if assignPublicIp is set. Private subnets otherwise.
     *
     * @param subnets Subnets to place the task's ENIs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53ef47c4171694591a1bf3d57aaafc4fe3f6177bfc360a41d93d468a4f845a37")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    /**
     * [disable-awslint:ref-via-interface] Task Definition used for running tasks in the service.
     *
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using CustomState
     *
     * @param taskDefinition [disable-awslint:ref-via-interface] Task Definition used for running
     * tasks in the service. 
     */
    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition.Companion::unwrap))
    }

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask.PROPERTY_INJECTION_ID

    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: EcsRunTaskJsonPathProps,
    ): EcsRunTask =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(EcsRunTaskJsonPathProps.Companion::unwrap)).let(EcsRunTask::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("143be0842b9400824f49c5a1631a69e90650256fd3c931d99ef25c07c25bf772")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: EcsRunTaskJsonPathProps.Builder.() -> Unit,
    ): EcsRunTask = jsonPath(scope, id, EcsRunTaskJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: EcsRunTaskJsonataProps,
    ): EcsRunTask =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(EcsRunTaskJsonataProps.Companion::unwrap)).let(EcsRunTask::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fb6ca11adb1311212541904399f7cb9ce7f76bcfdb5bc8326a6880b50cbc713")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: EcsRunTaskJsonataProps.Builder.() -> Unit,
    ): EcsRunTask = jsonata(scope, id, EcsRunTaskJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EcsRunTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EcsRunTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask):
        EcsRunTask = EcsRunTask(cdkObject)

    internal fun unwrap(wrapped: EcsRunTask):
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask
  }
}
