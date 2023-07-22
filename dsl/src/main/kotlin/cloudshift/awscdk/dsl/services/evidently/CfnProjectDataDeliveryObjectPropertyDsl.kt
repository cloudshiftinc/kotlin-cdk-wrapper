@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnProject

/**
 * A structure that contains information about where Evidently is to store evaluation events for
 * longer term storage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * DataDeliveryObjectProperty dataDeliveryObjectProperty = DataDeliveryObjectProperty.builder()
 * .logGroup("logGroup")
 * .s3(S3DestinationProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .prefix("prefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-datadeliveryobject.html)
 */
@CdkDslMarker
public class CfnProjectDataDeliveryObjectPropertyDsl {
  private val cdkBuilder: CfnProject.DataDeliveryObjectProperty.Builder =
      CfnProject.DataDeliveryObjectProperty.builder()

  /**
   * @param logGroup If the project stores evaluation events in CloudWatch Logs , this structure
   * stores the log group name.
   */
  public fun logGroup(logGroup: String) {
    cdkBuilder.logGroup(logGroup)
  }

  /**
   * @param s3 If the project stores evaluation events in an Amazon S3 bucket, this structure stores
   * the bucket name and bucket prefix.
   */
  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param s3 If the project stores evaluation events in an Amazon S3 bucket, this structure stores
   * the bucket name and bucket prefix.
   */
  public fun s3(s3: CfnProject.S3DestinationProperty) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnProject.DataDeliveryObjectProperty = cdkBuilder.build()
}
