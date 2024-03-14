package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public open class SortKeyStep internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.SortKeyStep,
) {
  public open fun auto(): PrimaryKey = unwrap(this).auto().let(PrimaryKey::wrap)

  public open fun `is`(`val`: String): PrimaryKey = unwrap(this).`is`(`val`).let(PrimaryKey::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SortKeyStep): SortKeyStep =
        SortKeyStep(cdkObject)

    internal fun unwrap(wrapped: SortKeyStep): software.amazon.awscdk.services.appsync.SortKeyStep =
        wrapped.cdkObject
  }
}
