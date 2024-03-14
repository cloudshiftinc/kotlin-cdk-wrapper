package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPublicKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnPublicKey,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The date and time when the public key was uploaded.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The identifier of the public key.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Configuration information about a public key that you can use with [signed URLs and signed
   * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) ,
   * or with [field-level
   * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
   * .
   */
  public open fun publicKeyConfig(): Any = unwrap(this).getPublicKeyConfig()

  /**
   * Configuration information about a public key that you can use with [signed URLs and signed
   * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) ,
   * or with [field-level
   * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
   * .
   */
  public open fun publicKeyConfig(`value`: IResolvable) {
    unwrap(this).setPublicKeyConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration information about a public key that you can use with [signed URLs and signed
   * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) ,
   * or with [field-level
   * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
   * .
   */
  public open fun publicKeyConfig(`value`: PublicKeyConfigProperty) {
    unwrap(this).setPublicKeyConfig(`value`.let(PublicKeyConfigProperty::unwrap))
  }

  /**
   * Configuration information about a public key that you can use with [signed URLs and signed
   * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) ,
   * or with [field-level
   * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
   * .
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("758d14856eb69d434dabe179f5efd2ac8c821fb8b2a376596b1da3fcee116572")
  public open fun publicKeyConfig(`value`: PublicKeyConfigProperty.Builder.() -> Unit): Unit =
      publicKeyConfig(PublicKeyConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnPublicKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Configuration information about a public key that you can use with [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html#cfn-cloudfront-publickey-publickeyconfig)
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    public fun publicKeyConfig(publicKeyConfig: IResolvable)

    /**
     * Configuration information about a public key that you can use with [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html#cfn-cloudfront-publickey-publickeyconfig)
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    public fun publicKeyConfig(publicKeyConfig: PublicKeyConfigProperty)

    /**
     * Configuration information about a public key that you can use with [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html#cfn-cloudfront-publickey-publickeyconfig)
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42e777796ad459c33fdafc47fe4a817807ae20a6174a38d3aa3ff93558bc3272")
    public fun publicKeyConfig(publicKeyConfig: PublicKeyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnPublicKey.Builder =
        software.amazon.awscdk.services.cloudfront.CfnPublicKey.Builder.create(scope, id)

    /**
     * Configuration information about a public key that you can use with [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html#cfn-cloudfront-publickey-publickeyconfig)
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    override fun publicKeyConfig(publicKeyConfig: IResolvable) {
      cdkBuilder.publicKeyConfig(publicKeyConfig.let(IResolvable::unwrap))
    }

    /**
     * Configuration information about a public key that you can use with [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html#cfn-cloudfront-publickey-publickeyconfig)
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    override fun publicKeyConfig(publicKeyConfig: PublicKeyConfigProperty) {
      cdkBuilder.publicKeyConfig(publicKeyConfig.let(PublicKeyConfigProperty::unwrap))
    }

    /**
     * Configuration information about a public key that you can use with [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html#cfn-cloudfront-publickey-publickeyconfig)
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42e777796ad459c33fdafc47fe4a817807ae20a6174a38d3aa3ff93558bc3272")
    override fun publicKeyConfig(publicKeyConfig: PublicKeyConfigProperty.Builder.() -> Unit): Unit
        = publicKeyConfig(PublicKeyConfigProperty(publicKeyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnPublicKey = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPublicKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPublicKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnPublicKey):
        CfnPublicKey = CfnPublicKey(cdkObject)

    internal fun unwrap(wrapped: CfnPublicKey):
        software.amazon.awscdk.services.cloudfront.CfnPublicKey = wrapped.cdkObject
  }

  public interface PublicKeyConfigProperty {
    /**
     * A string included in the request to help make sure that the request can't be replayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-publickey-publickeyconfig.html#cfn-cloudfront-publickey-publickeyconfig-callerreference)
     */
    public fun callerReference(): String

    /**
     * A comment to describe the public key.
     *
     * The comment cannot be longer than 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-publickey-publickeyconfig.html#cfn-cloudfront-publickey-publickeyconfig-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * The public key that you can use with [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-publickey-publickeyconfig.html#cfn-cloudfront-publickey-publickeyconfig-encodedkey)
     */
    public fun encodedKey(): String

    /**
     * A name to help identify the public key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-publickey-publickeyconfig.html#cfn-cloudfront-publickey-publickeyconfig-name)
     */
    public fun name(): String

    /**
     * A builder for [PublicKeyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param callerReference A string included in the request to help make sure that the request
       * can't be replayed. 
       */
      public fun callerReference(callerReference: String)

      /**
       * @param comment A comment to describe the public key.
       * The comment cannot be longer than 128 characters.
       */
      public fun comment(comment: String)

      /**
       * @param encodedKey The public key that you can use with [signed URLs and signed
       * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * , or with [field-level
       * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
       * . 
       */
      public fun encodedKey(encodedKey: String)

      /**
       * @param name A name to help identify the public key. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty.builder()

      /**
       * @param callerReference A string included in the request to help make sure that the request
       * can't be replayed. 
       */
      override fun callerReference(callerReference: String) {
        cdkBuilder.callerReference(callerReference)
      }

      /**
       * @param comment A comment to describe the public key.
       * The comment cannot be longer than 128 characters.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param encodedKey The public key that you can use with [signed URLs and signed
       * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * , or with [field-level
       * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
       * . 
       */
      override fun encodedKey(encodedKey: String) {
        cdkBuilder.encodedKey(encodedKey)
      }

      /**
       * @param name A name to help identify the public key. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty,
    ) : CdkObject(cdkObject), PublicKeyConfigProperty {
      /**
       * A string included in the request to help make sure that the request can't be replayed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-publickey-publickeyconfig.html#cfn-cloudfront-publickey-publickeyconfig-callerreference)
       */
      override fun callerReference(): String = unwrap(this).getCallerReference()

      /**
       * A comment to describe the public key.
       *
       * The comment cannot be longer than 128 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-publickey-publickeyconfig.html#cfn-cloudfront-publickey-publickeyconfig-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * The public key that you can use with [signed URLs and signed
       * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * , or with [field-level
       * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-publickey-publickeyconfig.html#cfn-cloudfront-publickey-publickeyconfig-encodedkey)
       */
      override fun encodedKey(): String = unwrap(this).getEncodedKey()

      /**
       * A name to help identify the public key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-publickey-publickeyconfig.html#cfn-cloudfront-publickey-publickeyconfig-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PublicKeyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty):
          PublicKeyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicKeyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnPublicKey.PublicKeyConfigProperty
    }
  }
}