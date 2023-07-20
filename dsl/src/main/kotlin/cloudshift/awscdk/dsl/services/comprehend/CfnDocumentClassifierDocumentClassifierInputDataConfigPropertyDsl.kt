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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDocumentClassifierDocumentClassifierInputDataConfigPropertyDsl {
    private val cdkBuilder: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.Builder =
        CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.builder()

    private val _augmentedManifests: MutableList<Any> = mutableListOf()

    public fun augmentedManifests(vararg augmentedManifests: Any) {
        _augmentedManifests.addAll(listOf(*augmentedManifests))
    }

    public fun augmentedManifests(augmentedManifests: Collection<Any>) {
        _augmentedManifests.addAll(augmentedManifests)
    }

    public fun augmentedManifests(augmentedManifests: IResolvable) {
        cdkBuilder.augmentedManifests(augmentedManifests)
    }

    public fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
    }

    public fun documentReaderConfig(documentReaderConfig: IResolvable) {
        cdkBuilder.documentReaderConfig(documentReaderConfig)
    }

    public fun documentReaderConfig(documentReaderConfig: CfnDocumentClassifier.DocumentReaderConfigProperty) {
        cdkBuilder.documentReaderConfig(documentReaderConfig)
    }

    public fun documentType(documentType: String) {
        cdkBuilder.documentType(documentType)
    }

    public fun documents(documents: IResolvable) {
        cdkBuilder.documents(documents)
    }

    public fun documents(documents: CfnDocumentClassifier.DocumentClassifierDocumentsProperty) {
        cdkBuilder.documents(documents)
    }

    public fun labelDelimiter(labelDelimiter: String) {
        cdkBuilder.labelDelimiter(labelDelimiter)
    }

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun testS3Uri(testS3Uri: String) {
        cdkBuilder.testS3Uri(testS3Uri)
    }

    public fun build(): CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty {
        if (_augmentedManifests.isNotEmpty()) cdkBuilder.augmentedManifests(_augmentedManifests)
        return cdkBuilder.build()
    }
}
