@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Lightsail::Bucket` resource specifies a bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnBucket cfnBucket = CfnBucket.Builder.create(this, "MyCfnBucket")
 * .bucketName("bucketName")
 * .bundleId("bundleId")
 * // the properties below are optional
 * .accessRules(AccessRulesProperty.builder()
 * .allowPublicOverrides(false)
 * .objectAccess("objectAccess")
 * .build())
 * .objectVersioning(false)
 * .readOnlyAccessAccounts(List.of("readOnlyAccessAccounts"))
 * .resourcesReceivingAccess(List.of("resourcesReceivingAccess"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html)
 */
public open class CfnBucket internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lightsail.CfnBucket,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBucketProps,
  ) :
      this(software.amazon.awscdk.services.lightsail.CfnBucket(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnBucketProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBucketProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBucketProps(props)
  )

  /**
   * An object that describes the access rules for the bucket.
   */
  public open fun accessRules(): Any? = unwrap(this).getAccessRules()

  /**
   * An object that describes the access rules for the bucket.
   */
  public open fun accessRules(`value`: IResolvable) {
    unwrap(this).setAccessRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that describes the access rules for the bucket.
   */
  public open fun accessRules(`value`: AccessRulesProperty) {
    unwrap(this).setAccessRules(`value`.let(AccessRulesProperty::unwrap))
  }

  /**
   * An object that describes the access rules for the bucket.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("34bbb541d3503849607db4408d500da6fb2dd086a50da539a95887494713b8eb")
  public open fun accessRules(`value`: AccessRulesProperty.Builder.() -> Unit): Unit =
      accessRules(AccessRulesProperty(`value`))

  /**
   * A Boolean value indicating whether the bundle that is currently applied to your distribution
   * can be changed to another bundle.
   */
  public open fun attrAbleToUpdateBundle(): IResolvable =
      unwrap(this).getAttrAbleToUpdateBundle().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) of the bucket.
   */
  public open fun attrBucketArn(): String = unwrap(this).getAttrBucketArn()

  /**
   * The URL of the bucket.
   */
  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  /**
   * The name of the bucket.
   */
  public open fun bucketName(): String = unwrap(this).getBucketName()

  /**
   * The name of the bucket.
   */
  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  /**
   * The bundle ID for the bucket (for example, `small_1_0` ).
   */
  public open fun bundleId(): String = unwrap(this).getBundleId()

  /**
   * The bundle ID for the bucket (for example, `small_1_0` ).
   */
  public open fun bundleId(`value`: String) {
    unwrap(this).setBundleId(`value`)
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
   * Indicates whether object versioning is enabled for the bucket.
   */
  public open fun objectVersioning(): Any? = unwrap(this).getObjectVersioning()

  /**
   * Indicates whether object versioning is enabled for the bucket.
   */
  public open fun objectVersioning(`value`: Boolean) {
    unwrap(this).setObjectVersioning(`value`)
  }

  /**
   * Indicates whether object versioning is enabled for the bucket.
   */
  public open fun objectVersioning(`value`: IResolvable) {
    unwrap(this).setObjectVersioning(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of AWS account IDs that have read-only access to the bucket.
   */
  public open fun readOnlyAccessAccounts(): List<String> = unwrap(this).getReadOnlyAccessAccounts()
      ?: emptyList()

  /**
   * An array of AWS account IDs that have read-only access to the bucket.
   */
  public open fun readOnlyAccessAccounts(`value`: List<String>) {
    unwrap(this).setReadOnlyAccessAccounts(`value`)
  }

  /**
   * An array of AWS account IDs that have read-only access to the bucket.
   */
  public open fun readOnlyAccessAccounts(vararg `value`: String): Unit =
      readOnlyAccessAccounts(`value`.toList())

  /**
   * An array of Lightsail instances that have access to the bucket.
   */
  public open fun resourcesReceivingAccess(): List<String> =
      unwrap(this).getResourcesReceivingAccess() ?: emptyList()

  /**
   * An array of Lightsail instances that have access to the bucket.
   */
  public open fun resourcesReceivingAccess(`value`: List<String>) {
    unwrap(this).setResourcesReceivingAccess(`value`)
  }

  /**
   * An array of Lightsail instances that have access to the bucket.
   */
  public open fun resourcesReceivingAccess(vararg `value`: String): Unit =
      resourcesReceivingAccess(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnBucket].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An object that describes the access rules for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-accessrules)
     * @param accessRules An object that describes the access rules for the bucket. 
     */
    public fun accessRules(accessRules: IResolvable)

    /**
     * An object that describes the access rules for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-accessrules)
     * @param accessRules An object that describes the access rules for the bucket. 
     */
    public fun accessRules(accessRules: AccessRulesProperty)

    /**
     * An object that describes the access rules for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-accessrules)
     * @param accessRules An object that describes the access rules for the bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bfa6456dc7a9a43da03b9688cb627d224c83e44098ae1afa1a12ccd7bc2d6c2")
    public fun accessRules(accessRules: AccessRulesProperty.Builder.() -> Unit)

    /**
     * The name of the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-bucketname)
     * @param bucketName The name of the bucket. 
     */
    public fun bucketName(bucketName: String)

    /**
     * The bundle ID for the bucket (for example, `small_1_0` ).
     *
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-bundleid)
     * @param bundleId The bundle ID for the bucket (for example, `small_1_0` ). 
     */
    public fun bundleId(bundleId: String)

    /**
     * Indicates whether object versioning is enabled for the bucket.
     *
     * The following options can be configured:
     *
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     * object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-objectversioning)
     * @param objectVersioning Indicates whether object versioning is enabled for the bucket. 
     */
    public fun objectVersioning(objectVersioning: Boolean)

    /**
     * Indicates whether object versioning is enabled for the bucket.
     *
     * The following options can be configured:
     *
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     * object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-objectversioning)
     * @param objectVersioning Indicates whether object versioning is enabled for the bucket. 
     */
    public fun objectVersioning(objectVersioning: IResolvable)

    /**
     * An array of AWS account IDs that have read-only access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-readonlyaccessaccounts)
     * @param readOnlyAccessAccounts An array of AWS account IDs that have read-only access to the
     * bucket. 
     */
    public fun readOnlyAccessAccounts(readOnlyAccessAccounts: List<String>)

    /**
     * An array of AWS account IDs that have read-only access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-readonlyaccessaccounts)
     * @param readOnlyAccessAccounts An array of AWS account IDs that have read-only access to the
     * bucket. 
     */
    public fun readOnlyAccessAccounts(vararg readOnlyAccessAccounts: String)

    /**
     * An array of Lightsail instances that have access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-resourcesreceivingaccess)
     * @param resourcesReceivingAccess An array of Lightsail instances that have access to the
     * bucket. 
     */
    public fun resourcesReceivingAccess(resourcesReceivingAccess: List<String>)

    /**
     * An array of Lightsail instances that have access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-resourcesreceivingaccess)
     * @param resourcesReceivingAccess An array of Lightsail instances that have access to the
     * bucket. 
     */
    public fun resourcesReceivingAccess(vararg resourcesReceivingAccess: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnBucket.Builder =
        software.amazon.awscdk.services.lightsail.CfnBucket.Builder.create(scope, id)

    /**
     * An object that describes the access rules for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-accessrules)
     * @param accessRules An object that describes the access rules for the bucket. 
     */
    override fun accessRules(accessRules: IResolvable) {
      cdkBuilder.accessRules(accessRules.let(IResolvable::unwrap))
    }

    /**
     * An object that describes the access rules for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-accessrules)
     * @param accessRules An object that describes the access rules for the bucket. 
     */
    override fun accessRules(accessRules: AccessRulesProperty) {
      cdkBuilder.accessRules(accessRules.let(AccessRulesProperty::unwrap))
    }

    /**
     * An object that describes the access rules for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-accessrules)
     * @param accessRules An object that describes the access rules for the bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bfa6456dc7a9a43da03b9688cb627d224c83e44098ae1afa1a12ccd7bc2d6c2")
    override fun accessRules(accessRules: AccessRulesProperty.Builder.() -> Unit): Unit =
        accessRules(AccessRulesProperty(accessRules))

    /**
     * The name of the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-bucketname)
     * @param bucketName The name of the bucket. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * The bundle ID for the bucket (for example, `small_1_0` ).
     *
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-bundleid)
     * @param bundleId The bundle ID for the bucket (for example, `small_1_0` ). 
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * Indicates whether object versioning is enabled for the bucket.
     *
     * The following options can be configured:
     *
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     * object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-objectversioning)
     * @param objectVersioning Indicates whether object versioning is enabled for the bucket. 
     */
    override fun objectVersioning(objectVersioning: Boolean) {
      cdkBuilder.objectVersioning(objectVersioning)
    }

    /**
     * Indicates whether object versioning is enabled for the bucket.
     *
     * The following options can be configured:
     *
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     * object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-objectversioning)
     * @param objectVersioning Indicates whether object versioning is enabled for the bucket. 
     */
    override fun objectVersioning(objectVersioning: IResolvable) {
      cdkBuilder.objectVersioning(objectVersioning.let(IResolvable::unwrap))
    }

    /**
     * An array of AWS account IDs that have read-only access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-readonlyaccessaccounts)
     * @param readOnlyAccessAccounts An array of AWS account IDs that have read-only access to the
     * bucket. 
     */
    override fun readOnlyAccessAccounts(readOnlyAccessAccounts: List<String>) {
      cdkBuilder.readOnlyAccessAccounts(readOnlyAccessAccounts)
    }

    /**
     * An array of AWS account IDs that have read-only access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-readonlyaccessaccounts)
     * @param readOnlyAccessAccounts An array of AWS account IDs that have read-only access to the
     * bucket. 
     */
    override fun readOnlyAccessAccounts(vararg readOnlyAccessAccounts: String): Unit =
        readOnlyAccessAccounts(readOnlyAccessAccounts.toList())

    /**
     * An array of Lightsail instances that have access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-resourcesreceivingaccess)
     * @param resourcesReceivingAccess An array of Lightsail instances that have access to the
     * bucket. 
     */
    override fun resourcesReceivingAccess(resourcesReceivingAccess: List<String>) {
      cdkBuilder.resourcesReceivingAccess(resourcesReceivingAccess)
    }

    /**
     * An array of Lightsail instances that have access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-resourcesreceivingaccess)
     * @param resourcesReceivingAccess An array of Lightsail instances that have access to the
     * bucket. 
     */
    override fun resourcesReceivingAccess(vararg resourcesReceivingAccess: String): Unit =
        resourcesReceivingAccess(resourcesReceivingAccess.toList())

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnBucket = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lightsail.CfnBucket.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBucket {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnBucket): CfnBucket =
        CfnBucket(cdkObject)

    internal fun unwrap(wrapped: CfnBucket): software.amazon.awscdk.services.lightsail.CfnBucket =
        wrapped.cdkObject
  }

  /**
   * `AccessRules` is a property of the
   * [AWS::Lightsail::Bucket](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html)
   * resource. It describes access rules for a bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * AccessRulesProperty accessRulesProperty = AccessRulesProperty.builder()
   * .allowPublicOverrides(false)
   * .objectAccess("objectAccess")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-bucket-accessrules.html)
   */
  public interface AccessRulesProperty {
    /**
     * A Boolean value indicating whether the access control list (ACL) permissions that are applied
     * to individual objects override the `GetObject` option that is currently specified.
     *
     * When this is true, you can use the
     * [PutObjectAcl](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html) Amazon S3
     * API operation to set individual objects to public (read-only) or private, using either the
     * `public-read` ACL or the `private` ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-bucket-accessrules.html#cfn-lightsail-bucket-accessrules-allowpublicoverrides)
     */
    public fun allowPublicOverrides(): Any? = unwrap(this).getAllowPublicOverrides()

    /**
     * Specifies the anonymous access to all objects in a bucket.
     *
     * The following options can be specified:
     *
     * * `public` - Sets all objects in the bucket to public (read-only), making them readable by
     * everyone on the internet.
     *
     * If the `GetObject` value is set to `public` , then all objects in the bucket default to
     * public regardless of the `allowPublicOverrides` value.
     *
     * * `private` - Sets all objects in the bucket to private, making them readable only by you and
     * anyone that you grant access to.
     *
     * If the `GetObject` value is set to `private` , and the `allowPublicOverrides` value is set to
     * `true` , then all objects in the bucket default to private unless they are configured with a
     * `public-read` ACL. Individual objects with a `public-read` ACL are readable by everyone on the
     * internet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-bucket-accessrules.html#cfn-lightsail-bucket-accessrules-getobject)
     */
    public fun objectAccess(): String? = unwrap(this).getObjectAccess()

    /**
     * A builder for [AccessRulesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowPublicOverrides A Boolean value indicating whether the access control list
       * (ACL) permissions that are applied to individual objects override the `GetObject` option that
       * is currently specified.
       * When this is true, you can use the
       * [PutObjectAcl](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html) Amazon
       * S3 API operation to set individual objects to public (read-only) or private, using either the
       * `public-read` ACL or the `private` ACL.
       */
      public fun allowPublicOverrides(allowPublicOverrides: Boolean)

      /**
       * @param allowPublicOverrides A Boolean value indicating whether the access control list
       * (ACL) permissions that are applied to individual objects override the `GetObject` option that
       * is currently specified.
       * When this is true, you can use the
       * [PutObjectAcl](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html) Amazon
       * S3 API operation to set individual objects to public (read-only) or private, using either the
       * `public-read` ACL or the `private` ACL.
       */
      public fun allowPublicOverrides(allowPublicOverrides: IResolvable)

      /**
       * @param objectAccess Specifies the anonymous access to all objects in a bucket.
       * The following options can be specified:
       *
       * * `public` - Sets all objects in the bucket to public (read-only), making them readable by
       * everyone on the internet.
       *
       * If the `GetObject` value is set to `public` , then all objects in the bucket default to
       * public regardless of the `allowPublicOverrides` value.
       *
       * * `private` - Sets all objects in the bucket to private, making them readable only by you
       * and anyone that you grant access to.
       *
       * If the `GetObject` value is set to `private` , and the `allowPublicOverrides` value is set
       * to `true` , then all objects in the bucket default to private unless they are configured with
       * a `public-read` ACL. Individual objects with a `public-read` ACL are readable by everyone on
       * the internet.
       */
      public fun objectAccess(objectAccess: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty.builder()

      /**
       * @param allowPublicOverrides A Boolean value indicating whether the access control list
       * (ACL) permissions that are applied to individual objects override the `GetObject` option that
       * is currently specified.
       * When this is true, you can use the
       * [PutObjectAcl](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html) Amazon
       * S3 API operation to set individual objects to public (read-only) or private, using either the
       * `public-read` ACL or the `private` ACL.
       */
      override fun allowPublicOverrides(allowPublicOverrides: Boolean) {
        cdkBuilder.allowPublicOverrides(allowPublicOverrides)
      }

      /**
       * @param allowPublicOverrides A Boolean value indicating whether the access control list
       * (ACL) permissions that are applied to individual objects override the `GetObject` option that
       * is currently specified.
       * When this is true, you can use the
       * [PutObjectAcl](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html) Amazon
       * S3 API operation to set individual objects to public (read-only) or private, using either the
       * `public-read` ACL or the `private` ACL.
       */
      override fun allowPublicOverrides(allowPublicOverrides: IResolvable) {
        cdkBuilder.allowPublicOverrides(allowPublicOverrides.let(IResolvable::unwrap))
      }

      /**
       * @param objectAccess Specifies the anonymous access to all objects in a bucket.
       * The following options can be specified:
       *
       * * `public` - Sets all objects in the bucket to public (read-only), making them readable by
       * everyone on the internet.
       *
       * If the `GetObject` value is set to `public` , then all objects in the bucket default to
       * public regardless of the `allowPublicOverrides` value.
       *
       * * `private` - Sets all objects in the bucket to private, making them readable only by you
       * and anyone that you grant access to.
       *
       * If the `GetObject` value is set to `private` , and the `allowPublicOverrides` value is set
       * to `true` , then all objects in the bucket default to private unless they are configured with
       * a `public-read` ACL. Individual objects with a `public-read` ACL are readable by everyone on
       * the internet.
       */
      override fun objectAccess(objectAccess: String) {
        cdkBuilder.objectAccess(objectAccess)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty,
    ) : CdkObject(cdkObject), AccessRulesProperty {
      /**
       * A Boolean value indicating whether the access control list (ACL) permissions that are
       * applied to individual objects override the `GetObject` option that is currently specified.
       *
       * When this is true, you can use the
       * [PutObjectAcl](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html) Amazon
       * S3 API operation to set individual objects to public (read-only) or private, using either the
       * `public-read` ACL or the `private` ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-bucket-accessrules.html#cfn-lightsail-bucket-accessrules-allowpublicoverrides)
       */
      override fun allowPublicOverrides(): Any? = unwrap(this).getAllowPublicOverrides()

      /**
       * Specifies the anonymous access to all objects in a bucket.
       *
       * The following options can be specified:
       *
       * * `public` - Sets all objects in the bucket to public (read-only), making them readable by
       * everyone on the internet.
       *
       * If the `GetObject` value is set to `public` , then all objects in the bucket default to
       * public regardless of the `allowPublicOverrides` value.
       *
       * * `private` - Sets all objects in the bucket to private, making them readable only by you
       * and anyone that you grant access to.
       *
       * If the `GetObject` value is set to `private` , and the `allowPublicOverrides` value is set
       * to `true` , then all objects in the bucket default to private unless they are configured with
       * a `public-read` ACL. Individual objects with a `public-read` ACL are readable by everyone on
       * the internet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-bucket-accessrules.html#cfn-lightsail-bucket-accessrules-getobject)
       */
      override fun objectAccess(): String? = unwrap(this).getObjectAccess()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessRulesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty):
          AccessRulesProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessRulesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessRulesProperty):
          software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty
    }
  }
}
