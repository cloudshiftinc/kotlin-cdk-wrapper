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

package io.cloudshiftdev.awscdkdsl.services.lex

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Determines whether Amazon Lex obscures slot values in conversation logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * ObfuscationSettingProperty obfuscationSettingProperty = ObfuscationSettingProperty.builder()
 * .obfuscationSettingType("obfuscationSettingType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-obfuscationsetting.html)
 */
@CdkDslMarker
public class CfnBotObfuscationSettingPropertyDsl {
    private val cdkBuilder: CfnBot.ObfuscationSettingProperty.Builder =
        CfnBot.ObfuscationSettingProperty.builder()

    /**
     * @param obfuscationSettingType Value that determines whether Amazon Lex obscures slot values
     *   in conversation logs. The default is to obscure the values.
     */
    public fun obfuscationSettingType(obfuscationSettingType: String) {
        cdkBuilder.obfuscationSettingType(obfuscationSettingType)
    }

    public fun build(): CfnBot.ObfuscationSettingProperty = cdkBuilder.build()
}
