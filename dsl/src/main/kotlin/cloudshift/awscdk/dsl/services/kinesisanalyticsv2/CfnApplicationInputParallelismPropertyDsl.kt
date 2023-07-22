@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * For a SQL-based Kinesis Data Analytics application, describes the number of in-application
 * streams to create for a given streaming source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * InputParallelismProperty inputParallelismProperty = InputParallelismProperty.builder()
 * .count(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html)
 */
@CdkDslMarker
public class CfnApplicationInputParallelismPropertyDsl {
  private val cdkBuilder: CfnApplication.InputParallelismProperty.Builder =
      CfnApplication.InputParallelismProperty.builder()

  /**
   * @param count The number of in-application streams to create.
   */
  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  public fun build(): CfnApplication.InputParallelismProperty = cdkBuilder.build()
}
