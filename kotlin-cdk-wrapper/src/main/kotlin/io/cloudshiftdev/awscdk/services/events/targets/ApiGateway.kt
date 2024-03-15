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
import io.cloudshiftdev.awscdk.services.apigateway.RestApi as CloudshiftdevAwscdkServicesApigatewayRestApi
import software.amazon.awscdk.services.apigateway.RestApi as AmazonAwscdkServicesApigatewayRestApi

/**
 * Use an API Gateway REST APIs as a target for Amazon EventBridge rules.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.minutes(1)))
 * .build();
 * Function fn = Function.Builder.create(this, "MyFunc")
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_LATEST)
 * .code(Code.fromInline("exports.handler = e =&gt; {}"))
 * .build();
 * LambdaRestApi restApi = LambdaRestApi.Builder.create(this, "MyRestAPI").handler(fn).build();
 * Queue dlq = new Queue(this, "DeadLetterQueue");
 * rule.addTarget(
 * ApiGateway.Builder.create(restApi)
 * .path("/ *&#47;test")
 * .method("GET")
 * .stage("prod")
 * .pathParameterValues(List.of("path-value"))
 * .headerParameters(Map.of(
 * "Header1", "header1"))
 * .queryStringParameters(Map.of(
 * "QueryParam1", "query-param-1"))
 * .deadLetterQueue(dlq)
 * .build());
 * ```
 */
public open class ApiGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.ApiGateway,
) : CdkObject(cdkObject), IRuleTarget {
  /**
   * Returns a RuleTarget that can be used to trigger this API Gateway REST APIs as a result from an
   * EventBridge event.
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/resource-based-policies-eventbridge.html#sqs-permissions)
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this API Gateway REST APIs as a result from an
   * EventBridge event.
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/resource-based-policies-eventbridge.html#sqs-permissions)
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  /**
   *
   */
  public open fun restApi(): CloudshiftdevAwscdkServicesApigatewayRestApi =
      unwrap(this).getRestApi().let(CloudshiftdevAwscdkServicesApigatewayRestApi::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.ApiGateway].
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
    restApi: AmazonAwscdkServicesApigatewayRestApi,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.ApiGateway.Builder =
        software.amazon.awscdk.services.events.targets.ApiGateway.Builder.create(restApi)

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
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
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
      cdkBuilder.eventRole(eventRole.let(IRole::unwrap))
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
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
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
      cdkBuilder.postBody(postBody.let(RuleTargetInput::unwrap))
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

    public fun build(): software.amazon.awscdk.services.events.targets.ApiGateway =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(restApi: CloudshiftdevAwscdkServicesApigatewayRestApi,
        block: Builder.() -> Unit = {}): ApiGateway {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesApigatewayRestApi.unwrap(restApi))
      return ApiGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ApiGateway):
        ApiGateway = ApiGateway(cdkObject)

    internal fun unwrap(wrapped: ApiGateway):
        software.amazon.awscdk.services.events.targets.ApiGateway = wrapped.cdkObject
  }
}
