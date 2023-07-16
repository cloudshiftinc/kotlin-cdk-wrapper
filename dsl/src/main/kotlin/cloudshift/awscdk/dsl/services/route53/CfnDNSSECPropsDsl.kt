@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnDNSSECProps

@CdkDslMarker
public class CfnDNSSECPropsDsl {
  private val cdkBuilder: CfnDNSSECProps.Builder = CfnDNSSECProps.builder()

  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  public fun build(): CfnDNSSECProps = cdkBuilder.build()
}
