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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * AlexaSkillEventProperty alexaSkillEventProperty = AlexaSkillEventProperty.builder()
 * .skillId("skillId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-alexaskillevent.html)
 */
@CdkDslMarker
public class CfnFunctionAlexaSkillEventPropertyDsl {
    private val cdkBuilder: CfnFunction.AlexaSkillEventProperty.Builder =
        CfnFunction.AlexaSkillEventProperty.builder()

    /** @param skillId the value to be set. */
    public fun skillId(skillId: String) {
        cdkBuilder.skillId(skillId)
    }

    public fun build(): CfnFunction.AlexaSkillEventProperty = cdkBuilder.build()
}
