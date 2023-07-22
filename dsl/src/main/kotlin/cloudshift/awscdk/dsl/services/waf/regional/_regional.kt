@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSet
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps
import software.amazon.awscdk.services.waf.regional.CfnIPSet
import software.amazon.awscdk.services.waf.regional.CfnIPSetProps
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRule
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps
import software.amazon.awscdk.services.waf.regional.CfnRule
import software.amazon.awscdk.services.waf.regional.CfnRuleProps
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps
import software.amazon.awscdk.services.waf.regional.CfnWebACL
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps
import software.amazon.awscdk.services.waf.regional.CfnWebACLProps
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSet
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps
import software.constructs.Construct

public object regional {
  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * The `AWS::WAFRegional::ByteMatchSet` resource creates an AWS WAF `ByteMatchSet` that identifies
   * a part of a web request that you want to inspect.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnByteMatchSet cfnByteMatchSet = CfnByteMatchSet.Builder.create(this, "MyCfnByteMatchSet")
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html)
   */
  public inline fun cfnByteMatchSet(
    scope: Construct,
    id: String,
    block: CfnByteMatchSetDsl.() -> Unit = {},
  ): CfnByteMatchSet {
    val builder = CfnByteMatchSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to
   * search for in web requests, the location in requests that you want AWS WAF to search, and other
   * settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * ByteMatchTupleProperty byteMatchTupleProperty = ByteMatchTupleProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html)
   */
  public inline
      fun cfnByteMatchSetByteMatchTupleProperty(block: CfnByteMatchSetByteMatchTuplePropertyDsl.() -> Unit
      = {}): CfnByteMatchSet.ByteMatchTupleProperty {
    val builder = CfnByteMatchSetByteMatchTuplePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * Specifies where in a web request to look for `TargetString` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .data("data")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html)
   */
  public inline
      fun cfnByteMatchSetFieldToMatchProperty(block: CfnByteMatchSetFieldToMatchPropertyDsl.() -> Unit
      = {}): CfnByteMatchSet.FieldToMatchProperty {
    val builder = CfnByteMatchSetFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnByteMatchSet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html)
   */
  public inline fun cfnByteMatchSetProps(block: CfnByteMatchSetPropsDsl.() -> Unit = {}):
      CfnByteMatchSetProps {
    val builder = CfnByteMatchSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * Contains one or more countries that AWS WAF will search for.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnGeoMatchSet cfnGeoMatchSet = CfnGeoMatchSet.Builder.create(this, "MyCfnGeoMatchSet")
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
  public inline fun cfnGeoMatchSet(
    scope: Construct,
    id: String,
    block: CfnGeoMatchSetDsl.() -> Unit = {},
  ): CfnGeoMatchSet {
    val builder = CfnGeoMatchSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * The country from which web requests originate that you want AWS WAF to search for.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * GeoMatchConstraintProperty geoMatchConstraintProperty = GeoMatchConstraintProperty.builder()
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-geomatchset-geomatchconstraint.html)
   */
  public inline
      fun cfnGeoMatchSetGeoMatchConstraintProperty(block: CfnGeoMatchSetGeoMatchConstraintPropertyDsl.() -> Unit
      = {}): CfnGeoMatchSet.GeoMatchConstraintProperty {
    val builder = CfnGeoMatchSetGeoMatchConstraintPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnGeoMatchSet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
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
  public inline fun cfnGeoMatchSetProps(block: CfnGeoMatchSetPropsDsl.() -> Unit = {}):
      CfnGeoMatchSetProps {
    val builder = CfnGeoMatchSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * Contains one or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain
   * Routing (CIDR) notation. AWS WAF supports IPv4 address ranges: /8 and any range between /16
   * through /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56, /64, and /128.
   *
   * To specify an individual IP address, you specify the four-part IP address followed by a `/32` ,
   * for example, 192.0.2.0/32. To block a range of IP addresses, you can specify /8 or any range
   * between /16 through /32 (for IPv4) or /24, /32, /48, /56, /64, or /128 (for IPv6). For more
   * information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
   * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnIPSet cfnIPSet = CfnIPSet.Builder.create(this, "MyCfnIPSet")
   * .name("name")
   * // the properties below are optional
   * .ipSetDescriptors(List.of(Map.of(
   * "type", "type",
   * "value", "value")))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html)
   */
  public inline fun cfnIPSet(
    scope: Construct,
    id: String,
    block: CfnIPSetDsl.() -> Unit = {},
  ): CfnIPSet {
    val builder = CfnIPSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * Specifies the IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR format)
   * that web requests originate from.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * IPSetDescriptorProperty iPSetDescriptorProperty = Map.of(
   * "type", "type",
   * "value", "value");
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ipset-ipsetdescriptor.html)
   */
  public inline
      fun cfnIPSetIPSetDescriptorProperty(block: CfnIPSetIPSetDescriptorPropertyDsl.() -> Unit =
      {}): CfnIPSet.IPSetDescriptorProperty {
    val builder = CfnIPSetIPSetDescriptorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnIPSet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnIPSetProps cfnIPSetProps = CfnIPSetProps.builder()
   * .name("name")
   * // the properties below are optional
   * .ipSetDescriptors(List.of(Map.of(
   * "type", "type",
   * "value", "value")))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html)
   */
  public inline fun cfnIPSetProps(block: CfnIPSetPropsDsl.() -> Unit = {}): CfnIPSetProps {
    val builder = CfnIPSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * A `RateBasedRule` is identical to a regular `Rule` , with one addition: a `RateBasedRule`
   * counts the number of requests that arrive from a specified IP address every five minutes. For
   * example, based on recent requests that you've seen from an attacker, you might create a
   * `RateBasedRule` that includes the following conditions:
   *
   * * The requests come from 192.0.2.44.
   * * They contain the value `BadBot` in the `User-Agent` header.
   *
   * In the rule, you also define the rate limit as 15,000.
   *
   * Requests that meet both of these conditions and exceed 15,000 requests every five minutes
   * trigger the rule's action (block or count), which is defined in the web ACL.
   *
   * Note you can only create rate-based rules using an AWS CloudFormation template. To add the
   * rate-based rules created through AWS CloudFormation to a web ACL, use the AWS WAF console, API, or
   * command line interface (CLI). For more information, see
   * [UpdateWebACL](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateWebACL.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnRateBasedRule cfnRateBasedRule = CfnRateBasedRule.Builder.create(this, "MyCfnRateBasedRule")
   * .metricName("metricName")
   * .name("name")
   * .rateKey("rateKey")
   * .rateLimit(123)
   * // the properties below are optional
   * .matchPredicates(List.of(PredicateProperty.builder()
   * .dataId("dataId")
   * .negated(false)
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html)
   */
  public inline fun cfnRateBasedRule(
    scope: Construct,
    id: String,
    block: CfnRateBasedRuleDsl.() -> Unit = {},
  ): CfnRateBasedRule {
    val builder = CfnRateBasedRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` , `XssMatchSet` ,
   * `RegexMatchSet` , `GeoMatchSet` , and `SizeConstraintSet` objects that you want to add to a `Rule`
   * and, for each object, indicates whether you want to negate the settings, for example, requests
   * that do NOT originate from the IP address 192.0.2.44.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * PredicateProperty predicateProperty = PredicateProperty.builder()
   * .dataId("dataId")
   * .negated(false)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ratebasedrule-predicate.html)
   */
  public inline
      fun cfnRateBasedRulePredicateProperty(block: CfnRateBasedRulePredicatePropertyDsl.() -> Unit =
      {}): CfnRateBasedRule.PredicateProperty {
    val builder = CfnRateBasedRulePredicatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRateBasedRule`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnRateBasedRuleProps cfnRateBasedRuleProps = CfnRateBasedRuleProps.builder()
   * .metricName("metricName")
   * .name("name")
   * .rateKey("rateKey")
   * .rateLimit(123)
   * // the properties below are optional
   * .matchPredicates(List.of(PredicateProperty.builder()
   * .dataId("dataId")
   * .negated(false)
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ratebasedrule.html)
   */
  public inline fun cfnRateBasedRuleProps(block: CfnRateBasedRulePropsDsl.() -> Unit = {}):
      CfnRateBasedRuleProps {
    val builder = CfnRateBasedRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `RegexPatternSet` specifies the regular expression (regex) pattern that you want AWS WAF to
   * search for, such as `B[a&#64;]dB[o0]t` .
   *
   * You can then configure AWS WAF to reject those requests.
   *
   * Note that you can only create regex pattern sets using a AWS CloudFormation template. To add
   * the regex pattern sets created through AWS CloudFormation to a RegexMatchSet, use the AWS WAF
   * console, API, or command line interface (CLI). For more information, see
   * [UpdateRegexMatchSet](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateRegexMatchSet.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnRegexPatternSet cfnRegexPatternSet = CfnRegexPatternSet.Builder.create(this,
   * "MyCfnRegexPatternSet")
   * .name("name")
   * .regexPatternStrings(List.of("regexPatternStrings"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html)
   */
  public inline fun cfnRegexPatternSet(
    scope: Construct,
    id: String,
    block: CfnRegexPatternSetDsl.() -> Unit = {},
  ): CfnRegexPatternSet {
    val builder = CfnRegexPatternSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRegexPatternSet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnRegexPatternSetProps cfnRegexPatternSetProps = CfnRegexPatternSetProps.builder()
   * .name("name")
   * .regexPatternStrings(List.of("regexPatternStrings"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-regexpatternset.html)
   */
  public inline fun cfnRegexPatternSetProps(block: CfnRegexPatternSetPropsDsl.() -> Unit = {}):
      CfnRegexPatternSetProps {
    val builder = CfnRegexPatternSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * A combination of `ByteMatchSet` , `IPSet` , and/or `SqlInjectionMatchSet` objects that identify
   * the web requests that you want to allow, block, or count. For example, you might create a `Rule`
   * that includes the following predicates:
   *
   * * An `IPSet` that causes AWS WAF to search for web requests that originate from the IP address
   * `192.0.2.44`
   * * A `ByteMatchSet` that causes AWS WAF to search for web requests for which the value of the
   * `User-Agent` header is `BadBot` .
   *
   * To match the settings in this `Rule` , a request must originate from `192.0.2.44` AND include a
   * `User-Agent` header for which the value is `BadBot` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnRule cfnRule = CfnRule.Builder.create(this, "MyCfnRule")
   * .metricName("metricName")
   * .name("name")
   * // the properties below are optional
   * .predicates(List.of(PredicateProperty.builder()
   * .dataId("dataId")
   * .negated(false)
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html)
   */
  public inline fun cfnRule(
    scope: Construct,
    id: String,
    block: CfnRuleDsl.() -> Unit = {},
  ): CfnRule {
    val builder = CfnRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` , `XssMatchSet` ,
   * `RegexMatchSet` , `GeoMatchSet` , and `SizeConstraintSet` objects that you want to add to a `Rule`
   * and, for each object, indicates whether you want to negate the settings, for example, requests
   * that do NOT originate from the IP address 192.0.2.44.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * PredicateProperty predicateProperty = PredicateProperty.builder()
   * .dataId("dataId")
   * .negated(false)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html)
   */
  public inline fun cfnRulePredicateProperty(block: CfnRulePredicatePropertyDsl.() -> Unit = {}):
      CfnRule.PredicateProperty {
    val builder = CfnRulePredicatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRule`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
   * .metricName("metricName")
   * .name("name")
   * // the properties below are optional
   * .predicates(List.of(PredicateProperty.builder()
   * .dataId("dataId")
   * .negated(false)
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html)
   */
  public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
    val builder = CfnRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * A complex type that contains `SizeConstraint` objects, which specify the parts of web requests
   * that you want AWS WAF to inspect the size of. If a `SizeConstraintSet` contains more than one
   * `SizeConstraint` object, a request only needs to match one constraint to be considered a match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnSizeConstraintSet cfnSizeConstraintSet = CfnSizeConstraintSet.Builder.create(this,
   * "MyCfnSizeConstraintSet")
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
  public inline fun cfnSizeConstraintSet(
    scope: Construct,
    id: String,
    block: CfnSizeConstraintSetDsl.() -> Unit = {},
  ): CfnSizeConstraintSet {
    val builder = CfnSizeConstraintSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The part of a web request that you want AWS WAF to inspect, such as a specific header or a
   * query string.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .data("data")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html)
   */
  public inline
      fun cfnSizeConstraintSetFieldToMatchProperty(block: CfnSizeConstraintSetFieldToMatchPropertyDsl.() -> Unit
      = {}): CfnSizeConstraintSet.FieldToMatchProperty {
    val builder = CfnSizeConstraintSetFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSizeConstraintSet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
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
  public inline fun cfnSizeConstraintSetProps(block: CfnSizeConstraintSetPropsDsl.() -> Unit = {}):
      CfnSizeConstraintSetProps {
    val builder = CfnSizeConstraintSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * Specifies a constraint on the size of a part of the web request. AWS WAF uses the `Size` ,
   * `ComparisonOperator` , and `FieldToMatch` to build an expression in the form of " `Size`
   * `ComparisonOperator` size in bytes of `FieldToMatch` ". If that expression is true, the
   * `SizeConstraint` is considered to match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * SizeConstraintProperty sizeConstraintProperty = SizeConstraintProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .fieldToMatch(FieldToMatchProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .data("data")
   * .build())
   * .size(123)
   * .textTransformation("textTransformation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html)
   */
  public inline
      fun cfnSizeConstraintSetSizeConstraintProperty(block: CfnSizeConstraintSetSizeConstraintPropertyDsl.() -> Unit
      = {}): CfnSizeConstraintSet.SizeConstraintProperty {
    val builder = CfnSizeConstraintSetSizeConstraintPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * A complex type that contains `SqlInjectionMatchTuple` objects, which specify the parts of web
   * requests that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS
   * WAF to inspect a header, the name of the header. If a `SqlInjectionMatchSet` contains more than
   * one `SqlInjectionMatchTuple` object, a request needs to include snippets of SQL code in only one
   * of the specified parts of the request to be considered a match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnSqlInjectionMatchSet cfnSqlInjectionMatchSet = CfnSqlInjectionMatchSet.Builder.create(this,
   * "MyCfnSqlInjectionMatchSet")
   * .name("name")
   * // the properties below are optional
   * .sqlInjectionMatchTuples(List.of(SqlInjectionMatchTupleProperty.builder()
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html)
   */
  public inline fun cfnSqlInjectionMatchSet(
    scope: Construct,
    id: String,
    block: CfnSqlInjectionMatchSetDsl.() -> Unit = {},
  ): CfnSqlInjectionMatchSet {
    val builder = CfnSqlInjectionMatchSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The part of a web request that you want AWS WAF to inspect, such as a specific header or a
   * query string.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .data("data")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-fieldtomatch.html)
   */
  public inline
      fun cfnSqlInjectionMatchSetFieldToMatchProperty(block: CfnSqlInjectionMatchSetFieldToMatchPropertyDsl.() -> Unit
      = {}): CfnSqlInjectionMatchSet.FieldToMatchProperty {
    val builder = CfnSqlInjectionMatchSetFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSqlInjectionMatchSet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnSqlInjectionMatchSetProps cfnSqlInjectionMatchSetProps =
   * CfnSqlInjectionMatchSetProps.builder()
   * .name("name")
   * // the properties below are optional
   * .sqlInjectionMatchTuples(List.of(SqlInjectionMatchTupleProperty.builder()
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html)
   */
  public inline fun cfnSqlInjectionMatchSetProps(block: CfnSqlInjectionMatchSetPropsDsl.() -> Unit =
      {}): CfnSqlInjectionMatchSetProps {
    val builder = CfnSqlInjectionMatchSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious
   * SQL code and, if you want AWS WAF to inspect a header, the name of the header.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * SqlInjectionMatchTupleProperty sqlInjectionMatchTupleProperty =
   * SqlInjectionMatchTupleProperty.builder()
   * .fieldToMatch(FieldToMatchProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .data("data")
   * .build())
   * .textTransformation("textTransformation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple.html)
   */
  public inline
      fun cfnSqlInjectionMatchSetSqlInjectionMatchTupleProperty(block: CfnSqlInjectionMatchSetSqlInjectionMatchTuplePropertyDsl.() -> Unit
      = {}): CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty {
    val builder = CfnSqlInjectionMatchSetSqlInjectionMatchTuplePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * Contains the `Rules` that identify the requests that you want to allow, block, or count. In a
   * `WebACL` , you also specify a default action ( `ALLOW` or `BLOCK` ), and the action for each
   * `Rule` that you add to a `WebACL` , for example, block requests from specified IP addresses or
   * block requests from specified referrers. If you add more than one `Rule` to a `WebACL` , a request
   * needs to match only one of the specifications to be allowed, blocked, or counted.
   *
   * To identify the requests that you want AWS WAF to filter, you associate the `WebACL` with an
   * API Gateway API or an Application Load Balancer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnWebACL cfnWebACL = CfnWebACL.Builder.create(this, "MyCfnWebACL")
   * .defaultAction(ActionProperty.builder()
   * .type("type")
   * .build())
   * .metricName("metricName")
   * .name("name")
   * // the properties below are optional
   * .rules(List.of(RuleProperty.builder()
   * .action(ActionProperty.builder()
   * .type("type")
   * .build())
   * .priority(123)
   * .ruleId("ruleId")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html)
   */
  public inline fun cfnWebACL(
    scope: Construct,
    id: String,
    block: CfnWebACLDsl.() -> Unit = {},
  ): CfnWebACL {
    val builder = CfnWebACLDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the action AWS WAF takes when a web request matches or doesn't match all rule
   * conditions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-action.html)
   */
  public inline fun cfnWebACLActionProperty(block: CfnWebACLActionPropertyDsl.() -> Unit = {}):
      CfnWebACL.ActionProperty {
    val builder = CfnWebACLActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * The AWS::WAFRegional::WebACLAssociation resource associates an AWS WAF Regional web access
   * control group (ACL) with a resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnWebACLAssociation cfnWebACLAssociation = CfnWebACLAssociation.Builder.create(this,
   * "MyCfnWebACLAssociation")
   * .resourceArn("resourceArn")
   * .webAclId("webAclId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html)
   */
  public inline fun cfnWebACLAssociation(
    scope: Construct,
    id: String,
    block: CfnWebACLAssociationDsl.() -> Unit = {},
  ): CfnWebACLAssociation {
    val builder = CfnWebACLAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnWebACLAssociation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnWebACLAssociationProps cfnWebACLAssociationProps = CfnWebACLAssociationProps.builder()
   * .resourceArn("resourceArn")
   * .webAclId("webAclId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html)
   */
  public inline fun cfnWebACLAssociationProps(block: CfnWebACLAssociationPropsDsl.() -> Unit = {}):
      CfnWebACLAssociationProps {
    val builder = CfnWebACLAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnWebACL`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnWebACLProps cfnWebACLProps = CfnWebACLProps.builder()
   * .defaultAction(ActionProperty.builder()
   * .type("type")
   * .build())
   * .metricName("metricName")
   * .name("name")
   * // the properties below are optional
   * .rules(List.of(RuleProperty.builder()
   * .action(ActionProperty.builder()
   * .type("type")
   * .build())
   * .priority(123)
   * .ruleId("ruleId")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html)
   */
  public inline fun cfnWebACLProps(block: CfnWebACLPropsDsl.() -> Unit = {}): CfnWebACLProps {
    val builder = CfnWebACLPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A combination of `ByteMatchSet` , `IPSet` , and/or `SqlInjectionMatchSet` objects that identify
   * the web requests that you want to allow, block, or count.
   *
   * For example, you might create a `Rule` that includes the following predicates:
   *
   * * An `IPSet` that causes AWS WAF to search for web requests that originate from the IP address
   * `192.0.2.44`
   * * A `ByteMatchSet` that causes AWS WAF to search for web requests for which the value of the
   * `User-Agent` header is `BadBot` .
   *
   * To match the settings in this `Rule` , a request must originate from `192.0.2.44` AND include a
   * `User-Agent` header for which the value is `BadBot` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * RuleProperty ruleProperty = RuleProperty.builder()
   * .action(ActionProperty.builder()
   * .type("type")
   * .build())
   * .priority(123)
   * .ruleId("ruleId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html)
   */
  public inline fun cfnWebACLRuleProperty(block: CfnWebACLRulePropertyDsl.() -> Unit = {}):
      CfnWebACL.RuleProperty {
    val builder = CfnWebACLRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * A complex type that contains `XssMatchTuple` objects, which specify the parts of web requests
   * that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to
   * inspect a header, the name of the header. If a `XssMatchSet` contains more than one
   * `XssMatchTuple` object, a request needs to include cross-site scripting attacks in only one of the
   * specified parts of the request to be considered a match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnXssMatchSet cfnXssMatchSet = CfnXssMatchSet.Builder.create(this, "MyCfnXssMatchSet")
   * .name("name")
   * // the properties below are optional
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html)
   */
  public inline fun cfnXssMatchSet(
    scope: Construct,
    id: String,
    block: CfnXssMatchSetDsl.() -> Unit = {},
  ): CfnXssMatchSet {
    val builder = CfnXssMatchSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The part of a web request that you want AWS WAF to inspect, such as a specific header or a
   * query string.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .data("data")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-fieldtomatch.html)
   */
  public inline
      fun cfnXssMatchSetFieldToMatchProperty(block: CfnXssMatchSetFieldToMatchPropertyDsl.() -> Unit
      = {}): CfnXssMatchSet.FieldToMatchProperty {
    val builder = CfnXssMatchSetFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnXssMatchSet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * CfnXssMatchSetProps cfnXssMatchSetProps = CfnXssMatchSetProps.builder()
   * .name("name")
   * // the properties below are optional
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html)
   */
  public inline fun cfnXssMatchSetProps(block: CfnXssMatchSetPropsDsl.() -> Unit = {}):
      CfnXssMatchSetProps {
    val builder = CfnXssMatchSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting
   * attacks and, if you want AWS WAF to inspect a header, the name of the header.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.waf.regional.*;
   * XssMatchTupleProperty xssMatchTupleProperty = XssMatchTupleProperty.builder()
   * .fieldToMatch(FieldToMatchProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .data("data")
   * .build())
   * .textTransformation("textTransformation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html)
   */
  public inline
      fun cfnXssMatchSetXssMatchTupleProperty(block: CfnXssMatchSetXssMatchTuplePropertyDsl.() -> Unit
      = {}): CfnXssMatchSet.XssMatchTupleProperty {
    val builder = CfnXssMatchSetXssMatchTuplePropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
