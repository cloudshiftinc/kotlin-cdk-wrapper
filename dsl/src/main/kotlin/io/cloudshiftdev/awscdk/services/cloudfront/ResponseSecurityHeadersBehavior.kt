package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ResponseSecurityHeadersBehavior {
  public fun contentSecurityPolicy(): ResponseHeadersContentSecurityPolicy? =
      unwrap(this).getContentSecurityPolicy()?.let(ResponseHeadersContentSecurityPolicy::wrap)

  public fun contentTypeOptions(): ResponseHeadersContentTypeOptions? =
      unwrap(this).getContentTypeOptions()?.let(ResponseHeadersContentTypeOptions::wrap)

  public fun frameOptions(): ResponseHeadersFrameOptions? =
      unwrap(this).getFrameOptions()?.let(ResponseHeadersFrameOptions::wrap)

  public fun referrerPolicy(): ResponseHeadersReferrerPolicy? =
      unwrap(this).getReferrerPolicy()?.let(ResponseHeadersReferrerPolicy::wrap)

  public fun strictTransportSecurity(): ResponseHeadersStrictTransportSecurity? =
      unwrap(this).getStrictTransportSecurity()?.let(ResponseHeadersStrictTransportSecurity::wrap)

  public fun xssProtection(): ResponseHeadersXSSProtection? =
      unwrap(this).getXssProtection()?.let(ResponseHeadersXSSProtection::wrap)

  public interface Builder {
    public fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicy) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4691b7e17deed9234f88e371d2fd4f2cdc1e3008734107215e3638b828781253")
    public
        fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicy.Builder.() -> Unit) {
    }

    public fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c7723249f91a1b8d76ea3f11769add9c12d828245f4085fb3dda121a29a599d")
    public
        fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptions.Builder.() -> Unit) {
    }

    public fun frameOptions(frameOptions: ResponseHeadersFrameOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4e0ee8bff853133fe451dd43f5202e78923c3f577dba61a0f4a60a279ca504e")
    public fun frameOptions(frameOptions: ResponseHeadersFrameOptions.Builder.() -> Unit) {
    }

    public fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicy) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b14e34c5214b5a308999a1860760626edd1b7526e04b89ac2275e7d8fe09e3b")
    public fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicy.Builder.() -> Unit) {
    }

    public
        fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurity) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61958670128d24fd79540494d747b3f30fcd951f3b47cc3cecbd6525d7f6cb2c")
    public
        fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurity.Builder.() -> Unit) {
    }

    public fun xssProtection(xssProtection: ResponseHeadersXSSProtection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7f0b03c4e7bdbd6b79eb5caf3e6a79547ee2ca95299ee4ac9f768025e39684f")
    public fun xssProtection(xssProtection: ResponseHeadersXSSProtection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior.builder()

    public override
        fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicy) {
      cdkBuilder.contentSecurityPolicy(contentSecurityPolicy.let(ResponseHeadersContentSecurityPolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4691b7e17deed9234f88e371d2fd4f2cdc1e3008734107215e3638b828781253")
    public override
        fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicy.Builder.() -> Unit):
        Unit = contentSecurityPolicy(ResponseHeadersContentSecurityPolicy(contentSecurityPolicy))

    public override fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptions) {
      cdkBuilder.contentTypeOptions(contentTypeOptions.let(ResponseHeadersContentTypeOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c7723249f91a1b8d76ea3f11769add9c12d828245f4085fb3dda121a29a599d")
    public override
        fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptions.Builder.() -> Unit):
        Unit = contentTypeOptions(ResponseHeadersContentTypeOptions(contentTypeOptions))

    public override fun frameOptions(frameOptions: ResponseHeadersFrameOptions) {
      cdkBuilder.frameOptions(frameOptions.let(ResponseHeadersFrameOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4e0ee8bff853133fe451dd43f5202e78923c3f577dba61a0f4a60a279ca504e")
    public override fun frameOptions(frameOptions: ResponseHeadersFrameOptions.Builder.() -> Unit):
        Unit = frameOptions(ResponseHeadersFrameOptions(frameOptions))

    public override fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicy) {
      cdkBuilder.referrerPolicy(referrerPolicy.let(ResponseHeadersReferrerPolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b14e34c5214b5a308999a1860760626edd1b7526e04b89ac2275e7d8fe09e3b")
    public override
        fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicy.Builder.() -> Unit): Unit =
        referrerPolicy(ResponseHeadersReferrerPolicy(referrerPolicy))

    public override
        fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurity) {
      cdkBuilder.strictTransportSecurity(strictTransportSecurity.let(ResponseHeadersStrictTransportSecurity::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61958670128d24fd79540494d747b3f30fcd951f3b47cc3cecbd6525d7f6cb2c")
    public override
        fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurity.Builder.() -> Unit):
        Unit =
        strictTransportSecurity(ResponseHeadersStrictTransportSecurity(strictTransportSecurity))

    public override fun xssProtection(xssProtection: ResponseHeadersXSSProtection) {
      cdkBuilder.xssProtection(xssProtection.let(ResponseHeadersXSSProtection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7f0b03c4e7bdbd6b79eb5caf3e6a79547ee2ca95299ee4ac9f768025e39684f")
    public override
        fun xssProtection(xssProtection: ResponseHeadersXSSProtection.Builder.() -> Unit): Unit =
        xssProtection(ResponseHeadersXSSProtection(xssProtection))

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior,
  ) : ResponseSecurityHeadersBehavior {
    public override fun contentSecurityPolicy(): ResponseHeadersContentSecurityPolicy? =
        unwrap(this).getContentSecurityPolicy()?.let(ResponseHeadersContentSecurityPolicy::wrap)

    public override fun contentTypeOptions(): ResponseHeadersContentTypeOptions? =
        unwrap(this).getContentTypeOptions()?.let(ResponseHeadersContentTypeOptions::wrap)

    public override fun frameOptions(): ResponseHeadersFrameOptions? =
        unwrap(this).getFrameOptions()?.let(ResponseHeadersFrameOptions::wrap)

    public override fun referrerPolicy(): ResponseHeadersReferrerPolicy? =
        unwrap(this).getReferrerPolicy()?.let(ResponseHeadersReferrerPolicy::wrap)

    public override fun strictTransportSecurity(): ResponseHeadersStrictTransportSecurity? =
        unwrap(this).getStrictTransportSecurity()?.let(ResponseHeadersStrictTransportSecurity::wrap)

    public override fun xssProtection(): ResponseHeadersXSSProtection? =
        unwrap(this).getXssProtection()?.let(ResponseHeadersXSSProtection::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseSecurityHeadersBehavior {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior):
        ResponseSecurityHeadersBehavior = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseSecurityHeadersBehavior):
        software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior = (wrapped as
        Wrapper).cdkObject
  }
}
