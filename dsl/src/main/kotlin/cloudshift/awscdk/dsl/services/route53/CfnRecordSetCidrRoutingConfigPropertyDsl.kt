@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnRecordSet

@CdkDslMarker
public class CfnRecordSetCidrRoutingConfigPropertyDsl {
  private val cdkBuilder: CfnRecordSet.CidrRoutingConfigProperty.Builder =
      CfnRecordSet.CidrRoutingConfigProperty.builder()

  /**
   * @param collectionId The CIDR collection ID. 
   */
  public fun collectionId(collectionId: String) {
    cdkBuilder.collectionId(collectionId)
  }

  /**
   * @param locationName The CIDR collection location name. 
   */
  public fun locationName(locationName: String) {
    cdkBuilder.locationName(locationName)
  }

  public fun build(): CfnRecordSet.CidrRoutingConfigProperty = cdkBuilder.build()
}
