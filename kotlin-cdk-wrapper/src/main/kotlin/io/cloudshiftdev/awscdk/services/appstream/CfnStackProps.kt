@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStackProps {
  public fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  public fun applicationSettings(): Any? = unwrap(this).getApplicationSettings()

  public fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
      emptyList()

  public fun deleteStorageConnectors(): Any? = unwrap(this).getDeleteStorageConnectors()

  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun embedHostDomains(): List<String> = unwrap(this).getEmbedHostDomains() ?: emptyList()

  public fun feedbackUrl(): String? = unwrap(this).getFeedbackUrl()

  public fun name(): String? = unwrap(this).getName()

  public fun redirectUrl(): String? = unwrap(this).getRedirectUrl()

  public fun storageConnectors(): Any? = unwrap(this).getStorageConnectors()

  public fun streamingExperienceSettings(): Any? = unwrap(this).getStreamingExperienceSettings()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userSettings(): Any? = unwrap(this).getUserSettings()

  @CdkDslMarker
  public interface Builder {
    public fun accessEndpoints(accessEndpoints: IResolvable)

    public fun accessEndpoints(accessEndpoints: List<Any>)

    public fun accessEndpoints(vararg accessEndpoints: Any)

    public fun applicationSettings(applicationSettings: IResolvable)

    public fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21acbad33bd06ee22741081fe027b547bbfe69a4753bf6fff5e4646e5a824bf4")
    public
        fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty.Builder.() -> Unit)

    public fun attributesToDelete(attributesToDelete: List<String>)

    public fun attributesToDelete(vararg attributesToDelete: String)

    public fun deleteStorageConnectors(deleteStorageConnectors: Boolean)

    public fun deleteStorageConnectors(deleteStorageConnectors: IResolvable)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun embedHostDomains(embedHostDomains: List<String>)

    public fun embedHostDomains(vararg embedHostDomains: String)

    public fun feedbackUrl(feedbackUrl: String)

    public fun name(name: String)

    public fun redirectUrl(redirectUrl: String)

    public fun storageConnectors(storageConnectors: IResolvable)

    public fun storageConnectors(storageConnectors: List<Any>)

    public fun storageConnectors(vararg storageConnectors: Any)

    public fun streamingExperienceSettings(streamingExperienceSettings: IResolvable)

    public
        fun streamingExperienceSettings(streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dab0ea31183bdca478c04a91e296136d26e8775865a252d857c7b88d30e47953")
    public
        fun streamingExperienceSettings(streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userSettings(userSettings: IResolvable)

    public fun userSettings(userSettings: List<Any>)

    public fun userSettings(vararg userSettings: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnStackProps.Builder =
        software.amazon.awscdk.services.appstream.CfnStackProps.builder()

    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable::unwrap))
    }

    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints)
    }

    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    override fun applicationSettings(applicationSettings: IResolvable) {
      cdkBuilder.applicationSettings(applicationSettings.let(IResolvable::unwrap))
    }

    override fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty) {
      cdkBuilder.applicationSettings(applicationSettings.let(CfnStack.ApplicationSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21acbad33bd06ee22741081fe027b547bbfe69a4753bf6fff5e4646e5a824bf4")
    override
        fun applicationSettings(applicationSettings: CfnStack.ApplicationSettingsProperty.Builder.() -> Unit):
        Unit = applicationSettings(CfnStack.ApplicationSettingsProperty(applicationSettings))

    override fun attributesToDelete(attributesToDelete: List<String>) {
      cdkBuilder.attributesToDelete(attributesToDelete)
    }

    override fun attributesToDelete(vararg attributesToDelete: String): Unit =
        attributesToDelete(attributesToDelete.toList())

    override fun deleteStorageConnectors(deleteStorageConnectors: Boolean) {
      cdkBuilder.deleteStorageConnectors(deleteStorageConnectors)
    }

    override fun deleteStorageConnectors(deleteStorageConnectors: IResolvable) {
      cdkBuilder.deleteStorageConnectors(deleteStorageConnectors.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun embedHostDomains(embedHostDomains: List<String>) {
      cdkBuilder.embedHostDomains(embedHostDomains)
    }

    override fun embedHostDomains(vararg embedHostDomains: String): Unit =
        embedHostDomains(embedHostDomains.toList())

    override fun feedbackUrl(feedbackUrl: String) {
      cdkBuilder.feedbackUrl(feedbackUrl)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun redirectUrl(redirectUrl: String) {
      cdkBuilder.redirectUrl(redirectUrl)
    }

    override fun storageConnectors(storageConnectors: IResolvable) {
      cdkBuilder.storageConnectors(storageConnectors.let(IResolvable::unwrap))
    }

    override fun storageConnectors(storageConnectors: List<Any>) {
      cdkBuilder.storageConnectors(storageConnectors)
    }

    override fun storageConnectors(vararg storageConnectors: Any): Unit =
        storageConnectors(storageConnectors.toList())

    override fun streamingExperienceSettings(streamingExperienceSettings: IResolvable) {
      cdkBuilder.streamingExperienceSettings(streamingExperienceSettings.let(IResolvable::unwrap))
    }

    override
        fun streamingExperienceSettings(streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty) {
      cdkBuilder.streamingExperienceSettings(streamingExperienceSettings.let(CfnStack.StreamingExperienceSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dab0ea31183bdca478c04a91e296136d26e8775865a252d857c7b88d30e47953")
    override
        fun streamingExperienceSettings(streamingExperienceSettings: CfnStack.StreamingExperienceSettingsProperty.Builder.() -> Unit):
        Unit =
        streamingExperienceSettings(CfnStack.StreamingExperienceSettingsProperty(streamingExperienceSettings))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userSettings(userSettings: IResolvable) {
      cdkBuilder.userSettings(userSettings.let(IResolvable::unwrap))
    }

    override fun userSettings(userSettings: List<Any>) {
      cdkBuilder.userSettings(userSettings)
    }

    override fun userSettings(vararg userSettings: Any): Unit = userSettings(userSettings.toList())

    public fun build(): software.amazon.awscdk.services.appstream.CfnStackProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnStackProps,
  ) : CdkObject(cdkObject), CfnStackProps {
    override fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

    override fun applicationSettings(): Any? = unwrap(this).getApplicationSettings()

    override fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
        emptyList()

    override fun deleteStorageConnectors(): Any? = unwrap(this).getDeleteStorageConnectors()

    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun embedHostDomains(): List<String> = unwrap(this).getEmbedHostDomains() ?:
        emptyList()

    override fun feedbackUrl(): String? = unwrap(this).getFeedbackUrl()

    override fun name(): String? = unwrap(this).getName()

    override fun redirectUrl(): String? = unwrap(this).getRedirectUrl()

    override fun storageConnectors(): Any? = unwrap(this).getStorageConnectors()

    override fun streamingExperienceSettings(): Any? = unwrap(this).getStreamingExperienceSettings()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
