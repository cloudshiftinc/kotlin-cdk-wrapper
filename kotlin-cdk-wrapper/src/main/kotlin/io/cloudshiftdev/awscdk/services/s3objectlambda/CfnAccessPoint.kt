@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3objectlambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * The `AWS::S3ObjectLambda::AccessPoint` resource specifies an Object Lambda Access Point used to
 * access a bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3objectlambda.*;
 * Object contentTransformation;
 * CfnAccessPoint cfnAccessPoint = CfnAccessPoint.Builder.create(this, "MyCfnAccessPoint")
 * .objectLambdaConfiguration(ObjectLambdaConfigurationProperty.builder()
 * .supportingAccessPoint("supportingAccessPoint")
 * .transformationConfigurations(List.of(TransformationConfigurationProperty.builder()
 * .actions(List.of("actions"))
 * .contentTransformation(contentTransformation)
 * .build()))
 * // the properties below are optional
 * .allowedFeatures(List.of("allowedFeatures"))
 * .cloudWatchMetricsEnabled(false)
 * .build())
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html)
 */
public open class CfnAccessPoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrAlias(): IResolvable = unwrap(this).getAttrAlias().let(IResolvable::wrap)

  /**
   * The status of the Object Lambda Access Point alias.
   *
   * Valid Values: `PROVISIONING` | `READY` .
   */
  public open fun attrAliasStatus(): String = unwrap(this).getAttrAliasStatus()

  /**
   * The alias name value of the Object Lambda Access Point.
   *
   * For example: `myolap-1a4n8yjrb3kda96f67zwrwiiuse1a--ol-s3` .
   */
  public open fun attrAliasValue(): String = unwrap(this).getAttrAliasValue()

  /**
   * Specifies the ARN for the Object Lambda Access Point.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time when the specified Object Lambda Access Point was created.
   */
  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  /**
   *
   */
  public open fun attrPolicyStatus(): IResolvable =
      unwrap(this).getAttrPolicyStatus().let(IResolvable::wrap)

  /**
   * Specifies whether the Object lambda Access Point Policy is Public or not.
   *
   * Object lambda Access Points are private by default.
   */
  public open fun attrPolicyStatusIsPublic(): IResolvable =
      unwrap(this).getAttrPolicyStatusIsPublic().let(IResolvable::wrap)

  /**
   * The Public Access Block Configuration is used to block policies that would allow public access
   * to this Object lambda Access Point.
   *
   * All public access to Object lambda Access Points are blocked by default, and any policy that
   * would give public access to them will be also blocked. This behavior cannot be changed for Object
   * lambda Access Points.
   */
  public open fun attrPublicAccessBlockConfiguration(): IResolvable =
      unwrap(this).getAttrPublicAccessBlockConfiguration().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrPublicAccessBlockConfigurationBlockPublicAcls(): IResolvable =
      unwrap(this).getAttrPublicAccessBlockConfigurationBlockPublicAcls().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrPublicAccessBlockConfigurationBlockPublicPolicy(): IResolvable =
      unwrap(this).getAttrPublicAccessBlockConfigurationBlockPublicPolicy().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrPublicAccessBlockConfigurationIgnorePublicAcls(): IResolvable =
      unwrap(this).getAttrPublicAccessBlockConfigurationIgnorePublicAcls().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrPublicAccessBlockConfigurationRestrictPublicBuckets(): IResolvable =
      unwrap(this).getAttrPublicAccessBlockConfigurationRestrictPublicBuckets().let(IResolvable::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of this access point.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of this access point.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A configuration used when creating an Object Lambda Access Point.
   */
  public open fun objectLambdaConfiguration(): Any = unwrap(this).getObjectLambdaConfiguration()

  /**
   * A configuration used when creating an Object Lambda Access Point.
   */
  public open fun objectLambdaConfiguration(`value`: IResolvable) {
    unwrap(this).setObjectLambdaConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A configuration used when creating an Object Lambda Access Point.
   */
  public open fun objectLambdaConfiguration(`value`: ObjectLambdaConfigurationProperty) {
    unwrap(this).setObjectLambdaConfiguration(`value`.let(ObjectLambdaConfigurationProperty::unwrap))
  }

  /**
   * A configuration used when creating an Object Lambda Access Point.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e2fc78fc0b4db42c7380110f3c8f27370f1247661726b71bd1d721bb448d7aca")
  public open
      fun objectLambdaConfiguration(`value`: ObjectLambdaConfigurationProperty.Builder.() -> Unit):
      Unit = objectLambdaConfiguration(ObjectLambdaConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3objectlambda.CfnAccessPoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-name)
     * @param name The name of this access point. 
     */
    public fun name(name: String)

    /**
     * A configuration used when creating an Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration)
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    public fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable)

    /**
     * A configuration used when creating an Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration)
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    public
        fun objectLambdaConfiguration(objectLambdaConfiguration: ObjectLambdaConfigurationProperty)

    /**
     * A configuration used when creating an Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration)
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70ea7a604b02851fdb8d2a38172c4fae60064cab75cb03121fa2f05f1bfd6daf")
    public
        fun objectLambdaConfiguration(objectLambdaConfiguration: ObjectLambdaConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.Builder =
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.Builder.create(scope, id)

    /**
     * The name of this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-name)
     * @param name The name of this access point. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A configuration used when creating an Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration)
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    override fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable) {
      cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration.let(IResolvable::unwrap))
    }

    /**
     * A configuration used when creating an Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration)
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    override
        fun objectLambdaConfiguration(objectLambdaConfiguration: ObjectLambdaConfigurationProperty) {
      cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration.let(ObjectLambdaConfigurationProperty::unwrap))
    }

    /**
     * A configuration used when creating an Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration)
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70ea7a604b02851fdb8d2a38172c4fae60064cab75cb03121fa2f05f1bfd6daf")
    override
        fun objectLambdaConfiguration(objectLambdaConfiguration: ObjectLambdaConfigurationProperty.Builder.() -> Unit):
        Unit =
        objectLambdaConfiguration(ObjectLambdaConfigurationProperty(objectLambdaConfiguration))

    public fun build(): software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint):
        CfnAccessPoint = CfnAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPoint):
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint = wrapped.cdkObject
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3objectlambda.*;
   * ContentTransformationProperty contentTransformationProperty =
   * ContentTransformationProperty.builder()
   * .awsLambda(AwsLambdaProperty.builder()
   * .functionArn("functionArn")
   * // the properties below are optional
   * .functionPayload("functionPayload")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-contenttransformation.html)
   */
  public interface ContentTransformationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-contenttransformation.html#cfn-s3objectlambda-accesspoint-contenttransformation-awslambda)
     */
    public fun awsLambda(): Any

    /**
     * A builder for [ContentTransformationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsLambda the value to be set. 
       */
      public fun awsLambda(awsLambda: IResolvable)

      /**
       * @param awsLambda the value to be set. 
       */
      public fun awsLambda(awsLambda: AwsLambdaProperty)

      /**
       * @param awsLambda the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9be69232cc9fe2a47abed902c83a6e2e7141bcc7c89a6b07fb166e08b6896776")
      public fun awsLambda(awsLambda: AwsLambdaProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty.Builder
          =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty.builder()

      /**
       * @param awsLambda the value to be set. 
       */
      override fun awsLambda(awsLambda: IResolvable) {
        cdkBuilder.awsLambda(awsLambda.let(IResolvable::unwrap))
      }

      /**
       * @param awsLambda the value to be set. 
       */
      override fun awsLambda(awsLambda: AwsLambdaProperty) {
        cdkBuilder.awsLambda(awsLambda.let(AwsLambdaProperty::unwrap))
      }

      /**
       * @param awsLambda the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9be69232cc9fe2a47abed902c83a6e2e7141bcc7c89a6b07fb166e08b6896776")
      override fun awsLambda(awsLambda: AwsLambdaProperty.Builder.() -> Unit): Unit =
          awsLambda(AwsLambdaProperty(awsLambda))

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty,
    ) : CdkObject(cdkObject), ContentTransformationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-contenttransformation.html#cfn-s3objectlambda-accesspoint-contenttransformation-awslambda)
       */
      override fun awsLambda(): Any = unwrap(this).getAwsLambda()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentTransformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty):
          ContentTransformationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContentTransformationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentTransformationProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3objectlambda.*;
   * PolicyStatusProperty policyStatusProperty = PolicyStatusProperty.builder()
   * .isPublic(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-policystatus.html)
   */
  public interface PolicyStatusProperty {
    /**
     * Specifies whether the Object lambda Access Point Policy is Public or not.
     *
     * Object lambda Access Points are private by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-policystatus.html#cfn-s3objectlambda-accesspoint-policystatus-ispublic)
     */
    public fun isPublic(): Any? = unwrap(this).getIsPublic()

    /**
     * A builder for [PolicyStatusProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isPublic Specifies whether the Object lambda Access Point Policy is Public or not.
       * Object lambda Access Points are private by default.
       */
      public fun isPublic(isPublic: Boolean)

      /**
       * @param isPublic Specifies whether the Object lambda Access Point Policy is Public or not.
       * Object lambda Access Points are private by default.
       */
      public fun isPublic(isPublic: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty.Builder
          =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty.builder()

      /**
       * @param isPublic Specifies whether the Object lambda Access Point Policy is Public or not.
       * Object lambda Access Points are private by default.
       */
      override fun isPublic(isPublic: Boolean) {
        cdkBuilder.isPublic(isPublic)
      }

      /**
       * @param isPublic Specifies whether the Object lambda Access Point Policy is Public or not.
       * Object lambda Access Points are private by default.
       */
      override fun isPublic(isPublic: IResolvable) {
        cdkBuilder.isPublic(isPublic.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty,
    ) : CdkObject(cdkObject), PolicyStatusProperty {
      /**
       * Specifies whether the Object lambda Access Point Policy is Public or not.
       *
       * Object lambda Access Points are private by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-policystatus.html#cfn-s3objectlambda-accesspoint-policystatus-ispublic)
       */
      override fun isPublic(): Any? = unwrap(this).getIsPublic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyStatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty):
          PolicyStatusProperty = CdkObjectWrappers.wrap(cdkObject) as? PolicyStatusProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyStatusProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3objectlambda.*;
   * AwsLambdaProperty awsLambdaProperty = AwsLambdaProperty.builder()
   * .functionArn("functionArn")
   * // the properties below are optional
   * .functionPayload("functionPayload")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-awslambda.html)
   */
  public interface AwsLambdaProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-awslambda.html#cfn-s3objectlambda-accesspoint-awslambda-functionarn)
     */
    public fun functionArn(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-awslambda.html#cfn-s3objectlambda-accesspoint-awslambda-functionpayload)
     */
    public fun functionPayload(): String? = unwrap(this).getFunctionPayload()

    /**
     * A builder for [AwsLambdaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functionArn the value to be set. 
       */
      public fun functionArn(functionArn: String)

      /**
       * @param functionPayload the value to be set.
       */
      public fun functionPayload(functionPayload: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty.Builder =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty.builder()

      /**
       * @param functionArn the value to be set. 
       */
      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      /**
       * @param functionPayload the value to be set.
       */
      override fun functionPayload(functionPayload: String) {
        cdkBuilder.functionPayload(functionPayload)
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty,
    ) : CdkObject(cdkObject), AwsLambdaProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-awslambda.html#cfn-s3objectlambda-accesspoint-awslambda-functionarn)
       */
      override fun functionArn(): String = unwrap(this).getFunctionArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-awslambda.html#cfn-s3objectlambda-accesspoint-awslambda-functionpayload)
       */
      override fun functionPayload(): String? = unwrap(this).getFunctionPayload()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsLambdaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty):
          AwsLambdaProperty = CdkObjectWrappers.wrap(cdkObject) as? AwsLambdaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsLambdaProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty
    }
  }

  /**
   * The `PublicAccessBlock` configuration that you want to apply to this Amazon S3 account.
   *
   * You can enable the configuration options in any combination. For more information about when
   * Amazon S3 considers a bucket or object public, see [The Meaning of
   * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
   * in the *Amazon S3 User Guide* .
   *
   * This data type is not supported for Amazon S3 on Outposts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3objectlambda.*;
   * PublicAccessBlockConfigurationProperty publicAccessBlockConfigurationProperty =
   * PublicAccessBlockConfigurationProperty.builder()
   * .blockPublicAcls(false)
   * .blockPublicPolicy(false)
   * .ignorePublicAcls(false)
   * .restrictPublicBuckets(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html)
   */
  public interface PublicAccessBlockConfigurationProperty {
    /**
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in
     * this account.
     *
     * Setting this element to `TRUE` causes the following behavior:
     *
     * * `PutBucketAcl` and `PutObjectAcl` calls fail if the specified ACL is public.
     * * PUT Object calls fail if the request includes a public ACL.
     * * PUT Bucket calls fail if the request includes a public ACL.
     *
     * Enabling this setting doesn't affect existing policies or ACLs.
     *
     * This property is not supported for Amazon S3 on Outposts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html#cfn-s3objectlambda-accesspoint-publicaccessblockconfiguration-blockpublicacls)
     */
    public fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

    /**
     * Specifies whether Amazon S3 should block public bucket policies for buckets in this account.
     *
     * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
     * specified bucket policy allows public access.
     *
     * Enabling this setting doesn't affect existing bucket policies.
     *
     * This property is not supported for Amazon S3 on Outposts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html#cfn-s3objectlambda-accesspoint-publicaccessblockconfiguration-blockpublicpolicy)
     */
    public fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

    /**
     * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account.
     *
     * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on buckets in this
     * account and any objects that they contain.
     *
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent
     * new public ACLs from being set.
     *
     * This property is not supported for Amazon S3 on Outposts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html#cfn-s3objectlambda-accesspoint-publicaccessblockconfiguration-ignorepublicacls)
     */
    public fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

    /**
     * Specifies whether Amazon S3 should restrict public bucket policies for buckets in this
     * account.
     *
     * Setting this element to `TRUE` restricts access to buckets with public policies to only AWS
     * service principals and authorized users within this account.
     *
     * Enabling this setting doesn't affect previously stored bucket policies, except that public
     * and cross-account access within any public bucket policy, including non-public delegation to
     * specific accounts, is blocked.
     *
     * This property is not supported for Amazon S3 on Outposts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html#cfn-s3objectlambda-accesspoint-publicaccessblockconfiguration-restrictpublicbuckets)
     */
    public fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()

    /**
     * A builder for [PublicAccessBlockConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for buckets in this account.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * `PutBucketAcl` and `PutObjectAcl` calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      public fun blockPublicAcls(blockPublicAcls: Boolean)

      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for buckets in this account.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * `PutBucketAcl` and `PutObjectAcl` calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      public fun blockPublicAcls(blockPublicAcls: IResolvable)

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for buckets in this account.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      public fun blockPublicPolicy(blockPublicPolicy: Boolean)

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for buckets in this account.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      public fun blockPublicPolicy(blockPublicPolicy: IResolvable)

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for buckets
       * in this account.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on buckets in
       * this account and any objects that they contain.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      public fun ignorePublicAcls(ignorePublicAcls: Boolean)

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for buckets
       * in this account.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on buckets in
       * this account and any objects that they contain.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      public fun ignorePublicAcls(ignorePublicAcls: IResolvable)

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for buckets in this account.
       * Setting this element to `TRUE` restricts access to buckets with public policies to only AWS
       * service principals and authorized users within this account.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      public fun restrictPublicBuckets(restrictPublicBuckets: Boolean)

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for buckets in this account.
       * Setting this element to `TRUE` restricts access to buckets with public policies to only AWS
       * service principals and authorized users within this account.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      public fun restrictPublicBuckets(restrictPublicBuckets: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty.builder()

      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for buckets in this account.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * `PutBucketAcl` and `PutObjectAcl` calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      override fun blockPublicAcls(blockPublicAcls: Boolean) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
      }

      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for buckets in this account.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * `PutBucketAcl` and `PutObjectAcl` calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      override fun blockPublicAcls(blockPublicAcls: IResolvable) {
        cdkBuilder.blockPublicAcls(blockPublicAcls.let(IResolvable::unwrap))
      }

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for buckets in this account.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
      }

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for buckets in this account.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for buckets
       * in this account.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on buckets in
       * this account and any objects that they contain.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
      }

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for buckets
       * in this account.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on buckets in
       * this account and any objects that they contain.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      override fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls.let(IResolvable::unwrap))
      }

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for buckets in this account.
       * Setting this element to `TRUE` restricts access to buckets with public policies to only AWS
       * service principals and authorized users within this account.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
      }

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for buckets in this account.
       * Setting this element to `TRUE` restricts access to buckets with public policies to only AWS
       * service principals and authorized users within this account.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       *
       * This property is not supported for Amazon S3 on Outposts.
       */
      override fun restrictPublicBuckets(restrictPublicBuckets: IResolvable) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty,
    ) : CdkObject(cdkObject), PublicAccessBlockConfigurationProperty {
      /**
       * Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in
       * this account.
       *
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * `PutBucketAcl` and `PutObjectAcl` calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       *
       * This property is not supported for Amazon S3 on Outposts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html#cfn-s3objectlambda-accesspoint-publicaccessblockconfiguration-blockpublicacls)
       */
      override fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

      /**
       * Specifies whether Amazon S3 should block public bucket policies for buckets in this
       * account.
       *
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       *
       * This property is not supported for Amazon S3 on Outposts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html#cfn-s3objectlambda-accesspoint-publicaccessblockconfiguration-blockpublicpolicy)
       */
      override fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

      /**
       * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account.
       *
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on buckets in
       * this account and any objects that they contain.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       *
       * This property is not supported for Amazon S3 on Outposts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html#cfn-s3objectlambda-accesspoint-publicaccessblockconfiguration-ignorepublicacls)
       */
      override fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

      /**
       * Specifies whether Amazon S3 should restrict public bucket policies for buckets in this
       * account.
       *
       * Setting this element to `TRUE` restricts access to buckets with public policies to only AWS
       * service principals and authorized users within this account.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       *
       * This property is not supported for Amazon S3 on Outposts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html#cfn-s3objectlambda-accesspoint-publicaccessblockconfiguration-restrictpublicbuckets)
       */
      override fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PublicAccessBlockConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty):
          PublicAccessBlockConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PublicAccessBlockConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicAccessBlockConfigurationProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty
    }
  }

  /**
   * A configuration used when creating an Object Lambda Access Point transformation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3objectlambda.*;
   * Object contentTransformation;
   * TransformationConfigurationProperty transformationConfigurationProperty =
   * TransformationConfigurationProperty.builder()
   * .actions(List.of("actions"))
   * .contentTransformation(contentTransformation)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-transformationconfiguration.html)
   */
  public interface TransformationConfigurationProperty {
    /**
     * A container for the action of an Object Lambda Access Point configuration.
     *
     * Valid inputs are `GetObject` , `HeadObject` , `ListObjects` , and `ListObjectsV2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-transformationconfiguration.html#cfn-s3objectlambda-accesspoint-transformationconfiguration-actions)
     */
    public fun actions(): List<String>

    /**
     * A container for the content transformation of an Object Lambda Access Point configuration.
     *
     * Can include the FunctionArn and FunctionPayload. For more information, see
     * [AwsLambdaTransformation](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_AwsLambdaTransformation.html)
     * in the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-transformationconfiguration.html#cfn-s3objectlambda-accesspoint-transformationconfiguration-contenttransformation)
     */
    public fun contentTransformation(): Any

    /**
     * A builder for [TransformationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions A container for the action of an Object Lambda Access Point configuration. 
       * Valid inputs are `GetObject` , `HeadObject` , `ListObjects` , and `ListObjectsV2` .
       */
      public fun actions(actions: List<String>)

      /**
       * @param actions A container for the action of an Object Lambda Access Point configuration. 
       * Valid inputs are `GetObject` , `HeadObject` , `ListObjects` , and `ListObjectsV2` .
       */
      public fun actions(vararg actions: String)

      /**
       * @param contentTransformation A container for the content transformation of an Object Lambda
       * Access Point configuration. 
       * Can include the FunctionArn and FunctionPayload. For more information, see
       * [AwsLambdaTransformation](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_AwsLambdaTransformation.html)
       * in the *Amazon S3 API Reference* .
       */
      public fun contentTransformation(contentTransformation: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty.builder()

      /**
       * @param actions A container for the action of an Object Lambda Access Point configuration. 
       * Valid inputs are `GetObject` , `HeadObject` , `ListObjects` , and `ListObjectsV2` .
       */
      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions A container for the action of an Object Lambda Access Point configuration. 
       * Valid inputs are `GetObject` , `HeadObject` , `ListObjects` , and `ListObjectsV2` .
       */
      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      /**
       * @param contentTransformation A container for the content transformation of an Object Lambda
       * Access Point configuration. 
       * Can include the FunctionArn and FunctionPayload. For more information, see
       * [AwsLambdaTransformation](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_AwsLambdaTransformation.html)
       * in the *Amazon S3 API Reference* .
       */
      override fun contentTransformation(contentTransformation: Any) {
        cdkBuilder.contentTransformation(contentTransformation)
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty,
    ) : CdkObject(cdkObject), TransformationConfigurationProperty {
      /**
       * A container for the action of an Object Lambda Access Point configuration.
       *
       * Valid inputs are `GetObject` , `HeadObject` , `ListObjects` , and `ListObjectsV2` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-transformationconfiguration.html#cfn-s3objectlambda-accesspoint-transformationconfiguration-actions)
       */
      override fun actions(): List<String> = unwrap(this).getActions()

      /**
       * A container for the content transformation of an Object Lambda Access Point configuration.
       *
       * Can include the FunctionArn and FunctionPayload. For more information, see
       * [AwsLambdaTransformation](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_AwsLambdaTransformation.html)
       * in the *Amazon S3 API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-transformationconfiguration.html#cfn-s3objectlambda-accesspoint-transformationconfiguration-contenttransformation)
       */
      override fun contentTransformation(): Any = unwrap(this).getContentTransformation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TransformationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty):
          TransformationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TransformationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformationConfigurationProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty
    }
  }

  /**
   * A configuration used when creating an Object Lambda Access Point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3objectlambda.*;
   * Object contentTransformation;
   * ObjectLambdaConfigurationProperty objectLambdaConfigurationProperty =
   * ObjectLambdaConfigurationProperty.builder()
   * .supportingAccessPoint("supportingAccessPoint")
   * .transformationConfigurations(List.of(TransformationConfigurationProperty.builder()
   * .actions(List.of("actions"))
   * .contentTransformation(contentTransformation)
   * .build()))
   * // the properties below are optional
   * .allowedFeatures(List.of("allowedFeatures"))
   * .cloudWatchMetricsEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html)
   */
  public interface ObjectLambdaConfigurationProperty {
    /**
     * A container for allowed features.
     *
     * Valid inputs are `GetObject-Range` , `GetObject-PartNumber` , `HeadObject-Range` , and
     * `HeadObject-PartNumber` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration-allowedfeatures)
     */
    public fun allowedFeatures(): List<String> = unwrap(this).getAllowedFeatures() ?: emptyList()

    /**
     * A container for whether the CloudWatch metrics configuration is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration-cloudwatchmetricsenabled)
     */
    public fun cloudWatchMetricsEnabled(): Any? = unwrap(this).getCloudWatchMetricsEnabled()

    /**
     * Standard access point associated with the Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration-supportingaccesspoint)
     */
    public fun supportingAccessPoint(): String

    /**
     * A container for transformation configurations for an Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration-transformationconfigurations)
     */
    public fun transformationConfigurations(): Any

    /**
     * A builder for [ObjectLambdaConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedFeatures A container for allowed features.
       * Valid inputs are `GetObject-Range` , `GetObject-PartNumber` , `HeadObject-Range` , and
       * `HeadObject-PartNumber` .
       */
      public fun allowedFeatures(allowedFeatures: List<String>)

      /**
       * @param allowedFeatures A container for allowed features.
       * Valid inputs are `GetObject-Range` , `GetObject-PartNumber` , `HeadObject-Range` , and
       * `HeadObject-PartNumber` .
       */
      public fun allowedFeatures(vararg allowedFeatures: String)

      /**
       * @param cloudWatchMetricsEnabled A container for whether the CloudWatch metrics
       * configuration is enabled.
       */
      public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean)

      /**
       * @param cloudWatchMetricsEnabled A container for whether the CloudWatch metrics
       * configuration is enabled.
       */
      public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable)

      /**
       * @param supportingAccessPoint Standard access point associated with the Object Lambda Access
       * Point. 
       */
      public fun supportingAccessPoint(supportingAccessPoint: String)

      /**
       * @param transformationConfigurations A container for transformation configurations for an
       * Object Lambda Access Point. 
       */
      public fun transformationConfigurations(transformationConfigurations: IResolvable)

      /**
       * @param transformationConfigurations A container for transformation configurations for an
       * Object Lambda Access Point. 
       */
      public fun transformationConfigurations(transformationConfigurations: List<Any>)

      /**
       * @param transformationConfigurations A container for transformation configurations for an
       * Object Lambda Access Point. 
       */
      public fun transformationConfigurations(vararg transformationConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty.builder()

      /**
       * @param allowedFeatures A container for allowed features.
       * Valid inputs are `GetObject-Range` , `GetObject-PartNumber` , `HeadObject-Range` , and
       * `HeadObject-PartNumber` .
       */
      override fun allowedFeatures(allowedFeatures: List<String>) {
        cdkBuilder.allowedFeatures(allowedFeatures)
      }

      /**
       * @param allowedFeatures A container for allowed features.
       * Valid inputs are `GetObject-Range` , `GetObject-PartNumber` , `HeadObject-Range` , and
       * `HeadObject-PartNumber` .
       */
      override fun allowedFeatures(vararg allowedFeatures: String): Unit =
          allowedFeatures(allowedFeatures.toList())

      /**
       * @param cloudWatchMetricsEnabled A container for whether the CloudWatch metrics
       * configuration is enabled.
       */
      override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
      }

      /**
       * @param cloudWatchMetricsEnabled A container for whether the CloudWatch metrics
       * configuration is enabled.
       */
      override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param supportingAccessPoint Standard access point associated with the Object Lambda Access
       * Point. 
       */
      override fun supportingAccessPoint(supportingAccessPoint: String) {
        cdkBuilder.supportingAccessPoint(supportingAccessPoint)
      }

      /**
       * @param transformationConfigurations A container for transformation configurations for an
       * Object Lambda Access Point. 
       */
      override fun transformationConfigurations(transformationConfigurations: IResolvable) {
        cdkBuilder.transformationConfigurations(transformationConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param transformationConfigurations A container for transformation configurations for an
       * Object Lambda Access Point. 
       */
      override fun transformationConfigurations(transformationConfigurations: List<Any>) {
        cdkBuilder.transformationConfigurations(transformationConfigurations)
      }

      /**
       * @param transformationConfigurations A container for transformation configurations for an
       * Object Lambda Access Point. 
       */
      override fun transformationConfigurations(vararg transformationConfigurations: Any): Unit =
          transformationConfigurations(transformationConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty,
    ) : CdkObject(cdkObject), ObjectLambdaConfigurationProperty {
      /**
       * A container for allowed features.
       *
       * Valid inputs are `GetObject-Range` , `GetObject-PartNumber` , `HeadObject-Range` , and
       * `HeadObject-PartNumber` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration-allowedfeatures)
       */
      override fun allowedFeatures(): List<String> = unwrap(this).getAllowedFeatures() ?:
          emptyList()

      /**
       * A container for whether the CloudWatch metrics configuration is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration-cloudwatchmetricsenabled)
       */
      override fun cloudWatchMetricsEnabled(): Any? = unwrap(this).getCloudWatchMetricsEnabled()

      /**
       * Standard access point associated with the Object Lambda Access Point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration-supportingaccesspoint)
       */
      override fun supportingAccessPoint(): String = unwrap(this).getSupportingAccessPoint()

      /**
       * A container for transformation configurations for an Object Lambda Access Point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration-transformationconfigurations)
       */
      override fun transformationConfigurations(): Any =
          unwrap(this).getTransformationConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ObjectLambdaConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty):
          ObjectLambdaConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ObjectLambdaConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectLambdaConfigurationProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty
    }
  }

  /**
   * The alias of an Object Lambda Access Point.
   *
   * For more information, see [How to use a bucket-style alias for your S3 bucket Object Lambda
   * Access
   * Point](https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-use.html#ol-access-points-alias)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3objectlambda.*;
   * AliasProperty aliasProperty = AliasProperty.builder()
   * .value("value")
   * // the properties below are optional
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-alias.html)
   */
  public interface AliasProperty {
    /**
     * The status of the Object Lambda Access Point alias.
     *
     * If the status is `PROVISIONING` , the Object Lambda Access Point is provisioning the alias
     * and the alias is not ready for use yet. If the status is `READY` , the Object Lambda Access
     * Point alias is successfully provisioned and ready for use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-alias.html#cfn-s3objectlambda-accesspoint-alias-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The alias value of the Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-alias.html#cfn-s3objectlambda-accesspoint-alias-value)
     */
    public fun `value`(): String

    /**
     * A builder for [AliasProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status The status of the Object Lambda Access Point alias.
       * If the status is `PROVISIONING` , the Object Lambda Access Point is provisioning the alias
       * and the alias is not ready for use yet. If the status is `READY` , the Object Lambda Access
       * Point alias is successfully provisioned and ready for use.
       */
      public fun status(status: String)

      /**
       * @param value The alias value of the Object Lambda Access Point. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty.Builder =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty.builder()

      /**
       * @param status The status of the Object Lambda Access Point alias.
       * If the status is `PROVISIONING` , the Object Lambda Access Point is provisioning the alias
       * and the alias is not ready for use yet. If the status is `READY` , the Object Lambda Access
       * Point alias is successfully provisioned and ready for use.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param value The alias value of the Object Lambda Access Point. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty,
    ) : CdkObject(cdkObject), AliasProperty {
      /**
       * The status of the Object Lambda Access Point alias.
       *
       * If the status is `PROVISIONING` , the Object Lambda Access Point is provisioning the alias
       * and the alias is not ready for use yet. If the status is `READY` , the Object Lambda Access
       * Point alias is successfully provisioned and ready for use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-alias.html#cfn-s3objectlambda-accesspoint-alias-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The alias value of the Object Lambda Access Point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-alias.html#cfn-s3objectlambda-accesspoint-alias-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AliasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty):
          AliasProperty = CdkObjectWrappers.wrap(cdkObject) as? AliasProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AliasProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty
    }
  }
}
