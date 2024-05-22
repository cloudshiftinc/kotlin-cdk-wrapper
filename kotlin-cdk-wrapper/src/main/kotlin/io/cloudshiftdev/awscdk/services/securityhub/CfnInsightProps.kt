@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInsight`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnInsightProps cfnInsightProps = CfnInsightProps.builder()
 * .filters(AwsSecurityFindingFiltersProperty.builder()
 * .awsAccountId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .awsAccountName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .companyName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .complianceAssociatedStandardsId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .complianceSecurityControlId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .complianceSecurityControlParametersName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .complianceSecurityControlParametersValue(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .complianceStatus(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .confidence(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .createdAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .criticality(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .description(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingProviderFieldsConfidence(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .findingProviderFieldsCriticality(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .findingProviderFieldsRelatedFindingsId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingProviderFieldsRelatedFindingsProductArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingProviderFieldsSeverityLabel(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingProviderFieldsSeverityOriginal(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingProviderFieldsTypes(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .firstObservedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .generatorId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .id(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .keyword(List.of(KeywordFilterProperty.builder()
 * .value("value")
 * .build()))
 * .lastObservedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .malwareName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .malwarePath(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .malwareState(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .malwareType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .networkDestinationDomain(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .networkDestinationIpV4(List.of(IpFilterProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .networkDestinationIpV6(List.of(IpFilterProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .networkDestinationPort(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .networkDirection(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .networkProtocol(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .networkSourceDomain(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .networkSourceIpV4(List.of(IpFilterProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .networkSourceIpV6(List.of(IpFilterProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .networkSourceMac(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .networkSourcePort(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .noteText(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .noteUpdatedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .noteUpdatedBy(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .processLaunchedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .processName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .processParentPid(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .processPath(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .processPid(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .processTerminatedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .productArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .productFields(List.of(MapFilterProperty.builder()
 * .comparison("comparison")
 * .key("key")
 * .value("value")
 * .build()))
 * .productName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .recommendationText(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .recordState(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .region(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .relatedFindingsId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .relatedFindingsProductArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceApplicationArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceApplicationName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsEc2InstanceIamInstanceProfileArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsEc2InstanceImageId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsEc2InstanceIpV4Addresses(List.of(IpFilterProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .resourceAwsEc2InstanceIpV6Addresses(List.of(IpFilterProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .resourceAwsEc2InstanceKeyName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsEc2InstanceLaunchedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .resourceAwsEc2InstanceSubnetId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsEc2InstanceType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsEc2InstanceVpcId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsIamAccessKeyCreatedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .resourceAwsIamAccessKeyPrincipalName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsIamAccessKeyStatus(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsIamAccessKeyUserName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsIamUserUserName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsS3BucketOwnerId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceAwsS3BucketOwnerName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceContainerImageId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceContainerImageName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceContainerLaunchedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .resourceContainerName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceDetailsOther(List.of(MapFilterProperty.builder()
 * .comparison("comparison")
 * .key("key")
 * .value("value")
 * .build()))
 * .resourceId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourcePartition(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceRegion(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceTags(List.of(MapFilterProperty.builder()
 * .comparison("comparison")
 * .key("key")
 * .value("value")
 * .build()))
 * .resourceType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .sample(List.of(BooleanFilterProperty.builder()
 * .value(false)
 * .build()))
 * .severityLabel(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .severityNormalized(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .severityProduct(List.of(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build()))
 * .sourceUrl(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .threatIntelIndicatorCategory(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .threatIntelIndicatorLastObservedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .threatIntelIndicatorSource(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .threatIntelIndicatorSourceUrl(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .threatIntelIndicatorType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .threatIntelIndicatorValue(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .title(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .type(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .updatedAt(List.of(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build()))
 * .userDefinedFields(List.of(MapFilterProperty.builder()
 * .comparison("comparison")
 * .key("key")
 * .value("value")
 * .build()))
 * .verificationState(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerabilitiesExploitAvailable(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerabilitiesFixAvailable(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .workflowState(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .workflowStatus(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .build())
 * .groupByAttribute("groupByAttribute")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html)
 */
public interface CfnInsightProps {
  /**
   * One or more attributes used to filter the findings included in the insight.
   *
   * The insight only includes findings that match the criteria defined in the filters. You can
   * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
   * values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-filters)
   */
  public fun filters(): Any

  /**
   * The grouping attribute for the insight's findings.
   *
   * Indicates how to group the matching findings, and identifies the type of item that the insight
   * applies to. For example, if an insight is grouped by resource identifier, then the insight
   * produces a list of resource identifiers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-groupbyattribute)
   */
  public fun groupByAttribute(): String

  /**
   * The name of a Security Hub insight.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnInsightProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param filters One or more attributes used to filter the findings included in the insight. 
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     */
    public fun filters(filters: IResolvable)

    /**
     * @param filters One or more attributes used to filter the findings included in the insight. 
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     */
    public fun filters(filters: CfnInsight.AwsSecurityFindingFiltersProperty)

    /**
     * @param filters One or more attributes used to filter the findings included in the insight. 
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b36cb2fd6c3ac67039d7efb5efdde39fba2b58eb87780449f6c6ff7c6d71b95")
    public fun filters(filters: CfnInsight.AwsSecurityFindingFiltersProperty.Builder.() -> Unit)

    /**
     * @param groupByAttribute The grouping attribute for the insight's findings. 
     * Indicates how to group the matching findings, and identifies the type of item that the
     * insight applies to. For example, if an insight is grouped by resource identifier, then the
     * insight produces a list of resource identifiers.
     */
    public fun groupByAttribute(groupByAttribute: String)

    /**
     * @param name The name of a Security Hub insight. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnInsightProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnInsightProps.builder()

    /**
     * @param filters One or more attributes used to filter the findings included in the insight. 
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     */
    override fun filters(filters: IResolvable) {
      cdkBuilder.filters(filters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param filters One or more attributes used to filter the findings included in the insight. 
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     */
    override fun filters(filters: CfnInsight.AwsSecurityFindingFiltersProperty) {
      cdkBuilder.filters(filters.let(CfnInsight.AwsSecurityFindingFiltersProperty.Companion::unwrap))
    }

    /**
     * @param filters One or more attributes used to filter the findings included in the insight. 
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b36cb2fd6c3ac67039d7efb5efdde39fba2b58eb87780449f6c6ff7c6d71b95")
    override fun filters(filters: CfnInsight.AwsSecurityFindingFiltersProperty.Builder.() -> Unit):
        Unit = filters(CfnInsight.AwsSecurityFindingFiltersProperty(filters))

    /**
     * @param groupByAttribute The grouping attribute for the insight's findings. 
     * Indicates how to group the matching findings, and identifies the type of item that the
     * insight applies to. For example, if an insight is grouped by resource identifier, then the
     * insight produces a list of resource identifiers.
     */
    override fun groupByAttribute(groupByAttribute: String) {
      cdkBuilder.groupByAttribute(groupByAttribute)
    }

    /**
     * @param name The name of a Security Hub insight. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnInsightProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnInsightProps,
  ) : CdkObject(cdkObject), CfnInsightProps {
    /**
     * One or more attributes used to filter the findings included in the insight.
     *
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-filters)
     */
    override fun filters(): Any = unwrap(this).getFilters()

    /**
     * The grouping attribute for the insight's findings.
     *
     * Indicates how to group the matching findings, and identifies the type of item that the
     * insight applies to. For example, if an insight is grouped by resource identifier, then the
     * insight produces a list of resource identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-groupbyattribute)
     */
    override fun groupByAttribute(): String = unwrap(this).getGroupByAttribute()

    /**
     * The name of a Security Hub insight.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInsightProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsightProps):
        CfnInsightProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInsightProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInsightProps):
        software.amazon.awscdk.services.securityhub.CfnInsightProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securityhub.CfnInsightProps
  }
}
