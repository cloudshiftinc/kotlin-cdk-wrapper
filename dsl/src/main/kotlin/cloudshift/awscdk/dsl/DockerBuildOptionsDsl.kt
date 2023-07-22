@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.DockerBuildOptions

@CdkDslMarker
public class DockerBuildOptionsDsl {
  private val cdkBuilder: DockerBuildOptions.Builder = DockerBuildOptions.builder()

  /**
   * @param buildArgs Build args.
   */
  public fun buildArgs(buildArgs: Map<String, String>) {
    cdkBuilder.buildArgs(buildArgs)
  }

  /**
   * @param file Name of the Dockerfile, must relative to the docker build path.
   */
  public fun `file`(`file`: String) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param platform Set platform if server is multi-platform capable. *Requires Docker Engine API
   * v1.38+*.
   * Example value: `linux/amd64`
   */
  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  /**
   * @param targetStage Set build target for multi-stage container builds. Any stage defined
   * afterwards will be ignored.
   * Example value: `build-env`
   */
  public fun targetStage(targetStage: String) {
    cdkBuilder.targetStage(targetStage)
  }

  public fun build(): DockerBuildOptions = cdkBuilder.build()
}
