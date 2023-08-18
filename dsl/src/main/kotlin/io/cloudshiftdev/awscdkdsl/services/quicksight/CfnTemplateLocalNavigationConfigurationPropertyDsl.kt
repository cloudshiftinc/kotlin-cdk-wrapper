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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The navigation configuration for `CustomActionNavigationOperation` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LocalNavigationConfigurationProperty localNavigationConfigurationProperty =
 * LocalNavigationConfigurationProperty.builder()
 * .targetSheetId("targetSheetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-localnavigationconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateLocalNavigationConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.LocalNavigationConfigurationProperty.Builder =
        CfnTemplate.LocalNavigationConfigurationProperty.builder()

    /** @param targetSheetId The sheet that is targeted for navigation in the same analysis. */
    public fun targetSheetId(targetSheetId: String) {
        cdkBuilder.targetSheetId(targetSheetId)
    }

    public fun build(): CfnTemplate.LocalNavigationConfigurationProperty = cdkBuilder.build()
}
