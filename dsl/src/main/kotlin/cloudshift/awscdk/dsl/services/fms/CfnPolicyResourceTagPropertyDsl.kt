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

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fms.CfnPolicy
import kotlin.String

@CdkDslMarker
public class CfnPolicyResourceTagPropertyDsl {
    private val cdkBuilder: CfnPolicy.ResourceTagProperty.Builder =
        CfnPolicy.ResourceTagProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnPolicy.ResourceTagProperty = cdkBuilder.build()
}
