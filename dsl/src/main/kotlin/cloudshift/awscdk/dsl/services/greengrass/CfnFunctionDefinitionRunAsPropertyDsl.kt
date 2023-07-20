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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition
import kotlin.Number

@CdkDslMarker
public class CfnFunctionDefinitionRunAsPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinition.RunAsProperty.Builder =
        CfnFunctionDefinition.RunAsProperty.builder()

    public fun gid(gid: Number) {
        cdkBuilder.gid(gid)
    }

    public fun uid(uid: Number) {
        cdkBuilder.uid(uid)
    }

    public fun build(): CfnFunctionDefinition.RunAsProperty = cdkBuilder.build()
}
