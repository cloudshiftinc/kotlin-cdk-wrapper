@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::RDS::DBProxy` resource creates or updates a DB proxy.
 *
 * For information about RDS Proxy for Amazon RDS, see [Managing Connections with Amazon RDS
 * Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html) in the *Amazon RDS
 * User Guide* .
 *
 * For information about RDS Proxy for Amazon Aurora, see [Managing Connections with Amazon RDS
 * Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html) in the *Amazon
 * Aurora User Guide* .
 *
 *
 * Limitations apply to RDS Proxy, including DB engine version limitations and AWS Region
 * limitations.
 *
 * For information about limitations that apply to RDS Proxy for Amazon RDS, see [Limitations for
 * RDS
 * Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html#rds-proxy.limitations)
 * in the *Amazon RDS User Guide* .
 *
 * For information about that apply to RDS Proxy for Amazon Aurora, see [Limitations for RDS
 * Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html#rds-proxy.limitations)
 * in the *Amazon Aurora User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
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
public open class CfnDBProxy(
  cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBProxyProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnDBProxy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDBProxyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBProxyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDBProxyProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the proxy.
   */
  public open fun attrDbProxyArn(): String = unwrap(this).getAttrDbProxyArn()

  /**
   * The endpoint that you can use to connect to the DB proxy.
   *
   * You include the endpoint value in the connection string for a database client application.
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   * The VPC ID to associate with the DB proxy.
   */
  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  /**
   * The authorization mechanism that the proxy uses.
   */
  public open fun auth(): Any = unwrap(this).getAuth()

  /**
   * The authorization mechanism that the proxy uses.
   */
  public open fun auth(`value`: IResolvable) {
    unwrap(this).setAuth(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The authorization mechanism that the proxy uses.
   */
  public open fun auth(`value`: List<Any>) {
    unwrap(this).setAuth(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The authorization mechanism that the proxy uses.
   */
  public open fun auth(vararg `value`: Any): Unit = auth(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The identifier for the proxy.
   */
  public open fun dbProxyName(): String = unwrap(this).getDbProxyName()

  /**
   * The identifier for the proxy.
   */
  public open fun dbProxyName(`value`: String) {
    unwrap(this).setDbProxyName(`value`)
  }

  /**
   * Specifies whether the proxy includes detailed information about SQL statements in its logs.
   */
  public open fun debugLogging(): Any? = unwrap(this).getDebugLogging()

  /**
   * Specifies whether the proxy includes detailed information about SQL statements in its logs.
   */
  public open fun debugLogging(`value`: Boolean) {
    unwrap(this).setDebugLogging(`value`)
  }

  /**
   * Specifies whether the proxy includes detailed information about SQL statements in its logs.
   */
  public open fun debugLogging(`value`: IResolvable) {
    unwrap(this).setDebugLogging(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The kinds of databases that the proxy can connect to.
   */
  public open fun engineFamily(): String = unwrap(this).getEngineFamily()

  /**
   * The kinds of databases that the proxy can connect to.
   */
  public open fun engineFamily(`value`: String) {
    unwrap(this).setEngineFamily(`value`)
  }

  /**
   * The number of seconds that a connection to the proxy can be inactive before the proxy
   * disconnects it.
   */
  public open fun idleClientTimeout(): Number? = unwrap(this).getIdleClientTimeout()

  /**
   * The number of seconds that a connection to the proxy can be inactive before the proxy
   * disconnects it.
   */
  public open fun idleClientTimeout(`value`: Number) {
    unwrap(this).setIdleClientTimeout(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specifies whether Transport Layer Security (TLS) encryption is required for connections to the
   * proxy.
   */
  public open fun requireTls(): Any? = unwrap(this).getRequireTls()

  /**
   * Specifies whether Transport Layer Security (TLS) encryption is required for connections to the
   * proxy.
   */
  public open fun requireTls(`value`: Boolean) {
    unwrap(this).setRequireTls(`value`)
  }

  /**
   * Specifies whether Transport Layer Security (TLS) encryption is required for connections to the
   * proxy.
   */
  public open fun requireTls(`value`: IResolvable) {
    unwrap(this).setRequireTls(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS
   * Secrets Manager.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS
   * Secrets Manager.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
   */
  public open fun tags(): List<TagFormatProperty> =
      unwrap(this).getTags()?.map(TagFormatProperty::wrap) ?: emptyList()

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
   */
  public open fun tags(`value`: List<TagFormatProperty>) {
    unwrap(this).setTags(`value`.map(TagFormatProperty.Companion::unwrap))
  }

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
   */
  public open fun tags(vararg `value`: TagFormatProperty): Unit = tags(`value`.toList())

  /**
   * One or more VPC security group IDs to associate with the new proxy.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * One or more VPC security group IDs to associate with the new proxy.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * One or more VPC security group IDs to associate with the new proxy.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * One or more VPC subnet IDs to associate with the new proxy.
   */
  public open fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds()

  /**
   * One or more VPC subnet IDs to associate with the new proxy.
   */
  public open fun vpcSubnetIds(`value`: List<String>) {
    unwrap(this).setVpcSubnetIds(`value`)
  }

  /**
   * One or more VPC subnet IDs to associate with the new proxy.
   */
  public open fun vpcSubnetIds(vararg `value`: String): Unit = vpcSubnetIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBProxy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The authorization mechanism that the proxy uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
     * @param auth The authorization mechanism that the proxy uses. 
     */
    public fun auth(auth: IResolvable)

    /**
     * The authorization mechanism that the proxy uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
     * @param auth The authorization mechanism that the proxy uses. 
     */
    public fun auth(auth: List<Any>)

    /**
     * The authorization mechanism that the proxy uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
     * @param auth The authorization mechanism that the proxy uses. 
     */
    public fun auth(vararg auth: Any)

    /**
     * The identifier for the proxy.
     *
     * This name must be unique for all proxies owned by your AWS account in the specified AWS
     * Region . An identifier must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-dbproxyname)
     * @param dbProxyName The identifier for the proxy. 
     */
    public fun dbProxyName(dbProxyName: String)

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
     * @param debugLogging Specifies whether the proxy includes detailed information about SQL
     * statements in its logs. 
     */
    public fun debugLogging(debugLogging: Boolean)

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
     * @param debugLogging Specifies whether the proxy includes detailed information about SQL
     * statements in its logs. 
     */
    public fun debugLogging(debugLogging: IResolvable)

    /**
     * The kinds of databases that the proxy can connect to.
     *
     * This value determines which database network protocol the proxy recognizes when it interprets
     * network traffic to and from the database. For Aurora MySQL, RDS for MariaDB, and RDS for MySQL
     * databases, specify `MYSQL` . For Aurora PostgreSQL and RDS for PostgreSQL databases, specify
     * `POSTGRESQL` . For RDS for Microsoft SQL Server, specify `SQLSERVER` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-enginefamily)
     * @param engineFamily The kinds of databases that the proxy can connect to. 
     */
    public fun engineFamily(engineFamily: String)

    /**
     * The number of seconds that a connection to the proxy can be inactive before the proxy
     * disconnects it.
     *
     * You can set this value higher or lower than the connection timeout limit for the associated
     * database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-idleclienttimeout)
     * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it. 
     */
    public fun idleClientTimeout(idleClientTimeout: Number)

    /**
     * Specifies whether Transport Layer Security (TLS) encryption is required for connections to
     * the proxy.
     *
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls)
     * @param requireTls Specifies whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy. 
     */
    public fun requireTls(requireTls: Boolean)

    /**
     * Specifies whether Transport Layer Security (TLS) encryption is required for connections to
     * the proxy.
     *
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls)
     * @param requireTls Specifies whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy. 
     */
    public fun requireTls(requireTls: IResolvable)

    /**
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS
     * Secrets Manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access
     * secrets in AWS Secrets Manager. 
     */
    public fun roleArn(roleArn: String)

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy. 
     */
    public fun tags(tags: List<TagFormatProperty>)

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy. 
     */
    public fun tags(vararg tags: TagFormatProperty)

    /**
     * One or more VPC security group IDs to associate with the new proxy.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds One or more VPC security group IDs to associate with the new
     * proxy. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * One or more VPC security group IDs to associate with the new proxy.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds One or more VPC security group IDs to associate with the new
     * proxy. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)

    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids)
     * @param vpcSubnetIds One or more VPC subnet IDs to associate with the new proxy. 
     */
    public fun vpcSubnetIds(vpcSubnetIds: List<String>)

    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids)
     * @param vpcSubnetIds One or more VPC subnet IDs to associate with the new proxy. 
     */
    public fun vpcSubnetIds(vararg vpcSubnetIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxy.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxy.Builder.create(scope, id)

    /**
     * The authorization mechanism that the proxy uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
     * @param auth The authorization mechanism that the proxy uses. 
     */
    override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable.Companion::unwrap))
    }

    /**
     * The authorization mechanism that the proxy uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
     * @param auth The authorization mechanism that the proxy uses. 
     */
    override fun auth(auth: List<Any>) {
      cdkBuilder.auth(auth.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The authorization mechanism that the proxy uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth)
     * @param auth The authorization mechanism that the proxy uses. 
     */
    override fun auth(vararg auth: Any): Unit = auth(auth.toList())

    /**
     * The identifier for the proxy.
     *
     * This name must be unique for all proxies owned by your AWS account in the specified AWS
     * Region . An identifier must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-dbproxyname)
     * @param dbProxyName The identifier for the proxy. 
     */
    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

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
     * @param debugLogging Specifies whether the proxy includes detailed information about SQL
     * statements in its logs. 
     */
    override fun debugLogging(debugLogging: Boolean) {
      cdkBuilder.debugLogging(debugLogging)
    }

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
     * @param debugLogging Specifies whether the proxy includes detailed information about SQL
     * statements in its logs. 
     */
    override fun debugLogging(debugLogging: IResolvable) {
      cdkBuilder.debugLogging(debugLogging.let(IResolvable.Companion::unwrap))
    }

    /**
     * The kinds of databases that the proxy can connect to.
     *
     * This value determines which database network protocol the proxy recognizes when it interprets
     * network traffic to and from the database. For Aurora MySQL, RDS for MariaDB, and RDS for MySQL
     * databases, specify `MYSQL` . For Aurora PostgreSQL and RDS for PostgreSQL databases, specify
     * `POSTGRESQL` . For RDS for Microsoft SQL Server, specify `SQLSERVER` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-enginefamily)
     * @param engineFamily The kinds of databases that the proxy can connect to. 
     */
    override fun engineFamily(engineFamily: String) {
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
     * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it. 
     */
    override fun idleClientTimeout(idleClientTimeout: Number) {
      cdkBuilder.idleClientTimeout(idleClientTimeout)
    }

    /**
     * Specifies whether Transport Layer Security (TLS) encryption is required for connections to
     * the proxy.
     *
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls)
     * @param requireTls Specifies whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy. 
     */
    override fun requireTls(requireTls: Boolean) {
      cdkBuilder.requireTls(requireTls)
    }

    /**
     * Specifies whether Transport Layer Security (TLS) encryption is required for connections to
     * the proxy.
     *
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls)
     * @param requireTls Specifies whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy. 
     */
    override fun requireTls(requireTls: IResolvable) {
      cdkBuilder.requireTls(requireTls.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS
     * Secrets Manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access
     * secrets in AWS Secrets Manager. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy. 
     */
    override fun tags(tags: List<TagFormatProperty>) {
      cdkBuilder.tags(tags.map(TagFormatProperty.Companion::unwrap))
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy. 
     */
    override fun tags(vararg tags: TagFormatProperty): Unit = tags(tags.toList())

    /**
     * One or more VPC security group IDs to associate with the new proxy.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds One or more VPC security group IDs to associate with the new
     * proxy. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * One or more VPC security group IDs to associate with the new proxy.
     *
     * If you plan to update the resource, don't specify VPC security groups in a shared VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds One or more VPC security group IDs to associate with the new
     * proxy. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids)
     * @param vpcSubnetIds One or more VPC subnet IDs to associate with the new proxy. 
     */
    override fun vpcSubnetIds(vpcSubnetIds: List<String>) {
      cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids)
     * @param vpcSubnetIds One or more VPC subnet IDs to associate with the new proxy. 
     */
    override fun vpcSubnetIds(vararg vpcSubnetIds: String): Unit =
        vpcSubnetIds(vpcSubnetIds.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBProxy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBProxy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBProxy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy): CfnDBProxy =
        CfnDBProxy(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxy): software.amazon.awscdk.services.rds.CfnDBProxy =
        wrapped.cdkObject as software.amazon.awscdk.services.rds.CfnDBProxy
  }

  /**
   * Specifies the details of authentication used by a proxy to log in as a specific database user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * AuthFormatProperty authFormatProperty = AuthFormatProperty.builder()
   * .authScheme("authScheme")
   * .clientPasswordAuthType("clientPasswordAuthType")
   * .description("description")
   * .iamAuth("iamAuth")
   * .secretArn("secretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html)
   */
  public interface AuthFormatProperty {
    /**
     * The type of authentication that the proxy uses for connections from the proxy to the
     * underlying database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-authscheme)
     */
    public fun authScheme(): String? = unwrap(this).getAuthScheme()

    /**
     * Specifies the details of authentication used by a proxy to log in as a specific database
     * user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-clientpasswordauthtype)
     */
    public fun clientPasswordAuthType(): String? = unwrap(this).getClientPasswordAuthType()

    /**
     * A user-specified description about the authentication used by a proxy to log in as a specific
     * database user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A value that indicates whether to require or disallow AWS Identity and Access Management
     * (IAM) authentication for connections to the proxy.
     *
     * The `ENABLED` value is valid only for proxies with RDS for Microsoft SQL Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-iamauth)
     */
    public fun iamAuth(): String? = unwrap(this).getIamAuth()

    /**
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to
     * the RDS DB instance or Aurora DB cluster.
     *
     * These secrets are stored within Amazon Secrets Manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * A builder for [AuthFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authScheme The type of authentication that the proxy uses for connections from the
       * proxy to the underlying database.
       */
      public fun authScheme(authScheme: String)

      /**
       * @param clientPasswordAuthType Specifies the details of authentication used by a proxy to
       * log in as a specific database user.
       */
      public fun clientPasswordAuthType(clientPasswordAuthType: String)

      /**
       * @param description A user-specified description about the authentication used by a proxy to
       * log in as a specific database user.
       */
      public fun description(description: String)

      /**
       * @param iamAuth A value that indicates whether to require or disallow AWS Identity and
       * Access Management (IAM) authentication for connections to the proxy.
       * The `ENABLED` value is valid only for proxies with RDS for Microsoft SQL Server.
       */
      public fun iamAuth(iamAuth: String)

      /**
       * @param secretArn The Amazon Resource Name (ARN) representing the secret that the proxy uses
       * to authenticate to the RDS DB instance or Aurora DB cluster.
       * These secrets are stored within Amazon Secrets Manager.
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty.builder()

      /**
       * @param authScheme The type of authentication that the proxy uses for connections from the
       * proxy to the underlying database.
       */
      override fun authScheme(authScheme: String) {
        cdkBuilder.authScheme(authScheme)
      }

      /**
       * @param clientPasswordAuthType Specifies the details of authentication used by a proxy to
       * log in as a specific database user.
       */
      override fun clientPasswordAuthType(clientPasswordAuthType: String) {
        cdkBuilder.clientPasswordAuthType(clientPasswordAuthType)
      }

      /**
       * @param description A user-specified description about the authentication used by a proxy to
       * log in as a specific database user.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param iamAuth A value that indicates whether to require or disallow AWS Identity and
       * Access Management (IAM) authentication for connections to the proxy.
       * The `ENABLED` value is valid only for proxies with RDS for Microsoft SQL Server.
       */
      override fun iamAuth(iamAuth: String) {
        cdkBuilder.iamAuth(iamAuth)
      }

      /**
       * @param secretArn The Amazon Resource Name (ARN) representing the secret that the proxy uses
       * to authenticate to the RDS DB instance or Aurora DB cluster.
       * These secrets are stored within Amazon Secrets Manager.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty,
    ) : CdkObject(cdkObject),
        AuthFormatProperty {
      /**
       * The type of authentication that the proxy uses for connections from the proxy to the
       * underlying database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-authscheme)
       */
      override fun authScheme(): String? = unwrap(this).getAuthScheme()

      /**
       * Specifies the details of authentication used by a proxy to log in as a specific database
       * user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-clientpasswordauthtype)
       */
      override fun clientPasswordAuthType(): String? = unwrap(this).getClientPasswordAuthType()

      /**
       * A user-specified description about the authentication used by a proxy to log in as a
       * specific database user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A value that indicates whether to require or disallow AWS Identity and Access Management
       * (IAM) authentication for connections to the proxy.
       *
       * The `ENABLED` value is valid only for proxies with RDS for Microsoft SQL Server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-iamauth)
       */
      override fun iamAuth(): String? = unwrap(this).getIamAuth()

      /**
       * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate
       * to the RDS DB instance or Aurora DB cluster.
       *
       * These secrets are stored within Amazon Secrets Manager.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty):
          AuthFormatProperty = CdkObjectWrappers.wrap(cdkObject) as? AuthFormatProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthFormatProperty):
          software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty
    }
  }

  /**
   * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
   *
   * For more information, see [Tagging Amazon RDS
   * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
   * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
   * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in the
   * *Amazon Aurora User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * TagFormatProperty tagFormatProperty = TagFormatProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-tagformat.html)
   */
  public interface TagFormatProperty {
    /**
     * A key is the required name of the tag.
     *
     * The string value can be from 1 to 128 Unicode characters in length and can't be prefixed with
     * `aws:` or `rds:` . The string can only contain only the set of Unicode letters, digits,
     * white-space, '*', '.', ':', '/', '=', '+', '-', '&#64;' (Java regex:
     * "^([\p{L}\p{Z}\p{N}*.:/=+-&#64;]*)$").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-tagformat.html#cfn-rds-dbproxy-tagformat-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * A value is the optional value of the tag.
     *
     * The string value can be from 1 to 256 Unicode characters in length and can't be prefixed with
     * `aws:` or `rds:` . The string can only contain only the set of Unicode letters, digits,
     * white-space, '*', '.', ':', '/', '=', '+', '-', '&#64;' (Java regex:
     * "^([\p{L}\p{Z}\p{N}*.:/=+-&#64;]*)$").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-tagformat.html#cfn-rds-dbproxy-tagformat-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [TagFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key A key is the required name of the tag.
       * The string value can be from 1 to 128 Unicode characters in length and can't be prefixed
       * with `aws:` or `rds:` . The string can only contain only the set of Unicode letters, digits,
       * white-space, '*', '.', ':', '/', '=', '+', '-', '&#64;' (Java regex:
       * "^([\p{L}\p{Z}\p{N}*.:/=+-&#64;]*)$").
       */
      public fun key(key: String)

      /**
       * @param value A value is the optional value of the tag.
       * The string value can be from 1 to 256 Unicode characters in length and can't be prefixed
       * with `aws:` or `rds:` . The string can only contain only the set of Unicode letters, digits,
       * white-space, '*', '.', ':', '/', '=', '+', '-', '&#64;' (Java regex:
       * "^([\p{L}\p{Z}\p{N}*.:/=+-&#64;]*)$").
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty.builder()

      /**
       * @param key A key is the required name of the tag.
       * The string value can be from 1 to 128 Unicode characters in length and can't be prefixed
       * with `aws:` or `rds:` . The string can only contain only the set of Unicode letters, digits,
       * white-space, '*', '.', ':', '/', '=', '+', '-', '&#64;' (Java regex:
       * "^([\p{L}\p{Z}\p{N}*.:/=+-&#64;]*)$").
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value A value is the optional value of the tag.
       * The string value can be from 1 to 256 Unicode characters in length and can't be prefixed
       * with `aws:` or `rds:` . The string can only contain only the set of Unicode letters, digits,
       * white-space, '*', '.', ':', '/', '=', '+', '-', '&#64;' (Java regex:
       * "^([\p{L}\p{Z}\p{N}*.:/=+-&#64;]*)$").
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty,
    ) : CdkObject(cdkObject),
        TagFormatProperty {
      /**
       * A key is the required name of the tag.
       *
       * The string value can be from 1 to 128 Unicode characters in length and can't be prefixed
       * with `aws:` or `rds:` . The string can only contain only the set of Unicode letters, digits,
       * white-space, '*', '.', ':', '/', '=', '+', '-', '&#64;' (Java regex:
       * "^([\p{L}\p{Z}\p{N}*.:/=+-&#64;]*)$").
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-tagformat.html#cfn-rds-dbproxy-tagformat-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * A value is the optional value of the tag.
       *
       * The string value can be from 1 to 256 Unicode characters in length and can't be prefixed
       * with `aws:` or `rds:` . The string can only contain only the set of Unicode letters, digits,
       * white-space, '*', '.', ':', '/', '=', '+', '-', '&#64;' (Java regex:
       * "^([\p{L}\p{Z}\p{N}*.:/=+-&#64;]*)$").
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-tagformat.html#cfn-rds-dbproxy-tagformat-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty):
          TagFormatProperty = CdkObjectWrappers.wrap(cdkObject) as? TagFormatProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFormatProperty):
          software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty
    }
  }
}
