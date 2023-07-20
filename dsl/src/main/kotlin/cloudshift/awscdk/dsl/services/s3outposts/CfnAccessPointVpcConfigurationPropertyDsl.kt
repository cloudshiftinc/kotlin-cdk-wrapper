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

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint
import kotlin.String

@CdkDslMarker
public class CfnAccessPointVpcConfigurationPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.VpcConfigurationProperty.Builder =
        CfnAccessPoint.VpcConfigurationProperty.builder()

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnAccessPoint.VpcConfigurationProperty = cdkBuilder.build()
}
