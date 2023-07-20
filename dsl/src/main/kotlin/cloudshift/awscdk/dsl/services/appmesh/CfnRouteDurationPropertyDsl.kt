@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteDurationPropertyDsl {
  private val cdkBuilder: CfnRoute.DurationProperty.Builder = CfnRoute.DurationProperty.builder()

  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRoute.DurationProperty = cdkBuilder.build()
}
