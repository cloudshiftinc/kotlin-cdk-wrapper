@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnGeoMatchSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.regional.*;
 * CfnGeoMatchSetProps cfnGeoMatchSetProps = CfnGeoMatchSetProps.builder()
 * .name("name")
 * // the properties below are optional
 * .geoMatchConstraints(List.of(GeoMatchConstraintProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html)
 */
public interface CfnGeoMatchSetProps {
  /**
   * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
   * search for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
   */
  public fun geoMatchConstraints(): Any? = unwrap(this).getGeoMatchConstraints()

  /**
   * A friendly name or description of the `GeoMatchSet` .
   *
   * You can't change the name of an `GeoMatchSet` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnGeoMatchSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for.
     */
    public fun geoMatchConstraints(geoMatchConstraints: IResolvable)

    /**
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for.
     */
    public fun geoMatchConstraints(geoMatchConstraints: List<Any>)

    /**
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for.
     */
    public fun geoMatchConstraints(vararg geoMatchConstraints: Any)

    /**
     * @param name A friendly name or description of the `GeoMatchSet` . 
     * You can't change the name of an `GeoMatchSet` after you create it.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps.Builder
        = software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps.builder()

    /**
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for.
     */
    override fun geoMatchConstraints(geoMatchConstraints: IResolvable) {
      cdkBuilder.geoMatchConstraints(geoMatchConstraints.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for.
     */
    override fun geoMatchConstraints(geoMatchConstraints: List<Any>) {
      cdkBuilder.geoMatchConstraints(geoMatchConstraints.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the
     * country that you want AWS WAF to search for.
     */
    override fun geoMatchConstraints(vararg geoMatchConstraints: Any): Unit =
        geoMatchConstraints(geoMatchConstraints.toList())

    /**
     * @param name A friendly name or description of the `GeoMatchSet` . 
     * You can't change the name of an `GeoMatchSet` after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps,
  ) : CdkObject(cdkObject),
      CfnGeoMatchSetProps {
    /**
     * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
     * search for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
     */
    override fun geoMatchConstraints(): Any? = unwrap(this).getGeoMatchConstraints()

    /**
     * A friendly name or description of the `GeoMatchSet` .
     *
     * You can't change the name of an `GeoMatchSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGeoMatchSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps):
        CfnGeoMatchSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGeoMatchSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGeoMatchSetProps):
        software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps
  }
}
