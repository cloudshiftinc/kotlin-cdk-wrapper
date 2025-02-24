@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Util element for InsightSelector.
 *
 * Example:
 *
 * ```
 * Trail.Builder.create(this, "Insights")
 * .insightTypes(List.of(InsightType.API_CALL_RATE, InsightType.API_ERROR_RATE))
 * .build();
 * ```
 */
public open class InsightType(
  cdkObject: software.amazon.awscdk.services.cloudtrail.InsightType,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val API_CALL_RATE: InsightType =
        InsightType.wrap(software.amazon.awscdk.services.cloudtrail.InsightType.API_CALL_RATE)

    public val API_ERROR_RATE: InsightType =
        InsightType.wrap(software.amazon.awscdk.services.cloudtrail.InsightType.API_ERROR_RATE)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.InsightType):
        InsightType = InsightType(cdkObject)

    internal fun unwrap(wrapped: InsightType):
        software.amazon.awscdk.services.cloudtrail.InsightType = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudtrail.InsightType
  }
}
