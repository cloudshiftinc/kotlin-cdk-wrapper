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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnUser

/**
 * The full POSIX identity, including user ID ( `Uid` ), group ID ( `Gid` ), and any secondary
 * groups IDs ( `SecondaryGids` ), that controls your users' access to your Amazon EFS file systems.
 *
 * The POSIX permissions that are set on files and directories in your file system determine the
 * level of access your users get when transferring files into and out of your Amazon EFS file
 * systems.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * PosixProfileProperty posixProfileProperty = PosixProfileProperty.builder()
 * .gid(123)
 * .uid(123)
 * // the properties below are optional
 * .secondaryGids(List.of(123))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-posixprofile.html)
 */
@CdkDslMarker
public class CfnUserPosixProfilePropertyDsl {
    private val cdkBuilder: CfnUser.PosixProfileProperty.Builder =
        CfnUser.PosixProfileProperty.builder()

    private val _secondaryGids: MutableList<Number> = mutableListOf()

    /** @param gid The POSIX group ID used for all EFS operations by this user. */
    public fun gid(gid: Number) {
        cdkBuilder.gid(gid)
    }

    /**
     * @param secondaryGids The secondary POSIX group IDs used for all EFS operations by this user.
     */
    public fun secondaryGids(vararg secondaryGids: Number) {
        _secondaryGids.addAll(listOf(*secondaryGids))
    }

    /**
     * @param secondaryGids The secondary POSIX group IDs used for all EFS operations by this user.
     */
    public fun secondaryGids(secondaryGids: Collection<Number>) {
        _secondaryGids.addAll(secondaryGids)
    }

    /**
     * @param secondaryGids The secondary POSIX group IDs used for all EFS operations by this user.
     */
    public fun secondaryGids(secondaryGids: IResolvable) {
        cdkBuilder.secondaryGids(secondaryGids)
    }

    /** @param uid The POSIX user ID used for all EFS operations by this user. */
    public fun uid(uid: Number) {
        cdkBuilder.uid(uid)
    }

    public fun build(): CfnUser.PosixProfileProperty {
        if (_secondaryGids.isNotEmpty()) cdkBuilder.secondaryGids(_secondaryGids)
        return cdkBuilder.build()
    }
}
