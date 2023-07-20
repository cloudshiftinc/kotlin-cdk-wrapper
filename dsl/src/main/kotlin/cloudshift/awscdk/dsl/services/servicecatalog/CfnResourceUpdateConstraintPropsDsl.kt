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
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps
import kotlin.String

@CdkDslMarker
public class CfnResourceUpdateConstraintPropsDsl {
    private val cdkBuilder: CfnResourceUpdateConstraintProps.Builder =
        CfnResourceUpdateConstraintProps.builder()

    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    public fun tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct: String) {
        cdkBuilder.tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct)
    }

    public fun build(): CfnResourceUpdateConstraintProps = cdkBuilder.build()
}
