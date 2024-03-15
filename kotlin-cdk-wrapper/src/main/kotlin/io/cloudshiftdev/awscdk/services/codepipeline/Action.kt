@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.events.RuleProps
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Action internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.Action,
) : CdkObject(cdkObject), IAction {
  public override fun actionProperties(): ActionProperties =
      unwrap(this).getActionProperties().let(ActionProperties::wrap)

  public override fun bind(
    scope: Construct,
    stage: IStage,
    options: ActionBindOptions,
  ): ActionConfig = unwrap(this).bind(scope.let(Construct::unwrap), stage.let(IStage::unwrap),
      options.let(ActionBindOptions::unwrap)).let(ActionConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("955d9e45cf1f3d172efb2ef89796d9b65af874c3315b9773b499eab1fdc76ba9")
  public override fun bind(
    scope: Construct,
    stage: IStage,
    options: ActionBindOptions.Builder.() -> Unit,
  ): ActionConfig = bind(scope, stage, ActionBindOptions(options))

  public override fun onStateChange(name: String): Rule =
      unwrap(this).onStateChange(name).let(Rule::wrap)

  public override fun onStateChange(name: String, target: IRuleTarget): Rule =
      unwrap(this).onStateChange(name, target.let(IRuleTarget::unwrap)).let(Rule::wrap)

  public override fun onStateChange(
    name: String,
    target: IRuleTarget,
    options: RuleProps,
  ): Rule = unwrap(this).onStateChange(name, target.let(IRuleTarget::unwrap),
      options.let(RuleProps::unwrap)).let(Rule::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
  public override fun onStateChange(
    name: String,
    target: IRuleTarget,
    options: RuleProps.Builder.() -> Unit,
  ): Rule = onStateChange(name, target, RuleProps(options))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.Action,
  ) : Action(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Action): Action =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Action): software.amazon.awscdk.services.codepipeline.Action =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.Action
  }
}
