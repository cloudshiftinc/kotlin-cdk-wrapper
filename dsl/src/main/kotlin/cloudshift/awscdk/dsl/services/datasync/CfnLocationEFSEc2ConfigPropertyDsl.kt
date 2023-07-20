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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.datasync.CfnLocationEFS
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLocationEFSEc2ConfigPropertyDsl {
    private val cdkBuilder: CfnLocationEFS.Ec2ConfigProperty.Builder =
        CfnLocationEFS.Ec2ConfigProperty.builder()

    private val _securityGroupArns: MutableList<String> = mutableListOf()

    public fun securityGroupArns(vararg securityGroupArns: String) {
        _securityGroupArns.addAll(listOf(*securityGroupArns))
    }

    public fun securityGroupArns(securityGroupArns: Collection<String>) {
        _securityGroupArns.addAll(securityGroupArns)
    }

    public fun subnetArn(subnetArn: String) {
        cdkBuilder.subnetArn(subnetArn)
    }

    public fun build(): CfnLocationEFS.Ec2ConfigProperty {
        if (_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
        return cdkBuilder.build()
    }
}
