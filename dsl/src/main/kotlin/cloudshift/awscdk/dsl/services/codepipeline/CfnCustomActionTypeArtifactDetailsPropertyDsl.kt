@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType

@CdkDslMarker
public class CfnCustomActionTypeArtifactDetailsPropertyDsl {
  private val cdkBuilder: CfnCustomActionType.ArtifactDetailsProperty.Builder =
      CfnCustomActionType.ArtifactDetailsProperty.builder()

  public fun maximumCount(maximumCount: Number) {
    cdkBuilder.maximumCount(maximumCount)
  }

  public fun minimumCount(minimumCount: Number) {
    cdkBuilder.minimumCount(minimumCount)
  }

  public fun build(): CfnCustomActionType.ArtifactDetailsProperty = cdkBuilder.build()
}
