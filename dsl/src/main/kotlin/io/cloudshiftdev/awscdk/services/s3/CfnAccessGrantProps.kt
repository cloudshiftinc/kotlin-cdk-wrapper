package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAccessGrantProps {
  /**
   * The configuration options of the grant location.
   *
   * The grant location is the S3 path to the data to which you are granting access. It contains the
   * `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the location
   * scope of the registered location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationconfiguration)
   */
  public fun accessGrantsLocationConfiguration(): Any? =
      unwrap(this).getAccessGrantsLocationConfiguration()

  /**
   * The ID of the registered location to which you are granting access.
   *
   * S3 Access Grants assigns this ID when you register the location. S3 Access Grants assigns the
   * ID `default` to the default location `s3://` and assigns an auto-generated ID to other locations
   * that you register.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationid)
   */
  public fun accessGrantsLocationId(): String

  /**
   * The Amazon Resource Name (ARN) of an AWS IAM Identity Center application associated with your
   * Identity Center instance.
   *
   * If the grant includes an application ARN, the grantee can only access the S3 data through this
   * application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-applicationarn)
   */
  public fun applicationArn(): String? = unwrap(this).getApplicationArn()

  /**
   * The user, group, or role to which you are granting access.
   *
   * You can grant access to an IAM user or role. If you have added your corporate directory to AWS
   * IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
   * instance, the grantee can also be a corporate directory user or group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-grantee)
   */
  public fun grantee(): Any

  /**
   * The type of access that you are granting to your S3 data, which can be set to one of the
   * following values:  - `READ` – Grant read-only access to the S3 data.
   *
   * * `WRITE` – Grant write-only access to the S3 data.
   * * `READWRITE` – Grant both read and write access to the S3 data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-permission)
   */
  public fun permission(): String

  /**
   * The type of `S3SubPrefix` .
   *
   * The only possible value is `Object` . Pass this value if the access grant scope is an object.
   * Do not pass this value if the access grant scope is a bucket or a bucket and a prefix.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-s3prefixtype)
   */
  public fun s3PrefixType(): String? = unwrap(this).getS3PrefixType()

  /**
   * The AWS resource tags that you are adding to the access grant.
   *
   * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
   * identify, organize, search for, and filter resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAccessGrantProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessGrantsLocationConfiguration The configuration options of the grant location.
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     */
    public fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: IResolvable)

    /**
     * @param accessGrantsLocationConfiguration The configuration options of the grant location.
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     */
    public
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: CfnAccessGrant.AccessGrantsLocationConfigurationProperty)

    /**
     * @param accessGrantsLocationConfiguration The configuration options of the grant location.
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd059e0b4fb3783f866b1cf0ca58b0c731c6a956c6cd48e350106313d2653358")
    public
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: CfnAccessGrant.AccessGrantsLocationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param accessGrantsLocationId The ID of the registered location to which you are granting
     * access. 
     * S3 Access Grants assigns this ID when you register the location. S3 Access Grants assigns the
     * ID `default` to the default location `s3://` and assigns an auto-generated ID to other locations
     * that you register.
     */
    public fun accessGrantsLocationId(accessGrantsLocationId: String)

    /**
     * @param applicationArn The Amazon Resource Name (ARN) of an AWS IAM Identity Center
     * application associated with your Identity Center instance.
     * If the grant includes an application ARN, the grantee can only access the S3 data through
     * this application.
     */
    public fun applicationArn(applicationArn: String)

    /**
     * @param grantee The user, group, or role to which you are granting access. 
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     */
    public fun grantee(grantee: IResolvable)

    /**
     * @param grantee The user, group, or role to which you are granting access. 
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     */
    public fun grantee(grantee: CfnAccessGrant.GranteeProperty)

    /**
     * @param grantee The user, group, or role to which you are granting access. 
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60603d92d1f778945c90968dbdc5c0ed893d51faeccfbe210f3effdb0f4ed68e")
    public fun grantee(grantee: CfnAccessGrant.GranteeProperty.Builder.() -> Unit)

    /**
     * @param permission The type of access that you are granting to your S3 data, which can be set
     * to one of the following values:  - `READ` – Grant read-only access to the S3 data. 
     * * `WRITE` – Grant write-only access to the S3 data.
     * * `READWRITE` – Grant both read and write access to the S3 data.
     */
    public fun permission(permission: String)

    /**
     * @param s3PrefixType The type of `S3SubPrefix` .
     * The only possible value is `Object` . Pass this value if the access grant scope is an object.
     * Do not pass this value if the access grant scope is a bucket or a bucket and a prefix.
     */
    public fun s3PrefixType(s3PrefixType: String)

    /**
     * @param tags The AWS resource tags that you are adding to the access grant.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The AWS resource tags that you are adding to the access grant.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrantProps.Builder =
        software.amazon.awscdk.services.s3.CfnAccessGrantProps.builder()

    /**
     * @param accessGrantsLocationConfiguration The configuration options of the grant location.
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     */
    override fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: IResolvable) {
      cdkBuilder.accessGrantsLocationConfiguration(accessGrantsLocationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param accessGrantsLocationConfiguration The configuration options of the grant location.
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     */
    override
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: CfnAccessGrant.AccessGrantsLocationConfigurationProperty) {
      cdkBuilder.accessGrantsLocationConfiguration(accessGrantsLocationConfiguration.let(CfnAccessGrant.AccessGrantsLocationConfigurationProperty::unwrap))
    }

    /**
     * @param accessGrantsLocationConfiguration The configuration options of the grant location.
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd059e0b4fb3783f866b1cf0ca58b0c731c6a956c6cd48e350106313d2653358")
    override
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: CfnAccessGrant.AccessGrantsLocationConfigurationProperty.Builder.() -> Unit):
        Unit =
        accessGrantsLocationConfiguration(CfnAccessGrant.AccessGrantsLocationConfigurationProperty(accessGrantsLocationConfiguration))

    /**
     * @param accessGrantsLocationId The ID of the registered location to which you are granting
     * access. 
     * S3 Access Grants assigns this ID when you register the location. S3 Access Grants assigns the
     * ID `default` to the default location `s3://` and assigns an auto-generated ID to other locations
     * that you register.
     */
    override fun accessGrantsLocationId(accessGrantsLocationId: String) {
      cdkBuilder.accessGrantsLocationId(accessGrantsLocationId)
    }

    /**
     * @param applicationArn The Amazon Resource Name (ARN) of an AWS IAM Identity Center
     * application associated with your Identity Center instance.
     * If the grant includes an application ARN, the grantee can only access the S3 data through
     * this application.
     */
    override fun applicationArn(applicationArn: String) {
      cdkBuilder.applicationArn(applicationArn)
    }

    /**
     * @param grantee The user, group, or role to which you are granting access. 
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     */
    override fun grantee(grantee: IResolvable) {
      cdkBuilder.grantee(grantee.let(IResolvable::unwrap))
    }

    /**
     * @param grantee The user, group, or role to which you are granting access. 
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     */
    override fun grantee(grantee: CfnAccessGrant.GranteeProperty) {
      cdkBuilder.grantee(grantee.let(CfnAccessGrant.GranteeProperty::unwrap))
    }

    /**
     * @param grantee The user, group, or role to which you are granting access. 
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60603d92d1f778945c90968dbdc5c0ed893d51faeccfbe210f3effdb0f4ed68e")
    override fun grantee(grantee: CfnAccessGrant.GranteeProperty.Builder.() -> Unit): Unit =
        grantee(CfnAccessGrant.GranteeProperty(grantee))

    /**
     * @param permission The type of access that you are granting to your S3 data, which can be set
     * to one of the following values:  - `READ` – Grant read-only access to the S3 data. 
     * * `WRITE` – Grant write-only access to the S3 data.
     * * `READWRITE` – Grant both read and write access to the S3 data.
     */
    override fun permission(permission: String) {
      cdkBuilder.permission(permission)
    }

    /**
     * @param s3PrefixType The type of `S3SubPrefix` .
     * The only possible value is `Object` . Pass this value if the access grant scope is an object.
     * Do not pass this value if the access grant scope is a bucket or a bucket and a prefix.
     */
    override fun s3PrefixType(s3PrefixType: String) {
      cdkBuilder.s3PrefixType(s3PrefixType)
    }

    /**
     * @param tags The AWS resource tags that you are adding to the access grant.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The AWS resource tags that you are adding to the access grant.
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrantProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantProps,
  ) : CdkObject(cdkObject), CfnAccessGrantProps {
    /**
     * The configuration options of the grant location.
     *
     * The grant location is the S3 path to the data to which you are granting access. It contains
     * the `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     * location scope of the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationconfiguration)
     */
    override fun accessGrantsLocationConfiguration(): Any? =
        unwrap(this).getAccessGrantsLocationConfiguration()

    /**
     * The ID of the registered location to which you are granting access.
     *
     * S3 Access Grants assigns this ID when you register the location. S3 Access Grants assigns the
     * ID `default` to the default location `s3://` and assigns an auto-generated ID to other locations
     * that you register.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-accessgrantslocationid)
     */
    override fun accessGrantsLocationId(): String = unwrap(this).getAccessGrantsLocationId()

    /**
     * The Amazon Resource Name (ARN) of an AWS IAM Identity Center application associated with your
     * Identity Center instance.
     *
     * If the grant includes an application ARN, the grantee can only access the S3 data through
     * this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-applicationarn)
     */
    override fun applicationArn(): String? = unwrap(this).getApplicationArn()

    /**
     * The user, group, or role to which you are granting access.
     *
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
     * instance, the grantee can also be a corporate directory user or group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-grantee)
     */
    override fun grantee(): Any = unwrap(this).getGrantee()

    /**
     * The type of access that you are granting to your S3 data, which can be set to one of the
     * following values:  - `READ` – Grant read-only access to the S3 data.
     *
     * * `WRITE` – Grant write-only access to the S3 data.
     * * `READWRITE` – Grant both read and write access to the S3 data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-permission)
     */
    override fun permission(): String = unwrap(this).getPermission()

    /**
     * The type of `S3SubPrefix` .
     *
     * The only possible value is `Object` . Pass this value if the access grant scope is an object.
     * Do not pass this value if the access grant scope is a bucket or a bucket and a prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-s3prefixtype)
     */
    override fun s3PrefixType(): String? = unwrap(this).getS3PrefixType()

    /**
     * The AWS resource tags that you are adding to the access grant.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html#cfn-s3-accessgrant-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessGrantProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantProps):
        CfnAccessGrantProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessGrantProps):
        software.amazon.awscdk.services.s3.CfnAccessGrantProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.CfnAccessGrantProps
  }
}
