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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rds.CfnDBProxyEndpoint
import software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps

/**
 * Properties for defining a `CfnDBProxyEndpoint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnDBProxyEndpointProps cfnDBProxyEndpointProps = CfnDBProxyEndpointProps.builder()
 * .dbProxyEndpointName("dbProxyEndpointName")
 * .dbProxyName("dbProxyName")
 * .vpcSubnetIds(List.of("vpcSubnetIds"))
 * // the properties below are optional
 * .tags(List.of(TagFormatProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetRole("targetRole")
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html)
 */
@CdkDslMarker
public class CfnDBProxyEndpointPropsDsl {
    private val cdkBuilder: CfnDBProxyEndpointProps.Builder = CfnDBProxyEndpointProps.builder()

    private val _tags: MutableList<CfnDBProxyEndpoint.TagFormatProperty> = mutableListOf()

    private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

    private val _vpcSubnetIds: MutableList<String> = mutableListOf()

    /** @param dbProxyEndpointName The name of the DB proxy endpoint to create. */
    public fun dbProxyEndpointName(dbProxyEndpointName: String) {
        cdkBuilder.dbProxyEndpointName(dbProxyEndpointName)
    }

    /**
     * @param dbProxyName The name of the DB proxy associated with the DB proxy endpoint that you
     *   create.
     */
    public fun dbProxyName(dbProxyName: String) {
        cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     *   with the proxy.
     */
    public fun tags(tags: CfnDBProxyEndpointTagFormatPropertyDsl.() -> Unit) {
        _tags.add(CfnDBProxyEndpointTagFormatPropertyDsl().apply(tags).build())
    }

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     *   with the proxy.
     */
    public fun tags(tags: Collection<CfnDBProxyEndpoint.TagFormatProperty>) {
        _tags.addAll(tags)
    }

    /**
     * @param targetRole A value that indicates whether the DB proxy endpoint can be used for
     *   read/write or read-only operations. Valid Values: `READ_WRITE | READ_ONLY`
     */
    public fun targetRole(targetRole: String) {
        cdkBuilder.targetRole(targetRole)
    }

    /**
     * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
     *   create. You can specify a different set of security group IDs than for the original DB
     *   proxy. The default is the default security group for the VPC.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
        _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
    }

    /**
     * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
     *   create. You can specify a different set of security group IDs than for the original DB
     *   proxy. The default is the default security group for the VPC.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
        _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. You can
     *   specify a different set of subnet IDs than for the original DB proxy.
     */
    public fun vpcSubnetIds(vararg vpcSubnetIds: String) {
        _vpcSubnetIds.addAll(listOf(*vpcSubnetIds))
    }

    /**
     * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. You can
     *   specify a different set of subnet IDs than for the original DB proxy.
     */
    public fun vpcSubnetIds(vpcSubnetIds: Collection<String>) {
        _vpcSubnetIds.addAll(vpcSubnetIds)
    }

    public fun build(): CfnDBProxyEndpointProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
        if (_vpcSubnetIds.isNotEmpty()) cdkBuilder.vpcSubnetIds(_vpcSubnetIds)
        return cdkBuilder.build()
    }
}
