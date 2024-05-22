@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * Start an Athena Query as a Task.
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
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-athena.html)
 */
public open class AthenaStartQueryExecution(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AthenaStartQueryExecutionProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AthenaStartQueryExecutionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AthenaStartQueryExecutionProps.Builder.() -> Unit,
  ) : this(scope, id, AthenaStartQueryExecutionProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Unique string string to ensure idempotence.
     *
     * Default: - No client request token
     *
     * @param clientRequestToken Unique string string to ensure idempotence. 
     */
    public fun clientRequestToken(clientRequestToken: String)

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
    @JvmName("942466b6f212013430063d6aa1b48883ee060b514769613feac9ee50685e1ea0")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * A list of values for the parameters in a query.
     *
     * The values are applied sequentially to the parameters in the query in the order
     * in which the parameters occur.
     *
     * Default: - No parameters
     *
     * @param executionParameters A list of values for the parameters in a query. 
     */
    public fun executionParameters(executionParameters: List<String>)

    /**
     * A list of values for the parameters in a query.
     *
     * The values are applied sequentially to the parameters in the query in the order
     * in which the parameters occur.
     *
     * Default: - No parameters
     *
     * @param executionParameters A list of values for the parameters in a query. 
     */
    public fun executionParameters(vararg executionParameters: String)

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
     * Database within which query executes.
     *
     * Default: - No query execution context
     *
     * @param queryExecutionContext Database within which query executes. 
     */
    public fun queryExecutionContext(queryExecutionContext: QueryExecutionContext)

    /**
     * Database within which query executes.
     *
     * Default: - No query execution context
     *
     * @param queryExecutionContext Database within which query executes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ce2f6d23d7d00ff94cd1e82fa29642e77ead98a14d1978fc6ca7e174440e769")
    public
        fun queryExecutionContext(queryExecutionContext: QueryExecutionContext.Builder.() -> Unit)

    /**
     * Query that will be started.
     *
     * @param queryString Query that will be started. 
     */
    public fun queryString(queryString: String)

    /**
     * Configuration on how and where to save query.
     *
     * Default: - No result configuration
     *
     * @param resultConfiguration Configuration on how and where to save query. 
     */
    public fun resultConfiguration(resultConfiguration: ResultConfiguration)

    /**
     * Configuration on how and where to save query.
     *
     * Default: - No result configuration
     *
     * @param resultConfiguration Configuration on how and where to save query. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("676368ab9186fb13fb2f18192499e01769e9d529d284870eac5a8fb90af90dc9")
    public fun resultConfiguration(resultConfiguration: ResultConfiguration.Builder.() -> Unit)

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

    /**
     * Configuration on how and where to save query.
     *
     * Default: - No work group
     *
     * @param workGroup Configuration on how and where to save query. 
     */
    public fun workGroup(workGroup: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution.Builder.create(scope,
        id)

    /**
     * Unique string string to ensure idempotence.
     *
     * Default: - No client request token
     *
     * @param clientRequestToken Unique string string to ensure idempotence. 
     */
    override fun clientRequestToken(clientRequestToken: String) {
      cdkBuilder.clientRequestToken(clientRequestToken)
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
    @JvmName("942466b6f212013430063d6aa1b48883ee060b514769613feac9ee50685e1ea0")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * A list of values for the parameters in a query.
     *
     * The values are applied sequentially to the parameters in the query in the order
     * in which the parameters occur.
     *
     * Default: - No parameters
     *
     * @param executionParameters A list of values for the parameters in a query. 
     */
    override fun executionParameters(executionParameters: List<String>) {
      cdkBuilder.executionParameters(executionParameters)
    }

    /**
     * A list of values for the parameters in a query.
     *
     * The values are applied sequentially to the parameters in the query in the order
     * in which the parameters occur.
     *
     * Default: - No parameters
     *
     * @param executionParameters A list of values for the parameters in a query. 
     */
    override fun executionParameters(vararg executionParameters: String): Unit =
        executionParameters(executionParameters.toList())

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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
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
     * Database within which query executes.
     *
     * Default: - No query execution context
     *
     * @param queryExecutionContext Database within which query executes. 
     */
    override fun queryExecutionContext(queryExecutionContext: QueryExecutionContext) {
      cdkBuilder.queryExecutionContext(queryExecutionContext.let(QueryExecutionContext.Companion::unwrap))
    }

    /**
     * Database within which query executes.
     *
     * Default: - No query execution context
     *
     * @param queryExecutionContext Database within which query executes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ce2f6d23d7d00ff94cd1e82fa29642e77ead98a14d1978fc6ca7e174440e769")
    override
        fun queryExecutionContext(queryExecutionContext: QueryExecutionContext.Builder.() -> Unit):
        Unit = queryExecutionContext(QueryExecutionContext(queryExecutionContext))

    /**
     * Query that will be started.
     *
     * @param queryString Query that will be started. 
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * Configuration on how and where to save query.
     *
     * Default: - No result configuration
     *
     * @param resultConfiguration Configuration on how and where to save query. 
     */
    override fun resultConfiguration(resultConfiguration: ResultConfiguration) {
      cdkBuilder.resultConfiguration(resultConfiguration.let(ResultConfiguration.Companion::unwrap))
    }

    /**
     * Configuration on how and where to save query.
     *
     * Default: - No result configuration
     *
     * @param resultConfiguration Configuration on how and where to save query. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("676368ab9186fb13fb2f18192499e01769e9d529d284870eac5a8fb90af90dc9")
    override fun resultConfiguration(resultConfiguration: ResultConfiguration.Builder.() -> Unit):
        Unit = resultConfiguration(ResultConfiguration(resultConfiguration))

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
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
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

    /**
     * Configuration on how and where to save query.
     *
     * Default: - No work group
     *
     * @param workGroup Configuration on how and where to save query. 
     */
    override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AthenaStartQueryExecution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AthenaStartQueryExecution(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution):
        AthenaStartQueryExecution = AthenaStartQueryExecution(cdkObject)

    internal fun unwrap(wrapped: AthenaStartQueryExecution):
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution
  }
}
