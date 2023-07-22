@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition

@CdkDslMarker
public class MetricDefinitionDsl {
  private val cdkBuilder: MetricDefinition.Builder = MetricDefinition.builder()

  /**
   * @param name Name of the metric. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param regex Regular expression that searches the output of a training job and gets the value
   * of the metric. 
   */
  public fun regex(regex: String) {
    cdkBuilder.regex(regex)
  }

  public fun build(): MetricDefinition = cdkBuilder.build()
}
