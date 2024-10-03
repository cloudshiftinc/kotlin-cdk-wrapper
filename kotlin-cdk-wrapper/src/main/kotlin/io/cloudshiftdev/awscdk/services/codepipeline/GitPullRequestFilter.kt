@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Git pull request filter for trigger.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * GitPullRequestFilter gitPullRequestFilter = GitPullRequestFilter.builder()
 * .branchesExcludes(List.of("branchesExcludes"))
 * .branchesIncludes(List.of("branchesIncludes"))
 * .events(List.of(GitPullRequestEvent.OPEN))
 * .filePathsExcludes(List.of("filePathsExcludes"))
 * .filePathsIncludes(List.of("filePathsIncludes"))
 * .build();
 * ```
 */
public interface GitPullRequestFilter {
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
   * The field that specifies which pull request events to filter on (opened, updated, closed) for
   * the trigger configuration.
   *
   * Default: - all events.
   */
  public fun events(): List<GitPullRequestEvent> =
      unwrap(this).getEvents()?.map(GitPullRequestEvent::wrap) ?: emptyList()

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
   * A builder for [GitPullRequestFilter]
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
     * @param events The field that specifies which pull request events to filter on (opened,
     * updated, closed) for the trigger configuration.
     */
    public fun events(events: List<GitPullRequestEvent>)

    /**
     * @param events The field that specifies which pull request events to filter on (opened,
     * updated, closed) for the trigger configuration.
     */
    public fun events(vararg events: GitPullRequestEvent)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.GitPullRequestFilter.Builder =
        software.amazon.awscdk.services.codepipeline.GitPullRequestFilter.builder()

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
     * @param events The field that specifies which pull request events to filter on (opened,
     * updated, closed) for the trigger configuration.
     */
    override fun events(events: List<GitPullRequestEvent>) {
      cdkBuilder.events(events.map(GitPullRequestEvent.Companion::unwrap))
    }

    /**
     * @param events The field that specifies which pull request events to filter on (opened,
     * updated, closed) for the trigger configuration.
     */
    override fun events(vararg events: GitPullRequestEvent): Unit = events(events.toList())

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

    public fun build(): software.amazon.awscdk.services.codepipeline.GitPullRequestFilter =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.GitPullRequestFilter,
  ) : CdkObject(cdkObject),
      GitPullRequestFilter {
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
     * The field that specifies which pull request events to filter on (opened, updated, closed) for
     * the trigger configuration.
     *
     * Default: - all events.
     */
    override fun events(): List<GitPullRequestEvent> =
        unwrap(this).getEvents()?.map(GitPullRequestEvent::wrap) ?: emptyList()

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitPullRequestFilter {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.GitPullRequestFilter):
        GitPullRequestFilter = CdkObjectWrappers.wrap(cdkObject) as? GitPullRequestFilter ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitPullRequestFilter):
        software.amazon.awscdk.services.codepipeline.GitPullRequestFilter = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.GitPullRequestFilter
  }
}
