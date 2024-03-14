package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.Port
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApplicationListener internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener,
) : BaseListener(cdkObject), IApplicationListener {
  public override fun addAction(id: String, props: AddApplicationActionProps) {
    unwrap(this).addAction(id, props.let(AddApplicationActionProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38982a24904e19a27775083a0236be2eab0ffadce58e1eb48572062d8567e700")
  public override fun addAction(id: String, props: AddApplicationActionProps.Builder.() -> Unit):
      Unit = addAction(id, AddApplicationActionProps(props))

  public override fun addCertificates(id: String, certificates: List<IListenerCertificate>) {
    unwrap(this).addCertificates(id, certificates.map(IListenerCertificate::unwrap))
  }

  public override fun addTargetGroups(id: String, props: AddApplicationTargetGroupsProps) {
    unwrap(this).addTargetGroups(id, props.let(AddApplicationTargetGroupsProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("23d206697af6cd2df80791ed22c62995c4f5c61f025a8e8fccb2df80290df232")
  public override fun addTargetGroups(id: String,
      props: AddApplicationTargetGroupsProps.Builder.() -> Unit): Unit = addTargetGroups(id,
      AddApplicationTargetGroupsProps(props))

  public override fun addTargets(id: String, props: AddApplicationTargetsProps):
      ApplicationTargetGroup = unwrap(this).addTargets(id,
      props.let(AddApplicationTargetsProps::unwrap)).let(ApplicationTargetGroup::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("65353b2aaa4d44b3413ee899b6257e24f21c3f8adbdf472376980f2c10a0a327")
  public override fun addTargets(id: String, props: AddApplicationTargetsProps.Builder.() -> Unit):
      ApplicationTargetGroup = addTargets(id, AddApplicationTargetsProps(props))

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun loadBalancer(): IApplicationLoadBalancer =
      unwrap(this).getLoadBalancer().let(IApplicationLoadBalancer::wrap)

  public override fun registerConnectable(connectable: IConnectable, portRange: Port) {
    unwrap(this).registerConnectable(connectable.let(IConnectable::unwrap),
        portRange.let(Port::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
  public override fun registerConnectable(connectable: IConnectable,
      portRange: Port.Builder.() -> Unit): Unit = registerConnectable(connectable, Port(portRange))

  public interface Builder {
    public fun certificates(certificates: List<IListenerCertificate>)

    public fun certificates(vararg certificates: IListenerCertificate)

    public fun defaultAction(defaultAction: ListenerAction)

    public fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>)

    public fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup)

    public fun loadBalancer(loadBalancer: IApplicationLoadBalancer)

    public fun `open`(`open`: Boolean)

    public fun port(port: Number)

    public fun protocol(protocol: ApplicationProtocol)

    public fun sslPolicy(sslPolicy: SslPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener.Builder.create(scope,
        id)

    override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
    }

    override fun certificates(vararg certificates: IListenerCertificate): Unit =
        certificates(certificates.toList())

    override fun defaultAction(defaultAction: ListenerAction) {
      cdkBuilder.defaultAction(defaultAction.let(ListenerAction::unwrap))
    }

    override fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(IApplicationTargetGroup::unwrap))
    }

    override fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup): Unit =
        defaultTargetGroups(defaultTargetGroups.toList())

    override fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(IApplicationLoadBalancer::unwrap))
    }

    override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromApplicationListenerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApplicationListenerAttributes,
    ): IApplicationListener =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener.fromApplicationListenerAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ApplicationListenerAttributes::unwrap)).let(IApplicationListener::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b897b7fb5b672293f218aba1adecf0ac2282eeedea9ba928e37c9ecba0fae0d4")
    public open fun fromApplicationListenerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApplicationListenerAttributes.Builder.() -> Unit,
    ): IApplicationListener = fromApplicationListenerAttributes(scope, id,
        ApplicationListenerAttributes(attrs))

    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: ApplicationListenerLookupOptions,
    ): IApplicationListener =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, options.let(ApplicationListenerLookupOptions::unwrap)).let(IApplicationListener::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7a271d69b9802565632e8864c501b85c1d1c9a7287bb40117a2242310e7184e")
    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: ApplicationListenerLookupOptions.Builder.() -> Unit,
    ): IApplicationListener = fromLookup(scope, id, ApplicationListenerLookupOptions(options))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationListener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationListener(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener):
        ApplicationListener = ApplicationListener(cdkObject)

    internal fun unwrap(wrapped: ApplicationListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener =
        wrapped.cdkObject
  }
}
