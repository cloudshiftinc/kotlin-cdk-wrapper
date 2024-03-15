@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnHookDefaultVersionProps {
  public fun typeName(): String? = unwrap(this).getTypeName()

  public fun typeVersionArn(): String? = unwrap(this).getTypeVersionArn()

  public fun versionId(): String? = unwrap(this).getVersionId()

  @CdkDslMarker
  public interface Builder {
    public fun typeName(typeName: String)

    public fun typeVersionArn(typeVersionArn: String)

    public fun versionId(versionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps.builder()

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    override fun typeVersionArn(typeVersionArn: String) {
      cdkBuilder.typeVersionArn(typeVersionArn)
    }

    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps,
  ) : CdkObject(cdkObject), CfnHookDefaultVersionProps {
    override fun typeName(): String? = unwrap(this).getTypeName()

    override fun typeVersionArn(): String? = unwrap(this).getTypeVersionArn()

    override fun versionId(): String? = unwrap(this).getVersionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHookDefaultVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps):
        CfnHookDefaultVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHookDefaultVersionProps):
        software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps
  }
}
