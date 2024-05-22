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
 * A Pipeline Action.
 *
 * If you want to implement this interface,
 * consider extending the `Action` class,
 * which contains some common logic.
 */
public interface IAction {
  /**
   * The simple properties of the Action, like its Owner, name, etc.
   *
   * Note that this accessor will be called before the `bind` callback.
   */
  public fun actionProperties(): ActionProperties

  /**
   * The callback invoked when this Action is added to a Pipeline.
   *
   * @param scope the Construct tree scope the Action can use if it needs to create any resources. 
   * @param stage the `IStage` this Action is being added to. 
   * @param options additional options the Action can use, like the artifact Bucket of the pipeline
   * it's being added to. 
   */
  public fun bind(
    scope: Construct,
    stage: IStage,
    options: ActionBindOptions,
  ): ActionConfig

  /**
   * The callback invoked when this Action is added to a Pipeline.
   *
   * @param scope the Construct tree scope the Action can use if it needs to create any resources. 
   * @param stage the `IStage` this Action is being added to. 
   * @param options additional options the Action can use, like the artifact Bucket of the pipeline
   * it's being added to. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("955d9e45cf1f3d172efb2ef89796d9b65af874c3315b9773b499eab1fdc76ba9")
  public fun bind(
    scope: Construct,
    stage: IStage,
    options: ActionBindOptions.Builder.() -> Unit,
  ): ActionConfig

  /**
   * Creates an Event that will be triggered whenever the state of this Action changes.
   *
   * @param name the name to use for the new Event. 
   * @param target the optional target for the Event.
   * @param options additional options that can be used to customize the created Event.
   */
  public fun onStateChange(name: String): Rule

  /**
   * Creates an Event that will be triggered whenever the state of this Action changes.
   *
   * @param name the name to use for the new Event. 
   * @param target the optional target for the Event.
   * @param options additional options that can be used to customize the created Event.
   */
  public fun onStateChange(name: String, target: IRuleTarget): Rule

  /**
   * Creates an Event that will be triggered whenever the state of this Action changes.
   *
   * @param name the name to use for the new Event. 
   * @param target the optional target for the Event.
   * @param options additional options that can be used to customize the created Event.
   */
  public fun onStateChange(
    name: String,
    target: IRuleTarget,
    options: RuleProps,
  ): Rule

  /**
   * Creates an Event that will be triggered whenever the state of this Action changes.
   *
   * @param name the name to use for the new Event. 
   * @param target the optional target for the Event.
   * @param options additional options that can be used to customize the created Event.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
  public fun onStateChange(
    name: String,
    target: IRuleTarget,
    options: RuleProps.Builder.() -> Unit,
  ): Rule

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.IAction,
  ) : CdkObject(cdkObject), IAction {
    /**
     * The simple properties of the Action, like its Owner, name, etc.
     *
     * Note that this accessor will be called before the `bind` callback.
     */
    override fun actionProperties(): ActionProperties =
        unwrap(this).getActionProperties().let(ActionProperties::wrap)

    /**
     * The callback invoked when this Action is added to a Pipeline.
     *
     * @param scope the Construct tree scope the Action can use if it needs to create any resources.
     * 
     * @param stage the `IStage` this Action is being added to. 
     * @param options additional options the Action can use, like the artifact Bucket of the
     * pipeline it's being added to. 
     */
    override fun bind(
      scope: Construct,
      stage: IStage,
      options: ActionBindOptions,
    ): ActionConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        stage.let(IStage.Companion::unwrap),
        options.let(ActionBindOptions.Companion::unwrap)).let(ActionConfig::wrap)

    /**
     * The callback invoked when this Action is added to a Pipeline.
     *
     * @param scope the Construct tree scope the Action can use if it needs to create any resources.
     * 
     * @param stage the `IStage` this Action is being added to. 
     * @param options additional options the Action can use, like the artifact Bucket of the
     * pipeline it's being added to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("955d9e45cf1f3d172efb2ef89796d9b65af874c3315b9773b499eab1fdc76ba9")
    override fun bind(
      scope: Construct,
      stage: IStage,
      options: ActionBindOptions.Builder.() -> Unit,
    ): ActionConfig = bind(scope, stage, ActionBindOptions(options))

    /**
     * Creates an Event that will be triggered whenever the state of this Action changes.
     *
     * @param name the name to use for the new Event. 
     * @param target the optional target for the Event.
     * @param options additional options that can be used to customize the created Event.
     */
    override fun onStateChange(name: String): Rule =
        unwrap(this).onStateChange(name).let(Rule::wrap)

    /**
     * Creates an Event that will be triggered whenever the state of this Action changes.
     *
     * @param name the name to use for the new Event. 
     * @param target the optional target for the Event.
     * @param options additional options that can be used to customize the created Event.
     */
    override fun onStateChange(name: String, target: IRuleTarget): Rule =
        unwrap(this).onStateChange(name, target.let(IRuleTarget.Companion::unwrap)).let(Rule::wrap)

    /**
     * Creates an Event that will be triggered whenever the state of this Action changes.
     *
     * @param name the name to use for the new Event. 
     * @param target the optional target for the Event.
     * @param options additional options that can be used to customize the created Event.
     */
    override fun onStateChange(
      name: String,
      target: IRuleTarget,
      options: RuleProps,
    ): Rule = unwrap(this).onStateChange(name, target.let(IRuleTarget.Companion::unwrap),
        options.let(RuleProps.Companion::unwrap)).let(Rule::wrap)

    /**
     * Creates an Event that will be triggered whenever the state of this Action changes.
     *
     * @param name the name to use for the new Event. 
     * @param target the optional target for the Event.
     * @param options additional options that can be used to customize the created Event.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
    override fun onStateChange(
      name: String,
      target: IRuleTarget,
      options: RuleProps.Builder.() -> Unit,
    ): Rule = onStateChange(name, target, RuleProps(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.IAction): IAction =
        CdkObjectWrappers.wrap(cdkObject) as? IAction ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAction): software.amazon.awscdk.services.codepipeline.IAction =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.IAction
  }
}
