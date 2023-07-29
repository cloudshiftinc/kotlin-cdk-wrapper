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

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Event-based policies only]* Specifies an event that activates an event-based policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * EventParametersProperty eventParametersProperty = EventParametersProperty.builder()
 * .eventType("eventType")
 * .snapshotOwner(List.of("snapshotOwner"))
 * // the properties below are optional
 * .descriptionRegex("descriptionRegex")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventparameters.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyEventParametersPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.EventParametersProperty.Builder =
        CfnLifecyclePolicy.EventParametersProperty.builder()

    private val _snapshotOwner: MutableList<String> = mutableListOf()

    /**
     * @param descriptionRegex The snapshot description that can trigger the policy. The description
     *   pattern is specified using a regular expression. The policy runs only if a snapshot with a
     *   description that matches the specified pattern is shared with your account.
     *
     * For example, specifying `^.*Created for policy: policy-1234567890abcdef0.*$` configures the
     * policy to run only if snapshots created by policy `policy-1234567890abcdef0` are shared with
     * your account.
     */
    public fun descriptionRegex(descriptionRegex: String) {
        cdkBuilder.descriptionRegex(descriptionRegex)
    }

    /**
     * @param eventType The type of event. Currently, only snapshot sharing events are supported.
     */
    public fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
    }

    /**
     * @param snapshotOwner The IDs of the AWS accounts that can trigger policy by sharing snapshots
     *   with your account. The policy only runs if one of the specified AWS accounts shares a
     *   snapshot with your account.
     */
    public fun snapshotOwner(vararg snapshotOwner: String) {
        _snapshotOwner.addAll(listOf(*snapshotOwner))
    }

    /**
     * @param snapshotOwner The IDs of the AWS accounts that can trigger policy by sharing snapshots
     *   with your account. The policy only runs if one of the specified AWS accounts shares a
     *   snapshot with your account.
     */
    public fun snapshotOwner(snapshotOwner: Collection<String>) {
        _snapshotOwner.addAll(snapshotOwner)
    }

    public fun build(): CfnLifecyclePolicy.EventParametersProperty {
        if (_snapshotOwner.isNotEmpty()) cdkBuilder.snapshotOwner(_snapshotOwner)
        return cdkBuilder.build()
    }
}
