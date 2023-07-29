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
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * HooksProperty hooksProperty = HooksProperty.builder()
 * .postTraffic("postTraffic")
 * .preTraffic("preTraffic")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-hooks.html)
 */
@CdkDslMarker
public class CfnFunctionHooksPropertyDsl {
    private val cdkBuilder: CfnFunction.HooksProperty.Builder = CfnFunction.HooksProperty.builder()

    /** @param postTraffic the value to be set. */
    public fun postTraffic(postTraffic: String) {
        cdkBuilder.postTraffic(postTraffic)
    }

    /** @param preTraffic the value to be set. */
    public fun preTraffic(preTraffic: String) {
        cdkBuilder.preTraffic(preTraffic)
    }

    public fun build(): CfnFunction.HooksProperty = cdkBuilder.build()
}
