@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.ArtifactsConfig
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class ArtifactsConfigDsl {
  private val cdkBuilder: ArtifactsConfig.Builder = ArtifactsConfig.builder()

  /**
   * @param artifactsProperty The low-level CloudFormation artifacts property. 
   */
  public fun artifactsProperty(artifactsProperty: CfnProjectArtifactsPropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectArtifactsPropertyDsl()
    builder.apply(artifactsProperty)
    cdkBuilder.artifactsProperty(builder.build())
  }

  /**
   * @param artifactsProperty The low-level CloudFormation artifacts property. 
   */
  public fun artifactsProperty(artifactsProperty: CfnProject.ArtifactsProperty) {
    cdkBuilder.artifactsProperty(artifactsProperty)
  }

  public fun build(): ArtifactsConfig = cdkBuilder.build()
}
