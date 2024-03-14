package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class PrimaryKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.PrimaryKey,
) : CdkObject(cdkObject) {
  /**
   * Renders the key assignment to a VTL string.
   */
  public open fun renderTemplate(): String = unwrap(this).renderTemplate()

  public companion object {
    public fun partition(key: String): PartitionKeyStep =
        software.amazon.awscdk.services.appsync.PrimaryKey.partition(key).let(PartitionKeyStep::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.PrimaryKey): PrimaryKey =
        PrimaryKey(cdkObject)

    internal fun unwrap(wrapped: PrimaryKey): software.amazon.awscdk.services.appsync.PrimaryKey =
        wrapped.cdkObject
  }
}
