@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SecurityHub::Insight` resource creates a custom insight in AWS Security Hub .
 *
 * An insight is a collection of findings that relate to a security issue that requires attention or
 * remediation. For more information, see [Insights in AWS Security
 * Hub](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-insights.html) in the *AWS
 * Security Hub User Guide* .
 *
 * Tags aren't supported for this resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnInsight cfnInsight = CfnInsight.Builder.create(this, "MyCfnInsight")
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
public open class CfnInsight(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInsightProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnInsight(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnInsightProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInsightProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInsightProps(props)
  )

  /**
   * The ARN of a Security Hub insight.
   */
  public open fun attrInsightArn(): String = unwrap(this).getAttrInsightArn()

  /**
   * One or more attributes used to filter the findings included in the insight.
   */
  public open fun filters(): Any = unwrap(this).getFilters()

  /**
   * One or more attributes used to filter the findings included in the insight.
   */
  public open fun filters(`value`: IResolvable) {
    unwrap(this).setFilters(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more attributes used to filter the findings included in the insight.
   */
  public open fun filters(`value`: AwsSecurityFindingFiltersProperty) {
    unwrap(this).setFilters(`value`.let(AwsSecurityFindingFiltersProperty::unwrap))
  }

  /**
   * One or more attributes used to filter the findings included in the insight.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79ba4cbb2cf979d4303de3b95706e52979e21b68c67ac2dae676c3b698aa9eba")
  public open fun filters(`value`: AwsSecurityFindingFiltersProperty.Builder.() -> Unit): Unit =
      filters(AwsSecurityFindingFiltersProperty(`value`))

  /**
   * The grouping attribute for the insight's findings.
   */
  public open fun groupByAttribute(): String = unwrap(this).getGroupByAttribute()

  /**
   * The grouping attribute for the insight's findings.
   */
  public open fun groupByAttribute(`value`: String) {
    unwrap(this).setGroupByAttribute(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of a Security Hub insight.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of a Security Hub insight.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnInsight].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * One or more attributes used to filter the findings included in the insight.
     *
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-filters)
     * @param filters One or more attributes used to filter the findings included in the insight. 
     */
    public fun filters(filters: IResolvable)

    /**
     * One or more attributes used to filter the findings included in the insight.
     *
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-filters)
     * @param filters One or more attributes used to filter the findings included in the insight. 
     */
    public fun filters(filters: AwsSecurityFindingFiltersProperty)

    /**
     * One or more attributes used to filter the findings included in the insight.
     *
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-filters)
     * @param filters One or more attributes used to filter the findings included in the insight. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb05f6193618d38eb08895a169a3cfc00259ecbde309827a14500dbecaaf2280")
    public fun filters(filters: AwsSecurityFindingFiltersProperty.Builder.() -> Unit)

    /**
     * The grouping attribute for the insight's findings.
     *
     * Indicates how to group the matching findings, and identifies the type of item that the
     * insight applies to. For example, if an insight is grouped by resource identifier, then the
     * insight produces a list of resource identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-groupbyattribute)
     * @param groupByAttribute The grouping attribute for the insight's findings. 
     */
    public fun groupByAttribute(groupByAttribute: String)

    /**
     * The name of a Security Hub insight.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-name)
     * @param name The name of a Security Hub insight. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnInsight.Builder =
        software.amazon.awscdk.services.securityhub.CfnInsight.Builder.create(scope, id)

    /**
     * One or more attributes used to filter the findings included in the insight.
     *
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-filters)
     * @param filters One or more attributes used to filter the findings included in the insight. 
     */
    override fun filters(filters: IResolvable) {
      cdkBuilder.filters(filters.let(IResolvable::unwrap))
    }

    /**
     * One or more attributes used to filter the findings included in the insight.
     *
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-filters)
     * @param filters One or more attributes used to filter the findings included in the insight. 
     */
    override fun filters(filters: AwsSecurityFindingFiltersProperty) {
      cdkBuilder.filters(filters.let(AwsSecurityFindingFiltersProperty::unwrap))
    }

    /**
     * One or more attributes used to filter the findings included in the insight.
     *
     * The insight only includes findings that match the criteria defined in the filters. You can
     * filter by up to ten finding attributes. For each attribute, you can provide up to 20 filter
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-filters)
     * @param filters One or more attributes used to filter the findings included in the insight. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb05f6193618d38eb08895a169a3cfc00259ecbde309827a14500dbecaaf2280")
    override fun filters(filters: AwsSecurityFindingFiltersProperty.Builder.() -> Unit): Unit =
        filters(AwsSecurityFindingFiltersProperty(filters))

    /**
     * The grouping attribute for the insight's findings.
     *
     * Indicates how to group the matching findings, and identifies the type of item that the
     * insight applies to. For example, if an insight is grouped by resource identifier, then the
     * insight produces a list of resource identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-groupbyattribute)
     * @param groupByAttribute The grouping attribute for the insight's findings. 
     */
    override fun groupByAttribute(groupByAttribute: String) {
      cdkBuilder.groupByAttribute(groupByAttribute)
    }

    /**
     * The name of a Security Hub insight.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-insight.html#cfn-securityhub-insight-name)
     * @param name The name of a Security Hub insight. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnInsight = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnInsight.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInsight {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInsight(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight): CfnInsight
        = CfnInsight(cdkObject)

    internal fun unwrap(wrapped: CfnInsight): software.amazon.awscdk.services.securityhub.CfnInsight
        = wrapped.cdkObject as software.amazon.awscdk.services.securityhub.CfnInsight
  }

  /**
   * A collection of filters that are applied to all active findings aggregated by AWS Security Hub
   * .
   *
   * You can filter by up to ten finding attributes. For each attribute, you can provide up to 20
   * filter values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * AwsSecurityFindingFiltersProperty awsSecurityFindingFiltersProperty =
   * AwsSecurityFindingFiltersProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html)
   */
  public interface AwsSecurityFindingFiltersProperty {
    /**
     * The AWS account ID in which a finding is generated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-awsaccountid)
     */
    public fun awsAccountId(): Any? = unwrap(this).getAwsAccountId()

    /**
     * The name of the AWS account in which a finding is generated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-awsaccountname)
     */
    public fun awsAccountName(): Any? = unwrap(this).getAwsAccountName()

    /**
     * The name of the findings provider (company) that owns the solution (product) that generates
     * findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-companyname)
     */
    public fun companyName(): Any? = unwrap(this).getCompanyName()

    /**
     * The unique identifier of a standard in which a control is enabled.
     *
     * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for a
     * standard in the
     * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
     * API response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-complianceassociatedstandardsid)
     */
    public fun complianceAssociatedStandardsId(): Any? =
        unwrap(this).getComplianceAssociatedStandardsId()

    /**
     * The unique identifier of a control across standards.
     *
     * Values for this field typically consist of an AWS service and a number, such as APIGateway.5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-compliancesecuritycontrolid)
     */
    public fun complianceSecurityControlId(): Any? = unwrap(this).getComplianceSecurityControlId()

    /**
     * The name of a security control parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-compliancesecuritycontrolparametersname)
     */
    public fun complianceSecurityControlParametersName(): Any? =
        unwrap(this).getComplianceSecurityControlParametersName()

    /**
     * The current value of a security control parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-compliancesecuritycontrolparametersvalue)
     */
    public fun complianceSecurityControlParametersValue(): Any? =
        unwrap(this).getComplianceSecurityControlParametersValue()

    /**
     * Exclusive to findings that are generated as the result of a check run against a specific rule
     * in a supported standard, such as CIS AWS Foundations.
     *
     * Contains security standard-related finding details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-compliancestatus)
     */
    public fun complianceStatus(): Any? = unwrap(this).getComplianceStatus()

    /**
     * A finding's confidence.
     *
     * Confidence is defined as the likelihood that a finding accurately identifies the behavior or
     * issue that it was intended to identify.
     *
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
     * confidence and 100 means 100 percent confidence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-confidence)
     */
    public fun confidence(): Any? = unwrap(this).getConfidence()

    /**
     * A timestamp that indicates when the security findings provider created the potential security
     * issue that a finding reflects.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-createdat)
     */
    public fun createdAt(): Any? = unwrap(this).getCreatedAt()

    /**
     * The level of importance assigned to the resources associated with the finding.
     *
     * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
     * reserved for the most critical resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-criticality)
     */
    public fun criticality(): Any? = unwrap(this).getCriticality()

    /**
     * A finding's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-description)
     */
    public fun description(): Any? = unwrap(this).getDescription()

    /**
     * The finding provider value for the finding confidence.
     *
     * Confidence is defined as the likelihood that a finding accurately identifies the behavior or
     * issue that it was intended to identify.
     *
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
     * confidence and 100 means 100 percent confidence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldsconfidence)
     */
    public fun findingProviderFieldsConfidence(): Any? =
        unwrap(this).getFindingProviderFieldsConfidence()

    /**
     * The finding provider value for the level of importance assigned to the resources associated
     * with the findings.
     *
     * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
     * reserved for the most critical resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldscriticality)
     */
    public fun findingProviderFieldsCriticality(): Any? =
        unwrap(this).getFindingProviderFieldsCriticality()

    /**
     * The finding identifier of a related finding that is identified by the finding provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldsrelatedfindingsid)
     */
    public fun findingProviderFieldsRelatedFindingsId(): Any? =
        unwrap(this).getFindingProviderFieldsRelatedFindingsId()

    /**
     * The ARN of the solution that generated a related finding that is identified by the finding
     * provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldsrelatedfindingsproductarn)
     */
    public fun findingProviderFieldsRelatedFindingsProductArn(): Any? =
        unwrap(this).getFindingProviderFieldsRelatedFindingsProductArn()

    /**
     * The finding provider value for the severity label.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldsseveritylabel)
     */
    public fun findingProviderFieldsSeverityLabel(): Any? =
        unwrap(this).getFindingProviderFieldsSeverityLabel()

    /**
     * The finding provider's original value for the severity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldsseverityoriginal)
     */
    public fun findingProviderFieldsSeverityOriginal(): Any? =
        unwrap(this).getFindingProviderFieldsSeverityOriginal()

    /**
     * One or more finding types that the finding provider assigned to the finding.
     *
     * Uses the format of `namespace/category/classifier` that classify a finding.
     *
     * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual
     * Behaviors | Sensitive Data Identifications
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldstypes)
     */
    public fun findingProviderFieldsTypes(): Any? = unwrap(this).getFindingProviderFieldsTypes()

    /**
     * A timestamp that indicates when the security findings provider first observed the potential
     * security issue that a finding captured.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-firstobservedat)
     */
    public fun firstObservedAt(): Any? = unwrap(this).getFirstObservedAt()

    /**
     * The identifier for the solution-specific component (a discrete unit of logic) that generated
     * a finding.
     *
     * In various security findings providers' solutions, this generator can be called a rule, a
     * check, a detector, a plugin, etc.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-generatorid)
     */
    public fun generatorId(): Any? = unwrap(this).getGeneratorId()

    /**
     * The security findings provider-specific identifier for a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-id)
     */
    public fun id(): Any? = unwrap(this).getId()

    /**
     * This field is deprecated.
     *
     * A keyword for a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-keyword)
     */
    public fun keyword(): Any? = unwrap(this).getKeyword()

    /**
     * A timestamp that indicates when the security findings provider most recently observed the
     * potential security issue that a finding captured.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-lastobservedat)
     */
    public fun lastObservedAt(): Any? = unwrap(this).getLastObservedAt()

    /**
     * The name of the malware that was observed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-malwarename)
     */
    public fun malwareName(): Any? = unwrap(this).getMalwareName()

    /**
     * The filesystem path of the malware that was observed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-malwarepath)
     */
    public fun malwarePath(): Any? = unwrap(this).getMalwarePath()

    /**
     * The state of the malware that was observed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-malwarestate)
     */
    public fun malwareState(): Any? = unwrap(this).getMalwareState()

    /**
     * The type of the malware that was observed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-malwaretype)
     */
    public fun malwareType(): Any? = unwrap(this).getMalwareType()

    /**
     * The destination domain of network-related information about a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkdestinationdomain)
     */
    public fun networkDestinationDomain(): Any? = unwrap(this).getNetworkDestinationDomain()

    /**
     * The destination IPv4 address of network-related information about a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkdestinationipv4)
     */
    public fun networkDestinationIpV4(): Any? = unwrap(this).getNetworkDestinationIpV4()

    /**
     * The destination IPv6 address of network-related information about a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkdestinationipv6)
     */
    public fun networkDestinationIpV6(): Any? = unwrap(this).getNetworkDestinationIpV6()

    /**
     * The destination port of network-related information about a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkdestinationport)
     */
    public fun networkDestinationPort(): Any? = unwrap(this).getNetworkDestinationPort()

    /**
     * Indicates the direction of network traffic associated with a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkdirection)
     */
    public fun networkDirection(): Any? = unwrap(this).getNetworkDirection()

    /**
     * The protocol of network-related information about a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkprotocol)
     */
    public fun networkProtocol(): Any? = unwrap(this).getNetworkProtocol()

    /**
     * The source domain of network-related information about a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networksourcedomain)
     */
    public fun networkSourceDomain(): Any? = unwrap(this).getNetworkSourceDomain()

    /**
     * The source IPv4 address of network-related information about a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networksourceipv4)
     */
    public fun networkSourceIpV4(): Any? = unwrap(this).getNetworkSourceIpV4()

    /**
     * The source IPv6 address of network-related information about a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networksourceipv6)
     */
    public fun networkSourceIpV6(): Any? = unwrap(this).getNetworkSourceIpV6()

    /**
     * The source media access control (MAC) address of network-related information about a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networksourcemac)
     */
    public fun networkSourceMac(): Any? = unwrap(this).getNetworkSourceMac()

    /**
     * The source port of network-related information about a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networksourceport)
     */
    public fun networkSourcePort(): Any? = unwrap(this).getNetworkSourcePort()

    /**
     * The text of a note.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-notetext)
     */
    public fun noteText(): Any? = unwrap(this).getNoteText()

    /**
     * The timestamp of when the note was updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-noteupdatedat)
     */
    public fun noteUpdatedAt(): Any? = unwrap(this).getNoteUpdatedAt()

    /**
     * The principal that created a note.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-noteupdatedby)
     */
    public fun noteUpdatedBy(): Any? = unwrap(this).getNoteUpdatedBy()

    /**
     * A timestamp that identifies when the process was launched.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processlaunchedat)
     */
    public fun processLaunchedAt(): Any? = unwrap(this).getProcessLaunchedAt()

    /**
     * The name of the process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processname)
     */
    public fun processName(): Any? = unwrap(this).getProcessName()

    /**
     * The parent process ID.
     *
     * This field accepts positive integers between `O` and `2147483647` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processparentpid)
     */
    public fun processParentPid(): Any? = unwrap(this).getProcessParentPid()

    /**
     * The path to the process executable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processpath)
     */
    public fun processPath(): Any? = unwrap(this).getProcessPath()

    /**
     * The process ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processpid)
     */
    public fun processPid(): Any? = unwrap(this).getProcessPid()

    /**
     * A timestamp that identifies when the process was terminated.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processterminatedat)
     */
    public fun processTerminatedAt(): Any? = unwrap(this).getProcessTerminatedAt()

    /**
     * The ARN generated by Security Hub that uniquely identifies a third-party company (security
     * findings provider) after this provider's product (solution that generates findings) is
     * registered with Security Hub.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-productarn)
     */
    public fun productArn(): Any? = unwrap(this).getProductArn()

    /**
     * A data type where security findings providers can include additional solution-specific
     * details that aren't part of the defined `AwsSecurityFinding` format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-productfields)
     */
    public fun productFields(): Any? = unwrap(this).getProductFields()

    /**
     * The name of the solution (product) that generates findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-productname)
     */
    public fun productName(): Any? = unwrap(this).getProductName()

    /**
     * The recommendation of what to do about the issue described in a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-recommendationtext)
     */
    public fun recommendationText(): Any? = unwrap(this).getRecommendationText()

    /**
     * The updated record state for the finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-recordstate)
     */
    public fun recordState(): Any? = unwrap(this).getRecordState()

    /**
     * The Region from which the finding was generated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-region)
     */
    public fun region(): Any? = unwrap(this).getRegion()

    /**
     * The solution-generated identifier for a related finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-relatedfindingsid)
     */
    public fun relatedFindingsId(): Any? = unwrap(this).getRelatedFindingsId()

    /**
     * The ARN of the solution that generated a related finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-relatedfindingsproductarn)
     */
    public fun relatedFindingsProductArn(): Any? = unwrap(this).getRelatedFindingsProductArn()

    /**
     * The ARN of the application that is related to a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceapplicationarn)
     */
    public fun resourceApplicationArn(): Any? = unwrap(this).getResourceApplicationArn()

    /**
     * The name of the application that is related to a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceapplicationname)
     */
    public fun resourceApplicationName(): Any? = unwrap(this).getResourceApplicationName()

    /**
     * The IAM profile ARN of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instanceiaminstanceprofilearn)
     */
    public fun resourceAwsEc2InstanceIamInstanceProfileArn(): Any? =
        unwrap(this).getResourceAwsEc2InstanceIamInstanceProfileArn()

    /**
     * The Amazon Machine Image (AMI) ID of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instanceimageid)
     */
    public fun resourceAwsEc2InstanceImageId(): Any? =
        unwrap(this).getResourceAwsEc2InstanceImageId()

    /**
     * The IPv4 addresses associated with the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instanceipv4addresses)
     */
    public fun resourceAwsEc2InstanceIpV4Addresses(): Any? =
        unwrap(this).getResourceAwsEc2InstanceIpV4Addresses()

    /**
     * The IPv6 addresses associated with the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instanceipv6addresses)
     */
    public fun resourceAwsEc2InstanceIpV6Addresses(): Any? =
        unwrap(this).getResourceAwsEc2InstanceIpV6Addresses()

    /**
     * The key name associated with the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instancekeyname)
     */
    public fun resourceAwsEc2InstanceKeyName(): Any? =
        unwrap(this).getResourceAwsEc2InstanceKeyName()

    /**
     * The date and time the instance was launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instancelaunchedat)
     */
    public fun resourceAwsEc2InstanceLaunchedAt(): Any? =
        unwrap(this).getResourceAwsEc2InstanceLaunchedAt()

    /**
     * The identifier of the subnet that the instance was launched in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instancesubnetid)
     */
    public fun resourceAwsEc2InstanceSubnetId(): Any? =
        unwrap(this).getResourceAwsEc2InstanceSubnetId()

    /**
     * The instance type of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instancetype)
     */
    public fun resourceAwsEc2InstanceType(): Any? = unwrap(this).getResourceAwsEc2InstanceType()

    /**
     * The identifier of the VPC that the instance was launched in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instancevpcid)
     */
    public fun resourceAwsEc2InstanceVpcId(): Any? = unwrap(this).getResourceAwsEc2InstanceVpcId()

    /**
     * The creation date/time of the IAM access key related to a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsiamaccesskeycreatedat)
     */
    public fun resourceAwsIamAccessKeyCreatedAt(): Any? =
        unwrap(this).getResourceAwsIamAccessKeyCreatedAt()

    /**
     * The name of the principal that is associated with an IAM access key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsiamaccesskeyprincipalname)
     */
    public fun resourceAwsIamAccessKeyPrincipalName(): Any? =
        unwrap(this).getResourceAwsIamAccessKeyPrincipalName()

    /**
     * The status of the IAM access key related to a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsiamaccesskeystatus)
     */
    public fun resourceAwsIamAccessKeyStatus(): Any? =
        unwrap(this).getResourceAwsIamAccessKeyStatus()

    /**
     * This field is deprecated.
     *
     * The username associated with the IAM access key related to a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsiamaccesskeyusername)
     */
    public fun resourceAwsIamAccessKeyUserName(): Any? =
        unwrap(this).getResourceAwsIamAccessKeyUserName()

    /**
     * The name of an IAM user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsiamuserusername)
     */
    public fun resourceAwsIamUserUserName(): Any? = unwrap(this).getResourceAwsIamUserUserName()

    /**
     * The canonical user ID of the owner of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawss3bucketownerid)
     */
    public fun resourceAwsS3BucketOwnerId(): Any? = unwrap(this).getResourceAwsS3BucketOwnerId()

    /**
     * The display name of the owner of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawss3bucketownername)
     */
    public fun resourceAwsS3BucketOwnerName(): Any? = unwrap(this).getResourceAwsS3BucketOwnerName()

    /**
     * The identifier of the image related to a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcecontainerimageid)
     */
    public fun resourceContainerImageId(): Any? = unwrap(this).getResourceContainerImageId()

    /**
     * The name of the image related to a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcecontainerimagename)
     */
    public fun resourceContainerImageName(): Any? = unwrap(this).getResourceContainerImageName()

    /**
     * A timestamp that identifies when the container was started.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcecontainerlaunchedat)
     */
    public fun resourceContainerLaunchedAt(): Any? = unwrap(this).getResourceContainerLaunchedAt()

    /**
     * The name of the container related to a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcecontainername)
     */
    public fun resourceContainerName(): Any? = unwrap(this).getResourceContainerName()

    /**
     * The details of a resource that doesn't have a specific subfield for the resource type
     * defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcedetailsother)
     */
    public fun resourceDetailsOther(): Any? = unwrap(this).getResourceDetailsOther()

    /**
     * The canonical identifier for the given resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceid)
     */
    public fun resourceId(): Any? = unwrap(this).getResourceId()

    /**
     * The canonical AWS partition name that the Region is assigned to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcepartition)
     */
    public fun resourcePartition(): Any? = unwrap(this).getResourcePartition()

    /**
     * The canonical AWS external Region name where this resource is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceregion)
     */
    public fun resourceRegion(): Any? = unwrap(this).getResourceRegion()

    /**
     * A list of AWS tags associated with a resource at the time the finding was processed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcetags)
     */
    public fun resourceTags(): Any? = unwrap(this).getResourceTags()

    /**
     * Specifies the type of the resource that details are provided for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcetype)
     */
    public fun resourceType(): Any? = unwrap(this).getResourceType()

    /**
     * Indicates whether or not sample findings are included in the filter results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-sample)
     */
    public fun sample(): Any? = unwrap(this).getSample()

    /**
     * The label of a finding's severity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-severitylabel)
     */
    public fun severityLabel(): Any? = unwrap(this).getSeverityLabel()

    /**
     * Deprecated. The normalized severity of a finding. Instead of providing `Normalized` , provide
     * `Label` .
     *
     * If you provide `Label` and do not provide `Normalized` , then `Normalized` is set
     * automatically as follows.
     *
     * * `INFORMATIONAL` - 0
     * * `LOW` - 1
     * * `MEDIUM` - 40
     * * `HIGH` - 70
     * * `CRITICAL` - 90
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-severitynormalized)
     */
    public fun severityNormalized(): Any? = unwrap(this).getSeverityNormalized()

    /**
     * Deprecated. This attribute isn't included in findings. Instead of providing `Product` ,
     * provide `Original` .
     *
     * The native severity as defined by the AWS service or integrated partner product that
     * generated the finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-severityproduct)
     */
    public fun severityProduct(): Any? = unwrap(this).getSeverityProduct()

    /**
     * A URL that links to a page about the current finding in the security findings provider's
     * solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-sourceurl)
     */
    public fun sourceUrl(): Any? = unwrap(this).getSourceUrl()

    /**
     * The category of a threat intelligence indicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatorcategory)
     */
    public fun threatIntelIndicatorCategory(): Any? = unwrap(this).getThreatIntelIndicatorCategory()

    /**
     * A timestamp that identifies the last observation of a threat intelligence indicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatorlastobservedat)
     */
    public fun threatIntelIndicatorLastObservedAt(): Any? =
        unwrap(this).getThreatIntelIndicatorLastObservedAt()

    /**
     * The source of the threat intelligence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatorsource)
     */
    public fun threatIntelIndicatorSource(): Any? = unwrap(this).getThreatIntelIndicatorSource()

    /**
     * The URL for more details from the source of the threat intelligence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatorsourceurl)
     */
    public fun threatIntelIndicatorSourceUrl(): Any? =
        unwrap(this).getThreatIntelIndicatorSourceUrl()

    /**
     * The type of a threat intelligence indicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatortype)
     */
    public fun threatIntelIndicatorType(): Any? = unwrap(this).getThreatIntelIndicatorType()

    /**
     * The value of a threat intelligence indicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatorvalue)
     */
    public fun threatIntelIndicatorValue(): Any? = unwrap(this).getThreatIntelIndicatorValue()

    /**
     * A finding's title.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-title)
     */
    public fun title(): Any? = unwrap(this).getTitle()

    /**
     * A finding type in the format of `namespace/category/classifier` that classifies a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-type)
     */
    public fun type(): Any? = unwrap(this).getType()

    /**
     * A timestamp that indicates when the security findings provider last updated the finding
     * record.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-updatedat)
     */
    public fun updatedAt(): Any? = unwrap(this).getUpdatedAt()

    /**
     * A list of name/value string pairs associated with the finding.
     *
     * These are custom, user-defined fields added to a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-userdefinedfields)
     */
    public fun userDefinedFields(): Any? = unwrap(this).getUserDefinedFields()

    /**
     * The veracity of a finding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-verificationstate)
     */
    public fun verificationState(): Any? = unwrap(this).getVerificationState()

    /**
     * Indicates whether a software vulnerability in your environment has a known exploit.
     *
     * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-vulnerabilitiesexploitavailable)
     */
    public fun vulnerabilitiesExploitAvailable(): Any? =
        unwrap(this).getVulnerabilitiesExploitAvailable()

    /**
     * Indicates whether a vulnerability is fixed in a newer version of the affected software
     * packages.
     *
     * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-vulnerabilitiesfixavailable)
     */
    public fun vulnerabilitiesFixAvailable(): Any? = unwrap(this).getVulnerabilitiesFixAvailable()

    /**
     * The workflow state of a finding.
     *
     * Note that this field is deprecated. To search for a finding based on its workflow status, use
     * `WorkflowStatus` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-workflowstate)
     */
    public fun workflowState(): Any? = unwrap(this).getWorkflowState()

    /**
     * The status of the investigation into a finding. Allowed values are the following.
     *
     * * `NEW` - The initial state of a finding, before it is reviewed.
     *
     * Security Hub also resets the workflow status from `NOTIFIED` or `RESOLVED` to `NEW` in the
     * following cases:
     *
     * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
     * * `Compliance.Status` changes from `PASSED` to either `WARNING` , `FAILED` , or
     * `NOT_AVAILABLE` .
     * * `NOTIFIED` - Indicates that the resource owner has been notified about the security issue.
     * Used when the initial reviewer is not the resource owner, and needs intervention from the
     * resource owner.
     *
     * If one of the following occurs, the workflow status is changed automatically from `NOTIFIED`
     * to `NEW` :
     *
     * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
     * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
     * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
     * is needed.
     *
     * The workflow status of a `SUPPRESSED` finding does not change if `RecordState` changes from
     * `ARCHIVED` to `ACTIVE` .
     *
     * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
     *
     * The finding remains `RESOLVED` unless one of the following occurs:
     *
     * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
     * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
     *
     * In those cases, the workflow status is automatically reset to `NEW` .
     *
     * For findings from controls, if `Compliance.Status` is `PASSED` , then Security Hub
     * automatically sets the workflow status to `RESOLVED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-workflowstatus)
     */
    public fun workflowStatus(): Any? = unwrap(this).getWorkflowStatus()

    /**
     * A builder for [AwsSecurityFindingFiltersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsAccountId The AWS account ID in which a finding is generated.
       */
      public fun awsAccountId(awsAccountId: IResolvable)

      /**
       * @param awsAccountId The AWS account ID in which a finding is generated.
       */
      public fun awsAccountId(awsAccountId: List<Any>)

      /**
       * @param awsAccountId The AWS account ID in which a finding is generated.
       */
      public fun awsAccountId(vararg awsAccountId: Any)

      /**
       * @param awsAccountName The name of the AWS account in which a finding is generated.
       */
      public fun awsAccountName(awsAccountName: IResolvable)

      /**
       * @param awsAccountName The name of the AWS account in which a finding is generated.
       */
      public fun awsAccountName(awsAccountName: List<Any>)

      /**
       * @param awsAccountName The name of the AWS account in which a finding is generated.
       */
      public fun awsAccountName(vararg awsAccountName: Any)

      /**
       * @param companyName The name of the findings provider (company) that owns the solution
       * (product) that generates findings.
       */
      public fun companyName(companyName: IResolvable)

      /**
       * @param companyName The name of the findings provider (company) that owns the solution
       * (product) that generates findings.
       */
      public fun companyName(companyName: List<Any>)

      /**
       * @param companyName The name of the findings provider (company) that owns the solution
       * (product) that generates findings.
       */
      public fun companyName(vararg companyName: Any)

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       */
      public fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: IResolvable)

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       */
      public fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: List<Any>)

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       */
      public fun complianceAssociatedStandardsId(vararg complianceAssociatedStandardsId: Any)

      /**
       * @param complianceSecurityControlId The unique identifier of a control across standards.
       * Values for this field typically consist of an AWS service and a number, such as
       * APIGateway.5.
       */
      public fun complianceSecurityControlId(complianceSecurityControlId: IResolvable)

      /**
       * @param complianceSecurityControlId The unique identifier of a control across standards.
       * Values for this field typically consist of an AWS service and a number, such as
       * APIGateway.5.
       */
      public fun complianceSecurityControlId(complianceSecurityControlId: List<Any>)

      /**
       * @param complianceSecurityControlId The unique identifier of a control across standards.
       * Values for this field typically consist of an AWS service and a number, such as
       * APIGateway.5.
       */
      public fun complianceSecurityControlId(vararg complianceSecurityControlId: Any)

      /**
       * @param complianceSecurityControlParametersName The name of a security control parameter.
       */
      public
          fun complianceSecurityControlParametersName(complianceSecurityControlParametersName: IResolvable)

      /**
       * @param complianceSecurityControlParametersName The name of a security control parameter.
       */
      public
          fun complianceSecurityControlParametersName(complianceSecurityControlParametersName: List<Any>)

      /**
       * @param complianceSecurityControlParametersName The name of a security control parameter.
       */
      public fun complianceSecurityControlParametersName(vararg
          complianceSecurityControlParametersName: Any)

      /**
       * @param complianceSecurityControlParametersValue The current value of a security control
       * parameter.
       */
      public
          fun complianceSecurityControlParametersValue(complianceSecurityControlParametersValue: IResolvable)

      /**
       * @param complianceSecurityControlParametersValue The current value of a security control
       * parameter.
       */
      public
          fun complianceSecurityControlParametersValue(complianceSecurityControlParametersValue: List<Any>)

      /**
       * @param complianceSecurityControlParametersValue The current value of a security control
       * parameter.
       */
      public fun complianceSecurityControlParametersValue(vararg
          complianceSecurityControlParametersValue: Any)

      /**
       * @param complianceStatus Exclusive to findings that are generated as the result of a check
       * run against a specific rule in a supported standard, such as CIS AWS Foundations.
       * Contains security standard-related finding details.
       */
      public fun complianceStatus(complianceStatus: IResolvable)

      /**
       * @param complianceStatus Exclusive to findings that are generated as the result of a check
       * run against a specific rule in a supported standard, such as CIS AWS Foundations.
       * Contains security standard-related finding details.
       */
      public fun complianceStatus(complianceStatus: List<Any>)

      /**
       * @param complianceStatus Exclusive to findings that are generated as the result of a check
       * run against a specific rule in a supported standard, such as CIS AWS Foundations.
       * Contains security standard-related finding details.
       */
      public fun complianceStatus(vararg complianceStatus: Any)

      /**
       * @param confidence A finding's confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      public fun confidence(confidence: IResolvable)

      /**
       * @param confidence A finding's confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      public fun confidence(confidence: List<Any>)

      /**
       * @param confidence A finding's confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      public fun confidence(vararg confidence: Any)

      /**
       * @param createdAt A timestamp that indicates when the security findings provider created the
       * potential security issue that a finding reflects.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun createdAt(createdAt: IResolvable)

      /**
       * @param createdAt A timestamp that indicates when the security findings provider created the
       * potential security issue that a finding reflects.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun createdAt(createdAt: List<Any>)

      /**
       * @param createdAt A timestamp that indicates when the security findings provider created the
       * potential security issue that a finding reflects.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun createdAt(vararg createdAt: Any)

      /**
       * @param criticality The level of importance assigned to the resources associated with the
       * finding.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      public fun criticality(criticality: IResolvable)

      /**
       * @param criticality The level of importance assigned to the resources associated with the
       * finding.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      public fun criticality(criticality: List<Any>)

      /**
       * @param criticality The level of importance assigned to the resources associated with the
       * finding.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      public fun criticality(vararg criticality: Any)

      /**
       * @param description A finding's description.
       */
      public fun description(description: IResolvable)

      /**
       * @param description A finding's description.
       */
      public fun description(description: List<Any>)

      /**
       * @param description A finding's description.
       */
      public fun description(vararg description: Any)

      /**
       * @param findingProviderFieldsConfidence The finding provider value for the finding
       * confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      public fun findingProviderFieldsConfidence(findingProviderFieldsConfidence: IResolvable)

      /**
       * @param findingProviderFieldsConfidence The finding provider value for the finding
       * confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      public fun findingProviderFieldsConfidence(findingProviderFieldsConfidence: List<Any>)

      /**
       * @param findingProviderFieldsConfidence The finding provider value for the finding
       * confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      public fun findingProviderFieldsConfidence(vararg findingProviderFieldsConfidence: Any)

      /**
       * @param findingProviderFieldsCriticality The finding provider value for the level of
       * importance assigned to the resources associated with the findings.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      public fun findingProviderFieldsCriticality(findingProviderFieldsCriticality: IResolvable)

      /**
       * @param findingProviderFieldsCriticality The finding provider value for the level of
       * importance assigned to the resources associated with the findings.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      public fun findingProviderFieldsCriticality(findingProviderFieldsCriticality: List<Any>)

      /**
       * @param findingProviderFieldsCriticality The finding provider value for the level of
       * importance assigned to the resources associated with the findings.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      public fun findingProviderFieldsCriticality(vararg findingProviderFieldsCriticality: Any)

      /**
       * @param findingProviderFieldsRelatedFindingsId The finding identifier of a related finding
       * that is identified by the finding provider.
       */
      public
          fun findingProviderFieldsRelatedFindingsId(findingProviderFieldsRelatedFindingsId: IResolvable)

      /**
       * @param findingProviderFieldsRelatedFindingsId The finding identifier of a related finding
       * that is identified by the finding provider.
       */
      public
          fun findingProviderFieldsRelatedFindingsId(findingProviderFieldsRelatedFindingsId: List<Any>)

      /**
       * @param findingProviderFieldsRelatedFindingsId The finding identifier of a related finding
       * that is identified by the finding provider.
       */
      public fun findingProviderFieldsRelatedFindingsId(vararg
          findingProviderFieldsRelatedFindingsId: Any)

      /**
       * @param findingProviderFieldsRelatedFindingsProductArn The ARN of the solution that
       * generated a related finding that is identified by the finding provider.
       */
      public
          fun findingProviderFieldsRelatedFindingsProductArn(findingProviderFieldsRelatedFindingsProductArn: IResolvable)

      /**
       * @param findingProviderFieldsRelatedFindingsProductArn The ARN of the solution that
       * generated a related finding that is identified by the finding provider.
       */
      public
          fun findingProviderFieldsRelatedFindingsProductArn(findingProviderFieldsRelatedFindingsProductArn: List<Any>)

      /**
       * @param findingProviderFieldsRelatedFindingsProductArn The ARN of the solution that
       * generated a related finding that is identified by the finding provider.
       */
      public fun findingProviderFieldsRelatedFindingsProductArn(vararg
          findingProviderFieldsRelatedFindingsProductArn: Any)

      /**
       * @param findingProviderFieldsSeverityLabel The finding provider value for the severity
       * label.
       */
      public fun findingProviderFieldsSeverityLabel(findingProviderFieldsSeverityLabel: IResolvable)

      /**
       * @param findingProviderFieldsSeverityLabel The finding provider value for the severity
       * label.
       */
      public fun findingProviderFieldsSeverityLabel(findingProviderFieldsSeverityLabel: List<Any>)

      /**
       * @param findingProviderFieldsSeverityLabel The finding provider value for the severity
       * label.
       */
      public fun findingProviderFieldsSeverityLabel(vararg findingProviderFieldsSeverityLabel: Any)

      /**
       * @param findingProviderFieldsSeverityOriginal The finding provider's original value for the
       * severity.
       */
      public
          fun findingProviderFieldsSeverityOriginal(findingProviderFieldsSeverityOriginal: IResolvable)

      /**
       * @param findingProviderFieldsSeverityOriginal The finding provider's original value for the
       * severity.
       */
      public
          fun findingProviderFieldsSeverityOriginal(findingProviderFieldsSeverityOriginal: List<Any>)

      /**
       * @param findingProviderFieldsSeverityOriginal The finding provider's original value for the
       * severity.
       */
      public fun findingProviderFieldsSeverityOriginal(vararg
          findingProviderFieldsSeverityOriginal: Any)

      /**
       * @param findingProviderFieldsTypes One or more finding types that the finding provider
       * assigned to the finding.
       * Uses the format of `namespace/category/classifier` that classify a finding.
       *
       * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual
       * Behaviors | Sensitive Data Identifications
       */
      public fun findingProviderFieldsTypes(findingProviderFieldsTypes: IResolvable)

      /**
       * @param findingProviderFieldsTypes One or more finding types that the finding provider
       * assigned to the finding.
       * Uses the format of `namespace/category/classifier` that classify a finding.
       *
       * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual
       * Behaviors | Sensitive Data Identifications
       */
      public fun findingProviderFieldsTypes(findingProviderFieldsTypes: List<Any>)

      /**
       * @param findingProviderFieldsTypes One or more finding types that the finding provider
       * assigned to the finding.
       * Uses the format of `namespace/category/classifier` that classify a finding.
       *
       * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual
       * Behaviors | Sensitive Data Identifications
       */
      public fun findingProviderFieldsTypes(vararg findingProviderFieldsTypes: Any)

      /**
       * @param firstObservedAt A timestamp that indicates when the security findings provider first
       * observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun firstObservedAt(firstObservedAt: IResolvable)

      /**
       * @param firstObservedAt A timestamp that indicates when the security findings provider first
       * observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun firstObservedAt(firstObservedAt: List<Any>)

      /**
       * @param firstObservedAt A timestamp that indicates when the security findings provider first
       * observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun firstObservedAt(vararg firstObservedAt: Any)

      /**
       * @param generatorId The identifier for the solution-specific component (a discrete unit of
       * logic) that generated a finding.
       * In various security findings providers' solutions, this generator can be called a rule, a
       * check, a detector, a plugin, etc.
       */
      public fun generatorId(generatorId: IResolvable)

      /**
       * @param generatorId The identifier for the solution-specific component (a discrete unit of
       * logic) that generated a finding.
       * In various security findings providers' solutions, this generator can be called a rule, a
       * check, a detector, a plugin, etc.
       */
      public fun generatorId(generatorId: List<Any>)

      /**
       * @param generatorId The identifier for the solution-specific component (a discrete unit of
       * logic) that generated a finding.
       * In various security findings providers' solutions, this generator can be called a rule, a
       * check, a detector, a plugin, etc.
       */
      public fun generatorId(vararg generatorId: Any)

      /**
       * @param id The security findings provider-specific identifier for a finding.
       */
      public fun id(id: IResolvable)

      /**
       * @param id The security findings provider-specific identifier for a finding.
       */
      public fun id(id: List<Any>)

      /**
       * @param id The security findings provider-specific identifier for a finding.
       */
      public fun id(vararg id: Any)

      /**
       * @param keyword This field is deprecated.
       * A keyword for a finding.
       */
      public fun keyword(keyword: IResolvable)

      /**
       * @param keyword This field is deprecated.
       * A keyword for a finding.
       */
      public fun keyword(keyword: List<Any>)

      /**
       * @param keyword This field is deprecated.
       * A keyword for a finding.
       */
      public fun keyword(vararg keyword: Any)

      /**
       * @param lastObservedAt A timestamp that indicates when the security findings provider most
       * recently observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun lastObservedAt(lastObservedAt: IResolvable)

      /**
       * @param lastObservedAt A timestamp that indicates when the security findings provider most
       * recently observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun lastObservedAt(lastObservedAt: List<Any>)

      /**
       * @param lastObservedAt A timestamp that indicates when the security findings provider most
       * recently observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun lastObservedAt(vararg lastObservedAt: Any)

      /**
       * @param malwareName The name of the malware that was observed.
       */
      public fun malwareName(malwareName: IResolvable)

      /**
       * @param malwareName The name of the malware that was observed.
       */
      public fun malwareName(malwareName: List<Any>)

      /**
       * @param malwareName The name of the malware that was observed.
       */
      public fun malwareName(vararg malwareName: Any)

      /**
       * @param malwarePath The filesystem path of the malware that was observed.
       */
      public fun malwarePath(malwarePath: IResolvable)

      /**
       * @param malwarePath The filesystem path of the malware that was observed.
       */
      public fun malwarePath(malwarePath: List<Any>)

      /**
       * @param malwarePath The filesystem path of the malware that was observed.
       */
      public fun malwarePath(vararg malwarePath: Any)

      /**
       * @param malwareState The state of the malware that was observed.
       */
      public fun malwareState(malwareState: IResolvable)

      /**
       * @param malwareState The state of the malware that was observed.
       */
      public fun malwareState(malwareState: List<Any>)

      /**
       * @param malwareState The state of the malware that was observed.
       */
      public fun malwareState(vararg malwareState: Any)

      /**
       * @param malwareType The type of the malware that was observed.
       */
      public fun malwareType(malwareType: IResolvable)

      /**
       * @param malwareType The type of the malware that was observed.
       */
      public fun malwareType(malwareType: List<Any>)

      /**
       * @param malwareType The type of the malware that was observed.
       */
      public fun malwareType(vararg malwareType: Any)

      /**
       * @param networkDestinationDomain The destination domain of network-related information about
       * a finding.
       */
      public fun networkDestinationDomain(networkDestinationDomain: IResolvable)

      /**
       * @param networkDestinationDomain The destination domain of network-related information about
       * a finding.
       */
      public fun networkDestinationDomain(networkDestinationDomain: List<Any>)

      /**
       * @param networkDestinationDomain The destination domain of network-related information about
       * a finding.
       */
      public fun networkDestinationDomain(vararg networkDestinationDomain: Any)

      /**
       * @param networkDestinationIpV4 The destination IPv4 address of network-related information
       * about a finding.
       */
      public fun networkDestinationIpV4(networkDestinationIpV4: IResolvable)

      /**
       * @param networkDestinationIpV4 The destination IPv4 address of network-related information
       * about a finding.
       */
      public fun networkDestinationIpV4(networkDestinationIpV4: List<Any>)

      /**
       * @param networkDestinationIpV4 The destination IPv4 address of network-related information
       * about a finding.
       */
      public fun networkDestinationIpV4(vararg networkDestinationIpV4: Any)

      /**
       * @param networkDestinationIpV6 The destination IPv6 address of network-related information
       * about a finding.
       */
      public fun networkDestinationIpV6(networkDestinationIpV6: IResolvable)

      /**
       * @param networkDestinationIpV6 The destination IPv6 address of network-related information
       * about a finding.
       */
      public fun networkDestinationIpV6(networkDestinationIpV6: List<Any>)

      /**
       * @param networkDestinationIpV6 The destination IPv6 address of network-related information
       * about a finding.
       */
      public fun networkDestinationIpV6(vararg networkDestinationIpV6: Any)

      /**
       * @param networkDestinationPort The destination port of network-related information about a
       * finding.
       */
      public fun networkDestinationPort(networkDestinationPort: IResolvable)

      /**
       * @param networkDestinationPort The destination port of network-related information about a
       * finding.
       */
      public fun networkDestinationPort(networkDestinationPort: List<Any>)

      /**
       * @param networkDestinationPort The destination port of network-related information about a
       * finding.
       */
      public fun networkDestinationPort(vararg networkDestinationPort: Any)

      /**
       * @param networkDirection Indicates the direction of network traffic associated with a
       * finding.
       */
      public fun networkDirection(networkDirection: IResolvable)

      /**
       * @param networkDirection Indicates the direction of network traffic associated with a
       * finding.
       */
      public fun networkDirection(networkDirection: List<Any>)

      /**
       * @param networkDirection Indicates the direction of network traffic associated with a
       * finding.
       */
      public fun networkDirection(vararg networkDirection: Any)

      /**
       * @param networkProtocol The protocol of network-related information about a finding.
       */
      public fun networkProtocol(networkProtocol: IResolvable)

      /**
       * @param networkProtocol The protocol of network-related information about a finding.
       */
      public fun networkProtocol(networkProtocol: List<Any>)

      /**
       * @param networkProtocol The protocol of network-related information about a finding.
       */
      public fun networkProtocol(vararg networkProtocol: Any)

      /**
       * @param networkSourceDomain The source domain of network-related information about a
       * finding.
       */
      public fun networkSourceDomain(networkSourceDomain: IResolvable)

      /**
       * @param networkSourceDomain The source domain of network-related information about a
       * finding.
       */
      public fun networkSourceDomain(networkSourceDomain: List<Any>)

      /**
       * @param networkSourceDomain The source domain of network-related information about a
       * finding.
       */
      public fun networkSourceDomain(vararg networkSourceDomain: Any)

      /**
       * @param networkSourceIpV4 The source IPv4 address of network-related information about a
       * finding.
       */
      public fun networkSourceIpV4(networkSourceIpV4: IResolvable)

      /**
       * @param networkSourceIpV4 The source IPv4 address of network-related information about a
       * finding.
       */
      public fun networkSourceIpV4(networkSourceIpV4: List<Any>)

      /**
       * @param networkSourceIpV4 The source IPv4 address of network-related information about a
       * finding.
       */
      public fun networkSourceIpV4(vararg networkSourceIpV4: Any)

      /**
       * @param networkSourceIpV6 The source IPv6 address of network-related information about a
       * finding.
       */
      public fun networkSourceIpV6(networkSourceIpV6: IResolvable)

      /**
       * @param networkSourceIpV6 The source IPv6 address of network-related information about a
       * finding.
       */
      public fun networkSourceIpV6(networkSourceIpV6: List<Any>)

      /**
       * @param networkSourceIpV6 The source IPv6 address of network-related information about a
       * finding.
       */
      public fun networkSourceIpV6(vararg networkSourceIpV6: Any)

      /**
       * @param networkSourceMac The source media access control (MAC) address of network-related
       * information about a finding.
       */
      public fun networkSourceMac(networkSourceMac: IResolvable)

      /**
       * @param networkSourceMac The source media access control (MAC) address of network-related
       * information about a finding.
       */
      public fun networkSourceMac(networkSourceMac: List<Any>)

      /**
       * @param networkSourceMac The source media access control (MAC) address of network-related
       * information about a finding.
       */
      public fun networkSourceMac(vararg networkSourceMac: Any)

      /**
       * @param networkSourcePort The source port of network-related information about a finding.
       */
      public fun networkSourcePort(networkSourcePort: IResolvable)

      /**
       * @param networkSourcePort The source port of network-related information about a finding.
       */
      public fun networkSourcePort(networkSourcePort: List<Any>)

      /**
       * @param networkSourcePort The source port of network-related information about a finding.
       */
      public fun networkSourcePort(vararg networkSourcePort: Any)

      /**
       * @param noteText The text of a note.
       */
      public fun noteText(noteText: IResolvable)

      /**
       * @param noteText The text of a note.
       */
      public fun noteText(noteText: List<Any>)

      /**
       * @param noteText The text of a note.
       */
      public fun noteText(vararg noteText: Any)

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       */
      public fun noteUpdatedAt(noteUpdatedAt: IResolvable)

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       */
      public fun noteUpdatedAt(noteUpdatedAt: List<Any>)

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       */
      public fun noteUpdatedAt(vararg noteUpdatedAt: Any)

      /**
       * @param noteUpdatedBy The principal that created a note.
       */
      public fun noteUpdatedBy(noteUpdatedBy: IResolvable)

      /**
       * @param noteUpdatedBy The principal that created a note.
       */
      public fun noteUpdatedBy(noteUpdatedBy: List<Any>)

      /**
       * @param noteUpdatedBy The principal that created a note.
       */
      public fun noteUpdatedBy(vararg noteUpdatedBy: Any)

      /**
       * @param processLaunchedAt A timestamp that identifies when the process was launched.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun processLaunchedAt(processLaunchedAt: IResolvable)

      /**
       * @param processLaunchedAt A timestamp that identifies when the process was launched.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun processLaunchedAt(processLaunchedAt: List<Any>)

      /**
       * @param processLaunchedAt A timestamp that identifies when the process was launched.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun processLaunchedAt(vararg processLaunchedAt: Any)

      /**
       * @param processName The name of the process.
       */
      public fun processName(processName: IResolvable)

      /**
       * @param processName The name of the process.
       */
      public fun processName(processName: List<Any>)

      /**
       * @param processName The name of the process.
       */
      public fun processName(vararg processName: Any)

      /**
       * @param processParentPid The parent process ID.
       * This field accepts positive integers between `O` and `2147483647` .
       */
      public fun processParentPid(processParentPid: IResolvable)

      /**
       * @param processParentPid The parent process ID.
       * This field accepts positive integers between `O` and `2147483647` .
       */
      public fun processParentPid(processParentPid: List<Any>)

      /**
       * @param processParentPid The parent process ID.
       * This field accepts positive integers between `O` and `2147483647` .
       */
      public fun processParentPid(vararg processParentPid: Any)

      /**
       * @param processPath The path to the process executable.
       */
      public fun processPath(processPath: IResolvable)

      /**
       * @param processPath The path to the process executable.
       */
      public fun processPath(processPath: List<Any>)

      /**
       * @param processPath The path to the process executable.
       */
      public fun processPath(vararg processPath: Any)

      /**
       * @param processPid The process ID.
       */
      public fun processPid(processPid: IResolvable)

      /**
       * @param processPid The process ID.
       */
      public fun processPid(processPid: List<Any>)

      /**
       * @param processPid The process ID.
       */
      public fun processPid(vararg processPid: Any)

      /**
       * @param processTerminatedAt A timestamp that identifies when the process was terminated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun processTerminatedAt(processTerminatedAt: IResolvable)

      /**
       * @param processTerminatedAt A timestamp that identifies when the process was terminated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun processTerminatedAt(processTerminatedAt: List<Any>)

      /**
       * @param processTerminatedAt A timestamp that identifies when the process was terminated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun processTerminatedAt(vararg processTerminatedAt: Any)

      /**
       * @param productArn The ARN generated by Security Hub that uniquely identifies a third-party
       * company (security findings provider) after this provider's product (solution that generates
       * findings) is registered with Security Hub.
       */
      public fun productArn(productArn: IResolvable)

      /**
       * @param productArn The ARN generated by Security Hub that uniquely identifies a third-party
       * company (security findings provider) after this provider's product (solution that generates
       * findings) is registered with Security Hub.
       */
      public fun productArn(productArn: List<Any>)

      /**
       * @param productArn The ARN generated by Security Hub that uniquely identifies a third-party
       * company (security findings provider) after this provider's product (solution that generates
       * findings) is registered with Security Hub.
       */
      public fun productArn(vararg productArn: Any)

      /**
       * @param productFields A data type where security findings providers can include additional
       * solution-specific details that aren't part of the defined `AwsSecurityFinding` format.
       */
      public fun productFields(productFields: IResolvable)

      /**
       * @param productFields A data type where security findings providers can include additional
       * solution-specific details that aren't part of the defined `AwsSecurityFinding` format.
       */
      public fun productFields(productFields: List<Any>)

      /**
       * @param productFields A data type where security findings providers can include additional
       * solution-specific details that aren't part of the defined `AwsSecurityFinding` format.
       */
      public fun productFields(vararg productFields: Any)

      /**
       * @param productName The name of the solution (product) that generates findings.
       */
      public fun productName(productName: IResolvable)

      /**
       * @param productName The name of the solution (product) that generates findings.
       */
      public fun productName(productName: List<Any>)

      /**
       * @param productName The name of the solution (product) that generates findings.
       */
      public fun productName(vararg productName: Any)

      /**
       * @param recommendationText The recommendation of what to do about the issue described in a
       * finding.
       */
      public fun recommendationText(recommendationText: IResolvable)

      /**
       * @param recommendationText The recommendation of what to do about the issue described in a
       * finding.
       */
      public fun recommendationText(recommendationText: List<Any>)

      /**
       * @param recommendationText The recommendation of what to do about the issue described in a
       * finding.
       */
      public fun recommendationText(vararg recommendationText: Any)

      /**
       * @param recordState The updated record state for the finding.
       */
      public fun recordState(recordState: IResolvable)

      /**
       * @param recordState The updated record state for the finding.
       */
      public fun recordState(recordState: List<Any>)

      /**
       * @param recordState The updated record state for the finding.
       */
      public fun recordState(vararg recordState: Any)

      /**
       * @param region The Region from which the finding was generated.
       */
      public fun region(region: IResolvable)

      /**
       * @param region The Region from which the finding was generated.
       */
      public fun region(region: List<Any>)

      /**
       * @param region The Region from which the finding was generated.
       */
      public fun region(vararg region: Any)

      /**
       * @param relatedFindingsId The solution-generated identifier for a related finding.
       */
      public fun relatedFindingsId(relatedFindingsId: IResolvable)

      /**
       * @param relatedFindingsId The solution-generated identifier for a related finding.
       */
      public fun relatedFindingsId(relatedFindingsId: List<Any>)

      /**
       * @param relatedFindingsId The solution-generated identifier for a related finding.
       */
      public fun relatedFindingsId(vararg relatedFindingsId: Any)

      /**
       * @param relatedFindingsProductArn The ARN of the solution that generated a related finding.
       */
      public fun relatedFindingsProductArn(relatedFindingsProductArn: IResolvable)

      /**
       * @param relatedFindingsProductArn The ARN of the solution that generated a related finding.
       */
      public fun relatedFindingsProductArn(relatedFindingsProductArn: List<Any>)

      /**
       * @param relatedFindingsProductArn The ARN of the solution that generated a related finding.
       */
      public fun relatedFindingsProductArn(vararg relatedFindingsProductArn: Any)

      /**
       * @param resourceApplicationArn The ARN of the application that is related to a finding.
       */
      public fun resourceApplicationArn(resourceApplicationArn: IResolvable)

      /**
       * @param resourceApplicationArn The ARN of the application that is related to a finding.
       */
      public fun resourceApplicationArn(resourceApplicationArn: List<Any>)

      /**
       * @param resourceApplicationArn The ARN of the application that is related to a finding.
       */
      public fun resourceApplicationArn(vararg resourceApplicationArn: Any)

      /**
       * @param resourceApplicationName The name of the application that is related to a finding.
       */
      public fun resourceApplicationName(resourceApplicationName: IResolvable)

      /**
       * @param resourceApplicationName The name of the application that is related to a finding.
       */
      public fun resourceApplicationName(resourceApplicationName: List<Any>)

      /**
       * @param resourceApplicationName The name of the application that is related to a finding.
       */
      public fun resourceApplicationName(vararg resourceApplicationName: Any)

      /**
       * @param resourceAwsEc2InstanceIamInstanceProfileArn The IAM profile ARN of the instance.
       */
      public
          fun resourceAwsEc2InstanceIamInstanceProfileArn(resourceAwsEc2InstanceIamInstanceProfileArn: IResolvable)

      /**
       * @param resourceAwsEc2InstanceIamInstanceProfileArn The IAM profile ARN of the instance.
       */
      public
          fun resourceAwsEc2InstanceIamInstanceProfileArn(resourceAwsEc2InstanceIamInstanceProfileArn: List<Any>)

      /**
       * @param resourceAwsEc2InstanceIamInstanceProfileArn The IAM profile ARN of the instance.
       */
      public fun resourceAwsEc2InstanceIamInstanceProfileArn(vararg
          resourceAwsEc2InstanceIamInstanceProfileArn: Any)

      /**
       * @param resourceAwsEc2InstanceImageId The Amazon Machine Image (AMI) ID of the instance.
       */
      public fun resourceAwsEc2InstanceImageId(resourceAwsEc2InstanceImageId: IResolvable)

      /**
       * @param resourceAwsEc2InstanceImageId The Amazon Machine Image (AMI) ID of the instance.
       */
      public fun resourceAwsEc2InstanceImageId(resourceAwsEc2InstanceImageId: List<Any>)

      /**
       * @param resourceAwsEc2InstanceImageId The Amazon Machine Image (AMI) ID of the instance.
       */
      public fun resourceAwsEc2InstanceImageId(vararg resourceAwsEc2InstanceImageId: Any)

      /**
       * @param resourceAwsEc2InstanceIpV4Addresses The IPv4 addresses associated with the instance.
       */
      public
          fun resourceAwsEc2InstanceIpV4Addresses(resourceAwsEc2InstanceIpV4Addresses: IResolvable)

      /**
       * @param resourceAwsEc2InstanceIpV4Addresses The IPv4 addresses associated with the instance.
       */
      public fun resourceAwsEc2InstanceIpV4Addresses(resourceAwsEc2InstanceIpV4Addresses: List<Any>)

      /**
       * @param resourceAwsEc2InstanceIpV4Addresses The IPv4 addresses associated with the instance.
       */
      public fun resourceAwsEc2InstanceIpV4Addresses(vararg
          resourceAwsEc2InstanceIpV4Addresses: Any)

      /**
       * @param resourceAwsEc2InstanceIpV6Addresses The IPv6 addresses associated with the instance.
       */
      public
          fun resourceAwsEc2InstanceIpV6Addresses(resourceAwsEc2InstanceIpV6Addresses: IResolvable)

      /**
       * @param resourceAwsEc2InstanceIpV6Addresses The IPv6 addresses associated with the instance.
       */
      public fun resourceAwsEc2InstanceIpV6Addresses(resourceAwsEc2InstanceIpV6Addresses: List<Any>)

      /**
       * @param resourceAwsEc2InstanceIpV6Addresses The IPv6 addresses associated with the instance.
       */
      public fun resourceAwsEc2InstanceIpV6Addresses(vararg
          resourceAwsEc2InstanceIpV6Addresses: Any)

      /**
       * @param resourceAwsEc2InstanceKeyName The key name associated with the instance.
       */
      public fun resourceAwsEc2InstanceKeyName(resourceAwsEc2InstanceKeyName: IResolvable)

      /**
       * @param resourceAwsEc2InstanceKeyName The key name associated with the instance.
       */
      public fun resourceAwsEc2InstanceKeyName(resourceAwsEc2InstanceKeyName: List<Any>)

      /**
       * @param resourceAwsEc2InstanceKeyName The key name associated with the instance.
       */
      public fun resourceAwsEc2InstanceKeyName(vararg resourceAwsEc2InstanceKeyName: Any)

      /**
       * @param resourceAwsEc2InstanceLaunchedAt The date and time the instance was launched.
       */
      public fun resourceAwsEc2InstanceLaunchedAt(resourceAwsEc2InstanceLaunchedAt: IResolvable)

      /**
       * @param resourceAwsEc2InstanceLaunchedAt The date and time the instance was launched.
       */
      public fun resourceAwsEc2InstanceLaunchedAt(resourceAwsEc2InstanceLaunchedAt: List<Any>)

      /**
       * @param resourceAwsEc2InstanceLaunchedAt The date and time the instance was launched.
       */
      public fun resourceAwsEc2InstanceLaunchedAt(vararg resourceAwsEc2InstanceLaunchedAt: Any)

      /**
       * @param resourceAwsEc2InstanceSubnetId The identifier of the subnet that the instance was
       * launched in.
       */
      public fun resourceAwsEc2InstanceSubnetId(resourceAwsEc2InstanceSubnetId: IResolvable)

      /**
       * @param resourceAwsEc2InstanceSubnetId The identifier of the subnet that the instance was
       * launched in.
       */
      public fun resourceAwsEc2InstanceSubnetId(resourceAwsEc2InstanceSubnetId: List<Any>)

      /**
       * @param resourceAwsEc2InstanceSubnetId The identifier of the subnet that the instance was
       * launched in.
       */
      public fun resourceAwsEc2InstanceSubnetId(vararg resourceAwsEc2InstanceSubnetId: Any)

      /**
       * @param resourceAwsEc2InstanceType The instance type of the instance.
       */
      public fun resourceAwsEc2InstanceType(resourceAwsEc2InstanceType: IResolvable)

      /**
       * @param resourceAwsEc2InstanceType The instance type of the instance.
       */
      public fun resourceAwsEc2InstanceType(resourceAwsEc2InstanceType: List<Any>)

      /**
       * @param resourceAwsEc2InstanceType The instance type of the instance.
       */
      public fun resourceAwsEc2InstanceType(vararg resourceAwsEc2InstanceType: Any)

      /**
       * @param resourceAwsEc2InstanceVpcId The identifier of the VPC that the instance was launched
       * in.
       */
      public fun resourceAwsEc2InstanceVpcId(resourceAwsEc2InstanceVpcId: IResolvable)

      /**
       * @param resourceAwsEc2InstanceVpcId The identifier of the VPC that the instance was launched
       * in.
       */
      public fun resourceAwsEc2InstanceVpcId(resourceAwsEc2InstanceVpcId: List<Any>)

      /**
       * @param resourceAwsEc2InstanceVpcId The identifier of the VPC that the instance was launched
       * in.
       */
      public fun resourceAwsEc2InstanceVpcId(vararg resourceAwsEc2InstanceVpcId: Any)

      /**
       * @param resourceAwsIamAccessKeyCreatedAt The creation date/time of the IAM access key
       * related to a finding.
       */
      public fun resourceAwsIamAccessKeyCreatedAt(resourceAwsIamAccessKeyCreatedAt: IResolvable)

      /**
       * @param resourceAwsIamAccessKeyCreatedAt The creation date/time of the IAM access key
       * related to a finding.
       */
      public fun resourceAwsIamAccessKeyCreatedAt(resourceAwsIamAccessKeyCreatedAt: List<Any>)

      /**
       * @param resourceAwsIamAccessKeyCreatedAt The creation date/time of the IAM access key
       * related to a finding.
       */
      public fun resourceAwsIamAccessKeyCreatedAt(vararg resourceAwsIamAccessKeyCreatedAt: Any)

      /**
       * @param resourceAwsIamAccessKeyPrincipalName The name of the principal that is associated
       * with an IAM access key.
       */
      public
          fun resourceAwsIamAccessKeyPrincipalName(resourceAwsIamAccessKeyPrincipalName: IResolvable)

      /**
       * @param resourceAwsIamAccessKeyPrincipalName The name of the principal that is associated
       * with an IAM access key.
       */
      public
          fun resourceAwsIamAccessKeyPrincipalName(resourceAwsIamAccessKeyPrincipalName: List<Any>)

      /**
       * @param resourceAwsIamAccessKeyPrincipalName The name of the principal that is associated
       * with an IAM access key.
       */
      public fun resourceAwsIamAccessKeyPrincipalName(vararg
          resourceAwsIamAccessKeyPrincipalName: Any)

      /**
       * @param resourceAwsIamAccessKeyStatus The status of the IAM access key related to a finding.
       */
      public fun resourceAwsIamAccessKeyStatus(resourceAwsIamAccessKeyStatus: IResolvable)

      /**
       * @param resourceAwsIamAccessKeyStatus The status of the IAM access key related to a finding.
       */
      public fun resourceAwsIamAccessKeyStatus(resourceAwsIamAccessKeyStatus: List<Any>)

      /**
       * @param resourceAwsIamAccessKeyStatus The status of the IAM access key related to a finding.
       */
      public fun resourceAwsIamAccessKeyStatus(vararg resourceAwsIamAccessKeyStatus: Any)

      /**
       * @param resourceAwsIamAccessKeyUserName This field is deprecated.
       * The username associated with the IAM access key related to a finding.
       */
      public fun resourceAwsIamAccessKeyUserName(resourceAwsIamAccessKeyUserName: IResolvable)

      /**
       * @param resourceAwsIamAccessKeyUserName This field is deprecated.
       * The username associated with the IAM access key related to a finding.
       */
      public fun resourceAwsIamAccessKeyUserName(resourceAwsIamAccessKeyUserName: List<Any>)

      /**
       * @param resourceAwsIamAccessKeyUserName This field is deprecated.
       * The username associated with the IAM access key related to a finding.
       */
      public fun resourceAwsIamAccessKeyUserName(vararg resourceAwsIamAccessKeyUserName: Any)

      /**
       * @param resourceAwsIamUserUserName The name of an IAM user.
       */
      public fun resourceAwsIamUserUserName(resourceAwsIamUserUserName: IResolvable)

      /**
       * @param resourceAwsIamUserUserName The name of an IAM user.
       */
      public fun resourceAwsIamUserUserName(resourceAwsIamUserUserName: List<Any>)

      /**
       * @param resourceAwsIamUserUserName The name of an IAM user.
       */
      public fun resourceAwsIamUserUserName(vararg resourceAwsIamUserUserName: Any)

      /**
       * @param resourceAwsS3BucketOwnerId The canonical user ID of the owner of the S3 bucket.
       */
      public fun resourceAwsS3BucketOwnerId(resourceAwsS3BucketOwnerId: IResolvable)

      /**
       * @param resourceAwsS3BucketOwnerId The canonical user ID of the owner of the S3 bucket.
       */
      public fun resourceAwsS3BucketOwnerId(resourceAwsS3BucketOwnerId: List<Any>)

      /**
       * @param resourceAwsS3BucketOwnerId The canonical user ID of the owner of the S3 bucket.
       */
      public fun resourceAwsS3BucketOwnerId(vararg resourceAwsS3BucketOwnerId: Any)

      /**
       * @param resourceAwsS3BucketOwnerName The display name of the owner of the S3 bucket.
       */
      public fun resourceAwsS3BucketOwnerName(resourceAwsS3BucketOwnerName: IResolvable)

      /**
       * @param resourceAwsS3BucketOwnerName The display name of the owner of the S3 bucket.
       */
      public fun resourceAwsS3BucketOwnerName(resourceAwsS3BucketOwnerName: List<Any>)

      /**
       * @param resourceAwsS3BucketOwnerName The display name of the owner of the S3 bucket.
       */
      public fun resourceAwsS3BucketOwnerName(vararg resourceAwsS3BucketOwnerName: Any)

      /**
       * @param resourceContainerImageId The identifier of the image related to a finding.
       */
      public fun resourceContainerImageId(resourceContainerImageId: IResolvable)

      /**
       * @param resourceContainerImageId The identifier of the image related to a finding.
       */
      public fun resourceContainerImageId(resourceContainerImageId: List<Any>)

      /**
       * @param resourceContainerImageId The identifier of the image related to a finding.
       */
      public fun resourceContainerImageId(vararg resourceContainerImageId: Any)

      /**
       * @param resourceContainerImageName The name of the image related to a finding.
       */
      public fun resourceContainerImageName(resourceContainerImageName: IResolvable)

      /**
       * @param resourceContainerImageName The name of the image related to a finding.
       */
      public fun resourceContainerImageName(resourceContainerImageName: List<Any>)

      /**
       * @param resourceContainerImageName The name of the image related to a finding.
       */
      public fun resourceContainerImageName(vararg resourceContainerImageName: Any)

      /**
       * @param resourceContainerLaunchedAt A timestamp that identifies when the container was
       * started.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun resourceContainerLaunchedAt(resourceContainerLaunchedAt: IResolvable)

      /**
       * @param resourceContainerLaunchedAt A timestamp that identifies when the container was
       * started.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun resourceContainerLaunchedAt(resourceContainerLaunchedAt: List<Any>)

      /**
       * @param resourceContainerLaunchedAt A timestamp that identifies when the container was
       * started.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun resourceContainerLaunchedAt(vararg resourceContainerLaunchedAt: Any)

      /**
       * @param resourceContainerName The name of the container related to a finding.
       */
      public fun resourceContainerName(resourceContainerName: IResolvable)

      /**
       * @param resourceContainerName The name of the container related to a finding.
       */
      public fun resourceContainerName(resourceContainerName: List<Any>)

      /**
       * @param resourceContainerName The name of the container related to a finding.
       */
      public fun resourceContainerName(vararg resourceContainerName: Any)

      /**
       * @param resourceDetailsOther The details of a resource that doesn't have a specific subfield
       * for the resource type defined.
       */
      public fun resourceDetailsOther(resourceDetailsOther: IResolvable)

      /**
       * @param resourceDetailsOther The details of a resource that doesn't have a specific subfield
       * for the resource type defined.
       */
      public fun resourceDetailsOther(resourceDetailsOther: List<Any>)

      /**
       * @param resourceDetailsOther The details of a resource that doesn't have a specific subfield
       * for the resource type defined.
       */
      public fun resourceDetailsOther(vararg resourceDetailsOther: Any)

      /**
       * @param resourceId The canonical identifier for the given resource type.
       */
      public fun resourceId(resourceId: IResolvable)

      /**
       * @param resourceId The canonical identifier for the given resource type.
       */
      public fun resourceId(resourceId: List<Any>)

      /**
       * @param resourceId The canonical identifier for the given resource type.
       */
      public fun resourceId(vararg resourceId: Any)

      /**
       * @param resourcePartition The canonical AWS partition name that the Region is assigned to.
       */
      public fun resourcePartition(resourcePartition: IResolvable)

      /**
       * @param resourcePartition The canonical AWS partition name that the Region is assigned to.
       */
      public fun resourcePartition(resourcePartition: List<Any>)

      /**
       * @param resourcePartition The canonical AWS partition name that the Region is assigned to.
       */
      public fun resourcePartition(vararg resourcePartition: Any)

      /**
       * @param resourceRegion The canonical AWS external Region name where this resource is
       * located.
       */
      public fun resourceRegion(resourceRegion: IResolvable)

      /**
       * @param resourceRegion The canonical AWS external Region name where this resource is
       * located.
       */
      public fun resourceRegion(resourceRegion: List<Any>)

      /**
       * @param resourceRegion The canonical AWS external Region name where this resource is
       * located.
       */
      public fun resourceRegion(vararg resourceRegion: Any)

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       */
      public fun resourceTags(resourceTags: IResolvable)

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       */
      public fun resourceTags(resourceTags: List<Any>)

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       */
      public fun resourceTags(vararg resourceTags: Any)

      /**
       * @param resourceType Specifies the type of the resource that details are provided for.
       */
      public fun resourceType(resourceType: IResolvable)

      /**
       * @param resourceType Specifies the type of the resource that details are provided for.
       */
      public fun resourceType(resourceType: List<Any>)

      /**
       * @param resourceType Specifies the type of the resource that details are provided for.
       */
      public fun resourceType(vararg resourceType: Any)

      /**
       * @param sample Indicates whether or not sample findings are included in the filter results.
       */
      public fun sample(sample: IResolvable)

      /**
       * @param sample Indicates whether or not sample findings are included in the filter results.
       */
      public fun sample(sample: List<Any>)

      /**
       * @param sample Indicates whether or not sample findings are included in the filter results.
       */
      public fun sample(vararg sample: Any)

      /**
       * @param severityLabel The label of a finding's severity.
       */
      public fun severityLabel(severityLabel: IResolvable)

      /**
       * @param severityLabel The label of a finding's severity.
       */
      public fun severityLabel(severityLabel: List<Any>)

      /**
       * @param severityLabel The label of a finding's severity.
       */
      public fun severityLabel(vararg severityLabel: Any)

      /**
       * @param severityNormalized Deprecated. The normalized severity of a finding. Instead of
       * providing `Normalized` , provide `Label` .
       * If you provide `Label` and do not provide `Normalized` , then `Normalized` is set
       * automatically as follows.
       *
       * * `INFORMATIONAL` - 0
       * * `LOW` - 1
       * * `MEDIUM` - 40
       * * `HIGH` - 70
       * * `CRITICAL` - 90
       */
      public fun severityNormalized(severityNormalized: IResolvable)

      /**
       * @param severityNormalized Deprecated. The normalized severity of a finding. Instead of
       * providing `Normalized` , provide `Label` .
       * If you provide `Label` and do not provide `Normalized` , then `Normalized` is set
       * automatically as follows.
       *
       * * `INFORMATIONAL` - 0
       * * `LOW` - 1
       * * `MEDIUM` - 40
       * * `HIGH` - 70
       * * `CRITICAL` - 90
       */
      public fun severityNormalized(severityNormalized: List<Any>)

      /**
       * @param severityNormalized Deprecated. The normalized severity of a finding. Instead of
       * providing `Normalized` , provide `Label` .
       * If you provide `Label` and do not provide `Normalized` , then `Normalized` is set
       * automatically as follows.
       *
       * * `INFORMATIONAL` - 0
       * * `LOW` - 1
       * * `MEDIUM` - 40
       * * `HIGH` - 70
       * * `CRITICAL` - 90
       */
      public fun severityNormalized(vararg severityNormalized: Any)

      /**
       * @param severityProduct Deprecated. This attribute isn't included in findings. Instead of
       * providing `Product` , provide `Original` .
       * The native severity as defined by the AWS service or integrated partner product that
       * generated the finding.
       */
      public fun severityProduct(severityProduct: IResolvable)

      /**
       * @param severityProduct Deprecated. This attribute isn't included in findings. Instead of
       * providing `Product` , provide `Original` .
       * The native severity as defined by the AWS service or integrated partner product that
       * generated the finding.
       */
      public fun severityProduct(severityProduct: List<Any>)

      /**
       * @param severityProduct Deprecated. This attribute isn't included in findings. Instead of
       * providing `Product` , provide `Original` .
       * The native severity as defined by the AWS service or integrated partner product that
       * generated the finding.
       */
      public fun severityProduct(vararg severityProduct: Any)

      /**
       * @param sourceUrl A URL that links to a page about the current finding in the security
       * findings provider's solution.
       */
      public fun sourceUrl(sourceUrl: IResolvable)

      /**
       * @param sourceUrl A URL that links to a page about the current finding in the security
       * findings provider's solution.
       */
      public fun sourceUrl(sourceUrl: List<Any>)

      /**
       * @param sourceUrl A URL that links to a page about the current finding in the security
       * findings provider's solution.
       */
      public fun sourceUrl(vararg sourceUrl: Any)

      /**
       * @param threatIntelIndicatorCategory The category of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorCategory(threatIntelIndicatorCategory: IResolvable)

      /**
       * @param threatIntelIndicatorCategory The category of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorCategory(threatIntelIndicatorCategory: List<Any>)

      /**
       * @param threatIntelIndicatorCategory The category of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorCategory(vararg threatIntelIndicatorCategory: Any)

      /**
       * @param threatIntelIndicatorLastObservedAt A timestamp that identifies the last observation
       * of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorLastObservedAt(threatIntelIndicatorLastObservedAt: IResolvable)

      /**
       * @param threatIntelIndicatorLastObservedAt A timestamp that identifies the last observation
       * of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorLastObservedAt(threatIntelIndicatorLastObservedAt: List<Any>)

      /**
       * @param threatIntelIndicatorLastObservedAt A timestamp that identifies the last observation
       * of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorLastObservedAt(vararg threatIntelIndicatorLastObservedAt: Any)

      /**
       * @param threatIntelIndicatorSource The source of the threat intelligence.
       */
      public fun threatIntelIndicatorSource(threatIntelIndicatorSource: IResolvable)

      /**
       * @param threatIntelIndicatorSource The source of the threat intelligence.
       */
      public fun threatIntelIndicatorSource(threatIntelIndicatorSource: List<Any>)

      /**
       * @param threatIntelIndicatorSource The source of the threat intelligence.
       */
      public fun threatIntelIndicatorSource(vararg threatIntelIndicatorSource: Any)

      /**
       * @param threatIntelIndicatorSourceUrl The URL for more details from the source of the threat
       * intelligence.
       */
      public fun threatIntelIndicatorSourceUrl(threatIntelIndicatorSourceUrl: IResolvable)

      /**
       * @param threatIntelIndicatorSourceUrl The URL for more details from the source of the threat
       * intelligence.
       */
      public fun threatIntelIndicatorSourceUrl(threatIntelIndicatorSourceUrl: List<Any>)

      /**
       * @param threatIntelIndicatorSourceUrl The URL for more details from the source of the threat
       * intelligence.
       */
      public fun threatIntelIndicatorSourceUrl(vararg threatIntelIndicatorSourceUrl: Any)

      /**
       * @param threatIntelIndicatorType The type of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorType(threatIntelIndicatorType: IResolvable)

      /**
       * @param threatIntelIndicatorType The type of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorType(threatIntelIndicatorType: List<Any>)

      /**
       * @param threatIntelIndicatorType The type of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorType(vararg threatIntelIndicatorType: Any)

      /**
       * @param threatIntelIndicatorValue The value of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorValue(threatIntelIndicatorValue: IResolvable)

      /**
       * @param threatIntelIndicatorValue The value of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorValue(threatIntelIndicatorValue: List<Any>)

      /**
       * @param threatIntelIndicatorValue The value of a threat intelligence indicator.
       */
      public fun threatIntelIndicatorValue(vararg threatIntelIndicatorValue: Any)

      /**
       * @param title A finding's title.
       */
      public fun title(title: IResolvable)

      /**
       * @param title A finding's title.
       */
      public fun title(title: List<Any>)

      /**
       * @param title A finding's title.
       */
      public fun title(vararg title: Any)

      /**
       * @param type A finding type in the format of `namespace/category/classifier` that classifies
       * a finding.
       */
      public fun type(type: IResolvable)

      /**
       * @param type A finding type in the format of `namespace/category/classifier` that classifies
       * a finding.
       */
      public fun type(type: List<Any>)

      /**
       * @param type A finding type in the format of `namespace/category/classifier` that classifies
       * a finding.
       */
      public fun type(vararg type: Any)

      /**
       * @param updatedAt A timestamp that indicates when the security findings provider last
       * updated the finding record.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun updatedAt(updatedAt: IResolvable)

      /**
       * @param updatedAt A timestamp that indicates when the security findings provider last
       * updated the finding record.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun updatedAt(updatedAt: List<Any>)

      /**
       * @param updatedAt A timestamp that indicates when the security findings provider last
       * updated the finding record.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun updatedAt(vararg updatedAt: Any)

      /**
       * @param userDefinedFields A list of name/value string pairs associated with the finding.
       * These are custom, user-defined fields added to a finding.
       */
      public fun userDefinedFields(userDefinedFields: IResolvable)

      /**
       * @param userDefinedFields A list of name/value string pairs associated with the finding.
       * These are custom, user-defined fields added to a finding.
       */
      public fun userDefinedFields(userDefinedFields: List<Any>)

      /**
       * @param userDefinedFields A list of name/value string pairs associated with the finding.
       * These are custom, user-defined fields added to a finding.
       */
      public fun userDefinedFields(vararg userDefinedFields: Any)

      /**
       * @param verificationState The veracity of a finding.
       */
      public fun verificationState(verificationState: IResolvable)

      /**
       * @param verificationState The veracity of a finding.
       */
      public fun verificationState(verificationState: List<Any>)

      /**
       * @param verificationState The veracity of a finding.
       */
      public fun verificationState(vararg verificationState: Any)

      /**
       * @param vulnerabilitiesExploitAvailable Indicates whether a software vulnerability in your
       * environment has a known exploit.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      public fun vulnerabilitiesExploitAvailable(vulnerabilitiesExploitAvailable: IResolvable)

      /**
       * @param vulnerabilitiesExploitAvailable Indicates whether a software vulnerability in your
       * environment has a known exploit.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      public fun vulnerabilitiesExploitAvailable(vulnerabilitiesExploitAvailable: List<Any>)

      /**
       * @param vulnerabilitiesExploitAvailable Indicates whether a software vulnerability in your
       * environment has a known exploit.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      public fun vulnerabilitiesExploitAvailable(vararg vulnerabilitiesExploitAvailable: Any)

      /**
       * @param vulnerabilitiesFixAvailable Indicates whether a vulnerability is fixed in a newer
       * version of the affected software packages.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      public fun vulnerabilitiesFixAvailable(vulnerabilitiesFixAvailable: IResolvable)

      /**
       * @param vulnerabilitiesFixAvailable Indicates whether a vulnerability is fixed in a newer
       * version of the affected software packages.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      public fun vulnerabilitiesFixAvailable(vulnerabilitiesFixAvailable: List<Any>)

      /**
       * @param vulnerabilitiesFixAvailable Indicates whether a vulnerability is fixed in a newer
       * version of the affected software packages.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      public fun vulnerabilitiesFixAvailable(vararg vulnerabilitiesFixAvailable: Any)

      /**
       * @param workflowState The workflow state of a finding.
       * Note that this field is deprecated. To search for a finding based on its workflow status,
       * use `WorkflowStatus` .
       */
      public fun workflowState(workflowState: IResolvable)

      /**
       * @param workflowState The workflow state of a finding.
       * Note that this field is deprecated. To search for a finding based on its workflow status,
       * use `WorkflowStatus` .
       */
      public fun workflowState(workflowState: List<Any>)

      /**
       * @param workflowState The workflow state of a finding.
       * Note that this field is deprecated. To search for a finding based on its workflow status,
       * use `WorkflowStatus` .
       */
      public fun workflowState(vararg workflowState: Any)

      /**
       * @param workflowStatus The status of the investigation into a finding. Allowed values are
       * the following.
       * * `NEW` - The initial state of a finding, before it is reviewed.
       *
       * Security Hub also resets the workflow status from `NOTIFIED` or `RESOLVED` to `NEW` in the
       * following cases:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to either `WARNING` , `FAILED` , or
       * `NOT_AVAILABLE` .
       * * `NOTIFIED` - Indicates that the resource owner has been notified about the security
       * issue. Used when the initial reviewer is not the resource owner, and needs intervention from
       * the resource owner.
       *
       * If one of the following occurs, the workflow status is changed automatically from
       * `NOTIFIED` to `NEW` :
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
       * is needed.
       *
       * The workflow status of a `SUPPRESSED` finding does not change if `RecordState` changes from
       * `ARCHIVED` to `ACTIVE` .
       *
       * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
       *
       * The finding remains `RESOLVED` unless one of the following occurs:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       *
       * In those cases, the workflow status is automatically reset to `NEW` .
       *
       * For findings from controls, if `Compliance.Status` is `PASSED` , then Security Hub
       * automatically sets the workflow status to `RESOLVED` .
       */
      public fun workflowStatus(workflowStatus: IResolvable)

      /**
       * @param workflowStatus The status of the investigation into a finding. Allowed values are
       * the following.
       * * `NEW` - The initial state of a finding, before it is reviewed.
       *
       * Security Hub also resets the workflow status from `NOTIFIED` or `RESOLVED` to `NEW` in the
       * following cases:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to either `WARNING` , `FAILED` , or
       * `NOT_AVAILABLE` .
       * * `NOTIFIED` - Indicates that the resource owner has been notified about the security
       * issue. Used when the initial reviewer is not the resource owner, and needs intervention from
       * the resource owner.
       *
       * If one of the following occurs, the workflow status is changed automatically from
       * `NOTIFIED` to `NEW` :
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
       * is needed.
       *
       * The workflow status of a `SUPPRESSED` finding does not change if `RecordState` changes from
       * `ARCHIVED` to `ACTIVE` .
       *
       * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
       *
       * The finding remains `RESOLVED` unless one of the following occurs:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       *
       * In those cases, the workflow status is automatically reset to `NEW` .
       *
       * For findings from controls, if `Compliance.Status` is `PASSED` , then Security Hub
       * automatically sets the workflow status to `RESOLVED` .
       */
      public fun workflowStatus(workflowStatus: List<Any>)

      /**
       * @param workflowStatus The status of the investigation into a finding. Allowed values are
       * the following.
       * * `NEW` - The initial state of a finding, before it is reviewed.
       *
       * Security Hub also resets the workflow status from `NOTIFIED` or `RESOLVED` to `NEW` in the
       * following cases:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to either `WARNING` , `FAILED` , or
       * `NOT_AVAILABLE` .
       * * `NOTIFIED` - Indicates that the resource owner has been notified about the security
       * issue. Used when the initial reviewer is not the resource owner, and needs intervention from
       * the resource owner.
       *
       * If one of the following occurs, the workflow status is changed automatically from
       * `NOTIFIED` to `NEW` :
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
       * is needed.
       *
       * The workflow status of a `SUPPRESSED` finding does not change if `RecordState` changes from
       * `ARCHIVED` to `ACTIVE` .
       *
       * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
       *
       * The finding remains `RESOLVED` unless one of the following occurs:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       *
       * In those cases, the workflow status is automatically reset to `NEW` .
       *
       * For findings from controls, if `Compliance.Status` is `PASSED` , then Security Hub
       * automatically sets the workflow status to `RESOLVED` .
       */
      public fun workflowStatus(vararg workflowStatus: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnInsight.AwsSecurityFindingFiltersProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnInsight.AwsSecurityFindingFiltersProperty.builder()

      /**
       * @param awsAccountId The AWS account ID in which a finding is generated.
       */
      override fun awsAccountId(awsAccountId: IResolvable) {
        cdkBuilder.awsAccountId(awsAccountId.let(IResolvable::unwrap))
      }

      /**
       * @param awsAccountId The AWS account ID in which a finding is generated.
       */
      override fun awsAccountId(awsAccountId: List<Any>) {
        cdkBuilder.awsAccountId(awsAccountId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param awsAccountId The AWS account ID in which a finding is generated.
       */
      override fun awsAccountId(vararg awsAccountId: Any): Unit =
          awsAccountId(awsAccountId.toList())

      /**
       * @param awsAccountName The name of the AWS account in which a finding is generated.
       */
      override fun awsAccountName(awsAccountName: IResolvable) {
        cdkBuilder.awsAccountName(awsAccountName.let(IResolvable::unwrap))
      }

      /**
       * @param awsAccountName The name of the AWS account in which a finding is generated.
       */
      override fun awsAccountName(awsAccountName: List<Any>) {
        cdkBuilder.awsAccountName(awsAccountName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param awsAccountName The name of the AWS account in which a finding is generated.
       */
      override fun awsAccountName(vararg awsAccountName: Any): Unit =
          awsAccountName(awsAccountName.toList())

      /**
       * @param companyName The name of the findings provider (company) that owns the solution
       * (product) that generates findings.
       */
      override fun companyName(companyName: IResolvable) {
        cdkBuilder.companyName(companyName.let(IResolvable::unwrap))
      }

      /**
       * @param companyName The name of the findings provider (company) that owns the solution
       * (product) that generates findings.
       */
      override fun companyName(companyName: List<Any>) {
        cdkBuilder.companyName(companyName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param companyName The name of the findings provider (company) that owns the solution
       * (product) that generates findings.
       */
      override fun companyName(vararg companyName: Any): Unit = companyName(companyName.toList())

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       */
      override fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: IResolvable) {
        cdkBuilder.complianceAssociatedStandardsId(complianceAssociatedStandardsId.let(IResolvable::unwrap))
      }

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       */
      override fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: List<Any>) {
        cdkBuilder.complianceAssociatedStandardsId(complianceAssociatedStandardsId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param complianceAssociatedStandardsId The unique identifier of a standard in which a
       * control is enabled.
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       */
      override fun complianceAssociatedStandardsId(vararg complianceAssociatedStandardsId: Any):
          Unit = complianceAssociatedStandardsId(complianceAssociatedStandardsId.toList())

      /**
       * @param complianceSecurityControlId The unique identifier of a control across standards.
       * Values for this field typically consist of an AWS service and a number, such as
       * APIGateway.5.
       */
      override fun complianceSecurityControlId(complianceSecurityControlId: IResolvable) {
        cdkBuilder.complianceSecurityControlId(complianceSecurityControlId.let(IResolvable::unwrap))
      }

      /**
       * @param complianceSecurityControlId The unique identifier of a control across standards.
       * Values for this field typically consist of an AWS service and a number, such as
       * APIGateway.5.
       */
      override fun complianceSecurityControlId(complianceSecurityControlId: List<Any>) {
        cdkBuilder.complianceSecurityControlId(complianceSecurityControlId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param complianceSecurityControlId The unique identifier of a control across standards.
       * Values for this field typically consist of an AWS service and a number, such as
       * APIGateway.5.
       */
      override fun complianceSecurityControlId(vararg complianceSecurityControlId: Any): Unit =
          complianceSecurityControlId(complianceSecurityControlId.toList())

      /**
       * @param complianceSecurityControlParametersName The name of a security control parameter.
       */
      override
          fun complianceSecurityControlParametersName(complianceSecurityControlParametersName: IResolvable) {
        cdkBuilder.complianceSecurityControlParametersName(complianceSecurityControlParametersName.let(IResolvable::unwrap))
      }

      /**
       * @param complianceSecurityControlParametersName The name of a security control parameter.
       */
      override
          fun complianceSecurityControlParametersName(complianceSecurityControlParametersName: List<Any>) {
        cdkBuilder.complianceSecurityControlParametersName(complianceSecurityControlParametersName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param complianceSecurityControlParametersName The name of a security control parameter.
       */
      override fun complianceSecurityControlParametersName(vararg
          complianceSecurityControlParametersName: Any): Unit =
          complianceSecurityControlParametersName(complianceSecurityControlParametersName.toList())

      /**
       * @param complianceSecurityControlParametersValue The current value of a security control
       * parameter.
       */
      override
          fun complianceSecurityControlParametersValue(complianceSecurityControlParametersValue: IResolvable) {
        cdkBuilder.complianceSecurityControlParametersValue(complianceSecurityControlParametersValue.let(IResolvable::unwrap))
      }

      /**
       * @param complianceSecurityControlParametersValue The current value of a security control
       * parameter.
       */
      override
          fun complianceSecurityControlParametersValue(complianceSecurityControlParametersValue: List<Any>) {
        cdkBuilder.complianceSecurityControlParametersValue(complianceSecurityControlParametersValue.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param complianceSecurityControlParametersValue The current value of a security control
       * parameter.
       */
      override fun complianceSecurityControlParametersValue(vararg
          complianceSecurityControlParametersValue: Any): Unit =
          complianceSecurityControlParametersValue(complianceSecurityControlParametersValue.toList())

      /**
       * @param complianceStatus Exclusive to findings that are generated as the result of a check
       * run against a specific rule in a supported standard, such as CIS AWS Foundations.
       * Contains security standard-related finding details.
       */
      override fun complianceStatus(complianceStatus: IResolvable) {
        cdkBuilder.complianceStatus(complianceStatus.let(IResolvable::unwrap))
      }

      /**
       * @param complianceStatus Exclusive to findings that are generated as the result of a check
       * run against a specific rule in a supported standard, such as CIS AWS Foundations.
       * Contains security standard-related finding details.
       */
      override fun complianceStatus(complianceStatus: List<Any>) {
        cdkBuilder.complianceStatus(complianceStatus.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param complianceStatus Exclusive to findings that are generated as the result of a check
       * run against a specific rule in a supported standard, such as CIS AWS Foundations.
       * Contains security standard-related finding details.
       */
      override fun complianceStatus(vararg complianceStatus: Any): Unit =
          complianceStatus(complianceStatus.toList())

      /**
       * @param confidence A finding's confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      override fun confidence(confidence: IResolvable) {
        cdkBuilder.confidence(confidence.let(IResolvable::unwrap))
      }

      /**
       * @param confidence A finding's confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      override fun confidence(confidence: List<Any>) {
        cdkBuilder.confidence(confidence.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param confidence A finding's confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      override fun confidence(vararg confidence: Any): Unit = confidence(confidence.toList())

      /**
       * @param createdAt A timestamp that indicates when the security findings provider created the
       * potential security issue that a finding reflects.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun createdAt(createdAt: IResolvable) {
        cdkBuilder.createdAt(createdAt.let(IResolvable::unwrap))
      }

      /**
       * @param createdAt A timestamp that indicates when the security findings provider created the
       * potential security issue that a finding reflects.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun createdAt(createdAt: List<Any>) {
        cdkBuilder.createdAt(createdAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param createdAt A timestamp that indicates when the security findings provider created the
       * potential security issue that a finding reflects.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun createdAt(vararg createdAt: Any): Unit = createdAt(createdAt.toList())

      /**
       * @param criticality The level of importance assigned to the resources associated with the
       * finding.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      override fun criticality(criticality: IResolvable) {
        cdkBuilder.criticality(criticality.let(IResolvable::unwrap))
      }

      /**
       * @param criticality The level of importance assigned to the resources associated with the
       * finding.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      override fun criticality(criticality: List<Any>) {
        cdkBuilder.criticality(criticality.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param criticality The level of importance assigned to the resources associated with the
       * finding.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      override fun criticality(vararg criticality: Any): Unit = criticality(criticality.toList())

      /**
       * @param description A finding's description.
       */
      override fun description(description: IResolvable) {
        cdkBuilder.description(description.let(IResolvable::unwrap))
      }

      /**
       * @param description A finding's description.
       */
      override fun description(description: List<Any>) {
        cdkBuilder.description(description.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param description A finding's description.
       */
      override fun description(vararg description: Any): Unit = description(description.toList())

      /**
       * @param findingProviderFieldsConfidence The finding provider value for the finding
       * confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      override fun findingProviderFieldsConfidence(findingProviderFieldsConfidence: IResolvable) {
        cdkBuilder.findingProviderFieldsConfidence(findingProviderFieldsConfidence.let(IResolvable::unwrap))
      }

      /**
       * @param findingProviderFieldsConfidence The finding provider value for the finding
       * confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      override fun findingProviderFieldsConfidence(findingProviderFieldsConfidence: List<Any>) {
        cdkBuilder.findingProviderFieldsConfidence(findingProviderFieldsConfidence.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param findingProviderFieldsConfidence The finding provider value for the finding
       * confidence.
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       */
      override fun findingProviderFieldsConfidence(vararg findingProviderFieldsConfidence: Any):
          Unit = findingProviderFieldsConfidence(findingProviderFieldsConfidence.toList())

      /**
       * @param findingProviderFieldsCriticality The finding provider value for the level of
       * importance assigned to the resources associated with the findings.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      override fun findingProviderFieldsCriticality(findingProviderFieldsCriticality: IResolvable) {
        cdkBuilder.findingProviderFieldsCriticality(findingProviderFieldsCriticality.let(IResolvable::unwrap))
      }

      /**
       * @param findingProviderFieldsCriticality The finding provider value for the level of
       * importance assigned to the resources associated with the findings.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      override fun findingProviderFieldsCriticality(findingProviderFieldsCriticality: List<Any>) {
        cdkBuilder.findingProviderFieldsCriticality(findingProviderFieldsCriticality.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param findingProviderFieldsCriticality The finding provider value for the level of
       * importance assigned to the resources associated with the findings.
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       */
      override fun findingProviderFieldsCriticality(vararg findingProviderFieldsCriticality: Any):
          Unit = findingProviderFieldsCriticality(findingProviderFieldsCriticality.toList())

      /**
       * @param findingProviderFieldsRelatedFindingsId The finding identifier of a related finding
       * that is identified by the finding provider.
       */
      override
          fun findingProviderFieldsRelatedFindingsId(findingProviderFieldsRelatedFindingsId: IResolvable) {
        cdkBuilder.findingProviderFieldsRelatedFindingsId(findingProviderFieldsRelatedFindingsId.let(IResolvable::unwrap))
      }

      /**
       * @param findingProviderFieldsRelatedFindingsId The finding identifier of a related finding
       * that is identified by the finding provider.
       */
      override
          fun findingProviderFieldsRelatedFindingsId(findingProviderFieldsRelatedFindingsId: List<Any>) {
        cdkBuilder.findingProviderFieldsRelatedFindingsId(findingProviderFieldsRelatedFindingsId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param findingProviderFieldsRelatedFindingsId The finding identifier of a related finding
       * that is identified by the finding provider.
       */
      override fun findingProviderFieldsRelatedFindingsId(vararg
          findingProviderFieldsRelatedFindingsId: Any): Unit =
          findingProviderFieldsRelatedFindingsId(findingProviderFieldsRelatedFindingsId.toList())

      /**
       * @param findingProviderFieldsRelatedFindingsProductArn The ARN of the solution that
       * generated a related finding that is identified by the finding provider.
       */
      override
          fun findingProviderFieldsRelatedFindingsProductArn(findingProviderFieldsRelatedFindingsProductArn: IResolvable) {
        cdkBuilder.findingProviderFieldsRelatedFindingsProductArn(findingProviderFieldsRelatedFindingsProductArn.let(IResolvable::unwrap))
      }

      /**
       * @param findingProviderFieldsRelatedFindingsProductArn The ARN of the solution that
       * generated a related finding that is identified by the finding provider.
       */
      override
          fun findingProviderFieldsRelatedFindingsProductArn(findingProviderFieldsRelatedFindingsProductArn: List<Any>) {
        cdkBuilder.findingProviderFieldsRelatedFindingsProductArn(findingProviderFieldsRelatedFindingsProductArn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param findingProviderFieldsRelatedFindingsProductArn The ARN of the solution that
       * generated a related finding that is identified by the finding provider.
       */
      override fun findingProviderFieldsRelatedFindingsProductArn(vararg
          findingProviderFieldsRelatedFindingsProductArn: Any): Unit =
          findingProviderFieldsRelatedFindingsProductArn(findingProviderFieldsRelatedFindingsProductArn.toList())

      /**
       * @param findingProviderFieldsSeverityLabel The finding provider value for the severity
       * label.
       */
      override
          fun findingProviderFieldsSeverityLabel(findingProviderFieldsSeverityLabel: IResolvable) {
        cdkBuilder.findingProviderFieldsSeverityLabel(findingProviderFieldsSeverityLabel.let(IResolvable::unwrap))
      }

      /**
       * @param findingProviderFieldsSeverityLabel The finding provider value for the severity
       * label.
       */
      override
          fun findingProviderFieldsSeverityLabel(findingProviderFieldsSeverityLabel: List<Any>) {
        cdkBuilder.findingProviderFieldsSeverityLabel(findingProviderFieldsSeverityLabel.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param findingProviderFieldsSeverityLabel The finding provider value for the severity
       * label.
       */
      override fun findingProviderFieldsSeverityLabel(vararg
          findingProviderFieldsSeverityLabel: Any): Unit =
          findingProviderFieldsSeverityLabel(findingProviderFieldsSeverityLabel.toList())

      /**
       * @param findingProviderFieldsSeverityOriginal The finding provider's original value for the
       * severity.
       */
      override
          fun findingProviderFieldsSeverityOriginal(findingProviderFieldsSeverityOriginal: IResolvable) {
        cdkBuilder.findingProviderFieldsSeverityOriginal(findingProviderFieldsSeverityOriginal.let(IResolvable::unwrap))
      }

      /**
       * @param findingProviderFieldsSeverityOriginal The finding provider's original value for the
       * severity.
       */
      override
          fun findingProviderFieldsSeverityOriginal(findingProviderFieldsSeverityOriginal: List<Any>) {
        cdkBuilder.findingProviderFieldsSeverityOriginal(findingProviderFieldsSeverityOriginal.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param findingProviderFieldsSeverityOriginal The finding provider's original value for the
       * severity.
       */
      override fun findingProviderFieldsSeverityOriginal(vararg
          findingProviderFieldsSeverityOriginal: Any): Unit =
          findingProviderFieldsSeverityOriginal(findingProviderFieldsSeverityOriginal.toList())

      /**
       * @param findingProviderFieldsTypes One or more finding types that the finding provider
       * assigned to the finding.
       * Uses the format of `namespace/category/classifier` that classify a finding.
       *
       * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual
       * Behaviors | Sensitive Data Identifications
       */
      override fun findingProviderFieldsTypes(findingProviderFieldsTypes: IResolvable) {
        cdkBuilder.findingProviderFieldsTypes(findingProviderFieldsTypes.let(IResolvable::unwrap))
      }

      /**
       * @param findingProviderFieldsTypes One or more finding types that the finding provider
       * assigned to the finding.
       * Uses the format of `namespace/category/classifier` that classify a finding.
       *
       * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual
       * Behaviors | Sensitive Data Identifications
       */
      override fun findingProviderFieldsTypes(findingProviderFieldsTypes: List<Any>) {
        cdkBuilder.findingProviderFieldsTypes(findingProviderFieldsTypes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param findingProviderFieldsTypes One or more finding types that the finding provider
       * assigned to the finding.
       * Uses the format of `namespace/category/classifier` that classify a finding.
       *
       * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual
       * Behaviors | Sensitive Data Identifications
       */
      override fun findingProviderFieldsTypes(vararg findingProviderFieldsTypes: Any): Unit =
          findingProviderFieldsTypes(findingProviderFieldsTypes.toList())

      /**
       * @param firstObservedAt A timestamp that indicates when the security findings provider first
       * observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun firstObservedAt(firstObservedAt: IResolvable) {
        cdkBuilder.firstObservedAt(firstObservedAt.let(IResolvable::unwrap))
      }

      /**
       * @param firstObservedAt A timestamp that indicates when the security findings provider first
       * observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun firstObservedAt(firstObservedAt: List<Any>) {
        cdkBuilder.firstObservedAt(firstObservedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param firstObservedAt A timestamp that indicates when the security findings provider first
       * observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun firstObservedAt(vararg firstObservedAt: Any): Unit =
          firstObservedAt(firstObservedAt.toList())

      /**
       * @param generatorId The identifier for the solution-specific component (a discrete unit of
       * logic) that generated a finding.
       * In various security findings providers' solutions, this generator can be called a rule, a
       * check, a detector, a plugin, etc.
       */
      override fun generatorId(generatorId: IResolvable) {
        cdkBuilder.generatorId(generatorId.let(IResolvable::unwrap))
      }

      /**
       * @param generatorId The identifier for the solution-specific component (a discrete unit of
       * logic) that generated a finding.
       * In various security findings providers' solutions, this generator can be called a rule, a
       * check, a detector, a plugin, etc.
       */
      override fun generatorId(generatorId: List<Any>) {
        cdkBuilder.generatorId(generatorId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param generatorId The identifier for the solution-specific component (a discrete unit of
       * logic) that generated a finding.
       * In various security findings providers' solutions, this generator can be called a rule, a
       * check, a detector, a plugin, etc.
       */
      override fun generatorId(vararg generatorId: Any): Unit = generatorId(generatorId.toList())

      /**
       * @param id The security findings provider-specific identifier for a finding.
       */
      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      /**
       * @param id The security findings provider-specific identifier for a finding.
       */
      override fun id(id: List<Any>) {
        cdkBuilder.id(id.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param id The security findings provider-specific identifier for a finding.
       */
      override fun id(vararg id: Any): Unit = id(id.toList())

      /**
       * @param keyword This field is deprecated.
       * A keyword for a finding.
       */
      override fun keyword(keyword: IResolvable) {
        cdkBuilder.keyword(keyword.let(IResolvable::unwrap))
      }

      /**
       * @param keyword This field is deprecated.
       * A keyword for a finding.
       */
      override fun keyword(keyword: List<Any>) {
        cdkBuilder.keyword(keyword.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param keyword This field is deprecated.
       * A keyword for a finding.
       */
      override fun keyword(vararg keyword: Any): Unit = keyword(keyword.toList())

      /**
       * @param lastObservedAt A timestamp that indicates when the security findings provider most
       * recently observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun lastObservedAt(lastObservedAt: IResolvable) {
        cdkBuilder.lastObservedAt(lastObservedAt.let(IResolvable::unwrap))
      }

      /**
       * @param lastObservedAt A timestamp that indicates when the security findings provider most
       * recently observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun lastObservedAt(lastObservedAt: List<Any>) {
        cdkBuilder.lastObservedAt(lastObservedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param lastObservedAt A timestamp that indicates when the security findings provider most
       * recently observed the potential security issue that a finding captured.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun lastObservedAt(vararg lastObservedAt: Any): Unit =
          lastObservedAt(lastObservedAt.toList())

      /**
       * @param malwareName The name of the malware that was observed.
       */
      override fun malwareName(malwareName: IResolvable) {
        cdkBuilder.malwareName(malwareName.let(IResolvable::unwrap))
      }

      /**
       * @param malwareName The name of the malware that was observed.
       */
      override fun malwareName(malwareName: List<Any>) {
        cdkBuilder.malwareName(malwareName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param malwareName The name of the malware that was observed.
       */
      override fun malwareName(vararg malwareName: Any): Unit = malwareName(malwareName.toList())

      /**
       * @param malwarePath The filesystem path of the malware that was observed.
       */
      override fun malwarePath(malwarePath: IResolvable) {
        cdkBuilder.malwarePath(malwarePath.let(IResolvable::unwrap))
      }

      /**
       * @param malwarePath The filesystem path of the malware that was observed.
       */
      override fun malwarePath(malwarePath: List<Any>) {
        cdkBuilder.malwarePath(malwarePath.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param malwarePath The filesystem path of the malware that was observed.
       */
      override fun malwarePath(vararg malwarePath: Any): Unit = malwarePath(malwarePath.toList())

      /**
       * @param malwareState The state of the malware that was observed.
       */
      override fun malwareState(malwareState: IResolvable) {
        cdkBuilder.malwareState(malwareState.let(IResolvable::unwrap))
      }

      /**
       * @param malwareState The state of the malware that was observed.
       */
      override fun malwareState(malwareState: List<Any>) {
        cdkBuilder.malwareState(malwareState.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param malwareState The state of the malware that was observed.
       */
      override fun malwareState(vararg malwareState: Any): Unit =
          malwareState(malwareState.toList())

      /**
       * @param malwareType The type of the malware that was observed.
       */
      override fun malwareType(malwareType: IResolvable) {
        cdkBuilder.malwareType(malwareType.let(IResolvable::unwrap))
      }

      /**
       * @param malwareType The type of the malware that was observed.
       */
      override fun malwareType(malwareType: List<Any>) {
        cdkBuilder.malwareType(malwareType.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param malwareType The type of the malware that was observed.
       */
      override fun malwareType(vararg malwareType: Any): Unit = malwareType(malwareType.toList())

      /**
       * @param networkDestinationDomain The destination domain of network-related information about
       * a finding.
       */
      override fun networkDestinationDomain(networkDestinationDomain: IResolvable) {
        cdkBuilder.networkDestinationDomain(networkDestinationDomain.let(IResolvable::unwrap))
      }

      /**
       * @param networkDestinationDomain The destination domain of network-related information about
       * a finding.
       */
      override fun networkDestinationDomain(networkDestinationDomain: List<Any>) {
        cdkBuilder.networkDestinationDomain(networkDestinationDomain.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkDestinationDomain The destination domain of network-related information about
       * a finding.
       */
      override fun networkDestinationDomain(vararg networkDestinationDomain: Any): Unit =
          networkDestinationDomain(networkDestinationDomain.toList())

      /**
       * @param networkDestinationIpV4 The destination IPv4 address of network-related information
       * about a finding.
       */
      override fun networkDestinationIpV4(networkDestinationIpV4: IResolvable) {
        cdkBuilder.networkDestinationIpV4(networkDestinationIpV4.let(IResolvable::unwrap))
      }

      /**
       * @param networkDestinationIpV4 The destination IPv4 address of network-related information
       * about a finding.
       */
      override fun networkDestinationIpV4(networkDestinationIpV4: List<Any>) {
        cdkBuilder.networkDestinationIpV4(networkDestinationIpV4.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkDestinationIpV4 The destination IPv4 address of network-related information
       * about a finding.
       */
      override fun networkDestinationIpV4(vararg networkDestinationIpV4: Any): Unit =
          networkDestinationIpV4(networkDestinationIpV4.toList())

      /**
       * @param networkDestinationIpV6 The destination IPv6 address of network-related information
       * about a finding.
       */
      override fun networkDestinationIpV6(networkDestinationIpV6: IResolvable) {
        cdkBuilder.networkDestinationIpV6(networkDestinationIpV6.let(IResolvable::unwrap))
      }

      /**
       * @param networkDestinationIpV6 The destination IPv6 address of network-related information
       * about a finding.
       */
      override fun networkDestinationIpV6(networkDestinationIpV6: List<Any>) {
        cdkBuilder.networkDestinationIpV6(networkDestinationIpV6.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkDestinationIpV6 The destination IPv6 address of network-related information
       * about a finding.
       */
      override fun networkDestinationIpV6(vararg networkDestinationIpV6: Any): Unit =
          networkDestinationIpV6(networkDestinationIpV6.toList())

      /**
       * @param networkDestinationPort The destination port of network-related information about a
       * finding.
       */
      override fun networkDestinationPort(networkDestinationPort: IResolvable) {
        cdkBuilder.networkDestinationPort(networkDestinationPort.let(IResolvable::unwrap))
      }

      /**
       * @param networkDestinationPort The destination port of network-related information about a
       * finding.
       */
      override fun networkDestinationPort(networkDestinationPort: List<Any>) {
        cdkBuilder.networkDestinationPort(networkDestinationPort.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkDestinationPort The destination port of network-related information about a
       * finding.
       */
      override fun networkDestinationPort(vararg networkDestinationPort: Any): Unit =
          networkDestinationPort(networkDestinationPort.toList())

      /**
       * @param networkDirection Indicates the direction of network traffic associated with a
       * finding.
       */
      override fun networkDirection(networkDirection: IResolvable) {
        cdkBuilder.networkDirection(networkDirection.let(IResolvable::unwrap))
      }

      /**
       * @param networkDirection Indicates the direction of network traffic associated with a
       * finding.
       */
      override fun networkDirection(networkDirection: List<Any>) {
        cdkBuilder.networkDirection(networkDirection.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkDirection Indicates the direction of network traffic associated with a
       * finding.
       */
      override fun networkDirection(vararg networkDirection: Any): Unit =
          networkDirection(networkDirection.toList())

      /**
       * @param networkProtocol The protocol of network-related information about a finding.
       */
      override fun networkProtocol(networkProtocol: IResolvable) {
        cdkBuilder.networkProtocol(networkProtocol.let(IResolvable::unwrap))
      }

      /**
       * @param networkProtocol The protocol of network-related information about a finding.
       */
      override fun networkProtocol(networkProtocol: List<Any>) {
        cdkBuilder.networkProtocol(networkProtocol.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkProtocol The protocol of network-related information about a finding.
       */
      override fun networkProtocol(vararg networkProtocol: Any): Unit =
          networkProtocol(networkProtocol.toList())

      /**
       * @param networkSourceDomain The source domain of network-related information about a
       * finding.
       */
      override fun networkSourceDomain(networkSourceDomain: IResolvable) {
        cdkBuilder.networkSourceDomain(networkSourceDomain.let(IResolvable::unwrap))
      }

      /**
       * @param networkSourceDomain The source domain of network-related information about a
       * finding.
       */
      override fun networkSourceDomain(networkSourceDomain: List<Any>) {
        cdkBuilder.networkSourceDomain(networkSourceDomain.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkSourceDomain The source domain of network-related information about a
       * finding.
       */
      override fun networkSourceDomain(vararg networkSourceDomain: Any): Unit =
          networkSourceDomain(networkSourceDomain.toList())

      /**
       * @param networkSourceIpV4 The source IPv4 address of network-related information about a
       * finding.
       */
      override fun networkSourceIpV4(networkSourceIpV4: IResolvable) {
        cdkBuilder.networkSourceIpV4(networkSourceIpV4.let(IResolvable::unwrap))
      }

      /**
       * @param networkSourceIpV4 The source IPv4 address of network-related information about a
       * finding.
       */
      override fun networkSourceIpV4(networkSourceIpV4: List<Any>) {
        cdkBuilder.networkSourceIpV4(networkSourceIpV4.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkSourceIpV4 The source IPv4 address of network-related information about a
       * finding.
       */
      override fun networkSourceIpV4(vararg networkSourceIpV4: Any): Unit =
          networkSourceIpV4(networkSourceIpV4.toList())

      /**
       * @param networkSourceIpV6 The source IPv6 address of network-related information about a
       * finding.
       */
      override fun networkSourceIpV6(networkSourceIpV6: IResolvable) {
        cdkBuilder.networkSourceIpV6(networkSourceIpV6.let(IResolvable::unwrap))
      }

      /**
       * @param networkSourceIpV6 The source IPv6 address of network-related information about a
       * finding.
       */
      override fun networkSourceIpV6(networkSourceIpV6: List<Any>) {
        cdkBuilder.networkSourceIpV6(networkSourceIpV6.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkSourceIpV6 The source IPv6 address of network-related information about a
       * finding.
       */
      override fun networkSourceIpV6(vararg networkSourceIpV6: Any): Unit =
          networkSourceIpV6(networkSourceIpV6.toList())

      /**
       * @param networkSourceMac The source media access control (MAC) address of network-related
       * information about a finding.
       */
      override fun networkSourceMac(networkSourceMac: IResolvable) {
        cdkBuilder.networkSourceMac(networkSourceMac.let(IResolvable::unwrap))
      }

      /**
       * @param networkSourceMac The source media access control (MAC) address of network-related
       * information about a finding.
       */
      override fun networkSourceMac(networkSourceMac: List<Any>) {
        cdkBuilder.networkSourceMac(networkSourceMac.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkSourceMac The source media access control (MAC) address of network-related
       * information about a finding.
       */
      override fun networkSourceMac(vararg networkSourceMac: Any): Unit =
          networkSourceMac(networkSourceMac.toList())

      /**
       * @param networkSourcePort The source port of network-related information about a finding.
       */
      override fun networkSourcePort(networkSourcePort: IResolvable) {
        cdkBuilder.networkSourcePort(networkSourcePort.let(IResolvable::unwrap))
      }

      /**
       * @param networkSourcePort The source port of network-related information about a finding.
       */
      override fun networkSourcePort(networkSourcePort: List<Any>) {
        cdkBuilder.networkSourcePort(networkSourcePort.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkSourcePort The source port of network-related information about a finding.
       */
      override fun networkSourcePort(vararg networkSourcePort: Any): Unit =
          networkSourcePort(networkSourcePort.toList())

      /**
       * @param noteText The text of a note.
       */
      override fun noteText(noteText: IResolvable) {
        cdkBuilder.noteText(noteText.let(IResolvable::unwrap))
      }

      /**
       * @param noteText The text of a note.
       */
      override fun noteText(noteText: List<Any>) {
        cdkBuilder.noteText(noteText.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param noteText The text of a note.
       */
      override fun noteText(vararg noteText: Any): Unit = noteText(noteText.toList())

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       */
      override fun noteUpdatedAt(noteUpdatedAt: IResolvable) {
        cdkBuilder.noteUpdatedAt(noteUpdatedAt.let(IResolvable::unwrap))
      }

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       */
      override fun noteUpdatedAt(noteUpdatedAt: List<Any>) {
        cdkBuilder.noteUpdatedAt(noteUpdatedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param noteUpdatedAt The timestamp of when the note was updated.
       */
      override fun noteUpdatedAt(vararg noteUpdatedAt: Any): Unit =
          noteUpdatedAt(noteUpdatedAt.toList())

      /**
       * @param noteUpdatedBy The principal that created a note.
       */
      override fun noteUpdatedBy(noteUpdatedBy: IResolvable) {
        cdkBuilder.noteUpdatedBy(noteUpdatedBy.let(IResolvable::unwrap))
      }

      /**
       * @param noteUpdatedBy The principal that created a note.
       */
      override fun noteUpdatedBy(noteUpdatedBy: List<Any>) {
        cdkBuilder.noteUpdatedBy(noteUpdatedBy.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param noteUpdatedBy The principal that created a note.
       */
      override fun noteUpdatedBy(vararg noteUpdatedBy: Any): Unit =
          noteUpdatedBy(noteUpdatedBy.toList())

      /**
       * @param processLaunchedAt A timestamp that identifies when the process was launched.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun processLaunchedAt(processLaunchedAt: IResolvable) {
        cdkBuilder.processLaunchedAt(processLaunchedAt.let(IResolvable::unwrap))
      }

      /**
       * @param processLaunchedAt A timestamp that identifies when the process was launched.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun processLaunchedAt(processLaunchedAt: List<Any>) {
        cdkBuilder.processLaunchedAt(processLaunchedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param processLaunchedAt A timestamp that identifies when the process was launched.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun processLaunchedAt(vararg processLaunchedAt: Any): Unit =
          processLaunchedAt(processLaunchedAt.toList())

      /**
       * @param processName The name of the process.
       */
      override fun processName(processName: IResolvable) {
        cdkBuilder.processName(processName.let(IResolvable::unwrap))
      }

      /**
       * @param processName The name of the process.
       */
      override fun processName(processName: List<Any>) {
        cdkBuilder.processName(processName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param processName The name of the process.
       */
      override fun processName(vararg processName: Any): Unit = processName(processName.toList())

      /**
       * @param processParentPid The parent process ID.
       * This field accepts positive integers between `O` and `2147483647` .
       */
      override fun processParentPid(processParentPid: IResolvable) {
        cdkBuilder.processParentPid(processParentPid.let(IResolvable::unwrap))
      }

      /**
       * @param processParentPid The parent process ID.
       * This field accepts positive integers between `O` and `2147483647` .
       */
      override fun processParentPid(processParentPid: List<Any>) {
        cdkBuilder.processParentPid(processParentPid.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param processParentPid The parent process ID.
       * This field accepts positive integers between `O` and `2147483647` .
       */
      override fun processParentPid(vararg processParentPid: Any): Unit =
          processParentPid(processParentPid.toList())

      /**
       * @param processPath The path to the process executable.
       */
      override fun processPath(processPath: IResolvable) {
        cdkBuilder.processPath(processPath.let(IResolvable::unwrap))
      }

      /**
       * @param processPath The path to the process executable.
       */
      override fun processPath(processPath: List<Any>) {
        cdkBuilder.processPath(processPath.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param processPath The path to the process executable.
       */
      override fun processPath(vararg processPath: Any): Unit = processPath(processPath.toList())

      /**
       * @param processPid The process ID.
       */
      override fun processPid(processPid: IResolvable) {
        cdkBuilder.processPid(processPid.let(IResolvable::unwrap))
      }

      /**
       * @param processPid The process ID.
       */
      override fun processPid(processPid: List<Any>) {
        cdkBuilder.processPid(processPid.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param processPid The process ID.
       */
      override fun processPid(vararg processPid: Any): Unit = processPid(processPid.toList())

      /**
       * @param processTerminatedAt A timestamp that identifies when the process was terminated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun processTerminatedAt(processTerminatedAt: IResolvable) {
        cdkBuilder.processTerminatedAt(processTerminatedAt.let(IResolvable::unwrap))
      }

      /**
       * @param processTerminatedAt A timestamp that identifies when the process was terminated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun processTerminatedAt(processTerminatedAt: List<Any>) {
        cdkBuilder.processTerminatedAt(processTerminatedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param processTerminatedAt A timestamp that identifies when the process was terminated.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun processTerminatedAt(vararg processTerminatedAt: Any): Unit =
          processTerminatedAt(processTerminatedAt.toList())

      /**
       * @param productArn The ARN generated by Security Hub that uniquely identifies a third-party
       * company (security findings provider) after this provider's product (solution that generates
       * findings) is registered with Security Hub.
       */
      override fun productArn(productArn: IResolvable) {
        cdkBuilder.productArn(productArn.let(IResolvable::unwrap))
      }

      /**
       * @param productArn The ARN generated by Security Hub that uniquely identifies a third-party
       * company (security findings provider) after this provider's product (solution that generates
       * findings) is registered with Security Hub.
       */
      override fun productArn(productArn: List<Any>) {
        cdkBuilder.productArn(productArn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param productArn The ARN generated by Security Hub that uniquely identifies a third-party
       * company (security findings provider) after this provider's product (solution that generates
       * findings) is registered with Security Hub.
       */
      override fun productArn(vararg productArn: Any): Unit = productArn(productArn.toList())

      /**
       * @param productFields A data type where security findings providers can include additional
       * solution-specific details that aren't part of the defined `AwsSecurityFinding` format.
       */
      override fun productFields(productFields: IResolvable) {
        cdkBuilder.productFields(productFields.let(IResolvable::unwrap))
      }

      /**
       * @param productFields A data type where security findings providers can include additional
       * solution-specific details that aren't part of the defined `AwsSecurityFinding` format.
       */
      override fun productFields(productFields: List<Any>) {
        cdkBuilder.productFields(productFields.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param productFields A data type where security findings providers can include additional
       * solution-specific details that aren't part of the defined `AwsSecurityFinding` format.
       */
      override fun productFields(vararg productFields: Any): Unit =
          productFields(productFields.toList())

      /**
       * @param productName The name of the solution (product) that generates findings.
       */
      override fun productName(productName: IResolvable) {
        cdkBuilder.productName(productName.let(IResolvable::unwrap))
      }

      /**
       * @param productName The name of the solution (product) that generates findings.
       */
      override fun productName(productName: List<Any>) {
        cdkBuilder.productName(productName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param productName The name of the solution (product) that generates findings.
       */
      override fun productName(vararg productName: Any): Unit = productName(productName.toList())

      /**
       * @param recommendationText The recommendation of what to do about the issue described in a
       * finding.
       */
      override fun recommendationText(recommendationText: IResolvable) {
        cdkBuilder.recommendationText(recommendationText.let(IResolvable::unwrap))
      }

      /**
       * @param recommendationText The recommendation of what to do about the issue described in a
       * finding.
       */
      override fun recommendationText(recommendationText: List<Any>) {
        cdkBuilder.recommendationText(recommendationText.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param recommendationText The recommendation of what to do about the issue described in a
       * finding.
       */
      override fun recommendationText(vararg recommendationText: Any): Unit =
          recommendationText(recommendationText.toList())

      /**
       * @param recordState The updated record state for the finding.
       */
      override fun recordState(recordState: IResolvable) {
        cdkBuilder.recordState(recordState.let(IResolvable::unwrap))
      }

      /**
       * @param recordState The updated record state for the finding.
       */
      override fun recordState(recordState: List<Any>) {
        cdkBuilder.recordState(recordState.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param recordState The updated record state for the finding.
       */
      override fun recordState(vararg recordState: Any): Unit = recordState(recordState.toList())

      /**
       * @param region The Region from which the finding was generated.
       */
      override fun region(region: IResolvable) {
        cdkBuilder.region(region.let(IResolvable::unwrap))
      }

      /**
       * @param region The Region from which the finding was generated.
       */
      override fun region(region: List<Any>) {
        cdkBuilder.region(region.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param region The Region from which the finding was generated.
       */
      override fun region(vararg region: Any): Unit = region(region.toList())

      /**
       * @param relatedFindingsId The solution-generated identifier for a related finding.
       */
      override fun relatedFindingsId(relatedFindingsId: IResolvable) {
        cdkBuilder.relatedFindingsId(relatedFindingsId.let(IResolvable::unwrap))
      }

      /**
       * @param relatedFindingsId The solution-generated identifier for a related finding.
       */
      override fun relatedFindingsId(relatedFindingsId: List<Any>) {
        cdkBuilder.relatedFindingsId(relatedFindingsId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param relatedFindingsId The solution-generated identifier for a related finding.
       */
      override fun relatedFindingsId(vararg relatedFindingsId: Any): Unit =
          relatedFindingsId(relatedFindingsId.toList())

      /**
       * @param relatedFindingsProductArn The ARN of the solution that generated a related finding.
       */
      override fun relatedFindingsProductArn(relatedFindingsProductArn: IResolvable) {
        cdkBuilder.relatedFindingsProductArn(relatedFindingsProductArn.let(IResolvable::unwrap))
      }

      /**
       * @param relatedFindingsProductArn The ARN of the solution that generated a related finding.
       */
      override fun relatedFindingsProductArn(relatedFindingsProductArn: List<Any>) {
        cdkBuilder.relatedFindingsProductArn(relatedFindingsProductArn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param relatedFindingsProductArn The ARN of the solution that generated a related finding.
       */
      override fun relatedFindingsProductArn(vararg relatedFindingsProductArn: Any): Unit =
          relatedFindingsProductArn(relatedFindingsProductArn.toList())

      /**
       * @param resourceApplicationArn The ARN of the application that is related to a finding.
       */
      override fun resourceApplicationArn(resourceApplicationArn: IResolvable) {
        cdkBuilder.resourceApplicationArn(resourceApplicationArn.let(IResolvable::unwrap))
      }

      /**
       * @param resourceApplicationArn The ARN of the application that is related to a finding.
       */
      override fun resourceApplicationArn(resourceApplicationArn: List<Any>) {
        cdkBuilder.resourceApplicationArn(resourceApplicationArn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceApplicationArn The ARN of the application that is related to a finding.
       */
      override fun resourceApplicationArn(vararg resourceApplicationArn: Any): Unit =
          resourceApplicationArn(resourceApplicationArn.toList())

      /**
       * @param resourceApplicationName The name of the application that is related to a finding.
       */
      override fun resourceApplicationName(resourceApplicationName: IResolvable) {
        cdkBuilder.resourceApplicationName(resourceApplicationName.let(IResolvable::unwrap))
      }

      /**
       * @param resourceApplicationName The name of the application that is related to a finding.
       */
      override fun resourceApplicationName(resourceApplicationName: List<Any>) {
        cdkBuilder.resourceApplicationName(resourceApplicationName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceApplicationName The name of the application that is related to a finding.
       */
      override fun resourceApplicationName(vararg resourceApplicationName: Any): Unit =
          resourceApplicationName(resourceApplicationName.toList())

      /**
       * @param resourceAwsEc2InstanceIamInstanceProfileArn The IAM profile ARN of the instance.
       */
      override
          fun resourceAwsEc2InstanceIamInstanceProfileArn(resourceAwsEc2InstanceIamInstanceProfileArn: IResolvable) {
        cdkBuilder.resourceAwsEc2InstanceIamInstanceProfileArn(resourceAwsEc2InstanceIamInstanceProfileArn.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsEc2InstanceIamInstanceProfileArn The IAM profile ARN of the instance.
       */
      override
          fun resourceAwsEc2InstanceIamInstanceProfileArn(resourceAwsEc2InstanceIamInstanceProfileArn: List<Any>) {
        cdkBuilder.resourceAwsEc2InstanceIamInstanceProfileArn(resourceAwsEc2InstanceIamInstanceProfileArn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsEc2InstanceIamInstanceProfileArn The IAM profile ARN of the instance.
       */
      override fun resourceAwsEc2InstanceIamInstanceProfileArn(vararg
          resourceAwsEc2InstanceIamInstanceProfileArn: Any): Unit =
          resourceAwsEc2InstanceIamInstanceProfileArn(resourceAwsEc2InstanceIamInstanceProfileArn.toList())

      /**
       * @param resourceAwsEc2InstanceImageId The Amazon Machine Image (AMI) ID of the instance.
       */
      override fun resourceAwsEc2InstanceImageId(resourceAwsEc2InstanceImageId: IResolvable) {
        cdkBuilder.resourceAwsEc2InstanceImageId(resourceAwsEc2InstanceImageId.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsEc2InstanceImageId The Amazon Machine Image (AMI) ID of the instance.
       */
      override fun resourceAwsEc2InstanceImageId(resourceAwsEc2InstanceImageId: List<Any>) {
        cdkBuilder.resourceAwsEc2InstanceImageId(resourceAwsEc2InstanceImageId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsEc2InstanceImageId The Amazon Machine Image (AMI) ID of the instance.
       */
      override fun resourceAwsEc2InstanceImageId(vararg resourceAwsEc2InstanceImageId: Any): Unit =
          resourceAwsEc2InstanceImageId(resourceAwsEc2InstanceImageId.toList())

      /**
       * @param resourceAwsEc2InstanceIpV4Addresses The IPv4 addresses associated with the instance.
       */
      override
          fun resourceAwsEc2InstanceIpV4Addresses(resourceAwsEc2InstanceIpV4Addresses: IResolvable) {
        cdkBuilder.resourceAwsEc2InstanceIpV4Addresses(resourceAwsEc2InstanceIpV4Addresses.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsEc2InstanceIpV4Addresses The IPv4 addresses associated with the instance.
       */
      override
          fun resourceAwsEc2InstanceIpV4Addresses(resourceAwsEc2InstanceIpV4Addresses: List<Any>) {
        cdkBuilder.resourceAwsEc2InstanceIpV4Addresses(resourceAwsEc2InstanceIpV4Addresses.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsEc2InstanceIpV4Addresses The IPv4 addresses associated with the instance.
       */
      override fun resourceAwsEc2InstanceIpV4Addresses(vararg
          resourceAwsEc2InstanceIpV4Addresses: Any): Unit =
          resourceAwsEc2InstanceIpV4Addresses(resourceAwsEc2InstanceIpV4Addresses.toList())

      /**
       * @param resourceAwsEc2InstanceIpV6Addresses The IPv6 addresses associated with the instance.
       */
      override
          fun resourceAwsEc2InstanceIpV6Addresses(resourceAwsEc2InstanceIpV6Addresses: IResolvable) {
        cdkBuilder.resourceAwsEc2InstanceIpV6Addresses(resourceAwsEc2InstanceIpV6Addresses.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsEc2InstanceIpV6Addresses The IPv6 addresses associated with the instance.
       */
      override
          fun resourceAwsEc2InstanceIpV6Addresses(resourceAwsEc2InstanceIpV6Addresses: List<Any>) {
        cdkBuilder.resourceAwsEc2InstanceIpV6Addresses(resourceAwsEc2InstanceIpV6Addresses.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsEc2InstanceIpV6Addresses The IPv6 addresses associated with the instance.
       */
      override fun resourceAwsEc2InstanceIpV6Addresses(vararg
          resourceAwsEc2InstanceIpV6Addresses: Any): Unit =
          resourceAwsEc2InstanceIpV6Addresses(resourceAwsEc2InstanceIpV6Addresses.toList())

      /**
       * @param resourceAwsEc2InstanceKeyName The key name associated with the instance.
       */
      override fun resourceAwsEc2InstanceKeyName(resourceAwsEc2InstanceKeyName: IResolvable) {
        cdkBuilder.resourceAwsEc2InstanceKeyName(resourceAwsEc2InstanceKeyName.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsEc2InstanceKeyName The key name associated with the instance.
       */
      override fun resourceAwsEc2InstanceKeyName(resourceAwsEc2InstanceKeyName: List<Any>) {
        cdkBuilder.resourceAwsEc2InstanceKeyName(resourceAwsEc2InstanceKeyName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsEc2InstanceKeyName The key name associated with the instance.
       */
      override fun resourceAwsEc2InstanceKeyName(vararg resourceAwsEc2InstanceKeyName: Any): Unit =
          resourceAwsEc2InstanceKeyName(resourceAwsEc2InstanceKeyName.toList())

      /**
       * @param resourceAwsEc2InstanceLaunchedAt The date and time the instance was launched.
       */
      override fun resourceAwsEc2InstanceLaunchedAt(resourceAwsEc2InstanceLaunchedAt: IResolvable) {
        cdkBuilder.resourceAwsEc2InstanceLaunchedAt(resourceAwsEc2InstanceLaunchedAt.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsEc2InstanceLaunchedAt The date and time the instance was launched.
       */
      override fun resourceAwsEc2InstanceLaunchedAt(resourceAwsEc2InstanceLaunchedAt: List<Any>) {
        cdkBuilder.resourceAwsEc2InstanceLaunchedAt(resourceAwsEc2InstanceLaunchedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsEc2InstanceLaunchedAt The date and time the instance was launched.
       */
      override fun resourceAwsEc2InstanceLaunchedAt(vararg resourceAwsEc2InstanceLaunchedAt: Any):
          Unit = resourceAwsEc2InstanceLaunchedAt(resourceAwsEc2InstanceLaunchedAt.toList())

      /**
       * @param resourceAwsEc2InstanceSubnetId The identifier of the subnet that the instance was
       * launched in.
       */
      override fun resourceAwsEc2InstanceSubnetId(resourceAwsEc2InstanceSubnetId: IResolvable) {
        cdkBuilder.resourceAwsEc2InstanceSubnetId(resourceAwsEc2InstanceSubnetId.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsEc2InstanceSubnetId The identifier of the subnet that the instance was
       * launched in.
       */
      override fun resourceAwsEc2InstanceSubnetId(resourceAwsEc2InstanceSubnetId: List<Any>) {
        cdkBuilder.resourceAwsEc2InstanceSubnetId(resourceAwsEc2InstanceSubnetId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsEc2InstanceSubnetId The identifier of the subnet that the instance was
       * launched in.
       */
      override fun resourceAwsEc2InstanceSubnetId(vararg resourceAwsEc2InstanceSubnetId: Any): Unit
          = resourceAwsEc2InstanceSubnetId(resourceAwsEc2InstanceSubnetId.toList())

      /**
       * @param resourceAwsEc2InstanceType The instance type of the instance.
       */
      override fun resourceAwsEc2InstanceType(resourceAwsEc2InstanceType: IResolvable) {
        cdkBuilder.resourceAwsEc2InstanceType(resourceAwsEc2InstanceType.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsEc2InstanceType The instance type of the instance.
       */
      override fun resourceAwsEc2InstanceType(resourceAwsEc2InstanceType: List<Any>) {
        cdkBuilder.resourceAwsEc2InstanceType(resourceAwsEc2InstanceType.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsEc2InstanceType The instance type of the instance.
       */
      override fun resourceAwsEc2InstanceType(vararg resourceAwsEc2InstanceType: Any): Unit =
          resourceAwsEc2InstanceType(resourceAwsEc2InstanceType.toList())

      /**
       * @param resourceAwsEc2InstanceVpcId The identifier of the VPC that the instance was launched
       * in.
       */
      override fun resourceAwsEc2InstanceVpcId(resourceAwsEc2InstanceVpcId: IResolvable) {
        cdkBuilder.resourceAwsEc2InstanceVpcId(resourceAwsEc2InstanceVpcId.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsEc2InstanceVpcId The identifier of the VPC that the instance was launched
       * in.
       */
      override fun resourceAwsEc2InstanceVpcId(resourceAwsEc2InstanceVpcId: List<Any>) {
        cdkBuilder.resourceAwsEc2InstanceVpcId(resourceAwsEc2InstanceVpcId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsEc2InstanceVpcId The identifier of the VPC that the instance was launched
       * in.
       */
      override fun resourceAwsEc2InstanceVpcId(vararg resourceAwsEc2InstanceVpcId: Any): Unit =
          resourceAwsEc2InstanceVpcId(resourceAwsEc2InstanceVpcId.toList())

      /**
       * @param resourceAwsIamAccessKeyCreatedAt The creation date/time of the IAM access key
       * related to a finding.
       */
      override fun resourceAwsIamAccessKeyCreatedAt(resourceAwsIamAccessKeyCreatedAt: IResolvable) {
        cdkBuilder.resourceAwsIamAccessKeyCreatedAt(resourceAwsIamAccessKeyCreatedAt.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsIamAccessKeyCreatedAt The creation date/time of the IAM access key
       * related to a finding.
       */
      override fun resourceAwsIamAccessKeyCreatedAt(resourceAwsIamAccessKeyCreatedAt: List<Any>) {
        cdkBuilder.resourceAwsIamAccessKeyCreatedAt(resourceAwsIamAccessKeyCreatedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsIamAccessKeyCreatedAt The creation date/time of the IAM access key
       * related to a finding.
       */
      override fun resourceAwsIamAccessKeyCreatedAt(vararg resourceAwsIamAccessKeyCreatedAt: Any):
          Unit = resourceAwsIamAccessKeyCreatedAt(resourceAwsIamAccessKeyCreatedAt.toList())

      /**
       * @param resourceAwsIamAccessKeyPrincipalName The name of the principal that is associated
       * with an IAM access key.
       */
      override
          fun resourceAwsIamAccessKeyPrincipalName(resourceAwsIamAccessKeyPrincipalName: IResolvable) {
        cdkBuilder.resourceAwsIamAccessKeyPrincipalName(resourceAwsIamAccessKeyPrincipalName.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsIamAccessKeyPrincipalName The name of the principal that is associated
       * with an IAM access key.
       */
      override
          fun resourceAwsIamAccessKeyPrincipalName(resourceAwsIamAccessKeyPrincipalName: List<Any>) {
        cdkBuilder.resourceAwsIamAccessKeyPrincipalName(resourceAwsIamAccessKeyPrincipalName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsIamAccessKeyPrincipalName The name of the principal that is associated
       * with an IAM access key.
       */
      override fun resourceAwsIamAccessKeyPrincipalName(vararg
          resourceAwsIamAccessKeyPrincipalName: Any): Unit =
          resourceAwsIamAccessKeyPrincipalName(resourceAwsIamAccessKeyPrincipalName.toList())

      /**
       * @param resourceAwsIamAccessKeyStatus The status of the IAM access key related to a finding.
       */
      override fun resourceAwsIamAccessKeyStatus(resourceAwsIamAccessKeyStatus: IResolvable) {
        cdkBuilder.resourceAwsIamAccessKeyStatus(resourceAwsIamAccessKeyStatus.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsIamAccessKeyStatus The status of the IAM access key related to a finding.
       */
      override fun resourceAwsIamAccessKeyStatus(resourceAwsIamAccessKeyStatus: List<Any>) {
        cdkBuilder.resourceAwsIamAccessKeyStatus(resourceAwsIamAccessKeyStatus.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsIamAccessKeyStatus The status of the IAM access key related to a finding.
       */
      override fun resourceAwsIamAccessKeyStatus(vararg resourceAwsIamAccessKeyStatus: Any): Unit =
          resourceAwsIamAccessKeyStatus(resourceAwsIamAccessKeyStatus.toList())

      /**
       * @param resourceAwsIamAccessKeyUserName This field is deprecated.
       * The username associated with the IAM access key related to a finding.
       */
      override fun resourceAwsIamAccessKeyUserName(resourceAwsIamAccessKeyUserName: IResolvable) {
        cdkBuilder.resourceAwsIamAccessKeyUserName(resourceAwsIamAccessKeyUserName.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsIamAccessKeyUserName This field is deprecated.
       * The username associated with the IAM access key related to a finding.
       */
      override fun resourceAwsIamAccessKeyUserName(resourceAwsIamAccessKeyUserName: List<Any>) {
        cdkBuilder.resourceAwsIamAccessKeyUserName(resourceAwsIamAccessKeyUserName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsIamAccessKeyUserName This field is deprecated.
       * The username associated with the IAM access key related to a finding.
       */
      override fun resourceAwsIamAccessKeyUserName(vararg resourceAwsIamAccessKeyUserName: Any):
          Unit = resourceAwsIamAccessKeyUserName(resourceAwsIamAccessKeyUserName.toList())

      /**
       * @param resourceAwsIamUserUserName The name of an IAM user.
       */
      override fun resourceAwsIamUserUserName(resourceAwsIamUserUserName: IResolvable) {
        cdkBuilder.resourceAwsIamUserUserName(resourceAwsIamUserUserName.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsIamUserUserName The name of an IAM user.
       */
      override fun resourceAwsIamUserUserName(resourceAwsIamUserUserName: List<Any>) {
        cdkBuilder.resourceAwsIamUserUserName(resourceAwsIamUserUserName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsIamUserUserName The name of an IAM user.
       */
      override fun resourceAwsIamUserUserName(vararg resourceAwsIamUserUserName: Any): Unit =
          resourceAwsIamUserUserName(resourceAwsIamUserUserName.toList())

      /**
       * @param resourceAwsS3BucketOwnerId The canonical user ID of the owner of the S3 bucket.
       */
      override fun resourceAwsS3BucketOwnerId(resourceAwsS3BucketOwnerId: IResolvable) {
        cdkBuilder.resourceAwsS3BucketOwnerId(resourceAwsS3BucketOwnerId.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsS3BucketOwnerId The canonical user ID of the owner of the S3 bucket.
       */
      override fun resourceAwsS3BucketOwnerId(resourceAwsS3BucketOwnerId: List<Any>) {
        cdkBuilder.resourceAwsS3BucketOwnerId(resourceAwsS3BucketOwnerId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsS3BucketOwnerId The canonical user ID of the owner of the S3 bucket.
       */
      override fun resourceAwsS3BucketOwnerId(vararg resourceAwsS3BucketOwnerId: Any): Unit =
          resourceAwsS3BucketOwnerId(resourceAwsS3BucketOwnerId.toList())

      /**
       * @param resourceAwsS3BucketOwnerName The display name of the owner of the S3 bucket.
       */
      override fun resourceAwsS3BucketOwnerName(resourceAwsS3BucketOwnerName: IResolvable) {
        cdkBuilder.resourceAwsS3BucketOwnerName(resourceAwsS3BucketOwnerName.let(IResolvable::unwrap))
      }

      /**
       * @param resourceAwsS3BucketOwnerName The display name of the owner of the S3 bucket.
       */
      override fun resourceAwsS3BucketOwnerName(resourceAwsS3BucketOwnerName: List<Any>) {
        cdkBuilder.resourceAwsS3BucketOwnerName(resourceAwsS3BucketOwnerName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceAwsS3BucketOwnerName The display name of the owner of the S3 bucket.
       */
      override fun resourceAwsS3BucketOwnerName(vararg resourceAwsS3BucketOwnerName: Any): Unit =
          resourceAwsS3BucketOwnerName(resourceAwsS3BucketOwnerName.toList())

      /**
       * @param resourceContainerImageId The identifier of the image related to a finding.
       */
      override fun resourceContainerImageId(resourceContainerImageId: IResolvable) {
        cdkBuilder.resourceContainerImageId(resourceContainerImageId.let(IResolvable::unwrap))
      }

      /**
       * @param resourceContainerImageId The identifier of the image related to a finding.
       */
      override fun resourceContainerImageId(resourceContainerImageId: List<Any>) {
        cdkBuilder.resourceContainerImageId(resourceContainerImageId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceContainerImageId The identifier of the image related to a finding.
       */
      override fun resourceContainerImageId(vararg resourceContainerImageId: Any): Unit =
          resourceContainerImageId(resourceContainerImageId.toList())

      /**
       * @param resourceContainerImageName The name of the image related to a finding.
       */
      override fun resourceContainerImageName(resourceContainerImageName: IResolvable) {
        cdkBuilder.resourceContainerImageName(resourceContainerImageName.let(IResolvable::unwrap))
      }

      /**
       * @param resourceContainerImageName The name of the image related to a finding.
       */
      override fun resourceContainerImageName(resourceContainerImageName: List<Any>) {
        cdkBuilder.resourceContainerImageName(resourceContainerImageName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceContainerImageName The name of the image related to a finding.
       */
      override fun resourceContainerImageName(vararg resourceContainerImageName: Any): Unit =
          resourceContainerImageName(resourceContainerImageName.toList())

      /**
       * @param resourceContainerLaunchedAt A timestamp that identifies when the container was
       * started.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun resourceContainerLaunchedAt(resourceContainerLaunchedAt: IResolvable) {
        cdkBuilder.resourceContainerLaunchedAt(resourceContainerLaunchedAt.let(IResolvable::unwrap))
      }

      /**
       * @param resourceContainerLaunchedAt A timestamp that identifies when the container was
       * started.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun resourceContainerLaunchedAt(resourceContainerLaunchedAt: List<Any>) {
        cdkBuilder.resourceContainerLaunchedAt(resourceContainerLaunchedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceContainerLaunchedAt A timestamp that identifies when the container was
       * started.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun resourceContainerLaunchedAt(vararg resourceContainerLaunchedAt: Any): Unit =
          resourceContainerLaunchedAt(resourceContainerLaunchedAt.toList())

      /**
       * @param resourceContainerName The name of the container related to a finding.
       */
      override fun resourceContainerName(resourceContainerName: IResolvable) {
        cdkBuilder.resourceContainerName(resourceContainerName.let(IResolvable::unwrap))
      }

      /**
       * @param resourceContainerName The name of the container related to a finding.
       */
      override fun resourceContainerName(resourceContainerName: List<Any>) {
        cdkBuilder.resourceContainerName(resourceContainerName.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceContainerName The name of the container related to a finding.
       */
      override fun resourceContainerName(vararg resourceContainerName: Any): Unit =
          resourceContainerName(resourceContainerName.toList())

      /**
       * @param resourceDetailsOther The details of a resource that doesn't have a specific subfield
       * for the resource type defined.
       */
      override fun resourceDetailsOther(resourceDetailsOther: IResolvable) {
        cdkBuilder.resourceDetailsOther(resourceDetailsOther.let(IResolvable::unwrap))
      }

      /**
       * @param resourceDetailsOther The details of a resource that doesn't have a specific subfield
       * for the resource type defined.
       */
      override fun resourceDetailsOther(resourceDetailsOther: List<Any>) {
        cdkBuilder.resourceDetailsOther(resourceDetailsOther.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceDetailsOther The details of a resource that doesn't have a specific subfield
       * for the resource type defined.
       */
      override fun resourceDetailsOther(vararg resourceDetailsOther: Any): Unit =
          resourceDetailsOther(resourceDetailsOther.toList())

      /**
       * @param resourceId The canonical identifier for the given resource type.
       */
      override fun resourceId(resourceId: IResolvable) {
        cdkBuilder.resourceId(resourceId.let(IResolvable::unwrap))
      }

      /**
       * @param resourceId The canonical identifier for the given resource type.
       */
      override fun resourceId(resourceId: List<Any>) {
        cdkBuilder.resourceId(resourceId.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceId The canonical identifier for the given resource type.
       */
      override fun resourceId(vararg resourceId: Any): Unit = resourceId(resourceId.toList())

      /**
       * @param resourcePartition The canonical AWS partition name that the Region is assigned to.
       */
      override fun resourcePartition(resourcePartition: IResolvable) {
        cdkBuilder.resourcePartition(resourcePartition.let(IResolvable::unwrap))
      }

      /**
       * @param resourcePartition The canonical AWS partition name that the Region is assigned to.
       */
      override fun resourcePartition(resourcePartition: List<Any>) {
        cdkBuilder.resourcePartition(resourcePartition.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourcePartition The canonical AWS partition name that the Region is assigned to.
       */
      override fun resourcePartition(vararg resourcePartition: Any): Unit =
          resourcePartition(resourcePartition.toList())

      /**
       * @param resourceRegion The canonical AWS external Region name where this resource is
       * located.
       */
      override fun resourceRegion(resourceRegion: IResolvable) {
        cdkBuilder.resourceRegion(resourceRegion.let(IResolvable::unwrap))
      }

      /**
       * @param resourceRegion The canonical AWS external Region name where this resource is
       * located.
       */
      override fun resourceRegion(resourceRegion: List<Any>) {
        cdkBuilder.resourceRegion(resourceRegion.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceRegion The canonical AWS external Region name where this resource is
       * located.
       */
      override fun resourceRegion(vararg resourceRegion: Any): Unit =
          resourceRegion(resourceRegion.toList())

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       */
      override fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
      }

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       */
      override fun resourceTags(resourceTags: List<Any>) {
        cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceTags A list of AWS tags associated with a resource at the time the finding
       * was processed.
       */
      override fun resourceTags(vararg resourceTags: Any): Unit =
          resourceTags(resourceTags.toList())

      /**
       * @param resourceType Specifies the type of the resource that details are provided for.
       */
      override fun resourceType(resourceType: IResolvable) {
        cdkBuilder.resourceType(resourceType.let(IResolvable::unwrap))
      }

      /**
       * @param resourceType Specifies the type of the resource that details are provided for.
       */
      override fun resourceType(resourceType: List<Any>) {
        cdkBuilder.resourceType(resourceType.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceType Specifies the type of the resource that details are provided for.
       */
      override fun resourceType(vararg resourceType: Any): Unit =
          resourceType(resourceType.toList())

      /**
       * @param sample Indicates whether or not sample findings are included in the filter results.
       */
      override fun sample(sample: IResolvable) {
        cdkBuilder.sample(sample.let(IResolvable::unwrap))
      }

      /**
       * @param sample Indicates whether or not sample findings are included in the filter results.
       */
      override fun sample(sample: List<Any>) {
        cdkBuilder.sample(sample.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sample Indicates whether or not sample findings are included in the filter results.
       */
      override fun sample(vararg sample: Any): Unit = sample(sample.toList())

      /**
       * @param severityLabel The label of a finding's severity.
       */
      override fun severityLabel(severityLabel: IResolvable) {
        cdkBuilder.severityLabel(severityLabel.let(IResolvable::unwrap))
      }

      /**
       * @param severityLabel The label of a finding's severity.
       */
      override fun severityLabel(severityLabel: List<Any>) {
        cdkBuilder.severityLabel(severityLabel.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param severityLabel The label of a finding's severity.
       */
      override fun severityLabel(vararg severityLabel: Any): Unit =
          severityLabel(severityLabel.toList())

      /**
       * @param severityNormalized Deprecated. The normalized severity of a finding. Instead of
       * providing `Normalized` , provide `Label` .
       * If you provide `Label` and do not provide `Normalized` , then `Normalized` is set
       * automatically as follows.
       *
       * * `INFORMATIONAL` - 0
       * * `LOW` - 1
       * * `MEDIUM` - 40
       * * `HIGH` - 70
       * * `CRITICAL` - 90
       */
      override fun severityNormalized(severityNormalized: IResolvable) {
        cdkBuilder.severityNormalized(severityNormalized.let(IResolvable::unwrap))
      }

      /**
       * @param severityNormalized Deprecated. The normalized severity of a finding. Instead of
       * providing `Normalized` , provide `Label` .
       * If you provide `Label` and do not provide `Normalized` , then `Normalized` is set
       * automatically as follows.
       *
       * * `INFORMATIONAL` - 0
       * * `LOW` - 1
       * * `MEDIUM` - 40
       * * `HIGH` - 70
       * * `CRITICAL` - 90
       */
      override fun severityNormalized(severityNormalized: List<Any>) {
        cdkBuilder.severityNormalized(severityNormalized.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param severityNormalized Deprecated. The normalized severity of a finding. Instead of
       * providing `Normalized` , provide `Label` .
       * If you provide `Label` and do not provide `Normalized` , then `Normalized` is set
       * automatically as follows.
       *
       * * `INFORMATIONAL` - 0
       * * `LOW` - 1
       * * `MEDIUM` - 40
       * * `HIGH` - 70
       * * `CRITICAL` - 90
       */
      override fun severityNormalized(vararg severityNormalized: Any): Unit =
          severityNormalized(severityNormalized.toList())

      /**
       * @param severityProduct Deprecated. This attribute isn't included in findings. Instead of
       * providing `Product` , provide `Original` .
       * The native severity as defined by the AWS service or integrated partner product that
       * generated the finding.
       */
      override fun severityProduct(severityProduct: IResolvable) {
        cdkBuilder.severityProduct(severityProduct.let(IResolvable::unwrap))
      }

      /**
       * @param severityProduct Deprecated. This attribute isn't included in findings. Instead of
       * providing `Product` , provide `Original` .
       * The native severity as defined by the AWS service or integrated partner product that
       * generated the finding.
       */
      override fun severityProduct(severityProduct: List<Any>) {
        cdkBuilder.severityProduct(severityProduct.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param severityProduct Deprecated. This attribute isn't included in findings. Instead of
       * providing `Product` , provide `Original` .
       * The native severity as defined by the AWS service or integrated partner product that
       * generated the finding.
       */
      override fun severityProduct(vararg severityProduct: Any): Unit =
          severityProduct(severityProduct.toList())

      /**
       * @param sourceUrl A URL that links to a page about the current finding in the security
       * findings provider's solution.
       */
      override fun sourceUrl(sourceUrl: IResolvable) {
        cdkBuilder.sourceUrl(sourceUrl.let(IResolvable::unwrap))
      }

      /**
       * @param sourceUrl A URL that links to a page about the current finding in the security
       * findings provider's solution.
       */
      override fun sourceUrl(sourceUrl: List<Any>) {
        cdkBuilder.sourceUrl(sourceUrl.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sourceUrl A URL that links to a page about the current finding in the security
       * findings provider's solution.
       */
      override fun sourceUrl(vararg sourceUrl: Any): Unit = sourceUrl(sourceUrl.toList())

      /**
       * @param threatIntelIndicatorCategory The category of a threat intelligence indicator.
       */
      override fun threatIntelIndicatorCategory(threatIntelIndicatorCategory: IResolvable) {
        cdkBuilder.threatIntelIndicatorCategory(threatIntelIndicatorCategory.let(IResolvable::unwrap))
      }

      /**
       * @param threatIntelIndicatorCategory The category of a threat intelligence indicator.
       */
      override fun threatIntelIndicatorCategory(threatIntelIndicatorCategory: List<Any>) {
        cdkBuilder.threatIntelIndicatorCategory(threatIntelIndicatorCategory.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param threatIntelIndicatorCategory The category of a threat intelligence indicator.
       */
      override fun threatIntelIndicatorCategory(vararg threatIntelIndicatorCategory: Any): Unit =
          threatIntelIndicatorCategory(threatIntelIndicatorCategory.toList())

      /**
       * @param threatIntelIndicatorLastObservedAt A timestamp that identifies the last observation
       * of a threat intelligence indicator.
       */
      override
          fun threatIntelIndicatorLastObservedAt(threatIntelIndicatorLastObservedAt: IResolvable) {
        cdkBuilder.threatIntelIndicatorLastObservedAt(threatIntelIndicatorLastObservedAt.let(IResolvable::unwrap))
      }

      /**
       * @param threatIntelIndicatorLastObservedAt A timestamp that identifies the last observation
       * of a threat intelligence indicator.
       */
      override
          fun threatIntelIndicatorLastObservedAt(threatIntelIndicatorLastObservedAt: List<Any>) {
        cdkBuilder.threatIntelIndicatorLastObservedAt(threatIntelIndicatorLastObservedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param threatIntelIndicatorLastObservedAt A timestamp that identifies the last observation
       * of a threat intelligence indicator.
       */
      override fun threatIntelIndicatorLastObservedAt(vararg
          threatIntelIndicatorLastObservedAt: Any): Unit =
          threatIntelIndicatorLastObservedAt(threatIntelIndicatorLastObservedAt.toList())

      /**
       * @param threatIntelIndicatorSource The source of the threat intelligence.
       */
      override fun threatIntelIndicatorSource(threatIntelIndicatorSource: IResolvable) {
        cdkBuilder.threatIntelIndicatorSource(threatIntelIndicatorSource.let(IResolvable::unwrap))
      }

      /**
       * @param threatIntelIndicatorSource The source of the threat intelligence.
       */
      override fun threatIntelIndicatorSource(threatIntelIndicatorSource: List<Any>) {
        cdkBuilder.threatIntelIndicatorSource(threatIntelIndicatorSource.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param threatIntelIndicatorSource The source of the threat intelligence.
       */
      override fun threatIntelIndicatorSource(vararg threatIntelIndicatorSource: Any): Unit =
          threatIntelIndicatorSource(threatIntelIndicatorSource.toList())

      /**
       * @param threatIntelIndicatorSourceUrl The URL for more details from the source of the threat
       * intelligence.
       */
      override fun threatIntelIndicatorSourceUrl(threatIntelIndicatorSourceUrl: IResolvable) {
        cdkBuilder.threatIntelIndicatorSourceUrl(threatIntelIndicatorSourceUrl.let(IResolvable::unwrap))
      }

      /**
       * @param threatIntelIndicatorSourceUrl The URL for more details from the source of the threat
       * intelligence.
       */
      override fun threatIntelIndicatorSourceUrl(threatIntelIndicatorSourceUrl: List<Any>) {
        cdkBuilder.threatIntelIndicatorSourceUrl(threatIntelIndicatorSourceUrl.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param threatIntelIndicatorSourceUrl The URL for more details from the source of the threat
       * intelligence.
       */
      override fun threatIntelIndicatorSourceUrl(vararg threatIntelIndicatorSourceUrl: Any): Unit =
          threatIntelIndicatorSourceUrl(threatIntelIndicatorSourceUrl.toList())

      /**
       * @param threatIntelIndicatorType The type of a threat intelligence indicator.
       */
      override fun threatIntelIndicatorType(threatIntelIndicatorType: IResolvable) {
        cdkBuilder.threatIntelIndicatorType(threatIntelIndicatorType.let(IResolvable::unwrap))
      }

      /**
       * @param threatIntelIndicatorType The type of a threat intelligence indicator.
       */
      override fun threatIntelIndicatorType(threatIntelIndicatorType: List<Any>) {
        cdkBuilder.threatIntelIndicatorType(threatIntelIndicatorType.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param threatIntelIndicatorType The type of a threat intelligence indicator.
       */
      override fun threatIntelIndicatorType(vararg threatIntelIndicatorType: Any): Unit =
          threatIntelIndicatorType(threatIntelIndicatorType.toList())

      /**
       * @param threatIntelIndicatorValue The value of a threat intelligence indicator.
       */
      override fun threatIntelIndicatorValue(threatIntelIndicatorValue: IResolvable) {
        cdkBuilder.threatIntelIndicatorValue(threatIntelIndicatorValue.let(IResolvable::unwrap))
      }

      /**
       * @param threatIntelIndicatorValue The value of a threat intelligence indicator.
       */
      override fun threatIntelIndicatorValue(threatIntelIndicatorValue: List<Any>) {
        cdkBuilder.threatIntelIndicatorValue(threatIntelIndicatorValue.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param threatIntelIndicatorValue The value of a threat intelligence indicator.
       */
      override fun threatIntelIndicatorValue(vararg threatIntelIndicatorValue: Any): Unit =
          threatIntelIndicatorValue(threatIntelIndicatorValue.toList())

      /**
       * @param title A finding's title.
       */
      override fun title(title: IResolvable) {
        cdkBuilder.title(title.let(IResolvable::unwrap))
      }

      /**
       * @param title A finding's title.
       */
      override fun title(title: List<Any>) {
        cdkBuilder.title(title.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param title A finding's title.
       */
      override fun title(vararg title: Any): Unit = title(title.toList())

      /**
       * @param type A finding type in the format of `namespace/category/classifier` that classifies
       * a finding.
       */
      override fun type(type: IResolvable) {
        cdkBuilder.type(type.let(IResolvable::unwrap))
      }

      /**
       * @param type A finding type in the format of `namespace/category/classifier` that classifies
       * a finding.
       */
      override fun type(type: List<Any>) {
        cdkBuilder.type(type.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param type A finding type in the format of `namespace/category/classifier` that classifies
       * a finding.
       */
      override fun type(vararg type: Any): Unit = type(type.toList())

      /**
       * @param updatedAt A timestamp that indicates when the security findings provider last
       * updated the finding record.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun updatedAt(updatedAt: IResolvable) {
        cdkBuilder.updatedAt(updatedAt.let(IResolvable::unwrap))
      }

      /**
       * @param updatedAt A timestamp that indicates when the security findings provider last
       * updated the finding record.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun updatedAt(updatedAt: List<Any>) {
        cdkBuilder.updatedAt(updatedAt.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param updatedAt A timestamp that indicates when the security findings provider last
       * updated the finding record.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun updatedAt(vararg updatedAt: Any): Unit = updatedAt(updatedAt.toList())

      /**
       * @param userDefinedFields A list of name/value string pairs associated with the finding.
       * These are custom, user-defined fields added to a finding.
       */
      override fun userDefinedFields(userDefinedFields: IResolvable) {
        cdkBuilder.userDefinedFields(userDefinedFields.let(IResolvable::unwrap))
      }

      /**
       * @param userDefinedFields A list of name/value string pairs associated with the finding.
       * These are custom, user-defined fields added to a finding.
       */
      override fun userDefinedFields(userDefinedFields: List<Any>) {
        cdkBuilder.userDefinedFields(userDefinedFields.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param userDefinedFields A list of name/value string pairs associated with the finding.
       * These are custom, user-defined fields added to a finding.
       */
      override fun userDefinedFields(vararg userDefinedFields: Any): Unit =
          userDefinedFields(userDefinedFields.toList())

      /**
       * @param verificationState The veracity of a finding.
       */
      override fun verificationState(verificationState: IResolvable) {
        cdkBuilder.verificationState(verificationState.let(IResolvable::unwrap))
      }

      /**
       * @param verificationState The veracity of a finding.
       */
      override fun verificationState(verificationState: List<Any>) {
        cdkBuilder.verificationState(verificationState.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param verificationState The veracity of a finding.
       */
      override fun verificationState(vararg verificationState: Any): Unit =
          verificationState(verificationState.toList())

      /**
       * @param vulnerabilitiesExploitAvailable Indicates whether a software vulnerability in your
       * environment has a known exploit.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      override fun vulnerabilitiesExploitAvailable(vulnerabilitiesExploitAvailable: IResolvable) {
        cdkBuilder.vulnerabilitiesExploitAvailable(vulnerabilitiesExploitAvailable.let(IResolvable::unwrap))
      }

      /**
       * @param vulnerabilitiesExploitAvailable Indicates whether a software vulnerability in your
       * environment has a known exploit.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      override fun vulnerabilitiesExploitAvailable(vulnerabilitiesExploitAvailable: List<Any>) {
        cdkBuilder.vulnerabilitiesExploitAvailable(vulnerabilitiesExploitAvailable.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param vulnerabilitiesExploitAvailable Indicates whether a software vulnerability in your
       * environment has a known exploit.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      override fun vulnerabilitiesExploitAvailable(vararg vulnerabilitiesExploitAvailable: Any):
          Unit = vulnerabilitiesExploitAvailable(vulnerabilitiesExploitAvailable.toList())

      /**
       * @param vulnerabilitiesFixAvailable Indicates whether a vulnerability is fixed in a newer
       * version of the affected software packages.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      override fun vulnerabilitiesFixAvailable(vulnerabilitiesFixAvailable: IResolvable) {
        cdkBuilder.vulnerabilitiesFixAvailable(vulnerabilitiesFixAvailable.let(IResolvable::unwrap))
      }

      /**
       * @param vulnerabilitiesFixAvailable Indicates whether a vulnerability is fixed in a newer
       * version of the affected software packages.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      override fun vulnerabilitiesFixAvailable(vulnerabilitiesFixAvailable: List<Any>) {
        cdkBuilder.vulnerabilitiesFixAvailable(vulnerabilitiesFixAvailable.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param vulnerabilitiesFixAvailable Indicates whether a vulnerability is fixed in a newer
       * version of the affected software packages.
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       */
      override fun vulnerabilitiesFixAvailable(vararg vulnerabilitiesFixAvailable: Any): Unit =
          vulnerabilitiesFixAvailable(vulnerabilitiesFixAvailable.toList())

      /**
       * @param workflowState The workflow state of a finding.
       * Note that this field is deprecated. To search for a finding based on its workflow status,
       * use `WorkflowStatus` .
       */
      override fun workflowState(workflowState: IResolvable) {
        cdkBuilder.workflowState(workflowState.let(IResolvable::unwrap))
      }

      /**
       * @param workflowState The workflow state of a finding.
       * Note that this field is deprecated. To search for a finding based on its workflow status,
       * use `WorkflowStatus` .
       */
      override fun workflowState(workflowState: List<Any>) {
        cdkBuilder.workflowState(workflowState.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param workflowState The workflow state of a finding.
       * Note that this field is deprecated. To search for a finding based on its workflow status,
       * use `WorkflowStatus` .
       */
      override fun workflowState(vararg workflowState: Any): Unit =
          workflowState(workflowState.toList())

      /**
       * @param workflowStatus The status of the investigation into a finding. Allowed values are
       * the following.
       * * `NEW` - The initial state of a finding, before it is reviewed.
       *
       * Security Hub also resets the workflow status from `NOTIFIED` or `RESOLVED` to `NEW` in the
       * following cases:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to either `WARNING` , `FAILED` , or
       * `NOT_AVAILABLE` .
       * * `NOTIFIED` - Indicates that the resource owner has been notified about the security
       * issue. Used when the initial reviewer is not the resource owner, and needs intervention from
       * the resource owner.
       *
       * If one of the following occurs, the workflow status is changed automatically from
       * `NOTIFIED` to `NEW` :
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
       * is needed.
       *
       * The workflow status of a `SUPPRESSED` finding does not change if `RecordState` changes from
       * `ARCHIVED` to `ACTIVE` .
       *
       * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
       *
       * The finding remains `RESOLVED` unless one of the following occurs:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       *
       * In those cases, the workflow status is automatically reset to `NEW` .
       *
       * For findings from controls, if `Compliance.Status` is `PASSED` , then Security Hub
       * automatically sets the workflow status to `RESOLVED` .
       */
      override fun workflowStatus(workflowStatus: IResolvable) {
        cdkBuilder.workflowStatus(workflowStatus.let(IResolvable::unwrap))
      }

      /**
       * @param workflowStatus The status of the investigation into a finding. Allowed values are
       * the following.
       * * `NEW` - The initial state of a finding, before it is reviewed.
       *
       * Security Hub also resets the workflow status from `NOTIFIED` or `RESOLVED` to `NEW` in the
       * following cases:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to either `WARNING` , `FAILED` , or
       * `NOT_AVAILABLE` .
       * * `NOTIFIED` - Indicates that the resource owner has been notified about the security
       * issue. Used when the initial reviewer is not the resource owner, and needs intervention from
       * the resource owner.
       *
       * If one of the following occurs, the workflow status is changed automatically from
       * `NOTIFIED` to `NEW` :
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
       * is needed.
       *
       * The workflow status of a `SUPPRESSED` finding does not change if `RecordState` changes from
       * `ARCHIVED` to `ACTIVE` .
       *
       * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
       *
       * The finding remains `RESOLVED` unless one of the following occurs:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       *
       * In those cases, the workflow status is automatically reset to `NEW` .
       *
       * For findings from controls, if `Compliance.Status` is `PASSED` , then Security Hub
       * automatically sets the workflow status to `RESOLVED` .
       */
      override fun workflowStatus(workflowStatus: List<Any>) {
        cdkBuilder.workflowStatus(workflowStatus.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param workflowStatus The status of the investigation into a finding. Allowed values are
       * the following.
       * * `NEW` - The initial state of a finding, before it is reviewed.
       *
       * Security Hub also resets the workflow status from `NOTIFIED` or `RESOLVED` to `NEW` in the
       * following cases:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to either `WARNING` , `FAILED` , or
       * `NOT_AVAILABLE` .
       * * `NOTIFIED` - Indicates that the resource owner has been notified about the security
       * issue. Used when the initial reviewer is not the resource owner, and needs intervention from
       * the resource owner.
       *
       * If one of the following occurs, the workflow status is changed automatically from
       * `NOTIFIED` to `NEW` :
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
       * is needed.
       *
       * The workflow status of a `SUPPRESSED` finding does not change if `RecordState` changes from
       * `ARCHIVED` to `ACTIVE` .
       *
       * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
       *
       * The finding remains `RESOLVED` unless one of the following occurs:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       *
       * In those cases, the workflow status is automatically reset to `NEW` .
       *
       * For findings from controls, if `Compliance.Status` is `PASSED` , then Security Hub
       * automatically sets the workflow status to `RESOLVED` .
       */
      override fun workflowStatus(vararg workflowStatus: Any): Unit =
          workflowStatus(workflowStatus.toList())

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnInsight.AwsSecurityFindingFiltersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.AwsSecurityFindingFiltersProperty,
    ) : CdkObject(cdkObject), AwsSecurityFindingFiltersProperty {
      /**
       * The AWS account ID in which a finding is generated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-awsaccountid)
       */
      override fun awsAccountId(): Any? = unwrap(this).getAwsAccountId()

      /**
       * The name of the AWS account in which a finding is generated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-awsaccountname)
       */
      override fun awsAccountName(): Any? = unwrap(this).getAwsAccountName()

      /**
       * The name of the findings provider (company) that owns the solution (product) that generates
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-companyname)
       */
      override fun companyName(): Any? = unwrap(this).getCompanyName()

      /**
       * The unique identifier of a standard in which a control is enabled.
       *
       * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for
       * a standard in the
       * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
       * API response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-complianceassociatedstandardsid)
       */
      override fun complianceAssociatedStandardsId(): Any? =
          unwrap(this).getComplianceAssociatedStandardsId()

      /**
       * The unique identifier of a control across standards.
       *
       * Values for this field typically consist of an AWS service and a number, such as
       * APIGateway.5.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-compliancesecuritycontrolid)
       */
      override fun complianceSecurityControlId(): Any? =
          unwrap(this).getComplianceSecurityControlId()

      /**
       * The name of a security control parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-compliancesecuritycontrolparametersname)
       */
      override fun complianceSecurityControlParametersName(): Any? =
          unwrap(this).getComplianceSecurityControlParametersName()

      /**
       * The current value of a security control parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-compliancesecuritycontrolparametersvalue)
       */
      override fun complianceSecurityControlParametersValue(): Any? =
          unwrap(this).getComplianceSecurityControlParametersValue()

      /**
       * Exclusive to findings that are generated as the result of a check run against a specific
       * rule in a supported standard, such as CIS AWS Foundations.
       *
       * Contains security standard-related finding details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-compliancestatus)
       */
      override fun complianceStatus(): Any? = unwrap(this).getComplianceStatus()

      /**
       * A finding's confidence.
       *
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-confidence)
       */
      override fun confidence(): Any? = unwrap(this).getConfidence()

      /**
       * A timestamp that indicates when the security findings provider created the potential
       * security issue that a finding reflects.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-createdat)
       */
      override fun createdAt(): Any? = unwrap(this).getCreatedAt()

      /**
       * The level of importance assigned to the resources associated with the finding.
       *
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-criticality)
       */
      override fun criticality(): Any? = unwrap(this).getCriticality()

      /**
       * A finding's description.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-description)
       */
      override fun description(): Any? = unwrap(this).getDescription()

      /**
       * The finding provider value for the finding confidence.
       *
       * Confidence is defined as the likelihood that a finding accurately identifies the behavior
       * or issue that it was intended to identify.
       *
       * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent
       * confidence and 100 means 100 percent confidence.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldsconfidence)
       */
      override fun findingProviderFieldsConfidence(): Any? =
          unwrap(this).getFindingProviderFieldsConfidence()

      /**
       * The finding provider value for the level of importance assigned to the resources associated
       * with the findings.
       *
       * A score of 0 means that the underlying resources have no criticality, and a score of 100 is
       * reserved for the most critical resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldscriticality)
       */
      override fun findingProviderFieldsCriticality(): Any? =
          unwrap(this).getFindingProviderFieldsCriticality()

      /**
       * The finding identifier of a related finding that is identified by the finding provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldsrelatedfindingsid)
       */
      override fun findingProviderFieldsRelatedFindingsId(): Any? =
          unwrap(this).getFindingProviderFieldsRelatedFindingsId()

      /**
       * The ARN of the solution that generated a related finding that is identified by the finding
       * provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldsrelatedfindingsproductarn)
       */
      override fun findingProviderFieldsRelatedFindingsProductArn(): Any? =
          unwrap(this).getFindingProviderFieldsRelatedFindingsProductArn()

      /**
       * The finding provider value for the severity label.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldsseveritylabel)
       */
      override fun findingProviderFieldsSeverityLabel(): Any? =
          unwrap(this).getFindingProviderFieldsSeverityLabel()

      /**
       * The finding provider's original value for the severity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldsseverityoriginal)
       */
      override fun findingProviderFieldsSeverityOriginal(): Any? =
          unwrap(this).getFindingProviderFieldsSeverityOriginal()

      /**
       * One or more finding types that the finding provider assigned to the finding.
       *
       * Uses the format of `namespace/category/classifier` that classify a finding.
       *
       * Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual
       * Behaviors | Sensitive Data Identifications
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-findingproviderfieldstypes)
       */
      override fun findingProviderFieldsTypes(): Any? = unwrap(this).getFindingProviderFieldsTypes()

      /**
       * A timestamp that indicates when the security findings provider first observed the potential
       * security issue that a finding captured.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-firstobservedat)
       */
      override fun firstObservedAt(): Any? = unwrap(this).getFirstObservedAt()

      /**
       * The identifier for the solution-specific component (a discrete unit of logic) that
       * generated a finding.
       *
       * In various security findings providers' solutions, this generator can be called a rule, a
       * check, a detector, a plugin, etc.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-generatorid)
       */
      override fun generatorId(): Any? = unwrap(this).getGeneratorId()

      /**
       * The security findings provider-specific identifier for a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-id)
       */
      override fun id(): Any? = unwrap(this).getId()

      /**
       * This field is deprecated.
       *
       * A keyword for a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-keyword)
       */
      override fun keyword(): Any? = unwrap(this).getKeyword()

      /**
       * A timestamp that indicates when the security findings provider most recently observed the
       * potential security issue that a finding captured.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-lastobservedat)
       */
      override fun lastObservedAt(): Any? = unwrap(this).getLastObservedAt()

      /**
       * The name of the malware that was observed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-malwarename)
       */
      override fun malwareName(): Any? = unwrap(this).getMalwareName()

      /**
       * The filesystem path of the malware that was observed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-malwarepath)
       */
      override fun malwarePath(): Any? = unwrap(this).getMalwarePath()

      /**
       * The state of the malware that was observed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-malwarestate)
       */
      override fun malwareState(): Any? = unwrap(this).getMalwareState()

      /**
       * The type of the malware that was observed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-malwaretype)
       */
      override fun malwareType(): Any? = unwrap(this).getMalwareType()

      /**
       * The destination domain of network-related information about a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkdestinationdomain)
       */
      override fun networkDestinationDomain(): Any? = unwrap(this).getNetworkDestinationDomain()

      /**
       * The destination IPv4 address of network-related information about a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkdestinationipv4)
       */
      override fun networkDestinationIpV4(): Any? = unwrap(this).getNetworkDestinationIpV4()

      /**
       * The destination IPv6 address of network-related information about a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkdestinationipv6)
       */
      override fun networkDestinationIpV6(): Any? = unwrap(this).getNetworkDestinationIpV6()

      /**
       * The destination port of network-related information about a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkdestinationport)
       */
      override fun networkDestinationPort(): Any? = unwrap(this).getNetworkDestinationPort()

      /**
       * Indicates the direction of network traffic associated with a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkdirection)
       */
      override fun networkDirection(): Any? = unwrap(this).getNetworkDirection()

      /**
       * The protocol of network-related information about a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networkprotocol)
       */
      override fun networkProtocol(): Any? = unwrap(this).getNetworkProtocol()

      /**
       * The source domain of network-related information about a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networksourcedomain)
       */
      override fun networkSourceDomain(): Any? = unwrap(this).getNetworkSourceDomain()

      /**
       * The source IPv4 address of network-related information about a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networksourceipv4)
       */
      override fun networkSourceIpV4(): Any? = unwrap(this).getNetworkSourceIpV4()

      /**
       * The source IPv6 address of network-related information about a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networksourceipv6)
       */
      override fun networkSourceIpV6(): Any? = unwrap(this).getNetworkSourceIpV6()

      /**
       * The source media access control (MAC) address of network-related information about a
       * finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networksourcemac)
       */
      override fun networkSourceMac(): Any? = unwrap(this).getNetworkSourceMac()

      /**
       * The source port of network-related information about a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-networksourceport)
       */
      override fun networkSourcePort(): Any? = unwrap(this).getNetworkSourcePort()

      /**
       * The text of a note.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-notetext)
       */
      override fun noteText(): Any? = unwrap(this).getNoteText()

      /**
       * The timestamp of when the note was updated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-noteupdatedat)
       */
      override fun noteUpdatedAt(): Any? = unwrap(this).getNoteUpdatedAt()

      /**
       * The principal that created a note.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-noteupdatedby)
       */
      override fun noteUpdatedBy(): Any? = unwrap(this).getNoteUpdatedBy()

      /**
       * A timestamp that identifies when the process was launched.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processlaunchedat)
       */
      override fun processLaunchedAt(): Any? = unwrap(this).getProcessLaunchedAt()

      /**
       * The name of the process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processname)
       */
      override fun processName(): Any? = unwrap(this).getProcessName()

      /**
       * The parent process ID.
       *
       * This field accepts positive integers between `O` and `2147483647` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processparentpid)
       */
      override fun processParentPid(): Any? = unwrap(this).getProcessParentPid()

      /**
       * The path to the process executable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processpath)
       */
      override fun processPath(): Any? = unwrap(this).getProcessPath()

      /**
       * The process ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processpid)
       */
      override fun processPid(): Any? = unwrap(this).getProcessPid()

      /**
       * A timestamp that identifies when the process was terminated.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-processterminatedat)
       */
      override fun processTerminatedAt(): Any? = unwrap(this).getProcessTerminatedAt()

      /**
       * The ARN generated by Security Hub that uniquely identifies a third-party company (security
       * findings provider) after this provider's product (solution that generates findings) is
       * registered with Security Hub.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-productarn)
       */
      override fun productArn(): Any? = unwrap(this).getProductArn()

      /**
       * A data type where security findings providers can include additional solution-specific
       * details that aren't part of the defined `AwsSecurityFinding` format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-productfields)
       */
      override fun productFields(): Any? = unwrap(this).getProductFields()

      /**
       * The name of the solution (product) that generates findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-productname)
       */
      override fun productName(): Any? = unwrap(this).getProductName()

      /**
       * The recommendation of what to do about the issue described in a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-recommendationtext)
       */
      override fun recommendationText(): Any? = unwrap(this).getRecommendationText()

      /**
       * The updated record state for the finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-recordstate)
       */
      override fun recordState(): Any? = unwrap(this).getRecordState()

      /**
       * The Region from which the finding was generated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-region)
       */
      override fun region(): Any? = unwrap(this).getRegion()

      /**
       * The solution-generated identifier for a related finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-relatedfindingsid)
       */
      override fun relatedFindingsId(): Any? = unwrap(this).getRelatedFindingsId()

      /**
       * The ARN of the solution that generated a related finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-relatedfindingsproductarn)
       */
      override fun relatedFindingsProductArn(): Any? = unwrap(this).getRelatedFindingsProductArn()

      /**
       * The ARN of the application that is related to a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceapplicationarn)
       */
      override fun resourceApplicationArn(): Any? = unwrap(this).getResourceApplicationArn()

      /**
       * The name of the application that is related to a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceapplicationname)
       */
      override fun resourceApplicationName(): Any? = unwrap(this).getResourceApplicationName()

      /**
       * The IAM profile ARN of the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instanceiaminstanceprofilearn)
       */
      override fun resourceAwsEc2InstanceIamInstanceProfileArn(): Any? =
          unwrap(this).getResourceAwsEc2InstanceIamInstanceProfileArn()

      /**
       * The Amazon Machine Image (AMI) ID of the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instanceimageid)
       */
      override fun resourceAwsEc2InstanceImageId(): Any? =
          unwrap(this).getResourceAwsEc2InstanceImageId()

      /**
       * The IPv4 addresses associated with the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instanceipv4addresses)
       */
      override fun resourceAwsEc2InstanceIpV4Addresses(): Any? =
          unwrap(this).getResourceAwsEc2InstanceIpV4Addresses()

      /**
       * The IPv6 addresses associated with the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instanceipv6addresses)
       */
      override fun resourceAwsEc2InstanceIpV6Addresses(): Any? =
          unwrap(this).getResourceAwsEc2InstanceIpV6Addresses()

      /**
       * The key name associated with the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instancekeyname)
       */
      override fun resourceAwsEc2InstanceKeyName(): Any? =
          unwrap(this).getResourceAwsEc2InstanceKeyName()

      /**
       * The date and time the instance was launched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instancelaunchedat)
       */
      override fun resourceAwsEc2InstanceLaunchedAt(): Any? =
          unwrap(this).getResourceAwsEc2InstanceLaunchedAt()

      /**
       * The identifier of the subnet that the instance was launched in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instancesubnetid)
       */
      override fun resourceAwsEc2InstanceSubnetId(): Any? =
          unwrap(this).getResourceAwsEc2InstanceSubnetId()

      /**
       * The instance type of the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instancetype)
       */
      override fun resourceAwsEc2InstanceType(): Any? = unwrap(this).getResourceAwsEc2InstanceType()

      /**
       * The identifier of the VPC that the instance was launched in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsec2instancevpcid)
       */
      override fun resourceAwsEc2InstanceVpcId(): Any? =
          unwrap(this).getResourceAwsEc2InstanceVpcId()

      /**
       * The creation date/time of the IAM access key related to a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsiamaccesskeycreatedat)
       */
      override fun resourceAwsIamAccessKeyCreatedAt(): Any? =
          unwrap(this).getResourceAwsIamAccessKeyCreatedAt()

      /**
       * The name of the principal that is associated with an IAM access key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsiamaccesskeyprincipalname)
       */
      override fun resourceAwsIamAccessKeyPrincipalName(): Any? =
          unwrap(this).getResourceAwsIamAccessKeyPrincipalName()

      /**
       * The status of the IAM access key related to a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsiamaccesskeystatus)
       */
      override fun resourceAwsIamAccessKeyStatus(): Any? =
          unwrap(this).getResourceAwsIamAccessKeyStatus()

      /**
       * This field is deprecated.
       *
       * The username associated with the IAM access key related to a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsiamaccesskeyusername)
       */
      override fun resourceAwsIamAccessKeyUserName(): Any? =
          unwrap(this).getResourceAwsIamAccessKeyUserName()

      /**
       * The name of an IAM user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawsiamuserusername)
       */
      override fun resourceAwsIamUserUserName(): Any? = unwrap(this).getResourceAwsIamUserUserName()

      /**
       * The canonical user ID of the owner of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawss3bucketownerid)
       */
      override fun resourceAwsS3BucketOwnerId(): Any? = unwrap(this).getResourceAwsS3BucketOwnerId()

      /**
       * The display name of the owner of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceawss3bucketownername)
       */
      override fun resourceAwsS3BucketOwnerName(): Any? =
          unwrap(this).getResourceAwsS3BucketOwnerName()

      /**
       * The identifier of the image related to a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcecontainerimageid)
       */
      override fun resourceContainerImageId(): Any? = unwrap(this).getResourceContainerImageId()

      /**
       * The name of the image related to a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcecontainerimagename)
       */
      override fun resourceContainerImageName(): Any? = unwrap(this).getResourceContainerImageName()

      /**
       * A timestamp that identifies when the container was started.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcecontainerlaunchedat)
       */
      override fun resourceContainerLaunchedAt(): Any? =
          unwrap(this).getResourceContainerLaunchedAt()

      /**
       * The name of the container related to a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcecontainername)
       */
      override fun resourceContainerName(): Any? = unwrap(this).getResourceContainerName()

      /**
       * The details of a resource that doesn't have a specific subfield for the resource type
       * defined.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcedetailsother)
       */
      override fun resourceDetailsOther(): Any? = unwrap(this).getResourceDetailsOther()

      /**
       * The canonical identifier for the given resource type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceid)
       */
      override fun resourceId(): Any? = unwrap(this).getResourceId()

      /**
       * The canonical AWS partition name that the Region is assigned to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcepartition)
       */
      override fun resourcePartition(): Any? = unwrap(this).getResourcePartition()

      /**
       * The canonical AWS external Region name where this resource is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourceregion)
       */
      override fun resourceRegion(): Any? = unwrap(this).getResourceRegion()

      /**
       * A list of AWS tags associated with a resource at the time the finding was processed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcetags)
       */
      override fun resourceTags(): Any? = unwrap(this).getResourceTags()

      /**
       * Specifies the type of the resource that details are provided for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-resourcetype)
       */
      override fun resourceType(): Any? = unwrap(this).getResourceType()

      /**
       * Indicates whether or not sample findings are included in the filter results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-sample)
       */
      override fun sample(): Any? = unwrap(this).getSample()

      /**
       * The label of a finding's severity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-severitylabel)
       */
      override fun severityLabel(): Any? = unwrap(this).getSeverityLabel()

      /**
       * Deprecated. The normalized severity of a finding. Instead of providing `Normalized` ,
       * provide `Label` .
       *
       * If you provide `Label` and do not provide `Normalized` , then `Normalized` is set
       * automatically as follows.
       *
       * * `INFORMATIONAL` - 0
       * * `LOW` - 1
       * * `MEDIUM` - 40
       * * `HIGH` - 70
       * * `CRITICAL` - 90
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-severitynormalized)
       */
      override fun severityNormalized(): Any? = unwrap(this).getSeverityNormalized()

      /**
       * Deprecated. This attribute isn't included in findings. Instead of providing `Product` ,
       * provide `Original` .
       *
       * The native severity as defined by the AWS service or integrated partner product that
       * generated the finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-severityproduct)
       */
      override fun severityProduct(): Any? = unwrap(this).getSeverityProduct()

      /**
       * A URL that links to a page about the current finding in the security findings provider's
       * solution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-sourceurl)
       */
      override fun sourceUrl(): Any? = unwrap(this).getSourceUrl()

      /**
       * The category of a threat intelligence indicator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatorcategory)
       */
      override fun threatIntelIndicatorCategory(): Any? =
          unwrap(this).getThreatIntelIndicatorCategory()

      /**
       * A timestamp that identifies the last observation of a threat intelligence indicator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatorlastobservedat)
       */
      override fun threatIntelIndicatorLastObservedAt(): Any? =
          unwrap(this).getThreatIntelIndicatorLastObservedAt()

      /**
       * The source of the threat intelligence.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatorsource)
       */
      override fun threatIntelIndicatorSource(): Any? = unwrap(this).getThreatIntelIndicatorSource()

      /**
       * The URL for more details from the source of the threat intelligence.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatorsourceurl)
       */
      override fun threatIntelIndicatorSourceUrl(): Any? =
          unwrap(this).getThreatIntelIndicatorSourceUrl()

      /**
       * The type of a threat intelligence indicator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatortype)
       */
      override fun threatIntelIndicatorType(): Any? = unwrap(this).getThreatIntelIndicatorType()

      /**
       * The value of a threat intelligence indicator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-threatintelindicatorvalue)
       */
      override fun threatIntelIndicatorValue(): Any? = unwrap(this).getThreatIntelIndicatorValue()

      /**
       * A finding's title.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-title)
       */
      override fun title(): Any? = unwrap(this).getTitle()

      /**
       * A finding type in the format of `namespace/category/classifier` that classifies a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-type)
       */
      override fun type(): Any? = unwrap(this).getType()

      /**
       * A timestamp that indicates when the security findings provider last updated the finding
       * record.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-updatedat)
       */
      override fun updatedAt(): Any? = unwrap(this).getUpdatedAt()

      /**
       * A list of name/value string pairs associated with the finding.
       *
       * These are custom, user-defined fields added to a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-userdefinedfields)
       */
      override fun userDefinedFields(): Any? = unwrap(this).getUserDefinedFields()

      /**
       * The veracity of a finding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-verificationstate)
       */
      override fun verificationState(): Any? = unwrap(this).getVerificationState()

      /**
       * Indicates whether a software vulnerability in your environment has a known exploit.
       *
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-vulnerabilitiesexploitavailable)
       */
      override fun vulnerabilitiesExploitAvailable(): Any? =
          unwrap(this).getVulnerabilitiesExploitAvailable()

      /**
       * Indicates whether a vulnerability is fixed in a newer version of the affected software
       * packages.
       *
       * You can filter findings by this field only if you use Security Hub and Amazon Inspector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-vulnerabilitiesfixavailable)
       */
      override fun vulnerabilitiesFixAvailable(): Any? =
          unwrap(this).getVulnerabilitiesFixAvailable()

      /**
       * The workflow state of a finding.
       *
       * Note that this field is deprecated. To search for a finding based on its workflow status,
       * use `WorkflowStatus` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-workflowstate)
       */
      override fun workflowState(): Any? = unwrap(this).getWorkflowState()

      /**
       * The status of the investigation into a finding. Allowed values are the following.
       *
       * * `NEW` - The initial state of a finding, before it is reviewed.
       *
       * Security Hub also resets the workflow status from `NOTIFIED` or `RESOLVED` to `NEW` in the
       * following cases:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to either `WARNING` , `FAILED` , or
       * `NOT_AVAILABLE` .
       * * `NOTIFIED` - Indicates that the resource owner has been notified about the security
       * issue. Used when the initial reviewer is not the resource owner, and needs intervention from
       * the resource owner.
       *
       * If one of the following occurs, the workflow status is changed automatically from
       * `NOTIFIED` to `NEW` :
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       * * `SUPPRESSED` - Indicates that you reviewed the finding and do not believe that any action
       * is needed.
       *
       * The workflow status of a `SUPPRESSED` finding does not change if `RecordState` changes from
       * `ARCHIVED` to `ACTIVE` .
       *
       * * `RESOLVED` - The finding was reviewed and remediated and is now considered resolved.
       *
       * The finding remains `RESOLVED` unless one of the following occurs:
       *
       * * `RecordState` changes from `ARCHIVED` to `ACTIVE` .
       * * `Compliance.Status` changes from `PASSED` to `FAILED` , `WARNING` , or `NOT_AVAILABLE` .
       *
       * In those cases, the workflow status is automatically reset to `NEW` .
       *
       * For findings from controls, if `Compliance.Status` is `PASSED` , then Security Hub
       * automatically sets the workflow status to `RESOLVED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-awssecurityfindingfilters.html#cfn-securityhub-insight-awssecurityfindingfilters-workflowstatus)
       */
      override fun workflowStatus(): Any? = unwrap(this).getWorkflowStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AwsSecurityFindingFiltersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.AwsSecurityFindingFiltersProperty):
          AwsSecurityFindingFiltersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AwsSecurityFindingFiltersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsSecurityFindingFiltersProperty):
          software.amazon.awscdk.services.securityhub.CfnInsight.AwsSecurityFindingFiltersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnInsight.AwsSecurityFindingFiltersProperty
    }
  }

  /**
   * Boolean filter for querying findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * BooleanFilterProperty booleanFilterProperty = BooleanFilterProperty.builder()
   * .value(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-booleanfilter.html)
   */
  public interface BooleanFilterProperty {
    /**
     * The value of the boolean.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-booleanfilter.html#cfn-securityhub-insight-booleanfilter-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [BooleanFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The value of the boolean. 
       */
      public fun `value`(`value`: Boolean)

      /**
       * @param value The value of the boolean. 
       */
      public fun `value`(`value`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnInsight.BooleanFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnInsight.BooleanFilterProperty.builder()

      /**
       * @param value The value of the boolean. 
       */
      override fun `value`(`value`: Boolean) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param value The value of the boolean. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnInsight.BooleanFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.BooleanFilterProperty,
    ) : CdkObject(cdkObject), BooleanFilterProperty {
      /**
       * The value of the boolean.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-booleanfilter.html#cfn-securityhub-insight-booleanfilter-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BooleanFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.BooleanFilterProperty):
          BooleanFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? BooleanFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BooleanFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnInsight.BooleanFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnInsight.BooleanFilterProperty
    }
  }

  /**
   * A date filter for querying findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * DateFilterProperty dateFilterProperty = DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-datefilter.html)
   */
  public interface DateFilterProperty {
    /**
     * A date range for the date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-datefilter.html#cfn-securityhub-insight-datefilter-daterange)
     */
    public fun dateRange(): Any? = unwrap(this).getDateRange()

    /**
     * A timestamp that provides the end date for the date filter.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-datefilter.html#cfn-securityhub-insight-datefilter-end)
     */
    public fun end(): String? = unwrap(this).getEnd()

    /**
     * A timestamp that provides the start date for the date filter.
     *
     * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
     * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *
     * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
     * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
     * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
     * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-datefilter.html#cfn-securityhub-insight-datefilter-start)
     */
    public fun start(): String? = unwrap(this).getStart()

    /**
     * A builder for [DateFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dateRange A date range for the date filter.
       */
      public fun dateRange(dateRange: IResolvable)

      /**
       * @param dateRange A date range for the date filter.
       */
      public fun dateRange(dateRange: DateRangeProperty)

      /**
       * @param dateRange A date range for the date filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd5be85859ee59042cb459b07d8cfd5750360047d991f4b0dc9c5c267e16a0c9")
      public fun dateRange(dateRange: DateRangeProperty.Builder.() -> Unit)

      /**
       * @param end A timestamp that provides the end date for the date filter.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun end(end: String)

      /**
       * @param start A timestamp that provides the start date for the date filter.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      public fun start(start: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnInsight.DateFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnInsight.DateFilterProperty.builder()

      /**
       * @param dateRange A date range for the date filter.
       */
      override fun dateRange(dateRange: IResolvable) {
        cdkBuilder.dateRange(dateRange.let(IResolvable::unwrap))
      }

      /**
       * @param dateRange A date range for the date filter.
       */
      override fun dateRange(dateRange: DateRangeProperty) {
        cdkBuilder.dateRange(dateRange.let(DateRangeProperty::unwrap))
      }

      /**
       * @param dateRange A date range for the date filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd5be85859ee59042cb459b07d8cfd5750360047d991f4b0dc9c5c267e16a0c9")
      override fun dateRange(dateRange: DateRangeProperty.Builder.() -> Unit): Unit =
          dateRange(DateRangeProperty(dateRange))

      /**
       * @param end A timestamp that provides the end date for the date filter.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      /**
       * @param start A timestamp that provides the start date for the date filter.
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       */
      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      public fun build(): software.amazon.awscdk.services.securityhub.CfnInsight.DateFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.DateFilterProperty,
    ) : CdkObject(cdkObject), DateFilterProperty {
      /**
       * A date range for the date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-datefilter.html#cfn-securityhub-insight-datefilter-daterange)
       */
      override fun dateRange(): Any? = unwrap(this).getDateRange()

      /**
       * A timestamp that provides the end date for the date filter.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-datefilter.html#cfn-securityhub-insight-datefilter-end)
       */
      override fun end(): String? = unwrap(this).getEnd()

      /**
       * A timestamp that provides the start date for the date filter.
       *
       * This field accepts only the specified formats. Timestamps can end with `Z` or `("+" / "-")
       * time-hour [":" time-minute]` . The time-secfrac after seconds is limited to a maximum of 9
       * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
       *
       * * `YYYY-MM-DDTHH:MM:SSZ` (for example, `2019-01-31T23:00:00Z` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ` (for example, `2019-01-31T23:00:00.123456789Z` )
       * * `YYYY-MM-DDTHH:MM:SS+HH:MM` (for example, `2024-01-04T15:25:10+17:59` )
       * * `YYYY-MM-DDTHH:MM:SS-HHMM` (for example, `2024-01-04T15:25:10-1759` )
       * * `YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM` (for example, `2024-01-04T15:25:10.123456789+17:59`
       * )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-datefilter.html#cfn-securityhub-insight-datefilter-start)
       */
      override fun start(): String? = unwrap(this).getStart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.DateFilterProperty):
          DateFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? DateFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnInsight.DateFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnInsight.DateFilterProperty
    }
  }

  /**
   * A date range for the date filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * DateRangeProperty dateRangeProperty = DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-daterange.html)
   */
  public interface DateRangeProperty {
    /**
     * A date range unit for the date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-daterange.html#cfn-securityhub-insight-daterange-unit)
     */
    public fun unit(): String

    /**
     * A date range value for the date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-daterange.html#cfn-securityhub-insight-daterange-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [DateRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit A date range unit for the date filter. 
       */
      public fun unit(unit: String)

      /**
       * @param value A date range value for the date filter. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnInsight.DateRangeProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnInsight.DateRangeProperty.builder()

      /**
       * @param unit A date range unit for the date filter. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value A date range value for the date filter. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.securityhub.CfnInsight.DateRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.DateRangeProperty,
    ) : CdkObject(cdkObject), DateRangeProperty {
      /**
       * A date range unit for the date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-daterange.html#cfn-securityhub-insight-daterange-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * A date range value for the date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-daterange.html#cfn-securityhub-insight-daterange-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.DateRangeProperty):
          DateRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? DateRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateRangeProperty):
          software.amazon.awscdk.services.securityhub.CfnInsight.DateRangeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnInsight.DateRangeProperty
    }
  }

  /**
   * The IP filter for querying findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * IpFilterProperty ipFilterProperty = IpFilterProperty.builder()
   * .cidr("cidr")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-ipfilter.html)
   */
  public interface IpFilterProperty {
    /**
     * A finding's CIDR value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-ipfilter.html#cfn-securityhub-insight-ipfilter-cidr)
     */
    public fun cidr(): String

    /**
     * A builder for [IpFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr A finding's CIDR value. 
       */
      public fun cidr(cidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnInsight.IpFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnInsight.IpFilterProperty.builder()

      /**
       * @param cidr A finding's CIDR value. 
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      public fun build(): software.amazon.awscdk.services.securityhub.CfnInsight.IpFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.IpFilterProperty,
    ) : CdkObject(cdkObject), IpFilterProperty {
      /**
       * A finding's CIDR value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-ipfilter.html#cfn-securityhub-insight-ipfilter-cidr)
       */
      override fun cidr(): String = unwrap(this).getCidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.IpFilterProperty):
          IpFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? IpFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnInsight.IpFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnInsight.IpFilterProperty
    }
  }

  /**
   * A keyword filter for querying findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * KeywordFilterProperty keywordFilterProperty = KeywordFilterProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-keywordfilter.html)
   */
  public interface KeywordFilterProperty {
    /**
     * A value for the keyword.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-keywordfilter.html#cfn-securityhub-insight-keywordfilter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [KeywordFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value A value for the keyword. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnInsight.KeywordFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnInsight.KeywordFilterProperty.builder()

      /**
       * @param value A value for the keyword. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnInsight.KeywordFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.KeywordFilterProperty,
    ) : CdkObject(cdkObject), KeywordFilterProperty {
      /**
       * A value for the keyword.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-keywordfilter.html#cfn-securityhub-insight-keywordfilter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeywordFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.KeywordFilterProperty):
          KeywordFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? KeywordFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeywordFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnInsight.KeywordFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnInsight.KeywordFilterProperty
    }
  }

  /**
   * A map filter for filtering AWS Security Hub findings.
   *
   * Each map filter provides the field to check for, the value to check for, and the comparison
   * operator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * MapFilterProperty mapFilterProperty = MapFilterProperty.builder()
   * .comparison("comparison")
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-mapfilter.html)
   */
  public interface MapFilterProperty {
    /**
     * The condition to apply to the key value when filtering Security Hub findings with a map
     * filter.
     *
     * To search for values that have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that include the filter value, use `CONTAINS` . For example, for the
     * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
     * the value `Security` for the `Department` tag. In the same example, a finding with a value of
     * `Security team` for the `Department` tag is a match.
     * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
     * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have the
     * value `Security` for the `Department` tag.
     *
     * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
     * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
     * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
     * both values.
     *
     * To search for values that don't have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
     * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
     * exclude the value `Finance` for the `Department` tag.
     * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
     * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
     * have the value `Finance` for the `Department` tag.
     *
     * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
     * matches only if it matches all of those filters. For example, the filters `Department
     * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
     * the `Security` and `Finance` values.
     *
     * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can
     * only be used with other `NOT_CONTAINS` filters.
     *
     * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
     * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
     * Combining filters in this way returns an error.
     *
     * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
     * information, see [Automation
     * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
     * *AWS Security Hub User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-mapfilter.html#cfn-securityhub-insight-mapfilter-comparison)
     */
    public fun comparison(): String

    /**
     * The key of the map filter.
     *
     * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
     * `UserDefinedFields` , `Key` is the name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-mapfilter.html#cfn-securityhub-insight-mapfilter-key)
     */
    public fun key(): String

    /**
     * The value for the key in the map filter.
     *
     * Filter values are case sensitive. For example, one of the values for a tag called
     * `Department` might be `Security` . If you provide `security` as the filter value, then there's
     * no match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-mapfilter.html#cfn-securityhub-insight-mapfilter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [MapFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparison The condition to apply to the key value when filtering Security Hub
       * findings with a map filter. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, for the
       * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
       * the value `Security` for the `Department` tag. In the same example, a finding with a value of
       * `Security team` for the `Department` tag is a match.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
       * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have
       * the value `Security` for the `Department` tag.
       *
       * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
       * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
       * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
       * both values.
       *
       * To search for values that don't have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
       * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
       * exclude the value `Finance` for the `Department` tag.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
       * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
       * have the value `Finance` for the `Department` tag.
       *
       * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
       * matches only if it matches all of those filters. For example, the filters `Department
       * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
       * the `Security` and `Finance` values.
       *
       * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters
       * can only be used with other `NOT_CONTAINS` filters.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
       * Combining filters in this way returns an error.
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      public fun comparison(comparison: String)

      /**
       * @param key The key of the map filter. 
       * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
       * `UserDefinedFields` , `Key` is the name of the field.
       */
      public fun key(key: String)

      /**
       * @param value The value for the key in the map filter. 
       * Filter values are case sensitive. For example, one of the values for a tag called
       * `Department` might be `Security` . If you provide `security` as the filter value, then there's
       * no match.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnInsight.MapFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnInsight.MapFilterProperty.builder()

      /**
       * @param comparison The condition to apply to the key value when filtering Security Hub
       * findings with a map filter. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, for the
       * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
       * the value `Security` for the `Department` tag. In the same example, a finding with a value of
       * `Security team` for the `Department` tag is a match.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
       * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have
       * the value `Security` for the `Department` tag.
       *
       * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
       * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
       * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
       * both values.
       *
       * To search for values that don't have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
       * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
       * exclude the value `Finance` for the `Department` tag.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
       * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
       * have the value `Finance` for the `Department` tag.
       *
       * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
       * matches only if it matches all of those filters. For example, the filters `Department
       * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
       * the `Security` and `Finance` values.
       *
       * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters
       * can only be used with other `NOT_CONTAINS` filters.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
       * Combining filters in this way returns an error.
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      /**
       * @param key The key of the map filter. 
       * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
       * `UserDefinedFields` , `Key` is the name of the field.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value for the key in the map filter. 
       * Filter values are case sensitive. For example, one of the values for a tag called
       * `Department` might be `Security` . If you provide `security` as the filter value, then there's
       * no match.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.securityhub.CfnInsight.MapFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.MapFilterProperty,
    ) : CdkObject(cdkObject), MapFilterProperty {
      /**
       * The condition to apply to the key value when filtering Security Hub findings with a map
       * filter.
       *
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, for the
       * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
       * the value `Security` for the `Department` tag. In the same example, a finding with a value of
       * `Security team` for the `Department` tag is a match.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
       * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have
       * the value `Security` for the `Department` tag.
       *
       * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
       * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
       * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
       * both values.
       *
       * To search for values that don't have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
       * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
       * exclude the value `Finance` for the `Department` tag.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
       * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
       * have the value `Finance` for the `Department` tag.
       *
       * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
       * matches only if it matches all of those filters. For example, the filters `Department
       * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
       * the `Security` and `Finance` values.
       *
       * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters
       * can only be used with other `NOT_CONTAINS` filters.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
       * Combining filters in this way returns an error.
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-mapfilter.html#cfn-securityhub-insight-mapfilter-comparison)
       */
      override fun comparison(): String = unwrap(this).getComparison()

      /**
       * The key of the map filter.
       *
       * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
       * `UserDefinedFields` , `Key` is the name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-mapfilter.html#cfn-securityhub-insight-mapfilter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value for the key in the map filter.
       *
       * Filter values are case sensitive. For example, one of the values for a tag called
       * `Department` might be `Security` . If you provide `security` as the filter value, then there's
       * no match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-mapfilter.html#cfn-securityhub-insight-mapfilter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MapFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.MapFilterProperty):
          MapFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? MapFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MapFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnInsight.MapFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnInsight.MapFilterProperty
    }
  }

  /**
   * A number filter for querying findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * NumberFilterProperty numberFilterProperty = NumberFilterProperty.builder()
   * .eq(123)
   * .gte(123)
   * .lte(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-numberfilter.html)
   */
  public interface NumberFilterProperty {
    /**
     * The equal-to condition to be applied to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-numberfilter.html#cfn-securityhub-insight-numberfilter-eq)
     */
    public fun eq(): Number? = unwrap(this).getEq()

    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-numberfilter.html#cfn-securityhub-insight-numberfilter-gte)
     */
    public fun gte(): Number? = unwrap(this).getGte()

    /**
     * The less-than-equal condition to be applied to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-numberfilter.html#cfn-securityhub-insight-numberfilter-lte)
     */
    public fun lte(): Number? = unwrap(this).getLte()

    /**
     * A builder for [NumberFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eq The equal-to condition to be applied to a single field when querying for
       * findings.
       */
      public fun eq(eq: Number)

      /**
       * @param gte The greater-than-equal condition to be applied to a single field when querying
       * for findings.
       */
      public fun gte(gte: Number)

      /**
       * @param lte The less-than-equal condition to be applied to a single field when querying for
       * findings.
       */
      public fun lte(lte: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnInsight.NumberFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnInsight.NumberFilterProperty.builder()

      /**
       * @param eq The equal-to condition to be applied to a single field when querying for
       * findings.
       */
      override fun eq(eq: Number) {
        cdkBuilder.eq(eq)
      }

      /**
       * @param gte The greater-than-equal condition to be applied to a single field when querying
       * for findings.
       */
      override fun gte(gte: Number) {
        cdkBuilder.gte(gte)
      }

      /**
       * @param lte The less-than-equal condition to be applied to a single field when querying for
       * findings.
       */
      override fun lte(lte: Number) {
        cdkBuilder.lte(lte)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnInsight.NumberFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.NumberFilterProperty,
    ) : CdkObject(cdkObject), NumberFilterProperty {
      /**
       * The equal-to condition to be applied to a single field when querying for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-numberfilter.html#cfn-securityhub-insight-numberfilter-eq)
       */
      override fun eq(): Number? = unwrap(this).getEq()

      /**
       * The greater-than-equal condition to be applied to a single field when querying for
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-numberfilter.html#cfn-securityhub-insight-numberfilter-gte)
       */
      override fun gte(): Number? = unwrap(this).getGte()

      /**
       * The less-than-equal condition to be applied to a single field when querying for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-numberfilter.html#cfn-securityhub-insight-numberfilter-lte)
       */
      override fun lte(): Number? = unwrap(this).getLte()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NumberFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.NumberFilterProperty):
          NumberFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? NumberFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NumberFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnInsight.NumberFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnInsight.NumberFilterProperty
    }
  }

  /**
   * A string filter for filtering AWS Security Hub findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * StringFilterProperty stringFilterProperty = StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-stringfilter.html)
   */
  public interface StringFilterProperty {
    /**
     * The condition to apply to a string value when filtering Security Hub findings.
     *
     * To search for values that have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that include the filter value, use `CONTAINS` . For example, the
     * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the string
     * CloudFront.
     * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
     * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
     * `123456789012` .
     * * To search for values that start with the filter value, use `PREFIX` . For example, the
     * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts with
     * `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or `ca` ,
     * doesn't match.
     *
     * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A finding
     * matches if it matches any one of those filters. For example, the filters `Title CONTAINS
     * CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either `CloudFront` ,
     * `CloudWatch` , or both strings in the title.
     *
     * To search for values that don’t have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
     * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
     * string CloudFront.
     * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
     * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
     * other than `123456789012` .
     * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` . For
     * example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
     * `ResourceRegion` that starts with a value other than `us` .
     *
     * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are joined
     * by `AND` . A finding matches only if it matches all of those filters. For example, the filters
     * `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that excludes
     * both `CloudFront` and `CloudWatch` in the title.
     *
     * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
     * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
     * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters can
     * only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with other
     * `NOT_CONTAINS` filters.
     *
     * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
     * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
     * `PREFIX_NOT_EQUALS` filters.
     *
     * For example, for the following filters, Security Hub first identifies findings that have
     * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that have
     * a resource type of `AwsIamPolicy` and findings that have a resource type of
     * `AwsEc2NetworkInterface` .
     *
     * * `ResourceType PREFIX AwsIam`
     * * `ResourceType PREFIX AwsEc2`
     * * `ResourceType NOT_EQUALS AwsIamPolicy`
     * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
     *
     * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
     * information, see [Automation
     * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
     * *AWS Security Hub User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-stringfilter.html#cfn-securityhub-insight-stringfilter-comparison)
     */
    public fun comparison(): String

    /**
     * The string filter value.
     *
     * Filter values are case sensitive. For example, the product name for control-based findings is
     * `Security Hub` . If you provide `security hub` as the filter value, there's no match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-stringfilter.html#cfn-securityhub-insight-stringfilter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [StringFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparison The condition to apply to a string value when filtering Security Hub
       * findings. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, the
       * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the
       * string CloudFront.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
       * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
       * `123456789012` .
       * * To search for values that start with the filter value, use `PREFIX` . For example, the
       * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts
       * with `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or
       * `ca` , doesn't match.
       *
       * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A
       * finding matches if it matches any one of those filters. For example, the filters `Title
       * CONTAINS CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either
       * `CloudFront` , `CloudWatch` , or both strings in the title.
       *
       * To search for values that don’t have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
       * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
       * string CloudFront.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
       * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
       * other than `123456789012` .
       * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` .
       * For example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
       * `ResourceRegion` that starts with a value other than `us` .
       *
       * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are
       * joined by `AND` . A finding matches only if it matches all of those filters. For example, the
       * filters `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that
       * excludes both `CloudFront` and `CloudWatch` in the title.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
       * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters
       * can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with
       * other `NOT_CONTAINS` filters.
       *
       * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
       * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
       * `PREFIX_NOT_EQUALS` filters.
       *
       * For example, for the following filters, Security Hub first identifies findings that have
       * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that
       * have a resource type of `AwsIamPolicy` and findings that have a resource type of
       * `AwsEc2NetworkInterface` .
       *
       * * `ResourceType PREFIX AwsIam`
       * * `ResourceType PREFIX AwsEc2`
       * * `ResourceType NOT_EQUALS AwsIamPolicy`
       * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      public fun comparison(comparison: String)

      /**
       * @param value The string filter value. 
       * Filter values are case sensitive. For example, the product name for control-based findings
       * is `Security Hub` . If you provide `security hub` as the filter value, there's no match.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnInsight.StringFilterProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnInsight.StringFilterProperty.builder()

      /**
       * @param comparison The condition to apply to a string value when filtering Security Hub
       * findings. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, the
       * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the
       * string CloudFront.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
       * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
       * `123456789012` .
       * * To search for values that start with the filter value, use `PREFIX` . For example, the
       * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts
       * with `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or
       * `ca` , doesn't match.
       *
       * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A
       * finding matches if it matches any one of those filters. For example, the filters `Title
       * CONTAINS CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either
       * `CloudFront` , `CloudWatch` , or both strings in the title.
       *
       * To search for values that don’t have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
       * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
       * string CloudFront.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
       * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
       * other than `123456789012` .
       * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` .
       * For example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
       * `ResourceRegion` that starts with a value other than `us` .
       *
       * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are
       * joined by `AND` . A finding matches only if it matches all of those filters. For example, the
       * filters `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that
       * excludes both `CloudFront` and `CloudWatch` in the title.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
       * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters
       * can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with
       * other `NOT_CONTAINS` filters.
       *
       * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
       * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
       * `PREFIX_NOT_EQUALS` filters.
       *
       * For example, for the following filters, Security Hub first identifies findings that have
       * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that
       * have a resource type of `AwsIamPolicy` and findings that have a resource type of
       * `AwsEc2NetworkInterface` .
       *
       * * `ResourceType PREFIX AwsIam`
       * * `ResourceType PREFIX AwsEc2`
       * * `ResourceType NOT_EQUALS AwsIamPolicy`
       * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      /**
       * @param value The string filter value. 
       * Filter values are case sensitive. For example, the product name for control-based findings
       * is `Security Hub` . If you provide `security hub` as the filter value, there's no match.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnInsight.StringFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.StringFilterProperty,
    ) : CdkObject(cdkObject), StringFilterProperty {
      /**
       * The condition to apply to a string value when filtering Security Hub findings.
       *
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, the
       * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the
       * string CloudFront.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
       * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
       * `123456789012` .
       * * To search for values that start with the filter value, use `PREFIX` . For example, the
       * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts
       * with `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or
       * `ca` , doesn't match.
       *
       * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A
       * finding matches if it matches any one of those filters. For example, the filters `Title
       * CONTAINS CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either
       * `CloudFront` , `CloudWatch` , or both strings in the title.
       *
       * To search for values that don’t have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
       * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
       * string CloudFront.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
       * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
       * other than `123456789012` .
       * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` .
       * For example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
       * `ResourceRegion` that starts with a value other than `us` .
       *
       * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are
       * joined by `AND` . A finding matches only if it matches all of those filters. For example, the
       * filters `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that
       * excludes both `CloudFront` and `CloudWatch` in the title.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
       * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters
       * can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with
       * other `NOT_CONTAINS` filters.
       *
       * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
       * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
       * `PREFIX_NOT_EQUALS` filters.
       *
       * For example, for the following filters, Security Hub first identifies findings that have
       * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that
       * have a resource type of `AwsIamPolicy` and findings that have a resource type of
       * `AwsEc2NetworkInterface` .
       *
       * * `ResourceType PREFIX AwsIam`
       * * `ResourceType PREFIX AwsEc2`
       * * `ResourceType NOT_EQUALS AwsIamPolicy`
       * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-stringfilter.html#cfn-securityhub-insight-stringfilter-comparison)
       */
      override fun comparison(): String = unwrap(this).getComparison()

      /**
       * The string filter value.
       *
       * Filter values are case sensitive. For example, the product name for control-based findings
       * is `Security Hub` . If you provide `security hub` as the filter value, there's no match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-insight-stringfilter.html#cfn-securityhub-insight-stringfilter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StringFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnInsight.StringFilterProperty):
          StringFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? StringFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnInsight.StringFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnInsight.StringFilterProperty
    }
  }
}
