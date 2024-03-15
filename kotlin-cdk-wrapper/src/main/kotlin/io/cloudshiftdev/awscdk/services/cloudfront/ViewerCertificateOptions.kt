@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ViewerCertificateOptions {
  public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

  public fun securityPolicy(): SecurityPolicyProtocol? =
      unwrap(this).getSecurityPolicy()?.let(SecurityPolicyProtocol::wrap)

  public fun sslMethod(): SSLMethod? = unwrap(this).getSslMethod()?.let(SSLMethod::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun aliases(aliases: List<String>)

    public fun aliases(vararg aliases: String)

    public fun securityPolicy(securityPolicy: SecurityPolicyProtocol)

    public fun sslMethod(sslMethod: SSLMethod)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions.Builder =
        software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions.builder()

    override fun aliases(aliases: List<String>) {
      cdkBuilder.aliases(aliases)
    }

    override fun aliases(vararg aliases: String): Unit = aliases(aliases.toList())

    override fun securityPolicy(securityPolicy: SecurityPolicyProtocol) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicyProtocol::unwrap))
    }

    override fun sslMethod(sslMethod: SSLMethod) {
      cdkBuilder.sslMethod(sslMethod.let(SSLMethod::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions,
  ) : CdkObject(cdkObject), ViewerCertificateOptions {
    override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    override fun securityPolicy(): SecurityPolicyProtocol? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicyProtocol::wrap)

    override fun sslMethod(): SSLMethod? = unwrap(this).getSslMethod()?.let(SSLMethod::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ViewerCertificateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions):
        ViewerCertificateOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ViewerCertificateOptions):
        software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions
  }
}
