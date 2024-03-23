@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDBProxy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBProxyProps cfnDBProxyProps = CfnDBProxyProps.builder()
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
public interface CfnDBProxyProps {
  /**
   * The authorization mechanism that the proxy uses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
   */
  public fun auth(): Any

  /**
   * The identifier for the proxy.
   *
   * This name must be unique for all proxies owned by your AWS account in the specified AWS Region
   * . An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens;
   * it can't end with a hyphen or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-dbproxyname)
   */
  public fun dbProxyName(): String

  /**
   * Specifies whether the proxy includes detailed information about SQL statements in its logs.
   *
   * This information helps you to debug issues involving SQL behavior or the performance and
   * scalability of the proxy connections. The debug information includes the text of SQL statements
   * that you submit through the proxy. Thus, only enable this setting when needed for debugging, and
   * only when you have security measures in place to safeguard any sensitive information that appears
   * in the logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-debuglogging)
   */
  public fun debugLogging(): Any? = unwrap(this).getDebugLogging()

  /**
   * The kinds of databases that the proxy can connect to.
   *
   * This value determines which database network protocol the proxy recognizes when it interprets
   * network traffic to and from the database. For Aurora MySQL, RDS for MariaDB, and RDS for MySQL
   * databases, specify `MYSQL` . For Aurora PostgreSQL and RDS for PostgreSQL databases, specify
   * `POSTGRESQL` . For RDS for Microsoft SQL Server, specify `SQLSERVER` .
   *
   * *Valid Values* : `MYSQL` | `POSTGRESQL` | `SQLSERVER`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-enginefamily)
   */
  public fun engineFamily(): String

  /**
   * The number of seconds that a connection to the proxy can be inactive before the proxy
   * disconnects it.
   *
   * You can set this value higher or lower than the connection timeout limit for the associated
   * database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-idleclienttimeout)
   */
  public fun idleClientTimeout(): Number? = unwrap(this).getIdleClientTimeout()

