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

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType

/**
 * Returns information about the details of an artifact.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * ArtifactDetailsProperty artifactDetailsProperty = ArtifactDetailsProperty.builder()
 * .maximumCount(123)
 * .minimumCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html)
 */
@CdkDslMarker
public class CfnCustomActionTypeArtifactDetailsPropertyDsl {
    private val cdkBuilder: CfnCustomActionType.ArtifactDetailsProperty.Builder =
        CfnCustomActionType.ArtifactDetailsProperty.builder()

    /** @param maximumCount The maximum number of artifacts allowed for the action type. */
    public fun maximumCount(maximumCount: Number) {
        cdkBuilder.maximumCount(maximumCount)
    }

    /** @param minimumCount The minimum number of artifacts allowed for the action type. */
    public fun minimumCount(minimumCount: Number) {
        cdkBuilder.minimumCount(minimumCount)
    }

    public fun build(): CfnCustomActionType.ArtifactDetailsProperty = cdkBuilder.build()
}
