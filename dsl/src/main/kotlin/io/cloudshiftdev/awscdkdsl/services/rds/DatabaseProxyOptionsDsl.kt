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
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.ClientPasswordAuthType
import software.amazon.awscdk.services.rds.DatabaseProxyOptions
import software.amazon.awscdk.services.rds.SessionPinningFilter
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * Options for a new DatabaseProxy.
 *
 * Example:
 * ```
 * Vpc vpc;
 * SecurityGroup securityGroup;
 * Secret[] secrets;
 * DatabaseInstance dbInstance;
 * DatabaseProxy proxy = dbInstance.addProxy("proxy", DatabaseProxyOptions.builder()
 * .borrowTimeout(Duration.seconds(30))
 * .maxConnectionsPercent(50)
 * .secrets(secrets)
 * .vpc(vpc)
 * .build());
 * ```
 */
@CdkDslMarker
public class DatabaseProxyOptionsDsl {
    private val cdkBuilder: DatabaseProxyOptions.Builder = DatabaseProxyOptions.builder()

    private val _secrets: MutableList<ISecret> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    private val _sessionPinningFilters: MutableList<SessionPinningFilter> = mutableListOf()

    /**
     * @param borrowTimeout The duration for a proxy to wait for a connection to become available in
     *   the connection pool. Only applies when the proxy has opened its maximum number of
     *   connections and all connections are busy with client sessions.
     *
     * Value must be between 1 second and 1 hour, or `Duration.seconds(0)` to represent unlimited.
     */
    public fun borrowTimeout(borrowTimeout: Duration) {
        cdkBuilder.borrowTimeout(borrowTimeout)
    }

    /**
     * @param clientPasswordAuthType Specifies the details of authentication used by a proxy to log
     *   in as a specific database user.
     */
    public fun clientPasswordAuthType(clientPasswordAuthType: ClientPasswordAuthType) {
        cdkBuilder.clientPasswordAuthType(clientPasswordAuthType)
    }

    /**
     * @param dbProxyName The identifier for the proxy. This name must be unique for all proxies
     *   owned by your AWS account in the specified AWS Region. An identifier must begin with a
     *   letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen
     *   or contain two consecutive hyphens.
     */
    public fun dbProxyName(dbProxyName: String) {
        cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * @param debugLogging Whether the proxy includes detailed information about SQL statements in
     *   its logs. This information helps you to debug issues involving SQL behavior or the
     *   performance and scalability of the proxy connections. The debug information includes the
     *   text of SQL statements that you submit through the proxy. Thus, only enable this setting
     *   when needed for debugging, and only when you have security measures in place to safeguard
     *   any sensitive information that appears in the logs.
     */
    public fun debugLogging(debugLogging: Boolean) {
        cdkBuilder.debugLogging(debugLogging)
    }

    /**
     * @param iamAuth Whether to require or disallow AWS Identity and Access Management (IAM)
     *   authentication for connections to the proxy.
     */
    public fun iamAuth(iamAuth: Boolean) {
        cdkBuilder.iamAuth(iamAuth)
    }

    /**
     * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
     *   before the proxy disconnects it. You can set this value higher or lower than the connection
     *   timeout limit for the associated database.
     */
    public fun idleClientTimeout(idleClientTimeout: Duration) {
        cdkBuilder.idleClientTimeout(idleClientTimeout)
    }

    /**
     * @param initQuery One or more SQL statements for the proxy to run when opening each new
     *   database connection. Typically used with SET statements to make sure that each connection
     *   has identical settings such as time zone and character set. For multiple statements, use
     *   semicolons as the separator. You can also include multiple variables in a single SET
     *   statement, such as SET x=1, y=2.
     *
     * not currently supported for PostgreSQL.
     */
    public fun initQuery(initQuery: String) {
        cdkBuilder.initQuery(initQuery)
    }

    /**
     * @param maxConnectionsPercent The maximum size of the connection pool for each target in a
     *   target group. For Aurora MySQL, it is expressed as a percentage of the max_connections
     *   setting for the RDS DB instance or Aurora DB cluster used by the target group.
     *
     * 1-100
     */
    public fun maxConnectionsPercent(maxConnectionsPercent: Number) {
        cdkBuilder.maxConnectionsPercent(maxConnectionsPercent)
    }

    /**
     * @param maxIdleConnectionsPercent Controls how actively the proxy closes idle database
     *   connections in the connection pool. A high value enables the proxy to leave a high
     *   percentage of idle connections open. A low value causes the proxy to close idle client
     *   connections and return the underlying database connections to the connection pool. For
     *   Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB
     *   instance or Aurora DB cluster used by the target group.
     *
     * between 0 and MaxConnectionsPercent
     */
    public fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
        cdkBuilder.maxIdleConnectionsPercent(maxIdleConnectionsPercent)
    }

    /**
     * @param requireTls A Boolean parameter that specifies whether Transport Layer Security (TLS)
     *   encryption is required for connections to the proxy. By enabling this setting, you can
     *   enforce encrypted TLS connections to the proxy.
     */
    public fun requireTls(requireTls: Boolean) {
        cdkBuilder.requireTls(requireTls)
    }

    /** @param role IAM role that the proxy uses to access secrets in AWS Secrets Manager. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or
     *   Aurora DB cluster. These secrets are stored within Amazon Secrets Manager. One or more
     *   secrets are required.
     */
    public fun secrets(vararg secrets: ISecret) {
        _secrets.addAll(listOf(*secrets))
    }

    /**
     * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or
     *   Aurora DB cluster. These secrets are stored within Amazon Secrets Manager. One or more
     *   secrets are required.
     */
    public fun secrets(secrets: Collection<ISecret>) {
        _secrets.addAll(secrets)
    }

    /** @param securityGroups One or more VPC security groups to associate with the new proxy. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups One or more VPC security groups to associate with the new proxy. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     *   normally cause all later statements in a session using a proxy to be pinned to the same
     *   underlying database connection. Including an item in the list exempts that class of SQL
     *   operations from the pinning behavior.
     */
    public fun sessionPinningFilters(vararg sessionPinningFilters: SessionPinningFilter) {
        _sessionPinningFilters.addAll(listOf(*sessionPinningFilters))
    }

    /**
     * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
     *   normally cause all later statements in a session using a proxy to be pinned to the same
     *   underlying database connection. Including an item in the list exempts that class of SQL
     *   operations from the pinning behavior.
     */
    public fun sessionPinningFilters(sessionPinningFilters: Collection<SessionPinningFilter>) {
        _sessionPinningFilters.addAll(sessionPinningFilters)
    }

    /** @param vpc The VPC to associate with the new proxy. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcSubnets The subnets used by the proxy. */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /** @param vpcSubnets The subnets used by the proxy. */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): DatabaseProxyOptions {
        if (_secrets.isNotEmpty()) cdkBuilder.secrets(_secrets)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_sessionPinningFilters.isNotEmpty())
            cdkBuilder.sessionPinningFilters(_sessionPinningFilters)
        return cdkBuilder.build()
    }
}
