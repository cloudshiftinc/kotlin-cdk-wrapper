@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineArtifactStoreMapPropertyDsl {
  private val cdkBuilder: CfnPipeline.ArtifactStoreMapProperty.Builder =
      CfnPipeline.ArtifactStoreMapProperty.builder()

  /**
   * @param artifactStore Represents information about the S3 bucket where artifacts are stored for
   * the pipeline. 
   *
   * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
   * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
   */
  public fun artifactStore(artifactStore: IResolvable) {
    cdkBuilder.artifactStore(artifactStore)
  }

  /**
   * @param artifactStore Represents information about the S3 bucket where artifacts are stored for
   * the pipeline. 
   *
   * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
   * use both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
   */
  public fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty) {
    cdkBuilder.artifactStore(artifactStore)
  }

  /**
   * @param region The action declaration's AWS Region, such as us-east-1. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): CfnPipeline.ArtifactStoreMapProperty = cdkBuilder.build()
}
