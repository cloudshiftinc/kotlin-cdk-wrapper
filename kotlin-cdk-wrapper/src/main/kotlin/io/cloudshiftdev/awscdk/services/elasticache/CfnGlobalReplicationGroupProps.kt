@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

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
 * Properties for defining a `CfnGlobalReplicationGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnGlobalReplicationGroupProps cfnGlobalReplicationGroupProps =
 * CfnGlobalReplicationGroupProps.builder()
 * .members(List.of(GlobalReplicationGroupMemberProperty.builder()
 * .replicationGroupId("replicationGroupId")
 * .replicationGroupRegion("replicationGroupRegion")
 * .role("role")
 * .build()))
 * // the properties below are optional
 * .automaticFailoverEnabled(false)
 * .cacheNodeType("cacheNodeType")
 * .cacheParameterGroupName("cacheParameterGroupName")
 * .engine("engine")
 * .engineVersion("engineVersion")
 * .globalNodeGroupCount(123)
 * .globalReplicationGroupDescription("globalReplicationGroupDescription")
 * .globalReplicationGroupIdSuffix("globalReplicationGroupIdSuffix")
 * .regionalConfigurations(List.of(RegionalConfigurationProperty.builder()
 * .replicationGroupId("replicationGroupId")
 * .replicationGroupRegion("replicationGroupRegion")
 * .reshardingConfigurations(List.of(ReshardingConfigurationProperty.builder()
 * .nodeGroupId("nodeGroupId")
 * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html)
 */
public interface CfnGlobalReplicationGroupProps {
  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   *
   * `AutomaticFailoverEnabled` must be enabled for Valkey or Redis OSS (cluster mode enabled)
   * replication groups.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-automaticfailoverenabled)
   */
  public fun automaticFailoverEnabled(): Any? = unwrap(this).getAutomaticFailoverEnabled()

  /**
   * The cache node type of the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-cachenodetype)
   */
  public fun cacheNodeType(): String? = unwrap(this).getCacheNodeType()

  /**
   * The name of the cache parameter group to use with the Global datastore.
   *
   * It must be compatible with the major engine version used by the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-cacheparametergroupname)
   */
  public fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

  /**
   * The ElastiCache engine.
   *
   * For Valkey or Redis OSS only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-engine)
   */
  public fun engine(): String? = unwrap(this).getEngine()

  /**
   * The Elasticache Valkey or Redis OSS engine version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The number of node groups that comprise the Global Datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalnodegroupcount)
   */
  public fun globalNodeGroupCount(): Number? = unwrap(this).getGlobalNodeGroupCount()

  /**
   * The optional description of the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupdescription)
   */
  public fun globalReplicationGroupDescription(): String? =
      unwrap(this).getGlobalReplicationGroupDescription()

  /**
   * The suffix name of a Global Datastore.
   *
   * The suffix guarantees uniqueness of the Global Datastore name across multiple regions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupidsuffix)
   */
  public fun globalReplicationGroupIdSuffix(): String? =
      unwrap(this).getGlobalReplicationGroupIdSuffix()

  /**
   * The replication groups that comprise the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
   */
  public fun members(): Any

  /**
   * The Regions that comprise the Global Datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
   */
  public fun regionalConfigurations(): Any? = unwrap(this).getRegionalConfigurations()

  /**
   * A builder for [CfnGlobalReplicationGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails.
     * `AutomaticFailoverEnabled` must be enabled for Valkey or Redis OSS (cluster mode enabled)
     * replication groups.
     */
    public fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean)

    /**
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails.
     * `AutomaticFailoverEnabled` must be enabled for Valkey or Redis OSS (cluster mode enabled)
     * replication groups.
     */
    public fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable)

    /**
     * @param cacheNodeType The cache node type of the Global datastore.
     */
    public fun cacheNodeType(cacheNodeType: String)

    /**
     * @param cacheParameterGroupName The name of the cache parameter group to use with the Global
     * datastore.
     * It must be compatible with the major engine version used by the Global datastore.
     */
    public fun cacheParameterGroupName(cacheParameterGroupName: String)

    /**
     * @param engine The ElastiCache engine.
     * For Valkey or Redis OSS only.
     */
    public fun engine(engine: String)

    /**
     * @param engineVersion The Elasticache Valkey or Redis OSS engine version.
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param globalNodeGroupCount The number of node groups that comprise the Global Datastore.
     */
    public fun globalNodeGroupCount(globalNodeGroupCount: Number)

    /**
     * @param globalReplicationGroupDescription The optional description of the Global datastore.
     */
    public fun globalReplicationGroupDescription(globalReplicationGroupDescription: String)

    /**
     * @param globalReplicationGroupIdSuffix The suffix name of a Global Datastore.
     * The suffix guarantees uniqueness of the Global Datastore name across multiple regions.
     */
    public fun globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix: String)

    /**
     * @param members The replication groups that comprise the Global datastore. 
     */
    public fun members(members: IResolvable)

    /**
     * @param members The replication groups that comprise the Global datastore. 
     */
    public fun members(members: List<Any>)

    /**
     * @param members The replication groups that comprise the Global datastore. 
     */
    public fun members(vararg members: Any)

    /**
     * @param regionalConfigurations The Regions that comprise the Global Datastore.
     */
    public fun regionalConfigurations(regionalConfigurations: IResolvable)

    /**
     * @param regionalConfigurations The Regions that comprise the Global Datastore.
     */
    public fun regionalConfigurations(regionalConfigurations: List<Any>)

    /**
     * @param regionalConfigurations The Regions that comprise the Global Datastore.
     */
    public fun regionalConfigurations(vararg regionalConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps.builder()

    /**
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails.
     * `AutomaticFailoverEnabled` must be enabled for Valkey or Redis OSS (cluster mode enabled)
     * replication groups.
     */
    override fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean) {
      cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
    }

    /**
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails.
     * `AutomaticFailoverEnabled` must be enabled for Valkey or Redis OSS (cluster mode enabled)
     * replication groups.
     */
    override fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable) {
      cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cacheNodeType The cache node type of the Global datastore.
     */
    override fun cacheNodeType(cacheNodeType: String) {
      cdkBuilder.cacheNodeType(cacheNodeType)
    }

    /**
     * @param cacheParameterGroupName The name of the cache parameter group to use with the Global
     * datastore.
     * It must be compatible with the major engine version used by the Global datastore.
     */
    override fun cacheParameterGroupName(cacheParameterGroupName: String) {
      cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
    }

    /**
     * @param engine The ElastiCache engine.
     * For Valkey or Redis OSS only.
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param engineVersion The Elasticache Valkey or Redis OSS engine version.
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param globalNodeGroupCount The number of node groups that comprise the Global Datastore.
     */
    override fun globalNodeGroupCount(globalNodeGroupCount: Number) {
      cdkBuilder.globalNodeGroupCount(globalNodeGroupCount)
    }

    /**
     * @param globalReplicationGroupDescription The optional description of the Global datastore.
     */
    override fun globalReplicationGroupDescription(globalReplicationGroupDescription: String) {
      cdkBuilder.globalReplicationGroupDescription(globalReplicationGroupDescription)
    }

    /**
     * @param globalReplicationGroupIdSuffix The suffix name of a Global Datastore.
     * The suffix guarantees uniqueness of the Global Datastore name across multiple regions.
     */
    override fun globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix: String) {
      cdkBuilder.globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix)
    }

    /**
     * @param members The replication groups that comprise the Global datastore. 
     */
    override fun members(members: IResolvable) {
      cdkBuilder.members(members.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param members The replication groups that comprise the Global datastore. 
     */
    override fun members(members: List<Any>) {
      cdkBuilder.members(members.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param members The replication groups that comprise the Global datastore. 
     */
    override fun members(vararg members: Any): Unit = members(members.toList())

    /**
     * @param regionalConfigurations The Regions that comprise the Global Datastore.
     */
    override fun regionalConfigurations(regionalConfigurations: IResolvable) {
      cdkBuilder.regionalConfigurations(regionalConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param regionalConfigurations The Regions that comprise the Global Datastore.
     */
    override fun regionalConfigurations(regionalConfigurations: List<Any>) {
      cdkBuilder.regionalConfigurations(regionalConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param regionalConfigurations The Regions that comprise the Global Datastore.
     */
    override fun regionalConfigurations(vararg regionalConfigurations: Any): Unit =
        regionalConfigurations(regionalConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps,
  ) : CdkObject(cdkObject),
      CfnGlobalReplicationGroupProps {
    /**
     * Specifies whether a read-only replica is automatically promoted to read/write primary if the
     * existing primary fails.
     *
     * `AutomaticFailoverEnabled` must be enabled for Valkey or Redis OSS (cluster mode enabled)
     * replication groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-automaticfailoverenabled)
     */
    override fun automaticFailoverEnabled(): Any? = unwrap(this).getAutomaticFailoverEnabled()

    /**
     * The cache node type of the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-cachenodetype)
     */
    override fun cacheNodeType(): String? = unwrap(this).getCacheNodeType()

    /**
     * The name of the cache parameter group to use with the Global datastore.
     *
     * It must be compatible with the major engine version used by the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-cacheparametergroupname)
     */
    override fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

    /**
     * The ElastiCache engine.
     *
     * For Valkey or Redis OSS only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-engine)
     */
    override fun engine(): String? = unwrap(this).getEngine()

    /**
     * The Elasticache Valkey or Redis OSS engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * The number of node groups that comprise the Global Datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalnodegroupcount)
     */
    override fun globalNodeGroupCount(): Number? = unwrap(this).getGlobalNodeGroupCount()

    /**
     * The optional description of the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupdescription)
     */
    override fun globalReplicationGroupDescription(): String? =
        unwrap(this).getGlobalReplicationGroupDescription()

    /**
     * The suffix name of a Global Datastore.
     *
     * The suffix guarantees uniqueness of the Global Datastore name across multiple regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupidsuffix)
     */
    override fun globalReplicationGroupIdSuffix(): String? =
        unwrap(this).getGlobalReplicationGroupIdSuffix()

    /**
     * The replication groups that comprise the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
     */
    override fun members(): Any = unwrap(this).getMembers()

    /**
     * The Regions that comprise the Global Datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
     */
    override fun regionalConfigurations(): Any? = unwrap(this).getRegionalConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGlobalReplicationGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps):
        CfnGlobalReplicationGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnGlobalReplicationGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalReplicationGroupProps):
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps
  }
}
