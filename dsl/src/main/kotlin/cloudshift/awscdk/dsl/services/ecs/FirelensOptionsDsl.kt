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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.FirelensConfigFileType
import software.amazon.awscdk.services.ecs.FirelensOptions

/**
 * The options for firelens log router
 * https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef-customconfig.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * FirelensOptions firelensOptions = FirelensOptions.builder()
 * .configFileType(FirelensConfigFileType.S3)
 * .configFileValue("configFileValue")
 * .enableECSLogMetadata(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class FirelensOptionsDsl {
    private val cdkBuilder: FirelensOptions.Builder = FirelensOptions.builder()

    /**
     * @param configFileType Custom configuration file, s3 or file. Both configFileType and
     *   configFileValue must be used together to define a custom configuration source.
     */
    public fun configFileType(configFileType: FirelensConfigFileType) {
        cdkBuilder.configFileType(configFileType)
    }

    /**
     * @param configFileValue Custom configuration file, S3 ARN or a file path Both configFileType
     *   and configFileValue must be used together to define a custom configuration source.
     */
    public fun configFileValue(configFileValue: String) {
        cdkBuilder.configFileValue(configFileValue)
    }

    /**
     * @param enableEcsLogMetadata By default, Amazon ECS adds additional fields in your log entries
     *   that help identify the source of the logs. You can disable this action by setting
     *   enable-ecs-log-metadata to false.
     */
    public fun enableEcsLogMetadata(enableEcsLogMetadata: Boolean) {
        cdkBuilder.enableEcsLogMetadata(enableEcsLogMetadata)
    }

    public fun build(): FirelensOptions = cdkBuilder.build()
}
