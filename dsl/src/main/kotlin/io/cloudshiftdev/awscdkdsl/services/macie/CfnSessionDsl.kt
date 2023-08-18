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

package io.cloudshiftdev.awscdkdsl.services.macie

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.macie.CfnSession
import software.constructs.Construct

/**
 * The `AWS::Macie::Session` resource represents the Amazon Macie service and certain configuration
 * settings for an Amazon Macie account in a specific AWS Region .
 *
 * It enables Macie to become operational for a specific account in a specific Region. An account
 * can have only one session in each Region.
 *
 * You must create an `AWS::Macie::Session` resource for an account before you can create other
 * types of resources for the account. Use a
 * [DependsOn attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * to ensure that an `AWS::Macie::Session` resource is created before other Macie resources are
 * created for an account. For example, `"DependsOn": "Session"` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * CfnSession cfnSession = CfnSession.Builder.create(this, "MyCfnSession")
 * .findingPublishingFrequency("findingPublishingFrequency")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html)
 */
@CdkDslMarker
public class CfnSessionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSession.Builder = CfnSession.Builder.create(scope, id)

    /**
     * Specifies how often Amazon Macie publishes updates to policy findings for the account.
     *
     * This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly Amazon
     * CloudWatch Events ). Valid values are:
     * * FIFTEEN_MINUTES
     * * ONE_HOUR
     * * SIX_HOURS
     *
     * Default: - "SIX_HOURS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html#cfn-macie-session-findingpublishingfrequency)
     *
     * @param findingPublishingFrequency Specifies how often Amazon Macie publishes updates to
     *   policy findings for the account.
     */
    public fun findingPublishingFrequency(findingPublishingFrequency: String) {
        cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    /**
     * The status of Amazon Macie for the account.
     *
     * Valid values are: `ENABLED` , start or resume all Macie activities for the account; and,
     * `PAUSED` , suspend all Macie activities for the account.
     *
     * Default: - "ENABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html#cfn-macie-session-status)
     *
     * @param status The status of Amazon Macie for the account.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnSession = cdkBuilder.build()
}
