package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class HttpIntegration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.HttpIntegration,
) : Integration(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.HttpIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * HTTP method to use when invoking the backend URL.
     *
     * Default: GET
     *
     * @param httpMethod HTTP method to use when invoking the backend URL. 
     */
    public fun httpMethod(httpMethod: String)

    /**
     * Integration options, such as request/resopnse mapping, content handling, etc.
     *
     * Default: defaults based on `IntegrationOptions` defaults
     *
     * @param options Integration options, such as request/resopnse mapping, content handling, etc. 
     */
    public fun options(options: IntegrationOptions)

    /**
     * Integration options, such as request/resopnse mapping, content handling, etc.
     *
     * Default: defaults based on `IntegrationOptions` defaults
     *
     * @param options Integration options, such as request/resopnse mapping, content handling, etc. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52e99b87b56780b593ff5ee05aeaa9155ae3f328109f4ed9ba5f84ddf2afac8e")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    /**
     * Determines whether to use proxy integration or custom integration.
     *
     * Default: true
     *
     * @param proxy Determines whether to use proxy integration or custom integration. 
     */
    public fun proxy(proxy: Boolean)
  }

  private class BuilderImpl(
    url: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.HttpIntegration.Builder =
        software.amazon.awscdk.services.apigateway.HttpIntegration.Builder.create(url)

    /**
     * HTTP method to use when invoking the backend URL.
     *
     * Default: GET
     *
     * @param httpMethod HTTP method to use when invoking the backend URL. 
     */
    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * Integration options, such as request/resopnse mapping, content handling, etc.
     *
     * Default: defaults based on `IntegrationOptions` defaults
     *
     * @param options Integration options, such as request/resopnse mapping, content handling, etc. 
     */
    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    /**
     * Integration options, such as request/resopnse mapping, content handling, etc.
     *
     * Default: defaults based on `IntegrationOptions` defaults
     *
     * @param options Integration options, such as request/resopnse mapping, content handling, etc. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52e99b87b56780b593ff5ee05aeaa9155ae3f328109f4ed9ba5f84ddf2afac8e")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    /**
     * Determines whether to use proxy integration or custom integration.
     *
     * Default: true
     *
     * @param proxy Determines whether to use proxy integration or custom integration. 
     */
    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.HttpIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(url: String, block: Builder.() -> Unit = {}): HttpIntegration {
      val builderImpl = BuilderImpl(url)
      return HttpIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.HttpIntegration):
        HttpIntegration = HttpIntegration(cdkObject)

    internal fun unwrap(wrapped: HttpIntegration):
        software.amazon.awscdk.services.apigateway.HttpIntegration = wrapped.cdkObject
  }
}
