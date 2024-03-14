package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine
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

public open class StepFunctionsStartExecution internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun associateWithParent(associateWithParent: Boolean)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f7e462556b533d19717700ff528efe5921f25aaa16c065a805cfe12fc409149")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun input(input: TaskInput)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun name(name: String)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateMachine(stateMachine: IStateMachine)

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
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution.Builder.create(scope,
        id)

    override fun associateWithParent(associateWithParent: Boolean) {
      cdkBuilder.associateWithParent(associateWithParent)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f7e462556b533d19717700ff528efe5921f25aaa16c065a805cfe12fc409149")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    override fun input(input: TaskInput) {
      cdkBuilder.input(input.let(TaskInput::unwrap))
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
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

    override fun stateMachine(stateMachine: IStateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(IStateMachine::unwrap))
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

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StepFunctionsStartExecution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StepFunctionsStartExecution(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution):
        StepFunctionsStartExecution = StepFunctionsStartExecution(cdkObject)

    internal fun unwrap(wrapped: StepFunctionsStartExecution):
        software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution =
        wrapped.cdkObject
  }
}
