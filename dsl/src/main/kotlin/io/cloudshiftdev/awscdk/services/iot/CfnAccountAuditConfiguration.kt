package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccountAuditConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun accountId(): String = unwrap(this).getAccountId()

  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  public open fun auditCheckConfigurations(): Any = unwrap(this).getAuditCheckConfigurations()

  public open fun auditCheckConfigurations(`value`: IResolvable) {
    unwrap(this).setAuditCheckConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun auditCheckConfigurations(`value`: AuditCheckConfigurationsProperty) {
    unwrap(this).setAuditCheckConfigurations(`value`.let(AuditCheckConfigurationsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("565de4b18f527546eaa72c809c3ffa5fa4277be3a78f3b5a410e6e4cf05d9404")
  public open
      fun auditCheckConfigurations(`value`: AuditCheckConfigurationsProperty.Builder.() -> Unit):
      Unit = auditCheckConfigurations(AuditCheckConfigurationsProperty(`value`))

  public open fun auditNotificationTargetConfigurations(): Any? =
      unwrap(this).getAuditNotificationTargetConfigurations()

  public open fun auditNotificationTargetConfigurations(`value`: IResolvable) {
    unwrap(this).setAuditNotificationTargetConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open
      fun auditNotificationTargetConfigurations(`value`: AuditNotificationTargetConfigurationsProperty) {
    unwrap(this).setAuditNotificationTargetConfigurations(`value`.let(AuditNotificationTargetConfigurationsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ea7b6fd6d68f3a60a50af305243113d874fbee0fc9849d870a9b4aab707f7c6b")
  public open
      fun auditNotificationTargetConfigurations(`value`: AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit):
      Unit =
      auditNotificationTargetConfigurations(AuditNotificationTargetConfigurationsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public interface Builder {
    public fun accountId(accountId: String) {
    }

    public fun auditCheckConfigurations(auditCheckConfigurations: IResolvable) {
    }

    public
        fun auditCheckConfigurations(auditCheckConfigurations: AuditCheckConfigurationsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2858ee5587962257b860645893d89a65dc69350d42c4904164b339d052f203a9")
    public
        fun auditCheckConfigurations(auditCheckConfigurations: AuditCheckConfigurationsProperty.Builder.() -> Unit) {
    }

    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: IResolvable) {
    }

    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: AuditNotificationTargetConfigurationsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c3e120faddbcd13868d1324b3ca0a1ea85f501d00a6b50a60fe45751bc4bdd4")
    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit) {
    }

    public fun roleArn(roleArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.Builder
        = software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.Builder.create(scope, id)

    public override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    public override fun auditCheckConfigurations(auditCheckConfigurations: IResolvable) {
      cdkBuilder.auditCheckConfigurations(auditCheckConfigurations.let(IResolvable::unwrap))
    }

    public override
        fun auditCheckConfigurations(auditCheckConfigurations: AuditCheckConfigurationsProperty) {
      cdkBuilder.auditCheckConfigurations(auditCheckConfigurations.let(AuditCheckConfigurationsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2858ee5587962257b860645893d89a65dc69350d42c4904164b339d052f203a9")
    public override
        fun auditCheckConfigurations(auditCheckConfigurations: AuditCheckConfigurationsProperty.Builder.() -> Unit):
        Unit = auditCheckConfigurations(AuditCheckConfigurationsProperty(auditCheckConfigurations))

    public override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: IResolvable) {
      cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.let(IResolvable::unwrap))
    }

    public override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: AuditNotificationTargetConfigurationsProperty) {
      cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.let(AuditNotificationTargetConfigurationsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c3e120faddbcd13868d1324b3ca0a1ea85f501d00a6b50a60fe45751bc4bdd4")
    public override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit):
        Unit =
        auditNotificationTargetConfigurations(AuditNotificationTargetConfigurationsProperty(auditNotificationTargetConfigurations))

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration = wrapped.cdkObject
  }

  public interface AuditCheckConfigurationsProperty {
    public fun authenticatedCognitoRoleOverlyPermissiveCheck(): Any? =
        unwrap(this).getAuthenticatedCognitoRoleOverlyPermissiveCheck()

    public fun caCertificateExpiringCheck(): Any? = unwrap(this).getCaCertificateExpiringCheck()

    public fun caCertificateKeyQualityCheck(): Any? = unwrap(this).getCaCertificateKeyQualityCheck()

    public fun conflictingClientIdsCheck(): Any? = unwrap(this).getConflictingClientIdsCheck()

    public fun deviceCertificateExpiringCheck(): Any? =
        unwrap(this).getDeviceCertificateExpiringCheck()

    public fun deviceCertificateKeyQualityCheck(): Any? =
        unwrap(this).getDeviceCertificateKeyQualityCheck()

    public fun deviceCertificateSharedCheck(): Any? = unwrap(this).getDeviceCertificateSharedCheck()

    public fun intermediateCaRevokedForActiveDeviceCertificatesCheck(): Any? =
        unwrap(this).getIntermediateCaRevokedForActiveDeviceCertificatesCheck()

    public fun ioTPolicyPotentialMisConfigurationCheck(): Any? =
        unwrap(this).getIoTPolicyPotentialMisConfigurationCheck()

    public fun iotPolicyOverlyPermissiveCheck(): Any? =
        unwrap(this).getIotPolicyOverlyPermissiveCheck()

    public fun iotRoleAliasAllowsAccessToUnusedServicesCheck(): Any? =
        unwrap(this).getIotRoleAliasAllowsAccessToUnusedServicesCheck()

    public fun iotRoleAliasOverlyPermissiveCheck(): Any? =
        unwrap(this).getIotRoleAliasOverlyPermissiveCheck()

    public fun loggingDisabledCheck(): Any? = unwrap(this).getLoggingDisabledCheck()

    public fun revokedCaCertificateStillActiveCheck(): Any? =
        unwrap(this).getRevokedCaCertificateStillActiveCheck()

    public fun revokedDeviceCertificateStillActiveCheck(): Any? =
        unwrap(this).getRevokedDeviceCertificateStillActiveCheck()

    public fun unauthenticatedCognitoRoleOverlyPermissiveCheck(): Any? =
        unwrap(this).getUnauthenticatedCognitoRoleOverlyPermissiveCheck()

    public interface Builder {
      public
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: IResolvable) {
      }

      public
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d596c4da8b6e3211955539ed4a8a84f6cd1ca63e7b4676a7ccd1660bf7b56cdf")
      public
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public fun caCertificateExpiringCheck(caCertificateExpiringCheck: IResolvable) {
      }

      public
          fun caCertificateExpiringCheck(caCertificateExpiringCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79d30028405dcb4e28ef556df4a0968eb893433e603f82b1e8c0f0153e712115")
      public
          fun caCertificateExpiringCheck(caCertificateExpiringCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: IResolvable) {
      }

      public
          fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf8fea956a0b34ee11094ee82ca9bf9a48fe3e3fa824888aacc0706cea15d742")
      public
          fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public fun conflictingClientIdsCheck(conflictingClientIdsCheck: IResolvable) {
      }

      public
          fun conflictingClientIdsCheck(conflictingClientIdsCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfdeb1ba5b8e5a3036eb213fbd041826d33645f984a50b0697773ab6c9891542")
      public
          fun conflictingClientIdsCheck(conflictingClientIdsCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: IResolvable) {
      }

      public
          fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9814c5ca0741b1b13ae05eda9e8c60d0d330ac2f6ab0cc7544949b75cdee9ad8")
      public
          fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: IResolvable) {
      }

      public
          fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99651d622afd4a3f09ec16848d6c43c0cb62e2a4448e4a8d84d7a4e524f75fa8")
      public
          fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: IResolvable) {
      }

      public
          fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c136b883a4189c6b06d215d70f4891cc7b159be6dfcec324bfb703f62fd2ad8")
      public
          fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: IResolvable) {
      }

      public
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f84da34c28852685ac209d8bd31c410efc44207dcd3efbbcf80790eabd0e5134")
      public
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: IResolvable) {
      }

      public
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1f632750f84c7705f353bca50b32703a0eaed2f9a092f70cdb52d9d2c36abc6")
      public
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: IResolvable) {
      }

      public
          fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("954f13a4eb8bd15228dd8fc02967a9584bad92116c1f2e97754fbaf5ac86e176")
      public
          fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: IResolvable) {
      }

      public
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a3c4a9e7e0a4ce6d821602798b5ec6163713ab9c6ba0a906650f6462814c937")
      public
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: IResolvable) {
      }

      public
          fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b2fca4579c170f3751808329b7a3e51084e92c03958f84219ae7fdae69250dc")
      public
          fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public fun loggingDisabledCheck(loggingDisabledCheck: IResolvable) {
      }

      public fun loggingDisabledCheck(loggingDisabledCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6dc6a9e06d6dc3c04fb199aa0ddb1dccba9b1e39345f272dc476e9fcabcc59af")
      public
          fun loggingDisabledCheck(loggingDisabledCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: IResolvable) {
      }

      public
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd0d9360432c0267fb775d163a4f7d659abacf6ec7d9c0a984fbb42203115b77")
      public
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: IResolvable) {
      }

      public
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5090d49ea3ef6201987bdb4d308f4fd0e685bf5f7543ac916ddad0597ba2be")
      public
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }

      public
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: IResolvable) {
      }

      public
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43ebc30a66a6d2708c20289ed0282fc6c3660fa1154d82aacdcb614d904a9284")
      public
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.builder()

      public override
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck.let(IResolvable::unwrap))
      }

      public override
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d596c4da8b6e3211955539ed4a8a84f6cd1ca63e7b4676a7ccd1660bf7b56cdf")
      public override
          fun authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          authenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty(authenticatedCognitoRoleOverlyPermissiveCheck))

      public override fun caCertificateExpiringCheck(caCertificateExpiringCheck: IResolvable) {
        cdkBuilder.caCertificateExpiringCheck(caCertificateExpiringCheck.let(IResolvable::unwrap))
      }

      public override
          fun caCertificateExpiringCheck(caCertificateExpiringCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.caCertificateExpiringCheck(caCertificateExpiringCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79d30028405dcb4e28ef556df4a0968eb893433e603f82b1e8c0f0153e712115")
      public override
          fun caCertificateExpiringCheck(caCertificateExpiringCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          caCertificateExpiringCheck(AuditCheckConfigurationProperty(caCertificateExpiringCheck))

      public override fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: IResolvable) {
        cdkBuilder.caCertificateKeyQualityCheck(caCertificateKeyQualityCheck.let(IResolvable::unwrap))
      }

      public override
          fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.caCertificateKeyQualityCheck(caCertificateKeyQualityCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf8fea956a0b34ee11094ee82ca9bf9a48fe3e3fa824888aacc0706cea15d742")
      public override
          fun caCertificateKeyQualityCheck(caCertificateKeyQualityCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          caCertificateKeyQualityCheck(AuditCheckConfigurationProperty(caCertificateKeyQualityCheck))

      public override fun conflictingClientIdsCheck(conflictingClientIdsCheck: IResolvable) {
        cdkBuilder.conflictingClientIdsCheck(conflictingClientIdsCheck.let(IResolvable::unwrap))
      }

      public override
          fun conflictingClientIdsCheck(conflictingClientIdsCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.conflictingClientIdsCheck(conflictingClientIdsCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfdeb1ba5b8e5a3036eb213fbd041826d33645f984a50b0697773ab6c9891542")
      public override
          fun conflictingClientIdsCheck(conflictingClientIdsCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          conflictingClientIdsCheck(AuditCheckConfigurationProperty(conflictingClientIdsCheck))

      public override
          fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: IResolvable) {
        cdkBuilder.deviceCertificateExpiringCheck(deviceCertificateExpiringCheck.let(IResolvable::unwrap))
      }

      public override
          fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.deviceCertificateExpiringCheck(deviceCertificateExpiringCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9814c5ca0741b1b13ae05eda9e8c60d0d330ac2f6ab0cc7544949b75cdee9ad8")
      public override
          fun deviceCertificateExpiringCheck(deviceCertificateExpiringCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          deviceCertificateExpiringCheck(AuditCheckConfigurationProperty(deviceCertificateExpiringCheck))

      public override
          fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: IResolvable) {
        cdkBuilder.deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck.let(IResolvable::unwrap))
      }

      public override
          fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99651d622afd4a3f09ec16848d6c43c0cb62e2a4448e4a8d84d7a4e524f75fa8")
      public override
          fun deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          deviceCertificateKeyQualityCheck(AuditCheckConfigurationProperty(deviceCertificateKeyQualityCheck))

      public override fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: IResolvable) {
        cdkBuilder.deviceCertificateSharedCheck(deviceCertificateSharedCheck.let(IResolvable::unwrap))
      }

      public override
          fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.deviceCertificateSharedCheck(deviceCertificateSharedCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c136b883a4189c6b06d215d70f4891cc7b159be6dfcec324bfb703f62fd2ad8")
      public override
          fun deviceCertificateSharedCheck(deviceCertificateSharedCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          deviceCertificateSharedCheck(AuditCheckConfigurationProperty(deviceCertificateSharedCheck))

      public override
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: IResolvable) {
        cdkBuilder.intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck.let(IResolvable::unwrap))
      }

      public override
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f84da34c28852685ac209d8bd31c410efc44207dcd3efbbcf80790eabd0e5134")
      public override
          fun intermediateCaRevokedForActiveDeviceCertificatesCheck(intermediateCaRevokedForActiveDeviceCertificatesCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          intermediateCaRevokedForActiveDeviceCertificatesCheck(AuditCheckConfigurationProperty(intermediateCaRevokedForActiveDeviceCertificatesCheck))

      public override
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: IResolvable) {
        cdkBuilder.ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck.let(IResolvable::unwrap))
      }

      public override
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1f632750f84c7705f353bca50b32703a0eaed2f9a092f70cdb52d9d2c36abc6")
      public override
          fun ioTPolicyPotentialMisConfigurationCheck(ioTPolicyPotentialMisConfigurationCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          ioTPolicyPotentialMisConfigurationCheck(AuditCheckConfigurationProperty(ioTPolicyPotentialMisConfigurationCheck))

      public override
          fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck.let(IResolvable::unwrap))
      }

      public override
          fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("954f13a4eb8bd15228dd8fc02967a9584bad92116c1f2e97754fbaf5ac86e176")
      public override
          fun iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          iotPolicyOverlyPermissiveCheck(AuditCheckConfigurationProperty(iotPolicyOverlyPermissiveCheck))

      public override
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: IResolvable) {
        cdkBuilder.iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck.let(IResolvable::unwrap))
      }

      public override
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a3c4a9e7e0a4ce6d821602798b5ec6163713ab9c6ba0a906650f6462814c937")
      public override
          fun iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          iotRoleAliasAllowsAccessToUnusedServicesCheck(AuditCheckConfigurationProperty(iotRoleAliasAllowsAccessToUnusedServicesCheck))

      public override
          fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck.let(IResolvable::unwrap))
      }

      public override
          fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b2fca4579c170f3751808329b7a3e51084e92c03958f84219ae7fdae69250dc")
      public override
          fun iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          iotRoleAliasOverlyPermissiveCheck(AuditCheckConfigurationProperty(iotRoleAliasOverlyPermissiveCheck))

      public override fun loggingDisabledCheck(loggingDisabledCheck: IResolvable) {
        cdkBuilder.loggingDisabledCheck(loggingDisabledCheck.let(IResolvable::unwrap))
      }

      public override
          fun loggingDisabledCheck(loggingDisabledCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.loggingDisabledCheck(loggingDisabledCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6dc6a9e06d6dc3c04fb199aa0ddb1dccba9b1e39345f272dc476e9fcabcc59af")
      public override
          fun loggingDisabledCheck(loggingDisabledCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit = loggingDisabledCheck(AuditCheckConfigurationProperty(loggingDisabledCheck))

      public override
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: IResolvable) {
        cdkBuilder.revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck.let(IResolvable::unwrap))
      }

      public override
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd0d9360432c0267fb775d163a4f7d659abacf6ec7d9c0a984fbb42203115b77")
      public override
          fun revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          revokedCaCertificateStillActiveCheck(AuditCheckConfigurationProperty(revokedCaCertificateStillActiveCheck))

      public override
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: IResolvable) {
        cdkBuilder.revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck.let(IResolvable::unwrap))
      }

      public override
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5090d49ea3ef6201987bdb4d308f4fd0e685bf5f7543ac916ddad0597ba2be")
      public override
          fun revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          revokedDeviceCertificateStillActiveCheck(AuditCheckConfigurationProperty(revokedDeviceCertificateStillActiveCheck))

      public override
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: IResolvable) {
        cdkBuilder.unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck.let(IResolvable::unwrap))
      }

      public override
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty) {
        cdkBuilder.unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck.let(AuditCheckConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43ebc30a66a6d2708c20289ed0282fc6c3660fa1154d82aacdcb614d904a9284")
      public override
          fun unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck: AuditCheckConfigurationProperty.Builder.() -> Unit):
          Unit =
          unauthenticatedCognitoRoleOverlyPermissiveCheck(AuditCheckConfigurationProperty(unauthenticatedCognitoRoleOverlyPermissiveCheck))

      public fun build():
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty,
    ) : AuditCheckConfigurationsProperty {
      public override fun authenticatedCognitoRoleOverlyPermissiveCheck(): Any? =
          unwrap(this).getAuthenticatedCognitoRoleOverlyPermissiveCheck()

      public override fun caCertificateExpiringCheck(): Any? =
          unwrap(this).getCaCertificateExpiringCheck()

      public override fun caCertificateKeyQualityCheck(): Any? =
          unwrap(this).getCaCertificateKeyQualityCheck()

      public override fun conflictingClientIdsCheck(): Any? =
          unwrap(this).getConflictingClientIdsCheck()

      public override fun deviceCertificateExpiringCheck(): Any? =
          unwrap(this).getDeviceCertificateExpiringCheck()

      public override fun deviceCertificateKeyQualityCheck(): Any? =
          unwrap(this).getDeviceCertificateKeyQualityCheck()

      public override fun deviceCertificateSharedCheck(): Any? =
          unwrap(this).getDeviceCertificateSharedCheck()

      public override fun intermediateCaRevokedForActiveDeviceCertificatesCheck(): Any? =
          unwrap(this).getIntermediateCaRevokedForActiveDeviceCertificatesCheck()

      public override fun ioTPolicyPotentialMisConfigurationCheck(): Any? =
          unwrap(this).getIoTPolicyPotentialMisConfigurationCheck()

      public override fun iotPolicyOverlyPermissiveCheck(): Any? =
          unwrap(this).getIotPolicyOverlyPermissiveCheck()

      public override fun iotRoleAliasAllowsAccessToUnusedServicesCheck(): Any? =
          unwrap(this).getIotRoleAliasAllowsAccessToUnusedServicesCheck()

      public override fun iotRoleAliasOverlyPermissiveCheck(): Any? =
          unwrap(this).getIotRoleAliasOverlyPermissiveCheck()

      public override fun loggingDisabledCheck(): Any? = unwrap(this).getLoggingDisabledCheck()

      public override fun revokedCaCertificateStillActiveCheck(): Any? =
          unwrap(this).getRevokedCaCertificateStillActiveCheck()

      public override fun revokedDeviceCertificateStillActiveCheck(): Any? =
          unwrap(this).getRevokedDeviceCertificateStillActiveCheck()

      public override fun unauthenticatedCognitoRoleOverlyPermissiveCheck(): Any? =
          unwrap(this).getUnauthenticatedCognitoRoleOverlyPermissiveCheck()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuditCheckConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty):
          AuditCheckConfigurationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuditCheckConfigurationsProperty):
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AuditNotificationTargetProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun targetArn(): String? = unwrap(this).getTargetArn()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun targetArn(targetArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty,
    ) : AuditNotificationTargetProperty {
      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun roleArn(): String? = unwrap(this).getRoleArn()

      public override fun targetArn(): String? = unwrap(this).getTargetArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuditNotificationTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty):
          AuditNotificationTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuditNotificationTargetProperty):
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AuditCheckConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty,
    ) : AuditCheckConfigurationProperty {
      public override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuditCheckConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty):
          AuditCheckConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuditCheckConfigurationProperty):
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AuditNotificationTargetConfigurationsProperty {
    public fun sns(): Any? = unwrap(this).getSns()

    public interface Builder {
      public fun sns(sns: IResolvable) {
      }

      public fun sns(sns: AuditNotificationTargetProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb90c3d3c3cb7a59bdab3a99f45ae84f3033c4f55c30c8083a8d8a41099079b2")
      public fun sns(sns: AuditNotificationTargetProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.builder()

      public override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable::unwrap))
      }

      public override fun sns(sns: AuditNotificationTargetProperty) {
        cdkBuilder.sns(sns.let(AuditNotificationTargetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb90c3d3c3cb7a59bdab3a99f45ae84f3033c4f55c30c8083a8d8a41099079b2")
      public override fun sns(sns: AuditNotificationTargetProperty.Builder.() -> Unit): Unit =
          sns(AuditNotificationTargetProperty(sns))

      public fun build():
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty,
    ) : AuditNotificationTargetConfigurationsProperty {
      public override fun sns(): Any? = unwrap(this).getSns()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuditNotificationTargetConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty):
          AuditNotificationTargetConfigurationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuditNotificationTargetConfigurationsProperty):
          software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
