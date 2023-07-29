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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Settings requried for a slot type based on a grammar that you provide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * GrammarSlotTypeSettingProperty grammarSlotTypeSettingProperty =
 * GrammarSlotTypeSettingProperty.builder()
 * .source(GrammarSlotTypeSourceProperty.builder()
 * .s3BucketName("s3BucketName")
 * .s3ObjectKey("s3ObjectKey")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesetting.html)
 */
@CdkDslMarker
public class CfnBotGrammarSlotTypeSettingPropertyDsl {
    private val cdkBuilder: CfnBot.GrammarSlotTypeSettingProperty.Builder =
        CfnBot.GrammarSlotTypeSettingProperty.builder()

    /** @param source The source of the grammar used to create the slot type. */
    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    /** @param source The source of the grammar used to create the slot type. */
    public fun source(source: CfnBot.GrammarSlotTypeSourceProperty) {
        cdkBuilder.source(source)
    }

    public fun build(): CfnBot.GrammarSlotTypeSettingProperty = cdkBuilder.build()
}
