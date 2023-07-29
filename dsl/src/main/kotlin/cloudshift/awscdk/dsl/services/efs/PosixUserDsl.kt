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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.efs.PosixUser

/**
 * Represents the PosixUser.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.efs.*;
 * // create a new VPC
 * Vpc vpc = new Vpc(this, "VPC");
 * // create a new Amazon EFS filesystem
 * FileSystem fileSystem = FileSystem.Builder.create(this, "Efs").vpc(vpc).build();
 * // create a new access point from the filesystem
 * AccessPoint accessPoint = fileSystem.addAccessPoint("AccessPoint", AccessPointOptions.builder()
 * // set /export/lambda as the root of the access point
 * .path("/export/lambda")
 * // as /export/lambda does not exist in a new efs filesystem, the efs will create the directory
 * with the following createAcl
 * .createAcl(Acl.builder()
 * .ownerUid("1001")
 * .ownerGid("1001")
 * .permissions("750")
 * .build())
 * // enforce the POSIX identity so lambda function will access with this identity
 * .posixUser(PosixUser.builder()
 * .uid("1001")
 * .gid("1001")
 * .build())
 * .build());
 * Function fn = Function.Builder.create(this, "MyLambda")
 * // mount the access point to /mnt/msg in the lambda runtime environment
 * .filesystem(FileSystem.fromEfsAccessPoint(accessPoint, "/mnt/msg"))
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class PosixUserDsl {
    private val cdkBuilder: PosixUser.Builder = PosixUser.builder()

    private val _secondaryGids: MutableList<String> = mutableListOf()

    /**
     * @param gid The POSIX group ID used for all file system operations using this access point.
     */
    public fun gid(gid: String) {
        cdkBuilder.gid(gid)
    }

    /**
     * @param secondaryGids Secondary POSIX group IDs used for all file system operations using this
     *   access point.
     */
    public fun secondaryGids(vararg secondaryGids: String) {
        _secondaryGids.addAll(listOf(*secondaryGids))
    }

    /**
     * @param secondaryGids Secondary POSIX group IDs used for all file system operations using this
     *   access point.
     */
    public fun secondaryGids(secondaryGids: Collection<String>) {
        _secondaryGids.addAll(secondaryGids)
    }

    /** @param uid The POSIX user ID used for all file system operations using this access point. */
    public fun uid(uid: String) {
        cdkBuilder.uid(uid)
    }

    public fun build(): PosixUser {
        if (_secondaryGids.isNotEmpty()) cdkBuilder.secondaryGids(_secondaryGids)
        return cdkBuilder.build()
    }
}
