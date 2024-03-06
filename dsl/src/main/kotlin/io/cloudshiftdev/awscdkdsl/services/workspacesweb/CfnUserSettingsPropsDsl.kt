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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.workspacesweb.CfnUserSettings
import software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps

/**
 * Properties for defining a `CfnUserSettings`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnUserSettingsProps cfnUserSettingsProps = CfnUserSettingsProps.builder()
 * .copyAllowed("copyAllowed")
 * .downloadAllowed("downloadAllowed")
 * .pasteAllowed("pasteAllowed")
 * .printAllowed("printAllowed")
 * .uploadAllowed("uploadAllowed")
 * // the properties below are optional
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .cookieSynchronizationConfiguration(CookieSynchronizationConfigurationProperty.builder()
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
 * .build())
 * .customerManagedKey("customerManagedKey")
 * .disconnectTimeoutInMinutes(123)
 * .idleDisconnectTimeoutInMinutes(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html)
 */
@CdkDslMarker
public class CfnUserSettingsPropsDsl {
    private val cdkBuilder: CfnUserSettingsProps.Builder = CfnUserSettingsProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param additionalEncryptionContext the value to be set. */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /** @param additionalEncryptionContext the value to be set. */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     *   should be synchronized from the end user's local browser to the remote browser.
     */
    public fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: IResolvable) {
        cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration)
    }

    /**
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     *   should be synchronized from the end user's local browser to the remote browser.
     */
    public fun cookieSynchronizationConfiguration(
        cookieSynchronizationConfiguration:
            CfnUserSettings.CookieSynchronizationConfigurationProperty
    ) {
        cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration)
    }

    /**
     * @param copyAllowed Specifies whether the user can copy text from the streaming session to the
     *   local device.
     */
    public fun copyAllowed(copyAllowed: String) {
        cdkBuilder.copyAllowed(copyAllowed)
    }

    /** @param customerManagedKey the value to be set. */
    public fun customerManagedKey(customerManagedKey: String) {
        cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * @param disconnectTimeoutInMinutes The amount of time that a streaming session remains active
     *   after users disconnect.
     */
    public fun disconnectTimeoutInMinutes(disconnectTimeoutInMinutes: Number) {
        cdkBuilder.disconnectTimeoutInMinutes(disconnectTimeoutInMinutes)
    }

    /**
     * @param downloadAllowed Specifies whether the user can download files from the streaming
     *   session to the local device.
     */
    public fun downloadAllowed(downloadAllowed: String) {
        cdkBuilder.downloadAllowed(downloadAllowed)
    }

    /**
     * @param idleDisconnectTimeoutInMinutes The amount of time that users can be idle (inactive)
     *   before they are disconnected from their streaming session and the disconnect timeout
     *   interval begins.
     */
    public fun idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes: Number) {
        cdkBuilder.idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes)
    }

    /**
     * @param pasteAllowed Specifies whether the user can paste text from the local device to the
     *   streaming session.
     */
    public fun pasteAllowed(pasteAllowed: String) {
        cdkBuilder.pasteAllowed(pasteAllowed)
    }

    /** @param printAllowed Specifies whether the user can print to the local device. */
    public fun printAllowed(printAllowed: String) {
        cdkBuilder.printAllowed(printAllowed)
    }

    /** @param tags The tags to add to the user settings resource. A tag is a key-value pair. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to add to the user settings resource. A tag is a key-value pair. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param uploadAllowed Specifies whether the user can upload files from the local device to the
     *   streaming session.
     */
    public fun uploadAllowed(uploadAllowed: String) {
        cdkBuilder.uploadAllowed(uploadAllowed)
    }

    public fun build(): CfnUserSettingsProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
