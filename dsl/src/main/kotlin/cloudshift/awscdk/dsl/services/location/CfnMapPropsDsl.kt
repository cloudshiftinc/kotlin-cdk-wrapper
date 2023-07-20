@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.location.CfnMap
import software.amazon.awscdk.services.location.CfnMapProps

@CdkDslMarker
public class CfnMapPropsDsl {
  private val cdkBuilder: CfnMapProps.Builder = CfnMapProps.builder()

  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  public fun configuration(configuration: CfnMap.MapConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun mapName(mapName: String) {
    cdkBuilder.mapName(mapName)
  }

  public fun pricingPlan(pricingPlan: String) {
    cdkBuilder.pricingPlan(pricingPlan)
  }

  public fun build(): CfnMapProps = cdkBuilder.build()
}
