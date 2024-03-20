@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A conformance pack is a collection of AWS Config rules and remediation actions that can be easily
 * deployed in an account and a region.
 *
 * ConformancePack creates a service linked role in your account. The service linked role is created
 * only when the role does not exist in your account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * Object templateSsmDocumentDetails;
 * CfnConformancePack cfnConformancePack = CfnConformancePack.Builder.create(this,
 * "MyCfnConformancePack")
 * .conformancePackName("conformancePackName")
 * // the properties below are optional
 * .conformancePackInputParameters(List.of(ConformancePackInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .deliveryS3Bucket("deliveryS3Bucket")
 * .deliveryS3KeyPrefix("deliveryS3KeyPrefix")
 * .templateBody("templateBody")
 * .templateS3Uri("templateS3Uri")
 * .templateSsmDocumentDetails(templateSsmDocumentDetails)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html)
 */
public open class CfnConformancePack internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.config.CfnConformancePack,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConformancePackProps,
  ) :
      this(software.amazon.awscdk.services.config.CfnConformancePack(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnConformancePackProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConformancePackProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConformancePackProps(props)
  )

  /**
   * A list of ConformancePackInputParameter objects.
   */
  public open fun conformancePackInputParameters(): Any? =
      unwrap(this).getConformancePackInputParameters()

  /**
   * A list of ConformancePackInputParameter objects.
   */
  public open fun conformancePackInputParameters(`value`: IResolvable) {
    unwrap(this).setConformancePackInputParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of ConformancePackInputParameter objects.
   */
  public open fun conformancePackInputParameters(`value`: List<Any>) {
    unwrap(this).setConformancePackInputParameters(`value`)
  }

  /**
   * A list of ConformancePackInputParameter objects.
   */
  public open fun conformancePackInputParameters(vararg `value`: Any): Unit =
      conformancePackInputParameters(`value`.toList())

  /**
   * Name of the conformance pack you want to create.
   */
  public open fun conformancePackName(): String = unwrap(this).getConformancePackName()

  /**
   * Name of the conformance pack you want to create.
   */
  public open fun conformancePackName(`value`: String) {
    unwrap(this).setConformancePackName(`value`)
  }

  /**
   * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
   */
  public open fun deliveryS3Bucket(): String? = unwrap(this).getDeliveryS3Bucket()

  /**
   * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
   */
  public open fun deliveryS3Bucket(`value`: String) {
    unwrap(this).setDeliveryS3Bucket(`value`)
  }

  /**
   * The prefix for the Amazon S3 bucket.
   */
  public open fun deliveryS3KeyPrefix(): String? = unwrap(this).getDeliveryS3KeyPrefix()

  /**
   * The prefix for the Amazon S3 bucket.
   */
  public open fun deliveryS3KeyPrefix(`value`: String) {
    unwrap(this).setDeliveryS3KeyPrefix(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A string containing full conformance pack template body.
   */
  public open fun templateBody(): String? = unwrap(this).getTemplateBody()

  /**
   * A string containing full conformance pack template body.
   */
  public open fun templateBody(`value`: String) {
    unwrap(this).setTemplateBody(`value`)
  }

  /**
   * Location of file containing the template body (s3://bucketname/prefix).
   */
  public open fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

  /**
   * Location of file containing the template body (s3://bucketname/prefix).
   */
  public open fun templateS3Uri(`value`: String) {
    unwrap(this).setTemplateS3Uri(`value`)
  }

  /**
   * An object that contains the name or Amazon Resource Name (ARN) of the AWS Systems Manager
   * document (SSM document) and the version of the SSM document that is used to create a conformance
   * pack.
   */
  public open fun templateSsmDocumentDetails(): Any? = unwrap(this).getTemplateSsmDocumentDetails()

  /**
   * An object that contains the name or Amazon Resource Name (ARN) of the AWS Systems Manager
   * document (SSM document) and the version of the SSM document that is used to create a conformance
   * pack.
   */
  public open fun templateSsmDocumentDetails(`value`: Any) {
    unwrap(this).setTemplateSsmDocumentDetails(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.CfnConformancePack].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of ConformancePackInputParameter objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects. 
     */
    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable)

    /**
     * A list of ConformancePackInputParameter objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects. 
     */
    public fun conformancePackInputParameters(conformancePackInputParameters: List<Any>)

    /**
     * A list of ConformancePackInputParameter objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects. 
     */
    public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any)

    /**
     * Name of the conformance pack you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackname)
     * @param conformancePackName Name of the conformance pack you want to create. 
     */
    public fun conformancePackName(conformancePackName: String)

    /**
     * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3bucket)
     * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
     * pack templates. 
     */
    public fun deliveryS3Bucket(deliveryS3Bucket: String)

    /**
     * The prefix for the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3keyprefix)
     * @param deliveryS3KeyPrefix The prefix for the Amazon S3 bucket. 
     */
    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String)

    /**
     * A string containing full conformance pack template body.
     *
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     *
     *
     * You can only use a YAML template with two resource types: config rule (
     * `AWS::Config::ConfigRule` ) and a remediation action ( `AWS::Config::RemediationConfiguration`
     * ).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatebody)
     * @param templateBody A string containing full conformance pack template body. 
     */
    public fun templateBody(templateBody: String)

    /**
     * Location of file containing the template body (s3://bucketname/prefix).
     *
     * The uri must point to the conformance pack template (max size: 300 KB) that is located in an
     * Amazon S3 bucket.
     *
     *
     * You must have access to read Amazon S3 bucket.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templates3uri)
     * @param templateS3Uri Location of file containing the template body (s3://bucketname/prefix). 
     */
    public fun templateS3Uri(templateS3Uri: String)

    /**
     * An object that contains the name or Amazon Resource Name (ARN) of the AWS Systems Manager
     * document (SSM document) and the version of the SSM document that is used to create a conformance
     * pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatessmdocumentdetails)
     * @param templateSsmDocumentDetails An object that contains the name or Amazon Resource Name
     * (ARN) of the AWS Systems Manager document (SSM document) and the version of the SSM document
     * that is used to create a conformance pack. 
     */
    public fun templateSsmDocumentDetails(templateSsmDocumentDetails: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConformancePack.Builder =
        software.amazon.awscdk.services.config.CfnConformancePack.Builder.create(scope, id)

    /**
     * A list of ConformancePackInputParameter objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects. 
     */
    override fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters.let(IResolvable::unwrap))
    }

    /**
     * A list of ConformancePackInputParameter objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects. 
     */
    override fun conformancePackInputParameters(conformancePackInputParameters: List<Any>) {
      cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    /**
     * A list of ConformancePackInputParameter objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects. 
     */
    override fun conformancePackInputParameters(vararg conformancePackInputParameters: Any): Unit =
        conformancePackInputParameters(conformancePackInputParameters.toList())

    /**
     * Name of the conformance pack you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackname)
     * @param conformancePackName Name of the conformance pack you want to create. 
     */
    override fun conformancePackName(conformancePackName: String) {
      cdkBuilder.conformancePackName(conformancePackName)
    }

    /**
     * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3bucket)
     * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
     * pack templates. 
     */
    override fun deliveryS3Bucket(deliveryS3Bucket: String) {
      cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    /**
     * The prefix for the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3keyprefix)
     * @param deliveryS3KeyPrefix The prefix for the Amazon S3 bucket. 
     */
    override fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
      cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    /**
     * A string containing full conformance pack template body.
     *
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     *
     *
     * You can only use a YAML template with two resource types: config rule (
     * `AWS::Config::ConfigRule` ) and a remediation action ( `AWS::Config::RemediationConfiguration`
     * ).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatebody)
     * @param templateBody A string containing full conformance pack template body. 
     */
    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    /**
     * Location of file containing the template body (s3://bucketname/prefix).
     *
     * The uri must point to the conformance pack template (max size: 300 KB) that is located in an
     * Amazon S3 bucket.
     *
     *
     * You must have access to read Amazon S3 bucket.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templates3uri)
     * @param templateS3Uri Location of file containing the template body (s3://bucketname/prefix). 
     */
    override fun templateS3Uri(templateS3Uri: String) {
      cdkBuilder.templateS3Uri(templateS3Uri)
    }

    /**
     * An object that contains the name or Amazon Resource Name (ARN) of the AWS Systems Manager
     * document (SSM document) and the version of the SSM document that is used to create a conformance
     * pack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatessmdocumentdetails)
     * @param templateSsmDocumentDetails An object that contains the name or Amazon Resource Name
     * (ARN) of the AWS Systems Manager document (SSM document) and the version of the SSM document
     * that is used to create a conformance pack. 
     */
    override fun templateSsmDocumentDetails(templateSsmDocumentDetails: Any) {
      cdkBuilder.templateSsmDocumentDetails(templateSsmDocumentDetails)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnConformancePack =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.config.CfnConformancePack.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConformancePack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConformancePack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConformancePack):
        CfnConformancePack = CfnConformancePack(cdkObject)

    internal fun unwrap(wrapped: CfnConformancePack):
        software.amazon.awscdk.services.config.CfnConformancePack = wrapped.cdkObject
  }

  /**
   * This API allows you to create a conformance pack template with an AWS Systems Manager document
   * (SSM document).
   *
   * To deploy a conformance pack using an SSM document, first create an SSM document with
   * conformance pack content, and then provide the `DocumentName` in the [PutConformancePack
   * API](https://docs.aws.amazon.com/config/latest/APIReference/API_PutConformancePack.html) . You can
   * also provide the `DocumentVersion` .
   *
   * The `TemplateSSMDocumentDetails` object contains the name of the SSM document and the version
   * of the SSM document.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * TemplateSSMDocumentDetailsProperty templateSSMDocumentDetailsProperty =
   * TemplateSSMDocumentDetailsProperty.builder()
   * .documentName("documentName")
   * .documentVersion("documentVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-templatessmdocumentdetails.html)
   */
  public interface TemplateSSMDocumentDetailsProperty {
    /**
     * The name or Amazon Resource Name (ARN) of the SSM document to use to create a conformance
     * pack.
     *
     * If you use the document name, AWS Config checks only your account and AWS Region for the SSM
     * document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-templatessmdocumentdetails.html#cfn-config-conformancepack-templatessmdocumentdetails-documentname)
     */
    public fun documentName(): String? = unwrap(this).getDocumentName()

    /**
     * The version of the SSM document to use to create a conformance pack.
     *
     * By default, AWS Config uses the latest version.
     *
     *
     * This field is optional.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-templatessmdocumentdetails.html#cfn-config-conformancepack-templatessmdocumentdetails-documentversion)
     */
    public fun documentVersion(): String? = unwrap(this).getDocumentVersion()

    /**
     * A builder for [TemplateSSMDocumentDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentName The name or Amazon Resource Name (ARN) of the SSM document to use to
       * create a conformance pack.
       * If you use the document name, AWS Config checks only your account and AWS Region for the
       * SSM document.
       */
      public fun documentName(documentName: String)

      /**
       * @param documentVersion The version of the SSM document to use to create a conformance pack.
       * By default, AWS Config uses the latest version.
       *
       *
       * This field is optional.
       */
      public fun documentVersion(documentVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty.builder()

      /**
       * @param documentName The name or Amazon Resource Name (ARN) of the SSM document to use to
       * create a conformance pack.
       * If you use the document name, AWS Config checks only your account and AWS Region for the
       * SSM document.
       */
      override fun documentName(documentName: String) {
        cdkBuilder.documentName(documentName)
      }

      /**
       * @param documentVersion The version of the SSM document to use to create a conformance pack.
       * By default, AWS Config uses the latest version.
       *
       *
       * This field is optional.
       */
      override fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty,
    ) : CdkObject(cdkObject), TemplateSSMDocumentDetailsProperty {
      /**
       * The name or Amazon Resource Name (ARN) of the SSM document to use to create a conformance
       * pack.
       *
       * If you use the document name, AWS Config checks only your account and AWS Region for the
       * SSM document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-templatessmdocumentdetails.html#cfn-config-conformancepack-templatessmdocumentdetails-documentname)
       */
      override fun documentName(): String? = unwrap(this).getDocumentName()

      /**
       * The version of the SSM document to use to create a conformance pack.
       *
       * By default, AWS Config uses the latest version.
       *
       *
       * This field is optional.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-templatessmdocumentdetails.html#cfn-config-conformancepack-templatessmdocumentdetails-documentversion)
       */
      override fun documentVersion(): String? = unwrap(this).getDocumentVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TemplateSSMDocumentDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty):
          TemplateSSMDocumentDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TemplateSSMDocumentDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateSSMDocumentDetailsProperty):
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConformancePack.TemplateSSMDocumentDetailsProperty
    }
  }

  /**
   * Input parameters in the form of key-value pairs for the conformance pack, both of which you
   * define.
   *
   * Keys can have a maximum character length of 255 characters, and values can have a maximum
   * length of 4096 characters.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * ConformancePackInputParameterProperty conformancePackInputParameterProperty =
   * ConformancePackInputParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html)
   */
  public interface ConformancePackInputParameterProperty {
    /**
     * One part of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametername)
     */
    public fun parameterName(): String

    /**
     * Another part of the key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametervalue)
     */
    public fun parameterValue(): String

    /**
     * A builder for [ConformancePackInputParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterName One part of a key-value pair. 
       */
      public fun parameterName(parameterName: String)

      /**
       * @param parameterValue Another part of the key-value pair. 
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty.builder()

      /**
       * @param parameterName One part of a key-value pair. 
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      /**
       * @param parameterValue Another part of the key-value pair. 
       */
      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty,
    ) : CdkObject(cdkObject), ConformancePackInputParameterProperty {
      /**
       * One part of a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametername)
       */
      override fun parameterName(): String = unwrap(this).getParameterName()

      /**
       * Another part of the key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html#cfn-config-conformancepack-conformancepackinputparameter-parametervalue)
       */
      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConformancePackInputParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty):
          ConformancePackInputParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConformancePackInputParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConformancePackInputParameterProperty):
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty
    }
  }
}
