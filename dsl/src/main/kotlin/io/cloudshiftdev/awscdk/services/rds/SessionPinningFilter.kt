package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class SessionPinningFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.SessionPinningFilter,
) : CdkObject(cdkObject) {
  /**
   * Filter name.
   */
  public open fun filterName(): String = unwrap(this).getFilterName()

  public companion object {
    public val EXCLUDE_VARIABLE_SETS: SessionPinningFilter =
        SessionPinningFilter.wrap(software.amazon.awscdk.services.rds.SessionPinningFilter.EXCLUDE_VARIABLE_SETS)

    public fun of(filterName: String): SessionPinningFilter =
        software.amazon.awscdk.services.rds.SessionPinningFilter.of(filterName).let(SessionPinningFilter::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.SessionPinningFilter):
        SessionPinningFilter = SessionPinningFilter(cdkObject)

    internal fun unwrap(wrapped: SessionPinningFilter):
        software.amazon.awscdk.services.rds.SessionPinningFilter = wrapped.cdkObject
  }
}
