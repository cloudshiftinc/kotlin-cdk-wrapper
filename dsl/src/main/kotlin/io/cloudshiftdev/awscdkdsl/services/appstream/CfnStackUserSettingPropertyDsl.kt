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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnStack

/**
 * Specifies an action and whether the action is enabled or disabled for users during their
 * streaming sessions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * UserSettingProperty userSettingProperty = UserSettingProperty.builder()
 * .action("action")
 * .permission("permission")
 * // the properties below are optional
 * .maximumLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-usersetting.html)
 */
@CdkDslMarker
public class CfnStackUserSettingPropertyDsl {
    private val cdkBuilder: CfnStack.UserSettingProperty.Builder =
        CfnStack.UserSettingProperty.builder()

    /** @param action The action that is enabled or disabled. */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param maximumLength Specifies the number of characters that can be copied by end users from
     *   the local device to the remote session, and to the local device from the remote session.
     *   This can be specified only for the `CLIPBOARD_COPY_FROM_LOCAL_DEVICE` and
     *   `CLIPBOARD_COPY_TO_LOCAL_DEVICE` actions.
     *
     * This defaults to 20,971,520 (20 MB) when unspecified and the permission is `ENABLED` . This
     * can't be specified when the permission is `DISABLED` .
     *
     * The value can be between 1 and 20,971,520 (20 MB).
     */
    public fun maximumLength(maximumLength: Number) {
        cdkBuilder.maximumLength(maximumLength)
    }

    /** @param permission Indicates whether the action is enabled or disabled. */
    public fun permission(permission: String) {
        cdkBuilder.permission(permission)
    }

    public fun build(): CfnStack.UserSettingProperty = cdkBuilder.build()
}
