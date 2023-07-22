@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.MySqlInstanceEngineProps
import software.amazon.awscdk.services.rds.MysqlEngineVersion

/**
 * Properties for MySQL instance engines.
 *
 * Used in `DatabaseInstanceEngine.mysql`.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseInstance iopsInstance = DatabaseInstance.Builder.create(this, "IopsInstance")
 * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_30).build()))
 * .vpc(vpc)
 * .storageType(StorageType.IO1)
 * .iops(5000)
 * .build();
 * DatabaseInstance gp3Instance = DatabaseInstance.Builder.create(this, "Gp3Instance")
 * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_30).build()))
 * .vpc(vpc)
 * .allocatedStorage(500)
 * .storageType(StorageType.GP3)
 * .storageThroughput(500)
 * .build();
 * ```
 */
@CdkDslMarker
public class MySqlInstanceEnginePropsDsl {
  private val cdkBuilder: MySqlInstanceEngineProps.Builder = MySqlInstanceEngineProps.builder()

  /**
   * @param version The exact version of the engine to use. 
   */
  public fun version(version: MysqlEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): MySqlInstanceEngineProps = cdkBuilder.build()
}
