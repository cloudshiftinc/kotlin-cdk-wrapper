@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataType
import software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource

@CdkDslMarker
public class TransformS3DataSourceDsl {
  private val cdkBuilder: TransformS3DataSource.Builder = TransformS3DataSource.builder()

  /**
   * @param s3DataType S3 Data Type.
   */
  public fun s3DataType(s3DataType: S3DataType) {
    cdkBuilder.s3DataType(s3DataType)
  }

  /**
   * @param s3Uri Identifies either a key name prefix or a manifest. 
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): TransformS3DataSource = cdkBuilder.build()
}
