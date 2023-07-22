@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceS3PathPropertyDsl {
  private val cdkBuilder: CfnDataSource.S3PathProperty.Builder =
      CfnDataSource.S3PathProperty.builder()

  /**
   * @param bucket The name of the S3 bucket that contains the file. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key The name of the file. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun build(): CfnDataSource.S3PathProperty = cdkBuilder.build()
}
