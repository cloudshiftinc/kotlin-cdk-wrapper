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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnDBProxy
import software.constructs.Construct

/**
 * The `AWS::RDS::DBProxy` resource creates or updates a DB proxy.
 *
 * For information about RDS Proxy for Amazon RDS, see
 * [Managing Connections with Amazon RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html)
 * in the *Amazon RDS User Guide* .
 *
 * For information about RDS Proxy for Amazon Aurora, see
 * [Managing Connections with Amazon RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html)
 * in the *Amazon Aurora User Guide* .
 *
 * Limitations apply to RDS Proxy, including DB engine version limitations and AWS Region
 * limitations.
 *
 * For information about limitations that apply to RDS Proxy for Amazon RDS, see
 * [Limitations for RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html#rds-proxy.limitations)
 * in the *Amazon RDS User Guide* .
 *
 * For information about that apply to RDS Proxy for Amazon Aurora, see
 * [Limitations for RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html#rds-proxy.limitations)
 * in the *Amazon Aurora User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnDBProxy cfnDBProxy = CfnDBProxy.Builder.create(this, "MyCfnDBProxy")
 * .auth(List.of(AuthFormatProperty.builder()
 * .authScheme("authScheme")
 * .clientPasswordAuthType("clientPasswordAuthType")
 * .description("description")
 * .iamAuth("iamAuth")
 * .secretArn("secretArn")
 * .build()))
 * .dbProxyName("dbProxyName")
 * .engineFamily("engineFamily")
 * .roleArn("roleArn")
 * .vpcSubnetIds(List.of("vpcSubnetIds"))
 * // the properties below are optional
 * .debugLogging(false)
 * .idleClientTimeout(123)
 * .requireTls(false)
 * .tags(List.of(TagFormatProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html)
 */
