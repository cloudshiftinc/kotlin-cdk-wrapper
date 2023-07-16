@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHostedZone

@CdkDslMarker
public class CfnHostedZoneVPCPropertyDsl {
  private val cdkBuilder: CfnHostedZone.VPCProperty.Builder = CfnHostedZone.VPCProperty.builder()

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun vpcRegion(vpcRegion: String) {
    cdkBuilder.vpcRegion(vpcRegion)
  }

  public fun build(): CfnHostedZone.VPCProperty = cdkBuilder.build()
}
