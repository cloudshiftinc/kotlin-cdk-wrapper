package io.cloudshiftdev.awscdk.services.waf.regional

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

public open class CfnIPSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipSetDescriptors(): Any? = unwrap(this).getIpSetDescriptors()

  public open fun ipSetDescriptors(`value`: IResolvable) {
    unwrap(this).setIpSetDescriptors(`value`.let(IResolvable::unwrap))
  }

  public open fun ipSetDescriptors(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpSetDescriptors(__idx_ac66f0)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
    }

    public fun ipSetDescriptors(ipSetDescriptors: List<Any>) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnIPSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnIPSet.Builder.create(scope, id)

    public override fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors.let(IResolvable::unwrap))
    }

    public override fun ipSetDescriptors(ipSetDescriptors: List<Any>) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnIPSet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSet): CfnIPSet =
        CfnIPSet(cdkObject)

    internal fun unwrap(wrapped: CfnIPSet): software.amazon.awscdk.services.waf.regional.CfnIPSet =
        wrapped.cdkObject
  }

  public interface IPSetDescriptorProperty {
    public fun type(): String

    public fun `value`(): String

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty,
    ) : IPSetDescriptorProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty):
          IPSetDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetDescriptorProperty):
          software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
