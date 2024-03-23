@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Specifies a cross-origin access rule for an Amazon S3 bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * CorsRule corsRule = CorsRule.builder()
 * .allowedMethods(List.of(HttpMethods.GET))
 * .allowedOrigins(List.of("allowedOrigins"))
 * // the properties below are optional
 * .allowedHeaders(List.of("allowedHeaders"))
 * .exposedHeaders(List.of("exposedHeaders"))
 * .id("id")
 * .maxAge(123)
 * .build();
 * ```
 */
public interface CorsRule {
  /**
   * Headers that are specified in the Access-Control-Request-Headers header.
   *
   * Default: - No headers allowed.
   */
  public fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

  /**
   * An HTTP method that you allow the origin to execute.
   */
  public fun allowedMethods(): List<HttpMethods>

  /**
   * One or more origins you want customers to be able to access the bucket from.
   */
  public fun allowedOrigins(): List<String>

  /**
   * One or more headers in the response that you want customers to be able to access from their
   * applications.
   *
   * Default: - No headers exposed.
   */
  public fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

  /**
   * A unique identifier for this rule.
   *
   * Default: - No id specified.
   */
  public fun id(): String? = unwrap(this).getId()

  /**
   * The time in seconds that your browser is to cache the preflight response for the specified
   * resource.
   *
   * Default: - No caching.
   */
  public fun maxAge(): Number? = unwrap(this).getMaxAge()

  /**
   * A builder for [CorsRule]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers
     * header.
     */
    public fun allowedHeaders(allowedHeaders: List<String>)

    /**
     * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers
     * header.
     */
    public fun allowedHeaders(vararg allowedHeaders: String)

    /**
     * @param allowedMethods An HTTP method that you allow the origin to execute. 
     */
    public fun allowedMethods(allowedMethods: List<HttpMethods>)

    /**
     * @param allowedMethods An HTTP method that you allow the origin to execute. 
     */
    public fun allowedMethods(vararg allowedMethods: HttpMethods)

    /**
     * @param allowedOrigins One or more origins you want customers to be able to access the bucket
     * from. 
     */
    public fun allowedOrigins(allowedOrigins: List<String>)

    /**
     * @param allowedOrigins One or more origins you want customers to be able to access the bucket
     * from. 
     */
    public fun allowedOrigins(vararg allowedOrigins: String)

    /**
     * @param exposedHeaders One or more headers in the response that you want customers to be able
     * to access from their applications.
     */
    public fun exposedHeaders(exposedHeaders: List<String>)

    /**
     * @param exposedHeaders One or more headers in the response that you want customers to be able
     * to access from their applications.
     */
    public fun exposedHeaders(vararg exposedHeaders: String)

    /**
     * @param id A unique identifier for this rule.
     */
    public fun id(id: String)

    /**
     * @param maxAge The time in seconds that your browser is to cache the preflight response for
     * the specified resource.
     */
    public fun maxAge(maxAge: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CorsRule.Builder =
        software.amazon.awscdk.services.s3.CorsRule.builder()

    /**
     * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers
     * header.
     */
    override fun allowedHeaders(allowedHeaders: List<String>) {
      cdkBuilder.allowedHeaders(allowedHeaders)
    }

    /**
     * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers
     * header.
     */
    override fun allowedHeaders(vararg allowedHeaders: String): Unit =
        allowedHeaders(allowedHeaders.toList())

    /**
     * @param allowedMethods An HTTP method that you allow the origin to execute. 
     */
    override fun allowedMethods(allowedMethods: List<HttpMethods>) {
      cdkBuilder.allowedMethods(allowedMethods.map(HttpMethods::unwrap))
    }

    /**
     * @param allowedMethods An HTTP method that you allow the origin to execute. 
     */
    override fun allowedMethods(vararg allowedMethods: HttpMethods): Unit =
        allowedMethods(allowedMethods.toList())

    /**
     * @param allowedOrigins One or more origins you want customers to be able to access the bucket
     * from. 
     */
    override fun allowedOrigins(allowedOrigins: List<String>) {
      cdkBuilder.allowedOrigins(allowedOrigins)
    }

    /**
     * @param allowedOrigins One or more origins you want customers to be able to access the bucket
     * from. 
     */
    override fun allowedOrigins(vararg allowedOrigins: String): Unit =
        allowedOrigins(allowedOrigins.toList())

    /**
     * @param exposedHeaders One or more headers in the response that you want customers to be able
     * to access from their applications.
     */
    override fun exposedHeaders(exposedHeaders: List<String>) {
      cdkBuilder.exposedHeaders(exposedHeaders)
    }

    /**
     * @param exposedHeaders One or more headers in the response that you want customers to be able
     * to access from their applications.
     */
    override fun exposedHeaders(vararg exposedHeaders: String): Unit =
        exposedHeaders(exposedHeaders.toList())

    /**
     * @param id A unique identifier for this rule.
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param maxAge The time in seconds that your browser is to cache the preflight response for
     * the specified resource.
     */
    override fun maxAge(maxAge: Number) {
      cdkBuilder.maxAge(maxAge)
    }

    public fun build(): software.amazon.awscdk.services.s3.CorsRule = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.CorsRule,
  ) : CdkObject(cdkObject), CorsRule {
    /**
     * Headers that are specified in the Access-Control-Request-Headers header.
     *
     * Default: - No headers allowed.
     */
    override fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

    /**
     * An HTTP method that you allow the origin to execute.
     */
    override fun allowedMethods(): List<HttpMethods> =
        unwrap(this).getAllowedMethods().map(HttpMethods::wrap)

    /**
     * One or more origins you want customers to be able to access the bucket from.
     */
    override fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins()

    /**
     * One or more headers in the response that you want customers to be able to access from their
     * applications.
     *
     * Default: - No headers exposed.
     */
    override fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

    /**
     * A unique identifier for this rule.
     *
     * Default: - No id specified.
     */
    override fun id(): String? = unwrap(this).getId()

    /**
     * The time in seconds that your browser is to cache the preflight response for the specified
     * resource.
     *
     * Default: - No caching.
     */
    override fun maxAge(): Number? = unwrap(this).getMaxAge()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CorsRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CorsRule): CorsRule =
        CdkObjectWrappers.wrap(cdkObject) as? CorsRule ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CorsRule): software.amazon.awscdk.services.s3.CorsRule = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.s3.CorsRule
  }
}
