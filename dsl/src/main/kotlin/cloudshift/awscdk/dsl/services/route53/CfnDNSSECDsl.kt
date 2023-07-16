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

  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  public fun build(): CfnDNSSEC = cdkBuilder.build()
}
