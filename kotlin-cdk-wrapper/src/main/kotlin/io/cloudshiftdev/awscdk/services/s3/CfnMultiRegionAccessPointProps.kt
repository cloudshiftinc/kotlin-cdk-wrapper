@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMultiRegionAccessPointProps {
  public fun name(): String? = unwrap(this).getName()

  public fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  public fun regions(): Any

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7882be387743c683f416f8b4455ab6fc2f45349530c47f542634a5846c73ac4")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    public fun regions(regions: IResolvable)

    public fun regions(regions: List<Any>)

    public fun regions(vararg regions: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps.Builder =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7882be387743c683f416f8b4455ab6fc2f45349530c47f542634a5846c73ac4")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    override fun regions(regions: IResolvable) {
      cdkBuilder.regions(regions.let(IResolvable::unwrap))
    }

    override fun regions(regions: List<Any>) {
      cdkBuilder.regions(regions)
    }

    override fun regions(vararg regions: Any): Unit = regions(regions.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps,
  ) : CdkObject(cdkObject), CfnMultiRegionAccessPointProps {
    override fun name(): String? = unwrap(this).getName()

    override fun publicAccessBlockConfiguration(): Any? =
        unwrap(this).getPublicAccessBlockConfiguration()

    override fun regions(): Any = unwrap(this).getRegions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMultiRegionAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps):
        CfnMultiRegionAccessPointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMultiRegionAccessPointProps):
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps
  }
}
