@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2InputParallelismPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.InputParallelismProperty.Builder =
      CfnApplicationV2.InputParallelismProperty.builder()

  /**
   * @param count The number of in-application streams to create.
   */
  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  public fun build(): CfnApplicationV2.InputParallelismProperty = cdkBuilder.build()
}
