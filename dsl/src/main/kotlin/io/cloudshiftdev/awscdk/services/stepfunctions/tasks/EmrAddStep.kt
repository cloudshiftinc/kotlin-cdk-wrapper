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

public open class EmrAddStep internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun actionOnFailure(actionOnFailure: ActionOnFailure) {
    }

    public fun args(args: List<String>) {
    }

    public fun clusterId(clusterId: String) {
    }

    public fun comment(comment: String) {
    }

    public fun credentials(credentials: Credentials) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46dd41809c086fd23d6e543ff78ed342e0598359f168b597885d45238556fdf8")
    public fun credentials(credentials: Credentials.Builder.() -> Unit) {
    }

    public fun executionRoleArn(executionRoleArn: String) {
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

    public fun jar(jar: String) {
    }

    public fun mainClass(mainClass: String) {
    }

    public fun name(name: String) {
    }

    public fun outputPath(outputPath: String) {
    }

    public fun properties(properties: Map<String, String>) {
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
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep.Builder.create(scope, id)

    public override fun actionOnFailure(actionOnFailure: ActionOnFailure) {
      cdkBuilder.actionOnFailure(actionOnFailure.let(ActionOnFailure::unwrap))
    }

    public override fun args(args: List<String>) {
      cdkBuilder.args(args)
    }

    public override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46dd41809c086fd23d6e543ff78ed342e0598359f168b597885d45238556fdf8")
    public override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    public override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
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

    public override fun jar(jar: String) {
      cdkBuilder.jar(jar)
    }

    public override fun mainClass(mainClass: String) {
      cdkBuilder.mainClass(mainClass)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    public override fun properties(properties: Map<String, String>) {
      cdkBuilder.properties(properties)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
