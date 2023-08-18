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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.BatchBuildConfig
import software.amazon.awscdk.services.iam.IRole

/**
 * The type returned from `IProject#enableBatchBuilds`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * BatchBuildConfig batchBuildConfig = BatchBuildConfig.builder()
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class BatchBuildConfigDsl {
    private val cdkBuilder: BatchBuildConfig.Builder = BatchBuildConfig.builder()

    /** @param role The IAM batch service Role of this Project. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): BatchBuildConfig = cdkBuilder.build()
}
