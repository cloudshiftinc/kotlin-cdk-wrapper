@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFindingAggregator`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnFindingAggregatorProps cfnFindingAggregatorProps = CfnFindingAggregatorProps.builder()
 * .regionLinkingMode("regionLinkingMode")
 * // the properties below are optional
 * .regions(List.of("regions"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html)
 */
public interface CfnFindingAggregatorProps {
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
   * * `ALL_REGIONS` - Indicates to aggregate findings from all of the Regions where Security Hub is
   * enabled. When you choose this option, Security Hub also automatically aggregates findings from new
   * Regions as Security Hub supports them and you opt into them.
   * * `ALL_REGIONS_EXCEPT_SPECIFIED` - Indicates to aggregate findings from all of the Regions
   * where Security Hub is enabled, except for the Regions listed in the `Regions` parameter. When you
   * choose this option, Security Hub also automatically aggregates findings from new Regions as
   * Security Hub supports them and you opt into them.
   * * `SPECIFIED_REGIONS` - Indicates to aggregate findings only from the Regions listed in the
   * `Regions` parameter. Security Hub does not automatically aggregate findings from new Regions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html#cfn-securityhub-findingaggregator-regionlinkingmode)
   */
  public fun regionLinkingMode(): String

  /**
   * If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a space-separated list
   * of Regions that do not aggregate findings to the aggregation Region.
   *
   * If `RegionLinkingMode` is `SPECIFIED_REGIONS` , then this is a space-separated list of Regions
   * that do aggregate findings to the aggregation Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html#cfn-securityhub-findingaggregator-regions)
   */
  public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

  /**
   * A builder for [CfnFindingAggregatorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param regionLinkingMode Indicates whether to aggregate findings from all of the available
     * Regions in the current partition. 
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
     */
    public fun regionLinkingMode(regionLinkingMode: String)

    /**
     * @param regions If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a
     * space-separated list of Regions that do not aggregate findings to the aggregation Region.
     * If `RegionLinkingMode` is `SPECIFIED_REGIONS` , then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     */
    public fun regions(regions: List<String>)

    /**
     * @param regions If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a
     * space-separated list of Regions that do not aggregate findings to the aggregation Region.
     * If `RegionLinkingMode` is `SPECIFIED_REGIONS` , then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     */
    public fun regions(vararg regions: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnFindingAggregatorProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnFindingAggregatorProps.builder()

    /**
     * @param regionLinkingMode Indicates whether to aggregate findings from all of the available
     * Regions in the current partition. 
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
     */
    override fun regionLinkingMode(regionLinkingMode: String) {
      cdkBuilder.regionLinkingMode(regionLinkingMode)
    }

    /**
     * @param regions If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a
     * space-separated list of Regions that do not aggregate findings to the aggregation Region.
     * If `RegionLinkingMode` is `SPECIFIED_REGIONS` , then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     */
    override fun regions(regions: List<String>) {
      cdkBuilder.regions(regions)
    }

    /**
     * @param regions If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a
     * space-separated list of Regions that do not aggregate findings to the aggregation Region.
     * If `RegionLinkingMode` is `SPECIFIED_REGIONS` , then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     */
    override fun regions(vararg regions: String): Unit = regions(regions.toList())

    public fun build(): software.amazon.awscdk.services.securityhub.CfnFindingAggregatorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnFindingAggregatorProps,
  ) : CdkObject(cdkObject),
      CfnFindingAggregatorProps {
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
     */
    override fun regionLinkingMode(): String = unwrap(this).getRegionLinkingMode()

    /**
     * If `RegionLinkingMode` is `ALL_REGIONS_EXCEPT_SPECIFIED` , then this is a space-separated
     * list of Regions that do not aggregate findings to the aggregation Region.
     *
     * If `RegionLinkingMode` is `SPECIFIED_REGIONS` , then this is a space-separated list of
     * Regions that do aggregate findings to the aggregation Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-findingaggregator.html#cfn-securityhub-findingaggregator-regions)
     */
    override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFindingAggregatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnFindingAggregatorProps):
        CfnFindingAggregatorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFindingAggregatorProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFindingAggregatorProps):
        software.amazon.awscdk.services.securityhub.CfnFindingAggregatorProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.securityhub.CfnFindingAggregatorProps
  }
}
