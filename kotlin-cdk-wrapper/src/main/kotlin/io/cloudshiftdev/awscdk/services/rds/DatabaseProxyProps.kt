@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Construction properties for a DatabaseProxy.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
 * .version(AuroraMysqlEngineVersion.VER_3_03_0)
 * .build()))
 * .writer(ClusterInstance.provisioned("writer"))
 * .vpc(vpc)
 * .build();
 * DatabaseProxy proxy = DatabaseProxy.Builder.create(this, "Proxy")
 * .proxyTarget(ProxyTarget.fromCluster(cluster))
 * .secrets(List.of(cluster.getSecret()))
 * .vpc(vpc)
 * .build();
 * Role role = Role.Builder.create(this, "DBProxyRole").assumedBy(new
 * AccountPrincipal(this.account)).build();
 * proxy.grantConnect(role, "admin");
 * ```
 */
public interface DatabaseProxyProps : DatabaseProxyOptions {
  /**
   * DB proxy target: Instance or Cluster.
   */
  public fun proxyTarget(): ProxyTarget

  /**
   * A builder for [DatabaseProxyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param borrowTimeout The duration for a proxy to wait for a connection to become available in
     * the connection pool.
     * Only applies when the proxy has opened its maximum number of connections and all connections
     * are busy with client
     * sessions.
     *
     * Value must be between 1 second and 1 hour, or `Duration.seconds(0)` to represent unlimited.
     */
    public fun borrowTimeout(borrowTimeout: Duration)

    /**
     * @param clientPasswordAuthType Specifies the details of authentication used by a proxy to log
     * in as a specific database user.
     */
    public fun clientPasswordAuthType(clientPasswordAuthType: ClientPasswordAuthType)

    /**
     * @param dbProxyName The identifier for the proxy.
     * This name must be unique for all proxies owned by your AWS account in the specified AWS
     * Region.
     * An identifier must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens;
     * it can't end with a hyphen or contain two consecutive hyphens.
     */
    public fun dbProxyName(dbProxyName: String)

    /**
     * @param debugLogging Whether the proxy includes detailed information about SQL statements in
     * its logs.
     * This information helps you to debug issues involving SQL behavior or the performance and
     * scalability of the proxy connections.
     * The debug information includes the text of SQL statements that you submit through the proxy.
     * Thus, only enable this setting when needed for debugging, and only when you have security
     * measures in place to safeguard any sensitive
     * information that appears in the logs.
     */
    public fun debugLogging(debugLogging: Boolean)

    /**
     * @param iamAuth Whether to require or disallow AWS Identity and Access Management (IAM)
     * authentication for connections to the proxy.
     */
    public fun iamAuth(iamAuth: Boolean)

    /**
     * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it.
     * You can set this value higher or lower than the connection timeout limit for the associated
     * database.
     */
    public fun idleClientTimeout(idleClientTimeout: Duration)

    /**
     * @param initQuery One or more SQL statements for the proxy to run when opening each new
     * database connection.
     * Typically used with SET statements to make sure that each connection has identical settings
     * such as time zone
     * and character set.
     * For multiple statements, use semicolons as the separator.
     * You can also include multiple variables in a single SET statement, such as SET x=1, y=2.
     *
     * not currently supported for PostgreSQL.
     */
    public fun initQuery(initQuery: String)

    /**
     * @param maxConnectionsPercent The maximum size of the connection pool for each target in a
     * target group.
     * For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS
     * DB instance or Aurora DB
     * cluster used by the target group.
     *
     * 1-100
     */
    public fun maxConnectionsPercent(maxConnectionsPercent: Number)

    /**
     * @param maxIdleConnectionsPercent Controls how actively the proxy closes idle database
     * connections in the connection pool.
     * A high value enables the proxy to leave a high percentage of idle connections open.
     * A low value causes the proxy to close idle client connections and return the underlying
     * database connections
     * to the connection pool.
     * For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS
     * DB instance
     * or Aurora DB cluster used by the target group.
     *
     * between 0 and MaxConnectionsPercent
     */
    public fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number)

    /**
     * @param proxyTarget DB proxy target: Instance or Cluster. 
     */
    public fun proxyTarget(proxyTarget: ProxyTarget)

    /**
     * @param requireTls A Boolean parameter that specifies whether Transport Layer Security (TLS)
     * encryption is required for connections to the proxy.
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     */
    public fun requireTls(requireTls: Boolean)

    /**
     * @param role IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     */
    public fun role(role: IRole)

    /**
     * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or
     * Aurora DB cluster. 
     * These secrets are stored within Amazon Secrets Manager.
     * One or more secrets are required.
     */
    public fun secrets(secrets: List<ISecret>)

    /**
     * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or
     * Aurora DB cluster. 
     * These secrets are stored within Amazon Secrets Manager.
     * One or more secrets are required.
     */
    public fun secrets(vararg secrets: ISecret)

    /**
     * @param securityGroups One or more VPC security groups to associate with the new proxy.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups One or more VPC security groups to associate with the new proxy.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     * normally cause all later statements in a session using a proxy to be pinned to the same
     * underlying database connection.
     * Including an item in the list exempts that class of SQL operations from the pinning behavior.
     */
    public fun sessionPinningFilters(sessionPinningFilters: List<SessionPinningFilter>)

    /**
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     * normally cause all later statements in a session using a proxy to be pinned to the same
     * underlying database connection.
     * Including an item in the list exempts that class of SQL operations from the pinning behavior.
     */
    public fun sessionPinningFilters(vararg sessionPinningFilters: SessionPinningFilter)

    /**
     * @param vpc The VPC to associate with the new proxy. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets The subnets used by the proxy.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets The subnets used by the proxy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5e98a9532140f885d9de7e0d32d1fb87b06cbf35f459dd09c393154c3281769")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseProxyProps.Builder =
        software.amazon.awscdk.services.rds.DatabaseProxyProps.builder()

    /**
     * @param borrowTimeout The duration for a proxy to wait for a connection to become available in
     * the connection pool.
     * Only applies when the proxy has opened its maximum number of connections and all connections
     * are busy with client
     * sessions.
     *
     * Value must be between 1 second and 1 hour, or `Duration.seconds(0)` to represent unlimited.
     */
    override fun borrowTimeout(borrowTimeout: Duration) {
      cdkBuilder.borrowTimeout(borrowTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param clientPasswordAuthType Specifies the details of authentication used by a proxy to log
     * in as a specific database user.
     */
    override fun clientPasswordAuthType(clientPasswordAuthType: ClientPasswordAuthType) {
      cdkBuilder.clientPasswordAuthType(clientPasswordAuthType.let(ClientPasswordAuthType.Companion::unwrap))
    }

    /**
     * @param dbProxyName The identifier for the proxy.
     * This name must be unique for all proxies owned by your AWS account in the specified AWS
     * Region.
     * An identifier must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens;
     * it can't end with a hyphen or contain two consecutive hyphens.
     */
    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * @param debugLogging Whether the proxy includes detailed information about SQL statements in
     * its logs.
     * This information helps you to debug issues involving SQL behavior or the performance and
     * scalability of the proxy connections.
     * The debug information includes the text of SQL statements that you submit through the proxy.
     * Thus, only enable this setting when needed for debugging, and only when you have security
     * measures in place to safeguard any sensitive
     * information that appears in the logs.
     */
    override fun debugLogging(debugLogging: Boolean) {
      cdkBuilder.debugLogging(debugLogging)
    }

    /**
     * @param iamAuth Whether to require or disallow AWS Identity and Access Management (IAM)
     * authentication for connections to the proxy.
     */
    override fun iamAuth(iamAuth: Boolean) {
      cdkBuilder.iamAuth(iamAuth)
    }

    /**
     * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it.
     * You can set this value higher or lower than the connection timeout limit for the associated
     * database.
     */
    override fun idleClientTimeout(idleClientTimeout: Duration) {
      cdkBuilder.idleClientTimeout(idleClientTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param initQuery One or more SQL statements for the proxy to run when opening each new
     * database connection.
     * Typically used with SET statements to make sure that each connection has identical settings
     * such as time zone
     * and character set.
     * For multiple statements, use semicolons as the separator.
     * You can also include multiple variables in a single SET statement, such as SET x=1, y=2.
     *
     * not currently supported for PostgreSQL.
     */
    override fun initQuery(initQuery: String) {
      cdkBuilder.initQuery(initQuery)
    }

    /**
     * @param maxConnectionsPercent The maximum size of the connection pool for each target in a
     * target group.
     * For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS
     * DB instance or Aurora DB
     * cluster used by the target group.
     *
     * 1-100
     */
    override fun maxConnectionsPercent(maxConnectionsPercent: Number) {
      cdkBuilder.maxConnectionsPercent(maxConnectionsPercent)
    }

    /**
     * @param maxIdleConnectionsPercent Controls how actively the proxy closes idle database
     * connections in the connection pool.
     * A high value enables the proxy to leave a high percentage of idle connections open.
     * A low value causes the proxy to close idle client connections and return the underlying
     * database connections
     * to the connection pool.
     * For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS
     * DB instance
     * or Aurora DB cluster used by the target group.
     *
     * between 0 and MaxConnectionsPercent
     */
    override fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
      cdkBuilder.maxIdleConnectionsPercent(maxIdleConnectionsPercent)
    }

    /**
     * @param proxyTarget DB proxy target: Instance or Cluster. 
     */
    override fun proxyTarget(proxyTarget: ProxyTarget) {
      cdkBuilder.proxyTarget(proxyTarget.let(ProxyTarget.Companion::unwrap))
    }

    /**
     * @param requireTls A Boolean parameter that specifies whether Transport Layer Security (TLS)
     * encryption is required for connections to the proxy.
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     */
    override fun requireTls(requireTls: Boolean) {
      cdkBuilder.requireTls(requireTls)
    }

    /**
     * @param role IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or
     * Aurora DB cluster. 
     * These secrets are stored within Amazon Secrets Manager.
     * One or more secrets are required.
     */
    override fun secrets(secrets: List<ISecret>) {
      cdkBuilder.secrets(secrets.map(ISecret.Companion::unwrap))
    }

    /**
     * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or
     * Aurora DB cluster. 
     * These secrets are stored within Amazon Secrets Manager.
     * One or more secrets are required.
     */
    override fun secrets(vararg secrets: ISecret): Unit = secrets(secrets.toList())

    /**
     * @param securityGroups One or more VPC security groups to associate with the new proxy.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups One or more VPC security groups to associate with the new proxy.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     * normally cause all later statements in a session using a proxy to be pinned to the same
     * underlying database connection.
     * Including an item in the list exempts that class of SQL operations from the pinning behavior.
     */
    override fun sessionPinningFilters(sessionPinningFilters: List<SessionPinningFilter>) {
      cdkBuilder.sessionPinningFilters(sessionPinningFilters.map(SessionPinningFilter.Companion::unwrap))
    }

    /**
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     * normally cause all later statements in a session using a proxy to be pinned to the same
     * underlying database connection.
     * Including an item in the list exempts that class of SQL operations from the pinning behavior.
     */
    override fun sessionPinningFilters(vararg sessionPinningFilters: SessionPinningFilter): Unit =
        sessionPinningFilters(sessionPinningFilters.toList())

    /**
     * @param vpc The VPC to associate with the new proxy. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets The subnets used by the proxy.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets The subnets used by the proxy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5e98a9532140f885d9de7e0d32d1fb87b06cbf35f459dd09c393154c3281769")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.DatabaseProxyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.DatabaseProxyProps,
  ) : CdkObject(cdkObject), DatabaseProxyProps {
    /**
     * The duration for a proxy to wait for a connection to become available in the connection pool.
     *
     * Only applies when the proxy has opened its maximum number of connections and all connections
     * are busy with client
     * sessions.
     *
     * Value must be between 1 second and 1 hour, or `Duration.seconds(0)` to represent unlimited.
     *
     * Default: cdk.Duration.seconds(120)
     */
    override fun borrowTimeout(): Duration? = unwrap(this).getBorrowTimeout()?.let(Duration::wrap)

    /**
     * Specifies the details of authentication used by a proxy to log in as a specific database
     * user.
     *
     * Default: - CloudFormation defaults will apply given the specified database engine.
     */
    override fun clientPasswordAuthType(): ClientPasswordAuthType? =
        unwrap(this).getClientPasswordAuthType()?.let(ClientPasswordAuthType::wrap)

    /**
     * The identifier for the proxy.
     *
     * This name must be unique for all proxies owned by your AWS account in the specified AWS
     * Region.
     * An identifier must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens;
     * it can't end with a hyphen or contain two consecutive hyphens.
     *
     * Default: - Generated by CloudFormation (recommended)
     */
    override fun dbProxyName(): String? = unwrap(this).getDbProxyName()

    /**
     * Whether the proxy includes detailed information about SQL statements in its logs.
     *
     * This information helps you to debug issues involving SQL behavior or the performance and
     * scalability of the proxy connections.
     * The debug information includes the text of SQL statements that you submit through the proxy.
     * Thus, only enable this setting when needed for debugging, and only when you have security
     * measures in place to safeguard any sensitive
     * information that appears in the logs.
     *
     * Default: false
     */
    override fun debugLogging(): Boolean? = unwrap(this).getDebugLogging()

    /**
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for
     * connections to the proxy.
     *
     * Default: false
     */
    override fun iamAuth(): Boolean? = unwrap(this).getIamAuth()

    /**
     * The number of seconds that a connection to the proxy can be inactive before the proxy
     * disconnects it.
     *
     * You can set this value higher or lower than the connection timeout limit for the associated
     * database.
     *
     * Default: cdk.Duration.minutes(30)
     */
    override fun idleClientTimeout(): Duration? =
        unwrap(this).getIdleClientTimeout()?.let(Duration::wrap)

    /**
     * One or more SQL statements for the proxy to run when opening each new database connection.
     *
     * Typically used with SET statements to make sure that each connection has identical settings
     * such as time zone
     * and character set.
     * For multiple statements, use semicolons as the separator.
     * You can also include multiple variables in a single SET statement, such as SET x=1, y=2.
     *
     * not currently supported for PostgreSQL.
     *
     * Default: - no initialization query
     */
    override fun initQuery(): String? = unwrap(this).getInitQuery()

    /**
     * The maximum size of the connection pool for each target in a target group.
     *
     * For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS
     * DB instance or Aurora DB
     * cluster used by the target group.
     *
     * 1-100
     *
     * Default: 100
     */
    override fun maxConnectionsPercent(): Number? = unwrap(this).getMaxConnectionsPercent()

    /**
     * Controls how actively the proxy closes idle database connections in the connection pool.
     *
     * A high value enables the proxy to leave a high percentage of idle connections open.
     * A low value causes the proxy to close idle client connections and return the underlying
     * database connections
     * to the connection pool.
     * For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS
     * DB instance
     * or Aurora DB cluster used by the target group.
     *
     * between 0 and MaxConnectionsPercent
     *
     * Default: 50
     */
    override fun maxIdleConnectionsPercent(): Number? = unwrap(this).getMaxIdleConnectionsPercent()

    /**
     * DB proxy target: Instance or Cluster.
     */
    override fun proxyTarget(): ProxyTarget = unwrap(this).getProxyTarget().let(ProxyTarget::wrap)

    /**
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is
     * required for connections to the proxy.
     *
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     *
     * Default: true
     */
    override fun requireTLS(): Boolean? = unwrap(this).getRequireTLS()

    /**
     * IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     *
     * Default: - A role will automatically be created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster.
     *
     * These secrets are stored within Amazon Secrets Manager.
     * One or more secrets are required.
     */
    override fun secrets(): List<ISecret> = unwrap(this).getSecrets().map(ISecret::wrap)

    /**
     * One or more VPC security groups to associate with the new proxy.
     *
     * Default: - No security groups
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Each item in the list represents a class of SQL operations that normally cause all later
     * statements in a session using a proxy to be pinned to the same underlying database connection.
     *
     * Including an item in the list exempts that class of SQL operations from the pinning behavior.
     *
     * Default: - no session pinning filters
     */
    override fun sessionPinningFilters(): List<SessionPinningFilter> =
        unwrap(this).getSessionPinningFilters()?.map(SessionPinningFilter::wrap) ?: emptyList()

    /**
     * The VPC to associate with the new proxy.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * The subnets used by the proxy.
     *
     * Default: - the VPC default strategy if not specified.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseProxyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseProxyProps):
        DatabaseProxyProps = CdkObjectWrappers.wrap(cdkObject) as? DatabaseProxyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseProxyProps):
        software.amazon.awscdk.services.rds.DatabaseProxyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.DatabaseProxyProps
  }
}
