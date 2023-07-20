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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDBSecurityGroupIngressDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDBSecurityGroupIngress.Builder =
        CfnDBSecurityGroupIngress.Builder.create(scope, id)

    public fun cidrip(cidrip: String) {
        cdkBuilder.cidrip(cidrip)
    }

    public fun dbSecurityGroupName(dbSecurityGroupName: String) {
        cdkBuilder.dbSecurityGroupName(dbSecurityGroupName)
    }

    public fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
        cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
    }

    public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
        cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
        cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): CfnDBSecurityGroupIngress = cdkBuilder.build()
}
