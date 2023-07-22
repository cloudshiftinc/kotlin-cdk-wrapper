@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnPlacement
import software.constructs.Construct

@CdkDslMarker
public class CfnPlacementDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPlacement.Builder = CfnPlacement.Builder.create(scope, id)

  /**
   * The devices to associate with the placement, as defined by a mapping of zero or more key-value
   * pairs wherein the key is a template name and the value is a device ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices)
   * @param associatedDevices The devices to associate with the placement, as defined by a mapping
   * of zero or more key-value pairs wherein the key is a template name and the value is a device ID. 
   */
  public fun associatedDevices(associatedDevices: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(associatedDevices)
    cdkBuilder.associatedDevices(builder.map)
  }

  /**
   * The devices to associate with the placement, as defined by a mapping of zero or more key-value
   * pairs wherein the key is a template name and the value is a device ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices)
   * @param associatedDevices The devices to associate with the placement, as defined by a mapping
   * of zero or more key-value pairs wherein the key is a template name and the value is a device ID. 
   */
  public fun associatedDevices(associatedDevices: Any) {
    cdkBuilder.associatedDevices(associatedDevices)
  }

  /**
   * The user-defined attributes associated with the placement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes)
   * @param attributes The user-defined attributes associated with the placement. 
   */
  public fun attributes(attributes: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(attributes)
    cdkBuilder.attributes(builder.map)
  }

  /**
   * The user-defined attributes associated with the placement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes)
   * @param attributes The user-defined attributes associated with the placement. 
   */
  public fun attributes(attributes: Any) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * The name of the placement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname)
   * @param placementName The name of the placement. 
   */
  public fun placementName(placementName: String) {
    cdkBuilder.placementName(placementName)
  }

  /**
   * The name of the project containing the placement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname)
   * @param projectName The name of the project containing the placement. 
   */
  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  public fun build(): CfnPlacement = cdkBuilder.build()
}
