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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Describes parameters for how a Flink-based Kinesis Data Analytics application executes multiple
 * tasks simultaneously.
 *
 * For more information about parallelism, see
 * [Parallel Execution](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/dev/parallel.html)
 * in the
 * [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * ParallelismConfigurationProperty parallelismConfigurationProperty =
 * ParallelismConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .autoScalingEnabled(false)
 * .parallelism(123)
 * .parallelismPerKpu(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2ParallelismConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.ParallelismConfigurationProperty.Builder =
        CfnApplicationV2.ParallelismConfigurationProperty.builder()

    /**
     * @param autoScalingEnabled Describes whether the Kinesis Data Analytics service can increase
     *   the parallelism of the application in response to increased throughput.
     */
    public fun autoScalingEnabled(autoScalingEnabled: Boolean) {
        cdkBuilder.autoScalingEnabled(autoScalingEnabled)
    }

    /**
     * @param autoScalingEnabled Describes whether the Kinesis Data Analytics service can increase
     *   the parallelism of the application in response to increased throughput.
     */
    public fun autoScalingEnabled(autoScalingEnabled: IResolvable) {
        cdkBuilder.autoScalingEnabled(autoScalingEnabled)
    }

    /**
     * @param configurationType Describes whether the application uses the default parallelism for
     *   the Kinesis Data Analytics service. You must set this property to `CUSTOM` in order to
     *   change your application's `AutoScalingEnabled` , `Parallelism` , or `ParallelismPerKPU`
     *   properties.
     */
    public fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
    }

    /**
     * @param parallelism Describes the initial number of parallel tasks that a Java-based Kinesis
     *   Data Analytics application can perform. The Kinesis Data Analytics service can increase
     *   this number automatically if
     *   [ParallelismConfiguration:AutoScalingEnabled](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_ParallelismConfiguration.html#kinesisanalytics-Type-ParallelismConfiguration-AutoScalingEnabled.html)
     *   is set to `true` .
     */
    public fun parallelism(parallelism: Number) {
        cdkBuilder.parallelism(parallelism)
    }

    /**
     * @param parallelismPerKpu Describes the number of parallel tasks that a Java-based Kinesis
     *   Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the
     *   application. For more information about KPUs, see
     *   [Amazon Kinesis Data Analytics Pricing](https://docs.aws.amazon.com/kinesis/data-analytics/pricing/)
     *   .
     */
    public fun parallelismPerKpu(parallelismPerKpu: Number) {
        cdkBuilder.parallelismPerKpu(parallelismPerKpu)
    }

    public fun build(): CfnApplicationV2.ParallelismConfigurationProperty = cdkBuilder.build()
}
