@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * The `AWS::S3::AccessGrantsLocation` resource creates the S3 data location that you would like to
 * register in your S3 Access Grants instance.
 *
 * Your S3 data must be in the same Region as your S3 Access Grants instance. The location can be
 * one of the following:
 *
 * * The default S3 location `s3://`
 * * A bucket - `S3://&lt;bucket-name&gt;`
 * * A bucket and prefix - `S3://&lt;bucket-name&gt;/&lt;prefix&gt;`
 *
 * When you register a location, you must include the IAM role that has permission to manage the S3
 * location that you are registering. Give S3 Access Grants permission to assume this role [using a
 * policy](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-location.html) . S3
 * Access Grants assumes this role to manage access to the location and to vend temporary credentials
 * to grantees or client applications.
 *
 * * **Permissions** - You must have the `s3:CreateAccessGrantsLocation` permission to use this
 * resource.
 * * **Additional Permissions** - You must also have the following permission for the specified IAM
 * role: `iam:PassRole`
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * CfnAccessGrantsLocation cfnAccessGrantsLocation = CfnAccessGrantsLocation.Builder.create(this,
 * "MyCfnAccessGrantsLocation")
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
public open class CfnAccessGrantsLocation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsLocation,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.s3.CfnAccessGrantsLocation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessGrantsLocationProps,
  ) :
      this(software.amazon.awscdk.services.s3.CfnAccessGrantsLocation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAccessGrantsLocationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessGrantsLocationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccessGrantsLocationProps(props)
  )

  /**
   * The ARN of the location you are registering.
   */
  public open fun attrAccessGrantsLocationArn(): String =
      unwrap(this).getAttrAccessGrantsLocationArn()

  /**
   * The ID of the registered location to which you are granting access.
   *
   * S3 Access Grants assigns this ID when you register the location. S3 Access Grants assigns the
   * ID `default` to the default location `s3://` and assigns an auto-generated ID to other locations
   * that you register.
   */
  public open fun attrAccessGrantsLocationId(): String =
      unwrap(this).getAttrAccessGrantsLocationId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) of the IAM role for the registered location.
   */
  public open fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role for the registered location.
   */
  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
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
   * The S3 URI path to the location that you are registering.
   */
  public open fun locationScope(): String? = unwrap(this).getLocationScope()

  /**
   * The S3 URI path to the location that you are registering.
   */
  public open fun locationScope(`value`: String) {
    unwrap(this).setLocationScope(`value`)
  }

  /**
   * The AWS resource tags that you are adding to the S3 Access Grants location.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The AWS resource tags that you are adding to the S3 Access Grants location.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The AWS resource tags that you are adding to the S3 Access Grants location.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnAccessGrantsLocation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the IAM role for the registered location.
     *
     * S3 Access Grants assumes this role to manage access to the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-iamrolearn)
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role for the registered location.
     * 
     */
    public fun iamRoleArn(iamRoleArn: String)

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
     * @param locationScope The S3 URI path to the location that you are registering. 
     */
    public fun locationScope(locationScope: String)

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants location.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-tags)
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants location.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-tags)
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrantsLocation.Builder =
        software.amazon.awscdk.services.s3.CfnAccessGrantsLocation.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the IAM role for the registered location.
     *
     * S3 Access Grants assumes this role to manage access to the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-iamrolearn)
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role for the registered location.
     * 
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

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
     * @param locationScope The S3 URI path to the location that you are registering. 
     */
    override fun locationScope(locationScope: String) {
      cdkBuilder.locationScope(locationScope)
    }

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants location.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-tags)
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants location.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-tags)
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrantsLocation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3.CfnAccessGrantsLocation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessGrantsLocation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessGrantsLocation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsLocation):
        CfnAccessGrantsLocation = CfnAccessGrantsLocation(cdkObject)

    internal fun unwrap(wrapped: CfnAccessGrantsLocation):
        software.amazon.awscdk.services.s3.CfnAccessGrantsLocation = wrapped.cdkObject
  }
}
