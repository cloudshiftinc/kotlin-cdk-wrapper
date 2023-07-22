@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

@CdkDslMarker
public class CfnPipelineFilterPropertyDsl {
  private val cdkBuilder: CfnPipeline.FilterProperty.Builder = CfnPipeline.FilterProperty.builder()

  /**
   * @param filter An expression that looks like an SQL WHERE clause that must return a Boolean
   * value. 
   */
  public fun filter(filter: String) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param name The name of the 'filter' activity. 
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

  public fun build(): CfnPipeline.FilterProperty = cdkBuilder.build()
}
