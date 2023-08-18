@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eks.AwsAuthMapping

/**
 * AwsAuth mapping.
 *
 * Example:
 * ```
 * Cluster cluster;
 * User adminUser = new User(this, "Admin");
 * cluster.awsAuth.addUserMapping(adminUser,
 * AwsAuthMapping.builder().groups(List.of("system:masters")).build());
 * ```
 */
@CdkDslMarker
public class AwsAuthMappingDsl {
    private val cdkBuilder: AwsAuthMapping.Builder = AwsAuthMapping.builder()

    private val _groups: MutableList<String> = mutableListOf()

    /** @param groups A list of groups within Kubernetes to which the role is mapped. */
    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    /** @param groups A list of groups within Kubernetes to which the role is mapped. */
    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    /** @param username The user name within Kubernetes to map to the IAM role. */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): AwsAuthMapping {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        return cdkBuilder.build()
    }
}
