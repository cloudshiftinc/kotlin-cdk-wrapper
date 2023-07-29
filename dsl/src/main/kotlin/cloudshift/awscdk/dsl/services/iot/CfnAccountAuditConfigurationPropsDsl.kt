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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration
import software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps

/**
 * Properties for defining a `CfnAccountAuditConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnAccountAuditConfigurationProps cfnAccountAuditConfigurationProps =
 * CfnAccountAuditConfigurationProps.builder()
 * .accountId("accountId")
 * .auditCheckConfigurations(AuditCheckConfigurationsProperty.builder()
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
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .auditNotificationTargetConfigurations(AuditNotificationTargetConfigurationsProperty.builder()
 * .sns(AuditNotificationTargetProperty.builder()
 * .enabled(false)
 * .roleArn("roleArn")
 * .targetArn("targetArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html)
 */
@CdkDslMarker
public class CfnAccountAuditConfigurationPropsDsl {
    private val cdkBuilder: CfnAccountAuditConfigurationProps.Builder =
        CfnAccountAuditConfigurationProps.builder()

    /**
     * @param accountId The ID of the account. You can use the expression `!Sub "${AWS::AccountId}"`
     *   to use your account ID.
     */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /**
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     *   this account. Some data collection might start immediately when certain checks are enabled.
     *   When a check is disabled, any data collected so far in relation to the check is deleted. To
     *   disable a check, set the value of the `Enabled:` key to `false` .
     *
     * If an enabled check is removed from the template, it will also be disabled.
     *
     * You can't disable a check if it's used by any scheduled audit. You must delete the check from
     * the scheduled audit or delete the scheduled audit itself to disable the check.
     *
     * For more information on avialbe auidt checks see
     * [AWS::IoT::AccountAuditConfiguration AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     */
    public fun auditCheckConfigurations(auditCheckConfigurations: IResolvable) {
        cdkBuilder.auditCheckConfigurations(auditCheckConfigurations)
    }

    /**
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     *   this account. Some data collection might start immediately when certain checks are enabled.
     *   When a check is disabled, any data collected so far in relation to the check is deleted. To
     *   disable a check, set the value of the `Enabled:` key to `false` .
     *
     * If an enabled check is removed from the template, it will also be disabled.
     *
     * You can't disable a check if it's used by any scheduled audit. You must delete the check from
     * the scheduled audit or delete the scheduled audit itself to disable the check.
     *
     * For more information on avialbe auidt checks see
     * [AWS::IoT::AccountAuditConfiguration AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     */
    public fun auditCheckConfigurations(
        auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty
    ) {
        cdkBuilder.auditCheckConfigurations(auditCheckConfigurations)
    }

    /**
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     *   notifications are sent.
     */
    public fun auditNotificationTargetConfigurations(
        auditNotificationTargetConfigurations: IResolvable
    ) {
        cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations)
    }

    /**
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     *   notifications are sent.
     */
    public fun auditNotificationTargetConfigurations(
        auditNotificationTargetConfigurations:
            CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty
    ) {
        cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT
     *   to access information about your devices, policies, certificates, and other items as
     *   required when performing an audit.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnAccountAuditConfigurationProps = cdkBuilder.build()
}
