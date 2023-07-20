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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.CfnDestinationProps
import kotlin.String

@CdkDslMarker
public class CfnDestinationPropsDsl {
    private val cdkBuilder: CfnDestinationProps.Builder = CfnDestinationProps.builder()

    public fun destinationName(destinationName: String) {
        cdkBuilder.destinationName(destinationName)
    }

    public fun destinationPolicy(destinationPolicy: String) {
        cdkBuilder.destinationPolicy(destinationPolicy)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnDestinationProps = cdkBuilder.build()
}
