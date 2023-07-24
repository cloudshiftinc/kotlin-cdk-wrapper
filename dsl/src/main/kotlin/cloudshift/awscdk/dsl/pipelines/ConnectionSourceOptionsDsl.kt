@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.ConnectionSourceOptions
import kotlin.Boolean
import kotlin.String

/**
 * Configuration options for CodeStar source.
 *
 * Example:
 *
 * ```
 * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
 * .synth(ShellStep.Builder.create("Synth")
 * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
 * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
 * .build()))
 * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
 * .build())
 * // Turn this on because the pipeline uses Docker image assets
 * .dockerEnabledForSelfMutation(true)
 * .build();
 * pipeline.addWave("MyWave", WaveOptions.builder()
 * .post(List.of(
 * CodeBuildStep.Builder.create("RunApproval")
 * .commands(List.of("command-from-image"))
 * .buildEnvironment(BuildEnvironment.builder()
 * // The user of a Docker image asset in the pipeline requires turning on
 * // 'dockerEnabledForSelfMutation'.
 * .buildImage(LinuxBuildImage.fromAsset(this, "Image", DockerImageAssetProps.builder()
 * .directory("./docker-image")
 * .build()))
 * .build())
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class ConnectionSourceOptionsDsl {
    private val cdkBuilder: ConnectionSourceOptions.Builder = ConnectionSourceOptions.builder()

    /**
     * @param actionName The action name used for this source in the CodePipeline.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * @param codeBuildCloneOutput If this is set, the next CodeBuild job clones the repository
     * (instead of CodePipeline downloading the files).
     * This provides access to repository history, and retains symlinks (symlinks would otherwise be
     * removed by CodePipeline).
     *
     * **Note**: if this option is true, only CodeBuild jobs can use the output artifact.
     */
    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
        cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    /**
     * @param connectionArn The ARN of the CodeStar Connection created in the AWS console that has
     * permissions to access this GitHub or BitBucket repository.
     */
    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param triggerOnPush Controls automatically starting your pipeline when a new commit is made on
     * the configured repository and branch.
     * If unspecified,
     * the default value is true, and the field does not display by default.
     */
    public fun triggerOnPush(triggerOnPush: Boolean) {
        cdkBuilder.triggerOnPush(triggerOnPush)
    }

    public fun build(): ConnectionSourceOptions = cdkBuilder.build()
}
