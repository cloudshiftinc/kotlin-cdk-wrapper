package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSizeConstraintSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.CfnSizeConstraintSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun sizeConstraints(): Any = unwrap(this).getSizeConstraints()

  public open fun sizeConstraints(`value`: IResolvable) {
    unwrap(this).setSizeConstraints(`value`.let(IResolvable::unwrap))
  }

  public open fun sizeConstraints(__idx_ac66f0: List<Any>) {
    unwrap(this).setSizeConstraints(__idx_ac66f0)
  }

  public interface Builder {
    public fun name(name: String)

    public fun sizeConstraints(sizeConstraints: IResolvable)

    public fun sizeConstraints(sizeConstraints: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnSizeConstraintSet.Builder =
        software.amazon.awscdk.services.waf.CfnSizeConstraintSet.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun sizeConstraints(sizeConstraints: IResolvable) {
      cdkBuilder.sizeConstraints(sizeConstraints.let(IResolvable::unwrap))
    }

    override fun sizeConstraints(sizeConstraints: List<Any>) {
      cdkBuilder.sizeConstraints(sizeConstraints)
    }

    public fun build(): software.amazon.awscdk.services.waf.CfnSizeConstraintSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSizeConstraintSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSizeConstraintSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnSizeConstraintSet):
        CfnSizeConstraintSet = CfnSizeConstraintSet(cdkObject)

    internal fun unwrap(wrapped: CfnSizeConstraintSet):
        software.amazon.awscdk.services.waf.CfnSizeConstraintSet = wrapped.cdkObject
  }

  public interface FieldToMatchProperty {
    public fun `data`(): String? = unwrap(this).getData()

    public fun type(): String

    public interface Builder {
      public fun `data`(`data`: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty.builder()

      override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty,
    ) : FieldToMatchProperty {
      override fun `data`(): String? = unwrap(this).getData()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SizeConstraintProperty {
    public fun comparisonOperator(): String

    public fun fieldToMatch(): Any

    public fun size(): Number

    public fun textTransformation(): String

    public interface Builder {
      public fun comparisonOperator(comparisonOperator: String)

      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e84c22fd91aa557474d19e3e7a140e28aed0e43f5cdf3842be73b1addb30b6c")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun size(size: Number)

      public fun textTransformation(textTransformation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder =
          software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.builder()

      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e84c22fd91aa557474d19e3e7a140e28aed0e43f5cdf3842be73b1addb30b6c")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      override fun textTransformation(textTransformation: String) {
        cdkBuilder.textTransformation(textTransformation)
      }

      public fun build():
          software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty,
    ) : SizeConstraintProperty {
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun size(): Number = unwrap(this).getSize()

      override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SizeConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty):
          SizeConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SizeConstraintProperty):
          software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
