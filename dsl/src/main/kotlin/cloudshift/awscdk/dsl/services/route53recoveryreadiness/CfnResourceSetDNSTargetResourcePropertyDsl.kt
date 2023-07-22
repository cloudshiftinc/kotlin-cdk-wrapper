@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

@CdkDslMarker
public class CfnResourceSetDNSTargetResourcePropertyDsl {
  private val cdkBuilder: CfnResourceSet.DNSTargetResourceProperty.Builder =
      CfnResourceSet.DNSTargetResourceProperty.builder()

  /**
   * @param domainName The domain name that acts as an ingress point to a portion of the customer
   * application.
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param hostedZoneArn The hosted zone Amazon Resource Name (ARN) that contains the DNS record
   * with the provided name of the target resource.
   */
  public fun hostedZoneArn(hostedZoneArn: String) {
    cdkBuilder.hostedZoneArn(hostedZoneArn)
  }

  /**
   * @param recordSetId The Amazon Route 53 record set ID that uniquely identifies a DNS record,
   * given a name and a type.
   */
  public fun recordSetId(recordSetId: String) {
    cdkBuilder.recordSetId(recordSetId)
  }

  /**
   * @param recordType The type of DNS record of the target resource.
   */
  public fun recordType(recordType: String) {
    cdkBuilder.recordType(recordType)
  }

  /**
   * @param targetResource The target resource that the Route 53 record points to.
   */
  public fun targetResource(targetResource: IResolvable) {
    cdkBuilder.targetResource(targetResource)
  }

  /**
   * @param targetResource The target resource that the Route 53 record points to.
   */
  public fun targetResource(targetResource: CfnResourceSet.TargetResourceProperty) {
    cdkBuilder.targetResource(targetResource)
  }

  public fun build(): CfnResourceSet.DNSTargetResourceProperty = cdkBuilder.build()
}
