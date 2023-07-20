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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnStateMachine
import kotlin.String

@CdkDslMarker
public class CfnStateMachineApiEventPropertyDsl {
    private val cdkBuilder: CfnStateMachine.ApiEventProperty.Builder =
        CfnStateMachine.ApiEventProperty.builder()

    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun build(): CfnStateMachine.ApiEventProperty = cdkBuilder.build()
}
