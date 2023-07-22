@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

@CdkDslMarker
public class CfnGitHubRepositoryS3PropertyDsl {
  private val cdkBuilder: CfnGitHubRepository.S3Property.Builder =
      CfnGitHubRepository.S3Property.builder()

  /**
   * @param bucket The name of the Amazon S3 bucket that contains the ZIP file with the content to
   * be committed to the new repository. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key The S3 object key or file name for the ZIP file. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param objectVersion The object version of the ZIP file, if versioning is enabled for the
   * Amazon S3 bucket.
   */
  public fun objectVersion(objectVersion: String) {
    cdkBuilder.objectVersion(objectVersion)
  }

  public fun build(): CfnGitHubRepository.S3Property = cdkBuilder.build()
}
