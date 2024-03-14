package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStack internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appstream.CfnStack,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  public open fun accessEndpoints(`value`: IResolvable) {
    unwrap(this).setAccessEndpoints(`value`.let(IResolvable::unwrap))
  }

  public open fun accessEndpoints(__idx_ac66f0: List<Any>) {
    unwrap(this).setAccessEndpoints(__idx_ac66f0)
  }

  public open fun accessEndpoints(vararg __idx_ac66f0: Any): Unit =
      accessEndpoints(__idx_ac66f0.toList())

  public open fun applicationSettings(): Any? = unwrap(this).getApplicationSettings()

  public open fun applicationSettings(`value`: IResolvable) {
    unwrap(this).setApplicationSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun applicationSettings(`value`: ApplicationSettingsProperty) {
    unwrap(this).setApplicationSettings(`value`.let(ApplicationSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("20b2c66862e40bacd3d87c5bed237471a91ed16bdc20283e4f47a046ebd88136")
  public open fun applicationSettings(`value`: ApplicationSettingsProperty.Builder.() -> Unit): Unit
      = applicationSettings(ApplicationSettingsProperty(`value`))

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
      emptyList()

  public open fun attributesToDelete(`value`: List<String>) {
    unwrap(this).setAttributesToDelete(`value`)
  }

  public open fun attributesToDelete(vararg `value`: String): Unit =
      attributesToDelete(`value`.toList())

  public open fun deleteStorageConnectors(): Any? = unwrap(this).getDeleteStorageConnectors()

  public open fun deleteStorageConnectors(`value`: Boolean) {
    unwrap(this).setDeleteStorageConnectors(`value`)
  }

  public open fun deleteStorageConnectors(`value`: IResolvable) {
    unwrap(this).setDeleteStorageConnectors(`value`.let(IResolvable::unwrap))
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public open fun embedHostDomains(): List<String> = unwrap(this).getEmbedHostDomains() ?:
      emptyList()

  public open fun embedHostDomains(`value`: List<String>) {
    unwrap(this).setEmbedHostDomains(`value`)
  }

  public open fun embedHostDomains(vararg `value`: String): Unit =
      embedHostDomains(`value`.toList())

  public open fun feedbackUrl(): String? = unwrap(this).getFeedbackUrl()

  public open fun feedbackUrl(`value`: String) {
    unwrap(this).setFeedbackUrl(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun redirectUrl(): String? = unwrap(this).getRedirectUrl()

  public open fun redirectUrl(`value`: String) {
    unwrap(this).setRedirectUrl(`value`)
  }

  public open fun storageConnectors(): Any? = unwrap(this).getStorageConnectors()

  public open fun storageConnectors(`value`: IResolvable) {
    unwrap(this).setStorageConnectors(`value`.let(IResolvable::unwrap))
  }

  public open fun storageConnectors(__idx_ac66f0: List<Any>) {
    unwrap(this).setStorageConnectors(__idx_ac66f0)
  }

  public open fun storageConnectors(vararg __idx_ac66f0: Any): Unit =
      storageConnectors(__idx_ac66f0.toList())

  public open fun streamingExperienceSettings(): Any? =
      unwrap(this).getStreamingExperienceSettings()

  public open fun streamingExperienceSettings(`value`: IResolvable) {
    unwrap(this).setStreamingExperienceSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun streamingExperienceSettings(`value`: StreamingExperienceSettingsProperty) {
    unwrap(this).setStreamingExperienceSettings(`value`.let(StreamingExperienceSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d92e2d0c17ef191ab5880afdccc498244c00040f5781c30f5fb3ea535568c4c3")
  public open
      fun streamingExperienceSettings(`value`: StreamingExperienceSettingsProperty.Builder.() -> Unit):
      Unit = streamingExperienceSettings(StreamingExperienceSettingsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun userSettings(): Any? = unwrap(this).getUserSettings()

  public open fun userSettings(`value`: IResolvable) {
    unwrap(this).setUserSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun userSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setUserSettings(__idx_ac66f0)
  }

  public open fun userSettings(vararg __idx_ac66f0: Any): Unit = userSettings(__idx_ac66f0.toList())

  public interface Builder {
    public fun accessEndpoints(accessEndpoints: IResolvable)

    public fun accessEndpoints(accessEndpoints: List<Any>)

    public fun accessEndpoints(vararg accessEndpoints: Any)

    public fun applicationSettings(applicationSettings: IResolvable)

    public fun applicationSettings(applicationSettings: ApplicationSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5521ad540d558a6fa627e935cb49c5305b635b45c5dbc7afd88c845843101b7a")
    public
        fun applicationSettings(applicationSettings: ApplicationSettingsProperty.Builder.() -> Unit)

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
        fun streamingExperienceSettings(streamingExperienceSettings: StreamingExperienceSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e3723ba6e054771664539223e2397dd47bc378c2e7c6b849153c4ceef8c001d")
    public
        fun streamingExperienceSettings(streamingExperienceSettings: StreamingExperienceSettingsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userSettings(userSettings: IResolvable)

    public fun userSettings(userSettings: List<Any>)

    public fun userSettings(vararg userSettings: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnStack.Builder =
        software.amazon.awscdk.services.appstream.CfnStack.Builder.create(scope, id)

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

    override fun applicationSettings(applicationSettings: ApplicationSettingsProperty) {
      cdkBuilder.applicationSettings(applicationSettings.let(ApplicationSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5521ad540d558a6fa627e935cb49c5305b635b45c5dbc7afd88c845843101b7a")
    override
        fun applicationSettings(applicationSettings: ApplicationSettingsProperty.Builder.() -> Unit):
        Unit = applicationSettings(ApplicationSettingsProperty(applicationSettings))

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
        fun streamingExperienceSettings(streamingExperienceSettings: StreamingExperienceSettingsProperty) {
      cdkBuilder.streamingExperienceSettings(streamingExperienceSettings.let(StreamingExperienceSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e3723ba6e054771664539223e2397dd47bc378c2e7c6b849153c4ceef8c001d")
    override
        fun streamingExperienceSettings(streamingExperienceSettings: StreamingExperienceSettingsProperty.Builder.() -> Unit):
        Unit =
        streamingExperienceSettings(StreamingExperienceSettingsProperty(streamingExperienceSettings))

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

    public fun build(): software.amazon.awscdk.services.appstream.CfnStack = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack): CfnStack =
        CfnStack(cdkObject)

    internal fun unwrap(wrapped: CfnStack): software.amazon.awscdk.services.appstream.CfnStack =
        wrapped.cdkObject
  }

  public interface ApplicationSettingsProperty {
    public fun enabled(): Any

    public fun settingsGroup(): String? = unwrap(this).getSettingsGroup()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun tingsGroup(settingsGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun tingsGroup(settingsGroup: String) {
        cdkBuilder.settingsGroup(settingsGroup)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty,
    ) : ApplicationSettingsProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun settingsGroup(): String? = unwrap(this).getSettingsGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty):
          ApplicationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationSettingsProperty):
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AccessEndpointProperty {
    public fun endpointType(): String

    public fun vpceId(): String

    public interface Builder {
      public fun endpointType(endpointType: String)

      public fun vpceId(vpceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty.builder()

      override fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
      }

      override fun vpceId(vpceId: String) {
        cdkBuilder.vpceId(vpceId)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty,
    ) : AccessEndpointProperty {
      override fun endpointType(): String = unwrap(this).getEndpointType()

      override fun vpceId(): String = unwrap(this).getVpceId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty):
          AccessEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessEndpointProperty):
          software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StorageConnectorProperty {
    public fun connectorType(): String

    public fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

    public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    public interface Builder {
      public fun connectorType(connectorType: String)

      public fun domains(domains: List<String>)

      public fun domains(vararg domains: String)

      public fun resourceIdentifier(resourceIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.builder()

      override fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
      }

      override fun domains(domains: List<String>) {
        cdkBuilder.domains(domains)
      }

      override fun domains(vararg domains: String): Unit = domains(domains.toList())

      override fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty,
    ) : StorageConnectorProperty {
      override fun connectorType(): String = unwrap(this).getConnectorType()

      override fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

      override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StorageConnectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty):
          StorageConnectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageConnectorProperty):
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UserSettingProperty {
    public fun action(): String

    public fun maximumLength(): Number? = unwrap(this).getMaximumLength()

    public fun permission(): String

    public interface Builder {
      public fun action(action: String)

      public fun maximumLength(maximumLength: Number)

      public fun permission(permission: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun maximumLength(maximumLength: Number) {
        cdkBuilder.maximumLength(maximumLength)
      }

      override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty,
    ) : UserSettingProperty {
      override fun action(): String = unwrap(this).getAction()

      override fun maximumLength(): Number? = unwrap(this).getMaximumLength()

      override fun permission(): String = unwrap(this).getPermission()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty):
          UserSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserSettingProperty):
          software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StreamingExperienceSettingsProperty {
    public fun preferredProtocol(): String? = unwrap(this).getPreferredProtocol()

    public interface Builder {
      public fun preferredProtocol(preferredProtocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty.builder()

      override fun preferredProtocol(preferredProtocol: String) {
        cdkBuilder.preferredProtocol(preferredProtocol)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty,
    ) : StreamingExperienceSettingsProperty {
      override fun preferredProtocol(): String? = unwrap(this).getPreferredProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamingExperienceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty):
          StreamingExperienceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamingExperienceSettingsProperty):
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
