@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String

public open class GitIgnoreStrategy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.GitIgnoreStrategy,
) : IgnoreStrategy(cdkObject) {
  public override fun add(pattern: String) {
    unwrap(this).add(pattern)
  }

  public override fun ignores(absoluteFilePath: String): Boolean =
      unwrap(this).ignores(absoluteFilePath)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.GitIgnoreStrategy): GitIgnoreStrategy =
        GitIgnoreStrategy(cdkObject)

    internal fun unwrap(wrapped: GitIgnoreStrategy): software.amazon.awscdk.GitIgnoreStrategy =
        wrapped.cdkObject
  }
}
