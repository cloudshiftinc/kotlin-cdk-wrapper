package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCACertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnCACertificate,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun verificationCertificatePem(): String? =
      unwrap(this).getVerificationCertificatePem()

  public open fun verificationCertificatePem(`value`: String) {
    unwrap(this).setVerificationCertificatePem(`value`)
  }

  public interface Builder {
    public fun autoRegistrationStatus(autoRegistrationStatus: String) {
    }

    public fun caCertificatePem(caCertificatePem: String) {
    }

    public fun certificateMode(certificateMode: String) {
    }

    public fun registrationConfig(registrationConfig: IResolvable) {
    }

    public fun registrationConfig(registrationConfig: RegistrationConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2142c3ff8971b8bf8373de41fcccea8548a7d3aeba5325b6636b84f35d0ba07")
    public
        fun registrationConfig(registrationConfig: RegistrationConfigProperty.Builder.() -> Unit) {
    }

    public fun removeAutoRegistration(removeAutoRegistration: Boolean) {
    }

    public fun removeAutoRegistration(removeAutoRegistration: IResolvable) {
    }

    public fun status(status: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun verificationCertificatePem(verificationCertificatePem: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCACertificate.Builder =
        software.amazon.awscdk.services.iot.CfnCACertificate.Builder.create(scope, id)

    public override fun autoRegistrationStatus(autoRegistrationStatus: String) {
      cdkBuilder.autoRegistrationStatus(autoRegistrationStatus)
    }

    public override fun caCertificatePem(caCertificatePem: String) {
      cdkBuilder.caCertificatePem(caCertificatePem)
    }

    public override fun certificateMode(certificateMode: String) {
      cdkBuilder.certificateMode(certificateMode)
    }

    public override fun registrationConfig(registrationConfig: IResolvable) {
      cdkBuilder.registrationConfig(registrationConfig.let(IResolvable::unwrap))
    }

    public override fun registrationConfig(registrationConfig: RegistrationConfigProperty) {
      cdkBuilder.registrationConfig(registrationConfig.let(RegistrationConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2142c3ff8971b8bf8373de41fcccea8548a7d3aeba5325b6636b84f35d0ba07")
    public override
        fun registrationConfig(registrationConfig: RegistrationConfigProperty.Builder.() -> Unit):
        Unit = registrationConfig(RegistrationConfigProperty(registrationConfig))

    public override fun removeAutoRegistration(removeAutoRegistration: Boolean) {
      cdkBuilder.removeAutoRegistration(removeAutoRegistration)
    }

    public override fun removeAutoRegistration(removeAutoRegistration: IResolvable) {
      cdkBuilder.removeAutoRegistration(removeAutoRegistration.let(IResolvable::unwrap))
    }

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun verificationCertificatePem(verificationCertificatePem: String) {
      cdkBuilder.verificationCertificatePem(verificationCertificatePem)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnCACertificate = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun roleArn(roleArn: String) {
      }

      public fun templateBody(templateBody: String) {
      }

      public fun templateName(templateName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty.builder()

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
      }

      public override fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty,
    ) : RegistrationConfigProperty {
      public override fun roleArn(): String? = unwrap(this).getRoleArn()

      public override fun templateBody(): String? = unwrap(this).getTemplateBody()

      public override fun templateName(): String? = unwrap(this).getTemplateName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RegistrationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty):
          RegistrationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegistrationConfigProperty):
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
