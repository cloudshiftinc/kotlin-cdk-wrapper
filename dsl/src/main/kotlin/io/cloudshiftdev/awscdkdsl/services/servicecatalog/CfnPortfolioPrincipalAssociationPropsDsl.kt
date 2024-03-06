@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.servicecatalog

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps

/**
 * Properties for defining a `CfnPortfolioPrincipalAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnPortfolioPrincipalAssociationProps cfnPortfolioPrincipalAssociationProps =
 * CfnPortfolioPrincipalAssociationProps.builder()
 * .portfolioId("portfolioId")
 * .principalArn("principalArn")
 * .principalType("principalType")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html)
 */
@CdkDslMarker
public class CfnPortfolioPrincipalAssociationPropsDsl {
    private val cdkBuilder: CfnPortfolioPrincipalAssociationProps.Builder =
        CfnPortfolioPrincipalAssociationProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /** @param portfolioId The portfolio identifier. */
    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    /** @param principalArn The ARN of the principal ( IAM user, role, or group). */
    public fun principalArn(principalArn: String) {
        cdkBuilder.principalArn(principalArn)
    }

    /**
     * @param principalType The principal type. The supported values are `IAM` and `IAM_PATTERN` .
     */
    public fun principalType(principalType: String) {
        cdkBuilder.principalType(principalType)
    }

    public fun build(): CfnPortfolioPrincipalAssociationProps = cdkBuilder.build()
}
