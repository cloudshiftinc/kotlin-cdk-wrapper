@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * Specifies zone awareness configuration options.
 *
 * Only use if `ZoneAwarenessEnabled` is `true` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * ZoneAwarenessConfigProperty zoneAwarenessConfigProperty = ZoneAwarenessConfigProperty.builder()
 * .availabilityZoneCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-zoneawarenessconfig.html)
 */
@CdkDslMarker
public class CfnDomainZoneAwarenessConfigPropertyDsl {
  private val cdkBuilder: CfnDomain.ZoneAwarenessConfigProperty.Builder =
      CfnDomain.ZoneAwarenessConfigProperty.builder()

  /**
   * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number of
   * AZs that you want the domain to use.
   * Valid values are `2` and `3` . Default is 2.
   */
  public fun availabilityZoneCount(availabilityZoneCount: Number) {
    cdkBuilder.availabilityZoneCount(availabilityZoneCount)
  }

  public fun build(): CfnDomain.ZoneAwarenessConfigProperty = cdkBuilder.build()
}
