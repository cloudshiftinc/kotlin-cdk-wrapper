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

public open class CfnXssMatchSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet,
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

  public open fun xssMatchTuples(vararg __idx_ac66f0: Any): Unit =
      xssMatchTuples(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun xssMatchTuples(xssMatchTuples: IResolvable)

    public fun xssMatchTuples(xssMatchTuples: List<Any>)

    public fun xssMatchTuples(vararg xssMatchTuples: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun xssMatchTuples(xssMatchTuples: IResolvable) {
      cdkBuilder.xssMatchTuples(xssMatchTuples.let(IResolvable::unwrap))
    }

    override fun xssMatchTuples(xssMatchTuples: List<Any>) {
      cdkBuilder.xssMatchTuples(xssMatchTuples)
    }

    override fun xssMatchTuples(vararg xssMatchTuples: Any): Unit =
        xssMatchTuples(xssMatchTuples.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnXssMatchSet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun `data`(`data`: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.builder()

      override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty
    }
  }

  public interface XssMatchTupleProperty {
    public fun fieldToMatch(): Any

    public fun textTransformation(): String

    @CdkDslMarker
    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("454e5c0e938f8a9e73fbd373977052d42266159c8d8e51f3ec56b6f3e88f5759")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun textTransformation(textTransformation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("454e5c0e938f8a9e73fbd373977052d42266159c8d8e51f3ec56b6f3e88f5759")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun textTransformation(textTransformation: String) {
        cdkBuilder.textTransformation(textTransformation)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty,
    ) : CdkObject(cdkObject), XssMatchTupleProperty {
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): XssMatchTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty):
          XssMatchTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: XssMatchTupleProperty):
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty
    }
  }
}
