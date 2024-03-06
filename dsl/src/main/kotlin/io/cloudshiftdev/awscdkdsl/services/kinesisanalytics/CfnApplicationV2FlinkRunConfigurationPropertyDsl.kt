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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Describes the starting parameters for a Managed Service for Apache Flink application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * FlinkRunConfigurationProperty flinkRunConfigurationProperty =
 * FlinkRunConfigurationProperty.builder()
 * .allowNonRestoredState(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkrunconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2FlinkRunConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.FlinkRunConfigurationProperty.Builder =
        CfnApplicationV2.FlinkRunConfigurationProperty.builder()

    /**
     * @param allowNonRestoredState When restoring from a snapshot, specifies whether the runtime is
     *   allowed to skip a state that cannot be mapped to the new program. This will happen if the
     *   program is updated between snapshots to remove stateful parameters, and state data in the
     *   snapshot no longer corresponds to valid application data. For more information, see
     *   [Allowing Non-Restored State](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state)
     *   in the
     *   [Apache Flink documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
     *   .
     *
     * This value defaults to `false` . If you update your application without specifying this
     * parameter, `AllowNonRestoredState` will be set to `false` , even if it was previously set to
     * `true` .
     */
    public fun allowNonRestoredState(allowNonRestoredState: Boolean) {
        cdkBuilder.allowNonRestoredState(allowNonRestoredState)
    }

    /**
     * @param allowNonRestoredState When restoring from a snapshot, specifies whether the runtime is
     *   allowed to skip a state that cannot be mapped to the new program. This will happen if the
     *   program is updated between snapshots to remove stateful parameters, and state data in the
     *   snapshot no longer corresponds to valid application data. For more information, see
     *   [Allowing Non-Restored State](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state)
     *   in the
     *   [Apache Flink documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
     *   .
     *
     * This value defaults to `false` . If you update your application without specifying this
     * parameter, `AllowNonRestoredState` will be set to `false` , even if it was previously set to
     * `true` .
     */
    public fun allowNonRestoredState(allowNonRestoredState: IResolvable) {
        cdkBuilder.allowNonRestoredState(allowNonRestoredState)
    }

    public fun build(): CfnApplicationV2.FlinkRunConfigurationProperty = cdkBuilder.build()
}
