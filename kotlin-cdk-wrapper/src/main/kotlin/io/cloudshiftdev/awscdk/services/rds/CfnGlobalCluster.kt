@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::RDS::GlobalCluster` resource creates or updates an Amazon Aurora global database spread
 * across multiple AWS Regions.
 *
 * The global database contains a single primary cluster with read-write capability, and a read-only
 * secondary cluster that receives data from the primary cluster through high-speed replication
 * performed by the Aurora storage subsystem.
 *
 * You can create a global database that is initially empty, and then add a primary cluster and a
 * secondary cluster to it.
 *
 * For information about Aurora global databases, see [Working with Amazon Aurora Global
 * Databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html)
 * in the *Amazon Aurora User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnGlobalCluster cfnGlobalCluster = CfnGlobalCluster.Builder.create(this, "MyCfnGlobalCluster")
 * .deletionProtection(false)
 * .engine("engine")
 * .engineLifecycleSupport("engineLifecycleSupport")
 * .engineVersion("engineVersion")
 * .globalClusterIdentifier("globalClusterIdentifier")
 * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
 * .storageEncrypted(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html)
 */
public open class CfnGlobalCluster(
  cdkObject: software.amazon.awscdk.services.rds.CfnGlobalCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.rds.CfnGlobalCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGlobalClusterProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnGlobalCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnGlobalClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGlobalClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGlobalClusterProps(props)
  )

  /**
   *
   */
  public open fun attrGlobalEndpoint(): IResolvable =
      unwrap(this).getAttrGlobalEndpoint().let(IResolvable::wrap)

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Specifies whether to enable deletion protection for the new global database cluster.
   */
  public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * Specifies whether to enable deletion protection for the new global database cluster.
   */
  public open fun deletionProtection(`value`: Boolean) {
    unwrap(this).setDeletionProtection(`value`)
  }

  /**
   * Specifies whether to enable deletion protection for the new global database cluster.
   */
  public open fun deletionProtection(`value`: IResolvable) {
    unwrap(this).setDeletionProtection(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The database engine to use for this global database cluster.
   */
  public open fun engine(): String? = unwrap(this).getEngine()

  /**
   * The database engine to use for this global database cluster.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  /**
   * The life cycle type for this global database cluster.
   */
  public open fun engineLifecycleSupport(): String? = unwrap(this).getEngineLifecycleSupport()

  /**
   * The life cycle type for this global database cluster.
   */
  public open fun engineLifecycleSupport(`value`: String) {
    unwrap(this).setEngineLifecycleSupport(`value`)
  }

  /**
   * The engine version to use for this global database cluster.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The engine version to use for this global database cluster.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * The cluster identifier for this global database cluster.
   */
  public open fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

  /**
   * The cluster identifier for this global database cluster.
   */
  public open fun globalClusterIdentifier(`value`: String) {
    unwrap(this).setGlobalClusterIdentifier(`value`)
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
   * The Amazon Resource Name (ARN) to use as the primary cluster of the global database.
   */
  public open fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  /**
   * The Amazon Resource Name (ARN) to use as the primary cluster of the global database.
   */
  public open fun sourceDbClusterIdentifier(`value`: String) {
    unwrap(this).setSourceDbClusterIdentifier(`value`)
  }

  /**
   * Specifies whether to enable storage encryption for the new global database cluster.
   */
  public open fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  /**
   * Specifies whether to enable storage encryption for the new global database cluster.
   */
  public open fun storageEncrypted(`value`: Boolean) {
    unwrap(this).setStorageEncrypted(`value`)
  }

  /**
   * Specifies whether to enable storage encryption for the new global database cluster.
   */
  public open fun storageEncrypted(`value`: IResolvable) {
    unwrap(this).setStorageEncrypted(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnGlobalCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether to enable deletion protection for the new global database cluster.
     *
     * The global database can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-deletionprotection)
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * Specifies whether to enable deletion protection for the new global database cluster.
     *
     * The global database can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-deletionprotection)
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster. 
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * The database engine to use for this global database cluster.
     *
     * Valid Values: `aurora-mysql | aurora-postgresql`
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine of the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-engine)
     * @param engine The database engine to use for this global database cluster. 
     */
    public fun engine(engine: String)

    /**
     * The life cycle type for this global database cluster.
     *
     *
     * By default, this value is set to `open-source-rds-extended-support` , which enrolls your
     * global cluster into Amazon RDS Extended Support. At the end of standard support, you can avoid
     * charges for Extended Support by setting the value to `open-source-rds-extended-support-disabled`
     * . In this case, creating the global cluster will fail if the DB major version is past its end of
     * standard support date.
     *
     *
     * This setting only applies to Aurora PostgreSQL-based global databases.
     *
     * You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With
     * RDS Extended Support, you can run the selected major engine version on your global cluster past
     * the end of standard support for that engine version. For more information, see [Amazon RDS
     * Extended Support with Amazon
     * Aurora](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html) in
     * the *Amazon Aurora User Guide* .
     *
     * Valid Values: `open-source-rds-extended-support | open-source-rds-extended-support-disabled`
     *
     * Default: `open-source-rds-extended-support`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-enginelifecyclesupport)
     * @param engineLifecycleSupport The life cycle type for this global database cluster. 
     */
    public fun engineLifecycleSupport(engineLifecycleSupport: String)

    /**
     * The engine version to use for this global database cluster.
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine version of the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-engineversion)
     * @param engineVersion The engine version to use for this global database cluster. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * The cluster identifier for this global database cluster.
     *
     * This parameter is stored as a lowercase string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-globalclusteridentifier)
     * @param globalClusterIdentifier The cluster identifier for this global database cluster. 
     */
    public fun globalClusterIdentifier(globalClusterIdentifier: String)

    /**
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database.
     *
     * If you provide a value for this parameter, don't specify values for the following settings
     * because Amazon Aurora uses the values from the specified source DB cluster:
     *
     * * `DatabaseName`
     * * `Engine`
     * * `EngineVersion`
     * * `StorageEncrypted`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-sourcedbclusteridentifier)
     * @param sourceDbClusterIdentifier The Amazon Resource Name (ARN) to use as the primary cluster
     * of the global database. 
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    /**
     * Specifies whether to enable storage encryption for the new global database cluster.
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-storageencrypted)
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster. 
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * Specifies whether to enable storage encryption for the new global database cluster.
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-storageencrypted)
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster. 
     */
    public fun storageEncrypted(storageEncrypted: IResolvable)

    /**
     * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
     *
     * For more information, see [Tagging Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in
     * the *Amazon Aurora User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-tags)
     * @param tags Metadata assigned to an Amazon RDS resource consisting of a key-value pair. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
     *
     * For more information, see [Tagging Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in
     * the *Amazon Aurora User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-tags)
     * @param tags Metadata assigned to an Amazon RDS resource consisting of a key-value pair. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnGlobalCluster.Builder =
        software.amazon.awscdk.services.rds.CfnGlobalCluster.Builder.create(scope, id)

    /**
     * Specifies whether to enable deletion protection for the new global database cluster.
     *
     * The global database can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-deletionprotection)
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * Specifies whether to enable deletion protection for the new global database cluster.
     *
     * The global database can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-deletionprotection)
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster. 
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable.Companion::unwrap))
    }

    /**
     * The database engine to use for this global database cluster.
     *
     * Valid Values: `aurora-mysql | aurora-postgresql`
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine of the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-engine)
     * @param engine The database engine to use for this global database cluster. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * The life cycle type for this global database cluster.
     *
     *
     * By default, this value is set to `open-source-rds-extended-support` , which enrolls your
     * global cluster into Amazon RDS Extended Support. At the end of standard support, you can avoid
     * charges for Extended Support by setting the value to `open-source-rds-extended-support-disabled`
     * . In this case, creating the global cluster will fail if the DB major version is past its end of
     * standard support date.
     *
     *
     * This setting only applies to Aurora PostgreSQL-based global databases.
     *
     * You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With
     * RDS Extended Support, you can run the selected major engine version on your global cluster past
     * the end of standard support for that engine version. For more information, see [Amazon RDS
     * Extended Support with Amazon
     * Aurora](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html) in
     * the *Amazon Aurora User Guide* .
     *
     * Valid Values: `open-source-rds-extended-support | open-source-rds-extended-support-disabled`
     *
     * Default: `open-source-rds-extended-support`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-enginelifecyclesupport)
     * @param engineLifecycleSupport The life cycle type for this global database cluster. 
     */
    override fun engineLifecycleSupport(engineLifecycleSupport: String) {
      cdkBuilder.engineLifecycleSupport(engineLifecycleSupport)
    }

    /**
     * The engine version to use for this global database cluster.
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine version of the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-engineversion)
     * @param engineVersion The engine version to use for this global database cluster. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The cluster identifier for this global database cluster.
     *
     * This parameter is stored as a lowercase string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-globalclusteridentifier)
     * @param globalClusterIdentifier The cluster identifier for this global database cluster. 
     */
    override fun globalClusterIdentifier(globalClusterIdentifier: String) {
      cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
    }

    /**
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database.
     *
     * If you provide a value for this parameter, don't specify values for the following settings
     * because Amazon Aurora uses the values from the specified source DB cluster:
     *
     * * `DatabaseName`
     * * `Engine`
     * * `EngineVersion`
     * * `StorageEncrypted`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-sourcedbclusteridentifier)
     * @param sourceDbClusterIdentifier The Amazon Resource Name (ARN) to use as the primary cluster
     * of the global database. 
     */
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * Specifies whether to enable storage encryption for the new global database cluster.
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-storageencrypted)
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster. 
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * Specifies whether to enable storage encryption for the new global database cluster.
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-storageencrypted)
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster. 
     */
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable.Companion::unwrap))
    }

    /**
     * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
     *
     * For more information, see [Tagging Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in
     * the *Amazon Aurora User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-tags)
     * @param tags Metadata assigned to an Amazon RDS resource consisting of a key-value pair. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
     *
     * For more information, see [Tagging Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in
     * the *Amazon Aurora User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-tags)
     * @param tags Metadata assigned to an Amazon RDS resource consisting of a key-value pair. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnGlobalCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnGlobalCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGlobalCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGlobalCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnGlobalCluster):
        CfnGlobalCluster = CfnGlobalCluster(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalCluster):
        software.amazon.awscdk.services.rds.CfnGlobalCluster = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.CfnGlobalCluster
  }

  /**
   * The writer endpoint for the new global database cluster.
   *
   * This endpoint always points to the writer DB instance in the current primary cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * GlobalEndpointProperty globalEndpointProperty = GlobalEndpointProperty.builder()
   * .address("address")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-globalcluster-globalendpoint.html)
   */
  public interface GlobalEndpointProperty {
    /**
     * The writer endpoint for the new global database cluster.
     *
     * This endpoint always points to the writer DB instance in the current primary cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-globalcluster-globalendpoint.html#cfn-rds-globalcluster-globalendpoint-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * A builder for [GlobalEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The writer endpoint for the new global database cluster.
       * This endpoint always points to the writer DB instance in the current primary cluster.
       */
      public fun address(address: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnGlobalCluster.GlobalEndpointProperty.Builder =
          software.amazon.awscdk.services.rds.CfnGlobalCluster.GlobalEndpointProperty.builder()

      /**
       * @param address The writer endpoint for the new global database cluster.
       * This endpoint always points to the writer DB instance in the current primary cluster.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnGlobalCluster.GlobalEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnGlobalCluster.GlobalEndpointProperty,
    ) : CdkObject(cdkObject),
        GlobalEndpointProperty {
      /**
       * The writer endpoint for the new global database cluster.
       *
       * This endpoint always points to the writer DB instance in the current primary cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-globalcluster-globalendpoint.html#cfn-rds-globalcluster-globalendpoint-address)
       */
      override fun address(): String? = unwrap(this).getAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GlobalEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnGlobalCluster.GlobalEndpointProperty):
          GlobalEndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? GlobalEndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlobalEndpointProperty):
          software.amazon.awscdk.services.rds.CfnGlobalCluster.GlobalEndpointProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnGlobalCluster.GlobalEndpointProperty
    }
  }
}
