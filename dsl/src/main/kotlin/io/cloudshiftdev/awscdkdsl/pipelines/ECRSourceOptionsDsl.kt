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

package io.cloudshiftdev.awscdkdsl.pipelines

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.pipelines.ECRSourceOptions

/**
 * Options for ECR sources.
 *
 * Example:
 * ```
 * IRepository repository;
 * CodePipelineSource.ecr(repository, ECRSourceOptions.builder()
 * .imageTag("latest")
 * .build());
 * ```
 */
@CdkDslMarker
public class ECRSourceOptionsDsl {
    private val cdkBuilder: ECRSourceOptions.Builder = ECRSourceOptions.builder()

    /** @param actionName The action name used for this source in the CodePipeline. */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /** @param imageTag The image tag that will be checked for changes. */
    public fun imageTag(imageTag: String) {
        cdkBuilder.imageTag(imageTag)
    }

    public fun build(): ECRSourceOptions = cdkBuilder.build()
}
