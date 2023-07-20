@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnInput

@CdkDslMarker
public class CfnInputAttributePropertyDsl {
  private val cdkBuilder: CfnInput.AttributeProperty.Builder = CfnInput.AttributeProperty.builder()

  public fun jsonPath(jsonPath: String) {
    cdkBuilder.jsonPath(jsonPath)
  }

  public fun build(): CfnInput.AttributeProperty = cdkBuilder.build()
}
