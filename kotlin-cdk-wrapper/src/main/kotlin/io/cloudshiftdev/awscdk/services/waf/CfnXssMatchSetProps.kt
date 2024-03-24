@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnXssMatchSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.*;
 * CfnXssMatchSetProps cfnXssMatchSetProps = CfnXssMatchSetProps.builder()
 * .name("name")
 * .xssMatchTuples(List.of(XssMatchTupleProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build())
 * .textTransformation("textTransformation")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html)
 */
public interface CfnXssMatchSetProps {
  /**
   * The name, if any, of the `XssMatchSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-name)
   */
  public fun name(): String

  /**
   * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples)
   */
  public fun xssMatchTuples(): Any

  /**
   * A builder for [CfnXssMatchSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name, if any, of the `XssMatchSet` . 
     */
    public fun name(name: String)

    /**
     * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
     * cross-site scripting attacks. 
     */
    public fun xssMatchTuples(xssMatchTuples: IResolvable)

    /**
     * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
     * cross-site scripting attacks. 
     */
    public fun xssMatchTuples(xssMatchTuples: List<Any>)

    /**
     * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
     * cross-site scripting attacks. 
     */
    public fun xssMatchTuples(vararg xssMatchTuples: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnXssMatchSetProps.Builder =
        software.amazon.awscdk.services.waf.CfnXssMatchSetProps.builder()

    /**
     * @param name The name, if any, of the `XssMatchSet` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
     * cross-site scripting attacks. 
     */
    override fun xssMatchTuples(xssMatchTuples: IResolvable) {
      cdkBuilder.xssMatchTuples(xssMatchTuples.let(IResolvable::unwrap))
    }

    /**
     * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
     * cross-site scripting attacks. 
     */
    override fun xssMatchTuples(xssMatchTuples: List<Any>) {
      cdkBuilder.xssMatchTuples(xssMatchTuples.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
     * cross-site scripting attacks. 
     */
    override fun xssMatchTuples(vararg xssMatchTuples: Any): Unit =
        xssMatchTuples(xssMatchTuples.toList())

    public fun build(): software.amazon.awscdk.services.waf.CfnXssMatchSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.waf.CfnXssMatchSetProps,
  ) : CdkObject(cdkObject), CfnXssMatchSetProps {
    /**
     * The name, if any, of the `XssMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies the parts of web requests that you want to inspect for cross-site scripting
     * attacks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples)
     */
    override fun xssMatchTuples(): Any = unwrap(this).getXssMatchTuples()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnXssMatchSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnXssMatchSetProps):
        CfnXssMatchSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnXssMatchSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnXssMatchSetProps):
        software.amazon.awscdk.services.waf.CfnXssMatchSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.waf.CfnXssMatchSetProps
  }
}
