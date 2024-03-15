@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface ActionArtifactBounds {
  public fun maxInputs(): Number

  public fun maxOutputs(): Number

  public fun minInputs(): Number

  public fun minOutputs(): Number

  @CdkDslMarker
  public interface Builder {
    public fun maxInputs(maxInputs: Number)

    public fun maxOutputs(maxOutputs: Number)

    public fun minInputs(minInputs: Number)

    public fun minOutputs(minOutputs: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.ActionArtifactBounds.Builder =
        software.amazon.awscdk.services.codepipeline.ActionArtifactBounds.builder()

    override fun maxInputs(maxInputs: Number) {
      cdkBuilder.maxInputs(maxInputs)
    }

    override fun maxOutputs(maxOutputs: Number) {
      cdkBuilder.maxOutputs(maxOutputs)
    }

    override fun minInputs(minInputs: Number) {
      cdkBuilder.minInputs(minInputs)
    }

    override fun minOutputs(minOutputs: Number) {
      cdkBuilder.minOutputs(minOutputs)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.ActionArtifactBounds =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.ActionArtifactBounds,
  ) : CdkObject(cdkObject), ActionArtifactBounds {
    override fun maxInputs(): Number = unwrap(this).getMaxInputs()

    override fun maxOutputs(): Number = unwrap(this).getMaxOutputs()

    override fun minInputs(): Number = unwrap(this).getMinInputs()

    override fun minOutputs(): Number = unwrap(this).getMinOutputs()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActionArtifactBounds {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionArtifactBounds):
        ActionArtifactBounds = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionArtifactBounds):
        software.amazon.awscdk.services.codepipeline.ActionArtifactBounds = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.ActionArtifactBounds
  }
}
