package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ViewerCertificateOptions {
  public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

  public fun securityPolicy(): SecurityPolicyProtocol? =
      unwrap(this).getSecurityPolicy()?.let(SecurityPolicyProtocol::wrap)

  public fun sslMethod(): SSLMethod? = unwrap(this).getSslMethod()?.let(SSLMethod::wrap)

  public interface Builder {
    public fun aliases(aliases: List<String>) {
    }

    public fun securityPolicy(securityPolicy: SecurityPolicyProtocol) {
    }

    public fun sslMethod(sslMethod: SSLMethod) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions.Builder =
        software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions.builder()

    public override fun aliases(aliases: List<String>) {
      cdkBuilder.aliases(aliases)
    }

    public override fun securityPolicy(securityPolicy: SecurityPolicyProtocol) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicyProtocol::unwrap))
    }

    public override fun sslMethod(sslMethod: SSLMethod) {
      cdkBuilder.sslMethod(sslMethod.let(SSLMethod::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions,
  ) : ViewerCertificateOptions {
    public override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    public override fun securityPolicy(): SecurityPolicyProtocol? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicyProtocol::wrap)

    public override fun sslMethod(): SSLMethod? = unwrap(this).getSslMethod()?.let(SSLMethod::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ViewerCertificateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions):
        ViewerCertificateOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ViewerCertificateOptions):
        software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions = (wrapped as
        Wrapper).cdkObject
  }
}
