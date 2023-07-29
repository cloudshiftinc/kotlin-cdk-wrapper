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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig

/**
 * A destination for events that were processed successfully.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * OnSuccessProperty onSuccessProperty = OnSuccessProperty.builder()
 * .destination("destination")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-onsuccess.html)
 */
@CdkDslMarker
public class CfnEventInvokeConfigOnSuccessPropertyDsl {
    private val cdkBuilder: CfnEventInvokeConfig.OnSuccessProperty.Builder =
        CfnEventInvokeConfig.OnSuccessProperty.builder()

    /** @param destination The Amazon Resource Name (ARN) of the destination resource. */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun build(): CfnEventInvokeConfig.OnSuccessProperty = cdkBuilder.build()
}
