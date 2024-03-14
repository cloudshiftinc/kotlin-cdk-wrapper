package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.collections.List

public open class GeoRestriction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.GeoRestriction,
) {
  public open fun locations(): List<String> = unwrap(this).getLocations() ?: emptyList()

  public open fun restrictionType(): String = unwrap(this).getRestrictionType()

  public companion object {
    public open fun allowlist(locations: String): GeoRestriction =
        software.amazon.awscdk.services.cloudfront.GeoRestriction.allowlist(locations).let(GeoRestriction::wrap)

    public open fun denylist(locations: String): GeoRestriction =
        software.amazon.awscdk.services.cloudfront.GeoRestriction.denylist(locations).let(GeoRestriction::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.GeoRestriction):
        GeoRestriction = GeoRestriction(cdkObject)

    internal fun unwrap(wrapped: GeoRestriction):
        software.amazon.awscdk.services.cloudfront.GeoRestriction = wrapped.cdkObject
  }
}
