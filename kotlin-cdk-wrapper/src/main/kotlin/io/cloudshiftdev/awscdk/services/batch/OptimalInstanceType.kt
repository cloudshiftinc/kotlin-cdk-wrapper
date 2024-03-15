@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.services.ec2.InstanceType

/**
 * Not a real instance type!
 *
 * Indicates that Batch will choose one it determines to be optimal
 * for the workload.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * OptimalInstanceType optimalInstanceType = new OptimalInstanceType();
 * ```
 */
public open class OptimalInstanceType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.OptimalInstanceType,
) : InstanceType(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.batch.OptimalInstanceType())

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.OptimalInstanceType):
        OptimalInstanceType = OptimalInstanceType(cdkObject)

    internal fun unwrap(wrapped: OptimalInstanceType):
        software.amazon.awscdk.services.batch.OptimalInstanceType = wrapped.cdkObject
  }
}
