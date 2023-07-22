@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

@CdkDslMarker
public class CfnPipelineAddAttributesPropertyDsl {
  private val cdkBuilder: CfnPipeline.AddAttributesProperty.Builder =
      CfnPipeline.AddAttributesProperty.builder()

  /**
   * @param attributes A list of 1-50 "AttributeNameMapping" objects that map an existing attribute
   * to a new attribute. 
   *
   * The existing attributes remain in the message, so if you want to remove the originals, use
   * "RemoveAttributeActivity".
   */
  public fun attributes(attributes: Map<String, String>) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param attributes A list of 1-50 "AttributeNameMapping" objects that map an existing attribute
   * to a new attribute. 
   *
   * The existing attributes remain in the message, so if you want to remove the originals, use
   * "RemoveAttributeActivity".
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param name The name of the 'addAttributes' activity. 
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

  public fun build(): CfnPipeline.AddAttributesProperty = cdkBuilder.build()
}
