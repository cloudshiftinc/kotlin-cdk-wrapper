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

package cloudshift.awscdk.dsl.services.controltower

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.controltower.CfnEnabledControl
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnEnabledControlDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnabledControl.Builder = CfnEnabledControl.Builder.create(scope, id)

    public fun controlIdentifier(controlIdentifier: String) {
        cdkBuilder.controlIdentifier(controlIdentifier)
    }

    public fun targetIdentifier(targetIdentifier: String) {
        cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): CfnEnabledControl = cdkBuilder.build()
}
