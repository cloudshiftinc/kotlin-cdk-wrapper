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
 * The text format for the title.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ShortFormatTextProperty shortFormatTextProperty = ShortFormatTextProperty.builder()
 * .plainText("plainText")
 * .richText("richText")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-shortformattext.html)
 */
@CdkDslMarker
public class CfnTemplateShortFormatTextPropertyDsl {
    private val cdkBuilder: CfnTemplate.ShortFormatTextProperty.Builder =
        CfnTemplate.ShortFormatTextProperty.builder()

    /** @param plainText Plain text format. */
    public fun plainText(plainText: String) {
        cdkBuilder.plainText(plainText)
    }

    /** @param richText Rich text. Examples of rich text include bold, underline, and italics. */
    public fun richText(richText: String) {
        cdkBuilder.richText(richText)
    }

    public fun build(): CfnTemplate.ShortFormatTextProperty = cdkBuilder.build()
}
