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
 * The initial capacity configuration per worker.
 *
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

    /**
     * @param key The worker type for an analytics framework. For Spark applications, the key can
     *   either be set to `Driver` or `Executor` . For Hive applications, it can be set to
     *   `HiveDriver` or `TezTask` .
     *
     * *Minimum* : 1
     *
     * *Maximum* : 50
     *
     * *Pattern* : `^[a-zA-Z]+[-_]*[a-zA-Z]+$`
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value for the initial capacity configuration per worker. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The value for the initial capacity configuration per worker. */
    public fun `value`(`value`: CfnApplication.InitialCapacityConfigProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnApplication.InitialCapacityConfigKeyValuePairProperty =
        cdkBuilder.build()
}
