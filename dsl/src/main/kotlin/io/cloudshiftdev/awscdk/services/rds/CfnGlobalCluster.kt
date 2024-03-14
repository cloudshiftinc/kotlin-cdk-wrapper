package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGlobalCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnGlobalCluster,
) : CfnResource(cdkObject), IInspectable {
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
    unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    unwrap(this).setStorageEncrypted(`value`.let(IResolvable::unwrap))
  }

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
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
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
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnGlobalCluster = cdkBuilder.build()
  }

  public companion object {
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
        software.amazon.awscdk.services.rds.CfnGlobalCluster = wrapped.cdkObject
  }
}
