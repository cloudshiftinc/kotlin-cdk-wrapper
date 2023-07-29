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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.DataProtectionPolicyConfig

/**
 * Interface representing a data protection policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * Object statement;
 * DataProtectionPolicyConfig dataProtectionPolicyConfig = DataProtectionPolicyConfig.builder()
 * .description("description")
 * .name("name")
 * .statement(statement)
 * .version("version")
 * .build();
 * ```
 */
@CdkDslMarker
public class DataProtectionPolicyConfigDsl {
    private val cdkBuilder: DataProtectionPolicyConfig.Builder =
        DataProtectionPolicyConfig.builder()

    /** @param description Description of the data protection policy. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name Name of the data protection policy. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param statement Statements within the data protection policy. Must contain one Audit and one
     *   Redact statement
     */
    public fun statement(statement: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(statement)
        cdkBuilder.statement(builder.map)
    }

    /**
     * @param statement Statements within the data protection policy. Must contain one Audit and one
     *   Redact statement
     */
    public fun statement(statement: Any) {
        cdkBuilder.statement(statement)
    }

    /** @param version Version of the data protection policy. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): DataProtectionPolicyConfig = cdkBuilder.build()
}
