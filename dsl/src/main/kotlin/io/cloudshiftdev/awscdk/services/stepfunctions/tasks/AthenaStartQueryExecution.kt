package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AthenaStartQueryExecution internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun clientRequestToken(clientRequestToken: String) {
    }

    public fun comment(comment: String) {
    }

    public fun credentials(credentials: Credentials) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("942466b6f212013430063d6aa1b48883ee060b514769613feac9ee50685e1ea0")
    public fun credentials(credentials: Credentials.Builder.() -> Unit) {
    }

    public fun executionParameters(executionParameters: List<String>) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
    }

    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    }

    public fun inputPath(inputPath: String) {
    }

    public fun integrationPattern(integrationPattern: IntegrationPattern) {
    }

    public fun outputPath(outputPath: String) {
    }

    public fun queryExecutionContext(queryExecutionContext: QueryExecutionContext) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ce2f6d23d7d00ff94cd1e82fa29642e77ead98a14d1978fc6ca7e174440e769")
    public
        fun queryExecutionContext(queryExecutionContext: QueryExecutionContext.Builder.() -> Unit) {
    }

    public fun queryString(queryString: String) {
    }

    public fun resultConfiguration(resultConfiguration: ResultConfiguration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("676368ab9186fb13fb2f18192499e01769e9d529d284870eac5a8fb90af90dc9")
    public fun resultConfiguration(resultConfiguration: ResultConfiguration.Builder.() -> Unit) {
    }

    public fun resultPath(resultPath: String) {
    }

    public fun resultSelector(resultSelector: Map<String, Any>) {
    }

    public fun stateName(stateName: String) {
    }

    public fun taskTimeout(taskTimeout: Timeout) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
    }

    public fun workGroup(workGroup: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution.Builder.create(scope,
        id)

    public override fun clientRequestToken(clientRequestToken: String) {
      cdkBuilder.clientRequestToken(clientRequestToken)
    }

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("942466b6f212013430063d6aa1b48883ee060b514769613feac9ee50685e1ea0")
    public override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    public override fun executionParameters(executionParameters: List<String>) {
      cdkBuilder.executionParameters(executionParameters)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    public override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    public override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    public override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    public override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    public override fun queryExecutionContext(queryExecutionContext: QueryExecutionContext) {
      cdkBuilder.queryExecutionContext(queryExecutionContext.let(QueryExecutionContext::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ce2f6d23d7d00ff94cd1e82fa29642e77ead98a14d1978fc6ca7e174440e769")
    public override
        fun queryExecutionContext(queryExecutionContext: QueryExecutionContext.Builder.() -> Unit):
        Unit = queryExecutionContext(QueryExecutionContext(queryExecutionContext))

    public override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    public override fun resultConfiguration(resultConfiguration: ResultConfiguration) {
      cdkBuilder.resultConfiguration(resultConfiguration.let(ResultConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("676368ab9186fb13fb2f18192499e01769e9d529d284870eac5a8fb90af90dc9")
    public override
        fun resultConfiguration(resultConfiguration: ResultConfiguration.Builder.() -> Unit): Unit =
        resultConfiguration(ResultConfiguration(resultConfiguration))

    public override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    public override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    public override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        wrapped.cdkObject
  }
}
