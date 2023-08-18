@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.rds.OracleEngineVersion
import software.amazon.awscdk.services.rds.OracleSe2CdbInstanceEngineProps

/**
 * Properties for Oracle Standard Edition 2 (CDB) instance engines.
 *
 * Used in `DatabaseInstanceEngine.oracleSe2Cdb`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * OracleEngineVersion oracleEngineVersion;
 * OracleSe2CdbInstanceEngineProps oracleSe2CdbInstanceEngineProps =
 * OracleSe2CdbInstanceEngineProps.builder()
 * .version(oracleEngineVersion)
 * .build();
 * ```
 */
@CdkDslMarker
public class OracleSe2CdbInstanceEnginePropsDsl {
    private val cdkBuilder: OracleSe2CdbInstanceEngineProps.Builder =
        OracleSe2CdbInstanceEngineProps.builder()

    /** @param version The exact version of the engine to use. */
    public fun version(version: OracleEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): OracleSe2CdbInstanceEngineProps = cdkBuilder.build()
}
