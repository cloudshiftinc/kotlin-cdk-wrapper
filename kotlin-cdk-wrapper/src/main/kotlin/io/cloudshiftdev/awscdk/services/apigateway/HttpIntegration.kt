@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * You can integrate an API method with an HTTP endpoint using the HTTP proxy integration or the
 * HTTP custom integration,.
 *
 * With the proxy integration, the setup is simple. You only need to set the
 * HTTP method and the HTTP endpoint URI, according to the backend requirements,
 * if you are not concerned with content encoding or caching.
 *
 * With the custom integration, the setup is more involved. In addition to the
 * proxy integration setup steps, you need to specify how the incoming request
 * data is mapped to the integration request and how the resulting integration
 * response data is mapped to the method response.
 *
 * Example:
 *
 * ```
 * Function authFn;
 * Resource books;
 * RequestAuthorizer auth = RequestAuthorizer.Builder.create(this, "booksAuthorizer")
 * .handler(authFn)
 * .identitySources(List.of(IdentitySource.header("Authorization")))
 * .build();
 * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
 * .authorizer(auth)
 * .build());
 * ```
 */
public open class HttpIntegration(
  cdkObject: software.amazon.awscdk.services.apigateway.HttpIntegration,
) : Integration(cdkObject) {
  public constructor(url: String) :
      this(software.amazon.awscdk.services.apigateway.HttpIntegration(url)
  )

  public constructor(url: String, props: HttpIntegrationProps) :
      this(software.amazon.awscdk.services.apigateway.HttpIntegration(url,
      props.let(HttpIntegrationProps.Companion::unwrap))
  )

  public constructor(url: String, props: HttpIntegrationProps.Builder.() -> Unit) : this(url,
      HttpIntegrationProps(props)
  )

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.options(options.let(IntegrationOptions.Companion::unwrap))
    }

    /**
     * Integration options, such as request/resopnse mapping, content handling, etc.
     *
     * Default: defaults based on `IntegrationOptions` defaults
     *
     * @param options Integration options, such as request/resopnse mapping, content handling, etc. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
        software.amazon.awscdk.services.apigateway.HttpIntegration = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.HttpIntegration
  }
}
