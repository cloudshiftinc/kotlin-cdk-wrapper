@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface StageOptions : StageProps {
  public fun placement(): StagePlacement? = unwrap(this).getPlacement()?.let(StagePlacement::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: List<IAction>)

    public fun actions(vararg actions: IAction)

    public fun placement(placement: StagePlacement)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbfa55939a1e1215b81310c4d76f262977c07392436dcfc408d54a435de571d8")
    public fun placement(placement: StagePlacement.Builder.() -> Unit)

    public fun stageName(stageName: String)

    public fun transitionDisabledReason(transitionDisabledReason: String)

    public fun transitionToEnabled(transitionToEnabled: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.StageOptions.Builder =
        software.amazon.awscdk.services.codepipeline.StageOptions.builder()

    override fun actions(actions: List<IAction>) {
      cdkBuilder.actions(actions.map(IAction::unwrap))
    }

    override fun actions(vararg actions: IAction): Unit = actions(actions.toList())

    override fun placement(placement: StagePlacement) {
      cdkBuilder.placement(placement.let(StagePlacement::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbfa55939a1e1215b81310c4d76f262977c07392436dcfc408d54a435de571d8")
    override fun placement(placement: StagePlacement.Builder.() -> Unit): Unit =
        placement(StagePlacement(placement))

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun transitionDisabledReason(transitionDisabledReason: String) {
      cdkBuilder.transitionDisabledReason(transitionDisabledReason)
    }

    override fun transitionToEnabled(transitionToEnabled: Boolean) {
      cdkBuilder.transitionToEnabled(transitionToEnabled)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.StageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.StageOptions,
  ) : CdkObject(cdkObject), StageOptions {
    override fun actions(): List<IAction> = unwrap(this).getActions()?.map(IAction::wrap) ?:
        emptyList()

    override fun placement(): StagePlacement? =
        unwrap(this).getPlacement()?.let(StagePlacement::wrap)

    override fun stageName(): String = unwrap(this).getStageName()

    override fun transitionDisabledReason(): String? = unwrap(this).getTransitionDisabledReason()

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
