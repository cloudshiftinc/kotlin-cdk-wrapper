@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnInput
import software.amazon.awscdk.services.iotevents.CfnInputProps

@CdkDslMarker
public class CfnInputPropsDsl {
  private val cdkBuilder: CfnInputProps.Builder = CfnInputProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param inputDefinition The definition of the input. 
   */
  public fun inputDefinition(inputDefinition: IResolvable) {
    cdkBuilder.inputDefinition(inputDefinition)
  }

  /**
   * @param inputDefinition The definition of the input. 
   */
  public fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty) {
    cdkBuilder.inputDefinition(inputDefinition)
  }

  /**
   * @param inputDescription A brief description of the input.
   */
  public fun inputDescription(inputDescription: String) {
    cdkBuilder.inputDescription(inputDescription)
  }

  /**
   * @param inputName The name of the input.
   */
  public fun inputName(inputName: String) {
    cdkBuilder.inputName(inputName)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnInputProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
