@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.SecurityGroupContextResponse
import kotlin.Boolean
import kotlin.String

/**
 * Properties of a discovered SecurityGroup.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * SecurityGroupContextResponse securityGroupContextResponse =
 * SecurityGroupContextResponse.builder()
 * .allowAllOutbound(false)
 * .securityGroupId("securityGroupId")
 * .build();
 * ```
 */
@CdkDslMarker
public class SecurityGroupContextResponseDsl {
    private val cdkBuilder: SecurityGroupContextResponse.Builder =
        SecurityGroupContextResponse.builder()

    /**
     * @param allowAllOutbound Whether the security group allows all outbound traffic.
     * This will be true
     * when the security group has all-protocol egress permissions to access both
     * `0.0.0.0/0` and `::/0`.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean) {
        cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param securityGroupId The security group's id.
     */
    public fun securityGroupId(securityGroupId: String) {
        cdkBuilder.securityGroupId(securityGroupId)
    }

    public fun build(): SecurityGroupContextResponse = cdkBuilder.build()
}
