package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SecurityGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.SecurityGroup,
) : Resource(cdkObject), ISecurityGroup {
  public override fun addEgressRule(peer: IPeer, connection: Port) {
    unwrap(this).addEgressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4bf89f5e640a8b7efb17409c9a88eefede4e96a9f59d45b102417c6495109e89")
  public override fun addEgressRule(peer: IPeer, connection: Port.Builder.() -> Unit): Unit =
      addEgressRule(peer, Port(connection))

  public override fun addEgressRule(
    peer: IPeer,
    connection: Port,
    description: String,
  ) {
    unwrap(this).addEgressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap), description)
  }

  public override fun addEgressRule(
    peer: IPeer,
    connection: Port,
    description: String,
    remoteRule: Boolean,
  ) {
    unwrap(this).addEgressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap), description,
        remoteRule)
  }

  public override fun addIngressRule(peer: IPeer, connection: Port) {
    unwrap(this).addIngressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d409b422c545699df421c29fe3c67d472d855aa96dc063ceafcf760d3ba5c249")
  public override fun addIngressRule(peer: IPeer, connection: Port.Builder.() -> Unit): Unit =
      addIngressRule(peer, Port(connection))

  public override fun addIngressRule(
    peer: IPeer,
    connection: Port,
    description: String,
  ) {
    unwrap(this).addIngressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap), description)
  }

  public override fun addIngressRule(
    peer: IPeer,
    connection: Port,
    description: String,
    remoteRule: Boolean,
  ) {
    unwrap(this).addIngressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap), description,
        remoteRule)
  }

  public open fun allowAllIpv6Outbound(): Boolean = unwrap(this).getAllowAllIpv6Outbound()

  public override fun allowAllOutbound(): Boolean = unwrap(this).getAllowAllOutbound()

  public override fun canInlineRule(): Boolean = unwrap(this).getCanInlineRule()

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun defaultPort(): Port? = unwrap(this).getDefaultPort()?.let(Port::wrap)

  public override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

  public open fun securityGroupVpcId(): String = unwrap(this).getSecurityGroupVpcId()

  public override fun toEgressRuleConfig(): Any = unwrap(this).toEgressRuleConfig()

  public override fun toIngressRuleConfig(): Any = unwrap(this).toIngressRuleConfig()

  public override fun uniqueId(): String = unwrap(this).getUniqueId()

  public interface Builder {
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
    }

    public fun allowAllOutbound(allowAllOutbound: Boolean) {
    }

    public fun description(description: String) {
    }

    public fun disableInlineRules(disableInlineRules: Boolean) {
    }

    public fun securityGroupName(securityGroupName: String) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SecurityGroup.Builder =
        software.amazon.awscdk.services.ec2.SecurityGroup.Builder.create(scope, id)

    public override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    public override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun disableInlineRules(disableInlineRules: Boolean) {
      cdkBuilder.disableInlineRules(disableInlineRules)
    }

    public override fun securityGroupName(securityGroupName: String) {
      cdkBuilder.securityGroupName(securityGroupName)
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.SecurityGroup = cdkBuilder.build()
  }

  public companion object {
    public open fun fromLookupById(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      securityGroupId: String,
    ): ISecurityGroup =
        software.amazon.awscdk.services.ec2.SecurityGroup.fromLookupById(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, securityGroupId).let(ISecurityGroup::wrap)

    public open fun fromLookupByName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      securityGroupName: String,
      vpc: IVpc,
    ): ISecurityGroup =
        software.amazon.awscdk.services.ec2.SecurityGroup.fromLookupByName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, securityGroupName, vpc.let(IVpc::unwrap)).let(ISecurityGroup::wrap)

    public open fun fromSecurityGroupId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      securityGroupId: String,
    ): ISecurityGroup =
        software.amazon.awscdk.services.ec2.SecurityGroup.fromSecurityGroupId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, securityGroupId).let(ISecurityGroup::wrap)

    public open fun fromSecurityGroupId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      securityGroupId: String,
      options: SecurityGroupImportOptions,
    ): ISecurityGroup =
        software.amazon.awscdk.services.ec2.SecurityGroup.fromSecurityGroupId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, securityGroupId,
        options.let(SecurityGroupImportOptions::unwrap)).let(ISecurityGroup::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1c6c1dacaf5bb3e730a1c0404aa31a8e76593f9a43e6f9d87dabffb2d41cee7")
    public open fun fromSecurityGroupId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      securityGroupId: String,
      options: SecurityGroupImportOptions.Builder.() -> Unit,
    ): ISecurityGroup = fromSecurityGroupId(scope, id, securityGroupId,
        SecurityGroupImportOptions(options))

    public open fun isSecurityGroup(x: Any): Boolean =
        software.amazon.awscdk.services.ec2.SecurityGroup.isSecurityGroup(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SecurityGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SecurityGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SecurityGroup): SecurityGroup =
        SecurityGroup(cdkObject)

    internal fun unwrap(wrapped: SecurityGroup): software.amazon.awscdk.services.ec2.SecurityGroup =
        wrapped.cdkObject
  }
}
