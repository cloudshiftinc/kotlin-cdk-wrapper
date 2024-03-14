package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface DatabaseProxyOptions {
  public fun borrowTimeout(): Duration? = unwrap(this).getBorrowTimeout()?.let(Duration::wrap)

  public fun clientPasswordAuthType(): ClientPasswordAuthType? =
      unwrap(this).getClientPasswordAuthType()?.let(ClientPasswordAuthType::wrap)

  public fun dbProxyName(): String? = unwrap(this).getDbProxyName()

  public fun debugLogging(): Boolean? = unwrap(this).getDebugLogging()

  public fun iamAuth(): Boolean? = unwrap(this).getIamAuth()

  public fun idleClientTimeout(): Duration? =
      unwrap(this).getIdleClientTimeout()?.let(Duration::wrap)

  public fun initQuery(): String? = unwrap(this).getInitQuery()

  public fun maxConnectionsPercent(): Number? = unwrap(this).getMaxConnectionsPercent()

  public fun maxIdleConnectionsPercent(): Number? = unwrap(this).getMaxIdleConnectionsPercent()

  public fun requireTls(): Boolean? = unwrap(this).getRequireTLS()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun secrets(): List<ISecret>

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun sessionPinningFilters(): List<SessionPinningFilter> =
      unwrap(this).getSessionPinningFilters()?.map(SessionPinningFilter::wrap) ?: emptyList()

  public fun vpc(): IVpc

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  public interface Builder {
    public fun borrowTimeout(borrowTimeout: Duration)

    public fun clientPasswordAuthType(clientPasswordAuthType: ClientPasswordAuthType)

    public fun dbProxyName(dbProxyName: String)

    public fun debugLogging(debugLogging: Boolean)

    public fun iamAuth(iamAuth: Boolean)

    public fun idleClientTimeout(idleClientTimeout: Duration)

    public fun initQuery(initQuery: String)

    public fun maxConnectionsPercent(maxConnectionsPercent: Number)

    public fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number)

    public fun requireTls(requireTls: Boolean)

    public fun role(role: IRole)

    public fun secrets(secrets: List<ISecret>)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun sessionPinningFilters(sessionPinningFilters: List<SessionPinningFilter>)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb0461a6bd352da7f1caf0fbad3187047674feacd594c603b962f30a77ef2676")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseProxyOptions.Builder =
        software.amazon.awscdk.services.rds.DatabaseProxyOptions.builder()

    override fun borrowTimeout(borrowTimeout: Duration) {
      cdkBuilder.borrowTimeout(borrowTimeout.let(Duration::unwrap))
    }

    override fun clientPasswordAuthType(clientPasswordAuthType: ClientPasswordAuthType) {
      cdkBuilder.clientPasswordAuthType(clientPasswordAuthType.let(ClientPasswordAuthType::unwrap))
    }

    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    override fun debugLogging(debugLogging: Boolean) {
      cdkBuilder.debugLogging(debugLogging)
    }

    override fun iamAuth(iamAuth: Boolean) {
      cdkBuilder.iamAuth(iamAuth)
    }

    override fun idleClientTimeout(idleClientTimeout: Duration) {
      cdkBuilder.idleClientTimeout(idleClientTimeout.let(Duration::unwrap))
    }

    override fun initQuery(initQuery: String) {
      cdkBuilder.initQuery(initQuery)
    }

    override fun maxConnectionsPercent(maxConnectionsPercent: Number) {
      cdkBuilder.maxConnectionsPercent(maxConnectionsPercent)
    }

    override fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
      cdkBuilder.maxIdleConnectionsPercent(maxIdleConnectionsPercent)
    }

    override fun requireTls(requireTls: Boolean) {
      cdkBuilder.requireTls(requireTls)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun secrets(secrets: List<ISecret>) {
      cdkBuilder.secrets(secrets.map(ISecret::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun sessionPinningFilters(sessionPinningFilters: List<SessionPinningFilter>) {
      cdkBuilder.sessionPinningFilters(sessionPinningFilters.map(SessionPinningFilter::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb0461a6bd352da7f1caf0fbad3187047674feacd594c603b962f30a77ef2676")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.DatabaseProxyOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.DatabaseProxyOptions,
  ) : DatabaseProxyOptions {
    override fun borrowTimeout(): Duration? = unwrap(this).getBorrowTimeout()?.let(Duration::wrap)

    override fun clientPasswordAuthType(): ClientPasswordAuthType? =
        unwrap(this).getClientPasswordAuthType()?.let(ClientPasswordAuthType::wrap)

    override fun dbProxyName(): String? = unwrap(this).getDbProxyName()

    override fun debugLogging(): Boolean? = unwrap(this).getDebugLogging()

    override fun iamAuth(): Boolean? = unwrap(this).getIamAuth()

    override fun idleClientTimeout(): Duration? =
        unwrap(this).getIdleClientTimeout()?.let(Duration::wrap)

    override fun initQuery(): String? = unwrap(this).getInitQuery()

    override fun maxConnectionsPercent(): Number? = unwrap(this).getMaxConnectionsPercent()

    override fun maxIdleConnectionsPercent(): Number? = unwrap(this).getMaxIdleConnectionsPercent()

    override fun requireTls(): Boolean? = unwrap(this).getRequireTLS()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun secrets(): List<ISecret> = unwrap(this).getSecrets().map(ISecret::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun sessionPinningFilters(): List<SessionPinningFilter> =
        unwrap(this).getSessionPinningFilters()?.map(SessionPinningFilter::wrap) ?: emptyList()

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseProxyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseProxyOptions):
        DatabaseProxyOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseProxyOptions):
        software.amazon.awscdk.services.rds.DatabaseProxyOptions = (wrapped as Wrapper).cdkObject
  }
}
