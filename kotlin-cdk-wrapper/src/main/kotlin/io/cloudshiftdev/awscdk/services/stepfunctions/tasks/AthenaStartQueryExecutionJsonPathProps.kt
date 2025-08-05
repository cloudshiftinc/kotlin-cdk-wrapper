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
 * Properties for starting a Query Execution using JSONPath.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * Key key;
 * Object resultSelector;
 * TaskRole taskRole;
 * Timeout timeout;
 * AthenaStartQueryExecutionJsonPathProps athenaStartQueryExecutionJsonPathProps =
 * AthenaStartQueryExecutionJsonPathProps.builder()
 * .queryString("queryString")
 * // the properties below are optional
 * .assign(Map.of(
 * "assignKey", assign))
 * .clientRequestToken("clientRequestToken")
 * .comment("comment")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .executionParameters(List.of("executionParameters"))
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .inputPath("inputPath")
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .outputPath("outputPath")
 * .queryExecutionContext(QueryExecutionContext.builder()
 * .catalogName("catalogName")
 * .databaseName("databaseName")
 * .build())
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .resultConfiguration(ResultConfiguration.builder()
 * .encryptionConfiguration(EncryptionConfiguration.builder()
 * .encryptionOption(EncryptionOption.S3_MANAGED)
 * // the properties below are optional
 * .encryptionKey(key)
 * .build())
 * .outputLocation(Location.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .build())
 * .resultPath("resultPath")
 * .resultReuseConfigurationMaxAge(Duration.minutes(30))
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .stateName("stateName")
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .workGroup("workGroup")
 * .build();
 * ```
 */
public interface AthenaStartQueryExecutionJsonPathProps : TaskStateJsonPathBaseProps {
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
   * Specifies, in minutes, the maximum age of a previous query result that Athena should consider
   * for reuse.
   *
   * Default: - Query results are not reused
   */
  public fun resultReuseConfigurationMaxAge(): Duration? =
      unwrap(this).getResultReuseConfigurationMaxAge()?.let(Duration::wrap)

  /**
   * Configuration on how and where to save query.
   *
   * Default: - No work group
   */
  public fun workGroup(): String? = unwrap(this).getWorkGroup()

  /**
   * A builder for [AthenaStartQueryExecutionJsonPathProps]
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
     * @param clientRequestToken Unique string string to ensure idempotence.
     */
    public fun clientRequestToken(clientRequestToken: String)

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
    @JvmName("87d602b4be927c57c41ab18636c21f4af49f9d58438de7ea0b492f0e7aea4b90")
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
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
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
    @JvmName("fff450712eaba1f4f120bccb33c368e4a1c6a03f150b4125e60d2aa1f13702ae")
    public
        fun queryExecutionContext(queryExecutionContext: QueryExecutionContext.Builder.() -> Unit)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

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
    @JvmName("bd2c58600486c660144a9c9e0485fe4d866b16c0b04f8abbd31a27cfcdb3519b")
    public fun resultConfiguration(resultConfiguration: ResultConfiguration.Builder.() -> Unit)

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    public fun resultPath(resultPath: String)

    /**
     * @param resultReuseConfigurationMaxAge Specifies, in minutes, the maximum age of a previous
     * query result that Athena should consider for reuse.
     */
    public fun resultReuseConfigurationMaxAge(resultReuseConfigurationMaxAge: Duration)

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
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionJsonPathProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionJsonPathProps.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param clientRequestToken Unique string string to ensure idempotence.
     */
    override fun clientRequestToken(clientRequestToken: String) {
      cdkBuilder.clientRequestToken(clientRequestToken)
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
    @JvmName("87d602b4be927c57c41ab18636c21f4af49f9d58438de7ea0b492f0e7aea4b90")
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
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
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
      cdkBuilder.queryExecutionContext(queryExecutionContext.let(QueryExecutionContext.Companion::unwrap))
    }

    /**
     * @param queryExecutionContext Database within which query executes.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fff450712eaba1f4f120bccb33c368e4a1c6a03f150b4125e60d2aa1f13702ae")
    override
        fun queryExecutionContext(queryExecutionContext: QueryExecutionContext.Builder.() -> Unit):
        Unit = queryExecutionContext(QueryExecutionContext(queryExecutionContext))

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

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
      cdkBuilder.resultConfiguration(resultConfiguration.let(ResultConfiguration.Companion::unwrap))
    }

    /**
     * @param resultConfiguration Configuration on how and where to save query.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd2c58600486c660144a9c9e0485fe4d866b16c0b04f8abbd31a27cfcdb3519b")
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
     * @param resultReuseConfigurationMaxAge Specifies, in minutes, the maximum age of a previous
     * query result that Athena should consider for reuse.
     */
    override fun resultReuseConfigurationMaxAge(resultReuseConfigurationMaxAge: Duration) {
      cdkBuilder.resultReuseConfigurationMaxAge(resultReuseConfigurationMaxAge.let(Duration.Companion::unwrap))
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

    /**
     * @param workGroup Configuration on how and where to save query.
     */
    override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionJsonPathProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionJsonPathProps,
  ) : CdkObject(cdkObject),
      AthenaStartQueryExecutionJsonPathProps {
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
     * Unique string string to ensure idempotence.
     *
     * Default: - No client request token
     */
    override fun clientRequestToken(): String? = unwrap(this).getClientRequestToken()

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
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
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
     * Default: $
     */
    override fun resultPath(): String? = unwrap(this).getResultPath()

    /**
     * Specifies, in minutes, the maximum age of a previous query result that Athena should consider
     * for reuse.
     *
     * Default: - Query results are not reused
     */
    override fun resultReuseConfigurationMaxAge(): Duration? =
        unwrap(this).getResultReuseConfigurationMaxAge()?.let(Duration::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AthenaStartQueryExecutionJsonPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionJsonPathProps):
        AthenaStartQueryExecutionJsonPathProps = CdkObjectWrappers.wrap(cdkObject) as?
        AthenaStartQueryExecutionJsonPathProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AthenaStartQueryExecutionJsonPathProps):
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionJsonPathProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionJsonPathProps
  }
}
