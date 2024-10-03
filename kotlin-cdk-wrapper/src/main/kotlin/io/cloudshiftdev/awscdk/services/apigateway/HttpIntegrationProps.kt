@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * VpcLink vpcLink;
 * HttpIntegrationProps httpIntegrationProps = HttpIntegrationProps.builder()
 * .httpMethod("httpMethod")
 * .options(IntegrationOptions.builder()
 * .cacheKeyParameters(List.of("cacheKeyParameters"))
 * .cacheNamespace("cacheNamespace")
 * .connectionType(ConnectionType.INTERNET)
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .credentialsPassthrough(false)
 * .credentialsRole(role)
 * .integrationResponses(List.of(IntegrationResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build()))
 * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .timeout(Duration.minutes(30))
 * .vpcLink(vpcLink)
 * .build())
 * .proxy(false)
 * .build();
 * ```
 */
public interface HttpIntegrationProps {
  /**
   * HTTP method to use when invoking the backend URL.
   *
   * Default: GET
   */
  public fun httpMethod(): String? = unwrap(this).getHttpMethod()

  /**
   * Integration options, such as request/resopnse mapping, content handling, etc.
   *
   * Default: defaults based on `IntegrationOptions` defaults
   */
  public fun options(): IntegrationOptions? =
      unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

  /**
   * Determines whether to use proxy integration or custom integration.
   *
   * Default: true
   */
  public fun proxy(): Boolean? = unwrap(this).getProxy()

  /**
   * A builder for [HttpIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param httpMethod HTTP method to use when invoking the backend URL.
     */
    public fun httpMethod(httpMethod: String)

    /**
     * @param options Integration options, such as request/resopnse mapping, content handling, etc.
     */
    public fun options(options: IntegrationOptions)

    /**
     * @param options Integration options, such as request/resopnse mapping, content handling, etc.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd4642fd9923684248b1bba052795816d170c8ead6b650a15047a9d3961994b8")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    /**
     * @param proxy Determines whether to use proxy integration or custom integration.
     */
    public fun proxy(proxy: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.HttpIntegrationProps.Builder
        = software.amazon.awscdk.services.apigateway.HttpIntegrationProps.builder()

    /**
     * @param httpMethod HTTP method to use when invoking the backend URL.
     */
    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * @param options Integration options, such as request/resopnse mapping, content handling, etc.
     */
    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions.Companion::unwrap))
    }

    /**
     * @param options Integration options, such as request/resopnse mapping, content handling, etc.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd4642fd9923684248b1bba052795816d170c8ead6b650a15047a9d3961994b8")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    /**
     * @param proxy Determines whether to use proxy integration or custom integration.
     */
    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.HttpIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.HttpIntegrationProps,
  ) : CdkObject(cdkObject),
      HttpIntegrationProps {
    /**
     * HTTP method to use when invoking the backend URL.
     *
     * Default: GET
     */
    override fun httpMethod(): String? = unwrap(this).getHttpMethod()

    /**
     * Integration options, such as request/resopnse mapping, content handling, etc.
     *
     * Default: defaults based on `IntegrationOptions` defaults
     */
    override fun options(): IntegrationOptions? =
        unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

    /**
     * Determines whether to use proxy integration or custom integration.
     *
     * Default: true
     */
    override fun proxy(): Boolean? = unwrap(this).getProxy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.HttpIntegrationProps):
        HttpIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as? HttpIntegrationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpIntegrationProps):
        software.amazon.awscdk.services.apigateway.HttpIntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.HttpIntegrationProps
  }
}
