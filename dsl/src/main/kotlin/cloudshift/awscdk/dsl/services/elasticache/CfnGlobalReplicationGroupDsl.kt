@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup
import software.constructs.Construct

/**
 * Consists of a primary cluster that accepts writes and an associated secondary cluster that
 * resides in a different Amazon region.
 *
 * The secondary cluster accepts only reads. The primary cluster automatically replicates updates to
 * the secondary cluster.
 *
 * * The *GlobalReplicationGroupIdSuffix* represents the name of the Global datastore, which is what
 * you use to associate a secondary cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * CfnGlobalReplicationGroup cfnGlobalReplicationGroup =
 * CfnGlobalReplicationGroup.Builder.create(this, "MyCfnGlobalReplicationGroup")
 * .members(List.of(GlobalReplicationGroupMemberProperty.builder()
 * .replicationGroupId("replicationGroupId")
 * .replicationGroupRegion("replicationGroupRegion")
 * .role("role")
 * .build()))
 * // the properties below are optional
 * .automaticFailoverEnabled(false)
 * .cacheNodeType("cacheNodeType")
 * .cacheParameterGroupName("cacheParameterGroupName")
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
@CdkDslMarker
public class CfnGlobalReplicationGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGlobalReplicationGroup.Builder =
      CfnGlobalReplicationGroup.Builder.create(scope, id)

  private val _members: MutableList<Any> = mutableListOf()

  private val _regionalConfigurations: MutableList<Any> = mutableListOf()

  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   *
   * `AutomaticFailoverEnabled` must be enabled for Redis (cluster mode enabled) replication groups.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-automaticfailoverenabled)
   * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically promoted
   * to read/write primary if the existing primary fails. 
   */
  public fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean) {
    cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
  }

  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   *
   * `AutomaticFailoverEnabled` must be enabled for Redis (cluster mode enabled) replication groups.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-automaticfailoverenabled)
   * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically promoted
   * to read/write primary if the existing primary fails. 
   */
  public fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable) {
    cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
  }

  /**
   * The cache node type of the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-cachenodetype)
   * @param cacheNodeType The cache node type of the Global datastore. 
   */
  public fun cacheNodeType(cacheNodeType: String) {
    cdkBuilder.cacheNodeType(cacheNodeType)
  }

  /**
   * The name of the cache parameter group to use with the Global datastore.
   *
   * It must be compatible with the major engine version used by the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-cacheparametergroupname)
   * @param cacheParameterGroupName The name of the cache parameter group to use with the Global
   * datastore. 
   */
  public fun cacheParameterGroupName(cacheParameterGroupName: String) {
    cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
  }

  /**
   * The Elasticache Redis engine version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-engineversion)
   * @param engineVersion The Elasticache Redis engine version. 
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * The number of node groups that comprise the Global Datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalnodegroupcount)
   * @param globalNodeGroupCount The number of node groups that comprise the Global Datastore. 
   */
  public fun globalNodeGroupCount(globalNodeGroupCount: Number) {
    cdkBuilder.globalNodeGroupCount(globalNodeGroupCount)
  }

  /**
   * The optional description of the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupdescription)
   * @param globalReplicationGroupDescription The optional description of the Global datastore. 
   */
  public fun globalReplicationGroupDescription(globalReplicationGroupDescription: String) {
    cdkBuilder.globalReplicationGroupDescription(globalReplicationGroupDescription)
  }

  /**
   * The suffix name of a Global Datastore.
   *
   * The suffix guarantees uniqueness of the Global Datastore name across multiple regions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupidsuffix)
   * @param globalReplicationGroupIdSuffix The suffix name of a Global Datastore. 
   */
  public fun globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix: String) {
    cdkBuilder.globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix)
  }

  /**
   * The replication groups that comprise the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
   * @param members The replication groups that comprise the Global datastore. 
   */
  public fun members(vararg members: Any) {
    _members.addAll(listOf(*members))
  }

  /**
   * The replication groups that comprise the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
   * @param members The replication groups that comprise the Global datastore. 
   */
  public fun members(members: Collection<Any>) {
    _members.addAll(members)
  }

  /**
   * The replication groups that comprise the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
   * @param members The replication groups that comprise the Global datastore. 
   */
  public fun members(members: IResolvable) {
    cdkBuilder.members(members)
  }

  /**
   * The Regions that comprise the Global Datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
   * @param regionalConfigurations The Regions that comprise the Global Datastore. 
   */
  public fun regionalConfigurations(vararg regionalConfigurations: Any) {
    _regionalConfigurations.addAll(listOf(*regionalConfigurations))
  }

  /**
   * The Regions that comprise the Global Datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
   * @param regionalConfigurations The Regions that comprise the Global Datastore. 
   */
  public fun regionalConfigurations(regionalConfigurations: Collection<Any>) {
    _regionalConfigurations.addAll(regionalConfigurations)
  }

  /**
   * The Regions that comprise the Global Datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
   * @param regionalConfigurations The Regions that comprise the Global Datastore. 
   */
  public fun regionalConfigurations(regionalConfigurations: IResolvable) {
    cdkBuilder.regionalConfigurations(regionalConfigurations)
  }

  public fun build(): CfnGlobalReplicationGroup {
    if(_members.isNotEmpty()) cdkBuilder.members(_members)
    if(_regionalConfigurations.isNotEmpty())
        cdkBuilder.regionalConfigurations(_regionalConfigurations)
    return cdkBuilder.build()
  }
}
