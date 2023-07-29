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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContact

/**
 * The `Stage` property type specifies a set amount of time that an escalation plan or engagement
 * plan engages the specified contacts or contact methods.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * StageProperty stageProperty = StageProperty.builder()
 * .durationInMinutes(123)
 * .rotationIds(List.of("rotationIds"))
 * .targets(List.of(TargetsProperty.builder()
 * .channelTargetInfo(ChannelTargetInfoProperty.builder()
 * .channelId("channelId")
 * .retryIntervalInMinutes(123)
 * .build())
 * .contactTargetInfo(ContactTargetInfoProperty.builder()
 * .contactId("contactId")
 * .isEssential(false)
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-stage.html)
 */
@CdkDslMarker
public class CfnContactStagePropertyDsl {
    private val cdkBuilder: CfnContact.StageProperty.Builder = CfnContact.StageProperty.builder()

    private val _rotationIds: MutableList<String> = mutableListOf()

    private val _targets: MutableList<Any> = mutableListOf()

    /**
     * @param durationInMinutes The time to wait until beginning the next stage. The duration can
     *   only be set to 0 if a target is specified.
     */
    public fun durationInMinutes(durationInMinutes: Number) {
        cdkBuilder.durationInMinutes(durationInMinutes)
    }

    /**
     * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
     *   the plan.
     */
    public fun rotationIds(vararg rotationIds: String) {
        _rotationIds.addAll(listOf(*rotationIds))
    }

    /**
     * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
     *   the plan.
     */
    public fun rotationIds(rotationIds: Collection<String>) {
        _rotationIds.addAll(rotationIds)
    }

    /**
     * @param targets The contacts or contact methods that the escalation plan or engagement plan is
     *   engaging.
     */
    public fun targets(vararg targets: Any) {
        _targets.addAll(listOf(*targets))
    }

    /**
     * @param targets The contacts or contact methods that the escalation plan or engagement plan is
     *   engaging.
     */
    public fun targets(targets: Collection<Any>) {
        _targets.addAll(targets)
    }

    /**
     * @param targets The contacts or contact methods that the escalation plan or engagement plan is
     *   engaging.
     */
    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    public fun build(): CfnContact.StageProperty {
        if (_rotationIds.isNotEmpty()) cdkBuilder.rotationIds(_rotationIds)
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
