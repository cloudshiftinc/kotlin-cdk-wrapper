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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps

/**
 * Properties for defining a `CfnServicePrincipalName`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * CfnServicePrincipalNameProps cfnServicePrincipalNameProps =
 * CfnServicePrincipalNameProps.builder()
 * .connectorArn("connectorArn")
 * .directoryRegistrationArn("directoryRegistrationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html)
 */
@CdkDslMarker
public class CfnServicePrincipalNamePropsDsl {
    private val cdkBuilder: CfnServicePrincipalNameProps.Builder =
        CfnServicePrincipalNameProps.builder()

    /**
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     *   [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     *   .
     */
    public fun connectorArn(connectorArn: String) {
        cdkBuilder.connectorArn(connectorArn)
    }

    /**
     * @param directoryRegistrationArn The Amazon Resource Name (ARN) that was returned when you
     *   called
     *   [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
     *   .
     */
    public fun directoryRegistrationArn(directoryRegistrationArn: String) {
        cdkBuilder.directoryRegistrationArn(directoryRegistrationArn)
    }

    public fun build(): CfnServicePrincipalNameProps = cdkBuilder.build()
}
