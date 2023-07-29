@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * Represents information about an artifact to be worked on, such as a test or build artifact.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * InputArtifactProperty inputArtifactProperty = InputArtifactProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-inputartifact.html)
 */
@CdkDslMarker
public class CfnPipelineInputArtifactPropertyDsl {
    private val cdkBuilder: CfnPipeline.InputArtifactProperty.Builder =
        CfnPipeline.InputArtifactProperty.builder()

    /**
     * @param name The name of the artifact to be worked on (for example, "My App"). Artifacts are
     *   the files that are worked on by actions in the pipeline. See the action configuration for
     *   each action for details about artifact parameters. For example, the S3 source action input
     *   artifact is a file name (or file path), and the files are generally provided as a ZIP file.
     *   Example artifact name: SampleApp_Windows.zip
     *
     * The input artifact of an action must exactly match the output artifact declared in a
     * preceding action, but the input artifact does not have to be the next action in strict
     * sequence from the action that provided the output artifact. Actions in parallel can declare
     * different output artifacts, which are in turn consumed by different following actions.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnPipeline.InputArtifactProperty = cdkBuilder.build()
}
