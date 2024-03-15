@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class PartitionKeyStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.PartitionKeyStep,
) : CdkObject(cdkObject) {
  public open fun auto(): PartitionKey = unwrap(this).auto().let(PartitionKey::wrap)

  public open fun `is`(`val`: String): PartitionKey =
      unwrap(this).`is`(`val`).let(PartitionKey::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.PartitionKeyStep):
        PartitionKeyStep = PartitionKeyStep(cdkObject)

    internal fun unwrap(wrapped: PartitionKeyStep):
        software.amazon.awscdk.services.appsync.PartitionKeyStep = wrapped.cdkObject
  }
}
