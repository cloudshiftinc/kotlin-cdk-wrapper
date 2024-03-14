package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String

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
