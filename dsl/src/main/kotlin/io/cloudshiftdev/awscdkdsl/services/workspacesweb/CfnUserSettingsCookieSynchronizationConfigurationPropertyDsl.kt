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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.workspacesweb.CfnUserSettings

/**
 * The configuration that specifies which cookies should be synchronized from the end user's local
 * browser to the remote browser.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CookieSynchronizationConfigurationProperty cookieSynchronizationConfigurationProperty =
 * CookieSynchronizationConfigurationProperty.builder()
 * .allowlist(List.of(CookieSpecificationProperty.builder()
 * .domain("domain")
 * // the properties below are optional
 * .name("name")
 * .path("path")
 * .build()))
 * // the properties below are optional
 * .blocklist(List.of(CookieSpecificationProperty.builder()
 * .domain("domain")
 * // the properties below are optional
 * .name("name")
 * .path("path")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiesynchronizationconfiguration.html)
 */
@CdkDslMarker
public class CfnUserSettingsCookieSynchronizationConfigurationPropertyDsl {
    private val cdkBuilder: CfnUserSettings.CookieSynchronizationConfigurationProperty.Builder =
        CfnUserSettings.CookieSynchronizationConfigurationProperty.builder()

    private val _allowlist: MutableList<Any> = mutableListOf()

    private val _blocklist: MutableList<Any> = mutableListOf()

    /**
     * @param allowlist The list of cookie specifications that are allowed to be synchronized to the
     *   remote browser.
     */
    public fun allowlist(vararg allowlist: Any) {
        _allowlist.addAll(listOf(*allowlist))
    }

    /**
     * @param allowlist The list of cookie specifications that are allowed to be synchronized to the
     *   remote browser.
     */
    public fun allowlist(allowlist: Collection<Any>) {
        _allowlist.addAll(allowlist)
    }

    /**
     * @param allowlist The list of cookie specifications that are allowed to be synchronized to the
     *   remote browser.
     */
    public fun allowlist(allowlist: IResolvable) {
        cdkBuilder.allowlist(allowlist)
    }

    /**
     * @param blocklist The list of cookie specifications that are blocked from being synchronized
     *   to the remote browser.
     */
    public fun blocklist(vararg blocklist: Any) {
        _blocklist.addAll(listOf(*blocklist))
    }

    /**
     * @param blocklist The list of cookie specifications that are blocked from being synchronized
     *   to the remote browser.
     */
    public fun blocklist(blocklist: Collection<Any>) {
        _blocklist.addAll(blocklist)
    }

    /**
     * @param blocklist The list of cookie specifications that are blocked from being synchronized
     *   to the remote browser.
     */
    public fun blocklist(blocklist: IResolvable) {
        cdkBuilder.blocklist(blocklist)
    }

    public fun build(): CfnUserSettings.CookieSynchronizationConfigurationProperty {
        if (_allowlist.isNotEmpty()) cdkBuilder.allowlist(_allowlist)
        if (_blocklist.isNotEmpty()) cdkBuilder.blocklist(_blocklist)
        return cdkBuilder.build()
    }
}
