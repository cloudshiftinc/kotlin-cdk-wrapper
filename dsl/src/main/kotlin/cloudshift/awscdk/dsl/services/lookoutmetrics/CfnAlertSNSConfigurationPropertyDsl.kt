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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert

/**
 * Contains information about the SNS topic to which you want to send your alerts and the IAM role
 * that has access to that topic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * SNSConfigurationProperty sNSConfigurationProperty = SNSConfigurationProperty.builder()
 * .roleArn("roleArn")
 * .snsTopicArn("snsTopicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-snsconfiguration.html)
 */
@CdkDslMarker
public class CfnAlertSNSConfigurationPropertyDsl {
    private val cdkBuilder: CfnAlert.SNSConfigurationProperty.Builder =
        CfnAlert.SNSConfigurationProperty.builder()

    /** @param roleArn The ARN of the IAM role that has access to the target SNS topic. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param snsTopicArn The ARN of the target SNS topic. */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): CfnAlert.SNSConfigurationProperty = cdkBuilder.build()
}
