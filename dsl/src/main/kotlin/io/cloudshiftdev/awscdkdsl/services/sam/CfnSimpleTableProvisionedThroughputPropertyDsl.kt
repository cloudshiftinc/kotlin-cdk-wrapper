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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sam.CfnSimpleTable

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * ProvisionedThroughputProperty provisionedThroughputProperty =
 * ProvisionedThroughputProperty.builder()
 * .writeCapacityUnits(123)
 * // the properties below are optional
 * .readCapacityUnits(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-provisionedthroughput.html)
 */
@CdkDslMarker
public class CfnSimpleTableProvisionedThroughputPropertyDsl {
    private val cdkBuilder: CfnSimpleTable.ProvisionedThroughputProperty.Builder =
        CfnSimpleTable.ProvisionedThroughputProperty.builder()

    /** @param readCapacityUnits the value to be set. */
    public fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
    }

    /** @param writeCapacityUnits the value to be set. */
    public fun writeCapacityUnits(writeCapacityUnits: Number) {
        cdkBuilder.writeCapacityUnits(writeCapacityUnits)
    }

    public fun build(): CfnSimpleTable.ProvisionedThroughputProperty = cdkBuilder.build()
}
