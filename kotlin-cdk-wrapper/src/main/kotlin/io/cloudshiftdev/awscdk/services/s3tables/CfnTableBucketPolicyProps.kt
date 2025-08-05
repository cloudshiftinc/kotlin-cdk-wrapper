@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3tables

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTableBucketPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3tables.*;
 * Object resourcePolicy;
 * CfnTableBucketPolicyProps cfnTableBucketPolicyProps = CfnTableBucketPolicyProps.builder()
 * .resourcePolicy(resourcePolicy)
 * .tableBucketArn("tableBucketArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucketpolicy.html)
 */
public interface CfnTableBucketPolicyProps {
  /**
   * The bucket policy JSON for the table bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucketpolicy.html#cfn-s3tables-tablebucketpolicy-resourcepolicy)
   */
  public fun resourcePolicy(): Any

  /**
   * The Amazon Resource Name (ARN) of the table bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucketpolicy.html#cfn-s3tables-tablebucketpolicy-tablebucketarn)
   */
  public fun tableBucketArn(): String

  /**
   * A builder for [CfnTableBucketPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourcePolicy The bucket policy JSON for the table bucket. 
     */
    public fun resourcePolicy(resourcePolicy: Any)

    /**
     * @param tableBucketArn The Amazon Resource Name (ARN) of the table bucket. 
     */
    public fun tableBucketArn(tableBucketArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3tables.CfnTableBucketPolicyProps.Builder =
        software.amazon.awscdk.services.s3tables.CfnTableBucketPolicyProps.builder()

    /**
     * @param resourcePolicy The bucket policy JSON for the table bucket. 
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    /**
     * @param tableBucketArn The Amazon Resource Name (ARN) of the table bucket. 
     */
    override fun tableBucketArn(tableBucketArn: String) {
      cdkBuilder.tableBucketArn(tableBucketArn)
    }

    public fun build(): software.amazon.awscdk.services.s3tables.CfnTableBucketPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucketPolicyProps,
  ) : CdkObject(cdkObject),
      CfnTableBucketPolicyProps {
    /**
     * The bucket policy JSON for the table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucketpolicy.html#cfn-s3tables-tablebucketpolicy-resourcepolicy)
     */
    override fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()

    /**
     * The Amazon Resource Name (ARN) of the table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucketpolicy.html#cfn-s3tables-tablebucketpolicy-tablebucketarn)
     */
    override fun tableBucketArn(): String = unwrap(this).getTableBucketArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableBucketPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucketPolicyProps):
        CfnTableBucketPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTableBucketPolicyProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableBucketPolicyProps):
        software.amazon.awscdk.services.s3tables.CfnTableBucketPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3tables.CfnTableBucketPolicyProps
  }
}
