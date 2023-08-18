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
import software.constructs.Construct

/**
 * The `AWS::AppStream::Stack` resource creates a stack to start streaming applications to Amazon
 * AppStream 2.0 users. A stack consists of an associated fleet, user access policies, and storage
 * configurations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnStack cfnStack = CfnStack.Builder.create(this, "MyCfnStack")
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
public class CfnStackDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStack.Builder = CfnStack.Builder.create(scope, id)

    private val _accessEndpoints: MutableList<Any> = mutableListOf()

    private val _attributesToDelete: MutableList<String> = mutableListOf()

    private val _embedHostDomains: MutableList<String> = mutableListOf()

    private val _storageConnectors: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userSettings: MutableList<Any> = mutableListOf()

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
     *
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     */
    public fun accessEndpoints(vararg accessEndpoints: Any) {
        _accessEndpoints.addAll(listOf(*accessEndpoints))
    }

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
     *
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     */
    public fun accessEndpoints(accessEndpoints: Collection<Any>) {
        _accessEndpoints.addAll(accessEndpoints)
    }

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
     *
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     */
    public fun accessEndpoints(accessEndpoints: IResolvable) {
        cdkBuilder.accessEndpoints(accessEndpoints)
    }

    /**
     * The persistent application settings for users of the stack.
     *
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-applicationsettings)
     *
     * @param applicationSettings The persistent application settings for users of the stack.
     */
    public fun applicationSettings(applicationSettings: IResolvable) {
        cdkBuilder.applicationSettings(applicationSettings)
    }

    /**
     * The persistent application settings for users of the stack.
     *
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-applicationsettings)
     *
     * @param applicationSettings The persistent application settings for users of the stack.
     */
    public fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty) {
        cdkBuilder.applicationSettings(applicationSettings)
    }

    /**
     * The stack attributes to delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete)
     *
     * @param attributesToDelete The stack attributes to delete.
     */
    public fun attributesToDelete(vararg attributesToDelete: String) {
        _attributesToDelete.addAll(listOf(*attributesToDelete))
    }

    /**
     * The stack attributes to delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete)
     *
     * @param attributesToDelete The stack attributes to delete.
     */
    public fun attributesToDelete(attributesToDelete: Collection<String>) {
        _attributesToDelete.addAll(attributesToDelete)
    }

    /**
     * *This parameter has been deprecated.*.
     *
     * Deletes the storage connectors currently enabled for the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors)
     *
     * @param deleteStorageConnectors *This parameter has been deprecated.*.
     */
    public fun deleteStorageConnectors(deleteStorageConnectors: Boolean) {
        cdkBuilder.deleteStorageConnectors(deleteStorageConnectors)
    }

    /**
     * *This parameter has been deprecated.*.
     *
     * Deletes the storage connectors currently enabled for the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors)
     *
     * @param deleteStorageConnectors *This parameter has been deprecated.*.
     */
    public fun deleteStorageConnectors(deleteStorageConnectors: IResolvable) {
        cdkBuilder.deleteStorageConnectors(deleteStorageConnectors)
    }

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-description)
     *
     * @param description The description to display.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The stack name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-displayname)
     *
     * @param displayName The stack name to display.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
     * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains)
     *
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     *   an iframe. You must approve the domains that you want to host embedded AppStream 2.0
     *   streaming sessions.
     */
    public fun embedHostDomains(vararg embedHostDomains: String) {
        _embedHostDomains.addAll(listOf(*embedHostDomains))
    }

    /**
     * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
     * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains)
     *
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     *   an iframe. You must approve the domains that you want to host embedded AppStream 2.0
     *   streaming sessions.
     */
    public fun embedHostDomains(embedHostDomains: Collection<String>) {
        _embedHostDomains.addAll(embedHostDomains)
    }

    /**
     * The URL that users are redirected to after they click the Send Feedback link.
     *
     * If no URL is specified, no Send Feedback link is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-feedbackurl)
     *
     * @param feedbackUrl The URL that users are redirected to after they click the Send Feedback
     *   link.
     */
    public fun feedbackUrl(feedbackUrl: String) {
        cdkBuilder.feedbackUrl(feedbackUrl)
    }

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-name)
     *
     * @param name The name of the stack.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The URL that users are redirected to after their streaming session ends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-redirecturl)
     *
     * @param redirectUrl The URL that users are redirected to after their streaming session ends.
     */
    public fun redirectUrl(redirectUrl: String) {
        cdkBuilder.redirectUrl(redirectUrl)
    }

    /**
     * The storage connectors to enable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
     *
     * @param storageConnectors The storage connectors to enable.
     */
    public fun storageConnectors(vararg storageConnectors: Any) {
        _storageConnectors.addAll(listOf(*storageConnectors))
    }

    /**
     * The storage connectors to enable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
     *
     * @param storageConnectors The storage connectors to enable.
     */
    public fun storageConnectors(storageConnectors: Collection<Any>) {
        _storageConnectors.addAll(storageConnectors)
    }

    /**
     * The storage connectors to enable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
     *
     * @param storageConnectors The storage connectors to enable.
     */
    public fun storageConnectors(storageConnectors: IResolvable) {
        cdkBuilder.storageConnectors(storageConnectors)
    }

    /**
     * The streaming protocol that you want your stack to prefer.
     *
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-streamingexperiencesettings)
     *
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     */
    public fun streamingExperienceSettings(streamingExperienceSettings: IResolvable) {
        cdkBuilder.streamingExperienceSettings(streamingExperienceSettings)
    }

    /**
     * The streaming protocol that you want your stack to prefer.
     *
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-streamingexperiencesettings)
     *
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     */
    public fun streamingExperienceSettings(
        streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty
    ) {
        cdkBuilder.streamingExperienceSettings(streamingExperienceSettings)
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags)
     *
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags)
     *
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The actions that are enabled or disabled for users during their streaming sessions.
     *
     * By default, these actions are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
     *
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     *   sessions.
     */
    public fun userSettings(vararg userSettings: Any) {
        _userSettings.addAll(listOf(*userSettings))
    }

    /**
     * The actions that are enabled or disabled for users during their streaming sessions.
     *
     * By default, these actions are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
     *
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     *   sessions.
     */
    public fun userSettings(userSettings: Collection<Any>) {
        _userSettings.addAll(userSettings)
    }

    /**
     * The actions that are enabled or disabled for users during their streaming sessions.
     *
     * By default, these actions are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
     *
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     *   sessions.
     */
    public fun userSettings(userSettings: IResolvable) {
        cdkBuilder.userSettings(userSettings)
    }

    public fun build(): CfnStack {
        if (_accessEndpoints.isNotEmpty()) cdkBuilder.accessEndpoints(_accessEndpoints)
        if (_attributesToDelete.isNotEmpty()) cdkBuilder.attributesToDelete(_attributesToDelete)
        if (_embedHostDomains.isNotEmpty()) cdkBuilder.embedHostDomains(_embedHostDomains)
        if (_storageConnectors.isNotEmpty()) cdkBuilder.storageConnectors(_storageConnectors)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userSettings.isNotEmpty()) cdkBuilder.userSettings(_userSettings)
        return cdkBuilder.build()
    }
}
