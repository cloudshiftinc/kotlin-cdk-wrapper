package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRegexPatternSetProps {
  /**
   * A friendly name or description of the `RegexPatternSet` .
   *
   * You can't change `Name` after you create a `RegexPatternSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-name)
   */
  public fun name(): String

  /**
   * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such as
   * `B[a&#64;]dB[o0]t` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-regexpatternstrings)
   */
  public fun regexPatternStrings(): List<String>

  /**
   * A builder for [CfnRegexPatternSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name A friendly name or description of the `RegexPatternSet` . 
     * You can't change `Name` after you create a `RegexPatternSet` .
     */
    public fun name(name: String)

    /**
     * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want
     * AWS WAF to search for, such as `B[a&#64;]dB[o0]t` . 
     */
    public fun regexPatternStrings(regexPatternStrings: List<String>)

    /**
     * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want
     * AWS WAF to search for, such as `B[a&#64;]dB[o0]t` . 
     */
    public fun regexPatternStrings(vararg regexPatternStrings: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps.builder()

    /**
     * @param name A friendly name or description of the `RegexPatternSet` . 
     * You can't change `Name` after you create a `RegexPatternSet` .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want
     * AWS WAF to search for, such as `B[a&#64;]dB[o0]t` . 
     */
    override fun regexPatternStrings(regexPatternStrings: List<String>) {
      cdkBuilder.regexPatternStrings(regexPatternStrings)
    }

    /**
     * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want
     * AWS WAF to search for, such as `B[a&#64;]dB[o0]t` . 
     */
    override fun regexPatternStrings(vararg regexPatternStrings: String): Unit =
        regexPatternStrings(regexPatternStrings.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps,
  ) : CdkObject(cdkObject), CfnRegexPatternSetProps {
    /**
     * A friendly name or description of the `RegexPatternSet` .
     *
     * You can't change `Name` after you create a `RegexPatternSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such
     * as `B[a&#64;]dB[o0]t` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-regexpatternstrings)
     */
    override fun regexPatternStrings(): List<String> = unwrap(this).getRegexPatternStrings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegexPatternSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps):
        CfnRegexPatternSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegexPatternSetProps):
        software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps
  }
}
