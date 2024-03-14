package io.cloudshiftdev.awscdk.services.cassandra

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

public open class CfnKeyspace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keyspaceName(): String? = unwrap(this).getKeyspaceName()

  public open fun keyspaceName(`value`: String) {
    unwrap(this).setKeyspaceName(`value`)
  }

  public open fun replicationSpecification(): Any? = unwrap(this).getReplicationSpecification()

  public open fun replicationSpecification(`value`: IResolvable) {
    unwrap(this).setReplicationSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun replicationSpecification(`value`: ReplicationSpecificationProperty) {
    unwrap(this).setReplicationSpecification(`value`.let(ReplicationSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4b1bede2435f41adef41613f37e680c8a1837f23db1cf0a2ca1b71069e15f308")
  public open
      fun replicationSpecification(`value`: ReplicationSpecificationProperty.Builder.() -> Unit):
      Unit = replicationSpecification(ReplicationSpecificationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun keyspaceName(keyspaceName: String) {
    }

    public fun replicationSpecification(replicationSpecification: IResolvable) {
    }

    public
        fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76f12a1a314629c5ff4d1adb2520615cc22de7ac912ee07a76a8a78bcdb405d0")
    public
        fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnKeyspace.Builder =
        software.amazon.awscdk.services.cassandra.CfnKeyspace.Builder.create(scope, id)

    public override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    public override fun replicationSpecification(replicationSpecification: IResolvable) {
      cdkBuilder.replicationSpecification(replicationSpecification.let(IResolvable::unwrap))
    }

    public override
        fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty) {
      cdkBuilder.replicationSpecification(replicationSpecification.let(ReplicationSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76f12a1a314629c5ff4d1adb2520615cc22de7ac912ee07a76a8a78bcdb405d0")
    public override
        fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty.Builder.() -> Unit):
        Unit = replicationSpecification(ReplicationSpecificationProperty(replicationSpecification))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cassandra.CfnKeyspace = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKeyspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKeyspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspace): CfnKeyspace
        = CfnKeyspace(cdkObject)

    internal fun unwrap(wrapped: CfnKeyspace): software.amazon.awscdk.services.cassandra.CfnKeyspace
        = wrapped.cdkObject
  }

  public interface ReplicationSpecificationProperty {
    public fun regionList(): List<String> = unwrap(this).getRegionList() ?: emptyList()

    public fun replicationStrategy(): String? = unwrap(this).getReplicationStrategy()

    public interface Builder {
      public fun regionList(regionList: List<String>) {
      }

      public fun replicationStrategy(replicationStrategy: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty.builder()

      public override fun regionList(regionList: List<String>) {
        cdkBuilder.regionList(regionList)
      }

      public override fun replicationStrategy(replicationStrategy: String) {
        cdkBuilder.replicationStrategy(replicationStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty,
    ) : ReplicationSpecificationProperty {
      public override fun regionList(): List<String> = unwrap(this).getRegionList() ?: emptyList()

      public override fun replicationStrategy(): String? = unwrap(this).getReplicationStrategy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty):
          ReplicationSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationSpecificationProperty):
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
