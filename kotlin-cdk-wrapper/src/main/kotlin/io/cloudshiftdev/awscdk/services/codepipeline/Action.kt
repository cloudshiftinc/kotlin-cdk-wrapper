@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.events.RuleProps
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Low-level class for generic CodePipeline Actions implementing the `IAction` interface.
 *
 * Contains some common logic that can be re-used by all `IAction` implementations.
 * If you're writing your own Action class,
 * feel free to extend this class.
 */
public abstract class Action(
  cdkObject: software.amazon.awscdk.services.codepipeline.Action,
) : CdkObject(cdkObject),
    IAction {
  /**
   * The simple properties of the Action, like its Owner, name, etc.
   *
   * Note that this accessor will be called before the `bind` callback.
   */
  public override fun actionProperties(): ActionProperties =
      unwrap(this).getActionProperties().let(ActionProperties::wrap)

  /**
   * The callback invoked when this Action is added to a Pipeline.
   *
   * @param scope 
   * @param stage 
   * @param options 
   */
  public override fun bind(
    scope: Construct,
    stage: IStage,
    options: ActionBindOptions,
  ): ActionConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      stage.let(IStage.Companion::unwrap),
      options.let(ActionBindOptions.Companion::unwrap)).let(ActionConfig::wrap)

  /**
   * The callback invoked when this Action is added to a Pipeline.
   *
   * @param scope 
   * @param stage 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("955d9e45cf1f3d172efb2ef89796d9b65af874c3315b9773b499eab1fdc76ba9")
  public override fun bind(
    scope: Construct,
    stage: IStage,
    options: ActionBindOptions.Builder.() -> Unit,
  ): ActionConfig = bind(scope, stage, ActionBindOptions(options))

  /**
   * Creates an Event that will be triggered whenever the state of this Action changes.
   *
   * @param name 
   * @param target
   * @param options
   */
  public override fun onStateChange(name: String): Rule =
      unwrap(this).onStateChange(name).let(Rule::wrap)

  /**
   * Creates an Event that will be triggered whenever the state of this Action changes.
   *
   * @param name 
   * @param target
   * @param options
   */
  public override fun onStateChange(name: String, target: IRuleTarget): Rule =
      unwrap(this).onStateChange(name, target.let(IRuleTarget.Companion::unwrap)).let(Rule::wrap)

  /**
   * Creates an Event that will be triggered whenever the state of this Action changes.
   *
   * @param name 
   * @param target
   * @param options
   */
  public override fun onStateChange(
    name: String,
    target: IRuleTarget,
    options: RuleProps,
  ): Rule = unwrap(this).onStateChange(name, target.let(IRuleTarget.Companion::unwrap),
      options.let(RuleProps.Companion::unwrap)).let(Rule::wrap)

  /**
   * Creates an Event that will be triggered whenever the state of this Action changes.
   *
   * @param name 
   * @param target
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
  public override fun onStateChange(
    name: String,
    target: IRuleTarget,
    options: RuleProps.Builder.() -> Unit,
  ): Rule = onStateChange(name, target, RuleProps(options))

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.Action,
  ) : Action(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Action): Action =
        CdkObjectWrappers.wrap(cdkObject) as? Action ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Action): software.amazon.awscdk.services.codepipeline.Action =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.Action
  }
}
