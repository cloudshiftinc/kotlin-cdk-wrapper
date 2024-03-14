package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVdmAttributes internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributes,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrVdmAttributesResourceId(): String =
      unwrap(this).getAttrVdmAttributesResourceId()

  public open fun dashboardAttributes(): Any? = unwrap(this).getDashboardAttributes()

  public open fun dashboardAttributes(`value`: IResolvable) {
    unwrap(this).setDashboardAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun dashboardAttributes(`value`: DashboardAttributesProperty) {
    unwrap(this).setDashboardAttributes(`value`.let(DashboardAttributesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad86552c868f9434dcf67f82d4c394342c6c187f3e90f0c2c4e5001a1263c169")
  public open fun dashboardAttributes(`value`: DashboardAttributesProperty.Builder.() -> Unit): Unit
      = dashboardAttributes(DashboardAttributesProperty(`value`))

  public open fun guardianAttributes(): Any? = unwrap(this).getGuardianAttributes()

  public open fun guardianAttributes(`value`: IResolvable) {
    unwrap(this).setGuardianAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun guardianAttributes(`value`: GuardianAttributesProperty) {
    unwrap(this).setGuardianAttributes(`value`.let(GuardianAttributesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c4ede8823d3956ded0c2cc82458ad4d55b0fb837bd6e6c9c0ad97c804ec28d2")
  public open fun guardianAttributes(`value`: GuardianAttributesProperty.Builder.() -> Unit): Unit =
      guardianAttributes(GuardianAttributesProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun dashboardAttributes(dashboardAttributes: IResolvable)

    public fun dashboardAttributes(dashboardAttributes: DashboardAttributesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4a692f1ea2143d633e81ff1451b925182bdddc1301c184b2a2a0c2d86ed08ff")
    public
        fun dashboardAttributes(dashboardAttributes: DashboardAttributesProperty.Builder.() -> Unit)

    public fun guardianAttributes(guardianAttributes: IResolvable)

    public fun guardianAttributes(guardianAttributes: GuardianAttributesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d456f0e3099a8dac0b7281769a5de33cc908e5afffc3f15fa111de935db37551")
    public fun guardianAttributes(guardianAttributes: GuardianAttributesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnVdmAttributes.Builder =
        software.amazon.awscdk.services.ses.CfnVdmAttributes.Builder.create(scope, id)

    override fun dashboardAttributes(dashboardAttributes: IResolvable) {
      cdkBuilder.dashboardAttributes(dashboardAttributes.let(IResolvable::unwrap))
    }

    override fun dashboardAttributes(dashboardAttributes: DashboardAttributesProperty) {
      cdkBuilder.dashboardAttributes(dashboardAttributes.let(DashboardAttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4a692f1ea2143d633e81ff1451b925182bdddc1301c184b2a2a0c2d86ed08ff")
    override
        fun dashboardAttributes(dashboardAttributes: DashboardAttributesProperty.Builder.() -> Unit):
        Unit = dashboardAttributes(DashboardAttributesProperty(dashboardAttributes))

    override fun guardianAttributes(guardianAttributes: IResolvable) {
      cdkBuilder.guardianAttributes(guardianAttributes.let(IResolvable::unwrap))
    }

    override fun guardianAttributes(guardianAttributes: GuardianAttributesProperty) {
      cdkBuilder.guardianAttributes(guardianAttributes.let(GuardianAttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d456f0e3099a8dac0b7281769a5de33cc908e5afffc3f15fa111de935db37551")
    override
        fun guardianAttributes(guardianAttributes: GuardianAttributesProperty.Builder.() -> Unit):
        Unit = guardianAttributes(GuardianAttributesProperty(guardianAttributes))

    public fun build(): software.amazon.awscdk.services.ses.CfnVdmAttributes = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVdmAttributes {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVdmAttributes(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributes):
        CfnVdmAttributes = CfnVdmAttributes(cdkObject)

    internal fun unwrap(wrapped: CfnVdmAttributes):
        software.amazon.awscdk.services.ses.CfnVdmAttributes = wrapped.cdkObject
  }

  public interface DashboardAttributesProperty {
    public fun engagementMetrics(): String? = unwrap(this).getEngagementMetrics()

    public interface Builder {
      public fun engagementMetrics(engagementMetrics: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty.Builder =
          software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty.builder()

      override fun engagementMetrics(engagementMetrics: String) {
        cdkBuilder.engagementMetrics(engagementMetrics)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty,
    ) : DashboardAttributesProperty {
      override fun engagementMetrics(): String? = unwrap(this).getEngagementMetrics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DashboardAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty):
          DashboardAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashboardAttributesProperty):
          software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GuardianAttributesProperty {
    public fun optimizedSharedDelivery(): String? = unwrap(this).getOptimizedSharedDelivery()

    public interface Builder {
      public fun optimizedSharedDelivery(optimizedSharedDelivery: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty.Builder =
          software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty.builder()

      override fun optimizedSharedDelivery(optimizedSharedDelivery: String) {
        cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty,
    ) : GuardianAttributesProperty {
      override fun optimizedSharedDelivery(): String? = unwrap(this).getOptimizedSharedDelivery()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GuardianAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty):
          GuardianAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardianAttributesProperty):
          software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
