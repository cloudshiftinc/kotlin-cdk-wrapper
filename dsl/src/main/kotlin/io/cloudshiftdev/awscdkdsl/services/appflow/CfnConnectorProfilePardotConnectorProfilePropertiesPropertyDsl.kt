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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile properties required when using Salesforce Pardot.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * PardotConnectorProfilePropertiesProperty pardotConnectorProfilePropertiesProperty =
 * PardotConnectorProfilePropertiesProperty.builder()
 * .businessUnitId("businessUnitId")
 * // the properties below are optional
 * .instanceUrl("instanceUrl")
 * .isSandboxEnvironment(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfilePardotConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.PardotConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.PardotConnectorProfilePropertiesProperty.builder()

    /** @param businessUnitId The business unit id of Salesforce Pardot instance. */
    public fun businessUnitId(businessUnitId: String) {
        cdkBuilder.businessUnitId(businessUnitId)
    }

    /** @param instanceUrl The location of the Salesforce Pardot resource. */
    public fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
    }

    /**
     * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
     *   production environment.
     */
    public fun isSandboxEnvironment(isSandboxEnvironment: Boolean) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
    }

    /**
     * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
     *   production environment.
     */
    public fun isSandboxEnvironment(isSandboxEnvironment: IResolvable) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
    }

    public fun build(): CfnConnectorProfile.PardotConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
