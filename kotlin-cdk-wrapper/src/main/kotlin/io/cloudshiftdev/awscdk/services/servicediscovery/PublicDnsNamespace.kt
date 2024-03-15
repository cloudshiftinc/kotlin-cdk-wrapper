@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PublicDnsNamespace internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace,
) : Resource(cdkObject), IPublicDnsNamespace {
  public open fun createService(id: String): Service =
      unwrap(this).createService(id).let(Service::wrap)

  public open fun createService(id: String, props: DnsServiceProps): Service =
      unwrap(this).createService(id, props.let(DnsServiceProps::unwrap)).let(Service::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("69f3a5b00b7381d4c2046bf3fc80e0f9c6eac9693318682de7bf91ea41fd33e7")
  public open fun createService(id: String, props: DnsServiceProps.Builder.() -> Unit): Service =
      createService(id, DnsServiceProps(props))

  public override fun namespaceArn(): String = unwrap(this).getNamespaceArn()

  public open fun namespaceHostedZoneId(): String = unwrap(this).getNamespaceHostedZoneId()

  public override fun namespaceId(): String = unwrap(this).getNamespaceId()

  public override fun namespaceName(): String = unwrap(this).getNamespaceName()

  public open fun publicDnsNamespaceArn(): String = unwrap(this).getPublicDnsNamespaceArn()

  public open fun publicDnsNamespaceId(): String = unwrap(this).getPublicDnsNamespaceId()

  public open fun publicDnsNamespaceName(): String = unwrap(this).getPublicDnsNamespaceName()

  public override fun type(): NamespaceType = unwrap(this).getType().let(NamespaceType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace.Builder =
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromPublicDnsNamespaceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PublicDnsNamespaceAttributes,
    ): IPublicDnsNamespace =
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace.fromPublicDnsNamespaceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(PublicDnsNamespaceAttributes::unwrap)).let(IPublicDnsNamespace::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f5dcb9164cac9e5c49c3071dd54dc0eb32f23501ce38485c26940c1b1e356e7")
    public fun fromPublicDnsNamespaceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PublicDnsNamespaceAttributes.Builder.() -> Unit,
    ): IPublicDnsNamespace = fromPublicDnsNamespaceAttributes(scope, id,
        PublicDnsNamespaceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PublicDnsNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PublicDnsNamespace(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace):
        PublicDnsNamespace = PublicDnsNamespace(cdkObject)

    internal fun unwrap(wrapped: PublicDnsNamespace):
        software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace = wrapped.cdkObject
  }
}
