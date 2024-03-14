package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  /**
   * The IP address type.
   */
  public open fun addressFamily(): String = unwrap(this).getAddressFamily()

  /**
   * The IP address type.
   */
  public open fun addressFamily(`value`: String) {
    unwrap(this).setAddressFamily(`value`)
  }

  /**
   * The ARN of the prefix list.
   *
   * For example, `arn:aws:ec2:us-east-1:123456789012:prefix-list/pl-0123123123123abcd` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the owner of the prefix list.
   *
   * For example, `123456789012` .
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * The ID of the prefix list.
   *
   * For example, `pl-0123123123123abcd` .
   */
  public open fun attrPrefixListId(): String = unwrap(this).getAttrPrefixListId()

  /**
   * The version of the prefix list.
   *
   * For example, `1` .
   */
  public open fun attrVersion(): Number = unwrap(this).getAttrVersion()

  /**
   * One or more entries for the prefix list.
   */
  public open fun entries(): Any? = unwrap(this).getEntries()

  /**
   * One or more entries for the prefix list.
   */
  public open fun entries(`value`: IResolvable) {
    unwrap(this).setEntries(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more entries for the prefix list.
   */
  public open fun entries(__idx_ac66f0: List<Any>) {
    unwrap(this).setEntries(__idx_ac66f0)
  }

  /**
   * One or more entries for the prefix list.
   */
  public open fun entries(vararg __idx_ac66f0: Any): Unit = entries(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The maximum number of entries for the prefix list.
   */
  public open fun maxEntries(): Number? = unwrap(this).getMaxEntries()

  /**
   * The maximum number of entries for the prefix list.
   */
  public open fun maxEntries(`value`: Number) {
    unwrap(this).setMaxEntries(`value`)
  }

  /**
   * A name for the prefix list.
   */
  public open fun prefixListName(): String = unwrap(this).getPrefixListName()

  /**
   * A name for the prefix list.
   */
  public open fun prefixListName(`value`: String) {
    unwrap(this).setPrefixListName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the prefix list.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the prefix list.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the prefix list.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnPrefixList].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IP address type.
     *
     * Valid Values: `IPv4` | `IPv6`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-addressfamily)
     * @param addressFamily The IP address type. 
     */
    public fun addressFamily(addressFamily: String)

    /**
     * One or more entries for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
     * @param entries One or more entries for the prefix list. 
     */
    public fun entries(entries: IResolvable)

    /**
     * One or more entries for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
     * @param entries One or more entries for the prefix list. 
     */
    public fun entries(entries: List<Any>)

    /**
     * One or more entries for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
     * @param entries One or more entries for the prefix list. 
     */
    public fun entries(vararg entries: Any)

    /**
     * The maximum number of entries for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-maxentries)
     * @param maxEntries The maximum number of entries for the prefix list. 
     */
    public fun maxEntries(maxEntries: Number)

    /**
     * A name for the prefix list.
     *
     * Constraints: Up to 255 characters in length. The name cannot start with `com.amazonaws` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-prefixlistname)
     * @param prefixListName A name for the prefix list. 
     */
    public fun prefixListName(prefixListName: String)

    /**
     * The tags for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-tags)
     * @param tags The tags for the prefix list. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-tags)
     * @param tags The tags for the prefix list. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnPrefixList.Builder =
        software.amazon.awscdk.services.ec2.CfnPrefixList.Builder.create(scope, id)

    /**
     * The IP address type.
     *
     * Valid Values: `IPv4` | `IPv6`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-addressfamily)
     * @param addressFamily The IP address type. 
     */
    override fun addressFamily(addressFamily: String) {
      cdkBuilder.addressFamily(addressFamily)
    }

    /**
     * One or more entries for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
     * @param entries One or more entries for the prefix list. 
     */
    override fun entries(entries: IResolvable) {
      cdkBuilder.entries(entries.let(IResolvable::unwrap))
    }

    /**
     * One or more entries for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
     * @param entries One or more entries for the prefix list. 
     */
    override fun entries(entries: List<Any>) {
      cdkBuilder.entries(entries)
    }

    /**
     * One or more entries for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
     * @param entries One or more entries for the prefix list. 
     */
    override fun entries(vararg entries: Any): Unit = entries(entries.toList())

    /**
     * The maximum number of entries for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-maxentries)
     * @param maxEntries The maximum number of entries for the prefix list. 
     */
    override fun maxEntries(maxEntries: Number) {
      cdkBuilder.maxEntries(maxEntries)
    }

    /**
     * A name for the prefix list.
     *
     * Constraints: Up to 255 characters in length. The name cannot start with `com.amazonaws` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-prefixlistname)
     * @param prefixListName A name for the prefix list. 
     */
    override fun prefixListName(prefixListName: String) {
      cdkBuilder.prefixListName(prefixListName)
    }

    /**
     * The tags for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-tags)
     * @param tags The tags for the prefix list. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-tags)
     * @param tags The tags for the prefix list. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnPrefixList = cdkBuilder.build()
  }

  public companion object {
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
    /**
     * The CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-prefixlist-entry.html#cfn-ec2-prefixlist-entry-cidr)
     */
    public fun cidr(): String

    /**
     * A description for the entry.
     *
     * Constraints: Up to 255 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-prefixlist-entry.html#cfn-ec2-prefixlist-entry-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A builder for [EntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr The CIDR block. 
       */
      public fun cidr(cidr: String)

      /**
       * @param description A description for the entry.
       * Constraints: Up to 255 characters in length.
       */
      public fun description(description: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty.builder()

      /**
       * @param cidr The CIDR block. 
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      /**
       * @param description A description for the entry.
       * Constraints: Up to 255 characters in length.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnPrefixList.EntryProperty,
    ) : CdkObject(cdkObject), EntryProperty {
      /**
       * The CIDR block.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-prefixlist-entry.html#cfn-ec2-prefixlist-entry-cidr)
       */
      override fun cidr(): String = unwrap(this).getCidr()

      /**
       * A description for the entry.
       *
       * Constraints: Up to 255 characters in length.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-prefixlist-entry.html#cfn-ec2-prefixlist-entry-description)
       */
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