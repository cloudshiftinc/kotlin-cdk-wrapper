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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * Object limits;
 * Object requests;
 * ResourcesProperty resourcesProperty = ResourcesProperty.builder()
 * .limits(limits)
 * .requests(requests)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resources.html)
 */
@CdkDslMarker
public class CfnJobDefinitionResourcesPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.ResourcesProperty.Builder =
        CfnJobDefinition.ResourcesProperty.builder()

    /** @param limits the value to be set. */
    public fun limits(limits: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(limits)
        cdkBuilder.limits(builder.map)
    }

    /** @param limits the value to be set. */
    public fun limits(limits: Any) {
        cdkBuilder.limits(limits)
    }

    /** @param requests the value to be set. */
    public fun requests(requests: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(requests)
        cdkBuilder.requests(builder.map)
    }

    /** @param requests the value to be set. */
    public fun requests(requests: Any) {
        cdkBuilder.requests(requests)
    }

    public fun build(): CfnJobDefinition.ResourcesProperty = cdkBuilder.build()
}
