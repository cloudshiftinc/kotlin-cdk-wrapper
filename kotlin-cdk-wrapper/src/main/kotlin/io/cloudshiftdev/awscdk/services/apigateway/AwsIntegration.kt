@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * This type of integration lets an API expose AWS service actions.
 *
 * It is
 * intended for calling all AWS service actions, but is not recommended for
 * calling a Lambda function, because the Lambda custom integration is a legacy
 * technology.
 *
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
public open class AwsIntegration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.AwsIntegration,
) : Integration(cdkObject) {
  public constructor(props: AwsIntegrationProps) :
      this(software.amazon.awscdk.services.apigateway.AwsIntegration(props.let(AwsIntegrationProps::unwrap))
  )

  public constructor(props: AwsIntegrationProps.Builder.() -> Unit) :
      this(AwsIntegrationProps(props)
  )

  /**
   * Can be overridden by subclasses to allow the integration to interact with the method being
   * integrated, access the REST API object, method ARNs, etc.
   *
   * @param method 
   */
  public override fun bind(method: Method): IntegrationConfig =
      unwrap(this).bind(method.let(Method::unwrap)).let(IntegrationConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.AwsIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS action to perform in the integration.
     *
     * Use `actionParams` to specify key-value params for the action.
     *
     * Mutually exclusive with `path`.
     *
     * @param action The AWS action to perform in the integration. 
     */
    public fun action(action: String)

    /**
     * Parameters for the action.
     *
     * `action` must be set, and `path` must be undefined.
     * The action params will be URL encoded.
     *
     * @param actionParameters Parameters for the action. 
     */
    public fun actionParameters(actionParameters: Map<String, String>)

    /**
     * The integration's HTTP method type.
     *
     * Default: POST
     *
     * @param integrationHttpMethod The integration's HTTP method type. 
     */
    public fun integrationHttpMethod(integrationHttpMethod: String)

    /**
     * Integration options, such as content handling, request/response mapping, etc.
     *
     * @param options Integration options, such as content handling, request/response mapping, etc. 
     */
    public fun options(options: IntegrationOptions)

    /**
     * Integration options, such as content handling, request/response mapping, etc.
     *
     * @param options Integration options, such as content handling, request/response mapping, etc. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ce81aaca0d9bc53166da2caa5cd20f16fc9dbb134d40a08b9c3aa7299dd7fe5")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    /**
     * The path to use for path-base APIs.
     *
     * For example, for S3 GET, you can set path to `bucket/key`.
     * For lambda, you can set path to `2015-03-31/functions/${function-arn}/invocations`
     *
     * Mutually exclusive with the `action` options.
     *
     * @param path The path to use for path-base APIs. 
     */
    public fun path(path: String)

    /**
     * Use AWS_PROXY integration.
     *
     * Default: false
     *
     * @param proxy Use AWS_PROXY integration. 
     */
    public fun proxy(proxy: Boolean)

    /**
     * The region of the integrated AWS service.
     *
     * Default: - same region as the stack
     *
     * @param region The region of the integrated AWS service. 
     */
    public fun region(region: String)

    /**
     * The name of the integrated AWS service (e.g. `s3`).
     *
     * @param service The name of the integrated AWS service (e.g. `s3`). 
     */
    public fun service(service: String)

    /**
     * A designated subdomain supported by certain AWS service for fast host-name lookup.
     *
     * @param subdomain A designated subdomain supported by certain AWS service for fast host-name
     * lookup. 
     */
    public fun subdomain(subdomain: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.AwsIntegration.Builder =
        software.amazon.awscdk.services.apigateway.AwsIntegration.Builder.create()

    /**
     * The AWS action to perform in the integration.
     *
     * Use `actionParams` to specify key-value params for the action.
     *
     * Mutually exclusive with `path`.
     *
     * @param action The AWS action to perform in the integration. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * Parameters for the action.
     *
     * `action` must be set, and `path` must be undefined.
     * The action params will be URL encoded.
     *
     * @param actionParameters Parameters for the action. 
     */
    override fun actionParameters(actionParameters: Map<String, String>) {
      cdkBuilder.actionParameters(actionParameters)
    }

    /**
     * The integration's HTTP method type.
     *
     * Default: POST
     *
     * @param integrationHttpMethod The integration's HTTP method type. 
     */
    override fun integrationHttpMethod(integrationHttpMethod: String) {
      cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    /**
     * Integration options, such as content handling, request/response mapping, etc.
     *
     * @param options Integration options, such as content handling, request/response mapping, etc. 
     */
    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    /**
     * Integration options, such as content handling, request/response mapping, etc.
     *
     * @param options Integration options, such as content handling, request/response mapping, etc. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ce81aaca0d9bc53166da2caa5cd20f16fc9dbb134d40a08b9c3aa7299dd7fe5")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    /**
     * The path to use for path-base APIs.
     *
     * For example, for S3 GET, you can set path to `bucket/key`.
     * For lambda, you can set path to `2015-03-31/functions/${function-arn}/invocations`
     *
     * Mutually exclusive with the `action` options.
     *
     * @param path The path to use for path-base APIs. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * Use AWS_PROXY integration.
     *
     * Default: false
     *
     * @param proxy Use AWS_PROXY integration. 
     */
    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    /**
     * The region of the integrated AWS service.
     *
     * Default: - same region as the stack
     *
     * @param region The region of the integrated AWS service. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * The name of the integrated AWS service (e.g. `s3`).
     *
     * @param service The name of the integrated AWS service (e.g. `s3`). 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    /**
     * A designated subdomain supported by certain AWS service for fast host-name lookup.
     *
     * @param subdomain A designated subdomain supported by certain AWS service for fast host-name
     * lookup. 
     */
    override fun subdomain(subdomain: String) {
      cdkBuilder.subdomain(subdomain)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.AwsIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsIntegration {
      val builderImpl = BuilderImpl()
      return AwsIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AwsIntegration):
        AwsIntegration = AwsIntegration(cdkObject)

    internal fun unwrap(wrapped: AwsIntegration):
        software.amazon.awscdk.services.apigateway.AwsIntegration = wrapped.cdkObject
  }
}
