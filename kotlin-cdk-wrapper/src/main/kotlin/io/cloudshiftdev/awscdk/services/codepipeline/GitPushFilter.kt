@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Git push filter for trigger.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * GitPushFilter gitPushFilter = GitPushFilter.builder()
 * .branchesExcludes(List.of("branchesExcludes"))
 * .branchesIncludes(List.of("branchesIncludes"))
 * .filePathsExcludes(List.of("filePathsExcludes"))
 * .filePathsIncludes(List.of("filePathsIncludes"))
 * .tagsExcludes(List.of("tagsExcludes"))
 * .tagsIncludes(List.of("tagsIncludes"))
 * .build();
 * ```
 */
public interface GitPushFilter {
  /**
   * The list of patterns of Git branches that, when pull request events occurs, are to be excluded
   * from starting the pipeline.
   *
   * You can filter with glob patterns. The `branchesExcludes` takes priority
   * over the `branchesIncludes`.
   *
   * Maximum length of this array is 8.
   *
   * Default: - no branches.
   */
  public fun branchesExcludes(): List<String> = unwrap(this).getBranchesExcludes() ?: emptyList()

  /**
   * The list of patterns of Git branches that, when pull request events occurs, are to be included
   * as criteria that starts the pipeline.
   *
   * You can filter with glob patterns. The `branchesExcludes` takes priority
   * over the `branchesIncludes`.
   *
   * Maximum length of this array is 8.
   *
   * Default: - no branches.
   */
  public fun branchesIncludes(): List<String> = unwrap(this).getBranchesIncludes() ?: emptyList()

  /**
   * The list of patterns of Git repository file paths that, when pull request events occurs, are to
   * be excluded from starting the pipeline.
   *
   * You can filter with glob patterns. The `filePathsExcludes` takes priority
   * over the `filePathsIncludes`.
   *
   * Maximum length of this array is 8.
   *
   * Default: - no filePaths.
   */
  public fun filePathsExcludes(): List<String> = unwrap(this).getFilePathsExcludes() ?: emptyList()

  /**
   * The list of patterns of Git repository file paths that, when pull request events occurs, are to
   * be included as criteria that starts the pipeline.
   *
   * You can filter with glob patterns. The `filePathsExcludes` takes priority
   * over the `filePathsIncludes`.
   *
   * Maximum length of this array is 8.
   *
   * Default: - no filePaths.
   */
  public fun filePathsIncludes(): List<String> = unwrap(this).getFilePathsIncludes() ?: emptyList()

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
     * @param branchesExcludes The list of patterns of Git branches that, when pull request events
     * occurs, are to be excluded from starting the pipeline.
     * You can filter with glob patterns. The `branchesExcludes` takes priority
     * over the `branchesIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun branchesExcludes(branchesExcludes: List<String>)

    /**
     * @param branchesExcludes The list of patterns of Git branches that, when pull request events
     * occurs, are to be excluded from starting the pipeline.
     * You can filter with glob patterns. The `branchesExcludes` takes priority
     * over the `branchesIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun branchesExcludes(vararg branchesExcludes: String)

    /**
     * @param branchesIncludes The list of patterns of Git branches that, when pull request events
     * occurs, are to be included as criteria that starts the pipeline.
     * You can filter with glob patterns. The `branchesExcludes` takes priority
     * over the `branchesIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun branchesIncludes(branchesIncludes: List<String>)

    /**
     * @param branchesIncludes The list of patterns of Git branches that, when pull request events
     * occurs, are to be included as criteria that starts the pipeline.
     * You can filter with glob patterns. The `branchesExcludes` takes priority
     * over the `branchesIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun branchesIncludes(vararg branchesIncludes: String)

    /**
     * @param filePathsExcludes The list of patterns of Git repository file paths that, when pull
     * request events occurs, are to be excluded from starting the pipeline.
     * You can filter with glob patterns. The `filePathsExcludes` takes priority
     * over the `filePathsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun filePathsExcludes(filePathsExcludes: List<String>)

    /**
     * @param filePathsExcludes The list of patterns of Git repository file paths that, when pull
     * request events occurs, are to be excluded from starting the pipeline.
     * You can filter with glob patterns. The `filePathsExcludes` takes priority
     * over the `filePathsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun filePathsExcludes(vararg filePathsExcludes: String)

    /**
     * @param filePathsIncludes The list of patterns of Git repository file paths that, when pull
     * request events occurs, are to be included as criteria that starts the pipeline.
     * You can filter with glob patterns. The `filePathsExcludes` takes priority
     * over the `filePathsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun filePathsIncludes(filePathsIncludes: List<String>)

    /**
     * @param filePathsIncludes The list of patterns of Git repository file paths that, when pull
     * request events occurs, are to be included as criteria that starts the pipeline.
     * You can filter with glob patterns. The `filePathsExcludes` takes priority
     * over the `filePathsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun filePathsIncludes(vararg filePathsIncludes: String)

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
     * @param branchesExcludes The list of patterns of Git branches that, when pull request events
     * occurs, are to be excluded from starting the pipeline.
     * You can filter with glob patterns. The `branchesExcludes` takes priority
     * over the `branchesIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun branchesExcludes(branchesExcludes: List<String>) {
      cdkBuilder.branchesExcludes(branchesExcludes)
    }

    /**
     * @param branchesExcludes The list of patterns of Git branches that, when pull request events
     * occurs, are to be excluded from starting the pipeline.
     * You can filter with glob patterns. The `branchesExcludes` takes priority
     * over the `branchesIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun branchesExcludes(vararg branchesExcludes: String): Unit =
        branchesExcludes(branchesExcludes.toList())

    /**
     * @param branchesIncludes The list of patterns of Git branches that, when pull request events
     * occurs, are to be included as criteria that starts the pipeline.
     * You can filter with glob patterns. The `branchesExcludes` takes priority
     * over the `branchesIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun branchesIncludes(branchesIncludes: List<String>) {
      cdkBuilder.branchesIncludes(branchesIncludes)
    }

    /**
     * @param branchesIncludes The list of patterns of Git branches that, when pull request events
     * occurs, are to be included as criteria that starts the pipeline.
     * You can filter with glob patterns. The `branchesExcludes` takes priority
     * over the `branchesIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun branchesIncludes(vararg branchesIncludes: String): Unit =
        branchesIncludes(branchesIncludes.toList())

    /**
     * @param filePathsExcludes The list of patterns of Git repository file paths that, when pull
     * request events occurs, are to be excluded from starting the pipeline.
     * You can filter with glob patterns. The `filePathsExcludes` takes priority
     * over the `filePathsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun filePathsExcludes(filePathsExcludes: List<String>) {
      cdkBuilder.filePathsExcludes(filePathsExcludes)
    }

    /**
     * @param filePathsExcludes The list of patterns of Git repository file paths that, when pull
     * request events occurs, are to be excluded from starting the pipeline.
     * You can filter with glob patterns. The `filePathsExcludes` takes priority
     * over the `filePathsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun filePathsExcludes(vararg filePathsExcludes: String): Unit =
        filePathsExcludes(filePathsExcludes.toList())

    /**
     * @param filePathsIncludes The list of patterns of Git repository file paths that, when pull
     * request events occurs, are to be included as criteria that starts the pipeline.
     * You can filter with glob patterns. The `filePathsExcludes` takes priority
     * over the `filePathsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun filePathsIncludes(filePathsIncludes: List<String>) {
      cdkBuilder.filePathsIncludes(filePathsIncludes)
    }

    /**
     * @param filePathsIncludes The list of patterns of Git repository file paths that, when pull
     * request events occurs, are to be included as criteria that starts the pipeline.
     * You can filter with glob patterns. The `filePathsExcludes` takes priority
     * over the `filePathsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    override fun filePathsIncludes(vararg filePathsIncludes: String): Unit =
        filePathsIncludes(filePathsIncludes.toList())

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
    cdkObject: software.amazon.awscdk.services.codepipeline.GitPushFilter,
  ) : CdkObject(cdkObject),
      GitPushFilter {
    /**
     * The list of patterns of Git branches that, when pull request events occurs, are to be
     * excluded from starting the pipeline.
     *
     * You can filter with glob patterns. The `branchesExcludes` takes priority
     * over the `branchesIncludes`.
     *
     * Maximum length of this array is 8.
     *
     * Default: - no branches.
     */
    override fun branchesExcludes(): List<String> = unwrap(this).getBranchesExcludes() ?:
        emptyList()

    /**
     * The list of patterns of Git branches that, when pull request events occurs, are to be
     * included as criteria that starts the pipeline.
     *
     * You can filter with glob patterns. The `branchesExcludes` takes priority
     * over the `branchesIncludes`.
     *
     * Maximum length of this array is 8.
     *
     * Default: - no branches.
     */
    override fun branchesIncludes(): List<String> = unwrap(this).getBranchesIncludes() ?:
        emptyList()

    /**
     * The list of patterns of Git repository file paths that, when pull request events occurs, are
     * to be excluded from starting the pipeline.
     *
     * You can filter with glob patterns. The `filePathsExcludes` takes priority
     * over the `filePathsIncludes`.
     *
     * Maximum length of this array is 8.
     *
     * Default: - no filePaths.
     */
    override fun filePathsExcludes(): List<String> = unwrap(this).getFilePathsExcludes() ?:
        emptyList()

    /**
     * The list of patterns of Git repository file paths that, when pull request events occurs, are
     * to be included as criteria that starts the pipeline.
     *
     * You can filter with glob patterns. The `filePathsExcludes` takes priority
     * over the `filePathsIncludes`.
     *
     * Maximum length of this array is 8.
     *
     * Default: - no filePaths.
     */
    override fun filePathsIncludes(): List<String> = unwrap(this).getFilePathsIncludes() ?:
        emptyList()

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
        GitPushFilter = CdkObjectWrappers.wrap(cdkObject) as? GitPushFilter ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitPushFilter):
        software.amazon.awscdk.services.codepipeline.GitPushFilter = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.GitPushFilter
  }
}
