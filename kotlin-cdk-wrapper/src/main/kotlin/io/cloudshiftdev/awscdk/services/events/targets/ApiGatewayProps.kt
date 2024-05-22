@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Customize the API Gateway Event Target.
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
public interface ApiGatewayProps : TargetBaseProps {
  /**
   * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
   * triggered.
   *
   * Default: - a new role will be created
   */
  public fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

  /**
   * The headers to be set when requesting API.
   *
   * Default: no header parameters
   */
  public fun headerParameters(): Map<String, String> = unwrap(this).getHeaderParameters() ?:
      emptyMap()

  /**
   * The method for api resource invoked by the rule.
   *
   * Default: '*' that treated as ANY
   */
  public fun method(): String? = unwrap(this).getMethod()

  /**
   * The api resource invoked by the rule.
   *
   * We can use wildcards('*') to specify the path. In that case,
   * an equal number of real values must be specified for pathParameterValues.
   *
   * Default: '/'
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * The path parameter values to be used to populate to wildcards("*") of requesting api path.
   *
   * Default: no path parameters
   */
  public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
      emptyList()

  /**
   * This will be the post request body send to the API.
   *
   * Default: the entire EventBridge event
   */
  public fun postBody(): RuleTargetInput? = unwrap(this).getPostBody()?.let(RuleTargetInput::wrap)

  /**
   * The query parameters to be set when requesting API.
   *
   * Default: no querystring parameters
   */
  public fun queryStringParameters(): Map<String, String> = unwrap(this).getQueryStringParameters()
      ?: emptyMap()

  /**
   * The deploy stage of api gateway invoked by the rule.
   *
   * Default: the value of deploymentStage.stageName of target api gateway.
   */
  public fun stage(): String? = unwrap(this).getStage()

  /**
   * A builder for [ApiGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     * given rule is triggered.
     */
    public fun eventRole(eventRole: IRole)

    /**
     * @param headerParameters The headers to be set when requesting API.
     */
    public fun headerParameters(headerParameters: Map<String, String>)

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param method The method for api resource invoked by the rule.
     */
    public fun method(method: String)

    /**
     * @param path The api resource invoked by the rule.
     * We can use wildcards('*') to specify the path. In that case,
     * an equal number of real values must be specified for pathParameterValues.
     */
    public fun path(path: String)

    /**
     * @param pathParameterValues The path parameter values to be used to populate to wildcards("*")
     * of requesting api path.
     */
    public fun pathParameterValues(pathParameterValues: List<String>)

    /**
     * @param pathParameterValues The path parameter values to be used to populate to wildcards("*")
     * of requesting api path.
     */
    public fun pathParameterValues(vararg pathParameterValues: String)

    /**
     * @param postBody This will be the post request body send to the API.
     */
    public fun postBody(postBody: RuleTargetInput)

    /**
     * @param queryStringParameters The query parameters to be set when requesting API.
     */
    public fun queryStringParameters(queryStringParameters: Map<String, String>)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param stage The deploy stage of api gateway invoked by the rule.
     */
    public fun stage(stage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.ApiGatewayProps.Builder =
        software.amazon.awscdk.services.events.targets.ApiGatewayProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     * given rule is triggered.
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param headerParameters The headers to be set when requesting API.
     */
    override fun headerParameters(headerParameters: Map<String, String>) {
      cdkBuilder.headerParameters(headerParameters)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param method The method for api resource invoked by the rule.
     */
    override fun method(method: String) {
      cdkBuilder.method(method)
    }

    /**
     * @param path The api resource invoked by the rule.
     * We can use wildcards('*') to specify the path. In that case,
     * an equal number of real values must be specified for pathParameterValues.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param pathParameterValues The path parameter values to be used to populate to wildcards("*")
     * of requesting api path.
     */
    override fun pathParameterValues(pathParameterValues: List<String>) {
      cdkBuilder.pathParameterValues(pathParameterValues)
    }

    /**
     * @param pathParameterValues The path parameter values to be used to populate to wildcards("*")
     * of requesting api path.
     */
    override fun pathParameterValues(vararg pathParameterValues: String): Unit =
        pathParameterValues(pathParameterValues.toList())

    /**
     * @param postBody This will be the post request body send to the API.
     */
    override fun postBody(postBody: RuleTargetInput) {
      cdkBuilder.postBody(postBody.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * @param queryStringParameters The query parameters to be set when requesting API.
     */
    override fun queryStringParameters(queryStringParameters: Map<String, String>) {
      cdkBuilder.queryStringParameters(queryStringParameters)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param stage The deploy stage of api gateway invoked by the rule.
     */
    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.ApiGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.ApiGatewayProps,
  ) : CdkObject(cdkObject), ApiGatewayProps {
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
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
     * triggered.
     *
     * Default: - a new role will be created
     */
    override fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

    /**
     * The headers to be set when requesting API.
     *
     * Default: no header parameters
     */
    override fun headerParameters(): Map<String, String> = unwrap(this).getHeaderParameters() ?:
        emptyMap()

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The method for api resource invoked by the rule.
     *
     * Default: '*' that treated as ANY
     */
    override fun method(): String? = unwrap(this).getMethod()

    /**
     * The api resource invoked by the rule.
     *
     * We can use wildcards('*') to specify the path. In that case,
     * an equal number of real values must be specified for pathParameterValues.
     *
     * Default: '/'
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * The path parameter values to be used to populate to wildcards("*") of requesting api path.
     *
     * Default: no path parameters
     */
    override fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    /**
     * This will be the post request body send to the API.
     *
     * Default: the entire EventBridge event
     */
    override fun postBody(): RuleTargetInput? =
        unwrap(this).getPostBody()?.let(RuleTargetInput::wrap)

    /**
     * The query parameters to be set when requesting API.
     *
     * Default: no querystring parameters
     */
    override fun queryStringParameters(): Map<String, String> =
        unwrap(this).getQueryStringParameters() ?: emptyMap()

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * The deploy stage of api gateway invoked by the rule.
     *
     * Default: the value of deploymentStage.stageName of target api gateway.
     */
    override fun stage(): String? = unwrap(this).getStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ApiGatewayProps):
        ApiGatewayProps = CdkObjectWrappers.wrap(cdkObject) as? ApiGatewayProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiGatewayProps):
        software.amazon.awscdk.services.events.targets.ApiGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.ApiGatewayProps
  }
}
