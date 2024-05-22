@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.efs.IAccessPoint
import kotlin.String

/**
 * Represents the filesystem for the Lambda function.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.efs.*;
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
public open class FileSystem(
  cdkObject: software.amazon.awscdk.services.lambda.FileSystem,
) : CdkObject(cdkObject) {
  /**
   * the FileSystem configurations for the Lambda function.
   */
  public open fun config(): FileSystemConfig = unwrap(this).getConfig().let(FileSystemConfig::wrap)

  public companion object {
    public fun fromEfsAccessPoint(ap: IAccessPoint, mountPath: String): FileSystem =
        software.amazon.awscdk.services.lambda.FileSystem.fromEfsAccessPoint(ap.let(IAccessPoint.Companion::unwrap),
        mountPath).let(FileSystem::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FileSystem): FileSystem =
        FileSystem(cdkObject)

    internal fun unwrap(wrapped: FileSystem): software.amazon.awscdk.services.lambda.FileSystem =
        wrapped.cdkObject as software.amazon.awscdk.services.lambda.FileSystem
  }
}
