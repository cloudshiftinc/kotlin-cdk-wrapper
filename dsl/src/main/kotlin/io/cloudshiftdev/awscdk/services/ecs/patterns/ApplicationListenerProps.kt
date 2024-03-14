package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.SslPolicy
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ApplicationListenerProps {
  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  public fun name(): String

  public fun port(): Number? = unwrap(this).getPort()

  public fun protocol(): ApplicationProtocol? =
      unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

  public fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)

  public interface Builder {
    public fun certificate(certificate: ICertificate) {
    }

    public fun name(name: String) {
    }

    public fun port(port: Number) {
    }

    public fun protocol(protocol: ApplicationProtocol) {
    }

    public fun sslPolicy(sslPolicy: SslPolicy) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps.builder()

    public override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    public override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps,
  ) : ApplicationListenerProps {
    public override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    public override fun name(): String = unwrap(this).getName()

    public override fun port(): Number? = unwrap(this).getPort()

    public override fun protocol(): ApplicationProtocol? =
        unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

    public override fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps):
        ApplicationListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationListenerProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps = (wrapped as
        Wrapper).cdkObject
  }
}
