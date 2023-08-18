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
import software.amazon.awscdk.services.events.targets.ApiDestinationProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Customize the EventBridge Api Destinations Target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.events.targets.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.sqs.*;
 * Queue queue;
 * Role role;
 * RuleTargetInput ruleTargetInput;
 * ApiDestinationProps apiDestinationProps = ApiDestinationProps.builder()
 * .deadLetterQueue(queue)
 * .event(ruleTargetInput)
 * .eventRole(role)
 * .headerParameters(Map.of(
 * "headerParametersKey", "headerParameters"))
 * .maxEventAge(Duration.minutes(30))
 * .pathParameterValues(List.of("pathParameterValues"))
 * .queryStringParameters(Map.of(
 * "queryStringParametersKey", "queryStringParameters"))
 * .retryAttempts(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class ApiDestinationPropsDsl {
    private val cdkBuilder: ApiDestinationProps.Builder = ApiDestinationProps.builder()

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

    /** @param event The event to send. */
    public fun event(event: RuleTargetInput) {
        cdkBuilder.event(event)
    }

    /** @param eventRole The role to assume before invoking the target. */
    public fun eventRole(eventRole: IRole) {
        cdkBuilder.eventRole(eventRole)
    }

    /**
     * @param headerParameters Additional headers sent to the API Destination. These are merged with
     *   headers specified on the Connection, with the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     */
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

    /**
     * @param pathParameterValues Path parameters to insert in place of path wildcards (`*`). If the
     *   API destination has a wilcard in the path, these path parts will be inserted in that place.
     */
    public fun pathParameterValues(vararg pathParameterValues: String) {
        _pathParameterValues.addAll(listOf(*pathParameterValues))
    }

    /**
     * @param pathParameterValues Path parameters to insert in place of path wildcards (`*`). If the
     *   API destination has a wilcard in the path, these path parts will be inserted in that place.
     */
    public fun pathParameterValues(pathParameterValues: Collection<String>) {
        _pathParameterValues.addAll(pathParameterValues)
    }

    /**
     * @param queryStringParameters Additional query string parameters sent to the API Destination.
     *   These are merged with headers specified on the Connection, with the headers on the
     *   Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     */
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

    public fun build(): ApiDestinationProps {
        if (_pathParameterValues.isNotEmpty()) cdkBuilder.pathParameterValues(_pathParameterValues)
        return cdkBuilder.build()
    }
}
