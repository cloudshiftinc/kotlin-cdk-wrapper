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

public open class CfnSqlInjectionMatchSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun sqlInjectionMatchTuples(): Any? = unwrap(this).getSqlInjectionMatchTuples()

  public open fun sqlInjectionMatchTuples(`value`: IResolvable) {
    unwrap(this).setSqlInjectionMatchTuples(`value`.let(IResolvable::unwrap))
  }

  public open fun sqlInjectionMatchTuples(__idx_ac66f0: List<Any>) {
    unwrap(this).setSqlInjectionMatchTuples(__idx_ac66f0)
  }

  public interface Builder {
    public fun name(name: String) {
    }

    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable) {
    }

    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.Builder =
        software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.Builder.create(scope, id)

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable) {
      cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples.let(IResolvable::unwrap))
    }

    public override fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: List<Any>) {
      cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples)
    }

    public fun build(): software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSqlInjectionMatchSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSqlInjectionMatchSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet):
        CfnSqlInjectionMatchSet = CfnSqlInjectionMatchSet(cdkObject)

    internal fun unwrap(wrapped: CfnSqlInjectionMatchSet):
        software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet = wrapped.cdkObject
  }

  public interface SqlInjectionMatchTupleProperty {
    public fun fieldToMatch(): Any

    public fun textTransformation(): String

    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable) {
      }

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("522215d3129446257bb4aa4945152208845b6984943377d4e956cbcbc560075d")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit) {
      }

      public fun textTransformation(textTransformation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder
          =
          software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.builder()

      public override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      public override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("522215d3129446257bb4aa4945152208845b6984943377d4e956cbcbc560075d")
      public override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit
          = fieldToMatch(FieldToMatchProperty(fieldToMatch))

      public override fun textTransformation(textTransformation: String) {
        cdkBuilder.textTransformation(textTransformation)
      }

      public fun build():
          software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty,
    ) : SqlInjectionMatchTupleProperty {
      public override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      public override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SqlInjectionMatchTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty):
          SqlInjectionMatchTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqlInjectionMatchTupleProperty):
          software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty
          = (wrapped as Wrapper).cdkObject
    }
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
          software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty.builder()

      public override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
