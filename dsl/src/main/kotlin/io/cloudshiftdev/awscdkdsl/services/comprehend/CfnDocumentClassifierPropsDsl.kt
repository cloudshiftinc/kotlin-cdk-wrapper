@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.comprehend

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps

/**
 * Properties for defining a `CfnDocumentClassifier`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.comprehend.*;
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
@CdkDslMarker
public class CfnDocumentClassifierPropsDsl {
    private val cdkBuilder: CfnDocumentClassifierProps.Builder =
        CfnDocumentClassifierProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     *   Comprehend read access to your input data.
     */
    public fun dataAccessRoleArn(dataAccessRoleArn: String) {
        cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    /** @param documentClassifierName The name of the document classifier. */
    public fun documentClassifierName(documentClassifierName: String) {
        cdkBuilder.documentClassifierName(documentClassifierName)
    }

    /** @param inputDataConfig Specifies the format and location of the input data for the job. */
    public fun inputDataConfig(inputDataConfig: IResolvable) {
        cdkBuilder.inputDataConfig(inputDataConfig)
    }

    /** @param inputDataConfig Specifies the format and location of the input data for the job. */
    public fun inputDataConfig(
        inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty
    ) {
        cdkBuilder.inputDataConfig(inputDataConfig)
    }

    /**
     * @param languageCode The language of the input documents. You can specify any of the languages
     *   supported by Amazon Comprehend. All documents must be in the same language.
     */
    public fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
    }

    /**
     * @param mode Indicates the mode in which the classifier will be trained. The classifier can be
     *   trained in multi-class (single-label) mode or multi-label mode. Multi-class mode identifies
     *   a single class label for each document and multi-label mode identifies one or more class
     *   labels for each document. Multiple labels for an individual document are separated by a
     *   delimiter. The default delimiter between labels is a pipe (|).
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param modelKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained
     *   custom models. The ModelKmsKeyId can be either of the following formats:
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     *   `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     */
    public fun modelKmsKeyId(modelKmsKeyId: String) {
        cdkBuilder.modelKmsKeyId(modelKmsKeyId)
    }

    /**
     * @param modelPolicy The resource-based policy to attach to your custom document classifier
     *   model. You can use this policy to allow another AWS account to import your custom model.
     *
     * Provide your policy as a JSON body that you enter as a UTF-8 encoded string without line
     * breaks. To provide valid JSON, enclose the attribute names and values in double quotes. If
     * the JSON body is also enclosed in double quotes, then you must escape the double quotes that
     * are inside the policy:
     *
     * `"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"`
     *
     * To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes
     * to enclose the JSON names and values:
     *
     * `'{"attribute": "value", "attribute": ["value"]}'`
     */
    public fun modelPolicy(modelPolicy: String) {
        cdkBuilder.modelPolicy(modelPolicy)
    }

    /**
     * @param outputDataConfig Provides output results configuration parameters for custom
     *   classifier jobs.
     */
    public fun outputDataConfig(outputDataConfig: IResolvable) {
        cdkBuilder.outputDataConfig(outputDataConfig)
    }

    /**
     * @param outputDataConfig Provides output results configuration parameters for custom
     *   classifier jobs.
     */
    public fun outputDataConfig(
        outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty
    ) {
        cdkBuilder.outputDataConfig(outputDataConfig)
    }

    /**
     * @param tags Tags to associate with the document classifier. A tag is a key-value pair that
     *   adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales"
     *   as the key might be added to a resource to indicate its use by the sales department.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Tags to associate with the document classifier. A tag is a key-value pair that
     *   adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales"
     *   as the key might be added to a resource to indicate its use by the sales department.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param versionName The version name given to the newly created classifier. Version names can
     *   have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_)
     *   are allowed. The version name must be unique among all models with the same classifier name
     *   in the AWS account / AWS Region .
     */
    public fun versionName(versionName: String) {
        cdkBuilder.versionName(versionName)
    }

    /**
     * @param volumeKmsKeyId ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     *   uses to encrypt data on the storage volume attached to the ML compute instance(s) that
     *   process the analysis job. The VolumeKmsKeyId can be either of the following formats:
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     *   `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     */
    public fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
    }

    /**
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     *   containing the resources you are using for your custom classifier. For more information,
     *   see [Amazon VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html)
     *   .
     */
    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    /**
     * @param vpcConfig Configuration parameters for a private Virtual Private Cloud (VPC)
     *   containing the resources you are using for your custom classifier. For more information,
     *   see [Amazon VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html)
     *   .
     */
    public fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnDocumentClassifierProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
