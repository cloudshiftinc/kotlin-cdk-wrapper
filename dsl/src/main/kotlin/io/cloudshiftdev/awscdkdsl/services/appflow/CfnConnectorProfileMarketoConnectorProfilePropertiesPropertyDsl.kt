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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile properties required when using Marketo.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * MarketoConnectorProfilePropertiesProperty marketoConnectorProfilePropertiesProperty =
 * MarketoConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileMarketoConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty.builder()

    /** @param instanceUrl The location of the Marketo resource. */
    public fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
    }

    public fun build(): CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
