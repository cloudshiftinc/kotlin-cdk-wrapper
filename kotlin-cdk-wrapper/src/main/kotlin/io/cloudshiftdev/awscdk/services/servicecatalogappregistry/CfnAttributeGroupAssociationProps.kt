@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnAttributeGroupAssociationProps {
  public fun application(): String

  public fun attributeGroup(): String

  @CdkDslMarker
  public interface Builder {
    public fun application(application: String)

    public fun attributeGroup(attributeGroup: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps.Builder
        =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps.builder()

    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    override fun attributeGroup(attributeGroup: String) {
      cdkBuilder.attributeGroup(attributeGroup)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps,
  ) : CdkObject(cdkObject), CfnAttributeGroupAssociationProps {
    override fun application(): String = unwrap(this).getApplication()

    override fun attributeGroup(): String = unwrap(this).getAttributeGroup()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAttributeGroupAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps):
        CfnAttributeGroupAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAttributeGroupAssociationProps):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
  }
}
