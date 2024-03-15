@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
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
public open class CfnGlobalReplicationGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID used to associate a secondary cluster to the Global Replication Group.
   */
  public open fun attrGlobalReplicationGroupId(): String =
      unwrap(this).getAttrGlobalReplicationGroupId()

  /**
   * The status of the Global Datastore.
   *
   * Can be `Creating` , `Modifying` , `Available` , `Deleting` or `Primary-Only` . Primary-only
   * status indicates the global datastore contains only a primary cluster. Either all secondary
   * clusters are deleted or not successfully created.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   */
  public open fun automaticFailoverEnabled(): Any? = unwrap(this).getAutomaticFailoverEnabled()

  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   */
  public open fun automaticFailoverEnabled(`value`: Boolean) {
    unwrap(this).setAutomaticFailoverEnabled(`value`)
  }

  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   */
  public open fun automaticFailoverEnabled(`value`: IResolvable) {
    unwrap(this).setAutomaticFailoverEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The cache node type of the Global datastore.
   */
  public open fun cacheNodeType(): String? = unwrap(this).getCacheNodeType()

  /**
   * The cache node type of the Global datastore.
   */
  public open fun cacheNodeType(`value`: String) {
    unwrap(this).setCacheNodeType(`value`)
  }

  /**
   * The name of the cache parameter group to use with the Global datastore.
   */
  public open fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

  /**
   * The name of the cache parameter group to use with the Global datastore.
   */
  public open fun cacheParameterGroupName(`value`: String) {
    unwrap(this).setCacheParameterGroupName(`value`)
  }

  /**
   * The Elasticache Redis engine version.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The Elasticache Redis engine version.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * The number of node groups that comprise the Global Datastore.
   */
  public open fun globalNodeGroupCount(): Number? = unwrap(this).getGlobalNodeGroupCount()

  /**
   * The number of node groups that comprise the Global Datastore.
   */
  public open fun globalNodeGroupCount(`value`: Number) {
    unwrap(this).setGlobalNodeGroupCount(`value`)
  }

  /**
   * The optional description of the Global datastore.
   */
  public open fun globalReplicationGroupDescription(): String? =
      unwrap(this).getGlobalReplicationGroupDescription()

  /**
   * The optional description of the Global datastore.
   */
  public open fun globalReplicationGroupDescription(`value`: String) {
    unwrap(this).setGlobalReplicationGroupDescription(`value`)
  }

  /**
   * The suffix name of a Global Datastore.
   */
  public open fun globalReplicationGroupIdSuffix(): String? =
      unwrap(this).getGlobalReplicationGroupIdSuffix()

  /**
   * The suffix name of a Global Datastore.
   */
  public open fun globalReplicationGroupIdSuffix(`value`: String) {
    unwrap(this).setGlobalReplicationGroupIdSuffix(`value`)
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
   * The replication groups that comprise the Global datastore.
   */
  public open fun members(): Any = unwrap(this).getMembers()

  /**
   * The replication groups that comprise the Global datastore.
   */
  public open fun members(`value`: IResolvable) {
    unwrap(this).setMembers(`value`.let(IResolvable::unwrap))
  }

  /**
   * The replication groups that comprise the Global datastore.
   */
  public open fun members(__idx_ac66f0: List<Any>) {
    unwrap(this).setMembers(__idx_ac66f0)
  }

  /**
   * The replication groups that comprise the Global datastore.
   */
  public open fun members(vararg __idx_ac66f0: Any): Unit = members(__idx_ac66f0.toList())

  /**
   * The Regions that comprise the Global Datastore.
   */
  public open fun regionalConfigurations(): Any? = unwrap(this).getRegionalConfigurations()

  /**
   * The Regions that comprise the Global Datastore.
   */
  public open fun regionalConfigurations(`value`: IResolvable) {
    unwrap(this).setRegionalConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Regions that comprise the Global Datastore.
   */
  public open fun regionalConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setRegionalConfigurations(__idx_ac66f0)
  }

  /**
   * The Regions that comprise the Global Datastore.
   */
  public open fun regionalConfigurations(vararg __idx_ac66f0: Any): Unit =
      regionalConfigurations(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnGlobalReplicationGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether a read-only replica is automatically promoted to read/write primary if the
     * existing primary fails.
     *
     * `AutomaticFailoverEnabled` must be enabled for Redis (cluster mode enabled) replication
     * groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-automaticfailoverenabled)
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails. 
     */
    public fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean)

    /**
     * Specifies whether a read-only replica is automatically promoted to read/write primary if the
     * existing primary fails.
     *
     * `AutomaticFailoverEnabled` must be enabled for Redis (cluster mode enabled) replication
     * groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-automaticfailoverenabled)
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails. 
     */
    public fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable)

    /**
     * The cache node type of the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-cachenodetype)
     * @param cacheNodeType The cache node type of the Global datastore. 
     */
    public fun cacheNodeType(cacheNodeType: String)

    /**
     * The name of the cache parameter group to use with the Global datastore.
     *
     * It must be compatible with the major engine version used by the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-cacheparametergroupname)
     * @param cacheParameterGroupName The name of the cache parameter group to use with the Global
     * datastore. 
     */
    public fun cacheParameterGroupName(cacheParameterGroupName: String)

    /**
     * The Elasticache Redis engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-engineversion)
     * @param engineVersion The Elasticache Redis engine version. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * The number of node groups that comprise the Global Datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalnodegroupcount)
     * @param globalNodeGroupCount The number of node groups that comprise the Global Datastore. 
     */
    public fun globalNodeGroupCount(globalNodeGroupCount: Number)

    /**
     * The optional description of the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupdescription)
     * @param globalReplicationGroupDescription The optional description of the Global datastore. 
     */
    public fun globalReplicationGroupDescription(globalReplicationGroupDescription: String)

    /**
     * The suffix name of a Global Datastore.
     *
     * The suffix guarantees uniqueness of the Global Datastore name across multiple regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupidsuffix)
     * @param globalReplicationGroupIdSuffix The suffix name of a Global Datastore. 
     */
    public fun globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix: String)

    /**
     * The replication groups that comprise the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
     * @param members The replication groups that comprise the Global datastore. 
     */
    public fun members(members: IResolvable)

    /**
     * The replication groups that comprise the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
     * @param members The replication groups that comprise the Global datastore. 
     */
    public fun members(members: List<Any>)

    /**
     * The replication groups that comprise the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
     * @param members The replication groups that comprise the Global datastore. 
     */
    public fun members(vararg members: Any)

    /**
     * The Regions that comprise the Global Datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
     * @param regionalConfigurations The Regions that comprise the Global Datastore. 
     */
    public fun regionalConfigurations(regionalConfigurations: IResolvable)

    /**
     * The Regions that comprise the Global Datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
     * @param regionalConfigurations The Regions that comprise the Global Datastore. 
     */
    public fun regionalConfigurations(regionalConfigurations: List<Any>)

    /**
     * The Regions that comprise the Global Datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
     * @param regionalConfigurations The Regions that comprise the Global Datastore. 
     */
    public fun regionalConfigurations(vararg regionalConfigurations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.Builder =
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.Builder.create(scope,
        id)

    /**
     * Specifies whether a read-only replica is automatically promoted to read/write primary if the
     * existing primary fails.
     *
     * `AutomaticFailoverEnabled` must be enabled for Redis (cluster mode enabled) replication
     * groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-automaticfailoverenabled)
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails. 
     */
    override fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean) {
      cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
    }

    /**
     * Specifies whether a read-only replica is automatically promoted to read/write primary if the
     * existing primary fails.
     *
     * `AutomaticFailoverEnabled` must be enabled for Redis (cluster mode enabled) replication
     * groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-automaticfailoverenabled)
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     * promoted to read/write primary if the existing primary fails. 
     */
    override fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable) {
      cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled.let(IResolvable::unwrap))
    }

    /**
     * The cache node type of the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-cachenodetype)
     * @param cacheNodeType The cache node type of the Global datastore. 
     */
    override fun cacheNodeType(cacheNodeType: String) {
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
    override fun cacheParameterGroupName(cacheParameterGroupName: String) {
      cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
    }

    /**
     * The Elasticache Redis engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-engineversion)
     * @param engineVersion The Elasticache Redis engine version. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The number of node groups that comprise the Global Datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalnodegroupcount)
     * @param globalNodeGroupCount The number of node groups that comprise the Global Datastore. 
     */
    override fun globalNodeGroupCount(globalNodeGroupCount: Number) {
      cdkBuilder.globalNodeGroupCount(globalNodeGroupCount)
    }

    /**
     * The optional description of the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupdescription)
     * @param globalReplicationGroupDescription The optional description of the Global datastore. 
     */
    override fun globalReplicationGroupDescription(globalReplicationGroupDescription: String) {
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
    override fun globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix: String) {
      cdkBuilder.globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix)
    }

    /**
     * The replication groups that comprise the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
     * @param members The replication groups that comprise the Global datastore. 
     */
    override fun members(members: IResolvable) {
      cdkBuilder.members(members.let(IResolvable::unwrap))
    }

    /**
     * The replication groups that comprise the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
     * @param members The replication groups that comprise the Global datastore. 
     */
    override fun members(members: List<Any>) {
      cdkBuilder.members(members)
    }

    /**
     * The replication groups that comprise the Global datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-members)
     * @param members The replication groups that comprise the Global datastore. 
     */
    override fun members(vararg members: Any): Unit = members(members.toList())

    /**
     * The Regions that comprise the Global Datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
     * @param regionalConfigurations The Regions that comprise the Global Datastore. 
     */
    override fun regionalConfigurations(regionalConfigurations: IResolvable) {
      cdkBuilder.regionalConfigurations(regionalConfigurations.let(IResolvable::unwrap))
    }

    /**
     * The Regions that comprise the Global Datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
     * @param regionalConfigurations The Regions that comprise the Global Datastore. 
     */
    override fun regionalConfigurations(regionalConfigurations: List<Any>) {
      cdkBuilder.regionalConfigurations(regionalConfigurations)
    }

    /**
     * The Regions that comprise the Global Datastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-globalreplicationgroup.html#cfn-elasticache-globalreplicationgroup-regionalconfigurations)
     * @param regionalConfigurations The Regions that comprise the Global Datastore. 
     */
    override fun regionalConfigurations(vararg regionalConfigurations: Any): Unit =
        regionalConfigurations(regionalConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGlobalReplicationGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGlobalReplicationGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup):
        CfnGlobalReplicationGroup = CfnGlobalReplicationGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalReplicationGroup):
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup = wrapped.cdkObject
  }

  /**
   * A member of a Global datastore.
   *
   * It contains the Replication Group Id, the Amazon region and the role of the replication group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * GlobalReplicationGroupMemberProperty globalReplicationGroupMemberProperty =
   * GlobalReplicationGroupMemberProperty.builder()
   * .replicationGroupId("replicationGroupId")
   * .replicationGroupRegion("replicationGroupRegion")
   * .role("role")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-globalreplicationgroupmember.html)
   */
  public interface GlobalReplicationGroupMemberProperty {
    /**
     * The replication group id of the Global datastore member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-globalreplicationgroupmember.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupmember-replicationgroupid)
     */
    public fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

    /**
     * The Amazon region of the Global datastore member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-globalreplicationgroupmember.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupmember-replicationgroupregion)
     */
    public fun replicationGroupRegion(): String? = unwrap(this).getReplicationGroupRegion()

    /**
     * Indicates the role of the replication group, `PRIMARY` or `SECONDARY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-globalreplicationgroupmember.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupmember-role)
     */
    public fun role(): String? = unwrap(this).getRole()

    /**
     * A builder for [GlobalReplicationGroupMemberProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param replicationGroupId The replication group id of the Global datastore member.
       */
      public fun replicationGroupId(replicationGroupId: String)

      /**
       * @param replicationGroupRegion The Amazon region of the Global datastore member.
       */
      public fun replicationGroupRegion(replicationGroupRegion: String)

      /**
       * @param role Indicates the role of the replication group, `PRIMARY` or `SECONDARY` .
       */
      public fun role(role: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.builder()

      /**
       * @param replicationGroupId The replication group id of the Global datastore member.
       */
      override fun replicationGroupId(replicationGroupId: String) {
        cdkBuilder.replicationGroupId(replicationGroupId)
      }

      /**
       * @param replicationGroupRegion The Amazon region of the Global datastore member.
       */
      override fun replicationGroupRegion(replicationGroupRegion: String) {
        cdkBuilder.replicationGroupRegion(replicationGroupRegion)
      }

      /**
       * @param role Indicates the role of the replication group, `PRIMARY` or `SECONDARY` .
       */
      override fun role(role: String) {
        cdkBuilder.role(role)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty,
    ) : CdkObject(cdkObject), GlobalReplicationGroupMemberProperty {
      /**
       * The replication group id of the Global datastore member.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-globalreplicationgroupmember.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupmember-replicationgroupid)
       */
      override fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

      /**
       * The Amazon region of the Global datastore member.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-globalreplicationgroupmember.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupmember-replicationgroupregion)
       */
      override fun replicationGroupRegion(): String? = unwrap(this).getReplicationGroupRegion()

      /**
       * Indicates the role of the replication group, `PRIMARY` or `SECONDARY` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-globalreplicationgroupmember.html#cfn-elasticache-globalreplicationgroup-globalreplicationgroupmember-role)
       */
      override fun role(): String? = unwrap(this).getRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GlobalReplicationGroupMemberProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty):
          GlobalReplicationGroupMemberProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlobalReplicationGroupMemberProperty):
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty
    }
  }

  /**
   * A list of `PreferredAvailabilityZones` objects that specifies the configuration of a node group
   * in the resharded cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * ReshardingConfigurationProperty reshardingConfigurationProperty =
   * ReshardingConfigurationProperty.builder()
   * .nodeGroupId("nodeGroupId")
   * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-reshardingconfiguration.html)
   */
  public interface ReshardingConfigurationProperty {
    /**
     * Either the ElastiCache for Redis supplied 4-digit id or a user supplied id for the node group
     * these configuration values apply to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-reshardingconfiguration.html#cfn-elasticache-globalreplicationgroup-reshardingconfiguration-nodegroupid)
     */
    public fun nodeGroupId(): String? = unwrap(this).getNodeGroupId()

    /**
     * A list of preferred availability zones for the nodes in this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-reshardingconfiguration.html#cfn-elasticache-globalreplicationgroup-reshardingconfiguration-preferredavailabilityzones)
     */
    public fun preferredAvailabilityZones(): List<String> =
        unwrap(this).getPreferredAvailabilityZones() ?: emptyList()

    /**
     * A builder for [ReshardingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nodeGroupId Either the ElastiCache for Redis supplied 4-digit id or a user supplied
       * id for the node group these configuration values apply to.
       */
      public fun nodeGroupId(nodeGroupId: String)

      /**
       * @param preferredAvailabilityZones A list of preferred availability zones for the nodes in
       * this cluster.
       */
      public fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>)

      /**
       * @param preferredAvailabilityZones A list of preferred availability zones for the nodes in
       * this cluster.
       */
      public fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty.builder()

      /**
       * @param nodeGroupId Either the ElastiCache for Redis supplied 4-digit id or a user supplied
       * id for the node group these configuration values apply to.
       */
      override fun nodeGroupId(nodeGroupId: String) {
        cdkBuilder.nodeGroupId(nodeGroupId)
      }

      /**
       * @param preferredAvailabilityZones A list of preferred availability zones for the nodes in
       * this cluster.
       */
      override fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>) {
        cdkBuilder.preferredAvailabilityZones(preferredAvailabilityZones)
      }

      /**
       * @param preferredAvailabilityZones A list of preferred availability zones for the nodes in
       * this cluster.
       */
      override fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String): Unit =
          preferredAvailabilityZones(preferredAvailabilityZones.toList())

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty,
    ) : CdkObject(cdkObject), ReshardingConfigurationProperty {
      /**
       * Either the ElastiCache for Redis supplied 4-digit id or a user supplied id for the node
       * group these configuration values apply to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-reshardingconfiguration.html#cfn-elasticache-globalreplicationgroup-reshardingconfiguration-nodegroupid)
       */
      override fun nodeGroupId(): String? = unwrap(this).getNodeGroupId()

      /**
       * A list of preferred availability zones for the nodes in this cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-reshardingconfiguration.html#cfn-elasticache-globalreplicationgroup-reshardingconfiguration-preferredavailabilityzones)
       */
      override fun preferredAvailabilityZones(): List<String> =
          unwrap(this).getPreferredAvailabilityZones() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReshardingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty):
          ReshardingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReshardingConfigurationProperty):
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty
    }
  }

  /**
   * A list of the replication groups.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * RegionalConfigurationProperty regionalConfigurationProperty =
   * RegionalConfigurationProperty.builder()
   * .replicationGroupId("replicationGroupId")
   * .replicationGroupRegion("replicationGroupRegion")
   * .reshardingConfigurations(List.of(ReshardingConfigurationProperty.builder()
   * .nodeGroupId("nodeGroupId")
   * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-regionalconfiguration.html)
   */
  public interface RegionalConfigurationProperty {
    /**
     * The name of the secondary cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-regionalconfiguration.html#cfn-elasticache-globalreplicationgroup-regionalconfiguration-replicationgroupid)
     */
    public fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

    /**
     * The Amazon region where the cluster is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-regionalconfiguration.html#cfn-elasticache-globalreplicationgroup-regionalconfiguration-replicationgroupregion)
     */
    public fun replicationGroupRegion(): String? = unwrap(this).getReplicationGroupRegion()

    /**
     * A list of PreferredAvailabilityZones objects that specifies the configuration of a node group
     * in the resharded cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-regionalconfiguration.html#cfn-elasticache-globalreplicationgroup-regionalconfiguration-reshardingconfigurations)
     */
    public fun reshardingConfigurations(): Any? = unwrap(this).getReshardingConfigurations()

    /**
     * A builder for [RegionalConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param replicationGroupId The name of the secondary cluster.
       */
      public fun replicationGroupId(replicationGroupId: String)

      /**
       * @param replicationGroupRegion The Amazon region where the cluster is stored.
       */
      public fun replicationGroupRegion(replicationGroupRegion: String)

      /**
       * @param reshardingConfigurations A list of PreferredAvailabilityZones objects that specifies
       * the configuration of a node group in the resharded cluster.
       */
      public fun reshardingConfigurations(reshardingConfigurations: IResolvable)

      /**
       * @param reshardingConfigurations A list of PreferredAvailabilityZones objects that specifies
       * the configuration of a node group in the resharded cluster.
       */
      public fun reshardingConfigurations(reshardingConfigurations: List<Any>)

      /**
       * @param reshardingConfigurations A list of PreferredAvailabilityZones objects that specifies
       * the configuration of a node group in the resharded cluster.
       */
      public fun reshardingConfigurations(vararg reshardingConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty.builder()

      /**
       * @param replicationGroupId The name of the secondary cluster.
       */
      override fun replicationGroupId(replicationGroupId: String) {
        cdkBuilder.replicationGroupId(replicationGroupId)
      }

      /**
       * @param replicationGroupRegion The Amazon region where the cluster is stored.
       */
      override fun replicationGroupRegion(replicationGroupRegion: String) {
        cdkBuilder.replicationGroupRegion(replicationGroupRegion)
      }

      /**
       * @param reshardingConfigurations A list of PreferredAvailabilityZones objects that specifies
       * the configuration of a node group in the resharded cluster.
       */
      override fun reshardingConfigurations(reshardingConfigurations: IResolvable) {
        cdkBuilder.reshardingConfigurations(reshardingConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param reshardingConfigurations A list of PreferredAvailabilityZones objects that specifies
       * the configuration of a node group in the resharded cluster.
       */
      override fun reshardingConfigurations(reshardingConfigurations: List<Any>) {
        cdkBuilder.reshardingConfigurations(reshardingConfigurations)
      }

      /**
       * @param reshardingConfigurations A list of PreferredAvailabilityZones objects that specifies
       * the configuration of a node group in the resharded cluster.
       */
      override fun reshardingConfigurations(vararg reshardingConfigurations: Any): Unit =
          reshardingConfigurations(reshardingConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty,
    ) : CdkObject(cdkObject), RegionalConfigurationProperty {
      /**
       * The name of the secondary cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-regionalconfiguration.html#cfn-elasticache-globalreplicationgroup-regionalconfiguration-replicationgroupid)
       */
      override fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

      /**
       * The Amazon region where the cluster is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-regionalconfiguration.html#cfn-elasticache-globalreplicationgroup-regionalconfiguration-replicationgroupregion)
       */
      override fun replicationGroupRegion(): String? = unwrap(this).getReplicationGroupRegion()

      /**
       * A list of PreferredAvailabilityZones objects that specifies the configuration of a node
       * group in the resharded cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-regionalconfiguration.html#cfn-elasticache-globalreplicationgroup-regionalconfiguration-reshardingconfigurations)
       */
      override fun reshardingConfigurations(): Any? = unwrap(this).getReshardingConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegionalConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty):
          RegionalConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegionalConfigurationProperty):
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty
    }
  }
}
