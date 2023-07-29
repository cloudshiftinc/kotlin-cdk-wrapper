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

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * The resource configuration of the initial capacity configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * WorkerConfigurationProperty workerConfigurationProperty = WorkerConfigurationProperty.builder()
 * .cpu("cpu")
 * .memory("memory")
 * // the properties below are optional
 * .disk("disk")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workerconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationWorkerConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.WorkerConfigurationProperty.Builder =
        CfnApplication.WorkerConfigurationProperty.builder()

    /**
     * @param cpu *Minimum* : 1. *Maximum* : 15
     *
     * *Pattern* : `^[1-9][0-9]*(\\s)?(vCPU|vcpu|VCPU)?$`
     */
    public fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * @param disk *Minimum* : 1. *Maximum* : 15
     *
     * *Pattern* : `^[1-9][0-9]*(\\s)?(GB|gb|gB|Gb)$"`
     */
    public fun disk(disk: String) {
        cdkBuilder.disk(disk)
    }

    /**
     * @param memory *Minimum* : 1. *Maximum* : 15
     *
     * *Pattern* : `^[1-9][0-9]*(\\s)?(GB|gb|gB|Gb)?$`
     */
    public fun memory(memory: String) {
        cdkBuilder.memory(memory)
    }

    public fun build(): CfnApplication.WorkerConfigurationProperty = cdkBuilder.build()
}
