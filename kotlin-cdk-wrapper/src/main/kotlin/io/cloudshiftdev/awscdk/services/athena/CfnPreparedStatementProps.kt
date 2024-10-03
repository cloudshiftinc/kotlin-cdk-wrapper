@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPreparedStatement`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.athena.*;
 * CfnPreparedStatementProps cfnPreparedStatementProps = CfnPreparedStatementProps.builder()
 * .queryStatement("queryStatement")
 * .statementName("statementName")
 * .workGroup("workGroup")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html)
 */
public interface CfnPreparedStatementProps {
  /**
   * The description of the prepared statement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The query string for the prepared statement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-querystatement)
   */
  public fun queryStatement(): String

  /**
   * The name of the prepared statement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-statementname)
   */
  public fun statementName(): String

  /**
   * The workgroup to which the prepared statement belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-workgroup)
   */
  public fun workGroup(): String

  /**
   * A builder for [CfnPreparedStatementProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the prepared statement.
     */
    public fun description(description: String)

    /**
     * @param queryStatement The query string for the prepared statement. 
     */
    public fun queryStatement(queryStatement: String)

    /**
     * @param statementName The name of the prepared statement. 
     */
    public fun statementName(statementName: String)

    /**
     * @param workGroup The workgroup to which the prepared statement belongs. 
     */
    public fun workGroup(workGroup: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnPreparedStatementProps.Builder
        = software.amazon.awscdk.services.athena.CfnPreparedStatementProps.builder()

    /**
     * @param description The description of the prepared statement.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param queryStatement The query string for the prepared statement. 
     */
    override fun queryStatement(queryStatement: String) {
      cdkBuilder.queryStatement(queryStatement)
    }

    /**
     * @param statementName The name of the prepared statement. 
     */
    override fun statementName(statementName: String) {
      cdkBuilder.statementName(statementName)
    }

    /**
     * @param workGroup The workgroup to which the prepared statement belongs. 
     */
    override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnPreparedStatementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.athena.CfnPreparedStatementProps,
  ) : CdkObject(cdkObject),
      CfnPreparedStatementProps {
    /**
     * The description of the prepared statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The query string for the prepared statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-querystatement)
     */
    override fun queryStatement(): String = unwrap(this).getQueryStatement()

    /**
     * The name of the prepared statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-statementname)
     */
    override fun statementName(): String = unwrap(this).getStatementName()

    /**
     * The workgroup to which the prepared statement belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-workgroup)
     */
    override fun workGroup(): String = unwrap(this).getWorkGroup()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPreparedStatementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnPreparedStatementProps):
        CfnPreparedStatementProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPreparedStatementProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPreparedStatementProps):
        software.amazon.awscdk.services.athena.CfnPreparedStatementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.athena.CfnPreparedStatementProps
  }
}
