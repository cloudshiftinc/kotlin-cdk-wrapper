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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput

/**
 * Configuration for replacing a placeholder string in the ECS task definition template file with an
 * image URI.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * import software.amazon.awscdk.services.codepipeline.actions.*;
 * Artifact artifact;
 * CodeDeployEcsContainerImageInput codeDeployEcsContainerImageInput =
 * CodeDeployEcsContainerImageInput.builder()
 * .input(artifact)
 * // the properties below are optional
 * .taskDefinitionPlaceholder("taskDefinitionPlaceholder")
 * .build();
 * ```
 */
@CdkDslMarker
public class CodeDeployEcsContainerImageInputDsl {
    private val cdkBuilder: CodeDeployEcsContainerImageInput.Builder =
        CodeDeployEcsContainerImageInput.builder()

    /**
     * @param input The artifact that contains an `imageDetails.json` file with the image URI. The
     *   artifact's `imageDetails.json` file must be a JSON file containing an `ImageURI` property.
     *   For example: `{ "ImageURI":
     *   "ACCOUNTID.dkr.ecr.us-west-2.amazonaws.com/dk-image-repo&#64;sha256:example3" }`
     */
    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    /**
     * @param taskDefinitionPlaceholder The placeholder string in the ECS task definition template
     *   file that will be replaced with the image URI. The placeholder string must be surrounded by
     *   angle brackets in the template file. For example, if the task definition template file
     *   contains a placeholder like `"image": "&lt;PLACEHOLDER&gt;"`, then the
     *   `taskDefinitionPlaceholder` value should be `PLACEHOLDER`.
     */
    public fun taskDefinitionPlaceholder(taskDefinitionPlaceholder: String) {
        cdkBuilder.taskDefinitionPlaceholder(taskDefinitionPlaceholder)
    }

    public fun build(): CodeDeployEcsContainerImageInput = cdkBuilder.build()
}
