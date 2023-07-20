@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CliCredentialsStackSynthesizerProps

@CdkDslMarker
public class CliCredentialsStackSynthesizerPropsDsl {
  private val cdkBuilder: CliCredentialsStackSynthesizerProps.Builder =
      CliCredentialsStackSynthesizerProps.builder()

  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  public fun dockerTagPrefix(dockerTagPrefix: String) {
    cdkBuilder.dockerTagPrefix(dockerTagPrefix)
  }

  public fun fileAssetsBucketName(fileAssetsBucketName: String) {
    cdkBuilder.fileAssetsBucketName(fileAssetsBucketName)
  }

  public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
    cdkBuilder.imageAssetsRepositoryName(imageAssetsRepositoryName)
  }

  public fun qualifier(qualifier: String) {
    cdkBuilder.qualifier(qualifier)
  }

  public fun build(): CliCredentialsStackSynthesizerProps = cdkBuilder.build()
}
