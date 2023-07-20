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

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.SamlMetadataDocument
import software.amazon.awscdk.services.iam.SamlProviderProps
import kotlin.String

@CdkDslMarker
public class SamlProviderPropsDsl {
    private val cdkBuilder: SamlProviderProps.Builder = SamlProviderProps.builder()

    public fun metadataDocument(metadataDocument: SamlMetadataDocument) {
        cdkBuilder.metadataDocument(metadataDocument)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): SamlProviderProps = cdkBuilder.build()
}
