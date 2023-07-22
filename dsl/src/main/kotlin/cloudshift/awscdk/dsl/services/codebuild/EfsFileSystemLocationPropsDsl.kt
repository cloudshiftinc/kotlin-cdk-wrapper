@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps

@CdkDslMarker
public class EfsFileSystemLocationPropsDsl {
  private val cdkBuilder: EfsFileSystemLocationProps.Builder = EfsFileSystemLocationProps.builder()

  /**
   * @param identifier The name used to access a file system created by Amazon EFS. 
   */
  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  /**
   * @param location A string that specifies the location of the file system, like Amazon EFS. 
   * This value looks like `fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory`.
   */
  public fun location(location: String) {
    cdkBuilder.location(location)
  }

  /**
   * @param mountOptions The mount options for a file system such as Amazon EFS.
   */
  public fun mountOptions(mountOptions: String) {
    cdkBuilder.mountOptions(mountOptions)
  }

  /**
   * @param mountPoint The location in the container where you mount the file system. 
   */
  public fun mountPoint(mountPoint: String) {
    cdkBuilder.mountPoint(mountPoint)
  }

  public fun build(): EfsFileSystemLocationProps = cdkBuilder.build()
}
