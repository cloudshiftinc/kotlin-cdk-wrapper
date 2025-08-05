@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Represents file path ignoring behavior.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * IgnoreStrategy ignoreStrategy = IgnoreStrategy.fromCopyOptions(CopyOptions.builder()
 * .exclude(List.of("exclude"))
 * .follow(SymlinkFollowMode.NEVER)
 * .ignoreMode(IgnoreMode.GLOB)
 * .build(), "absoluteRootPath");
 * ```
 */
public abstract class IgnoreStrategy(
  cdkObject: software.amazon.awscdk.IgnoreStrategy,
) : CdkObject(cdkObject) {
  /**
   * Adds another pattern.
   *
   * @param pattern 
   */
  public open fun add(pattern: String) {
    unwrap(this).add(pattern)
  }

  /**
   * Determines whether a given file path should be ignored and have all of its children ignored if
   * its a directory.
   *
   * @return `true` if the file should be ignored
   * @param absoluteFilePath absolute file path to be assessed against the pattern. 
   */
  public open fun completelyIgnores(absoluteFilePath: String): Boolean =
      unwrap(this).completelyIgnores(absoluteFilePath)

  /**
   * Determines whether a given file path should be ignored or not.
   *
   * @return `true` if the file should be ignored
   * @param absoluteFilePath absolute file path to be assessed against the pattern. 
   */
  public open fun ignores(absoluteFilePath: String): Boolean =
      unwrap(this).ignores(absoluteFilePath)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IgnoreStrategy,
  ) : IgnoreStrategy(cdkObject)

  public companion object {
    public fun docker(absoluteRootPath: String, patterns: List<String>): DockerIgnoreStrategy =
        software.amazon.awscdk.IgnoreStrategy.docker(absoluteRootPath,
        patterns).let(DockerIgnoreStrategy::wrap)

    public fun fromCopyOptions(options: CopyOptions, absoluteRootPath: String): IgnoreStrategy =
        software.amazon.awscdk.IgnoreStrategy.fromCopyOptions(options.let(CopyOptions.Companion::unwrap),
        absoluteRootPath).let(IgnoreStrategy::wrap)

    public fun git(absoluteRootPath: String, patterns: List<String>): GitIgnoreStrategy =
        software.amazon.awscdk.IgnoreStrategy.git(absoluteRootPath,
        patterns).let(GitIgnoreStrategy::wrap)

    public fun glob(absoluteRootPath: String, patterns: List<String>): GlobIgnoreStrategy =
        software.amazon.awscdk.IgnoreStrategy.glob(absoluteRootPath,
        patterns).let(GlobIgnoreStrategy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.IgnoreStrategy): IgnoreStrategy =
        CdkObjectWrappers.wrap(cdkObject) as? IgnoreStrategy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IgnoreStrategy): software.amazon.awscdk.IgnoreStrategy = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IgnoreStrategy
  }
}
