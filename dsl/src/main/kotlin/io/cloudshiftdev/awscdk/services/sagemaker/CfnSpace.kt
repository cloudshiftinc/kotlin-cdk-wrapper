package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSpace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrSpaceArn(): String = unwrap(this).getAttrSpaceArn()

  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  public open fun domainId(): String = unwrap(this).getDomainId()

  public open fun domainId(`value`: String) {
    unwrap(this).setDomainId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ownershipSettings(): Any? = unwrap(this).getOwnershipSettings()

  public open fun ownershipSettings(`value`: IResolvable) {
    unwrap(this).setOwnershipSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun ownershipSettings(`value`: OwnershipSettingsProperty) {
    unwrap(this).setOwnershipSettings(`value`.let(OwnershipSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("414955a62dc89caa13b05432a83ce71f310c3c4b25e469f78d8122ecaa62500f")
  public open fun ownershipSettings(`value`: OwnershipSettingsProperty.Builder.() -> Unit): Unit =
      ownershipSettings(OwnershipSettingsProperty(`value`))

  public open fun spaceDisplayName(): String? = unwrap(this).getSpaceDisplayName()

  public open fun spaceDisplayName(`value`: String) {
    unwrap(this).setSpaceDisplayName(`value`)
  }

  public open fun spaceName(): String = unwrap(this).getSpaceName()

  public open fun spaceName(`value`: String) {
    unwrap(this).setSpaceName(`value`)
  }

  public open fun spaceSettings(): Any? = unwrap(this).getSpaceSettings()

  public open fun spaceSettings(`value`: IResolvable) {
    unwrap(this).setSpaceSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun spaceSettings(`value`: SpaceSettingsProperty) {
    unwrap(this).setSpaceSettings(`value`.let(SpaceSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b47122cae913c7e6f89289aaa0478bf14ce71bff7d66d35fa5fe3045b9c67a6e")
  public open fun spaceSettings(`value`: SpaceSettingsProperty.Builder.() -> Unit): Unit =
      spaceSettings(SpaceSettingsProperty(`value`))

  public open fun spaceSharingSettings(): Any? = unwrap(this).getSpaceSharingSettings()

  public open fun spaceSharingSettings(`value`: IResolvable) {
    unwrap(this).setSpaceSharingSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun spaceSharingSettings(`value`: SpaceSharingSettingsProperty) {
    unwrap(this).setSpaceSharingSettings(`value`.let(SpaceSharingSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b2677ff81232dc5a8f9e767a944de20c22cfde07247c936eaa35f8a8fb04b06b")
  public open fun spaceSharingSettings(`value`: SpaceSharingSettingsProperty.Builder.() -> Unit):
      Unit = spaceSharingSettings(SpaceSharingSettingsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun domainId(domainId: String)

    public fun ownershipSettings(ownershipSettings: IResolvable)

    public fun ownershipSettings(ownershipSettings: OwnershipSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("acff03d049c60e7437e3b8b96be6700c9699cbb5404ff8c2ee976cd2f854490a")
    public fun ownershipSettings(ownershipSettings: OwnershipSettingsProperty.Builder.() -> Unit)

    public fun spaceDisplayName(spaceDisplayName: String)

    public fun spaceName(spaceName: String)

    public fun spaceSettings(spaceSettings: IResolvable)

    public fun spaceSettings(spaceSettings: SpaceSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6634b88a1ac01ba70589bef8fcb5e7beef54ea21ef0e569ec43440c5c2645d4e")
    public fun spaceSettings(spaceSettings: SpaceSettingsProperty.Builder.() -> Unit)

    public fun spaceSharingSettings(spaceSharingSettings: IResolvable)

    public fun spaceSharingSettings(spaceSharingSettings: SpaceSharingSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08def4189b469d2edc8bfea2b451f8f7a9ad8bd03172f1f72dbbf334be9460a7")
    public
        fun spaceSharingSettings(spaceSharingSettings: SpaceSharingSettingsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnSpace.Builder =
        software.amazon.awscdk.services.sagemaker.CfnSpace.Builder.create(scope, id)

    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    override fun ownershipSettings(ownershipSettings: IResolvable) {
      cdkBuilder.ownershipSettings(ownershipSettings.let(IResolvable::unwrap))
    }

    override fun ownershipSettings(ownershipSettings: OwnershipSettingsProperty) {
      cdkBuilder.ownershipSettings(ownershipSettings.let(OwnershipSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("acff03d049c60e7437e3b8b96be6700c9699cbb5404ff8c2ee976cd2f854490a")
    override fun ownershipSettings(ownershipSettings: OwnershipSettingsProperty.Builder.() -> Unit):
        Unit = ownershipSettings(OwnershipSettingsProperty(ownershipSettings))

    override fun spaceDisplayName(spaceDisplayName: String) {
      cdkBuilder.spaceDisplayName(spaceDisplayName)
    }

    override fun spaceName(spaceName: String) {
      cdkBuilder.spaceName(spaceName)
    }

    override fun spaceSettings(spaceSettings: IResolvable) {
      cdkBuilder.spaceSettings(spaceSettings.let(IResolvable::unwrap))
    }

    override fun spaceSettings(spaceSettings: SpaceSettingsProperty) {
      cdkBuilder.spaceSettings(spaceSettings.let(SpaceSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6634b88a1ac01ba70589bef8fcb5e7beef54ea21ef0e569ec43440c5c2645d4e")
    override fun spaceSettings(spaceSettings: SpaceSettingsProperty.Builder.() -> Unit): Unit =
        spaceSettings(SpaceSettingsProperty(spaceSettings))

    override fun spaceSharingSettings(spaceSharingSettings: IResolvable) {
      cdkBuilder.spaceSharingSettings(spaceSharingSettings.let(IResolvable::unwrap))
    }

    override fun spaceSharingSettings(spaceSharingSettings: SpaceSharingSettingsProperty) {
      cdkBuilder.spaceSharingSettings(spaceSharingSettings.let(SpaceSharingSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08def4189b469d2edc8bfea2b451f8f7a9ad8bd03172f1f72dbbf334be9460a7")
    override
        fun spaceSharingSettings(spaceSharingSettings: SpaceSharingSettingsProperty.Builder.() -> Unit):
        Unit = spaceSharingSettings(SpaceSharingSettingsProperty(spaceSharingSettings))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSpace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSpace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace): CfnSpace =
        CfnSpace(cdkObject)

    internal fun unwrap(wrapped: CfnSpace): software.amazon.awscdk.services.sagemaker.CfnSpace =
        wrapped.cdkObject
  }

  public interface SpaceSharingSettingsProperty {
    public fun sharingType(): String

    public interface Builder {
      public fun sharingType(sharingType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty.builder()

      override fun sharingType(sharingType: String) {
        cdkBuilder.sharingType(sharingType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty,
    ) : SpaceSharingSettingsProperty {
      override fun sharingType(): String = unwrap(this).getSharingType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpaceSharingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty):
          SpaceSharingSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceSharingSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface JupyterServerAppSettingsProperty {
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    public interface Builder {
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc1e1750215a44aee76b455f21d67ef6ab019a86d8976d254c0ff18df7dcf342")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty.builder()

      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc1e1750215a44aee76b455f21d67ef6ab019a86d8976d254c0ff18df7dcf342")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty,
    ) : JupyterServerAppSettingsProperty {
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JupyterServerAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty):
          JupyterServerAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterServerAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EFSFileSystemProperty {
    public fun fileSystemId(): String

    public interface Builder {
      public fun fileSystemId(fileSystemId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty.builder()

      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty,
    ) : EFSFileSystemProperty {
      override fun fileSystemId(): String = unwrap(this).getFileSystemId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EFSFileSystemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty):
          EFSFileSystemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EFSFileSystemProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SpaceJupyterLabAppSettingsProperty {
    public fun codeRepositories(): Any? = unwrap(this).getCodeRepositories()

    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    public interface Builder {
      public fun codeRepositories(codeRepositories: IResolvable)

      public fun codeRepositories(codeRepositories: List<Any>)

      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e610d39a8b0aa40803e5cbf82f3480f352a013c3c69dabe189197d7d609a6cf")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty.builder()

      override fun codeRepositories(codeRepositories: IResolvable) {
        cdkBuilder.codeRepositories(codeRepositories.let(IResolvable::unwrap))
      }

      override fun codeRepositories(codeRepositories: List<Any>) {
        cdkBuilder.codeRepositories(codeRepositories)
      }

      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e610d39a8b0aa40803e5cbf82f3480f352a013c3c69dabe189197d7d609a6cf")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty,
    ) : SpaceJupyterLabAppSettingsProperty {
      override fun codeRepositories(): Any? = unwrap(this).getCodeRepositories()

      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpaceJupyterLabAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty):
          SpaceJupyterLabAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceJupyterLabAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomImageProperty {
    public fun appImageConfigName(): String

    public fun imageName(): String

    public fun imageVersionNumber(): Number? = unwrap(this).getImageVersionNumber()

    public interface Builder {
      public fun appImageConfigName(appImageConfigName: String)

      public fun imageName(imageName: String)

      public fun imageVersionNumber(imageVersionNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty.builder()

      override fun appImageConfigName(appImageConfigName: String) {
        cdkBuilder.appImageConfigName(appImageConfigName)
      }

      override fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
      }

      override fun imageVersionNumber(imageVersionNumber: Number) {
        cdkBuilder.imageVersionNumber(imageVersionNumber)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty,
    ) : CustomImageProperty {
      override fun appImageConfigName(): String = unwrap(this).getAppImageConfigName()

      override fun imageName(): String = unwrap(this).getImageName()

      override fun imageVersionNumber(): Number? = unwrap(this).getImageVersionNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomImageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty):
          CustomImageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomImageProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EbsStorageSettingsProperty {
    public fun ebsVolumeSizeInGb(): Number

    public interface Builder {
      public fun ebsVolumeSizeInGb(ebsVolumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty.builder()

      override fun ebsVolumeSizeInGb(ebsVolumeSizeInGb: Number) {
        cdkBuilder.ebsVolumeSizeInGb(ebsVolumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty,
    ) : EbsStorageSettingsProperty {
      override fun ebsVolumeSizeInGb(): Number = unwrap(this).getEbsVolumeSizeInGb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EbsStorageSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty):
          EbsStorageSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CodeRepositoryProperty {
    public fun repositoryUrl(): String

    public interface Builder {
      public fun repositoryUrl(repositoryUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty.builder()

      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty,
    ) : CodeRepositoryProperty {
      override fun repositoryUrl(): String = unwrap(this).getRepositoryUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty):
          CodeRepositoryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeRepositoryProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OwnershipSettingsProperty {
    public fun ownerUserProfileName(): String

    public interface Builder {
      public fun ownerUserProfileName(ownerUserProfileName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty.builder()

      override fun ownerUserProfileName(ownerUserProfileName: String) {
        cdkBuilder.ownerUserProfileName(ownerUserProfileName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty,
    ) : OwnershipSettingsProperty {
      override fun ownerUserProfileName(): String = unwrap(this).getOwnerUserProfileName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OwnershipSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty):
          OwnershipSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OwnershipSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SpaceSettingsProperty {
    public fun appType(): String? = unwrap(this).getAppType()

    public fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

    public fun customFileSystems(): Any? = unwrap(this).getCustomFileSystems()

    public fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

    public fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

    public fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

    public fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()

    public interface Builder {
      public fun appType(appType: String)

      public fun codeEditorAppSettings(codeEditorAppSettings: IResolvable)

      public fun codeEditorAppSettings(codeEditorAppSettings: SpaceCodeEditorAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f918775596280a32b6b9fe283d250c4fe4e357bfbacd027c2dc1e466771fd38e")
      public
          fun codeEditorAppSettings(codeEditorAppSettings: SpaceCodeEditorAppSettingsProperty.Builder.() -> Unit)

      public fun customFileSystems(customFileSystems: IResolvable)

      public fun customFileSystems(customFileSystems: List<Any>)

      public fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable)

      public fun jupyterLabAppSettings(jupyterLabAppSettings: SpaceJupyterLabAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e7df97d51739f4eb6d7bfa218eeb377f9a60767f0d205be6bd6ffc66ccd37e1")
      public
          fun jupyterLabAppSettings(jupyterLabAppSettings: SpaceJupyterLabAppSettingsProperty.Builder.() -> Unit)

      public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable)

      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f7c6c76f44d64841bb5864ff13e770e9e0045acaca2391de9ccd8b43e4bcc3b")
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit)

      public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable)

      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1aec0cb1505855775f7e5ed514c4faeca23d281b6af5443186f140f7e6b5bb1c")
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit)

      public fun spaceStorageSettings(spaceStorageSettings: IResolvable)

      public fun spaceStorageSettings(spaceStorageSettings: SpaceStorageSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e918c17a2faf9653cd99fc52b83a57eea99102a611f1a0f4f0580518aa18211e")
      public
          fun spaceStorageSettings(spaceStorageSettings: SpaceStorageSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty.builder()

      override fun appType(appType: String) {
        cdkBuilder.appType(appType)
      }

      override fun codeEditorAppSettings(codeEditorAppSettings: IResolvable) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(IResolvable::unwrap))
      }

      override
          fun codeEditorAppSettings(codeEditorAppSettings: SpaceCodeEditorAppSettingsProperty) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(SpaceCodeEditorAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f918775596280a32b6b9fe283d250c4fe4e357bfbacd027c2dc1e466771fd38e")
      override
          fun codeEditorAppSettings(codeEditorAppSettings: SpaceCodeEditorAppSettingsProperty.Builder.() -> Unit):
          Unit = codeEditorAppSettings(SpaceCodeEditorAppSettingsProperty(codeEditorAppSettings))

      override fun customFileSystems(customFileSystems: IResolvable) {
        cdkBuilder.customFileSystems(customFileSystems.let(IResolvable::unwrap))
      }

      override fun customFileSystems(customFileSystems: List<Any>) {
        cdkBuilder.customFileSystems(customFileSystems)
      }

      override fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings.let(IResolvable::unwrap))
      }

      override
          fun jupyterLabAppSettings(jupyterLabAppSettings: SpaceJupyterLabAppSettingsProperty) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings.let(SpaceJupyterLabAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e7df97d51739f4eb6d7bfa218eeb377f9a60767f0d205be6bd6ffc66ccd37e1")
      override
          fun jupyterLabAppSettings(jupyterLabAppSettings: SpaceJupyterLabAppSettingsProperty.Builder.() -> Unit):
          Unit = jupyterLabAppSettings(SpaceJupyterLabAppSettingsProperty(jupyterLabAppSettings))

      override fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(IResolvable::unwrap))
      }

      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(JupyterServerAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f7c6c76f44d64841bb5864ff13e770e9e0045acaca2391de9ccd8b43e4bcc3b")
      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit):
          Unit =
          jupyterServerAppSettings(JupyterServerAppSettingsProperty(jupyterServerAppSettings))

      override fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings.let(IResolvable::unwrap))
      }

      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings.let(KernelGatewayAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1aec0cb1505855775f7e5ed514c4faeca23d281b6af5443186f140f7e6b5bb1c")
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit):
          Unit =
          kernelGatewayAppSettings(KernelGatewayAppSettingsProperty(kernelGatewayAppSettings))

      override fun spaceStorageSettings(spaceStorageSettings: IResolvable) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(IResolvable::unwrap))
      }

      override fun spaceStorageSettings(spaceStorageSettings: SpaceStorageSettingsProperty) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(SpaceStorageSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e918c17a2faf9653cd99fc52b83a57eea99102a611f1a0f4f0580518aa18211e")
      override
          fun spaceStorageSettings(spaceStorageSettings: SpaceStorageSettingsProperty.Builder.() -> Unit):
          Unit = spaceStorageSettings(SpaceStorageSettingsProperty(spaceStorageSettings))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty,
    ) : SpaceSettingsProperty {
      override fun appType(): String? = unwrap(this).getAppType()

      override fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

      override fun customFileSystems(): Any? = unwrap(this).getCustomFileSystems()

      override fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

      override fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

      override fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

      override fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpaceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty):
          SpaceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResourceSpecProperty {
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

    public fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()

    public interface Builder {
      public fun instanceType(instanceType: String)

      public fun sageMakerImageArn(sageMakerImageArn: String)

      public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty.builder()

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
      }

      override fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty,
    ) : ResourceSpecProperty {
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      override fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

      override fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty):
          ResourceSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceSpecProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SpaceStorageSettingsProperty {
    public fun ebsStorageSettings(): Any? = unwrap(this).getEbsStorageSettings()

    public interface Builder {
      public fun ebsStorageSettings(ebsStorageSettings: IResolvable)

      public fun ebsStorageSettings(ebsStorageSettings: EbsStorageSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("685af989ba2409bea91c1c7183d1e017811b8406dc2cb03fc45796cc3adf4da3")
      public
          fun ebsStorageSettings(ebsStorageSettings: EbsStorageSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty.builder()

      override fun ebsStorageSettings(ebsStorageSettings: IResolvable) {
        cdkBuilder.ebsStorageSettings(ebsStorageSettings.let(IResolvable::unwrap))
      }

      override fun ebsStorageSettings(ebsStorageSettings: EbsStorageSettingsProperty) {
        cdkBuilder.ebsStorageSettings(ebsStorageSettings.let(EbsStorageSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("685af989ba2409bea91c1c7183d1e017811b8406dc2cb03fc45796cc3adf4da3")
      override
          fun ebsStorageSettings(ebsStorageSettings: EbsStorageSettingsProperty.Builder.() -> Unit):
          Unit = ebsStorageSettings(EbsStorageSettingsProperty(ebsStorageSettings))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty,
    ) : SpaceStorageSettingsProperty {
      override fun ebsStorageSettings(): Any? = unwrap(this).getEbsStorageSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpaceStorageSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty):
          SpaceStorageSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CustomFileSystemProperty {
    public fun efsFileSystem(): Any? = unwrap(this).getEfsFileSystem()

    public interface Builder {
      public fun efsFileSystem(efsFileSystem: IResolvable)

      public fun efsFileSystem(efsFileSystem: EFSFileSystemProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("725ca5e0d45e073f9dc82a5b9c4d49c124c28a0ae1d82214e51e13314304bc14")
      public fun efsFileSystem(efsFileSystem: EFSFileSystemProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty.builder()

      override fun efsFileSystem(efsFileSystem: IResolvable) {
        cdkBuilder.efsFileSystem(efsFileSystem.let(IResolvable::unwrap))
      }

      override fun efsFileSystem(efsFileSystem: EFSFileSystemProperty) {
        cdkBuilder.efsFileSystem(efsFileSystem.let(EFSFileSystemProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("725ca5e0d45e073f9dc82a5b9c4d49c124c28a0ae1d82214e51e13314304bc14")
      override fun efsFileSystem(efsFileSystem: EFSFileSystemProperty.Builder.() -> Unit): Unit =
          efsFileSystem(EFSFileSystemProperty(efsFileSystem))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty,
    ) : CustomFileSystemProperty {
      override fun efsFileSystem(): Any? = unwrap(this).getEfsFileSystem()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomFileSystemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty):
          CustomFileSystemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomFileSystemProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KernelGatewayAppSettingsProperty {
    public fun customImages(): Any? = unwrap(this).getCustomImages()

    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    public interface Builder {
      public fun customImages(customImages: IResolvable)

      public fun customImages(customImages: List<Any>)

      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b722b7492eff2a37138d40822cae857b7cd89725c1db0e9ebb4795dee8b85261")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty.builder()

      override fun customImages(customImages: IResolvable) {
        cdkBuilder.customImages(customImages.let(IResolvable::unwrap))
      }

      override fun customImages(customImages: List<Any>) {
        cdkBuilder.customImages(customImages)
      }

      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b722b7492eff2a37138d40822cae857b7cd89725c1db0e9ebb4795dee8b85261")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty,
    ) : KernelGatewayAppSettingsProperty {
      override fun customImages(): Any? = unwrap(this).getCustomImages()

      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KernelGatewayAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty):
          KernelGatewayAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelGatewayAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpaceCodeEditorAppSettingsProperty {
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    public interface Builder {
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65b5eb6b456a89a31e6a1c4f192aec82d615d1889ad6ceed9c477f7052f28caf")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty.builder()

      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65b5eb6b456a89a31e6a1c4f192aec82d615d1889ad6ceed9c477f7052f28caf")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty,
    ) : SpaceCodeEditorAppSettingsProperty {
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpaceCodeEditorAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty):
          SpaceCodeEditorAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceCodeEditorAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
