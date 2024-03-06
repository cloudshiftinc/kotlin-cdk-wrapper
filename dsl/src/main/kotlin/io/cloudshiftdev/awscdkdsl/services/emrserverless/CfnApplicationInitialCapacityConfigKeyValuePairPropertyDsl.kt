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

package io.cloudshiftdev.awscdkdsl.services.emrserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * InitialCapacityConfigKeyValuePairProperty initialCapacityConfigKeyValuePairProperty =
 * InitialCapacityConfigKeyValuePairProperty.builder()
 * .key("key")
 * .value(InitialCapacityConfigProperty.builder()
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .cpu("cpu")
 * .memory("memory")
 * // the properties below are optional
 * .disk("disk")
 * .build())
 * .workerCount(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfigkeyvaluepair.html)
 */
@CdkDslMarker
public class CfnApplicationInitialCapacityConfigKeyValuePairPropertyDsl {
    private val cdkBuilder: CfnApplication.InitialCapacityConfigKeyValuePairProperty.Builder =
        CfnApplication.InitialCapacityConfigKeyValuePairProperty.builder()

    /** @param key Worker type for an analytics framework. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value the value to be set. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value the value to be set. */
    public fun `value`(`value`: CfnApplication.InitialCapacityConfigProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnApplication.InitialCapacityConfigKeyValuePairProperty =
        cdkBuilder.build()
}
