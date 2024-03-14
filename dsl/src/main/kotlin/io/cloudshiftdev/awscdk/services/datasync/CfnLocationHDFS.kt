package io.cloudshiftdev.awscdk.services.datasync

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

public open class CfnLocationHDFS internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFS,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun agentArns(): List<String> = unwrap(this).getAgentArns() ?: emptyList()

  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  public open fun authenticationType(): String = unwrap(this).getAuthenticationType()

  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  public open fun blockSize(): Number? = unwrap(this).getBlockSize()

  public open fun blockSize(`value`: Number) {
    unwrap(this).setBlockSize(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kerberosKeytab(): String? = unwrap(this).getKerberosKeytab()

  public open fun kerberosKeytab(`value`: String) {
    unwrap(this).setKerberosKeytab(`value`)
  }

  public open fun kerberosKrb5Conf(): String? = unwrap(this).getKerberosKrb5Conf()

  public open fun kerberosKrb5Conf(`value`: String) {
    unwrap(this).setKerberosKrb5Conf(`value`)
  }

  public open fun kerberosPrincipal(): String? = unwrap(this).getKerberosPrincipal()

  public open fun kerberosPrincipal(`value`: String) {
    unwrap(this).setKerberosPrincipal(`value`)
  }

  public open fun kmsKeyProviderUri(): String? = unwrap(this).getKmsKeyProviderUri()

  public open fun kmsKeyProviderUri(`value`: String) {
    unwrap(this).setKmsKeyProviderUri(`value`)
  }

  public open fun nameNodes(): Any = unwrap(this).getNameNodes()

  public open fun nameNodes(`value`: IResolvable) {
    unwrap(this).setNameNodes(`value`.let(IResolvable::unwrap))
  }

  public open fun nameNodes(__idx_ac66f0: List<Any>) {
    unwrap(this).setNameNodes(__idx_ac66f0)
  }

  public open fun qopConfiguration(): Any? = unwrap(this).getQopConfiguration()

  public open fun qopConfiguration(`value`: IResolvable) {
    unwrap(this).setQopConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun qopConfiguration(`value`: QopConfigurationProperty) {
    unwrap(this).setQopConfiguration(`value`.let(QopConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c4af28be0b35921c15869c96bbf02dace6134aee33a0d5e21246a0d368ddbf2")
  public open fun qopConfiguration(`value`: QopConfigurationProperty.Builder.() -> Unit): Unit =
      qopConfiguration(QopConfigurationProperty(`value`))

  public open fun replicationFactor(): Number? = unwrap(this).getReplicationFactor()

  public open fun replicationFactor(`value`: Number) {
    unwrap(this).setReplicationFactor(`value`)
  }

  public open fun simpleUser(): String? = unwrap(this).getSimpleUser()

  public open fun simpleUser(`value`: String) {
    unwrap(this).setSimpleUser(`value`)
  }

  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun agentArns(agentArns: List<String>) {
    }

    public fun authenticationType(authenticationType: String) {
    }

    public fun blockSize(blockSize: Number) {
    }

    public fun kerberosKeytab(kerberosKeytab: String) {
    }

    public fun kerberosKrb5Conf(kerberosKrb5Conf: String) {
    }

    public fun kerberosPrincipal(kerberosPrincipal: String) {
    }

    public fun kmsKeyProviderUri(kmsKeyProviderUri: String) {
    }

    public fun nameNodes(nameNodes: IResolvable) {
    }

    public fun nameNodes(nameNodes: List<Any>) {
    }

    public fun qopConfiguration(qopConfiguration: IResolvable) {
    }

    public fun qopConfiguration(qopConfiguration: QopConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ee2c26ee4fdb27c4be1388e24b497fbc88bb6e95670effebd757ecad371deee")
    public fun qopConfiguration(qopConfiguration: QopConfigurationProperty.Builder.() -> Unit) {
    }

    public fun replicationFactor(replicationFactor: Number) {
    }

    public fun simpleUser(simpleUser: String) {
    }

    public fun subdirectory(subdirectory: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationHDFS.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationHDFS.Builder.create(scope, id)

    public override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    public override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    public override fun blockSize(blockSize: Number) {
      cdkBuilder.blockSize(blockSize)
    }

    public override fun kerberosKeytab(kerberosKeytab: String) {
      cdkBuilder.kerberosKeytab(kerberosKeytab)
    }

    public override fun kerberosKrb5Conf(kerberosKrb5Conf: String) {
      cdkBuilder.kerberosKrb5Conf(kerberosKrb5Conf)
    }

    public override fun kerberosPrincipal(kerberosPrincipal: String) {
      cdkBuilder.kerberosPrincipal(kerberosPrincipal)
    }

    public override fun kmsKeyProviderUri(kmsKeyProviderUri: String) {
      cdkBuilder.kmsKeyProviderUri(kmsKeyProviderUri)
    }

    public override fun nameNodes(nameNodes: IResolvable) {
      cdkBuilder.nameNodes(nameNodes.let(IResolvable::unwrap))
    }

    public override fun nameNodes(nameNodes: List<Any>) {
      cdkBuilder.nameNodes(nameNodes)
    }

    public override fun qopConfiguration(qopConfiguration: IResolvable) {
      cdkBuilder.qopConfiguration(qopConfiguration.let(IResolvable::unwrap))
    }

    public override fun qopConfiguration(qopConfiguration: QopConfigurationProperty) {
      cdkBuilder.qopConfiguration(qopConfiguration.let(QopConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ee2c26ee4fdb27c4be1388e24b497fbc88bb6e95670effebd757ecad371deee")
    public override
        fun qopConfiguration(qopConfiguration: QopConfigurationProperty.Builder.() -> Unit): Unit =
        qopConfiguration(QopConfigurationProperty(qopConfiguration))

    public override fun replicationFactor(replicationFactor: Number) {
      cdkBuilder.replicationFactor(replicationFactor)
    }

    public override fun simpleUser(simpleUser: String) {
      cdkBuilder.simpleUser(simpleUser)
    }

    public override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationHDFS =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationHDFS {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationHDFS(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFS):
        CfnLocationHDFS = CfnLocationHDFS(cdkObject)

    internal fun unwrap(wrapped: CfnLocationHDFS):
        software.amazon.awscdk.services.datasync.CfnLocationHDFS = wrapped.cdkObject
  }

  public interface NameNodeProperty {
    public fun hostname(): String

    public fun port(): Number

    public interface Builder {
      public fun hostname(hostname: String) {
      }

      public fun port(port: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty.builder()

      public override fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty,
    ) : NameNodeProperty {
      public override fun hostname(): String = unwrap(this).getHostname()

      public override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NameNodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty):
          NameNodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NameNodeProperty):
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface QopConfigurationProperty {
    public fun dataTransferProtection(): String? = unwrap(this).getDataTransferProtection()

    public fun rpcProtection(): String? = unwrap(this).getRpcProtection()

    public interface Builder {
      public fun dataTransferProtection(dataTransferProtection: String) {
      }

      public fun rpcProtection(rpcProtection: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty.builder()

      public override fun dataTransferProtection(dataTransferProtection: String) {
        cdkBuilder.dataTransferProtection(dataTransferProtection)
      }

      public override fun rpcProtection(rpcProtection: String) {
        cdkBuilder.rpcProtection(rpcProtection)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty,
    ) : QopConfigurationProperty {
      public override fun dataTransferProtection(): String? =
          unwrap(this).getDataTransferProtection()

      public override fun rpcProtection(): String? = unwrap(this).getRpcProtection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QopConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty):
          QopConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QopConfigurationProperty):
          software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
