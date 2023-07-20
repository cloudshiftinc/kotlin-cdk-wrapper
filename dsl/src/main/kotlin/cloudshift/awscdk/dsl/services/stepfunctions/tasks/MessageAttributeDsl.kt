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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class MessageAttributeDsl {
    private val cdkBuilder: MessageAttribute.Builder = MessageAttribute.builder()

    public fun dataType(dataType: MessageAttributeDataType) {
        cdkBuilder.dataType(dataType)
    }

    public fun `value`(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.`value`(builder.map)
    }

    public fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): MessageAttribute = cdkBuilder.build()
}
