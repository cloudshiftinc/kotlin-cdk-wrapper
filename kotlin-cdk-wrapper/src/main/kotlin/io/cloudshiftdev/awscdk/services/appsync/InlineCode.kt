@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.constructs.Construct

/**
 * AppSync function code from an inline string.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * InlineCode inlineCode = new InlineCode("code");
 * ```
 */
public open class InlineCode internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.InlineCode,
) : Code(cdkObject) {
  /**
   * Bind source code to an AppSync Function or resolver.
   *
   * @param _scope 
   */
  public override fun bind(_scope: Construct): CodeConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.InlineCode): InlineCode =
        InlineCode(cdkObject)

    internal fun unwrap(wrapped: InlineCode): software.amazon.awscdk.services.appsync.InlineCode =
        wrapped.cdkObject
  }
}
