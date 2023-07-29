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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Snowflake is being used as a destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SnowflakeDestinationPropertiesProperty snowflakeDestinationPropertiesProperty =
 * SnowflakeDestinationPropertiesProperty.builder()
 * .intermediateBucketName("intermediateBucketName")
 * .object("object")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html)
 */
@CdkDslMarker
public class CfnFlowSnowflakeDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.SnowflakeDestinationPropertiesProperty.Builder =
        CfnFlow.SnowflakeDestinationPropertiesProperty.builder()

    /**
     * @param bucketPrefix The object key for the destination bucket in which Amazon AppFlow places
     *   the files.
     */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
     *   when placing data in the Snowflake destination. For example, this setting would determine
     *   if the flow should fail after one insertion error, or continue and attempt to insert every
     *   record regardless of the initial failure. `ErrorHandlingConfig` is a part of the
     *   destination connector details.
     */
    public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    /**
     * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
     *   when placing data in the Snowflake destination. For example, this setting would determine
     *   if the flow should fail after one insertion error, or continue and attempt to insert every
     *   record regardless of the initial failure. `ErrorHandlingConfig` is a part of the
     *   destination connector details.
     */
    public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    /**
     * @param intermediateBucketName The intermediate bucket that Amazon AppFlow uses when moving
     *   data into Snowflake.
     */
    public fun intermediateBucketName(intermediateBucketName: String) {
        cdkBuilder.intermediateBucketName(intermediateBucketName)
    }

    /** @param object The object specified in the Snowflake flow destination. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.SnowflakeDestinationPropertiesProperty = cdkBuilder.build()
}
