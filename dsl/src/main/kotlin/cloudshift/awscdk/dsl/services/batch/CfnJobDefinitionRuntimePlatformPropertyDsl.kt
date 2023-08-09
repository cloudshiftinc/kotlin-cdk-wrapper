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
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * RuntimePlatformProperty runtimePlatformProperty = RuntimePlatformProperty.builder()
 * .cpuArchitecture("cpuArchitecture")
 * .operatingSystemFamily("operatingSystemFamily")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-runtimeplatform.html)
 */
@CdkDslMarker
public class CfnJobDefinitionRuntimePlatformPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.RuntimePlatformProperty.Builder =
        CfnJobDefinition.RuntimePlatformProperty.builder()

    /** @param cpuArchitecture the value to be set. */
    public fun cpuArchitecture(cpuArchitecture: String) {
        cdkBuilder.cpuArchitecture(cpuArchitecture)
    }

    /** @param operatingSystemFamily the value to be set. */
    public fun operatingSystemFamily(operatingSystemFamily: String) {
        cdkBuilder.operatingSystemFamily(operatingSystemFamily)
    }

    public fun build(): CfnJobDefinition.RuntimePlatformProperty = cdkBuilder.build()
}
