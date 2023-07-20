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
import software.amazon.awscdk.cloudassembly.schema.VpcContextQuery
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class VpcContextQueryDsl {
    private val cdkBuilder: VpcContextQuery.Builder = VpcContextQuery.builder()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun filter(filter: Map<String, String>) {
        cdkBuilder.filter(filter)
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun returnAsymmetricSubnets(returnAsymmetricSubnets: Boolean) {
        cdkBuilder.returnAsymmetricSubnets(returnAsymmetricSubnets)
    }

    public fun returnVpnGateways(returnVpnGateways: Boolean) {
        cdkBuilder.returnVpnGateways(returnVpnGateways)
    }

    public fun subnetGroupNameTag(subnetGroupNameTag: String) {
        cdkBuilder.subnetGroupNameTag(subnetGroupNameTag)
    }

    public fun build(): VpcContextQuery = cdkBuilder.build()
}
