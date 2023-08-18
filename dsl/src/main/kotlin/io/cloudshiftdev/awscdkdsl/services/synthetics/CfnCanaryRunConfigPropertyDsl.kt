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

package io.cloudshiftdev.awscdkdsl.services.synthetics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.synthetics.CfnCanary

/**
 * A structure that contains input information for a canary run.
 *
 * This structure is required.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.synthetics.*;
 * RunConfigProperty runConfigProperty = RunConfigProperty.builder()
 * .activeTracing(false)
 * .environmentVariables(Map.of(
 * "environmentVariablesKey", "environmentVariables"))
 * .memoryInMb(123)
 * .timeoutInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html)
 */
@CdkDslMarker
public class CfnCanaryRunConfigPropertyDsl {
    private val cdkBuilder: CfnCanary.RunConfigProperty.Builder =
        CfnCanary.RunConfigProperty.builder()

    /**
     * @param activeTracing Specifies whether this canary is to use active AWS X-Ray tracing when it
     *   runs. Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray
     *   service maps even if the canary does not hit an endpoint that has X-Ray tracing enabled.
     *   Using X-Ray tracing incurs charges. For more information, see
     *   [Canaries and X-Ray tracing](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
     *   .
     *
     * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
     * for their canary runtime.
     */
    public fun activeTracing(activeTracing: Boolean) {
        cdkBuilder.activeTracing(activeTracing)
    }

    /**
     * @param activeTracing Specifies whether this canary is to use active AWS X-Ray tracing when it
     *   runs. Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray
     *   service maps even if the canary does not hit an endpoint that has X-Ray tracing enabled.
     *   Using X-Ray tracing incurs charges. For more information, see
     *   [Canaries and X-Ray tracing](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
     *   .
     *
     * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
     * for their canary runtime.
     */
    public fun activeTracing(activeTracing: IResolvable) {
        cdkBuilder.activeTracing(activeTracing)
    }

    /**
     * @param environmentVariables Specifies the keys and values to use for any environment
     *   variables used in the canary script. Use the following format:
     *
     * { "key1" : "value1", "key2" : "value2", ...}
     *
     * Keys must start with a letter and be at least two characters. The total size of your
     * environment variables cannot exceed 4 KB. You can't specify any Lambda reserved environment
     * variables as the keys for your environment variables. For more information about reserved
     * keys, see
     * [Runtime environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime)
     * .
     */
    public fun environmentVariables(environmentVariables: Map<String, String>) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param environmentVariables Specifies the keys and values to use for any environment
     *   variables used in the canary script. Use the following format:
     *
     * { "key1" : "value1", "key2" : "value2", ...}
     *
     * Keys must start with a letter and be at least two characters. The total size of your
     * environment variables cannot exceed 4 KB. You can't specify any Lambda reserved environment
     * variables as the keys for your environment variables. For more information about reserved
     * keys, see
     * [Runtime environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime)
     * .
     */
    public fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param memoryInMb The maximum amount of memory that the canary can use while running. This
     *   value must be a multiple of 64. The range is 960 to 3008.
     */
    public fun memoryInMb(memoryInMb: Number) {
        cdkBuilder.memoryInMb(memoryInMb)
    }

    /**
     * @param timeoutInSeconds How long the canary is allowed to run before it must stop. You can't
     *   set this time to be longer than the frequency of the runs of this canary.
     *
     * If you omit this field, the frequency of the canary is used as this value, up to a maximum of
     * 900 seconds.
     */
    public fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): CfnCanary.RunConfigProperty = cdkBuilder.build()
}
