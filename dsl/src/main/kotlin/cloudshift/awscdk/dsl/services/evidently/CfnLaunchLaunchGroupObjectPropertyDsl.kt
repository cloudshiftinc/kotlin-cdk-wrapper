@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnLaunch

/**
 * A structure that defines one launch group in a launch.
 *
 * A launch group is a variation of the feature that you are including in the launch.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * LaunchGroupObjectProperty launchGroupObjectProperty = LaunchGroupObjectProperty.builder()
 * .feature("feature")
 * .groupName("groupName")
 * .variation("variation")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html)
 */
@CdkDslMarker
public class CfnLaunchLaunchGroupObjectPropertyDsl {
  private val cdkBuilder: CfnLaunch.LaunchGroupObjectProperty.Builder =
      CfnLaunch.LaunchGroupObjectProperty.builder()

  /**
   * @param description A description of the launch group.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param feature The feature that this launch is using. 
   */
  public fun feature(feature: String) {
    cdkBuilder.feature(feature)
  }

  /**
   * @param groupName A name for this launch group. 
   * It can include up to 127 characters.
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * @param variation The feature variation to use for this launch group. 
   */
  public fun variation(variation: String) {
    cdkBuilder.variation(variation)
  }

  public fun build(): CfnLaunch.LaunchGroupObjectProperty = cdkBuilder.build()
}