  /**
   * Specifies whether Transport Layer Security (TLS) encryption is required for connections to the
   * proxy.
   *
   * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls)
   */
  public fun requireTls(): Any? = unwrap(this).getRequireTls()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS
   * Secrets Manager.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-rolearn)
   */
  public fun roleArn(): String

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags)
   */
  public fun tags(): List<CfnDBProxy.TagFormatProperty> =
      unwrap(this).getTags()?.map(CfnDBProxy.TagFormatProperty::wrap) ?: emptyList()

  /**
   * One or more VPC security group IDs to associate with the new proxy.
   *
   * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * One or more VPC subnet IDs to associate with the new proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids)
   */
  public fun vpcSubnetIds(): List<String>

  /**
   * A builder for [CfnDBProxyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param auth The authorization mechanism that the proxy uses. 
     */
    public fun auth(auth: IResolvable)

    /**
     * @param auth The authorization mechanism that the proxy uses. 
     */
    public fun auth(auth: List<Any>)

    /**
     * @param auth The authorization mechanism that the proxy uses. 
     */
    public fun auth(vararg auth: Any)

    /**
     * @param dbProxyName The identifier for the proxy. 
     * This name must be unique for all proxies owned by your AWS account in the specified AWS
     * Region . An identifier must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     */
    public fun dbProxyName(dbProxyName: String)

    /**
     * @param debugLogging Specifies whether the proxy includes detailed information about SQL
     * statements in its logs.
     * This information helps you to debug issues involving SQL behavior or the performance and
     * scalability of the proxy connections. The debug information includes the text of SQL statements
     * that you submit through the proxy. Thus, only enable this setting when needed for debugging, and
     * only when you have security measures in place to safeguard any sensitive information that
     * appears in the logs.
     */
    public fun debugLogging(debugLogging: Boolean)

    /**
     * @param debugLogging Specifies whether the proxy includes detailed information about SQL
     * statements in its logs.
     * This information helps you to debug issues involving SQL behavior or the performance and
     * scalability of the proxy connections. The debug information includes the text of SQL statements
     * that you submit through the proxy. Thus, only enable this setting when needed for debugging, and
     * only when you have security measures in place to safeguard any sensitive information that
     * appears in the logs.
     */
    public fun debugLogging(debugLogging: IResolvable)

    /**
     * @param engineFamily The kinds of databases that the proxy can connect to. 
     * This value determines which database network protocol the proxy recognizes when it interprets
     * network traffic to and from the database. For Aurora MySQL, RDS for MariaDB, and RDS for MySQL
     * databases, specify `MYSQL` . For Aurora PostgreSQL and RDS for PostgreSQL databases, specify
     * `POSTGRESQL` . For RDS for Microsoft SQL Server, specify `SQLSERVER` .
     *
     * *Valid Values* : `MYSQL` | `POSTGRESQL` | `SQLSERVER`
     */
    public fun engineFamily(engineFamily: String)

    /**
     * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it.
     * You can set this value higher or lower than the connection timeout limit for the associated
     * database.
     */
    public fun idleClientTimeout(idleClientTimeout: Number)

    /**
     * @param requireTls Specifies whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy.
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     */
    public fun requireTls(requireTls: Boolean)

    /**
     * @param requireTls Specifies whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy.
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     */
    public fun requireTls(requireTls: IResolvable)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access
     * secrets in AWS Secrets Manager. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy.
     */
    public fun tags(tags: List<CfnDBProxy.TagFormatProperty>)

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy.
     */
    public fun tags(vararg tags: CfnDBProxy.TagFormatProperty)

    /**
     * @param vpcSecurityGroupIds One or more VPC security group IDs to associate with the new
     * proxy.
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds One or more VPC security group IDs to associate with the new
     * proxy.
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)

    /**
     * @param vpcSubnetIds One or more VPC subnet IDs to associate with the new proxy. 
     */
    public fun vpcSubnetIds(vpcSubnetIds: List<String>)

    /**
     * @param vpcSubnetIds One or more VPC subnet IDs to associate with the new proxy. 
     */
    public fun vpcSubnetIds(vararg vpcSubnetIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxyProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxyProps.builder()

    /**
     * @param auth The authorization mechanism that the proxy uses. 
     */
    override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable::unwrap))
    }

    /**
     * @param auth The authorization mechanism that the proxy uses. 
     */
    override fun auth(auth: List<Any>) {
      cdkBuilder.auth(auth)
    }

    /**
     * @param auth The authorization mechanism that the proxy uses. 
     */
    override fun auth(vararg auth: Any): Unit = auth(auth.toList())

    /**
     * @param dbProxyName The identifier for the proxy. 
     * This name must be unique for all proxies owned by your AWS account in the specified AWS
     * Region . An identifier must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     */
    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * @param debugLogging Specifies whether the proxy includes detailed information about SQL
     * statements in its logs.
     * This information helps you to debug issues involving SQL behavior or the performance and
     * scalability of the proxy connections. The debug information includes the text of SQL statements
     * that you submit through the proxy. Thus, only enable this setting when needed for debugging, and
     * only when you have security measures in place to safeguard any sensitive information that
     * appears in the logs.
     */
    override fun debugLogging(debugLogging: Boolean) {
      cdkBuilder.debugLogging(debugLogging)
    }

    /**
     * @param debugLogging Specifies whether the proxy includes detailed information about SQL
     * statements in its logs.
     * This information helps you to debug issues involving SQL behavior or the performance and
     * scalability of the proxy connections. The debug information includes the text of SQL statements
     * that you submit through the proxy. Thus, only enable this setting when needed for debugging, and
     * only when you have security measures in place to safeguard any sensitive information that
     * appears in the logs.
     */
    override fun debugLogging(debugLogging: IResolvable) {
      cdkBuilder.debugLogging(debugLogging.let(IResolvable::unwrap))
    }

    /**
     * @param engineFamily The kinds of databases that the proxy can connect to. 
     * This value determines which database network protocol the proxy recognizes when it interprets
     * network traffic to and from the database. For Aurora MySQL, RDS for MariaDB, and RDS for MySQL
     * databases, specify `MYSQL` . For Aurora PostgreSQL and RDS for PostgreSQL databases, specify
     * `POSTGRESQL` . For RDS for Microsoft SQL Server, specify `SQLSERVER` .
     *
     * *Valid Values* : `MYSQL` | `POSTGRESQL` | `SQLSERVER`
     */
    override fun engineFamily(engineFamily: String) {
      cdkBuilder.engineFamily(engineFamily)
    }

    /**
     * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it.
     * You can set this value higher or lower than the connection timeout limit for the associated
     * database.
     */
    override fun idleClientTimeout(idleClientTimeout: Number) {
      cdkBuilder.idleClientTimeout(idleClientTimeout)
    }

    /**
     * @param requireTls Specifies whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy.
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     */
    override fun requireTls(requireTls: Boolean) {
      cdkBuilder.requireTls(requireTls)
    }

    /**
     * @param requireTls Specifies whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy.
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     */
    override fun requireTls(requireTls: IResolvable) {
      cdkBuilder.requireTls(requireTls.let(IResolvable::unwrap))
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access
     * secrets in AWS Secrets Manager. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy.
     */
    override fun tags(tags: List<CfnDBProxy.TagFormatProperty>) {
      cdkBuilder.tags(tags.map(CfnDBProxy.TagFormatProperty::unwrap))
    }

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy.
     */
    override fun tags(vararg tags: CfnDBProxy.TagFormatProperty): Unit = tags(tags.toList())

    /**
     * @param vpcSecurityGroupIds One or more VPC security group IDs to associate with the new
     * proxy.
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds One or more VPC security group IDs to associate with the new
     * proxy.
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    /**
     * @param vpcSubnetIds One or more VPC subnet IDs to associate with the new proxy. 
     */
    override fun vpcSubnetIds(vpcSubnetIds: List<String>) {
      cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    /**
     * @param vpcSubnetIds One or more VPC subnet IDs to associate with the new proxy. 
     */
    override fun vpcSubnetIds(vararg vpcSubnetIds: String): Unit =
        vpcSubnetIds(vpcSubnetIds.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyProps,
  ) : CdkObject(cdkObject), CfnDBProxyProps {
    /**
     * The authorization mechanism that the proxy uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
     */
    override fun auth(): Any = unwrap(this).getAuth()

    /**
     * The identifier for the proxy.
     *
     * This name must be unique for all proxies owned by your AWS account in the specified AWS
     * Region . An identifier must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-dbproxyname)
     */
    override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    /**
     * Specifies whether the proxy includes detailed information about SQL statements in its logs.
     *
     * This information helps you to debug issues involving SQL behavior or the performance and
     * scalability of the proxy connections. The debug information includes the text of SQL statements
     * that you submit through the proxy. Thus, only enable this setting when needed for debugging, and
     * only when you have security measures in place to safeguard any sensitive information that
     * appears in the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-debuglogging)
     */
    override fun debugLogging(): Any? = unwrap(this).getDebugLogging()

    /**
     * The kinds of databases that the proxy can connect to.
     *
     * This value determines which database network protocol the proxy recognizes when it interprets
     * network traffic to and from the database. For Aurora MySQL, RDS for MariaDB, and RDS for MySQL
     * databases, specify `MYSQL` . For Aurora PostgreSQL and RDS for PostgreSQL databases, specify
     * `POSTGRESQL` . For RDS for Microsoft SQL Server, specify `SQLSERVER` .
     *
     * *Valid Values* : `MYSQL` | `POSTGRESQL` | `SQLSERVER`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-enginefamily)
     */
    override fun engineFamily(): String = unwrap(this).getEngineFamily()

    /**
     * The number of seconds that a connection to the proxy can be inactive before the proxy
     * disconnects it.
     *
     * You can set this value higher or lower than the connection timeout limit for the associated
     * database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-idleclienttimeout)
     */
    override fun idleClientTimeout(): Number? = unwrap(this).getIdleClientTimeout()

    /**
     * Specifies whether Transport Layer Security (TLS) encryption is required for connections to
     * the proxy.
     *
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls)
     */
    override fun requireTls(): Any? = unwrap(this).getRequireTls()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS
     * Secrets Manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags)
     */
    override fun tags(): List<CfnDBProxy.TagFormatProperty> =
        unwrap(this).getTags()?.map(CfnDBProxy.TagFormatProperty::wrap) ?: emptyList()

    /**
     * One or more VPC security group IDs to associate with the new proxy.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()

    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids)
     */
    override fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBProxyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyProps):
        CfnDBProxyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDBProxyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxyProps):
        software.amazon.awscdk.services.rds.CfnDBProxyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.CfnDBProxyProps
  }
}
