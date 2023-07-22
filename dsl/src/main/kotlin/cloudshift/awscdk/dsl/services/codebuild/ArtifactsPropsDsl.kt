@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.ArtifactsProps

@CdkDslMarker
public class ArtifactsPropsDsl {
  private val cdkBuilder: ArtifactsProps.Builder = ArtifactsProps.builder()

  /**
   * @param identifier The artifact identifier.
   * This property is required on secondary artifacts.
   */
  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  public fun build(): ArtifactsProps = cdkBuilder.build()
}
