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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplateIpv6AddPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.Ipv6AddProperty.Builder =
        CfnLaunchTemplate.Ipv6AddProperty.builder()

    public fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
    }

    public fun build(): CfnLaunchTemplate.Ipv6AddProperty = cdkBuilder.build()
}
