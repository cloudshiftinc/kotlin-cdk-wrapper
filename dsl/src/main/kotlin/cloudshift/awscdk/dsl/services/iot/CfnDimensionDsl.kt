@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iot.CfnDimension
import software.constructs.Construct

@CdkDslMarker
public class CfnDimensionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDimension.Builder = CfnDimension.Builder.create(scope, id)

  private val _stringValues: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * A unique identifier for the dimension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-name)
   * @param name A unique identifier for the dimension. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specifies the value or list of values for the dimension.
   *
   * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
   * "admin/#").
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-stringvalues)
   * @param stringValues Specifies the value or list of values for the dimension. 
   */
  public fun stringValues(vararg stringValues: String) {
    _stringValues.addAll(listOf(*stringValues))
  }

  /**
   * Specifies the value or list of values for the dimension.
   *
   * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
   * "admin/#").
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-stringvalues)
   * @param stringValues Specifies the value or list of values for the dimension. 
   */
  public fun stringValues(stringValues: Collection<String>) {
    _stringValues.addAll(stringValues)
  }

  /**
   * Metadata that can be used to manage the dimension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-tags)
   * @param tags Metadata that can be used to manage the dimension. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata that can be used to manage the dimension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-tags)
   * @param tags Metadata that can be used to manage the dimension. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Specifies the type of dimension.
   *
   * Supported types: `TOPIC_FILTER.`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html#cfn-iot-dimension-type)
   * @param type Specifies the type of dimension. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDimension {
    if(_stringValues.isNotEmpty()) cdkBuilder.stringValues(_stringValues)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
