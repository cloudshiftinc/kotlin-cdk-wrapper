@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnModuleDefaultVersionProps {
  public fun arn(): String? = unwrap(this).getArn()

  public fun moduleName(): String? = unwrap(this).getModuleName()

  public fun versionId(): String? = unwrap(this).getVersionId()

  @CdkDslMarker
  public interface Builder {
    public fun arn(arn: String)

    public fun moduleName(moduleName: String)

    public fun versionId(versionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps.builder()

    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    override fun moduleName(moduleName: String) {
      cdkBuilder.moduleName(moduleName)
    }

    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps,
  ) : CdkObject(cdkObject), CfnModuleDefaultVersionProps {
    override fun arn(): String? = unwrap(this).getArn()

    override fun moduleName(): String? = unwrap(this).getModuleName()

    override fun versionId(): String? = unwrap(this).getVersionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModuleDefaultVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps):
        CfnModuleDefaultVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModuleDefaultVersionProps):
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps
  }
}
