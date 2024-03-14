package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ResponseHeadersCorsBehavior {
  public fun accessControlAllowCredentials(): Boolean

  public fun accessControlAllowHeaders(): List<String>

  public fun accessControlAllowMethods(): List<String>

  public fun accessControlAllowOrigins(): List<String>

  public fun accessControlExposeHeaders(): List<String> =
      unwrap(this).getAccessControlExposeHeaders() ?: emptyList()

  public fun accessControlMaxAge(): Duration? =
      unwrap(this).getAccessControlMaxAge()?.let(Duration::wrap)

  public fun originOverride(): Boolean

  public interface Builder {
    public fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean)

    public fun accessControlAllowHeaders(accessControlAllowHeaders: List<String>)

    public fun accessControlAllowHeaders(vararg accessControlAllowHeaders: String)

    public fun accessControlAllowMethods(accessControlAllowMethods: List<String>)

    public fun accessControlAllowMethods(vararg accessControlAllowMethods: String)

    public fun accessControlAllowOrigins(accessControlAllowOrigins: List<String>)

    public fun accessControlAllowOrigins(vararg accessControlAllowOrigins: String)

    public fun accessControlExposeHeaders(accessControlExposeHeaders: List<String>)

    public fun accessControlExposeHeaders(vararg accessControlExposeHeaders: String)

    public fun accessControlMaxAge(accessControlMaxAge: Duration)

    public fun originOverride(originOverride: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior.builder()

    override fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean) {
      cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
    }

    override fun accessControlAllowHeaders(accessControlAllowHeaders: List<String>) {
      cdkBuilder.accessControlAllowHeaders(accessControlAllowHeaders)
    }

    override fun accessControlAllowHeaders(vararg accessControlAllowHeaders: String): Unit =
        accessControlAllowHeaders(accessControlAllowHeaders.toList())

    override fun accessControlAllowMethods(accessControlAllowMethods: List<String>) {
      cdkBuilder.accessControlAllowMethods(accessControlAllowMethods)
    }

    override fun accessControlAllowMethods(vararg accessControlAllowMethods: String): Unit =
        accessControlAllowMethods(accessControlAllowMethods.toList())

    override fun accessControlAllowOrigins(accessControlAllowOrigins: List<String>) {
      cdkBuilder.accessControlAllowOrigins(accessControlAllowOrigins)
    }

    override fun accessControlAllowOrigins(vararg accessControlAllowOrigins: String): Unit =
        accessControlAllowOrigins(accessControlAllowOrigins.toList())

    override fun accessControlExposeHeaders(accessControlExposeHeaders: List<String>) {
      cdkBuilder.accessControlExposeHeaders(accessControlExposeHeaders)
    }

    override fun accessControlExposeHeaders(vararg accessControlExposeHeaders: String): Unit =
        accessControlExposeHeaders(accessControlExposeHeaders.toList())

    override fun accessControlMaxAge(accessControlMaxAge: Duration) {
      cdkBuilder.accessControlMaxAge(accessControlMaxAge.let(Duration::unwrap))
    }

    override fun originOverride(originOverride: Boolean) {
      cdkBuilder.originOverride(originOverride)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior,
  ) : ResponseHeadersCorsBehavior {
    override fun accessControlAllowCredentials(): Boolean =
        unwrap(this).getAccessControlAllowCredentials()

    override fun accessControlAllowHeaders(): List<String> =
        unwrap(this).getAccessControlAllowHeaders()

    override fun accessControlAllowMethods(): List<String> =
        unwrap(this).getAccessControlAllowMethods()

    override fun accessControlAllowOrigins(): List<String> =
        unwrap(this).getAccessControlAllowOrigins()

    override fun accessControlExposeHeaders(): List<String> =
        unwrap(this).getAccessControlExposeHeaders() ?: emptyList()

    override fun accessControlMaxAge(): Duration? =
        unwrap(this).getAccessControlMaxAge()?.let(Duration::wrap)

    override fun originOverride(): Boolean = unwrap(this).getOriginOverride()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersCorsBehavior {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior):
        ResponseHeadersCorsBehavior = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersCorsBehavior):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior = (wrapped as
        Wrapper).cdkObject
  }
}
