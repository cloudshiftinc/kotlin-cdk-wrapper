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

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup
import software.constructs.Construct

/**
 * The collection of compute resources in Amazon Redshift Serverless.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshiftserverless.*;
 * CfnWorkgroup cfnWorkgroup = CfnWorkgroup.Builder.create(this, "MyCfnWorkgroup")
 * .workgroupName("workgroupName")
 * // the properties below are optional
 * .baseCapacity(123)
 * .configParameters(List.of(ConfigParameterProperty.builder()
 * .parameterKey("parameterKey")
 * .parameterValue("parameterValue")
 * .build()))
 * .enhancedVpcRouting(false)
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
public class CfnWorkgroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWorkgroup.Builder = CfnWorkgroup.Builder.create(scope, id)

    private val _configParameters: MutableList<Any> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The base compute capacity of the workgroup in Redshift Processing Units (RPUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-basecapacity)
     *
     * @param baseCapacity The base compute capacity of the workgroup in Redshift Processing Units
     *   (RPUs).
     */
    public fun baseCapacity(baseCapacity: Number) {
        cdkBuilder.baseCapacity(baseCapacity)
    }

    /**
     * A list of parameters to set for finer control over a database.
     *
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , and `max_query_execution_time` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
     *
     * @param configParameters A list of parameters to set for finer control over a database.
     */
    public fun configParameters(vararg configParameters: Any) {
        _configParameters.addAll(listOf(*configParameters))
    }

    /**
     * A list of parameters to set for finer control over a database.
     *
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , and `max_query_execution_time` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
     *
     * @param configParameters A list of parameters to set for finer control over a database.
     */
    public fun configParameters(configParameters: Collection<Any>) {
        _configParameters.addAll(configParameters)
    }

    /**
     * A list of parameters to set for finer control over a database.
     *
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , and `max_query_execution_time` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
     *
     * @param configParameters A list of parameters to set for finer control over a database.
     */
    public fun configParameters(configParameters: IResolvable) {
        cdkBuilder.configParameters(configParameters)
    }

    /**
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing,
     * which forces Amazon Redshift Serverless to route traffic through your VPC.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-enhancedvpcrouting)
     *
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     *   cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your
     *   VPC.
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    /**
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing,
     * which forces Amazon Redshift Serverless to route traffic through your VPC.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-enhancedvpcrouting)
     *
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     *   cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your
     *   VPC.
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    /**
     * The namespace the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-namespacename)
     *
     * @param namespaceName The namespace the workgroup is associated with.
     */
    public fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
    }

    /**
     * The custom port to use when connecting to a workgroup.
     *
     * Valid port ranges are 5431-5455 and 8191-8215. The default is 5439.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-port)
     *
     * @param port The custom port to use when connecting to a workgroup.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * A value that specifies whether the workgroup can be accessible from a public network.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-publiclyaccessible)
     *
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     *   a public network.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * A value that specifies whether the workgroup can be accessible from a public network.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-publiclyaccessible)
     *
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     *   a public network.
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * A list of security group IDs to associate with the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-securitygroupids)
     *
     * @param securityGroupIds A list of security group IDs to associate with the workgroup.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * A list of security group IDs to associate with the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-securitygroupids)
     *
     * @param securityGroupIds A list of security group IDs to associate with the workgroup.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * A list of subnet IDs the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-subnetids)
     *
     * @param subnetIds A list of subnet IDs the workgroup is associated with.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * A list of subnet IDs the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-subnetids)
     *
     * @param subnetIds A list of subnet IDs the workgroup is associated with.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * The map of the key-value pairs used to tag the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-tags)
     *
     * @param tags The map of the key-value pairs used to tag the workgroup.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The map of the key-value pairs used to tag the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-tags)
     *
     * @param tags The map of the key-value pairs used to tag the workgroup.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The name of the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-workgroupname)
     *
     * @param workgroupName The name of the workgroup.
     */
    public fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
    }

    public fun build(): CfnWorkgroup {
        if (_configParameters.isNotEmpty()) cdkBuilder.configParameters(_configParameters)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
