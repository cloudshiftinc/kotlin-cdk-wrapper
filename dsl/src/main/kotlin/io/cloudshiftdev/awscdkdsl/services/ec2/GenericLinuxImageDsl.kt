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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.GenericLinuxImage
import software.amazon.awscdk.services.ec2.UserData

/**
 * Construct a Linux machine image from an AMI map.
 *
 * Linux images IDs are not published to SSM parameter store yet, so you'll have to manually specify
 * an AMI map.
 *
 * Example:
 * ```
 * // Pick a Windows edition to use
 * WindowsImage windows = new WindowsImage(WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_BASE);
 * // Pick the right Amazon Linux edition. All arguments shown are optional
 * // and will default to these values when omitted.
 * AmazonLinuxImage amznLinux = AmazonLinuxImage.Builder.create()
 * .generation(AmazonLinuxGeneration.AMAZON_LINUX)
 * .edition(AmazonLinuxEdition.STANDARD)
 * .virtualization(AmazonLinuxVirt.HVM)
 * .storage(AmazonLinuxStorage.GENERAL_PURPOSE)
 * .build();
 * // For other custom (Linux) images, instantiate a `GenericLinuxImage` with
 * // a map giving the AMI to in for each region:
 * GenericLinuxImage linux = new GenericLinuxImage(Map.of(
 * "us-east-1", "ami-97785bed",
 * "eu-west-1", "ami-12345678"));
 * ```
 */
@CdkDslMarker
public class GenericLinuxImageDsl(
    amiMap: Map<String, String>,
) {
    private val cdkBuilder: GenericLinuxImage.Builder = GenericLinuxImage.Builder.create(amiMap)

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     *
     * @param userData Initial user data.
     */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): GenericLinuxImage = cdkBuilder.build()
}
