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
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPointOptions
import software.amazon.awscdk.services.efs.Acl
import software.amazon.awscdk.services.efs.PosixUser

/**
 * Options to create an AccessPoint.
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
public class AccessPointOptionsDsl {
    private val cdkBuilder: AccessPointOptions.Builder = AccessPointOptions.builder()

    /**
     * @param createAcl Specifies the POSIX IDs and permissions to apply when creating the access
     *   point's root directory. If the root directory specified by `path` does not exist, EFS
     *   creates the root directory and applies the permissions specified here. If the specified
     *   `path` does not exist, you must specify `createAcl`.
     */
    public fun createAcl(createAcl: AclDsl.() -> Unit = {}) {
        val builder = AclDsl()
        builder.apply(createAcl)
        cdkBuilder.createAcl(builder.build())
    }

    /**
     * @param createAcl Specifies the POSIX IDs and permissions to apply when creating the access
     *   point's root directory. If the root directory specified by `path` does not exist, EFS
     *   creates the root directory and applies the permissions specified here. If the specified
     *   `path` does not exist, you must specify `createAcl`.
     */
    public fun createAcl(createAcl: Acl) {
        cdkBuilder.createAcl(createAcl)
    }

    /**
     * @param path Specifies the path on the EFS file system to expose as the root directory to NFS
     *   clients using the access point to access the EFS file system.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
     *   group IDs, on the access point that is used for all file system operations performed by NFS
     *   clients using the access point. Specify this to enforce a user identity using an access
     *   point.
     */
    public fun posixUser(posixUser: PosixUserDsl.() -> Unit = {}) {
        val builder = PosixUserDsl()
        builder.apply(posixUser)
        cdkBuilder.posixUser(builder.build())
    }

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
     *   group IDs, on the access point that is used for all file system operations performed by NFS
     *   clients using the access point. Specify this to enforce a user identity using an access
     *   point.
     */
    public fun posixUser(posixUser: PosixUser) {
        cdkBuilder.posixUser(posixUser)
    }

    public fun build(): AccessPointOptions = cdkBuilder.build()
}
