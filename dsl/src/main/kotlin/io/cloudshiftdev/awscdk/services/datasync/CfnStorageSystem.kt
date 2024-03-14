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

public open class CfnStorageSystem internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystem,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun agentArns(): List<String> = unwrap(this).getAgentArns() ?: emptyList()

  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  public open fun attrConnectivityStatus(): String = unwrap(this).getAttrConnectivityStatus()

  public open fun attrSecretsManagerArn(): String = unwrap(this).getAttrSecretsManagerArn()

  public open fun attrStorageSystemArn(): String = unwrap(this).getAttrStorageSystemArn()

  public open fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

  public open fun cloudWatchLogGroupArn(`value`: String) {
    unwrap(this).setCloudWatchLogGroupArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun serverConfiguration(): Any = unwrap(this).getServerConfiguration()

  public open fun serverConfiguration(`value`: IResolvable) {
    unwrap(this).setServerConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun serverConfiguration(`value`: ServerConfigurationProperty) {
    unwrap(this).setServerConfiguration(`value`.let(ServerConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5466e14becae674a0dce47d6eaab619951c00abe5ed3ec13560e946dd5e73587")
  public open fun serverConfiguration(`value`: ServerConfigurationProperty.Builder.() -> Unit): Unit
      = serverConfiguration(ServerConfigurationProperty(`value`))

  public open fun serverCredentials(): Any? = unwrap(this).getServerCredentials()

  public open fun serverCredentials(`value`: IResolvable) {
    unwrap(this).setServerCredentials(`value`.let(IResolvable::unwrap))
  }

  public open fun serverCredentials(`value`: ServerCredentialsProperty) {
    unwrap(this).setServerCredentials(`value`.let(ServerCredentialsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d5cd0b69c441200604cd8f75bec38bc529d02d3b2c00432210a81ac3da6578f7")
  public open fun serverCredentials(`value`: ServerCredentialsProperty.Builder.() -> Unit): Unit =
      serverCredentials(ServerCredentialsProperty(`value`))

  public open fun systemType(): String = unwrap(this).getSystemType()

  public open fun systemType(`value`: String) {
    unwrap(this).setSystemType(`value`)
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

    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
    }

    public fun name(name: String) {
    }

    public fun serverConfiguration(serverConfiguration: IResolvable) {
    }

    public fun serverConfiguration(serverConfiguration: ServerConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d63fea3a02de023e3ab99ac7b14d437a015acfd8a3eeeb131cc96ae57fd8fe82")
    public
        fun serverConfiguration(serverConfiguration: ServerConfigurationProperty.Builder.() -> Unit) {
    }

    public fun serverCredentials(serverCredentials: IResolvable) {
    }

    public fun serverCredentials(serverCredentials: ServerCredentialsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ebba701bf8b661b60c10a0d2748b0e9d4fa67046ab26a76b24e3736ca96bb96")
    public fun serverCredentials(serverCredentials: ServerCredentialsProperty.Builder.() -> Unit) {
    }

    public fun systemType(systemType: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnStorageSystem.Builder =
        software.amazon.awscdk.services.datasync.CfnStorageSystem.Builder.create(scope, id)

    public override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    public override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
      cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun serverConfiguration(serverConfiguration: IResolvable) {
      cdkBuilder.serverConfiguration(serverConfiguration.let(IResolvable::unwrap))
    }

    public override fun serverConfiguration(serverConfiguration: ServerConfigurationProperty) {
      cdkBuilder.serverConfiguration(serverConfiguration.let(ServerConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d63fea3a02de023e3ab99ac7b14d437a015acfd8a3eeeb131cc96ae57fd8fe82")
    public override
        fun serverConfiguration(serverConfiguration: ServerConfigurationProperty.Builder.() -> Unit):
        Unit = serverConfiguration(ServerConfigurationProperty(serverConfiguration))

    public override fun serverCredentials(serverCredentials: IResolvable) {
      cdkBuilder.serverCredentials(serverCredentials.let(IResolvable::unwrap))
    }

    public override fun serverCredentials(serverCredentials: ServerCredentialsProperty) {
      cdkBuilder.serverCredentials(serverCredentials.let(ServerCredentialsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ebba701bf8b661b60c10a0d2748b0e9d4fa67046ab26a76b24e3736ca96bb96")
    public override
        fun serverCredentials(serverCredentials: ServerCredentialsProperty.Builder.() -> Unit): Unit
        = serverCredentials(ServerCredentialsProperty(serverCredentials))

    public override fun systemType(systemType: String) {
      cdkBuilder.systemType(systemType)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnStorageSystem =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStorageSystem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStorageSystem(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystem):
        CfnStorageSystem = CfnStorageSystem(cdkObject)

    internal fun unwrap(wrapped: CfnStorageSystem):
        software.amazon.awscdk.services.datasync.CfnStorageSystem = wrapped.cdkObject
  }

  public interface ServerCredentialsProperty {
    public fun password(): String

    public fun username(): String

    public interface Builder {
      public fun password(password: String) {
      }

      public fun username(username: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty.builder()

      public override fun password(password: String) {
        cdkBuilder.password(password)
      }

      public override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty,
    ) : ServerCredentialsProperty {
      public override fun password(): String = unwrap(this).getPassword()

      public override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServerCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty):
          ServerCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCredentialsProperty):
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServerConfigurationProperty {
    public fun serverHostname(): String

    public fun serverPort(): Number? = unwrap(this).getServerPort()

    public interface Builder {
      public fun serverHostname(serverHostname: String) {
      }

      public fun serverPort(serverPort: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty.builder()

      public override fun serverHostname(serverHostname: String) {
        cdkBuilder.serverHostname(serverHostname)
      }

      public override fun serverPort(serverPort: Number) {
        cdkBuilder.serverPort(serverPort)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty,
    ) : ServerConfigurationProperty {
      public override fun serverHostname(): String = unwrap(this).getServerHostname()

      public override fun serverPort(): Number? = unwrap(this).getServerPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty):
          ServerConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerConfigurationProperty):
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
