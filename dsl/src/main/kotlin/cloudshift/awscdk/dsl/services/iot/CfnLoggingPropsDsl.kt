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
import software.amazon.awscdk.services.iot.CfnLoggingProps

/**
 * Properties for defining a `CfnLogging`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnLoggingProps cfnLoggingProps = CfnLoggingProps.builder()
 * .accountId("accountId")
 * .defaultLogLevel("defaultLogLevel")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html)
 */
@CdkDslMarker
public class CfnLoggingPropsDsl {
    private val cdkBuilder: CfnLoggingProps.Builder = CfnLoggingProps.builder()

    /** @param accountId The account ID. */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /**
     * @param defaultLogLevel The default log level. Valid Values: `DEBUG | INFO | ERROR | WARN |
     *   DISABLED`
     */
    public fun defaultLogLevel(defaultLogLevel: String) {
        cdkBuilder.defaultLogLevel(defaultLogLevel)
    }

    /** @param roleArn The role ARN used for the log. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnLoggingProps = cdkBuilder.build()
}
