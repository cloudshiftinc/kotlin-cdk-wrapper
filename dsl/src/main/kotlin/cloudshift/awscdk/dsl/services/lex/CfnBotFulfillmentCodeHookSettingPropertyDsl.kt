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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Determines if a Lambda function should be invoked for a specific intent.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentcodehooksetting.html)
 */
@CdkDslMarker
public class CfnBotFulfillmentCodeHookSettingPropertyDsl {
    private val cdkBuilder: CfnBot.FulfillmentCodeHookSettingProperty.Builder =
        CfnBot.FulfillmentCodeHookSettingProperty.builder()

    /**
     * @param enabled Indicates whether a Lambda function should be invoked to fulfill a specific
     *   intent.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Indicates whether a Lambda function should be invoked to fulfill a specific
     *   intent.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param fulfillmentUpdatesSpecification Provides settings for update messages sent to the user
     *   for long-running Lambda fulfillment functions. Fulfillment updates can be used only with
     *   streaming conversations.
     */
    public fun fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification: IResolvable) {
        cdkBuilder.fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification)
    }

    /**
     * @param fulfillmentUpdatesSpecification Provides settings for update messages sent to the user
     *   for long-running Lambda fulfillment functions. Fulfillment updates can be used only with
     *   streaming conversations.
     */
    public fun fulfillmentUpdatesSpecification(
        fulfillmentUpdatesSpecification: CfnBot.FulfillmentUpdatesSpecificationProperty
    ) {
        cdkBuilder.fulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification)
    }

    /**
     * @param isActive Determines whether the fulfillment code hook is used. When `active` is false,
     *   the code hook doesn't run.
     */
    public fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
    }

    /**
     * @param isActive Determines whether the fulfillment code hook is used. When `active` is false,
     *   the code hook doesn't run.
     */
    public fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive)
    }

    /**
     * @param postFulfillmentStatusSpecification Provides settings for messages sent to the user for
     *   after the Lambda fulfillment function completes. Post-fulfillment messages can be sent for
     *   both streaming and non-streaming conversations.
     */
    public fun postFulfillmentStatusSpecification(postFulfillmentStatusSpecification: IResolvable) {
        cdkBuilder.postFulfillmentStatusSpecification(postFulfillmentStatusSpecification)
    }

    /**
     * @param postFulfillmentStatusSpecification Provides settings for messages sent to the user for
     *   after the Lambda fulfillment function completes. Post-fulfillment messages can be sent for
     *   both streaming and non-streaming conversations.
     */
    public fun postFulfillmentStatusSpecification(
        postFulfillmentStatusSpecification: CfnBot.PostFulfillmentStatusSpecificationProperty
    ) {
        cdkBuilder.postFulfillmentStatusSpecification(postFulfillmentStatusSpecification)
    }

    public fun build(): CfnBot.FulfillmentCodeHookSettingProperty = cdkBuilder.build()
}
