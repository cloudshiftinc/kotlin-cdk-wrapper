package io.cloudshiftdev.awscdk.pipelines

import kotlin.Unit
import kotlin.collections.List

public interface WaveOptions {
  public fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

  public fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

  public interface Builder {
    public fun post(post: List<Step>) {
    }

    public fun pre(pre: List<Step>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.WaveOptions.Builder =
        software.amazon.awscdk.pipelines.WaveOptions.builder()

    public override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step::unwrap))
    }

    public override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.WaveOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.WaveOptions,
  ) : WaveOptions {
    public override fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

    public override fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): WaveOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.WaveOptions): WaveOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: WaveOptions): software.amazon.awscdk.pipelines.WaveOptions =
        (wrapped as Wrapper).cdkObject
  }
}
