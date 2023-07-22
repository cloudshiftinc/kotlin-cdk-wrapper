@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThingType
import software.constructs.Construct

/**
 * Creates a new thing type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnThingType cfnThingType = CfnThingType.Builder.create(this, "MyCfnThingType")
 * .deprecateThingType(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingTypeName("thingTypeName")
 * .thingTypeProperties(ThingTypePropertiesProperty.builder()
 * .searchableAttributes(List.of("searchableAttributes"))
 * .thingTypeDescription("thingTypeDescription")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html)
 */
@CdkDslMarker
public class CfnThingTypeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnThingType.Builder = CfnThingType.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Deprecates a thing type. You can not associate new things with deprecated thing type.
   *
   * Requires permission to access the
   * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
   * action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
   * @param deprecateThingType Deprecates a thing type. You can not associate new things with
   * deprecated thing type. 
   */
  public fun deprecateThingType(deprecateThingType: Boolean) {
    cdkBuilder.deprecateThingType(deprecateThingType)
  }

  /**
   * Deprecates a thing type. You can not associate new things with deprecated thing type.
   *
   * Requires permission to access the
   * [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
   * action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-deprecatethingtype)
   * @param deprecateThingType Deprecates a thing type. You can not associate new things with
   * deprecated thing type. 
   */
  public fun deprecateThingType(deprecateThingType: IResolvable) {
    cdkBuilder.deprecateThingType(deprecateThingType)
  }

  /**
   * Metadata which can be used to manage the thing type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-tags)
   * @param tags Metadata which can be used to manage the thing type. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata which can be used to manage the thing type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-tags)
   * @param tags Metadata which can be used to manage the thing type. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The name of the thing type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypename)
   * @param thingTypeName The name of the thing type. 
   */
  public fun thingTypeName(thingTypeName: String) {
    cdkBuilder.thingTypeName(thingTypeName)
  }

  /**
   * The thing type properties for the thing type to create.
   *
   * It contains information about the new thing type including a description, and a list of
   * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
   * creation of the `ThingType` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
   * @param thingTypeProperties The thing type properties for the thing type to create. 
   */
  public fun thingTypeProperties(thingTypeProperties: IResolvable) {
    cdkBuilder.thingTypeProperties(thingTypeProperties)
  }

  /**
   * The thing type properties for the thing type to create.
   *
   * It contains information about the new thing type including a description, and a list of
   * searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
   * creation of the `ThingType` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html#cfn-iot-thingtype-thingtypeproperties)
   * @param thingTypeProperties The thing type properties for the thing type to create. 
   */
  public fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty) {
    cdkBuilder.thingTypeProperties(thingTypeProperties)
  }

  public fun build(): CfnThingType {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
