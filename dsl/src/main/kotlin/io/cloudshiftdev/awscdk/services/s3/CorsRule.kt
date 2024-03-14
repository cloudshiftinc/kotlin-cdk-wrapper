package io.cloudshiftdev.awscdk.services.s3

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CorsRule {
  public fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

  public fun allowedMethods(): List<HttpMethods>

  public fun allowedOrigins(): List<String>

  public fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

  public fun id(): String? = unwrap(this).getId()

  public fun maxAge(): Number? = unwrap(this).getMaxAge()

  public interface Builder {
    public fun allowedHeaders(allowedHeaders: List<String>)

    public fun allowedHeaders(vararg allowedHeaders: String)

    public fun allowedMethods(allowedMethods: List<HttpMethods>)

    public fun allowedMethods(vararg allowedMethods: HttpMethods)

    public fun allowedOrigins(allowedOrigins: List<String>)

    public fun allowedOrigins(vararg allowedOrigins: String)

    public fun exposedHeaders(exposedHeaders: List<String>)

    public fun exposedHeaders(vararg exposedHeaders: String)

    public fun id(id: String)

    public fun maxAge(maxAge: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CorsRule.Builder =
        software.amazon.awscdk.services.s3.CorsRule.builder()

    override fun allowedHeaders(allowedHeaders: List<String>) {
      cdkBuilder.allowedHeaders(allowedHeaders)
    }

    override fun allowedHeaders(vararg allowedHeaders: String): Unit =
        allowedHeaders(allowedHeaders.toList())

    override fun allowedMethods(allowedMethods: List<HttpMethods>) {
      cdkBuilder.allowedMethods(allowedMethods.map(HttpMethods::unwrap))
    }

    override fun allowedMethods(vararg allowedMethods: HttpMethods): Unit =
        allowedMethods(allowedMethods.toList())

    override fun allowedOrigins(allowedOrigins: List<String>) {
      cdkBuilder.allowedOrigins(allowedOrigins)
    }

    override fun allowedOrigins(vararg allowedOrigins: String): Unit =
        allowedOrigins(allowedOrigins.toList())

    override fun exposedHeaders(exposedHeaders: List<String>) {
      cdkBuilder.exposedHeaders(exposedHeaders)
    }

    override fun exposedHeaders(vararg exposedHeaders: String): Unit =
        exposedHeaders(exposedHeaders.toList())

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun maxAge(maxAge: Number) {
      cdkBuilder.maxAge(maxAge)
    }

    public fun build(): software.amazon.awscdk.services.s3.CorsRule = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.CorsRule,
  ) : CorsRule {
    override fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

    override fun allowedMethods(): List<HttpMethods> =
        unwrap(this).getAllowedMethods().map(HttpMethods::wrap)

    override fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins()

    override fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

    override fun id(): String? = unwrap(this).getId()

    override fun maxAge(): Number? = unwrap(this).getMaxAge()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CorsRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CorsRule): CorsRule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CorsRule): software.amazon.awscdk.services.s3.CorsRule = (wrapped
        as Wrapper).cdkObject
  }
}
