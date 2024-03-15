@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public open class PartitionKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.PartitionKey,
) : PrimaryKey(cdkObject) {
  public open fun sort(key: String): SortKeyStep = unwrap(this).sort(key).let(SortKeyStep::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.PartitionKey): PartitionKey
        = PartitionKey(cdkObject)

    internal fun unwrap(wrapped: PartitionKey): software.amazon.awscdk.services.appsync.PartitionKey
        = wrapped.cdkObject
  }
}
