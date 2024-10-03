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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a CA certificate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnCACertificate cfnCACertificate = CfnCACertificate.Builder.create(this, "MyCfnCACertificate")
 * .caCertificatePem("caCertificatePem")
 * .status("status")
 * // the properties below are optional
 * .autoRegistrationStatus("autoRegistrationStatus")
 * .certificateMode("certificateMode")
 * .registrationConfig(RegistrationConfigProperty.builder()
 * .roleArn("roleArn")
 * .templateBody("templateBody")
 * .templateName("templateName")
 * .build())
 * .removeAutoRegistration(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .verificationCertificatePem("verificationCertificatePem")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html)
 */
public open class CfnCACertificate(
  cdkObject: software.amazon.awscdk.services.iot.CfnCACertificate,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCACertificateProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnCACertificate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCACertificateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCACertificateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCACertificateProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) for the CA certificate. For example:.
   *
   * `{ "Fn::GetAtt": ["MyCACertificate", "Arn"] }`
   *
   * A value similar to the following is returned:
   *
   * `arn:aws:iot:us-east-1:123456789012:cacert/a6be6b84559801927e35a8f901fae08b5971d78d1562e29504ff9663b276a5f5`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The CA certificate ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Whether the CA certificate is configured for auto registration of device certificates.
   */
  public open fun autoRegistrationStatus(): String? = unwrap(this).getAutoRegistrationStatus()

  /**
   * Whether the CA certificate is configured for auto registration of device certificates.
   */
  public open fun autoRegistrationStatus(`value`: String) {
    unwrap(this).setAutoRegistrationStatus(`value`)
  }

  /**
   * The certificate data in PEM format.
   */
  public open fun caCertificatePem(): String = unwrap(this).getCaCertificatePem()

  /**
   * The certificate data in PEM format.
   */
  public open fun caCertificatePem(`value`: String) {
    unwrap(this).setCaCertificatePem(`value`)
  }

  /**
   * The mode of the CA.
   */
  public open fun certificateMode(): String? = unwrap(this).getCertificateMode()

  /**
   * The mode of the CA.
   */
  public open fun certificateMode(`value`: String) {
    unwrap(this).setCertificateMode(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Information about the registration configuration.
   */
  public open fun registrationConfig(): Any? = unwrap(this).getRegistrationConfig()

  /**
   * Information about the registration configuration.
   */
  public open fun registrationConfig(`value`: IResolvable) {
    unwrap(this).setRegistrationConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the registration configuration.
   */
  public open fun registrationConfig(`value`: RegistrationConfigProperty) {
    unwrap(this).setRegistrationConfig(`value`.let(RegistrationConfigProperty.Companion::unwrap))
  }

  /**
   * Information about the registration configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0b1518ce4755e8634128f92cffc723eaf8035ca3839ac07e91f334dddfb7626e")
  public open fun registrationConfig(`value`: RegistrationConfigProperty.Builder.() -> Unit): Unit =
      registrationConfig(RegistrationConfigProperty(`value`))

  /**
   * If true, removes auto registration.
   */
  public open fun removeAutoRegistration(): Any? = unwrap(this).getRemoveAutoRegistration()

  /**
   * If true, removes auto registration.
   */
  public open fun removeAutoRegistration(`value`: Boolean) {
    unwrap(this).setRemoveAutoRegistration(`value`)
  }

  /**
   * If true, removes auto registration.
   */
  public open fun removeAutoRegistration(`value`: IResolvable) {
    unwrap(this).setRemoveAutoRegistration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The status of the CA certificate.
   */
  public open fun status(): String = unwrap(this).getStatus()

  /**
   * The status of the CA certificate.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The private key verification certificate.
   */
  public open fun verificationCertificatePem(): String? =
      unwrap(this).getVerificationCertificatePem()

  /**
   * The private key verification certificate.
   */
  public open fun verificationCertificatePem(`value`: String) {
    unwrap(this).setVerificationCertificatePem(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnCACertificate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether the CA certificate is configured for auto registration of device certificates.
     *
     * Valid values are "ENABLE" and "DISABLE".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-autoregistrationstatus)
     * @param autoRegistrationStatus Whether the CA certificate is configured for auto registration
     * of device certificates. 
     */
    public fun autoRegistrationStatus(autoRegistrationStatus: String)

    /**
     * The certificate data in PEM format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-cacertificatepem)
     * @param caCertificatePem The certificate data in PEM format. 
     */
    public fun caCertificatePem(caCertificatePem: String)

    /**
     * The mode of the CA.
     *
     * All the device certificates that are registered using this CA will be registered in the same
     * mode as the CA. For more information about certificate mode for device certificates, see
     * [certificate
     * mode](https://docs.aws.amazon.com//iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode)
     * .
     *
     * Valid values are "DEFAULT" and "SNI_ONLY".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-certificatemode)
     * @param certificateMode The mode of the CA. 
     */
    public fun certificateMode(certificateMode: String)

    /**
     * Information about the registration configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-registrationconfig)
     * @param registrationConfig Information about the registration configuration. 
     */
    public fun registrationConfig(registrationConfig: IResolvable)

    /**
     * Information about the registration configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-registrationconfig)
     * @param registrationConfig Information about the registration configuration. 
     */
    public fun registrationConfig(registrationConfig: RegistrationConfigProperty)

    /**
     * Information about the registration configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-registrationconfig)
     * @param registrationConfig Information about the registration configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2142c3ff8971b8bf8373de41fcccea8548a7d3aeba5325b6636b84f35d0ba07")
    public fun registrationConfig(registrationConfig: RegistrationConfigProperty.Builder.() -> Unit)

    /**
     * If true, removes auto registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-removeautoregistration)
     * @param removeAutoRegistration If true, removes auto registration. 
     */
    public fun removeAutoRegistration(removeAutoRegistration: Boolean)

    /**
     * If true, removes auto registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-removeautoregistration)
     * @param removeAutoRegistration If true, removes auto registration. 
     */
    public fun removeAutoRegistration(removeAutoRegistration: IResolvable)

    /**
     * The status of the CA certificate.
     *
     * Valid values are "ACTIVE" and "INACTIVE".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-status)
     * @param status The status of the CA certificate. 
     */
    public fun status(status: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The private key verification certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-verificationcertificatepem)
     * @param verificationCertificatePem The private key verification certificate. 
     */
    public fun verificationCertificatePem(verificationCertificatePem: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCACertificate.Builder =
        software.amazon.awscdk.services.iot.CfnCACertificate.Builder.create(scope, id)

    /**
     * Whether the CA certificate is configured for auto registration of device certificates.
     *
     * Valid values are "ENABLE" and "DISABLE".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-autoregistrationstatus)
     * @param autoRegistrationStatus Whether the CA certificate is configured for auto registration
     * of device certificates. 
     */
    override fun autoRegistrationStatus(autoRegistrationStatus: String) {
      cdkBuilder.autoRegistrationStatus(autoRegistrationStatus)
    }

    /**
     * The certificate data in PEM format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-cacertificatepem)
     * @param caCertificatePem The certificate data in PEM format. 
     */
    override fun caCertificatePem(caCertificatePem: String) {
      cdkBuilder.caCertificatePem(caCertificatePem)
    }

    /**
     * The mode of the CA.
     *
     * All the device certificates that are registered using this CA will be registered in the same
     * mode as the CA. For more information about certificate mode for device certificates, see
     * [certificate
     * mode](https://docs.aws.amazon.com//iot/latest/apireference/API_CertificateDescription.html#iot-Type-CertificateDescription-certificateMode)
     * .
     *
     * Valid values are "DEFAULT" and "SNI_ONLY".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-certificatemode)
     * @param certificateMode The mode of the CA. 
     */
    override fun certificateMode(certificateMode: String) {
      cdkBuilder.certificateMode(certificateMode)
    }

    /**
     * Information about the registration configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-registrationconfig)
     * @param registrationConfig Information about the registration configuration. 
     */
    override fun registrationConfig(registrationConfig: IResolvable) {
      cdkBuilder.registrationConfig(registrationConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the registration configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-registrationconfig)
     * @param registrationConfig Information about the registration configuration. 
     */
    override fun registrationConfig(registrationConfig: RegistrationConfigProperty) {
      cdkBuilder.registrationConfig(registrationConfig.let(RegistrationConfigProperty.Companion::unwrap))
    }

    /**
     * Information about the registration configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-registrationconfig)
     * @param registrationConfig Information about the registration configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2142c3ff8971b8bf8373de41fcccea8548a7d3aeba5325b6636b84f35d0ba07")
    override
        fun registrationConfig(registrationConfig: RegistrationConfigProperty.Builder.() -> Unit):
        Unit = registrationConfig(RegistrationConfigProperty(registrationConfig))

    /**
     * If true, removes auto registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-removeautoregistration)
     * @param removeAutoRegistration If true, removes auto registration. 
     */
    override fun removeAutoRegistration(removeAutoRegistration: Boolean) {
      cdkBuilder.removeAutoRegistration(removeAutoRegistration)
    }

    /**
     * If true, removes auto registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-removeautoregistration)
     * @param removeAutoRegistration If true, removes auto registration. 
     */
    override fun removeAutoRegistration(removeAutoRegistration: IResolvable) {
      cdkBuilder.removeAutoRegistration(removeAutoRegistration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The status of the CA certificate.
     *
     * Valid values are "ACTIVE" and "INACTIVE".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-status)
     * @param status The status of the CA certificate. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The private key verification certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-cacertificate.html#cfn-iot-cacertificate-verificationcertificatepem)
     * @param verificationCertificatePem The private key verification certificate. 
     */
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
        software.amazon.awscdk.services.iot.CfnCACertificate = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnCACertificate
  }

  /**
   * The registration configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * RegistrationConfigProperty registrationConfigProperty = RegistrationConfigProperty.builder()
   * .roleArn("roleArn")
   * .templateBody("templateBody")
   * .templateName("templateName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-cacertificate-registrationconfig.html)
   */
  public interface RegistrationConfigProperty {
    /**
     * The ARN of the role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-cacertificate-registrationconfig.html#cfn-iot-cacertificate-registrationconfig-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The template body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-cacertificate-registrationconfig.html#cfn-iot-cacertificate-registrationconfig-templatebody)
     */
    public fun templateBody(): String? = unwrap(this).getTemplateBody()

    /**
     * The name of the provisioning template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-cacertificate-registrationconfig.html#cfn-iot-cacertificate-registrationconfig-templatename)
     */
    public fun templateName(): String? = unwrap(this).getTemplateName()

    /**
     * A builder for [RegistrationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn The ARN of the role.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param templateBody The template body.
       */
      public fun templateBody(templateBody: String)

      /**
       * @param templateName The name of the provisioning template.
       */
      public fun templateName(templateName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty.builder()

      /**
       * @param roleArn The ARN of the role.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param templateBody The template body.
       */
      override fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
      }

      /**
       * @param templateName The name of the provisioning template.
       */
      override fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty,
    ) : CdkObject(cdkObject),
        RegistrationConfigProperty {
      /**
       * The ARN of the role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-cacertificate-registrationconfig.html#cfn-iot-cacertificate-registrationconfig-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The template body.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-cacertificate-registrationconfig.html#cfn-iot-cacertificate-registrationconfig-templatebody)
       */
      override fun templateBody(): String? = unwrap(this).getTemplateBody()

      /**
       * The name of the provisioning template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-cacertificate-registrationconfig.html#cfn-iot-cacertificate-registrationconfig-templatename)
       */
      override fun templateName(): String? = unwrap(this).getTemplateName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegistrationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty):
          RegistrationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RegistrationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegistrationConfigProperty):
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnCACertificate.RegistrationConfigProperty
    }
  }
}
