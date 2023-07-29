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

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.Step
import software.amazon.awscdk.pipelines.WaveOptions

/**
 * Options to pass to `addWave`.
 *
 * Example:
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
public class WaveOptionsDsl {
    private val cdkBuilder: WaveOptions.Builder = WaveOptions.builder()

    private val _post: MutableList<Step> = mutableListOf()

    private val _pre: MutableList<Step> = mutableListOf()

    /** @param post Additional steps to run after all of the stages in the wave. */
    public fun post(vararg post: Step) {
        _post.addAll(listOf(*post))
    }

    /** @param post Additional steps to run after all of the stages in the wave. */
    public fun post(post: Collection<Step>) {
        _post.addAll(post)
    }

    /** @param pre Additional steps to run before any of the stages in the wave. */
    public fun pre(vararg pre: Step) {
        _pre.addAll(listOf(*pre))
    }

    /** @param pre Additional steps to run before any of the stages in the wave. */
    public fun pre(pre: Collection<Step>) {
        _pre.addAll(pre)
    }

    public fun build(): WaveOptions {
        if (_post.isNotEmpty()) cdkBuilder.post(_post)
        if (_pre.isNotEmpty()) cdkBuilder.pre(_pre)
        return cdkBuilder.build()
    }
}
