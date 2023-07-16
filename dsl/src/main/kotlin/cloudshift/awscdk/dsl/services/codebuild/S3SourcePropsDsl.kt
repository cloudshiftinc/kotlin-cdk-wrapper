@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.S3SourceProps
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class S3SourcePropsDsl {
  private val cdkBuilder: S3SourceProps.Builder = S3SourceProps.builder()

  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): S3SourceProps = cdkBuilder.build()
}
