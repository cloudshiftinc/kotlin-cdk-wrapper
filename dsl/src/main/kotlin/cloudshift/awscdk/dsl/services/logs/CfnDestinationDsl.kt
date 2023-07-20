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
import software.amazon.awscdk.services.logs.CfnDestination
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDestinationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDestination.Builder = CfnDestination.Builder.create(scope, id)

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

    public fun build(): CfnDestination = cdkBuilder.build()
}
