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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information to connect to an Amazon VPC.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * DataSourceVpcConfigurationProperty dataSourceVpcConfigurationProperty =
 * DataSourceVpcConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcevpcconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceDataSourceVpcConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.DataSourceVpcConfigurationProperty.Builder =
        CfnDataSource.DataSourceVpcConfigurationProperty.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * @param securityGroupIds A list of identifiers of security groups within your Amazon VPC. The
     *   security groups should enable Amazon Kendra to connect to the data source.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds A list of identifiers of security groups within your Amazon VPC. The
     *   security groups should enable Amazon Kendra to connect to the data source.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param subnetIds A list of identifiers for subnets within your Amazon VPC. The subnets should
     *   be able to connect to each other in the VPC, and they should have outgoing access to the
     *   Internet through a NAT device.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds A list of identifiers for subnets within your Amazon VPC. The subnets should
     *   be able to connect to each other in the VPC, and they should have outgoing access to the
     *   Internet through a NAT device.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun build(): CfnDataSource.DataSourceVpcConfigurationProperty {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
