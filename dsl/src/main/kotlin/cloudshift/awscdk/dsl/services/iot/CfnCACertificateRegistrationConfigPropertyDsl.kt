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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnCACertificate
import kotlin.String

@CdkDslMarker
public class CfnCACertificateRegistrationConfigPropertyDsl {
    private val cdkBuilder: CfnCACertificate.RegistrationConfigProperty.Builder =
        CfnCACertificate.RegistrationConfigProperty.builder()

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
    }

    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    public fun build(): CfnCACertificate.RegistrationConfigProperty = cdkBuilder.build()
}
