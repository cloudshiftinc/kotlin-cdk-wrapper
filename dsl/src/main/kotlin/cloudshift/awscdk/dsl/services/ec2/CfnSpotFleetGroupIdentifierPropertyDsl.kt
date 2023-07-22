@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Describes a security group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * GroupIdentifierProperty groupIdentifierProperty = GroupIdentifierProperty.builder()
 * .groupId("groupId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-groupidentifier.html)
 */
@CdkDslMarker
public class CfnSpotFleetGroupIdentifierPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.GroupIdentifierProperty.Builder =
      CfnSpotFleet.GroupIdentifierProperty.builder()

  /**
   * @param groupId The ID of the security group. 
   */
  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  public fun build(): CfnSpotFleet.GroupIdentifierProperty = cdkBuilder.build()
}
