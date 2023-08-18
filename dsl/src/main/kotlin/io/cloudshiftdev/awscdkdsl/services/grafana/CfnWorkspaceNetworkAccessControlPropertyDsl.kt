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

package io.cloudshiftdev.awscdkdsl.services.grafana

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.grafana.CfnWorkspace

/**
 * The configuration settings for in-bound network access to your workspace.
 *
 * When this is configured, only listed IP addresses and VPC endpoints will be able to access your
 * workspace. Standard Grafana authentication and authorization are still required.
 *
 * Access is granted to a caller that is in either the IP address list or the VPC endpoint list -
 * they do not need to be in both.
 *
 * If this is not configured, or is removed, then all IP addresses and VPC endpoints are allowed.
 * Standard Grafana authentication and authorization are still required.
 *
 * While both `prefixListIds` and `vpceIds` are required, you can pass in an empty array of strings
 * for either parameter if you do not want to allow any of that type.
 *
 * If both are passed as empty arrays, no traffic is allowed to the workspace, because only
 * *explicitly* allowed connections are accepted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.grafana.*;
 * NetworkAccessControlProperty networkAccessControlProperty =
 * NetworkAccessControlProperty.builder()
 * .prefixListIds(List.of("prefixListIds"))
 * .vpceIds(List.of("vpceIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-networkaccesscontrol.html)
 */
@CdkDslMarker
public class CfnWorkspaceNetworkAccessControlPropertyDsl {
    private val cdkBuilder: CfnWorkspace.NetworkAccessControlProperty.Builder =
        CfnWorkspace.NetworkAccessControlProperty.builder()

    private val _prefixListIds: MutableList<String> = mutableListOf()

    private val _vpceIds: MutableList<String> = mutableListOf()

    /**
     * @param prefixListIds An array of prefix list IDs. A prefix list is a list of CIDR ranges of
     *   IP addresses. The IP addresses specified are allowed to access your workspace. If the list
     *   is not included in the configuration (passed an empty array) then no IP addresses are
     *   allowed to access the workspace. You create a prefix list using the Amazon VPC console.
     *
     * Prefix list IDs have the format `pl- *1a2b3c4d*` .
     *
     * For more information about prefix lists, see
     * [Group CIDR blocks using managed prefix lists](https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html)
     * in the *Amazon Virtual Private Cloud User Guide* .
     */
    public fun prefixListIds(vararg prefixListIds: String) {
        _prefixListIds.addAll(listOf(*prefixListIds))
    }

    /**
     * @param prefixListIds An array of prefix list IDs. A prefix list is a list of CIDR ranges of
     *   IP addresses. The IP addresses specified are allowed to access your workspace. If the list
     *   is not included in the configuration (passed an empty array) then no IP addresses are
     *   allowed to access the workspace. You create a prefix list using the Amazon VPC console.
     *
     * Prefix list IDs have the format `pl- *1a2b3c4d*` .
     *
     * For more information about prefix lists, see
     * [Group CIDR blocks using managed prefix lists](https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html)
     * in the *Amazon Virtual Private Cloud User Guide* .
     */
    public fun prefixListIds(prefixListIds: Collection<String>) {
        _prefixListIds.addAll(prefixListIds)
    }

    /**
     * @param vpceIds An array of Amazon VPC endpoint IDs for the workspace. You can create VPC
     *   endpoints to your Amazon Managed Grafana workspace for access from within a VPC. If a
     *   `NetworkAccessConfiguration` is specified then only VPC endpoints specified here are
     *   allowed to access the workspace. If you pass in an empty array of strings, then no VPCs are
     *   allowed to access the workspace.
     *
     * VPC endpoint IDs have the format `vpce- *1a2b3c4d*` .
     *
     * For more information about creating an interface VPC endpoint, see
     * [Interface VPC endpoints](https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints)
     * in the *Amazon Managed Grafana User Guide* .
     *
     * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana
     * workspaces (using the `com.amazonaws.[region].grafana-workspace` service endpoint). Other VPC
     * endpoints are ignored.
     */
    public fun vpceIds(vararg vpceIds: String) {
        _vpceIds.addAll(listOf(*vpceIds))
    }

    /**
     * @param vpceIds An array of Amazon VPC endpoint IDs for the workspace. You can create VPC
     *   endpoints to your Amazon Managed Grafana workspace for access from within a VPC. If a
     *   `NetworkAccessConfiguration` is specified then only VPC endpoints specified here are
     *   allowed to access the workspace. If you pass in an empty array of strings, then no VPCs are
     *   allowed to access the workspace.
     *
     * VPC endpoint IDs have the format `vpce- *1a2b3c4d*` .
     *
     * For more information about creating an interface VPC endpoint, see
     * [Interface VPC endpoints](https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints)
     * in the *Amazon Managed Grafana User Guide* .
     *
     * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana
     * workspaces (using the `com.amazonaws.[region].grafana-workspace` service endpoint). Other VPC
     * endpoints are ignored.
     */
    public fun vpceIds(vpceIds: Collection<String>) {
        _vpceIds.addAll(vpceIds)
    }

    public fun build(): CfnWorkspace.NetworkAccessControlProperty {
        if (_prefixListIds.isNotEmpty()) cdkBuilder.prefixListIds(_prefixListIds)
        if (_vpceIds.isNotEmpty()) cdkBuilder.vpceIds(_vpceIds)
        return cdkBuilder.build()
    }
}
