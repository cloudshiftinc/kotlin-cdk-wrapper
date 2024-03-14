package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.eks.ICluster
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
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

public open class EksCall internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EksCall,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun cluster(cluster: ICluster) {
    }

    public fun comment(comment: String) {
    }

    public fun credentials(credentials: Credentials) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33a93114cf24de9e7686eb36e3776389d3561a97c7d5374a189c505a315bdefc")
    public fun credentials(credentials: Credentials.Builder.() -> Unit) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
    }

    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    }

    public fun httpMethod(httpMethod: HttpMethods) {
    }

    public fun httpPath(httpPath: String) {
    }

    public fun inputPath(inputPath: String) {
    }

    public fun integrationPattern(integrationPattern: IntegrationPattern) {
    }

    public fun outputPath(outputPath: String) {
    }

    public fun queryParameters(queryParameters: Map<String, List<String>>) {
    }

    public fun requestBody(requestBody: TaskInput) {
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
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.EksCall.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EksCall.Builder.create(scope, id)

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33a93114cf24de9e7686eb36e3776389d3561a97c7d5374a189c505a315bdefc")
    public override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    @Deprecated(message = "deprecated in CDK")
    public override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    public override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    public override fun httpMethod(httpMethod: HttpMethods) {
      cdkBuilder.httpMethod(httpMethod.let(HttpMethods::unwrap))
    }

    public override fun httpPath(httpPath: String) {
      cdkBuilder.httpPath(httpPath)
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

    public override fun queryParameters(queryParameters: Map<String, List<String>>) {
      cdkBuilder.queryParameters(queryParameters)
    }

    public override fun requestBody(requestBody: TaskInput) {
      cdkBuilder.requestBody(requestBody.let(TaskInput::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EksCall =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EksCall {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EksCall(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EksCall):
        EksCall = EksCall(cdkObject)

    internal fun unwrap(wrapped: EksCall):
        software.amazon.awscdk.services.stepfunctions.tasks.EksCall = wrapped.cdkObject
  }
}
