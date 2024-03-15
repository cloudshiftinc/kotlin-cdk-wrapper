@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnQueryDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnQueryDefinitionProps cfnQueryDefinitionProps = CfnQueryDefinitionProps.builder()
 * .name("name")
 * .queryString("queryString")
 * // the properties below are optional
 * .logGroupNames(List.of("logGroupNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html)
 */
public interface CfnQueryDefinitionProps {
  /**
   * Use this parameter if you want the query to query only certain log groups.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-loggroupnames)
   */
  public fun logGroupNames(): List<String> = unwrap(this).getLogGroupNames() ?: emptyList()

  /**
   * A name for the query definition.
   *
   *
   * You can use the name to create a folder structure for your queries. To create a folder, use a
   * forward slash (/) to prefix your desired query name with your desired folder name. For example, `/
   * *folder-name* / *query-name*` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-name)
   */
  public fun name(): String

  /**
   * The query string to use for this query definition.
   *
   * For more information, see [CloudWatch Logs Insights Query
   * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-querystring)
   */
  public fun queryString(): String

  /**
   * A builder for [CfnQueryDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     * groups.
     */
    public fun logGroupNames(logGroupNames: List<String>)

    /**
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     * groups.
     */
    public fun logGroupNames(vararg logGroupNames: String)

    /**
     * @param name A name for the query definition. 
     *
     * You can use the name to create a folder structure for your queries. To create a folder, use a
     * forward slash (/) to prefix your desired query name with your desired folder name. For example,
     * `/ *folder-name* / *query-name*` .
     */
    public fun name(name: String)

    /**
     * @param queryString The query string to use for this query definition. 
     * For more information, see [CloudWatch Logs Insights Query
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html) .
     */
    public fun queryString(queryString: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnQueryDefinitionProps.Builder =
        software.amazon.awscdk.services.logs.CfnQueryDefinitionProps.builder()

    /**
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     * groups.
     */
    override fun logGroupNames(logGroupNames: List<String>) {
      cdkBuilder.logGroupNames(logGroupNames)
    }

    /**
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     * groups.
     */
    override fun logGroupNames(vararg logGroupNames: String): Unit =
        logGroupNames(logGroupNames.toList())

    /**
     * @param name A name for the query definition. 
     *
     * You can use the name to create a folder structure for your queries. To create a folder, use a
     * forward slash (/) to prefix your desired query name with your desired folder name. For example,
     * `/ *folder-name* / *query-name*` .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param queryString The query string to use for this query definition. 
     * For more information, see [CloudWatch Logs Insights Query
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html) .
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnQueryDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnQueryDefinitionProps,
  ) : CdkObject(cdkObject), CfnQueryDefinitionProps {
    /**
     * Use this parameter if you want the query to query only certain log groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-loggroupnames)
     */
    override fun logGroupNames(): List<String> = unwrap(this).getLogGroupNames() ?: emptyList()

    /**
     * A name for the query definition.
     *
     *
     * You can use the name to create a folder structure for your queries. To create a folder, use a
     * forward slash (/) to prefix your desired query name with your desired folder name. For example,
     * `/ *folder-name* / *query-name*` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The query string to use for this query definition.
     *
     * For more information, see [CloudWatch Logs Insights Query
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-querystring)
     */
    override fun queryString(): String = unwrap(this).getQueryString()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueryDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnQueryDefinitionProps):
        CfnQueryDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueryDefinitionProps):
        software.amazon.awscdk.services.logs.CfnQueryDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnQueryDefinitionProps
  }
}
