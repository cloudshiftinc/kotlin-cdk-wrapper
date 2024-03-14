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

public open class CfnDomain internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appNetworkAccessType(): String? = unwrap(this).getAppNetworkAccessType()

  public open fun appNetworkAccessType(`value`: String) {
    unwrap(this).setAppNetworkAccessType(`value`)
  }

  public open fun appSecurityGroupManagement(): String? =
      unwrap(this).getAppSecurityGroupManagement()

  public open fun appSecurityGroupManagement(`value`: String) {
    unwrap(this).setAppSecurityGroupManagement(`value`)
  }

  public open fun attrDomainArn(): String = unwrap(this).getAttrDomainArn()

  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  public open fun attrHomeEfsFileSystemId(): String = unwrap(this).getAttrHomeEfsFileSystemId()

  public open fun attrSecurityGroupIdForDomainBoundary(): String =
      unwrap(this).getAttrSecurityGroupIdForDomainBoundary()

  public open fun attrSingleSignOnApplicationArn(): String =
      unwrap(this).getAttrSingleSignOnApplicationArn()

  public open fun attrSingleSignOnManagedApplicationInstanceId(): String =
      unwrap(this).getAttrSingleSignOnManagedApplicationInstanceId()

  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  public open fun authMode(): String = unwrap(this).getAuthMode()

  public open fun authMode(`value`: String) {
    unwrap(this).setAuthMode(`value`)
  }

  public open fun defaultSpaceSettings(): Any? = unwrap(this).getDefaultSpaceSettings()

  public open fun defaultSpaceSettings(`value`: IResolvable) {
    unwrap(this).setDefaultSpaceSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultSpaceSettings(`value`: DefaultSpaceSettingsProperty) {
    unwrap(this).setDefaultSpaceSettings(`value`.let(DefaultSpaceSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d8429aaee9219de4fa0172153b1dca8f882dbe27a0aeec0d1a2bf36272c2db21")
  public open fun defaultSpaceSettings(`value`: DefaultSpaceSettingsProperty.Builder.() -> Unit):
      Unit = defaultSpaceSettings(DefaultSpaceSettingsProperty(`value`))

  public open fun defaultUserSettings(): Any = unwrap(this).getDefaultUserSettings()

  public open fun defaultUserSettings(`value`: IResolvable) {
    unwrap(this).setDefaultUserSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultUserSettings(`value`: UserSettingsProperty) {
    unwrap(this).setDefaultUserSettings(`value`.let(UserSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("31b09f85c3e6881662d5d2a39f45ea403fd129de3536699ee84ac2b408d07203")
  public open fun defaultUserSettings(`value`: UserSettingsProperty.Builder.() -> Unit): Unit =
      defaultUserSettings(UserSettingsProperty(`value`))

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun domainSettings(): Any? = unwrap(this).getDomainSettings()

  public open fun domainSettings(`value`: IResolvable) {
    unwrap(this).setDomainSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun domainSettings(`value`: DomainSettingsProperty) {
    unwrap(this).setDomainSettings(`value`.let(DomainSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ff7ad1bcd96a974ac2f849ebceb30dbd7f77ea187306d31d23773d575f544e7")
  public open fun domainSettings(`value`: DomainSettingsProperty.Builder.() -> Unit): Unit =
      domainSettings(DomainSettingsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public interface Builder {
    public fun appNetworkAccessType(appNetworkAccessType: String)

    public fun appSecurityGroupManagement(appSecurityGroupManagement: String)

    public fun authMode(authMode: String)

    public fun defaultSpaceSettings(defaultSpaceSettings: IResolvable)

    public fun defaultSpaceSettings(defaultSpaceSettings: DefaultSpaceSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0541aea2d9023d83138fd5d19ec34eb6bca50e6dcc332eb676c49b71ec567f81")
    public
        fun defaultSpaceSettings(defaultSpaceSettings: DefaultSpaceSettingsProperty.Builder.() -> Unit)

    public fun defaultUserSettings(defaultUserSettings: IResolvable)

    public fun defaultUserSettings(defaultUserSettings: UserSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67693a8dc439c00e3a65fd42feb54d1ef2cc19dc96b32eefca9bc368ad820bbe")
    public fun defaultUserSettings(defaultUserSettings: UserSettingsProperty.Builder.() -> Unit)

    public fun domainName(domainName: String)

    public fun domainSettings(domainSettings: IResolvable)

    public fun domainSettings(domainSettings: DomainSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97bc89f7e4a4c3d6a51d1471420dc3788d7f132c548680140caa8cd6b902723c")
    public fun domainSettings(domainSettings: DomainSettingsProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun tags(tags: List<CfnTag>)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDomain.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDomain.Builder.create(scope, id)

    override fun appNetworkAccessType(appNetworkAccessType: String) {
      cdkBuilder.appNetworkAccessType(appNetworkAccessType)
    }

    override fun appSecurityGroupManagement(appSecurityGroupManagement: String) {
      cdkBuilder.appSecurityGroupManagement(appSecurityGroupManagement)
    }

    override fun authMode(authMode: String) {
      cdkBuilder.authMode(authMode)
    }

    override fun defaultSpaceSettings(defaultSpaceSettings: IResolvable) {
      cdkBuilder.defaultSpaceSettings(defaultSpaceSettings.let(IResolvable::unwrap))
    }

    override fun defaultSpaceSettings(defaultSpaceSettings: DefaultSpaceSettingsProperty) {
      cdkBuilder.defaultSpaceSettings(defaultSpaceSettings.let(DefaultSpaceSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0541aea2d9023d83138fd5d19ec34eb6bca50e6dcc332eb676c49b71ec567f81")
    override
        fun defaultSpaceSettings(defaultSpaceSettings: DefaultSpaceSettingsProperty.Builder.() -> Unit):
        Unit = defaultSpaceSettings(DefaultSpaceSettingsProperty(defaultSpaceSettings))

    override fun defaultUserSettings(defaultUserSettings: IResolvable) {
      cdkBuilder.defaultUserSettings(defaultUserSettings.let(IResolvable::unwrap))
    }

    override fun defaultUserSettings(defaultUserSettings: UserSettingsProperty) {
      cdkBuilder.defaultUserSettings(defaultUserSettings.let(UserSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67693a8dc439c00e3a65fd42feb54d1ef2cc19dc96b32eefca9bc368ad820bbe")
    override fun defaultUserSettings(defaultUserSettings: UserSettingsProperty.Builder.() -> Unit):
        Unit = defaultUserSettings(UserSettingsProperty(defaultUserSettings))

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainSettings(domainSettings: IResolvable) {
      cdkBuilder.domainSettings(domainSettings.let(IResolvable::unwrap))
    }

    override fun domainSettings(domainSettings: DomainSettingsProperty) {
      cdkBuilder.domainSettings(domainSettings.let(DomainSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97bc89f7e4a4c3d6a51d1471420dc3788d7f132c548680140caa8cd6b902723c")
    override fun domainSettings(domainSettings: DomainSettingsProperty.Builder.() -> Unit): Unit =
        domainSettings(DomainSettingsProperty(domainSettings))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain): CfnDomain =
        CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.sagemaker.CfnDomain =
        wrapped.cdkObject
  }

  public interface ResourceSpecProperty {
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun lifecycleConfigArn(): String? = unwrap(this).getLifecycleConfigArn()

    public fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

    public fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()

    public interface Builder {
      public fun instanceType(instanceType: String)

      public fun lifecycleConfigArn(lifecycleConfigArn: String)

      public fun sageMakerImageArn(sageMakerImageArn: String)

      public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty.builder()

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun lifecycleConfigArn(lifecycleConfigArn: String) {
        cdkBuilder.lifecycleConfigArn(lifecycleConfigArn)
      }

      override fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
      }

      override fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty,
    ) : ResourceSpecProperty {
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      override fun lifecycleConfigArn(): String? = unwrap(this).getLifecycleConfigArn()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty):
          ResourceSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceSpecProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface JupyterServerAppSettingsProperty {
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    public interface Builder {
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16529f01fa91e18098e31e0efd963479f78925d3a88a89427ddee33f55f07774")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty.builder()

      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16529f01fa91e18098e31e0efd963479f78925d3a88a89427ddee33f55f07774")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty):
          JupyterServerAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterServerAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty =
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
      @JvmName("a47ccaafec05cc6573ffbbd54efb5b81febc9dd592ca52e01555b507a1d44cf2")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty.builder()

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
      @JvmName("a47ccaafec05cc6573ffbbd54efb5b81febc9dd592ca52e01555b507a1d44cf2")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty):
          KernelGatewayAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelGatewayAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DomainSettingsProperty {
    public fun dockerSettings(): Any? = unwrap(this).getDockerSettings()

    public fun rStudioServerProDomainSettings(): Any? =
        unwrap(this).getRStudioServerProDomainSettings()

    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public interface Builder {
      public fun dockerSettings(dockerSettings: IResolvable)

      public fun dockerSettings(dockerSettings: DockerSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93ef0e9d4e8ab8c25f1dacd8a12798de73fea998b847b67fee5327f6c7af6f6e")
      public fun dockerSettings(dockerSettings: DockerSettingsProperty.Builder.() -> Unit)

      public fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: IResolvable)

      public
          fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: RStudioServerProDomainSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("daf8ea9aafb59fc0d391303fa53d911f3d3db72aabed73685861fa5f8fa4501b")
      public
          fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: RStudioServerProDomainSettingsProperty.Builder.() -> Unit)

      public fun securityGroupIds(securityGroupIds: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty.builder()

      override fun dockerSettings(dockerSettings: IResolvable) {
        cdkBuilder.dockerSettings(dockerSettings.let(IResolvable::unwrap))
      }

      override fun dockerSettings(dockerSettings: DockerSettingsProperty) {
        cdkBuilder.dockerSettings(dockerSettings.let(DockerSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93ef0e9d4e8ab8c25f1dacd8a12798de73fea998b847b67fee5327f6c7af6f6e")
      override fun dockerSettings(dockerSettings: DockerSettingsProperty.Builder.() -> Unit): Unit =
          dockerSettings(DockerSettingsProperty(dockerSettings))

      override fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: IResolvable) {
        cdkBuilder.rStudioServerProDomainSettings(rStudioServerProDomainSettings.let(IResolvable::unwrap))
      }

      override
          fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: RStudioServerProDomainSettingsProperty) {
        cdkBuilder.rStudioServerProDomainSettings(rStudioServerProDomainSettings.let(RStudioServerProDomainSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("daf8ea9aafb59fc0d391303fa53d911f3d3db72aabed73685861fa5f8fa4501b")
      override
          fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: RStudioServerProDomainSettingsProperty.Builder.() -> Unit):
          Unit =
          rStudioServerProDomainSettings(RStudioServerProDomainSettingsProperty(rStudioServerProDomainSettings))

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty,
    ) : DomainSettingsProperty {
      override fun dockerSettings(): Any? = unwrap(this).getDockerSettings()

      override fun rStudioServerProDomainSettings(): Any? =
          unwrap(this).getRStudioServerProDomainSettings()

      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DomainSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty):
          DomainSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty = (wrapped as
          Wrapper).cdkObject
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
      @JvmName("266454404c3559506035e15f27dc96253bd259f3afcf56558668eea5984c9728")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      public fun lifecycleConfigArns(lifecycleConfigArns: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty.builder()

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
      @JvmName("266454404c3559506035e15f27dc96253bd259f3afcf56558668eea5984c9728")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      override fun lifecycleConfigArns(lifecycleConfigArns: List<String>) {
        cdkBuilder.lifecycleConfigArns(lifecycleConfigArns)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty):
          JupyterLabAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterLabAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RSessionAppSettingsProperty {
    public fun customImages(): Any? = unwrap(this).getCustomImages()

    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    public interface Builder {
      public fun customImages(customImages: IResolvable)

      public fun customImages(customImages: List<Any>)

      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a627ac087547f2fa8011456158e16dc224536d2876b05ab54de322e83484b78")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty.builder()

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
      @JvmName("3a627ac087547f2fa8011456158e16dc224536d2876b05ab54de322e83484b78")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty,
    ) : RSessionAppSettingsProperty {
      override fun customImages(): Any? = unwrap(this).getCustomImages()

      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RSessionAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty):
          RSessionAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RSessionAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RStudioServerProDomainSettingsProperty {
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    public fun domainExecutionRoleArn(): String

    public fun rStudioConnectUrl(): String? = unwrap(this).getRStudioConnectUrl()

    public fun rStudioPackageManagerUrl(): String? = unwrap(this).getRStudioPackageManagerUrl()

    public interface Builder {
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72a63478d8ec45d9581a7adbbbc76ad8ca6e261c1076d4ddd8e9a5aa058a1698")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      public fun domainExecutionRoleArn(domainExecutionRoleArn: String)

      public fun rStudioConnectUrl(rStudioConnectUrl: String)

      public fun rStudioPackageManagerUrl(rStudioPackageManagerUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty.builder()

      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72a63478d8ec45d9581a7adbbbc76ad8ca6e261c1076d4ddd8e9a5aa058a1698")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      override fun domainExecutionRoleArn(domainExecutionRoleArn: String) {
        cdkBuilder.domainExecutionRoleArn(domainExecutionRoleArn)
      }

      override fun rStudioConnectUrl(rStudioConnectUrl: String) {
        cdkBuilder.rStudioConnectUrl(rStudioConnectUrl)
      }

      override fun rStudioPackageManagerUrl(rStudioPackageManagerUrl: String) {
        cdkBuilder.rStudioPackageManagerUrl(rStudioPackageManagerUrl)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty,
    ) : RStudioServerProDomainSettingsProperty {
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

      override fun domainExecutionRoleArn(): String = unwrap(this).getDomainExecutionRoleArn()

      override fun rStudioConnectUrl(): String? = unwrap(this).getRStudioConnectUrl()

      override fun rStudioPackageManagerUrl(): String? = unwrap(this).getRStudioPackageManagerUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RStudioServerProDomainSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty):
          RStudioServerProDomainSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RStudioServerProDomainSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DockerSettingsProperty {
    public fun enableDockerAccess(): String? = unwrap(this).getEnableDockerAccess()

    public fun vpcOnlyTrustedAccounts(): List<String> = unwrap(this).getVpcOnlyTrustedAccounts() ?:
        emptyList()

    public interface Builder {
      public fun enableDockerAccess(enableDockerAccess: String)

      public fun vpcOnlyTrustedAccounts(vpcOnlyTrustedAccounts: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty.builder()

      override fun enableDockerAccess(enableDockerAccess: String) {
        cdkBuilder.enableDockerAccess(enableDockerAccess)
      }

      override fun vpcOnlyTrustedAccounts(vpcOnlyTrustedAccounts: List<String>) {
        cdkBuilder.vpcOnlyTrustedAccounts(vpcOnlyTrustedAccounts)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty,
    ) : DockerSettingsProperty {
      override fun enableDockerAccess(): String? = unwrap(this).getEnableDockerAccess()

      override fun vpcOnlyTrustedAccounts(): List<String> = unwrap(this).getVpcOnlyTrustedAccounts()
          ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DockerSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty):
          DockerSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DockerSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty = (wrapped as
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
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty.builder()

      override fun accessStatus(accessStatus: String) {
        cdkBuilder.accessStatus(accessStatus)
      }

      override fun userGroup(userGroup: String) {
        cdkBuilder.userGroup(userGroup)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty):
          RStudioServerProAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RStudioServerProAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomFileSystemConfigProperty {
    public fun efsFileSystemConfig(): Any? = unwrap(this).getEfsFileSystemConfig()

    public interface Builder {
      public fun efsFileSystemConfig(efsFileSystemConfig: IResolvable)

      public fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51d19063b8418bdcc7fb6317565668cc527b6fd40ba7621f9328e0ac5ac8d994")
      public
          fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty.builder()

      override fun efsFileSystemConfig(efsFileSystemConfig: IResolvable) {
        cdkBuilder.efsFileSystemConfig(efsFileSystemConfig.let(IResolvable::unwrap))
      }

      override fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty) {
        cdkBuilder.efsFileSystemConfig(efsFileSystemConfig.let(EFSFileSystemConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51d19063b8418bdcc7fb6317565668cc527b6fd40ba7621f9328e0ac5ac8d994")
      override
          fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty.Builder.() -> Unit):
          Unit = efsFileSystemConfig(EFSFileSystemConfigProperty(efsFileSystemConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty):
          CustomFileSystemConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomFileSystemConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty =
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
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty.builder()

      override fun appImageConfigName(appImageConfigName: String) {
        cdkBuilder.appImageConfigName(appImageConfigName)
      }

      override fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
      }

      override fun imageVersionNumber(imageVersionNumber: Number) {
        cdkBuilder.imageVersionNumber(imageVersionNumber)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty):
          CustomImageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomImageProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CodeRepositoryProperty {
    public fun repositoryUrl(): String

    public interface Builder {
      public fun repositoryUrl(repositoryUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty.builder()

      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty):
          CodeRepositoryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeRepositoryProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty.builder()

      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      override fun fileSystemPath(fileSystemPath: String) {
        cdkBuilder.fileSystemPath(fileSystemPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty):
          EFSFileSystemConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EFSFileSystemConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty = (wrapped
          as Wrapper).cdkObject
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
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty.builder()

      override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      override fun uid(uid: Number) {
        cdkBuilder.uid(uid)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty):
          CustomPosixUserConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPosixUserConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty =
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
      @JvmName("961a4ba4cd6ca5198b7d476da95436026be65e6edf209e7e7897180d63d719c3")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      public fun lifecycleConfigArns(lifecycleConfigArns: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty.builder()

      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("961a4ba4cd6ca5198b7d476da95436026be65e6edf209e7e7897180d63d719c3")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      override fun lifecycleConfigArns(lifecycleConfigArns: List<String>) {
        cdkBuilder.lifecycleConfigArns(lifecycleConfigArns)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty):
          CodeEditorAppSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeEditorAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty.builder()

      override fun defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb: Number) {
        cdkBuilder.defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb)
      }

      override fun maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb: Number) {
        cdkBuilder.maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty):
          DefaultEbsStorageSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultEbsStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UserSettingsProperty {
    public fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

    public fun customFileSystemConfigs(): Any? = unwrap(this).getCustomFileSystemConfigs()

    public fun customPosixUserConfig(): Any? = unwrap(this).getCustomPosixUserConfig()

    public fun defaultLandingUri(): String? = unwrap(this).getDefaultLandingUri()

    public fun executionRole(): String

    public fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

    public fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

    public fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

    public fun rSessionAppSettings(): Any? = unwrap(this).getRSessionAppSettings()

    public fun rStudioServerProAppSettings(): Any? = unwrap(this).getRStudioServerProAppSettings()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun sharingSettings(): Any? = unwrap(this).getSharingSettings()

    public fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()

    public fun studioWebPortal(): String? = unwrap(this).getStudioWebPortal()

    public interface Builder {
      public fun codeEditorAppSettings(codeEditorAppSettings: IResolvable)

      public fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4efe1cbcf116b00bf28ee2dea6f2e7016d8969fc73b002a063cb1fa3d4de7a47")
      public
          fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty.Builder.() -> Unit)

      public fun customFileSystemConfigs(customFileSystemConfigs: IResolvable)

      public fun customFileSystemConfigs(customFileSystemConfigs: List<Any>)

      public fun customPosixUserConfig(customPosixUserConfig: IResolvable)

      public fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bee93cda65afaeafe67b14506c41615fd81e0789bb79e798e5b9288ffc9fa40")
      public
          fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty.Builder.() -> Unit)

      public fun defaultLandingUri(defaultLandingUri: String)

      public fun executionRole(executionRole: String)

      public fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable)

      public fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f3b69c867059c09728cf81b6b719b840463a94d379ae6f52619fa454c24c7d4")
      public
          fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty.Builder.() -> Unit)

      public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable)

      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5216496e30a90adc157724786ace371107aee769a065a245cacae930fa5b2899")
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit)

      public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable)

      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4d814192f96e3065098606ab1cc4616e36486c9f14952a07ba7f26a3c51370c")
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit)

      public fun rSessionAppSettings(rSessionAppSettings: IResolvable)

      public fun rSessionAppSettings(rSessionAppSettings: RSessionAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b81f78fa82c9334f24ab7a4ad9a3b8a2f1adaf4e91696e79d83a9b27793fabca")
      public
          fun rSessionAppSettings(rSessionAppSettings: RSessionAppSettingsProperty.Builder.() -> Unit)

      public fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable)

      public
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfbb9e77b11195350c75cd55642c7472fb755619bbe3f65ccbc8780c7b4a8063")
      public
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty.Builder.() -> Unit)

      public fun securityGroups(securityGroups: List<String>)

      public fun sharingSettings(sharingSettings: IResolvable)

      public fun sharingSettings(sharingSettings: SharingSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c1f110e5a5c496b5a1af40ba1b094eeaa34ed4f7f1f095fd2c54606d0c7b86a")
      public fun sharingSettings(sharingSettings: SharingSettingsProperty.Builder.() -> Unit)

      public fun spaceStorageSettings(spaceStorageSettings: IResolvable)

      public fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a3aae4112a7de18e3c56555dbe10493634a6f69dfe8f103aab3796ca359b6f1")
      public
          fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty.Builder.() -> Unit)

      public fun studioWebPortal(studioWebPortal: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty.builder()

      override fun codeEditorAppSettings(codeEditorAppSettings: IResolvable) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(IResolvable::unwrap))
      }

      override fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(CodeEditorAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4efe1cbcf116b00bf28ee2dea6f2e7016d8969fc73b002a063cb1fa3d4de7a47")
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
      @JvmName("7bee93cda65afaeafe67b14506c41615fd81e0789bb79e798e5b9288ffc9fa40")
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
      @JvmName("2f3b69c867059c09728cf81b6b719b840463a94d379ae6f52619fa454c24c7d4")
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
      @JvmName("5216496e30a90adc157724786ace371107aee769a065a245cacae930fa5b2899")
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
      @JvmName("b4d814192f96e3065098606ab1cc4616e36486c9f14952a07ba7f26a3c51370c")
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit):
          Unit =
          kernelGatewayAppSettings(KernelGatewayAppSettingsProperty(kernelGatewayAppSettings))

      override fun rSessionAppSettings(rSessionAppSettings: IResolvable) {
        cdkBuilder.rSessionAppSettings(rSessionAppSettings.let(IResolvable::unwrap))
      }

      override fun rSessionAppSettings(rSessionAppSettings: RSessionAppSettingsProperty) {
        cdkBuilder.rSessionAppSettings(rSessionAppSettings.let(RSessionAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b81f78fa82c9334f24ab7a4ad9a3b8a2f1adaf4e91696e79d83a9b27793fabca")
      override
          fun rSessionAppSettings(rSessionAppSettings: RSessionAppSettingsProperty.Builder.() -> Unit):
          Unit = rSessionAppSettings(RSessionAppSettingsProperty(rSessionAppSettings))

      override fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings.let(IResolvable::unwrap))
      }

      override
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings.let(RStudioServerProAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfbb9e77b11195350c75cd55642c7472fb755619bbe3f65ccbc8780c7b4a8063")
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
      @JvmName("3c1f110e5a5c496b5a1af40ba1b094eeaa34ed4f7f1f095fd2c54606d0c7b86a")
      override fun sharingSettings(sharingSettings: SharingSettingsProperty.Builder.() -> Unit):
          Unit = sharingSettings(SharingSettingsProperty(sharingSettings))

      override fun spaceStorageSettings(spaceStorageSettings: IResolvable) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(IResolvable::unwrap))
      }

      override fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(DefaultSpaceStorageSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a3aae4112a7de18e3c56555dbe10493634a6f69dfe8f103aab3796ca359b6f1")
      override
          fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty.Builder.() -> Unit):
          Unit = spaceStorageSettings(DefaultSpaceStorageSettingsProperty(spaceStorageSettings))

      override fun studioWebPortal(studioWebPortal: String) {
        cdkBuilder.studioWebPortal(studioWebPortal)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty,
    ) : UserSettingsProperty {
      override fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

      override fun customFileSystemConfigs(): Any? = unwrap(this).getCustomFileSystemConfigs()

      override fun customPosixUserConfig(): Any? = unwrap(this).getCustomPosixUserConfig()

      override fun defaultLandingUri(): String? = unwrap(this).getDefaultLandingUri()

      override fun executionRole(): String = unwrap(this).getExecutionRole()

      override fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

      override fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

      override fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

      override fun rSessionAppSettings(): Any? = unwrap(this).getRSessionAppSettings()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty):
          UserSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DefaultSpaceStorageSettingsProperty {
    public fun defaultEbsStorageSettings(): Any? = unwrap(this).getDefaultEbsStorageSettings()

    public interface Builder {
      public fun defaultEbsStorageSettings(defaultEbsStorageSettings: IResolvable)

      public
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88b9375c272d3f8eacbde4ab8643a541071d5490c41fe7713e8c92223e3ea688")
      public
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty.builder()

      override fun defaultEbsStorageSettings(defaultEbsStorageSettings: IResolvable) {
        cdkBuilder.defaultEbsStorageSettings(defaultEbsStorageSettings.let(IResolvable::unwrap))
      }

      override
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty) {
        cdkBuilder.defaultEbsStorageSettings(defaultEbsStorageSettings.let(DefaultEbsStorageSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88b9375c272d3f8eacbde4ab8643a541071d5490c41fe7713e8c92223e3ea688")
      override
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty.Builder.() -> Unit):
          Unit =
          defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty(defaultEbsStorageSettings))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty):
          DefaultSpaceStorageSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultSpaceStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DefaultSpaceSettingsProperty {
    public fun executionRole(): String

    public fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

    public fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public interface Builder {
      public fun executionRole(executionRole: String)

      public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable)

      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05ce34e60196679116a9944bb5f40ddbeceb3301b86e4b3f2dd1541883bf3ee1")
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit)

      public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable)

      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("460295676976450cdae2cda859fd7bce6c46c68c626bdf664e452eb8d49fe133")
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit)

      public fun securityGroups(securityGroups: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty.builder()

      override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      override fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(IResolvable::unwrap))
      }

      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(JupyterServerAppSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05ce34e60196679116a9944bb5f40ddbeceb3301b86e4b3f2dd1541883bf3ee1")
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
      @JvmName("460295676976450cdae2cda859fd7bce6c46c68c626bdf664e452eb8d49fe133")
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit):
          Unit =
          kernelGatewayAppSettings(KernelGatewayAppSettingsProperty(kernelGatewayAppSettings))

      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty,
    ) : DefaultSpaceSettingsProperty {
      override fun executionRole(): String = unwrap(this).getExecutionRole()

      override fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

      override fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultSpaceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty):
          DefaultSpaceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultSpaceSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty.builder()

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
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty):
          SharingSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharingSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
