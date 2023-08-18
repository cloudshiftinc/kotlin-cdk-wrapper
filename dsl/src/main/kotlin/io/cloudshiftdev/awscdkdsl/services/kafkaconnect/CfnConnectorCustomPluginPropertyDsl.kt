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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * A plugin is an AWS resource that contains the code that defines a connector's logic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * CustomPluginProperty customPluginProperty = CustomPluginProperty.builder()
 * .customPluginArn("customPluginArn")
 * .revision(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-customplugin.html)
 */
@CdkDslMarker
public class CfnConnectorCustomPluginPropertyDsl {
    private val cdkBuilder: CfnConnector.CustomPluginProperty.Builder =
        CfnConnector.CustomPluginProperty.builder()

    /** @param customPluginArn The Amazon Resource Name (ARN) of the custom plugin. */
    public fun customPluginArn(customPluginArn: String) {
        cdkBuilder.customPluginArn(customPluginArn)
    }

    /** @param revision The revision of the custom plugin. */
    public fun revision(revision: Number) {
        cdkBuilder.revision(revision)
    }

    public fun build(): CfnConnector.CustomPluginProperty = cdkBuilder.build()
}
