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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * Details on a data volume from another container in the same task definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * VolumeFromProperty volumeFromProperty = VolumeFromProperty.builder()
 * .readOnly(false)
 * .sourceContainer("sourceContainer")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumefrom.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionVolumeFromPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.VolumeFromProperty.Builder =
        CfnTaskDefinition.VolumeFromProperty.builder()

    /**
     * @param readOnly If this value is `true` , the container has read-only access to the volume.
     *   If this value is `false` , then the container can write to the volume. The default value is
     *   `false` .
     */
    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    /**
     * @param readOnly If this value is `true` , the container has read-only access to the volume.
     *   If this value is `false` , then the container can write to the volume. The default value is
     *   `false` .
     */
    public fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly)
    }

    /**
     * @param sourceContainer The name of another container within the same task definition to mount
     *   volumes from.
     */
    public fun sourceContainer(sourceContainer: String) {
        cdkBuilder.sourceContainer(sourceContainer)
    }

    public fun build(): CfnTaskDefinition.VolumeFromProperty = cdkBuilder.build()
}
