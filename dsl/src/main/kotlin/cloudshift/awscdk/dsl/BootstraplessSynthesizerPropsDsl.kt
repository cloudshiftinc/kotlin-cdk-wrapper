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
import software.amazon.awscdk.BootstraplessSynthesizerProps

/**
 * Construction properties of `BootstraplessSynthesizer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * BootstraplessSynthesizerProps bootstraplessSynthesizerProps =
 * BootstraplessSynthesizerProps.builder()
 * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
 * .deployRoleArn("deployRoleArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class BootstraplessSynthesizerPropsDsl {
    private val cdkBuilder: BootstraplessSynthesizerProps.Builder =
        BootstraplessSynthesizerProps.builder()

    /** @param cloudFormationExecutionRoleArn The CFN execution Role ARN to use. */
    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
        cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    /** @param deployRoleArn The deploy Role ARN to use. */
    public fun deployRoleArn(deployRoleArn: String) {
        cdkBuilder.deployRoleArn(deployRoleArn)
    }

    public fun build(): BootstraplessSynthesizerProps = cdkBuilder.build()
}
