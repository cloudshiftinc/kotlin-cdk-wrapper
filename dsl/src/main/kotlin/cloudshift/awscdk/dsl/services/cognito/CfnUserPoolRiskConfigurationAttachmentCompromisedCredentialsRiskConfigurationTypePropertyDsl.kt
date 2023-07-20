@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class
CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypePropertyDsl {
    private val cdkBuilder:
        CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.builder()

    private val _eventFilter: MutableList<String> = mutableListOf()

    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    public fun actions(actions: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty) {
        cdkBuilder.actions(actions)
    }

    public fun eventFilter(vararg eventFilter: String) {
        _eventFilter.addAll(listOf(*eventFilter))
    }

    public fun eventFilter(eventFilter: Collection<String>) {
        _eventFilter.addAll(eventFilter)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty {
        if (_eventFilter.isNotEmpty()) cdkBuilder.eventFilter(_eventFilter)
        return cdkBuilder.build()
    }
}
