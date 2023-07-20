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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CfnBotFulfillmentUpdatesSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.FulfillmentUpdatesSpecificationProperty.Builder =
        CfnBot.FulfillmentUpdatesSpecificationProperty.builder()

    public fun active(active: Boolean) {
        cdkBuilder.active(active)
    }

    public fun active(active: IResolvable) {
        cdkBuilder.active(active)
    }

    public fun startResponse(startResponse: IResolvable) {
        cdkBuilder.startResponse(startResponse)
    }

    public fun startResponse(startResponse: CfnBot.FulfillmentStartResponseSpecificationProperty) {
        cdkBuilder.startResponse(startResponse)
    }

    public fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun updateResponse(updateResponse: IResolvable) {
        cdkBuilder.updateResponse(updateResponse)
    }

    public fun updateResponse(updateResponse: CfnBot.FulfillmentUpdateResponseSpecificationProperty) {
        cdkBuilder.updateResponse(updateResponse)
    }

    public fun build(): CfnBot.FulfillmentUpdatesSpecificationProperty = cdkBuilder.build()
}
