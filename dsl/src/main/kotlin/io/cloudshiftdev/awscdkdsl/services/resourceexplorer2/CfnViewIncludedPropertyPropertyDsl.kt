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

package io.cloudshiftdev.awscdkdsl.services.resourceexplorer2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.resourceexplorer2.CfnView

/**
 * Information about an additional property that describes a resource, that you can optionally
 * include in a view.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourceexplorer2.*;
 * IncludedPropertyProperty includedPropertyProperty = IncludedPropertyProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-includedproperty.html)
 */
@CdkDslMarker
public class CfnViewIncludedPropertyPropertyDsl {
    private val cdkBuilder: CfnView.IncludedPropertyProperty.Builder =
        CfnView.IncludedPropertyProperty.builder()

    /** @param name The name of the property that is included in this view. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnView.IncludedPropertyProperty = cdkBuilder.build()
}
