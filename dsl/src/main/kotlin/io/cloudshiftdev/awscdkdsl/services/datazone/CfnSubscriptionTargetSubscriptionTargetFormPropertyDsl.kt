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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datazone.CfnSubscriptionTarget

/**
 * The details of the subscription target configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * SubscriptionTargetFormProperty subscriptionTargetFormProperty =
 * SubscriptionTargetFormProperty.builder()
 * .content("content")
 * .formName("formName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-subscriptiontarget-subscriptiontargetform.html)
 */
@CdkDslMarker
public class CfnSubscriptionTargetSubscriptionTargetFormPropertyDsl {
    private val cdkBuilder: CfnSubscriptionTarget.SubscriptionTargetFormProperty.Builder =
        CfnSubscriptionTarget.SubscriptionTargetFormProperty.builder()

    /** @param content The content of the subscription target configuration. */
    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    /** @param formName The form name included in the subscription target configuration. */
    public fun formName(formName: String) {
        cdkBuilder.formName(formName)
    }

    public fun build(): CfnSubscriptionTarget.SubscriptionTargetFormProperty = cdkBuilder.build()
}
