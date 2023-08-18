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
import software.amazon.awscdk.pipelines.S3SourceOptions
import software.amazon.awscdk.services.codepipeline.actions.S3Trigger
import software.amazon.awscdk.services.iam.IRole

/**
 * Options for S3 sources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.actions.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.pipelines.*;
 * Role role;
 * S3SourceOptions s3SourceOptions = S3SourceOptions.builder()
 * .actionName("actionName")
 * .role(role)
 * .trigger(S3Trigger.NONE)
 * .build();
 * ```
 */
@CdkDslMarker
public class S3SourceOptionsDsl {
    private val cdkBuilder: S3SourceOptions.Builder = S3SourceOptions.builder()

    /** @param actionName The action name used for this source in the CodePipeline. */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * @param role The role that will be assumed by the pipeline prior to executing the `S3Source`
     *   action.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param trigger How should CodePipeline detect source changes for this Action. Note that if
     *   this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in a
     *   CloudTrail Trail, as otherwise the CloudWatch Events will not be emitted.
     */
    public fun trigger(trigger: S3Trigger) {
        cdkBuilder.trigger(trigger)
    }

    public fun build(): S3SourceOptions = cdkBuilder.build()
}
