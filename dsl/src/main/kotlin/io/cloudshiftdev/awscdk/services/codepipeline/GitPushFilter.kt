package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface GitPushFilter {
  /**
   * The list of patterns of Git tags that, when pushed, are to be excluded from starting the
   * pipeline.
   *
   * You can filter with glob patterns. The `tagsExcludes` takes priority
   * over the `tagsIncludes`.
   *
   * Maximum length of this array is 8.
   *
   * Default: - no tags.
   */
  public fun tagsExcludes(): List<String> = unwrap(this).getTagsExcludes() ?: emptyList()

  /**
   * The list of patterns of Git tags that, when pushed, are to be included as criteria that starts
   * the pipeline.
   *
   * You can filter with glob patterns. The `tagsExcludes` takes priority
   * over the `tagsIncludes`.
   *
   * Maximum length of this array is 8.
   *
   * Default: - no tags.
   */
  public fun tagsIncludes(): List<String> = unwrap(this).getTagsIncludes() ?: emptyList()

  /**
   * A builder for [GitPushFilter]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tagsExcludes The list of patterns of Git tags that, when pushed, are to be excluded
     * from starting the pipeline.
     * You can filter with glob patterns. The `tagsExcludes` takes priority
     * over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun tagsExcludes(tagsExcludes: List<String>)

    /**
     * @param tagsExcludes The list of patterns of Git tags that, when pushed, are to be excluded
     * from starting the pipeline.
     * You can filter with glob patterns. The `tagsExcludes` takes priority
     * over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun tagsExcludes(vararg tagsExcludes: String)

    /**
     * @param tagsIncludes The list of patterns of Git tags that, when pushed, are to be included as
     * criteria that starts the pipeline.
     * You can filter with glob patterns. The `tagsExcludes` takes priority
     * over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun tagsIncludes(tagsIncludes: List<String>)

    /**
     * @param tagsIncludes The list of patterns of Git tags that, when pushed, are to be included as
     * criteria that starts the pipeline.
     * You can filter with glob patterns. The `tagsExcludes` takes priority
     * over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun tagsIncludes(vararg tagsIncludes: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.GitPushFilter.Builder =
        software.amazon.awscdk.services.codepipeline.GitPushFilter.builder()

    /**
     * @param tagsExcludes The list of patterns of Git tags that, when pushed, are to be excluded
     * from starting the pipeline.
     * You can filter with glob patterns. The `tagsExcludes` takes priority
     * over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun tagsExcludes(tagsExcludes: List<String>) {
      cdkBuilder.tagsExcludes(tagsExcludes)
    }

    /**
     * @param tagsExcludes The list of patterns of Git tags that, when pushed, are to be excluded
     * from starting the pipeline.
     * You can filter with glob patterns. The `tagsExcludes` takes priority
     * over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun tagsExcludes(vararg tagsExcludes: String): Unit =
        tagsExcludes(tagsExcludes.toList())

    /**
     * @param tagsIncludes The list of patterns of Git tags that, when pushed, are to be included as
     * criteria that starts the pipeline.
     * You can filter with glob patterns. The `tagsExcludes` takes priority
     * over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun tagsIncludes(tagsIncludes: List<String>) {
      cdkBuilder.tagsIncludes(tagsIncludes)
    }

    /**
     * @param tagsIncludes The list of patterns of Git tags that, when pushed, are to be included as
     * criteria that starts the pipeline.
     * You can filter with glob patterns. The `tagsExcludes` takes priority
     * over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun tagsIncludes(vararg tagsIncludes: String): Unit =
        tagsIncludes(tagsIncludes.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.GitPushFilter =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.GitPushFilter,
  ) : CdkObject(cdkObject), GitPushFilter {
    /**
     * The list of patterns of Git tags that, when pushed, are to be excluded from starting the
     * pipeline.
     *
     * You can filter with glob patterns. The `tagsExcludes` takes priority
     * over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     *
     * Default: - no tags.
     */
    override fun tagsExcludes(): List<String> = unwrap(this).getTagsExcludes() ?: emptyList()

    /**
     * The list of patterns of Git tags that, when pushed, are to be included as criteria that
     * starts the pipeline.
     *
     * You can filter with glob patterns. The `tagsExcludes` takes priority
     * over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     *
     * Default: - no tags.
     */
    override fun tagsIncludes(): List<String> = unwrap(this).getTagsIncludes() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitPushFilter {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.GitPushFilter):
        GitPushFilter = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitPushFilter):
        software.amazon.awscdk.services.codepipeline.GitPushFilter = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.GitPushFilter
  }
}
