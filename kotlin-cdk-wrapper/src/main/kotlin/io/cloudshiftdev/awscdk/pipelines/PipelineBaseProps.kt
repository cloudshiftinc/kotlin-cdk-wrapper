@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface PipelineBaseProps {
  public fun synth(): IFileSetProducer

  @CdkDslMarker
  public interface Builder {
    public fun synth(synth: IFileSetProducer)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.PipelineBaseProps.Builder =
        software.amazon.awscdk.pipelines.PipelineBaseProps.builder()

    override fun synth(synth: IFileSetProducer) {
      cdkBuilder.synth(synth.let(IFileSetProducer::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.PipelineBaseProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.PipelineBaseProps,
  ) : CdkObject(cdkObject), PipelineBaseProps {
    override fun synth(): IFileSetProducer = unwrap(this).getSynth().let(IFileSetProducer::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PipelineBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.PipelineBaseProps):
        PipelineBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PipelineBaseProps):
        software.amazon.awscdk.pipelines.PipelineBaseProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.PipelineBaseProps
  }
}
