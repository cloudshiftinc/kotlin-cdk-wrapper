@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps

@CdkDslMarker
public class CfnGeoMatchSetPropsDsl {
  private val cdkBuilder: CfnGeoMatchSetProps.Builder = CfnGeoMatchSetProps.builder()

  private val _geoMatchConstraints: MutableList<Any> = mutableListOf()

  public fun geoMatchConstraints(vararg geoMatchConstraints: Any) {
    _geoMatchConstraints.addAll(listOf(*geoMatchConstraints))
  }

  public fun geoMatchConstraints(geoMatchConstraints: Collection<Any>) {
    _geoMatchConstraints.addAll(geoMatchConstraints)
  }

  public fun geoMatchConstraints(geoMatchConstraints: IResolvable) {
    cdkBuilder.geoMatchConstraints(geoMatchConstraints)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnGeoMatchSetProps {
    if(_geoMatchConstraints.isNotEmpty()) cdkBuilder.geoMatchConstraints(_geoMatchConstraints)
    return cdkBuilder.build()
  }
}
