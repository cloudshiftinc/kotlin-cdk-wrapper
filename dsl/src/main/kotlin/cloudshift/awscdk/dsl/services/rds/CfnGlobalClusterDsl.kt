@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnGlobalCluster
import software.constructs.Construct

@CdkDslMarker
public class CfnGlobalClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGlobalCluster.Builder = CfnGlobalCluster.Builder.create(scope, id)

  /**
   * Specifies whether to enable deletion protection for the new global database cluster.
   *
   * The global database can't be deleted when deletion protection is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-deletionprotection)
   * @param deletionProtection Specifies whether to enable deletion protection for the new global
   * database cluster. 
   */
  public fun deletionProtection(deletionProtection: Boolean) {
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
  public fun deletionProtection(deletionProtection: IResolvable) {
    cdkBuilder.deletionProtection(deletionProtection)
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
  public fun engine(engine: String) {
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
  public fun engineVersion(engineVersion: String) {
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
  public fun globalClusterIdentifier(globalClusterIdentifier: String) {
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
  public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
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
  public fun storageEncrypted(storageEncrypted: Boolean) {
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
  public fun storageEncrypted(storageEncrypted: IResolvable) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  public fun build(): CfnGlobalCluster = cdkBuilder.build()
}
