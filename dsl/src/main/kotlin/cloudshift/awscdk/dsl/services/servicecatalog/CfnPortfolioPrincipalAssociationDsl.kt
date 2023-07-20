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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnPortfolioPrincipalAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPortfolioPrincipalAssociation.Builder =
        CfnPortfolioPrincipalAssociation.Builder.create(scope, id)

    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    public fun principalArn(principalArn: String) {
        cdkBuilder.principalArn(principalArn)
    }

    public fun principalType(principalType: String) {
        cdkBuilder.principalType(principalType)
    }

    public fun build(): CfnPortfolioPrincipalAssociation = cdkBuilder.build()
}
