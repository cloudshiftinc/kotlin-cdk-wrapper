@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Instance that is accessible using an IP address.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * Service service;
 * IpInstance ipInstance = IpInstance.Builder.create(this, "MyIpInstance")
 * .service(service)
 * // the properties below are optional
 * .customAttributes(Map.of(
 * "customAttributesKey", "customAttributes"))
 * .instanceId("instanceId")
 * .ipv4("ipv4")
 * .ipv6("ipv6")
 * .port(123)
 * .build();
 * ```
 */
public open class IpInstance(
  cdkObject: software.amazon.awscdk.services.servicediscovery.IpInstance,
) : InstanceBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: IpInstanceProps,
  ) :
      this(software.amazon.awscdk.services.servicediscovery.IpInstance(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(IpInstanceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: IpInstanceProps.Builder.() -> Unit,
  ) : this(scope, id, IpInstanceProps(props)
  )

  /**
   * The Id of the instance.
   */
  public override fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * The Ipv4 address of the instance, or blank string if none available.
   */
  public open fun ipv4(): String = unwrap(this).getIpv4()

  /**
   * The Ipv6 address of the instance, or blank string if none available.
   */
  public open fun ipv6(): String = unwrap(this).getIpv6()

  /**
   * The exposed port of the instance.
   */
  public open fun port(): Number = unwrap(this).getPort()

  /**
   * The Cloudmap service to which the instance is registered.
   */
  public override fun service(): IService = unwrap(this).getService().let(IService::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.IpInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Custom attributes of the instance.
     *
     * Default: none
     *
     * @param customAttributes Custom attributes of the instance. 
     */
    public fun customAttributes(customAttributes: Map<String, String>)

    /**
     * The id of the instance resource.
     *
     * Default: Automatically generated name
     *
     * @param instanceId The id of the instance resource. 
     */
    public fun instanceId(instanceId: String)

    /**
     * If the service that you specify contains a template for an A record, the IPv4 address that
     * you want AWS Cloud Map to use for the value of the A record.
     *
     * Default: none
     *
     * @param ipv4 If the service that you specify contains a template for an A record, the IPv4
     * address that you want AWS Cloud Map to use for the value of the A record. 
     */
    public fun ipv4(ipv4: String)

    /**
     * If the service that you specify contains a template for an AAAA record, the IPv6 address that
     * you want AWS Cloud Map to use for the value of the AAAA record.
     *
     * Default: none
     *
     * @param ipv6 If the service that you specify contains a template for an AAAA record, the IPv6
     * address that you want AWS Cloud Map to use for the value of the AAAA record. 
     */
    public fun ipv6(ipv6: String)

    /**
     * The port on the endpoint that you want AWS Cloud Map to perform health checks on.
     *
     * This value is also used for
     * the port value in an SRV record if the service that you specify includes an SRV record. You
     * can also specify a
     * default port that is applied to all instances in the Service configuration.
     *
     * Default: 80
     *
     * @param port The port on the endpoint that you want AWS Cloud Map to perform health checks on.
     * 
     */
    public fun port(port: Number)

    /**
     * The Cloudmap service this resource is registered to.
     *
     * @param service The Cloudmap service this resource is registered to. 
     */
    public fun service(service: IService)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.IpInstance.Builder =
        software.amazon.awscdk.services.servicediscovery.IpInstance.Builder.create(scope, id)

    /**
     * Custom attributes of the instance.
     *
     * Default: none
     *
     * @param customAttributes Custom attributes of the instance. 
     */
    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * The id of the instance resource.
     *
     * Default: Automatically generated name
     *
     * @param instanceId The id of the instance resource. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * If the service that you specify contains a template for an A record, the IPv4 address that
     * you want AWS Cloud Map to use for the value of the A record.
     *
     * Default: none
     *
     * @param ipv4 If the service that you specify contains a template for an A record, the IPv4
     * address that you want AWS Cloud Map to use for the value of the A record. 
     */
    override fun ipv4(ipv4: String) {
      cdkBuilder.ipv4(ipv4)
    }

    /**
     * If the service that you specify contains a template for an AAAA record, the IPv6 address that
     * you want AWS Cloud Map to use for the value of the AAAA record.
     *
     * Default: none
     *
     * @param ipv6 If the service that you specify contains a template for an AAAA record, the IPv6
     * address that you want AWS Cloud Map to use for the value of the AAAA record. 
     */
    override fun ipv6(ipv6: String) {
      cdkBuilder.ipv6(ipv6)
    }

    /**
     * The port on the endpoint that you want AWS Cloud Map to perform health checks on.
     *
     * This value is also used for
     * the port value in an SRV record if the service that you specify includes an SRV record. You
     * can also specify a
     * default port that is applied to all instances in the Service configuration.
     *
     * Default: 80
     *
     * @param port The port on the endpoint that you want AWS Cloud Map to perform health checks on.
     * 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * The Cloudmap service this resource is registered to.
     *
     * @param service The Cloudmap service this resource is registered to. 
     */
    override fun service(service: IService) {
      cdkBuilder.service(service.let(IService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.IpInstance =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): IpInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return IpInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IpInstance):
        IpInstance = IpInstance(cdkObject)

    internal fun unwrap(wrapped: IpInstance):
        software.amazon.awscdk.services.servicediscovery.IpInstance = wrapped.cdkObject as
        software.amazon.awscdk.services.servicediscovery.IpInstance
  }
}
