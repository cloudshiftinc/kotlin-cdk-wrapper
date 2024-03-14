package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStackProps {
  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   *
   * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
   */
  public fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  /**
   * The persistent application settings for users of the stack.
   *
   * When these settings are enabled, changes that users make to applications and Windows settings
   * are automatically saved after each session and applied to the next session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-applicationsettings)
   */
  public fun applicationSettings(): Any? = unwrap(this).getApplicationSettings()

  /**
   * The stack attributes to delete.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete)
   */
  public fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
      emptyList()

  /**
   * *This parameter has been deprecated.*.
   *
   * Deletes the storage connectors currently enabled for the stack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors)
   */
  public fun deleteStorageConnectors(): Any? = unwrap(this).getDeleteStorageConnectors()

  /**
   * The description to display.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The stack name to display.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
   * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains)
   */
  public fun embedHostDomains(): List<String> = unwrap(this).getEmbedHostDomains() ?: emptyList()

  /**
   * The URL that users are redirected to after they click the Send Feedback link.
   *
   * If no URL is specified, no Send Feedback link is displayed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-feedbackurl)
   */
  public fun feedbackUrl(): String? = unwrap(this).getFeedbackUrl()

  /**
   * The name of the stack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The URL that users are redirected to after their streaming session ends.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-redirecturl)
   */
  public fun redirectUrl(): String? = unwrap(this).getRedirectUrl()

  /**
   * The storage connectors to enable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
   */
  public fun storageConnectors(): Any? = unwrap(this).getStorageConnectors()

  /**
   * The streaming protocol that you want your stack to prefer.
   *
   * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-streamingexperiencesettings)
   */
  public fun streamingExperienceSettings(): Any? = unwrap(this).getStreamingExperienceSettings()

  /**
   * An array of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The actions that are enabled or disabled for users during their streaming sessions.
   *
   * By default, these actions are enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
   */
  public fun userSettings(): Any? = unwrap(this).getUserSettings()

  /**
   * A builder for [CfnStackProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     */
    public fun accessEndpoints(accessEndpoints: IResolvable)

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     */
    public fun accessEndpoints(accessEndpoints: List<Any>)

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     */
    public fun accessEndpoints(vararg accessEndpoints: Any)

    /**
     * @param applicationSettings The persistent application settings for users of the stack.
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     */
    public fun applicationSettings(applicationSettings: IResolvable)

    /**
     * @param applicationSettings The persistent application settings for users of the stack.
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     */
    public fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty)

    /**
     * @param applicationSettings The persistent application settings for users of the stack.
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21acbad33bd06ee22741081fe027b547bbfe69a4753bf6fff5e4646e5a824bf4")
    public
        fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty.Builder.() -> Unit)

    /**
     * @param attributesToDelete The stack attributes to delete.
     */
    public fun attributesToDelete(attributesToDelete: List<String>)

    /**
     * @param attributesToDelete The stack attributes to delete.
     */
    public fun attributesToDelete(vararg attributesToDelete: String)

    /**
     * @param deleteStorageConnectors *This parameter has been deprecated.*.
     * Deletes the storage connectors currently enabled for the stack.
     */
    public fun deleteStorageConnectors(deleteStorageConnectors: Boolean)

    /**
     * @param deleteStorageConnectors *This parameter has been deprecated.*.
     * Deletes the storage connectors currently enabled for the stack.
     */
    public fun deleteStorageConnectors(deleteStorageConnectors: IResolvable)

    /**
     * @param description The description to display.
     */
    public fun description(description: String)

    /**
     * @param displayName The stack name to display.
     */
    public fun displayName(displayName: String)

    /**
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     * an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming
     * sessions.
     */
    public fun embedHostDomains(embedHostDomains: List<String>)

    /**
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     * an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming
     * sessions.
     */
    public fun embedHostDomains(vararg embedHostDomains: String)

    /**
     * @param feedbackUrl The URL that users are redirected to after they click the Send Feedback
     * link.
     * If no URL is specified, no Send Feedback link is displayed.
     */
    public fun feedbackUrl(feedbackUrl: String)

    /**
     * @param name The name of the stack.
     */
    public fun name(name: String)

    /**
     * @param redirectUrl The URL that users are redirected to after their streaming session ends.
     */
    public fun redirectUrl(redirectUrl: String)

    /**
     * @param storageConnectors The storage connectors to enable.
     */
    public fun storageConnectors(storageConnectors: IResolvable)

    /**
     * @param storageConnectors The storage connectors to enable.
     */
    public fun storageConnectors(storageConnectors: List<Any>)

    /**
     * @param storageConnectors The storage connectors to enable.
     */
    public fun storageConnectors(vararg storageConnectors: Any)

    /**
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     */
    public fun streamingExperienceSettings(streamingExperienceSettings: IResolvable)

    /**
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     */
    public
        fun streamingExperienceSettings(streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty)

    /**
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dab0ea31183bdca478c04a91e296136d26e8775865a252d857c7b88d30e47953")
    public
        fun streamingExperienceSettings(streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions.
     * By default, these actions are enabled.
     */
    public fun userSettings(userSettings: IResolvable)

    /**
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions.
     * By default, these actions are enabled.
     */
    public fun userSettings(userSettings: List<Any>)

    /**
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions.
     * By default, these actions are enabled.
     */
    public fun userSettings(vararg userSettings: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnStackProps.Builder =
        software.amazon.awscdk.services.appstream.CfnStackProps.builder()

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     */
    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable::unwrap))
    }

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     */
    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints)
    }

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     */
    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    /**
     * @param applicationSettings The persistent application settings for users of the stack.
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     */
    override fun applicationSettings(applicationSettings: IResolvable) {
      cdkBuilder.applicationSettings(applicationSettings.let(IResolvable::unwrap))
    }

    /**
     * @param applicationSettings The persistent application settings for users of the stack.
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     */
    override fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty) {
      cdkBuilder.applicationSettings(applicationSettings.let(CfnStack.ApplicationSettingsProperty::unwrap))
    }

    /**
     * @param applicationSettings The persistent application settings for users of the stack.
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21acbad33bd06ee22741081fe027b547bbfe69a4753bf6fff5e4646e5a824bf4")
    override
        fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty.Builder.() -> Unit):
        Unit = applicationSettings(CfnStack.ApplicationSettingsProperty(applicationSettings))

    /**
     * @param attributesToDelete The stack attributes to delete.
     */
    override fun attributesToDelete(attributesToDelete: List<String>) {
      cdkBuilder.attributesToDelete(attributesToDelete)
    }

    /**
     * @param attributesToDelete The stack attributes to delete.
     */
    override fun attributesToDelete(vararg attributesToDelete: String): Unit =
        attributesToDelete(attributesToDelete.toList())

    /**
     * @param deleteStorageConnectors *This parameter has been deprecated.*.
     * Deletes the storage connectors currently enabled for the stack.
     */
    override fun deleteStorageConnectors(deleteStorageConnectors: Boolean) {
      cdkBuilder.deleteStorageConnectors(deleteStorageConnectors)
    }

    /**
     * @param deleteStorageConnectors *This parameter has been deprecated.*.
     * Deletes the storage connectors currently enabled for the stack.
     */
    override fun deleteStorageConnectors(deleteStorageConnectors: IResolvable) {
      cdkBuilder.deleteStorageConnectors(deleteStorageConnectors.let(IResolvable::unwrap))
    }

    /**
     * @param description The description to display.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The stack name to display.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     * an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming
     * sessions.
     */
    override fun embedHostDomains(embedHostDomains: List<String>) {
      cdkBuilder.embedHostDomains(embedHostDomains)
    }

    /**
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     * an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming
     * sessions.
     */
    override fun embedHostDomains(vararg embedHostDomains: String): Unit =
        embedHostDomains(embedHostDomains.toList())

    /**
     * @param feedbackUrl The URL that users are redirected to after they click the Send Feedback
     * link.
     * If no URL is specified, no Send Feedback link is displayed.
     */
    override fun feedbackUrl(feedbackUrl: String) {
      cdkBuilder.feedbackUrl(feedbackUrl)
    }

    /**
     * @param name The name of the stack.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param redirectUrl The URL that users are redirected to after their streaming session ends.
     */
    override fun redirectUrl(redirectUrl: String) {
      cdkBuilder.redirectUrl(redirectUrl)
    }

    /**
     * @param storageConnectors The storage connectors to enable.
     */
    override fun storageConnectors(storageConnectors: IResolvable) {
      cdkBuilder.storageConnectors(storageConnectors.let(IResolvable::unwrap))
    }

    /**
     * @param storageConnectors The storage connectors to enable.
     */
    override fun storageConnectors(storageConnectors: List<Any>) {
      cdkBuilder.storageConnectors(storageConnectors)
    }

    /**
     * @param storageConnectors The storage connectors to enable.
     */
    override fun storageConnectors(vararg storageConnectors: Any): Unit =
        storageConnectors(storageConnectors.toList())

    /**
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     */
    override fun streamingExperienceSettings(streamingExperienceSettings: IResolvable) {
      cdkBuilder.streamingExperienceSettings(streamingExperienceSettings.let(IResolvable::unwrap))
    }

    /**
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     */
    override
        fun streamingExperienceSettings(streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty) {
      cdkBuilder.streamingExperienceSettings(streamingExperienceSettings.let(CfnStack.StreamingExperienceSettingsProperty::unwrap))
    }

    /**
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dab0ea31183bdca478c04a91e296136d26e8775865a252d857c7b88d30e47953")
    override
        fun streamingExperienceSettings(streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty.Builder.() -> Unit):
        Unit =
        streamingExperienceSettings(CfnStack.StreamingExperienceSettingsProperty(streamingExperienceSettings))

    /**
     * @param tags An array of key-value pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions.
     * By default, these actions are enabled.
     */
    override fun userSettings(userSettings: IResolvable) {
      cdkBuilder.userSettings(userSettings.let(IResolvable::unwrap))
    }

    /**
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions.
     * By default, these actions are enabled.
     */
    override fun userSettings(userSettings: List<Any>) {
      cdkBuilder.userSettings(userSettings)
    }

    /**
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions.
     * By default, these actions are enabled.
     */
    override fun userSettings(vararg userSettings: Any): Unit = userSettings(userSettings.toList())

    public fun build(): software.amazon.awscdk.services.appstream.CfnStackProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnStackProps,
  ) : CdkObject(cdkObject), CfnStackProps {
    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
     */
    override fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

    /**
     * The persistent application settings for users of the stack.
     *
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-applicationsettings)
     */
    override fun applicationSettings(): Any? = unwrap(this).getApplicationSettings()

    /**
     * The stack attributes to delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete)
     */
    override fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
        emptyList()

    /**
     * *This parameter has been deprecated.*.
     *
     * Deletes the storage connectors currently enabled for the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors)
     */
    override fun deleteStorageConnectors(): Any? = unwrap(this).getDeleteStorageConnectors()

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The stack name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
     * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains)
     */
    override fun embedHostDomains(): List<String> = unwrap(this).getEmbedHostDomains() ?:
        emptyList()

    /**
     * The URL that users are redirected to after they click the Send Feedback link.
     *
     * If no URL is specified, no Send Feedback link is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-feedbackurl)
     */
    override fun feedbackUrl(): String? = unwrap(this).getFeedbackUrl()

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The URL that users are redirected to after their streaming session ends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-redirecturl)
     */
    override fun redirectUrl(): String? = unwrap(this).getRedirectUrl()

    /**
     * The storage connectors to enable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
     */
    override fun storageConnectors(): Any? = unwrap(this).getStorageConnectors()

    /**
     * The streaming protocol that you want your stack to prefer.
     *
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-streamingexperiencesettings)
     */
    override fun streamingExperienceSettings(): Any? = unwrap(this).getStreamingExperienceSettings()

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The actions that are enabled or disabled for users during their streaming sessions.
     *
     * By default, these actions are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
     */
    override fun userSettings(): Any? = unwrap(this).getUserSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStackProps):
        CfnStackProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackProps):
        software.amazon.awscdk.services.appstream.CfnStackProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appstream.CfnStackProps
  }
}
