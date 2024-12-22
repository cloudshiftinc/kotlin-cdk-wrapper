@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number

/**
 * Default Priority values for Aspects.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * AspectPriority aspectPriority = new AspectPriority();
 * ```
 */
public open class AspectPriority(
  cdkObject: software.amazon.awscdk.AspectPriority,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.AspectPriority()
  )

  public companion object {
    public val DEFAULT: Number = software.amazon.awscdk.AspectPriority.DEFAULT

    public val MUTATING: Number = software.amazon.awscdk.AspectPriority.MUTATING

    public val READONLY: Number = software.amazon.awscdk.AspectPriority.READONLY

    internal fun wrap(cdkObject: software.amazon.awscdk.AspectPriority): AspectPriority =
        AspectPriority(cdkObject)

    internal fun unwrap(wrapped: AspectPriority): software.amazon.awscdk.AspectPriority =
        wrapped.cdkObject as software.amazon.awscdk.AspectPriority
  }
}
