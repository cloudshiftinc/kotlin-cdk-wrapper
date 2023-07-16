@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

@CdkDslMarker
public class CfnGitHubRepositoryS3PropertyDsl {
  private val cdkBuilder: CfnGitHubRepository.S3Property.Builder =
      CfnGitHubRepository.S3Property.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun objectVersion(objectVersion: String) {
    cdkBuilder.objectVersion(objectVersion)
  }

  public fun build(): CfnGitHubRepository.S3Property = cdkBuilder.build()
}
