@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a query definition for CloudWatch Logs Insights.
 *
 * For more information, see [Analyzing Log Data with CloudWatch Logs
 * Insights](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AnalyzingLogData.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnQueryDefinition cfnQueryDefinition = CfnQueryDefinition.Builder.create(this,
 * "MyCfnQueryDefinition")
 * .name("name")
 * .queryString("queryString")
 * // the properties below are optional
 * .logGroupNames(List.of("logGroupNames"))
 * .queryLanguage("queryLanguage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html)
 */
public open class CfnQueryDefinition(
  cdkObject: software.amazon.awscdk.services.logs.CfnQueryDefinition,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueryDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnQueryDefinition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnQueryDefinitionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueryDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnQueryDefinitionProps(props)
  )

  /**
   * The ID of the query definition.
   */
  public open fun attrQueryDefinitionId(): String = unwrap(this).getAttrQueryDefinitionId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Use this parameter if you want the query to query only certain log groups.
   */
  public open fun logGroupNames(): List<String> = unwrap(this).getLogGroupNames() ?: emptyList()

  /**
   * Use this parameter if you want the query to query only certain log groups.
   */
  public open fun logGroupNames(`value`: List<String>) {
    unwrap(this).setLogGroupNames(`value`)
  }

  /**
   * Use this parameter if you want the query to query only certain log groups.
   */
  public open fun logGroupNames(vararg `value`: String): Unit = logGroupNames(`value`.toList())

  /**
   * A name for the query definition.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the query definition.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The query language used for this query.
   */
  public open fun queryLanguage(): String? = unwrap(this).getQueryLanguage()

  /**
   * The query language used for this query.
   */
  public open fun queryLanguage(`value`: String) {
    unwrap(this).setQueryLanguage(`value`)
  }

  /**
   * The query string to use for this query definition.
   */
  public open fun queryString(): String = unwrap(this).getQueryString()

  /**
   * The query string to use for this query definition.
   */
  public open fun queryString(`value`: String) {
    unwrap(this).setQueryString(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnQueryDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Use this parameter if you want the query to query only certain log groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-loggroupnames)
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     * groups. 
     */
    public fun logGroupNames(logGroupNames: List<String>)

    /**
     * Use this parameter if you want the query to query only certain log groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-loggroupnames)
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     * groups. 
     */
    public fun logGroupNames(vararg logGroupNames: String)

    /**
     * A name for the query definition.
     *
     *
     * You can use the name to create a folder structure for your queries. To create a folder, use a
     * forward slash (/) to prefix your desired query name with your desired folder name. For example,
     * `*folder-name* / *query-name*` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-name)
     * @param name A name for the query definition. 
     */
    public fun name(name: String)

    /**
     * The query language used for this query.
     *
     * For more information about the query languages that CloudWatch Logs supports, see [Supported
     * query
     * languages](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_AnalyzeLogData_Languages.html)
     * .
     *
     * Default: - "CWLI"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-querylanguage)
     * @param queryLanguage The query language used for this query. 
     */
    public fun queryLanguage(queryLanguage: String)

    /**
     * The query string to use for this query definition.
     *
     * For more information, see [CloudWatch Logs Insights Query
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-querystring)
     * @param queryString The query string to use for this query definition. 
     */
    public fun queryString(queryString: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnQueryDefinition.Builder =
        software.amazon.awscdk.services.logs.CfnQueryDefinition.Builder.create(scope, id)

    /**
     * Use this parameter if you want the query to query only certain log groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-loggroupnames)
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     * groups. 
     */
    override fun logGroupNames(logGroupNames: List<String>) {
      cdkBuilder.logGroupNames(logGroupNames)
    }

    /**
     * Use this parameter if you want the query to query only certain log groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-loggroupnames)
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     * groups. 
     */
    override fun logGroupNames(vararg logGroupNames: String): Unit =
        logGroupNames(logGroupNames.toList())

    /**
     * A name for the query definition.
     *
     *
     * You can use the name to create a folder structure for your queries. To create a folder, use a
     * forward slash (/) to prefix your desired query name with your desired folder name. For example,
     * `*folder-name* / *query-name*` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-name)
     * @param name A name for the query definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The query language used for this query.
     *
     * For more information about the query languages that CloudWatch Logs supports, see [Supported
     * query
     * languages](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_AnalyzeLogData_Languages.html)
     * .
     *
     * Default: - "CWLI"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-querylanguage)
     * @param queryLanguage The query language used for this query. 
     */
    override fun queryLanguage(queryLanguage: String) {
      cdkBuilder.queryLanguage(queryLanguage)
    }

    /**
     * The query string to use for this query definition.
     *
     * For more information, see [CloudWatch Logs Insights Query
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-querystring)
     * @param queryString The query string to use for this query definition. 
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnQueryDefinition = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnQueryDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueryDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueryDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnQueryDefinition):
        CfnQueryDefinition = CfnQueryDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnQueryDefinition):
        software.amazon.awscdk.services.logs.CfnQueryDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.CfnQueryDefinition
  }
}
