@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions
import software.amazon.awscdk.services.s3.IBucket

/**
 * The extra options passed to the `IProject.bindToCodePipeline` method.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * import software.amazon.awscdk.services.s3.*;
 * Bucket bucket;
 * BindToCodePipelineOptions bindToCodePipelineOptions = BindToCodePipelineOptions.builder()
 * .artifactBucket(bucket)
 * .build();
 * ```
 */
@CdkDslMarker
public class BindToCodePipelineOptionsDsl {
  private val cdkBuilder: BindToCodePipelineOptions.Builder = BindToCodePipelineOptions.builder()

  /**
   * @param artifactBucket The artifact bucket that will be used by the action that invokes this
   * project. 
   */
  public fun artifactBucket(artifactBucket: IBucket) {
    cdkBuilder.artifactBucket(artifactBucket)
  }

  public fun build(): BindToCodePipelineOptions = cdkBuilder.build()
}
