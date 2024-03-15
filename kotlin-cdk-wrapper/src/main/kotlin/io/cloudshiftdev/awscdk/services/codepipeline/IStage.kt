@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.events.RuleProps
import kotlin.String
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
  public fun onStateChange(
    arg0: String,
    arg1: IRuleTarget,
    arg2: RuleProps.Builder.() -> Unit,
  ): Rule

  public fun pipeline(): IPipeline

  public fun stageName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.IStage,
  ) : CdkObject(cdkObject), IStage {
    override fun actions(): List<IAction> = unwrap(this).getActions().map(IAction::wrap)

    override fun addAction(arg0: IAction) {
      unwrap(this).addAction(arg0.let(IAction::unwrap))
    }

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
    override fun onStateChange(
      arg0: String,
      arg1: IRuleTarget,
      arg2: RuleProps.Builder.() -> Unit,
    ): Rule = onStateChange(arg0, arg1, RuleProps(arg2))

    override fun pipeline(): IPipeline = unwrap(this).getPipeline().let(IPipeline::wrap)

    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.IStage): IStage =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStage): software.amazon.awscdk.services.codepipeline.IStage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.IStage
  }
}
