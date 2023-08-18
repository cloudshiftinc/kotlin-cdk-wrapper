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

package io.cloudshiftdev.awscdkdsl.services.kafkaconnect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * A plugin is an AWS resource that contains the code that defines your connector logic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * PluginProperty pluginProperty = PluginProperty.builder()
 * .customPlugin(CustomPluginProperty.builder()
 * .customPluginArn("customPluginArn")
 * .revision(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-plugin.html)
 */
@CdkDslMarker
public class CfnConnectorPluginPropertyDsl {
    private val cdkBuilder: CfnConnector.PluginProperty.Builder =
        CfnConnector.PluginProperty.builder()

    /** @param customPlugin Details about a custom plugin. */
    public fun customPlugin(customPlugin: IResolvable) {
        cdkBuilder.customPlugin(customPlugin)
    }

    /** @param customPlugin Details about a custom plugin. */
    public fun customPlugin(customPlugin: CfnConnector.CustomPluginProperty) {
        cdkBuilder.customPlugin(customPlugin)
    }

    public fun build(): CfnConnector.PluginProperty = cdkBuilder.build()
}
