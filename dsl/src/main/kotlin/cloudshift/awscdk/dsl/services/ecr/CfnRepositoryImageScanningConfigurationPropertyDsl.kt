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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnRepository

/**
 * The image scanning configuration for a repository.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * ImageScanningConfigurationProperty imageScanningConfigurationProperty =
 * ImageScanningConfigurationProperty.builder()
 * .scanOnPush(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-imagescanningconfiguration.html)
 */
@CdkDslMarker
public class CfnRepositoryImageScanningConfigurationPropertyDsl {
    private val cdkBuilder: CfnRepository.ImageScanningConfigurationProperty.Builder =
        CfnRepository.ImageScanningConfigurationProperty.builder()

    /**
     * @param scanOnPush The setting that determines whether images are scanned after being pushed
     *   to a repository. If set to `true` , images will be scanned after being pushed. If this
     *   parameter is not specified, it will default to `false` and images will not be scanned
     *   unless a scan is manually started.
     */
    public fun scanOnPush(scanOnPush: Boolean) {
        cdkBuilder.scanOnPush(scanOnPush)
    }

    /**
     * @param scanOnPush The setting that determines whether images are scanned after being pushed
     *   to a repository. If set to `true` , images will be scanned after being pushed. If this
     *   parameter is not specified, it will default to `false` and images will not be scanned
     *   unless a scan is manually started.
     */
    public fun scanOnPush(scanOnPush: IResolvable) {
        cdkBuilder.scanOnPush(scanOnPush)
    }

    public fun build(): CfnRepository.ImageScanningConfigurationProperty = cdkBuilder.build()
}
