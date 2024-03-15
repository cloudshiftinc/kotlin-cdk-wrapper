@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * AwsIntegration getMessageIntegration = AwsIntegration.Builder.create()
 * .service("sqs")
 * .path("queueName")
 * .region("eu-west-1")
 * .build();
 * ```
 */
public interface AwsIntegrationProps {
  /**
   * The AWS action to perform in the integration.
   *
   * Use `actionParams` to specify key-value params for the action.
   *
   * Mutually exclusive with `path`.
   */
  public fun action(): String? = unwrap(this).getAction()

  /**
   * Parameters for the action.
   *
   * `action` must be set, and `path` must be undefined.
   * The action params will be URL encoded.
   */
  public fun actionParameters(): Map<String, String> = unwrap(this).getActionParameters() ?:
      emptyMap()

  /**
   * The integration's HTTP method type.
   *
   * Default: POST
   */
  public fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

  /**
   * Integration options, such as content handling, request/response mapping, etc.
   */
  public fun options(): IntegrationOptions? =
      unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

  /**
   * The path to use for path-base APIs.
   *
   * For example, for S3 GET, you can set path to `bucket/key`.
   * For lambda, you can set path to `2015-03-31/functions/${function-arn}/invocations`
   *
   * Mutually exclusive with the `action` options.
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * Use AWS_PROXY integration.
   *
   * Default: false
   */
  public fun proxy(): Boolean? = unwrap(this).getProxy()

  /**
   * The region of the integrated AWS service.
   *
   * Default: - same region as the stack
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * The name of the integrated AWS service (e.g. `s3`).
   */
  public fun service(): String

  /**
   * A designated subdomain supported by certain AWS service for fast host-name lookup.
   */
  public fun subdomain(): String? = unwrap(this).getSubdomain()

  /**
   * A builder for [AwsIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The AWS action to perform in the integration.
     * Use `actionParams` to specify key-value params for the action.
     *
     * Mutually exclusive with `path`.
     */
    public fun action(action: String)

    /**
     * @param actionParameters Parameters for the action.
     * `action` must be set, and `path` must be undefined.
     * The action params will be URL encoded.
     */
    public fun actionParameters(actionParameters: Map<String, String>)

    /**
     * @param integrationHttpMethod The integration's HTTP method type.
     */
    public fun integrationHttpMethod(integrationHttpMethod: String)

    /**
     * @param options Integration options, such as content handling, request/response mapping, etc.
     */
    public fun options(options: IntegrationOptions)

    /**
     * @param options Integration options, such as content handling, request/response mapping, etc.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01aec5e89ef73ff89679e7c8d6d3287c0c91bd5a53b12f0480b9dec344bfc27d")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    /**
     * @param path The path to use for path-base APIs.
     * For example, for S3 GET, you can set path to `bucket/key`.
     * For lambda, you can set path to `2015-03-31/functions/${function-arn}/invocations`
     *
     * Mutually exclusive with the `action` options.
     */
    public fun path(path: String)

    /**
     * @param proxy Use AWS_PROXY integration.
     */
    public fun proxy(proxy: Boolean)

    /**
     * @param region The region of the integrated AWS service.
     */
    public fun region(region: String)

    /**
     * @param service The name of the integrated AWS service (e.g. `s3`). 
     */
    public fun service(service: String)

    /**
     * @param subdomain A designated subdomain supported by certain AWS service for fast host-name
     * lookup.
     */
    public fun subdomain(subdomain: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.AwsIntegrationProps.Builder =
        software.amazon.awscdk.services.apigateway.AwsIntegrationProps.builder()

    /**
     * @param action The AWS action to perform in the integration.
     * Use `actionParams` to specify key-value params for the action.
     *
     * Mutually exclusive with `path`.
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param actionParameters Parameters for the action.
     * `action` must be set, and `path` must be undefined.
     * The action params will be URL encoded.
     */
    override fun actionParameters(actionParameters: Map<String, String>) {
      cdkBuilder.actionParameters(actionParameters)
    }

    /**
     * @param integrationHttpMethod The integration's HTTP method type.
     */
    override fun integrationHttpMethod(integrationHttpMethod: String) {
      cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    /**
     * @param options Integration options, such as content handling, request/response mapping, etc.
     */
    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    /**
     * @param options Integration options, such as content handling, request/response mapping, etc.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01aec5e89ef73ff89679e7c8d6d3287c0c91bd5a53b12f0480b9dec344bfc27d")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    /**
     * @param path The path to use for path-base APIs.
     * For example, for S3 GET, you can set path to `bucket/key`.
     * For lambda, you can set path to `2015-03-31/functions/${function-arn}/invocations`
     *
     * Mutually exclusive with the `action` options.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param proxy Use AWS_PROXY integration.
     */
    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    /**
     * @param region The region of the integrated AWS service.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param service The name of the integrated AWS service (e.g. `s3`). 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    /**
     * @param subdomain A designated subdomain supported by certain AWS service for fast host-name
     * lookup.
     */
    override fun subdomain(subdomain: String) {
      cdkBuilder.subdomain(subdomain)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.AwsIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.AwsIntegrationProps,
  ) : CdkObject(cdkObject), AwsIntegrationProps {
    /**
     * The AWS action to perform in the integration.
     *
     * Use `actionParams` to specify key-value params for the action.
     *
     * Mutually exclusive with `path`.
     */
    override fun action(): String? = unwrap(this).getAction()

    /**
     * Parameters for the action.
     *
     * `action` must be set, and `path` must be undefined.
     * The action params will be URL encoded.
     */
    override fun actionParameters(): Map<String, String> = unwrap(this).getActionParameters() ?:
        emptyMap()

    /**
     * The integration's HTTP method type.
     *
     * Default: POST
     */
    override fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

    /**
     * Integration options, such as content handling, request/response mapping, etc.
     */
    override fun options(): IntegrationOptions? =
        unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

    /**
     * The path to use for path-base APIs.
     *
     * For example, for S3 GET, you can set path to `bucket/key`.
     * For lambda, you can set path to `2015-03-31/functions/${function-arn}/invocations`
     *
     * Mutually exclusive with the `action` options.
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * Use AWS_PROXY integration.
     *
     * Default: false
     */
    override fun proxy(): Boolean? = unwrap(this).getProxy()

    /**
     * The region of the integrated AWS service.
     *
     * Default: - same region as the stack
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * The name of the integrated AWS service (e.g. `s3`).
     */
    override fun service(): String = unwrap(this).getService()

    /**
     * A designated subdomain supported by certain AWS service for fast host-name lookup.
     */
    override fun subdomain(): String? = unwrap(this).getSubdomain()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AwsIntegrationProps):
        AwsIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsIntegrationProps):
        software.amazon.awscdk.services.apigateway.AwsIntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.AwsIntegrationProps
  }
}
