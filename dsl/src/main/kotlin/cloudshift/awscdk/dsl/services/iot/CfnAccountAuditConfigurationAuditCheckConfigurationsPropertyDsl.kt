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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

@CdkDslMarker
public class CfnAccountAuditConfigurationAuditCheckConfigurationsPropertyDsl {
    private val cdkBuilder: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Builder =
        CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.builder()

    public fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck)
    }

    public fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck)
    }

    public fun caCertificateExpiringCheck(caCertificateExpiringCheck: IResolvable) {
        cdkBuilder.caCertificateExpiringCheck(caCertificateExpiringCheck)
    }

    public fun caCertificateExpiringCheck(caCertificateExpiringCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.caCertificateExpiringCheck(caCertificateExpiringCheck)
    }

    public fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: IResolvable) {
        cdkBuilder.caCertificateKeyQualityCheck(caCertificateKeyQualityCheck)
    }

    public fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.caCertificateKeyQualityCheck(caCertificateKeyQualityCheck)
    }

    public fun conflictingClientIdsCheck(conflictingClientIdsCheck: IResolvable) {
        cdkBuilder.conflictingClientIdsCheck(conflictingClientIdsCheck)
    }

    public fun conflictingClientIdsCheck(conflictingClientIdsCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.conflictingClientIdsCheck(conflictingClientIdsCheck)
    }

    public fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: IResolvable) {
        cdkBuilder.deviceCertificateExpiringCheck(deviceCertificateExpiringCheck)
    }

    public fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.deviceCertificateExpiringCheck(deviceCertificateExpiringCheck)
    }

    public fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: IResolvable) {
        cdkBuilder.deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck)
    }

    public fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck)
    }

    public fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: IResolvable) {
        cdkBuilder.deviceCertificateSharedCheck(deviceCertificateSharedCheck)
    }

    public fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.deviceCertificateSharedCheck(deviceCertificateSharedCheck)
    }

    public fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: IResolvable) {
        cdkBuilder.intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck)
    }

    public fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck)
    }

    public fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: IResolvable) {
        cdkBuilder.ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck)
    }

    public fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck)
    }

    public fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck)
    }

    public fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck)
    }

    public fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: IResolvable) {
        cdkBuilder.iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck)
    }

    public fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck)
    }

    public fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck)
    }

    public fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck)
    }

    public fun loggingDisabledCheck(loggingDisabledCheck: IResolvable) {
        cdkBuilder.loggingDisabledCheck(loggingDisabledCheck)
    }

    public fun loggingDisabledCheck(loggingDisabledCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.loggingDisabledCheck(loggingDisabledCheck)
    }

    public fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: IResolvable) {
        cdkBuilder.revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck)
    }

    public fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck)
    }

    public fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: IResolvable) {
        cdkBuilder.revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck)
    }

    public fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck)
    }

    public fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck)
    }

    public fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty) {
        cdkBuilder.unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck)
    }

    public fun build(): CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty =
        cdkBuilder.build()
}
