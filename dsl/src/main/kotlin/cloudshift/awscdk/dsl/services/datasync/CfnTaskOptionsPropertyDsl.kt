@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnTask

@CdkDslMarker
public class CfnTaskOptionsPropertyDsl {
  private val cdkBuilder: CfnTask.OptionsProperty.Builder = CfnTask.OptionsProperty.builder()

  public fun atime(atime: String) {
    cdkBuilder.atime(atime)
  }

  public fun bytesPerSecond(bytesPerSecond: Number) {
    cdkBuilder.bytesPerSecond(bytesPerSecond)
  }

  public fun gid(gid: String) {
    cdkBuilder.gid(gid)
  }

  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  public fun mtime(mtime: String) {
    cdkBuilder.mtime(mtime)
  }

  public fun objectTags(objectTags: String) {
    cdkBuilder.objectTags(objectTags)
  }

  public fun overwriteMode(overwriteMode: String) {
    cdkBuilder.overwriteMode(overwriteMode)
  }

  public fun posixPermissions(posixPermissions: String) {
    cdkBuilder.posixPermissions(posixPermissions)
  }

  public fun preserveDeletedFiles(preserveDeletedFiles: String) {
    cdkBuilder.preserveDeletedFiles(preserveDeletedFiles)
  }

  public fun preserveDevices(preserveDevices: String) {
    cdkBuilder.preserveDevices(preserveDevices)
  }

  public fun securityDescriptorCopyFlags(securityDescriptorCopyFlags: String) {
    cdkBuilder.securityDescriptorCopyFlags(securityDescriptorCopyFlags)
  }

  public fun taskQueueing(taskQueueing: String) {
    cdkBuilder.taskQueueing(taskQueueing)
  }

  public fun transferMode(transferMode: String) {
    cdkBuilder.transferMode(transferMode)
  }

  public fun uid(uid: String) {
    cdkBuilder.uid(uid)
  }

  public fun verifyMode(verifyMode: String) {
    cdkBuilder.verifyMode(verifyMode)
  }

  public fun build(): CfnTask.OptionsProperty = cdkBuilder.build()
}
