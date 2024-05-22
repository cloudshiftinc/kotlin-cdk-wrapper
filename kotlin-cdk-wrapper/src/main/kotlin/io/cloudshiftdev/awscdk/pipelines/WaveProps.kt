@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties for a `Wave`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * Step step;
 * WaveProps waveProps = WaveProps.builder()
 * .post(List.of(step))
 * .pre(List.of(step))
 * .build();
 * ```
 */
public interface WaveProps {
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
   * A builder for [WaveProps]
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
    private val cdkBuilder: software.amazon.awscdk.pipelines.WaveProps.Builder =
        software.amazon.awscdk.pipelines.WaveProps.builder()

    /**
     * @param post Additional steps to run after all of the stages in the wave.
     */
    override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step.Companion::unwrap))
    }

    /**
     * @param post Additional steps to run after all of the stages in the wave.
     */
    override fun post(vararg post: Step): Unit = post(post.toList())

    /**
     * @param pre Additional steps to run before any of the stages in the wave.
     */
    override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step.Companion::unwrap))
    }

    /**
     * @param pre Additional steps to run before any of the stages in the wave.
     */
    override fun pre(vararg pre: Step): Unit = pre(pre.toList())

    public fun build(): software.amazon.awscdk.pipelines.WaveProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.WaveProps,
  ) : CdkObject(cdkObject), WaveProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): WaveProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.WaveProps): WaveProps =
        CdkObjectWrappers.wrap(cdkObject) as? WaveProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WaveProps): software.amazon.awscdk.pipelines.WaveProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.pipelines.WaveProps
  }
}
