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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps

/**
 * Properties for defining a `CfnEmailChannel`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnEmailChannelProps cfnEmailChannelProps = CfnEmailChannelProps.builder()
 * .applicationId("applicationId")
 * .fromAddress("fromAddress")
 * .identity("identity")
 * // the properties below are optional
 * .configurationSet("configurationSet")
 * .enabled(false)
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html)
 */
@CdkDslMarker
public class CfnEmailChannelPropsDsl {
    private val cdkBuilder: CfnEmailChannelProps.Builder = CfnEmailChannelProps.builder()

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you're
     *   specifying the email channel for.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param configurationSet The
     *   [Amazon SES configuration set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html)
     *   that you want to apply to messages that you send through the channel.
     */
    public fun configurationSet(configurationSet: String) {
        cdkBuilder.configurationSet(configurationSet)
    }

    /** @param enabled Specifies whether to enable the email channel for the application. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Specifies whether to enable the email channel for the application. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param fromAddress The verified email address that you want to send email from when you send
     *   email through the channel.
     */
    public fun fromAddress(fromAddress: String) {
        cdkBuilder.fromAddress(fromAddress)
    }

    /**
     * @param identity The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple
     *   Email Service (Amazon SES), that you want to use when you send email through the channel.
     */
    public fun identity(identity: String) {
        cdkBuilder.identity(identity)
    }

    /**
     * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that you want
     *   Amazon Pinpoint to use when it submits email-related event data for the channel.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnEmailChannelProps = cdkBuilder.build()
}
