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

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.budgets.CfnBudgetsAction
import kotlin.String

@CdkDslMarker
public class CfnBudgetsActionSubscriberPropertyDsl {
    private val cdkBuilder: CfnBudgetsAction.SubscriberProperty.Builder =
        CfnBudgetsAction.SubscriberProperty.builder()

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnBudgetsAction.SubscriberProperty = cdkBuilder.build()
}
