@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFindingsFilter`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.macie.*;
 * CfnFindingsFilterProps cfnFindingsFilterProps = CfnFindingsFilterProps.builder()
 * .findingCriteria(FindingCriteriaProperty.builder()
 * .criterion(Map.of(
 * "criterionKey", CriterionAdditionalPropertiesProperty.builder()
 * .eq(List.of("eq"))
 * .gt(123)
 * .gte(123)
 * .lt(123)
 * .lte(123)
 * .neq(List.of("neq"))
 * .build()))
 * .build())
 * .name("name")
 * // the properties below are optional
 * .action("action")
 * .description("description")
 * .position(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html)
 */
public interface CfnFindingsFilterProps {
  /**
   * The action to perform on findings that match the filter criteria ( `FindingCriteria` ). Valid
   * values are:.
   *
   * * `ARCHIVE` - Suppress (automatically archive) the findings.
   * * `NOOP` - Don't perform any action on the findings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-action)
   */
  public fun action(): String? = unwrap(this).getAction()

  /**
   * A custom description of the findings filter. The description can contain 1-512 characters.
   *
   * Avoid including sensitive data in the description. Users of the account might be able to see
   * the description, depending on the actions that they're allowed to perform in Amazon Macie .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The criteria to use to filter findings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-findingcriteria)
   */
  public fun findingCriteria(): Any

  /**
   * A custom name for the findings filter. The name can contain 3-64 characters.
   *
   * Avoid including sensitive data in the name. Users of the account might be able to see the name,
   * depending on the actions that they're allowed to perform in Amazon Macie .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-name)
   */
  public fun name(): String

  /**
   * The position of the findings filter in the list of saved filter rules on the Amazon Macie
   * console.
   *
   * This value also determines the order in which the filter is applied to findings, relative to
   * other filters that are also applied to findings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-position)
   */
  public fun position(): Number? = unwrap(this).getPosition()

  /**
   * An array of key-value pairs to apply to the findings filter.
   *
   * For more information, see [Resource
   * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFindingsFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The action to perform on findings that match the filter criteria (
     * `FindingCriteria` ). Valid values are:.
     * * `ARCHIVE` - Suppress (automatically archive) the findings.
     * * `NOOP` - Don't perform any action on the findings.
     */
    public fun action(action: String)

    /**
     * @param description A custom description of the findings filter. The description can contain
     * 1-512 characters.
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     */
    public fun description(description: String)

    /**
     * @param findingCriteria The criteria to use to filter findings. 
     */
    public fun findingCriteria(findingCriteria: IResolvable)

    /**
     * @param findingCriteria The criteria to use to filter findings. 
     */
    public fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty)

    /**
     * @param findingCriteria The criteria to use to filter findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a384cddbb7a2add8aa2a25fd60456f867b63257250554df377a9d0c66ebd99c3")
    public
        fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty.Builder.() -> Unit)

    /**
     * @param name A custom name for the findings filter. The name can contain 3-64 characters. 
     * Avoid including sensitive data in the name. Users of the account might be able to see the
     * name, depending on the actions that they're allowed to perform in Amazon Macie .
     */
    public fun name(name: String)

    /**
     * @param position The position of the findings filter in the list of saved filter rules on the
     * Amazon Macie console.
     * This value also determines the order in which the filter is applied to findings, relative to
     * other filters that are also applied to findings.
     */
    public fun position(position: Number)

    /**
     * @param tags An array of key-value pairs to apply to the findings filter.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to the findings filter.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnFindingsFilterProps.Builder =
        software.amazon.awscdk.services.macie.CfnFindingsFilterProps.builder()

    /**
     * @param action The action to perform on findings that match the filter criteria (
     * `FindingCriteria` ). Valid values are:.
     * * `ARCHIVE` - Suppress (automatically archive) the findings.
     * * `NOOP` - Don't perform any action on the findings.
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param description A custom description of the findings filter. The description can contain
     * 1-512 characters.
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param findingCriteria The criteria to use to filter findings. 
     */
    override fun findingCriteria(findingCriteria: IResolvable) {
      cdkBuilder.findingCriteria(findingCriteria.let(IResolvable::unwrap))
    }

    /**
     * @param findingCriteria The criteria to use to filter findings. 
     */
    override fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty) {
      cdkBuilder.findingCriteria(findingCriteria.let(CfnFindingsFilter.FindingCriteriaProperty::unwrap))
    }

    /**
     * @param findingCriteria The criteria to use to filter findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a384cddbb7a2add8aa2a25fd60456f867b63257250554df377a9d0c66ebd99c3")
    override
        fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty.Builder.() -> Unit):
        Unit = findingCriteria(CfnFindingsFilter.FindingCriteriaProperty(findingCriteria))

    /**
     * @param name A custom name for the findings filter. The name can contain 3-64 characters. 
     * Avoid including sensitive data in the name. Users of the account might be able to see the
     * name, depending on the actions that they're allowed to perform in Amazon Macie .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param position The position of the findings filter in the list of saved filter rules on the
     * Amazon Macie console.
     * This value also determines the order in which the filter is applied to findings, relative to
     * other filters that are also applied to findings.
     */
    override fun position(position: Number) {
      cdkBuilder.position(position)
    }

    /**
     * @param tags An array of key-value pairs to apply to the findings filter.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to the findings filter.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.macie.CfnFindingsFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilterProps,
  ) : CdkObject(cdkObject), CfnFindingsFilterProps {
    /**
     * The action to perform on findings that match the filter criteria ( `FindingCriteria` ). Valid
     * values are:.
     *
     * * `ARCHIVE` - Suppress (automatically archive) the findings.
     * * `NOOP` - Don't perform any action on the findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-action)
     */
    override fun action(): String? = unwrap(this).getAction()

    /**
     * A custom description of the findings filter. The description can contain 1-512 characters.
     *
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The criteria to use to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-findingcriteria)
     */
    override fun findingCriteria(): Any = unwrap(this).getFindingCriteria()

    /**
     * A custom name for the findings filter. The name can contain 3-64 characters.
     *
     * Avoid including sensitive data in the name. Users of the account might be able to see the
     * name, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The position of the findings filter in the list of saved filter rules on the Amazon Macie
     * console.
     *
     * This value also determines the order in which the filter is applied to findings, relative to
     * other filters that are also applied to findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-position)
     */
    override fun position(): Number? = unwrap(this).getPosition()

    /**
     * An array of key-value pairs to apply to the findings filter.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFindingsFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilterProps):
        CfnFindingsFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFindingsFilterProps):
        software.amazon.awscdk.services.macie.CfnFindingsFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.macie.CfnFindingsFilterProps
  }
}
