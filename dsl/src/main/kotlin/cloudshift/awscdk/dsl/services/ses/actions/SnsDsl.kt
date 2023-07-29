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

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.actions.EmailEncoding
import software.amazon.awscdk.services.ses.actions.Sns
import software.amazon.awscdk.services.sns.ITopic

/**
 * Publishes the email content within a notification to Amazon SNS.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.ses.actions.*;
 * Bucket bucket = new Bucket(this, "Bucket");
 * Topic topic = new Topic(this, "Topic");
 * ReceiptRuleSet.Builder.create(this, "RuleSet")
 * .rules(List.of(ReceiptRuleOptions.builder()
 * .recipients(List.of("hello&#64;aws.com"))
 * .actions(List.of(
 * AddHeader.Builder.create()
 * .name("X-Special-Header")
 * .value("aws")
 * .build(),
 * S3.Builder.create()
 * .bucket(bucket)
 * .objectKeyPrefix("emails/")
 * .topic(topic)
 * .build()))
 * .build(), ReceiptRuleOptions.builder()
 * .recipients(List.of("aws.com"))
 * .actions(List.of(
 * Sns.Builder.create()
 * .topic(topic)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class SnsDsl {
    private val cdkBuilder: Sns.Builder = Sns.Builder.create()

    /**
     * The encoding to use for the email within the Amazon SNS notification.
     *
     * Default: UTF-8
     *
     * @param encoding The encoding to use for the email within the Amazon SNS notification.
     */
    public fun encoding(encoding: EmailEncoding) {
        cdkBuilder.encoding(encoding)
    }

    /**
     * The SNS topic to notify.
     *
     * @param topic The SNS topic to notify.
     */
    public fun topic(topic: ITopic) {
        cdkBuilder.topic(topic)
    }

    public fun build(): Sns = cdkBuilder.build()
}
