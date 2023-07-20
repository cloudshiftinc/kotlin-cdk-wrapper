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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnTopicRule
import kotlin.String

@CdkDslMarker
public class CfnTopicRuleS3ActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.S3ActionProperty.Builder =
        CfnTopicRule.S3ActionProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.S3ActionProperty = cdkBuilder.build()
}
