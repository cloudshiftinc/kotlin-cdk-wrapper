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
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnDataSourceDocumentAttributeTargetPropertyDsl {
    private val cdkBuilder: CfnDataSource.DocumentAttributeTargetProperty.Builder =
        CfnDataSource.DocumentAttributeTargetProperty.builder()

    public fun targetDocumentAttributeKey(targetDocumentAttributeKey: String) {
        cdkBuilder.targetDocumentAttributeKey(targetDocumentAttributeKey)
    }

    public fun targetDocumentAttributeValue(targetDocumentAttributeValue: IResolvable) {
        cdkBuilder.targetDocumentAttributeValue(targetDocumentAttributeValue)
    }

    public fun targetDocumentAttributeValue(targetDocumentAttributeValue: CfnDataSource.DocumentAttributeValueProperty) {
        cdkBuilder.targetDocumentAttributeValue(targetDocumentAttributeValue)
    }

    public fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: Boolean) {
        cdkBuilder.targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion)
    }

    public fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: IResolvable) {
        cdkBuilder.targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion)
    }

    public fun build(): CfnDataSource.DocumentAttributeTargetProperty = cdkBuilder.build()
}
