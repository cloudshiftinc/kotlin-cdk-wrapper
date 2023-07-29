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
import software.amazon.awscdk.services.lambda.CfnFunction

/**
 * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * SnapStartResponseProperty snapStartResponseProperty = SnapStartResponseProperty.builder()
 * .applyOn("applyOn")
 * .optimizationStatus("optimizationStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html)
 */
@CdkDslMarker
public class CfnFunctionSnapStartResponsePropertyDsl {
    private val cdkBuilder: CfnFunction.SnapStartResponseProperty.Builder =
        CfnFunction.SnapStartResponseProperty.builder()

    /**
     * @param applyOn When set to `PublishedVersions` , Lambda creates a snapshot of the execution
     *   environment when you publish a function version.
     */
    public fun applyOn(applyOn: String) {
        cdkBuilder.applyOn(applyOn)
    }

    /**
     * @param optimizationStatus When you provide a
     *   [qualified Amazon Resource Name (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using)
     *   , this response element indicates whether SnapStart is activated for the specified function
     *   version.
     */
    public fun optimizationStatus(optimizationStatus: String) {
        cdkBuilder.optimizationStatus(optimizationStatus)
    }

    public fun build(): CfnFunction.SnapStartResponseProperty = cdkBuilder.build()
}
