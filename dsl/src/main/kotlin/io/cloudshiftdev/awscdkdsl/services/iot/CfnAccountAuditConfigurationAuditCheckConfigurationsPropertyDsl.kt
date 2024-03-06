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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

/**
 * The types of audit checks that can be performed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * AuditCheckConfigurationsProperty auditCheckConfigurationsProperty =
 * AuditCheckConfigurationsProperty.builder()
 * .authenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .caCertificateExpiringCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .caCertificateKeyQualityCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .conflictingClientIdsCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .deviceCertificateExpiringCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .deviceCertificateKeyQualityCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .deviceCertificateSharedCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .intermediateCaRevokedForActiveDeviceCertificatesCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .iotPolicyOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .ioTPolicyPotentialMisConfigurationCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .iotRoleAliasAllowsAccessToUnusedServicesCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .iotRoleAliasOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .loggingDisabledCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .revokedCaCertificateStillActiveCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .revokedDeviceCertificateStillActiveCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .unauthenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
 */
@CdkDslMarker
public class CfnAccountAuditConfigurationAuditCheckConfigurationsPropertyDsl {
    private val cdkBuilder: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Builder =
        CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.builder()

    /**
     * @param authenticatedCognitoRoleOverlyPermissiveCheck Checks the permissiveness of an
     *   authenticated Amazon Cognito identity pool role. For this check, AWS IoT Device Defender
     *   audits all Amazon Cognito identity pools that have been used to connect to the AWS IoT
     *   message broker during the 31 days before the audit is performed.
     */
    public fun authenticatedCognitoRoleOverlyPermissiveCheck(
        authenticatedCognitoRoleOverlyPermissiveCheck: IResolvable
    ) {
        cdkBuilder.authenticatedCognitoRoleOverlyPermissiveCheck(
            authenticatedCognitoRoleOverlyPermissiveCheck
        )
    }

    /**
     * @param authenticatedCognitoRoleOverlyPermissiveCheck Checks the permissiveness of an
     *   authenticated Amazon Cognito identity pool role. For this check, AWS IoT Device Defender
     *   audits all Amazon Cognito identity pools that have been used to connect to the AWS IoT
     *   message broker during the 31 days before the audit is performed.
     */
    public fun authenticatedCognitoRoleOverlyPermissiveCheck(
        authenticatedCognitoRoleOverlyPermissiveCheck:
            CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.authenticatedCognitoRoleOverlyPermissiveCheck(
            authenticatedCognitoRoleOverlyPermissiveCheck
        )
    }

    /**
     * @param caCertificateExpiringCheck Checks if a CA certificate is expiring. This check applies
     *   to CA certificates expiring within 30 days or that have expired.
     */
    public fun caCertificateExpiringCheck(caCertificateExpiringCheck: IResolvable) {
        cdkBuilder.caCertificateExpiringCheck(caCertificateExpiringCheck)
    }

    /**
     * @param caCertificateExpiringCheck Checks if a CA certificate is expiring. This check applies
     *   to CA certificates expiring within 30 days or that have expired.
     */
    public fun caCertificateExpiringCheck(
        caCertificateExpiringCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.caCertificateExpiringCheck(caCertificateExpiringCheck)
    }

