@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.waf

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnByteMatchSet
import software.amazon.awscdk.services.waf.CfnByteMatchSetProps
import software.amazon.awscdk.services.waf.CfnIPSet
import software.amazon.awscdk.services.waf.CfnIPSetProps
import software.amazon.awscdk.services.waf.CfnRule
import software.amazon.awscdk.services.waf.CfnRuleProps
import software.amazon.awscdk.services.waf.CfnSizeConstraintSet
import software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps
import software.amazon.awscdk.services.waf.CfnWebACL
import software.amazon.awscdk.services.waf.CfnWebACLProps
import software.amazon.awscdk.services.waf.CfnXssMatchSet
import software.amazon.awscdk.services.waf.CfnXssMatchSetProps
import software.constructs.Construct

public object waf {
    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * The `AWS::WAF::ByteMatchSet` resource creates an AWS WAF `ByteMatchSet` that identifies a
     * part of a web request that you want to inspect.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html)
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
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF
     * to search for in web requests, the location in requests that you want AWS WAF to search, and
     * other settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html)
     */
    public inline fun cfnByteMatchSetByteMatchTupleProperty(
        block: CfnByteMatchSetByteMatchTuplePropertyDsl.() -> Unit = {}
    ): CfnByteMatchSet.ByteMatchTupleProperty {
        val builder = CfnByteMatchSetByteMatchTuplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * Specifies where in a web request to look for `TargetString` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-fieldtomatch.html)
     */
    public inline fun cfnByteMatchSetFieldToMatchProperty(
        block: CfnByteMatchSetFieldToMatchPropertyDsl.() -> Unit = {}
    ): CfnByteMatchSet.FieldToMatchProperty {
        val builder = CfnByteMatchSetFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnByteMatchSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
    public inline fun cfnByteMatchSetProps(
        block: CfnByteMatchSetPropsDsl.() -> Unit = {}
    ): CfnByteMatchSetProps {
        val builder = CfnByteMatchSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * Contains one or more IP addresses or blocks of IP addresses specified in Classless
     * Inter-Domain Routing (CIDR) notation. AWS WAF supports IPv4 address ranges: /8 and any range
     * between /16 through /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56, /64, and
     * /128.
     *
     * To specify an individual IP address, you specify the four-part IP address followed by a `/32`
     * , for example, 192.0.2.0/32. To block a range of IP addresses, you can specify /8 or any
     * range between /16 through /32 (for IPv4) or /24, /32, /48, /56, /64, or /128 (for IPv6). For
     * more information about CIDR notation, see the Wikipedia entry
     * [Classless Inter-Domain Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * CfnIPSet cfnIPSet = CfnIPSet.Builder.create(this, "MyCfnIPSet")
     * .name("name")
     * // the properties below are optional
     * .ipSetDescriptors(List.of(Map.of(
     * "type", "type",
     * "value", "value")))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html)
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
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * Specifies the IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR format)
     * that web requests originate from.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * IPSetDescriptorProperty iPSetDescriptorProperty = Map.of(
     * "type", "type",
     * "value", "value");
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptor.html)
     */
    public inline fun cfnIPSetIPSetDescriptorProperty(
        block: CfnIPSetIPSetDescriptorPropertyDsl.() -> Unit = {}
    ): CfnIPSet.IPSetDescriptorProperty {
        val builder = CfnIPSetIPSetDescriptorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIPSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * CfnIPSetProps cfnIPSetProps = CfnIPSetProps.builder()
     * .name("name")
     * // the properties below are optional
     * .ipSetDescriptors(List.of(Map.of(
     * "type", "type",
     * "value", "value")))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html)
     */
    public inline fun cfnIPSetProps(block: CfnIPSetPropsDsl.() -> Unit = {}): CfnIPSetProps {
        val builder = CfnIPSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * A combination of `ByteMatchSet` , `IPSet` , and/or `SqlInjectionMatchSet` objects that
     * identify the web requests that you want to allow, block, or count. For example, you might
     * create a `Rule` that includes the following predicates:
     * * An `IPSet` that causes AWS WAF to search for web requests that originate from the IP
     *   address `192.0.2.44`
     * * A `ByteMatchSet` that causes AWS WAF to search for web requests for which the value of the
     *   `User-Agent` header is `BadBot` .
     *
     * To match the settings in this `Rule` , a request must originate from `192.0.2.44` AND include
     * a `User-Agent` header for which the value is `BadBot` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html)
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
     * `RegexMatchSet` , `GeoMatchSet` , and `SizeConstraintSet` objects that you want to add to a
     * `Rule` and, for each object, indicates whether you want to negate the settings, for example,
     * requests that do NOT originate from the IP address 192.0.2.44.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * PredicateProperty predicateProperty = PredicateProperty.builder()
     * .dataId("dataId")
     * .negated(false)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicate.html)
     */
    public inline fun cfnRulePredicateProperty(
        block: CfnRulePredicatePropertyDsl.() -> Unit = {}
    ): CfnRule.PredicateProperty {
        val builder = CfnRulePredicatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html)
     */
    public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
        val builder = CfnRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * A complex type that contains `SizeConstraint` objects, which specify the parts of web
     * requests that you want AWS WAF to inspect the size of. If a `SizeConstraintSet` contains more
     * than one `SizeConstraint` object, a request only needs to match one constraint to be
     * considered a match.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * CfnSizeConstraintSet cfnSizeConstraintSet = CfnSizeConstraintSet.Builder.create(this,
     * "MyCfnSizeConstraintSet")
     * .name("name")
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html)
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
     * The part of a web request that you want to inspect, such as a specified header or a query
     * string.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-fieldtomatch.html)
     */
    public inline fun cfnSizeConstraintSetFieldToMatchProperty(
        block: CfnSizeConstraintSetFieldToMatchPropertyDsl.() -> Unit = {}
    ): CfnSizeConstraintSet.FieldToMatchProperty {
        val builder = CfnSizeConstraintSetFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSizeConstraintSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * CfnSizeConstraintSetProps cfnSizeConstraintSetProps = CfnSizeConstraintSetProps.builder()
     * .name("name")
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html)
     */
    public inline fun cfnSizeConstraintSetProps(
        block: CfnSizeConstraintSetPropsDsl.() -> Unit = {}
    ): CfnSizeConstraintSetProps {
        val builder = CfnSizeConstraintSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * Specifies a constraint on the size of a part of the web request. AWS WAF uses the `Size` ,
     * `ComparisonOperator` , and `FieldToMatch` to build an expression in the form of " `Size`
     * `ComparisonOperator` size in bytes of `FieldToMatch` ". If that expression is true, the
     * `SizeConstraint` is considered to match.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html)
     */
    public inline fun cfnSizeConstraintSetSizeConstraintProperty(
        block: CfnSizeConstraintSetSizeConstraintPropertyDsl.() -> Unit = {}
    ): CfnSizeConstraintSet.SizeConstraintProperty {
        val builder = CfnSizeConstraintSetSizeConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * A complex type that contains `SqlInjectionMatchTuple` objects, which specify the parts of web
     * requests that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want
     * AWS WAF to inspect a header, the name of the header. If a `SqlInjectionMatchSet` contains
     * more than one `SqlInjectionMatchTuple` object, a request needs to include snippets of SQL
     * code in only one of the specified parts of the request to be considered a match.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html)
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
     * The part of a web request that you want to inspect, such as a specified header or a query
     * string.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-fieldtomatch.html)
     */
    public inline fun cfnSqlInjectionMatchSetFieldToMatchProperty(
        block: CfnSqlInjectionMatchSetFieldToMatchPropertyDsl.() -> Unit = {}
    ): CfnSqlInjectionMatchSet.FieldToMatchProperty {
        val builder = CfnSqlInjectionMatchSetFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSqlInjectionMatchSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html)
     */
    public inline fun cfnSqlInjectionMatchSetProps(
        block: CfnSqlInjectionMatchSetPropsDsl.() -> Unit = {}
    ): CfnSqlInjectionMatchSetProps {
        val builder = CfnSqlInjectionMatchSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * Specifies the part of a web request that you want AWS WAF to inspect for snippets of
     * malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuple.html)
     */
    public inline fun cfnSqlInjectionMatchSetSqlInjectionMatchTupleProperty(
        block: CfnSqlInjectionMatchSetSqlInjectionMatchTuplePropertyDsl.() -> Unit = {}
    ): CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty {
        val builder = CfnSqlInjectionMatchSetSqlInjectionMatchTuplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * Contains the `Rules` that identify the requests that you want to allow, block, or count. In a
     * `WebACL` , you also specify a default action ( `ALLOW` or `BLOCK` ), and the action for each
     * `Rule` that you add to a `WebACL` , for example, block requests from specified IP addresses
     * or block requests from specified referrers. You also associate the `WebACL` with a Amazon
     * CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add
     * more than one `Rule` to a `WebACL` , a request needs to match only one of the specifications
     * to be allowed, blocked, or counted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * CfnWebACL cfnWebACL = CfnWebACL.Builder.create(this, "MyCfnWebACL")
     * .defaultAction(WafActionProperty.builder()
     * .type("type")
     * .build())
     * .metricName("metricName")
     * .name("name")
     * // the properties below are optional
     * .rules(List.of(ActivatedRuleProperty.builder()
     * .priority(123)
     * .ruleId("ruleId")
     * // the properties below are optional
     * .action(WafActionProperty.builder()
     * .type("type")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html)
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
     * The `ActivatedRule` object in an `UpdateWebACL` request specifies a `Rule` that you want to
     * insert or delete, the priority of the `Rule` in the `WebACL` , and the action that you want
     * AWS WAF to take when a web request matches the `Rule` ( `ALLOW` , `BLOCK` , or `COUNT` ).
     *
     * To specify whether to insert or delete a `Rule` , use the `Action` parameter in the
     * `WebACLUpdate` data type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * ActivatedRuleProperty activatedRuleProperty = ActivatedRuleProperty.builder()
     * .priority(123)
     * .ruleId("ruleId")
     * // the properties below are optional
     * .action(WafActionProperty.builder()
     * .type("type")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-activatedrule.html)
     */
    public inline fun cfnWebACLActivatedRuleProperty(
        block: CfnWebACLActivatedRulePropertyDsl.() -> Unit = {}
    ): CfnWebACL.ActivatedRuleProperty {
        val builder = CfnWebACLActivatedRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWebACL`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * CfnWebACLProps cfnWebACLProps = CfnWebACLProps.builder()
     * .defaultAction(WafActionProperty.builder()
     * .type("type")
     * .build())
     * .metricName("metricName")
     * .name("name")
     * // the properties below are optional
     * .rules(List.of(ActivatedRuleProperty.builder()
     * .priority(123)
     * .ruleId("ruleId")
     * // the properties below are optional
     * .action(WafActionProperty.builder()
     * .type("type")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html)
     */
    public inline fun cfnWebACLProps(block: CfnWebACLPropsDsl.() -> Unit = {}): CfnWebACLProps {
        val builder = CfnWebACLPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * For the action that is associated with a rule in a `WebACL` , specifies the action that you
     * want AWS WAF to perform when a web request matches all of the conditions in a rule. For the
     * default action in a `WebACL` , specifies the action that you want AWS WAF to take when a web
     * request doesn't match all of the conditions in any of the rules in a `WebACL` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * WafActionProperty wafActionProperty = WafActionProperty.builder()
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-wafaction.html)
     */
    public inline fun cfnWebACLWafActionProperty(
        block: CfnWebACLWafActionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.WafActionProperty {
        val builder = CfnWebACLWafActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * A complex type that contains `XssMatchTuple` objects, which specify the parts of web requests
     * that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to
     * inspect a header, the name of the header. If a `XssMatchSet` contains more than one
     * `XssMatchTuple` object, a request needs to include cross-site scripting attacks in only one
     * of the specified parts of the request to be considered a match.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * CfnXssMatchSet cfnXssMatchSet = CfnXssMatchSet.Builder.create(this, "MyCfnXssMatchSet")
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
     * The part of a web request that you want to inspect, such as a specified header or a query
     * string.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
     * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-xssmatchset-fieldtomatch.html)
     */
    public inline fun cfnXssMatchSetFieldToMatchProperty(
        block: CfnXssMatchSetFieldToMatchPropertyDsl.() -> Unit = {}
    ): CfnXssMatchSet.FieldToMatchProperty {
        val builder = CfnXssMatchSetFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnXssMatchSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
    public inline fun cfnXssMatchSetProps(
        block: CfnXssMatchSetPropsDsl.() -> Unit = {}
    ): CfnXssMatchSetProps {
        val builder = CfnXssMatchSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is *AWS WAF Classic* documentation.
     *
     * For more information, see
     * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
     * in the developer guide.
     *
     * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
     *
     * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting
     * attacks and, if you want AWS WAF to inspect a header, the name of the header.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.waf.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-xssmatchset-xssmatchtuple.html)
     */
    public inline fun cfnXssMatchSetXssMatchTupleProperty(
        block: CfnXssMatchSetXssMatchTuplePropertyDsl.() -> Unit = {}
    ): CfnXssMatchSet.XssMatchTupleProperty {
        val builder = CfnXssMatchSetXssMatchTuplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
