@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Represents an HTTP API.
 */
public interface IHttpApi : IApi {
  /**
   * Add a new VpcLink.
   *
   * @param options 
   */
  public fun addVpcLink(options: VpcLinkProps): VpcLink

  /**
   * Add a new VpcLink.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6d123942454a2f6b39cc86261dd700999b1a3c76f0618d08f290fcb74fcc48d")
  public fun addVpcLink(options: VpcLinkProps.Builder.() -> Unit): VpcLink

  /**
   * Get the "execute-api" ARN.
   *
   * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
   *
   * Default: - The default behavior applies when no specific method, path, or stage is provided.
   * In this case, the ARN will cover all methods, all resources, and all stages of this API.
   * Specifically, if 'method' is not specified, it defaults to '*', representing all methods.
   * If 'path' is not specified, it defaults to '/ *', representing all paths.
   * If 'stage' is not specified, it also defaults to '*', representing all stages.
   *
   * @param method
   * @param path
   * @param stage
   */
  public fun arnForExecuteApi(): String

  /**
   * Get the "execute-api" ARN.
   *
   * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
   *
   * Default: - The default behavior applies when no specific method, path, or stage is provided.
   * In this case, the ARN will cover all methods, all resources, and all stages of this API.
   * Specifically, if 'method' is not specified, it defaults to '*', representing all methods.
   * If 'path' is not specified, it defaults to '/ *', representing all paths.
   * If 'stage' is not specified, it also defaults to '*', representing all stages.
   *
   * @param method
   * @param path
   * @param stage
   */
  public fun arnForExecuteApi(method: String): String

  /**
   * Get the "execute-api" ARN.
   *
   * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
   *
   * Default: - The default behavior applies when no specific method, path, or stage is provided.
   * In this case, the ARN will cover all methods, all resources, and all stages of this API.
   * Specifically, if 'method' is not specified, it defaults to '*', representing all methods.
   * If 'path' is not specified, it defaults to '/ *', representing all paths.
   * If 'stage' is not specified, it also defaults to '*', representing all stages.
   *
   * @param method
   * @param path
   * @param stage
   */
  public fun arnForExecuteApi(method: String, path: String): String

  /**
   * Get the "execute-api" ARN.
   *
   * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
   *
   * Default: - The default behavior applies when no specific method, path, or stage is provided.
   * In this case, the ARN will cover all methods, all resources, and all stages of this API.
   * Specifically, if 'method' is not specified, it defaults to '*', representing all methods.
   * If 'path' is not specified, it defaults to '/ *', representing all paths.
   * If 'stage' is not specified, it also defaults to '*', representing all stages.
   *
   * @param method
   * @param path
   * @param stage
   */
  public fun arnForExecuteApi(
    method: String,
    path: String,
    stage: String,
  ): String

  /**
   * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on the
   * route.
   *
   * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
   *
   * Default: - no default authorization scopes
   */
  public fun defaultAuthorizationScopes(): List<String> =
      unwrap(this).getDefaultAuthorizationScopes() ?: emptyList()

