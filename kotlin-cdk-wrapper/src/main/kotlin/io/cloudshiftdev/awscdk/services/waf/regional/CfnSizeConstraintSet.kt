@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
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
 * A complex type that contains `SizeConstraint` objects, which specify the parts of web requests
 * that you want AWS WAF to inspect the size of. If a `SizeConstraintSet` contains more than one
 * `SizeConstraint` object, a request only needs to match one constraint to be considered a match.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.regional.*;
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
public open class CfnSizeConstraintSet(
  cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSizeConstraintSetProps,
  ) :
      this(software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSizeConstraintSetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSizeConstraintSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSizeConstraintSetProps(props)
  )

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name, if any, of the `SizeConstraintSet` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name, if any, of the `SizeConstraintSet` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The size constraint and the part of the web request to check.
   */
  public open fun sizeConstraints(): Any? = unwrap(this).getSizeConstraints()

  /**
   * The size constraint and the part of the web request to check.
   */
  public open fun sizeConstraints(`value`: IResolvable) {
    unwrap(this).setSizeConstraints(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The size constraint and the part of the web request to check.
   */
  public open fun sizeConstraints(`value`: List<Any>) {
    unwrap(this).setSizeConstraints(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The size constraint and the part of the web request to check.
   */
  public open fun sizeConstraints(vararg `value`: Any): Unit = sizeConstraints(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.regional.CfnSizeConstraintSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name, if any, of the `SizeConstraintSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name)
     * @param name The name, if any, of the `SizeConstraintSet` . 
     */
    public fun name(name: String)

    /**
     * The size constraint and the part of the web request to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
     * @param sizeConstraints The size constraint and the part of the web request to check. 
     */
    public fun sizeConstraints(sizeConstraints: IResolvable)

    /**
     * The size constraint and the part of the web request to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
     * @param sizeConstraints The size constraint and the part of the web request to check. 
     */
    public fun sizeConstraints(sizeConstraints: List<Any>)

    /**
     * The size constraint and the part of the web request to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
     * @param sizeConstraints The size constraint and the part of the web request to check. 
     */
    public fun sizeConstraints(vararg sizeConstraints: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.Builder.create(scope, id)

    /**
     * The name, if any, of the `SizeConstraintSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name)
     * @param name The name, if any, of the `SizeConstraintSet` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The size constraint and the part of the web request to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
     * @param sizeConstraints The size constraint and the part of the web request to check. 
     */
    override fun sizeConstraints(sizeConstraints: IResolvable) {
      cdkBuilder.sizeConstraints(sizeConstraints.let(IResolvable.Companion::unwrap))
    }

    /**
     * The size constraint and the part of the web request to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
     * @param sizeConstraints The size constraint and the part of the web request to check. 
     */
    override fun sizeConstraints(sizeConstraints: List<Any>) {
      cdkBuilder.sizeConstraints(sizeConstraints.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The size constraint and the part of the web request to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
     * @param sizeConstraints The size constraint and the part of the web request to check. 
     */
    override fun sizeConstraints(vararg sizeConstraints: Any): Unit =
        sizeConstraints(sizeConstraints.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSizeConstraintSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSizeConstraintSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet):
        CfnSizeConstraintSet = CfnSizeConstraintSet(cdkObject)

    internal fun unwrap(wrapped: CfnSizeConstraintSet):
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet = wrapped.cdkObject as
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet
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
   * import io.cloudshiftdev.awscdk.services.waf.regional.*;
   * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .data("data")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-data)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-type)
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
          software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty.builder()

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
          software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty,
    ) : CdkObject(cdkObject),
        FieldToMatchProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-data)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty):
          FieldToMatchProperty = CdkObjectWrappers.wrap(cdkObject) as? FieldToMatchProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty
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
   * import io.cloudshiftdev.awscdk.services.waf.regional.*;
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
  public interface SizeConstraintProperty {
    /**
     * The type of comparison you want AWS WAF to perform.
     *
     * AWS WAF uses this in combination with the provided `Size` and `FieldToMatch` to build an
     * expression in the form of " `Size` `ComparisonOperator` size in bytes of `FieldToMatch` ". If
     * that expression is true, the `SizeConstraint` is considered to match.
     *
     * *EQ* : Used to test if the `Size` is equal to the size of the `FieldToMatch`
     *
     * *NE* : Used to test if the `Size` is not equal to the size of the `FieldToMatch`
     *
     * *LE* : Used to test if the `Size` is less than or equal to the size of the `FieldToMatch`
     *
     * *LT* : Used to test if the `Size` is strictly less than the size of the `FieldToMatch`
     *
     * *GE* : Used to test if the `Size` is greater than or equal to the size of the `FieldToMatch`
     *
     * *GT* : Used to test if the `Size` is strictly greater than the size of the `FieldToMatch`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-comparisonoperator)
     */
    public fun comparisonOperator(): String

    /**
     * The part of a web request that you want AWS WAF to inspect, such as a specific header or a
     * query string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-fieldtomatch)
     */
    public fun fieldToMatch(): Any

    /**
     * The size in bytes that you want AWS WAF to compare against the size of the specified
     * `FieldToMatch` .
     *
     * AWS WAF uses this in combination with `ComparisonOperator` and `FieldToMatch` to build an
     * expression in the form of " `Size` `ComparisonOperator` size in bytes of `FieldToMatch` ". If
     * that expression is true, the `SizeConstraint` is considered to match.
     *
     * Valid values for size are 0 - 21474836480 bytes (0 - 20 GB).
     *
     * If you specify `URI` for the value of `Type` , the / in the URI path that you specify counts
     * as one character. For example, the URI `/logo.jpg` is nine characters long.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-size)
     */
    public fun size(): Number

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass AWS WAF .
     *
     * If you specify a transformation, AWS WAF performs the transformation on `FieldToMatch` before
     * inspecting a request for a match.
     *
     * You can only specify a single type of TextTransformation.
     *
     * Note that if you choose `BODY` for the value of `Type` , you must choose `NONE` for
     * `TextTransformation` because the API Gateway API or Application Load Balancer forward only the
     * first 8192 bytes for inspection.
     *
     * *NONE*
     *
     * Specify `NONE` if you don't want to perform any text transformations.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-texttransformation)
     */
    public fun textTransformation(): String

    /**
     * A builder for [SizeConstraintProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator The type of comparison you want AWS WAF to perform. 
       * AWS WAF uses this in combination with the provided `Size` and `FieldToMatch` to build an
       * expression in the form of " `Size` `ComparisonOperator` size in bytes of `FieldToMatch` ". If
       * that expression is true, the `SizeConstraint` is considered to match.
       *
       * *EQ* : Used to test if the `Size` is equal to the size of the `FieldToMatch`
       *
       * *NE* : Used to test if the `Size` is not equal to the size of the `FieldToMatch`
       *
       * *LE* : Used to test if the `Size` is less than or equal to the size of the `FieldToMatch`
       *
       * *LT* : Used to test if the `Size` is strictly less than the size of the `FieldToMatch`
       *
       * *GE* : Used to test if the `Size` is greater than or equal to the size of the
       * `FieldToMatch`
       *
       * *GT* : Used to test if the `Size` is strictly greater than the size of the `FieldToMatch`
       */
      public fun comparisonOperator(comparisonOperator: String)

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
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7da431dacaaba41d435b9b01e697b3a6191eeb851118af65548c35a7fc8c6885")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      /**
       * @param size The size in bytes that you want AWS WAF to compare against the size of the
       * specified `FieldToMatch` . 
       * AWS WAF uses this in combination with `ComparisonOperator` and `FieldToMatch` to build an
       * expression in the form of " `Size` `ComparisonOperator` size in bytes of `FieldToMatch` ". If
       * that expression is true, the `SizeConstraint` is considered to match.
       *
       * Valid values for size are 0 - 21474836480 bytes (0 - 20 GB).
       *
       * If you specify `URI` for the value of `Type` , the / in the URI path that you specify
       * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
       */
      public fun size(size: Number)

      /**
       * @param textTransformation Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass AWS WAF . 
       * If you specify a transformation, AWS WAF performs the transformation on `FieldToMatch`
       * before inspecting a request for a match.
       *
       * You can only specify a single type of TextTransformation.
       *
       * Note that if you choose `BODY` for the value of `Type` , you must choose `NONE` for
       * `TextTransformation` because the API Gateway API or Application Load Balancer forward only the
       * first 8192 bytes for inspection.
       *
       * *NONE*
       *
       * Specify `NONE` if you don't want to perform any text transformations.
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
       */
      public fun textTransformation(textTransformation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.builder()

      /**
       * @param comparisonOperator The type of comparison you want AWS WAF to perform. 
       * AWS WAF uses this in combination with the provided `Size` and `FieldToMatch` to build an
       * expression in the form of " `Size` `ComparisonOperator` size in bytes of `FieldToMatch` ". If
       * that expression is true, the `SizeConstraint` is considered to match.
       *
       * *EQ* : Used to test if the `Size` is equal to the size of the `FieldToMatch`
       *
       * *NE* : Used to test if the `Size` is not equal to the size of the `FieldToMatch`
       *
       * *LE* : Used to test if the `Size` is less than or equal to the size of the `FieldToMatch`
       *
       * *LT* : Used to test if the `Size` is strictly less than the size of the `FieldToMatch`
       *
       * *GE* : Used to test if the `Size` is greater than or equal to the size of the
       * `FieldToMatch`
       *
       * *GT* : Used to test if the `Size` is strictly greater than the size of the `FieldToMatch`
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
       * specific header or a query string. 
       */
      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
       * specific header or a query string. 
       */
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty.Companion::unwrap))
      }

      /**
       * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
       * specific header or a query string. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7da431dacaaba41d435b9b01e697b3a6191eeb851118af65548c35a7fc8c6885")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      /**
       * @param size The size in bytes that you want AWS WAF to compare against the size of the
       * specified `FieldToMatch` . 
       * AWS WAF uses this in combination with `ComparisonOperator` and `FieldToMatch` to build an
       * expression in the form of " `Size` `ComparisonOperator` size in bytes of `FieldToMatch` ". If
       * that expression is true, the `SizeConstraint` is considered to match.
       *
       * Valid values for size are 0 - 21474836480 bytes (0 - 20 GB).
       *
       * If you specify `URI` for the value of `Type` , the / in the URI path that you specify
       * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      /**
       * @param textTransformation Text transformations eliminate some of the unusual formatting
       * that attackers use in web requests in an effort to bypass AWS WAF . 
       * If you specify a transformation, AWS WAF performs the transformation on `FieldToMatch`
       * before inspecting a request for a match.
       *
       * You can only specify a single type of TextTransformation.
       *
       * Note that if you choose `BODY` for the value of `Type` , you must choose `NONE` for
       * `TextTransformation` because the API Gateway API or Application Load Balancer forward only the
       * first 8192 bytes for inspection.
       *
       * *NONE*
       *
       * Specify `NONE` if you don't want to perform any text transformations.
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
       */
      override fun textTransformation(textTransformation: String) {
        cdkBuilder.textTransformation(textTransformation)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty,
    ) : CdkObject(cdkObject),
        SizeConstraintProperty {
      /**
       * The type of comparison you want AWS WAF to perform.
       *
       * AWS WAF uses this in combination with the provided `Size` and `FieldToMatch` to build an
       * expression in the form of " `Size` `ComparisonOperator` size in bytes of `FieldToMatch` ". If
       * that expression is true, the `SizeConstraint` is considered to match.
       *
       * *EQ* : Used to test if the `Size` is equal to the size of the `FieldToMatch`
       *
       * *NE* : Used to test if the `Size` is not equal to the size of the `FieldToMatch`
       *
       * *LE* : Used to test if the `Size` is less than or equal to the size of the `FieldToMatch`
       *
       * *LT* : Used to test if the `Size` is strictly less than the size of the `FieldToMatch`
       *
       * *GE* : Used to test if the `Size` is greater than or equal to the size of the
       * `FieldToMatch`
       *
       * *GT* : Used to test if the `Size` is strictly greater than the size of the `FieldToMatch`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-comparisonoperator)
       */
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      /**
       * The part of a web request that you want AWS WAF to inspect, such as a specific header or a
       * query string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-fieldtomatch)
       */
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      /**
       * The size in bytes that you want AWS WAF to compare against the size of the specified
       * `FieldToMatch` .
       *
       * AWS WAF uses this in combination with `ComparisonOperator` and `FieldToMatch` to build an
       * expression in the form of " `Size` `ComparisonOperator` size in bytes of `FieldToMatch` ". If
       * that expression is true, the `SizeConstraint` is considered to match.
       *
       * Valid values for size are 0 - 21474836480 bytes (0 - 20 GB).
       *
       * If you specify `URI` for the value of `Type` , the / in the URI path that you specify
       * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-size)
       */
      override fun size(): Number = unwrap(this).getSize()

      /**
       * Text transformations eliminate some of the unusual formatting that attackers use in web
       * requests in an effort to bypass AWS WAF .
       *
       * If you specify a transformation, AWS WAF performs the transformation on `FieldToMatch`
       * before inspecting a request for a match.
       *
       * You can only specify a single type of TextTransformation.
       *
       * Note that if you choose `BODY` for the value of `Type` , you must choose `NONE` for
       * `TextTransformation` because the API Gateway API or Application Load Balancer forward only the
       * first 8192 bytes for inspection.
       *
       * *NONE*
       *
       * Specify `NONE` if you don't want to perform any text transformations.
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-texttransformation)
       */
      override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SizeConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty):
          SizeConstraintProperty = CdkObjectWrappers.wrap(cdkObject) as? SizeConstraintProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SizeConstraintProperty):
          software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty
    }
  }
}
