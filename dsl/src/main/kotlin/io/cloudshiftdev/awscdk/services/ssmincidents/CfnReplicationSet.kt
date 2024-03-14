package io.cloudshiftdev.awscdk.services.ssmincidents

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

public open class CfnReplicationSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun deletionProtected(): Any? = unwrap(this).getDeletionProtected()

  public open fun deletionProtected(`value`: Boolean) {
    unwrap(this).setDeletionProtected(`value`)
  }

  public open fun deletionProtected(`value`: IResolvable) {
    unwrap(this).setDeletionProtected(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun regions(): Any = unwrap(this).getRegions()

  public open fun regions(`value`: IResolvable) {
    unwrap(this).setRegions(`value`.let(IResolvable::unwrap))
  }

  public open fun regions(__idx_ac66f0: List<Any>) {
    unwrap(this).setRegions(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun deletionProtected(deletionProtected: Boolean) {
    }

    public fun deletionProtected(deletionProtected: IResolvable) {
    }

    public fun regions(regions: IResolvable) {
    }

    public fun regions(regions: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.Builder =
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.Builder.create(scope, id)

    public override fun deletionProtected(deletionProtected: Boolean) {
      cdkBuilder.deletionProtected(deletionProtected)
    }

    public override fun deletionProtected(deletionProtected: IResolvable) {
      cdkBuilder.deletionProtected(deletionProtected.let(IResolvable::unwrap))
    }

    public override fun regions(regions: IResolvable) {
      cdkBuilder.regions(regions.let(IResolvable::unwrap))
    }

    public override fun regions(regions: List<Any>) {
      cdkBuilder.regions(regions)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssmincidents.CfnReplicationSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSet):
        CfnReplicationSet = CfnReplicationSet(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationSet):
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSet = wrapped.cdkObject
  }

  public interface RegionConfigurationProperty {
    public fun sseKmsKeyId(): String

    public interface Builder {
      public fun sseKmsKeyId(sseKmsKeyId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty.builder()

      public override fun sseKmsKeyId(sseKmsKeyId: String) {
        cdkBuilder.sseKmsKeyId(sseKmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty,
    ) : RegionConfigurationProperty {
      public override fun sseKmsKeyId(): String = unwrap(this).getSseKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RegionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty):
          RegionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegionConfigurationProperty):
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReplicationRegionProperty {
    public fun regionConfiguration(): Any? = unwrap(this).getRegionConfiguration()

    public fun regionName(): String? = unwrap(this).getRegionName()

    public interface Builder {
      public fun regionConfiguration(regionConfiguration: IResolvable) {
      }

      public fun regionConfiguration(regionConfiguration: RegionConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f73e959c6950a8afb5ef01a749a688d89fcd4b3088e8851c81c560a2121efd")
      public
          fun regionConfiguration(regionConfiguration: RegionConfigurationProperty.Builder.() -> Unit) {
      }

      public fun regionName(regionName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty.builder()

      public override fun regionConfiguration(regionConfiguration: IResolvable) {
        cdkBuilder.regionConfiguration(regionConfiguration.let(IResolvable::unwrap))
      }

      public override fun regionConfiguration(regionConfiguration: RegionConfigurationProperty) {
        cdkBuilder.regionConfiguration(regionConfiguration.let(RegionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f73e959c6950a8afb5ef01a749a688d89fcd4b3088e8851c81c560a2121efd")
      public override
          fun regionConfiguration(regionConfiguration: RegionConfigurationProperty.Builder.() -> Unit):
          Unit = regionConfiguration(RegionConfigurationProperty(regionConfiguration))

      public override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty,
    ) : ReplicationRegionProperty {
      public override fun regionConfiguration(): Any? = unwrap(this).getRegionConfiguration()

      public override fun regionName(): String? = unwrap(this).getRegionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationRegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty):
          ReplicationRegionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationRegionProperty):
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
