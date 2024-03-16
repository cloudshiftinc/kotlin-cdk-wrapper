@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.comprehend

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDocumentClassifier`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.comprehend.*;
 * CfnDocumentClassifierProps cfnDocumentClassifierProps = CfnDocumentClassifierProps.builder()
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
public interface CfnDocumentClassifierProps {
  /**
   * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to
   * your input data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-dataaccessrolearn)
   */
  public fun dataAccessRoleArn(): String

  /**
   * The name of the document classifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-documentclassifiername)
   */
  public fun documentClassifierName(): String

  /**
   * Specifies the format and location of the input data for the job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-inputdataconfig)
   */
  public fun inputDataConfig(): Any

  /**
   * The language of the input documents.
   *
   * You can specify any of the languages supported by Amazon Comprehend. All documents must be in
   * the same language.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-languagecode)
   */
  public fun languageCode(): String

  /**
   * Indicates the mode in which the classifier will be trained.
   *
   * The classifier can be trained in multi-class (single-label) mode or multi-label mode.
   * Multi-class mode identifies a single class label for each document and multi-label mode identifies
   * one or more class labels for each document. Multiple labels for an individual document are
   * separated by a delimiter. The default delimiter between labels is a pipe (|).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-mode)
   */
  public fun mode(): String? = unwrap(this).getMode()

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
   */
  public fun modelKmsKeyId(): String? = unwrap(this).getModelKmsKeyId()

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
   * To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to
   * enclose the JSON names and values:
   *
   * `'{"attribute": "value", "attribute": ["value"]}'`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-modelpolicy)
   */
  public fun modelPolicy(): String? = unwrap(this).getModelPolicy()

  /**
   * Provides output results configuration parameters for custom classifier jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-outputdataconfig)
   */
  public fun outputDataConfig(): Any? = unwrap(this).getOutputDataConfig()

  /**
   * Tags to associate with the document classifier.
   *
   * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For
   * example, a tag with "Sales" as the key might be added to a resource to indicate its use by the
   * sales department.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The version name given to the newly created classifier.
   *
   * Version names can have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and
   * underscores (_) are allowed. The version name must be unique among all models with the same
   * classifier name in the AWS account / AWS Region .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-versionname)
   */
  public fun versionName(): String? = unwrap(this).getVersionName()

  /**
   * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on
   * the storage volume attached to the ML compute instance(s) that process the analysis job.
   *
   * The VolumeKmsKeyId can be either of the following formats:
   *
   * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
   * * Amazon Resource Name (ARN) of a KMS Key:
   * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-volumekmskeyid)
   */
  public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

  /**
   * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you
   * are using for your custom classifier.
   *
   * For more information, see [Amazon
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnDocumentClassifierProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend read access to your input data. 
     */
    public fun dataAccessRoleArn(dataAccessRoleArn: String)

    /**
     * @param documentClassifierName The name of the document classifier. 
     */
    public fun documentClassifierName(documentClassifierName: String)

    /**
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    public fun inputDataConfig(inputDataConfig: IResolvable)

    /**
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    public
        fun inputDataConfig(inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty)

    /**
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c5d4c31157dcb302fdac6a94fe272864e0d4ddb3d7f1f40213c6f50a4e392ea")
    public
        fun inputDataConfig(inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.Builder.() -> Unit)

    /**
     * @param languageCode The language of the input documents. 
     * You can specify any of the languages supported by Amazon Comprehend. All documents must be in
     * the same language.
     */
    public fun languageCode(languageCode: String)

    /**
     * @param mode Indicates the mode in which the classifier will be trained.
     * The classifier can be trained in multi-class (single-label) mode or multi-label mode.
     * Multi-class mode identifies a single class label for each document and multi-label mode
     * identifies one or more class labels for each document. Multiple labels for an individual
     * document are separated by a delimiter. The default delimiter between labels is a pipe (|).
     */
    public fun mode(mode: String)

    /**
     * @param modelKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained
     * custom models.
     * The ModelKmsKeyId can be either of the following formats:
     *
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     */
    public fun modelKmsKeyId(modelKmsKeyId: String)

    /**
     * @param modelPolicy The resource-based policy to attach to your custom document classifier
     * model.
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
     */
    public fun modelPolicy(modelPolicy: String)

    /**
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs.
     */
    public fun outputDataConfig(outputDataConfig: IResolvable)

    /**
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs.
     */
    public
        fun outputDataConfig(outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty)

    /**
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62f06cc5ff8f83040bc905800ff5d7c7ceaf910dd255dc18eb34ca5bac946c2f")
    public
        fun outputDataConfig(outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.Builder.() -> Unit)

    /**
     * @param tags Tags to associate with the document classifier.
     * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend.
     * For example, a tag with "Sales" as the key might be added to a resource to indicate its use by
     * the sales department.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to associate with the document classifier.
     * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend.
     * For example, a tag with "Sales" as the key might be added to a resource to indicate its use by
     * the sales department.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param versionName The version name given to the newly created classifier.
     * Version names can have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The version name must be unique among all models with the same
     * classifier name in the AWS account / AWS Region .
     */
    public fun versionName(versionName: String)

    /**
     * @param volumeKmsKeyId ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute instance(s) that process
     * the analysis job.
     * The VolumeKmsKeyId can be either of the following formats:
     *
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     */
    public fun volumeKmsKeyId(volumeKmsKeyId: String)

    /**
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier.
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier.
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     */
    public fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty)

    /**
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier.
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6a0bbde2404edb30c2b44538ba4a6e9fe1d2cfd8c7f4f840a55cd86f4965868")
    public fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps.Builder =
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps.builder()

    /**
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend read access to your input data. 
     */
    override fun dataAccessRoleArn(dataAccessRoleArn: String) {
      cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    /**
     * @param documentClassifierName The name of the document classifier. 
     */
    override fun documentClassifierName(documentClassifierName: String) {
      cdkBuilder.documentClassifierName(documentClassifierName)
    }

    /**
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    override fun inputDataConfig(inputDataConfig: IResolvable) {
      cdkBuilder.inputDataConfig(inputDataConfig.let(IResolvable::unwrap))
    }

    /**
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    override
        fun inputDataConfig(inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty) {
      cdkBuilder.inputDataConfig(inputDataConfig.let(CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty::unwrap))
    }

    /**
     * @param inputDataConfig Specifies the format and location of the input data for the job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c5d4c31157dcb302fdac6a94fe272864e0d4ddb3d7f1f40213c6f50a4e392ea")
    override
        fun inputDataConfig(inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.Builder.() -> Unit):
        Unit =
        inputDataConfig(CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty(inputDataConfig))

    /**
     * @param languageCode The language of the input documents. 
     * You can specify any of the languages supported by Amazon Comprehend. All documents must be in
     * the same language.
     */
    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    /**
     * @param mode Indicates the mode in which the classifier will be trained.
     * The classifier can be trained in multi-class (single-label) mode or multi-label mode.
     * Multi-class mode identifies a single class label for each document and multi-label mode
     * identifies one or more class labels for each document. Multiple labels for an individual
     * document are separated by a delimiter. The default delimiter between labels is a pipe (|).
     */
    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    /**
     * @param modelKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained
     * custom models.
     * The ModelKmsKeyId can be either of the following formats:
     *
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     */
    override fun modelKmsKeyId(modelKmsKeyId: String) {
      cdkBuilder.modelKmsKeyId(modelKmsKeyId)
    }

    /**
     * @param modelPolicy The resource-based policy to attach to your custom document classifier
     * model.
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
     */
    override fun modelPolicy(modelPolicy: String) {
      cdkBuilder.modelPolicy(modelPolicy)
    }

    /**
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs.
     */
    override fun outputDataConfig(outputDataConfig: IResolvable) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(IResolvable::unwrap))
    }

    /**
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs.
     */
    override
        fun outputDataConfig(outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty::unwrap))
    }

    /**
     * @param outputDataConfig Provides output results configuration parameters for custom
     * classifier jobs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62f06cc5ff8f83040bc905800ff5d7c7ceaf910dd255dc18eb34ca5bac946c2f")
    override
        fun outputDataConfig(outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.Builder.() -> Unit):
        Unit =
        outputDataConfig(CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty(outputDataConfig))

    /**
     * @param tags Tags to associate with the document classifier.
     * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend.
     * For example, a tag with "Sales" as the key might be added to a resource to indicate its use by
     * the sales department.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags to associate with the document classifier.
     * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend.
     * For example, a tag with "Sales" as the key might be added to a resource to indicate its use by
     * the sales department.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param versionName The version name given to the newly created classifier.
     * Version names can have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The version name must be unique among all models with the same
     * classifier name in the AWS account / AWS Region .
     */
    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    /**
     * @param volumeKmsKeyId ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute instance(s) that process
     * the analysis job.
     * The VolumeKmsKeyId can be either of the following formats:
     *
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     */
    override fun volumeKmsKeyId(volumeKmsKeyId: String) {
      cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
    }

    /**
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier.
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier.
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     */
    override fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnDocumentClassifier.VpcConfigProperty::unwrap))
    }

    /**
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier.
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6a0bbde2404edb30c2b44538ba4a6e9fe1d2cfd8c7f4f840a55cd86f4965868")
    override fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty.Builder.() -> Unit):
        Unit = vpcConfig(CfnDocumentClassifier.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps,
  ) : CdkObject(cdkObject), CfnDocumentClassifierProps {
    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to
     * your input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-dataaccessrolearn)
     */
    override fun dataAccessRoleArn(): String = unwrap(this).getDataAccessRoleArn()

    /**
     * The name of the document classifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-documentclassifiername)
     */
    override fun documentClassifierName(): String = unwrap(this).getDocumentClassifierName()

    /**
     * Specifies the format and location of the input data for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-inputdataconfig)
     */
    override fun inputDataConfig(): Any = unwrap(this).getInputDataConfig()

    /**
     * The language of the input documents.
     *
     * You can specify any of the languages supported by Amazon Comprehend. All documents must be in
     * the same language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-languagecode)
     */
    override fun languageCode(): String = unwrap(this).getLanguageCode()

    /**
     * Indicates the mode in which the classifier will be trained.
     *
     * The classifier can be trained in multi-class (single-label) mode or multi-label mode.
     * Multi-class mode identifies a single class label for each document and multi-label mode
     * identifies one or more class labels for each document. Multiple labels for an individual
     * document are separated by a delimiter. The default delimiter between labels is a pipe (|).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-mode)
     */
    override fun mode(): String? = unwrap(this).getMode()

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
     */
    override fun modelKmsKeyId(): String? = unwrap(this).getModelKmsKeyId()

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
     */
    override fun modelPolicy(): String? = unwrap(this).getModelPolicy()

    /**
     * Provides output results configuration parameters for custom classifier jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-outputdataconfig)
     */
    override fun outputDataConfig(): Any? = unwrap(this).getOutputDataConfig()

    /**
     * Tags to associate with the document classifier.
     *
     * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend.
     * For example, a tag with "Sales" as the key might be added to a resource to indicate its use by
     * the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The version name given to the newly created classifier.
     *
     * Version names can have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and
     * underscores (_) are allowed. The version name must be unique among all models with the same
     * classifier name in the AWS account / AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-versionname)
     */
    override fun versionName(): String? = unwrap(this).getVersionName()

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
     */
    override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    /**
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources
     * you are using for your custom classifier.
     *
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-vpcconfig)
     */
    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDocumentClassifierProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps):
        CfnDocumentClassifierProps = CdkObjectWrappers.wrap(cdkObject) as CfnDocumentClassifierProps

    internal fun unwrap(wrapped: CfnDocumentClassifierProps):
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps
  }
}
