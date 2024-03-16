@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnNetworkInsightsAccessScope`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkInsightsAccessScopeProps cfnNetworkInsightsAccessScopeProps =
 * CfnNetworkInsightsAccessScopeProps.builder()
 * .excludePaths(List.of(AccessScopePathRequestProperty.builder()
 * .destination(PathStatementRequestProperty.builder()
 * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
 * .destinationAddresses(List.of("destinationAddresses"))
 * .destinationPorts(List.of("destinationPorts"))
 * .destinationPrefixLists(List.of("destinationPrefixLists"))
 * .protocols(List.of("protocols"))
 * .sourceAddresses(List.of("sourceAddresses"))
 * .sourcePorts(List.of("sourcePorts"))
 * .sourcePrefixLists(List.of("sourcePrefixLists"))
 * .build())
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build())
 * .source(PathStatementRequestProperty.builder()
 * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
 * .destinationAddresses(List.of("destinationAddresses"))
 * .destinationPorts(List.of("destinationPorts"))
 * .destinationPrefixLists(List.of("destinationPrefixLists"))
 * .protocols(List.of("protocols"))
 * .sourceAddresses(List.of("sourceAddresses"))
 * .sourcePorts(List.of("sourcePorts"))
 * .sourcePrefixLists(List.of("sourcePrefixLists"))
 * .build())
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build())
 * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build()))
 * .build()))
 * .matchPaths(List.of(AccessScopePathRequestProperty.builder()
 * .destination(PathStatementRequestProperty.builder()
 * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
 * .destinationAddresses(List.of("destinationAddresses"))
 * .destinationPorts(List.of("destinationPorts"))
 * .destinationPrefixLists(List.of("destinationPrefixLists"))
 * .protocols(List.of("protocols"))
 * .sourceAddresses(List.of("sourceAddresses"))
 * .sourcePorts(List.of("sourcePorts"))
 * .sourcePrefixLists(List.of("sourcePrefixLists"))
 * .build())
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build())
 * .source(PathStatementRequestProperty.builder()
 * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
 * .destinationAddresses(List.of("destinationAddresses"))
 * .destinationPorts(List.of("destinationPorts"))
 * .destinationPrefixLists(List.of("destinationPrefixLists"))
 * .protocols(List.of("protocols"))
 * .sourceAddresses(List.of("sourceAddresses"))
 * .sourcePorts(List.of("sourcePorts"))
 * .sourcePrefixLists(List.of("sourcePrefixLists"))
 * .build())
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build())
 * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build()))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html)
 */
public interface CfnNetworkInsightsAccessScopeProps {
  /**
   * The paths to exclude.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
   */
  public fun excludePaths(): Any? = unwrap(this).getExcludePaths()

  /**
   * The paths to match.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
   */
  public fun matchPaths(): Any? = unwrap(this).getMatchPaths()

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnNetworkInsightsAccessScopeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param excludePaths The paths to exclude.
     */
    public fun excludePaths(excludePaths: IResolvable)

    /**
     * @param excludePaths The paths to exclude.
     */
    public fun excludePaths(excludePaths: List<Any>)

    /**
     * @param excludePaths The paths to exclude.
     */
    public fun excludePaths(vararg excludePaths: Any)

    /**
     * @param matchPaths The paths to match.
     */
    public fun matchPaths(matchPaths: IResolvable)

    /**
     * @param matchPaths The paths to match.
     */
    public fun matchPaths(matchPaths: List<Any>)

    /**
     * @param matchPaths The paths to match.
     */
    public fun matchPaths(vararg matchPaths: Any)

    /**
     * @param tags The tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps.builder()

    /**
     * @param excludePaths The paths to exclude.
     */
    override fun excludePaths(excludePaths: IResolvable) {
      cdkBuilder.excludePaths(excludePaths.let(IResolvable::unwrap))
    }

    /**
     * @param excludePaths The paths to exclude.
     */
    override fun excludePaths(excludePaths: List<Any>) {
      cdkBuilder.excludePaths(excludePaths)
    }

    /**
     * @param excludePaths The paths to exclude.
     */
    override fun excludePaths(vararg excludePaths: Any): Unit = excludePaths(excludePaths.toList())

    /**
     * @param matchPaths The paths to match.
     */
    override fun matchPaths(matchPaths: IResolvable) {
      cdkBuilder.matchPaths(matchPaths.let(IResolvable::unwrap))
    }

    /**
     * @param matchPaths The paths to match.
     */
    override fun matchPaths(matchPaths: List<Any>) {
      cdkBuilder.matchPaths(matchPaths)
    }

    /**
     * @param matchPaths The paths to match.
     */
    override fun matchPaths(vararg matchPaths: Any): Unit = matchPaths(matchPaths.toList())

    /**
     * @param tags The tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps,
  ) : CdkObject(cdkObject), CfnNetworkInsightsAccessScopeProps {
    /**
     * The paths to exclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
     */
    override fun excludePaths(): Any? = unwrap(this).getExcludePaths()

    /**
     * The paths to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
     */
    override fun matchPaths(): Any? = unwrap(this).getMatchPaths()

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInsightsAccessScopeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps):
        CfnNetworkInsightsAccessScopeProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnNetworkInsightsAccessScopeProps

    internal fun unwrap(wrapped: CfnNetworkInsightsAccessScopeProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps
  }
}
