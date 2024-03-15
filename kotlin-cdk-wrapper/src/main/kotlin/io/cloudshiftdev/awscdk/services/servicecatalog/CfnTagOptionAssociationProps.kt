@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnTagOptionAssociationProps {
  public fun resourceId(): String

  public fun tagOptionId(): String

  @CdkDslMarker
  public interface Builder {
    public fun resourceId(resourceId: String)

    public fun tagOptionId(tagOptionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps.builder()

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun tagOptionId(tagOptionId: String) {
      cdkBuilder.tagOptionId(tagOptionId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps,
  ) : CdkObject(cdkObject), CfnTagOptionAssociationProps {
    override fun resourceId(): String = unwrap(this).getResourceId()

    override fun tagOptionId(): String = unwrap(this).getTagOptionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTagOptionAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps):
        CfnTagOptionAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTagOptionAssociationProps):
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps
  }
}
