@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String

/**
 * Ignores file paths based on the [`.gitignore specification`](https://git-scm.com/docs/gitignore).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * GitIgnoreStrategy gitIgnoreStrategy = new GitIgnoreStrategy("absoluteRootPath",
 * List.of("patterns"));
 * ```
 */
public open class GitIgnoreStrategy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.GitIgnoreStrategy,
) : IgnoreStrategy(cdkObject) {
  /**
   * Adds another pattern.
   *
   * @param pattern 
   */
  public override fun add(pattern: String) {
    unwrap(this).add(pattern)
  }

  /**
   * Determines whether a given file path should be ignored or not.
   *
   * @return `true` if the file should be ignored
   * @param absoluteFilePath absolute file path to be assessed against the pattern. 
   */
  public override fun ignores(absoluteFilePath: String): Boolean =
      unwrap(this).ignores(absoluteFilePath)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.GitIgnoreStrategy): GitIgnoreStrategy =
        GitIgnoreStrategy(cdkObject)

    internal fun unwrap(wrapped: GitIgnoreStrategy): software.amazon.awscdk.GitIgnoreStrategy =
        wrapped.cdkObject
  }
}
