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
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import kotlin.String

@CdkDslMarker
public class CfnFunctionDefinitionVersionResourceAccessPolicyPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty.Builder =
        CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty.builder()

    public fun permission(permission: String) {
        cdkBuilder.permission(permission)
    }

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun build(): CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty = cdkBuilder.build()
}
