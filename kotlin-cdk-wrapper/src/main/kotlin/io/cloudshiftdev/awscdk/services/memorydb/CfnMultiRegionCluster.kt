@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a multi-Region cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.memorydb.*;
 * CfnMultiRegionCluster cfnMultiRegionCluster = CfnMultiRegionCluster.Builder.create(this,
 * "MyCfnMultiRegionCluster")
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
public open class CfnMultiRegionCluster(
  cdkObject: software.amazon.awscdk.services.memorydb.CfnMultiRegionCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMultiRegionClusterProps,
  ) :
      this(software.amazon.awscdk.services.memorydb.CfnMultiRegionCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMultiRegionClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMultiRegionClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMultiRegionClusterProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the multi-Region cluster.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the multi-Region cluster.
   */
  public open fun attrMultiRegionClusterName(): String =
      unwrap(this).getAttrMultiRegionClusterName()

  /**
   * The current status of the multi-Region cluster.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the multi-Region cluster.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the multi-Region cluster.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the engine used by the multi-Region cluster.
   */
  public open fun engine(): String? = unwrap(this).getEngine()

  /**
   * The name of the engine used by the multi-Region cluster.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  /**
   * The version of the engine used by the multi-Region cluster.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The version of the engine used by the multi-Region cluster.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the Multi Region cluster.
   */
  public open fun multiRegionClusterNameSuffix(): String? =
      unwrap(this).getMultiRegionClusterNameSuffix()

  /**
   * The name of the Multi Region cluster.
   */
  public open fun multiRegionClusterNameSuffix(`value`: String) {
    unwrap(this).setMultiRegionClusterNameSuffix(`value`)
  }

  /**
   * The name of the multi-Region parameter group associated with the cluster.
   */
  public open fun multiRegionParameterGroupName(): String? =
      unwrap(this).getMultiRegionParameterGroupName()

  /**
   * The name of the multi-Region parameter group associated with the cluster.
   */
  public open fun multiRegionParameterGroupName(`value`: String) {
    unwrap(this).setMultiRegionParameterGroupName(`value`)
  }

  /**
   * The node type used by the multi-Region cluster.
   */
  public open fun nodeType(): String = unwrap(this).getNodeType()

  /**
   * The node type used by the multi-Region cluster.
   */
  public open fun nodeType(`value`: String) {
    unwrap(this).setNodeType(`value`)
  }

  /**
   * The number of shards the multi region cluster will contain.
   */
  public open fun numShards(): Number? = unwrap(this).getNumShards()

  /**
   * The number of shards the multi region cluster will contain.
   */
  public open fun numShards(`value`: Number) {
    unwrap(this).setNumShards(`value`)
  }

  /**
   * An array of key-value pairs to apply to this multi region cluster.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this multi region cluster.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this multi region cluster.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Indiciates if the multi-Region cluster is TLS enabled.
   */
  public open fun tlsEnabled(): Any? = unwrap(this).getTlsEnabled()

  /**
   * Indiciates if the multi-Region cluster is TLS enabled.
   */
  public open fun tlsEnabled(`value`: Boolean) {
    unwrap(this).setTlsEnabled(`value`)
  }

  /**
   * Indiciates if the multi-Region cluster is TLS enabled.
   */
  public open fun tlsEnabled(`value`: IResolvable) {
    unwrap(this).setTlsEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An enum string value that determines the update strategy for scaling.
   */
  public open fun updateStrategy(): String? = unwrap(this).getUpdateStrategy()

  /**
   * An enum string value that determines the update strategy for scaling.
   */
  public open fun updateStrategy(`value`: String) {
    unwrap(this).setUpdateStrategy(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.memorydb.CfnMultiRegionCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-description)
     * @param description The description of the multi-Region cluster. 
     */
    public fun description(description: String)

    /**
     * The name of the engine used by the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-engine)
     * @param engine The name of the engine used by the multi-Region cluster. 
     */
    public fun engine(engine: String)

    /**
     * The version of the engine used by the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-engineversion)
     * @param engineVersion The version of the engine used by the multi-Region cluster. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * The name of the Multi Region cluster.
     *
     * This value must be unique as it also serves as the multi region cluster identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-multiregionclusternamesuffix)
     * @param multiRegionClusterNameSuffix The name of the Multi Region cluster. 
     */
    public fun multiRegionClusterNameSuffix(multiRegionClusterNameSuffix: String)

    /**
     * The name of the multi-Region parameter group associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-multiregionparametergroupname)
     * @param multiRegionParameterGroupName The name of the multi-Region parameter group associated
     * with the cluster. 
     */
    public fun multiRegionParameterGroupName(multiRegionParameterGroupName: String)

    /**
     * The node type used by the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-nodetype)
     * @param nodeType The node type used by the multi-Region cluster. 
     */
    public fun nodeType(nodeType: String)

    /**
     * The number of shards the multi region cluster will contain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-numshards)
     * @param numShards The number of shards the multi region cluster will contain. 
     */
    public fun numShards(numShards: Number)

    /**
     * An array of key-value pairs to apply to this multi region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tags)
     * @param tags An array of key-value pairs to apply to this multi region cluster. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this multi region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tags)
     * @param tags An array of key-value pairs to apply to this multi region cluster. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Indiciates if the multi-Region cluster is TLS enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tlsenabled)
     * @param tlsEnabled Indiciates if the multi-Region cluster is TLS enabled. 
     */
    public fun tlsEnabled(tlsEnabled: Boolean)

    /**
     * Indiciates if the multi-Region cluster is TLS enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tlsenabled)
     * @param tlsEnabled Indiciates if the multi-Region cluster is TLS enabled. 
     */
    public fun tlsEnabled(tlsEnabled: IResolvable)

    /**
     * An enum string value that determines the update strategy for scaling.
     *
     * Possible values are 'COORDINATED' and 'UNCOORDINATED'. Default is 'COORDINATED'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-updatestrategy)
     * @param updateStrategy An enum string value that determines the update strategy for scaling. 
     */
    public fun updateStrategy(updateStrategy: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnMultiRegionCluster.Builder =
        software.amazon.awscdk.services.memorydb.CfnMultiRegionCluster.Builder.create(scope, id)

    /**
     * The description of the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-description)
     * @param description The description of the multi-Region cluster. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the engine used by the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-engine)
     * @param engine The name of the engine used by the multi-Region cluster. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * The version of the engine used by the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-engineversion)
     * @param engineVersion The version of the engine used by the multi-Region cluster. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The name of the Multi Region cluster.
     *
     * This value must be unique as it also serves as the multi region cluster identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-multiregionclusternamesuffix)
     * @param multiRegionClusterNameSuffix The name of the Multi Region cluster. 
     */
    override fun multiRegionClusterNameSuffix(multiRegionClusterNameSuffix: String) {
      cdkBuilder.multiRegionClusterNameSuffix(multiRegionClusterNameSuffix)
    }

    /**
     * The name of the multi-Region parameter group associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-multiregionparametergroupname)
     * @param multiRegionParameterGroupName The name of the multi-Region parameter group associated
     * with the cluster. 
     */
    override fun multiRegionParameterGroupName(multiRegionParameterGroupName: String) {
      cdkBuilder.multiRegionParameterGroupName(multiRegionParameterGroupName)
    }

    /**
     * The node type used by the multi-Region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-nodetype)
     * @param nodeType The node type used by the multi-Region cluster. 
     */
    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    /**
     * The number of shards the multi region cluster will contain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-numshards)
     * @param numShards The number of shards the multi region cluster will contain. 
     */
    override fun numShards(numShards: Number) {
      cdkBuilder.numShards(numShards)
    }

    /**
     * An array of key-value pairs to apply to this multi region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tags)
     * @param tags An array of key-value pairs to apply to this multi region cluster. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this multi region cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tags)
     * @param tags An array of key-value pairs to apply to this multi region cluster. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Indiciates if the multi-Region cluster is TLS enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tlsenabled)
     * @param tlsEnabled Indiciates if the multi-Region cluster is TLS enabled. 
     */
    override fun tlsEnabled(tlsEnabled: Boolean) {
      cdkBuilder.tlsEnabled(tlsEnabled)
    }

    /**
     * Indiciates if the multi-Region cluster is TLS enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-tlsenabled)
     * @param tlsEnabled Indiciates if the multi-Region cluster is TLS enabled. 
     */
    override fun tlsEnabled(tlsEnabled: IResolvable) {
      cdkBuilder.tlsEnabled(tlsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * An enum string value that determines the update strategy for scaling.
     *
     * Possible values are 'COORDINATED' and 'UNCOORDINATED'. Default is 'COORDINATED'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-multiregioncluster.html#cfn-memorydb-multiregioncluster-updatestrategy)
     * @param updateStrategy An enum string value that determines the update strategy for scaling. 
     */
    override fun updateStrategy(updateStrategy: String) {
      cdkBuilder.updateStrategy(updateStrategy)
    }

    public fun build(): software.amazon.awscdk.services.memorydb.CfnMultiRegionCluster =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.memorydb.CfnMultiRegionCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMultiRegionCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMultiRegionCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnMultiRegionCluster):
        CfnMultiRegionCluster = CfnMultiRegionCluster(cdkObject)

    internal fun unwrap(wrapped: CfnMultiRegionCluster):
        software.amazon.awscdk.services.memorydb.CfnMultiRegionCluster = wrapped.cdkObject as
        software.amazon.awscdk.services.memorydb.CfnMultiRegionCluster
  }
}
