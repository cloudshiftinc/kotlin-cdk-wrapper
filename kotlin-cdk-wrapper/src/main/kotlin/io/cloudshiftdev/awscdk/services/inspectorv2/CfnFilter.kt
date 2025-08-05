@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspectorv2

import io.cloudshiftdev.awscdk.CfnResource
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
 * Details about a filter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
 * CfnFilter cfnFilter = CfnFilter.Builder.create(this, "MyCfnFilter")
 * .filterAction("filterAction")
 * .filterCriteria(FilterCriteriaProperty.builder()
 * .awsAccountId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .codeVulnerabilityDetectorName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .codeVulnerabilityDetectorTags(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .codeVulnerabilityFilePath(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .componentId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .componentType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ec2InstanceImageId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ec2InstanceSubnetId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ec2InstanceVpcId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageArchitecture(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageHash(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImagePushedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .ecrImageRegistry(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageRepositoryName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageTags(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .epssScore(List.of(NumberFilterProperty.builder()
 * .lowerInclusive(123)
 * .upperInclusive(123)
 * .build()))
 * .exploitAvailable(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingStatus(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .firstObservedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .fixAvailable(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .inspectorScore(List.of(NumberFilterProperty.builder()
 * .lowerInclusive(123)
 * .upperInclusive(123)
 * .build()))
 * .lambdaFunctionExecutionRoleArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .lambdaFunctionLastModifiedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .lambdaFunctionLayers(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .lambdaFunctionName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .lambdaFunctionRuntime(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .lastObservedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .networkProtocol(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .portRange(List.of(PortRangeFilterProperty.builder()
 * .beginInclusive(123)
 * .endInclusive(123)
 * .build()))
 * .relatedVulnerabilities(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceTags(List.of(MapFilterProperty.builder()
 * .comparison("comparison")
 * // the properties below are optional
 * .key("key")
 * .value("value")
 * .build()))
 * .resourceType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .severity(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .title(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .updatedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .vendorSeverity(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerabilityId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerabilitySource(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerablePackages(List.of(PackageFilterProperty.builder()
 * .architecture(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .epoch(NumberFilterProperty.builder()
 * .lowerInclusive(123)
 * .upperInclusive(123)
 * .build())
 * .filePath(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .name(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .release(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .sourceLambdaLayerArn(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .sourceLayerHash(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .version(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .build()))
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html)
 */
public open class CfnFilter(
  cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFilterProps,
  ) :
      this(software.amazon.awscdk.services.inspectorv2.CfnFilter(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFilterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFilterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFilterProps(props)
  )

  /**
   * The Amazon Resource Number (ARN) associated with this filter.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description of the filter.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the filter.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The action that is to be applied to the findings that match the filter.
   */
  public open fun filterAction(): String = unwrap(this).getFilterAction()

  /**
   * The action that is to be applied to the findings that match the filter.
   */
  public open fun filterAction(`value`: String) {
    unwrap(this).setFilterAction(`value`)
  }

  /**
   * Details on the filter criteria associated with this filter.
   */
  public open fun filterCriteria(): Any = unwrap(this).getFilterCriteria()

  /**
   * Details on the filter criteria associated with this filter.
   */
  public open fun filterCriteria(`value`: IResolvable) {
    unwrap(this).setFilterCriteria(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Details on the filter criteria associated with this filter.
   */
  public open fun filterCriteria(`value`: FilterCriteriaProperty) {
    unwrap(this).setFilterCriteria(`value`.let(FilterCriteriaProperty.Companion::unwrap))
  }

  /**
   * Details on the filter criteria associated with this filter.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41cc6a6ce31e8508d155dca5666682632b24e1e61f7240c349164ebb1d7035be")
  public open fun filterCriteria(`value`: FilterCriteriaProperty.Builder.() -> Unit): Unit =
      filterCriteria(FilterCriteriaProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the filter.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the filter.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The tags attached to the filter.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The tags attached to the filter.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.inspectorv2.CfnFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-description)
     * @param description A description of the filter. 
     */
    public fun description(description: String)

    /**
     * The action that is to be applied to the findings that match the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filteraction)
     * @param filterAction The action that is to be applied to the findings that match the filter. 
     */
    public fun filterAction(filterAction: String)

    /**
     * Details on the filter criteria associated with this filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    public fun filterCriteria(filterCriteria: IResolvable)

    /**
     * Details on the filter criteria associated with this filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    public fun filterCriteria(filterCriteria: FilterCriteriaProperty)

    /**
     * Details on the filter criteria associated with this filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08f854474ba06437298904554fca2e2184655e6e921c8d82158da279150a1794")
    public fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit)

    /**
     * The name of the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-name)
     * @param name The name of the filter. 
     */
    public fun name(name: String)

    /**
     * The tags attached to the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-tags)
     * @param tags The tags attached to the filter. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspectorv2.CfnFilter.Builder =
        software.amazon.awscdk.services.inspectorv2.CfnFilter.Builder.create(scope, id)

    /**
     * A description of the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-description)
     * @param description A description of the filter. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The action that is to be applied to the findings that match the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filteraction)
     * @param filterAction The action that is to be applied to the findings that match the filter. 
     */
    override fun filterAction(filterAction: String) {
      cdkBuilder.filterAction(filterAction)
    }

    /**
     * Details on the filter criteria associated with this filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    override fun filterCriteria(filterCriteria: IResolvable) {
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable.Companion::unwrap))
    }

    /**
     * Details on the filter criteria associated with this filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    override fun filterCriteria(filterCriteria: FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(FilterCriteriaProperty.Companion::unwrap))
    }

    /**
     * Details on the filter criteria associated with this filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08f854474ba06437298904554fca2e2184655e6e921c8d82158da279150a1794")
    override fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit): Unit =
        filterCriteria(FilterCriteriaProperty(filterCriteria))

    /**
     * The name of the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-name)
     * @param name The name of the filter. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags attached to the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-tags)
     * @param tags The tags attached to the filter. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilter = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.inspectorv2.CfnFilter.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter): CfnFilter =
        CfnFilter(cdkObject)

    internal fun unwrap(wrapped: CfnFilter): software.amazon.awscdk.services.inspectorv2.CfnFilter =
        wrapped.cdkObject as software.amazon.awscdk.services.inspectorv2.CfnFilter
  }

  /**
   * Contains details on the time range used to filter findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * DateFilterProperty dateFilterProperty = DateFilterProperty.builder()
   * .endInclusive(123)
   * .startInclusive(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-datefilter.html)
   */
  public interface DateFilterProperty {
    /**
     * A timestamp representing the end of the time period filtered on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-datefilter.html#cfn-inspectorv2-filter-datefilter-endinclusive)
     */
    public fun endInclusive(): Number? = unwrap(this).getEndInclusive()

    /**
     * A timestamp representing the start of the time period filtered on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-datefilter.html#cfn-inspectorv2-filter-datefilter-startinclusive)
     */
    public fun startInclusive(): Number? = unwrap(this).getStartInclusive()

    /**
     * A builder for [DateFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endInclusive A timestamp representing the end of the time period filtered on.
       */
      public fun endInclusive(endInclusive: Number)

      /**
       * @param startInclusive A timestamp representing the start of the time period filtered on.
       */
      public fun startInclusive(startInclusive: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty.builder()

      /**
       * @param endInclusive A timestamp representing the end of the time period filtered on.
       */
      override fun endInclusive(endInclusive: Number) {
        cdkBuilder.endInclusive(endInclusive)
      }

      /**
       * @param startInclusive A timestamp representing the start of the time period filtered on.
       */
      override fun startInclusive(startInclusive: Number) {
        cdkBuilder.startInclusive(startInclusive)
      }

      public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty,
    ) : CdkObject(cdkObject),
        DateFilterProperty {
      /**
       * A timestamp representing the end of the time period filtered on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-datefilter.html#cfn-inspectorv2-filter-datefilter-endinclusive)
       */
      override fun endInclusive(): Number? = unwrap(this).getEndInclusive()

      /**
       * A timestamp representing the start of the time period filtered on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-datefilter.html#cfn-inspectorv2-filter-datefilter-startinclusive)
       */
      override fun startInclusive(): Number? = unwrap(this).getStartInclusive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty):
          DateFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? DateFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty
    }
  }

  /**
   * Details on the criteria used to define the filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * FilterCriteriaProperty filterCriteriaProperty = FilterCriteriaProperty.builder()
   * .awsAccountId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .codeVulnerabilityDetectorName(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .codeVulnerabilityDetectorTags(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .codeVulnerabilityFilePath(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .componentId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .componentType(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .ec2InstanceImageId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .ec2InstanceSubnetId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .ec2InstanceVpcId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .ecrImageArchitecture(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .ecrImageHash(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .ecrImagePushedAt(List.of(DateFilterProperty.builder()
   * .endInclusive(123)
   * .startInclusive(123)
   * .build()))
   * .ecrImageRegistry(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .ecrImageRepositoryName(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .ecrImageTags(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .epssScore(List.of(NumberFilterProperty.builder()
   * .lowerInclusive(123)
   * .upperInclusive(123)
   * .build()))
   * .exploitAvailable(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .findingArn(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .findingStatus(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .findingType(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .firstObservedAt(List.of(DateFilterProperty.builder()
   * .endInclusive(123)
   * .startInclusive(123)
   * .build()))
   * .fixAvailable(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .inspectorScore(List.of(NumberFilterProperty.builder()
   * .lowerInclusive(123)
   * .upperInclusive(123)
   * .build()))
   * .lambdaFunctionExecutionRoleArn(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .lambdaFunctionLastModifiedAt(List.of(DateFilterProperty.builder()
   * .endInclusive(123)
   * .startInclusive(123)
   * .build()))
   * .lambdaFunctionLayers(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .lambdaFunctionName(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .lambdaFunctionRuntime(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .lastObservedAt(List.of(DateFilterProperty.builder()
   * .endInclusive(123)
   * .startInclusive(123)
   * .build()))
   * .networkProtocol(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .portRange(List.of(PortRangeFilterProperty.builder()
   * .beginInclusive(123)
   * .endInclusive(123)
   * .build()))
   * .relatedVulnerabilities(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .resourceId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .resourceTags(List.of(MapFilterProperty.builder()
   * .comparison("comparison")
   * // the properties below are optional
   * .key("key")
   * .value("value")
   * .build()))
   * .resourceType(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .severity(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .title(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .updatedAt(List.of(DateFilterProperty.builder()
   * .endInclusive(123)
   * .startInclusive(123)
   * .build()))
   * .vendorSeverity(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .vulnerabilityId(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .vulnerabilitySource(List.of(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build()))
   * .vulnerablePackages(List.of(PackageFilterProperty.builder()
   * .architecture(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .epoch(NumberFilterProperty.builder()
   * .lowerInclusive(123)
   * .upperInclusive(123)
   * .build())
   * .filePath(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .name(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .release(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .sourceLambdaLayerArn(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .sourceLayerHash(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .version(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html)
   */
  public interface FilterCriteriaProperty {
    /**
     * Details of the AWS account IDs used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-awsaccountid)
     */
    public fun awsAccountId(): Any? = unwrap(this).getAwsAccountId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-codevulnerabilitydetectorname)
     */
    public fun codeVulnerabilityDetectorName(): Any? =
        unwrap(this).getCodeVulnerabilityDetectorName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-codevulnerabilitydetectortags)
     */
    public fun codeVulnerabilityDetectorTags(): Any? =
        unwrap(this).getCodeVulnerabilityDetectorTags()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-codevulnerabilityfilepath)
     */
    public fun codeVulnerabilityFilePath(): Any? = unwrap(this).getCodeVulnerabilityFilePath()

    /**
     * Details of the component IDs used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-componentid)
     */
    public fun componentId(): Any? = unwrap(this).getComponentId()

    /**
     * Details of the component types used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-componenttype)
     */
    public fun componentType(): Any? = unwrap(this).getComponentType()

    /**
     * Details of the Amazon EC2 instance image IDs used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ec2instanceimageid)
     */
    public fun ec2InstanceImageId(): Any? = unwrap(this).getEc2InstanceImageId()

    /**
     * Details of the Amazon EC2 instance subnet IDs used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ec2instancesubnetid)
     */
    public fun ec2InstanceSubnetId(): Any? = unwrap(this).getEc2InstanceSubnetId()

    /**
     * Details of the Amazon EC2 instance VPC IDs used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ec2instancevpcid)
     */
    public fun ec2InstanceVpcId(): Any? = unwrap(this).getEc2InstanceVpcId()

    /**
     * Details of the Amazon ECR image architecture types used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimagearchitecture)
     */
    public fun ecrImageArchitecture(): Any? = unwrap(this).getEcrImageArchitecture()

    /**
     * Details of the Amazon ECR image hashes used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimagehash)
     */
    public fun ecrImageHash(): Any? = unwrap(this).getEcrImageHash()

    /**
     * Details on the Amazon ECR image push date and time used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimagepushedat)
     */
    public fun ecrImagePushedAt(): Any? = unwrap(this).getEcrImagePushedAt()

    /**
     * Details on the Amazon ECR registry used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimageregistry)
     */
    public fun ecrImageRegistry(): Any? = unwrap(this).getEcrImageRegistry()

    /**
     * Details on the name of the Amazon ECR repository used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimagerepositoryname)
     */
    public fun ecrImageRepositoryName(): Any? = unwrap(this).getEcrImageRepositoryName()

    /**
     * The tags attached to the Amazon ECR container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimagetags)
     */
    public fun ecrImageTags(): Any? = unwrap(this).getEcrImageTags()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-epssscore)
     */
    public fun epssScore(): Any? = unwrap(this).getEpssScore()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-exploitavailable)
     */
    public fun exploitAvailable(): Any? = unwrap(this).getExploitAvailable()

    /**
     * Details on the finding ARNs used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-findingarn)
     */
    public fun findingArn(): Any? = unwrap(this).getFindingArn()

    /**
     * Details on the finding status types used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-findingstatus)
     */
    public fun findingStatus(): Any? = unwrap(this).getFindingStatus()

    /**
     * Details on the finding types used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-findingtype)
     */
    public fun findingType(): Any? = unwrap(this).getFindingType()

    /**
     * Details on the date and time a finding was first seen used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-firstobservedat)
     */
    public fun firstObservedAt(): Any? = unwrap(this).getFirstObservedAt()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-fixavailable)
     */
    public fun fixAvailable(): Any? = unwrap(this).getFixAvailable()

    /**
     * The Amazon Inspector score to filter on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-inspectorscore)
     */
    public fun inspectorScore(): Any? = unwrap(this).getInspectorScore()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lambdafunctionexecutionrolearn)
     */
    public fun lambdaFunctionExecutionRoleArn(): Any? =
        unwrap(this).getLambdaFunctionExecutionRoleArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lambdafunctionlastmodifiedat)
     */
    public fun lambdaFunctionLastModifiedAt(): Any? = unwrap(this).getLambdaFunctionLastModifiedAt()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lambdafunctionlayers)
     */
    public fun lambdaFunctionLayers(): Any? = unwrap(this).getLambdaFunctionLayers()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lambdafunctionname)
     */
    public fun lambdaFunctionName(): Any? = unwrap(this).getLambdaFunctionName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lambdafunctionruntime)
     */
    public fun lambdaFunctionRuntime(): Any? = unwrap(this).getLambdaFunctionRuntime()

    /**
     * Details on the date and time a finding was last seen used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lastobservedat)
     */
    public fun lastObservedAt(): Any? = unwrap(this).getLastObservedAt()

    /**
     * Details on network protocol used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-networkprotocol)
     */
    public fun networkProtocol(): Any? = unwrap(this).getNetworkProtocol()

    /**
     * Details on the port ranges used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-portrange)
     */
    public fun portRange(): Any? = unwrap(this).getPortRange()

    /**
     * Details on the related vulnerabilities used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-relatedvulnerabilities)
     */
    public fun relatedVulnerabilities(): Any? = unwrap(this).getRelatedVulnerabilities()

    /**
     * Details on the resource IDs used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-resourceid)
     */
    public fun resourceId(): Any? = unwrap(this).getResourceId()

    /**
     * Details on the resource tags used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-resourcetags)
     */
    public fun resourceTags(): Any? = unwrap(this).getResourceTags()

    /**
     * Details on the resource types used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-resourcetype)
     */
    public fun resourceType(): Any? = unwrap(this).getResourceType()

    /**
     * Details on the severity used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-severity)
     */
    public fun severity(): Any? = unwrap(this).getSeverity()

    /**
     * Details on the finding title used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-title)
     */
    public fun title(): Any? = unwrap(this).getTitle()

    /**
     * Details on the date and time a finding was last updated at used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-updatedat)
     */
    public fun updatedAt(): Any? = unwrap(this).getUpdatedAt()

    /**
     * Details on the vendor severity used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-vendorseverity)
     */
    public fun vendorSeverity(): Any? = unwrap(this).getVendorSeverity()

    /**
     * Details on the vulnerability ID used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-vulnerabilityid)
     */
    public fun vulnerabilityId(): Any? = unwrap(this).getVulnerabilityId()

    /**
     * Details on the vulnerability score to filter findings by.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-vulnerabilitysource)
     */
    public fun vulnerabilitySource(): Any? = unwrap(this).getVulnerabilitySource()

    /**
     * Details on the vulnerable packages used to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-vulnerablepackages)
     */
    public fun vulnerablePackages(): Any? = unwrap(this).getVulnerablePackages()

    /**
     * A builder for [FilterCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsAccountId Details of the AWS account IDs used to filter findings.
       */
      public fun awsAccountId(awsAccountId: IResolvable)

      /**
       * @param awsAccountId Details of the AWS account IDs used to filter findings.
       */
      public fun awsAccountId(awsAccountId: List<Any>)

      /**
       * @param awsAccountId Details of the AWS account IDs used to filter findings.
       */
      public fun awsAccountId(vararg awsAccountId: Any)

      /**
       * @param codeVulnerabilityDetectorName the value to be set.
       */
      public fun codeVulnerabilityDetectorName(codeVulnerabilityDetectorName: IResolvable)

      /**
       * @param codeVulnerabilityDetectorName the value to be set.
       */
      public fun codeVulnerabilityDetectorName(codeVulnerabilityDetectorName: List<Any>)

      /**
       * @param codeVulnerabilityDetectorName the value to be set.
       */
      public fun codeVulnerabilityDetectorName(vararg codeVulnerabilityDetectorName: Any)

      /**
       * @param codeVulnerabilityDetectorTags the value to be set.
       */
      public fun codeVulnerabilityDetectorTags(codeVulnerabilityDetectorTags: IResolvable)

      /**
       * @param codeVulnerabilityDetectorTags the value to be set.
       */
      public fun codeVulnerabilityDetectorTags(codeVulnerabilityDetectorTags: List<Any>)

      /**
       * @param codeVulnerabilityDetectorTags the value to be set.
       */
      public fun codeVulnerabilityDetectorTags(vararg codeVulnerabilityDetectorTags: Any)

      /**
       * @param codeVulnerabilityFilePath the value to be set.
       */
      public fun codeVulnerabilityFilePath(codeVulnerabilityFilePath: IResolvable)

      /**
       * @param codeVulnerabilityFilePath the value to be set.
       */
      public fun codeVulnerabilityFilePath(codeVulnerabilityFilePath: List<Any>)

      /**
       * @param codeVulnerabilityFilePath the value to be set.
       */
      public fun codeVulnerabilityFilePath(vararg codeVulnerabilityFilePath: Any)

      /**
       * @param componentId Details of the component IDs used to filter findings.
       */
      public fun componentId(componentId: IResolvable)

      /**
       * @param componentId Details of the component IDs used to filter findings.
       */
      public fun componentId(componentId: List<Any>)

      /**
       * @param componentId Details of the component IDs used to filter findings.
       */
      public fun componentId(vararg componentId: Any)

      /**
       * @param componentType Details of the component types used to filter findings.
       */
      public fun componentType(componentType: IResolvable)

      /**
       * @param componentType Details of the component types used to filter findings.
       */
      public fun componentType(componentType: List<Any>)

      /**
       * @param componentType Details of the component types used to filter findings.
       */
      public fun componentType(vararg componentType: Any)

      /**
       * @param ec2InstanceImageId Details of the Amazon EC2 instance image IDs used to filter
       * findings.
       */
      public fun ec2InstanceImageId(ec2InstanceImageId: IResolvable)

      /**
       * @param ec2InstanceImageId Details of the Amazon EC2 instance image IDs used to filter
       * findings.
       */
      public fun ec2InstanceImageId(ec2InstanceImageId: List<Any>)

      /**
       * @param ec2InstanceImageId Details of the Amazon EC2 instance image IDs used to filter
       * findings.
       */
      public fun ec2InstanceImageId(vararg ec2InstanceImageId: Any)

      /**
       * @param ec2InstanceSubnetId Details of the Amazon EC2 instance subnet IDs used to filter
       * findings.
       */
      public fun ec2InstanceSubnetId(ec2InstanceSubnetId: IResolvable)

      /**
       * @param ec2InstanceSubnetId Details of the Amazon EC2 instance subnet IDs used to filter
       * findings.
       */
      public fun ec2InstanceSubnetId(ec2InstanceSubnetId: List<Any>)

      /**
       * @param ec2InstanceSubnetId Details of the Amazon EC2 instance subnet IDs used to filter
       * findings.
       */
      public fun ec2InstanceSubnetId(vararg ec2InstanceSubnetId: Any)

      /**
       * @param ec2InstanceVpcId Details of the Amazon EC2 instance VPC IDs used to filter findings.
       */
      public fun ec2InstanceVpcId(ec2InstanceVpcId: IResolvable)

      /**
       * @param ec2InstanceVpcId Details of the Amazon EC2 instance VPC IDs used to filter findings.
       */
      public fun ec2InstanceVpcId(ec2InstanceVpcId: List<Any>)

      /**
       * @param ec2InstanceVpcId Details of the Amazon EC2 instance VPC IDs used to filter findings.
       */
      public fun ec2InstanceVpcId(vararg ec2InstanceVpcId: Any)

      /**
       * @param ecrImageArchitecture Details of the Amazon ECR image architecture types used to
       * filter findings.
       */
      public fun ecrImageArchitecture(ecrImageArchitecture: IResolvable)

      /**
       * @param ecrImageArchitecture Details of the Amazon ECR image architecture types used to
       * filter findings.
       */
      public fun ecrImageArchitecture(ecrImageArchitecture: List<Any>)

      /**
       * @param ecrImageArchitecture Details of the Amazon ECR image architecture types used to
       * filter findings.
       */
      public fun ecrImageArchitecture(vararg ecrImageArchitecture: Any)

      /**
       * @param ecrImageHash Details of the Amazon ECR image hashes used to filter findings.
       */
      public fun ecrImageHash(ecrImageHash: IResolvable)

      /**
       * @param ecrImageHash Details of the Amazon ECR image hashes used to filter findings.
       */
      public fun ecrImageHash(ecrImageHash: List<Any>)

      /**
       * @param ecrImageHash Details of the Amazon ECR image hashes used to filter findings.
       */
      public fun ecrImageHash(vararg ecrImageHash: Any)

      /**
       * @param ecrImagePushedAt Details on the Amazon ECR image push date and time used to filter
       * findings.
       */
      public fun ecrImagePushedAt(ecrImagePushedAt: IResolvable)

      /**
       * @param ecrImagePushedAt Details on the Amazon ECR image push date and time used to filter
       * findings.
       */
      public fun ecrImagePushedAt(ecrImagePushedAt: List<Any>)

      /**
       * @param ecrImagePushedAt Details on the Amazon ECR image push date and time used to filter
       * findings.
       */
      public fun ecrImagePushedAt(vararg ecrImagePushedAt: Any)

      /**
       * @param ecrImageRegistry Details on the Amazon ECR registry used to filter findings.
       */
      public fun ecrImageRegistry(ecrImageRegistry: IResolvable)

      /**
       * @param ecrImageRegistry Details on the Amazon ECR registry used to filter findings.
       */
      public fun ecrImageRegistry(ecrImageRegistry: List<Any>)

      /**
       * @param ecrImageRegistry Details on the Amazon ECR registry used to filter findings.
       */
      public fun ecrImageRegistry(vararg ecrImageRegistry: Any)

      /**
       * @param ecrImageRepositoryName Details on the name of the Amazon ECR repository used to
       * filter findings.
       */
      public fun ecrImageRepositoryName(ecrImageRepositoryName: IResolvable)

      /**
       * @param ecrImageRepositoryName Details on the name of the Amazon ECR repository used to
       * filter findings.
       */
      public fun ecrImageRepositoryName(ecrImageRepositoryName: List<Any>)

      /**
       * @param ecrImageRepositoryName Details on the name of the Amazon ECR repository used to
       * filter findings.
       */
      public fun ecrImageRepositoryName(vararg ecrImageRepositoryName: Any)

      /**
       * @param ecrImageTags The tags attached to the Amazon ECR container image.
       */
      public fun ecrImageTags(ecrImageTags: IResolvable)

      /**
       * @param ecrImageTags The tags attached to the Amazon ECR container image.
       */
      public fun ecrImageTags(ecrImageTags: List<Any>)

      /**
       * @param ecrImageTags The tags attached to the Amazon ECR container image.
       */
      public fun ecrImageTags(vararg ecrImageTags: Any)

      /**
       * @param epssScore the value to be set.
       */
      public fun epssScore(epssScore: IResolvable)

      /**
       * @param epssScore the value to be set.
       */
      public fun epssScore(epssScore: List<Any>)

      /**
       * @param epssScore the value to be set.
       */
      public fun epssScore(vararg epssScore: Any)

      /**
       * @param exploitAvailable the value to be set.
       */
      public fun exploitAvailable(exploitAvailable: IResolvable)

      /**
       * @param exploitAvailable the value to be set.
       */
      public fun exploitAvailable(exploitAvailable: List<Any>)

      /**
       * @param exploitAvailable the value to be set.
       */
      public fun exploitAvailable(vararg exploitAvailable: Any)

      /**
       * @param findingArn Details on the finding ARNs used to filter findings.
       */
      public fun findingArn(findingArn: IResolvable)

      /**
       * @param findingArn Details on the finding ARNs used to filter findings.
       */
      public fun findingArn(findingArn: List<Any>)

      /**
       * @param findingArn Details on the finding ARNs used to filter findings.
       */
      public fun findingArn(vararg findingArn: Any)

      /**
       * @param findingStatus Details on the finding status types used to filter findings.
       */
      public fun findingStatus(findingStatus: IResolvable)

      /**
       * @param findingStatus Details on the finding status types used to filter findings.
       */
      public fun findingStatus(findingStatus: List<Any>)

      /**
       * @param findingStatus Details on the finding status types used to filter findings.
       */
      public fun findingStatus(vararg findingStatus: Any)

      /**
       * @param findingType Details on the finding types used to filter findings.
       */
      public fun findingType(findingType: IResolvable)

      /**
       * @param findingType Details on the finding types used to filter findings.
       */
      public fun findingType(findingType: List<Any>)

      /**
       * @param findingType Details on the finding types used to filter findings.
       */
      public fun findingType(vararg findingType: Any)

      /**
       * @param firstObservedAt Details on the date and time a finding was first seen used to filter
       * findings.
       */
      public fun firstObservedAt(firstObservedAt: IResolvable)

      /**
       * @param firstObservedAt Details on the date and time a finding was first seen used to filter
       * findings.
       */
      public fun firstObservedAt(firstObservedAt: List<Any>)

      /**
       * @param firstObservedAt Details on the date and time a finding was first seen used to filter
       * findings.
       */
      public fun firstObservedAt(vararg firstObservedAt: Any)

      /**
       * @param fixAvailable the value to be set.
       */
      public fun fixAvailable(fixAvailable: IResolvable)

      /**
       * @param fixAvailable the value to be set.
       */
      public fun fixAvailable(fixAvailable: List<Any>)

      /**
       * @param fixAvailable the value to be set.
       */
      public fun fixAvailable(vararg fixAvailable: Any)

      /**
       * @param inspectorScore The Amazon Inspector score to filter on.
       */
      public fun inspectorScore(inspectorScore: IResolvable)

      /**
       * @param inspectorScore The Amazon Inspector score to filter on.
       */
      public fun inspectorScore(inspectorScore: List<Any>)

      /**
       * @param inspectorScore The Amazon Inspector score to filter on.
       */
      public fun inspectorScore(vararg inspectorScore: Any)

      /**
       * @param lambdaFunctionExecutionRoleArn the value to be set.
       */
      public fun lambdaFunctionExecutionRoleArn(lambdaFunctionExecutionRoleArn: IResolvable)

      /**
       * @param lambdaFunctionExecutionRoleArn the value to be set.
       */
      public fun lambdaFunctionExecutionRoleArn(lambdaFunctionExecutionRoleArn: List<Any>)

      /**
       * @param lambdaFunctionExecutionRoleArn the value to be set.
       */
      public fun lambdaFunctionExecutionRoleArn(vararg lambdaFunctionExecutionRoleArn: Any)

      /**
       * @param lambdaFunctionLastModifiedAt the value to be set.
       */
      public fun lambdaFunctionLastModifiedAt(lambdaFunctionLastModifiedAt: IResolvable)

      /**
       * @param lambdaFunctionLastModifiedAt the value to be set.
       */
      public fun lambdaFunctionLastModifiedAt(lambdaFunctionLastModifiedAt: List<Any>)

      /**
       * @param lambdaFunctionLastModifiedAt the value to be set.
       */
      public fun lambdaFunctionLastModifiedAt(vararg lambdaFunctionLastModifiedAt: Any)

      /**
       * @param lambdaFunctionLayers the value to be set.
       */
      public fun lambdaFunctionLayers(lambdaFunctionLayers: IResolvable)

      /**
       * @param lambdaFunctionLayers the value to be set.
       */
      public fun lambdaFunctionLayers(lambdaFunctionLayers: List<Any>)

      /**
       * @param lambdaFunctionLayers the value to be set.
       */
      public fun lambdaFunctionLayers(vararg lambdaFunctionLayers: Any)

      /**
       * @param lambdaFunctionName the value to be set.
       */
      public fun lambdaFunctionName(lambdaFunctionName: IResolvable)

      /**
       * @param lambdaFunctionName the value to be set.
       */
      public fun lambdaFunctionName(lambdaFunctionName: List<Any>)

      /**
       * @param lambdaFunctionName the value to be set.
       */
      public fun lambdaFunctionName(vararg lambdaFunctionName: Any)

      /**
       * @param lambdaFunctionRuntime the value to be set.
       */
      public fun lambdaFunctionRuntime(lambdaFunctionRuntime: IResolvable)

      /**
       * @param lambdaFunctionRuntime the value to be set.
       */
      public fun lambdaFunctionRuntime(lambdaFunctionRuntime: List<Any>)

      /**
       * @param lambdaFunctionRuntime the value to be set.
       */
      public fun lambdaFunctionRuntime(vararg lambdaFunctionRuntime: Any)

      /**
       * @param lastObservedAt Details on the date and time a finding was last seen used to filter
       * findings.
       */
      public fun lastObservedAt(lastObservedAt: IResolvable)

      /**
       * @param lastObservedAt Details on the date and time a finding was last seen used to filter
       * findings.
       */
      public fun lastObservedAt(lastObservedAt: List<Any>)

      /**
       * @param lastObservedAt Details on the date and time a finding was last seen used to filter
       * findings.
       */
      public fun lastObservedAt(vararg lastObservedAt: Any)

      /**
       * @param networkProtocol Details on network protocol used to filter findings.
       */
      public fun networkProtocol(networkProtocol: IResolvable)

      /**
       * @param networkProtocol Details on network protocol used to filter findings.
       */
      public fun networkProtocol(networkProtocol: List<Any>)

      /**
       * @param networkProtocol Details on network protocol used to filter findings.
       */
      public fun networkProtocol(vararg networkProtocol: Any)

      /**
       * @param portRange Details on the port ranges used to filter findings.
       */
      public fun portRange(portRange: IResolvable)

      /**
       * @param portRange Details on the port ranges used to filter findings.
       */
      public fun portRange(portRange: List<Any>)

      /**
       * @param portRange Details on the port ranges used to filter findings.
       */
      public fun portRange(vararg portRange: Any)

      /**
       * @param relatedVulnerabilities Details on the related vulnerabilities used to filter
       * findings.
       */
      public fun relatedVulnerabilities(relatedVulnerabilities: IResolvable)

      /**
       * @param relatedVulnerabilities Details on the related vulnerabilities used to filter
       * findings.
       */
      public fun relatedVulnerabilities(relatedVulnerabilities: List<Any>)

      /**
       * @param relatedVulnerabilities Details on the related vulnerabilities used to filter
       * findings.
       */
      public fun relatedVulnerabilities(vararg relatedVulnerabilities: Any)

      /**
       * @param resourceId Details on the resource IDs used to filter findings.
       */
      public fun resourceId(resourceId: IResolvable)

      /**
       * @param resourceId Details on the resource IDs used to filter findings.
       */
      public fun resourceId(resourceId: List<Any>)

      /**
       * @param resourceId Details on the resource IDs used to filter findings.
       */
      public fun resourceId(vararg resourceId: Any)

      /**
       * @param resourceTags Details on the resource tags used to filter findings.
       */
      public fun resourceTags(resourceTags: IResolvable)

      /**
       * @param resourceTags Details on the resource tags used to filter findings.
       */
      public fun resourceTags(resourceTags: List<Any>)

      /**
       * @param resourceTags Details on the resource tags used to filter findings.
       */
      public fun resourceTags(vararg resourceTags: Any)

      /**
       * @param resourceType Details on the resource types used to filter findings.
       */
      public fun resourceType(resourceType: IResolvable)

      /**
       * @param resourceType Details on the resource types used to filter findings.
       */
      public fun resourceType(resourceType: List<Any>)

      /**
       * @param resourceType Details on the resource types used to filter findings.
       */
      public fun resourceType(vararg resourceType: Any)

      /**
       * @param severity Details on the severity used to filter findings.
       */
      public fun severity(severity: IResolvable)

      /**
       * @param severity Details on the severity used to filter findings.
       */
      public fun severity(severity: List<Any>)

      /**
       * @param severity Details on the severity used to filter findings.
       */
      public fun severity(vararg severity: Any)

      /**
       * @param title Details on the finding title used to filter findings.
       */
      public fun title(title: IResolvable)

      /**
       * @param title Details on the finding title used to filter findings.
       */
      public fun title(title: List<Any>)

      /**
       * @param title Details on the finding title used to filter findings.
       */
      public fun title(vararg title: Any)

      /**
       * @param updatedAt Details on the date and time a finding was last updated at used to filter
       * findings.
       */
      public fun updatedAt(updatedAt: IResolvable)

      /**
       * @param updatedAt Details on the date and time a finding was last updated at used to filter
       * findings.
       */
      public fun updatedAt(updatedAt: List<Any>)

      /**
       * @param updatedAt Details on the date and time a finding was last updated at used to filter
       * findings.
       */
      public fun updatedAt(vararg updatedAt: Any)

      /**
       * @param vendorSeverity Details on the vendor severity used to filter findings.
       */
      public fun vendorSeverity(vendorSeverity: IResolvable)

      /**
       * @param vendorSeverity Details on the vendor severity used to filter findings.
       */
      public fun vendorSeverity(vendorSeverity: List<Any>)

      /**
       * @param vendorSeverity Details on the vendor severity used to filter findings.
       */
      public fun vendorSeverity(vararg vendorSeverity: Any)

      /**
       * @param vulnerabilityId Details on the vulnerability ID used to filter findings.
       */
      public fun vulnerabilityId(vulnerabilityId: IResolvable)

      /**
       * @param vulnerabilityId Details on the vulnerability ID used to filter findings.
       */
      public fun vulnerabilityId(vulnerabilityId: List<Any>)

      /**
       * @param vulnerabilityId Details on the vulnerability ID used to filter findings.
       */
      public fun vulnerabilityId(vararg vulnerabilityId: Any)

      /**
       * @param vulnerabilitySource Details on the vulnerability score to filter findings by.
       */
      public fun vulnerabilitySource(vulnerabilitySource: IResolvable)

      /**
       * @param vulnerabilitySource Details on the vulnerability score to filter findings by.
       */
      public fun vulnerabilitySource(vulnerabilitySource: List<Any>)

      /**
       * @param vulnerabilitySource Details on the vulnerability score to filter findings by.
       */
      public fun vulnerabilitySource(vararg vulnerabilitySource: Any)

      /**
       * @param vulnerablePackages Details on the vulnerable packages used to filter findings.
       */
      public fun vulnerablePackages(vulnerablePackages: IResolvable)

      /**
       * @param vulnerablePackages Details on the vulnerable packages used to filter findings.
       */
      public fun vulnerablePackages(vulnerablePackages: List<Any>)

      /**
       * @param vulnerablePackages Details on the vulnerable packages used to filter findings.
       */
      public fun vulnerablePackages(vararg vulnerablePackages: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty.builder()

      /**
       * @param awsAccountId Details of the AWS account IDs used to filter findings.
       */
      override fun awsAccountId(awsAccountId: IResolvable) {
        cdkBuilder.awsAccountId(awsAccountId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsAccountId Details of the AWS account IDs used to filter findings.
       */
      override fun awsAccountId(awsAccountId: List<Any>) {
        cdkBuilder.awsAccountId(awsAccountId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param awsAccountId Details of the AWS account IDs used to filter findings.
       */
      override fun awsAccountId(vararg awsAccountId: Any): Unit =
          awsAccountId(awsAccountId.toList())

      /**
       * @param codeVulnerabilityDetectorName the value to be set.
       */
      override fun codeVulnerabilityDetectorName(codeVulnerabilityDetectorName: IResolvable) {
        cdkBuilder.codeVulnerabilityDetectorName(codeVulnerabilityDetectorName.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeVulnerabilityDetectorName the value to be set.
       */
      override fun codeVulnerabilityDetectorName(codeVulnerabilityDetectorName: List<Any>) {
        cdkBuilder.codeVulnerabilityDetectorName(codeVulnerabilityDetectorName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param codeVulnerabilityDetectorName the value to be set.
       */
      override fun codeVulnerabilityDetectorName(vararg codeVulnerabilityDetectorName: Any): Unit =
          codeVulnerabilityDetectorName(codeVulnerabilityDetectorName.toList())

      /**
       * @param codeVulnerabilityDetectorTags the value to be set.
       */
      override fun codeVulnerabilityDetectorTags(codeVulnerabilityDetectorTags: IResolvable) {
        cdkBuilder.codeVulnerabilityDetectorTags(codeVulnerabilityDetectorTags.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeVulnerabilityDetectorTags the value to be set.
       */
      override fun codeVulnerabilityDetectorTags(codeVulnerabilityDetectorTags: List<Any>) {
        cdkBuilder.codeVulnerabilityDetectorTags(codeVulnerabilityDetectorTags.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param codeVulnerabilityDetectorTags the value to be set.
       */
      override fun codeVulnerabilityDetectorTags(vararg codeVulnerabilityDetectorTags: Any): Unit =
          codeVulnerabilityDetectorTags(codeVulnerabilityDetectorTags.toList())

      /**
       * @param codeVulnerabilityFilePath the value to be set.
       */
      override fun codeVulnerabilityFilePath(codeVulnerabilityFilePath: IResolvable) {
        cdkBuilder.codeVulnerabilityFilePath(codeVulnerabilityFilePath.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeVulnerabilityFilePath the value to be set.
       */
      override fun codeVulnerabilityFilePath(codeVulnerabilityFilePath: List<Any>) {
        cdkBuilder.codeVulnerabilityFilePath(codeVulnerabilityFilePath.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param codeVulnerabilityFilePath the value to be set.
       */
      override fun codeVulnerabilityFilePath(vararg codeVulnerabilityFilePath: Any): Unit =
          codeVulnerabilityFilePath(codeVulnerabilityFilePath.toList())

      /**
       * @param componentId Details of the component IDs used to filter findings.
       */
      override fun componentId(componentId: IResolvable) {
        cdkBuilder.componentId(componentId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param componentId Details of the component IDs used to filter findings.
       */
      override fun componentId(componentId: List<Any>) {
        cdkBuilder.componentId(componentId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param componentId Details of the component IDs used to filter findings.
       */
      override fun componentId(vararg componentId: Any): Unit = componentId(componentId.toList())

      /**
       * @param componentType Details of the component types used to filter findings.
       */
      override fun componentType(componentType: IResolvable) {
        cdkBuilder.componentType(componentType.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param componentType Details of the component types used to filter findings.
       */
      override fun componentType(componentType: List<Any>) {
        cdkBuilder.componentType(componentType.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param componentType Details of the component types used to filter findings.
       */
      override fun componentType(vararg componentType: Any): Unit =
          componentType(componentType.toList())

      /**
       * @param ec2InstanceImageId Details of the Amazon EC2 instance image IDs used to filter
       * findings.
       */
      override fun ec2InstanceImageId(ec2InstanceImageId: IResolvable) {
        cdkBuilder.ec2InstanceImageId(ec2InstanceImageId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ec2InstanceImageId Details of the Amazon EC2 instance image IDs used to filter
       * findings.
       */
      override fun ec2InstanceImageId(ec2InstanceImageId: List<Any>) {
        cdkBuilder.ec2InstanceImageId(ec2InstanceImageId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ec2InstanceImageId Details of the Amazon EC2 instance image IDs used to filter
       * findings.
       */
      override fun ec2InstanceImageId(vararg ec2InstanceImageId: Any): Unit =
          ec2InstanceImageId(ec2InstanceImageId.toList())

      /**
       * @param ec2InstanceSubnetId Details of the Amazon EC2 instance subnet IDs used to filter
       * findings.
       */
      override fun ec2InstanceSubnetId(ec2InstanceSubnetId: IResolvable) {
        cdkBuilder.ec2InstanceSubnetId(ec2InstanceSubnetId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ec2InstanceSubnetId Details of the Amazon EC2 instance subnet IDs used to filter
       * findings.
       */
      override fun ec2InstanceSubnetId(ec2InstanceSubnetId: List<Any>) {
        cdkBuilder.ec2InstanceSubnetId(ec2InstanceSubnetId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ec2InstanceSubnetId Details of the Amazon EC2 instance subnet IDs used to filter
       * findings.
       */
      override fun ec2InstanceSubnetId(vararg ec2InstanceSubnetId: Any): Unit =
          ec2InstanceSubnetId(ec2InstanceSubnetId.toList())

      /**
       * @param ec2InstanceVpcId Details of the Amazon EC2 instance VPC IDs used to filter findings.
       */
      override fun ec2InstanceVpcId(ec2InstanceVpcId: IResolvable) {
        cdkBuilder.ec2InstanceVpcId(ec2InstanceVpcId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ec2InstanceVpcId Details of the Amazon EC2 instance VPC IDs used to filter findings.
       */
      override fun ec2InstanceVpcId(ec2InstanceVpcId: List<Any>) {
        cdkBuilder.ec2InstanceVpcId(ec2InstanceVpcId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ec2InstanceVpcId Details of the Amazon EC2 instance VPC IDs used to filter findings.
       */
      override fun ec2InstanceVpcId(vararg ec2InstanceVpcId: Any): Unit =
          ec2InstanceVpcId(ec2InstanceVpcId.toList())

      /**
       * @param ecrImageArchitecture Details of the Amazon ECR image architecture types used to
       * filter findings.
       */
      override fun ecrImageArchitecture(ecrImageArchitecture: IResolvable) {
        cdkBuilder.ecrImageArchitecture(ecrImageArchitecture.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ecrImageArchitecture Details of the Amazon ECR image architecture types used to
       * filter findings.
       */
      override fun ecrImageArchitecture(ecrImageArchitecture: List<Any>) {
        cdkBuilder.ecrImageArchitecture(ecrImageArchitecture.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ecrImageArchitecture Details of the Amazon ECR image architecture types used to
       * filter findings.
       */
      override fun ecrImageArchitecture(vararg ecrImageArchitecture: Any): Unit =
          ecrImageArchitecture(ecrImageArchitecture.toList())

      /**
       * @param ecrImageHash Details of the Amazon ECR image hashes used to filter findings.
       */
      override fun ecrImageHash(ecrImageHash: IResolvable) {
        cdkBuilder.ecrImageHash(ecrImageHash.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ecrImageHash Details of the Amazon ECR image hashes used to filter findings.
       */
      override fun ecrImageHash(ecrImageHash: List<Any>) {
        cdkBuilder.ecrImageHash(ecrImageHash.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ecrImageHash Details of the Amazon ECR image hashes used to filter findings.
       */
      override fun ecrImageHash(vararg ecrImageHash: Any): Unit =
          ecrImageHash(ecrImageHash.toList())

      /**
       * @param ecrImagePushedAt Details on the Amazon ECR image push date and time used to filter
       * findings.
       */
      override fun ecrImagePushedAt(ecrImagePushedAt: IResolvable) {
        cdkBuilder.ecrImagePushedAt(ecrImagePushedAt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ecrImagePushedAt Details on the Amazon ECR image push date and time used to filter
       * findings.
       */
      override fun ecrImagePushedAt(ecrImagePushedAt: List<Any>) {
        cdkBuilder.ecrImagePushedAt(ecrImagePushedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ecrImagePushedAt Details on the Amazon ECR image push date and time used to filter
       * findings.
       */
      override fun ecrImagePushedAt(vararg ecrImagePushedAt: Any): Unit =
          ecrImagePushedAt(ecrImagePushedAt.toList())

      /**
       * @param ecrImageRegistry Details on the Amazon ECR registry used to filter findings.
       */
      override fun ecrImageRegistry(ecrImageRegistry: IResolvable) {
        cdkBuilder.ecrImageRegistry(ecrImageRegistry.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ecrImageRegistry Details on the Amazon ECR registry used to filter findings.
       */
      override fun ecrImageRegistry(ecrImageRegistry: List<Any>) {
        cdkBuilder.ecrImageRegistry(ecrImageRegistry.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ecrImageRegistry Details on the Amazon ECR registry used to filter findings.
       */
      override fun ecrImageRegistry(vararg ecrImageRegistry: Any): Unit =
          ecrImageRegistry(ecrImageRegistry.toList())

      /**
       * @param ecrImageRepositoryName Details on the name of the Amazon ECR repository used to
       * filter findings.
       */
      override fun ecrImageRepositoryName(ecrImageRepositoryName: IResolvable) {
        cdkBuilder.ecrImageRepositoryName(ecrImageRepositoryName.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ecrImageRepositoryName Details on the name of the Amazon ECR repository used to
       * filter findings.
       */
      override fun ecrImageRepositoryName(ecrImageRepositoryName: List<Any>) {
        cdkBuilder.ecrImageRepositoryName(ecrImageRepositoryName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ecrImageRepositoryName Details on the name of the Amazon ECR repository used to
       * filter findings.
       */
      override fun ecrImageRepositoryName(vararg ecrImageRepositoryName: Any): Unit =
          ecrImageRepositoryName(ecrImageRepositoryName.toList())

      /**
       * @param ecrImageTags The tags attached to the Amazon ECR container image.
       */
      override fun ecrImageTags(ecrImageTags: IResolvable) {
        cdkBuilder.ecrImageTags(ecrImageTags.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ecrImageTags The tags attached to the Amazon ECR container image.
       */
      override fun ecrImageTags(ecrImageTags: List<Any>) {
        cdkBuilder.ecrImageTags(ecrImageTags.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ecrImageTags The tags attached to the Amazon ECR container image.
       */
      override fun ecrImageTags(vararg ecrImageTags: Any): Unit =
          ecrImageTags(ecrImageTags.toList())

      /**
       * @param epssScore the value to be set.
       */
      override fun epssScore(epssScore: IResolvable) {
        cdkBuilder.epssScore(epssScore.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param epssScore the value to be set.
       */
      override fun epssScore(epssScore: List<Any>) {
        cdkBuilder.epssScore(epssScore.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param epssScore the value to be set.
       */
      override fun epssScore(vararg epssScore: Any): Unit = epssScore(epssScore.toList())

      /**
       * @param exploitAvailable the value to be set.
       */
      override fun exploitAvailable(exploitAvailable: IResolvable) {
        cdkBuilder.exploitAvailable(exploitAvailable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param exploitAvailable the value to be set.
       */
      override fun exploitAvailable(exploitAvailable: List<Any>) {
        cdkBuilder.exploitAvailable(exploitAvailable.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param exploitAvailable the value to be set.
       */
      override fun exploitAvailable(vararg exploitAvailable: Any): Unit =
          exploitAvailable(exploitAvailable.toList())

      /**
       * @param findingArn Details on the finding ARNs used to filter findings.
       */
      override fun findingArn(findingArn: IResolvable) {
        cdkBuilder.findingArn(findingArn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param findingArn Details on the finding ARNs used to filter findings.
       */
      override fun findingArn(findingArn: List<Any>) {
        cdkBuilder.findingArn(findingArn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param findingArn Details on the finding ARNs used to filter findings.
       */
      override fun findingArn(vararg findingArn: Any): Unit = findingArn(findingArn.toList())

      /**
       * @param findingStatus Details on the finding status types used to filter findings.
       */
      override fun findingStatus(findingStatus: IResolvable) {
        cdkBuilder.findingStatus(findingStatus.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param findingStatus Details on the finding status types used to filter findings.
       */
      override fun findingStatus(findingStatus: List<Any>) {
        cdkBuilder.findingStatus(findingStatus.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param findingStatus Details on the finding status types used to filter findings.
       */
      override fun findingStatus(vararg findingStatus: Any): Unit =
          findingStatus(findingStatus.toList())

      /**
       * @param findingType Details on the finding types used to filter findings.
       */
      override fun findingType(findingType: IResolvable) {
        cdkBuilder.findingType(findingType.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param findingType Details on the finding types used to filter findings.
       */
      override fun findingType(findingType: List<Any>) {
        cdkBuilder.findingType(findingType.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param findingType Details on the finding types used to filter findings.
       */
      override fun findingType(vararg findingType: Any): Unit = findingType(findingType.toList())

      /**
       * @param firstObservedAt Details on the date and time a finding was first seen used to filter
       * findings.
       */
      override fun firstObservedAt(firstObservedAt: IResolvable) {
        cdkBuilder.firstObservedAt(firstObservedAt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param firstObservedAt Details on the date and time a finding was first seen used to filter
       * findings.
       */
      override fun firstObservedAt(firstObservedAt: List<Any>) {
        cdkBuilder.firstObservedAt(firstObservedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param firstObservedAt Details on the date and time a finding was first seen used to filter
       * findings.
       */
      override fun firstObservedAt(vararg firstObservedAt: Any): Unit =
          firstObservedAt(firstObservedAt.toList())

      /**
       * @param fixAvailable the value to be set.
       */
      override fun fixAvailable(fixAvailable: IResolvable) {
        cdkBuilder.fixAvailable(fixAvailable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fixAvailable the value to be set.
       */
      override fun fixAvailable(fixAvailable: List<Any>) {
        cdkBuilder.fixAvailable(fixAvailable.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param fixAvailable the value to be set.
       */
      override fun fixAvailable(vararg fixAvailable: Any): Unit =
          fixAvailable(fixAvailable.toList())

      /**
       * @param inspectorScore The Amazon Inspector score to filter on.
       */
      override fun inspectorScore(inspectorScore: IResolvable) {
        cdkBuilder.inspectorScore(inspectorScore.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inspectorScore The Amazon Inspector score to filter on.
       */
      override fun inspectorScore(inspectorScore: List<Any>) {
        cdkBuilder.inspectorScore(inspectorScore.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inspectorScore The Amazon Inspector score to filter on.
       */
      override fun inspectorScore(vararg inspectorScore: Any): Unit =
          inspectorScore(inspectorScore.toList())

      /**
       * @param lambdaFunctionExecutionRoleArn the value to be set.
       */
      override fun lambdaFunctionExecutionRoleArn(lambdaFunctionExecutionRoleArn: IResolvable) {
        cdkBuilder.lambdaFunctionExecutionRoleArn(lambdaFunctionExecutionRoleArn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambdaFunctionExecutionRoleArn the value to be set.
       */
      override fun lambdaFunctionExecutionRoleArn(lambdaFunctionExecutionRoleArn: List<Any>) {
        cdkBuilder.lambdaFunctionExecutionRoleArn(lambdaFunctionExecutionRoleArn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param lambdaFunctionExecutionRoleArn the value to be set.
       */
      override fun lambdaFunctionExecutionRoleArn(vararg lambdaFunctionExecutionRoleArn: Any): Unit
          = lambdaFunctionExecutionRoleArn(lambdaFunctionExecutionRoleArn.toList())

      /**
       * @param lambdaFunctionLastModifiedAt the value to be set.
       */
      override fun lambdaFunctionLastModifiedAt(lambdaFunctionLastModifiedAt: IResolvable) {
        cdkBuilder.lambdaFunctionLastModifiedAt(lambdaFunctionLastModifiedAt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambdaFunctionLastModifiedAt the value to be set.
       */
      override fun lambdaFunctionLastModifiedAt(lambdaFunctionLastModifiedAt: List<Any>) {
        cdkBuilder.lambdaFunctionLastModifiedAt(lambdaFunctionLastModifiedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param lambdaFunctionLastModifiedAt the value to be set.
       */
      override fun lambdaFunctionLastModifiedAt(vararg lambdaFunctionLastModifiedAt: Any): Unit =
          lambdaFunctionLastModifiedAt(lambdaFunctionLastModifiedAt.toList())

      /**
       * @param lambdaFunctionLayers the value to be set.
       */
      override fun lambdaFunctionLayers(lambdaFunctionLayers: IResolvable) {
        cdkBuilder.lambdaFunctionLayers(lambdaFunctionLayers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambdaFunctionLayers the value to be set.
       */
      override fun lambdaFunctionLayers(lambdaFunctionLayers: List<Any>) {
        cdkBuilder.lambdaFunctionLayers(lambdaFunctionLayers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param lambdaFunctionLayers the value to be set.
       */
      override fun lambdaFunctionLayers(vararg lambdaFunctionLayers: Any): Unit =
          lambdaFunctionLayers(lambdaFunctionLayers.toList())

      /**
       * @param lambdaFunctionName the value to be set.
       */
      override fun lambdaFunctionName(lambdaFunctionName: IResolvable) {
        cdkBuilder.lambdaFunctionName(lambdaFunctionName.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambdaFunctionName the value to be set.
       */
      override fun lambdaFunctionName(lambdaFunctionName: List<Any>) {
        cdkBuilder.lambdaFunctionName(lambdaFunctionName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param lambdaFunctionName the value to be set.
       */
      override fun lambdaFunctionName(vararg lambdaFunctionName: Any): Unit =
          lambdaFunctionName(lambdaFunctionName.toList())

      /**
       * @param lambdaFunctionRuntime the value to be set.
       */
      override fun lambdaFunctionRuntime(lambdaFunctionRuntime: IResolvable) {
        cdkBuilder.lambdaFunctionRuntime(lambdaFunctionRuntime.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambdaFunctionRuntime the value to be set.
       */
      override fun lambdaFunctionRuntime(lambdaFunctionRuntime: List<Any>) {
        cdkBuilder.lambdaFunctionRuntime(lambdaFunctionRuntime.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param lambdaFunctionRuntime the value to be set.
       */
      override fun lambdaFunctionRuntime(vararg lambdaFunctionRuntime: Any): Unit =
          lambdaFunctionRuntime(lambdaFunctionRuntime.toList())

      /**
       * @param lastObservedAt Details on the date and time a finding was last seen used to filter
       * findings.
       */
      override fun lastObservedAt(lastObservedAt: IResolvable) {
        cdkBuilder.lastObservedAt(lastObservedAt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lastObservedAt Details on the date and time a finding was last seen used to filter
       * findings.
       */
      override fun lastObservedAt(lastObservedAt: List<Any>) {
        cdkBuilder.lastObservedAt(lastObservedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param lastObservedAt Details on the date and time a finding was last seen used to filter
       * findings.
       */
      override fun lastObservedAt(vararg lastObservedAt: Any): Unit =
          lastObservedAt(lastObservedAt.toList())

      /**
       * @param networkProtocol Details on network protocol used to filter findings.
       */
      override fun networkProtocol(networkProtocol: IResolvable) {
        cdkBuilder.networkProtocol(networkProtocol.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param networkProtocol Details on network protocol used to filter findings.
       */
      override fun networkProtocol(networkProtocol: List<Any>) {
        cdkBuilder.networkProtocol(networkProtocol.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkProtocol Details on network protocol used to filter findings.
       */
      override fun networkProtocol(vararg networkProtocol: Any): Unit =
          networkProtocol(networkProtocol.toList())

      /**
       * @param portRange Details on the port ranges used to filter findings.
       */
      override fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param portRange Details on the port ranges used to filter findings.
       */
      override fun portRange(portRange: List<Any>) {
        cdkBuilder.portRange(portRange.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param portRange Details on the port ranges used to filter findings.
       */
      override fun portRange(vararg portRange: Any): Unit = portRange(portRange.toList())

      /**
       * @param relatedVulnerabilities Details on the related vulnerabilities used to filter
       * findings.
       */
      override fun relatedVulnerabilities(relatedVulnerabilities: IResolvable) {
        cdkBuilder.relatedVulnerabilities(relatedVulnerabilities.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param relatedVulnerabilities Details on the related vulnerabilities used to filter
       * findings.
       */
      override fun relatedVulnerabilities(relatedVulnerabilities: List<Any>) {
        cdkBuilder.relatedVulnerabilities(relatedVulnerabilities.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param relatedVulnerabilities Details on the related vulnerabilities used to filter
       * findings.
       */
      override fun relatedVulnerabilities(vararg relatedVulnerabilities: Any): Unit =
          relatedVulnerabilities(relatedVulnerabilities.toList())

      /**
       * @param resourceId Details on the resource IDs used to filter findings.
       */
      override fun resourceId(resourceId: IResolvable) {
        cdkBuilder.resourceId(resourceId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceId Details on the resource IDs used to filter findings.
       */
      override fun resourceId(resourceId: List<Any>) {
        cdkBuilder.resourceId(resourceId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceId Details on the resource IDs used to filter findings.
       */
      override fun resourceId(vararg resourceId: Any): Unit = resourceId(resourceId.toList())

      /**
       * @param resourceTags Details on the resource tags used to filter findings.
       */
      override fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceTags Details on the resource tags used to filter findings.
       */
      override fun resourceTags(resourceTags: List<Any>) {
        cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceTags Details on the resource tags used to filter findings.
       */
      override fun resourceTags(vararg resourceTags: Any): Unit =
          resourceTags(resourceTags.toList())

      /**
       * @param resourceType Details on the resource types used to filter findings.
       */
      override fun resourceType(resourceType: IResolvable) {
        cdkBuilder.resourceType(resourceType.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceType Details on the resource types used to filter findings.
       */
      override fun resourceType(resourceType: List<Any>) {
        cdkBuilder.resourceType(resourceType.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceType Details on the resource types used to filter findings.
       */
      override fun resourceType(vararg resourceType: Any): Unit =
          resourceType(resourceType.toList())

      /**
       * @param severity Details on the severity used to filter findings.
       */
      override fun severity(severity: IResolvable) {
        cdkBuilder.severity(severity.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param severity Details on the severity used to filter findings.
       */
      override fun severity(severity: List<Any>) {
        cdkBuilder.severity(severity.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param severity Details on the severity used to filter findings.
       */
      override fun severity(vararg severity: Any): Unit = severity(severity.toList())

      /**
       * @param title Details on the finding title used to filter findings.
       */
      override fun title(title: IResolvable) {
        cdkBuilder.title(title.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param title Details on the finding title used to filter findings.
       */
      override fun title(title: List<Any>) {
        cdkBuilder.title(title.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param title Details on the finding title used to filter findings.
       */
      override fun title(vararg title: Any): Unit = title(title.toList())

      /**
       * @param updatedAt Details on the date and time a finding was last updated at used to filter
       * findings.
       */
      override fun updatedAt(updatedAt: IResolvable) {
        cdkBuilder.updatedAt(updatedAt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param updatedAt Details on the date and time a finding was last updated at used to filter
       * findings.
       */
      override fun updatedAt(updatedAt: List<Any>) {
        cdkBuilder.updatedAt(updatedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param updatedAt Details on the date and time a finding was last updated at used to filter
       * findings.
       */
      override fun updatedAt(vararg updatedAt: Any): Unit = updatedAt(updatedAt.toList())

      /**
       * @param vendorSeverity Details on the vendor severity used to filter findings.
       */
      override fun vendorSeverity(vendorSeverity: IResolvable) {
        cdkBuilder.vendorSeverity(vendorSeverity.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vendorSeverity Details on the vendor severity used to filter findings.
       */
      override fun vendorSeverity(vendorSeverity: List<Any>) {
        cdkBuilder.vendorSeverity(vendorSeverity.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param vendorSeverity Details on the vendor severity used to filter findings.
       */
      override fun vendorSeverity(vararg vendorSeverity: Any): Unit =
          vendorSeverity(vendorSeverity.toList())

      /**
       * @param vulnerabilityId Details on the vulnerability ID used to filter findings.
       */
      override fun vulnerabilityId(vulnerabilityId: IResolvable) {
        cdkBuilder.vulnerabilityId(vulnerabilityId.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vulnerabilityId Details on the vulnerability ID used to filter findings.
       */
      override fun vulnerabilityId(vulnerabilityId: List<Any>) {
        cdkBuilder.vulnerabilityId(vulnerabilityId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param vulnerabilityId Details on the vulnerability ID used to filter findings.
       */
      override fun vulnerabilityId(vararg vulnerabilityId: Any): Unit =
          vulnerabilityId(vulnerabilityId.toList())

      /**
       * @param vulnerabilitySource Details on the vulnerability score to filter findings by.
       */
      override fun vulnerabilitySource(vulnerabilitySource: IResolvable) {
        cdkBuilder.vulnerabilitySource(vulnerabilitySource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vulnerabilitySource Details on the vulnerability score to filter findings by.
       */
      override fun vulnerabilitySource(vulnerabilitySource: List<Any>) {
        cdkBuilder.vulnerabilitySource(vulnerabilitySource.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param vulnerabilitySource Details on the vulnerability score to filter findings by.
       */
      override fun vulnerabilitySource(vararg vulnerabilitySource: Any): Unit =
          vulnerabilitySource(vulnerabilitySource.toList())

      /**
       * @param vulnerablePackages Details on the vulnerable packages used to filter findings.
       */
      override fun vulnerablePackages(vulnerablePackages: IResolvable) {
        cdkBuilder.vulnerablePackages(vulnerablePackages.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vulnerablePackages Details on the vulnerable packages used to filter findings.
       */
      override fun vulnerablePackages(vulnerablePackages: List<Any>) {
        cdkBuilder.vulnerablePackages(vulnerablePackages.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param vulnerablePackages Details on the vulnerable packages used to filter findings.
       */
      override fun vulnerablePackages(vararg vulnerablePackages: Any): Unit =
          vulnerablePackages(vulnerablePackages.toList())

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty,
    ) : CdkObject(cdkObject),
        FilterCriteriaProperty {
      /**
       * Details of the AWS account IDs used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-awsaccountid)
       */
      override fun awsAccountId(): Any? = unwrap(this).getAwsAccountId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-codevulnerabilitydetectorname)
       */
      override fun codeVulnerabilityDetectorName(): Any? =
          unwrap(this).getCodeVulnerabilityDetectorName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-codevulnerabilitydetectortags)
       */
      override fun codeVulnerabilityDetectorTags(): Any? =
          unwrap(this).getCodeVulnerabilityDetectorTags()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-codevulnerabilityfilepath)
       */
      override fun codeVulnerabilityFilePath(): Any? = unwrap(this).getCodeVulnerabilityFilePath()

      /**
       * Details of the component IDs used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-componentid)
       */
      override fun componentId(): Any? = unwrap(this).getComponentId()

      /**
       * Details of the component types used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-componenttype)
       */
      override fun componentType(): Any? = unwrap(this).getComponentType()

      /**
       * Details of the Amazon EC2 instance image IDs used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ec2instanceimageid)
       */
      override fun ec2InstanceImageId(): Any? = unwrap(this).getEc2InstanceImageId()

      /**
       * Details of the Amazon EC2 instance subnet IDs used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ec2instancesubnetid)
       */
      override fun ec2InstanceSubnetId(): Any? = unwrap(this).getEc2InstanceSubnetId()

      /**
       * Details of the Amazon EC2 instance VPC IDs used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ec2instancevpcid)
       */
      override fun ec2InstanceVpcId(): Any? = unwrap(this).getEc2InstanceVpcId()

      /**
       * Details of the Amazon ECR image architecture types used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimagearchitecture)
       */
      override fun ecrImageArchitecture(): Any? = unwrap(this).getEcrImageArchitecture()

      /**
       * Details of the Amazon ECR image hashes used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimagehash)
       */
      override fun ecrImageHash(): Any? = unwrap(this).getEcrImageHash()

      /**
       * Details on the Amazon ECR image push date and time used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimagepushedat)
       */
      override fun ecrImagePushedAt(): Any? = unwrap(this).getEcrImagePushedAt()

      /**
       * Details on the Amazon ECR registry used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimageregistry)
       */
      override fun ecrImageRegistry(): Any? = unwrap(this).getEcrImageRegistry()

      /**
       * Details on the name of the Amazon ECR repository used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimagerepositoryname)
       */
      override fun ecrImageRepositoryName(): Any? = unwrap(this).getEcrImageRepositoryName()

      /**
       * The tags attached to the Amazon ECR container image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-ecrimagetags)
       */
      override fun ecrImageTags(): Any? = unwrap(this).getEcrImageTags()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-epssscore)
       */
      override fun epssScore(): Any? = unwrap(this).getEpssScore()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-exploitavailable)
       */
      override fun exploitAvailable(): Any? = unwrap(this).getExploitAvailable()

      /**
       * Details on the finding ARNs used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-findingarn)
       */
      override fun findingArn(): Any? = unwrap(this).getFindingArn()

      /**
       * Details on the finding status types used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-findingstatus)
       */
      override fun findingStatus(): Any? = unwrap(this).getFindingStatus()

      /**
       * Details on the finding types used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-findingtype)
       */
      override fun findingType(): Any? = unwrap(this).getFindingType()

      /**
       * Details on the date and time a finding was first seen used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-firstobservedat)
       */
      override fun firstObservedAt(): Any? = unwrap(this).getFirstObservedAt()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-fixavailable)
       */
      override fun fixAvailable(): Any? = unwrap(this).getFixAvailable()

      /**
       * The Amazon Inspector score to filter on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-inspectorscore)
       */
      override fun inspectorScore(): Any? = unwrap(this).getInspectorScore()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lambdafunctionexecutionrolearn)
       */
      override fun lambdaFunctionExecutionRoleArn(): Any? =
          unwrap(this).getLambdaFunctionExecutionRoleArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lambdafunctionlastmodifiedat)
       */
      override fun lambdaFunctionLastModifiedAt(): Any? =
          unwrap(this).getLambdaFunctionLastModifiedAt()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lambdafunctionlayers)
       */
      override fun lambdaFunctionLayers(): Any? = unwrap(this).getLambdaFunctionLayers()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lambdafunctionname)
       */
      override fun lambdaFunctionName(): Any? = unwrap(this).getLambdaFunctionName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lambdafunctionruntime)
       */
      override fun lambdaFunctionRuntime(): Any? = unwrap(this).getLambdaFunctionRuntime()

      /**
       * Details on the date and time a finding was last seen used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-lastobservedat)
       */
      override fun lastObservedAt(): Any? = unwrap(this).getLastObservedAt()

      /**
       * Details on network protocol used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-networkprotocol)
       */
      override fun networkProtocol(): Any? = unwrap(this).getNetworkProtocol()

      /**
       * Details on the port ranges used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-portrange)
       */
      override fun portRange(): Any? = unwrap(this).getPortRange()

      /**
       * Details on the related vulnerabilities used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-relatedvulnerabilities)
       */
      override fun relatedVulnerabilities(): Any? = unwrap(this).getRelatedVulnerabilities()

      /**
       * Details on the resource IDs used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-resourceid)
       */
      override fun resourceId(): Any? = unwrap(this).getResourceId()

      /**
       * Details on the resource tags used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-resourcetags)
       */
      override fun resourceTags(): Any? = unwrap(this).getResourceTags()

      /**
       * Details on the resource types used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-resourcetype)
       */
      override fun resourceType(): Any? = unwrap(this).getResourceType()

      /**
       * Details on the severity used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-severity)
       */
      override fun severity(): Any? = unwrap(this).getSeverity()

      /**
       * Details on the finding title used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-title)
       */
      override fun title(): Any? = unwrap(this).getTitle()

      /**
       * Details on the date and time a finding was last updated at used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-updatedat)
       */
      override fun updatedAt(): Any? = unwrap(this).getUpdatedAt()

      /**
       * Details on the vendor severity used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-vendorseverity)
       */
      override fun vendorSeverity(): Any? = unwrap(this).getVendorSeverity()

      /**
       * Details on the vulnerability ID used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-vulnerabilityid)
       */
      override fun vulnerabilityId(): Any? = unwrap(this).getVulnerabilityId()

      /**
       * Details on the vulnerability score to filter findings by.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-vulnerabilitysource)
       */
      override fun vulnerabilitySource(): Any? = unwrap(this).getVulnerabilitySource()

      /**
       * Details on the vulnerable packages used to filter findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html#cfn-inspectorv2-filter-filtercriteria-vulnerablepackages)
       */
      override fun vulnerablePackages(): Any? = unwrap(this).getVulnerablePackages()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty):
          FilterCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterCriteriaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterCriteriaProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty
    }
  }

  /**
   * An object that describes details of a map filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * MapFilterProperty mapFilterProperty = MapFilterProperty.builder()
   * .comparison("comparison")
   * // the properties below are optional
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-mapfilter.html)
   */
  public interface MapFilterProperty {
    /**
     * The operator to use when comparing values in the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-mapfilter.html#cfn-inspectorv2-filter-mapfilter-comparison)
     */
    public fun comparison(): String

    /**
     * The tag key used in the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-mapfilter.html#cfn-inspectorv2-filter-mapfilter-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The tag value used in the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-mapfilter.html#cfn-inspectorv2-filter-mapfilter-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [MapFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparison The operator to use when comparing values in the filter. 
       */
      public fun comparison(comparison: String)

      /**
       * @param key The tag key used in the filter.
       */
      public fun key(key: String)

      /**
       * @param value The tag value used in the filter.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty.builder()

      /**
       * @param comparison The operator to use when comparing values in the filter. 
       */
      override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      /**
       * @param key The tag key used in the filter.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The tag value used in the filter.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty,
    ) : CdkObject(cdkObject),
        MapFilterProperty {
      /**
       * The operator to use when comparing values in the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-mapfilter.html#cfn-inspectorv2-filter-mapfilter-comparison)
       */
      override fun comparison(): String = unwrap(this).getComparison()

      /**
       * The tag key used in the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-mapfilter.html#cfn-inspectorv2-filter-mapfilter-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The tag value used in the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-mapfilter.html#cfn-inspectorv2-filter-mapfilter-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MapFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty):
          MapFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? MapFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MapFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty
    }
  }

  /**
   * An object that describes the details of a number filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * NumberFilterProperty numberFilterProperty = NumberFilterProperty.builder()
   * .lowerInclusive(123)
   * .upperInclusive(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-numberfilter.html)
   */
  public interface NumberFilterProperty {
    /**
     * The lowest number to be included in the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-numberfilter.html#cfn-inspectorv2-filter-numberfilter-lowerinclusive)
     */
    public fun lowerInclusive(): Number? = unwrap(this).getLowerInclusive()

    /**
     * The highest number to be included in the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-numberfilter.html#cfn-inspectorv2-filter-numberfilter-upperinclusive)
     */
    public fun upperInclusive(): Number? = unwrap(this).getUpperInclusive()

    /**
     * A builder for [NumberFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lowerInclusive The lowest number to be included in the filter.
       */
      public fun lowerInclusive(lowerInclusive: Number)

      /**
       * @param upperInclusive The highest number to be included in the filter.
       */
      public fun upperInclusive(upperInclusive: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty.builder()

      /**
       * @param lowerInclusive The lowest number to be included in the filter.
       */
      override fun lowerInclusive(lowerInclusive: Number) {
        cdkBuilder.lowerInclusive(lowerInclusive)
      }

      /**
       * @param upperInclusive The highest number to be included in the filter.
       */
      override fun upperInclusive(upperInclusive: Number) {
        cdkBuilder.upperInclusive(upperInclusive)
      }

      public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty,
    ) : CdkObject(cdkObject),
        NumberFilterProperty {
      /**
       * The lowest number to be included in the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-numberfilter.html#cfn-inspectorv2-filter-numberfilter-lowerinclusive)
       */
      override fun lowerInclusive(): Number? = unwrap(this).getLowerInclusive()

      /**
       * The highest number to be included in the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-numberfilter.html#cfn-inspectorv2-filter-numberfilter-upperinclusive)
       */
      override fun upperInclusive(): Number? = unwrap(this).getUpperInclusive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NumberFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty):
          NumberFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? NumberFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NumberFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty
    }
  }

  /**
   * Contains information on the details of a package filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * PackageFilterProperty packageFilterProperty = PackageFilterProperty.builder()
   * .architecture(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .epoch(NumberFilterProperty.builder()
   * .lowerInclusive(123)
   * .upperInclusive(123)
   * .build())
   * .filePath(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .name(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .release(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .sourceLambdaLayerArn(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .sourceLayerHash(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .version(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html)
   */
  public interface PackageFilterProperty {
    /**
     * An object that contains details on the package architecture type to filter on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-architecture)
     */
    public fun architecture(): Any? = unwrap(this).getArchitecture()

    /**
     * An object that contains details on the package epoch to filter on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-epoch)
     */
    public fun epoch(): Any? = unwrap(this).getEpoch()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-filepath)
     */
    public fun filePath(): Any? = unwrap(this).getFilePath()

    /**
     * An object that contains details on the name of the package to filter on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-name)
     */
    public fun name(): Any? = unwrap(this).getName()

    /**
     * An object that contains details on the package release to filter on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-release)
     */
    public fun release(): Any? = unwrap(this).getRelease()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-sourcelambdalayerarn)
     */
    public fun sourceLambdaLayerArn(): Any? = unwrap(this).getSourceLambdaLayerArn()

    /**
     * An object that contains details on the source layer hash to filter on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-sourcelayerhash)
     */
    public fun sourceLayerHash(): Any? = unwrap(this).getSourceLayerHash()

    /**
     * The package version to filter on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-version)
     */
    public fun version(): Any? = unwrap(this).getVersion()

    /**
     * A builder for [PackageFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param architecture An object that contains details on the package architecture type to
       * filter on.
       */
      public fun architecture(architecture: IResolvable)

      /**
       * @param architecture An object that contains details on the package architecture type to
       * filter on.
       */
      public fun architecture(architecture: StringFilterProperty)

      /**
       * @param architecture An object that contains details on the package architecture type to
       * filter on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e41e0efcde2fee5e85dcca2dd10dd1f812ef4c3256616a41e1439ad4dbe06369")
      public fun architecture(architecture: StringFilterProperty.Builder.() -> Unit)

      /**
       * @param epoch An object that contains details on the package epoch to filter on.
       */
      public fun epoch(epoch: IResolvable)

      /**
       * @param epoch An object that contains details on the package epoch to filter on.
       */
      public fun epoch(epoch: NumberFilterProperty)

      /**
       * @param epoch An object that contains details on the package epoch to filter on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91a37ef05a7394d45e35142d71d779861fb1367645df5ef0d2a865d0dcb7cb64")
      public fun epoch(epoch: NumberFilterProperty.Builder.() -> Unit)

      /**
       * @param filePath the value to be set.
       */
      public fun filePath(filePath: IResolvable)

      /**
       * @param filePath the value to be set.
       */
      public fun filePath(filePath: StringFilterProperty)

      /**
       * @param filePath the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bafa5cf69bba8aa8720e93076634a04d4d68bd9935ad32f878fbd51685a0cb06")
      public fun filePath(filePath: StringFilterProperty.Builder.() -> Unit)

      /**
       * @param name An object that contains details on the name of the package to filter on.
       */
      public fun name(name: IResolvable)

      /**
       * @param name An object that contains details on the name of the package to filter on.
       */
      public fun name(name: StringFilterProperty)

      /**
       * @param name An object that contains details on the name of the package to filter on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c4a1ddf4552f0bed377ff0fe7710c1286653bc5a382a2e2bd32d52bf0334e58a")
      public fun name(name: StringFilterProperty.Builder.() -> Unit)

      /**
       * @param release An object that contains details on the package release to filter on.
       */
      public fun release(release: IResolvable)

      /**
       * @param release An object that contains details on the package release to filter on.
       */
      public fun release(release: StringFilterProperty)

      /**
       * @param release An object that contains details on the package release to filter on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9fd74b0bc06670d4201aff5c055291fda7425f666b5a97083937fb9668c0d8c")
      public fun release(release: StringFilterProperty.Builder.() -> Unit)

      /**
       * @param sourceLambdaLayerArn the value to be set.
       */
      public fun sourceLambdaLayerArn(sourceLambdaLayerArn: IResolvable)

      /**
       * @param sourceLambdaLayerArn the value to be set.
       */
      public fun sourceLambdaLayerArn(sourceLambdaLayerArn: StringFilterProperty)

      /**
       * @param sourceLambdaLayerArn the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac8e8a686f01f6e16a08edc789ebe2fbe6702227b9d666d94f2b904d8facdc4a")
      public fun sourceLambdaLayerArn(sourceLambdaLayerArn: StringFilterProperty.Builder.() -> Unit)

      /**
       * @param sourceLayerHash An object that contains details on the source layer hash to filter
       * on.
       */
      public fun sourceLayerHash(sourceLayerHash: IResolvable)

      /**
       * @param sourceLayerHash An object that contains details on the source layer hash to filter
       * on.
       */
      public fun sourceLayerHash(sourceLayerHash: StringFilterProperty)

      /**
       * @param sourceLayerHash An object that contains details on the source layer hash to filter
       * on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("098e3d951d4bdc7c46fccdcee88664e4e900a0284195fe680536266cf4f89e98")
      public fun sourceLayerHash(sourceLayerHash: StringFilterProperty.Builder.() -> Unit)

      /**
       * @param version The package version to filter on.
       */
      public fun version(version: IResolvable)

      /**
       * @param version The package version to filter on.
       */
      public fun version(version: StringFilterProperty)

      /**
       * @param version The package version to filter on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7225fb18487ca5a2f0a0ac71bedf4bc41c3609f81185b01c540d7d54ce379c04")
      public fun version(version: StringFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty.builder()

      /**
       * @param architecture An object that contains details on the package architecture type to
       * filter on.
       */
      override fun architecture(architecture: IResolvable) {
        cdkBuilder.architecture(architecture.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param architecture An object that contains details on the package architecture type to
       * filter on.
       */
      override fun architecture(architecture: StringFilterProperty) {
        cdkBuilder.architecture(architecture.let(StringFilterProperty.Companion::unwrap))
      }

      /**
       * @param architecture An object that contains details on the package architecture type to
       * filter on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e41e0efcde2fee5e85dcca2dd10dd1f812ef4c3256616a41e1439ad4dbe06369")
      override fun architecture(architecture: StringFilterProperty.Builder.() -> Unit): Unit =
          architecture(StringFilterProperty(architecture))

      /**
       * @param epoch An object that contains details on the package epoch to filter on.
       */
      override fun epoch(epoch: IResolvable) {
        cdkBuilder.epoch(epoch.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param epoch An object that contains details on the package epoch to filter on.
       */
      override fun epoch(epoch: NumberFilterProperty) {
        cdkBuilder.epoch(epoch.let(NumberFilterProperty.Companion::unwrap))
      }

      /**
       * @param epoch An object that contains details on the package epoch to filter on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91a37ef05a7394d45e35142d71d779861fb1367645df5ef0d2a865d0dcb7cb64")
      override fun epoch(epoch: NumberFilterProperty.Builder.() -> Unit): Unit =
          epoch(NumberFilterProperty(epoch))

      /**
       * @param filePath the value to be set.
       */
      override fun filePath(filePath: IResolvable) {
        cdkBuilder.filePath(filePath.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filePath the value to be set.
       */
      override fun filePath(filePath: StringFilterProperty) {
        cdkBuilder.filePath(filePath.let(StringFilterProperty.Companion::unwrap))
      }

      /**
       * @param filePath the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bafa5cf69bba8aa8720e93076634a04d4d68bd9935ad32f878fbd51685a0cb06")
      override fun filePath(filePath: StringFilterProperty.Builder.() -> Unit): Unit =
          filePath(StringFilterProperty(filePath))

      /**
       * @param name An object that contains details on the name of the package to filter on.
       */
      override fun name(name: IResolvable) {
        cdkBuilder.name(name.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param name An object that contains details on the name of the package to filter on.
       */
      override fun name(name: StringFilterProperty) {
        cdkBuilder.name(name.let(StringFilterProperty.Companion::unwrap))
      }

      /**
       * @param name An object that contains details on the name of the package to filter on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c4a1ddf4552f0bed377ff0fe7710c1286653bc5a382a2e2bd32d52bf0334e58a")
      override fun name(name: StringFilterProperty.Builder.() -> Unit): Unit =
          name(StringFilterProperty(name))

      /**
       * @param release An object that contains details on the package release to filter on.
       */
      override fun release(release: IResolvable) {
        cdkBuilder.release(release.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param release An object that contains details on the package release to filter on.
       */
      override fun release(release: StringFilterProperty) {
        cdkBuilder.release(release.let(StringFilterProperty.Companion::unwrap))
      }

      /**
       * @param release An object that contains details on the package release to filter on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9fd74b0bc06670d4201aff5c055291fda7425f666b5a97083937fb9668c0d8c")
      override fun release(release: StringFilterProperty.Builder.() -> Unit): Unit =
          release(StringFilterProperty(release))

      /**
       * @param sourceLambdaLayerArn the value to be set.
       */
      override fun sourceLambdaLayerArn(sourceLambdaLayerArn: IResolvable) {
        cdkBuilder.sourceLambdaLayerArn(sourceLambdaLayerArn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceLambdaLayerArn the value to be set.
       */
      override fun sourceLambdaLayerArn(sourceLambdaLayerArn: StringFilterProperty) {
        cdkBuilder.sourceLambdaLayerArn(sourceLambdaLayerArn.let(StringFilterProperty.Companion::unwrap))
      }

      /**
       * @param sourceLambdaLayerArn the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac8e8a686f01f6e16a08edc789ebe2fbe6702227b9d666d94f2b904d8facdc4a")
      override
          fun sourceLambdaLayerArn(sourceLambdaLayerArn: StringFilterProperty.Builder.() -> Unit):
          Unit = sourceLambdaLayerArn(StringFilterProperty(sourceLambdaLayerArn))

      /**
       * @param sourceLayerHash An object that contains details on the source layer hash to filter
       * on.
       */
      override fun sourceLayerHash(sourceLayerHash: IResolvable) {
        cdkBuilder.sourceLayerHash(sourceLayerHash.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceLayerHash An object that contains details on the source layer hash to filter
       * on.
       */
      override fun sourceLayerHash(sourceLayerHash: StringFilterProperty) {
        cdkBuilder.sourceLayerHash(sourceLayerHash.let(StringFilterProperty.Companion::unwrap))
      }

      /**
       * @param sourceLayerHash An object that contains details on the source layer hash to filter
       * on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("098e3d951d4bdc7c46fccdcee88664e4e900a0284195fe680536266cf4f89e98")
      override fun sourceLayerHash(sourceLayerHash: StringFilterProperty.Builder.() -> Unit): Unit =
          sourceLayerHash(StringFilterProperty(sourceLayerHash))

      /**
       * @param version The package version to filter on.
       */
      override fun version(version: IResolvable) {
        cdkBuilder.version(version.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param version The package version to filter on.
       */
      override fun version(version: StringFilterProperty) {
        cdkBuilder.version(version.let(StringFilterProperty.Companion::unwrap))
      }

      /**
       * @param version The package version to filter on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7225fb18487ca5a2f0a0ac71bedf4bc41c3609f81185b01c540d7d54ce379c04")
      override fun version(version: StringFilterProperty.Builder.() -> Unit): Unit =
          version(StringFilterProperty(version))

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty,
    ) : CdkObject(cdkObject),
        PackageFilterProperty {
      /**
       * An object that contains details on the package architecture type to filter on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-architecture)
       */
      override fun architecture(): Any? = unwrap(this).getArchitecture()

      /**
       * An object that contains details on the package epoch to filter on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-epoch)
       */
      override fun epoch(): Any? = unwrap(this).getEpoch()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-filepath)
       */
      override fun filePath(): Any? = unwrap(this).getFilePath()

      /**
       * An object that contains details on the name of the package to filter on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-name)
       */
      override fun name(): Any? = unwrap(this).getName()

      /**
       * An object that contains details on the package release to filter on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-release)
       */
      override fun release(): Any? = unwrap(this).getRelease()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-sourcelambdalayerarn)
       */
      override fun sourceLambdaLayerArn(): Any? = unwrap(this).getSourceLambdaLayerArn()

      /**
       * An object that contains details on the source layer hash to filter on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-sourcelayerhash)
       */
      override fun sourceLayerHash(): Any? = unwrap(this).getSourceLayerHash()

      /**
       * The package version to filter on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html#cfn-inspectorv2-filter-packagefilter-version)
       */
      override fun version(): Any? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PackageFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty):
          PackageFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? PackageFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PackageFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty
    }
  }

  /**
   * An object that describes the details of a port range filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * PortRangeFilterProperty portRangeFilterProperty = PortRangeFilterProperty.builder()
   * .beginInclusive(123)
   * .endInclusive(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-portrangefilter.html)
   */
  public interface PortRangeFilterProperty {
    /**
     * The port number the port range begins at.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-portrangefilter.html#cfn-inspectorv2-filter-portrangefilter-begininclusive)
     */
    public fun beginInclusive(): Number? = unwrap(this).getBeginInclusive()

    /**
     * The port number the port range ends at.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-portrangefilter.html#cfn-inspectorv2-filter-portrangefilter-endinclusive)
     */
    public fun endInclusive(): Number? = unwrap(this).getEndInclusive()

    /**
     * A builder for [PortRangeFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param beginInclusive The port number the port range begins at.
       */
      public fun beginInclusive(beginInclusive: Number)

      /**
       * @param endInclusive The port number the port range ends at.
       */
      public fun endInclusive(endInclusive: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty.builder()

      /**
       * @param beginInclusive The port number the port range begins at.
       */
      override fun beginInclusive(beginInclusive: Number) {
        cdkBuilder.beginInclusive(beginInclusive)
      }

      /**
       * @param endInclusive The port number the port range ends at.
       */
      override fun endInclusive(endInclusive: Number) {
        cdkBuilder.endInclusive(endInclusive)
      }

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty,
    ) : CdkObject(cdkObject),
        PortRangeFilterProperty {
      /**
       * The port number the port range begins at.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-portrangefilter.html#cfn-inspectorv2-filter-portrangefilter-begininclusive)
       */
      override fun beginInclusive(): Number? = unwrap(this).getBeginInclusive()

      /**
       * The port number the port range ends at.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-portrangefilter.html#cfn-inspectorv2-filter-portrangefilter-endinclusive)
       */
      override fun endInclusive(): Number? = unwrap(this).getEndInclusive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty):
          PortRangeFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? PortRangeFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty
    }
  }

  /**
   * An object that describes the details of a string filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * StringFilterProperty stringFilterProperty = StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-stringfilter.html)
   */
  public interface StringFilterProperty {
    /**
     * The operator to use when comparing values in the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-stringfilter.html#cfn-inspectorv2-filter-stringfilter-comparison)
     */
    public fun comparison(): String

    /**
     * The value to filter on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-stringfilter.html#cfn-inspectorv2-filter-stringfilter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [StringFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparison The operator to use when comparing values in the filter. 
       */
      public fun comparison(comparison: String)

      /**
       * @param value The value to filter on. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty.builder()

      /**
       * @param comparison The operator to use when comparing values in the filter. 
       */
      override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      /**
       * @param value The value to filter on. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty,
    ) : CdkObject(cdkObject),
        StringFilterProperty {
      /**
       * The operator to use when comparing values in the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-stringfilter.html#cfn-inspectorv2-filter-stringfilter-comparison)
       */
      override fun comparison(): String = unwrap(this).getComparison()

      /**
       * The value to filter on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-stringfilter.html#cfn-inspectorv2-filter-stringfilter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StringFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty):
          StringFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? StringFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty
    }
  }
}
