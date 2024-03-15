@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public abstract class IgnoreStrategy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.IgnoreStrategy,
) : CdkObject(cdkObject) {
  public open fun add(arg0: String) {
    unwrap(this).add(arg0)
  }

  public open fun ignores(arg0: String): Boolean = unwrap(this).ignores(arg0)

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
