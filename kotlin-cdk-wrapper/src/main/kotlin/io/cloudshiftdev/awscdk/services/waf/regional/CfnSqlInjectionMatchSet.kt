@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSqlInjectionMatchSet internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet,
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

  public open fun sqlInjectionMatchTuples(vararg __idx_ac66f0: Any): Unit =
      sqlInjectionMatchTuples(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable)

    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: List<Any>)

    public fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.Builder.create(scope,
        id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable) {
      cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples.let(IResolvable::unwrap))
    }

    override fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: List<Any>) {
      cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples)
    }

    override fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any): Unit =
        sqlInjectionMatchTuples(sqlInjectionMatchTuples.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSqlInjectionMatchSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSqlInjectionMatchSet(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet):
        CfnSqlInjectionMatchSet = CfnSqlInjectionMatchSet(cdkObject)

    internal fun unwrap(wrapped: CfnSqlInjectionMatchSet):
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet = wrapped.cdkObject
  }

  public interface SqlInjectionMatchTupleProperty {
    public fun fieldToMatch(): Any

    public fun textTransformation(): String

    @CdkDslMarker
    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0329257087ae83ced0d438bda6498a47db7d7efbcb5002097eb20c0b81c1e1b8")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun textTransformation(textTransformation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0329257087ae83ced0d438bda6498a47db7d7efbcb5002097eb20c0b81c1e1b8")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun textTransformation(textTransformation: String) {
        cdkBuilder.textTransformation(textTransformation)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty,
    ) : CdkObject(cdkObject), SqlInjectionMatchTupleProperty {
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqlInjectionMatchTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty):
          SqlInjectionMatchTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqlInjectionMatchTupleProperty):
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty
    }
  }

  public interface FieldToMatchProperty {
    public fun `data`(): String? = unwrap(this).getData()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun `data`(`data`: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.builder()

      override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty,
    ) : CdkObject(cdkObject), FieldToMatchProperty {
      override fun `data`(): String? = unwrap(this).getData()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty
    }
  }
}
