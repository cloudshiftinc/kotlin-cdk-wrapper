@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::AccountAuditConfiguration` resource to configure or reconfigure the Device
 * Defender audit settings for your account.
 *
 * Settings include how audit notifications are sent and which audit checks are enabled or disabled.
 * For API reference, see
 * [UpdateAccountAuditConfiguration](https://docs.aws.amazon.com/iot/latest/apireference/API_UpdateAccountAuditConfiguration.html)
 * and for detailed information on all available audit checks, see [Audit
 * checks](https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-audit-checks.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnAccountAuditConfiguration cfnAccountAuditConfiguration =
 * CfnAccountAuditConfiguration.Builder.create(this, "MyCfnAccountAuditConfiguration")
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
public open class CfnAccountAuditConfiguration(
  cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccountAuditConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAccountAuditConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccountAuditConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccountAuditConfigurationProps(props)
  )

  /**
   * The ID of the account.
   */
  public open fun accountId(): String = unwrap(this).getAccountId()

  /**
   * The ID of the account.
   */
  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  /**
   * Specifies which audit checks are enabled and disabled for this account.
   */
  public open fun auditCheckConfigurations(): Any = unwrap(this).getAuditCheckConfigurations()

  /**
   * Specifies which audit checks are enabled and disabled for this account.
   */
  public open fun auditCheckConfigurations(`value`: IResolvable) {
    unwrap(this).setAuditCheckConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies which audit checks are enabled and disabled for this account.
   */
  public open fun auditCheckConfigurations(`value`: AuditCheckConfigurationsProperty) {
    unwrap(this).setAuditCheckConfigurations(`value`.let(AuditCheckConfigurationsProperty.Companion::unwrap))
  }

  /**
   * Specifies which audit checks are enabled and disabled for this account.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("565de4b18f527546eaa72c809c3ffa5fa4277be3a78f3b5a410e6e4cf05d9404")
  public open
      fun auditCheckConfigurations(`value`: AuditCheckConfigurationsProperty.Builder.() -> Unit):
      Unit = auditCheckConfigurations(AuditCheckConfigurationsProperty(`value`))

  /**
   * Information about the targets to which audit notifications are sent.
   */
  public open fun auditNotificationTargetConfigurations(): Any? =
      unwrap(this).getAuditNotificationTargetConfigurations()

  /**
   * Information about the targets to which audit notifications are sent.
   */
  public open fun auditNotificationTargetConfigurations(`value`: IResolvable) {
    unwrap(this).setAuditNotificationTargetConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the targets to which audit notifications are sent.
   */
  public open
      fun auditNotificationTargetConfigurations(`value`: AuditNotificationTargetConfigurationsProperty) {
    unwrap(this).setAuditNotificationTargetConfigurations(`value`.let(AuditNotificationTargetConfigurationsProperty.Companion::unwrap))
  }

  /**
   * Information about the targets to which audit notifications are sent.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ea7b6fd6d68f3a60a50af305243113d874fbee0fc9849d870a9b4aab707f7c6b")
  public open
      fun auditNotificationTargetConfigurations(`value`: AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit):
      Unit =
      auditNotificationTargetConfigurations(AuditNotificationTargetConfigurationsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT to access
   * information about your devices, policies, certificates, and other items as required when
   * performing an audit.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT to access
   * information about your devices, policies, certificates, and other items as required when
   * performing an audit.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnAccountAuditConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the account.
     *
     * You can use the expression `!Sub "${AWS::AccountId}"` to use your account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-accountid)
     * @param accountId The ID of the account. 
     */
    public fun accountId(accountId: String)

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
     * For more information on avialbe auidt checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations)
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     */
    public fun auditCheckConfigurations(auditCheckConfigurations: IResolvable)

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
     * For more information on avialbe auidt checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations)
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     */
    public fun auditCheckConfigurations(auditCheckConfigurations: AuditCheckConfigurationsProperty)

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
     * For more information on avialbe auidt checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations)
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2858ee5587962257b860645893d89a65dc69350d42c4904164b339d052f203a9")
    public
        fun auditCheckConfigurations(auditCheckConfigurations: AuditCheckConfigurationsProperty.Builder.() -> Unit)

    /**
     * Information about the targets to which audit notifications are sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations)
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent. 
     */
    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: IResolvable)

    /**
     * Information about the targets to which audit notifications are sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations)
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent. 
     */
    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: AuditNotificationTargetConfigurationsProperty)

    /**
     * Information about the targets to which audit notifications are sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations)
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c3e120faddbcd13868d1324b3ca0a1ea85f501d00a6b50a60fe45751bc4bdd4")
    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT to access
     * information about your devices, policies, certificates, and other items as required when
     * performing an audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT
     * to access information about your devices, policies, certificates, and other items as required
     * when performing an audit. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.Builder
        = software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.Builder.create(scope, id)

    /**
     * The ID of the account.
     *
     * You can use the expression `!Sub "${AWS::AccountId}"` to use your account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-accountid)
     * @param accountId The ID of the account. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

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
     * For more information on avialbe auidt checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations)
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     */
    override fun auditCheckConfigurations(auditCheckConfigurations: IResolvable) {
      cdkBuilder.auditCheckConfigurations(auditCheckConfigurations.let(IResolvable.Companion::unwrap))
    }

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
     * For more information on avialbe auidt checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations)
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     */
    override
        fun auditCheckConfigurations(auditCheckConfigurations: AuditCheckConfigurationsProperty) {
      cdkBuilder.auditCheckConfigurations(auditCheckConfigurations.let(AuditCheckConfigurationsProperty.Companion::unwrap))
    }

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
     * For more information on avialbe auidt checks see [AWS::IoT::AccountAuditConfiguration
     * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations)
     * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for
     * this account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2858ee5587962257b860645893d89a65dc69350d42c4904164b339d052f203a9")
    override
        fun auditCheckConfigurations(auditCheckConfigurations: AuditCheckConfigurationsProperty.Builder.() -> Unit):
        Unit = auditCheckConfigurations(AuditCheckConfigurationsProperty(auditCheckConfigurations))

    /**
     * Information about the targets to which audit notifications are sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations)
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent. 
     */
    override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: IResolvable) {
      cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the targets to which audit notifications are sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations)
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent. 
     */
    override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: AuditNotificationTargetConfigurationsProperty) {
      cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.let(AuditNotificationTargetConfigurationsProperty.Companion::unwrap))
    }

    /**
     * Information about the targets to which audit notifications are sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations)
     * @param auditNotificationTargetConfigurations Information about the targets to which audit
     * notifications are sent. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c3e120faddbcd13868d1324b3ca0a1ea85f501d00a6b50a60fe45751bc4bdd4")
    override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit):
        Unit =
        auditNotificationTargetConfigurations(AuditNotificationTargetConfigurationsProperty(auditNotificationTargetConfigurations))

    /**
     * The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT to access
     * information about your devices, policies, certificates, and other items as required when
     * performing an audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT
     * to access information about your devices, policies, certificates, and other items as required
     * when performing an audit. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccountAuditConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccountAuditConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration):
        CfnAccountAuditConfiguration = CfnAccountAuditConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnAccountAuditConfiguration):
        software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration
  }

  /**
   * Which audit checks are enabled and disabled for this account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AuditCheckConfigurationProperty auditCheckConfigurationProperty =
   * AuditCheckConfigurationProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfiguration.html)
   */
  public interface AuditCheckConfigurationProperty {
    /**
     * True if this audit check is enabled for this account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [AuditCheckConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled True if this audit check is enabled for this account.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled True if this audit check is enabled for this account.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.builder()

      /**
       * @param enabled True if this audit check is enabled for this account.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled True if this audit check is enabled for this account.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty,
    ) : CdkObject(cdkObject), AuditCheckConfigurationProperty {
      /**
       * True if this audit check is enabled for this account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuditCheckConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty):
          AuditCheckConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuditCheckConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuditCheckConfigurationProperty):
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
    }
  }

  /**
   * The types of audit checks that can be performed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
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
  public interface AuditCheckConfigurationsProperty {
    /**
     * Checks the permissiveness of an authenticated Amazon Cognito identity pool role.
     *
     * For this check, AWS IoT Device Defender audits all Amazon Cognito identity pools that have
     * been used to connect to the AWS IoT message broker during the 31 days before the audit is
     * performed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-authenticatedcognitoroleoverlypermissivecheck)
     */
    public fun authenticatedCognitoRoleOverlyPermissiveCheck(): Any? =
        unwrap(this).getAuthenticatedCognitoRoleOverlyPermissiveCheck()

    /**
     * Checks if a CA certificate is expiring.
     *
     * This check applies to CA certificates expiring within 30 days or that have expired.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-cacertificateexpiringcheck)
     */
    public fun caCertificateExpiringCheck(): Any? = unwrap(this).getCaCertificateExpiringCheck()

    /**
     * Checks the quality of the CA certificate key.
     *
     * The quality checks if the key is in a valid format, not expired, and if the key meets a
     * minimum required size. This check applies to CA certificates that are `ACTIVE` or
     * `PENDING_TRANSFER` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-cacertificatekeyqualitycheck)
     */
    public fun caCertificateKeyQualityCheck(): Any? = unwrap(this).getCaCertificateKeyQualityCheck()

    /**
     * Checks if multiple devices connect using the same client ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-conflictingclientidscheck)
     */
    public fun conflictingClientIdsCheck(): Any? = unwrap(this).getConflictingClientIdsCheck()

    /**
     * Checks if a device certificate is expiring.
     *
     * This check applies to device certificates expiring within 30 days or that have expired.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-devicecertificateexpiringcheck)
     */
    public fun deviceCertificateExpiringCheck(): Any? =
        unwrap(this).getDeviceCertificateExpiringCheck()

    /**
     * Checks the quality of the device certificate key.
     *
     * The quality checks if the key is in a valid format, not expired, signed by a registered
     * certificate authority, and if the key meets a minimum required size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-devicecertificatekeyqualitycheck)
     */
    public fun deviceCertificateKeyQualityCheck(): Any? =
        unwrap(this).getDeviceCertificateKeyQualityCheck()

    /**
     * Checks if multiple concurrent connections use the same X.509 certificate to authenticate with
     * AWS IoT .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-devicecertificatesharedcheck)
     */
    public fun deviceCertificateSharedCheck(): Any? = unwrap(this).getDeviceCertificateSharedCheck()

    /**
     * Checks if device certificates are still active despite being revoked by an intermediate CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-intermediatecarevokedforactivedevicecertificatescheck)
     */
    public fun intermediateCaRevokedForActiveDeviceCertificatesCheck(): Any? =
        unwrap(this).getIntermediateCaRevokedForActiveDeviceCertificatesCheck()

    /**
     * Checks if an AWS IoT policy is potentially misconfigured.
     *
     * Misconfigured policies, including overly permissive policies, can cause security incidents
     * like allowing devices access to unintended resources. This check is a warning for you to make
     * sure that only intended actions are allowed before updating the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-iotpolicypotentialmisconfigurationcheck)
     */
    public fun ioTPolicyPotentialMisConfigurationCheck(): Any? =
        unwrap(this).getIoTPolicyPotentialMisConfigurationCheck()

    /**
     * Checks the permissiveness of a policy attached to an authenticated Amazon Cognito identity
     * pool role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-iotpolicyoverlypermissivecheck)
     */
    public fun iotPolicyOverlyPermissiveCheck(): Any? =
        unwrap(this).getIotPolicyOverlyPermissiveCheck()

    /**
     * Checks if a role alias has access to services that haven't been used for the AWS IoT device
     * in the last year.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-iotrolealiasallowsaccesstounusedservicescheck)
     */
    public fun iotRoleAliasAllowsAccessToUnusedServicesCheck(): Any? =
        unwrap(this).getIotRoleAliasAllowsAccessToUnusedServicesCheck()

    /**
     * Checks if the temporary credentials provided by AWS IoT role aliases are overly permissive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-iotrolealiasoverlypermissivecheck)
     */
    public fun iotRoleAliasOverlyPermissiveCheck(): Any? =
        unwrap(this).getIotRoleAliasOverlyPermissiveCheck()

    /**
     * Checks if AWS IoT logs are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-loggingdisabledcheck)
     */
    public fun loggingDisabledCheck(): Any? = unwrap(this).getLoggingDisabledCheck()

    /**
     * Checks if a revoked CA certificate is still active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-revokedcacertificatestillactivecheck)
     */
    public fun revokedCaCertificateStillActiveCheck(): Any? =
        unwrap(this).getRevokedCaCertificateStillActiveCheck()

    /**
     * Checks if a revoked device certificate is still active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-revokeddevicecertificatestillactivecheck)
     */
    public fun revokedDeviceCertificateStillActiveCheck(): Any? =
        unwrap(this).getRevokedDeviceCertificateStillActiveCheck()

    /**
     * Checks if policy attached to an unauthenticated Amazon Cognito identity pool role is too
     * permissive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-unauthenticatedcognitoroleoverlypermissivecheck)
     */
    public fun unauthenticatedCognitoRoleOverlyPermissiveCheck(): Any? =
        unwrap(this).getUnauthenticatedCognitoRoleOverlyPermissiveCheck()

    /**
     * A builder for [AuditCheckConfigurationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticatedCognitoRoleOverlyPermissiveCheck Checks the permissiveness of an
       * authenticated Amazon Cognito identity pool role.
       * For this check, AWS IoT Device Defender audits all Amazon Cognito identity pools that have
       * been used to connect to the AWS IoT message broker during the 31 days before the audit is
       * performed.
       */
      public
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: IResolvable)

      /**
       * @param authenticatedCognitoRoleOverlyPermissiveCheck Checks the permissiveness of an
       * authenticated Amazon Cognito identity pool role.
       * For this check, AWS IoT Device Defender audits all Amazon Cognito identity pools that have
       * been used to connect to the AWS IoT message broker during the 31 days before the audit is
       * performed.
       */
      public
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty)

      /**
       * @param authenticatedCognitoRoleOverlyPermissiveCheck Checks the permissiveness of an
       * authenticated Amazon Cognito identity pool role.
       * For this check, AWS IoT Device Defender audits all Amazon Cognito identity pools that have
       * been used to connect to the AWS IoT message broker during the 31 days before the audit is
       * performed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d596c4da8b6e3211955539ed4a8a84f6cd1ca63e7b4676a7ccd1660bf7b56cdf")
      public
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param caCertificateExpiringCheck Checks if a CA certificate is expiring.
       * This check applies to CA certificates expiring within 30 days or that have expired.
       */
      public fun caCertificateExpiringCheck(caCertificateExpiringCheck: IResolvable)

      /**
       * @param caCertificateExpiringCheck Checks if a CA certificate is expiring.
       * This check applies to CA certificates expiring within 30 days or that have expired.
       */
      public
          fun caCertificateExpiringCheck(caCertificateExpiringCheck: AuditCheckConfigurationProperty)

      /**
       * @param caCertificateExpiringCheck Checks if a CA certificate is expiring.
       * This check applies to CA certificates expiring within 30 days or that have expired.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79d30028405dcb4e28ef556df4a0968eb893433e603f82b1e8c0f0153e712115")
      public
          fun caCertificateExpiringCheck(caCertificateExpiringCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param caCertificateKeyQualityCheck Checks the quality of the CA certificate key.
       * The quality checks if the key is in a valid format, not expired, and if the key meets a
       * minimum required size. This check applies to CA certificates that are `ACTIVE` or
       * `PENDING_TRANSFER` .
       */
      public fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: IResolvable)

      /**
       * @param caCertificateKeyQualityCheck Checks the quality of the CA certificate key.
       * The quality checks if the key is in a valid format, not expired, and if the key meets a
       * minimum required size. This check applies to CA certificates that are `ACTIVE` or
       * `PENDING_TRANSFER` .
       */
      public
          fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: AuditCheckConfigurationProperty)

      /**
       * @param caCertificateKeyQualityCheck Checks the quality of the CA certificate key.
       * The quality checks if the key is in a valid format, not expired, and if the key meets a
       * minimum required size. This check applies to CA certificates that are `ACTIVE` or
       * `PENDING_TRANSFER` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf8fea956a0b34ee11094ee82ca9bf9a48fe3e3fa824888aacc0706cea15d742")
      public
          fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param conflictingClientIdsCheck Checks if multiple devices connect using the same client
       * ID.
       */
      public fun conflictingClientIdsCheck(conflictingClientIdsCheck: IResolvable)

      /**
       * @param conflictingClientIdsCheck Checks if multiple devices connect using the same client
       * ID.
       */
      public
          fun conflictingClientIdsCheck(conflictingClientIdsCheck: AuditCheckConfigurationProperty)

      /**
       * @param conflictingClientIdsCheck Checks if multiple devices connect using the same client
       * ID.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfdeb1ba5b8e5a3036eb213fbd041826d33645f984a50b0697773ab6c9891542")
      public
          fun conflictingClientIdsCheck(conflictingClientIdsCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param deviceCertificateExpiringCheck Checks if a device certificate is expiring.
       * This check applies to device certificates expiring within 30 days or that have expired.
       */
      public fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: IResolvable)

      /**
       * @param deviceCertificateExpiringCheck Checks if a device certificate is expiring.
       * This check applies to device certificates expiring within 30 days or that have expired.
       */
      public
          fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: AuditCheckConfigurationProperty)

      /**
       * @param deviceCertificateExpiringCheck Checks if a device certificate is expiring.
       * This check applies to device certificates expiring within 30 days or that have expired.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9814c5ca0741b1b13ae05eda9e8c60d0d330ac2f6ab0cc7544949b75cdee9ad8")
      public
          fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param deviceCertificateKeyQualityCheck Checks the quality of the device certificate key.
       * The quality checks if the key is in a valid format, not expired, signed by a registered
       * certificate authority, and if the key meets a minimum required size.
       */
      public fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: IResolvable)

      /**
       * @param deviceCertificateKeyQualityCheck Checks the quality of the device certificate key.
       * The quality checks if the key is in a valid format, not expired, signed by a registered
       * certificate authority, and if the key meets a minimum required size.
       */
      public
          fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: AuditCheckConfigurationProperty)

      /**
       * @param deviceCertificateKeyQualityCheck Checks the quality of the device certificate key.
       * The quality checks if the key is in a valid format, not expired, signed by a registered
       * certificate authority, and if the key meets a minimum required size.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99651d622afd4a3f09ec16848d6c43c0cb62e2a4448e4a8d84d7a4e524f75fa8")
      public
          fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param deviceCertificateSharedCheck Checks if multiple concurrent connections use the same
       * X.509 certificate to authenticate with AWS IoT .
       */
      public fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: IResolvable)

      /**
       * @param deviceCertificateSharedCheck Checks if multiple concurrent connections use the same
       * X.509 certificate to authenticate with AWS IoT .
       */
      public
          fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: AuditCheckConfigurationProperty)

      /**
       * @param deviceCertificateSharedCheck Checks if multiple concurrent connections use the same
       * X.509 certificate to authenticate with AWS IoT .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c136b883a4189c6b06d215d70f4891cc7b159be6dfcec324bfb703f62fd2ad8")
      public
          fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param intermediateCaRevokedForActiveDeviceCertificatesCheck Checks if device certificates
       * are still active despite being revoked by an intermediate CA.
       */
      public
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: IResolvable)

      /**
       * @param intermediateCaRevokedForActiveDeviceCertificatesCheck Checks if device certificates
       * are still active despite being revoked by an intermediate CA.
       */
      public
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: AuditCheckConfigurationProperty)

      /**
       * @param intermediateCaRevokedForActiveDeviceCertificatesCheck Checks if device certificates
       * are still active despite being revoked by an intermediate CA.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f84da34c28852685ac209d8bd31c410efc44207dcd3efbbcf80790eabd0e5134")
      public
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param ioTPolicyPotentialMisConfigurationCheck Checks if an AWS IoT policy is potentially
       * misconfigured.
       * Misconfigured policies, including overly permissive policies, can cause security incidents
       * like allowing devices access to unintended resources. This check is a warning for you to make
       * sure that only intended actions are allowed before updating the policy.
       */
      public
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: IResolvable)

      /**
       * @param ioTPolicyPotentialMisConfigurationCheck Checks if an AWS IoT policy is potentially
       * misconfigured.
       * Misconfigured policies, including overly permissive policies, can cause security incidents
       * like allowing devices access to unintended resources. This check is a warning for you to make
       * sure that only intended actions are allowed before updating the policy.
       */
      public
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: AuditCheckConfigurationProperty)

      /**
       * @param ioTPolicyPotentialMisConfigurationCheck Checks if an AWS IoT policy is potentially
       * misconfigured.
       * Misconfigured policies, including overly permissive policies, can cause security incidents
       * like allowing devices access to unintended resources. This check is a warning for you to make
       * sure that only intended actions are allowed before updating the policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1f632750f84c7705f353bca50b32703a0eaed2f9a092f70cdb52d9d2c36abc6")
      public
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param iotPolicyOverlyPermissiveCheck Checks the permissiveness of a policy attached to an
       * authenticated Amazon Cognito identity pool role.
       */
      public fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: IResolvable)

      /**
       * @param iotPolicyOverlyPermissiveCheck Checks the permissiveness of a policy attached to an
       * authenticated Amazon Cognito identity pool role.
       */
      public
          fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: AuditCheckConfigurationProperty)

      /**
       * @param iotPolicyOverlyPermissiveCheck Checks the permissiveness of a policy attached to an
       * authenticated Amazon Cognito identity pool role.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("954f13a4eb8bd15228dd8fc02967a9584bad92116c1f2e97754fbaf5ac86e176")
      public
          fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param iotRoleAliasAllowsAccessToUnusedServicesCheck Checks if a role alias has access to
       * services that haven't been used for the AWS IoT device in the last year.
       */
      public
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: IResolvable)

      /**
       * @param iotRoleAliasAllowsAccessToUnusedServicesCheck Checks if a role alias has access to
       * services that haven't been used for the AWS IoT device in the last year.
       */
      public
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: AuditCheckConfigurationProperty)

      /**
       * @param iotRoleAliasAllowsAccessToUnusedServicesCheck Checks if a role alias has access to
       * services that haven't been used for the AWS IoT device in the last year.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a3c4a9e7e0a4ce6d821602798b5ec6163713ab9c6ba0a906650f6462814c937")
      public
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param iotRoleAliasOverlyPermissiveCheck Checks if the temporary credentials provided by
       * AWS IoT role aliases are overly permissive.
       */
      public fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: IResolvable)

      /**
       * @param iotRoleAliasOverlyPermissiveCheck Checks if the temporary credentials provided by
       * AWS IoT role aliases are overly permissive.
       */
      public
          fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: AuditCheckConfigurationProperty)

      /**
       * @param iotRoleAliasOverlyPermissiveCheck Checks if the temporary credentials provided by
       * AWS IoT role aliases are overly permissive.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b2fca4579c170f3751808329b7a3e51084e92c03958f84219ae7fdae69250dc")
      public
          fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param loggingDisabledCheck Checks if AWS IoT logs are disabled.
       */
      public fun loggingDisabledCheck(loggingDisabledCheck: IResolvable)

      /**
       * @param loggingDisabledCheck Checks if AWS IoT logs are disabled.
       */
      public fun loggingDisabledCheck(loggingDisabledCheck: AuditCheckConfigurationProperty)

      /**
       * @param loggingDisabledCheck Checks if AWS IoT logs are disabled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6dc6a9e06d6dc3c04fb199aa0ddb1dccba9b1e39345f272dc476e9fcabcc59af")
      public
          fun loggingDisabledCheck(loggingDisabledCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param revokedCaCertificateStillActiveCheck Checks if a revoked CA certificate is still
       * active.
       */
      public
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: IResolvable)

      /**
       * @param revokedCaCertificateStillActiveCheck Checks if a revoked CA certificate is still
       * active.
       */
      public
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: AuditCheckConfigurationProperty)

      /**
       * @param revokedCaCertificateStillActiveCheck Checks if a revoked CA certificate is still
       * active.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd0d9360432c0267fb775d163a4f7d659abacf6ec7d9c0a984fbb42203115b77")
      public
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param revokedDeviceCertificateStillActiveCheck Checks if a revoked device certificate is
       * still active.
       */
      public
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: IResolvable)

      /**
       * @param revokedDeviceCertificateStillActiveCheck Checks if a revoked device certificate is
       * still active.
       */
      public
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: AuditCheckConfigurationProperty)

      /**
       * @param revokedDeviceCertificateStillActiveCheck Checks if a revoked device certificate is
       * still active.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5090d49ea3ef6201987bdb4d308f4fd0e685bf5f7543ac916ddad0597ba2be")
      public
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)

      /**
       * @param unauthenticatedCognitoRoleOverlyPermissiveCheck Checks if policy attached to an
       * unauthenticated Amazon Cognito identity pool role is too permissive.
       */
      public
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: IResolvable)

      /**
       * @param unauthenticatedCognitoRoleOverlyPermissiveCheck Checks if policy attached to an
       * unauthenticated Amazon Cognito identity pool role is too permissive.
       */
      public
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty)

      /**
       * @param unauthenticatedCognitoRoleOverlyPermissiveCheck Checks if policy attached to an
       * unauthenticated Amazon Cognito identity pool role is too permissive.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43ebc30a66a6d2708c20289ed0282fc6c3660fa1154d82aacdcb614d904a9284")
      public
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.builder()

      /**
       * @param authenticatedCognitoRoleOverlyPermissiveCheck Checks the permissiveness of an
       * authenticated Amazon Cognito identity pool role.
       * For this check, AWS IoT Device Defender audits all Amazon Cognito identity pools that have
       * been used to connect to the AWS IoT message broker during the 31 days before the audit is
       * performed.
       */
      override
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authenticatedCognitoRoleOverlyPermissiveCheck Checks the permissiveness of an
       * authenticated Amazon Cognito identity pool role.
       * For this check, AWS IoT Device Defender audits all Amazon Cognito identity pools that have
       * been used to connect to the AWS IoT message broker during the 31 days before the audit is
       * performed.
       */
      override
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param authenticatedCognitoRoleOverlyPermissiveCheck Checks the permissiveness of an
       * authenticated Amazon Cognito identity pool role.
       * For this check, AWS IoT Device Defender audits all Amazon Cognito identity pools that have
       * been used to connect to the AWS IoT message broker during the 31 days before the audit is
       * performed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d596c4da8b6e3211955539ed4a8a84f6cd1ca63e7b4676a7ccd1660bf7b56cdf")
      override
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          authenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty(authenticatedCognitoRoleOverlyPermissiveCheck))

      /**
       * @param caCertificateExpiringCheck Checks if a CA certificate is expiring.
       * This check applies to CA certificates expiring within 30 days or that have expired.
       */
      override fun caCertificateExpiringCheck(caCertificateExpiringCheck: IResolvable) {
        cdkBuilder.caCertificateExpiringCheck(caCertificateExpiringCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param caCertificateExpiringCheck Checks if a CA certificate is expiring.
       * This check applies to CA certificates expiring within 30 days or that have expired.
       */
      override
          fun caCertificateExpiringCheck(caCertificateExpiringCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.caCertificateExpiringCheck(caCertificateExpiringCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param caCertificateExpiringCheck Checks if a CA certificate is expiring.
       * This check applies to CA certificates expiring within 30 days or that have expired.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79d30028405dcb4e28ef556df4a0968eb893433e603f82b1e8c0f0153e712115")
      override
          fun caCertificateExpiringCheck(caCertificateExpiringCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          caCertificateExpiringCheck(AuditCheckConfigurationProperty(caCertificateExpiringCheck))

      /**
       * @param caCertificateKeyQualityCheck Checks the quality of the CA certificate key.
       * The quality checks if the key is in a valid format, not expired, and if the key meets a
       * minimum required size. This check applies to CA certificates that are `ACTIVE` or
       * `PENDING_TRANSFER` .
       */
      override fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: IResolvable) {
        cdkBuilder.caCertificateKeyQualityCheck(caCertificateKeyQualityCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param caCertificateKeyQualityCheck Checks the quality of the CA certificate key.
       * The quality checks if the key is in a valid format, not expired, and if the key meets a
       * minimum required size. This check applies to CA certificates that are `ACTIVE` or
       * `PENDING_TRANSFER` .
       */
      override
          fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.caCertificateKeyQualityCheck(caCertificateKeyQualityCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param caCertificateKeyQualityCheck Checks the quality of the CA certificate key.
       * The quality checks if the key is in a valid format, not expired, and if the key meets a
       * minimum required size. This check applies to CA certificates that are `ACTIVE` or
       * `PENDING_TRANSFER` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf8fea956a0b34ee11094ee82ca9bf9a48fe3e3fa824888aacc0706cea15d742")
      override
          fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          caCertificateKeyQualityCheck(AuditCheckConfigurationProperty(caCertificateKeyQualityCheck))

      /**
       * @param conflictingClientIdsCheck Checks if multiple devices connect using the same client
       * ID.
       */
      override fun conflictingClientIdsCheck(conflictingClientIdsCheck: IResolvable) {
        cdkBuilder.conflictingClientIdsCheck(conflictingClientIdsCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conflictingClientIdsCheck Checks if multiple devices connect using the same client
       * ID.
       */
      override
          fun conflictingClientIdsCheck(conflictingClientIdsCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.conflictingClientIdsCheck(conflictingClientIdsCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param conflictingClientIdsCheck Checks if multiple devices connect using the same client
       * ID.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfdeb1ba5b8e5a3036eb213fbd041826d33645f984a50b0697773ab6c9891542")
      override
          fun conflictingClientIdsCheck(conflictingClientIdsCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          conflictingClientIdsCheck(AuditCheckConfigurationProperty(conflictingClientIdsCheck))

      /**
       * @param deviceCertificateExpiringCheck Checks if a device certificate is expiring.
       * This check applies to device certificates expiring within 30 days or that have expired.
       */
      override fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: IResolvable) {
        cdkBuilder.deviceCertificateExpiringCheck(deviceCertificateExpiringCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deviceCertificateExpiringCheck Checks if a device certificate is expiring.
       * This check applies to device certificates expiring within 30 days or that have expired.
       */
      override
          fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.deviceCertificateExpiringCheck(deviceCertificateExpiringCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param deviceCertificateExpiringCheck Checks if a device certificate is expiring.
       * This check applies to device certificates expiring within 30 days or that have expired.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9814c5ca0741b1b13ae05eda9e8c60d0d330ac2f6ab0cc7544949b75cdee9ad8")
      override
          fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          deviceCertificateExpiringCheck(AuditCheckConfigurationProperty(deviceCertificateExpiringCheck))

      /**
       * @param deviceCertificateKeyQualityCheck Checks the quality of the device certificate key.
       * The quality checks if the key is in a valid format, not expired, signed by a registered
       * certificate authority, and if the key meets a minimum required size.
       */
      override fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: IResolvable) {
        cdkBuilder.deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deviceCertificateKeyQualityCheck Checks the quality of the device certificate key.
       * The quality checks if the key is in a valid format, not expired, signed by a registered
       * certificate authority, and if the key meets a minimum required size.
       */
      override
          fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param deviceCertificateKeyQualityCheck Checks the quality of the device certificate key.
       * The quality checks if the key is in a valid format, not expired, signed by a registered
       * certificate authority, and if the key meets a minimum required size.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99651d622afd4a3f09ec16848d6c43c0cb62e2a4448e4a8d84d7a4e524f75fa8")
      override
          fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          deviceCertificateKeyQualityCheck(AuditCheckConfigurationProperty(deviceCertificateKeyQualityCheck))

      /**
       * @param deviceCertificateSharedCheck Checks if multiple concurrent connections use the same
       * X.509 certificate to authenticate with AWS IoT .
       */
      override fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: IResolvable) {
        cdkBuilder.deviceCertificateSharedCheck(deviceCertificateSharedCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deviceCertificateSharedCheck Checks if multiple concurrent connections use the same
       * X.509 certificate to authenticate with AWS IoT .
       */
      override
          fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.deviceCertificateSharedCheck(deviceCertificateSharedCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param deviceCertificateSharedCheck Checks if multiple concurrent connections use the same
       * X.509 certificate to authenticate with AWS IoT .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c136b883a4189c6b06d215d70f4891cc7b159be6dfcec324bfb703f62fd2ad8")
      override
          fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          deviceCertificateSharedCheck(AuditCheckConfigurationProperty(deviceCertificateSharedCheck))

      /**
       * @param intermediateCaRevokedForActiveDeviceCertificatesCheck Checks if device certificates
       * are still active despite being revoked by an intermediate CA.
       */
      override
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: IResolvable) {
        cdkBuilder.intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param intermediateCaRevokedForActiveDeviceCertificatesCheck Checks if device certificates
       * are still active despite being revoked by an intermediate CA.
       */
      override
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param intermediateCaRevokedForActiveDeviceCertificatesCheck Checks if device certificates
       * are still active despite being revoked by an intermediate CA.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f84da34c28852685ac209d8bd31c410efc44207dcd3efbbcf80790eabd0e5134")
      override
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          intermediateCaRevokedForActiveDeviceCertificatesCheck(AuditCheckConfigurationProperty(intermediateCaRevokedForActiveDeviceCertificatesCheck))

      /**
       * @param ioTPolicyPotentialMisConfigurationCheck Checks if an AWS IoT policy is potentially
       * misconfigured.
       * Misconfigured policies, including overly permissive policies, can cause security incidents
       * like allowing devices access to unintended resources. This check is a warning for you to make
       * sure that only intended actions are allowed before updating the policy.
       */
      override
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: IResolvable) {
        cdkBuilder.ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ioTPolicyPotentialMisConfigurationCheck Checks if an AWS IoT policy is potentially
       * misconfigured.
       * Misconfigured policies, including overly permissive policies, can cause security incidents
       * like allowing devices access to unintended resources. This check is a warning for you to make
       * sure that only intended actions are allowed before updating the policy.
       */
      override
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param ioTPolicyPotentialMisConfigurationCheck Checks if an AWS IoT policy is potentially
       * misconfigured.
       * Misconfigured policies, including overly permissive policies, can cause security incidents
       * like allowing devices access to unintended resources. This check is a warning for you to make
       * sure that only intended actions are allowed before updating the policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1f632750f84c7705f353bca50b32703a0eaed2f9a092f70cdb52d9d2c36abc6")
      override
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          ioTPolicyPotentialMisConfigurationCheck(AuditCheckConfigurationProperty(ioTPolicyPotentialMisConfigurationCheck))

      /**
       * @param iotPolicyOverlyPermissiveCheck Checks the permissiveness of a policy attached to an
       * authenticated Amazon Cognito identity pool role.
       */
      override fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iotPolicyOverlyPermissiveCheck Checks the permissiveness of a policy attached to an
       * authenticated Amazon Cognito identity pool role.
       */
      override
          fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param iotPolicyOverlyPermissiveCheck Checks the permissiveness of a policy attached to an
       * authenticated Amazon Cognito identity pool role.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("954f13a4eb8bd15228dd8fc02967a9584bad92116c1f2e97754fbaf5ac86e176")
      override
          fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          iotPolicyOverlyPermissiveCheck(AuditCheckConfigurationProperty(iotPolicyOverlyPermissiveCheck))

      /**
       * @param iotRoleAliasAllowsAccessToUnusedServicesCheck Checks if a role alias has access to
       * services that haven't been used for the AWS IoT device in the last year.
       */
      override
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: IResolvable) {
        cdkBuilder.iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iotRoleAliasAllowsAccessToUnusedServicesCheck Checks if a role alias has access to
       * services that haven't been used for the AWS IoT device in the last year.
       */
      override
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param iotRoleAliasAllowsAccessToUnusedServicesCheck Checks if a role alias has access to
       * services that haven't been used for the AWS IoT device in the last year.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a3c4a9e7e0a4ce6d821602798b5ec6163713ab9c6ba0a906650f6462814c937")
      override
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          iotRoleAliasAllowsAccessToUnusedServicesCheck(AuditCheckConfigurationProperty(iotRoleAliasAllowsAccessToUnusedServicesCheck))

      /**
       * @param iotRoleAliasOverlyPermissiveCheck Checks if the temporary credentials provided by
       * AWS IoT role aliases are overly permissive.
       */
      override
          fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iotRoleAliasOverlyPermissiveCheck Checks if the temporary credentials provided by
       * AWS IoT role aliases are overly permissive.
       */
      override
          fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param iotRoleAliasOverlyPermissiveCheck Checks if the temporary credentials provided by
       * AWS IoT role aliases are overly permissive.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b2fca4579c170f3751808329b7a3e51084e92c03958f84219ae7fdae69250dc")
      override
          fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          iotRoleAliasOverlyPermissiveCheck(AuditCheckConfigurationProperty(iotRoleAliasOverlyPermissiveCheck))

      /**
       * @param loggingDisabledCheck Checks if AWS IoT logs are disabled.
       */
      override fun loggingDisabledCheck(loggingDisabledCheck: IResolvable) {
        cdkBuilder.loggingDisabledCheck(loggingDisabledCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param loggingDisabledCheck Checks if AWS IoT logs are disabled.
       */
      override fun loggingDisabledCheck(loggingDisabledCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.loggingDisabledCheck(loggingDisabledCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param loggingDisabledCheck Checks if AWS IoT logs are disabled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6dc6a9e06d6dc3c04fb199aa0ddb1dccba9b1e39345f272dc476e9fcabcc59af")
      override
          fun loggingDisabledCheck(loggingDisabledCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit = loggingDisabledCheck(AuditCheckConfigurationProperty(loggingDisabledCheck))

      /**
       * @param revokedCaCertificateStillActiveCheck Checks if a revoked CA certificate is still
       * active.
       */
      override
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: IResolvable) {
        cdkBuilder.revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param revokedCaCertificateStillActiveCheck Checks if a revoked CA certificate is still
       * active.
       */
      override
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param revokedCaCertificateStillActiveCheck Checks if a revoked CA certificate is still
       * active.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd0d9360432c0267fb775d163a4f7d659abacf6ec7d9c0a984fbb42203115b77")
      override
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          revokedCaCertificateStillActiveCheck(AuditCheckConfigurationProperty(revokedCaCertificateStillActiveCheck))

      /**
       * @param revokedDeviceCertificateStillActiveCheck Checks if a revoked device certificate is
       * still active.
       */
      override
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: IResolvable) {
        cdkBuilder.revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param revokedDeviceCertificateStillActiveCheck Checks if a revoked device certificate is
       * still active.
       */
      override
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param revokedDeviceCertificateStillActiveCheck Checks if a revoked device certificate is
       * still active.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5090d49ea3ef6201987bdb4d308f4fd0e685bf5f7543ac916ddad0597ba2be")
      override
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          revokedDeviceCertificateStillActiveCheck(AuditCheckConfigurationProperty(revokedDeviceCertificateStillActiveCheck))

      /**
       * @param unauthenticatedCognitoRoleOverlyPermissiveCheck Checks if policy attached to an
       * unauthenticated Amazon Cognito identity pool role is too permissive.
       */
      override
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param unauthenticatedCognitoRoleOverlyPermissiveCheck Checks if policy attached to an
       * unauthenticated Amazon Cognito identity pool role is too permissive.
       */
      override
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck.let(AuditCheckConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param unauthenticatedCognitoRoleOverlyPermissiveCheck Checks if policy attached to an
       * unauthenticated Amazon Cognito identity pool role is too permissive.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43ebc30a66a6d2708c20289ed0282fc6c3660fa1154d82aacdcb614d904a9284")
      override
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          unauthenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty(unauthenticatedCognitoRoleOverlyPermissiveCheck))

      public fun build():
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty,
    ) : CdkObject(cdkObject), AuditCheckConfigurationsProperty {
      /**
       * Checks the permissiveness of an authenticated Amazon Cognito identity pool role.
       *
       * For this check, AWS IoT Device Defender audits all Amazon Cognito identity pools that have
       * been used to connect to the AWS IoT message broker during the 31 days before the audit is
       * performed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-authenticatedcognitoroleoverlypermissivecheck)
       */
      override fun authenticatedCognitoRoleOverlyPermissiveCheck(): Any? =
          unwrap(this).getAuthenticatedCognitoRoleOverlyPermissiveCheck()

      /**
       * Checks if a CA certificate is expiring.
       *
       * This check applies to CA certificates expiring within 30 days or that have expired.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-cacertificateexpiringcheck)
       */
      override fun caCertificateExpiringCheck(): Any? = unwrap(this).getCaCertificateExpiringCheck()

      /**
       * Checks the quality of the CA certificate key.
       *
       * The quality checks if the key is in a valid format, not expired, and if the key meets a
       * minimum required size. This check applies to CA certificates that are `ACTIVE` or
       * `PENDING_TRANSFER` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-cacertificatekeyqualitycheck)
       */
      override fun caCertificateKeyQualityCheck(): Any? =
          unwrap(this).getCaCertificateKeyQualityCheck()

      /**
       * Checks if multiple devices connect using the same client ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-conflictingclientidscheck)
       */
      override fun conflictingClientIdsCheck(): Any? = unwrap(this).getConflictingClientIdsCheck()

      /**
       * Checks if a device certificate is expiring.
       *
       * This check applies to device certificates expiring within 30 days or that have expired.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-devicecertificateexpiringcheck)
       */
      override fun deviceCertificateExpiringCheck(): Any? =
          unwrap(this).getDeviceCertificateExpiringCheck()

      /**
       * Checks the quality of the device certificate key.
       *
       * The quality checks if the key is in a valid format, not expired, signed by a registered
       * certificate authority, and if the key meets a minimum required size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-devicecertificatekeyqualitycheck)
       */
      override fun deviceCertificateKeyQualityCheck(): Any? =
          unwrap(this).getDeviceCertificateKeyQualityCheck()

      /**
       * Checks if multiple concurrent connections use the same X.509 certificate to authenticate
       * with AWS IoT .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-devicecertificatesharedcheck)
       */
      override fun deviceCertificateSharedCheck(): Any? =
          unwrap(this).getDeviceCertificateSharedCheck()

      /**
       * Checks if device certificates are still active despite being revoked by an intermediate CA.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-intermediatecarevokedforactivedevicecertificatescheck)
       */
      override fun intermediateCaRevokedForActiveDeviceCertificatesCheck(): Any? =
          unwrap(this).getIntermediateCaRevokedForActiveDeviceCertificatesCheck()

      /**
       * Checks if an AWS IoT policy is potentially misconfigured.
       *
       * Misconfigured policies, including overly permissive policies, can cause security incidents
       * like allowing devices access to unintended resources. This check is a warning for you to make
       * sure that only intended actions are allowed before updating the policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-iotpolicypotentialmisconfigurationcheck)
       */
      override fun ioTPolicyPotentialMisConfigurationCheck(): Any? =
          unwrap(this).getIoTPolicyPotentialMisConfigurationCheck()

      /**
       * Checks the permissiveness of a policy attached to an authenticated Amazon Cognito identity
       * pool role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-iotpolicyoverlypermissivecheck)
       */
      override fun iotPolicyOverlyPermissiveCheck(): Any? =
          unwrap(this).getIotPolicyOverlyPermissiveCheck()

      /**
       * Checks if a role alias has access to services that haven't been used for the AWS IoT device
       * in the last year.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-iotrolealiasallowsaccesstounusedservicescheck)
       */
      override fun iotRoleAliasAllowsAccessToUnusedServicesCheck(): Any? =
          unwrap(this).getIotRoleAliasAllowsAccessToUnusedServicesCheck()

      /**
       * Checks if the temporary credentials provided by AWS IoT role aliases are overly permissive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-iotrolealiasoverlypermissivecheck)
       */
      override fun iotRoleAliasOverlyPermissiveCheck(): Any? =
          unwrap(this).getIotRoleAliasOverlyPermissiveCheck()

      /**
       * Checks if AWS IoT logs are disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-loggingdisabledcheck)
       */
      override fun loggingDisabledCheck(): Any? = unwrap(this).getLoggingDisabledCheck()

      /**
       * Checks if a revoked CA certificate is still active.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-revokedcacertificatestillactivecheck)
       */
      override fun revokedCaCertificateStillActiveCheck(): Any? =
          unwrap(this).getRevokedCaCertificateStillActiveCheck()

      /**
       * Checks if a revoked device certificate is still active.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-revokeddevicecertificatestillactivecheck)
       */
      override fun revokedDeviceCertificateStillActiveCheck(): Any? =
          unwrap(this).getRevokedDeviceCertificateStillActiveCheck()

      /**
       * Checks if policy attached to an unauthenticated Amazon Cognito identity pool role is too
       * permissive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations-unauthenticatedcognitoroleoverlypermissivecheck)
       */
      override fun unauthenticatedCognitoRoleOverlyPermissiveCheck(): Any? =
          unwrap(this).getUnauthenticatedCognitoRoleOverlyPermissiveCheck()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuditCheckConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty):
          AuditCheckConfigurationsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuditCheckConfigurationsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuditCheckConfigurationsProperty):
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty
    }
  }

  /**
   * The configuration of the audit notification target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AuditNotificationTargetConfigurationsProperty auditNotificationTargetConfigurationsProperty =
   * AuditNotificationTargetConfigurationsProperty.builder()
   * .sns(AuditNotificationTargetProperty.builder()
   * .enabled(false)
   * .roleArn("roleArn")
   * .targetArn("targetArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtargetconfigurations.html)
   */
  public interface AuditNotificationTargetConfigurationsProperty {
    /**
     * The `Sns` notification target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtargetconfigurations.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations-sns)
     */
    public fun sns(): Any? = unwrap(this).getSns()

    /**
     * A builder for [AuditNotificationTargetConfigurationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sns The `Sns` notification target.
       */
      public fun sns(sns: IResolvable)

      /**
       * @param sns The `Sns` notification target.
       */
      public fun sns(sns: AuditNotificationTargetProperty)

      /**
       * @param sns The `Sns` notification target.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb90c3d3c3cb7a59bdab3a99f45ae84f3033c4f55c30c8083a8d8a41099079b2")
      public fun sns(sns: AuditNotificationTargetProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.builder()

      /**
       * @param sns The `Sns` notification target.
       */
      override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sns The `Sns` notification target.
       */
      override fun sns(sns: AuditNotificationTargetProperty) {
        cdkBuilder.sns(sns.let(AuditNotificationTargetProperty.Companion::unwrap))
      }

      /**
       * @param sns The `Sns` notification target.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb90c3d3c3cb7a59bdab3a99f45ae84f3033c4f55c30c8083a8d8a41099079b2")
      override fun sns(sns: AuditNotificationTargetProperty.Builder.() -> Unit): Unit =
          sns(AuditNotificationTargetProperty(sns))

      public fun build():
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty,
    ) : CdkObject(cdkObject), AuditNotificationTargetConfigurationsProperty {
      /**
       * The `Sns` notification target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtargetconfigurations.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations-sns)
       */
      override fun sns(): Any? = unwrap(this).getSns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuditNotificationTargetConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty):
          AuditNotificationTargetConfigurationsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuditNotificationTargetConfigurationsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuditNotificationTargetConfigurationsProperty):
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty
    }
  }

  /**
   * Information about the targets to which audit notifications are sent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AuditNotificationTargetProperty auditNotificationTargetProperty =
   * AuditNotificationTargetProperty.builder()
   * .enabled(false)
   * .roleArn("roleArn")
   * .targetArn("targetArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtarget.html)
   */
  public interface AuditNotificationTargetProperty {
    /**
     * True if notifications to the target are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtarget.html#cfn-iot-accountauditconfiguration-auditnotificationtarget-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The ARN of the role that grants permission to send notifications to the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtarget.html#cfn-iot-accountauditconfiguration-auditnotificationtarget-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The ARN of the target (SNS topic) to which audit notifications are sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtarget.html#cfn-iot-accountauditconfiguration-auditnotificationtarget-targetarn)
     */
    public fun targetArn(): String? = unwrap(this).getTargetArn()

    /**
     * A builder for [AuditNotificationTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled True if notifications to the target are enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled True if notifications to the target are enabled.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param roleArn The ARN of the role that grants permission to send notifications to the
       * target.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param targetArn The ARN of the target (SNS topic) to which audit notifications are sent.
       */
      public fun targetArn(targetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty.builder()

      /**
       * @param enabled True if notifications to the target are enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled True if notifications to the target are enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param roleArn The ARN of the role that grants permission to send notifications to the
       * target.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param targetArn The ARN of the target (SNS topic) to which audit notifications are sent.
       */
      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty,
    ) : CdkObject(cdkObject), AuditNotificationTargetProperty {
      /**
       * True if notifications to the target are enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtarget.html#cfn-iot-accountauditconfiguration-auditnotificationtarget-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The ARN of the role that grants permission to send notifications to the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtarget.html#cfn-iot-accountauditconfiguration-auditnotificationtarget-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The ARN of the target (SNS topic) to which audit notifications are sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtarget.html#cfn-iot-accountauditconfiguration-auditnotificationtarget-targetarn)
       */
      override fun targetArn(): String? = unwrap(this).getTargetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuditNotificationTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty):
          AuditNotificationTargetProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuditNotificationTargetProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuditNotificationTargetProperty):
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty
    }
  }
}
