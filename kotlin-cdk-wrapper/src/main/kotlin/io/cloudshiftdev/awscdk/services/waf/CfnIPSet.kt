@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.CfnIPSet,
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

  public open fun ipSetDescriptors(vararg __idx_ac66f0: Any): Unit =
      ipSetDescriptors(__idx_ac66f0.toList())

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun ipSetDescriptors(ipSetDescriptors: IResolvable)

    public fun ipSetDescriptors(ipSetDescriptors: List<Any>)

    public fun ipSetDescriptors(vararg ipSetDescriptors: Any)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnIPSet.Builder =
        software.amazon.awscdk.services.waf.CfnIPSet.Builder.create(scope, id)

    override fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors.let(IResolvable::unwrap))
    }

    override fun ipSetDescriptors(ipSetDescriptors: List<Any>) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors)
    }

    override fun ipSetDescriptors(vararg ipSetDescriptors: Any): Unit =
        ipSetDescriptors(ipSetDescriptors.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.CfnIPSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.CfnIPSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnIPSet): CfnIPSet =
        CfnIPSet(cdkObject)

    internal fun unwrap(wrapped: CfnIPSet): software.amazon.awscdk.services.waf.CfnIPSet =
        wrapped.cdkObject
  }

  public interface IPSetDescriptorProperty {
    public fun type(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty.Builder =
          software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty,
    ) : CdkObject(cdkObject), IPSetDescriptorProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty):
          IPSetDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetDescriptorProperty):
          software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.CfnIPSet.IPSetDescriptorProperty
    }
  }
}
