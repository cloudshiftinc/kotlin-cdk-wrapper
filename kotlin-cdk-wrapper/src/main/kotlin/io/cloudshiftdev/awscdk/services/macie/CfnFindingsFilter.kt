@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Macie::FindingsFilter` resource specifies a findings filter.
 *
 * In Amazon Macie , a *findings filter* , also referred to as a *filter rule* , is a set of custom
 * criteria that specifies which findings to include or exclude from the results of a query for
 * findings. The criteria can help you identify and focus on findings that have specific
 * characteristics, such as severity, type, or the name of an affected AWS resource. You can also
 * configure a findings filter to suppress (automatically archive) findings that match the filter's
 * criteria. For more information, see [Filtering
 * findings](https://docs.aws.amazon.com/macie/latest/user/findings-filter-overview.html) in the
 * *Amazon Macie User Guide* .
 *
 * An `AWS::Macie::Session` resource must exist for an AWS account before you can create an
 * `AWS::Macie::FindingsFilter` resource for the account. Use a [DependsOn
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * to ensure that an `AWS::Macie::Session` resource is created before other Macie resources are created
 * for an account. For example, `"DependsOn": "Session"` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.macie.*;
 * CfnFindingsFilter cfnFindingsFilter = CfnFindingsFilter.Builder.create(this,
 * "MyCfnFindingsFilter")
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
public open class CfnFindingsFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilter,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The action to perform on findings that match the filter criteria ( `FindingCriteria` ).
   *
   * Valid values are:.
   */
  public open fun action(): String? = unwrap(this).getAction()

  /**
   * The action to perform on findings that match the filter criteria ( `FindingCriteria` ).
   *
   * Valid values are:.
   */
  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the findings filter.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrFindingsFilterListItems(): IResolvable =
      unwrap(this).getAttrFindingsFilterListItems().let(IResolvable::wrap)

  /**
   * The unique identifier for the findings filter.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A custom description of the findings filter.
   *
   * The description can contain 1-512 characters.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A custom description of the findings filter.
   *
   * The description can contain 1-512 characters.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The criteria to use to filter findings.
   */
  public open fun findingCriteria(): Any = unwrap(this).getFindingCriteria()

  /**
   * The criteria to use to filter findings.
   */
  public open fun findingCriteria(`value`: IResolvable) {
    unwrap(this).setFindingCriteria(`value`.let(IResolvable::unwrap))
  }

  /**
   * The criteria to use to filter findings.
   */
  public open fun findingCriteria(`value`: FindingCriteriaProperty) {
    unwrap(this).setFindingCriteria(`value`.let(FindingCriteriaProperty::unwrap))
  }

  /**
   * The criteria to use to filter findings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("860b409189e0a2757df7e355f6540bfcede45cad69dd01fedbe25164f1158b05")
  public open fun findingCriteria(`value`: FindingCriteriaProperty.Builder.() -> Unit): Unit =
      findingCriteria(FindingCriteriaProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A custom name for the findings filter.
   *
   * The name can contain 3-64 characters.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A custom name for the findings filter.
   *
   * The name can contain 3-64 characters.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The position of the findings filter in the list of saved filter rules on the Amazon Macie
   * console.
   */
  public open fun position(): Number? = unwrap(this).getPosition()

  /**
   * The position of the findings filter in the list of saved filter rules on the Amazon Macie
   * console.
   */
  public open fun position(`value`: Number) {
    unwrap(this).setPosition(`value`)
  }

  /**
   * An array of key-value pairs to apply to the findings filter.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to the findings filter.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to the findings filter.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.macie.CfnFindingsFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The action to perform on findings that match the filter criteria ( `FindingCriteria` ). Valid
     * values are:.
     *
     * * `ARCHIVE` - Suppress (automatically archive) the findings.
     * * `NOOP` - Don't perform any action on the findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-action)
     * @param action The action to perform on findings that match the filter criteria (
     * `FindingCriteria` ). Valid values are:. 
     */
    public fun action(action: String)

    /**
     * A custom description of the findings filter. The description can contain 1-512 characters.
     *
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-description)
     * @param description A custom description of the findings filter. The description can contain
     * 1-512 characters. 
     */
    public fun description(description: String)

    /**
     * The criteria to use to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-findingcriteria)
     * @param findingCriteria The criteria to use to filter findings. 
     */
    public fun findingCriteria(findingCriteria: IResolvable)

    /**
     * The criteria to use to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-findingcriteria)
     * @param findingCriteria The criteria to use to filter findings. 
     */
    public fun findingCriteria(findingCriteria: FindingCriteriaProperty)

    /**
     * The criteria to use to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-findingcriteria)
     * @param findingCriteria The criteria to use to filter findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("767dc9bf15d13dd8584a0157137877d33d45f5684d3bb57911a95e3f545fedbe")
    public fun findingCriteria(findingCriteria: FindingCriteriaProperty.Builder.() -> Unit)

    /**
     * A custom name for the findings filter. The name can contain 3-64 characters.
     *
     * Avoid including sensitive data in the name. Users of the account might be able to see the
     * name, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-name)
     * @param name A custom name for the findings filter. The name can contain 3-64 characters. 
     */
    public fun name(name: String)

    /**
     * The position of the findings filter in the list of saved filter rules on the Amazon Macie
     * console.
     *
     * This value also determines the order in which the filter is applied to findings, relative to
     * other filters that are also applied to findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-position)
     * @param position The position of the findings filter in the list of saved filter rules on the
     * Amazon Macie console. 
     */
    public fun position(position: Number)

    /**
     * An array of key-value pairs to apply to the findings filter.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-tags)
     * @param tags An array of key-value pairs to apply to the findings filter. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to the findings filter.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-tags)
     * @param tags An array of key-value pairs to apply to the findings filter. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnFindingsFilter.Builder =
        software.amazon.awscdk.services.macie.CfnFindingsFilter.Builder.create(scope, id)

    /**
     * The action to perform on findings that match the filter criteria ( `FindingCriteria` ). Valid
     * values are:.
     *
     * * `ARCHIVE` - Suppress (automatically archive) the findings.
     * * `NOOP` - Don't perform any action on the findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-action)
     * @param action The action to perform on findings that match the filter criteria (
     * `FindingCriteria` ). Valid values are:. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * A custom description of the findings filter. The description can contain 1-512 characters.
     *
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-description)
     * @param description A custom description of the findings filter. The description can contain
     * 1-512 characters. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The criteria to use to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-findingcriteria)
     * @param findingCriteria The criteria to use to filter findings. 
     */
    override fun findingCriteria(findingCriteria: IResolvable) {
      cdkBuilder.findingCriteria(findingCriteria.let(IResolvable::unwrap))
    }

    /**
     * The criteria to use to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-findingcriteria)
     * @param findingCriteria The criteria to use to filter findings. 
     */
    override fun findingCriteria(findingCriteria: FindingCriteriaProperty) {
      cdkBuilder.findingCriteria(findingCriteria.let(FindingCriteriaProperty::unwrap))
    }

    /**
     * The criteria to use to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-findingcriteria)
     * @param findingCriteria The criteria to use to filter findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("767dc9bf15d13dd8584a0157137877d33d45f5684d3bb57911a95e3f545fedbe")
    override fun findingCriteria(findingCriteria: FindingCriteriaProperty.Builder.() -> Unit): Unit
        = findingCriteria(FindingCriteriaProperty(findingCriteria))

    /**
     * A custom name for the findings filter. The name can contain 3-64 characters.
     *
     * Avoid including sensitive data in the name. Users of the account might be able to see the
     * name, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-name)
     * @param name A custom name for the findings filter. The name can contain 3-64 characters. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The position of the findings filter in the list of saved filter rules on the Amazon Macie
     * console.
     *
     * This value also determines the order in which the filter is applied to findings, relative to
     * other filters that are also applied to findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-position)
     * @param position The position of the findings filter in the list of saved filter rules on the
     * Amazon Macie console. 
     */
    override fun position(position: Number) {
      cdkBuilder.position(position)
    }

    /**
     * An array of key-value pairs to apply to the findings filter.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-tags)
     * @param tags An array of key-value pairs to apply to the findings filter. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to the findings filter.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-tags)
     * @param tags An array of key-value pairs to apply to the findings filter. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.macie.CfnFindingsFilter = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.macie.CfnFindingsFilter.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFindingsFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFindingsFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilter):
        CfnFindingsFilter = CfnFindingsFilter(cdkObject)

    internal fun unwrap(wrapped: CfnFindingsFilter):
        software.amazon.awscdk.services.macie.CfnFindingsFilter = wrapped.cdkObject
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.macie.*;
   * FindingsFilterListItemProperty findingsFilterListItemProperty =
   * FindingsFilterListItemProperty.builder()
   * .id("id")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingsfilterlistitem.html)
   */
  public interface FindingsFilterListItemProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingsfilterlistitem.html#cfn-macie-findingsfilter-findingsfilterlistitem-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingsfilterlistitem.html#cfn-macie-findingsfilter-findingsfilterlistitem-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [FindingsFilterListItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id the value to be set.
       */
      public fun id(id: String)

      /**
       * @param name the value to be set.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty.Builder
          =
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty.builder()

      /**
       * @param id the value to be set.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name the value to be set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty,
    ) : CdkObject(cdkObject), FindingsFilterListItemProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingsfilterlistitem.html#cfn-macie-findingsfilter-findingsfilterlistitem-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingsfilterlistitem.html#cfn-macie-findingsfilter-findingsfilterlistitem-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FindingsFilterListItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty):
          FindingsFilterListItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FindingsFilterListItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FindingsFilterListItemProperty):
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty
    }
  }

  /**
   * Specifies, as a map, one or more property-based conditions for a findings filter.
   *
   * A *findings filter* , also referred to as a *filter rule* , is a set of custom criteria that
   * specifies which findings to include or exclude from the results of a query for findings. You can
   * also configure a findings filter to suppress (automatically archive) findings that match the
   * filter's criteria. For more information, see [Filtering
   * findings](https://docs.aws.amazon.com/macie/latest/user/findings-filter-overview.html) in the
   * *Amazon Macie User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.macie.*;
   * FindingCriteriaProperty findingCriteriaProperty = FindingCriteriaProperty.builder()
   * .criterion(Map.of(
   * "criterionKey", CriterionAdditionalPropertiesProperty.builder()
   * .eq(List.of("eq"))
   * .gt(123)
   * .gte(123)
   * .lt(123)
   * .lte(123)
   * .neq(List.of("neq"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingcriteria.html)
   */
  public interface FindingCriteriaProperty {
    /**
     * Specifies a condition that defines the property, operator, and one or more values to use to
     * filter the results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingcriteria.html#cfn-macie-findingsfilter-findingcriteria-criterion)
     */
    public fun criterion(): Any? = unwrap(this).getCriterion()

    /**
     * A builder for [FindingCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param criterion Specifies a condition that defines the property, operator, and one or more
       * values to use to filter the results.
       */
      public fun criterion(criterion: IResolvable)

      /**
       * @param criterion Specifies a condition that defines the property, operator, and one or more
       * values to use to filter the results.
       */
      public fun criterion(criterion: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty.Builder =
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty.builder()

      /**
       * @param criterion Specifies a condition that defines the property, operator, and one or more
       * values to use to filter the results.
       */
      override fun criterion(criterion: IResolvable) {
        cdkBuilder.criterion(criterion.let(IResolvable::unwrap))
      }

      /**
       * @param criterion Specifies a condition that defines the property, operator, and one or more
       * values to use to filter the results.
       */
      override fun criterion(criterion: Map<String, Any>) {
        cdkBuilder.criterion(criterion)
      }

      public fun build():
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty,
    ) : CdkObject(cdkObject), FindingCriteriaProperty {
      /**
       * Specifies a condition that defines the property, operator, and one or more values to use to
       * filter the results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingcriteria.html#cfn-macie-findingsfilter-findingcriteria-criterion)
       */
      override fun criterion(): Any? = unwrap(this).getCriterion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FindingCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty):
          FindingCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as? FindingCriteriaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FindingCriteriaProperty):
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty
    }
  }

  /**
   * Specifies a condition that defines the property, operator, and one or more values to use in a
   * findings filter.
   *
   * A *findings filter* , also referred to as a *filter rule* , is a set of custom criteria that
   * specifies which findings to include or exclude from the results of a query for findings. You can
   * also configure a findings filter to suppress (automatically archive) findings that match the
   * filter's criteria. For more information, see [Filtering
   * findings](https://docs.aws.amazon.com/macie/latest/user/findings-filter-overview.html) in the
   * *Amazon Macie User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.macie.*;
   * CriterionAdditionalPropertiesProperty criterionAdditionalPropertiesProperty =
   * CriterionAdditionalPropertiesProperty.builder()
   * .eq(List.of("eq"))
   * .gt(123)
   * .gte(123)
   * .lt(123)
   * .lte(123)
   * .neq(List.of("neq"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html)
   */
  public interface CriterionAdditionalPropertiesProperty {
    /**
     * The value for the specified property matches (equals) the specified value.
     *
     * If you specify multiple values, Amazon Macie uses OR logic to join the values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-eq)
     */
    public fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

    /**
     * The value for the specified property is greater than the specified value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-gt)
     */
    public fun gt(): Number? = unwrap(this).getGt()

    /**
     * The value for the specified property is greater than or equal to the specified value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-gte)
     */
    public fun gte(): Number? = unwrap(this).getGte()

    /**
     * The value for the specified property is less than the specified value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-lt)
     */
    public fun lt(): Number? = unwrap(this).getLt()

    /**
     * The value for the specified property is less than or equal to the specified value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-lte)
     */
    public fun lte(): Number? = unwrap(this).getLte()

    /**
     * The value for the specified property doesn't match (doesn't equal) the specified value.
     *
     * If you specify multiple values, Amazon Macie uses OR logic to join the values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-neq)
     */
    public fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()

    /**
     * A builder for [CriterionAdditionalPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eq The value for the specified property matches (equals) the specified value.
       * If you specify multiple values, Amazon Macie uses OR logic to join the values.
       */
      public fun eq(eq: List<String>)

      /**
       * @param eq The value for the specified property matches (equals) the specified value.
       * If you specify multiple values, Amazon Macie uses OR logic to join the values.
       */
      public fun eq(vararg eq: String)

      /**
       * @param gt The value for the specified property is greater than the specified value.
       */
      public fun gt(gt: Number)

      /**
       * @param gte The value for the specified property is greater than or equal to the specified
       * value.
       */
      public fun gte(gte: Number)

      /**
       * @param lt The value for the specified property is less than the specified value.
       */
      public fun lt(lt: Number)

      /**
       * @param lte The value for the specified property is less than or equal to the specified
       * value.
       */
      public fun lte(lte: Number)

      /**
       * @param neq The value for the specified property doesn't match (doesn't equal) the specified
       * value.
       * If you specify multiple values, Amazon Macie uses OR logic to join the values.
       */
      public fun neq(neq: List<String>)

      /**
       * @param neq The value for the specified property doesn't match (doesn't equal) the specified
       * value.
       * If you specify multiple values, Amazon Macie uses OR logic to join the values.
       */
      public fun neq(vararg neq: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty.builder()

      /**
       * @param eq The value for the specified property matches (equals) the specified value.
       * If you specify multiple values, Amazon Macie uses OR logic to join the values.
       */
      override fun eq(eq: List<String>) {
        cdkBuilder.eq(eq)
      }

      /**
       * @param eq The value for the specified property matches (equals) the specified value.
       * If you specify multiple values, Amazon Macie uses OR logic to join the values.
       */
      override fun eq(vararg eq: String): Unit = eq(eq.toList())

      /**
       * @param gt The value for the specified property is greater than the specified value.
       */
      override fun gt(gt: Number) {
        cdkBuilder.gt(gt)
      }

      /**
       * @param gte The value for the specified property is greater than or equal to the specified
       * value.
       */
      override fun gte(gte: Number) {
        cdkBuilder.gte(gte)
      }

      /**
       * @param lt The value for the specified property is less than the specified value.
       */
      override fun lt(lt: Number) {
        cdkBuilder.lt(lt)
      }

      /**
       * @param lte The value for the specified property is less than or equal to the specified
       * value.
       */
      override fun lte(lte: Number) {
        cdkBuilder.lte(lte)
      }

      /**
       * @param neq The value for the specified property doesn't match (doesn't equal) the specified
       * value.
       * If you specify multiple values, Amazon Macie uses OR logic to join the values.
       */
      override fun neq(neq: List<String>) {
        cdkBuilder.neq(neq)
      }

      /**
       * @param neq The value for the specified property doesn't match (doesn't equal) the specified
       * value.
       * If you specify multiple values, Amazon Macie uses OR logic to join the values.
       */
      override fun neq(vararg neq: String): Unit = neq(neq.toList())

      public fun build():
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty,
    ) : CdkObject(cdkObject), CriterionAdditionalPropertiesProperty {
      /**
       * The value for the specified property matches (equals) the specified value.
       *
       * If you specify multiple values, Amazon Macie uses OR logic to join the values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-eq)
       */
      override fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

      /**
       * The value for the specified property is greater than the specified value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-gt)
       */
      override fun gt(): Number? = unwrap(this).getGt()

      /**
       * The value for the specified property is greater than or equal to the specified value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-gte)
       */
      override fun gte(): Number? = unwrap(this).getGte()

      /**
       * The value for the specified property is less than the specified value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-lt)
       */
      override fun lt(): Number? = unwrap(this).getLt()

      /**
       * The value for the specified property is less than or equal to the specified value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-lte)
       */
      override fun lte(): Number? = unwrap(this).getLte()

      /**
       * The value for the specified property doesn't match (doesn't equal) the specified value.
       *
       * If you specify multiple values, Amazon Macie uses OR logic to join the values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html#cfn-macie-findingsfilter-criterionadditionalproperties-neq)
       */
      override fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CriterionAdditionalPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty):
          CriterionAdditionalPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CriterionAdditionalPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CriterionAdditionalPropertiesProperty):
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty
    }
  }
}
