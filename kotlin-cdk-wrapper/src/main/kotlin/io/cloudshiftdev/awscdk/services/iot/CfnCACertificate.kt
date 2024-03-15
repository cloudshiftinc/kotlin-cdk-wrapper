@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCACertificate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnCACertificate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun autoRegistrationStatus(): String? = unwrap(this).getAutoRegistrationStatus()

  public open fun autoRegistrationStatus(`value`: String) {
    unwrap(this).setAutoRegistrationStatus(`value`)
  }

  public open fun caCertificatePem(): String = unwrap(this).getCaCertificatePem()

  public open fun caCertificatePem(`value`: String) {
    unwrap(this).setCaCertificatePem(`value`)
  }

  public open fun certificateMode(): String? = unwrap(this).getCertificateMode()

  public open fun certificateMode(`value`: String) {
    unwrap(this).setCertificateMode(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun registrationConfig(): Any? = unwrap(this).getRegistrationConfig()

  public open fun registrationConfig(`value`: IResolvable) {
    unwrap(this).setRegistrationConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun registrationConfig(`value`: RegistrationConfigProperty) {
    unwrap(this).setRegistrationConfig(`value`.let(RegistrationConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0b1518ce4755e8634128f92cffc723eaf8035ca3839ac07e91f334dddfb7626e")
  public open fun registrationConfig(`value`: RegistrationConfigProperty.Builder.() -> Unit): Unit =
      registrationConfig(RegistrationConfigProperty(`value`))

  public open fun removeAutoRegistration(): Any? = unwrap(this).getRemoveAutoRegistration()

  public open fun removeAutoRegistration(`value`: Boolean) {
    unwrap(this).setRemoveAutoRegistration(`value`)
  }

  public open fun removeAutoRegistration(`value`: IResolvable) {
    unwrap(this).setRemoveAutoRegistration(`value`.let(IResolvable::unwrap))
  }

  public open fun status(): String = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun verificationCertificatePem(): String? =
      unwrap(this).getVerificationCertificatePem()

  public open fun verificationCertificatePem(`value`: String) {
    unwrap(this).setVerificationCertificatePem(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun autoRegistrationStatus(autoRegistrationStatus: String)

    public fun caCertificatePem(caCertificatePem: String)

    public fun certificateMode(certificateMode: String)

    public fun registrationConfig(registrationConfig: IResolvable)

    public fun registrationConfig(registrationConfig: RegistrationConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2142c3ff8971b8bf8373de41fcccea8548a7d3aeba5325b6636b84f35d0ba07")
    public fun registrationConfig(registrationConfig: RegistrationConfigProperty.Builder.() -> Unit)

    public fun removeAutoRegistration(removeAutoRegistration: Boolean)

    public fun removeAutoRegistration(removeAutoRegistration: IResolvable)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun verificationCertificatePem(verificationCertificatePem: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCACertificate.Builder =
        software.amazon.awscdk.services.iot.CfnCACertificate.Builder.create(scope, id)

    override fun autoRegistrationStatus(autoRegistrationStatus: String) {
      cdkBuilder.autoRegistrationStatus(autoRegistrationStatus)
    }

    override fun caCertificatePem(caCertificatePem: String) {
      cdkBuilder.caCertificatePem(caCertificatePem)
    }

    override fun certificateMode(certificateMode: String) {
      cdkBuilder.certificateMode(certificateMode)
    }

    override fun registrationConfig(registrationConfig: IResolvable) {
      cdkBuilder.registrationConfig(registrationConfig.let(IResolvable::unwrap))
    }

    override fun registrationConfig(registrationConfig: RegistrationConfigProperty) {
      cdkBuilder.registrationConfig(registrationConfig.let(RegistrationConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2142c3ff8971b8bf8373de41fcccea8548a7d3aeba5325b6636b84f35d0ba07")
    override
        fun registrationConfig(registrationConfig: RegistrationConfigProperty.Builder.() -> Unit):
        Unit = registrationConfig(RegistrationConfigProperty(registrationConfig))

    override fun removeAutoRegistration(removeAutoRegistration: Boolean) {
      cdkBuilder.removeAutoRegistration(removeAutoRegistration)
    }

    override fun removeAutoRegistration(removeAutoRegistration: IResolvable) {
      cdkBuilder.removeAutoRegistration(removeAutoRegistration.let(IResolvable::unwrap))
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun verificationCertificatePem(verificationCertificatePem: String) {
      cdkBuilder.verificationCertificatePem(verificationCertificatePem)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnCACertificate = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnCACertificate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCACertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCACertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCACertificate):
        CfnCACertificate = CfnCACertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCACertificate):
        software.amazon.awscdk.services.iot.CfnCACertificate = wrapped.cdkObject
  }

  public interface RegistrationConfigProperty {
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun templateBody(): String? = unwrap(this).getTemplateBody()

    public fun templateName(): String? = unwrap(this).getTemplateName()

    @CdkDslMarker
    public interface Builder {
      public fun roleArn(roleArn: String)

      public fun templateBody(templateBody: String)

      public fun templateName(templateName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty.builder()

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
      }

      override fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty,
    ) : CdkObject(cdkObject), RegistrationConfigProperty {
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun templateBody(): String? = unwrap(this).getTemplateBody()

      override fun templateName(): String? = unwrap(this).getTemplateName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegistrationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty):
          RegistrationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegistrationConfigProperty):
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty
    }
  }
}
