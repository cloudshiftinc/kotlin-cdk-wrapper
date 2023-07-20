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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnProject
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnProjectServiceCatalogProvisioningDetailsPropertyDsl {
    private val cdkBuilder: CfnProject.ServiceCatalogProvisioningDetailsProperty.Builder =
        CfnProject.ServiceCatalogProvisioningDetailsProperty.builder()

    private val _provisioningParameters: MutableList<Any> = mutableListOf()

    public fun pathId(pathId: String) {
        cdkBuilder.pathId(pathId)
    }

    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    public fun provisioningArtifactId(provisioningArtifactId: String) {
        cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    public fun provisioningParameters(vararg provisioningParameters: Any) {
        _provisioningParameters.addAll(listOf(*provisioningParameters))
    }

    public fun provisioningParameters(provisioningParameters: Collection<Any>) {
        _provisioningParameters.addAll(provisioningParameters)
    }

    public fun provisioningParameters(provisioningParameters: IResolvable) {
        cdkBuilder.provisioningParameters(provisioningParameters)
    }

    public fun build(): CfnProject.ServiceCatalogProvisioningDetailsProperty {
        if (_provisioningParameters.isNotEmpty()) {
            cdkBuilder.provisioningParameters(_provisioningParameters)
        }
        return cdkBuilder.build()
    }
}
