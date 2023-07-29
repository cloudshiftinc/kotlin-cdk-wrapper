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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnFleet

/**
 * The name of the directory and organizational unit (OU) to use to join a fleet to a Microsoft
 * Active Directory domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * DomainJoinInfoProperty domainJoinInfoProperty = DomainJoinInfoProperty.builder()
 * .directoryName("directoryName")
 * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html)
 */
@CdkDslMarker
public class CfnFleetDomainJoinInfoPropertyDsl {
    private val cdkBuilder: CfnFleet.DomainJoinInfoProperty.Builder =
        CfnFleet.DomainJoinInfoProperty.builder()

    /**
     * @param directoryName The fully qualified name of the directory (for example,
     *   corp.example.com).
     */
    public fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
    }

    /**
     * @param organizationalUnitDistinguishedName The distinguished name of the organizational unit
     *   for computer accounts.
     */
    public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
    }

    public fun build(): CfnFleet.DomainJoinInfoProperty = cdkBuilder.build()
}
