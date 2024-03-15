@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.*;
 * App app = new App();
 * Stack stack = new Stack(app, "aws-servicediscovery-integ");
 * HttpNamespace namespace = HttpNamespace.Builder.create(stack, "MyNamespace")
 * .name("MyHTTPNamespace")
 * .build();
 * Service service1 = namespace.createService("NonIpService", BaseServiceProps.builder()
 * .description("service registering non-ip instances")
 * .build());
 * service1.registerNonIpInstance("NonIpInstance", NonIpInstanceBaseProps.builder()
 * .customAttributes(Map.of("arn", "arn:aws:s3:::mybucket"))
 * .build());
 * Service service2 = namespace.createService("IpService", BaseServiceProps.builder()
 * .description("service registering ip instances")
 * .healthCheck(HealthCheckConfig.builder()
 * .type(HealthCheckType.HTTP)
 * .resourcePath("/check")
 * .build())
 * .build());
 * service2.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
 * .ipv4("54.239.25.192")
 * .build());
 * app.synth();
 * ```
 */
public interface IpInstanceBaseProps : BaseInstanceProps {
  /**
   * If the service that you specify contains a template for an A record, the IPv4 address that you
   * want AWS Cloud Map to use for the value of the A record.
   *
   * Default: none
   */
  public fun ipv4(): String? = unwrap(this).getIpv4()

  /**
   * If the service that you specify contains a template for an AAAA record, the IPv6 address that
   * you want AWS Cloud Map to use for the value of the AAAA record.
   *
   * Default: none
   */
  public fun ipv6(): String? = unwrap(this).getIpv6()

  /**
   * The port on the endpoint that you want AWS Cloud Map to perform health checks on.
   *
   * This value is also used for
   * the port value in an SRV record if the service that you specify includes an SRV record. You can
   * also specify a
   * default port that is applied to all instances in the Service configuration.
   *
   * Default: 80
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * A builder for [IpInstanceBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customAttributes Custom attributes of the instance.
     */
    public fun customAttributes(customAttributes: Map<String, String>)

    /**
     * @param instanceId The id of the instance resource.
     */
    public fun instanceId(instanceId: String)

    /**
     * @param ipv4 If the service that you specify contains a template for an A record, the IPv4
     * address that you want AWS Cloud Map to use for the value of the A record.
     */
    public fun ipv4(ipv4: String)

    /**
     * @param ipv6 If the service that you specify contains a template for an AAAA record, the IPv6
     * address that you want AWS Cloud Map to use for the value of the AAAA record.
     */
    public fun ipv6(ipv6: String)

    /**
     * @param port The port on the endpoint that you want AWS Cloud Map to perform health checks on.
     * This value is also used for
     * the port value in an SRV record if the service that you specify includes an SRV record. You
     * can also specify a
     * default port that is applied to all instances in the Service configuration.
     */
    public fun port(port: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps.Builder =
        software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps.builder()

    /**
     * @param customAttributes Custom attributes of the instance.
     */
    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * @param instanceId The id of the instance resource.
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param ipv4 If the service that you specify contains a template for an A record, the IPv4
     * address that you want AWS Cloud Map to use for the value of the A record.
     */
    override fun ipv4(ipv4: String) {
      cdkBuilder.ipv4(ipv4)
    }

    /**
     * @param ipv6 If the service that you specify contains a template for an AAAA record, the IPv6
     * address that you want AWS Cloud Map to use for the value of the AAAA record.
     */
    override fun ipv6(ipv6: String) {
      cdkBuilder.ipv6(ipv6)
    }

    /**
     * @param port The port on the endpoint that you want AWS Cloud Map to perform health checks on.
     * This value is also used for
     * the port value in an SRV record if the service that you specify includes an SRV record. You
     * can also specify a
     * default port that is applied to all instances in the Service configuration.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps,
  ) : CdkObject(cdkObject), IpInstanceBaseProps {
    /**
     * Custom attributes of the instance.
     *
     * Default: none
     */
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    /**
     * The id of the instance resource.
     *
     * Default: Automatically generated name
     */
    override fun instanceId(): String? = unwrap(this).getInstanceId()

    /**
     * If the service that you specify contains a template for an A record, the IPv4 address that
     * you want AWS Cloud Map to use for the value of the A record.
     *
     * Default: none
     */
    override fun ipv4(): String? = unwrap(this).getIpv4()

    /**
     * If the service that you specify contains a template for an AAAA record, the IPv6 address that
     * you want AWS Cloud Map to use for the value of the AAAA record.
     *
     * Default: none
     */
    override fun ipv6(): String? = unwrap(this).getIpv6()

    /**
     * The port on the endpoint that you want AWS Cloud Map to perform health checks on.
     *
     * This value is also used for
     * the port value in an SRV record if the service that you specify includes an SRV record. You
     * can also specify a
     * default port that is applied to all instances in the Service configuration.
     *
     * Default: 80
     */
    override fun port(): Number? = unwrap(this).getPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IpInstanceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps):
        IpInstanceBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IpInstanceBaseProps):
        software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps
  }
}
