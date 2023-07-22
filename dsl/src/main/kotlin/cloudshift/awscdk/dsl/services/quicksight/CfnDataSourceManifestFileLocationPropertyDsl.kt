@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * Amazon S3 manifest file location.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ManifestFileLocationProperty manifestFileLocationProperty =
 * ManifestFileLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-manifestfilelocation.html)
 */
@CdkDslMarker
public class CfnDataSourceManifestFileLocationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ManifestFileLocationProperty.Builder =
      CfnDataSource.ManifestFileLocationProperty.builder()

  /**
   * @param bucket Amazon S3 bucket. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key Amazon S3 key that identifies an object. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun build(): CfnDataSource.ManifestFileLocationProperty = cdkBuilder.build()
}
