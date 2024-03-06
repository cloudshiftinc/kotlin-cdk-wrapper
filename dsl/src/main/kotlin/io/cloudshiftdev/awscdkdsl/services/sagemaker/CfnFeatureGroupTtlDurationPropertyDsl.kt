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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

/**
 * Time to live duration, where the record is hard deleted after the expiration time is reached;
 *
 * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
 * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
 * API in the Amazon SageMaker API Reference guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * TtlDurationProperty ttlDurationProperty = TtlDurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-ttlduration.html)
 */
@CdkDslMarker
public class CfnFeatureGroupTtlDurationPropertyDsl {
    private val cdkBuilder: CfnFeatureGroup.TtlDurationProperty.Builder =
        CfnFeatureGroup.TtlDurationProperty.builder()

    /** @param unit `TtlDuration` time unit. */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    /** @param value `TtlDuration` time value. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnFeatureGroup.TtlDurationProperty = cdkBuilder.build()
}
