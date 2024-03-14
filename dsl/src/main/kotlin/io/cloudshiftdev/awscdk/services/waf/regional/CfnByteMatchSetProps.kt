package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnByteMatchSetProps {
  /**
   * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
   * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
   * and other settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
   */
  public fun byteMatchTuples(): Any? = unwrap(this).getByteMatchTuples()

  /**
   * A friendly name or description of the `ByteMatchSet` .
   *
   * You can't change `Name` after you create a `ByteMatchSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-name)
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
     * @param name A friendly name or description of the `ByteMatchSet` . 
     * You can't change `Name` after you create a `ByteMatchSet` .
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps.builder()

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings.
     */
    override fun byteMatchTuples(byteMatchTuples: IResolvable) {
      cdkBuilder.byteMatchTuples(byteMatchTuples.let(IResolvable::unwrap))
    }

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings.
     */
    override fun byteMatchTuples(byteMatchTuples: List<Any>) {
      cdkBuilder.byteMatchTuples(byteMatchTuples)
    }

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings.
     */
    override fun byteMatchTuples(vararg byteMatchTuples: Any): Unit =
        byteMatchTuples(byteMatchTuples.toList())

    /**
     * @param name A friendly name or description of the `ByteMatchSet` . 
     * You can't change `Name` after you create a `ByteMatchSet` .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps,
  ) : CdkObject(cdkObject), CfnByteMatchSetProps {
    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
     * and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
     */
    override fun byteMatchTuples(): Any? = unwrap(this).getByteMatchTuples()

    /**
     * A friendly name or description of the `ByteMatchSet` .
     *
     * You can't change `Name` after you create a `ByteMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnByteMatchSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps):
        CfnByteMatchSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnByteMatchSetProps):
        software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps
  }
}
