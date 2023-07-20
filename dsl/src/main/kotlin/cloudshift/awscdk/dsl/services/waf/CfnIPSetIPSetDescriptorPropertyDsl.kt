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

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.waf.CfnIPSet
import kotlin.String

@CdkDslMarker
public class CfnIPSetIPSetDescriptorPropertyDsl {
    private val cdkBuilder: CfnIPSet.IPSetDescriptorProperty.Builder =
        CfnIPSet.IPSetDescriptorProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnIPSet.IPSetDescriptorProperty = cdkBuilder.build()
}
