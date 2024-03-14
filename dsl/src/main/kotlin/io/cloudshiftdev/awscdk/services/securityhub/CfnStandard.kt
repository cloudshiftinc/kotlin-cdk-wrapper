package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStandard internal constructor(
  private val cdkObject: software.amazon.awscdk.services.securityhub.CfnStandard,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrStandardsSubscriptionArn(): String =
      unwrap(this).getAttrStandardsSubscriptionArn()

  public open fun disabledStandardsControls(): Any? = unwrap(this).getDisabledStandardsControls()

  public open fun disabledStandardsControls(`value`: IResolvable) {
    unwrap(this).setDisabledStandardsControls(`value`.let(IResolvable::unwrap))
  }

  public open fun disabledStandardsControls(__idx_ac66f0: List<Any>) {
    unwrap(this).setDisabledStandardsControls(__idx_ac66f0)
  }

  public open fun disabledStandardsControls(vararg __idx_ac66f0: Any): Unit =
      disabledStandardsControls(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun standardsArn(): String = unwrap(this).getStandardsArn()

  public open fun standardsArn(`value`: String) {
    unwrap(this).setStandardsArn(`value`)
  }

  public interface Builder {
    public fun disabledStandardsControls(disabledStandardsControls: IResolvable)

    public fun disabledStandardsControls(disabledStandardsControls: List<Any>)

    public fun disabledStandardsControls(vararg disabledStandardsControls: Any)

    public fun standardsArn(standardsArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnStandard.Builder =
        software.amazon.awscdk.services.securityhub.CfnStandard.Builder.create(scope, id)

    override fun disabledStandardsControls(disabledStandardsControls: IResolvable) {
      cdkBuilder.disabledStandardsControls(disabledStandardsControls.let(IResolvable::unwrap))
    }

    override fun disabledStandardsControls(disabledStandardsControls: List<Any>) {
      cdkBuilder.disabledStandardsControls(disabledStandardsControls)
    }

    override fun disabledStandardsControls(vararg disabledStandardsControls: Any): Unit =
        disabledStandardsControls(disabledStandardsControls.toList())

    override fun standardsArn(standardsArn: String) {
      cdkBuilder.standardsArn(standardsArn)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnStandard = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStandard {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStandard(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnStandard):
        CfnStandard = CfnStandard(cdkObject)

    internal fun unwrap(wrapped: CfnStandard):
        software.amazon.awscdk.services.securityhub.CfnStandard = wrapped.cdkObject
  }

  public interface StandardsControlProperty {
    public fun reason(): String? = unwrap(this).getReason()

    public fun standardsControlArn(): String

    public interface Builder {
      public fun reason(reason: String)

      public fun standardsControlArn(standardsControlArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty.builder()

      override fun reason(reason: String) {
        cdkBuilder.reason(reason)
      }

      override fun standardsControlArn(standardsControlArn: String) {
        cdkBuilder.standardsControlArn(standardsControlArn)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty,
    ) : StandardsControlProperty {
      override fun reason(): String? = unwrap(this).getReason()

      override fun standardsControlArn(): String = unwrap(this).getStandardsControlArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StandardsControlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty):
          StandardsControlProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StandardsControlProperty):
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
