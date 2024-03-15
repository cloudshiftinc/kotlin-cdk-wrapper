@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptunegraph

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * The `AWS ::NeptuneGraph::Graph` resource creates an  graph.
 *
 * is a memory-optimized graph database engine for analytics. For more information, see
 * [](https://docs.aws.amazon.com/neptune-analytics/latest/userguide/what-is-neptune-analytics.html) .
 *
 * You can use `AWS ::NeptuneGraph::Graph.DeletionProtection` to help guard against unintended
 * deletion of your graph.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.neptunegraph.*;
 * CfnGraph cfnGraph = CfnGraph.Builder.create(this, "MyCfnGraph")
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
public open class CfnGraph internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.neptunegraph.CfnGraph,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The connection endpoint for the graph.
   *
   * For example: `g-12a3bcdef4.us-east-1.neptune-graph.amazonaws.com`
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   * The ARN of the graph.
   *
   * For example: `arn:aws:neptune-graph:us-east-1:111122223333:graph/g-12a3bcdef4`
   */
  public open fun attrGraphArn(): String = unwrap(this).getAttrGraphArn()

  /**
   * The ID of the graph.
   *
   * For example: `g-12a3bcdef4`
   */
  public open fun attrGraphId(): String = unwrap(this).getAttrGraphId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A value that indicates whether the graph has deletion protection enabled.
   */
  public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * A value that indicates whether the graph has deletion protection enabled.
   */
  public open fun deletionProtection(`value`: Boolean) {
    unwrap(this).setDeletionProtection(`value`)
  }

  /**
   * A value that indicates whether the graph has deletion protection enabled.
   */
  public open fun deletionProtection(`value`: IResolvable) {
    unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
  }

  /**
   * The graph name.
   *
   * For example: `my-graph-1` .
   */
  public open fun graphName(): String? = unwrap(this).getGraphName()

  /**
   * The graph name.
   *
   * For example: `my-graph-1` .
   */
  public open fun graphName(`value`: String) {
    unwrap(this).setGraphName(`value`)
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
   * The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to use for the graph.
   */
  public open fun provisionedMemory(): Number = unwrap(this).getProvisionedMemory()

  /**
   * The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to use for the graph.
   */
  public open fun provisionedMemory(`value`: Number) {
    unwrap(this).setProvisionedMemory(`value`)
  }

  /**
   * Specifies whether or not the graph can be reachable over the internet.
   *
   * All access to graphs is IAM authenticated.
   */
  public open fun publicConnectivity(): Any? = unwrap(this).getPublicConnectivity()

  /**
   * Specifies whether or not the graph can be reachable over the internet.
   *
   * All access to graphs is IAM authenticated.
   */
  public open fun publicConnectivity(`value`: Boolean) {
    unwrap(this).setPublicConnectivity(`value`)
  }

  /**
   * Specifies whether or not the graph can be reachable over the internet.
   *
   * All access to graphs is IAM authenticated.
   */
  public open fun publicConnectivity(`value`: IResolvable) {
    unwrap(this).setPublicConnectivity(`value`.let(IResolvable::unwrap))
  }

  /**
   * The number of replicas in other AZs.
   */
  public open fun replicaCount(): Number? = unwrap(this).getReplicaCount()

  /**
   * The number of replicas in other AZs.
   */
  public open fun replicaCount(`value`: Number) {
    unwrap(this).setReplicaCount(`value`)
  }

  /**
   * Adds metadata tags to the new graph.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Adds metadata tags to the new graph.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Adds metadata tags to the new graph.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
   */
  public open fun vectorSearchConfiguration(): Any? = unwrap(this).getVectorSearchConfiguration()

  /**
   * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
   */
  public open fun vectorSearchConfiguration(`value`: IResolvable) {
    unwrap(this).setVectorSearchConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
   */
  public open fun vectorSearchConfiguration(`value`: VectorSearchConfigurationProperty) {
    unwrap(this).setVectorSearchConfiguration(`value`.let(VectorSearchConfigurationProperty::unwrap))
  }

  /**
   * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2db39964ab84f6aa24fd8c7b54bb139ca19a50016d6fd12c994462707ed7f2dc")
  public open
      fun vectorSearchConfiguration(`value`: VectorSearchConfigurationProperty.Builder.() -> Unit):
      Unit = vectorSearchConfiguration(VectorSearchConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.neptunegraph.CfnGraph].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A value that indicates whether the graph has deletion protection enabled.
     *
     * The graph can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-deletionprotection)
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     * enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * A value that indicates whether the graph has deletion protection enabled.
     *
     * The graph can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-deletionprotection)
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     * enabled. 
     */
    public fun deletionProtection(deletionProtection: IResolvable)

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
     * @param graphName The graph name. For example: `my-graph-1` . 
     */
    public fun graphName(graphName: String)

    /**
     * The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to use for the graph.
     *
     * Min = 128
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-provisionedmemory)
     * @param provisionedMemory The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to
     * use for the graph. 
     */
    public fun provisionedMemory(provisionedMemory: Number)

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
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     * internet. All access to graphs is IAM authenticated. 
     */
    public fun publicConnectivity(publicConnectivity: Boolean)

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
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     * internet. All access to graphs is IAM authenticated. 
     */
    public fun publicConnectivity(publicConnectivity: IResolvable)

    /**
     * The number of replicas in other AZs.
     *
     * Default: If not specified, the default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-replicacount)
     * @param replicaCount The number of replicas in other AZs. 
     */
    public fun replicaCount(replicaCount: Number)

    /**
     * Adds metadata tags to the new graph.
     *
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-tags)
     * @param tags Adds metadata tags to the new graph. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Adds metadata tags to the new graph.
     *
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-tags)
     * @param tags Adds metadata tags to the new graph. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
     *
     * The value is specified as `dimension=` value. Max = 65,535
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-vectorsearchconfiguration)
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph. 
     */
    public fun vectorSearchConfiguration(vectorSearchConfiguration: IResolvable)

    /**
     * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
     *
     * The value is specified as `dimension=` value. Max = 65,535
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-vectorsearchconfiguration)
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph. 
     */
    public
        fun vectorSearchConfiguration(vectorSearchConfiguration: VectorSearchConfigurationProperty)

    /**
     * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
     *
     * The value is specified as `dimension=` value. Max = 65,535
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-vectorsearchconfiguration)
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a50c47a0fd99d77a3af008b1f03bfbbc900276e2bb178564f91fb0b023d353b")
    public
        fun vectorSearchConfiguration(vectorSearchConfiguration: VectorSearchConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptunegraph.CfnGraph.Builder =
        software.amazon.awscdk.services.neptunegraph.CfnGraph.Builder.create(scope, id)

    /**
     * A value that indicates whether the graph has deletion protection enabled.
     *
     * The graph can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-deletionprotection)
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     * enabled. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * A value that indicates whether the graph has deletion protection enabled.
     *
     * The graph can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-deletionprotection)
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     * enabled. 
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

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
     * @param graphName The graph name. For example: `my-graph-1` . 
     */
    override fun graphName(graphName: String) {
      cdkBuilder.graphName(graphName)
    }

    /**
     * The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to use for the graph.
     *
     * Min = 128
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-provisionedmemory)
     * @param provisionedMemory The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to
     * use for the graph. 
     */
    override fun provisionedMemory(provisionedMemory: Number) {
      cdkBuilder.provisionedMemory(provisionedMemory)
    }

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
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     * internet. All access to graphs is IAM authenticated. 
     */
    override fun publicConnectivity(publicConnectivity: Boolean) {
      cdkBuilder.publicConnectivity(publicConnectivity)
    }

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
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     * internet. All access to graphs is IAM authenticated. 
     */
    override fun publicConnectivity(publicConnectivity: IResolvable) {
      cdkBuilder.publicConnectivity(publicConnectivity.let(IResolvable::unwrap))
    }

    /**
     * The number of replicas in other AZs.
     *
     * Default: If not specified, the default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-replicacount)
     * @param replicaCount The number of replicas in other AZs. 
     */
    override fun replicaCount(replicaCount: Number) {
      cdkBuilder.replicaCount(replicaCount)
    }

    /**
     * Adds metadata tags to the new graph.
     *
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-tags)
     * @param tags Adds metadata tags to the new graph. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Adds metadata tags to the new graph.
     *
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-tags)
     * @param tags Adds metadata tags to the new graph. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
     *
     * The value is specified as `dimension=` value. Max = 65,535
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-vectorsearchconfiguration)
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph. 
     */
    override fun vectorSearchConfiguration(vectorSearchConfiguration: IResolvable) {
      cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
     *
     * The value is specified as `dimension=` value. Max = 65,535
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-vectorsearchconfiguration)
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph. 
     */
    override
        fun vectorSearchConfiguration(vectorSearchConfiguration: VectorSearchConfigurationProperty) {
      cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration.let(VectorSearchConfigurationProperty::unwrap))
    }

    /**
     * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
     *
     * The value is specified as `dimension=` value. Max = 65,535
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-vectorsearchconfiguration)
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     * that will be loaded into the graph. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a50c47a0fd99d77a3af008b1f03bfbbc900276e2bb178564f91fb0b023d353b")
    override
        fun vectorSearchConfiguration(vectorSearchConfiguration: VectorSearchConfigurationProperty.Builder.() -> Unit):
        Unit =
        vectorSearchConfiguration(VectorSearchConfigurationProperty(vectorSearchConfiguration))

    public fun build(): software.amazon.awscdk.services.neptunegraph.CfnGraph = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.neptunegraph.CfnGraph.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGraph {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGraph(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptunegraph.CfnGraph): CfnGraph =
        CfnGraph(cdkObject)

    internal fun unwrap(wrapped: CfnGraph): software.amazon.awscdk.services.neptunegraph.CfnGraph =
        wrapped.cdkObject
  }

  /**
   * The vector-search configuration for the graph, which specifies the vector dimension to use in
   * the vector index, if any.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.neptunegraph.*;
   * VectorSearchConfigurationProperty vectorSearchConfigurationProperty =
   * VectorSearchConfigurationProperty.builder()
   * .vectorSearchDimension(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptunegraph-graph-vectorsearchconfiguration.html)
   */
  public interface VectorSearchConfigurationProperty {
    /**
     * The number of dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptunegraph-graph-vectorsearchconfiguration.html#cfn-neptunegraph-graph-vectorsearchconfiguration-vectorsearchdimension)
     */
    public fun vectorSearchDimension(): Number

    /**
     * A builder for [VectorSearchConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vectorSearchDimension The number of dimensions. 
       */
      public fun vectorSearchDimension(vectorSearchDimension: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty.builder()

      /**
       * @param vectorSearchDimension The number of dimensions. 
       */
      override fun vectorSearchDimension(vectorSearchDimension: Number) {
        cdkBuilder.vectorSearchDimension(vectorSearchDimension)
      }

      public fun build():
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty,
    ) : CdkObject(cdkObject), VectorSearchConfigurationProperty {
      /**
       * The number of dimensions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptunegraph-graph-vectorsearchconfiguration.html#cfn-neptunegraph-graph-vectorsearchconfiguration-vectorsearchdimension)
       */
      override fun vectorSearchDimension(): Number = unwrap(this).getVectorSearchDimension()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VectorSearchConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty):
          VectorSearchConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VectorSearchConfigurationProperty):
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty
    }
  }
}
