@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

public interface AthenaStartQueryExecutionProps : TaskStateBaseProps {
  public fun clientRequestToken(): String? = unwrap(this).getClientRequestToken()

  public fun executionParameters(): List<String> = unwrap(this).getExecutionParameters() ?:
      emptyList()

  public fun queryExecutionContext(): QueryExecutionContext? =
      unwrap(this).getQueryExecutionContext()?.let(QueryExecutionContext::wrap)

  public fun queryString(): String

  public fun resultConfiguration(): ResultConfiguration? =
      unwrap(this).getResultConfiguration()?.let(ResultConfiguration::wrap)

  public fun workGroup(): String? = unwrap(this).getWorkGroup()

  @CdkDslMarker
  public interface Builder {
    public fun clientRequestToken(clientRequestToken: String)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea860b6d4d7a7f263b610cb1129ec062e25d0f3d1825bf34e309c2636e08b66c")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun executionParameters(executionParameters: List<String>)

    public fun executionParameters(vararg executionParameters: String)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun outputPath(outputPath: String)

    public fun queryExecutionContext(queryExecutionContext: QueryExecutionContext)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaeb2e21ab98678a8419f3000a26891d0754d3e543e6569425314c0662a70427")
    public
        fun queryExecutionContext(queryExecutionContext: QueryExecutionContext.Builder.() -> Unit)

    public fun queryString(queryString: String)

    public fun resultConfiguration(resultConfiguration: ResultConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("270040d4fb2e13b3026ca5b71008646104f36b818ed2c060873b7799093f4d0f")
    public fun resultConfiguration(resultConfiguration: ResultConfiguration.Builder.() -> Unit)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    public fun workGroup(workGroup: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps.builder()

    override fun clientRequestToken(clientRequestToken: String) {
      cdkBuilder.clientRequestToken(clientRequestToken)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea860b6d4d7a7f263b610cb1129ec062e25d0f3d1825bf34e309c2636e08b66c")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun executionParameters(executionParameters: List<String>) {
      cdkBuilder.executionParameters(executionParameters)
    }

    override fun executionParameters(vararg executionParameters: String): Unit =
        executionParameters(executionParameters.toList())

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun queryExecutionContext(queryExecutionContext: QueryExecutionContext) {
      cdkBuilder.queryExecutionContext(queryExecutionContext.let(QueryExecutionContext::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaeb2e21ab98678a8419f3000a26891d0754d3e543e6569425314c0662a70427")
    override
        fun queryExecutionContext(queryExecutionContext: QueryExecutionContext.Builder.() -> Unit):
        Unit = queryExecutionContext(QueryExecutionContext(queryExecutionContext))

    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    override fun resultConfiguration(resultConfiguration: ResultConfiguration) {
      cdkBuilder.resultConfiguration(resultConfiguration.let(ResultConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("270040d4fb2e13b3026ca5b71008646104f36b818ed2c060873b7799093f4d0f")
    override fun resultConfiguration(resultConfiguration: ResultConfiguration.Builder.() -> Unit):
        Unit = resultConfiguration(ResultConfiguration(resultConfiguration))

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps,
  ) : CdkObject(cdkObject), AthenaStartQueryExecutionProps {
    override fun clientRequestToken(): String? = unwrap(this).getClientRequestToken()

    override fun comment(): String? = unwrap(this).getComment()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun executionParameters(): List<String> = unwrap(this).getExecutionParameters() ?:
        emptyList()

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun queryExecutionContext(): QueryExecutionContext? =
        unwrap(this).getQueryExecutionContext()?.let(QueryExecutionContext::wrap)

    override fun queryString(): String = unwrap(this).getQueryString()

    override fun resultConfiguration(): ResultConfiguration? =
        unwrap(this).getResultConfiguration()?.let(ResultConfiguration::wrap)

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun workGroup(): String? = unwrap(this).getWorkGroup()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AthenaStartQueryExecutionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps):
        AthenaStartQueryExecutionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AthenaStartQueryExecutionProps):
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps
  }
}
