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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

/**
 * The type of notification recipient.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * NotificationRecipientTypeProperty notificationRecipientTypeProperty =
 * NotificationRecipientTypeProperty.builder()
 * .userArns(List.of("userArns"))
 * .userTags(Map.of(
 * "userTagsKey", "userTags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-notificationrecipienttype.html)
 */
@CdkDslMarker
public class CfnRuleNotificationRecipientTypePropertyDsl {
    private val cdkBuilder: CfnRule.NotificationRecipientTypeProperty.Builder =
        CfnRule.NotificationRecipientTypeProperty.builder()

    private val _userArns: MutableList<String> = mutableListOf()

    /** @param userArns The Amazon Resource Name (ARN) of the user account. */
    public fun userArns(vararg userArns: String) {
        _userArns.addAll(listOf(*userArns))
    }

    /** @param userArns The Amazon Resource Name (ARN) of the user account. */
    public fun userArns(userArns: Collection<String>) {
        _userArns.addAll(userArns)
    }

    /**
     * @param userTags The tags used to organize, track, or control access for this resource. For
     *   example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the
     *   specified tags will be notified.
     */
    public fun userTags(userTags: Map<String, String>) {
        cdkBuilder.userTags(userTags)
    }

    /**
     * @param userTags The tags used to organize, track, or control access for this resource. For
     *   example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the
     *   specified tags will be notified.
     */
    public fun userTags(userTags: IResolvable) {
        cdkBuilder.userTags(userTags)
    }

    public fun build(): CfnRule.NotificationRecipientTypeProperty {
        if (_userArns.isNotEmpty()) cdkBuilder.userArns(_userArns)
        return cdkBuilder.build()
    }
}
