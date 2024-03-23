@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new security configuration.
 *
 * A security configuration is a set of security properties that can be used by AWS Glue . You can
 * use a security configuration to encrypt data at rest. For information about using security
 * configurations in AWS Glue , see [Encrypting Data Written by Crawlers, Jobs, and Development
 * Endpoints](https://docs.aws.amazon.com/glue/latest/dg/encryption-security-configuration.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnSecurityConfiguration cfnSecurityConfiguration = CfnSecurityConfiguration.Builder.create(this,
 * "MyCfnSecurityConfiguration")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .cloudWatchEncryption(CloudWatchEncryptionProperty.builder()
 * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .jobBookmarksEncryption(JobBookmarksEncryptionProperty.builder()
 * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .s3Encryptions(List.of(S3EncryptionProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .s3EncryptionMode("s3EncryptionMode")
 * .build()))
 * .build())
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html)
 */
public open class CfnSecurityConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnSecurityConfiguration(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSecurityConfigurationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityConfigurationProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The encryption configuration associated with this security configuration.
   */
  public open fun encryptionConfiguration(): Any = unwrap(this).getEncryptionConfiguration()

  /**
   * The encryption configuration associated with this security configuration.
   */
  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The encryption configuration associated with this security configuration.
   */
  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty::unwrap))
  }

  /**
   * The encryption configuration associated with this security configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab58857b92fdadd7180278fa55038b4e4adba208f5e9503b98c5e0944b6f9c9c")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the security configuration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the security configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnSecurityConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The encryption configuration associated with this security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * The encryption configuration associated with this security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

    /**
     * The encryption configuration associated with this security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2d661c7cb5a046f1cf3d25eb041a3a6944de9e98a6509743c41f60ca94ed073")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-name)
     * @param name The name of the security configuration. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.Builder =
        software.amazon.awscdk.services.glue.CfnSecurityConfiguration.Builder.create(scope, id)

    /**
     * The encryption configuration associated with this security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The encryption configuration associated with this security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
    }

    /**
     * The encryption configuration associated with this security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2d661c7cb5a046f1cf3d25eb041a3a6944de9e98a6509743c41f60ca94ed073")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-name)
     * @param name The name of the security configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnSecurityConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration):
        CfnSecurityConfiguration = CfnSecurityConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfiguration):
        software.amazon.awscdk.services.glue.CfnSecurityConfiguration = wrapped.cdkObject
  }

  /**
   * Specifies how Amazon CloudWatch data should be encrypted.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * CloudWatchEncryptionProperty cloudWatchEncryptionProperty =
   * CloudWatchEncryptionProperty.builder()
   * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html)
   */
  public interface CloudWatchEncryptionProperty {
    /**
     * The encryption mode to use for CloudWatch data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-cloudwatchencryptionmode)
     */
    public fun cloudWatchEncryptionMode(): String? = unwrap(this).getCloudWatchEncryptionMode()

    /**
     * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A builder for [CloudWatchEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchEncryptionMode The encryption mode to use for CloudWatch data.
       */
      public fun cloudWatchEncryptionMode(cloudWatchEncryptionMode: String)

      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
       * data.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty.builder()

      /**
       * @param cloudWatchEncryptionMode The encryption mode to use for CloudWatch data.
       */
      override fun cloudWatchEncryptionMode(cloudWatchEncryptionMode: String) {
        cdkBuilder.cloudWatchEncryptionMode(cloudWatchEncryptionMode)
      }

      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
       * data.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty,
    ) : CdkObject(cdkObject), CloudWatchEncryptionProperty {
      /**
       * The encryption mode to use for CloudWatch data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-cloudwatchencryptionmode)
       */
      override fun cloudWatchEncryptionMode(): String? = unwrap(this).getCloudWatchEncryptionMode()

      /**
       * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty):
          CloudWatchEncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchEncryptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchEncryptionProperty):
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty
    }
  }

  /**
   * Specifies an encryption configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .cloudWatchEncryption(CloudWatchEncryptionProperty.builder()
   * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
   * .kmsKeyArn("kmsKeyArn")
   * .build())
   * .jobBookmarksEncryption(JobBookmarksEncryptionProperty.builder()
   * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
   * .kmsKeyArn("kmsKeyArn")
   * .build())
   * .s3Encryptions(List.of(S3EncryptionProperty.builder()
   * .kmsKeyArn("kmsKeyArn")
   * .s3EncryptionMode("s3EncryptionMode")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-encryptionconfiguration.html)
   */
  public interface EncryptionConfigurationProperty {
    /**
     * The encryption configuration for Amazon CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-encryptionconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration-cloudwatchencryption)
     */
    public fun cloudWatchEncryption(): Any? = unwrap(this).getCloudWatchEncryption()

    /**
     * The encryption configuration for job bookmarks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-encryptionconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration-jobbookmarksencryption)
     */
    public fun jobBookmarksEncryption(): Any? = unwrap(this).getJobBookmarksEncryption()

    /**
     * The encyption configuration for Amazon Simple Storage Service (Amazon S3) data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-encryptionconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration-s3encryptions)
     */
    public fun s3Encryptions(): Any? = unwrap(this).getS3Encryptions()

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchEncryption The encryption configuration for Amazon CloudWatch.
       */
      public fun cloudWatchEncryption(cloudWatchEncryption: IResolvable)

      /**
       * @param cloudWatchEncryption The encryption configuration for Amazon CloudWatch.
       */
      public fun cloudWatchEncryption(cloudWatchEncryption: CloudWatchEncryptionProperty)

      /**
       * @param cloudWatchEncryption The encryption configuration for Amazon CloudWatch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5af6550f41429b699a193a796c9b24ca0ecfabb293a337f25a4adfad5abbdcee")
      public
          fun cloudWatchEncryption(cloudWatchEncryption: CloudWatchEncryptionProperty.Builder.() -> Unit)

      /**
       * @param jobBookmarksEncryption The encryption configuration for job bookmarks.
       */
      public fun jobBookmarksEncryption(jobBookmarksEncryption: IResolvable)

      /**
       * @param jobBookmarksEncryption The encryption configuration for job bookmarks.
       */
      public fun jobBookmarksEncryption(jobBookmarksEncryption: JobBookmarksEncryptionProperty)

      /**
       * @param jobBookmarksEncryption The encryption configuration for job bookmarks.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b122dc9d6bb91334ed916d535ba76b49f737643531468b50059ee1f377af3fac")
      public
          fun jobBookmarksEncryption(jobBookmarksEncryption: JobBookmarksEncryptionProperty.Builder.() -> Unit)

      /**
       * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon
       * S3) data.
       */
      public fun s3Encryptions(s3Encryptions: IResolvable)

      /**
       * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon
       * S3) data.
       */
      public fun s3Encryptions(s3Encryptions: List<Any>)

      /**
       * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon
       * S3) data.
       */
      public fun s3Encryptions(vararg s3Encryptions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty.builder()

      /**
       * @param cloudWatchEncryption The encryption configuration for Amazon CloudWatch.
       */
      override fun cloudWatchEncryption(cloudWatchEncryption: IResolvable) {
        cdkBuilder.cloudWatchEncryption(cloudWatchEncryption.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchEncryption The encryption configuration for Amazon CloudWatch.
       */
      override fun cloudWatchEncryption(cloudWatchEncryption: CloudWatchEncryptionProperty) {
        cdkBuilder.cloudWatchEncryption(cloudWatchEncryption.let(CloudWatchEncryptionProperty::unwrap))
      }

      /**
       * @param cloudWatchEncryption The encryption configuration for Amazon CloudWatch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5af6550f41429b699a193a796c9b24ca0ecfabb293a337f25a4adfad5abbdcee")
      override
          fun cloudWatchEncryption(cloudWatchEncryption: CloudWatchEncryptionProperty.Builder.() -> Unit):
          Unit = cloudWatchEncryption(CloudWatchEncryptionProperty(cloudWatchEncryption))

      /**
       * @param jobBookmarksEncryption The encryption configuration for job bookmarks.
       */
      override fun jobBookmarksEncryption(jobBookmarksEncryption: IResolvable) {
        cdkBuilder.jobBookmarksEncryption(jobBookmarksEncryption.let(IResolvable::unwrap))
      }

      /**
       * @param jobBookmarksEncryption The encryption configuration for job bookmarks.
       */
      override fun jobBookmarksEncryption(jobBookmarksEncryption: JobBookmarksEncryptionProperty) {
        cdkBuilder.jobBookmarksEncryption(jobBookmarksEncryption.let(JobBookmarksEncryptionProperty::unwrap))
      }

      /**
       * @param jobBookmarksEncryption The encryption configuration for job bookmarks.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b122dc9d6bb91334ed916d535ba76b49f737643531468b50059ee1f377af3fac")
      override
          fun jobBookmarksEncryption(jobBookmarksEncryption: JobBookmarksEncryptionProperty.Builder.() -> Unit):
          Unit = jobBookmarksEncryption(JobBookmarksEncryptionProperty(jobBookmarksEncryption))

      /**
       * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon
       * S3) data.
       */
      override fun s3Encryptions(s3Encryptions: IResolvable) {
        cdkBuilder.s3Encryptions(s3Encryptions.let(IResolvable::unwrap))
      }

      /**
       * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon
       * S3) data.
       */
      override fun s3Encryptions(s3Encryptions: List<Any>) {
        cdkBuilder.s3Encryptions(s3Encryptions)
      }

      /**
       * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon
       * S3) data.
       */
      override fun s3Encryptions(vararg s3Encryptions: Any): Unit =
          s3Encryptions(s3Encryptions.toList())

      public fun build():
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionConfigurationProperty {
      /**
       * The encryption configuration for Amazon CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-encryptionconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration-cloudwatchencryption)
       */
      override fun cloudWatchEncryption(): Any? = unwrap(this).getCloudWatchEncryption()

      /**
       * The encryption configuration for job bookmarks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-encryptionconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration-jobbookmarksencryption)
       */
      override fun jobBookmarksEncryption(): Any? = unwrap(this).getJobBookmarksEncryption()

      /**
       * The encyption configuration for Amazon Simple Storage Service (Amazon S3) data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-encryptionconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration-s3encryptions)
       */
      override fun s3Encryptions(): Any? = unwrap(this).getS3Encryptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty
    }
  }

  /**
   * Specifies how job bookmark data should be encrypted.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * JobBookmarksEncryptionProperty jobBookmarksEncryptionProperty =
   * JobBookmarksEncryptionProperty.builder()
   * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html)
   */
  public interface JobBookmarksEncryptionProperty {
    /**
     * The encryption mode to use for job bookmarks data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-jobbookmarksencryptionmode)
     */
    public fun jobBookmarksEncryptionMode(): String? = unwrap(this).getJobBookmarksEncryptionMode()

    /**
     * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A builder for [JobBookmarksEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jobBookmarksEncryptionMode The encryption mode to use for job bookmarks data.
       */
      public fun jobBookmarksEncryptionMode(jobBookmarksEncryptionMode: String)

      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
       * data.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty.builder()

      /**
       * @param jobBookmarksEncryptionMode The encryption mode to use for job bookmarks data.
       */
      override fun jobBookmarksEncryptionMode(jobBookmarksEncryptionMode: String) {
        cdkBuilder.jobBookmarksEncryptionMode(jobBookmarksEncryptionMode)
      }

      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
       * data.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty,
    ) : CdkObject(cdkObject), JobBookmarksEncryptionProperty {
      /**
       * The encryption mode to use for job bookmarks data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-jobbookmarksencryptionmode)
       */
      override fun jobBookmarksEncryptionMode(): String? =
          unwrap(this).getJobBookmarksEncryptionMode()

      /**
       * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JobBookmarksEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty):
          JobBookmarksEncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JobBookmarksEncryptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobBookmarksEncryptionProperty):
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty
    }
  }

  /**
   * Specifies how Amazon Simple Storage Service (Amazon S3) data should be encrypted.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * S3EncryptionProperty s3EncryptionProperty = S3EncryptionProperty.builder()
   * .kmsKeyArn("kmsKeyArn")
   * .s3EncryptionMode("s3EncryptionMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html)
   */
  public interface S3EncryptionProperty {
    /**
     * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The encryption mode to use for Amazon S3 data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-s3encryptionmode)
     */
    public fun s3EncryptionMode(): String? = unwrap(this).getS3EncryptionMode()

    /**
     * A builder for [S3EncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
       * data.
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param s3EncryptionMode The encryption mode to use for Amazon S3 data.
       */
      public fun s3EncryptionMode(s3EncryptionMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty.builder()

      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
       * data.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param s3EncryptionMode The encryption mode to use for Amazon S3 data.
       */
      override fun s3EncryptionMode(s3EncryptionMode: String) {
        cdkBuilder.s3EncryptionMode(s3EncryptionMode)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty,
    ) : CdkObject(cdkObject), S3EncryptionProperty {
      /**
       * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * The encryption mode to use for Amazon S3 data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-s3encryptionmode)
       */
      override fun s3EncryptionMode(): String? = unwrap(this).getS3EncryptionMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty):
          S3EncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? S3EncryptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3EncryptionProperty):
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty
    }
  }
}
