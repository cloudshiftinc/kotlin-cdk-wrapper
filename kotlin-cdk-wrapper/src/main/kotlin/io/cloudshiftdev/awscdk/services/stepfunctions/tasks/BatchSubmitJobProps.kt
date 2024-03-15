@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface BatchSubmitJobProps : TaskStateBaseProps {
  public fun arraySize(): Number? = unwrap(this).getArraySize()

  public fun attempts(): Number? = unwrap(this).getAttempts()

  public fun containerOverrides(): BatchContainerOverrides? =
      unwrap(this).getContainerOverrides()?.let(BatchContainerOverrides::wrap)

  public fun dependsOn(): List<BatchJobDependency> =
      unwrap(this).getDependsOn()?.map(BatchJobDependency::wrap) ?: emptyList()

  public fun jobDefinitionArn(): String

  public fun jobName(): String

  public fun jobQueueArn(): String

  public fun payload(): TaskInput? = unwrap(this).getPayload()?.let(TaskInput::wrap)

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun arraySize(arraySize: Number)

    public fun attempts(attempts: Number)

    public fun comment(comment: String)

    public fun containerOverrides(containerOverrides: BatchContainerOverrides)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b208579aa64fb4a25b0d9e6b262496648f73df005eaf87d1fa7d8f86d5509feb")
    public fun containerOverrides(containerOverrides: BatchContainerOverrides.Builder.() -> Unit)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a257df9e0422a51709b192e1f3a7116d7871b77893a9dd0cc7b95e35bad12c74")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun dependsOn(dependsOn: List<BatchJobDependency>)

    public fun dependsOn(vararg dependsOn: BatchJobDependency)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun jobDefinitionArn(jobDefinitionArn: String)

    public fun jobName(jobName: String)

    public fun jobQueueArn(jobQueueArn: String)

    public fun outputPath(outputPath: String)

    public fun payload(payload: TaskInput)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun tags(tags: Map<String, String>)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps.builder()

    override fun arraySize(arraySize: Number) {
      cdkBuilder.arraySize(arraySize)
    }

    override fun attempts(attempts: Number) {
      cdkBuilder.attempts(attempts)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun containerOverrides(containerOverrides: BatchContainerOverrides) {
      cdkBuilder.containerOverrides(containerOverrides.let(BatchContainerOverrides::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b208579aa64fb4a25b0d9e6b262496648f73df005eaf87d1fa7d8f86d5509feb")
    override fun containerOverrides(containerOverrides: BatchContainerOverrides.Builder.() -> Unit):
        Unit = containerOverrides(BatchContainerOverrides(containerOverrides))

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a257df9e0422a51709b192e1f3a7116d7871b77893a9dd0cc7b95e35bad12c74")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun dependsOn(dependsOn: List<BatchJobDependency>) {
      cdkBuilder.dependsOn(dependsOn.map(BatchJobDependency::unwrap))
    }

    override fun dependsOn(vararg dependsOn: BatchJobDependency): Unit =
        dependsOn(dependsOn.toList())

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

    override fun jobDefinitionArn(jobDefinitionArn: String) {
      cdkBuilder.jobDefinitionArn(jobDefinitionArn)
    }

    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
    }

    override fun jobQueueArn(jobQueueArn: String) {
      cdkBuilder.jobQueueArn(jobQueueArn)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun payload(payload: TaskInput) {
      cdkBuilder.payload(payload.let(TaskInput::unwrap))
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps,
  ) : CdkObject(cdkObject), BatchSubmitJobProps {
    override fun arraySize(): Number? = unwrap(this).getArraySize()

    override fun attempts(): Number? = unwrap(this).getAttempts()

    override fun comment(): String? = unwrap(this).getComment()

    override fun containerOverrides(): BatchContainerOverrides? =
        unwrap(this).getContainerOverrides()?.let(BatchContainerOverrides::wrap)

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun dependsOn(): List<BatchJobDependency> =
        unwrap(this).getDependsOn()?.map(BatchJobDependency::wrap) ?: emptyList()

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

    override fun jobName(): String = unwrap(this).getJobName()

    override fun jobQueueArn(): String = unwrap(this).getJobQueueArn()

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun payload(): TaskInput? = unwrap(this).getPayload()?.let(TaskInput::wrap)

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BatchSubmitJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps):
        BatchSubmitJobProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchSubmitJobProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps
  }
}
