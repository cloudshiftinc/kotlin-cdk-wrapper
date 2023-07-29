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
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Slack is being used as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SlackSourcePropertiesProperty slackSourcePropertiesProperty =
 * SlackSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-slacksourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowSlackSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.SlackSourcePropertiesProperty.Builder =
        CfnFlow.SlackSourcePropertiesProperty.builder()

    /** @param object The object specified in the Slack flow source. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.SlackSourcePropertiesProperty = cdkBuilder.build()
}
