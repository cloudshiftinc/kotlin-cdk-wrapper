@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnModuleVersionProps {
  public fun moduleName(): String

  public fun modulePackage(): String

  @CdkDslMarker
  public interface Builder {
    public fun moduleName(moduleName: String)

    public fun modulePackage(modulePackage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnModuleVersionProps.Builder =
        software.amazon.awscdk.CfnModuleVersionProps.builder()

    override fun moduleName(moduleName: String) {
      cdkBuilder.moduleName(moduleName)
    }

    override fun modulePackage(modulePackage: String) {
      cdkBuilder.modulePackage(modulePackage)
    }

    public fun build(): software.amazon.awscdk.CfnModuleVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnModuleVersionProps,
  ) : CdkObject(cdkObject), CfnModuleVersionProps {
    override fun moduleName(): String = unwrap(this).getModuleName()

    override fun modulePackage(): String = unwrap(this).getModulePackage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModuleVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnModuleVersionProps):
        CfnModuleVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModuleVersionProps):
        software.amazon.awscdk.CfnModuleVersionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnModuleVersionProps
  }
}
