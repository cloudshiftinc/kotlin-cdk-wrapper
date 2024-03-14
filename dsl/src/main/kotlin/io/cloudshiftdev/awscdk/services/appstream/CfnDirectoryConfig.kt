package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDirectoryConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun certificateBasedAuthProperties(): Any? =
      unwrap(this).getCertificateBasedAuthProperties()

  public open fun certificateBasedAuthProperties(`value`: IResolvable) {
    unwrap(this).setCertificateBasedAuthProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun certificateBasedAuthProperties(`value`: CertificateBasedAuthPropertiesProperty) {
    unwrap(this).setCertificateBasedAuthProperties(`value`.let(CertificateBasedAuthPropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9796d94b3c4797087e0b00d8af75510af70387797371c8d12747f44c455276ac")
  public open
      fun certificateBasedAuthProperties(`value`: CertificateBasedAuthPropertiesProperty.Builder.() -> Unit):
      Unit = certificateBasedAuthProperties(CertificateBasedAuthPropertiesProperty(`value`))

  public open fun directoryName(): String = unwrap(this).getDirectoryName()

  public open fun directoryName(`value`: String) {
    unwrap(this).setDirectoryName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun organizationalUnitDistinguishedNames(): List<String> =
      unwrap(this).getOrganizationalUnitDistinguishedNames() ?: emptyList()

  public open fun organizationalUnitDistinguishedNames(`value`: List<String>) {
    unwrap(this).setOrganizationalUnitDistinguishedNames(`value`)
  }

  public open fun serviceAccountCredentials(): Any = unwrap(this).getServiceAccountCredentials()

  public open fun serviceAccountCredentials(`value`: IResolvable) {
    unwrap(this).setServiceAccountCredentials(`value`.let(IResolvable::unwrap))
  }

  public open fun serviceAccountCredentials(`value`: ServiceAccountCredentialsProperty) {
    unwrap(this).setServiceAccountCredentials(`value`.let(ServiceAccountCredentialsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3efba326cefc52ba79cbbddecb8f2cb656942263b62a3395cf104b46cde47290")
  public open
      fun serviceAccountCredentials(`value`: ServiceAccountCredentialsProperty.Builder.() -> Unit):
      Unit = serviceAccountCredentials(ServiceAccountCredentialsProperty(`value`))

  public interface Builder {
    public fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable)

    public
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CertificateBasedAuthPropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07e6d87a6faf9170028e72ab6676e76579aef55404ac67cd78d7a182f56ea872")
    public
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CertificateBasedAuthPropertiesProperty.Builder.() -> Unit)

    public fun directoryName(directoryName: String)

    public
        fun organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames: List<String>)

    public fun serviceAccountCredentials(serviceAccountCredentials: IResolvable)

    public
        fun serviceAccountCredentials(serviceAccountCredentials: ServiceAccountCredentialsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5a0c83adc83a14fb99d0a0505704c2a65f27695fe7b75e36d0429547fa893c6")
    public
        fun serviceAccountCredentials(serviceAccountCredentials: ServiceAccountCredentialsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnDirectoryConfig.Builder =
        software.amazon.awscdk.services.appstream.CfnDirectoryConfig.Builder.create(scope, id)

    override fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable) {
      cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties.let(IResolvable::unwrap))
    }

    override
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CertificateBasedAuthPropertiesProperty) {
      cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties.let(CertificateBasedAuthPropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07e6d87a6faf9170028e72ab6676e76579aef55404ac67cd78d7a182f56ea872")
    override
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CertificateBasedAuthPropertiesProperty.Builder.() -> Unit):
        Unit =
        certificateBasedAuthProperties(CertificateBasedAuthPropertiesProperty(certificateBasedAuthProperties))

    override fun directoryName(directoryName: String) {
      cdkBuilder.directoryName(directoryName)
    }

    override
        fun organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames: List<String>) {
      cdkBuilder.organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames)
    }

    override fun serviceAccountCredentials(serviceAccountCredentials: IResolvable) {
      cdkBuilder.serviceAccountCredentials(serviceAccountCredentials.let(IResolvable::unwrap))
    }

    override
        fun serviceAccountCredentials(serviceAccountCredentials: ServiceAccountCredentialsProperty) {
      cdkBuilder.serviceAccountCredentials(serviceAccountCredentials.let(ServiceAccountCredentialsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5a0c83adc83a14fb99d0a0505704c2a65f27695fe7b75e36d0429547fa893c6")
    override
        fun serviceAccountCredentials(serviceAccountCredentials: ServiceAccountCredentialsProperty.Builder.() -> Unit):
        Unit =
        serviceAccountCredentials(ServiceAccountCredentialsProperty(serviceAccountCredentials))

    public fun build(): software.amazon.awscdk.services.appstream.CfnDirectoryConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDirectoryConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDirectoryConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfig):
        CfnDirectoryConfig = CfnDirectoryConfig(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryConfig):
        software.amazon.awscdk.services.appstream.CfnDirectoryConfig = wrapped.cdkObject
  }

  public interface ServiceAccountCredentialsProperty {
    public fun accountName(): String

    public fun accountPassword(): String

    public interface Builder {
      public fun accountName(accountName: String)

      public fun accountPassword(accountPassword: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.builder()

      override fun accountName(accountName: String) {
        cdkBuilder.accountName(accountName)
      }

      override fun accountPassword(accountPassword: String) {
        cdkBuilder.accountPassword(accountPassword)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty,
    ) : ServiceAccountCredentialsProperty {
      override fun accountName(): String = unwrap(this).getAccountName()

      override fun accountPassword(): String = unwrap(this).getAccountPassword()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceAccountCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty):
          ServiceAccountCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceAccountCredentialsProperty):
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CertificateBasedAuthPropertiesProperty {
    public fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

    public fun status(): String? = unwrap(this).getStatus()

    public interface Builder {
      public fun certificateAuthorityArn(certificateAuthorityArn: String)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.builder()

      override fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty,
    ) : CertificateBasedAuthPropertiesProperty {
      override fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CertificateBasedAuthPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty):
          CertificateBasedAuthPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateBasedAuthPropertiesProperty):
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
