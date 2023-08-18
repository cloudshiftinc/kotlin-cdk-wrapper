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

package io.cloudshiftdev.awscdkdsl.services.ssmcontacts

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContactProps

/**
 * Properties for defining a `CfnContact`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * CfnContactProps cfnContactProps = CfnContactProps.builder()
 * .alias("alias")
 * .displayName("displayName")
 * .type("type")
 * // the properties below are optional
 * .plan(List.of(StageProperty.builder()
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
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html)
 */
@CdkDslMarker
public class CfnContactPropsDsl {
    private val cdkBuilder: CfnContactProps.Builder = CfnContactProps.builder()

    private val _plan: MutableList<Any> = mutableListOf()

    /** @param alias The unique and identifiable alias of the contact or escalation plan. */
    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    /** @param displayName The full name of the contact or escalation plan. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * @param plan A list of stages. A contact has an engagement plan with stages that contact
     *   specified contact channels. An escalation plan uses stages that contact specified contacts.
     */
    public fun plan(vararg plan: Any) {
        _plan.addAll(listOf(*plan))
    }

    /**
     * @param plan A list of stages. A contact has an engagement plan with stages that contact
     *   specified contact channels. An escalation plan uses stages that contact specified contacts.
     */
    public fun plan(plan: Collection<Any>) {
        _plan.addAll(plan)
    }

    /**
     * @param plan A list of stages. A contact has an engagement plan with stages that contact
     *   specified contact channels. An escalation plan uses stages that contact specified contacts.
     */
    public fun plan(plan: IResolvable) {
        cdkBuilder.plan(plan)
    }

    /**
     * @param type Refers to the type of contact:.
     * * `PERSONAL` : A single, individual contact.
     * * `ESCALATION` : An escalation plan.
     * * `ONCALL_SCHEDULE` : An on-call schedule.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnContactProps {
        if (_plan.isNotEmpty()) cdkBuilder.plan(_plan)
        return cdkBuilder.build()
    }
}
