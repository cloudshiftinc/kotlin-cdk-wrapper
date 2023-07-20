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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import kotlin.String

@CdkDslMarker
public class CfnIntegrationTriggerConfigPropertyDsl {
    private val cdkBuilder: CfnIntegration.TriggerConfigProperty.Builder =
        CfnIntegration.TriggerConfigProperty.builder()

    public fun triggerProperties(triggerProperties: IResolvable) {
        cdkBuilder.triggerProperties(triggerProperties)
    }

    public fun triggerProperties(triggerProperties: CfnIntegration.TriggerPropertiesProperty) {
        cdkBuilder.triggerProperties(triggerProperties)
    }

    public fun triggerType(triggerType: String) {
        cdkBuilder.triggerType(triggerType)
    }

    public fun build(): CfnIntegration.TriggerConfigProperty = cdkBuilder.build()
}
