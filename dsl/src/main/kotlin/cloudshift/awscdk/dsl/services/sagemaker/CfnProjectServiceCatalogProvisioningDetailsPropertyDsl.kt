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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnProject

/**
 * Details that you specify to provision a service catalog product.
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
 * ServiceCatalogProvisioningDetailsProperty serviceCatalogProvisioningDetailsProperty =
 * ServiceCatalogProvisioningDetailsProperty.builder()
 * .productId("productId")
 * // the properties below are optional
 * .pathId("pathId")
 * .provisioningArtifactId("provisioningArtifactId")
 * .provisioningParameters(List.of(ProvisioningParameterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html)
 */
@CdkDslMarker
public class CfnProjectServiceCatalogProvisioningDetailsPropertyDsl {
    private val cdkBuilder: CfnProject.ServiceCatalogProvisioningDetailsProperty.Builder =
        CfnProject.ServiceCatalogProvisioningDetailsProperty.builder()

    private val _provisioningParameters: MutableList<Any> = mutableListOf()

    /**
     * @param pathId The path identifier of the product. This value is optional if the product has a
     *   default path, and required if the product has more than one path.
     */
    public fun pathId(pathId: String) {
        cdkBuilder.pathId(pathId)
    }

    /** @param productId The ID of the product to provision. */
    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    /** @param provisioningArtifactId The ID of the provisioning artifact. */
    public fun provisioningArtifactId(provisioningArtifactId: String) {
        cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    /**
     * @param provisioningParameters A list of key value pairs that you specify when you provision a
     *   product.
     */
    public fun provisioningParameters(vararg provisioningParameters: Any) {
        _provisioningParameters.addAll(listOf(*provisioningParameters))
    }

    /**
     * @param provisioningParameters A list of key value pairs that you specify when you provision a
     *   product.
     */
    public fun provisioningParameters(provisioningParameters: Collection<Any>) {
        _provisioningParameters.addAll(provisioningParameters)
    }

    /**
     * @param provisioningParameters A list of key value pairs that you specify when you provision a
     *   product.
     */
    public fun provisioningParameters(provisioningParameters: IResolvable) {
        cdkBuilder.provisioningParameters(provisioningParameters)
    }

    public fun build(): CfnProject.ServiceCatalogProvisioningDetailsProperty {
        if (_provisioningParameters.isNotEmpty())
            cdkBuilder.provisioningParameters(_provisioningParameters)
        return cdkBuilder.build()
    }
}
