@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.events.targets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.ApiGatewayProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Customize the API Gateway Event Target.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.apigateway.*;
 * import software.amazon.awscdk.services.lambda.*;
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.minutes(1)))
 * .build();
 * Function fn = Function.Builder.create(this, "MyFunc")
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_14_X)
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
@CdkDslMarker
public class ApiGatewayPropsDsl {
    private val cdkBuilder: ApiGatewayProps.Builder = ApiGatewayProps.builder()

    private val _pathParameterValues: MutableList<String> = mutableListOf()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     *   [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *   The events not successfully delivered are automatically retried for a specified period of
     *   time, depending on the retry policy of the target. If an event is not delivered before all
     *   retry attempts are exhausted, it will be sent to the dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     *   given rule is triggered.
     */
    public fun eventRole(eventRole: IRole) {
        cdkBuilder.eventRole(eventRole)
    }

    /** @param headerParameters The headers to be set when requesting API. */
    public fun headerParameters(headerParameters: Map<String, String>) {
        cdkBuilder.headerParameters(headerParameters)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing. Minimum value of 60. Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /** @param method The method for api resource invoked by the rule. */
    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    /**
     * @param path The api resource invoked by the rule. We can use wildcards('*') to specify the
     *   path. In that case, an equal number of real values must be specified for
     *   pathParameterValues.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param pathParameterValues The path parameter values to be used to populate to wildcards("*")
     *   of requesting api path.
     */
    public fun pathParameterValues(vararg pathParameterValues: String) {
        _pathParameterValues.addAll(listOf(*pathParameterValues))
    }

    /**
     * @param pathParameterValues The path parameter values to be used to populate to wildcards("*")
     *   of requesting api path.
     */
    public fun pathParameterValues(pathParameterValues: Collection<String>) {
        _pathParameterValues.addAll(pathParameterValues)
    }

    /** @param postBody This will be the post request body send to the API. */
    public fun postBody(postBody: RuleTargetInput) {
        cdkBuilder.postBody(postBody)
    }

    /** @param queryStringParameters The query parameters to be set when requesting API. */
    public fun queryStringParameters(queryStringParameters: Map<String, String>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     *   Minimum value of 0. Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    /** @param stage The deploy stage of api gateway invoked by the rule. */
    public fun stage(stage: String) {
        cdkBuilder.stage(stage)
    }

    public fun build(): ApiGatewayProps {
        if (_pathParameterValues.isNotEmpty()) cdkBuilder.pathParameterValues(_pathParameterValues)
        return cdkBuilder.build()
    }
}
