package io.cloudshiftdev.awscdk.services.waf.regional

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
  private val cdkObject: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun xssMatchTuples(): Any? = unwrap(this).getXssMatchTuples()

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
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.Builder.create(scope, id)

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun xssMatchTuples(xssMatchTuples: IResolvable) {
      cdkBuilder.xssMatchTuples(xssMatchTuples.let(IResolvable::unwrap))
    }

    public override fun xssMatchTuples(xssMatchTuples: List<Any>) {
      cdkBuilder.xssMatchTuples(xssMatchTuples)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnXssMatchSet =
        cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet):
        CfnXssMatchSet = CfnXssMatchSet(cdkObject)

    internal fun unwrap(wrapped: CfnXssMatchSet):
        software.amazon.awscdk.services.waf.regional.CfnXssMatchSet = wrapped.cdkObject
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
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.builder()

      public override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty =
          (wrapped as Wrapper).cdkObject
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
      @JvmName("454e5c0e938f8a9e73fbd373977052d42266159c8d8e51f3ec56b6f3e88f5759")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit) {
      }

      public fun textTransformation(textTransformation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.builder()

      public override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      public override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("454e5c0e938f8a9e73fbd373977052d42266159c8d8e51f3ec56b6f3e88f5759")
      public override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit
          = fieldToMatch(FieldToMatchProperty(fieldToMatch))

      public override fun textTransformation(textTransformation: String) {
        cdkBuilder.textTransformation(textTransformation)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty):
          XssMatchTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: XssMatchTupleProperty):
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
