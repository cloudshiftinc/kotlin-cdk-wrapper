@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cassandra

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnKeyspace internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspace,
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun keyspaceName(keyspaceName: String)

    public fun replicationSpecification(replicationSpecification: IResolvable)

    public fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76f12a1a314629c5ff4d1adb2520615cc22de7ac912ee07a76a8a78bcdb405d0")
    public
        fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnKeyspace.Builder =
        software.amazon.awscdk.services.cassandra.CfnKeyspace.Builder.create(scope, id)

    override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    override fun replicationSpecification(replicationSpecification: IResolvable) {
      cdkBuilder.replicationSpecification(replicationSpecification.let(IResolvable::unwrap))
    }

    override
        fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty) {
      cdkBuilder.replicationSpecification(replicationSpecification.let(ReplicationSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76f12a1a314629c5ff4d1adb2520615cc22de7ac912ee07a76a8a78bcdb405d0")
    override
        fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty.Builder.() -> Unit):
        Unit = replicationSpecification(ReplicationSpecificationProperty(replicationSpecification))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cassandra.CfnKeyspace = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cassandra.CfnKeyspace.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun regionList(regionList: List<String>)

      public fun regionList(vararg regionList: String)

      public fun replicationStrategy(replicationStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty.builder()

      override fun regionList(regionList: List<String>) {
        cdkBuilder.regionList(regionList)
      }

      override fun regionList(vararg regionList: String): Unit = regionList(regionList.toList())

      override fun replicationStrategy(replicationStrategy: String) {
        cdkBuilder.replicationStrategy(replicationStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty,
    ) : CdkObject(cdkObject), ReplicationSpecificationProperty {
      override fun regionList(): List<String> = unwrap(this).getRegionList() ?: emptyList()

      override fun replicationStrategy(): String? = unwrap(this).getReplicationStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty):
          ReplicationSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationSpecificationProperty):
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty
    }
  }
}