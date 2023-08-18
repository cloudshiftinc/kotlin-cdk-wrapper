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

    /** @param permission Indicates whether the action is enabled or disabled. */
    public fun permission(permission: String) {
        cdkBuilder.permission(permission)
    }

    public fun build(): CfnStack.UserSettingProperty = cdkBuilder.build()
}
