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

@CdkDslMarker
public class CfnBotWaitAndContinueSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.WaitAndContinueSpecificationProperty.Builder =
        CfnBot.WaitAndContinueSpecificationProperty.builder()

    public fun continueResponse(continueResponse: IResolvable) {
        cdkBuilder.continueResponse(continueResponse)
    }

    public fun continueResponse(continueResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.continueResponse(continueResponse)
    }

    public fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
    }

    public fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive)
    }

    public fun stillWaitingResponse(stillWaitingResponse: IResolvable) {
        cdkBuilder.stillWaitingResponse(stillWaitingResponse)
    }

    public fun stillWaitingResponse(stillWaitingResponse: CfnBot.StillWaitingResponseSpecificationProperty) {
        cdkBuilder.stillWaitingResponse(stillWaitingResponse)
    }

    public fun waitingResponse(waitingResponse: IResolvable) {
        cdkBuilder.waitingResponse(waitingResponse)
    }

    public fun waitingResponse(waitingResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.waitingResponse(waitingResponse)
    }

    public fun build(): CfnBot.WaitAndContinueSpecificationProperty = cdkBuilder.build()
}
