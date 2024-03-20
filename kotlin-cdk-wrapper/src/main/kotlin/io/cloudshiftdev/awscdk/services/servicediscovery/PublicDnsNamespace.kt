@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Public DNS Namespace.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.*;
 * App app = new App();
 * Stack stack = new Stack(app, "aws-servicediscovery-integ");
 * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
 * .name("foobar.com")
 * .build();
 * Service service = namespace.createService("Service", DnsServiceProps.builder()
 * .name("foo")
 * .dnsRecordType(DnsRecordType.A)
 * .dnsTtl(Duration.seconds(30))
 * .healthCheck(HealthCheckConfig.builder()
 * .type(HealthCheckType.HTTPS)
 * .resourcePath("/healthcheck")
 * .failureThreshold(2)
 * .build())
 * .build());
 * service.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
 * .ipv4("54.239.25.192")
 * .port(443)
 * .build());
 * app.synth();
 * ```
 */
public open class PublicDnsNamespace internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace,
) : Resource(cdkObject), IPublicDnsNamespace {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PublicDnsNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(PublicDnsNamespaceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PublicDnsNamespaceProps.Builder.() -> Unit,
  ) : this(scope, id, PublicDnsNamespaceProps(props)
  )

  /**
   * Creates a service within the namespace.
   *
   * @param id 
   * @param props
   */
  public open fun createService(id: String): Service =
      unwrap(this).createService(id).let(Service::wrap)

  /**
   * Creates a service within the namespace.
   *
   * @param id 
   * @param props
   */
  public open fun createService(id: String, props: DnsServiceProps): Service =
      unwrap(this).createService(id, props.let(DnsServiceProps::unwrap)).let(Service::wrap)

  /**
   * Creates a service within the namespace.
   *
   * @param id 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("69f3a5b00b7381d4c2046bf3fc80e0f9c6eac9693318682de7bf91ea41fd33e7")
  public open fun createService(id: String, props: DnsServiceProps.Builder.() -> Unit): Service =
      createService(id, DnsServiceProps(props))

  /**
   * Namespace Arn for the namespace.
   */
  public override fun namespaceArn(): String = unwrap(this).getNamespaceArn()

  /**
   * ID of hosted zone created by namespace.
   */
  public open fun namespaceHostedZoneId(): String = unwrap(this).getNamespaceHostedZoneId()

  /**
   * Namespace Id for the namespace.
   */
  public override fun namespaceId(): String = unwrap(this).getNamespaceId()

  /**
   * A name for the namespace.
   */
  public override fun namespaceName(): String = unwrap(this).getNamespaceName()

  /**
   *
   */
  public open fun publicDnsNamespaceArn(): String = unwrap(this).getPublicDnsNamespaceArn()

  /**
   *
   */
  public open fun publicDnsNamespaceId(): String = unwrap(this).getPublicDnsNamespaceId()

  /**
   *
   */
  public open fun publicDnsNamespaceName(): String = unwrap(this).getPublicDnsNamespaceName()

  /**
   * Type of the namespace.
   */
  public override fun type(): NamespaceType = unwrap(this).getType().let(NamespaceType::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.PublicDnsNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the Namespace.
     *
     * Default: none
     *
     * @param description A description of the Namespace. 
     */
    public fun description(description: String)

    /**
     * A name for the Namespace.
     *
     * @param name A name for the Namespace. 
     */
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

    /**
     * A description of the Namespace.
     *
     * Default: none
     *
     * @param description A description of the Namespace. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A name for the Namespace.
     *
     * @param name A name for the Namespace. 
     */
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
