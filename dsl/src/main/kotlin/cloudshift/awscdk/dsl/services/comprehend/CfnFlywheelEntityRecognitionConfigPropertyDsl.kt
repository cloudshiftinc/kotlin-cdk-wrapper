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

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnFlywheel
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFlywheelEntityRecognitionConfigPropertyDsl {
    private val cdkBuilder: CfnFlywheel.EntityRecognitionConfigProperty.Builder =
        CfnFlywheel.EntityRecognitionConfigProperty.builder()

    private val _entityTypes: MutableList<Any> = mutableListOf()

    public fun entityTypes(vararg entityTypes: Any) {
        _entityTypes.addAll(listOf(*entityTypes))
    }

    public fun entityTypes(entityTypes: Collection<Any>) {
        _entityTypes.addAll(entityTypes)
    }

    public fun entityTypes(entityTypes: IResolvable) {
        cdkBuilder.entityTypes(entityTypes)
    }

    public fun build(): CfnFlywheel.EntityRecognitionConfigProperty {
        if (_entityTypes.isNotEmpty()) cdkBuilder.entityTypes(_entityTypes)
        return cdkBuilder.build()
    }
}
