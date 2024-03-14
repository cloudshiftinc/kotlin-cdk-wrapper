package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.events.RuleProps
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IStage {
  /**
   * The actions belonging to this stage.
   */
  public fun actions(): List<IAction>

  /**
   * @param action 
   */
  public fun addAction(action: IAction)

  /**
   * @param name 
   * @param target
   * @param options
   */
  public fun onStateChange(name: String): Rule

  /**
   * @param name 
   * @param target
   * @param options
   */
  public fun onStateChange(name: String, target: IRuleTarget): Rule

  /**
   * @param name 
   * @param target
   * @param options
   */
  public fun onStateChange(
    name: String,
    target: IRuleTarget,
    options: RuleProps,
  ): Rule

  /**
   * @param name 
   * @param target
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
  public fun onStateChange(
    name: String,
    target: IRuleTarget,
    options: RuleProps.Builder.() -> Unit,
  ): Rule

  /**
   *
   */
  public fun pipeline(): IPipeline

  /**
   * The physical, human-readable name of this Pipeline Stage.
   */
  public fun stageName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.IStage,
  ) : CdkObject(cdkObject), IStage {
    /**
     * The actions belonging to this stage.
     */
    override fun actions(): List<IAction> = unwrap(this).getActions().map(IAction::wrap)

    /**
     * @param action 
     */
    override fun addAction(action: IAction) {
      unwrap(this).addAction(action.let(IAction::unwrap))
    }

    /**
     * @param name 
     * @param target
     * @param options
     */
    override fun onStateChange(name: String): Rule =
        unwrap(this).onStateChange(name).let(Rule::wrap)

    /**
     * @param name 
     * @param target
     * @param options
     */
    override fun onStateChange(name: String, target: IRuleTarget): Rule =
        unwrap(this).onStateChange(name, target.let(IRuleTarget::unwrap)).let(Rule::wrap)

    /**
     * @param name 
     * @param target
     * @param options
     */
    override fun onStateChange(
      name: String,
      target: IRuleTarget,
      options: RuleProps,
    ): Rule = unwrap(this).onStateChange(name, target.let(IRuleTarget::unwrap),
        options.let(RuleProps::unwrap)).let(Rule::wrap)

    /**
     * @param name 
     * @param target
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ca362934f6f86114f7601f1f93b6cd0f94a44e6ee3262ddc4ccfd9f4986058")
    override fun onStateChange(
      name: String,
      target: IRuleTarget,
      options: RuleProps.Builder.() -> Unit,
    ): Rule = onStateChange(name, target, RuleProps(options))

    /**
     *
     */
    override fun pipeline(): IPipeline = unwrap(this).getPipeline().let(IPipeline::wrap)

    /**
     * The physical, human-readable name of this Pipeline Stage.
     */
    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.IStage): IStage =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStage): software.amazon.awscdk.services.codepipeline.IStage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.IStage
  }
}