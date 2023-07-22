@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRuleBatchArrayPropertiesPropertyDsl {
  private val cdkBuilder: CfnRule.BatchArrayPropertiesProperty.Builder =
      CfnRule.BatchArrayPropertiesProperty.builder()

  /**
   * @param size The size of the array, if this is an array batch job.
   * Valid values are integers between 2 and 10,000.
   */
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  public fun build(): CfnRule.BatchArrayPropertiesProperty = cdkBuilder.build()
}
