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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TypographyProperty typographyProperty = TypographyProperty.builder()
 * .fontFamilies(List.of(FontProperty.builder()
 * .fontFamily("fontFamily")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-typography.html)
 */
@CdkDslMarker
public class CfnThemeTypographyPropertyDsl {
    private val cdkBuilder: CfnTheme.TypographyProperty.Builder =
        CfnTheme.TypographyProperty.builder()

    private val _fontFamilies: MutableList<Any> = mutableListOf()

    /** @param fontFamilies the value to be set. */
    public fun fontFamilies(vararg fontFamilies: Any) {
        _fontFamilies.addAll(listOf(*fontFamilies))
    }

    /** @param fontFamilies the value to be set. */
    public fun fontFamilies(fontFamilies: Collection<Any>) {
        _fontFamilies.addAll(fontFamilies)
    }

    /** @param fontFamilies the value to be set. */
    public fun fontFamilies(fontFamilies: IResolvable) {
        cdkBuilder.fontFamilies(fontFamilies)
    }

    public fun build(): CfnTheme.TypographyProperty {
        if (_fontFamilies.isNotEmpty()) cdkBuilder.fontFamilies(_fontFamilies)
        return cdkBuilder.build()
    }
}
