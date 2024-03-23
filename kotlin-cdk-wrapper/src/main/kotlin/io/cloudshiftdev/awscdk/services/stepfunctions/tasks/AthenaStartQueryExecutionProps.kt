@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for starting a Query Execution.
 *
 * Example:
 *
 * ```
 * AthenaStartQueryExecution startQueryExecutionJob = AthenaStartQueryExecution.Builder.create(this,
 * "Start Athena Query")
 * .queryString(JsonPath.stringAt("$.queryString"))
 * .queryExecutionContext(QueryExecutionContext.builder()
 * .databaseName("mydatabase")
 * .build())
 * .resultConfiguration(ResultConfiguration.builder()
 * .encryptionConfiguration(EncryptionConfiguration.builder()
 * .encryptionOption(EncryptionOption.S3_MANAGED)
 * .build())
 * .outputLocation(Location.builder()
 * .bucketName("query-results-bucket")
 * .objectKey("folder")
 * .build())
 * .build())
 * .executionParameters(List.of("param1", "param2"))
 * .build();
 * ```
 */
public interface AthenaStartQueryExecutionProps : TaskStateBaseProps {
  /**
   * Unique string string to ensure idempotence.
   *
   * Default: - No client request token
   */
  public fun clientRequestToken(): String? = unwrap(this).getClientRequestToken()

  /**
   * A list of values for the parameters in a query.
   *
   * The values are applied sequentially to the parameters in the query in the order
   * in which the parameters occur.
   *
   * Default: - No parameters
   */
  public fun executionParameters(): List<String> = unwrap(this).getExecutionParameters() ?:
      emptyList()

  /**
   * Database within which query executes.
   *
   * Default: - No query execution context
   */
  public fun queryExecutionContext(): QueryExecutionContext? =
      unwrap(this).getQueryExecutionContext()?.let(QueryExecutionContext::wrap)

  /**
   * Query that will be started.
   */
  public fun queryString(): String

  /**
   * Configuration on how and where to save query.
   *
   * Default: - No result configuration
   */
  public fun resultConfiguration(): ResultConfiguration? =
      unwrap(this).getResultConfiguration()?.let(ResultConfiguration::wrap)

  /**
   * Configuration on how and where to save query.
   *
   * Default: - No work group
   */
  public fun workGroup(): String? = unwrap(this).getWorkGroup()

  /**
   * A builder for [AthenaStartQueryExecutionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientRequestToken Unique string string to ensure idempotence.
     */
    public fun clientRequestToken(clientRequestToken: String)

    /**
     * @param comment An optional description for this state.
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
    @JvmName("ea860b6d4d7a7f263b610cb1129ec062e25d0f3d1825bf34e309c2636e08b66c")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param executionParameters A list of values for the parameters in a query.
     * The values are applied sequentially to the parameters in the query in the order
     * in which the parameters occur.
     */
    public fun executionParameters(executionParameters: List<String>)

    /**
     * @param executionParameters A list of values for the parameters in a query.
     * The values are applied sequentially to the parameters in the query in the order
     * in which the parameters occur.
     */
    public fun executionParameters(vararg executionParameters: String)

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
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param queryExecutionContext Database within which query executes.
     */
    public fun queryExecutionContext(queryExecutionContext: QueryExecutionContext)

    /**
     * @param queryExecutionContext Database within which query executes.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaeb2e21ab98678a8419f3000a26891d0754d3e543e6569425314c0662a70427")
    public
        fun queryExecutionContext(queryExecutionContext: QueryExecutionContext.Builder.() -> Unit)

    /**
     * @param queryString Query that will be started. 
     */
    public fun queryString(queryString: String)

    /**
     * @param resultConfiguration Configuration on how and where to save query.
     */
    public fun resultConfiguration(resultConfiguration: ResultConfiguration)

