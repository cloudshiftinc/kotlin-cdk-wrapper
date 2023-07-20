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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBrokerLdapServerMetadataPropertyDsl {
    private val cdkBuilder: CfnBroker.LdapServerMetadataProperty.Builder =
        CfnBroker.LdapServerMetadataProperty.builder()

    private val _hosts: MutableList<String> = mutableListOf()

    public fun hosts(vararg hosts: String) {
        _hosts.addAll(listOf(*hosts))
    }

    public fun hosts(hosts: Collection<String>) {
        _hosts.addAll(hosts)
    }

    public fun roleBase(roleBase: String) {
        cdkBuilder.roleBase(roleBase)
    }

    public fun roleName(roleName: String) {
        cdkBuilder.roleName(roleName)
    }

    public fun roleSearchMatching(roleSearchMatching: String) {
        cdkBuilder.roleSearchMatching(roleSearchMatching)
    }

    public fun roleSearchSubtree(roleSearchSubtree: Boolean) {
        cdkBuilder.roleSearchSubtree(roleSearchSubtree)
    }

    public fun roleSearchSubtree(roleSearchSubtree: IResolvable) {
        cdkBuilder.roleSearchSubtree(roleSearchSubtree)
    }

    public fun serviceAccountPassword(serviceAccountPassword: String) {
        cdkBuilder.serviceAccountPassword(serviceAccountPassword)
    }

    public fun serviceAccountUsername(serviceAccountUsername: String) {
        cdkBuilder.serviceAccountUsername(serviceAccountUsername)
    }

    public fun userBase(userBase: String) {
        cdkBuilder.userBase(userBase)
    }

    public fun userRoleName(userRoleName: String) {
        cdkBuilder.userRoleName(userRoleName)
    }

    public fun userSearchMatching(userSearchMatching: String) {
        cdkBuilder.userSearchMatching(userSearchMatching)
    }

    public fun userSearchSubtree(userSearchSubtree: Boolean) {
        cdkBuilder.userSearchSubtree(userSearchSubtree)
    }

    public fun userSearchSubtree(userSearchSubtree: IResolvable) {
        cdkBuilder.userSearchSubtree(userSearchSubtree)
    }

    public fun build(): CfnBroker.LdapServerMetadataProperty {
        if (_hosts.isNotEmpty()) cdkBuilder.hosts(_hosts)
        return cdkBuilder.build()
    }
}
