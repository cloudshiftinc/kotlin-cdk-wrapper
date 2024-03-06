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
import software.constructs.Construct

/**
 * This resource specifies user settings that can be associated with a web portal.
 *
 * Once associated with a web portal, user settings control how users can transfer data between a
 * streaming session and the their local devices.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnUserSettings cfnUserSettings = CfnUserSettings.Builder.create(this, "MyCfnUserSettings")
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
public class CfnUserSettingsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserSettings.Builder = CfnUserSettings.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-additionalencryptioncontext)
     *
     * @param additionalEncryptionContext
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-additionalencryptioncontext)
     *
     * @param additionalEncryptionContext
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The configuration that specifies which cookies should be synchronized from the end user's
     * local browser to the remote browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration)
     *
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     *   should be synchronized from the end user's local browser to the remote browser.
     */
    public fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: IResolvable) {
        cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration)
    }

    /**
     * The configuration that specifies which cookies should be synchronized from the end user's
     * local browser to the remote browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration)
     *
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
     * Specifies whether the user can copy text from the streaming session to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-copyallowed)
     *
     * @param copyAllowed Specifies whether the user can copy text from the streaming session to the
     *   local device.
     */
    public fun copyAllowed(copyAllowed: String) {
        cdkBuilder.copyAllowed(copyAllowed)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-customermanagedkey)
     *
     * @param customerManagedKey
     */
    public fun customerManagedKey(customerManagedKey: String) {
        cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * The amount of time that a streaming session remains active after users disconnect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-disconnecttimeoutinminutes)
     *
     * @param disconnectTimeoutInMinutes The amount of time that a streaming session remains active
     *   after users disconnect.
     */
    public fun disconnectTimeoutInMinutes(disconnectTimeoutInMinutes: Number) {
        cdkBuilder.disconnectTimeoutInMinutes(disconnectTimeoutInMinutes)
    }

    /**
     * Specifies whether the user can download files from the streaming session to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-downloadallowed)
     *
     * @param downloadAllowed Specifies whether the user can download files from the streaming
     *   session to the local device.
     */
    public fun downloadAllowed(downloadAllowed: String) {
        cdkBuilder.downloadAllowed(downloadAllowed)
    }

    /**
     * The amount of time that users can be idle (inactive) before they are disconnected from their
     * streaming session and the disconnect timeout interval begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-idledisconnecttimeoutinminutes)
     *
     * @param idleDisconnectTimeoutInMinutes The amount of time that users can be idle (inactive)
     *   before they are disconnected from their streaming session and the disconnect timeout
     *   interval begins.
     */
    public fun idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes: Number) {
        cdkBuilder.idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes)
    }

    /**
     * Specifies whether the user can paste text from the local device to the streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-pasteallowed)
     *
     * @param pasteAllowed Specifies whether the user can paste text from the local device to the
     *   streaming session.
     */
    public fun pasteAllowed(pasteAllowed: String) {
        cdkBuilder.pasteAllowed(pasteAllowed)
    }

    /**
     * Specifies whether the user can print to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-printallowed)
     *
     * @param printAllowed Specifies whether the user can print to the local device.
     */
    public fun printAllowed(printAllowed: String) {
        cdkBuilder.printAllowed(printAllowed)
    }

    /**
     * The tags to add to the user settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-tags)
     *
     * @param tags The tags to add to the user settings resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to add to the user settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-tags)
     *
     * @param tags The tags to add to the user settings resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Specifies whether the user can upload files from the local device to the streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-uploadallowed)
     *
     * @param uploadAllowed Specifies whether the user can upload files from the local device to the
     *   streaming session.
     */
    public fun uploadAllowed(uploadAllowed: String) {
        cdkBuilder.uploadAllowed(uploadAllowed)
    }

    public fun build(): CfnUserSettings {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
