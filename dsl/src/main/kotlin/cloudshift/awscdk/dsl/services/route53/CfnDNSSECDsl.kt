@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnDNSSEC
import software.constructs.Construct

@CdkDslMarker
public class CfnDNSSECDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDNSSEC.Builder = CfnDNSSEC.Builder.create(scope, id)

  /**
   * A unique string (ID) that is used to identify a hosted zone.
   *
   * For example: `Z00001111A1ABCaaABC11` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-dnssec.html#cfn-route53-dnssec-hostedzoneid)
   * @param hostedZoneId A unique string (ID) that is used to identify a hosted zone. 
   */
  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  public fun build(): CfnDNSSEC = cdkBuilder.build()
}
