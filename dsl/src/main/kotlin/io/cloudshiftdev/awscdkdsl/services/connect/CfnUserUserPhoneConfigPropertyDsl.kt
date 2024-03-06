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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnUser

/**
 * Contains information about the phone configuration settings for a user.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * UserPhoneConfigProperty userPhoneConfigProperty = UserPhoneConfigProperty.builder()
 * .phoneType("phoneType")
 * // the properties below are optional
 * .afterContactWorkTimeLimit(123)
 * .autoAccept(false)
 * .deskPhoneNumber("deskPhoneNumber")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html)
 */
@CdkDslMarker
public class CfnUserUserPhoneConfigPropertyDsl {
    private val cdkBuilder: CfnUser.UserPhoneConfigProperty.Builder =
        CfnUser.UserPhoneConfigProperty.builder()

    /**
     * @param afterContactWorkTimeLimit The After Call Work (ACW) timeout setting, in seconds. This
     *   parameter has a minimum value of 0 and a maximum value of 2,000,000 seconds (24 days).
     *   Enter 0 if you don't want to allocate a specific amount of ACW time. It essentially means
     *   an indefinite amount of time. When the conversation ends, ACW starts; the agent must choose
     *   Close contact to end ACW.
     *
     * When returned by a `SearchUsers` call, `AfterContactWorkTimeLimit` is returned in
     * milliseconds.
     */
    public fun afterContactWorkTimeLimit(afterContactWorkTimeLimit: Number) {
        cdkBuilder.afterContactWorkTimeLimit(afterContactWorkTimeLimit)
    }

    /** @param autoAccept The Auto accept setting. */
    public fun autoAccept(autoAccept: Boolean) {
        cdkBuilder.autoAccept(autoAccept)
    }

    /** @param autoAccept The Auto accept setting. */
    public fun autoAccept(autoAccept: IResolvable) {
        cdkBuilder.autoAccept(autoAccept)
    }

    /** @param deskPhoneNumber The phone number for the user's desk phone. */
    public fun deskPhoneNumber(deskPhoneNumber: String) {
        cdkBuilder.deskPhoneNumber(deskPhoneNumber)
    }

    /** @param phoneType The phone type. */
    public fun phoneType(phoneType: String) {
        cdkBuilder.phoneType(phoneType)
    }

    public fun build(): CfnUser.UserPhoneConfigProperty = cdkBuilder.build()
}
