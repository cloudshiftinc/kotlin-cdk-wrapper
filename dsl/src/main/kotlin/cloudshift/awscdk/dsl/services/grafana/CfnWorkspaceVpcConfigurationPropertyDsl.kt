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

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.grafana.CfnWorkspace

/**
 * The configuration settings for an Amazon VPC that contains data sources for your Grafana
 * workspace to connect to.
 *
 * Provided `securityGroupIds` and `subnetIds` must be part of the same VPC.
 *
 * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
 * (ap-northeast-2).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.grafana.*;
 * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-vpcconfiguration.html)
 */
@CdkDslMarker
public class CfnWorkspaceVpcConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkspace.VpcConfigurationProperty.Builder =
        CfnWorkspace.VpcConfigurationProperty.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * @param securityGroupIds The list of Amazon EC2 security group IDs attached to the Amazon VPC
     *   for your Grafana workspace to connect. Duplicates not allowed.
     *
     * *Array Members* : Minimum number of 1 items. Maximum number of 5 items.
     *
     * *Length* : Minimum length of 0. Maximum length of 255.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds The list of Amazon EC2 security group IDs attached to the Amazon VPC
     *   for your Grafana workspace to connect. Duplicates not allowed.
     *
     * *Array Members* : Minimum number of 1 items. Maximum number of 5 items.
     *
     * *Length* : Minimum length of 0. Maximum length of 255.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param subnetIds The list of Amazon EC2 subnet IDs created in the Amazon VPC for your Grafana
     *   workspace to connect. Duplicates not allowed.
     *
     * *Array Members* : Minimum number of 2 items. Maximum number of 6 items.
     *
     * *Length* : Minimum length of 0. Maximum length of 255.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds The list of Amazon EC2 subnet IDs created in the Amazon VPC for your Grafana
     *   workspace to connect. Duplicates not allowed.
     *
     * *Array Members* : Minimum number of 2 items. Maximum number of 6 items.
     *
     * *Length* : Minimum length of 0. Maximum length of 255.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun build(): CfnWorkspace.VpcConfigurationProperty {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
