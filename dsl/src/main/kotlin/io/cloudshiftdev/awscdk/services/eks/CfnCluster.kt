package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessConfig(): Any? = unwrap(this).getAccessConfig()

  public open fun accessConfig(`value`: IResolvable) {
    unwrap(this).setAccessConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun accessConfig(`value`: AccessConfigProperty) {
    unwrap(this).setAccessConfig(`value`.let(AccessConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7d094533038f681e526f068a9f0842251752e3561057b41f829aefa7af896859")
  public open fun accessConfig(`value`: AccessConfigProperty.Builder.() -> Unit): Unit =
      accessConfig(AccessConfigProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCertificateAuthorityData(): String =
      unwrap(this).getAttrCertificateAuthorityData()

  public open fun attrClusterSecurityGroupId(): String =
      unwrap(this).getAttrClusterSecurityGroupId()

  public open fun attrEncryptionConfigKeyArn(): String =
      unwrap(this).getAttrEncryptionConfigKeyArn()

  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrKubernetesNetworkConfigServiceIpv6Cidr(): String =
      unwrap(this).getAttrKubernetesNetworkConfigServiceIpv6Cidr()

  public open fun attrOpenIdConnectIssuerUrl(): String =
      unwrap(this).getAttrOpenIdConnectIssuerUrl()

  public open fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

  public open fun encryptionConfig(`value`: IResolvable) {
    unwrap(this).setEncryptionConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionConfig(__idx_ac66f0: List<Any>) {
    unwrap(this).setEncryptionConfig(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kubernetesNetworkConfig(): Any? = unwrap(this).getKubernetesNetworkConfig()

  public open fun kubernetesNetworkConfig(`value`: IResolvable) {
    unwrap(this).setKubernetesNetworkConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun kubernetesNetworkConfig(`value`: KubernetesNetworkConfigProperty) {
    unwrap(this).setKubernetesNetworkConfig(`value`.let(KubernetesNetworkConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ad3200466ba4740d3792f66a48b1a165681c20a4d21e1790d200e4ae5f3f30b")
  public open
      fun kubernetesNetworkConfig(`value`: KubernetesNetworkConfigProperty.Builder.() -> Unit): Unit
      = kubernetesNetworkConfig(KubernetesNetworkConfigProperty(`value`))

  public open fun logging(): Any? = unwrap(this).getLogging()

  public open fun logging(`value`: IResolvable) {
    unwrap(this).setLogging(`value`.let(IResolvable::unwrap))
  }

  public open fun logging(`value`: LoggingProperty) {
    unwrap(this).setLogging(`value`.let(LoggingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b20acf74cd551ac85f445abd0492dcda910bb06bd544c96d04253404c11cadad")
  public open fun logging(`value`: LoggingProperty.Builder.() -> Unit): Unit =
      logging(LoggingProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun outpostConfig(): Any? = unwrap(this).getOutpostConfig()

  public open fun outpostConfig(`value`: IResolvable) {
    unwrap(this).setOutpostConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun outpostConfig(`value`: OutpostConfigProperty) {
    unwrap(this).setOutpostConfig(`value`.let(OutpostConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("460f5e890d563eabe469059d6828c96ba5b5fd92bdfd8047b19bedc7f6dc9550")
  public open fun outpostConfig(`value`: OutpostConfigProperty.Builder.() -> Unit): Unit =
      outpostConfig(OutpostConfigProperty(`value`))

  public open fun resourcesVpcConfig(): Any = unwrap(this).getResourcesVpcConfig()

  public open fun resourcesVpcConfig(`value`: IResolvable) {
    unwrap(this).setResourcesVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun resourcesVpcConfig(`value`: ResourcesVpcConfigProperty) {
    unwrap(this).setResourcesVpcConfig(`value`.let(ResourcesVpcConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b0273a7fbee243b260ea726f43953140688a2586fb8bec86143ef2f9b56da211")
  public open fun resourcesVpcConfig(`value`: ResourcesVpcConfigProperty.Builder.() -> Unit): Unit =
      resourcesVpcConfig(ResourcesVpcConfigProperty(`value`))

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun version(): String? = unwrap(this).getVersion()

  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  public interface Builder {
    public fun accessConfig(accessConfig: IResolvable)

    public fun accessConfig(accessConfig: AccessConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec4c1a7d3a6de171eddcfa8c911dcb17d9b0926ae11adb71b6e5b373e025c017")
    public fun accessConfig(accessConfig: AccessConfigProperty.Builder.() -> Unit)

    public fun encryptionConfig(encryptionConfig: IResolvable)

    public fun encryptionConfig(encryptionConfig: List<Any>)

    public fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable)

    public fun kubernetesNetworkConfig(kubernetesNetworkConfig: KubernetesNetworkConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("790fe92404891b374995e9dfa06db968cf66fb7fea54f12e1ddfe19395e58665")
    public
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: KubernetesNetworkConfigProperty.Builder.() -> Unit)

    public fun logging(logging: IResolvable)

    public fun logging(logging: LoggingProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6153bf06bf61e6a7a510b8026e66d18479c8742b8aa3412d834b150dcad1024")
    public fun logging(logging: LoggingProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun outpostConfig(outpostConfig: IResolvable)

    public fun outpostConfig(outpostConfig: OutpostConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd33fe939cf4bdbab02c5d1407a0364d4da3d4d15abcbd69ab72657b980bf691")
    public fun outpostConfig(outpostConfig: OutpostConfigProperty.Builder.() -> Unit)

    public fun resourcesVpcConfig(resourcesVpcConfig: IResolvable)

    public fun resourcesVpcConfig(resourcesVpcConfig: ResourcesVpcConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fc182e569f83b4f2259bcf755a598aac7a873678fefda3a91de8d9ff379b29c")
    public fun resourcesVpcConfig(resourcesVpcConfig: ResourcesVpcConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnCluster.Builder =
        software.amazon.awscdk.services.eks.CfnCluster.Builder.create(scope, id)

    override fun accessConfig(accessConfig: IResolvable) {
      cdkBuilder.accessConfig(accessConfig.let(IResolvable::unwrap))
    }

    override fun accessConfig(accessConfig: AccessConfigProperty) {
      cdkBuilder.accessConfig(accessConfig.let(AccessConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec4c1a7d3a6de171eddcfa8c911dcb17d9b0926ae11adb71b6e5b373e025c017")
    override fun accessConfig(accessConfig: AccessConfigProperty.Builder.() -> Unit): Unit =
        accessConfig(AccessConfigProperty(accessConfig))

    override fun encryptionConfig(encryptionConfig: IResolvable) {
      cdkBuilder.encryptionConfig(encryptionConfig.let(IResolvable::unwrap))
    }

    override fun encryptionConfig(encryptionConfig: List<Any>) {
      cdkBuilder.encryptionConfig(encryptionConfig)
    }

    override fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable) {
      cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig.let(IResolvable::unwrap))
    }

    override fun kubernetesNetworkConfig(kubernetesNetworkConfig: KubernetesNetworkConfigProperty) {
      cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig.let(KubernetesNetworkConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("790fe92404891b374995e9dfa06db968cf66fb7fea54f12e1ddfe19395e58665")
    override
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: KubernetesNetworkConfigProperty.Builder.() -> Unit):
        Unit = kubernetesNetworkConfig(KubernetesNetworkConfigProperty(kubernetesNetworkConfig))

    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    override fun logging(logging: LoggingProperty) {
      cdkBuilder.logging(logging.let(LoggingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6153bf06bf61e6a7a510b8026e66d18479c8742b8aa3412d834b150dcad1024")
    override fun logging(logging: LoggingProperty.Builder.() -> Unit): Unit =
        logging(LoggingProperty(logging))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outpostConfig(outpostConfig: IResolvable) {
      cdkBuilder.outpostConfig(outpostConfig.let(IResolvable::unwrap))
    }

    override fun outpostConfig(outpostConfig: OutpostConfigProperty) {
      cdkBuilder.outpostConfig(outpostConfig.let(OutpostConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd33fe939cf4bdbab02c5d1407a0364d4da3d4d15abcbd69ab72657b980bf691")
    override fun outpostConfig(outpostConfig: OutpostConfigProperty.Builder.() -> Unit): Unit =
        outpostConfig(OutpostConfigProperty(outpostConfig))

    override fun resourcesVpcConfig(resourcesVpcConfig: IResolvable) {
      cdkBuilder.resourcesVpcConfig(resourcesVpcConfig.let(IResolvable::unwrap))
    }

    override fun resourcesVpcConfig(resourcesVpcConfig: ResourcesVpcConfigProperty) {
      cdkBuilder.resourcesVpcConfig(resourcesVpcConfig.let(ResourcesVpcConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fc182e569f83b4f2259bcf755a598aac7a873678fefda3a91de8d9ff379b29c")
    override
        fun resourcesVpcConfig(resourcesVpcConfig: ResourcesVpcConfigProperty.Builder.() -> Unit):
        Unit = resourcesVpcConfig(ResourcesVpcConfigProperty(resourcesVpcConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.eks.CfnCluster =
        wrapped.cdkObject
  }

  public interface AccessConfigProperty {
    public fun authenticationMode(): String? = unwrap(this).getAuthenticationMode()

    public fun bootstrapClusterCreatorAdminPermissions(): Any? =
        unwrap(this).getBootstrapClusterCreatorAdminPermissions()

    public interface Builder {
      public fun authenticationMode(authenticationMode: String)

      public
          fun bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions: Boolean)

      public
          fun bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty.builder()

      override fun authenticationMode(authenticationMode: String) {
        cdkBuilder.authenticationMode(authenticationMode)
      }

      override
          fun bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions: Boolean) {
        cdkBuilder.bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions)
      }

      override
          fun bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions: IResolvable) {
        cdkBuilder.bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty,
    ) : AccessConfigProperty {
      override fun authenticationMode(): String? = unwrap(this).getAuthenticationMode()

      override fun bootstrapClusterCreatorAdminPermissions(): Any? =
          unwrap(this).getBootstrapClusterCreatorAdminPermissions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty):
          AccessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ControlPlanePlacementProperty {
    public fun groupName(): String? = unwrap(this).getGroupName()

    public interface Builder {
      public fun groupName(groupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty.builder()

      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      public fun build():
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty,
    ) : ControlPlanePlacementProperty {
      override fun groupName(): String? = unwrap(this).getGroupName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ControlPlanePlacementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty):
          ControlPlanePlacementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ControlPlanePlacementProperty):
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ClusterLoggingProperty {
    public fun enabledTypes(): Any? = unwrap(this).getEnabledTypes()

    public interface Builder {
      public fun enabledTypes(enabledTypes: IResolvable)

      public fun enabledTypes(enabledTypes: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty.builder()

      override fun enabledTypes(enabledTypes: IResolvable) {
        cdkBuilder.enabledTypes(enabledTypes.let(IResolvable::unwrap))
      }

      override fun enabledTypes(enabledTypes: List<Any>) {
        cdkBuilder.enabledTypes(enabledTypes)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty,
    ) : ClusterLoggingProperty {
      override fun enabledTypes(): Any? = unwrap(this).getEnabledTypes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterLoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty):
          ClusterLoggingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterLoggingProperty):
          software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResourcesVpcConfigProperty {
    public fun endpointPrivateAccess(): Any? = unwrap(this).getEndpointPrivateAccess()

    public fun endpointPublicAccess(): Any? = unwrap(this).getEndpointPublicAccess()

    public fun publicAccessCidrs(): List<String> = unwrap(this).getPublicAccessCidrs() ?:
        emptyList()

    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String>

    public interface Builder {
      public fun endpointPrivateAccess(endpointPrivateAccess: Boolean)

      public fun endpointPrivateAccess(endpointPrivateAccess: IResolvable)

      public fun endpointPublicAccess(endpointPublicAccess: Boolean)

      public fun endpointPublicAccess(endpointPublicAccess: IResolvable)

      public fun publicAccessCidrs(publicAccessCidrs: List<String>)

      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun subnetIds(subnetIds: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty.builder()

      override fun endpointPrivateAccess(endpointPrivateAccess: Boolean) {
        cdkBuilder.endpointPrivateAccess(endpointPrivateAccess)
      }

      override fun endpointPrivateAccess(endpointPrivateAccess: IResolvable) {
        cdkBuilder.endpointPrivateAccess(endpointPrivateAccess.let(IResolvable::unwrap))
      }

      override fun endpointPublicAccess(endpointPublicAccess: Boolean) {
        cdkBuilder.endpointPublicAccess(endpointPublicAccess)
      }

      override fun endpointPublicAccess(endpointPublicAccess: IResolvable) {
        cdkBuilder.endpointPublicAccess(endpointPublicAccess.let(IResolvable::unwrap))
      }

      override fun publicAccessCidrs(publicAccessCidrs: List<String>) {
        cdkBuilder.publicAccessCidrs(publicAccessCidrs)
      }

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty,
    ) : ResourcesVpcConfigProperty {
      override fun endpointPrivateAccess(): Any? = unwrap(this).getEndpointPrivateAccess()

      override fun endpointPublicAccess(): Any? = unwrap(this).getEndpointPublicAccess()

      override fun publicAccessCidrs(): List<String> = unwrap(this).getPublicAccessCidrs() ?:
          emptyList()

      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcesVpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty):
          ResourcesVpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourcesVpcConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ProviderProperty {
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    public interface Builder {
      public fun keyArn(keyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty.builder()

      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty,
    ) : ProviderProperty {
      override fun keyArn(): String? = unwrap(this).getKeyArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty):
          ProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProviderProperty):
          software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LoggingProperty {
    public fun clusterLogging(): Any? = unwrap(this).getClusterLogging()

    public interface Builder {
      public fun clusterLogging(clusterLogging: IResolvable)

      public fun clusterLogging(clusterLogging: ClusterLoggingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6eef5ca98ad698d391f4345c1070b4d8235bd9d01892094d471af59ebc1ff719")
      public fun clusterLogging(clusterLogging: ClusterLoggingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty.Builder
          = software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty.builder()

      override fun clusterLogging(clusterLogging: IResolvable) {
        cdkBuilder.clusterLogging(clusterLogging.let(IResolvable::unwrap))
      }

      override fun clusterLogging(clusterLogging: ClusterLoggingProperty) {
        cdkBuilder.clusterLogging(clusterLogging.let(ClusterLoggingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6eef5ca98ad698d391f4345c1070b4d8235bd9d01892094d471af59ebc1ff719")
      override fun clusterLogging(clusterLogging: ClusterLoggingProperty.Builder.() -> Unit): Unit =
          clusterLogging(ClusterLoggingProperty(clusterLogging))

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty,
    ) : LoggingProperty {
      override fun clusterLogging(): Any? = unwrap(this).getClusterLogging()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty):
          LoggingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingProperty):
          software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OutpostConfigProperty {
    public fun controlPlaneInstanceType(): String

    public fun controlPlanePlacement(): Any? = unwrap(this).getControlPlanePlacement()

    public fun outpostArns(): List<String>

    public interface Builder {
      public fun controlPlaneInstanceType(controlPlaneInstanceType: String)

      public fun controlPlanePlacement(controlPlanePlacement: IResolvable)

      public fun controlPlanePlacement(controlPlanePlacement: ControlPlanePlacementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11057470261230998833a07856832074f2f428b9635537fa10ab3a00da279ff")
      public
          fun controlPlanePlacement(controlPlanePlacement: ControlPlanePlacementProperty.Builder.() -> Unit)

      public fun outpostArns(outpostArns: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty.builder()

      override fun controlPlaneInstanceType(controlPlaneInstanceType: String) {
        cdkBuilder.controlPlaneInstanceType(controlPlaneInstanceType)
      }

      override fun controlPlanePlacement(controlPlanePlacement: IResolvable) {
        cdkBuilder.controlPlanePlacement(controlPlanePlacement.let(IResolvable::unwrap))
      }

      override fun controlPlanePlacement(controlPlanePlacement: ControlPlanePlacementProperty) {
        cdkBuilder.controlPlanePlacement(controlPlanePlacement.let(ControlPlanePlacementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11057470261230998833a07856832074f2f428b9635537fa10ab3a00da279ff")
      override
          fun controlPlanePlacement(controlPlanePlacement: ControlPlanePlacementProperty.Builder.() -> Unit):
          Unit = controlPlanePlacement(ControlPlanePlacementProperty(controlPlanePlacement))

      override fun outpostArns(outpostArns: List<String>) {
        cdkBuilder.outpostArns(outpostArns)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty,
    ) : OutpostConfigProperty {
      override fun controlPlaneInstanceType(): String = unwrap(this).getControlPlaneInstanceType()

      override fun controlPlanePlacement(): Any? = unwrap(this).getControlPlanePlacement()

      override fun outpostArns(): List<String> = unwrap(this).getOutpostArns() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutpostConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty):
          OutpostConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutpostConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KubernetesNetworkConfigProperty {
    public fun ipFamily(): String? = unwrap(this).getIpFamily()

    public fun serviceIpv4Cidr(): String? = unwrap(this).getServiceIpv4Cidr()

    public fun serviceIpv6Cidr(): String? = unwrap(this).getServiceIpv6Cidr()

    public interface Builder {
      public fun ipFamily(ipFamily: String)

      public fun serviceIpv4Cidr(serviceIpv4Cidr: String)

      public fun serviceIpv6Cidr(serviceIpv6Cidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty.builder()

      override fun ipFamily(ipFamily: String) {
        cdkBuilder.ipFamily(ipFamily)
      }

      override fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
        cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
      }

      override fun serviceIpv6Cidr(serviceIpv6Cidr: String) {
        cdkBuilder.serviceIpv6Cidr(serviceIpv6Cidr)
      }

      public fun build():
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty,
    ) : KubernetesNetworkConfigProperty {
      override fun ipFamily(): String? = unwrap(this).getIpFamily()

      override fun serviceIpv4Cidr(): String? = unwrap(this).getServiceIpv4Cidr()

      override fun serviceIpv6Cidr(): String? = unwrap(this).getServiceIpv6Cidr()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KubernetesNetworkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty):
          KubernetesNetworkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KubernetesNetworkConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface LoggingTypeConfigProperty {
    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty,
    ) : LoggingTypeConfigProperty {
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty):
          LoggingTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingTypeConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EncryptionConfigProperty {
    public fun provider(): Any? = unwrap(this).getProvider()

    public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    public interface Builder {
      public fun provider(provider: IResolvable)

      public fun provider(provider: ProviderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba6e737e61209cc121faf7416cd1f79e39e64e9efc1ac515c84c441be6580677")
      public fun provider(provider: ProviderProperty.Builder.() -> Unit)

      public fun resources(resources: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty.builder()

      override fun provider(provider: IResolvable) {
        cdkBuilder.provider(provider.let(IResolvable::unwrap))
      }

      override fun provider(provider: ProviderProperty) {
        cdkBuilder.provider(provider.let(ProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba6e737e61209cc121faf7416cd1f79e39e64e9efc1ac515c84c441be6580677")
      override fun provider(provider: ProviderProperty.Builder.() -> Unit): Unit =
          provider(ProviderProperty(provider))

      override fun resources(resources: List<String>) {
        cdkBuilder.resources(resources)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty,
    ) : EncryptionConfigProperty {
      override fun provider(): Any? = unwrap(this).getProvider()

      override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty):
          EncryptionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
