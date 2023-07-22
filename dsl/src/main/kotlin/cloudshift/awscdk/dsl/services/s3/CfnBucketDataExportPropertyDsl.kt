@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be
 * exported.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * DataExportProperty dataExportProperty = DataExportProperty.builder()
 * .destination(DestinationProperty.builder()
 * .bucketArn("bucketArn")
 * .format("format")
 * // the properties below are optional
 * .bucketAccountId("bucketAccountId")
 * .prefix("prefix")
 * .build())
 * .outputSchemaVersion("outputSchemaVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html)
 */
@CdkDslMarker
public class CfnBucketDataExportPropertyDsl {
  private val cdkBuilder: CfnBucket.DataExportProperty.Builder =
      CfnBucket.DataExportProperty.builder()

  /**
   * @param destination The place to store the data for an analysis. 
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination The place to store the data for an analysis. 
   */
  public fun destination(destination: CfnBucket.DestinationProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param outputSchemaVersion The version of the output schema to use when exporting data. 
   * Must be `V_1` .
   */
  public fun outputSchemaVersion(outputSchemaVersion: String) {
    cdkBuilder.outputSchemaVersion(outputSchemaVersion)
  }

  public fun build(): CfnBucket.DataExportProperty = cdkBuilder.build()
}
