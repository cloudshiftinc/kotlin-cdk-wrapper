package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFlowEntitlement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The entitlement ARN.
   */
  public open fun attrEntitlementArn(): String = unwrap(this).getAttrEntitlementArn()

  /**
   * The percentage of the entitlement data transfer fee that you want the subscriber to be
   * responsible for.
   */
  public open fun dataTransferSubscriberFeePercent(): Number? =
      unwrap(this).getDataTransferSubscriberFeePercent()

  /**
   * The percentage of the entitlement data transfer fee that you want the subscriber to be
   * responsible for.
   */
  public open fun dataTransferSubscriberFeePercent(`value`: Number) {
    unwrap(this).setDataTransferSubscriberFeePercent(`value`)
  }

  /**
   * A description of the entitlement.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A description of the entitlement.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The type of encryption that MediaConnect will use on the output that is associated with the
   * entitlement.
   */
  public open fun encryption(): Any? = unwrap(this).getEncryption()

  /**
   * The type of encryption that MediaConnect will use on the output that is associated with the
   * entitlement.
   */
  public open fun encryption(`value`: IResolvable) {
    unwrap(this).setEncryption(`value`.let(IResolvable::unwrap))
  }

  /**
   * The type of encryption that MediaConnect will use on the output that is associated with the
   * entitlement.
   */
  public open fun encryption(`value`: EncryptionProperty) {
    unwrap(this).setEncryption(`value`.let(EncryptionProperty::unwrap))
  }

  /**
   * The type of encryption that MediaConnect will use on the output that is associated with the
   * entitlement.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5caf46de7ac40526053d4bc96be79d10f8d8453da8a3e3dfbdf8c0fcec50517e")
  public open fun encryption(`value`: EncryptionProperty.Builder.() -> Unit): Unit =
      encryption(EncryptionProperty(`value`))

  /**
   * An indication of whether the new entitlement should be enabled or disabled as soon as it is
   * created.
   */
  public open fun entitlementStatus(): String? = unwrap(this).getEntitlementStatus()

  /**
   * An indication of whether the new entitlement should be enabled or disabled as soon as it is
   * created.
   */
  public open fun entitlementStatus(`value`: String) {
    unwrap(this).setEntitlementStatus(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the flow.
   */
  public open fun flowArn(): String = unwrap(this).getFlowArn()

  /**
   * The Amazon Resource Name (ARN) of the flow.
   */
  public open fun flowArn(`value`: String) {
    unwrap(this).setFlowArn(`value`)
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
   * The name of the entitlement.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the entitlement.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The AWS account IDs that you want to share your content with.
   */
  public open fun subscribers(): List<String> = unwrap(this).getSubscribers()

  /**
   * The AWS account IDs that you want to share your content with.
   */
  public open fun subscribers(`value`: List<String>) {
    unwrap(this).setSubscribers(`value`)
  }

  /**
   * The AWS account IDs that you want to share your content with.
   */
  public open fun subscribers(vararg `value`: String): Unit = subscribers(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconnect.CfnFlowEntitlement].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The percentage of the entitlement data transfer fee that you want the subscriber to be
     * responsible for.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-datatransfersubscriberfeepercent)
     * @param dataTransferSubscriberFeePercent The percentage of the entitlement data transfer fee
     * that you want the subscriber to be responsible for. 
     */
    public fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number)

    /**
     * A description of the entitlement.
     *
     * This description appears only on the MediaConnect console and is not visible outside of the
     * current AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-description)
     * @param description A description of the entitlement. 
     */
    public fun description(description: String)

    /**
     * The type of encryption that MediaConnect will use on the output that is associated with the
     * entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-encryption)
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement. 
     */
    public fun encryption(encryption: IResolvable)

    /**
     * The type of encryption that MediaConnect will use on the output that is associated with the
     * entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-encryption)
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement. 
     */
    public fun encryption(encryption: EncryptionProperty)

    /**
     * The type of encryption that MediaConnect will use on the output that is associated with the
     * entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-encryption)
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d33a6a6d917eef73825c3446bf9108c8e3d1046148d7e4a6af45c3aaaeebd876")
    public fun encryption(encryption: EncryptionProperty.Builder.() -> Unit)

    /**
     * An indication of whether the new entitlement should be enabled or disabled as soon as it is
     * created.
     *
     * If you don’t specify the entitlementStatus field in your request, MediaConnect sets it to
     * ENABLED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-entitlementstatus)
     * @param entitlementStatus An indication of whether the new entitlement should be enabled or
     * disabled as soon as it is created. 
     */
    public fun entitlementStatus(entitlementStatus: String)

    /**
     * The Amazon Resource Name (ARN) of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the flow. 
     */
    public fun flowArn(flowArn: String)

    /**
     * The name of the entitlement.
     *
     * This value must be unique within the current flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-name)
     * @param name The name of the entitlement. 
     */
    public fun name(name: String)

    /**
     * The AWS account IDs that you want to share your content with.
     *
     * The receiving accounts (subscribers) will be allowed to create their own flows using your
     * content as the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-subscribers)
     * @param subscribers The AWS account IDs that you want to share your content with. 
     */
    public fun subscribers(subscribers: List<String>)

    /**
     * The AWS account IDs that you want to share your content with.
     *
     * The receiving accounts (subscribers) will be allowed to create their own flows using your
     * content as the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-subscribers)
     * @param subscribers The AWS account IDs that you want to share your content with. 
     */
    public fun subscribers(vararg subscribers: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.Builder
        = software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.Builder.create(scope, id)

    /**
     * The percentage of the entitlement data transfer fee that you want the subscriber to be
     * responsible for.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-datatransfersubscriberfeepercent)
     * @param dataTransferSubscriberFeePercent The percentage of the entitlement data transfer fee
     * that you want the subscriber to be responsible for. 
     */
    override fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number) {
      cdkBuilder.dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent)
    }

    /**
     * A description of the entitlement.
     *
     * This description appears only on the MediaConnect console and is not visible outside of the
     * current AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-description)
     * @param description A description of the entitlement. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The type of encryption that MediaConnect will use on the output that is associated with the
     * entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-encryption)
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement. 
     */
    override fun encryption(encryption: IResolvable) {
      cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
    }

    /**
     * The type of encryption that MediaConnect will use on the output that is associated with the
     * entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-encryption)
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement. 
     */
    override fun encryption(encryption: EncryptionProperty) {
      cdkBuilder.encryption(encryption.let(EncryptionProperty::unwrap))
    }

    /**
     * The type of encryption that MediaConnect will use on the output that is associated with the
     * entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-encryption)
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d33a6a6d917eef73825c3446bf9108c8e3d1046148d7e4a6af45c3aaaeebd876")
    override fun encryption(encryption: EncryptionProperty.Builder.() -> Unit): Unit =
        encryption(EncryptionProperty(encryption))

    /**
     * An indication of whether the new entitlement should be enabled or disabled as soon as it is
     * created.
     *
     * If you don’t specify the entitlementStatus field in your request, MediaConnect sets it to
     * ENABLED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-entitlementstatus)
     * @param entitlementStatus An indication of whether the new entitlement should be enabled or
     * disabled as soon as it is created. 
     */
    override fun entitlementStatus(entitlementStatus: String) {
      cdkBuilder.entitlementStatus(entitlementStatus)
    }

    /**
     * The Amazon Resource Name (ARN) of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the flow. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    /**
     * The name of the entitlement.
     *
     * This value must be unique within the current flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-name)
     * @param name The name of the entitlement. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The AWS account IDs that you want to share your content with.
     *
     * The receiving accounts (subscribers) will be allowed to create their own flows using your
     * content as the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-subscribers)
     * @param subscribers The AWS account IDs that you want to share your content with. 
     */
    override fun subscribers(subscribers: List<String>) {
      cdkBuilder.subscribers(subscribers)
    }

    /**
     * The AWS account IDs that you want to share your content with.
     *
     * The receiving accounts (subscribers) will be allowed to create their own flows using your
     * content as the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-subscribers)
     * @param subscribers The AWS account IDs that you want to share your content with. 
     */
    override fun subscribers(vararg subscribers: String): Unit = subscribers(subscribers.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowEntitlement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowEntitlement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement):
        CfnFlowEntitlement = CfnFlowEntitlement(cdkObject)

    internal fun unwrap(wrapped: CfnFlowEntitlement):
        software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement = wrapped.cdkObject
  }

  public interface EncryptionProperty {
    /**
     * The type of algorithm that is used for static key encryption (such as aes128, aes192, or
     * aes256).
     *
     * If you are using SPEKE or SRT-password encryption, this property must be left blank.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-algorithm)
     */
    public fun algorithm(): String

    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key
     * for encrypting content.
     *
     * This parameter is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-constantinitializationvector)
     */
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    /**
     * The value of one of the devices that you configured with your digital rights management (DRM)
     * platform key provider.
     *
     * This parameter is required for SPEKE encryption and is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-deviceid)
     */
    public fun deviceId(): String? = unwrap(this).getDeviceId()

    /**
     * The type of key that is used for the encryption.
     *
     * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
     * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
     *
     * Default: - "static-key"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-keytype)
     */
    public fun keyType(): String? = unwrap(this).getKeyType()

    /**
     * The AWS Region that the API Gateway proxy endpoint was created in.
     *
     * This parameter is required for SPEKE encryption and is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * An identifier for the content.
     *
     * The service sends this value to the key server to identify the current endpoint. The resource
     * ID is also known as the content ID. This parameter is required for SPEKE encryption and is not
     * valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-resourceid)
     */
    public fun resourceId(): String? = unwrap(this).getResourceId()

    /**
     * The Amazon Resource Name (ARN) of the role that you created during setup (when you set up
     * MediaConnect as a trusted entity).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-rolearn)
     */
    public fun roleArn(): String

    /**
     * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server.
     *
     * This parameter is required for SPEKE encryption and is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [EncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithm The type of algorithm that is used for static key encryption (such as
       * aes128, aes192, or aes256). 
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       */
      public fun algorithm(algorithm: String)

      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, to be used with the key for encrypting content.
       * This parameter is not valid for static key encryption.
       */
      public fun constantInitializationVector(constantInitializationVector: String)

      /**
       * @param deviceId The value of one of the devices that you configured with your digital
       * rights management (DRM) platform key provider.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      public fun deviceId(deviceId: String)

      /**
       * @param keyType The type of key that is used for the encryption.
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       */
      public fun keyType(keyType: String)

      /**
       * @param region The AWS Region that the API Gateway proxy endpoint was created in.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      public fun region(region: String)

      /**
       * @param resourceId An identifier for the content.
       * The service sends this value to the key server to identify the current endpoint. The
       * resource ID is also known as the content ID. This parameter is required for SPEKE encryption
       * and is not valid for static key encryption.
       */
      public fun resourceId(resourceId: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role that you created during setup
       * (when you set up MediaConnect as a trusted entity). 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param secretArn The ARN of the secret that you created in AWS Secrets Manager to store the
       * encryption key.
       */
      public fun secretArn(secretArn: String)

      /**
       * @param url The URL from the API Gateway proxy that you set up to talk to your key server.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty.builder()

      /**
       * @param algorithm The type of algorithm that is used for static key encryption (such as
       * aes128, aes192, or aes256). 
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       */
      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, to be used with the key for encrypting content.
       * This parameter is not valid for static key encryption.
       */
      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      /**
       * @param deviceId The value of one of the devices that you configured with your digital
       * rights management (DRM) platform key provider.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      override fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
      }

      /**
       * @param keyType The type of key that is used for the encryption.
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       */
      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      /**
       * @param region The AWS Region that the API Gateway proxy endpoint was created in.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param resourceId An identifier for the content.
       * The service sends this value to the key server to identify the current endpoint. The
       * resource ID is also known as the content ID. This parameter is required for SPEKE encryption
       * and is not valid for static key encryption.
       */
      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role that you created during setup
       * (when you set up MediaConnect as a trusted entity). 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param secretArn The ARN of the secret that you created in AWS Secrets Manager to store the
       * encryption key.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param url The URL from the API Gateway proxy that you set up to talk to your key server.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty,
    ) : CdkObject(cdkObject), EncryptionProperty {
      /**
       * The type of algorithm that is used for static key encryption (such as aes128, aes192, or
       * aes256).
       *
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-algorithm)
       */
      override fun algorithm(): String = unwrap(this).getAlgorithm()

      /**
       * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key
       * for encrypting content.
       *
       * This parameter is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-constantinitializationvector)
       */
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      /**
       * The value of one of the devices that you configured with your digital rights management
       * (DRM) platform key provider.
       *
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-deviceid)
       */
      override fun deviceId(): String? = unwrap(this).getDeviceId()

      /**
       * The type of key that is used for the encryption.
       *
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       *
       * Default: - "static-key"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-keytype)
       */
      override fun keyType(): String? = unwrap(this).getKeyType()

      /**
       * The AWS Region that the API Gateway proxy endpoint was created in.
       *
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-region)
       */
      override fun region(): String? = unwrap(this).getRegion()

      /**
       * An identifier for the content.
       *
       * The service sends this value to the key server to identify the current endpoint. The
       * resource ID is also known as the content ID. This parameter is required for SPEKE encryption
       * and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-resourceid)
       */
      override fun resourceId(): String? = unwrap(this).getResourceId()

      /**
       * The Amazon Resource Name (ARN) of the role that you created during setup (when you set up
       * MediaConnect as a trusted entity).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()

      /**
       * The URL from the API Gateway proxy that you set up to talk to your key server.
       *
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowentitlement-encryption.html#cfn-mediaconnect-flowentitlement-encryption-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty):
          EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty
    }
  }
}
