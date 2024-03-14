package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessGrant internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrant,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The configuration options of the grant location.
   */
  public open fun accessGrantsLocationConfiguration(): Any? =
      unwrap(this).getAccessGrantsLocationConfiguration()

  /**
   * The configuration options of the grant location.
   */
  public open fun accessGrantsLocationConfiguration(`value`: IResolvable) {
    unwrap(this).setAccessGrantsLocationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration options of the grant location.
   */
  public open
      fun accessGrantsLocationConfiguration(`value`: AccessGrantsLocationConfigurationProperty) {
    unwrap(this).setAccessGrantsLocationConfiguration(`value`.let(AccessGrantsLocationConfigurationProperty::unwrap))
  }

  /**
   * The configuration options of the grant location.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c091d6de2b049f07c257e4fd53a81435cdd1aeafe7f32b12f69baed17905e213")
  public open
      fun accessGrantsLocationConfiguration(`value`: AccessGrantsLocationConfigurationProperty.Builder.() -> Unit):
      Unit = accessGrantsLocationConfiguration(AccessGrantsLocationConfigurationProperty(`value`))

  /**
   * The ID of the registered location to which you are granting access.
   */
  public open fun accessGrantsLocationId(): String = unwrap(this).getAccessGrantsLocationId()

  /**
   * The ID of the registered location to which you are granting access.
   */
  public open fun accessGrantsLocationId(`value`: String) {
    unwrap(this).setAccessGrantsLocationId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of an AWS IAM Identity Center application associated with your
   * Identity Center instance.
   */
  public open fun applicationArn(): String? = unwrap(this).getApplicationArn()

  /**
   * The Amazon Resource Name (ARN) of an AWS IAM Identity Center application associated with your
   * Identity Center instance.
   */
  public open fun applicationArn(`value`: String) {
    unwrap(this).setApplicationArn(`value`)
  }

  /**
   * The ARN of the access grant.
   */
  public open fun attrAccessGrantArn(): String = unwrap(this).getAttrAccessGrantArn()

  /**
   * The ID of the access grant.
   *
   * S3 Access Grants auto-generates this ID when you create the access grant.
   */
  public open fun attrAccessGrantId(): String = unwrap(this).getAttrAccessGrantId()

  /**
   * The S3 path of the data to which you are granting access.
   *
   * It is the result of appending the `Subprefix` to the location scope.
   */
  public open fun attrGrantScope(): String = unwrap(this).getAttrGrantScope()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The user, group, or role to which you are granting access.
   */
  public open fun grantee(): Any = unwrap(this).getGrantee()

  /**
   * The user, group, or role to which you are granting access.
   */
  public open fun grantee(`value`: IResolvable) {
    unwrap(this).setGrantee(`value`.let(IResolvable::unwrap))
  }

  /**
   * The user, group, or role to which you are granting access.
   */
  public open fun grantee(`value`: GranteeProperty) {
    unwrap(this).setGrantee(`value`.let(GranteeProperty::unwrap))
  }

  /**
   * The user, group, or role to which you are granting access.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("425aceb1730d0497d1b959aa9786cc3fd53795310d391c9da13496723e3c12ff")
  public open fun grantee(`value`: GranteeProperty.Builder.() -> Unit): Unit =
      grantee(GranteeProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The type of access that you are granting to your S3 data, which can be set to one of the
   * following values:  - `READ` – Grant read-only access to the S3 data.
   */
  public open fun permission(): String = unwrap(this).getPermission()

  /**
   * The type of access that you are granting to your S3 data, which can be set to one of the
   * following values:  - `READ` – Grant read-only access to the S3 data.
   */
  public open fun permission(`value`: String) {
    unwrap(this).setPermission(`value`)
  }

  /**
   * The type of `S3SubPrefix` .
   */
  public open fun s3PrefixType(): String? = unwrap(this).getS3PrefixType()

  /**
   * The type of `S3SubPrefix` .
   */
  public open fun s3PrefixType(`value`: String) {
    unwrap(this).setS3PrefixType(`value`)
  }

  /**
   * The AWS resource tags that you are adding to the access grant.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The AWS resource tags that you are adding to the access grant.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The AWS resource tags that you are adding to the access grant.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnAccessGrant].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configuration options of the grant location.
     *
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationconfiguration)
     * @param accessGrantsLocationConfiguration The configuration options of the grant location. 
     */
    public fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: IResolvable)

    /**
     * The configuration options of the grant location.
     *
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationconfiguration)
     * @param accessGrantsLocationConfiguration The configuration options of the grant location. 
     */
    public
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: AccessGrantsLocationConfigurationProperty)

    /**
     * The configuration options of the grant location.
     *
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationconfiguration)
     * @param accessGrantsLocationConfiguration The configuration options of the grant location. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d72d55b8d1a00d3acf0a7ff1012e5b0c3f5aab5487ac42f3f1075d4e2d68f8b")
    public
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: AccessGrantsLocationConfigurationProperty.Builder.() -> Unit)

    /**
     * The ID of the registered location to which you are granting access.
     *
     * S3 Access Grants assigns this ID when you register the location. S3 Access Grants assigns the
     * ID `default` to the default location `s3://` and assigns an auto-generated ID to other locations
     * that you register.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationid)
     * @param accessGrantsLocationId The ID of the registered location to which you are granting
     * access. 
     */
    public fun accessGrantsLocationId(accessGrantsLocationId: String)

    /**
     * The Amazon Resource Name (ARN) of an AWS IAM Identity Center application associated with your
     * Identity Center instance.
     *
     * If the grant includes an application ARN, the grantee can only access the S3 data through
     * this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-applicationarn)
     * @param applicationArn The Amazon Resource Name (ARN) of an AWS IAM Identity Center
     * application associated with your Identity Center instance. 
     */
    public fun applicationArn(applicationArn: String)

    /**
     * The user, group, or role to which you are granting access.
     *
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-grantee)
     * @param grantee The user, group, or role to which you are granting access. 
     */
    public fun grantee(grantee: IResolvable)

    /**
     * The user, group, or role to which you are granting access.
     *
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-grantee)
     * @param grantee The user, group, or role to which you are granting access. 
     */
    public fun grantee(grantee: GranteeProperty)

    /**
     * The user, group, or role to which you are granting access.
     *
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-grantee)
     * @param grantee The user, group, or role to which you are granting access. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cb1414c75d8990c1a763de672fb6d01d405b4007e03ba307ff359247434b375")
    public fun grantee(grantee: GranteeProperty.Builder.() -> Unit)

    /**
     * The type of access that you are granting to your S3 data, which can be set to one of the
     * following values:  - `READ` – Grant read-only access to the S3 data.
     *
     * * `WRITE` – Grant write-only access to the S3 data.
     * * `READWRITE` – Grant both read and write access to the S3 data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-permission)
     * @param permission The type of access that you are granting to your S3 data, which can be set
     * to one of the following values:  - `READ` – Grant read-only access to the S3 data. 
     */
    public fun permission(permission: String)

    /**
     * The type of `S3SubPrefix` .
     *
     * The only possible value is `Object` . Pass this value if the access grant scope is an object.
     * Do not pass this value if the access grant scope is a bucket or a bucket and a prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-s3prefixtype)
     * @param s3PrefixType The type of `S3SubPrefix` . 
     */
    public fun s3PrefixType(s3PrefixType: String)

    /**
     * The AWS resource tags that you are adding to the access grant.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-tags)
     * @param tags The AWS resource tags that you are adding to the access grant. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The AWS resource tags that you are adding to the access grant.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-tags)
     * @param tags The AWS resource tags that you are adding to the access grant. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrant.Builder =
        software.amazon.awscdk.services.s3.CfnAccessGrant.Builder.create(scope, id)

    /**
     * The configuration options of the grant location.
     *
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationconfiguration)
     * @param accessGrantsLocationConfiguration The configuration options of the grant location. 
     */
    override fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: IResolvable) {
      cdkBuilder.accessGrantsLocationConfiguration(accessGrantsLocationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration options of the grant location.
     *
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationconfiguration)
     * @param accessGrantsLocationConfiguration The configuration options of the grant location. 
     */
    override
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: AccessGrantsLocationConfigurationProperty) {
      cdkBuilder.accessGrantsLocationConfiguration(accessGrantsLocationConfiguration.let(AccessGrantsLocationConfigurationProperty::unwrap))
    }

    /**
     * The configuration options of the grant location.
     *
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationconfiguration)
     * @param accessGrantsLocationConfiguration The configuration options of the grant location. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d72d55b8d1a00d3acf0a7ff1012e5b0c3f5aab5487ac42f3f1075d4e2d68f8b")
    override
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: AccessGrantsLocationConfigurationProperty.Builder.() -> Unit):
        Unit =
        accessGrantsLocationConfiguration(AccessGrantsLocationConfigurationProperty(accessGrantsLocationConfiguration))

    /**
     * The ID of the registered location to which you are granting access.
     *
     * S3 Access Grants assigns this ID when you register the location. S3 Access Grants assigns the
     * ID `default` to the default location `s3://` and assigns an auto-generated ID to other locations
     * that you register.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationid)
     * @param accessGrantsLocationId The ID of the registered location to which you are granting
     * access. 
     */
    override fun accessGrantsLocationId(accessGrantsLocationId: String) {
      cdkBuilder.accessGrantsLocationId(accessGrantsLocationId)
    }

    /**
     * The Amazon Resource Name (ARN) of an AWS IAM Identity Center application associated with your
     * Identity Center instance.
     *
     * If the grant includes an application ARN, the grantee can only access the S3 data through
     * this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-applicationarn)
     * @param applicationArn The Amazon Resource Name (ARN) of an AWS IAM Identity Center
     * application associated with your Identity Center instance. 
     */
    override fun applicationArn(applicationArn: String) {
      cdkBuilder.applicationArn(applicationArn)
    }

    /**
     * The user, group, or role to which you are granting access.
     *
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-grantee)
     * @param grantee The user, group, or role to which you are granting access. 
     */
    override fun grantee(grantee: IResolvable) {
      cdkBuilder.grantee(grantee.let(IResolvable::unwrap))
    }

    /**
     * The user, group, or role to which you are granting access.
     *
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-grantee)
     * @param grantee The user, group, or role to which you are granting access. 
     */
    override fun grantee(grantee: GranteeProperty) {
      cdkBuilder.grantee(grantee.let(GranteeProperty::unwrap))
    }

    /**
     * The user, group, or role to which you are granting access.
     *
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-grantee)
     * @param grantee The user, group, or role to which you are granting access. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cb1414c75d8990c1a763de672fb6d01d405b4007e03ba307ff359247434b375")
    override fun grantee(grantee: GranteeProperty.Builder.() -> Unit): Unit =
        grantee(GranteeProperty(grantee))

    /**
     * The type of access that you are granting to your S3 data, which can be set to one of the
     * following values:  - `READ` – Grant read-only access to the S3 data.
     *
     * * `WRITE` – Grant write-only access to the S3 data.
     * * `READWRITE` – Grant both read and write access to the S3 data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-permission)
     * @param permission The type of access that you are granting to your S3 data, which can be set
     * to one of the following values:  - `READ` – Grant read-only access to the S3 data. 
     */
    override fun permission(permission: String) {
      cdkBuilder.permission(permission)
    }

    /**
     * The type of `S3SubPrefix` .
     *
     * The only possible value is `Object` . Pass this value if the access grant scope is an object.
     * Do not pass this value if the access grant scope is a bucket or a bucket and a prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-s3prefixtype)
     * @param s3PrefixType The type of `S3SubPrefix` . 
     */
    override fun s3PrefixType(s3PrefixType: String) {
      cdkBuilder.s3PrefixType(s3PrefixType)
    }

    /**
     * The AWS resource tags that you are adding to the access grant.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-tags)
     * @param tags The AWS resource tags that you are adding to the access grant. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The AWS resource tags that you are adding to the access grant.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-tags)
     * @param tags The AWS resource tags that you are adding to the access grant. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrant = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3.CfnAccessGrant.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessGrant {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessGrant(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrant): CfnAccessGrant
        = CfnAccessGrant(cdkObject)

    internal fun unwrap(wrapped: CfnAccessGrant): software.amazon.awscdk.services.s3.CfnAccessGrant
        = wrapped.cdkObject
  }

  public interface AccessGrantsLocationConfigurationProperty {
    /**
     * The `S3SubPrefix` is appended to the location scope creating the grant scope.
     *
     * Use this field to narrow the scope of the grant to a subset of the location scope. This field
     * is required if the location scope is the default location `s3://` because you cannot create a
     * grant for all of your S3 data in the Region and must narrow the scope. For example, if the
     * location scope is the default location `s3://` , the `S3SubPrefx` can be a `&lt;bucket-name&gt;/
     * *` , so the full grant scope path would be `s3://&lt;bucket-name&gt;/ *` . Or the `S3SubPrefx`
     * can be `&lt;bucket-name&gt;/&lt;prefix-name&gt;*` , so the full grant scope path would be
     * `s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*` .
     *
     * If the `S3SubPrefix` includes a prefix, append the wildcard character `*` after the prefix to
     * indicate that you want to include all object key names in the bucket that start with that
     * prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accessgrant-accessgrantslocationconfiguration.html#cfn-s3-accessgrant-accessgrantslocationconfiguration-s3subprefix)
     */
    public fun s3SubPrefix(): String

    /**
     * A builder for [AccessGrantsLocationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3SubPrefix The `S3SubPrefix` is appended to the location scope creating the grant
       * scope. 
       * Use this field to narrow the scope of the grant to a subset of the location scope. This
       * field is required if the location scope is the default location `s3://` because you cannot
       * create a grant for all of your S3 data in the Region and must narrow the scope. For example,
       * if the location scope is the default location `s3://` , the `S3SubPrefx` can be a
       * `&lt;bucket-name&gt;/ *` , so the full grant scope path would be `s3://&lt;bucket-name&gt;/ *`
       * . Or the `S3SubPrefx` can be `&lt;bucket-name&gt;/&lt;prefix-name&gt;*` , so the full grant
       * scope path would be `s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*` .
       *
       * If the `S3SubPrefix` includes a prefix, append the wildcard character `*` after the prefix
       * to indicate that you want to include all object key names in the bucket that start with that
       * prefix.
       */
      public fun s3SubPrefix(s3SubPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty.builder()

      /**
       * @param s3SubPrefix The `S3SubPrefix` is appended to the location scope creating the grant
       * scope. 
       * Use this field to narrow the scope of the grant to a subset of the location scope. This
       * field is required if the location scope is the default location `s3://` because you cannot
       * create a grant for all of your S3 data in the Region and must narrow the scope. For example,
       * if the location scope is the default location `s3://` , the `S3SubPrefx` can be a
       * `&lt;bucket-name&gt;/ *` , so the full grant scope path would be `s3://&lt;bucket-name&gt;/ *`
       * . Or the `S3SubPrefx` can be `&lt;bucket-name&gt;/&lt;prefix-name&gt;*` , so the full grant
       * scope path would be `s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*` .
       *
       * If the `S3SubPrefix` includes a prefix, append the wildcard character `*` after the prefix
       * to indicate that you want to include all object key names in the bucket that start with that
       * prefix.
       */
      override fun s3SubPrefix(s3SubPrefix: String) {
        cdkBuilder.s3SubPrefix(s3SubPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty,
    ) : CdkObject(cdkObject), AccessGrantsLocationConfigurationProperty {
      /**
       * The `S3SubPrefix` is appended to the location scope creating the grant scope.
       *
       * Use this field to narrow the scope of the grant to a subset of the location scope. This
       * field is required if the location scope is the default location `s3://` because you cannot
       * create a grant for all of your S3 data in the Region and must narrow the scope. For example,
       * if the location scope is the default location `s3://` , the `S3SubPrefx` can be a
       * `&lt;bucket-name&gt;/ *` , so the full grant scope path would be `s3://&lt;bucket-name&gt;/ *`
       * . Or the `S3SubPrefx` can be `&lt;bucket-name&gt;/&lt;prefix-name&gt;*` , so the full grant
       * scope path would be `s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*` .
       *
       * If the `S3SubPrefix` includes a prefix, append the wildcard character `*` after the prefix
       * to indicate that you want to include all object key names in the bucket that start with that
       * prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accessgrant-accessgrantslocationconfiguration.html#cfn-s3-accessgrant-accessgrantslocationconfiguration-s3subprefix)
       */
      override fun s3SubPrefix(): String = unwrap(this).getS3SubPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessGrantsLocationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty):
          AccessGrantsLocationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessGrantsLocationConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty
    }
  }

  public interface GranteeProperty {
    /**
     * The unique identifier of the `Grantee` .
     *
     * If the grantee type is `IAM` , the identifier is the IAM Amazon Resource Name (ARN) of the
     * user or role. If the grantee type is a directory user or group, the identifier is 128-bit
     * universally unique identifier (UUID) in the format `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111` . You
     * can obtain this UUID from your AWS IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accessgrant-grantee.html#cfn-s3-accessgrant-grantee-granteeidentifier)
     */
    public fun granteeIdentifier(): String

    /**
     * The type of the grantee to which access has been granted. It can be one of the following
     * values:.
     *
     * * `IAM` - An IAM user or role.
     * * `DIRECTORY_USER` - Your corporate directory user. You can use this option if you have added
     * your corporate identity directory to IAM Identity Center and associated the IAM Identity Center
     * instance with your S3 Access Grants instance.
     * * `DIRECTORY_GROUP` - Your corporate directory group. You can use this option if you have
     * added your corporate identity directory to IAM Identity Center and associated the IAM Identity
     * Center instance with your S3 Access Grants instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accessgrant-grantee.html#cfn-s3-accessgrant-grantee-granteetype)
     */
    public fun granteeType(): String

    /**
     * A builder for [GranteeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param granteeIdentifier The unique identifier of the `Grantee` . 
       * If the grantee type is `IAM` , the identifier is the IAM Amazon Resource Name (ARN) of the
       * user or role. If the grantee type is a directory user or group, the identifier is 128-bit
       * universally unique identifier (UUID) in the format `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111` .
       * You can obtain this UUID from your AWS IAM Identity Center instance.
       */
      public fun granteeIdentifier(granteeIdentifier: String)

      /**
       * @param granteeType The type of the grantee to which access has been granted. It can be one
       * of the following values:. 
       * * `IAM` - An IAM user or role.
       * * `DIRECTORY_USER` - Your corporate directory user. You can use this option if you have
       * added your corporate identity directory to IAM Identity Center and associated the IAM Identity
       * Center instance with your S3 Access Grants instance.
       * * `DIRECTORY_GROUP` - Your corporate directory group. You can use this option if you have
       * added your corporate identity directory to IAM Identity Center and associated the IAM Identity
       * Center instance with your S3 Access Grants instance.
       */
      public fun granteeType(granteeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty.Builder =
          software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty.builder()

      /**
       * @param granteeIdentifier The unique identifier of the `Grantee` . 
       * If the grantee type is `IAM` , the identifier is the IAM Amazon Resource Name (ARN) of the
       * user or role. If the grantee type is a directory user or group, the identifier is 128-bit
       * universally unique identifier (UUID) in the format `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111` .
       * You can obtain this UUID from your AWS IAM Identity Center instance.
       */
      override fun granteeIdentifier(granteeIdentifier: String) {
        cdkBuilder.granteeIdentifier(granteeIdentifier)
      }

      /**
       * @param granteeType The type of the grantee to which access has been granted. It can be one
       * of the following values:. 
       * * `IAM` - An IAM user or role.
       * * `DIRECTORY_USER` - Your corporate directory user. You can use this option if you have
       * added your corporate identity directory to IAM Identity Center and associated the IAM Identity
       * Center instance with your S3 Access Grants instance.
       * * `DIRECTORY_GROUP` - Your corporate directory group. You can use this option if you have
       * added your corporate identity directory to IAM Identity Center and associated the IAM Identity
       * Center instance with your S3 Access Grants instance.
       */
      override fun granteeType(granteeType: String) {
        cdkBuilder.granteeType(granteeType)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty,
    ) : CdkObject(cdkObject), GranteeProperty {
      /**
       * The unique identifier of the `Grantee` .
       *
       * If the grantee type is `IAM` , the identifier is the IAM Amazon Resource Name (ARN) of the
       * user or role. If the grantee type is a directory user or group, the identifier is 128-bit
       * universally unique identifier (UUID) in the format `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111` .
       * You can obtain this UUID from your AWS IAM Identity Center instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accessgrant-grantee.html#cfn-s3-accessgrant-grantee-granteeidentifier)
       */
      override fun granteeIdentifier(): String = unwrap(this).getGranteeIdentifier()

      /**
       * The type of the grantee to which access has been granted. It can be one of the following
       * values:.
       *
       * * `IAM` - An IAM user or role.
       * * `DIRECTORY_USER` - Your corporate directory user. You can use this option if you have
       * added your corporate identity directory to IAM Identity Center and associated the IAM Identity
       * Center instance with your S3 Access Grants instance.
       * * `DIRECTORY_GROUP` - Your corporate directory group. You can use this option if you have
       * added your corporate identity directory to IAM Identity Center and associated the IAM Identity
       * Center instance with your S3 Access Grants instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accessgrant-grantee.html#cfn-s3-accessgrant-grantee-granteetype)
       */
      override fun granteeType(): String = unwrap(this).getGranteeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GranteeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty):
          GranteeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GranteeProperty):
          software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty
    }
  }
}
