@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

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
