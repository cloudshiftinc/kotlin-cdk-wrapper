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

public open class CfnGeoMatchSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun geoMatchConstraints(): Any? = unwrap(this).getGeoMatchConstraints()

  public open fun geoMatchConstraints(`value`: IResolvable) {
    unwrap(this).setGeoMatchConstraints(`value`.let(IResolvable::unwrap))
  }

  public open fun geoMatchConstraints(__idx_ac66f0: List<Any>) {
    unwrap(this).setGeoMatchConstraints(__idx_ac66f0)
  }

  public open fun geoMatchConstraints(vararg __idx_ac66f0: Any): Unit =
      geoMatchConstraints(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun geoMatchConstraints(geoMatchConstraints: IResolvable)

    public fun geoMatchConstraints(geoMatchConstraints: List<Any>)

    public fun geoMatchConstraints(vararg geoMatchConstraints: Any)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.Builder.create(scope, id)

    override fun geoMatchConstraints(geoMatchConstraints: IResolvable) {
      cdkBuilder.geoMatchConstraints(geoMatchConstraints.let(IResolvable::unwrap))
    }

    override fun geoMatchConstraints(geoMatchConstraints: List<Any>) {
      cdkBuilder.geoMatchConstraints(geoMatchConstraints)
    }

    override fun geoMatchConstraints(vararg geoMatchConstraints: Any): Unit =
        geoMatchConstraints(geoMatchConstraints.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGeoMatchSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGeoMatchSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet):
        CfnGeoMatchSet = CfnGeoMatchSet(cdkObject)

    internal fun unwrap(wrapped: CfnGeoMatchSet):
        software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet = wrapped.cdkObject
  }

  public interface GeoMatchConstraintProperty {
    public fun type(): String

    public fun `value`(): String

    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.GeoMatchConstraintProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.GeoMatchConstraintProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.GeoMatchConstraintProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.GeoMatchConstraintProperty,
    ) : GeoMatchConstraintProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GeoMatchConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.GeoMatchConstraintProperty):
          GeoMatchConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoMatchConstraintProperty):
          software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.GeoMatchConstraintProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
