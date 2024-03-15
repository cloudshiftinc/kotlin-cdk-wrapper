@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Step Functions Task to add a Step to an EMR Cluster.
 *
 * The StepConfiguration is defined as Parameters in the state machine definition.
 *
 * OUTPUT: the StepId
 *
 * Example:
 *
 * ```
 * EmrAddStep.Builder.create(this, "Task")
 * .clusterId("ClusterId")
 * .name("StepName")
 * .jar("Jar")
 * .actionOnFailure(ActionOnFailure.CONTINUE)
 * .build();
 * ```
 */
public open class EmrAddStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep,
) : TaskStateBase(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.EmrAddStep].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The action to take when the cluster step fails.
     *
     * Default: ActionOnFailure.CONTINUE
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_StepConfig.html)
     * @param actionOnFailure The action to take when the cluster step fails. 
     */
    public fun actionOnFailure(actionOnFailure: ActionOnFailure)

    /**
     * A list of command line arguments passed to the JAR file's main function when executed.
     *
     * Default: - No args
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     * @param args A list of command line arguments passed to the JAR file's main function when
     * executed. 
     */
    public fun args(args: List<String>)

    /**
     * A list of command line arguments passed to the JAR file's main function when executed.
     *
     * Default: - No args
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     * @param args A list of command line arguments passed to the JAR file's main function when
     * executed. 
     */
    public fun args(vararg args: String)

    /**
     * The ClusterId to add the Step to.
     *
     * @param clusterId The ClusterId to add the Step to. 
     */
    public fun clusterId(clusterId: String)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
     */
    public fun comment(comment: String)

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
    @JvmName("46dd41809c086fd23d6e543ff78ed342e0598359f168b597885d45238556fdf8")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the runtime role for a step on the cluster.
     *
     * Default: - Uses EC2 instance profile role
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_AddJobFlowSteps.html#API_AddJobFlowSteps_RequestSyntax)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the runtime role for a step on the
     * cluster. 
     */
    public fun executionRoleArn(executionRoleArn: String)

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
     * Default: - The entire task input (JSON path '$')
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
     * A path to a JAR file run during the step.
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     * @param jar A path to a JAR file run during the step. 
     */
    public fun jar(jar: String)

    /**
     * The name of the main class in the specified Java file.
     *
     * If not specified, the JAR file should specify a Main-Class in its manifest file.
     *
     * Default: - No mainClass
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     * @param mainClass The name of the main class in the specified Java file. 
     */
    public fun mainClass(mainClass: String)

    /**
     * The name of the Step.
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_StepConfig.html)
     * @param name The name of the Step. 
     */
    public fun name(name: String)

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state. 
     */
    public fun outputPath(outputPath: String)

    /**
     * A list of Java properties that are set when the step runs.
     *
     * You can use these properties to pass key value pairs to your main function.
     *
     * Default: - No properties
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     * @param properties A list of Java properties that are set when the step runs. 
     */
    public fun properties(properties: Map<String, String>)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
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
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep.Builder.create(scope, id)

    /**
     * The action to take when the cluster step fails.
     *
     * Default: ActionOnFailure.CONTINUE
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_StepConfig.html)
     * @param actionOnFailure The action to take when the cluster step fails. 
     */
    override fun actionOnFailure(actionOnFailure: ActionOnFailure) {
      cdkBuilder.actionOnFailure(actionOnFailure.let(ActionOnFailure::unwrap))
    }

    /**
     * A list of command line arguments passed to the JAR file's main function when executed.
     *
     * Default: - No args
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     * @param args A list of command line arguments passed to the JAR file's main function when
     * executed. 
     */
    override fun args(args: List<String>) {
      cdkBuilder.args(args)
    }

    /**
     * A list of command line arguments passed to the JAR file's main function when executed.
     *
     * Default: - No args
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     * @param args A list of command line arguments passed to the JAR file's main function when
     * executed. 
     */
    override fun args(vararg args: String): Unit = args(args.toList())

    /**
     * The ClusterId to add the Step to.
     *
     * @param clusterId The ClusterId to add the Step to. 
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
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
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
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
    @JvmName("46dd41809c086fd23d6e543ff78ed342e0598359f168b597885d45238556fdf8")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * The Amazon Resource Name (ARN) of the runtime role for a step on the cluster.
     *
     * Default: - Uses EC2 instance profile role
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_AddJobFlowSteps.html#API_AddJobFlowSteps_RequestSyntax)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the runtime role for a step on the
     * cluster. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
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
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
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
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    /**
     * A path to a JAR file run during the step.
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     * @param jar A path to a JAR file run during the step. 
     */
    override fun jar(jar: String) {
      cdkBuilder.jar(jar)
    }

    /**
     * The name of the main class in the specified Java file.
     *
     * If not specified, the JAR file should specify a Main-Class in its manifest file.
     *
     * Default: - No mainClass
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     * @param mainClass The name of the main class in the specified Java file. 
     */
    override fun mainClass(mainClass: String) {
      cdkBuilder.mainClass(mainClass)
    }

    /**
     * The name of the Step.
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_StepConfig.html)
     * @param name The name of the Step. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * A list of Java properties that are set when the step runs.
     *
     * You can use these properties to pass key value pairs to your main function.
     *
     * Default: - No properties
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     * @param properties A list of Java properties that are set when the step runs. 
     */
    override fun properties(properties: Map<String, String>) {
      cdkBuilder.properties(properties)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
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
      cdkBuilder.resultSelector(resultSelector)
    }

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
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
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
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EmrAddStep {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EmrAddStep(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep):
        EmrAddStep = EmrAddStep(cdkObject)

    internal fun unwrap(wrapped: EmrAddStep):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep = wrapped.cdkObject
  }
}
