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
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SecurityGroup
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class SecurityGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: SecurityGroup.Builder = SecurityGroup.Builder.create(scope, id)

    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
        cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    public fun allowAllOutbound(allowAllOutbound: Boolean) {
        cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun disableInlineRules(disableInlineRules: Boolean) {
        cdkBuilder.disableInlineRules(disableInlineRules)
    }

    public fun securityGroupName(securityGroupName: String) {
        cdkBuilder.securityGroupName(securityGroupName)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): SecurityGroup = cdkBuilder.build()
}
