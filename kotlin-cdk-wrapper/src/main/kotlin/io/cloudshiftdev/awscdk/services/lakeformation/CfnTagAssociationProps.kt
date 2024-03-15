@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTagAssociationProps {
  public fun lfTags(): Any

  public fun resource(): Any

  @CdkDslMarker
  public interface Builder {
    public fun lfTags(lfTags: IResolvable)

    public fun lfTags(lfTags: List<Any>)

    public fun lfTags(vararg lfTags: Any)

    public fun resource(resource: IResolvable)

    public fun resource(resource: CfnTagAssociation.ResourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cb3ccafffe663fac54400701dd637c69bc7557ba70562585034caeca7a270d4")
    public fun resource(resource: CfnTagAssociation.ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps.builder()

    override fun lfTags(lfTags: IResolvable) {
      cdkBuilder.lfTags(lfTags.let(IResolvable::unwrap))
    }

    override fun lfTags(lfTags: List<Any>) {
      cdkBuilder.lfTags(lfTags)
    }

    override fun lfTags(vararg lfTags: Any): Unit = lfTags(lfTags.toList())

    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    override fun resource(resource: CfnTagAssociation.ResourceProperty) {
      cdkBuilder.resource(resource.let(CfnTagAssociation.ResourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cb3ccafffe663fac54400701dd637c69bc7557ba70562585034caeca7a270d4")
    override fun resource(resource: CfnTagAssociation.ResourceProperty.Builder.() -> Unit): Unit =
        resource(CfnTagAssociation.ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps,
  ) : CdkObject(cdkObject), CfnTagAssociationProps {
    override fun lfTags(): Any = unwrap(this).getLfTags()

    override fun resource(): Any = unwrap(this).getResource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTagAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps):
        CfnTagAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTagAssociationProps):
        software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps
  }
}
