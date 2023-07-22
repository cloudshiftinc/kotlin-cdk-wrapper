@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iot.CfnDimensionProps

/**
 * Properties for defining a `CfnDimension`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnDimensionProps cfnDimensionProps = CfnDimensionProps.builder()
 * .stringValues(List.of("stringValues"))
 * .type("type")
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-dimension.html)
 */
@CdkDslMarker
public class CfnDimensionPropsDsl {
  private val cdkBuilder: CfnDimensionProps.Builder = CfnDimensionProps.builder()

  private val _stringValues: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param name A unique identifier for the dimension.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param stringValues Specifies the value or list of values for the dimension. 
   * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
   * "admin/#").
   */
  public fun stringValues(vararg stringValues: String) {
    _stringValues.addAll(listOf(*stringValues))
  }

  /**
   * @param stringValues Specifies the value or list of values for the dimension. 
   * For `TOPIC_FILTER` dimensions, this is a pattern used to match the MQTT topic (for example,
   * "admin/#").
   */
  public fun stringValues(stringValues: Collection<String>) {
    _stringValues.addAll(stringValues)
  }

  /**
   * @param tags Metadata that can be used to manage the dimension.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Metadata that can be used to manage the dimension.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param type Specifies the type of dimension. 
   * Supported types: `TOPIC_FILTER.`
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDimensionProps {
    if(_stringValues.isNotEmpty()) cdkBuilder.stringValues(_stringValues)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
