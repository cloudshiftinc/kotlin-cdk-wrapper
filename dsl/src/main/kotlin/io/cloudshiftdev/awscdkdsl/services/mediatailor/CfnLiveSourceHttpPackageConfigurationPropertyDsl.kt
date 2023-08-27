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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnLiveSource

/**
 * The HTTP package configuration properties for the requested VOD source.</p>.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * HttpPackageConfigurationProperty httpPackageConfigurationProperty =
 * HttpPackageConfigurationProperty.builder()
 * .path("path")
 * .sourceGroup("sourceGroup")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-livesource-httppackageconfiguration.html)
 */
@CdkDslMarker
public class CfnLiveSourceHttpPackageConfigurationPropertyDsl {
    private val cdkBuilder: CfnLiveSource.HttpPackageConfigurationProperty.Builder =
        CfnLiveSource.HttpPackageConfigurationProperty.builder()

    /**
     * @param path The relative path to the URL for this VOD source. This is combined with
     *   `SourceLocation::HttpConfiguration::BaseUrl` to form a valid URL.</p>
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param sourceGroup The name of the source group. This has to match one of the
     *   `Channel::Outputs::SourceGroup`.</p>
     */
    public fun sourceGroup(sourceGroup: String) {
        cdkBuilder.sourceGroup(sourceGroup)
    }

    /** @param type the value to be set. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLiveSource.HttpPackageConfigurationProperty = cdkBuilder.build()
}
