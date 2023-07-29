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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.BootstraplessSynthesizer

/**
 * Synthesizer that reuses bootstrap roles from a different region.
 *
 * A special synthesizer that behaves similarly to `DefaultStackSynthesizer`, but doesn't require
 * bootstrapping the environment it operates in. Instead, it will re-use the Roles that were created
 * for a different region (which is possible because IAM is a global service).
 *
 * However, it will not assume asset buckets or repositories have been created, and therefore does
 * not support assets.
 *
 * The name is poorly chosen -- it does still require bootstrapping, it just does not support
 * assets.
 *
 * Used by the CodePipeline construct for the support stacks needed for cross-region replication S3
 * buckets. App builders do not need to use this synthesizer directly.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * BootstraplessSynthesizer bootstraplessSynthesizer = BootstraplessSynthesizer.Builder.create()
 * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
 * .deployRoleArn("deployRoleArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class BootstraplessSynthesizerDsl {
    private val cdkBuilder: BootstraplessSynthesizer.Builder =
        BootstraplessSynthesizer.Builder.create()

    /**
     * The CFN execution Role ARN to use.
     *
     * Default: - No CloudFormation role (use CLI credentials)
     *
     * @param cloudFormationExecutionRoleArn The CFN execution Role ARN to use.
     */
    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
        cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    /**
     * The deploy Role ARN to use.
     *
     * Default: - No deploy role (use CLI credentials)
     *
     * @param deployRoleArn The deploy Role ARN to use.
     */
    public fun deployRoleArn(deployRoleArn: String) {
        cdkBuilder.deployRoleArn(deployRoleArn)
    }

    public fun build(): BootstraplessSynthesizer = cdkBuilder.build()
}
