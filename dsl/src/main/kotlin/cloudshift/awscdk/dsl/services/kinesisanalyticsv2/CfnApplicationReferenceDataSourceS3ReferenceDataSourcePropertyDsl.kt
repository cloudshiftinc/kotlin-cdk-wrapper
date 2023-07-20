@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

@CdkDslMarker
public class CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder =
      CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.builder()

  public fun bucketArn(bucketArn: String) {
    cdkBuilder.bucketArn(bucketArn)
  }

  public fun fileKey(fileKey: String) {
    cdkBuilder.fileKey(fileKey)
  }

  public fun build(): CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty =
      cdkBuilder.build()
}
