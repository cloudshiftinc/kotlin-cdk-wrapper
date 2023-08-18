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
 * The options that determine the thousands separator configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ThousandSeparatorOptionsProperty thousandSeparatorOptionsProperty =
 * ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-thousandseparatoroptions.html)
 */
@CdkDslMarker
public class CfnTemplateThousandSeparatorOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.ThousandSeparatorOptionsProperty.Builder =
        CfnTemplate.ThousandSeparatorOptionsProperty.builder()

    /** @param symbol Determines the thousands separator symbol. */
    public fun symbol(symbol: String) {
        cdkBuilder.symbol(symbol)
    }

    /** @param visibility Determines the visibility of the thousands separator. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.ThousandSeparatorOptionsProperty = cdkBuilder.build()
}