@CdkDslMarker
public class CfnDBProxyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDBProxy.Builder = CfnDBProxy.Builder.create(scope, id)

    private val _auth: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnDBProxy.TagFormatProperty> = mutableListOf()

    private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

    private val _vpcSubnetIds: MutableList<String> = mutableListOf()

    /**
     * The authorization mechanism that the proxy uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
     *
     * @param auth The authorization mechanism that the proxy uses.
     */
    public fun auth(vararg auth: Any) {
        _auth.addAll(listOf(*auth))
    }

    /**
     * The authorization mechanism that the proxy uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
     *
     * @param auth The authorization mechanism that the proxy uses.
     */
    public fun auth(auth: Collection<Any>) {
        _auth.addAll(auth)
    }

    /**
     * The authorization mechanism that the proxy uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
     *
     * @param auth The authorization mechanism that the proxy uses.
     */
    public fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth)
    }

    /**
     * The identifier for the proxy.
     *
     * This name must be unique for all proxies owned by your AWS account in the specified AWS
     * Region . An identifier must begin with a letter and must contain only ASCII letters, digits,
     * and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-dbproxyname)
     *
     * @param dbProxyName The identifier for the proxy.
     */
    public fun dbProxyName(dbProxyName: String) {
        cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * Whether the proxy includes detailed information about SQL statements in its logs.
     *
     * This information helps you to debug issues involving SQL behavior or the performance and
     * scalability of the proxy connections. The debug information includes the text of SQL
     * statements that you submit through the proxy. Thus, only enable this setting when needed for
     * debugging, and only when you have security measures in place to safeguard any sensitive
     * information that appears in the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-debuglogging)
     *
     * @param debugLogging Whether the proxy includes detailed information about SQL statements in
     *   its logs.
     */
    public fun debugLogging(debugLogging: Boolean) {
        cdkBuilder.debugLogging(debugLogging)
    }

    /**
     * Whether the proxy includes detailed information about SQL statements in its logs.
     *
     * This information helps you to debug issues involving SQL behavior or the performance and
     * scalability of the proxy connections. The debug information includes the text of SQL
     * statements that you submit through the proxy. Thus, only enable this setting when needed for
     * debugging, and only when you have security measures in place to safeguard any sensitive
     * information that appears in the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-debuglogging)
     *
     * @param debugLogging Whether the proxy includes detailed information about SQL statements in
     *   its logs.
     */
    public fun debugLogging(debugLogging: IResolvable) {
        cdkBuilder.debugLogging(debugLogging)
    }

    /**
     * The kinds of databases that the proxy can connect to.
     *
     * This value determines which database network protocol the proxy recognizes when it interprets
     * network traffic to and from the database. For Aurora MySQL, RDS for MariaDB, and RDS for
     * MySQL databases, specify `MYSQL` . For Aurora PostgreSQL and RDS for PostgreSQL databases,
     * specify `POSTGRESQL` . For RDS for Microsoft SQL Server, specify `SQLSERVER` .
     *
     * *Valid values* : `MYSQL` | `POSTGRESQL` | `SQLSERVER`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-enginefamily)
     *
     * @param engineFamily The kinds of databases that the proxy can connect to.
     */
    public fun engineFamily(engineFamily: String) {
        cdkBuilder.engineFamily(engineFamily)
    }

    /**
     * The number of seconds that a connection to the proxy can be inactive before the proxy
     * disconnects it.
     *
     * You can set this value higher or lower than the connection timeout limit for the associated
     * database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-idleclienttimeout)
     *
     * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
     *   before the proxy disconnects it.
     */
    public fun idleClientTimeout(idleClientTimeout: Number) {
        cdkBuilder.idleClientTimeout(idleClientTimeout)
    }

    /**
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is
     * required for connections to the proxy.
     *
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls)
     *
     * @param requireTls A Boolean parameter that specifies whether Transport Layer Security (TLS)
     *   encryption is required for connections to the proxy.
     */
    public fun requireTls(requireTls: Boolean) {
        cdkBuilder.requireTls(requireTls)
    }

    /**
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is
     * required for connections to the proxy.
     *
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls)
     *
     * @param requireTls A Boolean parameter that specifies whether Transport Layer Security (TLS)
     *   encryption is required for connections to the proxy.
     */
    public fun requireTls(requireTls: IResolvable) {
        cdkBuilder.requireTls(requireTls)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS
     * Secrets Manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access
     *   secrets in AWS Secrets Manager.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags)
     *
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     *   with the proxy.
     */
    public fun tags(tags: CfnDBProxyTagFormatPropertyDsl.() -> Unit) {
        _tags.add(CfnDBProxyTagFormatPropertyDsl().apply(tags).build())
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags)
     *
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     *   with the proxy.
     */
    public fun tags(tags: Collection<CfnDBProxy.TagFormatProperty>) {
        _tags.addAll(tags)
    }

    /**
     * One or more VPC security group IDs to associate with the new proxy.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids)
     *
     * @param vpcSecurityGroupIds One or more VPC security group IDs to associate with the new
     *   proxy.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
        _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
    }

    /**
     * One or more VPC security group IDs to associate with the new proxy.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids)
     *
     * @param vpcSecurityGroupIds One or more VPC security group IDs to associate with the new
     *   proxy.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
        _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
    }

    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids)
     *
     * @param vpcSubnetIds One or more VPC subnet IDs to associate with the new proxy.
     */
    public fun vpcSubnetIds(vararg vpcSubnetIds: String) {
        _vpcSubnetIds.addAll(listOf(*vpcSubnetIds))
    }

    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids)
     *
     * @param vpcSubnetIds One or more VPC subnet IDs to associate with the new proxy.
     */
    public fun vpcSubnetIds(vpcSubnetIds: Collection<String>) {
        _vpcSubnetIds.addAll(vpcSubnetIds)
    }

    public fun build(): CfnDBProxy {
        if (_auth.isNotEmpty()) cdkBuilder.auth(_auth)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
        if (_vpcSubnetIds.isNotEmpty()) cdkBuilder.vpcSubnetIds(_vpcSubnetIds)
        return cdkBuilder.build()
    }
}
