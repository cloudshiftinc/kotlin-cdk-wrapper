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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplatePrivateIpAddPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.PrivateIpAddProperty.Builder =
        CfnLaunchTemplate.PrivateIpAddProperty.builder()

    public fun primary(primary: Boolean) {
        cdkBuilder.primary(primary)
    }

    public fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary)
    }

    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    public fun build(): CfnLaunchTemplate.PrivateIpAddProperty = cdkBuilder.build()
}
