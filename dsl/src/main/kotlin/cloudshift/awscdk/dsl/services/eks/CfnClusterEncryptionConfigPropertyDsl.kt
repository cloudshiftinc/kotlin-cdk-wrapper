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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterEncryptionConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.EncryptionConfigProperty.Builder =
        CfnCluster.EncryptionConfigProperty.builder()

    private val _resources: MutableList<String> = mutableListOf()

    public fun provider(provider: IResolvable) {
        cdkBuilder.provider(provider)
    }

    public fun provider(provider: CfnCluster.ProviderProperty) {
        cdkBuilder.provider(provider)
    }

    public fun resources(vararg resources: String) {
        _resources.addAll(listOf(*resources))
    }

    public fun resources(resources: Collection<String>) {
        _resources.addAll(resources)
    }

    public fun build(): CfnCluster.EncryptionConfigProperty {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        return cdkBuilder.build()
    }
}
