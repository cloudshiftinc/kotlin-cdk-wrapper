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

package io.cloudshiftdev.awscdkdsl.services.systemsmanagersap

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.systemsmanagersap.CfnApplication

/**
 * The credentials of your SAP application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.systemsmanagersap.*;
 * CredentialProperty credentialProperty = CredentialProperty.builder()
 * .credentialType("credentialType")
 * .databaseName("databaseName")
 * .secretId("secretId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-credential.html)
 */
@CdkDslMarker
public class CfnApplicationCredentialPropertyDsl {
    private val cdkBuilder: CfnApplication.CredentialProperty.Builder =
        CfnApplication.CredentialProperty.builder()

    /** @param credentialType The type of the application credentials. */
    public fun credentialType(credentialType: String) {
        cdkBuilder.credentialType(credentialType)
    }

    /** @param databaseName The name of the SAP HANA database. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param secretId The secret ID created in AWS Secrets Manager to store the credentials of the
     *   SAP application.
     */
    public fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
    }

    public fun build(): CfnApplication.CredentialProperty = cdkBuilder.build()
}
