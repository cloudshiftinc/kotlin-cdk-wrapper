@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetGroupIdentifierPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.GroupIdentifierProperty.Builder =
      CfnSpotFleet.GroupIdentifierProperty.builder()

  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  public fun build(): CfnSpotFleet.GroupIdentifierProperty = cdkBuilder.build()
}
