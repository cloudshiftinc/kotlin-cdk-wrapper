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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnProject

/**
 * Details of a provisioned service catalog product.
 *
 * For information about service catalog, see
 * [What is AWS Service Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ServiceCatalogProvisionedProductDetailsProperty serviceCatalogProvisionedProductDetailsProperty =
 * ServiceCatalogProvisionedProductDetailsProperty.builder()
 * .provisionedProductId("provisionedProductId")
 * .provisionedProductStatusMessage("provisionedProductStatusMessage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisionedproductdetails.html)
 */
@CdkDslMarker
public class CfnProjectServiceCatalogProvisionedProductDetailsPropertyDsl {
    private val cdkBuilder: CfnProject.ServiceCatalogProvisionedProductDetailsProperty.Builder =
        CfnProject.ServiceCatalogProvisionedProductDetailsProperty.builder()

    /** @param provisionedProductId The ID of the provisioned product. */
    public fun provisionedProductId(provisionedProductId: String) {
        cdkBuilder.provisionedProductId(provisionedProductId)
    }

    /**
     * @param provisionedProductStatusMessage The current status of the product.
     * * `AVAILABLE` - Stable state, ready to perform any operation. The most recent operation
     *   succeeded and completed.
     * * `UNDER_CHANGE` - Transitive state. Operations performed might not have valid results. Wait
     *   for an AVAILABLE status before performing operations.
     * * `TAINTED` - Stable state, ready to perform any operation. The stack has completed the
     *   requested operation but is not exactly what was requested. For example, a request to update
     *   to a new version failed and the stack rolled back to the current version.
     * * `ERROR` - An unexpected error occurred. The provisioned product exists but the stack is not
     *   running. For example, CloudFormation received a parameter value that was not valid and
     *   could not launch the stack.
     * * `PLAN_IN_PROGRESS` - Transitive state. The plan operations were performed to provision a
     *   new product, but resources have not yet been created. After reviewing the list of resources
     *   to be created, execute the plan. Wait for an AVAILABLE status before performing operations.
     */
    public fun provisionedProductStatusMessage(provisionedProductStatusMessage: String) {
        cdkBuilder.provisionedProductStatusMessage(provisionedProductStatusMessage)
    }

    public fun build(): CfnProject.ServiceCatalogProvisionedProductDetailsProperty =
        cdkBuilder.build()
}
