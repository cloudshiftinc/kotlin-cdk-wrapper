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
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.rds.DatabaseProxyAttributes
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class DatabaseProxyAttributesDsl {
    private val cdkBuilder: DatabaseProxyAttributes.Builder = DatabaseProxyAttributes.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun dbProxyArn(dbProxyArn: String) {
        cdkBuilder.dbProxyArn(dbProxyArn)
    }

    public fun dbProxyName(dbProxyName: String) {
        cdkBuilder.dbProxyName(dbProxyName)
    }

    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun build(): DatabaseProxyAttributes {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
