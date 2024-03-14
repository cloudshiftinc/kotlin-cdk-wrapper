package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnXssMatchSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.CfnXssMatchSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun xssMatchTuples(): Any = unwrap(this).getXssMatchTuples()

  public open fun xssMatchTuples(`value`: IResolvable) {
    unwrap(this).setXssMatchTuples(`value`.let(IResolvable::unwrap))
  }

  public open fun xssMatchTuples(__idx_ac66f0: List<Any>) {
    unwrap(this).setXssMatchTuples(__idx_ac66f0)
  }

  public interface Builder {
    public fun name(name: String) {
    }

    public fun xssMatchTuples(xssMatchTuples: IResolvable) {
    }

    public fun xssMatchTuples(xssMatchTuples: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnXssMatchSet.Builder =
        software.amazon.awscdk.services.waf.CfnXssMatchSet.Builder.create(scope, id)

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun xssMatchTuples(xssMatchTuples: IResolvable) {
      cdkBuilder.xssMatchTuples(xssMatchTuples.let(IResolvable::unwrap))
    }

    public override fun xssMatchTuples(xssMatchTuples: List<Any>) {
      cdkBuilder.xssMatchTuples(xssMatchTuples)
    }

    public fun build(): software.amazon.awscdk.services.waf.CfnXssMatchSet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnXssMatchSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnXssMatchSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnXssMatchSet): CfnXssMatchSet
        = CfnXssMatchSet(cdkObject)

    internal fun unwrap(wrapped: CfnXssMatchSet): software.amazon.awscdk.services.waf.CfnXssMatchSet
        = wrapped.cdkObject
  }

  public interface FieldToMatchProperty {
    public fun `data`(): String? = unwrap(this).getData()

    public fun type(): String

    public interface Builder {
      public fun `data`(`data`: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.builder()

      public override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty,
    ) : FieldToMatchProperty {
      public override fun `data`(): String? = unwrap(this).getData()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface XssMatchTupleProperty {
    public fun fieldToMatch(): Any

    public fun textTransformation(): String

    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable) {
      }

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47bb5ca2e33d29003271aa6e4129db59963d3136a0030377a4713b27f87971ac")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit) {
      }

      public fun textTransformation(textTransformation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.Builder =
          software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.builder()

      public override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      public override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47bb5ca2e33d29003271aa6e4129db59963d3136a0030377a4713b27f87971ac")
      public override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit
          = fieldToMatch(FieldToMatchProperty(fieldToMatch))

      public override fun textTransformation(textTransformation: String) {
        cdkBuilder.textTransformation(textTransformation)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty,
    ) : XssMatchTupleProperty {
      public override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      public override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): XssMatchTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty):
          XssMatchTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: XssMatchTupleProperty):
          software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