  /**
   * Default Authorizer applied to all routes in the gateway.
   *
   * Default: - no default authorizer
   */
  public fun defaultAuthorizer(): IHttpRouteAuthorizer? =
      unwrap(this).getDefaultAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricClientError(): Metric

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricClientError(props: MetricOptions): Metric

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
  public fun metricClientError(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the total number API requests in a given period.
   *
   * Default: - SampleCount over 5 minutes
   *
   * @param props
   */
  public fun metricCount(): Metric

  /**
   * Metric for the total number API requests in a given period.
   *
   * Default: - SampleCount over 5 minutes
   *
   * @param props
   */
  public fun metricCount(props: MetricOptions): Metric

  /**
   * Metric for the total number API requests in a given period.
   *
   * Default: - SampleCount over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
  public fun metricCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the amount of data processed in bytes.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricDataProcessed(): Metric

  /**
   * Metric for the amount of data processed in bytes.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricDataProcessed(props: MetricOptions): Metric

  /**
   * Metric for the amount of data processed in bytes.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f57c3511280d12729c02269edffb794ffffaf9f66f595c310c4332560248e8e1")
  public fun metricDataProcessed(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * Default: - no statistic
   *
   * @param props
   */
  public fun metricIntegrationLatency(): Metric

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * Default: - no statistic
   *
   * @param props
   */
  public fun metricIntegrationLatency(props: MetricOptions): Metric

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * Default: - no statistic
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
  public fun metricIntegrationLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * Default: - no statistic
   *
   * @param props
   */
  public fun metricLatency(): Metric

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * Default: - no statistic
   *
   * @param props
   */
  public fun metricLatency(props: MetricOptions): Metric

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * Default: - no statistic
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
  public fun metricLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricServerError(): Metric

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricServerError(props: MetricOptions): Metric

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
  public fun metricServerError(props: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpApi,
  ) : CdkObject(cdkObject), IHttpApi {
    /**
     * Add a new VpcLink.
     *
     * @param options 
     */
    override fun addVpcLink(options: VpcLinkProps): VpcLink =
        unwrap(this).addVpcLink(options.let(VpcLinkProps::unwrap)).let(VpcLink::wrap)

    /**
     * Add a new VpcLink.
     *
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6d123942454a2f6b39cc86261dd700999b1a3c76f0618d08f290fcb74fcc48d")
    override fun addVpcLink(options: VpcLinkProps.Builder.() -> Unit): VpcLink =
        addVpcLink(VpcLinkProps(options))

    /**
     * The default endpoint for an API.
     */
    override fun apiEndpoint(): String = unwrap(this).getApiEndpoint()

    /**
     * The identifier of this API Gateway API.
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * Get the "execute-api" ARN.
     *
     * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
     *
     * Default: - The default behavior applies when no specific method, path, or stage is provided.
     * In this case, the ARN will cover all methods, all resources, and all stages of this API.
     * Specifically, if 'method' is not specified, it defaults to '*', representing all methods.
     * If 'path' is not specified, it defaults to '/ *', representing all paths.
     * If 'stage' is not specified, it also defaults to '*', representing all stages.
     *
     * @param method
     * @param path
     * @param stage
     */
    override fun arnForExecuteApi(): String = unwrap(this).arnForExecuteApi()

    /**
     * Get the "execute-api" ARN.
     *
     * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
     *
     * Default: - The default behavior applies when no specific method, path, or stage is provided.
     * In this case, the ARN will cover all methods, all resources, and all stages of this API.
     * Specifically, if 'method' is not specified, it defaults to '*', representing all methods.
     * If 'path' is not specified, it defaults to '/ *', representing all paths.
     * If 'stage' is not specified, it also defaults to '*', representing all stages.
     *
     * @param method
     * @param path
     * @param stage
     */
    override fun arnForExecuteApi(method: String): String = unwrap(this).arnForExecuteApi(method)

    /**
     * Get the "execute-api" ARN.
     *
     * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
     *
     * Default: - The default behavior applies when no specific method, path, or stage is provided.
     * In this case, the ARN will cover all methods, all resources, and all stages of this API.
     * Specifically, if 'method' is not specified, it defaults to '*', representing all methods.
     * If 'path' is not specified, it defaults to '/ *', representing all paths.
     * If 'stage' is not specified, it also defaults to '*', representing all stages.
     *
     * @param method
     * @param path
     * @param stage
     */
    override fun arnForExecuteApi(method: String, path: String): String =
        unwrap(this).arnForExecuteApi(method, path)

    /**
     * Get the "execute-api" ARN.
     *
     * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
     *
     * Default: - The default behavior applies when no specific method, path, or stage is provided.
     * In this case, the ARN will cover all methods, all resources, and all stages of this API.
     * Specifically, if 'method' is not specified, it defaults to '*', representing all methods.
     * If 'path' is not specified, it defaults to '/ *', representing all paths.
     * If 'stage' is not specified, it also defaults to '*', representing all stages.
     *
     * @param method
     * @param path
     * @param stage
     */
    override fun arnForExecuteApi(
      method: String,
      path: String,
      stage: String,
    ): String = unwrap(this).arnForExecuteApi(method, path, stage)

    /**
     * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on
     * the route.
     *
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no default authorization scopes
     */
    override fun defaultAuthorizationScopes(): List<String> =
        unwrap(this).getDefaultAuthorizationScopes() ?: emptyList()

    /**
     * Default Authorizer applied to all routes in the gateway.
     *
     * Default: - no default authorizer
     */
    override fun defaultAuthorizer(): IHttpRouteAuthorizer? =
        unwrap(this).getDefaultAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Return the given named metric for this Api Gateway.
     *
     * Default: - average over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this Api Gateway.
     *
     * Default: - average over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this Api Gateway.
     *
     * Default: - average over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * Metric for the number of client-side errors captured in a given period.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricClientError(): Metric = unwrap(this).metricClientError().let(Metric::wrap)

    /**
     * Metric for the number of client-side errors captured in a given period.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricClientError(props: MetricOptions): Metric =
        unwrap(this).metricClientError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of client-side errors captured in a given period.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
    override fun metricClientError(props: MetricOptions.Builder.() -> Unit): Metric =
        metricClientError(MetricOptions(props))

    /**
     * Metric for the total number API requests in a given period.
     *
     * Default: - SampleCount over 5 minutes
     *
     * @param props
     */
    override fun metricCount(): Metric = unwrap(this).metricCount().let(Metric::wrap)

    /**
     * Metric for the total number API requests in a given period.
     *
     * Default: - SampleCount over 5 minutes
     *
     * @param props
     */
    override fun metricCount(props: MetricOptions): Metric =
        unwrap(this).metricCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the total number API requests in a given period.
     *
     * Default: - SampleCount over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
    override fun metricCount(props: MetricOptions.Builder.() -> Unit): Metric =
        metricCount(MetricOptions(props))

    /**
     * Metric for the amount of data processed in bytes.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricDataProcessed(): Metric =
        unwrap(this).metricDataProcessed().let(Metric::wrap)

    /**
     * Metric for the amount of data processed in bytes.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricDataProcessed(props: MetricOptions): Metric =
        unwrap(this).metricDataProcessed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the amount of data processed in bytes.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f57c3511280d12729c02269edffb794ffffaf9f66f595c310c4332560248e8e1")
    override fun metricDataProcessed(props: MetricOptions.Builder.() -> Unit): Metric =
        metricDataProcessed(MetricOptions(props))

    /**
     * Metric for the time between when API Gateway relays a request to the backend and when it
     * receives a response from the backend.
     *
     * Default: - no statistic
     *
     * @param props
     */
    override fun metricIntegrationLatency(): Metric =
        unwrap(this).metricIntegrationLatency().let(Metric::wrap)

    /**
     * Metric for the time between when API Gateway relays a request to the backend and when it
     * receives a response from the backend.
     *
     * Default: - no statistic
     *
     * @param props
     */
    override fun metricIntegrationLatency(props: MetricOptions): Metric =
        unwrap(this).metricIntegrationLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the time between when API Gateway relays a request to the backend and when it
     * receives a response from the backend.
     *
     * Default: - no statistic
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
    override fun metricIntegrationLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        metricIntegrationLatency(MetricOptions(props))

    /**
     * The time between when API Gateway receives a request from a client and when it returns a
     * response to the client.
     *
     * The latency includes the integration latency and other API Gateway overhead.
     *
     * Default: - no statistic
     *
     * @param props
     */
    override fun metricLatency(): Metric = unwrap(this).metricLatency().let(Metric::wrap)

    /**
     * The time between when API Gateway receives a request from a client and when it returns a
     * response to the client.
     *
     * The latency includes the integration latency and other API Gateway overhead.
     *
     * Default: - no statistic
     *
     * @param props
     */
    override fun metricLatency(props: MetricOptions): Metric =
        unwrap(this).metricLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The time between when API Gateway receives a request from a client and when it returns a
     * response to the client.
     *
     * The latency includes the integration latency and other API Gateway overhead.
     *
     * Default: - no statistic
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
    override fun metricLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        metricLatency(MetricOptions(props))

    /**
     * Metric for the number of server-side errors captured in a given period.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricServerError(): Metric = unwrap(this).metricServerError().let(Metric::wrap)

    /**
     * Metric for the number of server-side errors captured in a given period.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    override fun metricServerError(props: MetricOptions): Metric =
        unwrap(this).metricServerError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of server-side errors captured in a given period.
     *
     * Default: - sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
    override fun metricServerError(props: MetricOptions.Builder.() -> Unit): Metric =
        metricServerError(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpApi): IHttpApi =
        CdkObjectWrappers.wrap(cdkObject) as? IHttpApi ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpApi): software.amazon.awscdk.services.apigatewayv2.IHttpApi =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IHttpApi
  }
}
