@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.robomaker.CfnFleet
import software.constructs.Construct

@CdkDslMarker
public class CfnFleetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFleet.Builder = CfnFleet.Builder.create(scope, id)

  /**
   * The name of the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-name)
   * @param name The name of the fleet. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The list of all tags added to the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-tags)
   * @param tags The list of all tags added to the fleet. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnFleet = cdkBuilder.build()
}
