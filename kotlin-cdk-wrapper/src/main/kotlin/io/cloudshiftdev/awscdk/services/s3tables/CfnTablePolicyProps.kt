@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3tables

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTablePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3tables.*;
 * Object resourcePolicy;
 * CfnTablePolicyProps cfnTablePolicyProps = CfnTablePolicyProps.builder()
 * .resourcePolicy(resourcePolicy)
 * .tableArn("tableArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablepolicy.html)
 */
public interface CfnTablePolicyProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablepolicy.html#cfn-s3tables-tablepolicy-resourcepolicy)
   */
  public fun resourcePolicy(): Any

  /**
   * The Amazon Resource Name (ARN) of the specified table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablepolicy.html#cfn-s3tables-tablepolicy-tablearn)
   */
  public fun tableArn(): String

  /**
   * A builder for [CfnTablePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourcePolicy the value to be set. 
     */
    public fun resourcePolicy(resourcePolicy: Any)

    /**
     * @param tableArn The Amazon Resource Name (ARN) of the specified table. 
     */
    public fun tableArn(tableArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3tables.CfnTablePolicyProps.Builder =
        software.amazon.awscdk.services.s3tables.CfnTablePolicyProps.builder()

    /**
     * @param resourcePolicy the value to be set. 
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    /**
     * @param tableArn The Amazon Resource Name (ARN) of the specified table. 
     */
    override fun tableArn(tableArn: String) {
      cdkBuilder.tableArn(tableArn)
    }

    public fun build(): software.amazon.awscdk.services.s3tables.CfnTablePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3tables.CfnTablePolicyProps,
  ) : CdkObject(cdkObject),
      CfnTablePolicyProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablepolicy.html#cfn-s3tables-tablepolicy-resourcepolicy)
     */
    override fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()

    /**
     * The Amazon Resource Name (ARN) of the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablepolicy.html#cfn-s3tables-tablepolicy-tablearn)
     */
    override fun tableArn(): String = unwrap(this).getTableArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTablePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTablePolicyProps):
        CfnTablePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTablePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTablePolicyProps):
        software.amazon.awscdk.services.s3tables.CfnTablePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3tables.CfnTablePolicyProps
  }
}
