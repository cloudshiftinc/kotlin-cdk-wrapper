@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspectorv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFilter`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
 * CfnFilterProps cfnFilterProps = CfnFilterProps.builder()
 * .filterAction("filterAction")
 * .filterCriteria(FilterCriteriaProperty.builder()
 * .awsAccountId(List.of(StringFilterProperty.builder()
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
 * .inspectorScore(List.of(NumberFilterProperty.builder()
 * .lowerInclusive(123)
 * .upperInclusive(123)
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
 * .name(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .release(StringFilterProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html)
 */
public interface CfnFilterProps {
  /**
   * A description of the filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The action that is to be applied to the findings that match the filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filteraction)
   */
  public fun filterAction(): String

  /**
   * Details on the filter criteria associated with this filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
   */
  public fun filterCriteria(): Any

  /**
   * The name of the filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the filter.
     */
    public fun description(description: String)

    /**
     * @param filterAction The action that is to be applied to the findings that match the filter. 
     */
    public fun filterAction(filterAction: String)

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    public fun filterCriteria(filterCriteria: IResolvable)

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    public fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty)

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e48f8ab3038abac856de7bb57c7a44f2edd2e9afc2e795911acc0b83c735ee28")
    public fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty.Builder.() -> Unit)

    /**
     * @param name The name of the filter. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspectorv2.CfnFilterProps.Builder =
        software.amazon.awscdk.services.inspectorv2.CfnFilterProps.builder()

    /**
     * @param description A description of the filter.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param filterAction The action that is to be applied to the findings that match the filter. 
     */
    override fun filterAction(filterAction: String) {
      cdkBuilder.filterAction(filterAction)
    }

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    override fun filterCriteria(filterCriteria: IResolvable) {
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable::unwrap))
    }

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    override fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(CfnFilter.FilterCriteriaProperty::unwrap))
    }

    /**
     * @param filterCriteria Details on the filter criteria associated with this filter. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e48f8ab3038abac856de7bb57c7a44f2edd2e9afc2e795911acc0b83c735ee28")
    override
        fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty.Builder.() -> Unit):
        Unit = filterCriteria(CfnFilter.FilterCriteriaProperty(filterCriteria))

    /**
     * @param name The name of the filter. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilterProps,
  ) : CdkObject(cdkObject), CfnFilterProps {
    /**
     * A description of the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The action that is to be applied to the findings that match the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filteraction)
     */
    override fun filterAction(): String = unwrap(this).getFilterAction()

    /**
     * Details on the filter criteria associated with this filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-filtercriteria)
     */
    override fun filterCriteria(): Any = unwrap(this).getFilterCriteria()

    /**
     * The name of the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html#cfn-inspectorv2-filter-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilterProps):
        CfnFilterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFilterProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFilterProps):
        software.amazon.awscdk.services.inspectorv2.CfnFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.inspectorv2.CfnFilterProps
  }
}
