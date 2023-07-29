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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps
import software.amazon.awscdk.services.rds.OracleEngineVersion

/**
 * Properties for Oracle Enterprise Edition instance engines.
 *
 * Used in `DatabaseInstanceEngine.oracleEe`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * OracleEngineVersion oracleEngineVersion;
 * OracleEeInstanceEngineProps oracleEeInstanceEngineProps = OracleEeInstanceEngineProps.builder()
 * .version(oracleEngineVersion)
 * .build();
 * ```
 */
@CdkDslMarker
public class OracleEeInstanceEnginePropsDsl {
    private val cdkBuilder: OracleEeInstanceEngineProps.Builder =
        OracleEeInstanceEngineProps.builder()

    /** @param version The exact version of the engine to use. */
    public fun version(version: OracleEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): OracleEeInstanceEngineProps = cdkBuilder.build()
}
