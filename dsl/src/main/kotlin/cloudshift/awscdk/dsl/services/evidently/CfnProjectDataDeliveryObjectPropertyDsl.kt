@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnProject

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
