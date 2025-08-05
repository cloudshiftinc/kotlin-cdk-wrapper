@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean

/**
 * Helper to check if an error is of a certain type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * Errors errors = new Errors();
 * ```
 */
public open class Errors(
  cdkObject: software.amazon.awscdk.Errors,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.Errors()
  )

  public companion object {
    public fun isAssertionError(x: Any): Boolean = software.amazon.awscdk.Errors.isAssertionError(x)

    public fun isAssumptionError(x: Any): Boolean =
        software.amazon.awscdk.Errors.isAssumptionError(x)

    public fun isCloudAssemblyError(x: Any): Boolean =
        software.amazon.awscdk.Errors.isCloudAssemblyError(x)

    public fun isConstructError(x: Any): Boolean = software.amazon.awscdk.Errors.isConstructError(x)

    public fun isExecutionError(x: Any): Boolean = software.amazon.awscdk.Errors.isExecutionError(x)

    public fun isValidationError(x: Any): Boolean =
        software.amazon.awscdk.Errors.isValidationError(x)

    internal fun wrap(cdkObject: software.amazon.awscdk.Errors): Errors = Errors(cdkObject)

    internal fun unwrap(wrapped: Errors): software.amazon.awscdk.Errors = wrapped.cdkObject as
        software.amazon.awscdk.Errors
  }
}
