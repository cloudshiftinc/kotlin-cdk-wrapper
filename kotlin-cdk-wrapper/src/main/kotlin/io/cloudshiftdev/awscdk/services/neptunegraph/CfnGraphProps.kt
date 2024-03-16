@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptunegraph

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
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnGraph`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.neptunegraph.*;
 * CfnGraphProps cfnGraphProps = CfnGraphProps.builder()
 * .provisionedMemory(123)
 * // the properties below are optional
 * .deletionProtection(false)
 * .graphName("graphName")
 * .publicConnectivity(false)
 * .replicaCount(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vectorSearchConfiguration(VectorSearchConfigurationProperty.builder()
 * .vectorSearchDimension(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html)
 */
public interface CfnGraphProps {
  /**
   * A value that indicates whether the graph has deletion protection enabled.
   *
   * The graph can't be deleted when deletion protection is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-deletionprotection)
   */
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * The graph name. For example: `my-graph-1` .
   *
   * The name must contain from 1 to 63 letters, numbers, or hyphens, and its first character must
   * be a letter. It cannot end with a hyphen or contain two consecutive hyphens.
   *
   * If you don't specify a graph name, a unique graph name is generated for you using the prefix
   * `graph-for` , followed by a combination of `Stack Name` and a `UUID` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-graphname)
   */
  public fun graphName(): String? = unwrap(this).getGraphName()

  /**
   * The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to use for the graph.
   *
   * Min = 128
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-provisionedmemory)
   */
  public fun provisionedMemory(): Number

  /**
   * Specifies whether or not the graph can be reachable over the internet. All access to graphs is
   * IAM authenticated.
   *
   * When the graph is publicly available, its domain name system (DNS) endpoint resolves to the
   * public IP address from the internet. When the graph isn't publicly available, you need to create a
   * `PrivateGraphEndpoint` in a given VPC to ensure the DNS name resolves to a private IP address that
   * is reachable from the VPC.
   *
   * Default: If not specified, the default value is false.
   *
   *
   * If enabling public connectivity for the first time, there will be a delay while it is enabled.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-publicconnectivity)
   */
  public fun publicConnectivity(): Any? = unwrap(this).getPublicConnectivity()

  /**
   * The number of replicas in other AZs.
   *
   * Default: If not specified, the default value is 1.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-replicacount)
   */
  public fun replicaCount(): Number? = unwrap(this).getReplicaCount()

  /**
   * Adds metadata tags to the new graph.
   *
   * These tags can also be used with cost allocation reporting, or used in a Condition statement in
   * an IAM policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
   *
   * The value is specified as `dimension=` value. Max = 65,535
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-vectorsearchconfiguration)
   */
  public fun vectorSearchConfiguration(): Any? = unwrap(this).getVectorSearchConfiguration()

  /**
   * A builder for [CfnGraphProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     * enabled.
     * The graph can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     * enabled.
     * The graph can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * @param graphName The graph name. For example: `my-graph-1` .
     * The name must contain from 1 to 63 letters, numbers, or hyphens, and its first character must
     * be a letter. It cannot end with a hyphen or contain two consecutive hyphens.
     *
     * If you don't specify a graph name, a unique graph name is generated for you using the prefix
     * `graph-for` , followed by a combination of `Stack Name` and a `UUID` .
     */
    public fun graphName(graphName: String)

    /**
     * @param provisionedMemory The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to
     * use for the graph. 
     * Min = 128
     */
    public fun provisionedMemory(provisionedMemory: Number)

    /**
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     * internet. All access to graphs is IAM authenticated.
     * When the graph is publicly available, its domain name system (DNS) endpoint resolves to the
     * public IP address from the internet. When the graph isn't publicly available, you need to create
     * a `PrivateGraphEndpoint` in a given VPC to ensure the DNS name resolves to a private IP address
     * that is reachable from the VPC.
     *
     * Default: If not specified, the default value is false.
     *
     *
     * If enabling public connectivity for the first time, there will be a delay while it is
     * enabled.
     */
    public fun publicConnectivity(publicConnectivity: Boolean)

    /**
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     * internet. All access to graphs is IAM authenticated.
     * When the graph is publicly available, its domain name system (DNS) endpoint resolves to the
     * public IP address from the internet. When the graph isn't publicly available, you need to create
     * a `PrivateGraphEndpoint` in a given VPC to ensure the DNS name resolves to a private IP address
     * that is reachable from the VPC.
     *
     * Default: If not specified, the default value is false.
     *
     *
     * If enabling public connectivity for the first time, there will be a delay while it is
     * enabled.
     */
    public fun publicConnectivity(publicConnectivity: IResolvable)

    /**
     * @param replicaCount The number of replicas in other AZs.
     * Default: If not specified, the default value is 1.
     */
    public fun replicaCount(replicaCount: Number)

    /**
     * @param tags Adds metadata tags to the new graph.
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Adds metadata tags to the new graph.
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph.
     * The value is specified as `dimension=` value. Max = 65,535
     */
    public fun vectorSearchConfiguration(vectorSearchConfiguration: IResolvable)

    /**
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph.
     * The value is specified as `dimension=` value. Max = 65,535
     */
    public
        fun vectorSearchConfiguration(vectorSearchConfiguration: CfnGraph.VectorSearchConfigurationProperty)

    /**
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph.
     * The value is specified as `dimension=` value. Max = 65,535
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a56aa0b385969cca92d1ec6d1384ddbb35eddf7fe74f0dba03fd40d9e449c4c")
    public
        fun vectorSearchConfiguration(vectorSearchConfiguration: CfnGraph.VectorSearchConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptunegraph.CfnGraphProps.Builder =
        software.amazon.awscdk.services.neptunegraph.CfnGraphProps.builder()

    /**
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     * enabled.
     * The graph can't be deleted when deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     * enabled.
     * The graph can't be deleted when deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    /**
     * @param graphName The graph name. For example: `my-graph-1` .
     * The name must contain from 1 to 63 letters, numbers, or hyphens, and its first character must
     * be a letter. It cannot end with a hyphen or contain two consecutive hyphens.
     *
     * If you don't specify a graph name, a unique graph name is generated for you using the prefix
     * `graph-for` , followed by a combination of `Stack Name` and a `UUID` .
     */
    override fun graphName(graphName: String) {
      cdkBuilder.graphName(graphName)
    }

    /**
     * @param provisionedMemory The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to
     * use for the graph. 
     * Min = 128
     */
    override fun provisionedMemory(provisionedMemory: Number) {
      cdkBuilder.provisionedMemory(provisionedMemory)
    }

    /**
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     * internet. All access to graphs is IAM authenticated.
     * When the graph is publicly available, its domain name system (DNS) endpoint resolves to the
     * public IP address from the internet. When the graph isn't publicly available, you need to create
     * a `PrivateGraphEndpoint` in a given VPC to ensure the DNS name resolves to a private IP address
     * that is reachable from the VPC.
     *
     * Default: If not specified, the default value is false.
     *
     *
     * If enabling public connectivity for the first time, there will be a delay while it is
     * enabled.
     */
    override fun publicConnectivity(publicConnectivity: Boolean) {
      cdkBuilder.publicConnectivity(publicConnectivity)
    }

    /**
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     * internet. All access to graphs is IAM authenticated.
     * When the graph is publicly available, its domain name system (DNS) endpoint resolves to the
     * public IP address from the internet. When the graph isn't publicly available, you need to create
     * a `PrivateGraphEndpoint` in a given VPC to ensure the DNS name resolves to a private IP address
     * that is reachable from the VPC.
     *
     * Default: If not specified, the default value is false.
     *
     *
     * If enabling public connectivity for the first time, there will be a delay while it is
     * enabled.
     */
    override fun publicConnectivity(publicConnectivity: IResolvable) {
      cdkBuilder.publicConnectivity(publicConnectivity.let(IResolvable::unwrap))
    }

    /**
     * @param replicaCount The number of replicas in other AZs.
     * Default: If not specified, the default value is 1.
     */
    override fun replicaCount(replicaCount: Number) {
      cdkBuilder.replicaCount(replicaCount)
    }

    /**
     * @param tags Adds metadata tags to the new graph.
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Adds metadata tags to the new graph.
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph.
     * The value is specified as `dimension=` value. Max = 65,535
     */
    override fun vectorSearchConfiguration(vectorSearchConfiguration: IResolvable) {
      cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph.
     * The value is specified as `dimension=` value. Max = 65,535
     */
    override
        fun vectorSearchConfiguration(vectorSearchConfiguration: CfnGraph.VectorSearchConfigurationProperty) {
      cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration.let(CfnGraph.VectorSearchConfigurationProperty::unwrap))
    }

    /**
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph.
     * The value is specified as `dimension=` value. Max = 65,535
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a56aa0b385969cca92d1ec6d1384ddbb35eddf7fe74f0dba03fd40d9e449c4c")
    override
        fun vectorSearchConfiguration(vectorSearchConfiguration: CfnGraph.VectorSearchConfigurationProperty.Builder.() -> Unit):
        Unit =
        vectorSearchConfiguration(CfnGraph.VectorSearchConfigurationProperty(vectorSearchConfiguration))

    public fun build(): software.amazon.awscdk.services.neptunegraph.CfnGraphProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.neptunegraph.CfnGraphProps,
  ) : CdkObject(cdkObject), CfnGraphProps {
    /**
     * A value that indicates whether the graph has deletion protection enabled.
     *
     * The graph can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-deletionprotection)
     */
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    /**
     * The graph name. For example: `my-graph-1` .
     *
     * The name must contain from 1 to 63 letters, numbers, or hyphens, and its first character must
     * be a letter. It cannot end with a hyphen or contain two consecutive hyphens.
     *
     * If you don't specify a graph name, a unique graph name is generated for you using the prefix
     * `graph-for` , followed by a combination of `Stack Name` and a `UUID` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-graphname)
     */
    override fun graphName(): String? = unwrap(this).getGraphName()

    /**
     * The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to use for the graph.
     *
     * Min = 128
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-provisionedmemory)
     */
    override fun provisionedMemory(): Number = unwrap(this).getProvisionedMemory()

    /**
     * Specifies whether or not the graph can be reachable over the internet. All access to graphs
     * is IAM authenticated.
     *
     * When the graph is publicly available, its domain name system (DNS) endpoint resolves to the
     * public IP address from the internet. When the graph isn't publicly available, you need to create
     * a `PrivateGraphEndpoint` in a given VPC to ensure the DNS name resolves to a private IP address
     * that is reachable from the VPC.
     *
     * Default: If not specified, the default value is false.
     *
     *
     * If enabling public connectivity for the first time, there will be a delay while it is
     * enabled.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-publicconnectivity)
     */
    override fun publicConnectivity(): Any? = unwrap(this).getPublicConnectivity()

    /**
     * The number of replicas in other AZs.
     *
     * Default: If not specified, the default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-replicacount)
     */
    override fun replicaCount(): Number? = unwrap(this).getReplicaCount()

    /**
     * Adds metadata tags to the new graph.
     *
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
     *
     * The value is specified as `dimension=` value. Max = 65,535
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-vectorsearchconfiguration)
     */
    override fun vectorSearchConfiguration(): Any? = unwrap(this).getVectorSearchConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGraphProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptunegraph.CfnGraphProps):
        CfnGraphProps = CdkObjectWrappers.wrap(cdkObject) as CfnGraphProps

    internal fun unwrap(wrapped: CfnGraphProps):
        software.amazon.awscdk.services.neptunegraph.CfnGraphProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.neptunegraph.CfnGraphProps
  }
}