    /**
     * @param caCertificateKeyQualityCheck Checks the quality of the CA certificate key. The quality
     *   checks if the key is in a valid format, not expired, and if the key meets a minimum
     *   required size. This check applies to CA certificates that are `ACTIVE` or
     *   `PENDING_TRANSFER` .
     */
    public fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: IResolvable) {
        cdkBuilder.caCertificateKeyQualityCheck(caCertificateKeyQualityCheck)
    }

    /**
     * @param caCertificateKeyQualityCheck Checks the quality of the CA certificate key. The quality
     *   checks if the key is in a valid format, not expired, and if the key meets a minimum
     *   required size. This check applies to CA certificates that are `ACTIVE` or
     *   `PENDING_TRANSFER` .
     */
    public fun caCertificateKeyQualityCheck(
        caCertificateKeyQualityCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.caCertificateKeyQualityCheck(caCertificateKeyQualityCheck)
    }

    /**
     * @param conflictingClientIdsCheck Checks if multiple devices connect using the same client ID.
     */
    public fun conflictingClientIdsCheck(conflictingClientIdsCheck: IResolvable) {
        cdkBuilder.conflictingClientIdsCheck(conflictingClientIdsCheck)
    }

    /**
     * @param conflictingClientIdsCheck Checks if multiple devices connect using the same client ID.
     */
    public fun conflictingClientIdsCheck(
        conflictingClientIdsCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.conflictingClientIdsCheck(conflictingClientIdsCheck)
    }

    /**
     * @param deviceCertificateExpiringCheck Checks if a device certificate is expiring. This check
     *   applies to device certificates expiring within 30 days or that have expired.
     */
    public fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: IResolvable) {
        cdkBuilder.deviceCertificateExpiringCheck(deviceCertificateExpiringCheck)
    }

    /**
     * @param deviceCertificateExpiringCheck Checks if a device certificate is expiring. This check
     *   applies to device certificates expiring within 30 days or that have expired.
     */
    public fun deviceCertificateExpiringCheck(
        deviceCertificateExpiringCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.deviceCertificateExpiringCheck(deviceCertificateExpiringCheck)
    }

    /**
     * @param deviceCertificateKeyQualityCheck Checks the quality of the device certificate key. The
     *   quality checks if the key is in a valid format, not expired, signed by a registered
     *   certificate authority, and if the key meets a minimum required size.
     */
    public fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: IResolvable) {
        cdkBuilder.deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck)
    }

    /**
     * @param deviceCertificateKeyQualityCheck Checks the quality of the device certificate key. The
     *   quality checks if the key is in a valid format, not expired, signed by a registered
     *   certificate authority, and if the key meets a minimum required size.
     */
    public fun deviceCertificateKeyQualityCheck(
        deviceCertificateKeyQualityCheck:
            CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck)
    }

    /**
     * @param deviceCertificateSharedCheck Checks if multiple concurrent connections use the same
     *   X.509 certificate to authenticate with AWS IoT .
     */
    public fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: IResolvable) {
        cdkBuilder.deviceCertificateSharedCheck(deviceCertificateSharedCheck)
    }

    /**
     * @param deviceCertificateSharedCheck Checks if multiple concurrent connections use the same
     *   X.509 certificate to authenticate with AWS IoT .
     */
    public fun deviceCertificateSharedCheck(
        deviceCertificateSharedCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.deviceCertificateSharedCheck(deviceCertificateSharedCheck)
    }

    /**
     * @param intermediateCaRevokedForActiveDeviceCertificatesCheck Checks if device certificates
     *   are still active despite being revoked by an intermediate CA.
     */
    public fun intermediateCaRevokedForActiveDeviceCertificatesCheck(
        intermediateCaRevokedForActiveDeviceCertificatesCheck: IResolvable
    ) {
        cdkBuilder.intermediateCaRevokedForActiveDeviceCertificatesCheck(
            intermediateCaRevokedForActiveDeviceCertificatesCheck
        )
    }

    /**
     * @param intermediateCaRevokedForActiveDeviceCertificatesCheck Checks if device certificates
     *   are still active despite being revoked by an intermediate CA.
     */
    public fun intermediateCaRevokedForActiveDeviceCertificatesCheck(
        intermediateCaRevokedForActiveDeviceCertificatesCheck:
            CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.intermediateCaRevokedForActiveDeviceCertificatesCheck(
            intermediateCaRevokedForActiveDeviceCertificatesCheck
        )
    }

    /**
     * @param ioTPolicyPotentialMisConfigurationCheck Checks if an AWS IoT policy is potentially
     *   misconfigured. Misconfigured policies, including overly permissive policies, can cause
     *   security incidents like allowing devices access to unintended resources. This check is a
     *   warning for you to make sure that only intended actions are allowed before updating the
     *   policy.
     */
    public fun ioTPolicyPotentialMisConfigurationCheck(
        ioTPolicyPotentialMisConfigurationCheck: IResolvable
    ) {
        cdkBuilder.ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck)
    }

    /**
     * @param ioTPolicyPotentialMisConfigurationCheck Checks if an AWS IoT policy is potentially
     *   misconfigured. Misconfigured policies, including overly permissive policies, can cause
     *   security incidents like allowing devices access to unintended resources. This check is a
     *   warning for you to make sure that only intended actions are allowed before updating the
     *   policy.
     */
    public fun ioTPolicyPotentialMisConfigurationCheck(
        ioTPolicyPotentialMisConfigurationCheck:
            CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck)
    }

    /**
     * @param iotPolicyOverlyPermissiveCheck Checks the permissiveness of a policy attached to an
     *   authenticated Amazon Cognito identity pool role.
     */
    public fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck)
    }

    /**
     * @param iotPolicyOverlyPermissiveCheck Checks the permissiveness of a policy attached to an
     *   authenticated Amazon Cognito identity pool role.
     */
    public fun iotPolicyOverlyPermissiveCheck(
        iotPolicyOverlyPermissiveCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck)
    }

    /**
     * @param iotRoleAliasAllowsAccessToUnusedServicesCheck Checks if a role alias has access to
     *   services that haven't been used for the AWS IoT device in the last year.
     */
    public fun iotRoleAliasAllowsAccessToUnusedServicesCheck(
        iotRoleAliasAllowsAccessToUnusedServicesCheck: IResolvable
    ) {
        cdkBuilder.iotRoleAliasAllowsAccessToUnusedServicesCheck(
            iotRoleAliasAllowsAccessToUnusedServicesCheck
        )
    }

    /**
     * @param iotRoleAliasAllowsAccessToUnusedServicesCheck Checks if a role alias has access to
     *   services that haven't been used for the AWS IoT device in the last year.
     */
    public fun iotRoleAliasAllowsAccessToUnusedServicesCheck(
        iotRoleAliasAllowsAccessToUnusedServicesCheck:
            CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.iotRoleAliasAllowsAccessToUnusedServicesCheck(
            iotRoleAliasAllowsAccessToUnusedServicesCheck
        )
    }

    /**
     * @param iotRoleAliasOverlyPermissiveCheck Checks if the temporary credentials provided by AWS
     *   IoT role aliases are overly permissive.
     */
    public fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck)
    }

    /**
     * @param iotRoleAliasOverlyPermissiveCheck Checks if the temporary credentials provided by AWS
     *   IoT role aliases are overly permissive.
     */
    public fun iotRoleAliasOverlyPermissiveCheck(
        iotRoleAliasOverlyPermissiveCheck:
            CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck)
    }

    /** @param loggingDisabledCheck Checks if AWS IoT logs are disabled. */
    public fun loggingDisabledCheck(loggingDisabledCheck: IResolvable) {
        cdkBuilder.loggingDisabledCheck(loggingDisabledCheck)
    }

    /** @param loggingDisabledCheck Checks if AWS IoT logs are disabled. */
    public fun loggingDisabledCheck(
        loggingDisabledCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.loggingDisabledCheck(loggingDisabledCheck)
    }

    /**
     * @param revokedCaCertificateStillActiveCheck Checks if a revoked CA certificate is still
     *   active.
     */
    public fun revokedCaCertificateStillActiveCheck(
        revokedCaCertificateStillActiveCheck: IResolvable
    ) {
        cdkBuilder.revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck)
    }

    /**
     * @param revokedCaCertificateStillActiveCheck Checks if a revoked CA certificate is still
     *   active.
     */
    public fun revokedCaCertificateStillActiveCheck(
        revokedCaCertificateStillActiveCheck:
            CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck)
    }

    /**
     * @param revokedDeviceCertificateStillActiveCheck Checks if a revoked device certificate is
     *   still active.
     */
    public fun revokedDeviceCertificateStillActiveCheck(
        revokedDeviceCertificateStillActiveCheck: IResolvable
    ) {
        cdkBuilder.revokedDeviceCertificateStillActiveCheck(
            revokedDeviceCertificateStillActiveCheck
        )
    }

    /**
     * @param revokedDeviceCertificateStillActiveCheck Checks if a revoked device certificate is
     *   still active.
     */
    public fun revokedDeviceCertificateStillActiveCheck(
        revokedDeviceCertificateStillActiveCheck:
            CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.revokedDeviceCertificateStillActiveCheck(
            revokedDeviceCertificateStillActiveCheck
        )
    }

    /**
     * @param unauthenticatedCognitoRoleOverlyPermissiveCheck Checks if policy attached to an
     *   unauthenticated Amazon Cognito identity pool role is too permissive.
     */
    public fun unauthenticatedCognitoRoleOverlyPermissiveCheck(
        unauthenticatedCognitoRoleOverlyPermissiveCheck: IResolvable
    ) {
        cdkBuilder.unauthenticatedCognitoRoleOverlyPermissiveCheck(
            unauthenticatedCognitoRoleOverlyPermissiveCheck
        )
    }

    /**
     * @param unauthenticatedCognitoRoleOverlyPermissiveCheck Checks if policy attached to an
     *   unauthenticated Amazon Cognito identity pool role is too permissive.
     */
    public fun unauthenticatedCognitoRoleOverlyPermissiveCheck(
        unauthenticatedCognitoRoleOverlyPermissiveCheck:
            CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    ) {
        cdkBuilder.unauthenticatedCognitoRoleOverlyPermissiveCheck(
            unauthenticatedCognitoRoleOverlyPermissiveCheck
        )
    }

    public fun build(): CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty =
        cdkBuilder.build()
}
