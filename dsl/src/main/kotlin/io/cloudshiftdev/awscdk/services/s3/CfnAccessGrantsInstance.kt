package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessGrantsInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsInstance,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The ARN of the S3 Access Grants instance.
   */
  public open fun attrAccessGrantsInstanceArn(): String =
      unwrap(this).getAttrAccessGrantsInstanceArn()

  /**
   * The ID of the S3 Access Grants instance.
   *
   * The ID is `default` . You can have one S3 Access Grants instance per Region per account.
   */
  public open fun attrAccessGrantsInstanceId(): String =
      unwrap(this).getAttrAccessGrantsInstanceId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * If you would like to associate your S3 Access Grants instance with an AWS IAM Identity Center
   * instance, use this field to pass the Amazon Resource Name (ARN) of the AWS IAM Identity Center
   * instance that you are associating with your S3 Access Grants instance.
   */
  public open fun identityCenterArn(): String? = unwrap(this).getIdentityCenterArn()

  /**
   * If you would like to associate your S3 Access Grants instance with an AWS IAM Identity Center
   * instance, use this field to pass the Amazon Resource Name (ARN) of the AWS IAM Identity Center
   * instance that you are associating with your S3 Access Grants instance.
   */
  public open fun identityCenterArn(`value`: String) {
    unwrap(this).setIdentityCenterArn(`value`)
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
   * The AWS resource tags that you are adding to the S3 Access Grants instance.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The AWS resource tags that you are adding to the S3 Access Grants instance.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The AWS resource tags that you are adding to the S3 Access Grants instance.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnAccessGrantsInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If you would like to associate your S3 Access Grants instance with an AWS IAM Identity Center
     * instance, use this field to pass the Amazon Resource Name (ARN) of the AWS IAM Identity Center
     * instance that you are associating with your S3 Access Grants instance.
     *
     * An IAM Identity Center instance is your corporate identity directory that you added to the
     * IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html#cfn-s3-accessgrantsinstance-identitycenterarn)
     * @param identityCenterArn If you would like to associate your S3 Access Grants instance with
     * an AWS IAM Identity Center instance, use this field to pass the Amazon Resource Name (ARN) of
     * the AWS IAM Identity Center instance that you are associating with your S3 Access Grants
     * instance. 
     */
    public fun identityCenterArn(identityCenterArn: String)

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants instance.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html#cfn-s3-accessgrantsinstance-tags)
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants instance. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants instance.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html#cfn-s3-accessgrantsinstance-tags)
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants instance. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrantsInstance.Builder =
        software.amazon.awscdk.services.s3.CfnAccessGrantsInstance.Builder.create(scope, id)

    /**
     * If you would like to associate your S3 Access Grants instance with an AWS IAM Identity Center
     * instance, use this field to pass the Amazon Resource Name (ARN) of the AWS IAM Identity Center
     * instance that you are associating with your S3 Access Grants instance.
     *
     * An IAM Identity Center instance is your corporate identity directory that you added to the
     * IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html#cfn-s3-accessgrantsinstance-identitycenterarn)
     * @param identityCenterArn If you would like to associate your S3 Access Grants instance with
     * an AWS IAM Identity Center instance, use this field to pass the Amazon Resource Name (ARN) of
     * the AWS IAM Identity Center instance that you are associating with your S3 Access Grants
     * instance. 
     */
    override fun identityCenterArn(identityCenterArn: String) {
      cdkBuilder.identityCenterArn(identityCenterArn)
    }

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants instance.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html#cfn-s3-accessgrantsinstance-tags)
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants instance. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants instance.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html#cfn-s3-accessgrantsinstance-tags)
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants instance. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrantsInstance =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessGrantsInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessGrantsInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsInstance):
        CfnAccessGrantsInstance = CfnAccessGrantsInstance(cdkObject)

    internal fun unwrap(wrapped: CfnAccessGrantsInstance):
        software.amazon.awscdk.services.s3.CfnAccessGrantsInstance = wrapped.cdkObject
  }
}