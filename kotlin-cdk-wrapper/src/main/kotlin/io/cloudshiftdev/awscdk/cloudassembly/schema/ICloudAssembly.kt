@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

public interface ICloudAssembly {
  public fun directory(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.ICloudAssembly,
  ) : CdkObject(cdkObject),
      ICloudAssembly {
    override fun directory(): String = unwrap(this).getDirectory()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.ICloudAssembly):
        ICloudAssembly = CdkObjectWrappers.wrap(cdkObject) as? ICloudAssembly ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICloudAssembly):
        software.amazon.awscdk.cloudassembly.schema.ICloudAssembly = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.ICloudAssembly
  }
}
