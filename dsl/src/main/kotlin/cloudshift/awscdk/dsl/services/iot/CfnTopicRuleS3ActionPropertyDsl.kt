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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action to write data to an Amazon S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * S3ActionProperty s3ActionProperty = S3ActionProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .cannedAcl("cannedAcl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html)
 */
@CdkDslMarker
public class CfnTopicRuleS3ActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.S3ActionProperty.Builder =
        CfnTopicRule.S3ActionProperty.builder()

    /** @param bucketName The Amazon S3 bucket. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param cannedAcl The Amazon S3 canned ACL that controls access to the object identified by
     *   the object key. For more information, see
     *   [S3 canned ACLs](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl)
     *   .
     */
    public fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
    }

    /**
     * @param key The object key. For more information, see
     *   [Actions, resources, and condition keys for Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/list_amazons3.html)
     *   .
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param roleArn The ARN of the IAM role that grants access. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.S3ActionProperty = cdkBuilder.build()
}
