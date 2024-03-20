@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * The `AWS::WAF::ByteMatchSet` resource creates an AWS WAF `ByteMatchSet` that identifies a part of
 * a web request that you want to inspect.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.*;
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
public open class CfnByteMatchSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSet,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnByteMatchSetProps,
  ) :
      this(software.amazon.awscdk.services.waf.CfnByteMatchSet(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnByteMatchSetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnByteMatchSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnByteMatchSetProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
   * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
   * and other settings.
   */
  public open fun byteMatchTuples(): Any? = unwrap(this).getByteMatchTuples()

  /**
   * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
   * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
   * and other settings.
   */
  public open fun byteMatchTuples(`value`: IResolvable) {
    unwrap(this).setByteMatchTuples(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
   * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
   * and other settings.
   */
  public open fun byteMatchTuples(`value`: List<Any>) {
    unwrap(this).setByteMatchTuples(`value`)
  }

  /**
   * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
   * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
   * and other settings.
   */
  public open fun byteMatchTuples(vararg `value`: Any): Unit = byteMatchTuples(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the `ByteMatchSet` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the `ByteMatchSet` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.CfnByteMatchSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
     * and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings. 
     */
    public fun byteMatchTuples(byteMatchTuples: IResolvable)

    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
     * and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings. 
     */
    public fun byteMatchTuples(byteMatchTuples: List<Any>)

    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
     * and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings. 
     */
    public fun byteMatchTuples(vararg byteMatchTuples: Any)

    /**
     * The name of the `ByteMatchSet` .
     *
     * You can't change `Name` after you create a `ByteMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name)
     * @param name The name of the `ByteMatchSet` . 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnByteMatchSet.Builder =
        software.amazon.awscdk.services.waf.CfnByteMatchSet.Builder.create(scope, id)

    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
     * and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings. 
     */
    override fun byteMatchTuples(byteMatchTuples: IResolvable) {
      cdkBuilder.byteMatchTuples(byteMatchTuples.let(IResolvable::unwrap))
    }

    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
     * and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings. 
     */
    override fun byteMatchTuples(byteMatchTuples: List<Any>) {
      cdkBuilder.byteMatchTuples(byteMatchTuples)
    }

    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
     * and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings. 
     */
    override fun byteMatchTuples(vararg byteMatchTuples: Any): Unit =
        byteMatchTuples(byteMatchTuples.toList())

    /**
     * The name of the `ByteMatchSet` .
     *
     * You can't change `Name` after you create a `ByteMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name)
     * @param name The name of the `ByteMatchSet` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.CfnByteMatchSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.CfnByteMatchSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnByteMatchSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnByteMatchSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSet):
        CfnByteMatchSet = CfnByteMatchSet(cdkObject)

    internal fun unwrap(wrapped: CfnByteMatchSet):
        software.amazon.awscdk.services.waf.CfnByteMatchSet = wrapped.cdkObject
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
   * import io.cloudshiftdev.awscdk.services.waf.*;
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
  public interface ByteMatchTupleProperty {
    /**
     * The part of a web request that you want to inspect, such as a specified header or a query
     * string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html#cfn-waf-bytematchset-bytematchtuple-fieldtomatch)
     */
    public fun fieldToMatch(): Any

    /**
     * Within the portion of a web request that you want to search (for example, in the query
     * string, if any), specify where you want AWS WAF to search.
     *
     * Valid values include the following:
     *
     * *CONTAINS*
     *
     * The specified part of the web request must include the value of `TargetString` , but the
     * location doesn't matter.
     *
     * *CONTAINS_WORD*
     *
     * The specified part of the web request must include the value of `TargetString` , and
     * `TargetString` must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, `TargetString` must be a word, which means one of the following:
     *
     * * `TargetString` exactly matches the value of the specified part of the web request, such as
     * the value of a header.
     * * `TargetString` is at the beginning of the specified part of the web request and is followed
     * by a character other than an alphanumeric character or underscore (_), for example, `BadBot;` .
     * * `TargetString` is at the end of the specified part of the web request and is preceded by a
     * character other than an alphanumeric character or underscore (_), for example, `;BadBot` .
     * * `TargetString` is in the middle of the specified part of the web request and is preceded
     * and followed by characters other than alphanumeric characters or underscore (_), for example,
     * `-BadBot;` .
     *
     * *EXACTLY*
     *
     * The value of the specified part of the web request must exactly match the value of
     * `TargetString` .
     *
     * *STARTS_WITH*
     *
     * The value of `TargetString` must appear at the beginning of the specified part of the web
     * request.
     *
     * *ENDS_WITH*
     *
     * The value of `TargetString` must appear at the end of the specified part of the web request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html#cfn-waf-bytematchset-bytematchtuple-positionalconstraint)
     */
    public fun positionalConstraint(): String

    /**
     * The value that you want AWS WAF to search for.
     *
     * AWS WAF searches for the specified string in the part of web requests that you specified in
     * `FieldToMatch` . The maximum length of the value is 50 bytes.
     *
     * You must specify this property or the `TargetStringBase64` property.
     *
     * Valid values depend on the values that you specified for `FieldToMatch` :
     *
     * * `HEADER` : The value that you want AWS WAF to search for in the request header that you
     * specified in `FieldToMatch` , for example, the value of the `User-Agent` or `Referer` header.
     * * `METHOD` : The HTTP method, which indicates the type of operation specified in the request.
     * Amazon CloudFront supports the following methods: `DELETE` , `GET` , `HEAD` , `OPTIONS` ,
     * `PATCH` , `POST` , and `PUT` .
     * * `QUERY_STRING` : The value that you want AWS WAF to search for in the query string, which
     * is the part of a URL that appears after a `?` character.
     * * `URI` : The value that you want AWS WAF to search for in the part of a URL that identifies
     * a resource, for example, `/images/daily-ad.jpg` .
     * * `BODY` : The part of a request that contains any additional data that you want to send to
     * your web server as the HTTP request body, such as data from a form. The request body immediately
     * follows the request headers. Note that only the first `8192` bytes of the request body are
     * forwarded to AWS WAF for inspection. To allow or block requests based on the length of the body,
     * you can create a size constraint set.
     * * `SINGLE_QUERY_ARG` : The parameter in the query string that you will inspect, such as
     * *UserName* or *SalesRegion* . The maximum length for `SINGLE_QUERY_ARG` is 30 characters.
     * * `ALL_QUERY_ARGS` : Similar to `SINGLE_QUERY_ARG` , but instead of inspecting a single
     * parameter, AWS WAF inspects all parameters within the query string for the value or regex
     * pattern that you specify in `TargetString` .
     *
     * If `TargetString` includes alphabetic characters A-Z and a-z, note that the value is case
     * sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html#cfn-waf-bytematchset-bytematchtuple-targetstring)
     */
    public fun targetString(): String? = unwrap(this).getTargetString()

    /**
     * The base64-encoded value that AWS WAF searches for. AWS CloudFormation sends this value to
     * AWS WAF without encoding it.
     *
     * You must specify this property or the `TargetString` property.
     *
     * AWS WAF searches for this value in a specific part of web requests, which you define in the
     * `FieldToMatch` property.
     *
     * Valid values depend on the Type value in the `FieldToMatch` property. For example, for a
     * `METHOD` type, you must specify HTTP methods such as `DELETE, GET, HEAD, OPTIONS, PATCH, POST` ,
     * and `PUT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html#cfn-waf-bytematchset-bytematchtuple-targetstringbase64)
     */
    public fun targetStringBase64(): String? = unwrap(this).getTargetStringBase64()

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass AWS WAF .
     *
     * If you specify a transformation, AWS WAF performs the transformation on `FieldToMatch` before
     * inspecting it for a match.
     *
     * You can only specify a single type of TextTransformation.
     *
     * *CMD_LINE*
     *
     * When you're concerned that attackers are injecting an operating system command line command
     * and using unusual formatting to disguise some or all of the command, use this option to perform
     * the following transformations:
     *
     * * Delete the following characters: \ " ' ^
     * * Delete spaces before the following characters: / (
     * * Replace the following characters with a space: , ;
     * * Replace multiple spaces with one space
     * * Convert uppercase letters (A-Z) to lowercase (a-z)
     *
     * *COMPRESS_WHITE_SPACE*
     *
     * Use this option to replace the following characters with a space character (decimal 32):
     *
     * * \f, formfeed, decimal 12
     * * \t, tab, decimal 9
     * * \n, newline, decimal 10
     * * \r, carriage return, decimal 13
     * * \v, vertical tab, decimal 11
     * * non-breaking space, decimal 160
     *
     * `COMPRESS_WHITE_SPACE` also replaces multiple spaces with one space.
     *
     * *HTML_ENTITY_DECODE*
     *
     * Use this option to replace HTML-encoded characters with unencoded characters.
     * `HTML_ENTITY_DECODE` performs the following operations:
     *
     * * Replaces `(ampersand)quot;` with `"`
     * * Replaces `(ampersand)nbsp;` with a non-breaking space, decimal 160
     * * Replaces `(ampersand)lt;` with a "less than" symbol
     * * Replaces `(ampersand)gt;` with `&gt;`
     * * Replaces characters that are represented in hexadecimal format, `(ampersand)#xhhhh;` , with
     * the corresponding characters
     * * Replaces characters that are represented in decimal format, `(ampersand)#nnnn;` , with the
     * corresponding characters
     *
     * *LOWERCASE*
     *
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     *
     * *URL_DECODE*
     *
     * Use this option to decode a URL-encoded value.
     *
     * *NONE*
     *
     * Specify `NONE` if you don't want to perform any text transformations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html#cfn-waf-bytematchset-bytematchtuple-texttransformation)
     */
    public fun textTransformation(): String

    /**
     * A builder for [ByteMatchTupleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldToMatch The part of a web request that you want to inspect, such as a specified
       * header or a query string. 
       */
      public fun fieldToMatch(fieldToMatch: IResolvable)

      /**
       * @param fieldToMatch The part of a web request that you want to inspect, such as a specified
       * header or a query string. 
       */
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      /**
       * @param fieldToMatch The part of a web request that you want to inspect, such as a specified
       * header or a query string. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afb8058217b3308d25ea9d9c7fa8ef4fbd492d073d812f6635db35fb8b2e74e6")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      /**
       * @param positionalConstraint Within the portion of a web request that you want to search
       * (for example, in the query string, if any), specify where you want AWS WAF to search. 
       * Valid values include the following:
       *
       * *CONTAINS*
       *
       * The specified part of the web request must include the value of `TargetString` , but the
       * location doesn't matter.
       *
       * *CONTAINS_WORD*
       *
       * The specified part of the web request must include the value of `TargetString` , and
       * `TargetString` must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
       * In addition, `TargetString` must be a word, which means one of the following:
       *
       * * `TargetString` exactly matches the value of the specified part of the web request, such
       * as the value of a header.
       * * `TargetString` is at the beginning of the specified part of the web request and is
       * followed by a character other than an alphanumeric character or underscore (_), for example,
       * `BadBot;` .
       * * `TargetString` is at the end of the specified part of the web request and is preceded by
       * a character other than an alphanumeric character or underscore (_), for example, `;BadBot` .
       * * `TargetString` is in the middle of the specified part of the web request and is preceded
       * and followed by characters other than alphanumeric characters or underscore (_), for example,
       * `-BadBot;` .
       *
       * *EXACTLY*
       *
       * The value of the specified part of the web request must exactly match the value of
       * `TargetString` .
       *
       * *STARTS_WITH*
       *
       * The value of `TargetString` must appear at the beginning of the specified part of the web
       * request.
       *
       * *ENDS_WITH*
       *
       * The value of `TargetString` must appear at the end of the specified part of the web
       * request.
       */
      public fun positionalConstraint(positionalConstraint: String)

      /**
       * @param targetString The value that you want AWS WAF to search for.
       * AWS WAF searches for the specified string in the part of web requests that you specified in
       * `FieldToMatch` . The maximum length of the value is 50 bytes.
       *
       * You must specify this property or the `TargetStringBase64` property.
       *
       * Valid values depend on the values that you specified for `FieldToMatch` :
       *
       * * `HEADER` : The value that you want AWS WAF to search for in the request header that you
       * specified in `FieldToMatch` , for example, the value of the `User-Agent` or `Referer` header.
       * * `METHOD` : The HTTP method, which indicates the type of operation specified in the
       * request. Amazon CloudFront supports the following methods: `DELETE` , `GET` , `HEAD` ,
       * `OPTIONS` , `PATCH` , `POST` , and `PUT` .
       * * `QUERY_STRING` : The value that you want AWS WAF to search for in the query string, which
       * is the part of a URL that appears after a `?` character.
       * * `URI` : The value that you want AWS WAF to search for in the part of a URL that
       * identifies a resource, for example, `/images/daily-ad.jpg` .
       * * `BODY` : The part of a request that contains any additional data that you want to send to
       * your web server as the HTTP request body, such as data from a form. The request body
       * immediately follows the request headers. Note that only the first `8192` bytes of the request
       * body are forwarded to AWS WAF for inspection. To allow or block requests based on the length
       * of the body, you can create a size constraint set.
       * * `SINGLE_QUERY_ARG` : The parameter in the query string that you will inspect, such as
       * *UserName* or *SalesRegion* . The maximum length for `SINGLE_QUERY_ARG` is 30 characters.
       * * `ALL_QUERY_ARGS` : Similar to `SINGLE_QUERY_ARG` , but instead of inspecting a single
       * parameter, AWS WAF inspects all parameters within the query string for the value or regex
       * pattern that you specify in `TargetString` .
       *
       * If `TargetString` includes alphabetic characters A-Z and a-z, note that the value is case
       * sensitive.
       */
      public fun targetString(targetString: String)

      /**
       * @param targetStringBase64 The base64-encoded value that AWS WAF searches for. AWS
       * CloudFormation sends this value to AWS WAF without encoding it.
       * You must specify this property or the `TargetString` property.
       *
       * AWS WAF searches for this value in a specific part of web requests, which you define in the
       * `FieldToMatch` property.
       *
       * Valid values depend on the Type value in the `FieldToMatch` property. For example, for a
       * `METHOD` type, you must specify HTTP methods such as `DELETE, GET, HEAD, OPTIONS, PATCH, POST`
       * , and `PUT` .
       */
      public fun targetStringBase64(targetStringBase64: String)

      /**
       * @param textTransformation Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass AWS WAF . 
       * If you specify a transformation, AWS WAF performs the transformation on `FieldToMatch`
       * before inspecting it for a match.
       *
       * You can only specify a single type of TextTransformation.
       *
       * *CMD_LINE*
       *
       * When you're concerned that attackers are injecting an operating system command line command
       * and using unusual formatting to disguise some or all of the command, use this option to
       * perform the following transformations:
       *
       * * Delete the following characters: \ " ' ^
       * * Delete spaces before the following characters: / (
       * * Replace the following characters with a space: , ;
       * * Replace multiple spaces with one space
       * * Convert uppercase letters (A-Z) to lowercase (a-z)
       *
       * *COMPRESS_WHITE_SPACE*
       *
       * Use this option to replace the following characters with a space character (decimal 32):
       *
       * * \f, formfeed, decimal 12
       * * \t, tab, decimal 9
       * * \n, newline, decimal 10
       * * \r, carriage return, decimal 13
       * * \v, vertical tab, decimal 11
       * * non-breaking space, decimal 160
       *
       * `COMPRESS_WHITE_SPACE` also replaces multiple spaces with one space.
       *
       * *HTML_ENTITY_DECODE*
       *
       * Use this option to replace HTML-encoded characters with unencoded characters.
       * `HTML_ENTITY_DECODE` performs the following operations:
       *
       * * Replaces `(ampersand)quot;` with `"`
       * * Replaces `(ampersand)nbsp;` with a non-breaking space, decimal 160
       * * Replaces `(ampersand)lt;` with a "less than" symbol
       * * Replaces `(ampersand)gt;` with `&gt;`
       * * Replaces characters that are represented in hexadecimal format, `(ampersand)#xhhhh;` ,
       * with the corresponding characters
       * * Replaces characters that are represented in decimal format, `(ampersand)#nnnn;` , with
       * the corresponding characters
       *
       * *LOWERCASE*
       *
       * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
       *
       * *URL_DECODE*
       *
       * Use this option to decode a URL-encoded value.
       *
       * *NONE*
       *
       * Specify `NONE` if you don't want to perform any text transformations.
       */
      public fun textTransformation(textTransformation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder =
          software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.builder()

      /**
       * @param fieldToMatch The part of a web request that you want to inspect, such as a specified
       * header or a query string. 
       */
      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      /**
       * @param fieldToMatch The part of a web request that you want to inspect, such as a specified
       * header or a query string. 
       */
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      /**
       * @param fieldToMatch The part of a web request that you want to inspect, such as a specified
       * header or a query string. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afb8058217b3308d25ea9d9c7fa8ef4fbd492d073d812f6635db35fb8b2e74e6")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      /**
       * @param positionalConstraint Within the portion of a web request that you want to search
       * (for example, in the query string, if any), specify where you want AWS WAF to search. 
       * Valid values include the following:
       *
       * *CONTAINS*
       *
       * The specified part of the web request must include the value of `TargetString` , but the
       * location doesn't matter.
       *
       * *CONTAINS_WORD*
       *
       * The specified part of the web request must include the value of `TargetString` , and
       * `TargetString` must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
       * In addition, `TargetString` must be a word, which means one of the following:
       *
       * * `TargetString` exactly matches the value of the specified part of the web request, such
       * as the value of a header.
       * * `TargetString` is at the beginning of the specified part of the web request and is
       * followed by a character other than an alphanumeric character or underscore (_), for example,
       * `BadBot;` .
       * * `TargetString` is at the end of the specified part of the web request and is preceded by
       * a character other than an alphanumeric character or underscore (_), for example, `;BadBot` .
       * * `TargetString` is in the middle of the specified part of the web request and is preceded
       * and followed by characters other than alphanumeric characters or underscore (_), for example,
       * `-BadBot;` .
       *
       * *EXACTLY*
       *
       * The value of the specified part of the web request must exactly match the value of
       * `TargetString` .
       *
       * *STARTS_WITH*
       *
       * The value of `TargetString` must appear at the beginning of the specified part of the web
       * request.
       *
       * *ENDS_WITH*
       *
       * The value of `TargetString` must appear at the end of the specified part of the web
       * request.
       */
      override fun positionalConstraint(positionalConstraint: String) {
        cdkBuilder.positionalConstraint(positionalConstraint)
      }

      /**
       * @param targetString The value that you want AWS WAF to search for.
       * AWS WAF searches for the specified string in the part of web requests that you specified in
       * `FieldToMatch` . The maximum length of the value is 50 bytes.
       *
       * You must specify this property or the `TargetStringBase64` property.
       *
       * Valid values depend on the values that you specified for `FieldToMatch` :
       *
       * * `HEADER` : The value that you want AWS WAF to search for in the request header that you
       * specified in `FieldToMatch` , for example, the value of the `User-Agent` or `Referer` header.
       * * `METHOD` : The HTTP method, which indicates the type of operation specified in the
       * request. Amazon CloudFront supports the following methods: `DELETE` , `GET` , `HEAD` ,
       * `OPTIONS` , `PATCH` , `POST` , and `PUT` .
       * * `QUERY_STRING` : The value that you want AWS WAF to search for in the query string, which
       * is the part of a URL that appears after a `?` character.
       * * `URI` : The value that you want AWS WAF to search for in the part of a URL that
       * identifies a resource, for example, `/images/daily-ad.jpg` .
       * * `BODY` : The part of a request that contains any additional data that you want to send to
       * your web server as the HTTP request body, such as data from a form. The request body
       * immediately follows the request headers. Note that only the first `8192` bytes of the request
       * body are forwarded to AWS WAF for inspection. To allow or block requests based on the length
       * of the body, you can create a size constraint set.
       * * `SINGLE_QUERY_ARG` : The parameter in the query string that you will inspect, such as
       * *UserName* or *SalesRegion* . The maximum length for `SINGLE_QUERY_ARG` is 30 characters.
       * * `ALL_QUERY_ARGS` : Similar to `SINGLE_QUERY_ARG` , but instead of inspecting a single
       * parameter, AWS WAF inspects all parameters within the query string for the value or regex
       * pattern that you specify in `TargetString` .
       *
       * If `TargetString` includes alphabetic characters A-Z and a-z, note that the value is case
       * sensitive.
       */
      override fun targetString(targetString: String) {
        cdkBuilder.targetString(targetString)
      }

      /**
       * @param targetStringBase64 The base64-encoded value that AWS WAF searches for. AWS
       * CloudFormation sends this value to AWS WAF without encoding it.
       * You must specify this property or the `TargetString` property.
       *
       * AWS WAF searches for this value in a specific part of web requests, which you define in the
       * `FieldToMatch` property.
       *
       * Valid values depend on the Type value in the `FieldToMatch` property. For example, for a
       * `METHOD` type, you must specify HTTP methods such as `DELETE, GET, HEAD, OPTIONS, PATCH, POST`
       * , and `PUT` .
       */
      override fun targetStringBase64(targetStringBase64: String) {
        cdkBuilder.targetStringBase64(targetStringBase64)
      }

      /**
       * @param textTransformation Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass AWS WAF . 
       * If you specify a transformation, AWS WAF performs the transformation on `FieldToMatch`
       * before inspecting it for a match.
       *
       * You can only specify a single type of TextTransformation.
       *
       * *CMD_LINE*
       *
       * When you're concerned that attackers are injecting an operating system command line command
       * and using unusual formatting to disguise some or all of the command, use this option to
       * perform the following transformations:
       *
       * * Delete the following characters: \ " ' ^
       * * Delete spaces before the following characters: / (
       * * Replace the following characters with a space: , ;
       * * Replace multiple spaces with one space
       * * Convert uppercase letters (A-Z) to lowercase (a-z)
       *
       * *COMPRESS_WHITE_SPACE*
       *
       * Use this option to replace the following characters with a space character (decimal 32):
       *
       * * \f, formfeed, decimal 12
       * * \t, tab, decimal 9
       * * \n, newline, decimal 10
       * * \r, carriage return, decimal 13
       * * \v, vertical tab, decimal 11
       * * non-breaking space, decimal 160
       *
       * `COMPRESS_WHITE_SPACE` also replaces multiple spaces with one space.
       *
       * *HTML_ENTITY_DECODE*
       *
       * Use this option to replace HTML-encoded characters with unencoded characters.
       * `HTML_ENTITY_DECODE` performs the following operations:
       *
       * * Replaces `(ampersand)quot;` with `"`
       * * Replaces `(ampersand)nbsp;` with a non-breaking space, decimal 160
       * * Replaces `(ampersand)lt;` with a "less than" symbol
       * * Replaces `(ampersand)gt;` with `&gt;`
       * * Replaces characters that are represented in hexadecimal format, `(ampersand)#xhhhh;` ,
       * with the corresponding characters
       * * Replaces characters that are represented in decimal format, `(ampersand)#nnnn;` , with
       * the corresponding characters
       *
       * *LOWERCASE*
       *
       * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
       *
       * *URL_DECODE*
       *
       * Use this option to decode a URL-encoded value.
       *
       * *NONE*
       *
       * Specify `NONE` if you don't want to perform any text transformations.
       */
      override fun textTransformation(textTransformation: String) {
        cdkBuilder.textTransformation(textTransformation)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty,
    ) : CdkObject(cdkObject), ByteMatchTupleProperty {
      /**
       * The part of a web request that you want to inspect, such as a specified header or a query
       * string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html#cfn-waf-bytematchset-bytematchtuple-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      /**
       * Within the portion of a web request that you want to search (for example, in the query
       * string, if any), specify where you want AWS WAF to search.
       *
       * Valid values include the following:
       *
       * *CONTAINS*
       *
       * The specified part of the web request must include the value of `TargetString` , but the
       * location doesn't matter.
       *
       * *CONTAINS_WORD*
       *
       * The specified part of the web request must include the value of `TargetString` , and
       * `TargetString` must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
       * In addition, `TargetString` must be a word, which means one of the following:
       *
       * * `TargetString` exactly matches the value of the specified part of the web request, such
       * as the value of a header.
       * * `TargetString` is at the beginning of the specified part of the web request and is
       * followed by a character other than an alphanumeric character or underscore (_), for example,
       * `BadBot;` .
       * * `TargetString` is at the end of the specified part of the web request and is preceded by
       * a character other than an alphanumeric character or underscore (_), for example, `;BadBot` .
       * * `TargetString` is in the middle of the specified part of the web request and is preceded
       * and followed by characters other than alphanumeric characters or underscore (_), for example,
       * `-BadBot;` .
       *
       * *EXACTLY*
       *
       * The value of the specified part of the web request must exactly match the value of
       * `TargetString` .
       *
       * *STARTS_WITH*
       *
       * The value of `TargetString` must appear at the beginning of the specified part of the web
       * request.
       *
       * *ENDS_WITH*
       *
       * The value of `TargetString` must appear at the end of the specified part of the web
       * request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html#cfn-waf-bytematchset-bytematchtuple-positionalconstraint)
       */
      override fun positionalConstraint(): String = unwrap(this).getPositionalConstraint()

      /**
       * The value that you want AWS WAF to search for.
       *
       * AWS WAF searches for the specified string in the part of web requests that you specified in
       * `FieldToMatch` . The maximum length of the value is 50 bytes.
       *
       * You must specify this property or the `TargetStringBase64` property.
       *
       * Valid values depend on the values that you specified for `FieldToMatch` :
       *
       * * `HEADER` : The value that you want AWS WAF to search for in the request header that you
       * specified in `FieldToMatch` , for example, the value of the `User-Agent` or `Referer` header.
       * * `METHOD` : The HTTP method, which indicates the type of operation specified in the
       * request. Amazon CloudFront supports the following methods: `DELETE` , `GET` , `HEAD` ,
       * `OPTIONS` , `PATCH` , `POST` , and `PUT` .
       * * `QUERY_STRING` : The value that you want AWS WAF to search for in the query string, which
       * is the part of a URL that appears after a `?` character.
       * * `URI` : The value that you want AWS WAF to search for in the part of a URL that
       * identifies a resource, for example, `/images/daily-ad.jpg` .
       * * `BODY` : The part of a request that contains any additional data that you want to send to
       * your web server as the HTTP request body, such as data from a form. The request body
       * immediately follows the request headers. Note that only the first `8192` bytes of the request
       * body are forwarded to AWS WAF for inspection. To allow or block requests based on the length
       * of the body, you can create a size constraint set.
       * * `SINGLE_QUERY_ARG` : The parameter in the query string that you will inspect, such as
       * *UserName* or *SalesRegion* . The maximum length for `SINGLE_QUERY_ARG` is 30 characters.
       * * `ALL_QUERY_ARGS` : Similar to `SINGLE_QUERY_ARG` , but instead of inspecting a single
       * parameter, AWS WAF inspects all parameters within the query string for the value or regex
       * pattern that you specify in `TargetString` .
       *
       * If `TargetString` includes alphabetic characters A-Z and a-z, note that the value is case
       * sensitive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html#cfn-waf-bytematchset-bytematchtuple-targetstring)
       */
      override fun targetString(): String? = unwrap(this).getTargetString()

      /**
       * The base64-encoded value that AWS WAF searches for. AWS CloudFormation sends this value to
       * AWS WAF without encoding it.
       *
       * You must specify this property or the `TargetString` property.
       *
       * AWS WAF searches for this value in a specific part of web requests, which you define in the
       * `FieldToMatch` property.
       *
       * Valid values depend on the Type value in the `FieldToMatch` property. For example, for a
       * `METHOD` type, you must specify HTTP methods such as `DELETE, GET, HEAD, OPTIONS, PATCH, POST`
       * , and `PUT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html#cfn-waf-bytematchset-bytematchtuple-targetstringbase64)
       */
      override fun targetStringBase64(): String? = unwrap(this).getTargetStringBase64()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass AWS WAF .
       *
       * If you specify a transformation, AWS WAF performs the transformation on `FieldToMatch`
       * before inspecting it for a match.
       *
       * You can only specify a single type of TextTransformation.
       *
       * *CMD_LINE*
       *
       * When you're concerned that attackers are injecting an operating system command line command
       * and using unusual formatting to disguise some or all of the command, use this option to
       * perform the following transformations:
       *
       * * Delete the following characters: \ " ' ^
       * * Delete spaces before the following characters: / (
       * * Replace the following characters with a space: , ;
       * * Replace multiple spaces with one space
       * * Convert uppercase letters (A-Z) to lowercase (a-z)
       *
       * *COMPRESS_WHITE_SPACE*
       *
       * Use this option to replace the following characters with a space character (decimal 32):
       *
       * * \f, formfeed, decimal 12
       * * \t, tab, decimal 9
       * * \n, newline, decimal 10
       * * \r, carriage return, decimal 13
       * * \v, vertical tab, decimal 11
       * * non-breaking space, decimal 160
       *
       * `COMPRESS_WHITE_SPACE` also replaces multiple spaces with one space.
       *
       * *HTML_ENTITY_DECODE*
       *
       * Use this option to replace HTML-encoded characters with unencoded characters.
       * `HTML_ENTITY_DECODE` performs the following operations:
       *
       * * Replaces `(ampersand)quot;` with `"`
       * * Replaces `(ampersand)nbsp;` with a non-breaking space, decimal 160
       * * Replaces `(ampersand)lt;` with a "less than" symbol
       * * Replaces `(ampersand)gt;` with `&gt;`
       * * Replaces characters that are represented in hexadecimal format, `(ampersand)#xhhhh;` ,
       * with the corresponding characters
       * * Replaces characters that are represented in decimal format, `(ampersand)#nnnn;` , with
       * the corresponding characters
       *
       * *LOWERCASE*
       *
       * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
       *
       * *URL_DECODE*
       *
       * Use this option to decode a URL-encoded value.
       *
       * *NONE*
       *
       * Specify `NONE` if you don't want to perform any text transformations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuple.html#cfn-waf-bytematchset-bytematchtuple-texttransformation)
       */
      override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ByteMatchTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty):
          ByteMatchTupleProperty = CdkObjectWrappers.wrap(cdkObject) as? ByteMatchTupleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ByteMatchTupleProperty):
          software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.waf.*;
   * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .data("data")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-fieldtomatch.html)
   */
  public interface FieldToMatchProperty {
    /**
     * When the value of `Type` is `HEADER` , enter the name of the header that you want AWS WAF to
     * search, for example, `User-Agent` or `Referer` .
     *
     * The name of the header is not case sensitive.
     *
     * When the value of `Type` is `SINGLE_QUERY_ARG` , enter the name of the parameter that you
     * want AWS WAF to search, for example, `UserName` or `SalesRegion` . The parameter name is not
     * case sensitive.
     *
     * If the value of `Type` is any other value, omit `Data` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-fieldtomatch.html#cfn-waf-bytematchset-fieldtomatch-data)
     */
    public fun `data`(): String? = unwrap(this).getData()

    /**
     * The part of the web request that you want AWS WAF to search for a specified string.
     *
     * Parts of a request that you can search include the following:
     *
     * * `HEADER` : A specified request header, for example, the value of the `User-Agent` or
     * `Referer` header. If you choose `HEADER` for the type, specify the name of the header in `Data`
     * .
     * * `METHOD` : The HTTP method, which indicated the type of operation that the request is
     * asking the origin to perform. Amazon CloudFront supports the following methods: `DELETE` , `GET`
     * , `HEAD` , `OPTIONS` , `PATCH` , `POST` , and `PUT` .
     * * `QUERY_STRING` : A query string, which is the part of a URL that appears after a `?`
     * character, if any.
     * * `URI` : The part of a web request that identifies a resource, for example,
     * `/images/daily-ad.jpg` .
     * * `BODY` : The part of a request that contains any additional data that you want to send to
     * your web server as the HTTP request body, such as data from a form. The request body immediately
     * follows the request headers. Note that only the first `8192` bytes of the request body are
     * forwarded to AWS WAF for inspection. To allow or block requests based on the length of the body,
     * you can create a size constraint set.
     * * `SINGLE_QUERY_ARG` : The parameter in the query string that you will inspect, such as
     * *UserName* or *SalesRegion* . The maximum length for `SINGLE_QUERY_ARG` is 30 characters.
     * * `ALL_QUERY_ARGS` : Similar to `SINGLE_QUERY_ARG` , but rather than inspecting a single
     * parameter, AWS WAF will inspect all parameters within the query for the value or regex pattern
     * that you specify in `TargetString` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-fieldtomatch.html#cfn-waf-bytematchset-fieldtomatch-type)
     */
    public fun type(): String

    /**
     * A builder for [FieldToMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param data When the value of `Type` is `HEADER` , enter the name of the header that you
       * want AWS WAF to search, for example, `User-Agent` or `Referer` .
       * The name of the header is not case sensitive.
       *
       * When the value of `Type` is `SINGLE_QUERY_ARG` , enter the name of the parameter that you
       * want AWS WAF to search, for example, `UserName` or `SalesRegion` . The parameter name is not
       * case sensitive.
       *
       * If the value of `Type` is any other value, omit `Data` .
       */
      public fun `data`(`data`: String)

      /**
       * @param type The part of the web request that you want AWS WAF to search for a specified
       * string. 
       * Parts of a request that you can search include the following:
       *
       * * `HEADER` : A specified request header, for example, the value of the `User-Agent` or
       * `Referer` header. If you choose `HEADER` for the type, specify the name of the header in
       * `Data` .
       * * `METHOD` : The HTTP method, which indicated the type of operation that the request is
       * asking the origin to perform. Amazon CloudFront supports the following methods: `DELETE` ,
       * `GET` , `HEAD` , `OPTIONS` , `PATCH` , `POST` , and `PUT` .
       * * `QUERY_STRING` : A query string, which is the part of a URL that appears after a `?`
       * character, if any.
       * * `URI` : The part of a web request that identifies a resource, for example,
       * `/images/daily-ad.jpg` .
       * * `BODY` : The part of a request that contains any additional data that you want to send to
       * your web server as the HTTP request body, such as data from a form. The request body
       * immediately follows the request headers. Note that only the first `8192` bytes of the request
       * body are forwarded to AWS WAF for inspection. To allow or block requests based on the length
       * of the body, you can create a size constraint set.
       * * `SINGLE_QUERY_ARG` : The parameter in the query string that you will inspect, such as
       * *UserName* or *SalesRegion* . The maximum length for `SINGLE_QUERY_ARG` is 30 characters.
       * * `ALL_QUERY_ARGS` : Similar to `SINGLE_QUERY_ARG` , but rather than inspecting a single
       * parameter, AWS WAF will inspect all parameters within the query for the value or regex pattern
       * that you specify in `TargetString` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.builder()

      /**
       * @param data When the value of `Type` is `HEADER` , enter the name of the header that you
       * want AWS WAF to search, for example, `User-Agent` or `Referer` .
       * The name of the header is not case sensitive.
       *
       * When the value of `Type` is `SINGLE_QUERY_ARG` , enter the name of the parameter that you
       * want AWS WAF to search, for example, `UserName` or `SalesRegion` . The parameter name is not
       * case sensitive.
       *
       * If the value of `Type` is any other value, omit `Data` .
       */
      override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      /**
       * @param type The part of the web request that you want AWS WAF to search for a specified
       * string. 
       * Parts of a request that you can search include the following:
       *
       * * `HEADER` : A specified request header, for example, the value of the `User-Agent` or
       * `Referer` header. If you choose `HEADER` for the type, specify the name of the header in
       * `Data` .
       * * `METHOD` : The HTTP method, which indicated the type of operation that the request is
       * asking the origin to perform. Amazon CloudFront supports the following methods: `DELETE` ,
       * `GET` , `HEAD` , `OPTIONS` , `PATCH` , `POST` , and `PUT` .
       * * `QUERY_STRING` : A query string, which is the part of a URL that appears after a `?`
       * character, if any.
       * * `URI` : The part of a web request that identifies a resource, for example,
       * `/images/daily-ad.jpg` .
       * * `BODY` : The part of a request that contains any additional data that you want to send to
       * your web server as the HTTP request body, such as data from a form. The request body
       * immediately follows the request headers. Note that only the first `8192` bytes of the request
       * body are forwarded to AWS WAF for inspection. To allow or block requests based on the length
       * of the body, you can create a size constraint set.
       * * `SINGLE_QUERY_ARG` : The parameter in the query string that you will inspect, such as
       * *UserName* or *SalesRegion* . The maximum length for `SINGLE_QUERY_ARG` is 30 characters.
       * * `ALL_QUERY_ARGS` : Similar to `SINGLE_QUERY_ARG` , but rather than inspecting a single
       * parameter, AWS WAF will inspect all parameters within the query for the value or regex pattern
       * that you specify in `TargetString` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty,
    ) : CdkObject(cdkObject), FieldToMatchProperty {
      /**
       * When the value of `Type` is `HEADER` , enter the name of the header that you want AWS WAF
       * to search, for example, `User-Agent` or `Referer` .
       *
       * The name of the header is not case sensitive.
       *
       * When the value of `Type` is `SINGLE_QUERY_ARG` , enter the name of the parameter that you
       * want AWS WAF to search, for example, `UserName` or `SalesRegion` . The parameter name is not
       * case sensitive.
       *
       * If the value of `Type` is any other value, omit `Data` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-fieldtomatch.html#cfn-waf-bytematchset-fieldtomatch-data)
       */
      override fun `data`(): String? = unwrap(this).getData()

      /**
       * The part of the web request that you want AWS WAF to search for a specified string.
       *
       * Parts of a request that you can search include the following:
       *
       * * `HEADER` : A specified request header, for example, the value of the `User-Agent` or
       * `Referer` header. If you choose `HEADER` for the type, specify the name of the header in
       * `Data` .
       * * `METHOD` : The HTTP method, which indicated the type of operation that the request is
       * asking the origin to perform. Amazon CloudFront supports the following methods: `DELETE` ,
       * `GET` , `HEAD` , `OPTIONS` , `PATCH` , `POST` , and `PUT` .
       * * `QUERY_STRING` : A query string, which is the part of a URL that appears after a `?`
       * character, if any.
       * * `URI` : The part of a web request that identifies a resource, for example,
       * `/images/daily-ad.jpg` .
       * * `BODY` : The part of a request that contains any additional data that you want to send to
       * your web server as the HTTP request body, such as data from a form. The request body
       * immediately follows the request headers. Note that only the first `8192` bytes of the request
       * body are forwarded to AWS WAF for inspection. To allow or block requests based on the length
       * of the body, you can create a size constraint set.
       * * `SINGLE_QUERY_ARG` : The parameter in the query string that you will inspect, such as
       * *UserName* or *SalesRegion* . The maximum length for `SINGLE_QUERY_ARG` is 30 characters.
       * * `ALL_QUERY_ARGS` : Similar to `SINGLE_QUERY_ARG` , but rather than inspecting a single
       * parameter, AWS WAF will inspect all parameters within the query for the value or regex pattern
       * that you specify in `TargetString` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-fieldtomatch.html#cfn-waf-bytematchset-fieldtomatch-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty):
          FieldToMatchProperty = CdkObjectWrappers.wrap(cdkObject) as? FieldToMatchProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty
    }
  }
}
