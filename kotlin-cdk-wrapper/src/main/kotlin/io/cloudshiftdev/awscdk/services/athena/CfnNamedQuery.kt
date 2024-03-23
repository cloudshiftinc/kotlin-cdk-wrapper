@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Athena::NamedQuery` resource specifies an Amazon Athena saved query, where
 * `QueryString` contains the SQL query statements that make up the query.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.athena.*;
 * CfnNamedQuery cfnNamedQuery = CfnNamedQuery.Builder.create(this, "MyCfnNamedQuery")
 * .database("database")
 * .queryString("queryString")
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .workGroup("workGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html)
 */
public open class CfnNamedQuery(
  cdkObject: software.amazon.awscdk.services.athena.CfnNamedQuery,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNamedQueryProps,
  ) :
      this(software.amazon.awscdk.services.athena.CfnNamedQuery(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnNamedQueryProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNamedQueryProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNamedQueryProps(props)
  )

  /**
   * The unique ID of the query.
   */
  public open fun attrNamedQueryId(): String = unwrap(this).getAttrNamedQueryId()

  /**
   * The database to which the query belongs.
   */
  public open fun database(): String = unwrap(this).getDatabase()

  /**
   * The database to which the query belongs.
   */
  public open fun database(`value`: String) {
    unwrap(this).setDatabase(`value`)
  }

  /**
   * The query description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The query description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The query name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The query name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The SQL statements that make up the query.
   */
  public open fun queryString(): String = unwrap(this).getQueryString()

  /**
   * The SQL statements that make up the query.
   */
  public open fun queryString(`value`: String) {
    unwrap(this).setQueryString(`value`)
  }

  /**
   * The name of the workgroup that contains the named query.
   */
  public open fun workGroup(): String? = unwrap(this).getWorkGroup()

  /**
   * The name of the workgroup that contains the named query.
   */
  public open fun workGroup(`value`: String) {
    unwrap(this).setWorkGroup(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.athena.CfnNamedQuery].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The database to which the query belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database)
     * @param database The database to which the query belongs. 
     */
    public fun database(database: String)

    /**
     * The query description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description)
     * @param description The query description. 
     */
    public fun description(description: String)

    /**
     * The query name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name)
     * @param name The query name. 
     */
    public fun name(name: String)

    /**
     * The SQL statements that make up the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring)
     * @param queryString The SQL statements that make up the query. 
     */
    public fun queryString(queryString: String)

    /**
     * The name of the workgroup that contains the named query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-workgroup)
     * @param workGroup The name of the workgroup that contains the named query. 
     */
    public fun workGroup(workGroup: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnNamedQuery.Builder =
        software.amazon.awscdk.services.athena.CfnNamedQuery.Builder.create(scope, id)

    /**
     * The database to which the query belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database)
     * @param database The database to which the query belongs. 
     */
    override fun database(database: String) {
      cdkBuilder.database(database)
    }

    /**
     * The query description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description)
     * @param description The query description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The query name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name)
     * @param name The query name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The SQL statements that make up the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring)
     * @param queryString The SQL statements that make up the query. 
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * The name of the workgroup that contains the named query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-workgroup)
     * @param workGroup The name of the workgroup that contains the named query. 
     */
    override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnNamedQuery = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.athena.CfnNamedQuery.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNamedQuery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNamedQuery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnNamedQuery):
        CfnNamedQuery = CfnNamedQuery(cdkObject)

    internal fun unwrap(wrapped: CfnNamedQuery):
        software.amazon.awscdk.services.athena.CfnNamedQuery = wrapped.cdkObject as
        software.amazon.awscdk.services.athena.CfnNamedQuery
  }
}
