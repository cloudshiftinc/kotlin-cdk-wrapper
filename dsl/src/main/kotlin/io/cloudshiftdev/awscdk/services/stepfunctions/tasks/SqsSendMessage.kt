package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.sqs.IQueue
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SqsSendMessage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d701c6cd97dd6102f4693ee5141d08447775453d5d2530d09a8b3f13da328d9")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun delay(delay: Duration)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun messageBody(messageBody: TaskInput)

    public fun messageDeduplicationId(messageDeduplicationId: String)

    public fun messageGroupId(messageGroupId: String)

    public fun outputPath(outputPath: String)

    public fun queue(queue: IQueue)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d701c6cd97dd6102f4693ee5141d08447775453d5d2530d09a8b3f13da328d9")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun delay(delay: Duration) {
      cdkBuilder.delay(delay.let(Duration::unwrap))
    }

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

    override fun messageBody(messageBody: TaskInput) {
      cdkBuilder.messageBody(messageBody.let(TaskInput::unwrap))
    }

    override fun messageDeduplicationId(messageDeduplicationId: String) {
      cdkBuilder.messageDeduplicationId(messageDeduplicationId)
    }

    override fun messageGroupId(messageGroupId: String) {
      cdkBuilder.messageGroupId(messageGroupId)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue::unwrap))
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

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SqsSendMessage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SqsSendMessage(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage):
        SqsSendMessage = SqsSendMessage(cdkObject)

    internal fun unwrap(wrapped: SqsSendMessage):
        software.amazon.awscdk.services.stepfunctions.tasks.SqsSendMessage = wrapped.cdkObject
  }
}
