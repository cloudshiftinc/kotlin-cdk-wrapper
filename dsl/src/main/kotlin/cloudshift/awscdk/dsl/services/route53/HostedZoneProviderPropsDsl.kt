@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.route53.HostedZoneProviderProps

@CdkDslMarker
public class HostedZoneProviderPropsDsl {
  private val cdkBuilder: HostedZoneProviderProps.Builder = HostedZoneProviderProps.builder()

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun privateZone(privateZone: Boolean) {
    cdkBuilder.privateZone(privateZone)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): HostedZoneProviderProps = cdkBuilder.build()
}
