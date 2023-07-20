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
import software.amazon.awscdk.services.ec2.AclCidrConfig
import kotlin.String

@CdkDslMarker
public class AclCidrConfigDsl {
    private val cdkBuilder: AclCidrConfig.Builder = AclCidrConfig.builder()

    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    public fun build(): AclCidrConfig = cdkBuilder.build()
}
