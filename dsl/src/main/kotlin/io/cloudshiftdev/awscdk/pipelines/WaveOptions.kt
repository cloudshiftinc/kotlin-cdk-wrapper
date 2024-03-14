package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.List

public interface WaveOptions {
  /**
   * Additional steps to run after all of the stages in the wave.
   *
   * Default: - No additional steps
   */
  public fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

  /**
   * Additional steps to run before any of the stages in the wave.
   *
   * Default: - No additional steps
   */
  public fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

  /**
   * A builder for [WaveOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param post Additional steps to run after all of the stages in the wave.
     */
    public fun post(post: List<Step>)

    /**
     * @param post Additional steps to run after all of the stages in the wave.
     */
    public fun post(vararg post: Step)

    /**
     * @param pre Additional steps to run before any of the stages in the wave.
     */
    public fun pre(pre: List<Step>)

    /**
     * @param pre Additional steps to run before any of the stages in the wave.
     */
    public fun pre(vararg pre: Step)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.WaveOptions.Builder =
        software.amazon.awscdk.pipelines.WaveOptions.builder()

    /**
     * @param post Additional steps to run after all of the stages in the wave.
     */
    override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step::unwrap))
    }

    /**
     * @param post Additional steps to run after all of the stages in the wave.
     */
    override fun post(vararg post: Step): Unit = post(post.toList())

    /**
     * @param pre Additional steps to run before any of the stages in the wave.
     */
    override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step::unwrap))
    }

    /**
     * @param pre Additional steps to run before any of the stages in the wave.
     */
    override fun pre(vararg pre: Step): Unit = pre(pre.toList())

    public fun build(): software.amazon.awscdk.pipelines.WaveOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.WaveOptions,
  ) : CdkObject(cdkObject), WaveOptions {
    /**
     * Additional steps to run after all of the stages in the wave.
     *
     * Default: - No additional steps
     */
    override fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

    /**
     * Additional steps to run before any of the stages in the wave.
     *
     * Default: - No additional steps
     */
    override fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WaveOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.WaveOptions): WaveOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: WaveOptions): software.amazon.awscdk.pipelines.WaveOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.pipelines.WaveOptions
  }
}