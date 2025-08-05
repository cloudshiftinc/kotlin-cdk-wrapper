@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonPathBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for EmrAddStep using JSONPath.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * Object resultSelector;
 * TaskRole taskRole;
 * Timeout timeout;
 * EmrAddStepJsonPathProps emrAddStepJsonPathProps = EmrAddStepJsonPathProps.builder()
 * .clusterId("clusterId")
 * .jar("jar")
 * .name("name")
 * // the properties below are optional
 * .actionOnFailure(ActionOnFailure.TERMINATE_CLUSTER)
 * .args(List.of("args"))
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .executionRoleArn("executionRoleArn")
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .inputPath("inputPath")
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .mainClass("mainClass")
 * .outputPath("outputPath")
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .stateName("stateName")
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface EmrAddStepJsonPathProps : TaskStateJsonPathBaseProps {
  /**
   * The action to take when the cluster step fails.
   *
   * Default: ActionOnFailure.CONTINUE
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_StepConfig.html)
   */
  public fun actionOnFailure(): ActionOnFailure? =
      unwrap(this).getActionOnFailure()?.let(ActionOnFailure::wrap)

  /**
   * A list of command line arguments passed to the JAR file's main function when executed.
   *
   * Default: - No args
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
   */
  public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

  /**
   * The ClusterId to add the Step to.
   */
  public fun clusterId(): String

  /**
   * The Amazon Resource Name (ARN) of the runtime role for a step on the cluster.
   *
   * Default: - Uses EC2 instance profile role
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_AddJobFlowSteps.html#API_AddJobFlowSteps_RequestSyntax)
   */
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * A path to a JAR file run during the step.
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
   */
  public fun jar(): String

  /**
   * The name of the main class in the specified Java file.
   *
   * If not specified, the JAR file should specify a Main-Class in its manifest file.
   *
   * Default: - No mainClass
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
   */
  public fun mainClass(): String? = unwrap(this).getMainClass()

  /**
   * The name of the Step.
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_StepConfig.html)
   */
  public fun name(): String

  /**
   * A list of Java properties that are set when the step runs.
   *
   * You can use these properties to pass key value pairs to your main function.
   *
   * Default: - No properties
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
   */
  public fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()

  /**
   * A builder for [EmrAddStepJsonPathProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionOnFailure The action to take when the cluster step fails.
     */
    public fun actionOnFailure(actionOnFailure: ActionOnFailure)

    /**
     * @param args A list of command line arguments passed to the JAR file's main function when
     * executed.
     */
    public fun args(args: List<String>)

    /**
     * @param args A list of command line arguments passed to the JAR file's main function when
     * executed.
     */
    public fun args(vararg args: String)

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param clusterId The ClusterId to add the Step to. 
     */
    public fun clusterId(clusterId: String)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

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
    @JvmName("7dbdfdf52c5b0e108bdb4a0bfee0d2bcc206ae6b6ee1a0cc5a9f510dcaa62078")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the runtime role for a step on the
     * cluster.
     */
    public fun executionRoleArn(executionRoleArn: String)

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
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    public fun inputPath(inputPath: String)

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * @param jar A path to a JAR file run during the step. 
     */
    public fun jar(jar: String)

    /**
     * @param mainClass The name of the main class in the specified Java file.
     * If not specified, the JAR file should specify a Main-Class in its manifest file.
     */
    public fun mainClass(mainClass: String)

    /**
     * @param name The name of the Step. 
     */
    public fun name(name: String)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param properties A list of Java properties that are set when the step runs.
     * You can use these properties to pass key value pairs to your main function.
     */
    public fun properties(properties: Map<String, String>)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    public fun resultPath(resultPath: String)

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

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
        software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepJsonPathProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepJsonPathProps.builder()

    /**
     * @param actionOnFailure The action to take when the cluster step fails.
     */
    override fun actionOnFailure(actionOnFailure: ActionOnFailure) {
      cdkBuilder.actionOnFailure(actionOnFailure.let(ActionOnFailure.Companion::unwrap))
    }

    /**
     * @param args A list of command line arguments passed to the JAR file's main function when
     * executed.
     */
    override fun args(args: List<String>) {
      cdkBuilder.args(args)
    }

    /**
     * @param args A list of command line arguments passed to the JAR file's main function when
     * executed.
     */
    override fun args(vararg args: String): Unit = args(args.toList())

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param clusterId The ClusterId to add the Step to. 
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
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
    @JvmName("7dbdfdf52c5b0e108bdb4a0bfee0d2bcc206ae6b6ee1a0cc5a9f510dcaa62078")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the runtime role for a step on the
     * cluster.
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
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
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
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
     * @param jar A path to a JAR file run during the step. 
     */
    override fun jar(jar: String) {
      cdkBuilder.jar(jar)
    }

    /**
     * @param mainClass The name of the main class in the specified Java file.
     * If not specified, the JAR file should specify a Main-Class in its manifest file.
     */
    override fun mainClass(mainClass: String) {
      cdkBuilder.mainClass(mainClass)
    }

    /**
     * @param name The name of the Step. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param properties A list of Java properties that are set when the step runs.
     * You can use these properties to pass key value pairs to your main function.
     */
    override fun properties(properties: Map<String, String>) {
      cdkBuilder.properties(properties)
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
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepJsonPathProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepJsonPathProps,
  ) : CdkObject(cdkObject),
      EmrAddStepJsonPathProps {
    /**
     * The action to take when the cluster step fails.
     *
     * Default: ActionOnFailure.CONTINUE
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_StepConfig.html)
     */
    override fun actionOnFailure(): ActionOnFailure? =
        unwrap(this).getActionOnFailure()?.let(ActionOnFailure::wrap)

    /**
     * A list of command line arguments passed to the JAR file's main function when executed.
     *
     * Default: - No args
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     */
    override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

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
     * The ClusterId to add the Step to.
     */
    override fun clusterId(): String = unwrap(this).getClusterId()

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

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
     * The Amazon Resource Name (ARN) of the runtime role for a step on the cluster.
     *
     * Default: - Uses EC2 instance profile role
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_AddJobFlowSteps.html#API_AddJobFlowSteps_RequestSyntax)
     */
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

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
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     */
    override fun inputPath(): String? = unwrap(this).getInputPath()

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
     * A path to a JAR file run during the step.
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     */
    override fun jar(): String = unwrap(this).getJar()

    /**
     * The name of the main class in the specified Java file.
     *
     * If not specified, the JAR file should specify a Main-Class in its manifest file.
     *
     * Default: - No mainClass
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     */
    override fun mainClass(): String? = unwrap(this).getMainClass()

    /**
     * The name of the Step.
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_StepConfig.html)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

    /**
     * A list of Java properties that are set when the step runs.
     *
     * You can use these properties to pass key value pairs to your main function.
     *
     * Default: - No properties
     *
     * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_HadoopJarStepConfig.html)
     */
    override fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()

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
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     */
    override fun resultPath(): String? = unwrap(this).getResultPath()

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
     */
    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): EmrAddStepJsonPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepJsonPathProps):
        EmrAddStepJsonPathProps = CdkObjectWrappers.wrap(cdkObject) as? EmrAddStepJsonPathProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmrAddStepJsonPathProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepJsonPathProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepJsonPathProps
  }
}
