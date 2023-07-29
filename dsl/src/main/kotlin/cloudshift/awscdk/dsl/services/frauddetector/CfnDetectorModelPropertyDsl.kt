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

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.frauddetector.CfnDetector

/**
 * A model to associate with a detector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.frauddetector.*;
 * ModelProperty modelProperty = ModelProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-model.html)
 */
@CdkDslMarker
public class CfnDetectorModelPropertyDsl {
    private val cdkBuilder: CfnDetector.ModelProperty.Builder = CfnDetector.ModelProperty.builder()

    /** @param arn the value to be set. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnDetector.ModelProperty = cdkBuilder.build()
}
