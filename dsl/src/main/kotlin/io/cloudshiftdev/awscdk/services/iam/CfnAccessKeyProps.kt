package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnAccessKeyProps {
  /**
   * This value is specific to CloudFormation and can only be *incremented* .
   *
   * Incrementing this value notifies CloudFormation that you want to rotate your access key. When
   * you update your stack, CloudFormation will replace the existing access key with a new key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-serial)
   */
  public fun serial(): Number? = unwrap(this).getSerial()

  /**
   * The status of the access key.
   *
   * `Active` means that the key is valid for API calls, while `Inactive` means it is not.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * The name of the IAM user that the new key will belong to.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-username)
   */
  public fun userName(): String

  /**
   * A builder for [CfnAccessKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param serial This value is specific to CloudFormation and can only be *incremented* .
     * Incrementing this value notifies CloudFormation that you want to rotate your access key. When
     * you update your stack, CloudFormation will replace the existing access key with a new key.
     */
    public fun serial(serial: Number)

    /**
     * @param status The status of the access key.
     * `Active` means that the key is valid for API calls, while `Inactive` means it is not.
     */
    public fun status(status: String)

    /**
     * @param userName The name of the IAM user that the new key will belong to. 
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnAccessKeyProps.Builder =
        software.amazon.awscdk.services.iam.CfnAccessKeyProps.builder()

    /**
     * @param serial This value is specific to CloudFormation and can only be *incremented* .
     * Incrementing this value notifies CloudFormation that you want to rotate your access key. When
     * you update your stack, CloudFormation will replace the existing access key with a new key.
     */
    override fun serial(serial: Number) {
      cdkBuilder.serial(serial)
    }

    /**
     * @param status The status of the access key.
     * `Active` means that the key is valid for API calls, while `Inactive` means it is not.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param userName The name of the IAM user that the new key will belong to. 
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnAccessKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnAccessKeyProps,
  ) : CdkObject(cdkObject), CfnAccessKeyProps {
    /**
     * This value is specific to CloudFormation and can only be *incremented* .
     *
     * Incrementing this value notifies CloudFormation that you want to rotate your access key. When
     * you update your stack, CloudFormation will replace the existing access key with a new key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-serial)
     */
    override fun serial(): Number? = unwrap(this).getSerial()

    /**
     * The status of the access key.
     *
     * `Active` means that the key is valid for API calls, while `Inactive` means it is not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * The name of the IAM user that the new key will belong to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-username)
     */
    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnAccessKeyProps):
        CfnAccessKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessKeyProps):
        software.amazon.awscdk.services.iam.CfnAccessKeyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.CfnAccessKeyProps
  }
}
