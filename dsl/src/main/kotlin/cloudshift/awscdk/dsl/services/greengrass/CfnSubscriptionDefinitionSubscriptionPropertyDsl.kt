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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition
import kotlin.String

@CdkDslMarker
public class CfnSubscriptionDefinitionSubscriptionPropertyDsl {
    private val cdkBuilder: CfnSubscriptionDefinition.SubscriptionProperty.Builder =
        CfnSubscriptionDefinition.SubscriptionProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun subject(subject: String) {
        cdkBuilder.subject(subject)
    }

    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnSubscriptionDefinition.SubscriptionProperty = cdkBuilder.build()
}
