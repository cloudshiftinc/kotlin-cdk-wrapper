@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

/**
 * Specifies the assignment to the partition key.
 *
 * It can be
 * enhanced with the assignment of the sort key.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * Assign assign;
 * PartitionKey partitionKey = new PartitionKey(assign);
 * ```
 */
public open class PartitionKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.PartitionKey,
) : PrimaryKey(cdkObject) {
  public constructor(pkey: Assign) :
      this(software.amazon.awscdk.services.appsync.PartitionKey(pkey.let(Assign::unwrap))
  )

  /**
   * Allows assigning a value to the sort key.
   *
   * @param key 
   */
  public open fun sort(key: String): SortKeyStep = unwrap(this).sort(key).let(SortKeyStep::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.PartitionKey): PartitionKey
        = PartitionKey(cdkObject)

    internal fun unwrap(wrapped: PartitionKey): software.amazon.awscdk.services.appsync.PartitionKey
        = wrapped.cdkObject
  }
}
