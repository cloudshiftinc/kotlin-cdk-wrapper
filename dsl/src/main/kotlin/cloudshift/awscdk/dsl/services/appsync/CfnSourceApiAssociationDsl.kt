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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnSourceApiAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSourceApiAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSourceApiAssociation.Builder =
        CfnSourceApiAssociation.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun mergedApiIdentifier(mergedApiIdentifier: String) {
        cdkBuilder.mergedApiIdentifier(mergedApiIdentifier)
    }

    public fun sourceApiAssociationConfig(sourceApiAssociationConfig: IResolvable) {
        cdkBuilder.sourceApiAssociationConfig(sourceApiAssociationConfig)
    }

    public fun sourceApiAssociationConfig(sourceApiAssociationConfig: CfnSourceApiAssociation.SourceApiAssociationConfigProperty) {
        cdkBuilder.sourceApiAssociationConfig(sourceApiAssociationConfig)
    }

    public fun sourceApiIdentifier(sourceApiIdentifier: String) {
        cdkBuilder.sourceApiIdentifier(sourceApiIdentifier)
    }

    public fun build(): CfnSourceApiAssociation = cdkBuilder.build()
}
