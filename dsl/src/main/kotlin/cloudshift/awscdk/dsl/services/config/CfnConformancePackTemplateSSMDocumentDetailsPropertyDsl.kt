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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.config.CfnConformancePack
import kotlin.String

@CdkDslMarker
public class CfnConformancePackTemplateSSMDocumentDetailsPropertyDsl {
    private val cdkBuilder: CfnConformancePack.TemplateSSMDocumentDetailsProperty.Builder =
        CfnConformancePack.TemplateSSMDocumentDetailsProperty.builder()

    public fun documentName(documentName: String) {
        cdkBuilder.documentName(documentName)
    }

    public fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
    }

    public fun build(): CfnConformancePack.TemplateSSMDocumentDetailsProperty = cdkBuilder.build()
}
