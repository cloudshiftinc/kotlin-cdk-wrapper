@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * For a SQL-based Kinesis Data Analytics application, provides additional mapping information when
 * JSON is the record format on the streaming source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * JSONMappingParametersProperty jSONMappingParametersProperty =
 * JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-jsonmappingparameters.html)
 */
@CdkDslMarker
public class CfnApplicationV2JSONMappingParametersPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.JSONMappingParametersProperty.Builder =
      CfnApplicationV2.JSONMappingParametersProperty.builder()

  /**
   * @param recordRowPath The path to the top-level parent that contains the records. 
   */
  public fun recordRowPath(recordRowPath: String) {
    cdkBuilder.recordRowPath(recordRowPath)
  }

  public fun build(): CfnApplicationV2.JSONMappingParametersProperty = cdkBuilder.build()
}
