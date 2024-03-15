@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.comprehend

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This resource creates and trains a document classifier to categorize documents.
 *
 * You provide a set of training documents that are labeled with the categories that you want to
 * identify. After the classifier is trained you can use it to categorize a set of labeled documents
 * into the categories. For more information, see [Document
 * Classification](https://docs.aws.amazon.com/comprehend/latest/dg/how-document-classification.html)
 * in the Comprehend Developer Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.comprehend.*;
 * CfnDocumentClassifier cfnDocumentClassifier = CfnDocumentClassifier.Builder.create(this,
 * "MyCfnDocumentClassifier")
 * .dataAccessRoleArn("dataAccessRoleArn")
 * .documentClassifierName("documentClassifierName")
 * .inputDataConfig(DocumentClassifierInputDataConfigProperty.builder()
 * .augmentedManifests(List.of(AugmentedManifestsListItemProperty.builder()
 * .attributeNames(List.of("attributeNames"))
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .split("split")
 * .build()))
 * .dataFormat("dataFormat")
 * .documentReaderConfig(DocumentReaderConfigProperty.builder()
 * .documentReadAction("documentReadAction")
 * // the properties below are optional
 * .documentReadMode("documentReadMode")
 * .featureTypes(List.of("featureTypes"))
 * .build())
 * .documents(DocumentClassifierDocumentsProperty.builder()
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .testS3Uri("testS3Uri")
 * .build())
 * .documentType("documentType")
 * .labelDelimiter("labelDelimiter")
 * .s3Uri("s3Uri")
 * .testS3Uri("testS3Uri")
 * .build())
 * .languageCode("languageCode")
 * // the properties below are optional
 * .mode("mode")
 * .modelKmsKeyId("modelKmsKeyId")
 * .modelPolicy("modelPolicy")
 * .outputDataConfig(DocumentClassifierOutputDataConfigProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .s3Uri("s3Uri")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .versionName("versionName")
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html)
 */
public open class CfnDocumentClassifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of the document classifier.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to
   * your input data.
   */
  public open fun dataAccessRoleArn(): String = unwrap(this).getDataAccessRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to
   * your input data.
   */
  public open fun dataAccessRoleArn(`value`: String) {
    unwrap(this).setDataAccessRoleArn(`value`)
  }

  /**
   * The name of the document classifier.
   */
  public open fun documentClassifierName(): String = unwrap(this).getDocumentClassifierName()

  /**
   * The name of the document classifier.
   */
  public open fun documentClassifierName(`value`: String) {
    unwrap(this).setDocumentClassifierName(`value`)
  }

  /**
   * Specifies the format and location of the input data for the job.
   */
  public open fun inputDataConfig(): Any = unwrap(this).getInputDataConfig()

  /**
   * Specifies the format and location of the input data for the job.
   */
  public open fun inputDataConfig(`value`: IResolvable) {
    unwrap(this).setInputDataConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the format and location of the input data for the job.
   */
  public open fun inputDataConfig(`value`: DocumentClassifierInputDataConfigProperty) {
    unwrap(this).setInputDataConfig(`value`.let(DocumentClassifierInputDataConfigProperty::unwrap))
  }

  /**
   * Specifies the format and location of the input data for the job.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa845bb8996e2d07951639209aea7266e697e921518a043a100313a831a7a0c9")
  public open
      fun inputDataConfig(`value`: DocumentClassifierInputDataConfigProperty.Builder.() -> Unit):
      Unit = inputDataConfig(DocumentClassifierInputDataConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The language of the input documents.
   */
  public open fun languageCode(): String = unwrap(this).getLanguageCode()

  /**
   * The language of the input documents.
   */
  public open fun languageCode(`value`: String) {
    unwrap(this).setLanguageCode(`value`)
  }

  /**
   * Indicates the mode in which the classifier will be trained.
   */
  public open fun mode(): String? = unwrap(this).getMode()

  /**
   * Indicates the mode in which the classifier will be trained.
   */
  public open fun mode(`value`: String) {
    unwrap(this).setMode(`value`)
  }

  /**
   * ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained custom models.
   */
  public open fun modelKmsKeyId(): String? = unwrap(this).getModelKmsKeyId()

  /**
   * ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained custom models.
   */
  public open fun modelKmsKeyId(`value`: String) {
    unwrap(this).setModelKmsKeyId(`value`)
  }

  /**
   * The resource-based policy to attach to your custom document classifier model.
   */
  public open fun modelPolicy(): String? = unwrap(this).getModelPolicy()

  /**
   * The resource-based policy to attach to your custom document classifier model.
   */
  public open fun modelPolicy(`value`: String) {
    unwrap(this).setModelPolicy(`value`)
  }

  /**
   * Provides output results configuration parameters for custom classifier jobs.
   */
  public open fun outputDataConfig(): Any? = unwrap(this).getOutputDataConfig()

  /**
   * Provides output results configuration parameters for custom classifier jobs.
   */
  public open fun outputDataConfig(`value`: IResolvable) {
    unwrap(this).setOutputDataConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Provides output results configuration parameters for custom classifier jobs.
   */
  public open fun outputDataConfig(`value`: DocumentClassifierOutputDataConfigProperty) {
    unwrap(this).setOutputDataConfig(`value`.let(DocumentClassifierOutputDataConfigProperty::unwrap))
  }

  /**
   * Provides output results configuration parameters for custom classifier jobs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12291ffa32da101ef8fdf0f59c198fd5baee02364473cdd77af792e863bcc29f")
  public open
      fun outputDataConfig(`value`: DocumentClassifierOutputDataConfigProperty.Builder.() -> Unit):
      Unit = outputDataConfig(DocumentClassifierOutputDataConfigProperty(`value`))

  /**
   * Tags to associate with the document classifier.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags to associate with the document classifier.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags to associate with the document classifier.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The version name given to the newly created classifier.
   */
  public open fun versionName(): String? = unwrap(this).getVersionName()

  /**
   * The version name given to the newly created classifier.
   */
  public open fun versionName(`value`: String) {
    unwrap(this).setVersionName(`value`)
  }

  /**
   * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on
   * the storage volume attached to the ML compute instance(s) that process the analysis job.
   */
  public open fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

  /**
   * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on
   * the storage volume attached to the ML compute instance(s) that process the analysis job.
   */
  public open fun volumeKmsKeyId(`value`: String) {
    unwrap(this).setVolumeKmsKeyId(`value`)
  }

  /**
   * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you
   * are using for your custom classifier.
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you
   * are using for your custom classifier.
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you
   * are using for your custom classifier.
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  /**
   * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you
   * are using for your custom classifier.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("efa89925a77ec2e26545949702e175f110c7053f8d1732360de1563d47e1c6f8")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.comprehend.CfnDocumentClassifier].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to
     * your input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-dataaccessrolearn)
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend read access to your input data. 
     */
    public fun dataAccessRoleArn(dataAccessRoleArn: String)

    /**
     * The name of the document classifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-documentclassifiername)
     * @param documentClassifierName The name of the document classifier. 
     */
    public fun documentClassifierName(documentClassifierName: String)

    /**
     * Specifies the format and location of the input data for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-inputdataconfig)
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    public fun inputDataConfig(inputDataConfig: IResolvable)

    /**
     * Specifies the format and location of the input data for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-inputdataconfig)
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    public fun inputDataConfig(inputDataConfig: DocumentClassifierInputDataConfigProperty)

    /**
     * Specifies the format and location of the input data for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-inputdataconfig)
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ead844577296208fa182b5d35956d753a0389f6213608c2de7573aeaac3511c9")
    public
        fun inputDataConfig(inputDataConfig: DocumentClassifierInputDataConfigProperty.Builder.() -> Unit)

    /**
     * The language of the input documents.
     *
     * You can specify any of the languages supported by Amazon Comprehend. All documents must be in
     * the same language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-languagecode)
     * @param languageCode The language of the input documents. 
     */
    public fun languageCode(languageCode: String)

    /**
     * Indicates the mode in which the classifier will be trained.
     *
     * The classifier can be trained in multi-class (single-label) mode or multi-label mode.
     * Multi-class mode identifies a single class label for each document and multi-label mode
     * identifies one or more class labels for each document. Multiple labels for an individual
     * document are separated by a delimiter. The default delimiter between labels is a pipe (|).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-mode)
     * @param mode Indicates the mode in which the classifier will be trained. 
     */
    public fun mode(mode: String)

    /**
     * ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained custom models.
     *
     * The ModelKmsKeyId can be either of the following formats:
     *
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-modelkmskeyid)
     * @param modelKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained
     * custom models. 
     */
    public fun modelKmsKeyId(modelKmsKeyId: String)

    /**
     * The resource-based policy to attach to your custom document classifier model.
     *
     * You can use this policy to allow another AWS account to import your custom model.
     *
     * Provide your policy as a JSON body that you enter as a UTF-8 encoded string without line
     * breaks. To provide valid JSON, enclose the attribute names and values in double quotes. If the
     * JSON body is also enclosed in double quotes, then you must escape the double quotes that are
     * inside the policy:
     *
     * `"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"`
     *
     * To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes
     * to enclose the JSON names and values:
     *
     * `'{"attribute": "value", "attribute": ["value"]}'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-modelpolicy)
     * @param modelPolicy The resource-based policy to attach to your custom document classifier
     * model. 
     */
    public fun modelPolicy(modelPolicy: String)

    /**
     * Provides output results configuration parameters for custom classifier jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-outputdataconfig)
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs. 
     */
    public fun outputDataConfig(outputDataConfig: IResolvable)

    /**
     * Provides output results configuration parameters for custom classifier jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-outputdataconfig)
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs. 
     */
    public fun outputDataConfig(outputDataConfig: DocumentClassifierOutputDataConfigProperty)

    /**
     * Provides output results configuration parameters for custom classifier jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-outputdataconfig)
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("042164220275f5e173eed7aa0b7339bb447218978d0fa011149f7b206a8ecc8f")
    public
        fun outputDataConfig(outputDataConfig: DocumentClassifierOutputDataConfigProperty.Builder.() -> Unit)

    /**
     * Tags to associate with the document classifier.
     *
     * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend.
     * For example, a tag with "Sales" as the key might be added to a resource to indicate its use by
     * the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-tags)
     * @param tags Tags to associate with the document classifier. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to associate with the document classifier.
     *
     * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend.
     * For example, a tag with "Sales" as the key might be added to a resource to indicate its use by
     * the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-tags)
     * @param tags Tags to associate with the document classifier. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The version name given to the newly created classifier.
     *
     * Version names can have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The version name must be unique among all models with the same
     * classifier name in the AWS account / AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-versionname)
     * @param versionName The version name given to the newly created classifier. 
     */
    public fun versionName(versionName: String)

    /**
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data
     * on the storage volume attached to the ML compute instance(s) that process the analysis job.
     *
     * The VolumeKmsKeyId can be either of the following formats:
     *
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-volumekmskeyid)
     * @param volumeKmsKeyId ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute instance(s) that process
     * the analysis job. 
     */
    public fun volumeKmsKeyId(volumeKmsKeyId: String)

    /**
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources
     * you are using for your custom classifier.
     *
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-vpcconfig)
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier. 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources
     * you are using for your custom classifier.
     *
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-vpcconfig)
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier. 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources
     * you are using for your custom classifier.
     *
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-vpcconfig)
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dec6a95827b49471469399ea4357f96c18cdef6b0e07e9f74ffd43ec8ed69e6")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.Builder
        = software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to
     * your input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-dataaccessrolearn)
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend read access to your input data. 
     */
    override fun dataAccessRoleArn(dataAccessRoleArn: String) {
      cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    /**
     * The name of the document classifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-documentclassifiername)
     * @param documentClassifierName The name of the document classifier. 
     */
    override fun documentClassifierName(documentClassifierName: String) {
      cdkBuilder.documentClassifierName(documentClassifierName)
    }

    /**
     * Specifies the format and location of the input data for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-inputdataconfig)
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    override fun inputDataConfig(inputDataConfig: IResolvable) {
      cdkBuilder.inputDataConfig(inputDataConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies the format and location of the input data for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-inputdataconfig)
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    override fun inputDataConfig(inputDataConfig: DocumentClassifierInputDataConfigProperty) {
      cdkBuilder.inputDataConfig(inputDataConfig.let(DocumentClassifierInputDataConfigProperty::unwrap))
    }

    /**
     * Specifies the format and location of the input data for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-inputdataconfig)
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ead844577296208fa182b5d35956d753a0389f6213608c2de7573aeaac3511c9")
    override
        fun inputDataConfig(inputDataConfig: DocumentClassifierInputDataConfigProperty.Builder.() -> Unit):
        Unit = inputDataConfig(DocumentClassifierInputDataConfigProperty(inputDataConfig))

    /**
     * The language of the input documents.
     *
     * You can specify any of the languages supported by Amazon Comprehend. All documents must be in
     * the same language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-languagecode)
     * @param languageCode The language of the input documents. 
     */
    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    /**
     * Indicates the mode in which the classifier will be trained.
     *
     * The classifier can be trained in multi-class (single-label) mode or multi-label mode.
     * Multi-class mode identifies a single class label for each document and multi-label mode
     * identifies one or more class labels for each document. Multiple labels for an individual
     * document are separated by a delimiter. The default delimiter between labels is a pipe (|).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-mode)
     * @param mode Indicates the mode in which the classifier will be trained. 
     */
    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    /**
     * ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained custom models.
     *
     * The ModelKmsKeyId can be either of the following formats:
     *
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-modelkmskeyid)
     * @param modelKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained
     * custom models. 
     */
    override fun modelKmsKeyId(modelKmsKeyId: String) {
      cdkBuilder.modelKmsKeyId(modelKmsKeyId)
    }

    /**
     * The resource-based policy to attach to your custom document classifier model.
     *
     * You can use this policy to allow another AWS account to import your custom model.
     *
     * Provide your policy as a JSON body that you enter as a UTF-8 encoded string without line
     * breaks. To provide valid JSON, enclose the attribute names and values in double quotes. If the
     * JSON body is also enclosed in double quotes, then you must escape the double quotes that are
     * inside the policy:
     *
     * `"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"`
     *
     * To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes
     * to enclose the JSON names and values:
     *
     * `'{"attribute": "value", "attribute": ["value"]}'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-modelpolicy)
     * @param modelPolicy The resource-based policy to attach to your custom document classifier
     * model. 
     */
    override fun modelPolicy(modelPolicy: String) {
      cdkBuilder.modelPolicy(modelPolicy)
    }

    /**
     * Provides output results configuration parameters for custom classifier jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-outputdataconfig)
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs. 
     */
    override fun outputDataConfig(outputDataConfig: IResolvable) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(IResolvable::unwrap))
    }

    /**
     * Provides output results configuration parameters for custom classifier jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-outputdataconfig)
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs. 
     */
    override fun outputDataConfig(outputDataConfig: DocumentClassifierOutputDataConfigProperty) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(DocumentClassifierOutputDataConfigProperty::unwrap))
    }

    /**
     * Provides output results configuration parameters for custom classifier jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-outputdataconfig)
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("042164220275f5e173eed7aa0b7339bb447218978d0fa011149f7b206a8ecc8f")
    override
        fun outputDataConfig(outputDataConfig: DocumentClassifierOutputDataConfigProperty.Builder.() -> Unit):
        Unit = outputDataConfig(DocumentClassifierOutputDataConfigProperty(outputDataConfig))

    /**
     * Tags to associate with the document classifier.
     *
     * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend.
     * For example, a tag with "Sales" as the key might be added to a resource to indicate its use by
     * the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-tags)
     * @param tags Tags to associate with the document classifier. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags to associate with the document classifier.
     *
     * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend.
     * For example, a tag with "Sales" as the key might be added to a resource to indicate its use by
     * the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-tags)
     * @param tags Tags to associate with the document classifier. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The version name given to the newly created classifier.
     *
     * Version names can have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The version name must be unique among all models with the same
     * classifier name in the AWS account / AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-versionname)
     * @param versionName The version name given to the newly created classifier. 
     */
    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    /**
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data
     * on the storage volume attached to the ML compute instance(s) that process the analysis job.
     *
     * The VolumeKmsKeyId can be either of the following formats:
     *
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-volumekmskeyid)
     * @param volumeKmsKeyId ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute instance(s) that process
     * the analysis job. 
     */
    override fun volumeKmsKeyId(volumeKmsKeyId: String) {
      cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
    }

    /**
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources
     * you are using for your custom classifier.
     *
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-vpcconfig)
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier. 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources
     * you are using for your custom classifier.
     *
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-vpcconfig)
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier. 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    /**
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources
     * you are using for your custom classifier.
     *
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-vpcconfig)
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dec6a95827b49471469399ea4357f96c18cdef6b0e07e9f74ffd43ec8ed69e6")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.comprehend.CfnDocumentClassifier =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDocumentClassifier {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDocumentClassifier(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier):
        CfnDocumentClassifier = CfnDocumentClassifier(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentClassifier):
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifier = wrapped.cdkObject
  }

  /**
   * Provides configuration parameters to override the default actions for extracting text from PDF
   * documents and image files.
   *
   * By default, Amazon Comprehend performs the following actions to extract text from files, based
   * on the input file type:
   *
   * * *Word files* - Amazon Comprehend parser extracts the text.
   * * *Digital PDF files* - Amazon Comprehend parser extracts the text.
   * * *Image files and scanned PDF files* - Amazon Comprehend uses the Amazon Textract
   * `DetectDocumentText` API to extract the text.
   *
   * `DocumentReaderConfig` does not apply to plain text files or Word files.
   *
   * For image files and PDF documents, you can override these default actions using the fields
   * listed below. For more information, see [Setting text extraction
   * options](https://docs.aws.amazon.com/comprehend/latest/dg/idp-set-textract-options.html) in the
   * Comprehend Developer Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * DocumentReaderConfigProperty documentReaderConfigProperty =
   * DocumentReaderConfigProperty.builder()
   * .documentReadAction("documentReadAction")
   * // the properties below are optional
   * .documentReadMode("documentReadMode")
   * .featureTypes(List.of("featureTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentreaderconfig.html)
   */
  public interface DocumentReaderConfigProperty {
    /**
     * This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract
     * text from PDF files and image files.
     *
     * Enter one of the following values:
     *
     * * `TEXTRACT_DETECT_DOCUMENT_TEXT` - The Amazon Comprehend service uses the
     * `DetectDocumentText` API operation.
     * * `TEXTRACT_ANALYZE_DOCUMENT` - The Amazon Comprehend service uses the `AnalyzeDocument` API
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentreaderconfig.html#cfn-comprehend-documentclassifier-documentreaderconfig-documentreadaction)
     */
    public fun documentReadAction(): String

    /**
     * Determines the text extraction actions for PDF files. Enter one of the following values:.
     *
     * * `SERVICE_DEFAULT` - use the Amazon Comprehend service defaults for PDF files.
     * * `FORCE_DOCUMENT_READ_ACTION` - Amazon Comprehend uses the Textract API specified by
     * DocumentReadAction for all PDF files, including digital PDF files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentreaderconfig.html#cfn-comprehend-documentclassifier-documentreaderconfig-documentreadmode)
     */
    public fun documentReadMode(): String? = unwrap(this).getDocumentReadMode()

    /**
     * Specifies the type of Amazon Textract features to apply.
     *
     * If you chose `TEXTRACT_ANALYZE_DOCUMENT` as the read action, you must specify one or both of
     * the following values:
     *
     * * `TABLES` - Returns additional information about any tables that are detected in the input
     * document.
     * * `FORMS` - Returns additional information about any forms that are detected in the input
     * document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentreaderconfig.html#cfn-comprehend-documentclassifier-documentreaderconfig-featuretypes)
     */
    public fun featureTypes(): List<String> = unwrap(this).getFeatureTypes() ?: emptyList()

    /**
     * A builder for [DocumentReaderConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentReadAction This field defines the Amazon Textract API operation that Amazon
       * Comprehend uses to extract text from PDF files and image files. 
       * Enter one of the following values:
       *
       * * `TEXTRACT_DETECT_DOCUMENT_TEXT` - The Amazon Comprehend service uses the
       * `DetectDocumentText` API operation.
       * * `TEXTRACT_ANALYZE_DOCUMENT` - The Amazon Comprehend service uses the `AnalyzeDocument`
       * API operation.
       */
      public fun documentReadAction(documentReadAction: String)

      /**
       * @param documentReadMode Determines the text extraction actions for PDF files. Enter one of
       * the following values:.
       * * `SERVICE_DEFAULT` - use the Amazon Comprehend service defaults for PDF files.
       * * `FORCE_DOCUMENT_READ_ACTION` - Amazon Comprehend uses the Textract API specified by
       * DocumentReadAction for all PDF files, including digital PDF files.
       */
      public fun documentReadMode(documentReadMode: String)

      /**
       * @param featureTypes Specifies the type of Amazon Textract features to apply.
       * If you chose `TEXTRACT_ANALYZE_DOCUMENT` as the read action, you must specify one or both
       * of the following values:
       *
       * * `TABLES` - Returns additional information about any tables that are detected in the input
       * document.
       * * `FORMS` - Returns additional information about any forms that are detected in the input
       * document.
       */
      public fun featureTypes(featureTypes: List<String>)

      /**
       * @param featureTypes Specifies the type of Amazon Textract features to apply.
       * If you chose `TEXTRACT_ANALYZE_DOCUMENT` as the read action, you must specify one or both
       * of the following values:
       *
       * * `TABLES` - Returns additional information about any tables that are detected in the input
       * document.
       * * `FORMS` - Returns additional information about any forms that are detected in the input
       * document.
       */
      public fun featureTypes(vararg featureTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty.builder()

      /**
       * @param documentReadAction This field defines the Amazon Textract API operation that Amazon
       * Comprehend uses to extract text from PDF files and image files. 
       * Enter one of the following values:
       *
       * * `TEXTRACT_DETECT_DOCUMENT_TEXT` - The Amazon Comprehend service uses the
       * `DetectDocumentText` API operation.
       * * `TEXTRACT_ANALYZE_DOCUMENT` - The Amazon Comprehend service uses the `AnalyzeDocument`
       * API operation.
       */
      override fun documentReadAction(documentReadAction: String) {
        cdkBuilder.documentReadAction(documentReadAction)
      }

      /**
       * @param documentReadMode Determines the text extraction actions for PDF files. Enter one of
       * the following values:.
       * * `SERVICE_DEFAULT` - use the Amazon Comprehend service defaults for PDF files.
       * * `FORCE_DOCUMENT_READ_ACTION` - Amazon Comprehend uses the Textract API specified by
       * DocumentReadAction for all PDF files, including digital PDF files.
       */
      override fun documentReadMode(documentReadMode: String) {
        cdkBuilder.documentReadMode(documentReadMode)
      }

      /**
       * @param featureTypes Specifies the type of Amazon Textract features to apply.
       * If you chose `TEXTRACT_ANALYZE_DOCUMENT` as the read action, you must specify one or both
       * of the following values:
       *
       * * `TABLES` - Returns additional information about any tables that are detected in the input
       * document.
       * * `FORMS` - Returns additional information about any forms that are detected in the input
       * document.
       */
      override fun featureTypes(featureTypes: List<String>) {
        cdkBuilder.featureTypes(featureTypes)
      }

      /**
       * @param featureTypes Specifies the type of Amazon Textract features to apply.
       * If you chose `TEXTRACT_ANALYZE_DOCUMENT` as the read action, you must specify one or both
       * of the following values:
       *
       * * `TABLES` - Returns additional information about any tables that are detected in the input
       * document.
       * * `FORMS` - Returns additional information about any forms that are detected in the input
       * document.
       */
      override fun featureTypes(vararg featureTypes: String): Unit =
          featureTypes(featureTypes.toList())

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty,
    ) : CdkObject(cdkObject), DocumentReaderConfigProperty {
      /**
       * This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract
       * text from PDF files and image files.
       *
       * Enter one of the following values:
       *
       * * `TEXTRACT_DETECT_DOCUMENT_TEXT` - The Amazon Comprehend service uses the
       * `DetectDocumentText` API operation.
       * * `TEXTRACT_ANALYZE_DOCUMENT` - The Amazon Comprehend service uses the `AnalyzeDocument`
       * API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentreaderconfig.html#cfn-comprehend-documentclassifier-documentreaderconfig-documentreadaction)
       */
      override fun documentReadAction(): String = unwrap(this).getDocumentReadAction()

      /**
       * Determines the text extraction actions for PDF files. Enter one of the following values:.
       *
       * * `SERVICE_DEFAULT` - use the Amazon Comprehend service defaults for PDF files.
       * * `FORCE_DOCUMENT_READ_ACTION` - Amazon Comprehend uses the Textract API specified by
       * DocumentReadAction for all PDF files, including digital PDF files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentreaderconfig.html#cfn-comprehend-documentclassifier-documentreaderconfig-documentreadmode)
       */
      override fun documentReadMode(): String? = unwrap(this).getDocumentReadMode()

      /**
       * Specifies the type of Amazon Textract features to apply.
       *
       * If you chose `TEXTRACT_ANALYZE_DOCUMENT` as the read action, you must specify one or both
       * of the following values:
       *
       * * `TABLES` - Returns additional information about any tables that are detected in the input
       * document.
       * * `FORMS` - Returns additional information about any forms that are detected in the input
       * document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentreaderconfig.html#cfn-comprehend-documentclassifier-documentreaderconfig-featuretypes)
       */
      override fun featureTypes(): List<String> = unwrap(this).getFeatureTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentReaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty):
          DocumentReaderConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentReaderConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty
    }
  }

  /**
   * The location of the training documents.
   *
   * This parameter is required in a request to create a semi-structured document classification
   * model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * DocumentClassifierDocumentsProperty documentClassifierDocumentsProperty =
   * DocumentClassifierDocumentsProperty.builder()
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .testS3Uri("testS3Uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierdocuments.html)
   */
  public interface DocumentClassifierDocumentsProperty {
    /**
     * The S3 URI location of the training documents specified in the S3Uri CSV file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierdocuments.html#cfn-comprehend-documentclassifier-documentclassifierdocuments-s3uri)
     */
    public fun s3Uri(): String

    /**
     * The S3 URI location of the test documents included in the TestS3Uri CSV file.
     *
     * This field is not required if you do not specify a test CSV file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierdocuments.html#cfn-comprehend-documentclassifier-documentclassifierdocuments-tests3uri)
     */
    public fun testS3Uri(): String? = unwrap(this).getTestS3Uri()

    /**
     * A builder for [DocumentClassifierDocumentsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Uri The S3 URI location of the training documents specified in the S3Uri CSV file.
       * 
       */
      public fun s3Uri(s3Uri: String)

      /**
       * @param testS3Uri The S3 URI location of the test documents included in the TestS3Uri CSV
       * file.
       * This field is not required if you do not specify a test CSV file.
       */
      public fun testS3Uri(testS3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty.builder()

      /**
       * @param s3Uri The S3 URI location of the training documents specified in the S3Uri CSV file.
       * 
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      /**
       * @param testS3Uri The S3 URI location of the test documents included in the TestS3Uri CSV
       * file.
       * This field is not required if you do not specify a test CSV file.
       */
      override fun testS3Uri(testS3Uri: String) {
        cdkBuilder.testS3Uri(testS3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty,
    ) : CdkObject(cdkObject), DocumentClassifierDocumentsProperty {
      /**
       * The S3 URI location of the training documents specified in the S3Uri CSV file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierdocuments.html#cfn-comprehend-documentclassifier-documentclassifierdocuments-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()

      /**
       * The S3 URI location of the test documents included in the TestS3Uri CSV file.
       *
       * This field is not required if you do not specify a test CSV file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierdocuments.html#cfn-comprehend-documentclassifier-documentclassifierdocuments-tests3uri)
       */
      override fun testS3Uri(): String? = unwrap(this).getTestS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentClassifierDocumentsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty):
          DocumentClassifierDocumentsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentClassifierDocumentsProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty
    }
  }

  /**
   * The input properties for training a document classifier.
   *
   * For more information on how the input file is formatted, see [Preparing training
   * data](https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html) in the
   * Comprehend Developer Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * DocumentClassifierInputDataConfigProperty documentClassifierInputDataConfigProperty =
   * DocumentClassifierInputDataConfigProperty.builder()
   * .augmentedManifests(List.of(AugmentedManifestsListItemProperty.builder()
   * .attributeNames(List.of("attributeNames"))
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .split("split")
   * .build()))
   * .dataFormat("dataFormat")
   * .documentReaderConfig(DocumentReaderConfigProperty.builder()
   * .documentReadAction("documentReadAction")
   * // the properties below are optional
   * .documentReadMode("documentReadMode")
   * .featureTypes(List.of("featureTypes"))
   * .build())
   * .documents(DocumentClassifierDocumentsProperty.builder()
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .testS3Uri("testS3Uri")
   * .build())
   * .documentType("documentType")
   * .labelDelimiter("labelDelimiter")
   * .s3Uri("s3Uri")
   * .testS3Uri("testS3Uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html)
   */
  public interface DocumentClassifierInputDataConfigProperty {
    /**
     * A list of augmented manifest files that provide training data for your custom model.
     *
     * An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
     * Truth.
     *
     * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-augmentedmanifests)
     */
    public fun augmentedManifests(): Any? = unwrap(this).getAugmentedManifests()

    /**
     * The format of your training data:.
     *
     * * `COMPREHEND_CSV` : A two-column CSV file, where labels are provided in the first column,
     * and documents are provided in the second. If you use this value, you must provide the `S3Uri`
     * parameter in your request.
     * * `AUGMENTED_MANIFEST` : A labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * This file is in JSON lines format. Each line is a complete JSON object that contains a training
     * document and its associated labels.
     *
     * If you use this value, you must provide the `AugmentedManifests` parameter in your request.
     *
     * If you don't specify a value, Amazon Comprehend uses `COMPREHEND_CSV` as the default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-dataformat)
     */
    public fun dataFormat(): String? = unwrap(this).getDataFormat()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-documentreaderconfig)
     */
    public fun documentReaderConfig(): Any? = unwrap(this).getDocumentReaderConfig()

    /**
     * The type of input documents for training the model.
     *
     * Provide plain-text documents to create a plain-text model, and provide semi-structured
     * documents to create a native document model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-documenttype)
     */
    public fun documentType(): String? = unwrap(this).getDocumentType()

    /**
     * The S3 location of the training documents.
     *
     * This parameter is required in a request to create a native document model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-documents)
     */
    public fun documents(): Any? = unwrap(this).getDocuments()

    /**
     * Indicates the delimiter used to separate each label for training a multi-label classifier.
     *
     * The default delimiter between labels is a pipe (|). You can use a different character as a
     * delimiter (if it's an allowed character) by specifying it under Delimiter for labels. If the
     * training documents use a delimiter other than the default or the delimiter you specify, the
     * labels on that line will be combined to make a single unique label, such as LABELLABELLABEL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-labeldelimiter)
     */
    public fun labelDelimiter(): String? = unwrap(this).getLabelDelimiter()

    /**
     * The Amazon S3 URI for the input data.
     *
     * The S3 bucket must be in the same Region as the API endpoint that you are calling. The URI
     * can point to a single input file or it can provide the prefix for a collection of input files.
     *
     * For example, if you use the URI `S3://bucketName/prefix` , if the prefix is a single file,
     * Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon
     * Comprehend uses all of them as input.
     *
     * This parameter is required if you set `DataFormat` to `COMPREHEND_CSV` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-s3uri)
     */
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    /**
     * This specifies the Amazon S3 location that contains the test annotations for the document
     * classifier.
     *
     * The URI must be in the same AWS Region as the API endpoint that you are calling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-tests3uri)
     */
    public fun testS3Uri(): String? = unwrap(this).getTestS3Uri()

    /**
     * A builder for [DocumentClassifierInputDataConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param augmentedManifests A list of augmented manifest files that provide training data for
       * your custom model.
       * An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
       * Truth.
       *
       * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
       */
      public fun augmentedManifests(augmentedManifests: IResolvable)

      /**
       * @param augmentedManifests A list of augmented manifest files that provide training data for
       * your custom model.
       * An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
       * Truth.
       *
       * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
       */
      public fun augmentedManifests(augmentedManifests: List<Any>)

      /**
       * @param augmentedManifests A list of augmented manifest files that provide training data for
       * your custom model.
       * An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
       * Truth.
       *
       * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
       */
      public fun augmentedManifests(vararg augmentedManifests: Any)

      /**
       * @param dataFormat The format of your training data:.
       * * `COMPREHEND_CSV` : A two-column CSV file, where labels are provided in the first column,
       * and documents are provided in the second. If you use this value, you must provide the `S3Uri`
       * parameter in your request.
       * * `AUGMENTED_MANIFEST` : A labeled dataset that is produced by Amazon SageMaker Ground
       * Truth. This file is in JSON lines format. Each line is a complete JSON object that contains a
       * training document and its associated labels.
       *
       * If you use this value, you must provide the `AugmentedManifests` parameter in your request.
       *
       * If you don't specify a value, Amazon Comprehend uses `COMPREHEND_CSV` as the default.
       */
      public fun dataFormat(dataFormat: String)

      /**
       * @param documentReaderConfig the value to be set.
       */
      public fun documentReaderConfig(documentReaderConfig: IResolvable)

      /**
       * @param documentReaderConfig the value to be set.
       */
      public fun documentReaderConfig(documentReaderConfig: DocumentReaderConfigProperty)

      /**
       * @param documentReaderConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("519b411b789a1ad772bfb7eb17d0edf75e33b4fb53670cdcc45bf87398c2eb16")
      public
          fun documentReaderConfig(documentReaderConfig: DocumentReaderConfigProperty.Builder.() -> Unit)

      /**
       * @param documentType The type of input documents for training the model.
       * Provide plain-text documents to create a plain-text model, and provide semi-structured
       * documents to create a native document model.
       */
      public fun documentType(documentType: String)

      /**
       * @param documents The S3 location of the training documents.
       * This parameter is required in a request to create a native document model.
       */
      public fun documents(documents: IResolvable)

      /**
       * @param documents The S3 location of the training documents.
       * This parameter is required in a request to create a native document model.
       */
      public fun documents(documents: DocumentClassifierDocumentsProperty)

      /**
       * @param documents The S3 location of the training documents.
       * This parameter is required in a request to create a native document model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7748e5335ba3bb7e210f124dc3f55569cf05ba479b2c865e0b3f4bc3b087b97b")
      public fun documents(documents: DocumentClassifierDocumentsProperty.Builder.() -> Unit)

      /**
       * @param labelDelimiter Indicates the delimiter used to separate each label for training a
       * multi-label classifier.
       * The default delimiter between labels is a pipe (|). You can use a different character as a
       * delimiter (if it's an allowed character) by specifying it under Delimiter for labels. If the
       * training documents use a delimiter other than the default or the delimiter you specify, the
       * labels on that line will be combined to make a single unique label, such as LABELLABELLABEL.
       */
      public fun labelDelimiter(labelDelimiter: String)

      /**
       * @param s3Uri The Amazon S3 URI for the input data.
       * The S3 bucket must be in the same Region as the API endpoint that you are calling. The URI
       * can point to a single input file or it can provide the prefix for a collection of input files.
       *
       * For example, if you use the URI `S3://bucketName/prefix` , if the prefix is a single file,
       * Amazon Comprehend uses that file as input. If more than one file begins with the prefix,
       * Amazon Comprehend uses all of them as input.
       *
       * This parameter is required if you set `DataFormat` to `COMPREHEND_CSV` .
       */
      public fun s3Uri(s3Uri: String)

      /**
       * @param testS3Uri This specifies the Amazon S3 location that contains the test annotations
       * for the document classifier.
       * The URI must be in the same AWS Region as the API endpoint that you are calling.
       */
      public fun testS3Uri(testS3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.builder()

      /**
       * @param augmentedManifests A list of augmented manifest files that provide training data for
       * your custom model.
       * An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
       * Truth.
       *
       * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
       */
      override fun augmentedManifests(augmentedManifests: IResolvable) {
        cdkBuilder.augmentedManifests(augmentedManifests.let(IResolvable::unwrap))
      }

      /**
       * @param augmentedManifests A list of augmented manifest files that provide training data for
       * your custom model.
       * An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
       * Truth.
       *
       * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
       */
      override fun augmentedManifests(augmentedManifests: List<Any>) {
        cdkBuilder.augmentedManifests(augmentedManifests)
      }

      /**
       * @param augmentedManifests A list of augmented manifest files that provide training data for
       * your custom model.
       * An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
       * Truth.
       *
       * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
       */
      override fun augmentedManifests(vararg augmentedManifests: Any): Unit =
          augmentedManifests(augmentedManifests.toList())

      /**
       * @param dataFormat The format of your training data:.
       * * `COMPREHEND_CSV` : A two-column CSV file, where labels are provided in the first column,
       * and documents are provided in the second. If you use this value, you must provide the `S3Uri`
       * parameter in your request.
       * * `AUGMENTED_MANIFEST` : A labeled dataset that is produced by Amazon SageMaker Ground
       * Truth. This file is in JSON lines format. Each line is a complete JSON object that contains a
       * training document and its associated labels.
       *
       * If you use this value, you must provide the `AugmentedManifests` parameter in your request.
       *
       * If you don't specify a value, Amazon Comprehend uses `COMPREHEND_CSV` as the default.
       */
      override fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
      }

      /**
       * @param documentReaderConfig the value to be set.
       */
      override fun documentReaderConfig(documentReaderConfig: IResolvable) {
        cdkBuilder.documentReaderConfig(documentReaderConfig.let(IResolvable::unwrap))
      }

      /**
       * @param documentReaderConfig the value to be set.
       */
      override fun documentReaderConfig(documentReaderConfig: DocumentReaderConfigProperty) {
        cdkBuilder.documentReaderConfig(documentReaderConfig.let(DocumentReaderConfigProperty::unwrap))
      }

      /**
       * @param documentReaderConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("519b411b789a1ad772bfb7eb17d0edf75e33b4fb53670cdcc45bf87398c2eb16")
      override
          fun documentReaderConfig(documentReaderConfig: DocumentReaderConfigProperty.Builder.() -> Unit):
          Unit = documentReaderConfig(DocumentReaderConfigProperty(documentReaderConfig))

      /**
       * @param documentType The type of input documents for training the model.
       * Provide plain-text documents to create a plain-text model, and provide semi-structured
       * documents to create a native document model.
       */
      override fun documentType(documentType: String) {
        cdkBuilder.documentType(documentType)
      }

      /**
       * @param documents The S3 location of the training documents.
       * This parameter is required in a request to create a native document model.
       */
      override fun documents(documents: IResolvable) {
        cdkBuilder.documents(documents.let(IResolvable::unwrap))
      }

      /**
       * @param documents The S3 location of the training documents.
       * This parameter is required in a request to create a native document model.
       */
      override fun documents(documents: DocumentClassifierDocumentsProperty) {
        cdkBuilder.documents(documents.let(DocumentClassifierDocumentsProperty::unwrap))
      }

      /**
       * @param documents The S3 location of the training documents.
       * This parameter is required in a request to create a native document model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7748e5335ba3bb7e210f124dc3f55569cf05ba479b2c865e0b3f4bc3b087b97b")
      override fun documents(documents: DocumentClassifierDocumentsProperty.Builder.() -> Unit):
          Unit = documents(DocumentClassifierDocumentsProperty(documents))

      /**
       * @param labelDelimiter Indicates the delimiter used to separate each label for training a
       * multi-label classifier.
       * The default delimiter between labels is a pipe (|). You can use a different character as a
       * delimiter (if it's an allowed character) by specifying it under Delimiter for labels. If the
       * training documents use a delimiter other than the default or the delimiter you specify, the
       * labels on that line will be combined to make a single unique label, such as LABELLABELLABEL.
       */
      override fun labelDelimiter(labelDelimiter: String) {
        cdkBuilder.labelDelimiter(labelDelimiter)
      }

      /**
       * @param s3Uri The Amazon S3 URI for the input data.
       * The S3 bucket must be in the same Region as the API endpoint that you are calling. The URI
       * can point to a single input file or it can provide the prefix for a collection of input files.
       *
       * For example, if you use the URI `S3://bucketName/prefix` , if the prefix is a single file,
       * Amazon Comprehend uses that file as input. If more than one file begins with the prefix,
       * Amazon Comprehend uses all of them as input.
       *
       * This parameter is required if you set `DataFormat` to `COMPREHEND_CSV` .
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      /**
       * @param testS3Uri This specifies the Amazon S3 location that contains the test annotations
       * for the document classifier.
       * The URI must be in the same AWS Region as the API endpoint that you are calling.
       */
      override fun testS3Uri(testS3Uri: String) {
        cdkBuilder.testS3Uri(testS3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty,
    ) : CdkObject(cdkObject), DocumentClassifierInputDataConfigProperty {
      /**
       * A list of augmented manifest files that provide training data for your custom model.
       *
       * An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
       * Truth.
       *
       * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-augmentedmanifests)
       */
      override fun augmentedManifests(): Any? = unwrap(this).getAugmentedManifests()

      /**
       * The format of your training data:.
       *
       * * `COMPREHEND_CSV` : A two-column CSV file, where labels are provided in the first column,
       * and documents are provided in the second. If you use this value, you must provide the `S3Uri`
       * parameter in your request.
       * * `AUGMENTED_MANIFEST` : A labeled dataset that is produced by Amazon SageMaker Ground
       * Truth. This file is in JSON lines format. Each line is a complete JSON object that contains a
       * training document and its associated labels.
       *
       * If you use this value, you must provide the `AugmentedManifests` parameter in your request.
       *
       * If you don't specify a value, Amazon Comprehend uses `COMPREHEND_CSV` as the default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-dataformat)
       */
      override fun dataFormat(): String? = unwrap(this).getDataFormat()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-documentreaderconfig)
       */
      override fun documentReaderConfig(): Any? = unwrap(this).getDocumentReaderConfig()

      /**
       * The type of input documents for training the model.
       *
       * Provide plain-text documents to create a plain-text model, and provide semi-structured
       * documents to create a native document model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-documenttype)
       */
      override fun documentType(): String? = unwrap(this).getDocumentType()

      /**
       * The S3 location of the training documents.
       *
       * This parameter is required in a request to create a native document model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-documents)
       */
      override fun documents(): Any? = unwrap(this).getDocuments()

      /**
       * Indicates the delimiter used to separate each label for training a multi-label classifier.
       *
       * The default delimiter between labels is a pipe (|). You can use a different character as a
       * delimiter (if it's an allowed character) by specifying it under Delimiter for labels. If the
       * training documents use a delimiter other than the default or the delimiter you specify, the
       * labels on that line will be combined to make a single unique label, such as LABELLABELLABEL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-labeldelimiter)
       */
      override fun labelDelimiter(): String? = unwrap(this).getLabelDelimiter()

      /**
       * The Amazon S3 URI for the input data.
       *
       * The S3 bucket must be in the same Region as the API endpoint that you are calling. The URI
       * can point to a single input file or it can provide the prefix for a collection of input files.
       *
       * For example, if you use the URI `S3://bucketName/prefix` , if the prefix is a single file,
       * Amazon Comprehend uses that file as input. If more than one file begins with the prefix,
       * Amazon Comprehend uses all of them as input.
       *
       * This parameter is required if you set `DataFormat` to `COMPREHEND_CSV` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-s3uri)
       */
      override fun s3Uri(): String? = unwrap(this).getS3Uri()

      /**
       * This specifies the Amazon S3 location that contains the test annotations for the document
       * classifier.
       *
       * The URI must be in the same AWS Region as the API endpoint that you are calling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifierinputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifierinputdataconfig-tests3uri)
       */
      override fun testS3Uri(): String? = unwrap(this).getTestS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentClassifierInputDataConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty):
          DocumentClassifierInputDataConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentClassifierInputDataConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty
    }
  }

  /**
   * Provide the location for output data from a custom classifier job.
   *
   * This field is mandatory if you are training a native document model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * DocumentClassifierOutputDataConfigProperty documentClassifierOutputDataConfigProperty =
   * DocumentClassifierOutputDataConfigProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .s3Uri("s3Uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifieroutputdataconfig.html)
   */
  public interface DocumentClassifierOutputDataConfigProperty {
    /**
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the
     * output results from an analysis job.
     *
     * The KmsKeyId can be one of the following formats:
     *
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * KMS Key Alias: `"alias/ExampleAlias"`
     * * ARN of a KMS Key Alias: `"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifieroutputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifieroutputdataconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * When you use the `OutputDataConfig` object while creating a custom classifier, you specify
     * the Amazon S3 location where you want to write the confusion matrix and other output files.
     *
     * The URI must be in the same Region as the API endpoint that you are calling. The location is
     * used as the prefix for the actual location of this output file.
     *
     * When the custom classifier job is finished, the service creates the output file in a
     * directory specific to the job. The `S3Uri` field contains the location of the output file,
     * called `output.tar.gz` . It is a compressed archive that contains the confusion matrix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifieroutputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifieroutputdataconfig-s3uri)
     */
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    /**
     * A builder for [DocumentClassifierOutputDataConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses
       * to encrypt the output results from an analysis job.
       * The KmsKeyId can be one of the following formats:
       *
       * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
       * * Amazon Resource Name (ARN) of a KMS Key:
       * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
       * * KMS Key Alias: `"alias/ExampleAlias"`
       * * ARN of a KMS Key Alias: `"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"`
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param s3Uri When you use the `OutputDataConfig` object while creating a custom classifier,
       * you specify the Amazon S3 location where you want to write the confusion matrix and other
       * output files.
       * The URI must be in the same Region as the API endpoint that you are calling. The location
       * is used as the prefix for the actual location of this output file.
       *
       * When the custom classifier job is finished, the service creates the output file in a
       * directory specific to the job. The `S3Uri` field contains the location of the output file,
       * called `output.tar.gz` . It is a compressed archive that contains the confusion matrix.
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.builder()

      /**
       * @param kmsKeyId ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses
       * to encrypt the output results from an analysis job.
       * The KmsKeyId can be one of the following formats:
       *
       * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
       * * Amazon Resource Name (ARN) of a KMS Key:
       * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
       * * KMS Key Alias: `"alias/ExampleAlias"`
       * * ARN of a KMS Key Alias: `"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"`
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param s3Uri When you use the `OutputDataConfig` object while creating a custom classifier,
       * you specify the Amazon S3 location where you want to write the confusion matrix and other
       * output files.
       * The URI must be in the same Region as the API endpoint that you are calling. The location
       * is used as the prefix for the actual location of this output file.
       *
       * When the custom classifier job is finished, the service creates the output file in a
       * directory specific to the job. The `S3Uri` field contains the location of the output file,
       * called `output.tar.gz` . It is a compressed archive that contains the confusion matrix.
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty,
    ) : CdkObject(cdkObject), DocumentClassifierOutputDataConfigProperty {
      /**
       * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the
       * output results from an analysis job.
       *
       * The KmsKeyId can be one of the following formats:
       *
       * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
       * * Amazon Resource Name (ARN) of a KMS Key:
       * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
       * * KMS Key Alias: `"alias/ExampleAlias"`
       * * ARN of a KMS Key Alias: `"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifieroutputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifieroutputdataconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * When you use the `OutputDataConfig` object while creating a custom classifier, you specify
       * the Amazon S3 location where you want to write the confusion matrix and other output files.
       *
       * The URI must be in the same Region as the API endpoint that you are calling. The location
       * is used as the prefix for the actual location of this output file.
       *
       * When the custom classifier job is finished, the service creates the output file in a
       * directory specific to the job. The `S3Uri` field contains the location of the output file,
       * called `output.tar.gz` . It is a compressed archive that contains the confusion matrix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifieroutputdataconfig.html#cfn-comprehend-documentclassifier-documentclassifieroutputdataconfig-s3uri)
       */
      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentClassifierOutputDataConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty):
          DocumentClassifierOutputDataConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentClassifierOutputDataConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty
    }
  }

  /**
   * An augmented manifest file that provides training data for your custom model.
   *
   * An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
   * Truth.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * AugmentedManifestsListItemProperty augmentedManifestsListItemProperty =
   * AugmentedManifestsListItemProperty.builder()
   * .attributeNames(List.of("attributeNames"))
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .split("split")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-augmentedmanifestslistitem.html)
   */
  public interface AugmentedManifestsListItemProperty {
    /**
     * The JSON attribute that contains the annotations for your training documents.
     *
     * The number of attribute names that you specify depends on whether your augmented manifest
     * file is the output of a single labeling job or a chained labeling job.
     *
     * If your file is the output of a single labeling job, specify the LabelAttributeName key that
     * was used when the job was created in Ground Truth.
     *
     * If your file is the output of a chained labeling job, specify the LabelAttributeName key for
     * one or more jobs in the chain. Each LabelAttributeName key provides the annotations from an
     * individual job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-augmentedmanifestslistitem.html#cfn-comprehend-documentclassifier-augmentedmanifestslistitem-attributenames)
     */
    public fun attributeNames(): List<String>

    /**
     * The Amazon S3 location of the augmented manifest file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-augmentedmanifestslistitem.html#cfn-comprehend-documentclassifier-augmentedmanifestslistitem-s3uri)
     */
    public fun s3Uri(): String

    /**
     * The purpose of the data you've provided in the augmented manifest.
     *
     * You can either train or test this data. If you don't specify, the default is train.
     *
     * TRAIN - all of the documents in the manifest will be used for training. If no test documents
     * are provided, Amazon Comprehend will automatically reserve a portion of the training documents
     * for testing.
     *
     * TEST - all of the documents in the manifest will be used for testing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-augmentedmanifestslistitem.html#cfn-comprehend-documentclassifier-augmentedmanifestslistitem-split)
     */
    public fun split(): String? = unwrap(this).getSplit()

    /**
     * A builder for [AugmentedManifestsListItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeNames The JSON attribute that contains the annotations for your training
       * documents. 
       * The number of attribute names that you specify depends on whether your augmented manifest
       * file is the output of a single labeling job or a chained labeling job.
       *
       * If your file is the output of a single labeling job, specify the LabelAttributeName key
       * that was used when the job was created in Ground Truth.
       *
       * If your file is the output of a chained labeling job, specify the LabelAttributeName key
       * for one or more jobs in the chain. Each LabelAttributeName key provides the annotations from
       * an individual job.
       */
      public fun attributeNames(attributeNames: List<String>)

      /**
       * @param attributeNames The JSON attribute that contains the annotations for your training
       * documents. 
       * The number of attribute names that you specify depends on whether your augmented manifest
       * file is the output of a single labeling job or a chained labeling job.
       *
       * If your file is the output of a single labeling job, specify the LabelAttributeName key
       * that was used when the job was created in Ground Truth.
       *
       * If your file is the output of a chained labeling job, specify the LabelAttributeName key
       * for one or more jobs in the chain. Each LabelAttributeName key provides the annotations from
       * an individual job.
       */
      public fun attributeNames(vararg attributeNames: String)

      /**
       * @param s3Uri The Amazon S3 location of the augmented manifest file. 
       */
      public fun s3Uri(s3Uri: String)

      /**
       * @param split The purpose of the data you've provided in the augmented manifest.
       * You can either train or test this data. If you don't specify, the default is train.
       *
       * TRAIN - all of the documents in the manifest will be used for training. If no test
       * documents are provided, Amazon Comprehend will automatically reserve a portion of the training
       * documents for testing.
       *
       * TEST - all of the documents in the manifest will be used for testing.
       */
      public fun split(split: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty.builder()

      /**
       * @param attributeNames The JSON attribute that contains the annotations for your training
       * documents. 
       * The number of attribute names that you specify depends on whether your augmented manifest
       * file is the output of a single labeling job or a chained labeling job.
       *
       * If your file is the output of a single labeling job, specify the LabelAttributeName key
       * that was used when the job was created in Ground Truth.
       *
       * If your file is the output of a chained labeling job, specify the LabelAttributeName key
       * for one or more jobs in the chain. Each LabelAttributeName key provides the annotations from
       * an individual job.
       */
      override fun attributeNames(attributeNames: List<String>) {
        cdkBuilder.attributeNames(attributeNames)
      }

      /**
       * @param attributeNames The JSON attribute that contains the annotations for your training
       * documents. 
       * The number of attribute names that you specify depends on whether your augmented manifest
       * file is the output of a single labeling job or a chained labeling job.
       *
       * If your file is the output of a single labeling job, specify the LabelAttributeName key
       * that was used when the job was created in Ground Truth.
       *
       * If your file is the output of a chained labeling job, specify the LabelAttributeName key
       * for one or more jobs in the chain. Each LabelAttributeName key provides the annotations from
       * an individual job.
       */
      override fun attributeNames(vararg attributeNames: String): Unit =
          attributeNames(attributeNames.toList())

      /**
       * @param s3Uri The Amazon S3 location of the augmented manifest file. 
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      /**
       * @param split The purpose of the data you've provided in the augmented manifest.
       * You can either train or test this data. If you don't specify, the default is train.
       *
       * TRAIN - all of the documents in the manifest will be used for training. If no test
       * documents are provided, Amazon Comprehend will automatically reserve a portion of the training
       * documents for testing.
       *
       * TEST - all of the documents in the manifest will be used for testing.
       */
      override fun split(split: String) {
        cdkBuilder.split(split)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty,
    ) : CdkObject(cdkObject), AugmentedManifestsListItemProperty {
      /**
       * The JSON attribute that contains the annotations for your training documents.
       *
       * The number of attribute names that you specify depends on whether your augmented manifest
       * file is the output of a single labeling job or a chained labeling job.
       *
       * If your file is the output of a single labeling job, specify the LabelAttributeName key
       * that was used when the job was created in Ground Truth.
       *
       * If your file is the output of a chained labeling job, specify the LabelAttributeName key
       * for one or more jobs in the chain. Each LabelAttributeName key provides the annotations from
       * an individual job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-augmentedmanifestslistitem.html#cfn-comprehend-documentclassifier-augmentedmanifestslistitem-attributenames)
       */
      override fun attributeNames(): List<String> = unwrap(this).getAttributeNames()

      /**
       * The Amazon S3 location of the augmented manifest file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-augmentedmanifestslistitem.html#cfn-comprehend-documentclassifier-augmentedmanifestslistitem-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()

      /**
       * The purpose of the data you've provided in the augmented manifest.
       *
       * You can either train or test this data. If you don't specify, the default is train.
       *
       * TRAIN - all of the documents in the manifest will be used for training. If no test
       * documents are provided, Amazon Comprehend will automatically reserve a portion of the training
       * documents for testing.
       *
       * TEST - all of the documents in the manifest will be used for testing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-augmentedmanifestslistitem.html#cfn-comprehend-documentclassifier-augmentedmanifestslistitem-split)
       */
      override fun split(): String? = unwrap(this).getSplit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AugmentedManifestsListItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty):
          AugmentedManifestsListItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AugmentedManifestsListItemProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty
    }
  }

  /**
   * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the
   * resources you are using for the job.
   *
   * For more information, see [Amazon
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * The ID number for a security group on an instance of your private VPC.
     *
     * Security groups on your VPC function serve as a virtual firewall to control inbound and
     * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
     * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more information,
     * see [Security Groups for your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-vpcconfig.html#cfn-comprehend-documentclassifier-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The ID for each subnet being used in your private VPC.
     *
     * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to a
     * given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
     * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
     * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-vpcconfig.html#cfn-comprehend-documentclassifier-vpcconfig-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The ID number for a security group on an instance of your private
       * VPC. 
       * Security groups on your VPC function serve as a virtual firewall to control inbound and
       * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
       * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more
       * information, see [Security Groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The ID number for a security group on an instance of your private
       * VPC. 
       * Security groups on your VPC function serve as a virtual firewall to control inbound and
       * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
       * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more
       * information, see [Security Groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnets The ID for each subnet being used in your private VPC. 
       * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to
       * a given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
       * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
       * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The ID for each subnet being used in your private VPC. 
       * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to
       * a given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
       * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
       * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds The ID number for a security group on an instance of your private
       * VPC. 
       * Security groups on your VPC function serve as a virtual firewall to control inbound and
       * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
       * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more
       * information, see [Security Groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The ID number for a security group on an instance of your private
       * VPC. 
       * Security groups on your VPC function serve as a virtual firewall to control inbound and
       * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
       * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more
       * information, see [Security Groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnets The ID for each subnet being used in your private VPC. 
       * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to
       * a given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
       * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
       * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The ID for each subnet being used in your private VPC. 
       * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to
       * a given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
       * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
       * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * The ID number for a security group on an instance of your private VPC.
       *
       * Security groups on your VPC function serve as a virtual firewall to control inbound and
       * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
       * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more
       * information, see [Security Groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-vpcconfig.html#cfn-comprehend-documentclassifier-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The ID for each subnet being used in your private VPC.
       *
       * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to
       * a given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
       * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
       * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-vpcconfig.html#cfn-comprehend-documentclassifier-vpcconfig-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty
    }
  }
}
