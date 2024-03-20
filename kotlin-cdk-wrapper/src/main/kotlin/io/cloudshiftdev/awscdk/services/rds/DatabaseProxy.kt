@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * RDS Database Proxy.
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
 * .clientPasswordAuthType(ClientPasswordAuthType.MYSQL_NATIVE_PASSWORD)
 * .build();
 * ```
 */
public open class DatabaseProxy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.DatabaseProxy,
) : Resource(cdkObject), IConnectable, ISecretAttachmentTarget, IDatabaseProxy {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DatabaseProxyProps,
  ) :
      this(software.amazon.awscdk.services.rds.DatabaseProxy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(DatabaseProxyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DatabaseProxyProps.Builder.() -> Unit,
  ) : this(scope, id, DatabaseProxyProps(props)
  )

  /**
   * Renders the secret attachment target specifications.
   */
  public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
      unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

  /**
   * Access to network connections.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * DB Proxy ARN.
   */
  public override fun dbProxyArn(): String = unwrap(this).getDbProxyArn()

  /**
   * DB Proxy Name.
   */
  public override fun dbProxyName(): String = unwrap(this).getDbProxyName()

  /**
   * Endpoint.
   */
  public override fun endpoint(): String = unwrap(this).getEndpoint()

  /**
   * Grant the given identity connection access to the proxy.
   *
   * @param grantee 
   * @param dbUser
   */
  public override fun grantConnect(grantee: IGrantable): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity connection access to the proxy.
   *
   * @param grantee 
   * @param dbUser
   */
  public override fun grantConnect(grantee: IGrantable, dbUser: String): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable::unwrap), dbUser).let(Grant::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.DatabaseProxy].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param borrowTimeout The duration for a proxy to wait for a connection to become available in
     * the connection pool. 
     */
    public fun borrowTimeout(borrowTimeout: Duration)

    /**
     * Specifies the details of authentication used by a proxy to log in as a specific database
     * user.
     *
     * Default: - CloudFormation defaults will apply given the specified database engine.
     *
     * @param clientPasswordAuthType Specifies the details of authentication used by a proxy to log
     * in as a specific database user. 
     */
    public fun clientPasswordAuthType(clientPasswordAuthType: ClientPasswordAuthType)

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
     *
     * @param dbProxyName The identifier for the proxy. 
     */
    public fun dbProxyName(dbProxyName: String)

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
     *
     * @param debugLogging Whether the proxy includes detailed information about SQL statements in
     * its logs. 
     */
    public fun debugLogging(debugLogging: Boolean)

    /**
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for
     * connections to the proxy.
     *
     * Default: false
     *
     * @param iamAuth Whether to require or disallow AWS Identity and Access Management (IAM)
     * authentication for connections to the proxy. 
     */
    public fun iamAuth(iamAuth: Boolean)

    /**
     * The number of seconds that a connection to the proxy can be inactive before the proxy
     * disconnects it.
     *
     * You can set this value higher or lower than the connection timeout limit for the associated
     * database.
     *
     * Default: cdk.Duration.minutes(30)
     *
     * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it. 
     */
    public fun idleClientTimeout(idleClientTimeout: Duration)

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
     *
     * @param initQuery One or more SQL statements for the proxy to run when opening each new
     * database connection. 
     */
    public fun initQuery(initQuery: String)

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
     *
     * @param maxConnectionsPercent The maximum size of the connection pool for each target in a
     * target group. 
     */
    public fun maxConnectionsPercent(maxConnectionsPercent: Number)

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
     *
     * @param maxIdleConnectionsPercent Controls how actively the proxy closes idle database
     * connections in the connection pool. 
     */
    public fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number)

    /**
     * DB proxy target: Instance or Cluster.
     *
     * @param proxyTarget DB proxy target: Instance or Cluster. 
     */
    public fun proxyTarget(proxyTarget: ProxyTarget)

    /**
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is
     * required for connections to the proxy.
     *
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     *
     * Default: true
     *
     * @param requireTls A Boolean parameter that specifies whether Transport Layer Security (TLS)
     * encryption is required for connections to the proxy. 
     */
    public fun requireTls(requireTls: Boolean)

    /**
     * IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     *
     * Default: - A role will automatically be created
     *
     * @param role IAM role that the proxy uses to access secrets in AWS Secrets Manager. 
     */
    public fun role(role: IRole)

    /**
     * The secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster.
     *
     * These secrets are stored within Amazon Secrets Manager.
     * One or more secrets are required.
     *
     * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or
     * Aurora DB cluster. 
     */
    public fun secrets(secrets: List<ISecret>)

    /**
     * The secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster.
     *
     * These secrets are stored within Amazon Secrets Manager.
     * One or more secrets are required.
     *
     * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or
     * Aurora DB cluster. 
     */
    public fun secrets(vararg secrets: ISecret)

    /**
     * One or more VPC security groups to associate with the new proxy.
     *
     * Default: - No security groups
     *
     * @param securityGroups One or more VPC security groups to associate with the new proxy. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * One or more VPC security groups to associate with the new proxy.
     *
     * Default: - No security groups
     *
     * @param securityGroups One or more VPC security groups to associate with the new proxy. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Each item in the list represents a class of SQL operations that normally cause all later
     * statements in a session using a proxy to be pinned to the same underlying database connection.
     *
     * Including an item in the list exempts that class of SQL operations from the pinning behavior.
     *
     * Default: - no session pinning filters
     *
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     * normally cause all later statements in a session using a proxy to be pinned to the same
     * underlying database connection. 
     */
    public fun sessionPinningFilters(sessionPinningFilters: List<SessionPinningFilter>)

    /**
     * Each item in the list represents a class of SQL operations that normally cause all later
     * statements in a session using a proxy to be pinned to the same underlying database connection.
     *
     * Including an item in the list exempts that class of SQL operations from the pinning behavior.
     *
     * Default: - no session pinning filters
     *
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     * normally cause all later statements in a session using a proxy to be pinned to the same
     * underlying database connection. 
     */
    public fun sessionPinningFilters(vararg sessionPinningFilters: SessionPinningFilter)

    /**
     * The VPC to associate with the new proxy.
     *
     * @param vpc The VPC to associate with the new proxy. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * The subnets used by the proxy.
     *
     * Default: - the VPC default strategy if not specified.
     *
     * @param vpcSubnets The subnets used by the proxy. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * The subnets used by the proxy.
     *
     * Default: - the VPC default strategy if not specified.
     *
     * @param vpcSubnets The subnets used by the proxy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c68b30f229b15499e91e27a72992551b35e1884ba3a8da5c138cbf4bd71e01fe")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseProxy.Builder =
        software.amazon.awscdk.services.rds.DatabaseProxy.Builder.create(scope, id)

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
     *
     * @param borrowTimeout The duration for a proxy to wait for a connection to become available in
     * the connection pool. 
     */
    override fun borrowTimeout(borrowTimeout: Duration) {
      cdkBuilder.borrowTimeout(borrowTimeout.let(Duration::unwrap))
    }

    /**
     * Specifies the details of authentication used by a proxy to log in as a specific database
     * user.
     *
     * Default: - CloudFormation defaults will apply given the specified database engine.
     *
     * @param clientPasswordAuthType Specifies the details of authentication used by a proxy to log
     * in as a specific database user. 
     */
    override fun clientPasswordAuthType(clientPasswordAuthType: ClientPasswordAuthType) {
      cdkBuilder.clientPasswordAuthType(clientPasswordAuthType.let(ClientPasswordAuthType::unwrap))
    }

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
     *
     * @param dbProxyName The identifier for the proxy. 
     */
    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

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
     *
     * @param debugLogging Whether the proxy includes detailed information about SQL statements in
     * its logs. 
     */
    override fun debugLogging(debugLogging: Boolean) {
      cdkBuilder.debugLogging(debugLogging)
    }

    /**
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for
     * connections to the proxy.
     *
     * Default: false
     *
     * @param iamAuth Whether to require or disallow AWS Identity and Access Management (IAM)
     * authentication for connections to the proxy. 
     */
    override fun iamAuth(iamAuth: Boolean) {
      cdkBuilder.iamAuth(iamAuth)
    }

    /**
     * The number of seconds that a connection to the proxy can be inactive before the proxy
     * disconnects it.
     *
     * You can set this value higher or lower than the connection timeout limit for the associated
     * database.
     *
     * Default: cdk.Duration.minutes(30)
     *
     * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it. 
     */
    override fun idleClientTimeout(idleClientTimeout: Duration) {
      cdkBuilder.idleClientTimeout(idleClientTimeout.let(Duration::unwrap))
    }

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
     *
     * @param initQuery One or more SQL statements for the proxy to run when opening each new
     * database connection. 
     */
    override fun initQuery(initQuery: String) {
      cdkBuilder.initQuery(initQuery)
    }

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
     *
     * @param maxConnectionsPercent The maximum size of the connection pool for each target in a
     * target group. 
     */
    override fun maxConnectionsPercent(maxConnectionsPercent: Number) {
      cdkBuilder.maxConnectionsPercent(maxConnectionsPercent)
    }

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
     *
     * @param maxIdleConnectionsPercent Controls how actively the proxy closes idle database
     * connections in the connection pool. 
     */
    override fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
      cdkBuilder.maxIdleConnectionsPercent(maxIdleConnectionsPercent)
    }

    /**
     * DB proxy target: Instance or Cluster.
     *
     * @param proxyTarget DB proxy target: Instance or Cluster. 
     */
    override fun proxyTarget(proxyTarget: ProxyTarget) {
      cdkBuilder.proxyTarget(proxyTarget.let(ProxyTarget::unwrap))
    }

    /**
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is
     * required for connections to the proxy.
     *
     * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     *
     * Default: true
     *
     * @param requireTls A Boolean parameter that specifies whether Transport Layer Security (TLS)
     * encryption is required for connections to the proxy. 
     */
    override fun requireTls(requireTls: Boolean) {
      cdkBuilder.requireTls(requireTls)
    }

    /**
     * IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     *
     * Default: - A role will automatically be created
     *
     * @param role IAM role that the proxy uses to access secrets in AWS Secrets Manager. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * The secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster.
     *
     * These secrets are stored within Amazon Secrets Manager.
     * One or more secrets are required.
     *
     * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or
     * Aurora DB cluster. 
     */
    override fun secrets(secrets: List<ISecret>) {
      cdkBuilder.secrets(secrets.map(ISecret::unwrap))
    }

    /**
     * The secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster.
     *
     * These secrets are stored within Amazon Secrets Manager.
     * One or more secrets are required.
     *
     * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or
     * Aurora DB cluster. 
     */
    override fun secrets(vararg secrets: ISecret): Unit = secrets(secrets.toList())

    /**
     * One or more VPC security groups to associate with the new proxy.
     *
     * Default: - No security groups
     *
     * @param securityGroups One or more VPC security groups to associate with the new proxy. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * One or more VPC security groups to associate with the new proxy.
     *
     * Default: - No security groups
     *
     * @param securityGroups One or more VPC security groups to associate with the new proxy. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Each item in the list represents a class of SQL operations that normally cause all later
     * statements in a session using a proxy to be pinned to the same underlying database connection.
     *
     * Including an item in the list exempts that class of SQL operations from the pinning behavior.
     *
     * Default: - no session pinning filters
     *
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     * normally cause all later statements in a session using a proxy to be pinned to the same
     * underlying database connection. 
     */
    override fun sessionPinningFilters(sessionPinningFilters: List<SessionPinningFilter>) {
      cdkBuilder.sessionPinningFilters(sessionPinningFilters.map(SessionPinningFilter::unwrap))
    }

    /**
     * Each item in the list represents a class of SQL operations that normally cause all later
     * statements in a session using a proxy to be pinned to the same underlying database connection.
     *
     * Including an item in the list exempts that class of SQL operations from the pinning behavior.
     *
     * Default: - no session pinning filters
     *
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     * normally cause all later statements in a session using a proxy to be pinned to the same
     * underlying database connection. 
     */
    override fun sessionPinningFilters(vararg sessionPinningFilters: SessionPinningFilter): Unit =
        sessionPinningFilters(sessionPinningFilters.toList())

    /**
     * The VPC to associate with the new proxy.
     *
     * @param vpc The VPC to associate with the new proxy. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * The subnets used by the proxy.
     *
     * Default: - the VPC default strategy if not specified.
     *
     * @param vpcSubnets The subnets used by the proxy. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * The subnets used by the proxy.
     *
     * Default: - the VPC default strategy if not specified.
     *
     * @param vpcSubnets The subnets used by the proxy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c68b30f229b15499e91e27a72992551b35e1884ba3a8da5c138cbf4bd71e01fe")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.DatabaseProxy = cdkBuilder.build()
  }

  public companion object {
    public fun fromDatabaseProxyAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DatabaseProxyAttributes,
    ): IDatabaseProxy =
        software.amazon.awscdk.services.rds.DatabaseProxy.fromDatabaseProxyAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DatabaseProxyAttributes::unwrap)).let(IDatabaseProxy::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50bb2976434c4f162188800dac01b8399c67e7a4e265d1b82be88c202cf9c451")
    public fun fromDatabaseProxyAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DatabaseProxyAttributes.Builder.() -> Unit,
    ): IDatabaseProxy = fromDatabaseProxyAttributes(scope, id, DatabaseProxyAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DatabaseProxy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DatabaseProxy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseProxy): DatabaseProxy =
        DatabaseProxy(cdkObject)

    internal fun unwrap(wrapped: DatabaseProxy): software.amazon.awscdk.services.rds.DatabaseProxy =
        wrapped.cdkObject
  }
}
