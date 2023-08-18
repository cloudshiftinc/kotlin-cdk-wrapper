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

package io.cloudshiftdev.awscdkdsl.services.rekognition

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

/**
 * The input parameters used to recognize faces in a streaming video analyzed by a Amazon
 * Rekognition stream processor.
 *
 * `FaceSearchSettings` is a request parameter for
 * [CreateStreamProcessor](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor)
 * . For more information, see
 * [FaceSearchSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_FaceSearchSettings)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * FaceSearchSettingsProperty faceSearchSettingsProperty = FaceSearchSettingsProperty.builder()
 * .collectionId("collectionId")
 * // the properties below are optional
 * .faceMatchThreshold(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-facesearchsettings.html)
 */
@CdkDslMarker
public class CfnStreamProcessorFaceSearchSettingsPropertyDsl {
    private val cdkBuilder: CfnStreamProcessor.FaceSearchSettingsProperty.Builder =
        CfnStreamProcessor.FaceSearchSettingsProperty.builder()

    /**
     * @param collectionId The ID of a collection that contains faces that you want to search for.
     */
    public fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
    }

    /**
     * @param faceMatchThreshold Minimum face match confidence score that must be met to return a
     *   result for a recognized face. The default is 80. 0 is the lowest confidence. 100 is the
     *   highest confidence. Values between 0 and 100 are accepted, and values lower than 80 are set
     *   to 80.
     */
    public fun faceMatchThreshold(faceMatchThreshold: Number) {
        cdkBuilder.faceMatchThreshold(faceMatchThreshold)
    }

    public fun build(): CfnStreamProcessor.FaceSearchSettingsProperty = cdkBuilder.build()
}
