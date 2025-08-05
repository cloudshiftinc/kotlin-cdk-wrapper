@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnAggregatorV2`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnAggregatorV2Props cfnAggregatorV2Props = CfnAggregatorV2Props.builder()
 * .linkedRegions(List.of("linkedRegions"))
 * .regionLinkingMode("regionLinkingMode")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html)
 */
public interface CfnAggregatorV2Props {
  /**
   * The list of Regions that are linked to the aggregation Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-linkedregions)
   */
  public fun linkedRegions(): List<String>

  /**
   * Determines how Regions are linked to an Aggregator V2.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-regionlinkingmode)
   */
  public fun regionLinkingMode(): String

  /**
   * A list of key-value pairs to be applied to the AggregatorV2.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnAggregatorV2Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param linkedRegions The list of Regions that are linked to the aggregation Region. 
     */
    public fun linkedRegions(linkedRegions: List<String>)

    /**
     * @param linkedRegions The list of Regions that are linked to the aggregation Region. 
     */
    public fun linkedRegions(vararg linkedRegions: String)

    /**
     * @param regionLinkingMode Determines how Regions are linked to an Aggregator V2. 
     */
    public fun regionLinkingMode(regionLinkingMode: String)

    /**
     * @param tags A list of key-value pairs to be applied to the AggregatorV2.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnAggregatorV2Props.Builder
        = software.amazon.awscdk.services.securityhub.CfnAggregatorV2Props.builder()

    /**
     * @param linkedRegions The list of Regions that are linked to the aggregation Region. 
     */
    override fun linkedRegions(linkedRegions: List<String>) {
      cdkBuilder.linkedRegions(linkedRegions)
    }

    /**
     * @param linkedRegions The list of Regions that are linked to the aggregation Region. 
     */
    override fun linkedRegions(vararg linkedRegions: String): Unit =
        linkedRegions(linkedRegions.toList())

    /**
     * @param regionLinkingMode Determines how Regions are linked to an Aggregator V2. 
     */
    override fun regionLinkingMode(regionLinkingMode: String) {
      cdkBuilder.regionLinkingMode(regionLinkingMode)
    }

    /**
     * @param tags A list of key-value pairs to be applied to the AggregatorV2.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnAggregatorV2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnAggregatorV2Props,
  ) : CdkObject(cdkObject),
      CfnAggregatorV2Props {
    /**
     * The list of Regions that are linked to the aggregation Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-linkedregions)
     */
    override fun linkedRegions(): List<String> = unwrap(this).getLinkedRegions()

    /**
     * Determines how Regions are linked to an Aggregator V2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-regionlinkingmode)
     */
    override fun regionLinkingMode(): String = unwrap(this).getRegionLinkingMode()

    /**
     * A list of key-value pairs to be applied to the AggregatorV2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAggregatorV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAggregatorV2Props):
        CfnAggregatorV2Props = CdkObjectWrappers.wrap(cdkObject) as? CfnAggregatorV2Props ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAggregatorV2Props):
        software.amazon.awscdk.services.securityhub.CfnAggregatorV2Props = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securityhub.CfnAggregatorV2Props
  }
}
