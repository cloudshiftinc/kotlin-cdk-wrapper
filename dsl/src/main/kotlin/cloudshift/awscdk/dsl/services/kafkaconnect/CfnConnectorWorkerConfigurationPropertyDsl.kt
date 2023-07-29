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

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * The configuration of the workers, which are the processes that run the connector logic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * WorkerConfigurationProperty workerConfigurationProperty = WorkerConfigurationProperty.builder()
 * .revision(123)
 * .workerConfigurationArn("workerConfigurationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-workerconfiguration.html)
 */
@CdkDslMarker
public class CfnConnectorWorkerConfigurationPropertyDsl {
    private val cdkBuilder: CfnConnector.WorkerConfigurationProperty.Builder =
        CfnConnector.WorkerConfigurationProperty.builder()

    /** @param revision The revision of the worker configuration. */
    public fun revision(revision: Number) {
        cdkBuilder.revision(revision)
    }

    /** @param workerConfigurationArn The Amazon Resource Name (ARN) of the worker configuration. */
    public fun workerConfigurationArn(workerConfigurationArn: String) {
        cdkBuilder.workerConfigurationArn(workerConfigurationArn)
    }

    public fun build(): CfnConnector.WorkerConfigurationProperty = cdkBuilder.build()
}
