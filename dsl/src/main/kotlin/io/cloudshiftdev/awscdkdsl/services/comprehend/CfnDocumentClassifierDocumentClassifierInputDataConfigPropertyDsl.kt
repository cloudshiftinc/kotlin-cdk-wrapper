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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier

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
@CdkDslMarker
public class CfnDocumentClassifierDocumentClassifierInputDataConfigPropertyDsl {
    private val cdkBuilder:
        CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.Builder =
        CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.builder()

    private val _augmentedManifests: MutableList<Any> = mutableListOf()

    /**
     * @param augmentedManifests A list of augmented manifest files that provide training data for
     *   your custom model. An augmented manifest file is a labeled dataset that is produced by
     *   Amazon SageMaker Ground Truth.
     *
     * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
     */
    public fun augmentedManifests(vararg augmentedManifests: Any) {
        _augmentedManifests.addAll(listOf(*augmentedManifests))
    }

    /**
     * @param augmentedManifests A list of augmented manifest files that provide training data for
     *   your custom model. An augmented manifest file is a labeled dataset that is produced by
     *   Amazon SageMaker Ground Truth.
     *
     * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
     */
    public fun augmentedManifests(augmentedManifests: Collection<Any>) {
        _augmentedManifests.addAll(augmentedManifests)
    }

    /**
     * @param augmentedManifests A list of augmented manifest files that provide training data for
     *   your custom model. An augmented manifest file is a labeled dataset that is produced by
     *   Amazon SageMaker Ground Truth.
     *
     * This parameter is required if you set `DataFormat` to `AUGMENTED_MANIFEST` .
     */
    public fun augmentedManifests(augmentedManifests: IResolvable) {
        cdkBuilder.augmentedManifests(augmentedManifests)
    }

    /**
     * @param dataFormat The format of your training data:.
     * * `COMPREHEND_CSV` : A two-column CSV file, where labels are provided in the first column,
     *   and documents are provided in the second. If you use this value, you must provide the
     *   `S3Uri` parameter in your request.
     * * `AUGMENTED_MANIFEST` : A labeled dataset that is produced by Amazon SageMaker Ground Truth.
     *   This file is in JSON lines format. Each line is a complete JSON object that contains a
     *   training document and its associated labels.
     *
     * If you use this value, you must provide the `AugmentedManifests` parameter in your request.
     *
     * If you don't specify a value, Amazon Comprehend uses `COMPREHEND_CSV` as the default.
     */
    public fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
    }

    /** @param documentReaderConfig the value to be set. */
    public fun documentReaderConfig(documentReaderConfig: IResolvable) {
        cdkBuilder.documentReaderConfig(documentReaderConfig)
    }

    /** @param documentReaderConfig the value to be set. */
    public fun documentReaderConfig(
        documentReaderConfig: CfnDocumentClassifier.DocumentReaderConfigProperty
    ) {
        cdkBuilder.documentReaderConfig(documentReaderConfig)
    }

    /**
     * @param documentType The type of input documents for training the model. Provide plain-text
     *   documents to create a plain-text model, and provide semi-structured documents to create a
     *   native document model.
     */
    public fun documentType(documentType: String) {
        cdkBuilder.documentType(documentType)
    }

    /**
     * @param documents The S3 location of the training documents. This parameter is required in a
     *   request to create a native document model.
     */
    public fun documents(documents: IResolvable) {
        cdkBuilder.documents(documents)
    }

    /**
     * @param documents The S3 location of the training documents. This parameter is required in a
     *   request to create a native document model.
     */
    public fun documents(documents: CfnDocumentClassifier.DocumentClassifierDocumentsProperty) {
        cdkBuilder.documents(documents)
    }

    /**
     * @param labelDelimiter Indicates the delimiter used to separate each label for training a
     *   multi-label classifier. The default delimiter between labels is a pipe (|). You can use a
     *   different character as a delimiter (if it's an allowed character) by specifying it under
     *   Delimiter for labels. If the training documents use a delimiter other than the default or
     *   the delimiter you specify, the labels on that line will be combined to make a single unique
     *   label, such as LABELLABELLABEL.
     */
    public fun labelDelimiter(labelDelimiter: String) {
        cdkBuilder.labelDelimiter(labelDelimiter)
    }

    /**
     * @param s3Uri The Amazon S3 URI for the input data. The S3 bucket must be in the same Region
     *   as the API endpoint that you are calling. The URI can point to a single input file or it
     *   can provide the prefix for a collection of input files.
     *
     * For example, if you use the URI `S3://bucketName/prefix` , if the prefix is a single file,
     * Amazon Comprehend uses that file as input. If more than one file begins with the prefix,
     * Amazon Comprehend uses all of them as input.
     *
     * This parameter is required if you set `DataFormat` to `COMPREHEND_CSV` .
     */
    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    /**
     * @param testS3Uri This specifies the Amazon S3 location that contains the test annotations for
     *   the document classifier. The URI must be in the same AWS Region as the API endpoint that
     *   you are calling.
     */
    public fun testS3Uri(testS3Uri: String) {
        cdkBuilder.testS3Uri(testS3Uri)
    }

    public fun build(): CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty {
        if (_augmentedManifests.isNotEmpty()) cdkBuilder.augmentedManifests(_augmentedManifests)
        return cdkBuilder.build()
    }
}
