package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRegexPatternSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A friendly name or description of the `RegexPatternSet` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A friendly name or description of the `RegexPatternSet` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such as
   * `B[a&#64;]dB[o0]t` .
   */
  public open fun regexPatternStrings(): List<String> = unwrap(this).getRegexPatternStrings()

  /**
   * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such as
   * `B[a&#64;]dB[o0]t` .
   */
  public open fun regexPatternStrings(`value`: List<String>) {
    unwrap(this).setRegexPatternStrings(`value`)
  }

  /**
   * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such as
   * `B[a&#64;]dB[o0]t` .
   */
  public open fun regexPatternStrings(vararg `value`: String): Unit =
      regexPatternStrings(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.regional.CfnRegexPatternSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A friendly name or description of the `RegexPatternSet` .
     *
     * You can't change `Name` after you create a `RegexPatternSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-name)
     * @param name A friendly name or description of the `RegexPatternSet` . 
     */
    public fun name(name: String)

    /**
     * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such
     * as `B[a&#64;]dB[o0]t` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-regexpatternstrings)
     * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want
     * AWS WAF to search for, such as `B[a&#64;]dB[o0]t` . 
     */
    public fun regexPatternStrings(regexPatternStrings: List<String>)

    /**
     * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such
     * as `B[a&#64;]dB[o0]t` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-regexpatternstrings)
     * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want
     * AWS WAF to search for, such as `B[a&#64;]dB[o0]t` . 
     */
    public fun regexPatternStrings(vararg regexPatternStrings: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet.Builder
        = software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet.Builder.create(scope, id)

    /**
     * A friendly name or description of the `RegexPatternSet` .
     *
     * You can't change `Name` after you create a `RegexPatternSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-name)
     * @param name A friendly name or description of the `RegexPatternSet` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such
     * as `B[a&#64;]dB[o0]t` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-regexpatternstrings)
     * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want
     * AWS WAF to search for, such as `B[a&#64;]dB[o0]t` . 
     */
    override fun regexPatternStrings(regexPatternStrings: List<String>) {
      cdkBuilder.regexPatternStrings(regexPatternStrings)
    }

    /**
     * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such
     * as `B[a&#64;]dB[o0]t` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html#cfn-wafregional-regexpatternset-regexpatternstrings)
     * @param regexPatternStrings Specifies the regular expression (regex) patterns that you want
     * AWS WAF to search for, such as `B[a&#64;]dB[o0]t` . 
     */
    override fun regexPatternStrings(vararg regexPatternStrings: String): Unit =
        regexPatternStrings(regexPatternStrings.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRegexPatternSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRegexPatternSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet):
        CfnRegexPatternSet = CfnRegexPatternSet(cdkObject)

    internal fun unwrap(wrapped: CfnRegexPatternSet):
        software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet = wrapped.cdkObject
  }
}
