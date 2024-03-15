@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSpotFleetProps {
  public fun spotFleetRequestConfigData(): Any

  @CdkDslMarker
  public interface Builder {
    public fun spotFleetRequestConfigData(spotFleetRequestConfigData: IResolvable)

    public
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: CfnSpotFleet.SpotFleetRequestConfigDataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c50b0f5c9c9abe4594ab31a59b0e265812376b3f723aef4398205f5a4f6b0f03")
    public
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: CfnSpotFleet.SpotFleetRequestConfigDataProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSpotFleetProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSpotFleetProps.builder()

    override fun spotFleetRequestConfigData(spotFleetRequestConfigData: IResolvable) {
      cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData.let(IResolvable::unwrap))
    }

    override
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: CfnSpotFleet.SpotFleetRequestConfigDataProperty) {
      cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData.let(CfnSpotFleet.SpotFleetRequestConfigDataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c50b0f5c9c9abe4594ab31a59b0e265812376b3f723aef4398205f5a4f6b0f03")
    override
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: CfnSpotFleet.SpotFleetRequestConfigDataProperty.Builder.() -> Unit):
        Unit =
        spotFleetRequestConfigData(CfnSpotFleet.SpotFleetRequestConfigDataProperty(spotFleetRequestConfigData))

    public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleetProps,
  ) : CdkObject(cdkObject), CfnSpotFleetProps {
    override fun spotFleetRequestConfigData(): Any = unwrap(this).getSpotFleetRequestConfigData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSpotFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleetProps):
        CfnSpotFleetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSpotFleetProps):
        software.amazon.awscdk.services.ec2.CfnSpotFleetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnSpotFleetProps
  }
}
