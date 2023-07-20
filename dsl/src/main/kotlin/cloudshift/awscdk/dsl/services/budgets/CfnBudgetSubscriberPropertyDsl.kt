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
import software.amazon.awscdk.services.budgets.CfnBudget
import kotlin.String

@CdkDslMarker
public class CfnBudgetSubscriberPropertyDsl {
    private val cdkBuilder: CfnBudget.SubscriberProperty.Builder =
        CfnBudget.SubscriberProperty.builder()

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun subscriptionType(subscriptionType: String) {
        cdkBuilder.subscriptionType(subscriptionType)
    }

    public fun build(): CfnBudget.SubscriberProperty = cdkBuilder.build()
}
