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

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSecurityGroupIngressDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecurityGroupIngress.Builder =
        CfnSecurityGroupIngress.Builder.create(scope, id)

    public fun cacheSecurityGroupName(cacheSecurityGroupName: String) {
        cdkBuilder.cacheSecurityGroupName(cacheSecurityGroupName)
    }

    public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
        cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
        cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): CfnSecurityGroupIngress = cdkBuilder.build()
}
