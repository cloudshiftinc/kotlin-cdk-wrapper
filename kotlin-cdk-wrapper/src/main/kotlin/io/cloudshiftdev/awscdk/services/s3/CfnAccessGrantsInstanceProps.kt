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
 * Properties for defining a `CfnAccessGrantsInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * CfnAccessGrantsInstanceProps cfnAccessGrantsInstanceProps =
 * CfnAccessGrantsInstanceProps.builder()
 * .identityCenterArn("identityCenterArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html)
 */
public interface CfnAccessGrantsInstanceProps {
  /**
   * If you would like to associate your S3 Access Grants instance with an AWS IAM Identity Center
   * instance, use this field to pass the Amazon Resource Name (ARN) of the AWS IAM Identity Center
   * instance that you are associating with your S3 Access Grants instance.
   *
   * An IAM Identity Center instance is your corporate identity directory that you added to the IAM
   * Identity Center.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html#cfn-s3-accessgrantsinstance-identitycenterarn)
   */
  public fun identityCenterArn(): String? = unwrap(this).getIdentityCenterArn()

  /**
   * The AWS resource tags that you are adding to the S3 Access Grants instance.
   *
   * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
   * identify, organize, search for, and filter resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html#cfn-s3-accessgrantsinstance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAccessGrantsInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identityCenterArn If you would like to associate your S3 Access Grants instance with
     * an AWS IAM Identity Center instance, use this field to pass the Amazon Resource Name (ARN) of
     * the AWS IAM Identity Center instance that you are associating with your S3 Access Grants
     * instance.
     * An IAM Identity Center instance is your corporate identity directory that you added to the
     * IAM Identity Center.
     */
    public fun identityCenterArn(identityCenterArn: String)

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants instance.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants instance.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrantsInstanceProps.Builder
        = software.amazon.awscdk.services.s3.CfnAccessGrantsInstanceProps.builder()

    /**
     * @param identityCenterArn If you would like to associate your S3 Access Grants instance with
     * an AWS IAM Identity Center instance, use this field to pass the Amazon Resource Name (ARN) of
     * the AWS IAM Identity Center instance that you are associating with your S3 Access Grants
     * instance.
     * An IAM Identity Center instance is your corporate identity directory that you added to the
     * IAM Identity Center.
     */
    override fun identityCenterArn(identityCenterArn: String) {
      cdkBuilder.identityCenterArn(identityCenterArn)
    }

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants instance.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants instance.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrantsInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsInstanceProps,
  ) : CdkObject(cdkObject), CfnAccessGrantsInstanceProps {
    /**
     * If you would like to associate your S3 Access Grants instance with an AWS IAM Identity Center
     * instance, use this field to pass the Amazon Resource Name (ARN) of the AWS IAM Identity Center
     * instance that you are associating with your S3 Access Grants instance.
     *
     * An IAM Identity Center instance is your corporate identity directory that you added to the
     * IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html#cfn-s3-accessgrantsinstance-identitycenterarn)
     */
    override fun identityCenterArn(): String? = unwrap(this).getIdentityCenterArn()

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants instance.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html#cfn-s3-accessgrantsinstance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessGrantsInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsInstanceProps):
        CfnAccessGrantsInstanceProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnAccessGrantsInstanceProps

    internal fun unwrap(wrapped: CfnAccessGrantsInstanceProps):
        software.amazon.awscdk.services.s3.CfnAccessGrantsInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnAccessGrantsInstanceProps
  }
}
