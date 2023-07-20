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
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnEnclaveCertificateIamRoleAssociationPropsDsl {
    private val cdkBuilder: CfnEnclaveCertificateIamRoleAssociationProps.Builder =
        CfnEnclaveCertificateIamRoleAssociationProps.builder()

    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnEnclaveCertificateIamRoleAssociationProps = cdkBuilder.build()
}
