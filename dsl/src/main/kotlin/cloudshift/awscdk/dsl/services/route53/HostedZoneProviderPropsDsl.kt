@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.route53.HostedZoneProviderProps

@CdkDslMarker
public class HostedZoneProviderPropsDsl {
  private val cdkBuilder: HostedZoneProviderProps.Builder = HostedZoneProviderProps.builder()

  /**
   * @param domainName The zone domain e.g. example.com. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param privateZone Whether the zone that is being looked up is a private hosted zone.
   */
  public fun privateZone(privateZone: Boolean) {
    cdkBuilder.privateZone(privateZone)
  }

  /**
   * @param vpcId Specifies the ID of the VPC associated with a private hosted zone.
   * If a VPC ID is provided and privateZone is false, no results will be returned
   * and an error will be raised
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): HostedZoneProviderProps = cdkBuilder.build()
}
