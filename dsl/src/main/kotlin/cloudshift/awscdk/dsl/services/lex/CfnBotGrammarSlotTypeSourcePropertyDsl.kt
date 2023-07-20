@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.String

@CdkDslMarker
public class CfnBotGrammarSlotTypeSourcePropertyDsl {
    private val cdkBuilder: CfnBot.GrammarSlotTypeSourceProperty.Builder =
        CfnBot.GrammarSlotTypeSourceProperty.builder()

    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    public fun s3ObjectKey(s3ObjectKey: String) {
        cdkBuilder.s3ObjectKey(s3ObjectKey)
    }

    public fun build(): CfnBot.GrammarSlotTypeSourceProperty = cdkBuilder.build()
}
