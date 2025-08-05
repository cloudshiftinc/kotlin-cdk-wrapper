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
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * Pass startState = new Pass(this, "StartState");
 * StateMachine simpleStateMachine = StateMachine.Builder.create(this, "SimpleStateMachine")
 * .definition(startState)
 * .build();
 * StepFunctionInvokeAction stepFunctionAction = StepFunctionInvokeAction.Builder.create()
 * .actionName("Invoke")
 * .stateMachine(simpleStateMachine)
 * .stateMachineInput(StateMachineInput.literal(Map.of("IsHelloWorldExample", true)))
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("StepFunctions")
 * .actions(List.of(stepFunctionAction))
 * .build());
 * ```
 */
public interface StageOptions : StageProps {
  /**
   *
   */
  public fun placement(): StagePlacement? = unwrap(this).getPlacement()?.let(StagePlacement::wrap)

  /**
   * A builder for [StageOptions]
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
    @JvmName("1a1d1cf4fd091bf6df7506b282e86ed7ba3969f647116ce1d6a3c74cbd58c70a")
    public fun beforeEntry(beforeEntry: Conditions.Builder.() -> Unit)

    /**
     * @param onFailure The method to use when a stage has not completed successfully.
     */
    public fun onFailure(onFailure: FailureConditions)

    /**
     * @param onFailure The method to use when a stage has not completed successfully.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f426db3ac9e19de485e1cfe150f0c37cf50553e9b144a8c0f542ab8f3331a0f")
    public fun onFailure(onFailure: FailureConditions.Builder.() -> Unit)

    /**
     * @param onSuccess The method to use when a stage has succeeded.
     */
    public fun onSuccess(onSuccess: Conditions)

    /**
     * @param onSuccess The method to use when a stage has succeeded.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c20d5ed41c45ee3fb1a2a1de17db678e16f7042f8d3a49d424936c497afc4b3a")
    public fun onSuccess(onSuccess: Conditions.Builder.() -> Unit)

    /**
     * @param placement the value to be set.
     */
    public fun placement(placement: StagePlacement)

    /**
     * @param placement the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbfa55939a1e1215b81310c4d76f262977c07392436dcfc408d54a435de571d8")
    public fun placement(placement: StagePlacement.Builder.() -> Unit)

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
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.StageOptions.Builder =
        software.amazon.awscdk.services.codepipeline.StageOptions.builder()

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
    @JvmName("1a1d1cf4fd091bf6df7506b282e86ed7ba3969f647116ce1d6a3c74cbd58c70a")
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
    @JvmName("3f426db3ac9e19de485e1cfe150f0c37cf50553e9b144a8c0f542ab8f3331a0f")
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
    @JvmName("c20d5ed41c45ee3fb1a2a1de17db678e16f7042f8d3a49d424936c497afc4b3a")
    override fun onSuccess(onSuccess: Conditions.Builder.() -> Unit): Unit =
        onSuccess(Conditions(onSuccess))

    /**
     * @param placement the value to be set.
     */
    override fun placement(placement: StagePlacement) {
      cdkBuilder.placement(placement.let(StagePlacement.Companion::unwrap))
    }

    /**
     * @param placement the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbfa55939a1e1215b81310c4d76f262977c07392436dcfc408d54a435de571d8")
    override fun placement(placement: StagePlacement.Builder.() -> Unit): Unit =
        placement(StagePlacement(placement))

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

    public fun build(): software.amazon.awscdk.services.codepipeline.StageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.StageOptions,
  ) : CdkObject(cdkObject),
      StageOptions {
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
     *
     */
    override fun placement(): StagePlacement? =
        unwrap(this).getPlacement()?.let(StagePlacement::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): StageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.StageOptions):
        StageOptions = CdkObjectWrappers.wrap(cdkObject) as? StageOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageOptions):
        software.amazon.awscdk.services.codepipeline.StageOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codepipeline.StageOptions
  }
}
