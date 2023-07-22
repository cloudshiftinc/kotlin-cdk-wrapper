@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.OracleEngineVersion
import software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps

/**
 * Properties for Oracle Standard Edition 2 instance engines.
 *
 * Used in `DatabaseInstanceEngine.oracleSe2`.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseInstance instance = DatabaseInstance.Builder.create(this, "Instance")
 * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
 * // optional, defaults to m5.large
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
 * .credentials(Credentials.fromGeneratedSecret("syscdk")) // Optional - will default to 'admin'
 * username and generated password
 * .vpc(vpc)
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class OracleSe2InstanceEnginePropsDsl {
  private val cdkBuilder: OracleSe2InstanceEngineProps.Builder =
      OracleSe2InstanceEngineProps.builder()

  /**
   * @param version The exact version of the engine to use. 
   */
  public fun version(version: OracleEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): OracleSe2InstanceEngineProps = cdkBuilder.build()
}
