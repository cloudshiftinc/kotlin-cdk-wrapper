@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Canary code from an inline string.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.synthetics.*;
 * InlineCode inlineCode = new InlineCode("code");
 * ```
 */
public open class InlineCode(
  cdkObject: software.amazon.awscdk.services.synthetics.InlineCode,
) : Code(cdkObject) {
  public constructor(code: String) :
      this(software.amazon.awscdk.services.synthetics.InlineCode(code)
  )

  /**
   * Called when the canary is initialized to allow this object to bind to the stack, add resources
   * and have fun.
   *
   * @param _scope 
   * @param handler 
   * @param _family 
   */
  public override fun bind(
    scope: Construct,
    handler: String,
    family: RuntimeFamily,
  ): CodeConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap), handler,
      family.let(RuntimeFamily.Companion::unwrap)).let(CodeConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.InlineCode): InlineCode
        = InlineCode(cdkObject)

    internal fun unwrap(wrapped: InlineCode): software.amazon.awscdk.services.synthetics.InlineCode
        = wrapped.cdkObject as software.amazon.awscdk.services.synthetics.InlineCode
  }
}
