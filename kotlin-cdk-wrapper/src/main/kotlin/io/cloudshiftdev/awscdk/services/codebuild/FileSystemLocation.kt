@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * FileSystemLocation provider definition for a CodeBuild Project.
 *
 * Example:
 *
 * ```
 * Project.Builder.create(this, "MyProject")
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2")))
 * .fileSystemLocations(List.of(FileSystemLocation.efs(EfsFileSystemLocationProps.builder()
 * .identifier("myidentifier2")
 * .location("myclodation.mydnsroot.com:/loc")
 * .mountPoint("/media")
 * .mountOptions("opts")
 * .build())))
 * .build();
 * ```
 */
public open class FileSystemLocation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.FileSystemLocation,
) : CdkObject(cdkObject) {
  public companion object {
    public fun efs(props: EfsFileSystemLocationProps): IFileSystemLocation =
        software.amazon.awscdk.services.codebuild.FileSystemLocation.efs(props.let(EfsFileSystemLocationProps::unwrap)).let(IFileSystemLocation::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("946b041de0d09bf7421671b618ef671b9434b22a6e6bd4c23120e1b760eb1304")
    public fun efs(props: EfsFileSystemLocationProps.Builder.() -> Unit): IFileSystemLocation =
        efs(EfsFileSystemLocationProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.FileSystemLocation):
        FileSystemLocation = FileSystemLocation(cdkObject)

    internal fun unwrap(wrapped: FileSystemLocation):
        software.amazon.awscdk.services.codebuild.FileSystemLocation = wrapped.cdkObject
  }
}
