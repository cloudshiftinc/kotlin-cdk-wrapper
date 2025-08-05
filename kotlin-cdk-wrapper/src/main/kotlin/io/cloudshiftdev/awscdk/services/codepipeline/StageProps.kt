@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Construction properties of a Pipeline Stage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * Action action;
 * Rule rule;
 * StageProps stageProps = StageProps.builder()
 * .stageName("stageName")
 * // the properties below are optional
 * .actions(List.of(action))
 * .beforeEntry(Conditions.builder()
 * .conditions(List.of(Condition.builder()
 * .result(Result.ROLLBACK)
 * .rules(List.of(rule))
 * .build()))
 * .build())
 * .onFailure(FailureConditions.builder()
 * .conditions(List.of(Condition.builder()
 * .result(Result.ROLLBACK)
 * .rules(List.of(rule))
 * .build()))
 * .result(Result.ROLLBACK)
 * .retryMode(RetryMode.ALL_ACTIONS)
 * .build())
 * .onSuccess(Conditions.builder()
 * .conditions(List.of(Condition.builder()
 * .result(Result.ROLLBACK)
 * .rules(List.of(rule))
 * .build()))
 * .build())
 * .transitionDisabledReason("transitionDisabledReason")
 * .transitionToEnabled(false)
 * .build();
 * ```
 */
public interface StageProps {
  /**
   * The list of Actions to create this Stage with.
   *
   * You can always add more Actions later by calling `IStage#addAction`.
   */
  public fun actions(): List<IAction> = unwrap(this).getActions()?.map(IAction::wrap) ?: emptyList()

  /**
   * The method to use when a stage allows entry.
   *
   * Default: - No conditions are applied before stage entry
   */
  public fun beforeEntry(): Conditions? = unwrap(this).getBeforeEntry()?.let(Conditions::wrap)

  /**
   * The method to use when a stage has not completed successfully.
   *
   * Default: - No failure conditions are applied
   */
  public fun onFailure(): FailureConditions? =
      unwrap(this).getOnFailure()?.let(FailureConditions::wrap)

  /**
   * The method to use when a stage has succeeded.
   *
   * Default: - No success conditions are applied
   */
  public fun onSuccess(): Conditions? = unwrap(this).getOnSuccess()?.let(Conditions::wrap)

  /**
   * The physical, human-readable name to assign to this Pipeline Stage.
   */
  public fun stageName(): String

  /**
   * The reason for disabling transition to this stage.
   *
   * Only applicable
   * if `transitionToEnabled` is set to `false`.
   *
   * Default: 'Transition disabled'
   */
  public fun transitionDisabledReason(): String? = unwrap(this).getTransitionDisabledReason()

  /**
   * Whether to enable transition to this stage.
   *
   * Default: true
   */
  public fun transitionToEnabled(): Boolean? = unwrap(this).getTransitionToEnabled()

  /**
   * A builder for [StageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The list of Actions to create this Stage with.
     * You can always add more Actions later by calling `IStage#addAction`.
     */
    public fun actions(actions: List<IAction>)

    /**
     * @param actions The list of Actions to create this Stage with.
     * You can always add more Actions later by calling `IStage#addAction`.
     */
    public fun actions(vararg actions: IAction)

    /**
     * @param beforeEntry The method to use when a stage allows entry.
     */
    public fun beforeEntry(beforeEntry: Conditions)

    /**
     * @param beforeEntry The method to use when a stage allows entry.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80877067d0d49db632355839a3033c1b2334f7e16feec710d0e3005eb0c02ed7")
    public fun beforeEntry(beforeEntry: Conditions.Builder.() -> Unit)

    /**
     * @param onFailure The method to use when a stage has not completed successfully.
     */
    public fun onFailure(onFailure: FailureConditions)

    /**
     * @param onFailure The method to use when a stage has not completed successfully.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a52996cb4c4dd23c8c2f38f0b6fa3d6445555890743fb88f51b8f440b2d8678")
    public fun onFailure(onFailure: FailureConditions.Builder.() -> Unit)

    /**
     * @param onSuccess The method to use when a stage has succeeded.
     */
    public fun onSuccess(onSuccess: Conditions)

    /**
     * @param onSuccess The method to use when a stage has succeeded.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ff4191e79a7d77e9550c27a335341408d8b1b95bcf9a896b59f63b38970c285")
    public fun onSuccess(onSuccess: Conditions.Builder.() -> Unit)

    /**
     * @param stageName The physical, human-readable name to assign to this Pipeline Stage. 
     */
    public fun stageName(stageName: String)

    /**
     * @param transitionDisabledReason The reason for disabling transition to this stage.
     * Only applicable
     * if `transitionToEnabled` is set to `false`.
     */
    public fun transitionDisabledReason(transitionDisabledReason: String)

    /**
     * @param transitionToEnabled Whether to enable transition to this stage.
     */
    public fun transitionToEnabled(transitionToEnabled: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.StageProps.Builder =
        software.amazon.awscdk.services.codepipeline.StageProps.builder()

    /**
     * @param actions The list of Actions to create this Stage with.
     * You can always add more Actions later by calling `IStage#addAction`.
     */
    override fun actions(actions: List<IAction>) {
      cdkBuilder.actions(actions.map(IAction.Companion::unwrap))
    }

    /**
     * @param actions The list of Actions to create this Stage with.
     * You can always add more Actions later by calling `IStage#addAction`.
     */
    override fun actions(vararg actions: IAction): Unit = actions(actions.toList())

    /**
     * @param beforeEntry The method to use when a stage allows entry.
     */
    override fun beforeEntry(beforeEntry: Conditions) {
      cdkBuilder.beforeEntry(beforeEntry.let(Conditions.Companion::unwrap))
    }

    /**
     * @param beforeEntry The method to use when a stage allows entry.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80877067d0d49db632355839a3033c1b2334f7e16feec710d0e3005eb0c02ed7")
    override fun beforeEntry(beforeEntry: Conditions.Builder.() -> Unit): Unit =
        beforeEntry(Conditions(beforeEntry))

    /**
     * @param onFailure The method to use when a stage has not completed successfully.
     */
    override fun onFailure(onFailure: FailureConditions) {
      cdkBuilder.onFailure(onFailure.let(FailureConditions.Companion::unwrap))
    }

    /**
     * @param onFailure The method to use when a stage has not completed successfully.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a52996cb4c4dd23c8c2f38f0b6fa3d6445555890743fb88f51b8f440b2d8678")
    override fun onFailure(onFailure: FailureConditions.Builder.() -> Unit): Unit =
        onFailure(FailureConditions(onFailure))

    /**
     * @param onSuccess The method to use when a stage has succeeded.
     */
    override fun onSuccess(onSuccess: Conditions) {
      cdkBuilder.onSuccess(onSuccess.let(Conditions.Companion::unwrap))
    }

    /**
     * @param onSuccess The method to use when a stage has succeeded.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ff4191e79a7d77e9550c27a335341408d8b1b95bcf9a896b59f63b38970c285")
    override fun onSuccess(onSuccess: Conditions.Builder.() -> Unit): Unit =
        onSuccess(Conditions(onSuccess))

    /**
     * @param stageName The physical, human-readable name to assign to this Pipeline Stage. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * @param transitionDisabledReason The reason for disabling transition to this stage.
     * Only applicable
     * if `transitionToEnabled` is set to `false`.
     */
    override fun transitionDisabledReason(transitionDisabledReason: String) {
      cdkBuilder.transitionDisabledReason(transitionDisabledReason)
    }

    /**
     * @param transitionToEnabled Whether to enable transition to this stage.
     */
    override fun transitionToEnabled(transitionToEnabled: Boolean) {
      cdkBuilder.transitionToEnabled(transitionToEnabled)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.StageProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.StageProps,
  ) : CdkObject(cdkObject),
      StageProps {
    /**
     * The list of Actions to create this Stage with.
     *
     * You can always add more Actions later by calling `IStage#addAction`.
     */
    override fun actions(): List<IAction> = unwrap(this).getActions()?.map(IAction::wrap) ?:
        emptyList()

    /**
     * The method to use when a stage allows entry.
     *
     * Default: - No conditions are applied before stage entry
     */
    override fun beforeEntry(): Conditions? = unwrap(this).getBeforeEntry()?.let(Conditions::wrap)

    /**
     * The method to use when a stage has not completed successfully.
     *
     * Default: - No failure conditions are applied
     */
    override fun onFailure(): FailureConditions? =
        unwrap(this).getOnFailure()?.let(FailureConditions::wrap)

    /**
     * The method to use when a stage has succeeded.
     *
     * Default: - No success conditions are applied
     */
    override fun onSuccess(): Conditions? = unwrap(this).getOnSuccess()?.let(Conditions::wrap)

    /**
     * The physical, human-readable name to assign to this Pipeline Stage.
     */
    override fun stageName(): String = unwrap(this).getStageName()

    /**
     * The reason for disabling transition to this stage.
     *
     * Only applicable
     * if `transitionToEnabled` is set to `false`.
     *
     * Default: 'Transition disabled'
     */
    override fun transitionDisabledReason(): String? = unwrap(this).getTransitionDisabledReason()

    /**
     * Whether to enable transition to this stage.
     *
     * Default: true
     */
    override fun transitionToEnabled(): Boolean? = unwrap(this).getTransitionToEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.StageProps):
        StageProps = CdkObjectWrappers.wrap(cdkObject) as? StageProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageProps):
        software.amazon.awscdk.services.codepipeline.StageProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codepipeline.StageProps
  }
}
