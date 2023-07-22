@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnInput

/**
 * The definition of the input.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * InputDefinitionProperty inputDefinitionProperty = InputDefinitionProperty.builder()
 * .attributes(List.of(AttributeProperty.builder()
 * .jsonPath("jsonPath")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-inputdefinition.html)
 */
@CdkDslMarker
public class CfnInputInputDefinitionPropertyDsl {
  private val cdkBuilder: CfnInput.InputDefinitionProperty.Builder =
      CfnInput.InputDefinitionProperty.builder()

  private val _attributes: MutableList<Any> = mutableListOf()

  /**
   * @param attributes The attributes from the JSON payload that are made available by the input. 
   * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage` .
   * Each such message contains a JSON payload, and those attributes (and their paired values)
   * specified here are available for use in the `condition` expressions used by detectors that monitor
   * this input.
   */
  public fun attributes(vararg attributes: Any) {
    _attributes.addAll(listOf(*attributes))
  }

  /**
   * @param attributes The attributes from the JSON payload that are made available by the input. 
   * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage` .
   * Each such message contains a JSON payload, and those attributes (and their paired values)
   * specified here are available for use in the `condition` expressions used by detectors that monitor
   * this input.
   */
  public fun attributes(attributes: Collection<Any>) {
    _attributes.addAll(attributes)
  }

  /**
   * @param attributes The attributes from the JSON payload that are made available by the input. 
   * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage` .
   * Each such message contains a JSON payload, and those attributes (and their paired values)
   * specified here are available for use in the `condition` expressions used by detectors that monitor
   * this input.
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun build(): CfnInput.InputDefinitionProperty {
    if(_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
    return cdkBuilder.build()
  }
}
