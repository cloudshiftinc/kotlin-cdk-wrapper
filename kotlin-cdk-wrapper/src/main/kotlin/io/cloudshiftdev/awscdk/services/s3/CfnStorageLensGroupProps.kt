@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStorageLensGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * CfnStorageLensGroupProps cfnStorageLensGroupProps = CfnStorageLensGroupProps.builder()
 * .filter(FilterProperty.builder()
 * .and(AndProperty.builder()
 * .matchAnyPrefix(List.of("matchAnyPrefix"))
 * .matchAnySuffix(List.of("matchAnySuffix"))
 * .matchAnyTag(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .matchObjectAge(MatchObjectAgeProperty.builder()
 * .daysGreaterThan(123)
 * .daysLessThan(123)
 * .build())
 * .matchObjectSize(MatchObjectSizeProperty.builder()
 * .bytesGreaterThan(123)
 * .bytesLessThan(123)
 * .build())
 * .build())
 * .matchAnyPrefix(List.of("matchAnyPrefix"))
 * .matchAnySuffix(List.of("matchAnySuffix"))
 * .matchAnyTag(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .matchObjectAge(MatchObjectAgeProperty.builder()
 * .daysGreaterThan(123)
 * .daysLessThan(123)
 * .build())
 * .matchObjectSize(MatchObjectSizeProperty.builder()
 * .bytesGreaterThan(123)
 * .bytesLessThan(123)
 * .build())
 * .or(OrProperty.builder()
 * .matchAnyPrefix(List.of("matchAnyPrefix"))
 * .matchAnySuffix(List.of("matchAnySuffix"))
 * .matchAnyTag(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .matchObjectAge(MatchObjectAgeProperty.builder()
 * .daysGreaterThan(123)
 * .daysLessThan(123)
 * .build())
 * .matchObjectSize(MatchObjectSizeProperty.builder()
 * .bytesGreaterThan(123)
 * .bytesLessThan(123)
 * .build())
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html)
 */
public interface CfnStorageLensGroupProps {
  /**
   * This property contains the criteria for the Storage Lens group data that is displayed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
   */
  public fun filter(): Any

  /**
   * This property contains the Storage Lens group name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-name)
   */
  public fun name(): String

  /**
   * This property contains the AWS resource tags that you're adding to your Storage Lens group.
   *
   * This parameter is optional.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStorageLensGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    public fun filter(filter: IResolvable)

    /**
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    public fun filter(filter: CfnStorageLensGroup.FilterProperty)

    /**
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("978e6f5a2e9415841fa801dda7b16e69be0b2f44ba8f8444847eb16a01605d1c")
    public fun filter(filter: CfnStorageLensGroup.FilterProperty.Builder.() -> Unit)

    /**
     * @param name This property contains the Storage Lens group name. 
     */
    public fun name(name: String)

    /**
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     * Lens group.
     * This parameter is optional.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     * Lens group.
     * This parameter is optional.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnStorageLensGroupProps.Builder =
        software.amazon.awscdk.services.s3.CfnStorageLensGroupProps.builder()

    /**
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    override fun filter(filter: IResolvable) {
      cdkBuilder.filter(filter.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    override fun filter(filter: CfnStorageLensGroup.FilterProperty) {
      cdkBuilder.filter(filter.let(CfnStorageLensGroup.FilterProperty.Companion::unwrap))
    }

    /**
     * @param filter This property contains the criteria for the Storage Lens group data that is
     * displayed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("978e6f5a2e9415841fa801dda7b16e69be0b2f44ba8f8444847eb16a01605d1c")
    override fun filter(filter: CfnStorageLensGroup.FilterProperty.Builder.() -> Unit): Unit =
        filter(CfnStorageLensGroup.FilterProperty(filter))

    /**
     * @param name This property contains the Storage Lens group name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     * Lens group.
     * This parameter is optional.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags This property contains the AWS resource tags that you're adding to your Storage
     * Lens group.
     * This parameter is optional.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroupProps,
  ) : CdkObject(cdkObject), CfnStorageLensGroupProps {
    /**
     * This property contains the criteria for the Storage Lens group data that is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-filter)
     */
    override fun filter(): Any = unwrap(this).getFilter()

    /**
     * This property contains the Storage Lens group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * This property contains the AWS resource tags that you're adding to your Storage Lens group.
     *
     * This parameter is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html#cfn-s3-storagelensgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStorageLensGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroupProps):
        CfnStorageLensGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStorageLensGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStorageLensGroupProps):
        software.amazon.awscdk.services.s3.CfnStorageLensGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnStorageLensGroupProps
  }
}
