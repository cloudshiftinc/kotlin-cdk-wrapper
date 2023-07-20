@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionGeoRestrictionPropertyDsl {
  private val cdkBuilder: CfnDistribution.GeoRestrictionProperty.Builder =
      CfnDistribution.GeoRestrictionProperty.builder()

  private val _locations: MutableList<String> = mutableListOf()

  public fun locations(vararg locations: String) {
    _locations.addAll(listOf(*locations))
  }

  public fun locations(locations: Collection<String>) {
    _locations.addAll(locations)
  }

  public fun restrictionType(restrictionType: String) {
    cdkBuilder.restrictionType(restrictionType)
  }

  public fun build(): CfnDistribution.GeoRestrictionProperty {
    if(_locations.isNotEmpty()) cdkBuilder.locations(_locations)
    return cdkBuilder.build()
  }
}
