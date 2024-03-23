@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAccessGrantsLocation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * CfnAccessGrantsLocationProps cfnAccessGrantsLocationProps =
 * CfnAccessGrantsLocationProps.builder()
 * .iamRoleArn("iamRoleArn")
 * .locationScope("locationScope")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html)
 */
public interface CfnAccessGrantsLocationProps {
  /**
   * The Amazon Resource Name (ARN) of the IAM role for the registered location.
   *
   * S3 Access Grants assumes this role to manage access to the registered location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-iamrolearn)
   */
  public fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  /**
   * The S3 URI path to the location that you are registering.
   *
   * The location scope can be the default S3 location `s3://` , the S3 path to a bucket, or the S3
   * path to a bucket and prefix. A prefix in S3 is a string of characters at the beginning of an
   * object key name used to organize the objects that you store in your S3 buckets. For example,
   * object key names that start with the `engineering/` prefix or object key names that start with the
   * `marketing/campaigns/` prefix.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-locationscope)
   */
  public fun locationScope(): String? = unwrap(this).getLocationScope()

  /**
   * The AWS resource tags that you are adding to the S3 Access Grants location.
   *
   * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
   * identify, organize, search for, and filter resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAccessGrantsLocationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role for the registered location.
     * S3 Access Grants assumes this role to manage access to the registered location.
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * @param locationScope The S3 URI path to the location that you are registering.
     * The location scope can be the default S3 location `s3://` , the S3 path to a bucket, or the
     * S3 path to a bucket and prefix. A prefix in S3 is a string of characters at the beginning of an
     * object key name used to organize the objects that you store in your S3 buckets. For example,
     * object key names that start with the `engineering/` prefix or object key names that start with
     * the `marketing/campaigns/` prefix.
     */
    public fun locationScope(locationScope: String)

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps.Builder
        = software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps.builder()

    /**
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role for the registered location.
     * S3 Access Grants assumes this role to manage access to the registered location.
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param locationScope The S3 URI path to the location that you are registering.
     * The location scope can be the default S3 location `s3://` , the S3 path to a bucket, or the
     * S3 path to a bucket and prefix. A prefix in S3 is a string of characters at the beginning of an
     * object key name used to organize the objects that you store in your S3 buckets. For example,
     * object key names that start with the `engineering/` prefix or object key names that start with
     * the `marketing/campaigns/` prefix.
     */
    override fun locationScope(locationScope: String) {
      cdkBuilder.locationScope(locationScope)
    }

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps,
  ) : CdkObject(cdkObject), CfnAccessGrantsLocationProps {
    /**
     * The Amazon Resource Name (ARN) of the IAM role for the registered location.
     *
     * S3 Access Grants assumes this role to manage access to the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-iamrolearn)
     */
    override fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

    /**
     * The S3 URI path to the location that you are registering.
     *
     * The location scope can be the default S3 location `s3://` , the S3 path to a bucket, or the
     * S3 path to a bucket and prefix. A prefix in S3 is a string of characters at the beginning of an
     * object key name used to organize the objects that you store in your S3 buckets. For example,
     * object key names that start with the `engineering/` prefix or object key names that start with
     * the `marketing/campaigns/` prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-locationscope)
     */
    override fun locationScope(): String? = unwrap(this).getLocationScope()

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants location.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessGrantsLocationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps):
        CfnAccessGrantsLocationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnAccessGrantsLocationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessGrantsLocationProps):
        software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps
  }
}
