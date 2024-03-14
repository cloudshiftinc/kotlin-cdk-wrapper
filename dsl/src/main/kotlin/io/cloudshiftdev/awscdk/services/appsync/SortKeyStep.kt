package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class SortKeyStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.SortKeyStep,
) : CdkObject(cdkObject) {
  /**
   * Assign an auto-generated value to the sort key.
   */
  public open fun auto(): PrimaryKey = unwrap(this).auto().let(PrimaryKey::wrap)

  /**
   * Assign an auto-generated value to the sort key.
   *
   * @param val 
   */
  public open fun `is`(`val`: String): PrimaryKey = unwrap(this).`is`(`val`).let(PrimaryKey::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SortKeyStep): SortKeyStep =
        SortKeyStep(cdkObject)

    internal fun unwrap(wrapped: SortKeyStep): software.amazon.awscdk.services.appsync.SortKeyStep =
        wrapped.cdkObject
  }
}
