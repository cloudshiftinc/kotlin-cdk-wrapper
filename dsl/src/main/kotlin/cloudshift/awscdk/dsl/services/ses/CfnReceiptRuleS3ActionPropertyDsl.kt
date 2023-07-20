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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.CfnReceiptRule
import kotlin.String

@CdkDslMarker
public class CfnReceiptRuleS3ActionPropertyDsl {
    private val cdkBuilder: CfnReceiptRule.S3ActionProperty.Builder =
        CfnReceiptRule.S3ActionProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun objectKeyPrefix(objectKeyPrefix: String) {
        cdkBuilder.objectKeyPrefix(objectKeyPrefix)
    }

    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnReceiptRule.S3ActionProperty = cdkBuilder.build()
}
