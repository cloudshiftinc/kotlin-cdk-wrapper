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

public open class DatabaseProxy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.DatabaseProxy,
) : Resource(cdkObject), IConnectable, ISecretAttachmentTarget, IDatabaseProxy {
  public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
      unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun dbProxyArn(): String = unwrap(this).getDbProxyArn()

  public override fun dbProxyName(): String = unwrap(this).getDbProxyName()

  public override fun endpoint(): String = unwrap(this).getEndpoint()

  public override fun grantConnect(grantee: IGrantable): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantConnect(grantee: IGrantable, dbUser: String): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable::unwrap), dbUser).let(Grant::wrap)

  @CdkDslMarker
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

    public fun proxyTarget(proxyTarget: ProxyTarget)

    public fun requireTls(requireTls: Boolean)

    public fun role(role: IRole)

    public fun secrets(secrets: List<ISecret>)

    public fun secrets(vararg secrets: ISecret)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun sessionPinningFilters(sessionPinningFilters: List<SessionPinningFilter>)

    public fun sessionPinningFilters(vararg sessionPinningFilters: SessionPinningFilter)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

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

    override fun proxyTarget(proxyTarget: ProxyTarget) {
      cdkBuilder.proxyTarget(proxyTarget.let(ProxyTarget::unwrap))
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

    override fun secrets(vararg secrets: ISecret): Unit = secrets(secrets.toList())

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun sessionPinningFilters(sessionPinningFilters: List<SessionPinningFilter>) {
      cdkBuilder.sessionPinningFilters(sessionPinningFilters.map(SessionPinningFilter::unwrap))
    }

    override fun sessionPinningFilters(vararg sessionPinningFilters: SessionPinningFilter): Unit =
        sessionPinningFilters(sessionPinningFilters.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

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