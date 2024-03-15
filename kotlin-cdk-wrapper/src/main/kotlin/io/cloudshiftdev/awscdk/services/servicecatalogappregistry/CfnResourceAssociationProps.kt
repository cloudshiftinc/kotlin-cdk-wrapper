@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnResourceAssociationProps {
  public fun application(): String

  public fun resource(): String

  public fun resourceType(): String

  @CdkDslMarker
  public interface Builder {
    public fun application(application: String)

    public fun resource(resource: String)

    public fun resourceType(resourceType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps.Builder
        =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps.builder()

    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    override fun resource(resource: String) {
      cdkBuilder.resource(resource)
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps,
  ) : CdkObject(cdkObject), CfnResourceAssociationProps {
    override fun application(): String = unwrap(this).getApplication()

    override fun resource(): String = unwrap(this).getResource()

    override fun resourceType(): String = unwrap(this).getResourceType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps):
        CfnResourceAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceAssociationProps):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps
  }
}
