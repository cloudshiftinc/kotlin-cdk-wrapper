@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SecurityHub::FindingAggregator` resource enables cross-Region aggregation.
 *
 * When cross-Region aggregation is enabled, you can aggregate findings, finding updates, insights,
 * control compliance statuses, and security scores from one or more linked Regions to a single
 * aggregation Region. You can then view and manage all of this data from the aggregation Region. For
 * more details about cross-Region aggregation, see [Cross-Region
 * aggregation](https://docs.aws.amazon.com/securityhub/latest/userguide/finding-aggregation.html) in
 * the *AWS Security Hub User Guide*
 *
 * This resource must be created in the Region that you want to designate as your aggregation
 * Region.
 *
 * Cross-Region aggregation is also a prerequisite for using [central
 * configuration](https://docs.aws.amazon.com/securityhub/latest/userguide/central-configuration-intro.html)
 * in Security Hub .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnFindingAggregator cfnFindingAggregator = CfnFindingAggregator.Builder.create(this,
 * "MyCfnFindingAggregator")
 * .regionLinkingMode("regionLinkingMode")
 * // the properties below are optional
 * .regions(List.of("regions"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html)
 */
public open class CfnFindingAggregator(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnFindingAggregator,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFindingAggregatorProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnFindingAggregator(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFindingAggregatorProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFindingAggregatorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFindingAggregatorProps(props)
  )

  /**
   * The home Region.
   *
   * Findings generated in linked Regions are replicated and sent to the home Region.
   */
  public open fun attrFindingAggregationRegion(): String =
      unwrap(this).getAttrFindingAggregationRegion()

  /**
   * The ARN of the finding aggregator.
   *
   * You use the finding aggregator ARN to retrieve details for, update, and delete the finding
   * aggregator.
   */
  public open fun attrFindingAggregatorArn(): String = unwrap(this).getAttrFindingAggregatorArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Indicates whether to aggregate findings from all of the available Regions in the current
   * partition.
   */
  public open fun regionLinkingMode(): String = unwrap(this).getRegionLinkingMode()

  /**
   * Indicates whether to aggregate findings from all of the available Regions in the current
   * partition.
   */
  public open fun regionLinkingMode(`value`: String) {
    unwrap(this).setRegionLinkingMode(`value`)
  }

  /**
   * If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a space-separated list
   * of Regions that do not aggregate findings to the aggregation Region.
   */
  public open fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

  /**
   * If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a space-separated list
   * of Regions that do not aggregate findings to the aggregation Region.
   */
  public open fun regions(`value`: List<String>) {
    unwrap(this).setRegions(`value`)
  }

  /**
   * If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a space-separated list
   * of Regions that do not aggregate findings to the aggregation Region.
   */
  public open fun regions(vararg `value`: String): Unit = regions(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnFindingAggregator].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether to aggregate findings from all of the available Regions in the current
     * partition.
     *
     * Also determines whether to automatically aggregate findings from new Regions as Security Hub
     * supports them and you opt into them.
     *
     * The selected option also determines how to use the Regions provided in the Regions list.
     *
     * In AWS CloudFormation , the options for this property are as follows:
     *
     * * `ALL_REGIONS` - Indicates to aggregate findings from all of the Regions where Security Hub
     * is enabled. When you choose this option, Security Hub also automatically aggregates findings
     * from new Regions as Security Hub supports them and you opt into them.
     * * `ALL_REGIONS_EXCEPT_SPECIFIED` - Indicates to aggregate findings from all of the Regions
     * where Security Hub is enabled, except for the Regions listed in the `Regions` parameter. When
     * you choose this option, Security Hub also automatically aggregates findings from new Regions as
     * Security Hub supports them and you opt into them.
     * * `SPECIFIED_REGIONS` - Indicates to aggregate findings only from the Regions listed in the
     * `Regions` parameter. Security Hub does not automatically aggregate findings from new Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html#cfn-securityhub-findingaggregator-regionlinkingmode)
     * @param regionLinkingMode Indicates whether to aggregate findings from all of the available
     * Regions in the current partition. 
     */
    public fun regionLinkingMode(regionLinkingMode: String)

    /**
     * If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a space-separated
     * list of Regions that do not aggregate findings to the aggregation Region.
     *
     * If `RegionLinkingMode` is `SPECIFIED_REGIONS` , then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html#cfn-securityhub-findingaggregator-regions)
     * @param regions If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a
     * space-separated list of Regions that do not aggregate findings to the aggregation Region. 
     */
    public fun regions(regions: List<String>)

    /**
     * If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a space-separated
     * list of Regions that do not aggregate findings to the aggregation Region.
     *
     * If `RegionLinkingMode` is `SPECIFIED_REGIONS` , then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html#cfn-securityhub-findingaggregator-regions)
     * @param regions If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a
     * space-separated list of Regions that do not aggregate findings to the aggregation Region. 
     */
    public fun regions(vararg regions: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnFindingAggregator.Builder
        = software.amazon.awscdk.services.securityhub.CfnFindingAggregator.Builder.create(scope, id)

    /**
     * Indicates whether to aggregate findings from all of the available Regions in the current
     * partition.
     *
     * Also determines whether to automatically aggregate findings from new Regions as Security Hub
     * supports them and you opt into them.
     *
     * The selected option also determines how to use the Regions provided in the Regions list.
     *
     * In AWS CloudFormation , the options for this property are as follows:
     *
     * * `ALL_REGIONS` - Indicates to aggregate findings from all of the Regions where Security Hub
     * is enabled. When you choose this option, Security Hub also automatically aggregates findings
     * from new Regions as Security Hub supports them and you opt into them.
     * * `ALL_REGIONS_EXCEPT_SPECIFIED` - Indicates to aggregate findings from all of the Regions
     * where Security Hub is enabled, except for the Regions listed in the `Regions` parameter. When
     * you choose this option, Security Hub also automatically aggregates findings from new Regions as
     * Security Hub supports them and you opt into them.
     * * `SPECIFIED_REGIONS` - Indicates to aggregate findings only from the Regions listed in the
     * `Regions` parameter. Security Hub does not automatically aggregate findings from new Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html#cfn-securityhub-findingaggregator-regionlinkingmode)
     * @param regionLinkingMode Indicates whether to aggregate findings from all of the available
     * Regions in the current partition. 
     */
    override fun regionLinkingMode(regionLinkingMode: String) {
      cdkBuilder.regionLinkingMode(regionLinkingMode)
    }

    /**
     * If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a space-separated
     * list of Regions that do not aggregate findings to the aggregation Region.
     *
     * If `RegionLinkingMode` is `SPECIFIED_REGIONS` , then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html#cfn-securityhub-findingaggregator-regions)
     * @param regions If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a
     * space-separated list of Regions that do not aggregate findings to the aggregation Region. 
     */
    override fun regions(regions: List<String>) {
      cdkBuilder.regions(regions)
    }

    /**
     * If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a space-separated
     * list of Regions that do not aggregate findings to the aggregation Region.
     *
     * If `RegionLinkingMode` is `SPECIFIED_REGIONS` , then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html#cfn-securityhub-findingaggregator-regions)
     * @param regions If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a
     * space-separated list of Regions that do not aggregate findings to the aggregation Region. 
     */
    override fun regions(vararg regions: String): Unit = regions(regions.toList())

    public fun build(): software.amazon.awscdk.services.securityhub.CfnFindingAggregator =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnFindingAggregator.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFindingAggregator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFindingAggregator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnFindingAggregator):
        CfnFindingAggregator = CfnFindingAggregator(cdkObject)

    internal fun unwrap(wrapped: CfnFindingAggregator):
        software.amazon.awscdk.services.securityhub.CfnFindingAggregator = wrapped.cdkObject as
        software.amazon.awscdk.services.securityhub.CfnFindingAggregator
  }
}
