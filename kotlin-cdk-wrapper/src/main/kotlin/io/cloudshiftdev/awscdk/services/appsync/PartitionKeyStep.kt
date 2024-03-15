@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Utility class to allow assigning a value or an auto-generated id to a partition key.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * PartitionKeyStep partitionKeyStep = new PartitionKeyStep("key");
 * ```
 */
public open class PartitionKeyStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.PartitionKeyStep,
) : CdkObject(cdkObject) {
  public constructor(key: String) :
      this(software.amazon.awscdk.services.appsync.PartitionKeyStep(key)
  )

  /**
   * Assign an auto-generated value to the partition key.
   */
  public open fun auto(): PartitionKey = unwrap(this).auto().let(PartitionKey::wrap)

  /**
   * Assign an auto-generated value to the partition key.
   *
   * @param val 
   */
  public open fun `is`(`val`: String): PartitionKey =
      unwrap(this).`is`(`val`).let(PartitionKey::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.PartitionKeyStep):
        PartitionKeyStep = PartitionKeyStep(cdkObject)

    internal fun unwrap(wrapped: PartitionKeyStep):
        software.amazon.awscdk.services.appsync.PartitionKeyStep = wrapped.cdkObject
  }
}
