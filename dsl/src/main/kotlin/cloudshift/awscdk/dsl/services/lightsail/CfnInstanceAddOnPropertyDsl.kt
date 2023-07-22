@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance

/**
 * `AddOn` is a property of the
 * [AWS::Lightsail::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
 * resource. It describes the add-ons for an instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * AddOnProperty addOnProperty = AddOnProperty.builder()
 * .addOnType("addOnType")
 * // the properties below are optional
 * .autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty.builder()
 * .snapshotTimeOfDay("snapshotTimeOfDay")
 * .build())
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-addon.html)
 */
@CdkDslMarker
public class CfnInstanceAddOnPropertyDsl {
  private val cdkBuilder: CfnInstance.AddOnProperty.Builder = CfnInstance.AddOnProperty.builder()

  /**
   * @param addOnType The add-on type (for example, `AutoSnapshot` ). 
   *
   * `AutoSnapshot` is the only add-on that can be enabled for an instance.
   */
  public fun addOnType(addOnType: String) {
    cdkBuilder.addOnType(addOnType)
  }

  /**
   * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on, such as the
   * daily time when an automatic snapshot will be created.
   */
  public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable) {
    cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest)
  }

  /**
   * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on, such as the
   * daily time when an automatic snapshot will be created.
   */
  public
      fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: CfnInstance.AutoSnapshotAddOnProperty) {
    cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest)
  }

  /**
   * @param status The status of the add-on.
   * Valid Values: `Enabled` | `Disabled`
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnInstance.AddOnProperty = cdkBuilder.build()
}
