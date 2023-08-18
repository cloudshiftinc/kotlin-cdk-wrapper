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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnStack
import software.amazon.awscdk.services.appstream.CfnStackProps

/**
 * Properties for defining a `CfnStack`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnStackProps cfnStackProps = CfnStackProps.builder()
 * .accessEndpoints(List.of(AccessEndpointProperty.builder()
 * .endpointType("endpointType")
 * .vpceId("vpceId")
 * .build()))
 * .applicationSettings(ApplicationSettingsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .settingsGroup("settingsGroup")
 * .build())
 * .attributesToDelete(List.of("attributesToDelete"))
 * .deleteStorageConnectors(false)
 * .description("description")
 * .displayName("displayName")
 * .embedHostDomains(List.of("embedHostDomains"))
 * .feedbackUrl("feedbackUrl")
 * .name("name")
 * .redirectUrl("redirectUrl")
 * .storageConnectors(List.of(StorageConnectorProperty.builder()
 * .connectorType("connectorType")
 * // the properties below are optional
 * .domains(List.of("domains"))
 * .resourceIdentifier("resourceIdentifier")
 * .build()))
 * .streamingExperienceSettings(StreamingExperienceSettingsProperty.builder()
 * .preferredProtocol("preferredProtocol")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userSettings(List.of(UserSettingProperty.builder()
 * .action("action")
 * .permission("permission")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html)
 */
@CdkDslMarker
public class CfnStackPropsDsl {
    private val cdkBuilder: CfnStackProps.Builder = CfnStackProps.builder()

    private val _accessEndpoints: MutableList<Any> = mutableListOf()

    private val _attributesToDelete: MutableList<String> = mutableListOf()

    private val _embedHostDomains: MutableList<String> = mutableListOf()

    private val _storageConnectors: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userSettings: MutableList<Any> = mutableListOf()

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     *   Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     */
    public fun accessEndpoints(vararg accessEndpoints: Any) {
        _accessEndpoints.addAll(listOf(*accessEndpoints))
    }

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     *   Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     */
    public fun accessEndpoints(accessEndpoints: Collection<Any>) {
        _accessEndpoints.addAll(accessEndpoints)
    }

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     *   Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     */
    public fun accessEndpoints(accessEndpoints: IResolvable) {
        cdkBuilder.accessEndpoints(accessEndpoints)
    }

    /**
     * @param applicationSettings The persistent application settings for users of the stack. When
     *   these settings are enabled, changes that users make to applications and Windows settings
     *   are automatically saved after each session and applied to the next session.
     */
    public fun applicationSettings(applicationSettings: IResolvable) {
        cdkBuilder.applicationSettings(applicationSettings)
    }

    /**
     * @param applicationSettings The persistent application settings for users of the stack. When
     *   these settings are enabled, changes that users make to applications and Windows settings
     *   are automatically saved after each session and applied to the next session.
     */
    public fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty) {
        cdkBuilder.applicationSettings(applicationSettings)
    }

    /** @param attributesToDelete The stack attributes to delete. */
    public fun attributesToDelete(vararg attributesToDelete: String) {
        _attributesToDelete.addAll(listOf(*attributesToDelete))
    }

    /** @param attributesToDelete The stack attributes to delete. */
    public fun attributesToDelete(attributesToDelete: Collection<String>) {
        _attributesToDelete.addAll(attributesToDelete)
    }

    /**
     * @param deleteStorageConnectors *This parameter has been deprecated.*. Deletes the storage
     *   connectors currently enabled for the stack.
     */
    public fun deleteStorageConnectors(deleteStorageConnectors: Boolean) {
        cdkBuilder.deleteStorageConnectors(deleteStorageConnectors)
    }

    /**
     * @param deleteStorageConnectors *This parameter has been deprecated.*. Deletes the storage
     *   connectors currently enabled for the stack.
     */
    public fun deleteStorageConnectors(deleteStorageConnectors: IResolvable) {
        cdkBuilder.deleteStorageConnectors(deleteStorageConnectors)
    }

    /** @param description The description to display. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param displayName The stack name to display. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     *   an iframe. You must approve the domains that you want to host embedded AppStream 2.0
     *   streaming sessions.
     */
    public fun embedHostDomains(vararg embedHostDomains: String) {
        _embedHostDomains.addAll(listOf(*embedHostDomains))
    }

    /**
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     *   an iframe. You must approve the domains that you want to host embedded AppStream 2.0
     *   streaming sessions.
     */
    public fun embedHostDomains(embedHostDomains: Collection<String>) {
        _embedHostDomains.addAll(embedHostDomains)
    }

    /**
     * @param feedbackUrl The URL that users are redirected to after they click the Send Feedback
     *   link. If no URL is specified, no Send Feedback link is displayed.
     */
    public fun feedbackUrl(feedbackUrl: String) {
        cdkBuilder.feedbackUrl(feedbackUrl)
    }

    /** @param name The name of the stack. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param redirectUrl The URL that users are redirected to after their streaming session ends.
     */
    public fun redirectUrl(redirectUrl: String) {
        cdkBuilder.redirectUrl(redirectUrl)
    }

    /** @param storageConnectors The storage connectors to enable. */
    public fun storageConnectors(vararg storageConnectors: Any) {
        _storageConnectors.addAll(listOf(*storageConnectors))
    }

    /** @param storageConnectors The storage connectors to enable. */
    public fun storageConnectors(storageConnectors: Collection<Any>) {
        _storageConnectors.addAll(storageConnectors)
    }

    /** @param storageConnectors The storage connectors to enable. */
    public fun storageConnectors(storageConnectors: IResolvable) {
        cdkBuilder.storageConnectors(storageConnectors)
    }

    /**
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     *   This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     */
    public fun streamingExperienceSettings(streamingExperienceSettings: IResolvable) {
        cdkBuilder.streamingExperienceSettings(streamingExperienceSettings)
    }

    /**
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     *   This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     */
    public fun streamingExperienceSettings(
        streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty
    ) {
        cdkBuilder.streamingExperienceSettings(streamingExperienceSettings)
    }

    /** @param tags An array of key-value pairs. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An array of key-value pairs. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     *   sessions. By default, these actions are enabled.
     */
    public fun userSettings(vararg userSettings: Any) {
        _userSettings.addAll(listOf(*userSettings))
    }

    /**
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     *   sessions. By default, these actions are enabled.
     */
    public fun userSettings(userSettings: Collection<Any>) {
        _userSettings.addAll(userSettings)
    }

    /**
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     *   sessions. By default, these actions are enabled.
     */
    public fun userSettings(userSettings: IResolvable) {
        cdkBuilder.userSettings(userSettings)
    }

    public fun build(): CfnStackProps {
        if (_accessEndpoints.isNotEmpty()) cdkBuilder.accessEndpoints(_accessEndpoints)
        if (_attributesToDelete.isNotEmpty()) cdkBuilder.attributesToDelete(_attributesToDelete)
        if (_embedHostDomains.isNotEmpty()) cdkBuilder.embedHostDomains(_embedHostDomains)
        if (_storageConnectors.isNotEmpty()) cdkBuilder.storageConnectors(_storageConnectors)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userSettings.isNotEmpty()) cdkBuilder.userSettings(_userSettings)
        return cdkBuilder.build()
    }
}
