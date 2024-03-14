package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public abstract class IgnoreStrategy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.IgnoreStrategy,
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
   * Determines whether a given file path should be ignored or not.
   *
   * @return `true` if the file should be ignored
   * @param absoluteFilePath absolute file path to be assessed against the pattern. 
   */
  public open fun ignores(absoluteFilePath: String): Boolean =
      unwrap(this).ignores(absoluteFilePath)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IgnoreStrategy,
  ) : IgnoreStrategy(cdkObject)

  public companion object {
    public fun docker(absoluteRootPath: String, patterns: List<String>): DockerIgnoreStrategy =
        software.amazon.awscdk.IgnoreStrategy.docker(absoluteRootPath,
        patterns).let(DockerIgnoreStrategy::wrap)

    public fun fromCopyOptions(options: CopyOptions, absoluteRootPath: String): IgnoreStrategy =
        software.amazon.awscdk.IgnoreStrategy.fromCopyOptions(options.let(CopyOptions::unwrap),
        absoluteRootPath).let(IgnoreStrategy::wrap)

    public fun git(absoluteRootPath: String, patterns: List<String>): GitIgnoreStrategy =
        software.amazon.awscdk.IgnoreStrategy.git(absoluteRootPath,
        patterns).let(GitIgnoreStrategy::wrap)

    public fun glob(absoluteRootPath: String, patterns: List<String>): GlobIgnoreStrategy =
        software.amazon.awscdk.IgnoreStrategy.glob(absoluteRootPath,
        patterns).let(GlobIgnoreStrategy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.IgnoreStrategy): IgnoreStrategy =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IgnoreStrategy): software.amazon.awscdk.IgnoreStrategy = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IgnoreStrategy
  }
}
