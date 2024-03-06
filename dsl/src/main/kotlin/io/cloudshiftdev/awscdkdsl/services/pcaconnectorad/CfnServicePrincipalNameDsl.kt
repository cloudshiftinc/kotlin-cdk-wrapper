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
import software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName
import software.constructs.Construct

/**
 * Creates a service principal name (SPN) for the service account in Active Directory.
 *
 * Kerberos authentication uses SPNs to associate a service instance with a service sign-in account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * CfnServicePrincipalName cfnServicePrincipalName = CfnServicePrincipalName.Builder.create(this,
 * "MyCfnServicePrincipalName")
 * .connectorArn("connectorArn")
 * .directoryRegistrationArn("directoryRegistrationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html)
 */
@CdkDslMarker
public class CfnServicePrincipalNameDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServicePrincipalName.Builder =
        CfnServicePrincipalName.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html#cfn-pcaconnectorad-serviceprincipalname-connectorarn)
     *
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     *   [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     *   .
     */
    public fun connectorArn(connectorArn: String) {
        cdkBuilder.connectorArn(connectorArn)
    }

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html#cfn-pcaconnectorad-serviceprincipalname-directoryregistrationarn)
     *
     * @param directoryRegistrationArn The Amazon Resource Name (ARN) that was returned when you
     *   called
     *   [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
     *   .
     */
    public fun directoryRegistrationArn(directoryRegistrationArn: String) {
        cdkBuilder.directoryRegistrationArn(directoryRegistrationArn)
    }

    public fun build(): CfnServicePrincipalName = cdkBuilder.build()
}
