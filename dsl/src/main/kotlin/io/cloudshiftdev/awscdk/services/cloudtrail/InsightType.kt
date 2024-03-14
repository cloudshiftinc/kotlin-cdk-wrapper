package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class InsightType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudtrail.InsightType,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.InsightType):
        InsightType = InsightType(cdkObject)

    internal fun unwrap(wrapped: InsightType):
        software.amazon.awscdk.services.cloudtrail.InsightType = wrapped.cdkObject
  }
}
