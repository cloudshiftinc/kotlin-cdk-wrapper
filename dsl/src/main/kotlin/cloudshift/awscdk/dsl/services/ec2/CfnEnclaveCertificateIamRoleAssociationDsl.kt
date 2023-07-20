@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnEnclaveCertificateIamRoleAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnclaveCertificateIamRoleAssociation.Builder =
        CfnEnclaveCertificateIamRoleAssociation.Builder.create(scope, id)

    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnEnclaveCertificateIamRoleAssociation = cdkBuilder.build()
}
