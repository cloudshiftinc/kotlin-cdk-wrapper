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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.String

@CdkDslMarker
public class CfnWebACLForwardedIPConfigurationPropertyDsl {
    private val cdkBuilder: CfnWebACL.ForwardedIPConfigurationProperty.Builder =
        CfnWebACL.ForwardedIPConfigurationProperty.builder()

    public fun fallbackBehavior(fallbackBehavior: String) {
        cdkBuilder.fallbackBehavior(fallbackBehavior)
    }

    public fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
    }

    public fun build(): CfnWebACL.ForwardedIPConfigurationProperty = cdkBuilder.build()
}
