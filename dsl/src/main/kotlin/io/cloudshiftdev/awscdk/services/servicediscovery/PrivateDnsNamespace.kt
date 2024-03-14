package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PrivateDnsNamespace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace,
) : Resource(cdkObject), IPrivateDnsNamespace {
  public open fun createService(id: String): Service =
      unwrap(this).createService(id).let(Service::wrap)

  public open fun createService(id: String, props: DnsServiceProps): Service =
      unwrap(this).createService(id, props.let(DnsServiceProps::unwrap)).let(Service::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("69f3a5b00b7381d4c2046bf3fc80e0f9c6eac9693318682de7bf91ea41fd33e7")
  public open fun createService(id: String, props: DnsServiceProps.Builder.() -> Unit): Service =
      createService(id, DnsServiceProps(props))

  public override fun namespaceArn(): String = unwrap(this).getNamespaceArn()

  public open fun namespaceHostedZoneId(): String = unwrap(this).getNamespaceHostedZoneId()

  public override fun namespaceId(): String = unwrap(this).getNamespaceId()

  public override fun namespaceName(): String = unwrap(this).getNamespaceName()

  public open fun privateDnsNamespaceArn(): String = unwrap(this).getPrivateDnsNamespaceArn()

  public open fun privateDnsNamespaceId(): String = unwrap(this).getPrivateDnsNamespaceId()

  public open fun privateDnsNamespaceName(): String = unwrap(this).getPrivateDnsNamespaceName()

  public override fun type(): NamespaceType = unwrap(this).getType().let(NamespaceType::wrap)

  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace.Builder =
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromPrivateDnsNamespaceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PrivateDnsNamespaceAttributes,
    ): IPrivateDnsNamespace =
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace.fromPrivateDnsNamespaceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(PrivateDnsNamespaceAttributes::unwrap)).let(IPrivateDnsNamespace::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("290f81154068a36f8c9030fac93d53587f36b821b223b825f369b4b448f72741")
    public open fun fromPrivateDnsNamespaceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PrivateDnsNamespaceAttributes.Builder.() -> Unit,
    ): IPrivateDnsNamespace = fromPrivateDnsNamespaceAttributes(scope, id,
        PrivateDnsNamespaceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PrivateDnsNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PrivateDnsNamespace(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace):
        PrivateDnsNamespace = PrivateDnsNamespace(cdkObject)

    internal fun unwrap(wrapped: PrivateDnsNamespace):
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace = wrapped.cdkObject
  }
}
