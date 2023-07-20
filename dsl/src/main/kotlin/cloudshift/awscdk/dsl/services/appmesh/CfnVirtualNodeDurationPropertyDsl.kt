@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeDurationPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.DurationProperty.Builder =
      CfnVirtualNode.DurationProperty.builder()

  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnVirtualNode.DurationProperty = cdkBuilder.build()
}
