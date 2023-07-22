@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import software.constructs.Construct

@CdkDslMarker
public class CfnDocumentClassifierDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDocumentClassifier.Builder =
      CfnDocumentClassifier.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to
   * your input data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-dataaccessrolearn)
   * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
   * Comprehend read access to your input data. 
   */
  public fun dataAccessRoleArn(dataAccessRoleArn: String) {
    cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
  }

  /**
   * The name of the document classifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-documentclassifiername)
   * @param documentClassifierName The name of the document classifier. 
   */
  public fun documentClassifierName(documentClassifierName: String) {
    cdkBuilder.documentClassifierName(documentClassifierName)
  }

  /**
   * Specifies the format and location of the input data for the job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-inputdataconfig)
   * @param inputDataConfig Specifies the format and location of the input data for the job. 
   */
  public fun inputDataConfig(inputDataConfig: IResolvable) {
    cdkBuilder.inputDataConfig(inputDataConfig)
  }

  /**
   * Specifies the format and location of the input data for the job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-inputdataconfig)
   * @param inputDataConfig Specifies the format and location of the input data for the job. 
   */
  public
      fun inputDataConfig(inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty) {
    cdkBuilder.inputDataConfig(inputDataConfig)
  }

  /**
   * The language of the input documents.
   *
   * You can specify any of the languages supported by Amazon Comprehend. All documents must be in
   * the same language.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-languagecode)
   * @param languageCode The language of the input documents. 
   */
  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  /**
   * Indicates the mode in which the classifier will be trained.
   *
   * The classifier can be trained in multi-class mode, which identifies one and only one class for
   * each document, or multi-label mode, which identifies one or more labels for each document. In
   * multi-label mode, multiple labels for an individual document are separated by a delimiter. The
   * default delimiter between labels is a pipe (|).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-mode)
   * @param mode Indicates the mode in which the classifier will be trained. 
   */
  public fun mode(mode: String) {
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
  public fun modelKmsKeyId(modelKmsKeyId: String) {
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
   * To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to
   * enclose the JSON names and values:
   *
   * `'{"attribute": "value", "attribute": ["value"]}'`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-modelpolicy)
   * @param modelPolicy The resource-based policy to attach to your custom document classifier
   * model. 
   */
  public fun modelPolicy(modelPolicy: String) {
    cdkBuilder.modelPolicy(modelPolicy)
  }

  /**
   * Provides output results configuration parameters for custom classifier jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-outputdataconfig)
   * @param outputDataConfig Provides output results configuration parameters for custom classifier
   * jobs. 
   */
  public fun outputDataConfig(outputDataConfig: IResolvable) {
    cdkBuilder.outputDataConfig(outputDataConfig)
  }

  /**
   * Provides output results configuration parameters for custom classifier jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-outputdataconfig)
   * @param outputDataConfig Provides output results configuration parameters for custom classifier
   * jobs. 
   */
  public
      fun outputDataConfig(outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty) {
    cdkBuilder.outputDataConfig(outputDataConfig)
  }

  /**
   * Tags to associate with the document classifier.
   *
   * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For
   * example, a tag with "Sales" as the key might be added to a resource to indicate its use by the
   * sales department.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-tags)
   * @param tags Tags to associate with the document classifier. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Tags to associate with the document classifier.
   *
   * A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For
   * example, a tag with "Sales" as the key might be added to a resource to indicate its use by the
   * sales department.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-tags)
   * @param tags Tags to associate with the document classifier. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

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
  public fun versionName(versionName: String) {
    cdkBuilder.versionName(versionName)
  }

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
   * @param volumeKmsKeyId ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
   * uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the
   * analysis job. 
   */
  public fun volumeKmsKeyId(volumeKmsKeyId: String) {
    cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
  }

  /**
   * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you
   * are using for your custom classifier.
   *
   * For more information, see [Amazon
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-vpcconfig)
   * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC) containing
   * the resources you are using for your custom classifier. 
   */
  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  /**
   * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you
   * are using for your custom classifier.
   *
   * For more information, see [Amazon
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-documentclassifier.html#cfn-comprehend-documentclassifier-vpcconfig)
   * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC) containing
   * the resources you are using for your custom classifier. 
   */
  public fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnDocumentClassifier {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
