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
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Describes the Amazon S3 bucket name and location for the grammar that is the source for the slot
 * type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * GrammarSlotTypeSourceProperty grammarSlotTypeSourceProperty =
 * GrammarSlotTypeSourceProperty.builder()
 * .s3BucketName("s3BucketName")
 * .s3ObjectKey("s3ObjectKey")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-grammarslottypesource.html)
 */
@CdkDslMarker
public class CfnBotGrammarSlotTypeSourcePropertyDsl {
    private val cdkBuilder: CfnBot.GrammarSlotTypeSourceProperty.Builder =
        CfnBot.GrammarSlotTypeSourceProperty.builder()

    /** @param kmsKeyArn The AWS KMS key required to decrypt the contents of the grammar, if any. */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /** @param s3BucketName The name of the Amazon S3 bucket that contains the grammar source. */
    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    /** @param s3ObjectKey The path to the grammar in the Amazon S3 bucket. */
    public fun s3ObjectKey(s3ObjectKey: String) {
        cdkBuilder.s3ObjectKey(s3ObjectKey)
    }

    public fun build(): CfnBot.GrammarSlotTypeSourceProperty = cdkBuilder.build()
}
