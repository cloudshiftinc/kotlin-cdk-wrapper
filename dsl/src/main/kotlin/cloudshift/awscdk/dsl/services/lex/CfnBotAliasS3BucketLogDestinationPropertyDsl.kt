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
import software.amazon.awscdk.services.lex.CfnBotAlias
import kotlin.String

@CdkDslMarker
public class CfnBotAliasS3BucketLogDestinationPropertyDsl {
    private val cdkBuilder: CfnBotAlias.S3BucketLogDestinationProperty.Builder =
        CfnBotAlias.S3BucketLogDestinationProperty.builder()

    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun logPrefix(logPrefix: String) {
        cdkBuilder.logPrefix(logPrefix)
    }

    public fun s3BucketArn(s3BucketArn: String) {
        cdkBuilder.s3BucketArn(s3BucketArn)
    }

    public fun build(): CfnBotAlias.S3BucketLogDestinationProperty = cdkBuilder.build()
}
