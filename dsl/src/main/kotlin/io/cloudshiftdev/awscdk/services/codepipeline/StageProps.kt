package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface StageProps {
  /**
   * The list of Actions to create this Stage with.
   *
   * You can always add more Actions later by calling `IStage#addAction`.
   */
  public fun actions(): List<IAction> = unwrap(this).getActions()?.map(IAction::wrap) ?: emptyList()

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
      cdkBuilder.actions(actions.map(IAction::unwrap))
    }

    /**
     * @param actions The list of Actions to create this Stage with.
     * You can always add more Actions later by calling `IStage#addAction`.
     */
    override fun actions(vararg actions: IAction): Unit = actions(actions.toList())

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.StageProps,
  ) : StageProps {
    /**
     * The list of Actions to create this Stage with.
     *
     * You can always add more Actions later by calling `IStage#addAction`.
     */
    override fun actions(): List<IAction> = unwrap(this).getActions()?.map(IAction::wrap) ?:
        emptyList()

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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.StageProps):
        StageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageProps):
        software.amazon.awscdk.services.codepipeline.StageProps = (wrapped as Wrapper).cdkObject
  }
}
