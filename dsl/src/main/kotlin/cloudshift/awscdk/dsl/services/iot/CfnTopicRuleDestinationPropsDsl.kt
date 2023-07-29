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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination
import software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps

/**
 * Properties for defining a `CfnTopicRuleDestination`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnTopicRuleDestinationProps cfnTopicRuleDestinationProps =
 * CfnTopicRuleDestinationProps.builder()
 * .httpUrlProperties(HttpUrlDestinationSummaryProperty.builder()
 * .confirmationUrl("confirmationUrl")
 * .build())
 * .status("status")
 * .vpcProperties(VpcDestinationPropertiesProperty.builder()
 * .roleArn("roleArn")
 * .securityGroups(List.of("securityGroups"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicruledestination.html)
 */
@CdkDslMarker
public class CfnTopicRuleDestinationPropsDsl {
    private val cdkBuilder: CfnTopicRuleDestinationProps.Builder =
        CfnTopicRuleDestinationProps.builder()

    /** @param httpUrlProperties Properties of the HTTP URL. */
    public fun httpUrlProperties(httpUrlProperties: IResolvable) {
        cdkBuilder.httpUrlProperties(httpUrlProperties)
    }

    /** @param httpUrlProperties Properties of the HTTP URL. */
    public fun httpUrlProperties(
        httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty
    ) {
        cdkBuilder.httpUrlProperties(httpUrlProperties)
    }

    /**
     * @param status * **IN_PROGRESS** - A topic rule destination was created but has not been
     *   confirmed. You can set status to `IN_PROGRESS` by calling `UpdateTopicRuleDestination` .
     *   Calling `UpdateTopicRuleDestination` causes a new confirmation challenge to be sent to your
     *   confirmation endpoint.
     * * **ENABLED** - Confirmation was completed, and traffic to this destination is allowed. You
     *   can set status to `DISABLED` by calling `UpdateTopicRuleDestination` .
     * * **DISABLED** - Confirmation was completed, and traffic to this destination is not allowed.
     *   You can set status to `ENABLED` by calling `UpdateTopicRuleDestination` .
     * * **ERROR** - Confirmation could not be completed; for example, if the confirmation timed
     *   out. You can call `GetTopicRuleDestination` for details about the error. You can set status
     *   to `IN_PROGRESS` by calling `UpdateTopicRuleDestination` . Calling
     *   `UpdateTopicRuleDestination` causes a new confirmation challenge to be sent to your
     *   confirmation endpoint.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param vpcProperties Properties of the virtual private cloud (VPC) connection. */
    public fun vpcProperties(vpcProperties: IResolvable) {
        cdkBuilder.vpcProperties(vpcProperties)
    }

    /** @param vpcProperties Properties of the virtual private cloud (VPC) connection. */
    public fun vpcProperties(
        vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty
    ) {
        cdkBuilder.vpcProperties(vpcProperties)
    }

    public fun build(): CfnTopicRuleDestinationProps = cdkBuilder.build()
}
