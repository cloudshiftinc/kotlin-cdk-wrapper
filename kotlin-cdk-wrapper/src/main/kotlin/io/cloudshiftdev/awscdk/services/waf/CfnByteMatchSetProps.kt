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
 * Properties for defining a `CfnByteMatchSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.*;
 * CfnByteMatchSetProps cfnByteMatchSetProps = CfnByteMatchSetProps.builder()
 * .name("name")
 * // the properties below are optional
 * .byteMatchTuples(List.of(ByteMatchTupleProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build())
 * .positionalConstraint("positionalConstraint")
 * .textTransformation("textTransformation")
 * // the properties below are optional
 * .targetString("targetString")
 * .targetStringBase64("targetStringBase64")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html)
 */
public interface CfnByteMatchSetProps {
  /**
   * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
   * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
   * and other settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
   */
  public fun byteMatchTuples(): Any? = unwrap(this).getByteMatchTuples()

  /**
   * The name of the `ByteMatchSet` .
   *
   * You can't change `Name` after you create a `ByteMatchSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnByteMatchSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings.
     */
    public fun byteMatchTuples(byteMatchTuples: IResolvable)

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings.
     */
    public fun byteMatchTuples(byteMatchTuples: List<Any>)

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings.
     */
    public fun byteMatchTuples(vararg byteMatchTuples: Any)

    /**
     * @param name The name of the `ByteMatchSet` . 
     * You can't change `Name` after you create a `ByteMatchSet` .
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnByteMatchSetProps.Builder =
        software.amazon.awscdk.services.waf.CfnByteMatchSetProps.builder()

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings.
     */
    override fun byteMatchTuples(byteMatchTuples: IResolvable) {
      cdkBuilder.byteMatchTuples(byteMatchTuples.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings.
     */
    override fun byteMatchTuples(byteMatchTuples: List<Any>) {
      cdkBuilder.byteMatchTuples(byteMatchTuples.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings.
     */
    override fun byteMatchTuples(vararg byteMatchTuples: Any): Unit =
        byteMatchTuples(byteMatchTuples.toList())

    /**
     * @param name The name of the `ByteMatchSet` . 
     * You can't change `Name` after you create a `ByteMatchSet` .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.CfnByteMatchSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSetProps,
  ) : CdkObject(cdkObject),
      CfnByteMatchSetProps {
    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
     * and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
     */
    override fun byteMatchTuples(): Any? = unwrap(this).getByteMatchTuples()

    /**
     * The name of the `ByteMatchSet` .
     *
     * You can't change `Name` after you create a `ByteMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnByteMatchSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSetProps):
        CfnByteMatchSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnByteMatchSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnByteMatchSetProps):
        software.amazon.awscdk.services.waf.CfnByteMatchSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.waf.CfnByteMatchSetProps
  }
}
