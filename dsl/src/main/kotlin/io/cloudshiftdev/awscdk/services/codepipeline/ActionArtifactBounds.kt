package io.cloudshiftdev.awscdk.services.codepipeline

import kotlin.Number
import kotlin.Unit

public interface ActionArtifactBounds {
  public fun maxInputs(): Number

  public fun maxOutputs(): Number

  public fun minInputs(): Number

  public fun minOutputs(): Number

  public interface Builder {
    public fun maxInputs(maxInputs: Number) {
    }

    public fun maxOutputs(maxOutputs: Number) {
    }

    public fun minInputs(minInputs: Number) {
    }

    public fun minOutputs(minOutputs: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.ActionArtifactBounds.Builder =
        software.amazon.awscdk.services.codepipeline.ActionArtifactBounds.builder()

    public override fun maxInputs(maxInputs: Number) {
      cdkBuilder.maxInputs(maxInputs)
    }

    public override fun maxOutputs(maxOutputs: Number) {
      cdkBuilder.maxOutputs(maxOutputs)
    }

    public override fun minInputs(minInputs: Number) {
      cdkBuilder.minInputs(minInputs)
    }

    public override fun minOutputs(minOutputs: Number) {
      cdkBuilder.minOutputs(minOutputs)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.ActionArtifactBounds =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.ActionArtifactBounds,
  ) : ActionArtifactBounds {
    public override fun maxInputs(): Number = unwrap(this).getMaxInputs()

    public override fun maxOutputs(): Number = unwrap(this).getMaxOutputs()

    public override fun minInputs(): Number = unwrap(this).getMinInputs()

    public override fun minOutputs(): Number = unwrap(this).getMinOutputs()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ActionArtifactBounds {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionArtifactBounds):
        ActionArtifactBounds = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionArtifactBounds):
        software.amazon.awscdk.services.codepipeline.ActionArtifactBounds = (wrapped as
        Wrapper).cdkObject
  }
}
