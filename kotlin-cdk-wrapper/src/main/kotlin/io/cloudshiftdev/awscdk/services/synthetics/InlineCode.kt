@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class InlineCode internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.synthetics.InlineCode,
) : Code(cdkObject) {
  public override fun bind(
    _scope: Construct,
    handler: String,
    _family: RuntimeFamily,
  ): CodeConfig = unwrap(this).bind(_scope.let(Construct::unwrap), handler,
      _family.let(RuntimeFamily::unwrap)).let(CodeConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.InlineCode): InlineCode
        = InlineCode(cdkObject)

    internal fun unwrap(wrapped: InlineCode): software.amazon.awscdk.services.synthetics.InlineCode
        = wrapped.cdkObject
  }
}
