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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

/**
 * The compromised credentials risk configuration type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CompromisedCredentialsRiskConfigurationTypeProperty
 * compromisedCredentialsRiskConfigurationTypeProperty =
 * CompromisedCredentialsRiskConfigurationTypeProperty.builder()
 * .actions(CompromisedCredentialsActionsTypeProperty.builder()
 * .eventAction("eventAction")
 * .build())
 * // the properties below are optional
 * .eventFilter(List.of("eventFilter"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html)
 */
@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypePropertyDsl {
    private val cdkBuilder:
        CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty
            .builder()

    private val _eventFilter: MutableList<String> = mutableListOf()

    /** @param actions The compromised credentials risk configuration actions. */
    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    /** @param actions The compromised credentials risk configuration actions. */
    public fun actions(
        actions: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty
    ) {
        cdkBuilder.actions(actions)
    }

    /**
     * @param eventFilter Perform the action for these events. The default is to perform all events
     *   if no event filter is specified.
     */
    public fun eventFilter(vararg eventFilter: String) {
        _eventFilter.addAll(listOf(*eventFilter))
    }

    /**
     * @param eventFilter Perform the action for these events. The default is to perform all events
     *   if no event filter is specified.
     */
    public fun eventFilter(eventFilter: Collection<String>) {
        _eventFilter.addAll(eventFilter)
    }

    public fun build():
        CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty {
        if (_eventFilter.isNotEmpty()) cdkBuilder.eventFilter(_eventFilter)
        return cdkBuilder.build()
    }
}
