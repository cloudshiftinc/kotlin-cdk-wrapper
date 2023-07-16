@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnStack

@CdkDslMarker
public class CfnStackAccessEndpointPropertyDsl {
  private val cdkBuilder: CfnStack.AccessEndpointProperty.Builder =
      CfnStack.AccessEndpointProperty.builder()

  public fun endpointType(endpointType: String) {
    cdkBuilder.endpointType(endpointType)
  }

  public fun vpceId(vpceId: String) {
    cdkBuilder.vpceId(vpceId)
  }

  public fun build(): CfnStack.AccessEndpointProperty = cdkBuilder.build()
}
