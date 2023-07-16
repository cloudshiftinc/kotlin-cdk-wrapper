@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.ArtifactsConfig
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class ArtifactsConfigDsl {
  private val cdkBuilder: ArtifactsConfig.Builder = ArtifactsConfig.builder()

  public fun artifactsProperty(block: CfnProjectArtifactsPropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectArtifactsPropertyDsl()
    builder.apply(block)
    cdkBuilder.artifactsProperty(builder.build())
  }

  public fun artifactsProperty(artifactsProperty: CfnProject.ArtifactsProperty) {
    cdkBuilder.artifactsProperty(artifactsProperty)
  }

  public fun build(): ArtifactsConfig = cdkBuilder.build()
}
