package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

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
      cdkBuilder.sizeConstraints(sizeConstraints)
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
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps,
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
        CfnSizeConstraintSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSizeConstraintSetProps):
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps
  }
}
