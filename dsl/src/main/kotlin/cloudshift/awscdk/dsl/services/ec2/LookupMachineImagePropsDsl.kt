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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.LookupMachineImageProps
import software.amazon.awscdk.services.ec2.UserData

/**
 * Properties for looking up an image.
 *
 * Example:
 * ```
 * // Pick the right Amazon Linux edition. All arguments shown are optional
 * // and will default to these values when omitted.
 * IMachineImage amznLinux = MachineImage.latestAmazonLinux(AmazonLinuxImageProps.builder()
 * .generation(AmazonLinuxGeneration.AMAZON_LINUX)
 * .edition(AmazonLinuxEdition.STANDARD)
 * .virtualization(AmazonLinuxVirt.HVM)
 * .storage(AmazonLinuxStorage.GENERAL_PURPOSE)
 * .cpuType(AmazonLinuxCpuType.X86_64)
 * .build());
 * // Pick a Windows edition to use
 * IMachineImage windows =
 * MachineImage.latestWindows(WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_BASE);
 * // Read AMI id from SSM parameter store
 * IMachineImage ssm = MachineImage.fromSsmParameter("/my/ami",
 * SsmParameterImageOptions.builder().os(OperatingSystemType.LINUX).build());
 * // Look up the most recent image matching a set of AMI filters.
 * // In this case, look up the NAT instance AMI, by using a wildcard
 * // in the 'name' field:
 * IMachineImage natAmi = MachineImage.lookup(LookupMachineImageProps.builder()
 * .name("amzn-ami-vpc-nat-*")
 * .owners(List.of("amazon"))
 * .build());
 * // For other custom (Linux) images, instantiate a `GenericLinuxImage` with
 * // a map giving the AMI to in for each region:
 * IMachineImage linux = MachineImage.genericLinux(Map.of(
 * "us-east-1", "ami-97785bed",
 * "eu-west-1", "ami-12345678"));
 * // For other custom (Windows) images, instantiate a `GenericWindowsImage` with
 * // a map giving the AMI to in for each region:
 * IMachineImage genericWindows = MachineImage.genericWindows(Map.of(
 * "us-east-1", "ami-97785bed",
 * "eu-west-1", "ami-12345678"));
 * ```
 */
@CdkDslMarker
public class LookupMachineImagePropsDsl {
    private val cdkBuilder: LookupMachineImageProps.Builder = LookupMachineImageProps.builder()

    private val _owners: MutableList<String> = mutableListOf()

    /** @param filters Additional filters on the AMI. */
    public fun filters(filters: Map<String, List<String>>) {
        cdkBuilder.filters(filters)
    }

    /** @param name Name of the image (may contain wildcards). */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param owners Owner account IDs or aliases. */
    public fun owners(vararg owners: String) {
        _owners.addAll(listOf(*owners))
    }

    /** @param owners Owner account IDs or aliases. */
    public fun owners(owners: Collection<String>) {
        _owners.addAll(owners)
    }

    /** @param userData Custom userdata for this image. */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    /** @param windows Look for Windows images. */
    public fun windows(windows: Boolean) {
        cdkBuilder.windows(windows)
    }

    public fun build(): LookupMachineImageProps {
        if (_owners.isNotEmpty()) cdkBuilder.owners(_owners)
        return cdkBuilder.build()
    }
}
