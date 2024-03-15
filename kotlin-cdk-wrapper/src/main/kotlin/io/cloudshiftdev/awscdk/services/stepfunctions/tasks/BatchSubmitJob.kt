@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BatchSubmitJob internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob,
) : TaskStateBase(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun arraySize(arraySize: Number)

    public fun attempts(attempts: Number)

    public fun comment(comment: String)

    public fun containerOverrides(containerOverrides: BatchContainerOverrides)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4142fe7dbfe5d527b3aec64eb7d84fa5e491d633c66db9920410796569222b08")
    public fun containerOverrides(containerOverrides: BatchContainerOverrides.Builder.() -> Unit)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a196e00fc0f536f730d2f9615c57b501ba9e0ffd237790f513e9cfd9d2c6aa08")
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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob.Builder.create(scope, id)

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
    @JvmName("4142fe7dbfe5d527b3aec64eb7d84fa5e491d633c66db9920410796569222b08")
    override fun containerOverrides(containerOverrides: BatchContainerOverrides.Builder.() -> Unit):
        Unit = containerOverrides(BatchContainerOverrides(containerOverrides))

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a196e00fc0f536f730d2f9615c57b501ba9e0ffd237790f513e9cfd9d2c6aa08")
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BatchSubmitJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BatchSubmitJob(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob):
        BatchSubmitJob = BatchSubmitJob(cdkObject)

    internal fun unwrap(wrapped: BatchSubmitJob):
        software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob = wrapped.cdkObject
  }
}
