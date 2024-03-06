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

package io.cloudshiftdev.awscdkdsl.services.redshiftserverless

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps

/**
 * Properties for defining a `CfnWorkgroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshiftserverless.*;
 * CfnWorkgroupProps cfnWorkgroupProps = CfnWorkgroupProps.builder()
 * .workgroupName("workgroupName")
 * // the properties below are optional
 * .baseCapacity(123)
 * .configParameters(List.of(ConfigParameterProperty.builder()
 * .parameterKey("parameterKey")
 * .parameterValue("parameterValue")
 * .build()))
 * .enhancedVpcRouting(false)
 * .maxCapacity(123)
 * .namespaceName("namespaceName")
 * .port(123)
 * .publiclyAccessible(false)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html)
 */
@CdkDslMarker
public class CfnWorkgroupPropsDsl {
    private val cdkBuilder: CfnWorkgroupProps.Builder = CfnWorkgroupProps.builder()

    private val _configParameters: MutableList<Any> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param baseCapacity The base compute capacity of the workgroup in Redshift Processing Units
     *   (RPUs).
     */
    public fun baseCapacity(baseCapacity: Number) {
        cdkBuilder.baseCapacity(baseCapacity)
    }

    /**
     * @param configParameters A list of parameters to set for finer control over a database.
     *   Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     *   `search_path` , `max_query_execution_time` , and `require_ssl` .
     */
    public fun configParameters(vararg configParameters: Any) {
        _configParameters.addAll(listOf(*configParameters))
    }

    /**
     * @param configParameters A list of parameters to set for finer control over a database.
     *   Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     *   `search_path` , `max_query_execution_time` , and `require_ssl` .
     */
    public fun configParameters(configParameters: Collection<Any>) {
        _configParameters.addAll(configParameters)
    }

    /**
     * @param configParameters A list of parameters to set for finer control over a database.
     *   Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     *   `search_path` , `max_query_execution_time` , and `require_ssl` .
     */
    public fun configParameters(configParameters: IResolvable) {
        cdkBuilder.configParameters(configParameters)
    }

    /**
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     *   cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your
     *   VPC.
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    /**
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     *   cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your
     *   VPC.
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    /**
     * @param maxCapacity The max compute capacity of the workgroup in Redshift Processing Units
     *   (RPUs).
     */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /** @param namespaceName The namespace the workgroup is associated with. */
    public fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
    }

    /**
     * @param port The custom port to use when connecting to a workgroup. Valid port ranges are
     *   5431-5455 and 8191-8215. The default is 5439.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     *   a public network.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     *   a public network.
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /** @param securityGroupIds A list of security group IDs to associate with the workgroup. */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /** @param securityGroupIds A list of security group IDs to associate with the workgroup. */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /** @param subnetIds A list of subnet IDs the workgroup is associated with. */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /** @param subnetIds A list of subnet IDs the workgroup is associated with. */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /** @param tags The map of the key-value pairs used to tag the workgroup. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The map of the key-value pairs used to tag the workgroup. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param workgroupName The name of the workgroup. */
    public fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
    }

    public fun build(): CfnWorkgroupProps {
        if (_configParameters.isNotEmpty()) cdkBuilder.configParameters(_configParameters)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
