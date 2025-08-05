@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.apigatewayv2.IHttpApi as CloudshiftdevAwscdkServicesApigatewayv2IHttpApi
import software.amazon.awscdk.services.apigatewayv2.IHttpApi as AmazonAwscdkServicesApigatewayv2IHttpApi

/**
 * Use an API Gateway V2 HTTP APIs as a target for Amazon EventBridge rules.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * HttpApi httpApi;
 * Rule rule;
 * rule.addTarget(new ApiGatewayV2(httpApi));
 * ```
 */
public open class ApiGatewayV2(
  cdkObject: software.amazon.awscdk.services.events.targets.ApiGatewayV2,
) : CdkObject(cdkObject),
    IRuleTarget {
  public constructor(httpApi: CloudshiftdevAwscdkServicesApigatewayv2IHttpApi) :
      this(software.amazon.awscdk.services.events.targets.ApiGatewayV2(httpApi.let(CloudshiftdevAwscdkServicesApigatewayv2IHttpApi.Companion::unwrap))
  )

  public constructor(httpApi: CloudshiftdevAwscdkServicesApigatewayv2IHttpApi,
      props: ApiGatewayProps) :
      this(software.amazon.awscdk.services.events.targets.ApiGatewayV2(httpApi.let(CloudshiftdevAwscdkServicesApigatewayv2IHttpApi.Companion::unwrap),
      props.let(ApiGatewayProps.Companion::unwrap))
  )

  public constructor(httpApi: CloudshiftdevAwscdkServicesApigatewayv2IHttpApi,
      props: ApiGatewayProps.Builder.() -> Unit) : this(httpApi, ApiGatewayProps(props)
  )

  /**
   * Returns a RuleTarget that can be used to trigger this API Gateway HTTP APIs as a result from an
   * EventBridge event.
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-use-resource-based.html#eb-api-gateway-permissions)
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this API Gateway HTTP APIs as a result from an
   * EventBridge event.
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-use-resource-based.html#eb-api-gateway-permissions)
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * Returns the target IHttpApi.
   */
  public open fun iHttpApi(): CloudshiftdevAwscdkServicesApigatewayv2IHttpApi =
      unwrap(this).getIHttpApi().let(CloudshiftdevAwscdkServicesApigatewayv2IHttpApi::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.ApiGatewayV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
     * dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
     * triggered.
     *
     * Default: - a new role will be created
     *
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     * given rule is triggered. 
     */
    public fun eventRole(eventRole: IRole)

    /**
     * The headers to be set when requesting API.
     *
     * Default: no header parameters
     *
     * @param headerParameters The headers to be set when requesting API. 
     */
    public fun headerParameters(headerParameters: Map<String, String>)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The method for api resource invoked by the rule.
     *
     * Default: '*' that treated as ANY
     *
     * @param method The method for api resource invoked by the rule. 
     */
    public fun method(method: String)

    /**
     * The api resource invoked by the rule.
     *
     * We can use wildcards('*') to specify the path. In that case,
     * an equal number of real values must be specified for pathParameterValues.
     *
     * Default: '/'
     *
     * @param path The api resource invoked by the rule. 
     */
    public fun path(path: String)

    /**
     * The path parameter values to be used to populate to wildcards("*") of requesting api path.
     *
     * Default: no path parameters
     *
     * @param pathParameterValues The path parameter values to be used to populate to wildcards("*")
     * of requesting api path. 
     */
    public fun pathParameterValues(pathParameterValues: List<String>)

    /**
     * The path parameter values to be used to populate to wildcards("*") of requesting api path.
     *
     * Default: no path parameters
     *
     * @param pathParameterValues The path parameter values to be used to populate to wildcards("*")
     * of requesting api path. 
     */
    public fun pathParameterValues(vararg pathParameterValues: String)

    /**
     * This will be the post request body send to the API.
     *
     * Default: the entire EventBridge event
     *
     * @param postBody This will be the post request body send to the API. 
     */
    public fun postBody(postBody: RuleTargetInput)

    /**
     * The query parameters to be set when requesting API.
     *
     * Default: no querystring parameters
     *
     * @param queryStringParameters The query parameters to be set when requesting API. 
     */
    public fun queryStringParameters(queryStringParameters: Map<String, String>)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * The deploy stage of api gateway invoked by the rule.
     *
     * Default: the value of deploymentStage.stageName of target api gateway.
     *
     * @param stage The deploy stage of api gateway invoked by the rule. 
     */
    public fun stage(stage: String)
  }

  private class BuilderImpl(
    httpApi: AmazonAwscdkServicesApigatewayv2IHttpApi,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.ApiGatewayV2.Builder =
        software.amazon.awscdk.services.events.targets.ApiGatewayV2.Builder.create(httpApi)

    /**
     * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
     * dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
     * triggered.
     *
     * Default: - a new role will be created
     *
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     * given rule is triggered. 
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole.Companion::unwrap))
    }

    /**
     * The headers to be set when requesting API.
     *
     * Default: no header parameters
     *
     * @param headerParameters The headers to be set when requesting API. 
     */
    override fun headerParameters(headerParameters: Map<String, String>) {
      cdkBuilder.headerParameters(headerParameters)
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * The method for api resource invoked by the rule.
     *
     * Default: '*' that treated as ANY
     *
     * @param method The method for api resource invoked by the rule. 
     */
    override fun method(method: String) {
      cdkBuilder.method(method)
    }

    /**
     * The api resource invoked by the rule.
     *
     * We can use wildcards('*') to specify the path. In that case,
     * an equal number of real values must be specified for pathParameterValues.
     *
     * Default: '/'
     *
     * @param path The api resource invoked by the rule. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * The path parameter values to be used to populate to wildcards("*") of requesting api path.
     *
     * Default: no path parameters
     *
     * @param pathParameterValues The path parameter values to be used to populate to wildcards("*")
     * of requesting api path. 
     */
    override fun pathParameterValues(pathParameterValues: List<String>) {
      cdkBuilder.pathParameterValues(pathParameterValues)
    }

    /**
     * The path parameter values to be used to populate to wildcards("*") of requesting api path.
     *
     * Default: no path parameters
     *
     * @param pathParameterValues The path parameter values to be used to populate to wildcards("*")
     * of requesting api path. 
     */
    override fun pathParameterValues(vararg pathParameterValues: String): Unit =
        pathParameterValues(pathParameterValues.toList())

    /**
     * This will be the post request body send to the API.
     *
     * Default: the entire EventBridge event
     *
     * @param postBody This will be the post request body send to the API. 
     */
    override fun postBody(postBody: RuleTargetInput) {
      cdkBuilder.postBody(postBody.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * The query parameters to be set when requesting API.
     *
     * Default: no querystring parameters
     *
     * @param queryStringParameters The query parameters to be set when requesting API. 
     */
    override fun queryStringParameters(queryStringParameters: Map<String, String>) {
      cdkBuilder.queryStringParameters(queryStringParameters)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * The deploy stage of api gateway invoked by the rule.
     *
     * Default: the value of deploymentStage.stageName of target api gateway.
     *
     * @param stage The deploy stage of api gateway invoked by the rule. 
     */
    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.ApiGatewayV2 =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(httpApi: CloudshiftdevAwscdkServicesApigatewayv2IHttpApi,
        block: Builder.() -> Unit = {}): ApiGatewayV2 {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesApigatewayv2IHttpApi.unwrap(httpApi))
      return ApiGatewayV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ApiGatewayV2):
        ApiGatewayV2 = ApiGatewayV2(cdkObject)

    internal fun unwrap(wrapped: ApiGatewayV2):
        software.amazon.awscdk.services.events.targets.ApiGatewayV2 = wrapped.cdkObject as
        software.amazon.awscdk.services.events.targets.ApiGatewayV2
  }
}
