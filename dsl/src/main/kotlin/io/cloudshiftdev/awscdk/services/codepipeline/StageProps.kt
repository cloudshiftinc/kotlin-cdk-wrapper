package io.cloudshiftdev.awscdk.services.codepipeline

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface StageProps {
  public fun actions(): List<IAction> = unwrap(this).getActions()?.map(IAction::wrap) ?: emptyList()

  public fun stageName(): String

  public fun transitionDisabledReason(): String? = unwrap(this).getTransitionDisabledReason()

  public fun transitionToEnabled(): Boolean? = unwrap(this).getTransitionToEnabled()

  public interface Builder {
    public fun actions(actions: List<IAction>) {
    }

    public fun stageName(stageName: String) {
    }

    public fun transitionDisabledReason(transitionDisabledReason: String) {
    }

    public fun transitionToEnabled(transitionToEnabled: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.StageProps.Builder =
        software.amazon.awscdk.services.codepipeline.StageProps.builder()

    public override fun actions(actions: List<IAction>) {
      cdkBuilder.actions(actions.map(IAction::unwrap))
    }

    public override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public override fun transitionDisabledReason(transitionDisabledReason: String) {
      cdkBuilder.transitionDisabledReason(transitionDisabledReason)
    }

    public override fun transitionToEnabled(transitionToEnabled: Boolean) {
      cdkBuilder.transitionToEnabled(transitionToEnabled)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.StageProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.StageProps,
  ) : StageProps {
    public override fun actions(): List<IAction> = unwrap(this).getActions()?.map(IAction::wrap) ?:
        emptyList()

    public override fun stageName(): String = unwrap(this).getStageName()

    public override fun transitionDisabledReason(): String? =
        unwrap(this).getTransitionDisabledReason()

    public override fun transitionToEnabled(): Boolean? = unwrap(this).getTransitionToEnabled()
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
