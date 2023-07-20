@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.BootstraplessSynthesizerProps
import kotlin.String

@CdkDslMarker
public class BootstraplessSynthesizerPropsDsl {
    private val cdkBuilder: BootstraplessSynthesizerProps.Builder =
        BootstraplessSynthesizerProps.builder()

    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
        cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    public fun deployRoleArn(deployRoleArn: String) {
        cdkBuilder.deployRoleArn(deployRoleArn)
    }

    public fun build(): BootstraplessSynthesizerProps = cdkBuilder.build()
}
