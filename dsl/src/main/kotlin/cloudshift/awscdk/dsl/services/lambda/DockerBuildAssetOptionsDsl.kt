@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.DockerBuildAssetOptions
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class DockerBuildAssetOptionsDsl {
    private val cdkBuilder: DockerBuildAssetOptions.Builder = DockerBuildAssetOptions.builder()

    public fun buildArgs(buildArgs: Map<String, String>) {
        cdkBuilder.buildArgs(buildArgs)
    }

    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    public fun imagePath(imagePath: String) {
        cdkBuilder.imagePath(imagePath)
    }

    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    public fun targetStage(targetStage: String) {
        cdkBuilder.targetStage(targetStage)
    }

    public fun build(): DockerBuildAssetOptions = cdkBuilder.build()
}
