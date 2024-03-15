@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnResourceDefaultVersionProps {
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
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps.builder()

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    override fun typeVersionArn(typeVersionArn: String) {
      cdkBuilder.typeVersionArn(typeVersionArn)
    }

    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build():
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps,
  ) : CdkObject(cdkObject), CfnResourceDefaultVersionProps {
    override fun typeName(): String? = unwrap(this).getTypeName()

    override fun typeVersionArn(): String? = unwrap(this).getTypeVersionArn()

    override fun versionId(): String? = unwrap(this).getVersionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceDefaultVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps):
        CfnResourceDefaultVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefaultVersionProps):
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps
  }
}
