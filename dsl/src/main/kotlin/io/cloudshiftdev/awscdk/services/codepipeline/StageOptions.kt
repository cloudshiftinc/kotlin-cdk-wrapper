package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

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
     * @param placement the value to be set.
     */
    public fun placement(placement: StagePlacement)

    /**
     * @param placement the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.actions(actions.map(IAction::unwrap))
    }

    /**
     * @param actions The list of Actions to create this Stage with.
     * You can always add more Actions later by calling `IStage#addAction`.
     */
    override fun actions(vararg actions: IAction): Unit = actions(actions.toList())

    /**
     * @param placement the value to be set.
     */
    override fun placement(placement: StagePlacement) {
      cdkBuilder.placement(placement.let(StagePlacement::unwrap))
    }

    /**
     * @param placement the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
    override val cdkObject: software.amazon.awscdk.services.codepipeline.StageOptions,
  ) : CdkObject(cdkObject), StageOptions {
    /**
     * The list of Actions to create this Stage with.
     *
     * You can always add more Actions later by calling `IStage#addAction`.
     */
    override fun actions(): List<IAction> = unwrap(this).getActions()?.map(IAction::wrap) ?:
        emptyList()

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
        StageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageOptions):
        software.amazon.awscdk.services.codepipeline.StageOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codepipeline.StageOptions
  }
}
