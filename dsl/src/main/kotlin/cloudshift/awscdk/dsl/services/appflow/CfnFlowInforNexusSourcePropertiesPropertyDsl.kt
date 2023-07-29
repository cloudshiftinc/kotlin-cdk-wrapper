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
 * The properties that are applied when Infor Nexus is being used as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * InforNexusSourcePropertiesProperty inforNexusSourcePropertiesProperty =
 * InforNexusSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-infornexussourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowInforNexusSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.InforNexusSourcePropertiesProperty.Builder =
        CfnFlow.InforNexusSourcePropertiesProperty.builder()

    /** @param object The object specified in the Infor Nexus flow source. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.InforNexusSourcePropertiesProperty = cdkBuilder.build()
}
