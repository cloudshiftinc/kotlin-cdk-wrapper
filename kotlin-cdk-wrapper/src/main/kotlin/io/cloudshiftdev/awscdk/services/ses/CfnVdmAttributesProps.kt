@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnVdmAttributesProps {
  public fun dashboardAttributes(): Any? = unwrap(this).getDashboardAttributes()

  public fun guardianAttributes(): Any? = unwrap(this).getGuardianAttributes()

  @CdkDslMarker
  public interface Builder {
    public fun dashboardAttributes(dashboardAttributes: IResolvable)

    public
        fun dashboardAttributes(dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f29a620aed7b3d3866833ecc1d67bc124c357912a32772b2aa408fbb13bbfc7")
    public
        fun dashboardAttributes(dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty.Builder.() -> Unit)

    public fun guardianAttributes(guardianAttributes: IResolvable)

    public fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0daeb328c2f21c5fd6884fd4c6e83934280a8ca4e0b0009ec66239d8c597210c")
    public
        fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnVdmAttributesProps.Builder =
        software.amazon.awscdk.services.ses.CfnVdmAttributesProps.builder()

    override fun dashboardAttributes(dashboardAttributes: IResolvable) {
      cdkBuilder.dashboardAttributes(dashboardAttributes.let(IResolvable::unwrap))
    }

    override
        fun dashboardAttributes(dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty) {
      cdkBuilder.dashboardAttributes(dashboardAttributes.let(CfnVdmAttributes.DashboardAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f29a620aed7b3d3866833ecc1d67bc124c357912a32772b2aa408fbb13bbfc7")
    override
        fun dashboardAttributes(dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty.Builder.() -> Unit):
        Unit =
        dashboardAttributes(CfnVdmAttributes.DashboardAttributesProperty(dashboardAttributes))

    override fun guardianAttributes(guardianAttributes: IResolvable) {
      cdkBuilder.guardianAttributes(guardianAttributes.let(IResolvable::unwrap))
    }

    override
        fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty) {
      cdkBuilder.guardianAttributes(guardianAttributes.let(CfnVdmAttributes.GuardianAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0daeb328c2f21c5fd6884fd4c6e83934280a8ca4e0b0009ec66239d8c597210c")
    override
        fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty.Builder.() -> Unit):
        Unit = guardianAttributes(CfnVdmAttributes.GuardianAttributesProperty(guardianAttributes))

    public fun build(): software.amazon.awscdk.services.ses.CfnVdmAttributesProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributesProps,
  ) : CdkObject(cdkObject), CfnVdmAttributesProps {
    override fun dashboardAttributes(): Any? = unwrap(this).getDashboardAttributes()

    override fun guardianAttributes(): Any? = unwrap(this).getGuardianAttributes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVdmAttributesProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributesProps):
        CfnVdmAttributesProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVdmAttributesProps):
        software.amazon.awscdk.services.ses.CfnVdmAttributesProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.CfnVdmAttributesProps
  }
}
