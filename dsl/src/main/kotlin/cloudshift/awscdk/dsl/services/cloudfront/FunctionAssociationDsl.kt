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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.FunctionAssociation
import software.amazon.awscdk.services.cloudfront.FunctionEventType
import software.amazon.awscdk.services.cloudfront.IFunction

/**
 * Represents a CloudFront function and event type when using CF Functions.
 *
 * The type of the `AddBehaviorOptions.functionAssociations` property.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * Function function_;
 * FunctionAssociation functionAssociation = FunctionAssociation.builder()
 * .eventType(FunctionEventType.VIEWER_REQUEST)
 * .function(function_)
 * .build();
 * ```
 */
@CdkDslMarker
public class FunctionAssociationDsl {
    private val cdkBuilder: FunctionAssociation.Builder = FunctionAssociation.builder()

    /** @param eventType The type of event which should invoke the function. */
    public fun eventType(eventType: FunctionEventType) {
        cdkBuilder.eventType(eventType)
    }

    /** @param function The CloudFront function that will be invoked. */
    public fun function(function: IFunction) {
        cdkBuilder.function(function)
    }

    public fun build(): FunctionAssociation = cdkBuilder.build()
}
