@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnNamedQuery`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.athena.*;
 * CfnNamedQueryProps cfnNamedQueryProps = CfnNamedQueryProps.builder()
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
public interface CfnNamedQueryProps {
  /**
   * The database to which the query belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database)
   */
  public fun database(): String

  /**
   * The query description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The query name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The SQL statements that make up the query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring)
   */
  public fun queryString(): String

  /**
   * The name of the workgroup that contains the named query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-workgroup)
   */
  public fun workGroup(): String? = unwrap(this).getWorkGroup()

  /**
   * A builder for [CfnNamedQueryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param database The database to which the query belongs. 
     */
    public fun database(database: String)

    /**
     * @param description The query description.
     */
    public fun description(description: String)

    /**
     * @param name The query name.
     */
    public fun name(name: String)

    /**
     * @param queryString The SQL statements that make up the query. 
     */
    public fun queryString(queryString: String)

    /**
     * @param workGroup The name of the workgroup that contains the named query.
     */
    public fun workGroup(workGroup: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder =
        software.amazon.awscdk.services.athena.CfnNamedQueryProps.builder()

    /**
     * @param database The database to which the query belongs. 
     */
    override fun database(database: String) {
      cdkBuilder.database(database)
    }

    /**
     * @param description The query description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The query name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param queryString The SQL statements that make up the query. 
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * @param workGroup The name of the workgroup that contains the named query.
     */
    override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnNamedQueryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.athena.CfnNamedQueryProps,
  ) : CdkObject(cdkObject), CfnNamedQueryProps {
    /**
     * The database to which the query belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database)
     */
    override fun database(): String = unwrap(this).getDatabase()

    /**
     * The query description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The query name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The SQL statements that make up the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring)
     */
    override fun queryString(): String = unwrap(this).getQueryString()

    /**
     * The name of the workgroup that contains the named query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-workgroup)
     */
    override fun workGroup(): String? = unwrap(this).getWorkGroup()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNamedQueryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnNamedQueryProps):
        CfnNamedQueryProps = CdkObjectWrappers.wrap(cdkObject) as CfnNamedQueryProps

    internal fun unwrap(wrapped: CfnNamedQueryProps):
        software.amazon.awscdk.services.athena.CfnNamedQueryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.athena.CfnNamedQueryProps
  }
}
