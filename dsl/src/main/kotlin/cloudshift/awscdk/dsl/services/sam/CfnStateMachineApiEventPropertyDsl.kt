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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * ApiEventProperty apiEventProperty = ApiEventProperty.builder()
 * .method("method")
 * .path("path")
 * // the properties below are optional
 * .restApiId("restApiId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-apievent.html)
 */
@CdkDslMarker
public class CfnStateMachineApiEventPropertyDsl {
    private val cdkBuilder: CfnStateMachine.ApiEventProperty.Builder =
        CfnStateMachine.ApiEventProperty.builder()

    /** @param method the value to be set. */
    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    /** @param path the value to be set. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /** @param restApiId the value to be set. */
    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun build(): CfnStateMachine.ApiEventProperty = cdkBuilder.build()
}
