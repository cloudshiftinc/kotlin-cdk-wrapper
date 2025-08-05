@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMultiRegionCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.memorydb.*;
 * CfnMultiRegionClusterProps cfnMultiRegionClusterProps = CfnMultiRegionClusterProps.builder()
 * .nodeType("nodeType")
 * // the properties below are optional
 * .description("description")
 * .engine("engine")
 * .engineVersion("engineVersion")
 * .multiRegionClusterNameSuffix("multiRegionClusterNameSuffix")
 * .multiRegionParameterGroupName("multiRegionParameterGroupName")
 * .numShards(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tlsEnabled(false)
 * .updateStrategy("updateStrategy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html)
 */
public interface CfnMultiRegionClusterProps {
  /**
   * The description of the multi-Region cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the engine used by the multi-Region cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-engine)
   */
  public fun engine(): String? = unwrap(this).getEngine()

  /**
   * The version of the engine used by the multi-Region cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * A suffix to be added to the Multi-Region cluster name.
   *
   * Amazon MemoryDB automatically applies a prefix to the Multi-Region cluster Name when it is
   * created. Each Amazon Region has its own prefix. For instance, a Multi-Region cluster Name created
   * in the US-West-1 region will begin with "virxk", along with the suffix name you provide. The
   * suffix guarantees uniqueness of the Multi-Region cluster name across multiple regions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-multiregionclusternamesuffix)
   */
  public fun multiRegionClusterNameSuffix(): String? =
      unwrap(this).getMultiRegionClusterNameSuffix()

  /**
   * The name of the multi-Region parameter group associated with the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-multiregionparametergroupname)
   */
  public fun multiRegionParameterGroupName(): String? =
      unwrap(this).getMultiRegionParameterGroupName()

  /**
   * The node type used by the multi-Region cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-nodetype)
   */
  public fun nodeType(): String

  /**
   * The number of shards in the multi-Region cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-numshards)
   */
  public fun numShards(): Number? = unwrap(this).getNumShards()

  /**
   * A list of tags to be applied to the multi-Region cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Indiciates if the multi-Region cluster is TLS enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tlsenabled)
   */
  public fun tlsEnabled(): Any? = unwrap(this).getTlsEnabled()

  /**
   * The strategy to use for the update operation.
   *
   * Supported values are "coordinated" or "uncoordinated".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-updatestrategy)
   */
  public fun updateStrategy(): String? = unwrap(this).getUpdateStrategy()

  /**
   * A builder for [CfnMultiRegionClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the multi-Region cluster.
     */
    public fun description(description: String)

    /**
     * @param engine The name of the engine used by the multi-Region cluster.
     */
    public fun engine(engine: String)

    /**
     * @param engineVersion The version of the engine used by the multi-Region cluster.
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param multiRegionClusterNameSuffix A suffix to be added to the Multi-Region cluster name.
     * Amazon MemoryDB automatically applies a prefix to the Multi-Region cluster Name when it is
     * created. Each Amazon Region has its own prefix. For instance, a Multi-Region cluster Name
     * created in the US-West-1 region will begin with "virxk", along with the suffix name you provide.
     * The suffix guarantees uniqueness of the Multi-Region cluster name across multiple regions.
     */
    public fun multiRegionClusterNameSuffix(multiRegionClusterNameSuffix: String)

    /**
     * @param multiRegionParameterGroupName The name of the multi-Region parameter group associated
     * with the cluster.
     */
    public fun multiRegionParameterGroupName(multiRegionParameterGroupName: String)

    /**
     * @param nodeType The node type used by the multi-Region cluster. 
     */
    public fun nodeType(nodeType: String)

    /**
     * @param numShards The number of shards in the multi-Region cluster.
     */
    public fun numShards(numShards: Number)

    /**
     * @param tags A list of tags to be applied to the multi-Region cluster.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to be applied to the multi-Region cluster.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tlsEnabled Indiciates if the multi-Region cluster is TLS enabled.
     */
    public fun tlsEnabled(tlsEnabled: Boolean)

    /**
     * @param tlsEnabled Indiciates if the multi-Region cluster is TLS enabled.
     */
    public fun tlsEnabled(tlsEnabled: IResolvable)

    /**
     * @param updateStrategy The strategy to use for the update operation.
     * Supported values are "coordinated" or "uncoordinated".
     */
    public fun updateStrategy(updateStrategy: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.memorydb.CfnMultiRegionClusterProps.Builder =
        software.amazon.awscdk.services.memorydb.CfnMultiRegionClusterProps.builder()

    /**
     * @param description The description of the multi-Region cluster.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engine The name of the engine used by the multi-Region cluster.
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param engineVersion The version of the engine used by the multi-Region cluster.
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param multiRegionClusterNameSuffix A suffix to be added to the Multi-Region cluster name.
     * Amazon MemoryDB automatically applies a prefix to the Multi-Region cluster Name when it is
     * created. Each Amazon Region has its own prefix. For instance, a Multi-Region cluster Name
     * created in the US-West-1 region will begin with "virxk", along with the suffix name you provide.
     * The suffix guarantees uniqueness of the Multi-Region cluster name across multiple regions.
     */
    override fun multiRegionClusterNameSuffix(multiRegionClusterNameSuffix: String) {
      cdkBuilder.multiRegionClusterNameSuffix(multiRegionClusterNameSuffix)
    }

    /**
     * @param multiRegionParameterGroupName The name of the multi-Region parameter group associated
     * with the cluster.
     */
    override fun multiRegionParameterGroupName(multiRegionParameterGroupName: String) {
      cdkBuilder.multiRegionParameterGroupName(multiRegionParameterGroupName)
    }

    /**
     * @param nodeType The node type used by the multi-Region cluster. 
     */
    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    /**
     * @param numShards The number of shards in the multi-Region cluster.
     */
    override fun numShards(numShards: Number) {
      cdkBuilder.numShards(numShards)
    }

    /**
     * @param tags A list of tags to be applied to the multi-Region cluster.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags to be applied to the multi-Region cluster.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tlsEnabled Indiciates if the multi-Region cluster is TLS enabled.
     */
    override fun tlsEnabled(tlsEnabled: Boolean) {
      cdkBuilder.tlsEnabled(tlsEnabled)
    }

    /**
     * @param tlsEnabled Indiciates if the multi-Region cluster is TLS enabled.
     */
    override fun tlsEnabled(tlsEnabled: IResolvable) {
      cdkBuilder.tlsEnabled(tlsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param updateStrategy The strategy to use for the update operation.
     * Supported values are "coordinated" or "uncoordinated".
     */
    override fun updateStrategy(updateStrategy: String) {
      cdkBuilder.updateStrategy(updateStrategy)
    }

    public fun build(): software.amazon.awscdk.services.memorydb.CfnMultiRegionClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.memorydb.CfnMultiRegionClusterProps,
  ) : CdkObject(cdkObject),
      CfnMultiRegionClusterProps {
    /**
     * The description of the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the engine used by the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-engine)
     */
    override fun engine(): String? = unwrap(this).getEngine()

    /**
     * The version of the engine used by the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * A suffix to be added to the Multi-Region cluster name.
     *
     * Amazon MemoryDB automatically applies a prefix to the Multi-Region cluster Name when it is
     * created. Each Amazon Region has its own prefix. For instance, a Multi-Region cluster Name
     * created in the US-West-1 region will begin with "virxk", along with the suffix name you provide.
     * The suffix guarantees uniqueness of the Multi-Region cluster name across multiple regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-multiregionclusternamesuffix)
     */
    override fun multiRegionClusterNameSuffix(): String? =
        unwrap(this).getMultiRegionClusterNameSuffix()

    /**
     * The name of the multi-Region parameter group associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-multiregionparametergroupname)
     */
    override fun multiRegionParameterGroupName(): String? =
        unwrap(this).getMultiRegionParameterGroupName()

    /**
     * The node type used by the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-nodetype)
     */
    override fun nodeType(): String = unwrap(this).getNodeType()

    /**
     * The number of shards in the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-numshards)
     */
    override fun numShards(): Number? = unwrap(this).getNumShards()

    /**
     * A list of tags to be applied to the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Indiciates if the multi-Region cluster is TLS enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tlsenabled)
     */
    override fun tlsEnabled(): Any? = unwrap(this).getTlsEnabled()

    /**
     * The strategy to use for the update operation.
     *
     * Supported values are "coordinated" or "uncoordinated".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-updatestrategy)
     */
    override fun updateStrategy(): String? = unwrap(this).getUpdateStrategy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMultiRegionClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnMultiRegionClusterProps):
        CfnMultiRegionClusterProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMultiRegionClusterProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMultiRegionClusterProps):
        software.amazon.awscdk.services.memorydb.CfnMultiRegionClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.memorydb.CfnMultiRegionClusterProps
  }
}
