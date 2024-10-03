@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.macie

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
 * Properties for defining a `CfnAllowList`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.macie.*;
 * CfnAllowListProps cfnAllowListProps = CfnAllowListProps.builder()
 * .criteria(CriteriaProperty.builder()
 * .regex("regex")
 * .s3WordsList(S3WordsListProperty.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html)
 */
public interface CfnAllowListProps {
  /**
   * The criteria that specify the text or text pattern to ignore.
   *
   * The criteria can be the location and name of an Amazon S3 object that lists specific text to
   * ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to
   * ignore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-criteria)
   */
  public fun criteria(): Any

  /**
   * A custom description of the allow list.
   *
   * The description can contain 1-512 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A custom name for the allow list.
   *
   * The name can contain 1-128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-name)
   */
  public fun name(): String

  /**
   * An array of key-value pairs to apply to the allow list.
   *
   * For more information, see [Resource
   * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAllowListProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param criteria The criteria that specify the text or text pattern to ignore. 
     * The criteria can be the location and name of an Amazon S3 object that lists specific text to
     * ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to
     * ignore.
     */
    public fun criteria(criteria: IResolvable)

    /**
     * @param criteria The criteria that specify the text or text pattern to ignore. 
     * The criteria can be the location and name of an Amazon S3 object that lists specific text to
     * ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to
     * ignore.
     */
    public fun criteria(criteria: CfnAllowList.CriteriaProperty)

    /**
     * @param criteria The criteria that specify the text or text pattern to ignore. 
     * The criteria can be the location and name of an Amazon S3 object that lists specific text to
     * ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to
     * ignore.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18794651586708edef5f5674e3ec4878c82fd42a25688d040a640943eb20f070")
    public fun criteria(criteria: CfnAllowList.CriteriaProperty.Builder.() -> Unit)

    /**
     * @param description A custom description of the allow list.
     * The description can contain 1-512 characters.
     */
    public fun description(description: String)

    /**
     * @param name A custom name for the allow list. 
     * The name can contain 1-128 characters.
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to the allow list.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to the allow list.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnAllowListProps.Builder =
        software.amazon.awscdk.services.macie.CfnAllowListProps.builder()

    /**
     * @param criteria The criteria that specify the text or text pattern to ignore. 
     * The criteria can be the location and name of an Amazon S3 object that lists specific text to
     * ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to
     * ignore.
     */
    override fun criteria(criteria: IResolvable) {
      cdkBuilder.criteria(criteria.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param criteria The criteria that specify the text or text pattern to ignore. 
     * The criteria can be the location and name of an Amazon S3 object that lists specific text to
     * ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to
     * ignore.
     */
    override fun criteria(criteria: CfnAllowList.CriteriaProperty) {
      cdkBuilder.criteria(criteria.let(CfnAllowList.CriteriaProperty.Companion::unwrap))
    }

    /**
     * @param criteria The criteria that specify the text or text pattern to ignore. 
     * The criteria can be the location and name of an Amazon S3 object that lists specific text to
     * ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to
     * ignore.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18794651586708edef5f5674e3ec4878c82fd42a25688d040a640943eb20f070")
    override fun criteria(criteria: CfnAllowList.CriteriaProperty.Builder.() -> Unit): Unit =
        criteria(CfnAllowList.CriteriaProperty(criteria))

    /**
     * @param description A custom description of the allow list.
     * The description can contain 1-512 characters.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A custom name for the allow list. 
     * The name can contain 1-128 characters.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to the allow list.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to the allow list.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.macie.CfnAllowListProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.macie.CfnAllowListProps,
  ) : CdkObject(cdkObject),
      CfnAllowListProps {
    /**
     * The criteria that specify the text or text pattern to ignore.
     *
     * The criteria can be the location and name of an Amazon S3 object that lists specific text to
     * ignore ( `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to
     * ignore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-criteria)
     */
    override fun criteria(): Any = unwrap(this).getCriteria()

    /**
     * A custom description of the allow list.
     *
     * The description can contain 1-512 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A custom name for the allow list.
     *
     * The name can contain 1-128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to the allow list.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html#cfn-macie-allowlist-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAllowListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnAllowListProps):
        CfnAllowListProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAllowListProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAllowListProps):
        software.amazon.awscdk.services.macie.CfnAllowListProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.macie.CfnAllowListProps
  }
}
