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
import software.amazon.awscdk.services.macie.CfnSessionProps

/**
 * Properties for defining a `CfnSession`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * CfnSessionProps cfnSessionProps = CfnSessionProps.builder()
 * .findingPublishingFrequency("findingPublishingFrequency")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html)
 */
@CdkDslMarker
public class CfnSessionPropsDsl {
    private val cdkBuilder: CfnSessionProps.Builder = CfnSessionProps.builder()

    /**
     * @param findingPublishingFrequency Specifies how often Amazon Macie publishes updates to
     *   policy findings for the account. This includes publishing updates to AWS Security Hub and
     *   Amazon EventBridge (formerly Amazon CloudWatch Events ). Valid values are:
     * * FIFTEEN_MINUTES
     * * ONE_HOUR
     * * SIX_HOURS
     */
    public fun findingPublishingFrequency(findingPublishingFrequency: String) {
        cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    /**
     * @param status The status of Amazon Macie for the account. Valid values are: `ENABLED` , start
     *   or resume all Macie activities for the account; and, `PAUSED` , suspend all Macie
     *   activities for the account.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnSessionProps = cdkBuilder.build()
}
