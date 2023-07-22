@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketStorageClassAnalysisPropertyDsl {
  private val cdkBuilder: CfnBucket.StorageClassAnalysisProperty.Builder =
      CfnBucket.StorageClassAnalysisProperty.builder()

  /**
   * @param dataExport Specifies how data related to the storage class analysis for an Amazon S3
   * bucket should be exported.
   */
  public fun dataExport(dataExport: IResolvable) {
    cdkBuilder.dataExport(dataExport)
  }

  /**
   * @param dataExport Specifies how data related to the storage class analysis for an Amazon S3
   * bucket should be exported.
   */
  public fun dataExport(dataExport: CfnBucket.DataExportProperty) {
    cdkBuilder.dataExport(dataExport)
  }

  public fun build(): CfnBucket.StorageClassAnalysisProperty = cdkBuilder.build()
}
