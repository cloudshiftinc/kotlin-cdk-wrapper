package io.cloudshiftdev.awscdk.services.codepipeline

import kotlin.Unit

public interface StagePlacement {
  public fun justAfter(): IStage? = unwrap(this).getJustAfter()?.let(IStage::wrap)

  public fun rightBefore(): IStage? = unwrap(this).getRightBefore()?.let(IStage::wrap)

  public interface Builder {
    public fun justAfter(justAfter: IStage) {
    }

    public fun rightBefore(rightBefore: IStage) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.StagePlacement.Builder =
        software.amazon.awscdk.services.codepipeline.StagePlacement.builder()

    public override fun justAfter(justAfter: IStage) {
      cdkBuilder.justAfter(justAfter.let(IStage::unwrap))
    }

    public override fun rightBefore(rightBefore: IStage) {
      cdkBuilder.rightBefore(rightBefore.let(IStage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.StagePlacement =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.StagePlacement,
  ) : StagePlacement {
    public override fun justAfter(): IStage? = unwrap(this).getJustAfter()?.let(IStage::wrap)

    public override fun rightBefore(): IStage? = unwrap(this).getRightBefore()?.let(IStage::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StagePlacement {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.StagePlacement):
        StagePlacement = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StagePlacement):
        software.amazon.awscdk.services.codepipeline.StagePlacement = (wrapped as Wrapper).cdkObject
  }
}
