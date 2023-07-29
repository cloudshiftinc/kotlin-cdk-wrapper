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

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.grafana.CfnWorkspace

/**
 * A structure containing the identity provider (IdP) metadata used to integrate the identity
 * provider with this workspace.
 *
 * You can specify the metadata either by providing a URL to its location in the `url` parameter, or
 * by specifying the full metadata in XML format in the `xml` parameter. Specifying both will cause
 * an error.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.grafana.*;
 * IdpMetadataProperty idpMetadataProperty = IdpMetadataProperty.builder()
 * .url("url")
 * .xml("xml")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-idpmetadata.html)
 */
@CdkDslMarker
public class CfnWorkspaceIdpMetadataPropertyDsl {
    private val cdkBuilder: CfnWorkspace.IdpMetadataProperty.Builder =
        CfnWorkspace.IdpMetadataProperty.builder()

    /** @param url The URL of the location containing the IdP metadata. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    /** @param xml The full IdP metadata, in XML format. */
    public fun xml(xml: String) {
        cdkBuilder.xml(xml)
    }

    public fun build(): CfnWorkspace.IdpMetadataProperty = cdkBuilder.build()
}
