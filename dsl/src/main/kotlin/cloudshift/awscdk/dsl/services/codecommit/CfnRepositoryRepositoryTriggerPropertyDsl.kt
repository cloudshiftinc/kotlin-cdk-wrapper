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

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codecommit.CfnRepository

/**
 * Information about a trigger for a repository.
 *
 * If you want to receive notifications about repository events, consider using notifications
 * instead of triggers. For more information, see
 * [Configuring notifications for repository events](https://docs.aws.amazon.com/codecommit/latest/userguide/how-to-repository-email.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codecommit.*;
 * RepositoryTriggerProperty repositoryTriggerProperty = RepositoryTriggerProperty.builder()
 * .destinationArn("destinationArn")
 * .events(List.of("events"))
 * .name("name")
 * // the properties below are optional
 * .branches(List.of("branches"))
 * .customData("customData")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html)
 */
@CdkDslMarker
public class CfnRepositoryRepositoryTriggerPropertyDsl {
    private val cdkBuilder: CfnRepository.RepositoryTriggerProperty.Builder =
        CfnRepository.RepositoryTriggerProperty.builder()

    private val _branches: MutableList<String> = mutableListOf()

    private val _events: MutableList<String> = mutableListOf()

    /**
     * @param branches The branches to be included in the trigger configuration. If you specify an
     *   empty array, the trigger applies to all branches.
     *
     * Although no content is required in the array, you must include the array itself.
     */
    public fun branches(vararg branches: String) {
        _branches.addAll(listOf(*branches))
    }

    /**
     * @param branches The branches to be included in the trigger configuration. If you specify an
     *   empty array, the trigger applies to all branches.
     *
     * Although no content is required in the array, you must include the array itself.
     */
    public fun branches(branches: Collection<String>) {
        _branches.addAll(branches)
    }

    /**
     * @param customData Any custom data associated with the trigger to be included in the
     *   information sent to the target of the trigger.
     */
    public fun customData(customData: String) {
        cdkBuilder.customData(customData)
    }

    /**
     * @param destinationArn The ARN of the resource that is the target for a trigger (for example,
     *   the ARN of a topic in Amazon SNS).
     */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * @param events The repository events that cause the trigger to run actions in another service,
     *   such as sending a notification through Amazon SNS.
     *
     * The valid value "all" cannot be used with any other values.
     */
    public fun events(vararg events: String) {
        _events.addAll(listOf(*events))
    }

    /**
     * @param events The repository events that cause the trigger to run actions in another service,
     *   such as sending a notification through Amazon SNS.
     *
     * The valid value "all" cannot be used with any other values.
     */
    public fun events(events: Collection<String>) {
        _events.addAll(events)
    }

    /** @param name The name of the trigger. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnRepository.RepositoryTriggerProperty {
        if (_branches.isNotEmpty()) cdkBuilder.branches(_branches)
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
