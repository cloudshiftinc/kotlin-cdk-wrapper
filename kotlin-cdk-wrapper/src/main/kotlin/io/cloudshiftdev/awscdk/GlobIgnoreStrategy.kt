@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Ignores file paths based on simple glob patterns.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * GlobIgnoreStrategy globIgnoreStrategy = new GlobIgnoreStrategy("absoluteRootPath",
 * List.of("patterns"));
 * ```
 */
public open class GlobIgnoreStrategy(
  cdkObject: software.amazon.awscdk.GlobIgnoreStrategy,
) : IgnoreStrategy(cdkObject) {
  public constructor(absoluteRootPath: String, patterns: List<String>) :
      this(software.amazon.awscdk.GlobIgnoreStrategy(absoluteRootPath, patterns)
  )

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
    internal fun wrap(cdkObject: software.amazon.awscdk.GlobIgnoreStrategy): GlobIgnoreStrategy =
        GlobIgnoreStrategy(cdkObject)

    internal fun unwrap(wrapped: GlobIgnoreStrategy): software.amazon.awscdk.GlobIgnoreStrategy =
        wrapped.cdkObject as software.amazon.awscdk.GlobIgnoreStrategy
  }
}
