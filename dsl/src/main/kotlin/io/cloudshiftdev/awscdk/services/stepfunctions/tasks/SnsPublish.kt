package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SnsPublish internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36e034ee794e6b2c498dc33e1c928b5563716757a21da4d2465113b631c6f36b")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun message(message: TaskInput)

    public fun messageAttributes(messageAttributes: Map<String, MessageAttribute>)

    public fun messageDeduplicationId(messageDeduplicationId: String)

    public fun messageGroupId(messageGroupId: String)

    public fun messagePerSubscriptionType(messagePerSubscriptionType: Boolean)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun subject(subject: String)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    public fun topic(topic: ITopic)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36e034ee794e6b2c498dc33e1c928b5563716757a21da4d2465113b631c6f36b")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

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

    override fun message(message: TaskInput) {
      cdkBuilder.message(message.let(TaskInput::unwrap))
    }

    override fun messageAttributes(messageAttributes: Map<String, MessageAttribute>) {
      cdkBuilder.messageAttributes(messageAttributes.mapValues{MessageAttribute.unwrap(it.value)})
    }

    override fun messageDeduplicationId(messageDeduplicationId: String) {
      cdkBuilder.messageDeduplicationId(messageDeduplicationId)
    }

    override fun messageGroupId(messageGroupId: String) {
      cdkBuilder.messageGroupId(messageGroupId)
    }

    override fun messagePerSubscriptionType(messagePerSubscriptionType: Boolean) {
      cdkBuilder.messagePerSubscriptionType(messagePerSubscriptionType)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
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

    override fun subject(subject: String) {
      cdkBuilder.subject(subject)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SnsPublish {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SnsPublish(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish):
        SnsPublish = SnsPublish(cdkObject)

    internal fun unwrap(wrapped: SnsPublish):
        software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish = wrapped.cdkObject
  }
}
