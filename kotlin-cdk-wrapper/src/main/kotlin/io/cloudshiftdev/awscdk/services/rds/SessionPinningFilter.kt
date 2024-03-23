@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * SessionPinningFilter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * SessionPinningFilter sessionPinningFilter = SessionPinningFilter.of("filterName");
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html#rds-proxy-pinning)
 */
public open class SessionPinningFilter(
  cdkObject: software.amazon.awscdk.services.rds.SessionPinningFilter,
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
        software.amazon.awscdk.services.rds.SessionPinningFilter = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.SessionPinningFilter
  }
}
