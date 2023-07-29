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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.InitUserOptions

/**
 * Optional parameters used when creating a user.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * InitUserOptions initUserOptions = InitUserOptions.builder()
 * .groups(List.of("groups"))
 * .homeDir("homeDir")
 * .userId(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class InitUserOptionsDsl {
    private val cdkBuilder: InitUserOptions.Builder = InitUserOptions.builder()

    private val _groups: MutableList<String> = mutableListOf()

    /** @param groups A list of group names. The user will be added to each group in the list. */
    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    /** @param groups A list of group names. The user will be added to each group in the list. */
    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    /** @param homeDir The user's home directory. */
    public fun homeDir(homeDir: String) {
        cdkBuilder.homeDir(homeDir)
    }

    /**
     * @param userId A user ID. The creation process fails if the user name exists with a different
     *   user ID. If the user ID is already assigned to an existing user the operating system may
     *   reject the creation request.
     */
    public fun userId(userId: Number) {
        cdkBuilder.userId(userId)
    }

    public fun build(): InitUserOptions {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        return cdkBuilder.build()
    }
}
