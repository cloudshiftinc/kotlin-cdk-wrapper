@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.SslPolicy
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties to define an application listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * Certificate certificate;
 * ApplicationListenerProps applicationListenerProps = ApplicationListenerProps.builder()
 * .name("name")
 * // the properties below are optional
 * .certificate(certificate)
 * .port(123)
 * .protocol(ApplicationProtocol.HTTP)
 * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
 * .build();
 * ```
 */
public interface ApplicationListenerProps {
  /**
   * Certificate Manager certificate to associate with the load balancer.
   *
   * Setting this option will set the load balancer protocol to HTTPS.
   *
   * Default: - No certificate associated with the load balancer, if using
   * the HTTP protocol. For HTTPS, a DNS-validated certificate will be
   * created for the load balancer's specified domain name.
   */
  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  /**
   * Name of the listener.
   */
  public fun name(): String

  /**
   * The port on which the listener listens for requests.
   *
   * Default: - Determined from protocol if known.
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The protocol for connections from clients to the load balancer.
   *
   * The load balancer port is determined from the protocol (port 80 for
   * HTTP, port 443 for HTTPS).  A domain name and zone must be also be
   * specified if using HTTPS.
   *
   * Default: ApplicationProtocol.HTTP. If a certificate is specified, the protocol will be
   * set by default to ApplicationProtocol.HTTPS.
   */
  public fun protocol(): ApplicationProtocol? =
      unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

  /**
   * The security policy that defines which ciphers and protocols are supported by the ALB Listener.
   *
   * Default: - The recommended elastic load balancing security policy
   */
  public fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)

  /**
   * A builder for [ApplicationListenerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificate Certificate Manager certificate to associate with the load balancer.
     * Setting this option will set the load balancer protocol to HTTPS.
     */
    public fun certificate(certificate: ICertificate)

    /**
     * @param name Name of the listener. 
     */
    public fun name(name: String)

    /**
     * @param port The port on which the listener listens for requests.
     */
    public fun port(port: Number)

    /**
     * @param protocol The protocol for connections from clients to the load balancer.
     * The load balancer port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).  A domain name and zone must be also be
     * specified if using HTTPS.
     */
    public fun protocol(protocol: ApplicationProtocol)

    /**
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported
     * by the ALB Listener.
     */
    public fun sslPolicy(sslPolicy: SslPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps.builder()

    /**
     * @param certificate Certificate Manager certificate to associate with the load balancer.
     * Setting this option will set the load balancer protocol to HTTPS.
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * @param name Name of the listener. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param port The port on which the listener listens for requests.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol for connections from clients to the load balancer.
     * The load balancer port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).  A domain name and zone must be also be
     * specified if using HTTPS.
     */
    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    /**
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported
     * by the ALB Listener.
     */
    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps,
  ) : CdkObject(cdkObject), ApplicationListenerProps {
    /**
     * Certificate Manager certificate to associate with the load balancer.
     *
     * Setting this option will set the load balancer protocol to HTTPS.
     *
     * Default: - No certificate associated with the load balancer, if using
     * the HTTP protocol. For HTTPS, a DNS-validated certificate will be
     * created for the load balancer's specified domain name.
     */
    override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    /**
     * Name of the listener.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The port on which the listener listens for requests.
     *
     * Default: - Determined from protocol if known.
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The protocol for connections from clients to the load balancer.
     *
     * The load balancer port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).  A domain name and zone must be also be
     * specified if using HTTPS.
     *
     * Default: ApplicationProtocol.HTTP. If a certificate is specified, the protocol will be
     * set by default to ApplicationProtocol.HTTPS.
     */
    override fun protocol(): ApplicationProtocol? =
        unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

    /**
     * The security policy that defines which ciphers and protocols are supported by the ALB
     * Listener.
     *
     * Default: - The recommended elastic load balancing security policy
     */
    override fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps):
        ApplicationListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationListenerProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps
  }
}
