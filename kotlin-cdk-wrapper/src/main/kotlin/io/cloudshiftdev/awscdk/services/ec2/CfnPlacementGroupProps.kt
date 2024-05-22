@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPlacementGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnPlacementGroupProps cfnPlacementGroupProps = CfnPlacementGroupProps.builder()
 * .partitionCount(123)
 * .spreadLevel("spreadLevel")
 * .strategy("strategy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html)
 */
public interface CfnPlacementGroupProps {
  /**
   * The number of partitions.
   *
   * Valid only when *Strategy* is set to `partition` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-partitioncount)
   */
  public fun partitionCount(): Number? = unwrap(this).getPartitionCount()

  /**
   * Determines how placement groups spread instances.
   *
   * * Host – You can use `host` only with Outpost placement groups.
   * * Rack – No usage restrictions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-spreadlevel)
   */
  public fun spreadLevel(): String? = unwrap(this).getSpreadLevel()

  /**
   * The placement strategy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-strategy)
   */
  public fun strategy(): String? = unwrap(this).getStrategy()

  /**
   * The tags to apply to the new placement group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPlacementGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param partitionCount The number of partitions.
     * Valid only when *Strategy* is set to `partition` .
     */
    public fun partitionCount(partitionCount: Number)

    /**
     * @param spreadLevel Determines how placement groups spread instances.
     * * Host – You can use `host` only with Outpost placement groups.
     * * Rack – No usage restrictions.
     */
    public fun spreadLevel(spreadLevel: String)

    /**
     * @param strategy The placement strategy.
     */
    public fun strategy(strategy: String)

    /**
     * @param tags The tags to apply to the new placement group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to apply to the new placement group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnPlacementGroupProps.Builder =
        software.amazon.awscdk.services.ec2.CfnPlacementGroupProps.builder()

    /**
     * @param partitionCount The number of partitions.
     * Valid only when *Strategy* is set to `partition` .
     */
    override fun partitionCount(partitionCount: Number) {
      cdkBuilder.partitionCount(partitionCount)
    }

    /**
     * @param spreadLevel Determines how placement groups spread instances.
     * * Host – You can use `host` only with Outpost placement groups.
     * * Rack – No usage restrictions.
     */
    override fun spreadLevel(spreadLevel: String) {
      cdkBuilder.spreadLevel(spreadLevel)
    }

    /**
     * @param strategy The placement strategy.
     */
    override fun strategy(strategy: String) {
      cdkBuilder.strategy(strategy)
    }

    /**
     * @param tags The tags to apply to the new placement group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to apply to the new placement group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnPlacementGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnPlacementGroupProps,
  ) : CdkObject(cdkObject), CfnPlacementGroupProps {
    /**
     * The number of partitions.
     *
     * Valid only when *Strategy* is set to `partition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-partitioncount)
     */
    override fun partitionCount(): Number? = unwrap(this).getPartitionCount()

    /**
     * Determines how placement groups spread instances.
     *
     * * Host – You can use `host` only with Outpost placement groups.
     * * Rack – No usage restrictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-spreadlevel)
     */
    override fun spreadLevel(): String? = unwrap(this).getSpreadLevel()

    /**
     * The placement strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-strategy)
     */
    override fun strategy(): String? = unwrap(this).getStrategy()

    /**
     * The tags to apply to the new placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlacementGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnPlacementGroupProps):
        CfnPlacementGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPlacementGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlacementGroupProps):
        software.amazon.awscdk.services.ec2.CfnPlacementGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnPlacementGroupProps
  }
}
