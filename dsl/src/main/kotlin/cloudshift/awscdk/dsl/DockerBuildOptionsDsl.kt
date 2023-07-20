@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.DockerBuildOptions

@CdkDslMarker
public class DockerBuildOptionsDsl {
  private val cdkBuilder: DockerBuildOptions.Builder = DockerBuildOptions.builder()

  public fun buildArgs(buildArgs: Map<String, String>) {
    cdkBuilder.buildArgs(buildArgs)
  }

  public fun `file`(`file`: String) {
    cdkBuilder.`file`(`file`)
  }

  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  public fun targetStage(targetStage: String) {
    cdkBuilder.targetStage(targetStage)
  }

  public fun build(): DockerBuildOptions = cdkBuilder.build()
}