    /**
     * @param resultConfiguration Configuration on how and where to save query.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("270040d4fb2e13b3026ca5b71008646104f36b818ed2c060873b7799093f4d0f")
    public fun resultConfiguration(resultConfiguration: ResultConfiguration.Builder.() -> Unit)

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

    /**
     * @param workGroup Configuration on how and where to save query.
     */
    public fun workGroup(workGroup: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps.builder()

    /**
     * @param clientRequestToken Unique string string to ensure idempotence.
     */
    override fun clientRequestToken(clientRequestToken: String) {
      cdkBuilder.clientRequestToken(clientRequestToken)
    }

    /**
     * @param comment An optional description for this state.
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
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea860b6d4d7a7f263b610cb1129ec062e25d0f3d1825bf34e309c2636e08b66c")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param executionParameters A list of values for the parameters in a query.
     * The values are applied sequentially to the parameters in the query in the order
     * in which the parameters occur.
     */
    override fun executionParameters(executionParameters: List<String>) {
      cdkBuilder.executionParameters(executionParameters)
    }

    /**
     * @param executionParameters A list of values for the parameters in a query.
     * The values are applied sequentially to the parameters in the query in the order
     * in which the parameters occur.
     */
    override fun executionParameters(vararg executionParameters: String): Unit =
        executionParameters(executionParameters.toList())

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param queryExecutionContext Database within which query executes.
     */
    override fun queryExecutionContext(queryExecutionContext: QueryExecutionContext) {
      cdkBuilder.queryExecutionContext(queryExecutionContext.let(QueryExecutionContext::unwrap))
    }

    /**
     * @param queryExecutionContext Database within which query executes.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaeb2e21ab98678a8419f3000a26891d0754d3e543e6569425314c0662a70427")
    override
        fun queryExecutionContext(queryExecutionContext: QueryExecutionContext.Builder.() -> Unit):
        Unit = queryExecutionContext(QueryExecutionContext(queryExecutionContext))

    /**
     * @param queryString Query that will be started. 
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * @param resultConfiguration Configuration on how and where to save query.
     */
    override fun resultConfiguration(resultConfiguration: ResultConfiguration) {
      cdkBuilder.resultConfiguration(resultConfiguration.let(ResultConfiguration::unwrap))
    }

    /**
     * @param resultConfiguration Configuration on how and where to save query.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("270040d4fb2e13b3026ca5b71008646104f36b818ed2c060873b7799093f4d0f")
    override fun resultConfiguration(resultConfiguration: ResultConfiguration.Builder.() -> Unit):
        Unit = resultConfiguration(ResultConfiguration(resultConfiguration))

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
      cdkBuilder.resultSelector(resultSelector)
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
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * @param workGroup Configuration on how and where to save query.
     */
    override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps,
  ) : CdkObject(cdkObject), AthenaStartQueryExecutionProps {
    /**
     * Unique string string to ensure idempotence.
     *
     * Default: - No client request token
     */
    override fun clientRequestToken(): String? = unwrap(this).getClientRequestToken()

    /**
     * An optional description for this state.
     *
     * Default: - No comment
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
     * A list of values for the parameters in a query.
     *
     * The values are applied sequentially to the parameters in the query in the order
     * in which the parameters occur.
     *
     * Default: - No parameters
     */
    override fun executionParameters(): List<String> = unwrap(this).getExecutionParameters() ?:
        emptyList()

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
     * Default: - The entire task input (JSON path '$')
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
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

    /**
     * Database within which query executes.
     *
     * Default: - No query execution context
     */
    override fun queryExecutionContext(): QueryExecutionContext? =
        unwrap(this).getQueryExecutionContext()?.let(QueryExecutionContext::wrap)

    /**
     * Query that will be started.
     */
    override fun queryString(): String = unwrap(this).getQueryString()

    /**
     * Configuration on how and where to save query.
     *
     * Default: - No result configuration
     */
    override fun resultConfiguration(): ResultConfiguration? =
        unwrap(this).getResultConfiguration()?.let(ResultConfiguration::wrap)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
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

    /**
     * Configuration on how and where to save query.
     *
     * Default: - No work group
     */
    override fun workGroup(): String? = unwrap(this).getWorkGroup()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AthenaStartQueryExecutionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps):
        AthenaStartQueryExecutionProps = CdkObjectWrappers.wrap(cdkObject) as?
        AthenaStartQueryExecutionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AthenaStartQueryExecutionProps):
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps
  }
}
