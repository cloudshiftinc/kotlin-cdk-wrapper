@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ResponseHeadersPolicyProps {
  public fun comment(): String? = unwrap(this).getComment()

  public fun corsBehavior(): ResponseHeadersCorsBehavior? =
      unwrap(this).getCorsBehavior()?.let(ResponseHeadersCorsBehavior::wrap)

  public fun customHeadersBehavior(): ResponseCustomHeadersBehavior? =
      unwrap(this).getCustomHeadersBehavior()?.let(ResponseCustomHeadersBehavior::wrap)

  public fun removeHeaders(): List<String> = unwrap(this).getRemoveHeaders() ?: emptyList()

  public fun responseHeadersPolicyName(): String? = unwrap(this).getResponseHeadersPolicyName()

  public fun securityHeadersBehavior(): ResponseSecurityHeadersBehavior? =
      unwrap(this).getSecurityHeadersBehavior()?.let(ResponseSecurityHeadersBehavior::wrap)

  public fun serverTimingSamplingRate(): Number? = unwrap(this).getServerTimingSamplingRate()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("774581af4e60931c98a569b870543c20d3cce2aa7f31e2cc453ddd7b6fe0ba9d")
    public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior.Builder.() -> Unit)

    public fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c60466ec8a83096db32b8b7d8666a2b739e0c91d5e478332c609f749921b210b")
    public
        fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior.Builder.() -> Unit)

    public fun removeHeaders(removeHeaders: List<String>)

    public fun removeHeaders(vararg removeHeaders: String)

    public fun responseHeadersPolicyName(responseHeadersPolicyName: String)

    public fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e1271dc5479359bc5e77e66d0cdf0a10d552e07256897a7c6579049c346489")
    public
        fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior.Builder.() -> Unit)

    public fun serverTimingSamplingRate(serverTimingSamplingRate: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior) {
      cdkBuilder.corsBehavior(corsBehavior.let(ResponseHeadersCorsBehavior::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("774581af4e60931c98a569b870543c20d3cce2aa7f31e2cc453ddd7b6fe0ba9d")
    override fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior.Builder.() -> Unit): Unit =
        corsBehavior(ResponseHeadersCorsBehavior(corsBehavior))

    override fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior) {
      cdkBuilder.customHeadersBehavior(customHeadersBehavior.let(ResponseCustomHeadersBehavior::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c60466ec8a83096db32b8b7d8666a2b739e0c91d5e478332c609f749921b210b")
    override
        fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior.Builder.() -> Unit):
        Unit = customHeadersBehavior(ResponseCustomHeadersBehavior(customHeadersBehavior))

    override fun removeHeaders(removeHeaders: List<String>) {
      cdkBuilder.removeHeaders(removeHeaders)
    }

    override fun removeHeaders(vararg removeHeaders: String): Unit =
        removeHeaders(removeHeaders.toList())

    override fun responseHeadersPolicyName(responseHeadersPolicyName: String) {
      cdkBuilder.responseHeadersPolicyName(responseHeadersPolicyName)
    }

    override fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior) {
      cdkBuilder.securityHeadersBehavior(securityHeadersBehavior.let(ResponseSecurityHeadersBehavior::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e1271dc5479359bc5e77e66d0cdf0a10d552e07256897a7c6579049c346489")
    override
        fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior.Builder.() -> Unit):
        Unit = securityHeadersBehavior(ResponseSecurityHeadersBehavior(securityHeadersBehavior))

    override fun serverTimingSamplingRate(serverTimingSamplingRate: Number) {
      cdkBuilder.serverTimingSamplingRate(serverTimingSamplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps,
  ) : CdkObject(cdkObject), ResponseHeadersPolicyProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun corsBehavior(): ResponseHeadersCorsBehavior? =
        unwrap(this).getCorsBehavior()?.let(ResponseHeadersCorsBehavior::wrap)

    override fun customHeadersBehavior(): ResponseCustomHeadersBehavior? =
        unwrap(this).getCustomHeadersBehavior()?.let(ResponseCustomHeadersBehavior::wrap)

    override fun removeHeaders(): List<String> = unwrap(this).getRemoveHeaders() ?: emptyList()

    override fun responseHeadersPolicyName(): String? = unwrap(this).getResponseHeadersPolicyName()

    override fun securityHeadersBehavior(): ResponseSecurityHeadersBehavior? =
        unwrap(this).getSecurityHeadersBehavior()?.let(ResponseSecurityHeadersBehavior::wrap)

    override fun serverTimingSamplingRate(): Number? = unwrap(this).getServerTimingSamplingRate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps):
        ResponseHeadersPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersPolicyProps):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps
  }
}
