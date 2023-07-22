@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApi

@CdkDslMarker
public class CfnApiRoute53ConfigurationPropertyDsl {
  private val cdkBuilder: CfnApi.Route53ConfigurationProperty.Builder =
      CfnApi.Route53ConfigurationProperty.builder()

  /**
   * @param distributedDomainName the value to be set.
   */
  public fun distributedDomainName(distributedDomainName: String) {
    cdkBuilder.distributedDomainName(distributedDomainName)
  }

  /**
   * @param evaluateTargetHealth the value to be set.
   */
  public fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
    cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
  }

  /**
   * @param evaluateTargetHealth the value to be set.
   */
  public fun evaluateTargetHealth(evaluateTargetHealth: IResolvable) {
    cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
  }

  /**
   * @param hostedZoneId the value to be set.
   */
  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  /**
   * @param hostedZoneName the value to be set.
   */
  public fun hostedZoneName(hostedZoneName: String) {
    cdkBuilder.hostedZoneName(hostedZoneName)
  }

  /**
   * @param ipV6 the value to be set.
   */
  public fun ipV6(ipV6: Boolean) {
    cdkBuilder.ipV6(ipV6)
  }

  /**
   * @param ipV6 the value to be set.
   */
  public fun ipV6(ipV6: IResolvable) {
    cdkBuilder.ipV6(ipV6)
  }

  public fun build(): CfnApi.Route53ConfigurationProperty = cdkBuilder.build()
}
