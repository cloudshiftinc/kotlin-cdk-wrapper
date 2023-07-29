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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnCACertificate

/**
 * The registration configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * RegistrationConfigProperty registrationConfigProperty = RegistrationConfigProperty.builder()
 * .roleArn("roleArn")
 * .templateBody("templateBody")
 * .templateName("templateName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-cacertificate-registrationconfig.html)
 */
@CdkDslMarker
public class CfnCACertificateRegistrationConfigPropertyDsl {
    private val cdkBuilder: CfnCACertificate.RegistrationConfigProperty.Builder =
        CfnCACertificate.RegistrationConfigProperty.builder()

    /** @param roleArn The ARN of the role. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param templateBody The template body. */
    public fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
    }

    /** @param templateName The name of the provisioning template. */
    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    public fun build(): CfnCACertificate.RegistrationConfigProperty = cdkBuilder.build()
}
