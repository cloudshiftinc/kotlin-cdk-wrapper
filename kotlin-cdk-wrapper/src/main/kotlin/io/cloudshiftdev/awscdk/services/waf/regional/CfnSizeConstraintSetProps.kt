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
 * Properties for defining a `CfnSizeConstraintSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.regional.*;
 * CfnSizeConstraintSetProps cfnSizeConstraintSetProps = CfnSizeConstraintSetProps.builder()
 * .name("name")
 * // the properties below are optional
 * .sizeConstraints(List.of(SizeConstraintProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build())
 * .size(123)
 * .textTransformation("textTransformation")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html)
 */
public interface CfnSizeConstraintSetProps {
  /**
   * The name, if any, of the `SizeConstraintSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name)
   */
  public fun name(): String

  /**
   * The size constraint and the part of the web request to check.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
   */
  public fun sizeConstraints(): Any? = unwrap(this).getSizeConstraints()

  /**
   * A builder for [CfnSizeConstraintSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name, if any, of the `SizeConstraintSet` . 
     */
    public fun name(name: String)

    /**
     * @param sizeConstraints The size constraint and the part of the web request to check.
     */
    public fun sizeConstraints(sizeConstraints: IResolvable)

    /**
     * @param sizeConstraints The size constraint and the part of the web request to check.
     */
    public fun sizeConstraints(sizeConstraints: List<Any>)

    /**
     * @param sizeConstraints The size constraint and the part of the web request to check.
     */
    public fun sizeConstraints(vararg sizeConstraints: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.builder()

    /**
     * @param name The name, if any, of the `SizeConstraintSet` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param sizeConstraints The size constraint and the part of the web request to check.
     */
    override fun sizeConstraints(sizeConstraints: IResolvable) {
      cdkBuilder.sizeConstraints(sizeConstraints.let(IResolvable::unwrap))
    }

    /**
     * @param sizeConstraints The size constraint and the part of the web request to check.
     */
    override fun sizeConstraints(sizeConstraints: List<Any>) {
      cdkBuilder.sizeConstraints(sizeConstraints.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param sizeConstraints The size constraint and the part of the web request to check.
     */
    override fun sizeConstraints(vararg sizeConstraints: Any): Unit =
        sizeConstraints(sizeConstraints.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps,
  ) : CdkObject(cdkObject), CfnSizeConstraintSetProps {
    /**
     * The name, if any, of the `SizeConstraintSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The size constraint and the part of the web request to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
     */
    override fun sizeConstraints(): Any? = unwrap(this).getSizeConstraints()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSizeConstraintSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps):
        CfnSizeConstraintSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSizeConstraintSetProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSizeConstraintSetProps):
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps
  }
}
