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
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBInstance

/**
 * The `ProcessorFeature` property type specifies the processor features of a DB instance class
 * status.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * ProcessorFeatureProperty processorFeatureProperty = ProcessorFeatureProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-processorfeature.html)
 */
@CdkDslMarker
public class CfnDBInstanceProcessorFeaturePropertyDsl {
    private val cdkBuilder: CfnDBInstance.ProcessorFeatureProperty.Builder =
        CfnDBInstance.ProcessorFeatureProperty.builder()

    /**
     * @param name The name of the processor feature. Valid names are `coreCount` and
     *   `threadsPerCore` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value of a processor feature name. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDBInstance.ProcessorFeatureProperty = cdkBuilder.build()
}
