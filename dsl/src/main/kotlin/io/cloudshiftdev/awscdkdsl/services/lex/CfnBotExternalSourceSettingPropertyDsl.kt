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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Provides information about the external source of the slot type's definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * ExternalSourceSettingProperty externalSourceSettingProperty =
 * ExternalSourceSettingProperty.builder()
 * .grammarSlotTypeSetting(GrammarSlotTypeSettingProperty.builder()
 * .source(GrammarSlotTypeSourceProperty.builder()
 * .s3BucketName("s3BucketName")
 * .s3ObjectKey("s3ObjectKey")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-externalsourcesetting.html)
 */
@CdkDslMarker
public class CfnBotExternalSourceSettingPropertyDsl {
    private val cdkBuilder: CfnBot.ExternalSourceSettingProperty.Builder =
        CfnBot.ExternalSourceSettingProperty.builder()

    /**
     * @param grammarSlotTypeSetting Settings required for a slot type based on a grammar that you
     *   provide.
     */
    public fun grammarSlotTypeSetting(grammarSlotTypeSetting: IResolvable) {
        cdkBuilder.grammarSlotTypeSetting(grammarSlotTypeSetting)
    }

    /**
     * @param grammarSlotTypeSetting Settings required for a slot type based on a grammar that you
     *   provide.
     */
    public fun grammarSlotTypeSetting(
        grammarSlotTypeSetting: CfnBot.GrammarSlotTypeSettingProperty
    ) {
        cdkBuilder.grammarSlotTypeSetting(grammarSlotTypeSetting)
    }

    public fun build(): CfnBot.ExternalSourceSettingProperty = cdkBuilder.build()
}
