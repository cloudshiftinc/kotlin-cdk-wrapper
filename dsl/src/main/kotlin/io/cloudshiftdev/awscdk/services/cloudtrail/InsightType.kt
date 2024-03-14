package io.cloudshiftdev.awscdk.services.cloudtrail

import kotlin.String

public open class InsightType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudtrail.InsightType,
) {
  /**
   *
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.InsightType):
        InsightType = InsightType(cdkObject)

    internal fun unwrap(wrapped: InsightType):
        software.amazon.awscdk.services.cloudtrail.InsightType = wrapped.cdkObject
  }
}
