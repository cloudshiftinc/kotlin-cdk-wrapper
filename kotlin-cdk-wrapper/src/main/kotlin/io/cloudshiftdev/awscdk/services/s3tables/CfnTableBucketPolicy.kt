@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3tables

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new maintenance configuration or replaces an existing table bucket policy for a table
 * bucket.
 *
 * For more information, see [Adding a table bucket
 * policy](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-tables-bucket-policy.html#table-bucket-policy-add)
 * in the *Amazon Simple Storage Service User Guide* .
 *
 * * **Permissions** - You must have the `s3tables:PutTableBucketPolicy` permission to use this
 * operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3tables.*;
 * Object resourcePolicy;
 * CfnTableBucketPolicy cfnTableBucketPolicy = CfnTableBucketPolicy.Builder.create(this,
 * "MyCfnTableBucketPolicy")
 * .resourcePolicy(resourcePolicy)
 * .tableBucketArn("tableBucketArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucketpolicy.html)
 */
public open class CfnTableBucketPolicy(
  cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucketPolicy,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableBucketPolicyProps,
  ) :
      this(software.amazon.awscdk.services.s3tables.CfnTableBucketPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTableBucketPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableBucketPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTableBucketPolicyProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The bucket policy JSON for the table bucket.
   */
  public open fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()

  /**
   * The bucket policy JSON for the table bucket.
   */
  public open fun resourcePolicy(`value`: Any) {
    unwrap(this).setResourcePolicy(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the table bucket.
   */
  public open fun tableBucketArn(): String = unwrap(this).getTableBucketArn()

  /**
   * The Amazon Resource Name (ARN) of the table bucket.
   */
  public open fun tableBucketArn(`value`: String) {
    unwrap(this).setTableBucketArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3tables.CfnTableBucketPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The bucket policy JSON for the table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucketpolicy.html#cfn-s3tables-tablebucketpolicy-resourcepolicy)
     * @param resourcePolicy The bucket policy JSON for the table bucket. 
     */
    public fun resourcePolicy(resourcePolicy: Any)

    /**
     * The Amazon Resource Name (ARN) of the table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucketpolicy.html#cfn-s3tables-tablebucketpolicy-tablebucketarn)
     * @param tableBucketArn The Amazon Resource Name (ARN) of the table bucket. 
     */
    public fun tableBucketArn(tableBucketArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3tables.CfnTableBucketPolicy.Builder =
        software.amazon.awscdk.services.s3tables.CfnTableBucketPolicy.Builder.create(scope, id)

    /**
     * The bucket policy JSON for the table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucketpolicy.html#cfn-s3tables-tablebucketpolicy-resourcepolicy)
     * @param resourcePolicy The bucket policy JSON for the table bucket. 
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    /**
     * The Amazon Resource Name (ARN) of the table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucketpolicy.html#cfn-s3tables-tablebucketpolicy-tablebucketarn)
     * @param tableBucketArn The Amazon Resource Name (ARN) of the table bucket. 
     */
    override fun tableBucketArn(tableBucketArn: String) {
      cdkBuilder.tableBucketArn(tableBucketArn)
    }

    public fun build(): software.amazon.awscdk.services.s3tables.CfnTableBucketPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3tables.CfnTableBucketPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTableBucketPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTableBucketPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucketPolicy):
        CfnTableBucketPolicy = CfnTableBucketPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnTableBucketPolicy):
        software.amazon.awscdk.services.s3tables.CfnTableBucketPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.s3tables.CfnTableBucketPolicy
  }
}
