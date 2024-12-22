@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPrefixList`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnPrefixListProps cfnPrefixListProps = CfnPrefixListProps.builder()
 * .addressFamily("addressFamily")
 * .prefixListName("prefixListName")
 * // the properties below are optional
 * .entries(List.of(EntryProperty.builder()
 * .cidr("cidr")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .maxEntries(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html)
 */
public interface CfnPrefixListProps {
  /**
   * The IP address type.
   *
   * Valid Values: `IPv4` | `IPv6`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-addressfamily)
   */
  public fun addressFamily(): String

  /**
   * The entries for the prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
   */
  public fun entries(): Any? = unwrap(this).getEntries()

  /**
   * The maximum number of entries for the prefix list.
   *
   * You can't modify the entries and the size of a prefix list at the same time.
   *
   * This property is required when you create a prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-maxentries)
   */
  public fun maxEntries(): Number? = unwrap(this).getMaxEntries()

  /**
   * A name for the prefix list.
   *
   * Constraints: Up to 255 characters in length. The name cannot start with `com.amazonaws` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-prefixlistname)
   */
  public fun prefixListName(): String

  /**
   * The tags for the prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPrefixListProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addressFamily The IP address type. 
     * Valid Values: `IPv4` | `IPv6`
     */
    public fun addressFamily(addressFamily: String)

    /**
     * @param entries The entries for the prefix list.
     */
    public fun entries(entries: IResolvable)

    /**
     * @param entries The entries for the prefix list.
     */
    public fun entries(entries: List<Any>)

    /**
     * @param entries The entries for the prefix list.
     */
    public fun entries(vararg entries: Any)

    /**
     * @param maxEntries The maximum number of entries for the prefix list.
     * You can't modify the entries and the size of a prefix list at the same time.
     *
     * This property is required when you create a prefix list.
     */
    public fun maxEntries(maxEntries: Number)

    /**
     * @param prefixListName A name for the prefix list. 
     * Constraints: Up to 255 characters in length. The name cannot start with `com.amazonaws` .
     */
    public fun prefixListName(prefixListName: String)

    /**
     * @param tags The tags for the prefix list.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the prefix list.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnPrefixListProps.Builder =
        software.amazon.awscdk.services.ec2.CfnPrefixListProps.builder()

    /**
     * @param addressFamily The IP address type. 
     * Valid Values: `IPv4` | `IPv6`
     */
    override fun addressFamily(addressFamily: String) {
      cdkBuilder.addressFamily(addressFamily)
    }

    /**
     * @param entries The entries for the prefix list.
     */
    override fun entries(entries: IResolvable) {
      cdkBuilder.entries(entries.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param entries The entries for the prefix list.
     */
    override fun entries(entries: List<Any>) {
      cdkBuilder.entries(entries.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param entries The entries for the prefix list.
     */
    override fun entries(vararg entries: Any): Unit = entries(entries.toList())

    /**
     * @param maxEntries The maximum number of entries for the prefix list.
     * You can't modify the entries and the size of a prefix list at the same time.
     *
     * This property is required when you create a prefix list.
     */
    override fun maxEntries(maxEntries: Number) {
      cdkBuilder.maxEntries(maxEntries)
    }

    /**
     * @param prefixListName A name for the prefix list. 
     * Constraints: Up to 255 characters in length. The name cannot start with `com.amazonaws` .
     */
    override fun prefixListName(prefixListName: String) {
      cdkBuilder.prefixListName(prefixListName)
    }

    /**
     * @param tags The tags for the prefix list.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags for the prefix list.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnPrefixListProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnPrefixListProps,
  ) : CdkObject(cdkObject),
      CfnPrefixListProps {
    /**
     * The IP address type.
     *
     * Valid Values: `IPv4` | `IPv6`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-addressfamily)
     */
    override fun addressFamily(): String = unwrap(this).getAddressFamily()

    /**
     * The entries for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
     */
    override fun entries(): Any? = unwrap(this).getEntries()

    /**
     * The maximum number of entries for the prefix list.
     *
     * You can't modify the entries and the size of a prefix list at the same time.
     *
     * This property is required when you create a prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-maxentries)
     */
    override fun maxEntries(): Number? = unwrap(this).getMaxEntries()

    /**
     * A name for the prefix list.
     *
     * Constraints: Up to 255 characters in length. The name cannot start with `com.amazonaws` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-prefixlistname)
     */
    override fun prefixListName(): String = unwrap(this).getPrefixListName()

    /**
     * The tags for the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrefixListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnPrefixListProps):
        CfnPrefixListProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPrefixListProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrefixListProps):
        software.amazon.awscdk.services.ec2.CfnPrefixListProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnPrefixListProps
  }
}
