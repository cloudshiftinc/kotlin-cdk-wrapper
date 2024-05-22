@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Service Discovery HTTP Namespace.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * // Cloud Map service discovery is currently required for host ejection by outlier detection
 * Vpc vpc = new Vpc(this, "vpc");
 * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
 * .vpc(vpc)
 * .name("domain.local")
 * .build();
 * Service service = namespace.createService("Svc");
 * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .outlierDetection(OutlierDetection.builder()
 * .baseEjectionDuration(Duration.seconds(10))
 * .interval(Duration.seconds(30))
 * .maxEjectionPercent(50)
 * .maxServerErrors(5)
 * .build())
 * .build())))
 * .build());
 * ```
 */
public open class PrivateDnsNamespace(
  cdkObject: software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace,
) : Resource(cdkObject), IPrivateDnsNamespace {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PrivateDnsNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(PrivateDnsNamespaceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PrivateDnsNamespaceProps.Builder.() -> Unit,
  ) : this(scope, id, PrivateDnsNamespaceProps(props)
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
      unwrap(this).createService(id,
      props.let(DnsServiceProps.Companion::unwrap)).let(Service::wrap)

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
   * Namespace Arn of the namespace.
   */
  public override fun namespaceArn(): String = unwrap(this).getNamespaceArn()

  /**
   * ID of hosted zone created by namespace.
   */
  public open fun namespaceHostedZoneId(): String = unwrap(this).getNamespaceHostedZoneId()

  /**
   * Namespace Id of the PrivateDnsNamespace.
   */
  public override fun namespaceId(): String = unwrap(this).getNamespaceId()

  /**
   * The name of the PrivateDnsNamespace.
   */
  public override fun namespaceName(): String = unwrap(this).getNamespaceName()

  /**
   *
   */
  public open fun privateDnsNamespaceArn(): String = unwrap(this).getPrivateDnsNamespaceArn()

  /**
   *
   */
  public open fun privateDnsNamespaceId(): String = unwrap(this).getPrivateDnsNamespaceId()

  /**
   *
   */
  public open fun privateDnsNamespaceName(): String = unwrap(this).getPrivateDnsNamespaceName()

  /**
   * Type of the namespace.
   */
  public override fun type(): NamespaceType = unwrap(this).getType().let(NamespaceType::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.PrivateDnsNamespace].
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

    /**
     * The Amazon VPC that you want to associate the namespace with.
     *
     * @param vpc The Amazon VPC that you want to associate the namespace with. 
     */
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

    /**
     * The Amazon VPC that you want to associate the namespace with.
     *
     * @param vpc The Amazon VPC that you want to associate the namespace with. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromPrivateDnsNamespaceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PrivateDnsNamespaceAttributes,
    ): IPrivateDnsNamespace =
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace.fromPrivateDnsNamespaceAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        attrs.let(PrivateDnsNamespaceAttributes.Companion::unwrap)).let(IPrivateDnsNamespace::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("290f81154068a36f8c9030fac93d53587f36b821b223b825f369b4b448f72741")
    public fun fromPrivateDnsNamespaceAttributes(
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
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace = wrapped.cdkObject as
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace
  }
}
