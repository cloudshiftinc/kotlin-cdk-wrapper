@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPrefixList internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnPrefixList,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun addressFamily(): String = unwrap(this).getAddressFamily()

  public open fun addressFamily(`value`: String) {
    unwrap(this).setAddressFamily(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  public open fun attrPrefixListId(): String = unwrap(this).getAttrPrefixListId()

  public open fun attrVersion(): Number = unwrap(this).getAttrVersion()

  public open fun entries(): Any? = unwrap(this).getEntries()

  public open fun entries(`value`: IResolvable) {
    unwrap(this).setEntries(`value`.let(IResolvable::unwrap))
  }

  public open fun entries(__idx_ac66f0: List<Any>) {
    unwrap(this).setEntries(__idx_ac66f0)
  }

  public open fun entries(vararg __idx_ac66f0: Any): Unit = entries(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxEntries(): Number? = unwrap(this).getMaxEntries()

  public open fun maxEntries(`value`: Number) {
    unwrap(this).setMaxEntries(`value`)
  }

  public open fun prefixListName(): String = unwrap(this).getPrefixListName()

  public open fun prefixListName(`value`: String) {
    unwrap(this).setPrefixListName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun addressFamily(addressFamily: String)

    public fun entries(entries: IResolvable)

    public fun entries(entries: List<Any>)

    public fun entries(vararg entries: Any)

    public fun maxEntries(maxEntries: Number)

    public fun prefixListName(prefixListName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnPrefixList.Builder =
        software.amazon.awscdk.services.ec2.CfnPrefixList.Builder.create(scope, id)

    override fun addressFamily(addressFamily: String) {
      cdkBuilder.addressFamily(addressFamily)
    }

    override fun entries(entries: IResolvable) {
      cdkBuilder.entries(entries.let(IResolvable::unwrap))
    }

    override fun entries(entries: List<Any>) {
      cdkBuilder.entries(entries)
    }

    override fun entries(vararg entries: Any): Unit = entries(entries.toList())

    override fun maxEntries(maxEntries: Number) {
      cdkBuilder.maxEntries(maxEntries)
    }

    override fun prefixListName(prefixListName: String) {
      cdkBuilder.prefixListName(prefixListName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnPrefixList = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnPrefixList.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrefixList {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrefixList(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnPrefixList): CfnPrefixList =
        CfnPrefixList(cdkObject)

    internal fun unwrap(wrapped: CfnPrefixList): software.amazon.awscdk.services.ec2.CfnPrefixList =
        wrapped.cdkObject
  }

  public interface EntryProperty {
    public fun cidr(): String

    public fun description(): String? = unwrap(this).getDescription()

    @CdkDslMarker
    public interface Builder {
      public fun cidr(cidr: String)

      public fun description(description: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty.builder()

      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty,
    ) : CdkObject(cdkObject), EntryProperty {
      override fun cidr(): String = unwrap(this).getCidr()

      override fun description(): String? = unwrap(this).getDescription()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty):
          EntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntryProperty):
          software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty
    }
  }
}
