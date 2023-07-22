@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspectorv2.CfnFilter
import software.amazon.awscdk.services.inspectorv2.CfnFilterProps
import software.constructs.Construct

public object inspectorv2 {
  /**
   * Details about a filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.inspectorv2.*;
   * CfnFilter cfnFilter = CfnFilter.Builder.create(this, "MyCfnFilter")
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
  public inline fun cfnFilter(
    scope: Construct,
    id: String,
    block: CfnFilterDsl.() -> Unit = {},
  ): CfnFilter {
    val builder = CfnFilterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains details on the time range used to filter findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.inspectorv2.*;
   * DateFilterProperty dateFilterProperty = DateFilterProperty.builder()
   * .endInclusive(123)
   * .startInclusive(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-datefilter.html)
   */
  public inline fun cfnFilterDateFilterProperty(block: CfnFilterDateFilterPropertyDsl.() -> Unit =
      {}): CfnFilter.DateFilterProperty {
    val builder = CfnFilterDateFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Details on the criteria used to define the filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.inspectorv2.*;
   * FilterCriteriaProperty filterCriteriaProperty = FilterCriteriaProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-filtercriteria.html)
   */
  public inline
      fun cfnFilterFilterCriteriaProperty(block: CfnFilterFilterCriteriaPropertyDsl.() -> Unit =
      {}): CfnFilter.FilterCriteriaProperty {
    val builder = CfnFilterFilterCriteriaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that describes details of a map filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.inspectorv2.*;
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
  public inline fun cfnFilterMapFilterProperty(block: CfnFilterMapFilterPropertyDsl.() -> Unit =
      {}): CfnFilter.MapFilterProperty {
    val builder = CfnFilterMapFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that describes the details of a number filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.inspectorv2.*;
   * NumberFilterProperty numberFilterProperty = NumberFilterProperty.builder()
   * .lowerInclusive(123)
   * .upperInclusive(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-numberfilter.html)
   */
  public inline fun cfnFilterNumberFilterProperty(block: CfnFilterNumberFilterPropertyDsl.() -> Unit
      = {}): CfnFilter.NumberFilterProperty {
    val builder = CfnFilterNumberFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information on the details of a package filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.inspectorv2.*;
   * PackageFilterProperty packageFilterProperty = PackageFilterProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-packagefilter.html)
   */
  public inline
      fun cfnFilterPackageFilterProperty(block: CfnFilterPackageFilterPropertyDsl.() -> Unit = {}):
      CfnFilter.PackageFilterProperty {
    val builder = CfnFilterPackageFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that describes the details of a port range filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.inspectorv2.*;
   * PortRangeFilterProperty portRangeFilterProperty = PortRangeFilterProperty.builder()
   * .beginInclusive(123)
   * .endInclusive(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-portrangefilter.html)
   */
  public inline
      fun cfnFilterPortRangeFilterProperty(block: CfnFilterPortRangeFilterPropertyDsl.() -> Unit =
      {}): CfnFilter.PortRangeFilterProperty {
    val builder = CfnFilterPortRangeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnFilter`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.inspectorv2.*;
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
  public inline fun cfnFilterProps(block: CfnFilterPropsDsl.() -> Unit = {}): CfnFilterProps {
    val builder = CfnFilterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that describes the details of a string filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.inspectorv2.*;
   * StringFilterProperty stringFilterProperty = StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-stringfilter.html)
   */
  public inline fun cfnFilterStringFilterProperty(block: CfnFilterStringFilterPropertyDsl.() -> Unit
      = {}): CfnFilter.StringFilterProperty {
    val builder = CfnFilterStringFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
