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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex
import kotlin.String

@CdkDslMarker
public class CfnIndexDocumentMetadataConfigurationPropertyDsl {
    private val cdkBuilder: CfnIndex.DocumentMetadataConfigurationProperty.Builder =
        CfnIndex.DocumentMetadataConfigurationProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun relevance(relevance: IResolvable) {
        cdkBuilder.relevance(relevance)
    }

    public fun relevance(relevance: CfnIndex.RelevanceProperty) {
        cdkBuilder.relevance(relevance)
    }

    public fun search(search: IResolvable) {
        cdkBuilder.search(search)
    }

    public fun search(search: CfnIndex.SearchProperty) {
        cdkBuilder.search(search)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnIndex.DocumentMetadataConfigurationProperty = cdkBuilder.build()
}
