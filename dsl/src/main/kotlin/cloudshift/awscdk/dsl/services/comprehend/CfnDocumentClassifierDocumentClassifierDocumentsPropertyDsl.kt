@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import kotlin.String

@CdkDslMarker
public class CfnDocumentClassifierDocumentClassifierDocumentsPropertyDsl {
    private val cdkBuilder: CfnDocumentClassifier.DocumentClassifierDocumentsProperty.Builder =
        CfnDocumentClassifier.DocumentClassifierDocumentsProperty.builder()

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun testS3Uri(testS3Uri: String) {
        cdkBuilder.testS3Uri(testS3Uri)
    }

    public fun build(): CfnDocumentClassifier.DocumentClassifierDocumentsProperty = cdkBuilder.build()
}
