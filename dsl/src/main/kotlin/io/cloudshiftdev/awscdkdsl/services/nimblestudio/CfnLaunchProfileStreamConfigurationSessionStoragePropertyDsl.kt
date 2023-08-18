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

package io.cloudshiftdev.awscdkdsl.services.nimblestudio

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile

/**
 * The configuration for a streaming session’s upload storage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * StreamConfigurationSessionStorageProperty streamConfigurationSessionStorageProperty =
 * StreamConfigurationSessionStorageProperty.builder()
 * .mode(List.of("mode"))
 * // the properties below are optional
 * .root(StreamingSessionStorageRootProperty.builder()
 * .linux("linux")
 * .windows("windows")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionstorage.html)
 */
@CdkDslMarker
public class CfnLaunchProfileStreamConfigurationSessionStoragePropertyDsl {
    private val cdkBuilder: CfnLaunchProfile.StreamConfigurationSessionStorageProperty.Builder =
        CfnLaunchProfile.StreamConfigurationSessionStorageProperty.builder()

    private val _mode: MutableList<String> = mutableListOf()

    /**
     * @param mode Allows artists to upload files to their workstations. The only valid option is
     *   `UPLOAD` .
     */
    public fun mode(vararg mode: String) {
        _mode.addAll(listOf(*mode))
    }

    /**
     * @param mode Allows artists to upload files to their workstations. The only valid option is
     *   `UPLOAD` .
     */
    public fun mode(mode: Collection<String>) {
        _mode.addAll(mode)
    }

    /** @param root The configuration for the upload storage root of the streaming session. */
    public fun root(root: IResolvable) {
        cdkBuilder.root(root)
    }

    /** @param root The configuration for the upload storage root of the streaming session. */
    public fun root(root: CfnLaunchProfile.StreamingSessionStorageRootProperty) {
        cdkBuilder.root(root)
    }

    public fun build(): CfnLaunchProfile.StreamConfigurationSessionStorageProperty {
        if (_mode.isNotEmpty()) cdkBuilder.mode(_mode)
        return cdkBuilder.build()
    }
}
