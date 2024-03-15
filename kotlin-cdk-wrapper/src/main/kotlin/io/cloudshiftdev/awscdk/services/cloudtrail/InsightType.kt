@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class InsightType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudtrail.InsightType,
) : CdkObject(cdkObject) {
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val API_CALL_RATE: InsightType =
        InsightType.wrap(software.amazon.awscdk.services.cloudtrail.InsightType.API_CALL_RATE)

    public val API_ERROR_RATE: InsightType =
        InsightType.wrap(software.amazon.awscdk.services.cloudtrail.InsightType.API_ERROR_RATE)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.InsightType):
        InsightType = InsightType(cdkObject)

    internal fun unwrap(wrapped: InsightType):
        software.amazon.awscdk.services.cloudtrail.InsightType = wrapped.cdkObject
  }
}
