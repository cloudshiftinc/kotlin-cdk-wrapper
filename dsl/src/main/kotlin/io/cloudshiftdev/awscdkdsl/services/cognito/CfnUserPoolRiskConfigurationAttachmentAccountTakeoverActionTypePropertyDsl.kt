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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

/**
 * Account takeover action type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * AccountTakeoverActionTypeProperty accountTakeoverActionTypeProperty =
 * AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html)
 */
@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionTypePropertyDsl {
    private val cdkBuilder:
        CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.builder()

    /**
     * @param eventAction The action to take in response to the account takeover action. Valid
     *   values are as follows:.
     * * `BLOCK` Choosing this action will block the request.
     * * `MFA_IF_CONFIGURED` Present an MFA challenge if user has configured it, else allow the
     *   request.
     * * `MFA_REQUIRED` Present an MFA challenge if user has configured it, else block the request.
     * * `NO_ACTION` Allow the user to sign in.
     */
    public fun eventAction(eventAction: String) {
        cdkBuilder.eventAction(eventAction)
    }

    /** @param notify Flag specifying whether to send a notification. */
    public fun notify(notify: Boolean) {
        cdkBuilder.notify(notify)
    }

    /** @param notify Flag specifying whether to send a notification. */
    public fun notify(notify: IResolvable) {
        cdkBuilder.notify(notify)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty =
        cdkBuilder.build()
}
