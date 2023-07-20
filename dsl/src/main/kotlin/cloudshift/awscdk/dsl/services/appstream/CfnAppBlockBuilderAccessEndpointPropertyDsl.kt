@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilder

@CdkDslMarker
public class CfnAppBlockBuilderAccessEndpointPropertyDsl {
  private val cdkBuilder: CfnAppBlockBuilder.AccessEndpointProperty.Builder =
      CfnAppBlockBuilder.AccessEndpointProperty.builder()

  public fun endpointType(endpointType: String) {
    cdkBuilder.endpointType(endpointType)
  }

  public fun vpceId(vpceId: String) {
    cdkBuilder.vpceId(vpceId)
  }

  public fun build(): CfnAppBlockBuilder.AccessEndpointProperty = cdkBuilder.build()
}
