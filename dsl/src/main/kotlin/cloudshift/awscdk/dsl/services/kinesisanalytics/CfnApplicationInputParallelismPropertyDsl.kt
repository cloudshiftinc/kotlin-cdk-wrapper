@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

@CdkDslMarker
public class CfnApplicationInputParallelismPropertyDsl {
  private val cdkBuilder: CfnApplication.InputParallelismProperty.Builder =
      CfnApplication.InputParallelismProperty.builder()

  /**
   * @param count Number of in-application streams to create.
   * For more information, see
   * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
   */
  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  public fun build(): CfnApplication.InputParallelismProperty = cdkBuilder.build()
}
