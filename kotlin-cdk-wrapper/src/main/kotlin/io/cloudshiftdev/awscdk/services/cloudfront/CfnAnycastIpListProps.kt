@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAnycastIpList`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnAnycastIpListProps cfnAnycastIpListProps = CfnAnycastIpListProps.builder()
 * .ipCount(123)
 * .name("name")
 * // the properties below are optional
 * .tags(TagsProperty.builder()
 * .items(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html)
 */
public interface CfnAnycastIpListProps {
  /**
   * The number of IP addresses in the Anycast static IP list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-ipcount)
   */
  public fun ipCount(): Number

  /**
   * The name of the Anycast static IP list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-name)
   */
  public fun name(): String

  /**
   * A complex type that contains zero or more `Tag` elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-tags)
   */
  public fun tags(): CfnAnycastIpList.TagsProperty? =
      unwrap(this).getTags()?.let(CfnAnycastIpList.TagsProperty::wrap)

  /**
   * A builder for [CfnAnycastIpListProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ipCount The number of IP addresses in the Anycast static IP list. 
     */
    public fun ipCount(ipCount: Number)

    /**
     * @param name The name of the Anycast static IP list. 
     */
    public fun name(name: String)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(tags: CfnAnycastIpList.TagsProperty)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eedf793964eccc29ae3d0fec55902dabd69eb42bd7e2ab2fb078a1abf237c4a5")
    public fun tags(tags: CfnAnycastIpList.TagsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnAnycastIpListProps.Builder
        = software.amazon.awscdk.services.cloudfront.CfnAnycastIpListProps.builder()

    /**
     * @param ipCount The number of IP addresses in the Anycast static IP list. 
     */
    override fun ipCount(ipCount: Number) {
      cdkBuilder.ipCount(ipCount)
    }

    /**
     * @param name The name of the Anycast static IP list. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(tags: CfnAnycastIpList.TagsProperty) {
      cdkBuilder.tags(tags.let(CfnAnycastIpList.TagsProperty.Companion::unwrap))
    }

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eedf793964eccc29ae3d0fec55902dabd69eb42bd7e2ab2fb078a1abf237c4a5")
    override fun tags(tags: CfnAnycastIpList.TagsProperty.Builder.() -> Unit): Unit =
        tags(CfnAnycastIpList.TagsProperty(tags))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnAnycastIpListProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.CfnAnycastIpListProps,
  ) : CdkObject(cdkObject),
      CfnAnycastIpListProps {
    /**
     * The number of IP addresses in the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-ipcount)
     */
    override fun ipCount(): Number = unwrap(this).getIpCount()

    /**
     * The name of the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-tags)
     */
    override fun tags(): CfnAnycastIpList.TagsProperty? =
        unwrap(this).getTags()?.let(CfnAnycastIpList.TagsProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnycastIpListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnAnycastIpListProps):
        CfnAnycastIpListProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAnycastIpListProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnycastIpListProps):
        software.amazon.awscdk.services.cloudfront.CfnAnycastIpListProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnAnycastIpListProps
  }
}
