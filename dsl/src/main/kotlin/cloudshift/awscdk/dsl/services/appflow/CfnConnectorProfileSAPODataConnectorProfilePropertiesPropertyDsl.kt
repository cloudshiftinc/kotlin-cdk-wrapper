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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile properties required when using SAPOData.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SAPODataConnectorProfilePropertiesProperty sAPODataConnectorProfilePropertiesProperty =
 * SAPODataConnectorProfilePropertiesProperty.builder()
 * .applicationHostUrl("applicationHostUrl")
 * .applicationServicePath("applicationServicePath")
 * .clientNumber("clientNumber")
 * .disableSso(false)
 * .logonLanguage("logonLanguage")
 * .oAuthProperties(OAuthPropertiesProperty.builder()
 * .authCodeUrl("authCodeUrl")
 * .oAuthScopes(List.of("oAuthScopes"))
 * .tokenUrl("tokenUrl")
 * .build())
 * .portNumber(123)
 * .privateLinkServiceName("privateLinkServiceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileSAPODataConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty.builder()

    /** @param applicationHostUrl The location of the SAPOData resource. */
    public fun applicationHostUrl(applicationHostUrl: String) {
        cdkBuilder.applicationHostUrl(applicationHostUrl)
    }

    /** @param applicationServicePath The application path to catalog service. */
    public fun applicationServicePath(applicationServicePath: String) {
        cdkBuilder.applicationServicePath(applicationServicePath)
    }

    /** @param clientNumber The client number for the client creating the connection. */
    public fun clientNumber(clientNumber: String) {
        cdkBuilder.clientNumber(clientNumber)
    }

    /** @param disableSso the value to be set. */
    public fun disableSso(disableSso: Boolean) {
        cdkBuilder.disableSso(disableSso)
    }

    /** @param disableSso the value to be set. */
    public fun disableSso(disableSso: IResolvable) {
        cdkBuilder.disableSso(disableSso)
    }

    /** @param logonLanguage The logon language of SAPOData instance. */
    public fun logonLanguage(logonLanguage: String) {
        cdkBuilder.logonLanguage(logonLanguage)
    }

    /**
     * @param oAuthProperties The SAPOData OAuth properties required for OAuth type authentication.
     */
    public fun oAuthProperties(oAuthProperties: IResolvable) {
        cdkBuilder.oAuthProperties(oAuthProperties)
    }

    /**
     * @param oAuthProperties The SAPOData OAuth properties required for OAuth type authentication.
     */
    public fun oAuthProperties(oAuthProperties: CfnConnectorProfile.OAuthPropertiesProperty) {
        cdkBuilder.oAuthProperties(oAuthProperties)
    }

    /** @param portNumber The port number of the SAPOData instance. */
    public fun portNumber(portNumber: Number) {
        cdkBuilder.portNumber(portNumber)
    }

    /**
     * @param privateLinkServiceName The SAPOData Private Link service name to be used for private
     *   data transfers.
     */
    public fun privateLinkServiceName(privateLinkServiceName: String) {
        cdkBuilder.privateLinkServiceName(privateLinkServiceName)
    }

    public fun build(): CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
