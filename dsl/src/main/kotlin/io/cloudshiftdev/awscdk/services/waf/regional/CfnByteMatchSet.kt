package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnByteMatchSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet,
) : CfnResource(cdkObject), IInspectable {
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
  public open fun byteMatchTuples(__idx_ac66f0: List<Any>) {
    unwrap(this).setByteMatchTuples(__idx_ac66f0)
  }

  /**
   * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
   * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
   * and other settings.
   */
  public open fun byteMatchTuples(vararg __idx_ac66f0: Any): Unit =
      byteMatchTuples(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A friendly name or description of the `ByteMatchSet` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A friendly name or description of the `ByteMatchSet` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.regional.CfnByteMatchSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
     * and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings. 
     */
    public fun byteMatchTuples(vararg byteMatchTuples: Any)

    /**
     * A friendly name or description of the `ByteMatchSet` .
     *
     * You can't change `Name` after you create a `ByteMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-name)
     * @param name A friendly name or description of the `ByteMatchSet` . 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.Builder.create(scope, id)

    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
     * and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     * characters) that you want AWS WAF to search for in web requests, the location in requests that
     * you want AWS WAF to search, and other settings. 
     */
    override fun byteMatchTuples(vararg byteMatchTuples: Any): Unit =
        byteMatchTuples(byteMatchTuples.toList())

    /**
     * A friendly name or description of the `ByteMatchSet` .
     *
     * You can't change `Name` after you create a `ByteMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-name)
     * @param name A friendly name or description of the `ByteMatchSet` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnByteMatchSet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnByteMatchSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnByteMatchSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet):
        CfnByteMatchSet = CfnByteMatchSet(cdkObject)

    internal fun unwrap(wrapped: CfnByteMatchSet):
        software.amazon.awscdk.services.waf.regional.CfnByteMatchSet = wrapped.cdkObject
  }

  public interface ByteMatchTupleProperty {
    /**
     * The part of a web request that you want AWS WAF to inspect, such as a specific header or a
     * query string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-fieldtomatch)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-positionalconstraint)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstring)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstringbase64)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-texttransformation)
     */
    public fun textTransformation(): String

    /**
     * A builder for [ByteMatchTupleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
       * specific header or a query string. 
       */
      public fun fieldToMatch(fieldToMatch: IResolvable)

      /**
       * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
       * specific header or a query string. 
       */
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      /**
       * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
       * specific header or a query string. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("707acbb9af795be8650a72d4653d6e4e6a7fc0c2c2bb4cb1d10d23edd24e98f3")
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
       * request.
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
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.builder()

      /**
       * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
       * specific header or a query string. 
       */
      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      /**
       * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
       * specific header or a query string. 
       */
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      /**
       * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
       * specific header or a query string. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("707acbb9af795be8650a72d4653d6e4e6a7fc0c2c2bb4cb1d10d23edd24e98f3")
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
       * request.
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

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty,
    ) : CdkObject(cdkObject), ByteMatchTupleProperty {
      /**
       * The part of a web request that you want AWS WAF to inspect, such as a specific header or a
       * query string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-fieldtomatch)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-positionalconstraint)
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
       * request.
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstring)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstringbase64)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-texttransformation)
       */
      override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ByteMatchTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty):
          ByteMatchTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ByteMatchTupleProperty):
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty
    }
  }

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-data)
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
     * asking the origin to perform.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-type)
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
       * asking the origin to perform.
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
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.builder()

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
       * asking the origin to perform.
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

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty,
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-data)
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
       * asking the origin to perform.
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty
    }
  }
}
