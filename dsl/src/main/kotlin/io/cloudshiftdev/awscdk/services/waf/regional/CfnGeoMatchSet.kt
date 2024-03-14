package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGeoMatchSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
   * search for.
   */
  public open fun geoMatchConstraints(): Any? = unwrap(this).getGeoMatchConstraints()

  /**
   * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
   * search for.
   */
  public open fun geoMatchConstraints(`value`: IResolvable) {
    unwrap(this).setGeoMatchConstraints(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
   * search for.
   */
  public open fun geoMatchConstraints(__idx_ac66f0: List<Any>) {
    unwrap(this).setGeoMatchConstraints(__idx_ac66f0)
  }

  /**
   * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
   * search for.
   */
  public open fun geoMatchConstraints(vararg __idx_ac66f0: Any): Unit =
      geoMatchConstraints(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A friendly name or description of the `GeoMatchSet` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A friendly name or description of the `GeoMatchSet` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.regional.CfnGeoMatchSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
     * search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for. 
     */
    public fun geoMatchConstraints(geoMatchConstraints: IResolvable)

    /**
     * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
     * search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for. 
     */
    public fun geoMatchConstraints(geoMatchConstraints: List<Any>)

    /**
     * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
     * search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for. 
     */
    public fun geoMatchConstraints(vararg geoMatchConstraints: Any)

    /**
     * A friendly name or description of the `GeoMatchSet` .
     *
     * You can't change the name of an `GeoMatchSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-name)
     * @param name A friendly name or description of the `GeoMatchSet` . 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.Builder.create(scope, id)

    /**
     * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
     * search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for. 
     */
    override fun geoMatchConstraints(geoMatchConstraints: IResolvable) {
      cdkBuilder.geoMatchConstraints(geoMatchConstraints.let(IResolvable::unwrap))
    }

    /**
     * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
     * search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for. 
     */
    override fun geoMatchConstraints(geoMatchConstraints: List<Any>) {
      cdkBuilder.geoMatchConstraints(geoMatchConstraints)
    }

    /**
     * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
     * search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for. 
     */
    override fun geoMatchConstraints(vararg geoMatchConstraints: Any): Unit =
        geoMatchConstraints(geoMatchConstraints.toList())

    /**
     * A friendly name or description of the `GeoMatchSet` .
     *
     * You can't change the name of an `GeoMatchSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-name)
     * @param name A friendly name or description of the `GeoMatchSet` . 
     */
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
    /**
     * The type of geographical area you want AWS WAF to search for.
     *
     * Currently `Country` is the only valid value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-geomatchset-geomatchconstraint.html#cfn-wafregional-geomatchset-geomatchconstraint-type)
     */
    public fun type(): String

    /**
     * The country that you want AWS WAF to search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-geomatchset-geomatchconstraint.html#cfn-wafregional-geomatchset-geomatchconstraint-value)
     */
    public fun `value`(): String

    /**
     * A builder for [GeoMatchConstraintProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of geographical area you want AWS WAF to search for. 
       * Currently `Country` is the only valid value.
       */
      public fun type(type: String)

      /**
       * @param value The country that you want AWS WAF to search for. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.GeoMatchConstraintProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.GeoMatchConstraintProperty.builder()

      /**
       * @param type The type of geographical area you want AWS WAF to search for. 
       * Currently `Country` is the only valid value.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The country that you want AWS WAF to search for. 
       */
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
      /**
       * The type of geographical area you want AWS WAF to search for.
       *
       * Currently `Country` is the only valid value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-geomatchset-geomatchconstraint.html#cfn-wafregional-geomatchset-geomatchconstraint-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The country that you want AWS WAF to search for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-geomatchset-geomatchconstraint.html#cfn-wafregional-geomatchset-geomatchconstraint-value)
       */
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
