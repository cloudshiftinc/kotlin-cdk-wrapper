@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnRecordSetGroup

@CdkDslMarker
public class CfnRecordSetGroupCidrRoutingConfigPropertyDsl {
  private val cdkBuilder: CfnRecordSetGroup.CidrRoutingConfigProperty.Builder =
      CfnRecordSetGroup.CidrRoutingConfigProperty.builder()

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

  public fun build(): CfnRecordSetGroup.CidrRoutingConfigProperty = cdkBuilder.build()
}
