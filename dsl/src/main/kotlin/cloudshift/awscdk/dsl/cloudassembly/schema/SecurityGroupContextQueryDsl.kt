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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery
import kotlin.String

@CdkDslMarker
public class SecurityGroupContextQueryDsl {
    private val cdkBuilder: SecurityGroupContextQuery.Builder = SecurityGroupContextQuery.builder()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun securityGroupId(securityGroupId: String) {
        cdkBuilder.securityGroupId(securityGroupId)
    }

    public fun securityGroupName(securityGroupName: String) {
        cdkBuilder.securityGroupName(securityGroupName)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): SecurityGroupContextQuery = cdkBuilder.build()
}
