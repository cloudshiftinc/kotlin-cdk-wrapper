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
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
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
     * @param cpu Per worker CPU resource. vCPU is the only supported unit and specifying vCPU is
     *   optional.
     */
    public fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * @param disk Per worker Disk resource. GB is the only supported unit and specifying GB is
     *   optional
     */
    public fun disk(disk: String) {
        cdkBuilder.disk(disk)
    }

    /**
     * @param memory Per worker memory resource. GB is the only supported unit and specifying GB is
     *   optional.
     */
    public fun memory(memory: String) {
        cdkBuilder.memory(memory)
    }

    public fun build(): CfnApplication.WorkerConfigurationProperty = cdkBuilder.build()
}
