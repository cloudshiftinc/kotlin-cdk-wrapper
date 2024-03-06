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

package io.cloudshiftdev.awscdkdsl.services.workspacesweb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.workspacesweb.CfnUserSettings

/**
 * Specifies a single cookie or set of cookies in an end user's browser.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CookieSpecificationProperty cookieSpecificationProperty = CookieSpecificationProperty.builder()
 * .domain("domain")
 * // the properties below are optional
 * .name("name")
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiespecification.html)
 */
@CdkDslMarker
public class CfnUserSettingsCookieSpecificationPropertyDsl {
    private val cdkBuilder: CfnUserSettings.CookieSpecificationProperty.Builder =
        CfnUserSettings.CookieSpecificationProperty.builder()

    /** @param domain The domain of the cookie. */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /** @param name The name of the cookie. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param path The path of the cookie. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnUserSettings.CookieSpecificationProperty = cdkBuilder.build()
}
