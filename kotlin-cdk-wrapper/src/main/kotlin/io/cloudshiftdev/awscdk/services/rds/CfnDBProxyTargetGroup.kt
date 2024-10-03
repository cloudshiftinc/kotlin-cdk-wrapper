@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::RDS::DBProxyTargetGroup` resource represents a set of RDS DB instances, Aurora DB
 * clusters, or both that a proxy can connect to.
 *
 * Currently, each target group is associated with exactly one RDS DB instance or Aurora DB cluster.
 *
 * This data type is used as a response element in the `DescribeDBProxyTargetGroups` action.
 *
 * For information about RDS Proxy for Amazon RDS, see [Managing Connections with Amazon RDS
 * Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html) in the *Amazon RDS
 * User Guide* .
 *
 * For information about RDS Proxy for Amazon Aurora, see [Managing Connections with Amazon RDS
 * Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html) in the *Amazon
 * Aurora User Guide* .
 *
 * For a sample template that creates a DB proxy and registers a DB instance, see
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#aws-resource-rds-dbproxy--examples)
 * in AWS::RDS::DBProxy.
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
 * CfnDBProxyTargetGroup cfnDBProxyTargetGroup = CfnDBProxyTargetGroup.Builder.create(this,
 * "MyCfnDBProxyTargetGroup")
 * .dbProxyName("dbProxyName")
 * .targetGroupName("targetGroupName")
 * // the properties below are optional
 * .connectionPoolConfigurationInfo(ConnectionPoolConfigurationInfoFormatProperty.builder()
 * .connectionBorrowTimeout(123)
 * .initQuery("initQuery")
 * .maxConnectionsPercent(123)
 * .maxIdleConnectionsPercent(123)
 * .sessionPinningFilters(List.of("sessionPinningFilters"))
 * .build())
 * .dbClusterIdentifiers(List.of("dbClusterIdentifiers"))
 * .dbInstanceIdentifiers(List.of("dbInstanceIdentifiers"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html)
 */
public open class CfnDBProxyTargetGroup(
  cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBProxyTargetGroupProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDBProxyTargetGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBProxyTargetGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDBProxyTargetGroupProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) representing the target group.
   */
  public open fun attrTargetGroupArn(): String = unwrap(this).getAttrTargetGroupArn()

  /**
   * Displays the settings that control the size and behavior of the connection pool associated with
   * a `DBProxyTarget` .
   */
  public open fun connectionPoolConfigurationInfo(): Any? =
      unwrap(this).getConnectionPoolConfigurationInfo()

  /**
   * Displays the settings that control the size and behavior of the connection pool associated with
   * a `DBProxyTarget` .
   */
  public open fun connectionPoolConfigurationInfo(`value`: IResolvable) {
    unwrap(this).setConnectionPoolConfigurationInfo(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Displays the settings that control the size and behavior of the connection pool associated with
   * a `DBProxyTarget` .
   */
  public open
      fun connectionPoolConfigurationInfo(`value`: ConnectionPoolConfigurationInfoFormatProperty) {
    unwrap(this).setConnectionPoolConfigurationInfo(`value`.let(ConnectionPoolConfigurationInfoFormatProperty.Companion::unwrap))
  }

  /**
   * Displays the settings that control the size and behavior of the connection pool associated with
   * a `DBProxyTarget` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4063fded1e953b2425194863b7aa1da8f32b08cbb6781e2f8a45201e7e82b26d")
  public open
      fun connectionPoolConfigurationInfo(`value`: ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit):
      Unit = connectionPoolConfigurationInfo(ConnectionPoolConfigurationInfoFormatProperty(`value`))

  /**
   * One or more DB cluster identifiers.
   */
  public open fun dbClusterIdentifiers(): List<String> = unwrap(this).getDbClusterIdentifiers() ?:
      emptyList()

  /**
   * One or more DB cluster identifiers.
   */
  public open fun dbClusterIdentifiers(`value`: List<String>) {
    unwrap(this).setDbClusterIdentifiers(`value`)
  }

  /**
   * One or more DB cluster identifiers.
   */
  public open fun dbClusterIdentifiers(vararg `value`: String): Unit =
      dbClusterIdentifiers(`value`.toList())

  /**
   * One or more DB instance identifiers.
   */
  public open fun dbInstanceIdentifiers(): List<String> = unwrap(this).getDbInstanceIdentifiers() ?:
      emptyList()

  /**
   * One or more DB instance identifiers.
   */
  public open fun dbInstanceIdentifiers(`value`: List<String>) {
    unwrap(this).setDbInstanceIdentifiers(`value`)
  }

  /**
   * One or more DB instance identifiers.
   */
  public open fun dbInstanceIdentifiers(vararg `value`: String): Unit =
      dbInstanceIdentifiers(`value`.toList())

  /**
   * The identifier of the `DBProxy` that is associated with the `DBProxyTargetGroup` .
   */
  public open fun dbProxyName(): String = unwrap(this).getDbProxyName()

  /**
   * The identifier of the `DBProxy` that is associated with the `DBProxyTargetGroup` .
   */
  public open fun dbProxyName(`value`: String) {
    unwrap(this).setDbProxyName(`value`)
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
   * The identifier for the target group.
   */
  public open fun targetGroupName(): String = unwrap(this).getTargetGroupName()

  /**
   * The identifier for the target group.
   */
  public open fun targetGroupName(`value`: String) {
    unwrap(this).setTargetGroupName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBProxyTargetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Displays the settings that control the size and behavior of the connection pool associated
     * with a `DBProxyTarget` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfo)
     * @param connectionPoolConfigurationInfo Displays the settings that control the size and
     * behavior of the connection pool associated with a `DBProxyTarget` . 
     */
    public fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable)

    /**
     * Displays the settings that control the size and behavior of the connection pool associated
     * with a `DBProxyTarget` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfo)
     * @param connectionPoolConfigurationInfo Displays the settings that control the size and
     * behavior of the connection pool associated with a `DBProxyTarget` . 
     */
    public
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: ConnectionPoolConfigurationInfoFormatProperty)

    /**
     * Displays the settings that control the size and behavior of the connection pool associated
     * with a `DBProxyTarget` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfo)
     * @param connectionPoolConfigurationInfo Displays the settings that control the size and
     * behavior of the connection pool associated with a `DBProxyTarget` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b82b793ddcdd39d423ca86d9874701672489a79685d22d7c87246e2dcc494f2")
    public
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit)

    /**
     * One or more DB cluster identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers)
     * @param dbClusterIdentifiers One or more DB cluster identifiers. 
     */
    public fun dbClusterIdentifiers(dbClusterIdentifiers: List<String>)

    /**
     * One or more DB cluster identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers)
     * @param dbClusterIdentifiers One or more DB cluster identifiers. 
     */
    public fun dbClusterIdentifiers(vararg dbClusterIdentifiers: String)

    /**
     * One or more DB instance identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers)
     * @param dbInstanceIdentifiers One or more DB instance identifiers. 
     */
    public fun dbInstanceIdentifiers(dbInstanceIdentifiers: List<String>)

    /**
     * One or more DB instance identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers)
     * @param dbInstanceIdentifiers One or more DB instance identifiers. 
     */
    public fun dbInstanceIdentifiers(vararg dbInstanceIdentifiers: String)

    /**
     * The identifier of the `DBProxy` that is associated with the `DBProxyTargetGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbproxyname)
     * @param dbProxyName The identifier of the `DBProxy` that is associated with the
     * `DBProxyTargetGroup` . 
     */
    public fun dbProxyName(dbProxyName: String)

    /**
     * The identifier for the target group.
     *
     *
     * Currently, this property must be set to `default` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-targetgroupname)
     * @param targetGroupName The identifier for the target group. 
     */
    public fun targetGroupName(targetGroupName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.Builder.create(scope, id)

    /**
     * Displays the settings that control the size and behavior of the connection pool associated
     * with a `DBProxyTarget` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfo)
     * @param connectionPoolConfigurationInfo Displays the settings that control the size and
     * behavior of the connection pool associated with a `DBProxyTarget` . 
     */
    override fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable) {
      cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * Displays the settings that control the size and behavior of the connection pool associated
     * with a `DBProxyTarget` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfo)
     * @param connectionPoolConfigurationInfo Displays the settings that control the size and
     * behavior of the connection pool associated with a `DBProxyTarget` . 
     */
    override
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: ConnectionPoolConfigurationInfoFormatProperty) {
      cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.let(ConnectionPoolConfigurationInfoFormatProperty.Companion::unwrap))
    }

    /**
     * Displays the settings that control the size and behavior of the connection pool associated
     * with a `DBProxyTarget` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfo)
     * @param connectionPoolConfigurationInfo Displays the settings that control the size and
     * behavior of the connection pool associated with a `DBProxyTarget` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b82b793ddcdd39d423ca86d9874701672489a79685d22d7c87246e2dcc494f2")
    override
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit):
        Unit =
        connectionPoolConfigurationInfo(ConnectionPoolConfigurationInfoFormatProperty(connectionPoolConfigurationInfo))

    /**
     * One or more DB cluster identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers)
     * @param dbClusterIdentifiers One or more DB cluster identifiers. 
     */
    override fun dbClusterIdentifiers(dbClusterIdentifiers: List<String>) {
      cdkBuilder.dbClusterIdentifiers(dbClusterIdentifiers)
    }

    /**
     * One or more DB cluster identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers)
     * @param dbClusterIdentifiers One or more DB cluster identifiers. 
     */
    override fun dbClusterIdentifiers(vararg dbClusterIdentifiers: String): Unit =
        dbClusterIdentifiers(dbClusterIdentifiers.toList())

    /**
     * One or more DB instance identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers)
     * @param dbInstanceIdentifiers One or more DB instance identifiers. 
     */
    override fun dbInstanceIdentifiers(dbInstanceIdentifiers: List<String>) {
      cdkBuilder.dbInstanceIdentifiers(dbInstanceIdentifiers)
    }

    /**
     * One or more DB instance identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers)
     * @param dbInstanceIdentifiers One or more DB instance identifiers. 
     */
    override fun dbInstanceIdentifiers(vararg dbInstanceIdentifiers: String): Unit =
        dbInstanceIdentifiers(dbInstanceIdentifiers.toList())

    /**
     * The identifier of the `DBProxy` that is associated with the `DBProxyTargetGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbproxyname)
     * @param dbProxyName The identifier of the `DBProxy` that is associated with the
     * `DBProxyTargetGroup` . 
     */
    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * The identifier for the target group.
     *
     *
     * Currently, this property must be set to `default` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-targetgroupname)
     * @param targetGroupName The identifier for the target group. 
     */
    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBProxyTargetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBProxyTargetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup):
        CfnDBProxyTargetGroup = CfnDBProxyTargetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxyTargetGroup):
        software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup
  }

  /**
   * Specifies the settings that control the size and behavior of the connection pool associated
   * with a `DBProxyTargetGroup` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * ConnectionPoolConfigurationInfoFormatProperty connectionPoolConfigurationInfoFormatProperty =
   * ConnectionPoolConfigurationInfoFormatProperty.builder()
   * .connectionBorrowTimeout(123)
   * .initQuery("initQuery")
   * .maxConnectionsPercent(123)
   * .maxIdleConnectionsPercent(123)
   * .sessionPinningFilters(List.of("sessionPinningFilters"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html)
   */
  public interface ConnectionPoolConfigurationInfoFormatProperty {
    /**
     * The number of seconds for a proxy to wait for a connection to become available in the
     * connection pool.
     *
     * This setting only applies when the proxy has opened its maximum number of connections and all
     * connections are busy with client sessions.
     *
     * Default: `120`
     *
     * Constraints:
     *
     * * Must be between 0 and 3600.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-connectionborrowtimeout)
     */
    public fun connectionBorrowTimeout(): Number? = unwrap(this).getConnectionBorrowTimeout()

    /**
     * One or more SQL statements for the proxy to run when opening each new database connection.
     *
     * Typically used with `SET` statements to make sure that each connection has identical settings
     * such as time zone and character set. For multiple statements, use semicolons as the separator.
     * You can also include multiple variables in a single `SET` statement, such as `SET x=1, y=2` .
     *
     * Default: no initialization query
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-initquery)
     */
    public fun initQuery(): String? = unwrap(this).getInitQuery()

    /**
     * The maximum size of the connection pool for each target in a target group.
     *
     * The value is expressed as a percentage of the `max_connections` setting for the RDS DB
     * instance or Aurora DB cluster used by the target group.
     *
     * If you specify `MaxIdleConnectionsPercent` , then you must also include a value for this
     * parameter.
     *
     * Default: `10` for RDS for Microsoft SQL Server, and `100` for all other engines
     *
     * Constraints:
     *
     * * Must be between 1 and 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxconnectionspercent)
     */
    public fun maxConnectionsPercent(): Number? = unwrap(this).getMaxConnectionsPercent()

    /**
     * A value that controls how actively the proxy closes idle database connections in the
     * connection pool.
     *
     * The value is expressed as a percentage of the `max_connections` setting for the RDS DB
     * instance or Aurora DB cluster used by the target group. With a high value, the proxy leaves a
     * high percentage of idle database connections open. A low value causes the proxy to close more
     * idle connections and return them to the database.
     *
     * If you specify this parameter, then you must also include a value for `MaxConnectionsPercent`
     * .
     *
     * Default: The default value is half of the value of `MaxConnectionsPercent` . For example, if
     * `MaxConnectionsPercent` is 80, then the default value of `MaxIdleConnectionsPercent` is 40. If
     * the value of `MaxConnectionsPercent` isn't specified, then for SQL Server,
     * `MaxIdleConnectionsPercent` is `5` , and for all other engines, the default is `50` .
     *
     * Constraints:
     *
     * * Must be between 0 and the value of `MaxConnectionsPercent` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxidleconnectionspercent)
     */
    public fun maxIdleConnectionsPercent(): Number? = unwrap(this).getMaxIdleConnectionsPercent()

    /**
     * Each item in the list represents a class of SQL operations that normally cause all later
     * statements in a session using a proxy to be pinned to the same underlying database connection.
     *
     * Including an item in the list exempts that class of SQL operations from the pinning behavior.
     *
     * Default: no session pinning filters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-sessionpinningfilters)
     */
    public fun sessionPinningFilters(): List<String> = unwrap(this).getSessionPinningFilters() ?:
        emptyList()

    /**
     * A builder for [ConnectionPoolConfigurationInfoFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionBorrowTimeout The number of seconds for a proxy to wait for a connection
       * to become available in the connection pool.
       * This setting only applies when the proxy has opened its maximum number of connections and
       * all connections are busy with client sessions.
       *
       * Default: `120`
       *
       * Constraints:
       *
       * * Must be between 0 and 3600.
       */
      public fun connectionBorrowTimeout(connectionBorrowTimeout: Number)

      /**
       * @param initQuery One or more SQL statements for the proxy to run when opening each new
       * database connection.
       * Typically used with `SET` statements to make sure that each connection has identical
       * settings such as time zone and character set. For multiple statements, use semicolons as the
       * separator. You can also include multiple variables in a single `SET` statement, such as `SET
       * x=1, y=2` .
       *
       * Default: no initialization query
       */
      public fun initQuery(initQuery: String)

      /**
       * @param maxConnectionsPercent The maximum size of the connection pool for each target in a
       * target group.
       * The value is expressed as a percentage of the `max_connections` setting for the RDS DB
       * instance or Aurora DB cluster used by the target group.
       *
       * If you specify `MaxIdleConnectionsPercent` , then you must also include a value for this
       * parameter.
       *
       * Default: `10` for RDS for Microsoft SQL Server, and `100` for all other engines
       *
       * Constraints:
       *
       * * Must be between 1 and 100.
       */
      public fun maxConnectionsPercent(maxConnectionsPercent: Number)

      /**
       * @param maxIdleConnectionsPercent A value that controls how actively the proxy closes idle
       * database connections in the connection pool.
       * The value is expressed as a percentage of the `max_connections` setting for the RDS DB
       * instance or Aurora DB cluster used by the target group. With a high value, the proxy leaves a
       * high percentage of idle database connections open. A low value causes the proxy to close more
       * idle connections and return them to the database.
       *
       * If you specify this parameter, then you must also include a value for
       * `MaxConnectionsPercent` .
       *
       * Default: The default value is half of the value of `MaxConnectionsPercent` . For example,
       * if `MaxConnectionsPercent` is 80, then the default value of `MaxIdleConnectionsPercent` is 40.
       * If the value of `MaxConnectionsPercent` isn't specified, then for SQL Server,
       * `MaxIdleConnectionsPercent` is `5` , and for all other engines, the default is `50` .
       *
       * Constraints:
       *
       * * Must be between 0 and the value of `MaxConnectionsPercent` .
       */
      public fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number)

      /**
       * @param sessionPinningFilters Each item in the list represents a class of SQL operations
       * that normally cause all later statements in a session using a proxy to be pinned to the same
       * underlying database connection.
       * Including an item in the list exempts that class of SQL operations from the pinning
       * behavior.
       *
       * Default: no session pinning filters
       */
      public fun sessionPinningFilters(sessionPinningFilters: List<String>)

      /**
       * @param sessionPinningFilters Each item in the list represents a class of SQL operations
       * that normally cause all later statements in a session using a proxy to be pinned to the same
       * underlying database connection.
       * Including an item in the list exempts that class of SQL operations from the pinning
       * behavior.
       *
       * Default: no session pinning filters
       */
      public fun sessionPinningFilters(vararg sessionPinningFilters: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.Builder
          =
          software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.builder()

      /**
       * @param connectionBorrowTimeout The number of seconds for a proxy to wait for a connection
       * to become available in the connection pool.
       * This setting only applies when the proxy has opened its maximum number of connections and
       * all connections are busy with client sessions.
       *
       * Default: `120`
       *
       * Constraints:
       *
       * * Must be between 0 and 3600.
       */
      override fun connectionBorrowTimeout(connectionBorrowTimeout: Number) {
        cdkBuilder.connectionBorrowTimeout(connectionBorrowTimeout)
      }

      /**
       * @param initQuery One or more SQL statements for the proxy to run when opening each new
       * database connection.
       * Typically used with `SET` statements to make sure that each connection has identical
       * settings such as time zone and character set. For multiple statements, use semicolons as the
       * separator. You can also include multiple variables in a single `SET` statement, such as `SET
       * x=1, y=2` .
       *
       * Default: no initialization query
       */
      override fun initQuery(initQuery: String) {
        cdkBuilder.initQuery(initQuery)
      }

      /**
       * @param maxConnectionsPercent The maximum size of the connection pool for each target in a
       * target group.
       * The value is expressed as a percentage of the `max_connections` setting for the RDS DB
       * instance or Aurora DB cluster used by the target group.
       *
       * If you specify `MaxIdleConnectionsPercent` , then you must also include a value for this
       * parameter.
       *
       * Default: `10` for RDS for Microsoft SQL Server, and `100` for all other engines
       *
       * Constraints:
       *
       * * Must be between 1 and 100.
       */
      override fun maxConnectionsPercent(maxConnectionsPercent: Number) {
        cdkBuilder.maxConnectionsPercent(maxConnectionsPercent)
      }

      /**
       * @param maxIdleConnectionsPercent A value that controls how actively the proxy closes idle
       * database connections in the connection pool.
       * The value is expressed as a percentage of the `max_connections` setting for the RDS DB
       * instance or Aurora DB cluster used by the target group. With a high value, the proxy leaves a
       * high percentage of idle database connections open. A low value causes the proxy to close more
       * idle connections and return them to the database.
       *
       * If you specify this parameter, then you must also include a value for
       * `MaxConnectionsPercent` .
       *
       * Default: The default value is half of the value of `MaxConnectionsPercent` . For example,
       * if `MaxConnectionsPercent` is 80, then the default value of `MaxIdleConnectionsPercent` is 40.
       * If the value of `MaxConnectionsPercent` isn't specified, then for SQL Server,
       * `MaxIdleConnectionsPercent` is `5` , and for all other engines, the default is `50` .
       *
       * Constraints:
       *
       * * Must be between 0 and the value of `MaxConnectionsPercent` .
       */
      override fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
        cdkBuilder.maxIdleConnectionsPercent(maxIdleConnectionsPercent)
      }

      /**
       * @param sessionPinningFilters Each item in the list represents a class of SQL operations
       * that normally cause all later statements in a session using a proxy to be pinned to the same
       * underlying database connection.
       * Including an item in the list exempts that class of SQL operations from the pinning
       * behavior.
       *
       * Default: no session pinning filters
       */
      override fun sessionPinningFilters(sessionPinningFilters: List<String>) {
        cdkBuilder.sessionPinningFilters(sessionPinningFilters)
      }

      /**
       * @param sessionPinningFilters Each item in the list represents a class of SQL operations
       * that normally cause all later statements in a session using a proxy to be pinned to the same
       * underlying database connection.
       * Including an item in the list exempts that class of SQL operations from the pinning
       * behavior.
       *
       * Default: no session pinning filters
       */
      override fun sessionPinningFilters(vararg sessionPinningFilters: String): Unit =
          sessionPinningFilters(sessionPinningFilters.toList())

      public fun build():
          software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty,
    ) : CdkObject(cdkObject),
        ConnectionPoolConfigurationInfoFormatProperty {
      /**
       * The number of seconds for a proxy to wait for a connection to become available in the
       * connection pool.
       *
       * This setting only applies when the proxy has opened its maximum number of connections and
       * all connections are busy with client sessions.
       *
       * Default: `120`
       *
       * Constraints:
       *
       * * Must be between 0 and 3600.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-connectionborrowtimeout)
       */
      override fun connectionBorrowTimeout(): Number? = unwrap(this).getConnectionBorrowTimeout()

      /**
       * One or more SQL statements for the proxy to run when opening each new database connection.
       *
       * Typically used with `SET` statements to make sure that each connection has identical
       * settings such as time zone and character set. For multiple statements, use semicolons as the
       * separator. You can also include multiple variables in a single `SET` statement, such as `SET
       * x=1, y=2` .
       *
       * Default: no initialization query
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-initquery)
       */
      override fun initQuery(): String? = unwrap(this).getInitQuery()

      /**
       * The maximum size of the connection pool for each target in a target group.
       *
       * The value is expressed as a percentage of the `max_connections` setting for the RDS DB
       * instance or Aurora DB cluster used by the target group.
       *
       * If you specify `MaxIdleConnectionsPercent` , then you must also include a value for this
       * parameter.
       *
       * Default: `10` for RDS for Microsoft SQL Server, and `100` for all other engines
       *
       * Constraints:
       *
       * * Must be between 1 and 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxconnectionspercent)
       */
      override fun maxConnectionsPercent(): Number? = unwrap(this).getMaxConnectionsPercent()

      /**
       * A value that controls how actively the proxy closes idle database connections in the
       * connection pool.
       *
       * The value is expressed as a percentage of the `max_connections` setting for the RDS DB
       * instance or Aurora DB cluster used by the target group. With a high value, the proxy leaves a
       * high percentage of idle database connections open. A low value causes the proxy to close more
       * idle connections and return them to the database.
       *
       * If you specify this parameter, then you must also include a value for
       * `MaxConnectionsPercent` .
       *
       * Default: The default value is half of the value of `MaxConnectionsPercent` . For example,
       * if `MaxConnectionsPercent` is 80, then the default value of `MaxIdleConnectionsPercent` is 40.
       * If the value of `MaxConnectionsPercent` isn't specified, then for SQL Server,
       * `MaxIdleConnectionsPercent` is `5` , and for all other engines, the default is `50` .
       *
       * Constraints:
       *
       * * Must be between 0 and the value of `MaxConnectionsPercent` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-maxidleconnectionspercent)
       */
      override fun maxIdleConnectionsPercent(): Number? =
          unwrap(this).getMaxIdleConnectionsPercent()

      /**
       * Each item in the list represents a class of SQL operations that normally cause all later
       * statements in a session using a proxy to be pinned to the same underlying database connection.
       *
       * Including an item in the list exempts that class of SQL operations from the pinning
       * behavior.
       *
       * Default: no session pinning filters
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat-sessionpinningfilters)
       */
      override fun sessionPinningFilters(): List<String> = unwrap(this).getSessionPinningFilters()
          ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionPoolConfigurationInfoFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty):
          ConnectionPoolConfigurationInfoFormatProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectionPoolConfigurationInfoFormatProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionPoolConfigurationInfoFormatProperty):
          software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty
    }
  }
}
