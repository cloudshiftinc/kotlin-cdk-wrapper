package io.cloudshiftdev.awscdk.services.emrcontainers

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVirtualCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun containerProvider(): Any = unwrap(this).getContainerProvider()

  public open fun containerProvider(`value`: IResolvable) {
    unwrap(this).setContainerProvider(`value`.let(IResolvable::unwrap))
  }

  public open fun containerProvider(`value`: ContainerProviderProperty) {
    unwrap(this).setContainerProvider(`value`.let(ContainerProviderProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d7de37ba8106c92bf70a36ab4cb8cd2fff708708ebe76bfc00e75d3cfb7d83e3")
  public open fun containerProvider(`value`: ContainerProviderProperty.Builder.() -> Unit): Unit =
      containerProvider(ContainerProviderProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun containerProvider(containerProvider: IResolvable)

    public fun containerProvider(containerProvider: ContainerProviderProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e89df576ee0d06994e7056ae49e61090d8197040e42065ef0f40f4e78a3d4cd")
    public fun containerProvider(containerProvider: ContainerProviderProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.Builder
        = software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.Builder.create(scope, id)

    override fun containerProvider(containerProvider: IResolvable) {
      cdkBuilder.containerProvider(containerProvider.let(IResolvable::unwrap))
    }

    override fun containerProvider(containerProvider: ContainerProviderProperty) {
      cdkBuilder.containerProvider(containerProvider.let(ContainerProviderProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e89df576ee0d06994e7056ae49e61090d8197040e42065ef0f40f4e78a3d4cd")
    override fun containerProvider(containerProvider: ContainerProviderProperty.Builder.() -> Unit):
        Unit = containerProvider(ContainerProviderProperty(containerProvider))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVirtualCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVirtualCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster):
        CfnVirtualCluster = CfnVirtualCluster(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualCluster):
        software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster = wrapped.cdkObject
  }

  public interface EksInfoProperty {
    public fun namespace(): String

    public interface Builder {
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty.Builder =
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty.builder()

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty,
    ) : EksInfoProperty {
      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EksInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty):
          EksInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksInfoProperty):
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ContainerProviderProperty {
    public fun id(): String

    public fun info(): Any

    public fun type(): String

    public interface Builder {
      public fun id(id: String)

      public fun info(info: IResolvable)

      public fun info(info: ContainerInfoProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa976c868c8531fc2f2117b620b1cb75fb826367a1a24556c5720ed57e4fceb")
      public fun info(info: ContainerInfoProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty.Builder
          =
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun info(info: IResolvable) {
        cdkBuilder.info(info.let(IResolvable::unwrap))
      }

      override fun info(info: ContainerInfoProperty) {
        cdkBuilder.info(info.let(ContainerInfoProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa976c868c8531fc2f2117b620b1cb75fb826367a1a24556c5720ed57e4fceb")
      override fun info(info: ContainerInfoProperty.Builder.() -> Unit): Unit =
          info(ContainerInfoProperty(info))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty,
    ) : ContainerProviderProperty {
      override fun id(): String = unwrap(this).getId()

      override fun info(): Any = unwrap(this).getInfo()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty):
          ContainerProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerProviderProperty):
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ContainerInfoProperty {
    public fun eksInfo(): Any

    public interface Builder {
      public fun eksInfo(eksInfo: IResolvable)

      public fun eksInfo(eksInfo: EksInfoProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6ff6de1923c0ff91cb430fdd5391a7aa62c04bdbe1f675b3d5693174d18029c")
      public fun eksInfo(eksInfo: EksInfoProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty.Builder
          =
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty.builder()

      override fun eksInfo(eksInfo: IResolvable) {
        cdkBuilder.eksInfo(eksInfo.let(IResolvable::unwrap))
      }

      override fun eksInfo(eksInfo: EksInfoProperty) {
        cdkBuilder.eksInfo(eksInfo.let(EksInfoProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6ff6de1923c0ff91cb430fdd5391a7aa62c04bdbe1f675b3d5693174d18029c")
      override fun eksInfo(eksInfo: EksInfoProperty.Builder.() -> Unit): Unit =
          eksInfo(EksInfoProperty(eksInfo))

      public fun build():
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty,
    ) : ContainerInfoProperty {
      override fun eksInfo(): Any = unwrap(this).getEksInfo()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty):
          ContainerInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerInfoProperty):
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
