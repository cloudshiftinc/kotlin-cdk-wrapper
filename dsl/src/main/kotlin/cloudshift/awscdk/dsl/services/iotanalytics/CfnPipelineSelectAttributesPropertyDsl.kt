@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

/**
 * Creates a new message using only the specified attributes from the original message.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * SelectAttributesProperty selectAttributesProperty = SelectAttributesProperty.builder()
 * .attributes(List.of("attributes"))
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html)
 */
@CdkDslMarker
public class CfnPipelineSelectAttributesPropertyDsl {
  private val cdkBuilder: CfnPipeline.SelectAttributesProperty.Builder =
      CfnPipeline.SelectAttributesProperty.builder()

  private val _attributes: MutableList<String> = mutableListOf()

  /**
   * @param attributes A list of the attributes to select from the message. 
   */
  public fun attributes(vararg attributes: String) {
    _attributes.addAll(listOf(*attributes))
  }

  /**
   * @param attributes A list of the attributes to select from the message. 
   */
  public fun attributes(attributes: Collection<String>) {
    _attributes.addAll(attributes)
  }

  /**
   * @param name The name of the 'selectAttributes' activity. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param next The next activity in the pipeline.
   */
  public fun next(next: String) {
    cdkBuilder.next(next)
  }

  public fun build(): CfnPipeline.SelectAttributesProperty {
    if(_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
    return cdkBuilder.build()
  }
}
