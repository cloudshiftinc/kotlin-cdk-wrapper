package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.events.RuleProps
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IStage {
  public fun actions(): List<IAction>

  public fun addAction(arg0: IAction)

  public fun onStateChange(arg0: String): Rule

  public fun onStateChange(arg0: String, arg1: IRuleTarget): Rule

  public fun onStateChange(
    arg0: String,
    arg1: IRuleTarget,
    arg2: RuleProps,
  ): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
  public fun onStateChange(
    arg0: String,
    arg1: IRuleTarget,
    arg2: RuleProps.Builder.() -> Unit,
  ): Rule

  public fun pipeline(): IPipeline

  public fun stageName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.IStage,
  ) : IStage {
    public override fun actions(): List<IAction> = unwrap(this).getActions().map(IAction::wrap)

    public override fun addAction(arg0: IAction) {
      unwrap(this).addAction(arg0.let(IAction::unwrap))
    }

    public override fun onStateChange(arg0: String): Rule =
        unwrap(this).onStateChange(arg0).let(Rule::wrap)

    public override fun onStateChange(arg0: String, arg1: IRuleTarget): Rule =
        unwrap(this).onStateChange(arg0, arg1.let(IRuleTarget::unwrap)).let(Rule::wrap)

    public override fun onStateChange(
      arg0: String,
      arg1: IRuleTarget,
      arg2: RuleProps,
    ): Rule = unwrap(this).onStateChange(arg0, arg1.let(IRuleTarget::unwrap),
        arg2.let(RuleProps::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
    public override fun onStateChange(
      arg0: String,
      arg1: IRuleTarget,
      arg2: RuleProps.Builder.() -> Unit,
    ): Rule = onStateChange(arg0, arg1, RuleProps(arg2))

    public override fun pipeline(): IPipeline = unwrap(this).getPipeline().let(IPipeline::wrap)

    public override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.IStage): IStage =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStage): software.amazon.awscdk.services.codepipeline.IStage =
        (wrapped as Wrapper).cdkObject
  }
}
