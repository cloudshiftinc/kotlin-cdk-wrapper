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
 * The properties that Amazon AppFlow applies when you use Marketo as a flow destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * MarketoDestinationPropertiesProperty marketoDestinationPropertiesProperty =
 * MarketoDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketodestinationproperties.html)
 */
@CdkDslMarker
public class CfnFlowMarketoDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.MarketoDestinationPropertiesProperty.Builder =
        CfnFlow.MarketoDestinationPropertiesProperty.builder()

    /**
     * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
     *   when placing data in the destination. For example, this setting would determine if the flow
     *   should fail after one insertion error, or continue and attempt to insert every record
     *   regardless of the initial failure. `ErrorHandlingConfig` is a part of the destination
     *   connector details.
     */
    public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    /**
     * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
     *   when placing data in the destination. For example, this setting would determine if the flow
     *   should fail after one insertion error, or continue and attempt to insert every record
     *   regardless of the initial failure. `ErrorHandlingConfig` is a part of the destination
     *   connector details.
     */
    public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    /** @param object The object specified in the Marketo flow destination. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.MarketoDestinationPropertiesProperty = cdkBuilder.build()
}
