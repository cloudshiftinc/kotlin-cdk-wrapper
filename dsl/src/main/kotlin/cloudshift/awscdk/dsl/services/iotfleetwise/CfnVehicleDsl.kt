@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnVehicle
import software.constructs.Construct

@CdkDslMarker
public class CfnVehicleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVehicle.Builder = CfnVehicle.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * (Optional) An option to create a new AWS IoT thing when creating a vehicle, or to validate an
   * existing thing as a vehicle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-associationbehavior)
   * @param associationBehavior (Optional) An option to create a new AWS IoT thing when creating a
   * vehicle, or to validate an existing thing as a vehicle. 
   */
  public fun associationBehavior(associationBehavior: String) {
    cdkBuilder.associationBehavior(associationBehavior)
  }

  /**
   * (Optional) Static information about a vehicle in a key-value pair.
   *
   * For example: `"engine Type"` : `"v6"`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
   * @param attributes (Optional) Static information about a vehicle in a key-value pair. 
   */
  public fun attributes(attributes: Map<String, String>) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * (Optional) Static information about a vehicle in a key-value pair.
   *
   * For example: `"engine Type"` : `"v6"`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-attributes)
   * @param attributes (Optional) Static information about a vehicle in a key-value pair. 
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * The Amazon Resource Name (ARN) of a decoder manifest associated with the vehicle to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-decodermanifestarn)
   * @param decoderManifestArn The Amazon Resource Name (ARN) of a decoder manifest associated with
   * the vehicle to create. 
   */
  public fun decoderManifestArn(decoderManifestArn: String) {
    cdkBuilder.decoderManifestArn(decoderManifestArn)
  }

  /**
   * The Amazon Resource Name (ARN) of the vehicle model (model manifest) to create the vehicle
   * from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-modelmanifestarn)
   * @param modelManifestArn The Amazon Resource Name (ARN) of the vehicle model (model manifest) to
   * create the vehicle from. 
   */
  public fun modelManifestArn(modelManifestArn: String) {
    cdkBuilder.modelManifestArn(modelManifestArn)
  }

  /**
   * The unique ID of the vehicle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-name)
   * @param name The unique ID of the vehicle. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * (Optional) Metadata which can be used to manage the vehicle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
   * @param tags (Optional) Metadata which can be used to manage the vehicle. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * (Optional) Metadata which can be used to manage the vehicle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html#cfn-iotfleetwise-vehicle-tags)
   * @param tags (Optional) Metadata which can be used to manage the vehicle. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnVehicle {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
