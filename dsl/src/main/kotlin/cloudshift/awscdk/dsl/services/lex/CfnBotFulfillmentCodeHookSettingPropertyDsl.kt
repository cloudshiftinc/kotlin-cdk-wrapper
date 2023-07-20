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
public class CfnBotFulfillmentCodeHookSettingPropertyDsl {
    private val cdkBuilder: CfnBot.FulfillmentCodeHookSettingProperty.Builder =
        CfnBot.FulfillmentCodeHookSettingProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: IResolvable) {
        cdkBuilder.fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification)
    }

    public fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: CfnBot.FulfillmentUpdatesSpecificationProperty) {
        cdkBuilder.fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification)
    }

    public fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
    }

    public fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive)
    }

    public fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: IResolvable) {
        cdkBuilder.postFulfillmentStatusSpecification(postFulfillmentStatusSpecification)
    }

    public fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: CfnBot.PostFulfillmentStatusSpecificationProperty) {
        cdkBuilder.postFulfillmentStatusSpecification(postFulfillmentStatusSpecification)
    }

    public fun build(): CfnBot.FulfillmentCodeHookSettingProperty = cdkBuilder.build()
}
