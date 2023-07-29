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
import software.amazon.awscdk.services.rds.MariaDbEngineVersion
import software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps

/**
 * Properties for MariaDB instance engines.
 *
 * Used in `DatabaseInstanceEngine.mariaDb`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * MariaDbEngineVersion mariaDbEngineVersion;
 * MariaDbInstanceEngineProps mariaDbInstanceEngineProps = MariaDbInstanceEngineProps.builder()
 * .version(mariaDbEngineVersion)
 * .build();
 * ```
 */
@CdkDslMarker
public class MariaDbInstanceEnginePropsDsl {
    private val cdkBuilder: MariaDbInstanceEngineProps.Builder =
        MariaDbInstanceEngineProps.builder()

    /** @param version The exact version of the engine to use. */
    public fun version(version: MariaDbEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): MariaDbInstanceEngineProps = cdkBuilder.build()
}
