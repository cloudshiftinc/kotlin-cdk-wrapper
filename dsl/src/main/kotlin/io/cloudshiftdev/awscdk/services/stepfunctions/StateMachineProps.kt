package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface StateMachineProps {
  public fun comment(): String? = unwrap(this).getComment()

  @Deprecated(message = "deprecated in CDK")
  public fun definition(): IChainable? = unwrap(this).getDefinition()?.let(IChainable::wrap)

  public fun definitionBody(): DefinitionBody? =
      unwrap(this).getDefinitionBody()?.let(DefinitionBody::wrap)

  public fun definitionSubstitutions(): Map<String, String> =
      unwrap(this).getDefinitionSubstitutions() ?: emptyMap()

  public fun logs(): LogOptions? = unwrap(this).getLogs()?.let(LogOptions::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun stateMachineName(): String? = unwrap(this).getStateMachineName()

  public fun stateMachineType(): StateMachineType? =
      unwrap(this).getStateMachineType()?.let(StateMachineType::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun tracingEnabled(): Boolean? = unwrap(this).getTracingEnabled()

  public interface Builder {
    public fun comment(comment: String) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun definition(definition: IChainable) {
    }

    public fun definitionBody(definitionBody: DefinitionBody) {
    }

    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
    }

    public fun logs(logs: LogOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be5c6b273531147f59a129d65f6503e2caff68ad31ba091bf199e00a8be55b36")
    public fun logs(logs: LogOptions.Builder.() -> Unit) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public fun role(role: IRole) {
    }

    public fun stateMachineName(stateMachineName: String) {
    }

    public fun stateMachineType(stateMachineType: StateMachineType) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun tracingEnabled(tracingEnabled: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder
        = software.amazon.awscdk.services.stepfunctions.StateMachineProps.builder()

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun definition(definition: IChainable) {
      cdkBuilder.definition(definition.let(IChainable::unwrap))
    }

    public override fun definitionBody(definitionBody: DefinitionBody) {
      cdkBuilder.definitionBody(definitionBody.let(DefinitionBody::unwrap))
    }

    public override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    public override fun logs(logs: LogOptions) {
      cdkBuilder.logs(logs.let(LogOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be5c6b273531147f59a129d65f6503e2caff68ad31ba091bf199e00a8be55b36")
    public override fun logs(logs: LogOptions.Builder.() -> Unit): Unit = logs(LogOptions(logs))

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun stateMachineName(stateMachineName: String) {
      cdkBuilder.stateMachineName(stateMachineName)
    }

    public override fun stateMachineType(stateMachineType: StateMachineType) {
      cdkBuilder.stateMachineType(stateMachineType.let(StateMachineType::unwrap))
    }

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.StateMachineProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachineProps,
  ) : StateMachineProps {
    public override fun comment(): String? = unwrap(this).getComment()

    @Deprecated(message = "deprecated in CDK")
    public override fun definition(): IChainable? =
        unwrap(this).getDefinition()?.let(IChainable::wrap)

    public override fun definitionBody(): DefinitionBody? =
        unwrap(this).getDefinitionBody()?.let(DefinitionBody::wrap)

    public override fun definitionSubstitutions(): Map<String, String> =
        unwrap(this).getDefinitionSubstitutions() ?: emptyMap()

    public override fun logs(): LogOptions? = unwrap(this).getLogs()?.let(LogOptions::wrap)

    public override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    public override fun stateMachineName(): String? = unwrap(this).getStateMachineName()

    public override fun stateMachineType(): StateMachineType? =
        unwrap(this).getStateMachineType()?.let(StateMachineType::wrap)

    public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    public override fun tracingEnabled(): Boolean? = unwrap(this).getTracingEnabled()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StateMachineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachineProps):
        StateMachineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StateMachineProps):
        software.amazon.awscdk.services.stepfunctions.StateMachineProps = (wrapped as
        Wrapper).cdkObject
  }
}
