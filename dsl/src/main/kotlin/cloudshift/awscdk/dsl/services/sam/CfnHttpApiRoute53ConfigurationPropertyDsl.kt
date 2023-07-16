@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnHttpApi

@CdkDslMarker
public class CfnHttpApiRoute53ConfigurationPropertyDsl {
  private val cdkBuilder: CfnHttpApi.Route53ConfigurationProperty.Builder =
      CfnHttpApi.Route53ConfigurationProperty.builder()

  public fun distributedDomainName(distributedDomainName: String) {
    cdkBuilder.distributedDomainName(distributedDomainName)
  }

  public fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
    cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
  }

  public fun evaluateTargetHealth(evaluateTargetHealth: IResolvable) {
    cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
  }

  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  public fun hostedZoneName(hostedZoneName: String) {
    cdkBuilder.hostedZoneName(hostedZoneName)
  }

  public fun ipV6(ipV6: Boolean) {
    cdkBuilder.ipV6(ipV6)
  }

  public fun ipV6(ipV6: IResolvable) {
    cdkBuilder.ipV6(ipV6)
  }

  public fun build(): CfnHttpApi.Route53ConfigurationProperty = cdkBuilder.build()
}
