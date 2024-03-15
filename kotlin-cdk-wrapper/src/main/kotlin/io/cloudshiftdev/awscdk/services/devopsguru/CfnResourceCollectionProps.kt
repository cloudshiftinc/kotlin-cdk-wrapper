@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnResourceCollectionProps {
  public fun resourceCollectionFilter(): Any

  @CdkDslMarker
  public interface Builder {
    public fun resourceCollectionFilter(resourceCollectionFilter: IResolvable)

    public
        fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c5adba42b517c5cdd37e652851ac3ba97844a2a650c7f0faa0c889b7e5d76c1")
    public
        fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps.Builder =
        software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps.builder()

    override fun resourceCollectionFilter(resourceCollectionFilter: IResolvable) {
      cdkBuilder.resourceCollectionFilter(resourceCollectionFilter.let(IResolvable::unwrap))
    }

    override
        fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty) {
      cdkBuilder.resourceCollectionFilter(resourceCollectionFilter.let(CfnResourceCollection.ResourceCollectionFilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c5adba42b517c5cdd37e652851ac3ba97844a2a650c7f0faa0c889b7e5d76c1")
    override
        fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty.Builder.() -> Unit):
        Unit =
        resourceCollectionFilter(CfnResourceCollection.ResourceCollectionFilterProperty(resourceCollectionFilter))

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps,
  ) : CdkObject(cdkObject), CfnResourceCollectionProps {
    override fun resourceCollectionFilter(): Any = unwrap(this).getResourceCollectionFilter()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceCollectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps):
        CfnResourceCollectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceCollectionProps):
        software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps
  }
}
