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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The text format for a subtitle.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LongFormatTextProperty longFormatTextProperty = LongFormatTextProperty.builder()
 * .plainText("plainText")
 * .richText("richText")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-longformattext.html)
 */
@CdkDslMarker
public class CfnAnalysisLongFormatTextPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LongFormatTextProperty.Builder =
        CfnAnalysis.LongFormatTextProperty.builder()

    /** @param plainText Plain text format. */
    public fun plainText(plainText: String) {
        cdkBuilder.plainText(plainText)
    }

    /** @param richText Rich text. Examples of rich text include bold, underline, and italics. */
    public fun richText(richText: String) {
        cdkBuilder.richText(richText)
    }

    public fun build(): CfnAnalysis.LongFormatTextProperty = cdkBuilder.build()
}
