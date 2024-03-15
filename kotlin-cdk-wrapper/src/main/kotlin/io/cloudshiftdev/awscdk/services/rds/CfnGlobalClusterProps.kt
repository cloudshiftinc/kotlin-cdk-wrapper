@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnGlobalCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnGlobalClusterProps cfnGlobalClusterProps = CfnGlobalClusterProps.builder()
 * .deletionProtection(false)
 * .engine("engine")
 * .engineVersion("engineVersion")
 * .globalClusterIdentifier("globalClusterIdentifier")
 * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
 * .storageEncrypted(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html)
 */
public interface CfnGlobalClusterProps {
  /**
   * Specifies whether to enable deletion protection for the new global database cluster.
   *
   * The global database can't be deleted when deletion protection is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-deletionprotection)
   */
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

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
   */
  public fun engine(): String? = unwrap(this).getEngine()

  /**
   * The engine version to use for this global database cluster.
   *
   * Constraints:
   *
   * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
   * uses the engine version of the source DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The cluster identifier for this global database cluster.
   *
   * This parameter is stored as a lowercase string.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-globalclusteridentifier)
   */
  public fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

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
   */
  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  /**
   * Specifies whether to enable storage encryption for the new global database cluster.
   *
   * Constraints:
   *
   * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
   * uses the setting from the source DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-storageencrypted)
   */
  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  /**
   * A builder for [CfnGlobalClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster.
     * The global database can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster.
     * The global database can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * @param engine The database engine to use for this global database cluster.
     * Valid Values: `aurora-mysql | aurora-postgresql`
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine of the source DB cluster.
     */
    public fun engine(engine: String)

    /**
     * @param engineVersion The engine version to use for this global database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine version of the source DB cluster.
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param globalClusterIdentifier The cluster identifier for this global database cluster.
     * This parameter is stored as a lowercase string.
     */
    public fun globalClusterIdentifier(globalClusterIdentifier: String)

    /**
     * @param sourceDbClusterIdentifier The Amazon Resource Name (ARN) to use as the primary cluster
     * of the global database.
     * If you provide a value for this parameter, don't specify values for the following settings
     * because Amazon Aurora uses the values from the specified source DB cluster:
     *
     * * `DatabaseName`
     * * `Engine`
     * * `EngineVersion`
     * * `StorageEncrypted`
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    /**
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     */
    public fun storageEncrypted(storageEncrypted: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnGlobalClusterProps.Builder =
        software.amazon.awscdk.services.rds.CfnGlobalClusterProps.builder()

    /**
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster.
     * The global database can't be deleted when deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster.
     * The global database can't be deleted when deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    /**
     * @param engine The database engine to use for this global database cluster.
     * Valid Values: `aurora-mysql | aurora-postgresql`
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine of the source DB cluster.
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param engineVersion The engine version to use for this global database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine version of the source DB cluster.
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param globalClusterIdentifier The cluster identifier for this global database cluster.
     * This parameter is stored as a lowercase string.
     */
    override fun globalClusterIdentifier(globalClusterIdentifier: String) {
      cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
    }

    /**
     * @param sourceDbClusterIdentifier The Amazon Resource Name (ARN) to use as the primary cluster
     * of the global database.
     * If you provide a value for this parameter, don't specify values for the following settings
     * because Amazon Aurora uses the values from the specified source DB cluster:
     *
     * * `DatabaseName`
     * * `Engine`
     * * `EngineVersion`
     * * `StorageEncrypted`
     */
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     */
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnGlobalClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnGlobalClusterProps,
  ) : CdkObject(cdkObject), CfnGlobalClusterProps {
    /**
     * Specifies whether to enable deletion protection for the new global database cluster.
     *
     * The global database can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-deletionprotection)
     */
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

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
     */
    override fun engine(): String? = unwrap(this).getEngine()

    /**
     * The engine version to use for this global database cluster.
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine version of the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * The cluster identifier for this global database cluster.
     *
     * This parameter is stored as a lowercase string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-globalclusteridentifier)
     */
    override fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

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
     */
    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

    /**
     * Specifies whether to enable storage encryption for the new global database cluster.
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-storageencrypted)
     */
    override fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGlobalClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnGlobalClusterProps):
        CfnGlobalClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalClusterProps):
        software.amazon.awscdk.services.rds.CfnGlobalClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.CfnGlobalClusterProps
  }
}
