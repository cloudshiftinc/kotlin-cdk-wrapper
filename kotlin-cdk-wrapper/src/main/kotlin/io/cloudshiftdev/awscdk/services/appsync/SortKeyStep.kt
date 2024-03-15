@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class SortKeyStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.SortKeyStep,
) : CdkObject(cdkObject) {
  public open fun auto(): PrimaryKey = unwrap(this).auto().let(PrimaryKey::wrap)

  public open fun `is`(`val`: String): PrimaryKey = unwrap(this).`is`(`val`).let(PrimaryKey::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SortKeyStep): SortKeyStep =
        SortKeyStep(cdkObject)

    internal fun unwrap(wrapped: SortKeyStep): software.amazon.awscdk.services.appsync.SortKeyStep =
        wrapped.cdkObject
  }
}
