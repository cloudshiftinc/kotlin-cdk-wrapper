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

package io.cloudshiftdev.awscdkdsl.services.emrserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * The maximum allowed cumulative resources for an application.
 *
 * No new resources will be created once the limit is hit.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * MaximumAllowedResourcesProperty maximumAllowedResourcesProperty =
 * MaximumAllowedResourcesProperty.builder()
 * .cpu("cpu")
 * .memory("memory")
 * // the properties below are optional
 * .disk("disk")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-maximumallowedresources.html)
 */
@CdkDslMarker
public class CfnApplicationMaximumAllowedResourcesPropertyDsl {
    private val cdkBuilder: CfnApplication.MaximumAllowedResourcesProperty.Builder =
        CfnApplication.MaximumAllowedResourcesProperty.builder()

    /** @param cpu The maximum allowed CPU for an application. */
    public fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
    }

    /** @param disk The maximum allowed disk for an application. */
    public fun disk(disk: String) {
        cdkBuilder.disk(disk)
    }

    /** @param memory The maximum allowed resources for an application. */
    public fun memory(memory: String) {
        cdkBuilder.memory(memory)
    }

    public fun build(): CfnApplication.MaximumAllowedResourcesProperty = cdkBuilder.build()
}
