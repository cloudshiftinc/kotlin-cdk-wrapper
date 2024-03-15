@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnClusterProps {
  public fun accessConfig(): Any? = unwrap(this).getAccessConfig()

  public fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

  public fun kubernetesNetworkConfig(): Any? = unwrap(this).getKubernetesNetworkConfig()

  public fun logging(): Any? = unwrap(this).getLogging()

  public fun name(): String? = unwrap(this).getName()

  public fun outpostConfig(): Any? = unwrap(this).getOutpostConfig()

  public fun resourcesVpcConfig(): Any

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun accessConfig(accessConfig: IResolvable)

    public fun accessConfig(accessConfig: CfnCluster.AccessConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1db3433f0287bf06c66c1c5ca6c1dd41f89f3597d9ae877ce350be7da3102116")
    public fun accessConfig(accessConfig: CfnCluster.AccessConfigProperty.Builder.() -> Unit)

    public fun encryptionConfig(encryptionConfig: IResolvable)

    public fun encryptionConfig(encryptionConfig: List<Any>)

    public fun encryptionConfig(vararg encryptionConfig: Any)

    public fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable)

    public
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60033b808bc2c46e2bf4e1a441fca8a9dd815f315d2a5568dbb6d3931b1bf306")
    public
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty.Builder.() -> Unit)

    public fun logging(logging: IResolvable)

    public fun logging(logging: CfnCluster.LoggingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d2bc3a155e2872611187d178db5a583b733421bee14c3b75b30c8281010491e")
    public fun logging(logging: CfnCluster.LoggingProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun outpostConfig(outpostConfig: IResolvable)

    public fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f1d69dea2f2c473564e7ee22b1f197e68618b93fee6df6d35b64ea8684fcb51")
    public fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty.Builder.() -> Unit)

    public fun resourcesVpcConfig(resourcesVpcConfig: IResolvable)

    public fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d542b7186da75779ed8fbe27de97ba53ed1a4b34a4898e25900b66bf7bbe406")
    public
        fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnClusterProps.Builder =
        software.amazon.awscdk.services.eks.CfnClusterProps.builder()

    override fun accessConfig(accessConfig: IResolvable) {
      cdkBuilder.accessConfig(accessConfig.let(IResolvable::unwrap))
    }

    override fun accessConfig(accessConfig: CfnCluster.AccessConfigProperty) {
      cdkBuilder.accessConfig(accessConfig.let(CfnCluster.AccessConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1db3433f0287bf06c66c1c5ca6c1dd41f89f3597d9ae877ce350be7da3102116")
    override fun accessConfig(accessConfig: CfnCluster.AccessConfigProperty.Builder.() -> Unit):
        Unit = accessConfig(CfnCluster.AccessConfigProperty(accessConfig))

    override fun encryptionConfig(encryptionConfig: IResolvable) {
      cdkBuilder.encryptionConfig(encryptionConfig.let(IResolvable::unwrap))
    }

    override fun encryptionConfig(encryptionConfig: List<Any>) {
      cdkBuilder.encryptionConfig(encryptionConfig)
    }

    override fun encryptionConfig(vararg encryptionConfig: Any): Unit =
        encryptionConfig(encryptionConfig.toList())

    override fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable) {
      cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig.let(IResolvable::unwrap))
    }

    override
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty) {
      cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig.let(CfnCluster.KubernetesNetworkConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60033b808bc2c46e2bf4e1a441fca8a9dd815f315d2a5568dbb6d3931b1bf306")
    override
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty.Builder.() -> Unit):
        Unit =
        kubernetesNetworkConfig(CfnCluster.KubernetesNetworkConfigProperty(kubernetesNetworkConfig))

    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    override fun logging(logging: CfnCluster.LoggingProperty) {
      cdkBuilder.logging(logging.let(CfnCluster.LoggingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d2bc3a155e2872611187d178db5a583b733421bee14c3b75b30c8281010491e")
    override fun logging(logging: CfnCluster.LoggingProperty.Builder.() -> Unit): Unit =
        logging(CfnCluster.LoggingProperty(logging))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outpostConfig(outpostConfig: IResolvable) {
      cdkBuilder.outpostConfig(outpostConfig.let(IResolvable::unwrap))
    }

    override fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty) {
      cdkBuilder.outpostConfig(outpostConfig.let(CfnCluster.OutpostConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f1d69dea2f2c473564e7ee22b1f197e68618b93fee6df6d35b64ea8684fcb51")
    override fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty.Builder.() -> Unit):
        Unit = outpostConfig(CfnCluster.OutpostConfigProperty(outpostConfig))

    override fun resourcesVpcConfig(resourcesVpcConfig: IResolvable) {
      cdkBuilder.resourcesVpcConfig(resourcesVpcConfig.let(IResolvable::unwrap))
    }

    override fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty) {
      cdkBuilder.resourcesVpcConfig(resourcesVpcConfig.let(CfnCluster.ResourcesVpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d542b7186da75779ed8fbe27de97ba53ed1a4b34a4898e25900b66bf7bbe406")
    override
        fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty.Builder.() -> Unit):
        Unit = resourcesVpcConfig(CfnCluster.ResourcesVpcConfigProperty(resourcesVpcConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    override fun accessConfig(): Any? = unwrap(this).getAccessConfig()

    override fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

    override fun kubernetesNetworkConfig(): Any? = unwrap(this).getKubernetesNetworkConfig()

    override fun logging(): Any? = unwrap(this).getLogging()

    override fun name(): String? = unwrap(this).getName()

    override fun outpostConfig(): Any? = unwrap(this).getOutpostConfig()

    override fun resourcesVpcConfig(): Any = unwrap(this).getResourcesVpcConfig()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnClusterProps):
        CfnClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.eks.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.CfnClusterProps
  }
}
