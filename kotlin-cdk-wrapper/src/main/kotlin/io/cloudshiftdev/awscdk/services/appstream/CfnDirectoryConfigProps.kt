@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDirectoryConfigProps {
  public fun certificateBasedAuthProperties(): Any? =
      unwrap(this).getCertificateBasedAuthProperties()

  public fun directoryName(): String

  public fun organizationalUnitDistinguishedNames(): List<String>

  public fun serviceAccountCredentials(): Any

  @CdkDslMarker
  public interface Builder {
    public fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable)

    public
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b3590bf0669f8003996f708eab51c98d8a7b7dbeb5f23c8c81c3437179a6511")
    public
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.Builder.() -> Unit)

    public fun directoryName(directoryName: String)

    public
        fun organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames: List<String>)

    public fun organizationalUnitDistinguishedNames(vararg
        organizationalUnitDistinguishedNames: String)

    public fun serviceAccountCredentials(serviceAccountCredentials: IResolvable)

    public
        fun serviceAccountCredentials(serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("976f38bbdbc165844453fd5d7a6c8d50f7b2b4054fc5d7632cba157e9d867ad7")
    public
        fun serviceAccountCredentials(serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder =
        software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.builder()

    override fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable) {
      cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties.let(IResolvable::unwrap))
    }

    override
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty) {
      cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties.let(CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b3590bf0669f8003996f708eab51c98d8a7b7dbeb5f23c8c81c3437179a6511")
    override
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.Builder.() -> Unit):
        Unit =
        certificateBasedAuthProperties(CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty(certificateBasedAuthProperties))

    override fun directoryName(directoryName: String) {
      cdkBuilder.directoryName(directoryName)
    }

    override
        fun organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames: List<String>) {
      cdkBuilder.organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames)
    }

    override fun organizationalUnitDistinguishedNames(vararg
        organizationalUnitDistinguishedNames: String): Unit =
        organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames.toList())

    override fun serviceAccountCredentials(serviceAccountCredentials: IResolvable) {
      cdkBuilder.serviceAccountCredentials(serviceAccountCredentials.let(IResolvable::unwrap))
    }

    override
        fun serviceAccountCredentials(serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty) {
      cdkBuilder.serviceAccountCredentials(serviceAccountCredentials.let(CfnDirectoryConfig.ServiceAccountCredentialsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("976f38bbdbc165844453fd5d7a6c8d50f7b2b4054fc5d7632cba157e9d867ad7")
    override
        fun serviceAccountCredentials(serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder.() -> Unit):
        Unit =
        serviceAccountCredentials(CfnDirectoryConfig.ServiceAccountCredentialsProperty(serviceAccountCredentials))

    public fun build(): software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps,
  ) : CdkObject(cdkObject), CfnDirectoryConfigProps {
    override fun certificateBasedAuthProperties(): Any? =
        unwrap(this).getCertificateBasedAuthProperties()

    override fun directoryName(): String = unwrap(this).getDirectoryName()

    override fun organizationalUnitDistinguishedNames(): List<String> =
        unwrap(this).getOrganizationalUnitDistinguishedNames()

    override fun serviceAccountCredentials(): Any = unwrap(this).getServiceAccountCredentials()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDirectoryConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps):
        CfnDirectoryConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryConfigProps):
        software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps
  }
}
