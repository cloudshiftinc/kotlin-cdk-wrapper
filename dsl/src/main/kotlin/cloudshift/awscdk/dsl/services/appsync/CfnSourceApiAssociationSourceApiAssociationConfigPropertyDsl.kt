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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.CfnSourceApiAssociation
import kotlin.String

@CdkDslMarker
public class CfnSourceApiAssociationSourceApiAssociationConfigPropertyDsl {
    private val cdkBuilder: CfnSourceApiAssociation.SourceApiAssociationConfigProperty.Builder =
        CfnSourceApiAssociation.SourceApiAssociationConfigProperty.builder()

    public fun mergeType(mergeType: String) {
        cdkBuilder.mergeType(mergeType)
    }

    public fun build(): CfnSourceApiAssociation.SourceApiAssociationConfigProperty =
        cdkBuilder.build()
}
