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

package cloudshift.awscdk.dsl.services.aps

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.aps.CfnWorkspace

/**
 * The LoggingConfiguration attribute sets the logging configuration for the workspace.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.aps.*;
 * LoggingConfigurationProperty loggingConfigurationProperty =
 * LoggingConfigurationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-workspace-loggingconfiguration.html)
 */
@CdkDslMarker
public class CfnWorkspaceLoggingConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkspace.LoggingConfigurationProperty.Builder =
        CfnWorkspace.LoggingConfigurationProperty.builder()

    /**
     * @param logGroupArn The Amazon Resource Name (ARN) of the CloudWatch log group the logs are
     *   emitted to.
     */
    public fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
    }

    public fun build(): CfnWorkspace.LoggingConfigurationProperty = cdkBuilder.build()
}
