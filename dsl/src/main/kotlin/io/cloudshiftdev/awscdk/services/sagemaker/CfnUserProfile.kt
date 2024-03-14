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

public open class CfnUserProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrUserProfileArn(): String = unwrap(this).getAttrUserProfileArn()

  public open fun domainId(): String = unwrap(this).getDomainId()

  public open fun domainId(`value`: String) {
    unwrap(this).setDomainId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun singleSignOnUserIdentifier(): String? =
      unwrap(this).getSingleSignOnUserIdentifier()

  public open fun singleSignOnUserIdentifier(`value`: String) {
    unwrap(this).setSingleSignOnUserIdentifier(`value`)
  }

  public open fun singleSignOnUserValue(): String? = unwrap(this).getSingleSignOnUserValue()

  public open fun singleSignOnUserValue(`value`: String) {
    unwrap(this).setSingleSignOnUserValue(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun userProfileName(): String = unwrap(this).getUserProfileName()

  public open fun userProfileName(`value`: String) {
    unwrap(this).setUserProfileName(`value`)
  }

  public open fun userSettings(): Any? = unwrap(this).getUserSettings()

  public open fun userSettings(`value`: IResolvable) {
    unwrap(this).setUserSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun userSettings(`value`: UserSettingsProperty) {
    unwrap(this).setUserSettings(`value`.let(UserSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e8d6a7f3fb9323beb3c4cb4336eadc679ac6fc49d98c71b25e7912f05f10ab8f")
  public open fun userSettings(`value`: UserSettingsProperty.Builder.() -> Unit): Unit =
      userSettings(UserSettingsProperty(`value`))

  public interface Builder {
    public fun domainId(domainId: String)

    public fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String)

    public fun singleSignOnUserValue(singleSignOnUserValue: String)

    public fun tags(tags: List<CfnTag>)

    public fun userProfileName(userProfileName: String)

    public fun userSettings(userSettings: IResolvable)

    public fun userSettings(userSettings: UserSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfebc0f1d980b1a58c42c26303f24f582df8cbdf303ffff2bb6f966e8af743d9")
    public fun userSettings(userSettings: UserSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnUserProfile.Builder =
        software.amazon.awscdk.services.sagemaker.CfnUserProfile.Builder.create(scope, id)

    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    override fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String) {
      cdkBuilder.singleSignOnUserIdentifier(singleSignOnUserIdentifier)
    }

    override fun singleSignOnUserValue(singleSignOnUserValue: String) {
      cdkBuilder.singleSignOnUserValue(singleSignOnUserValue)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun userProfileName(userProfileName: String) {
      cdkBuilder.userProfileName(userProfileName)
    }

    override fun userSettings(userSettings: IResolvable) {
      cdkBuilder.userSettings(userSettings.let(IResolvable::unwrap))
    }

    override fun userSettings(userSettings: UserSettingsProperty) {
      cdkBuilder.userSettings(userSettings.let(UserSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfebc0f1d980b1a58c42c26303f24f582df8cbdf303ffff2bb6f966e8af743d9")
    override fun userSettings(userSettings: UserSettingsProperty.Builder.() -> Unit): Unit =
        userSettings(UserSettingsProperty(userSettings))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnUserProfile =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile):
        CfnUserProfile = CfnUserProfile(cdkObject)

    internal fun unwrap(wrapped: CfnUserProfile):
        software.amazon.awscdk.services.sagemaker.CfnUserProfile = wrapped.cdkObject
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
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty.builder()

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
      }

      override fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty):
          ResourceSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceSpecProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SharingSettingsProperty {
    public fun notebookOutputOption(): String? = unwrap(this).getNotebookOutputOption()

    public fun s3KmsKeyId(): String? = unwrap(this).getS3KmsKeyId()

    public fun s3OutputPath(): String? = unwrap(this).getS3OutputPath()

    public interface Builder {
      public fun notebookOutputOption(notebookOutputOption: String)

      public fun s3KmsKeyId(s3KmsKeyId: String)

      public fun s3OutputPath(s3OutputPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty.builder()

      override fun notebookOutputOption(notebookOutputOption: String) {
        cdkBuilder.notebookOutputOption(notebookOutputOption)
      }

      override fun s3KmsKeyId(s3KmsKeyId: String) {
        cdkBuilder.s3KmsKeyId(s3KmsKeyId)
      }

      override fun s3OutputPath(s3OutputPath: String) {
        cdkBuilder.s3OutputPath(s3OutputPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty,
    ) : SharingSettingsProperty {
      override fun notebookOutputOption(): String? = unwrap(this).getNotebookOutputOption()

      override fun s3KmsKeyId(): String? = unwrap(this).getS3KmsKeyId()

      override fun s3OutputPath(): String? = unwrap(this).getS3OutputPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SharingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty):
          SharingSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharingSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface JupyterServerAppSettingsProperty {
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    public interface Builder {
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9d3d4d19541e54e09bc7bb368f2f97abc698620b1132fbc08d27f1001b95348")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty.builder()

      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9d3d4d19541e54e09bc7bb368f2f97abc698620b1132fbc08d27f1001b95348")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty):
          JupyterServerAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterServerAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DefaultEbsStorageSettingsProperty {
    public fun defaultEbsVolumeSizeInGb(): Number

    public fun maximumEbsVolumeSizeInGb(): Number

    public interface Builder {
      public fun defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb: Number)

      public fun maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty.builder()

      override fun defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb: Number) {
        cdkBuilder.defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb)
      }

      override fun maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb: Number) {
        cdkBuilder.maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty,
    ) : DefaultEbsStorageSettingsProperty {
      override fun defaultEbsVolumeSizeInGb(): Number = unwrap(this).getDefaultEbsVolumeSizeInGb()

      override fun maximumEbsVolumeSizeInGb(): Number = unwrap(this).getMaximumEbsVolumeSizeInGb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultEbsStorageSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty):
          DefaultEbsStorageSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultEbsStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DefaultSpaceStorageSettingsProperty {
    public fun defaultEbsStorageSettings(): Any? = unwrap(this).getDefaultEbsStorageSettings()

    public interface Builder {
      public fun defaultEbsStorageSettings(defaultEbsStorageSettings: IResolvable)

      public
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f67e23f19df36440b0e4a62615f0e09ef5d1f0dcbf47dd16dbb51a8adef7c11")
      public
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty.builder()

      override fun defaultEbsStorageSettings(defaultEbsStorageSettings: IResolvable) {
        cdkBuilder.defaultEbsStorageSettings(defaultEbsStorageSettings.let(IResolvable::unwrap))
      }

      override
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty) {
        cdkBuilder.defaultEbsStorageSettings(defaultEbsStorageSettings.let(DefaultEbsStorageSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f67e23f19df36440b0e4a62615f0e09ef5d1f0dcbf47dd16dbb51a8adef7c11")
      override
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty.Builder.() -> Unit):
          Unit =
          defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty(defaultEbsStorageSettings))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty,
    ) : DefaultSpaceStorageSettingsProperty {
      override fun defaultEbsStorageSettings(): Any? = unwrap(this).getDefaultEbsStorageSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultSpaceStorageSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty):
          DefaultSpaceStorageSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultSpaceStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface UserSettingsProperty {
    public fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

    public fun customFileSystemConfigs(): Any? = unwrap(this).getCustomFileSystemConfigs()

    public fun customPosixUserConfig(): Any? = unwrap(this).getCustomPosixUserConfig()

    public fun defaultLandingUri(): String? = unwrap(this).getDefaultLandingUri()

    public fun executionRole(): String? = unwrap(this).getExecutionRole()

    public fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

    public fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

    public fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

    public fun rStudioServerProAppSettings(): Any? = unwrap(this).getRStudioServerProAppSettings()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun sharingSettings(): Any? = unwrap(this).getSharingSettings()

    public fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()

    public fun studioWebPortal(): String? = unwrap(this).getStudioWebPortal()

    public interface Builder {
      public fun codeEditorAppSettings(codeEditorAppSettings: IResolvable)

      public fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a9bc4f2e8d04580013219292e00c55cc1fe609c1a01053af70fcee7898ca1a2")
      public
          fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty.Builder.() -> Unit)

      public fun customFileSystemConfigs(customFileSystemConfigs: IResolvable)

      public fun customFileSystemConfigs(customFileSystemConfigs: List<Any>)

      public fun customPosixUserConfig(customPosixUserConfig: IResolvable)

      public fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e0e792ac82240420b45380ef62898e35a25c9cafb375b23c659d4c33d809266")
      public
          fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty.Builder.() -> Unit)

      public fun defaultLandingUri(defaultLandingUri: String)

      public fun executionRole(executionRole: String)

      public fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable)

      public fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ebda19c4b4e31cf15587de0f09e9a34ab4bc94e697875e03abe3171057e5fe6")
      public
          fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty.Builder.() -> Unit)

      public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable)

      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2629b47b11212a6f882c30117dbc578ac1caea003d01e7a4faf4b5347488d0a4")
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit)

      public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable)

      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a767e77c5688ecb8852b78080098c2fa600ebc21ee3f373de53fb4d94f5e630e")
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit)

      public fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable)

      public
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe17757e26a97bb7fb822a64a0272e2f53e50f24d9b95af39c2da14767184022")
      public
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty.Builder.() -> Unit)

      public fun securityGroups(securityGroups: List<String>)

      public fun sharingSettings(sharingSettings: IResolvable)

      public fun sharingSettings(sharingSettings: SharingSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("041646d4ca819762daa2e604bf5173280d6a4a5ac08a172dba6a4d4a589d8f15")
      public fun sharingSettings(sharingSettings: SharingSettingsProperty.Builder.() -> Unit)

      public fun spaceStorageSettings(spaceStorageSettings: IResolvable)

      public fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52e04b39a0bbef7c03ae0431e80cfabcc922dc10d762b41ce484dc0006a1d40b")
      public
          fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty.Builder.() -> Unit)

      public fun studioWebPortal(studioWebPortal: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty.builder()

      override fun codeEditorAppSettings(codeEditorAppSettings: IResolvable) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(IResolvable::unwrap))
      }

      override fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(CodeEditorAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a9bc4f2e8d04580013219292e00c55cc1fe609c1a01053af70fcee7898ca1a2")
      override
          fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty.Builder.() -> Unit):
          Unit = codeEditorAppSettings(CodeEditorAppSettingsProperty(codeEditorAppSettings))

      override fun customFileSystemConfigs(customFileSystemConfigs: IResolvable) {
        cdkBuilder.customFileSystemConfigs(customFileSystemConfigs.let(IResolvable::unwrap))
      }

      override fun customFileSystemConfigs(customFileSystemConfigs: List<Any>) {
        cdkBuilder.customFileSystemConfigs(customFileSystemConfigs)
      }

      override fun customPosixUserConfig(customPosixUserConfig: IResolvable) {
        cdkBuilder.customPosixUserConfig(customPosixUserConfig.let(IResolvable::unwrap))
      }

      override fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty) {
        cdkBuilder.customPosixUserConfig(customPosixUserConfig.let(CustomPosixUserConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e0e792ac82240420b45380ef62898e35a25c9cafb375b23c659d4c33d809266")
      override
          fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty.Builder.() -> Unit):
          Unit = customPosixUserConfig(CustomPosixUserConfigProperty(customPosixUserConfig))

      override fun defaultLandingUri(defaultLandingUri: String) {
        cdkBuilder.defaultLandingUri(defaultLandingUri)
      }

      override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      override fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings.let(IResolvable::unwrap))
      }

      override fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings.let(JupyterLabAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ebda19c4b4e31cf15587de0f09e9a34ab4bc94e697875e03abe3171057e5fe6")
      override
          fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty.Builder.() -> Unit):
          Unit = jupyterLabAppSettings(JupyterLabAppSettingsProperty(jupyterLabAppSettings))

      override fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(IResolvable::unwrap))
      }

      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(JupyterServerAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2629b47b11212a6f882c30117dbc578ac1caea003d01e7a4faf4b5347488d0a4")
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
      @JvmName("a767e77c5688ecb8852b78080098c2fa600ebc21ee3f373de53fb4d94f5e630e")
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit):
          Unit =
          kernelGatewayAppSettings(KernelGatewayAppSettingsProperty(kernelGatewayAppSettings))

      override fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings.let(IResolvable::unwrap))
      }

      override
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings.let(RStudioServerProAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe17757e26a97bb7fb822a64a0272e2f53e50f24d9b95af39c2da14767184022")
      override
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty.Builder.() -> Unit):
          Unit =
          rStudioServerProAppSettings(RStudioServerProAppSettingsProperty(rStudioServerProAppSettings))

      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      override fun sharingSettings(sharingSettings: IResolvable) {
        cdkBuilder.sharingSettings(sharingSettings.let(IResolvable::unwrap))
      }

      override fun sharingSettings(sharingSettings: SharingSettingsProperty) {
        cdkBuilder.sharingSettings(sharingSettings.let(SharingSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("041646d4ca819762daa2e604bf5173280d6a4a5ac08a172dba6a4d4a589d8f15")
      override fun sharingSettings(sharingSettings: SharingSettingsProperty.Builder.() -> Unit):
          Unit = sharingSettings(SharingSettingsProperty(sharingSettings))

      override fun spaceStorageSettings(spaceStorageSettings: IResolvable) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(IResolvable::unwrap))
      }

      override fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(DefaultSpaceStorageSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52e04b39a0bbef7c03ae0431e80cfabcc922dc10d762b41ce484dc0006a1d40b")
      override
          fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty.Builder.() -> Unit):
          Unit = spaceStorageSettings(DefaultSpaceStorageSettingsProperty(spaceStorageSettings))

      override fun studioWebPortal(studioWebPortal: String) {
        cdkBuilder.studioWebPortal(studioWebPortal)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty,
    ) : UserSettingsProperty {
      override fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

      override fun customFileSystemConfigs(): Any? = unwrap(this).getCustomFileSystemConfigs()

      override fun customPosixUserConfig(): Any? = unwrap(this).getCustomPosixUserConfig()

      override fun defaultLandingUri(): String? = unwrap(this).getDefaultLandingUri()

      override fun executionRole(): String? = unwrap(this).getExecutionRole()

      override fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

      override fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

      override fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

      override fun rStudioServerProAppSettings(): Any? =
          unwrap(this).getRStudioServerProAppSettings()

      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      override fun sharingSettings(): Any? = unwrap(this).getSharingSettings()

      override fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()

      override fun studioWebPortal(): String? = unwrap(this).getStudioWebPortal()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty):
          UserSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EFSFileSystemConfigProperty {
    public fun fileSystemId(): String

    public fun fileSystemPath(): String? = unwrap(this).getFileSystemPath()

    public interface Builder {
      public fun fileSystemId(fileSystemId: String)

      public fun fileSystemPath(fileSystemPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty.builder()

      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      override fun fileSystemPath(fileSystemPath: String) {
        cdkBuilder.fileSystemPath(fileSystemPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty,
    ) : EFSFileSystemConfigProperty {
      override fun fileSystemId(): String = unwrap(this).getFileSystemId()

      override fun fileSystemPath(): String? = unwrap(this).getFileSystemPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EFSFileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty):
          EFSFileSystemConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EFSFileSystemConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomPosixUserConfigProperty {
    public fun gid(): Number

    public fun uid(): Number

    public interface Builder {
      public fun gid(gid: Number)

      public fun uid(uid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty.builder()

      override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      override fun uid(uid: Number) {
        cdkBuilder.uid(uid)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty,
    ) : CustomPosixUserConfigProperty {
      override fun gid(): Number = unwrap(this).getGid()

      override fun uid(): Number = unwrap(this).getUid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPosixUserConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty):
          CustomPosixUserConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPosixUserConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface JupyterLabAppSettingsProperty {
    public fun codeRepositories(): Any? = unwrap(this).getCodeRepositories()

    public fun customImages(): Any? = unwrap(this).getCustomImages()

    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    public fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
        emptyList()

    public interface Builder {
      public fun codeRepositories(codeRepositories: IResolvable)

      public fun codeRepositories(codeRepositories: List<Any>)

      public fun customImages(customImages: IResolvable)

      public fun customImages(customImages: List<Any>)

      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1250315fe231fa1c610a5c0d1bb3f73fa487abe3189623bd9dca3f6a6994813f")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      public fun lifecycleConfigArns(lifecycleConfigArns: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty.builder()

      override fun codeRepositories(codeRepositories: IResolvable) {
        cdkBuilder.codeRepositories(codeRepositories.let(IResolvable::unwrap))
      }

      override fun codeRepositories(codeRepositories: List<Any>) {
        cdkBuilder.codeRepositories(codeRepositories)
      }

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
      @JvmName("1250315fe231fa1c610a5c0d1bb3f73fa487abe3189623bd9dca3f6a6994813f")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      override fun lifecycleConfigArns(lifecycleConfigArns: List<String>) {
        cdkBuilder.lifecycleConfigArns(lifecycleConfigArns)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty,
    ) : JupyterLabAppSettingsProperty {
      override fun codeRepositories(): Any? = unwrap(this).getCodeRepositories()

      override fun customImages(): Any? = unwrap(this).getCustomImages()

      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

      override fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JupyterLabAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty):
          JupyterLabAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterLabAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty =
          (wrapped as Wrapper).cdkObject
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
      @JvmName("022649f98f5cda55073bad04f6fc522085ccdef224b56a15e01a99347bff0a30")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty.builder()

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
      @JvmName("022649f98f5cda55073bad04f6fc522085ccdef224b56a15e01a99347bff0a30")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty):
          KernelGatewayAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelGatewayAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CodeRepositoryProperty {
    public fun repositoryUrl(): String

    public interface Builder {
      public fun repositoryUrl(repositoryUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty.builder()

      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty):
          CodeRepositoryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeRepositoryProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CustomFileSystemConfigProperty {
    public fun efsFileSystemConfig(): Any? = unwrap(this).getEfsFileSystemConfig()

    public interface Builder {
      public fun efsFileSystemConfig(efsFileSystemConfig: IResolvable)

      public fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32bba1122425d0b2900bd6169c3662001a98f9fbf51fd7db107ffd697088db00")
      public
          fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty.builder()

      override fun efsFileSystemConfig(efsFileSystemConfig: IResolvable) {
        cdkBuilder.efsFileSystemConfig(efsFileSystemConfig.let(IResolvable::unwrap))
      }

      override fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty) {
        cdkBuilder.efsFileSystemConfig(efsFileSystemConfig.let(EFSFileSystemConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32bba1122425d0b2900bd6169c3662001a98f9fbf51fd7db107ffd697088db00")
      override
          fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty.Builder.() -> Unit):
          Unit = efsFileSystemConfig(EFSFileSystemConfigProperty(efsFileSystemConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty,
    ) : CustomFileSystemConfigProperty {
      override fun efsFileSystemConfig(): Any? = unwrap(this).getEfsFileSystemConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomFileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty):
          CustomFileSystemConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomFileSystemConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CodeEditorAppSettingsProperty {
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    public fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
        emptyList()

    public interface Builder {
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ccae4dc01b9d84bac327bbdfa7d3db21daf105efcb02977fb8ce18b222af80d")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      public fun lifecycleConfigArns(lifecycleConfigArns: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty.builder()

      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ccae4dc01b9d84bac327bbdfa7d3db21daf105efcb02977fb8ce18b222af80d")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      override fun lifecycleConfigArns(lifecycleConfigArns: List<String>) {
        cdkBuilder.lifecycleConfigArns(lifecycleConfigArns)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty,
    ) : CodeEditorAppSettingsProperty {
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

      override fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeEditorAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty):
          CodeEditorAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeEditorAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty =
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
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty.builder()

      override fun appImageConfigName(appImageConfigName: String) {
        cdkBuilder.appImageConfigName(appImageConfigName)
      }

      override fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
      }

      override fun imageVersionNumber(imageVersionNumber: Number) {
        cdkBuilder.imageVersionNumber(imageVersionNumber)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty):
          CustomImageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomImageProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RStudioServerProAppSettingsProperty {
    public fun accessStatus(): String? = unwrap(this).getAccessStatus()

    public fun userGroup(): String? = unwrap(this).getUserGroup()

    public interface Builder {
      public fun accessStatus(accessStatus: String)

      public fun userGroup(userGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty.builder()

      override fun accessStatus(accessStatus: String) {
        cdkBuilder.accessStatus(accessStatus)
      }

      override fun userGroup(userGroup: String) {
        cdkBuilder.userGroup(userGroup)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty,
    ) : RStudioServerProAppSettingsProperty {
      override fun accessStatus(): String? = unwrap(this).getAccessStatus()

      override fun userGroup(): String? = unwrap(this).getUserGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RStudioServerProAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty):
          RStudioServerProAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RStudioServerProAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
