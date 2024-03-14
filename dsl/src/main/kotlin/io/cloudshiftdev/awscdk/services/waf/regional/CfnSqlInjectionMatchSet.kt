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

public open class CfnSqlInjectionMatchSet internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet,
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
   * The name, if any, of the `SqlInjectionMatchSet` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name, if any, of the `SqlInjectionMatchSet` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
   * code.
   */
  public open fun sqlInjectionMatchTuples(): Any? = unwrap(this).getSqlInjectionMatchTuples()

  /**
   * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
   * code.
   */
  public open fun sqlInjectionMatchTuples(`value`: IResolvable) {
    unwrap(this).setSqlInjectionMatchTuples(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
   * code.
   */
  public open fun sqlInjectionMatchTuples(__idx_ac66f0: List<Any>) {
    unwrap(this).setSqlInjectionMatchTuples(__idx_ac66f0)
  }

  /**
   * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
   * code.
   */
  public open fun sqlInjectionMatchTuples(vararg __idx_ac66f0: Any): Unit =
      sqlInjectionMatchTuples(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.regional.CfnSqlInjectionMatchSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name, if any, of the `SqlInjectionMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-name)
     * @param name The name, if any, of the `SqlInjectionMatchSet` . 
     */
    public fun name(name: String)

    /**
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
     * code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code. 
     */
    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable)

    /**
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
     * code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code. 
     */
    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: List<Any>)

    /**
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
     * code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code. 
     */
    public fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.Builder.create(scope,
        id)

    /**
     * The name, if any, of the `SqlInjectionMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-name)
     * @param name The name, if any, of the `SqlInjectionMatchSet` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
     * code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code. 
     */
    override fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable) {
      cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples.let(IResolvable::unwrap))
    }

    /**
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
     * code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code. 
     */
    override fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: List<Any>) {
      cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples)
    }

    /**
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
     * code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code. 
     */
    override fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any): Unit =
        sqlInjectionMatchTuples(sqlInjectionMatchTuples.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSqlInjectionMatchSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSqlInjectionMatchSet(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet):
        CfnSqlInjectionMatchSet = CfnSqlInjectionMatchSet(cdkObject)

    internal fun unwrap(wrapped: CfnSqlInjectionMatchSet):
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet = wrapped.cdkObject
  }

  public interface SqlInjectionMatchTupleProperty {
    /**
     * The part of a web request that you want AWS WAF to inspect, such as a specific header or a
     * query string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple-fieldtomatch)
     */
    public fun fieldToMatch(): Any

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple-texttransformation)
     */
    public fun textTransformation(): String

    /**
     * A builder for [SqlInjectionMatchTupleProperty]
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
      @JvmName("0329257087ae83ced0d438bda6498a47db7d7efbcb5002097eb20c0b81c1e1b8")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

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
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.builder()

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
      @JvmName("0329257087ae83ced0d438bda6498a47db7d7efbcb5002097eb20c0b81c1e1b8")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

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
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty,
    ) : CdkObject(cdkObject), SqlInjectionMatchTupleProperty {
      /**
       * The part of a web request that you want AWS WAF to inspect, such as a specific header or a
       * query string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple-texttransformation)
       */
      override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqlInjectionMatchTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty):
          SqlInjectionMatchTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqlInjectionMatchTupleProperty):
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-fieldtomatch.html#cfn-wafregional-sqlinjectionmatchset-fieldtomatch-data)
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
     * * `METHOD` : The HTTP method, which indicates the type of operation that the request is
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-fieldtomatch.html#cfn-wafregional-sqlinjectionmatchset-fieldtomatch-type)
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
       * * `METHOD` : The HTTP method, which indicates the type of operation that the request is
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
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.builder()

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
       * * `METHOD` : The HTTP method, which indicates the type of operation that the request is
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
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty,
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-fieldtomatch.html#cfn-wafregional-sqlinjectionmatchset-fieldtomatch-data)
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
       * * `METHOD` : The HTTP method, which indicates the type of operation that the request is
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-fieldtomatch.html#cfn-wafregional-sqlinjectionmatchset-fieldtomatch-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty
    }
  }
}
