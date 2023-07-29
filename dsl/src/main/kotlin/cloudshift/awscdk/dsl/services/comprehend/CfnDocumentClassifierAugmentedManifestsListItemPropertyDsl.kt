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

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier

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
@CdkDslMarker
public class CfnDocumentClassifierAugmentedManifestsListItemPropertyDsl {
    private val cdkBuilder: CfnDocumentClassifier.AugmentedManifestsListItemProperty.Builder =
        CfnDocumentClassifier.AugmentedManifestsListItemProperty.builder()

    private val _attributeNames: MutableList<String> = mutableListOf()

    /**
     * @param attributeNames The JSON attribute that contains the annotations for your training
     *   documents. The number of attribute names that you specify depends on whether your augmented
     *   manifest file is the output of a single labeling job or a chained labeling job.
     *
     * If your file is the output of a single labeling job, specify the LabelAttributeName key that
     * was used when the job was created in Ground Truth.
     *
     * If your file is the output of a chained labeling job, specify the LabelAttributeName key for
     * one or more jobs in the chain. Each LabelAttributeName key provides the annotations from an
     * individual job.
     */
    public fun attributeNames(vararg attributeNames: String) {
        _attributeNames.addAll(listOf(*attributeNames))
    }

    /**
     * @param attributeNames The JSON attribute that contains the annotations for your training
     *   documents. The number of attribute names that you specify depends on whether your augmented
     *   manifest file is the output of a single labeling job or a chained labeling job.
     *
     * If your file is the output of a single labeling job, specify the LabelAttributeName key that
     * was used when the job was created in Ground Truth.
     *
     * If your file is the output of a chained labeling job, specify the LabelAttributeName key for
     * one or more jobs in the chain. Each LabelAttributeName key provides the annotations from an
     * individual job.
     */
    public fun attributeNames(attributeNames: Collection<String>) {
        _attributeNames.addAll(attributeNames)
    }

    /** @param s3Uri The Amazon S3 location of the augmented manifest file. */
    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    /**
     * @param split The purpose of the data you've provided in the augmented manifest. You can
     *   either train or test this data. If you don't specify, the default is train.
     *
     * TRAIN - all of the documents in the manifest will be used for training. If no test documents
     * are provided, Amazon Comprehend will automatically reserve a portion of the training
     * documents for testing.
     *
     * TEST - all of the documents in the manifest will be used for testing.
     */
    public fun split(split: String) {
        cdkBuilder.split(split)
    }

    public fun build(): CfnDocumentClassifier.AugmentedManifestsListItemProperty {
        if (_attributeNames.isNotEmpty()) cdkBuilder.attributeNames(_attributeNames)
        return cdkBuilder.build()
    }
}
