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

package io.cloudshiftdev.awscdkdsl.services.applicationinsights

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application CustomComponent` property type describes a custom
 * component by grouping similar standalone instances to monitor.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * CustomComponentProperty customComponentProperty = CustomComponentProperty.builder()
 * .componentName("componentName")
 * .resourceList(List.of("resourceList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-customcomponent.html)
 */
@CdkDslMarker
public class CfnApplicationCustomComponentPropertyDsl {
    private val cdkBuilder: CfnApplication.CustomComponentProperty.Builder =
        CfnApplication.CustomComponentProperty.builder()

    private val _resourceList: MutableList<String> = mutableListOf()

    /** @param componentName The name of the component. */
    public fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
    }

    /** @param resourceList The list of resource ARNs that belong to the component. */
    public fun resourceList(vararg resourceList: String) {
        _resourceList.addAll(listOf(*resourceList))
    }

    /** @param resourceList The list of resource ARNs that belong to the component. */
    public fun resourceList(resourceList: Collection<String>) {
        _resourceList.addAll(resourceList)
    }

    public fun build(): CfnApplication.CustomComponentProperty {
        if (_resourceList.isNotEmpty()) cdkBuilder.resourceList(_resourceList)
        return cdkBuilder.build()
    }
}
