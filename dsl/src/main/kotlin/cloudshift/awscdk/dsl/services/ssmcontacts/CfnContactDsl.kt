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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContact
import software.constructs.Construct

/**
 * The `AWS::SSMContacts::Contact` resource specifies a contact or escalation plan.
 *
 * Incident Manager contacts are a subset of actions and data types that you can use for managing
 * responder engagement and interaction.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * CfnContact cfnContact = CfnContact.Builder.create(this, "MyCfnContact")
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
public class CfnContactDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnContact.Builder = CfnContact.Builder.create(scope, id)

    private val _plan: MutableList<Any> = mutableListOf()

    /**
     * The unique and identifiable alias of the contact or escalation plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-alias)
     *
     * @param alias The unique and identifiable alias of the contact or escalation plan.
     */
    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    /**
     * The full name of the contact or escalation plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-displayname)
     *
     * @param displayName The full name of the contact or escalation plan.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * A list of stages.
     *
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
     *
     * @param plan A list of stages.
     */
    public fun plan(vararg plan: Any) {
        _plan.addAll(listOf(*plan))
    }

    /**
     * A list of stages.
     *
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
     *
     * @param plan A list of stages.
     */
    public fun plan(plan: Collection<Any>) {
        _plan.addAll(plan)
    }

    /**
     * A list of stages.
     *
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
     *
     * @param plan A list of stages.
     */
    public fun plan(plan: IResolvable) {
        cdkBuilder.plan(plan)
    }

    /**
     * Refers to the type of contact:.
     * * `PERSONAL` : A single, individual contact.
     * * `ESCALATION` : An escalation plan.
     * * `ONCALL_SCHEDULE` : An on-call schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-type)
     *
     * @param type Refers to the type of contact:.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnContact {
        if (_plan.isNotEmpty()) cdkBuilder.plan(_plan)
        return cdkBuilder.build()
    }
}
