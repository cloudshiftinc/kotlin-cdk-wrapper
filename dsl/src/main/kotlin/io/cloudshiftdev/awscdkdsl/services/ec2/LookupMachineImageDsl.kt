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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.LookupMachineImage
import software.amazon.awscdk.services.ec2.UserData

/**
 * A machine image whose AMI ID will be searched using DescribeImages.
 *
 * The most recent, available, launchable image matching the given filter criteria will be used.
 * Looking up AMIs may take a long time; specify as many filter criteria as possible to narrow down
 * the search.
 *
 * The AMI selected will be cached in `cdk.context.json` and the same value will be used on future
 * runs. To refresh the AMI lookup, you will have to evict the value from the cache using the `cdk
 * context` command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for more
 * information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * UserData userData;
 * LookupMachineImage lookupMachineImage = LookupMachineImage.Builder.create()
 * .name("name")
 * // the properties below are optional
 * .filters(Map.of(
 * "filtersKey", List.of("filters")))
 * .owners(List.of("owners"))
 * .userData(userData)
 * .windows(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class LookupMachineImageDsl {
    private val cdkBuilder: LookupMachineImage.Builder = LookupMachineImage.Builder.create()

    private val _owners: MutableList<String> = mutableListOf()

    /**
     * Additional filters on the AMI.
     *
     * Default: - No additional filters
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImages.html)
     *
     * @param filters Additional filters on the AMI.
     */
    public fun filters(filters: Map<String, List<String>>) {
        cdkBuilder.filters(filters)
    }

    /**
     * Name of the image (may contain wildcards).
     *
     * @param name Name of the image (may contain wildcards).
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Owner account IDs or aliases.
     *
     * Default: - All owners
     *
     * @param owners Owner account IDs or aliases.
     */
    public fun owners(vararg owners: String) {
        _owners.addAll(listOf(*owners))
    }

    /**
     * Owner account IDs or aliases.
     *
     * Default: - All owners
     *
     * @param owners Owner account IDs or aliases.
     */
    public fun owners(owners: Collection<String>) {
        _owners.addAll(owners)
    }

    /**
     * Custom userdata for this image.
     *
     * Default: - Empty user data appropriate for the platform type
     *
     * @param userData Custom userdata for this image.
     */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    /**
     * Look for Windows images.
     *
     * Default: false
     *
     * @param windows Look for Windows images.
     */
    public fun windows(windows: Boolean) {
        cdkBuilder.windows(windows)
    }

    public fun build(): LookupMachineImage {
        if (_owners.isNotEmpty()) cdkBuilder.owners(_owners)
        return cdkBuilder.build()
    }
}
