package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServerlessCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.msk.CfnServerlessCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun clientAuthentication(): Any = unwrap(this).getClientAuthentication()

  public open fun clientAuthentication(`value`: IResolvable) {
    unwrap(this).setClientAuthentication(`value`.let(IResolvable::unwrap))
  }

  public open fun clientAuthentication(`value`: ClientAuthenticationProperty) {
    unwrap(this).setClientAuthentication(`value`.let(ClientAuthenticationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47b2aa882f21c3a05e9b8572d0c2f8f4cea7f6ad92fe0d760e88271c5a191540")
  public open fun clientAuthentication(`value`: ClientAuthenticationProperty.Builder.() -> Unit):
      Unit = clientAuthentication(ClientAuthenticationProperty(`value`))

  public open fun clusterName(): String = unwrap(this).getClusterName()

  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun vpcConfigs(): Any = unwrap(this).getVpcConfigs()

  public open fun vpcConfigs(`value`: IResolvable) {
    unwrap(this).setVpcConfigs(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfigs(__idx_ac66f0: List<Any>) {
    unwrap(this).setVpcConfigs(__idx_ac66f0)
  }

  public interface Builder {
    public fun clientAuthentication(clientAuthentication: IResolvable)

    public fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc6ddd365d03cf7342a5451145f746ae7a22b32387a6f891094210535c9d63b7")
    public
        fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty.Builder.() -> Unit)

    public fun clusterName(clusterName: String)

    public fun tags(tags: Map<String, String>)

    public fun vpcConfigs(vpcConfigs: IResolvable)

    public fun vpcConfigs(vpcConfigs: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnServerlessCluster.Builder =
        software.amazon.awscdk.services.msk.CfnServerlessCluster.Builder.create(scope, id)

    override fun clientAuthentication(clientAuthentication: IResolvable) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(IResolvable::unwrap))
    }

    override fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty) {
      cdkBuilder.clientAuthentication(clientAuthentication.let(ClientAuthenticationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc6ddd365d03cf7342a5451145f746ae7a22b32387a6f891094210535c9d63b7")
    override
        fun clientAuthentication(clientAuthentication: ClientAuthenticationProperty.Builder.() -> Unit):
        Unit = clientAuthentication(ClientAuthenticationProperty(clientAuthentication))

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun vpcConfigs(vpcConfigs: IResolvable) {
      cdkBuilder.vpcConfigs(vpcConfigs.let(IResolvable::unwrap))
    }

    override fun vpcConfigs(vpcConfigs: List<Any>) {
      cdkBuilder.vpcConfigs(vpcConfigs)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnServerlessCluster =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServerlessCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServerlessCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnServerlessCluster):
        CfnServerlessCluster = CfnServerlessCluster(cdkObject)

    internal fun unwrap(wrapped: CfnServerlessCluster):
        software.amazon.awscdk.services.msk.CfnServerlessCluster = wrapped.cdkObject
  }

  public interface VpcConfigProperty {
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun subnetIds(): List<String>

    public interface Builder {
      public fun securityGroups(securityGroups: List<String>)

      public fun subnetIds(subnetIds: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnServerlessCluster.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.msk.CfnServerlessCluster.VpcConfigProperty.builder()

      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnServerlessCluster.VpcConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnServerlessCluster.VpcConfigProperty,
    ) : VpcConfigProperty {
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnServerlessCluster.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.msk.CfnServerlessCluster.VpcConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SaslProperty {
    public fun iam(): Any

    public interface Builder {
      public fun iam(iam: IResolvable)

      public fun iam(iam: IamProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c34c9bf0119fd310be992cabba59f51a54b78c65b04929f9828e945991a85a1f")
      public fun iam(iam: IamProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnServerlessCluster.SaslProperty.Builder =
          software.amazon.awscdk.services.msk.CfnServerlessCluster.SaslProperty.builder()

      override fun iam(iam: IResolvable) {
        cdkBuilder.iam(iam.let(IResolvable::unwrap))
      }

      override fun iam(iam: IamProperty) {
        cdkBuilder.iam(iam.let(IamProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c34c9bf0119fd310be992cabba59f51a54b78c65b04929f9828e945991a85a1f")
      override fun iam(iam: IamProperty.Builder.() -> Unit): Unit = iam(IamProperty(iam))

      public fun build(): software.amazon.awscdk.services.msk.CfnServerlessCluster.SaslProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnServerlessCluster.SaslProperty,
    ) : SaslProperty {
      override fun iam(): Any = unwrap(this).getIam()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SaslProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnServerlessCluster.SaslProperty):
          SaslProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SaslProperty):
          software.amazon.awscdk.services.msk.CfnServerlessCluster.SaslProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IamProperty {
    public fun enabled(): Any

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnServerlessCluster.IamProperty.Builder =
          software.amazon.awscdk.services.msk.CfnServerlessCluster.IamProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnServerlessCluster.IamProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.msk.CfnServerlessCluster.IamProperty,
    ) : IamProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IamProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnServerlessCluster.IamProperty):
          IamProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamProperty):
          software.amazon.awscdk.services.msk.CfnServerlessCluster.IamProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ClientAuthenticationProperty {
    public fun sasl(): Any

    public interface Builder {
      public fun sasl(sasl: IResolvable)

      public fun sasl(sasl: SaslProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25f43126068a4cef9e1fa0c00143bd78f445f833d035b8763d66db2835fd7a87")
      public fun sasl(sasl: SaslProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnServerlessCluster.ClientAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.msk.CfnServerlessCluster.ClientAuthenticationProperty.builder()

      override fun sasl(sasl: IResolvable) {
        cdkBuilder.sasl(sasl.let(IResolvable::unwrap))
      }

      override fun sasl(sasl: SaslProperty) {
        cdkBuilder.sasl(sasl.let(SaslProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25f43126068a4cef9e1fa0c00143bd78f445f833d035b8763d66db2835fd7a87")
      override fun sasl(sasl: SaslProperty.Builder.() -> Unit): Unit = sasl(SaslProperty(sasl))

      public fun build():
          software.amazon.awscdk.services.msk.CfnServerlessCluster.ClientAuthenticationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnServerlessCluster.ClientAuthenticationProperty,
    ) : ClientAuthenticationProperty {
      override fun sasl(): Any = unwrap(this).getSasl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClientAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnServerlessCluster.ClientAuthenticationProperty):
          ClientAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientAuthenticationProperty):
          software.amazon.awscdk.services.msk.CfnServerlessCluster.ClientAuthenticationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
