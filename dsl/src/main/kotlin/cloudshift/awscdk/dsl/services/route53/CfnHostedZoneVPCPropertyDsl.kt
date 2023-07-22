@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHostedZone

@CdkDslMarker
public class CfnHostedZoneVPCPropertyDsl {
  private val cdkBuilder: CfnHostedZone.VPCProperty.Builder = CfnHostedZone.VPCProperty.builder()

  /**
   * @param vpcId *Private hosted zones only:* The ID of an Amazon VPC. 
   *
   * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  /**
   * @param vpcRegion *Private hosted zones only:* The region that an Amazon VPC was created in. 
   *
   * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
   */
  public fun vpcRegion(vpcRegion: String) {
    cdkBuilder.vpcRegion(vpcRegion)
  }

  public fun build(): CfnHostedZone.VPCProperty = cdkBuilder.build()
}
