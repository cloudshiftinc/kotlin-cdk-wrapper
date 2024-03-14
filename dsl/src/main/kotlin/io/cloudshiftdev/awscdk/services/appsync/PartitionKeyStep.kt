package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public open class PartitionKeyStep internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.PartitionKeyStep,
) {
  public open fun auto(): PartitionKey = unwrap(this).auto().let(PartitionKey::wrap)

  public open fun `is`(`val`: String): PartitionKey =
      unwrap(this).`is`(`val`).let(PartitionKey::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.PartitionKeyStep):
        PartitionKeyStep = PartitionKeyStep(cdkObject)

    internal fun unwrap(wrapped: PartitionKeyStep):
        software.amazon.awscdk.services.appsync.PartitionKeyStep = wrapped.cdkObject
  }
}
