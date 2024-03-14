package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPAMResourceDiscovery internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrIpamResourceDiscoveryArn(): String =
      unwrap(this).getAttrIpamResourceDiscoveryArn()

  public open fun attrIpamResourceDiscoveryId(): String =
      unwrap(this).getAttrIpamResourceDiscoveryId()

  public open fun attrIpamResourceDiscoveryRegion(): String =
      unwrap(this).getAttrIpamResourceDiscoveryRegion()

  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun operatingRegions(): Any? = unwrap(this).getOperatingRegions()

  public open fun operatingRegions(`value`: IResolvable) {
    unwrap(this).setOperatingRegions(`value`.let(IResolvable::unwrap))
  }

  public open fun operatingRegions(__idx_ac66f0: List<Any>) {
    unwrap(this).setOperatingRegions(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun operatingRegions(operatingRegions: IResolvable)

    public fun operatingRegions(operatingRegions: List<Any>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun operatingRegions(operatingRegions: IResolvable) {
      cdkBuilder.operatingRegions(operatingRegions.let(IResolvable::unwrap))
    }

    override fun operatingRegions(operatingRegions: List<Any>) {
      cdkBuilder.operatingRegions(operatingRegions)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMResourceDiscovery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMResourceDiscovery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery):
        CfnIPAMResourceDiscovery = CfnIPAMResourceDiscovery(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMResourceDiscovery):
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery = wrapped.cdkObject
  }

  public interface IpamOperatingRegionProperty {
    public fun regionName(): String

    public interface Builder {
      public fun regionName(regionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty.builder()

      override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty,
    ) : IpamOperatingRegionProperty {
      override fun regionName(): String = unwrap(this).getRegionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IpamOperatingRegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty):
          IpamOperatingRegionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpamOperatingRegionProperty):
          software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
