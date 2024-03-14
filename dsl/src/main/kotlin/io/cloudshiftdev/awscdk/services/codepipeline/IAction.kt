package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.events.RuleProps
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IAction {
  public fun actionProperties(): ActionProperties

  public fun bind(
    arg0: Construct,
    arg1: IStage,
    arg2: ActionBindOptions,
  ): ActionConfig

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("955d9e45cf1f3d172efb2ef89796d9b65af874c3315b9773b499eab1fdc76ba9")
  public fun bind(
    arg0: Construct,
    arg1: IStage,
    arg2: ActionBindOptions.Builder.() -> Unit,
  ): ActionConfig

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.IAction,
  ) : IAction {
    override fun actionProperties(): ActionProperties =
        unwrap(this).getActionProperties().let(ActionProperties::wrap)

    override fun bind(
      arg0: Construct,
      arg1: IStage,
      arg2: ActionBindOptions,
    ): ActionConfig = unwrap(this).bind(arg0.let(Construct::unwrap), arg1.let(IStage::unwrap),
        arg2.let(ActionBindOptions::unwrap)).let(ActionConfig::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("955d9e45cf1f3d172efb2ef89796d9b65af874c3315b9773b499eab1fdc76ba9")
    override fun bind(
      arg0: Construct,
      arg1: IStage,
      arg2: ActionBindOptions.Builder.() -> Unit,
    ): ActionConfig = bind(arg0, arg1, ActionBindOptions(arg2))

    override fun onStateChange(arg0: String): Rule =
        unwrap(this).onStateChange(arg0).let(Rule::wrap)

    override fun onStateChange(arg0: String, arg1: IRuleTarget): Rule =
        unwrap(this).onStateChange(arg0, arg1.let(IRuleTarget::unwrap)).let(Rule::wrap)

    override fun onStateChange(
      arg0: String,
      arg1: IRuleTarget,
      arg2: RuleProps,
    ): Rule = unwrap(this).onStateChange(arg0, arg1.let(IRuleTarget::unwrap),
        arg2.let(RuleProps::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
    override fun onStateChange(
      arg0: String,
      arg1: IRuleTarget,
      arg2: RuleProps.Builder.() -> Unit,
    ): Rule = onStateChange(arg0, arg1, RuleProps(arg2))
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.IAction): IAction =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAction): software.amazon.awscdk.services.codepipeline.IAction =
        (wrapped as Wrapper).cdkObject
  }
}
