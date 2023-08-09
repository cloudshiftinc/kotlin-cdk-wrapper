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

package cloudshift.awscdk.dsl.services.comprehend

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps
import software.amazon.awscdk.services.comprehend.CfnFlywheel
import software.amazon.awscdk.services.comprehend.CfnFlywheelProps
import software.constructs.Construct

public object comprehend {
    /**
     * This resource creates and trains a document classifier to categorize documents.
     *
     * You provide a set of training documents that are labeled with the categories that you want to
     * identify. After the classifier is trained you can use it to categorize a set of labeled
     * documents into the categories. For more information, see
     * [Document Classification](https://docs.aws.amazon.com/comprehend/latest/dg/how-document-classification.html)
     * in the Comprehend Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
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
    public inline fun cfnDocumentClassifier(
        scope: Construct,
        id: String,
        block: CfnDocumentClassifierDsl.() -> Unit = {},
    ): CfnDocumentClassifier {
        val builder = CfnDocumentClassifierDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An augmented manifest file that provides training data for your custom model.
     *
     * An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
     * Truth.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
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
    public inline fun cfnDocumentClassifierAugmentedManifestsListItemProperty(
        block: CfnDocumentClassifierAugmentedManifestsListItemPropertyDsl.() -> Unit = {}
    ): CfnDocumentClassifier.AugmentedManifestsListItemProperty {
        val builder = CfnDocumentClassifierAugmentedManifestsListItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The location of the training documents.
     *
     * This parameter is required in a request to create a semi-structured document classification
     * model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
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
    public inline fun cfnDocumentClassifierDocumentClassifierDocumentsProperty(
        block: CfnDocumentClassifierDocumentClassifierDocumentsPropertyDsl.() -> Unit = {}
    ): CfnDocumentClassifier.DocumentClassifierDocumentsProperty {
        val builder = CfnDocumentClassifierDocumentClassifierDocumentsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The input properties for training a document classifier.
     *
     * For more information on how the input file is formatted, see
     * [Preparing training data](https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html)
     * in the Comprehend Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
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
    public inline fun cfnDocumentClassifierDocumentClassifierInputDataConfigProperty(
        block: CfnDocumentClassifierDocumentClassifierInputDataConfigPropertyDsl.() -> Unit = {}
    ): CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty {
        val builder = CfnDocumentClassifierDocumentClassifierInputDataConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provide the location for output data from a custom classifier job.
     *
     * This field is mandatory if you are training a native document model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
     * DocumentClassifierOutputDataConfigProperty documentClassifierOutputDataConfigProperty =
     * DocumentClassifierOutputDataConfigProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-documentclassifieroutputdataconfig.html)
     */
    public inline fun cfnDocumentClassifierDocumentClassifierOutputDataConfigProperty(
        block: CfnDocumentClassifierDocumentClassifierOutputDataConfigPropertyDsl.() -> Unit = {}
    ): CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty {
        val builder = CfnDocumentClassifierDocumentClassifierOutputDataConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides configuration parameters to override the default actions for extracting text from
     * PDF documents and image files.
     *
     * By default, Amazon Comprehend performs the following actions to extract text from files,
     * based on the input file type:
     * * *Word files* - Amazon Comprehend parser extracts the text.
     * * *Digital PDF files* - Amazon Comprehend parser extracts the text.
     * * *Image files and scanned PDF files* - Amazon Comprehend uses the Amazon Textract
     *   `DetectDocumentText` API to extract the text.
     *
     * `DocumentReaderConfig` does not apply to plain text files or Word files.
     *
     * For image files and PDF documents, you can override these default actions using the fields
     * listed below. For more information, see
     * [Setting text extraction options](https://docs.aws.amazon.com/comprehend/latest/dg/idp-set-textract-options.html)
     * in the Comprehend Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
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
    public inline fun cfnDocumentClassifierDocumentReaderConfigProperty(
        block: CfnDocumentClassifierDocumentReaderConfigPropertyDsl.() -> Unit = {}
    ): CfnDocumentClassifier.DocumentReaderConfigProperty {
        val builder = CfnDocumentClassifierDocumentReaderConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnDocumentClassifierProps(
        block: CfnDocumentClassifierPropsDsl.() -> Unit = {}
    ): CfnDocumentClassifierProps {
        val builder = CfnDocumentClassifierPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the
     * resources you are using for the job.
     *
     * For more information, see
     * [Amazon VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-documentclassifier-vpcconfig.html)
     */
    public inline fun cfnDocumentClassifierVpcConfigProperty(
        block: CfnDocumentClassifierVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnDocumentClassifier.VpcConfigProperty {
        val builder = CfnDocumentClassifierVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A flywheel is an AWS resource that orchestrates the ongoing training of a model for custom
     * classification or custom entity recognition.
     *
     * You can create a flywheel to start with an existing trained model, or Comprehend can create
     * and train a new model.
     *
     * When you create the flywheel, Comprehend creates a data lake in your account. The data lake
     * holds the training data and test data for all versions of the model.
     *
     * To use a flywheel with an existing trained model, you specify the active model version.
     * Comprehend copies the model's training data and test data into the flywheel's data lake.
     *
     * To use the flywheel with a new model, you need to provide a dataset for training data (and
     * optional test data) when you create the flywheel.
     *
     * For more information about flywheels, see
     * [Flywheel overview](https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html) in
     * the *Amazon Comprehend Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
     * CfnFlywheel cfnFlywheel = CfnFlywheel.Builder.create(this, "MyCfnFlywheel")
     * .dataAccessRoleArn("dataAccessRoleArn")
     * .dataLakeS3Uri("dataLakeS3Uri")
     * .flywheelName("flywheelName")
     * // the properties below are optional
     * .activeModelArn("activeModelArn")
     * .dataSecurityConfig(DataSecurityConfigProperty.builder()
     * .dataLakeKmsKeyId("dataLakeKmsKeyId")
     * .modelKmsKeyId("modelKmsKeyId")
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .modelType("modelType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskConfig(TaskConfigProperty.builder()
     * .languageCode("languageCode")
     * // the properties below are optional
     * .documentClassificationConfig(DocumentClassificationConfigProperty.builder()
     * .mode("mode")
     * // the properties below are optional
     * .labels(List.of("labels"))
     * .build())
     * .entityRecognitionConfig(EntityRecognitionConfigProperty.builder()
     * .entityTypes(List.of(EntityTypesListItemProperty.builder()
     * .type("type")
     * .build()))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html)
     */
    public inline fun cfnFlywheel(
        scope: Construct,
        id: String,
        block: CfnFlywheelDsl.() -> Unit = {},
    ): CfnFlywheel {
        val builder = CfnFlywheelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Data security configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
     * DataSecurityConfigProperty dataSecurityConfigProperty = DataSecurityConfigProperty.builder()
     * .dataLakeKmsKeyId("dataLakeKmsKeyId")
     * .modelKmsKeyId("modelKmsKeyId")
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html)
     */
    public inline fun cfnFlywheelDataSecurityConfigProperty(
        block: CfnFlywheelDataSecurityConfigPropertyDsl.() -> Unit = {}
    ): CfnFlywheel.DataSecurityConfigProperty {
        val builder = CfnFlywheelDataSecurityConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration required for a document classification model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
     * DocumentClassificationConfigProperty documentClassificationConfigProperty =
     * DocumentClassificationConfigProperty.builder()
     * .mode("mode")
     * // the properties below are optional
     * .labels(List.of("labels"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-documentclassificationconfig.html)
     */
    public inline fun cfnFlywheelDocumentClassificationConfigProperty(
        block: CfnFlywheelDocumentClassificationConfigPropertyDsl.() -> Unit = {}
    ): CfnFlywheel.DocumentClassificationConfigProperty {
        val builder = CfnFlywheelDocumentClassificationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration required for an entity recognition model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
     * EntityRecognitionConfigProperty entityRecognitionConfigProperty =
     * EntityRecognitionConfigProperty.builder()
     * .entityTypes(List.of(EntityTypesListItemProperty.builder()
     * .type("type")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-entityrecognitionconfig.html)
     */
    public inline fun cfnFlywheelEntityRecognitionConfigProperty(
        block: CfnFlywheelEntityRecognitionConfigPropertyDsl.() -> Unit = {}
    ): CfnFlywheel.EntityRecognitionConfigProperty {
        val builder = CfnFlywheelEntityRecognitionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An entity type within a labeled training dataset that Amazon Comprehend uses to train a
     * custom entity recognizer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
     * EntityTypesListItemProperty entityTypesListItemProperty = EntityTypesListItemProperty.builder()
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-entitytypeslistitem.html)
     */
    public inline fun cfnFlywheelEntityTypesListItemProperty(
        block: CfnFlywheelEntityTypesListItemPropertyDsl.() -> Unit = {}
    ): CfnFlywheel.EntityTypesListItemProperty {
        val builder = CfnFlywheelEntityTypesListItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFlywheel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
     * CfnFlywheelProps cfnFlywheelProps = CfnFlywheelProps.builder()
     * .dataAccessRoleArn("dataAccessRoleArn")
     * .dataLakeS3Uri("dataLakeS3Uri")
     * .flywheelName("flywheelName")
     * // the properties below are optional
     * .activeModelArn("activeModelArn")
     * .dataSecurityConfig(DataSecurityConfigProperty.builder()
     * .dataLakeKmsKeyId("dataLakeKmsKeyId")
     * .modelKmsKeyId("modelKmsKeyId")
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .modelType("modelType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskConfig(TaskConfigProperty.builder()
     * .languageCode("languageCode")
     * // the properties below are optional
     * .documentClassificationConfig(DocumentClassificationConfigProperty.builder()
     * .mode("mode")
     * // the properties below are optional
     * .labels(List.of("labels"))
     * .build())
     * .entityRecognitionConfig(EntityRecognitionConfigProperty.builder()
     * .entityTypes(List.of(EntityTypesListItemProperty.builder()
     * .type("type")
     * .build()))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html)
     */
    public inline fun cfnFlywheelProps(
        block: CfnFlywheelPropsDsl.() -> Unit = {}
    ): CfnFlywheelProps {
        val builder = CfnFlywheelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration about the model associated with a flywheel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
     * TaskConfigProperty taskConfigProperty = TaskConfigProperty.builder()
     * .languageCode("languageCode")
     * // the properties below are optional
     * .documentClassificationConfig(DocumentClassificationConfigProperty.builder()
     * .mode("mode")
     * // the properties below are optional
     * .labels(List.of("labels"))
     * .build())
     * .entityRecognitionConfig(EntityRecognitionConfigProperty.builder()
     * .entityTypes(List.of(EntityTypesListItemProperty.builder()
     * .type("type")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-taskconfig.html)
     */
    public inline fun cfnFlywheelTaskConfigProperty(
        block: CfnFlywheelTaskConfigPropertyDsl.() -> Unit = {}
    ): CfnFlywheel.TaskConfigProperty {
        val builder = CfnFlywheelTaskConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the
     * resources you are using for the job.
     *
     * For more information, see
     * [Amazon VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.comprehend.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-vpcconfig.html)
     */
    public inline fun cfnFlywheelVpcConfigProperty(
        block: CfnFlywheelVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnFlywheel.VpcConfigProperty {
        val builder = CfnFlywheelVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
