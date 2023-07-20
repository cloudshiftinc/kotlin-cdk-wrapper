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
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelCardInferenceSpecificationPropertyDsl {
    private val cdkBuilder: CfnModelCard.InferenceSpecificationProperty.Builder =
        CfnModelCard.InferenceSpecificationProperty.builder()

    private val _containers: MutableList<Any> = mutableListOf()

    public fun containers(vararg containers: Any) {
        _containers.addAll(listOf(*containers))
    }

    public fun containers(containers: Collection<Any>) {
        _containers.addAll(containers)
    }

    public fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers)
    }

    public fun build(): CfnModelCard.InferenceSpecificationProperty {
        if (_containers.isNotEmpty()) cdkBuilder.containers(_containers)
        return cdkBuilder.build()
    }
}
