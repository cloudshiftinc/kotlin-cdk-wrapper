@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interoperable representation of a deployable cloud application.
 *
 * The external and interoperable contract for a Cloud Assembly is
 * a directory containing a valid Cloud Assembly.
 *
 * Implementations should use the directory to load the Cloud Assembly from disk.
 * It is recommended that implementations validate loaded manifest files using
 * the provided functionality from this package.
 * Within an implementation, it may be prudent to keep (parts of) the Cloud Assembly
 * in memory during execution and use an implementation-specific contract.
 * However when an implementation is providing an external contract,
 * this interface should be used.
 */
public interface ICloudAssembly {
  /**
   * The directory of the cloud assembly.
   *
   * This directory will be used to read the Cloud Assembly from.
   * Its contents (in particular `manifest.json`) must comply with the schema defined in this
   * package.
   */
  public fun directory(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.ICloudAssembly,
  ) : CdkObject(cdkObject),
      ICloudAssembly {
    /**
     * The directory of the cloud assembly.
     *
     * This directory will be used to read the Cloud Assembly from.
     * Its contents (in particular `manifest.json`) must comply with the schema defined in this
     * package.
     */
    override fun directory(): String = unwrap(this).getDirectory()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.ICloudAssembly):
        ICloudAssembly = CdkObjectWrappers.wrap(cdkObject) as? ICloudAssembly ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICloudAssembly):
        software.amazon.awscdk.cloud_assembly_schema.ICloudAssembly = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.ICloudAssembly
  }
}
