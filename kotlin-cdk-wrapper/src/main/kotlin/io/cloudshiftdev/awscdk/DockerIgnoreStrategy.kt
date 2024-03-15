@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String

public open class DockerIgnoreStrategy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.DockerIgnoreStrategy,
) : IgnoreStrategy(cdkObject) {
  public override fun add(pattern: String) {
    unwrap(this).add(pattern)
  }

  public override fun ignores(absoluteFilePath: String): Boolean =
      unwrap(this).ignores(absoluteFilePath)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.DockerIgnoreStrategy): DockerIgnoreStrategy
        = DockerIgnoreStrategy(cdkObject)

    internal fun unwrap(wrapped: DockerIgnoreStrategy): software.amazon.awscdk.DockerIgnoreStrategy
        = wrapped.cdkObject
  }
}
