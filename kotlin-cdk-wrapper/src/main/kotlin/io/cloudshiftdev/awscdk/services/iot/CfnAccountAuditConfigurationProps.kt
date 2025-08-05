@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAccountAuditConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
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
 * .deviceCertificateAgeCheck(DeviceCertAgeAuditCheckConfigurationProperty.builder()
 * .configuration(CertAgeCheckCustomConfigurationProperty.builder()
 * .certAgeThresholdInDays("certAgeThresholdInDays")
 * .build())
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
public interface CfnAccountAuditConfigurationProps {
  /**
   * The ID of the account.
   *
   * You can use the expression `!Sub "${AWS::AccountId}"` to use your account ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-accountid)
   */
  public fun accountId(): String

  /**
   * Specifies which audit checks are enabled and disabled for this account.
   *
   * Some data collection might start immediately when certain checks are enabled. When a check is
   * disabled, any data collected so far in relation to the check is deleted. To disable a check, set
   * the value of the `Enabled:` key to `false` .
   *
   * If an enabled check is removed from the template, it will also be disabled.
   *
   * You can't disable a check if it's used by any scheduled audit. You must delete the check from
   * the scheduled audit or delete the scheduled audit itself to disable the check.
   *
   * For more information on available audit checks see [AWS::IoT::AccountAuditConfiguration
   * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations)
   */
  public fun auditCheckConfigurations(): Any

  /**
   * Information about the targets to which audit notifications are sent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations)
   */
  public fun auditNotificationTargetConfigurations(): Any? =
      unwrap(this).getAuditNotificationTargetConfigurations()

  /**
   * The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT to access
   * information about your devices, policies, certificates, and other items as required when
   * performing an audit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-rolearn)
   */
  public fun roleArn(): String

  /**
   * A builder for [CfnAccountAuditConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountId The ID of the account. 
     * You can use the expression `!Sub "${AWS::AccountId}"` to use your account ID.
     */
    public fun accountId(accountId: String)

    /**
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     * Some data collection might start immediately when certain checks are enabled. When a check is
     * disabled, any data collected so far in relation to the check is deleted. To disable a check, set
     * the value of the `Enabled:` key to `false` .
     *
     * If an enabled check is removed from the template, it will also be disabled.
     *
     * You can't disable a check if it's used by any scheduled audit. You must delete the check from
     * the scheduled audit or delete the scheduled audit itself to disable the check.
     *
     * For more information on available audit checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     */
    public fun auditCheckConfigurations(auditCheckConfigurations: IResolvable)

    /**
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     * Some data collection might start immediately when certain checks are enabled. When a check is
     * disabled, any data collected so far in relation to the check is deleted. To disable a check, set
     * the value of the `Enabled:` key to `false` .
     *
     * If an enabled check is removed from the template, it will also be disabled.
     *
     * You can't disable a check if it's used by any scheduled audit. You must delete the check from
     * the scheduled audit or delete the scheduled audit itself to disable the check.
     *
     * For more information on available audit checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     */
    public
        fun auditCheckConfigurations(auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty)

    /**
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     * Some data collection might start immediately when certain checks are enabled. When a check is
     * disabled, any data collected so far in relation to the check is deleted. To disable a check, set
     * the value of the `Enabled:` key to `false` .
     *
     * If an enabled check is removed from the template, it will also be disabled.
     *
     * You can't disable a check if it's used by any scheduled audit. You must delete the check from
     * the scheduled audit or delete the scheduled audit itself to disable the check.
     *
     * For more information on available audit checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d3a8c65f85f9ed1073bebfb38a5847044483192fa35776864f8697c2fc4e9ed")
    public
        fun auditCheckConfigurations(auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Builder.() -> Unit)

    /**
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent.
     */
    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: IResolvable)

    /**
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent.
     */
    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty)

    /**
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9f9a6517f7292df5052a5fa2bdc7b03b143f656ffd0362dcbdffb91a2501244")
    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT
     * to access information about your devices, policies, certificates, and other items as required
     * when performing an audit. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps.Builder =
        software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps.builder()

    /**
     * @param accountId The ID of the account. 
     * You can use the expression `!Sub "${AWS::AccountId}"` to use your account ID.
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     * Some data collection might start immediately when certain checks are enabled. When a check is
     * disabled, any data collected so far in relation to the check is deleted. To disable a check, set
     * the value of the `Enabled:` key to `false` .
     *
     * If an enabled check is removed from the template, it will also be disabled.
     *
     * You can't disable a check if it's used by any scheduled audit. You must delete the check from
     * the scheduled audit or delete the scheduled audit itself to disable the check.
     *
     * For more information on available audit checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     */
    override fun auditCheckConfigurations(auditCheckConfigurations: IResolvable) {
      cdkBuilder.auditCheckConfigurations(auditCheckConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     * Some data collection might start immediately when certain checks are enabled. When a check is
     * disabled, any data collected so far in relation to the check is deleted. To disable a check, set
     * the value of the `Enabled:` key to `false` .
     *
     * If an enabled check is removed from the template, it will also be disabled.
     *
     * You can't disable a check if it's used by any scheduled audit. You must delete the check from
     * the scheduled audit or delete the scheduled audit itself to disable the check.
     *
     * For more information on available audit checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     */
    override
        fun auditCheckConfigurations(auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty) {
      cdkBuilder.auditCheckConfigurations(auditCheckConfigurations.let(CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Companion::unwrap))
    }

    /**
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     * Some data collection might start immediately when certain checks are enabled. When a check is
     * disabled, any data collected so far in relation to the check is deleted. To disable a check, set
     * the value of the `Enabled:` key to `false` .
     *
     * If an enabled check is removed from the template, it will also be disabled.
     *
     * You can't disable a check if it's used by any scheduled audit. You must delete the check from
     * the scheduled audit or delete the scheduled audit itself to disable the check.
     *
     * For more information on available audit checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d3a8c65f85f9ed1073bebfb38a5847044483192fa35776864f8697c2fc4e9ed")
    override
        fun auditCheckConfigurations(auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Builder.() -> Unit):
        Unit =
        auditCheckConfigurations(CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty(auditCheckConfigurations))

    /**
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent.
     */
    override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: IResolvable) {
      cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent.
     */
    override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty) {
      cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.let(CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Companion::unwrap))
    }

    /**
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9f9a6517f7292df5052a5fa2bdc7b03b143f656ffd0362dcbdffb91a2501244")
    override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit):
        Unit =
        auditNotificationTargetConfigurations(CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty(auditNotificationTargetConfigurations))

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT
     * to access information about your devices, policies, certificates, and other items as required
     * when performing an audit. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnAccountAuditConfigurationProps {
    /**
     * The ID of the account.
     *
     * You can use the expression `!Sub "${AWS::AccountId}"` to use your account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-accountid)
     */
    override fun accountId(): String = unwrap(this).getAccountId()

    /**
     * Specifies which audit checks are enabled and disabled for this account.
     *
     * Some data collection might start immediately when certain checks are enabled. When a check is
     * disabled, any data collected so far in relation to the check is deleted. To disable a check, set
     * the value of the `Enabled:` key to `false` .
     *
     * If an enabled check is removed from the template, it will also be disabled.
     *
     * You can't disable a check if it's used by any scheduled audit. You must delete the check from
     * the scheduled audit or delete the scheduled audit itself to disable the check.
     *
     * For more information on available audit checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations)
     */
    override fun auditCheckConfigurations(): Any = unwrap(this).getAuditCheckConfigurations()

    /**
     * Information about the targets to which audit notifications are sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations)
     */
    override fun auditNotificationTargetConfigurations(): Any? =
        unwrap(this).getAuditNotificationTargetConfigurations()

    /**
     * The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT to access
     * information about your devices, policies, certificates, and other items as required when
     * performing an audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountAuditConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps):
        CfnAccountAuditConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnAccountAuditConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountAuditConfigurationProps):
        software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps
  }
}
